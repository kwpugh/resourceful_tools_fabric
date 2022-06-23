package com.kwpugh.resourceful_tools.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

import java.util.List;

public class GlassPlacer extends Item
{
	public GlassPlacer(Settings settings)
	{
		super(settings);
	}
	 
	@Override   
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
	{
		 ItemStack wand = user.getStackInHand(hand);
		
		if(!world.isClient)
		{			
			ServerPlayerEntity player = (ServerPlayerEntity) user;
			
			ItemStack stack = player.getMainHandStack();

			BlockPos pos = traceForBlock(player, 3);
			Block glassBlock = Blocks.GLASS;
			BlockState glassDefaultState = glassBlock.getDefaultState();	      
      
			if (world.isAir(pos) || !world.getFluidState(pos).isEmpty())
			{
				world.setBlockState(pos, glassDefaultState);
				stack.damage(1, player, (p_220038_0_) -> {
			         p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
			         });
			}	
		}

		return TypedActionResult.success(wand);
   }
	
	private static BlockPos traceForBlock(ServerPlayerEntity player, int range)
	{
	    return player.world.raycast(new RaycastContext(
	            player.getCameraPosVec(1.0f),
	            player.getCameraPosVec(1.0f).add(getLooking(player).multiply(range)),
	            RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, player
	    )).getBlockPos();
	}
	
	private static Vec3d getLooking(ServerPlayerEntity player)
	{
	    float f = -MathHelper.sin(player.getYaw() * 0.017453292F) * MathHelper.cos(player.getPitch() * 0.017453292F);
	    float g = -MathHelper.sin(player.getPitch() * 0.017453292F);
	    float h = MathHelper.cos(player.getYaw() * 0.017453292F) * MathHelper.cos(player.getPitch() * 0.017453292F);

	    return new Vec3d(f,g,h);
	}
	
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(Text.translatable("item.resourceful_tools.glass_placer.line1").formatted(Formatting.YELLOW));
		tooltip.add(Text.translatable("item.resourceful_tools.glass_placer.line2").formatted(Formatting.YELLOW));
	} 
}
