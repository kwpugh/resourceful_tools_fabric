package com.kwpugh.resourceful_tools.blocks;

import com.kwpugh.resourceful_tools.api.FuelSource;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class Lavaspring extends Block implements FuelSource
{	
	public Lavaspring(Settings settings)
	{
		super(settings);
		this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(Properties.HORIZONTAL_FACING, Direction.NORTH)));
	}
	    
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {    
    	ItemStack stack = player.getStackInHand(hand);


        if (stack.getItem() == Items.BUCKET && !player.isCreative())
        {
            ItemStack itemstack1;
            itemstack1 = new ItemStack(Items.LAVA_BUCKET);

            if (stack.isEmpty())
            {
                player.setStackInHand(hand, itemstack1);

                return ActionResult.SUCCESS;
            }
            else if (!player.getInventory().insertStack(itemstack1))
            {
                player.dropItem(itemstack1, false);
                stack.decrement(1);
                return ActionResult.SUCCESS;
            }

            stack.decrement(1);
        }
        
       return ActionResult.SUCCESS;
    }
    
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) 
    {
        return (BlockState)this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
    }
    
    @Override
    public BlockRenderType getRenderType(BlockState state) 
    {
        return BlockRenderType.MODEL;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) 
    {
        return (BlockState)state.with(Properties.HORIZONTAL_FACING, rotation.rotate((Direction)state.get(Properties.HORIZONTAL_FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) 
    {
        return state.rotate(mirror.getRotation((Direction)state.get(Properties.HORIZONTAL_FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) 
    {
        builder.add(Properties.HORIZONTAL_FACING, Properties.LIT);
    }
}
