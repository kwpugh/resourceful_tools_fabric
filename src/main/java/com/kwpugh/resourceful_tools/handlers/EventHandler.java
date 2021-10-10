package com.kwpugh.resourceful_tools.handlers;

import com.kwpugh.resourceful_tools.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EventHandler
{
    // Drop tests performed as a result of the break block event
    public static boolean onBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity entity)
    {
        if(player.isCreative() || player.isSpectator()) return false;

        if(!world.isClient)
        {
            ItemStack tool = player.getMainHandStack();

            if(tool.getItem() == ItemInit.HAND_PICK)
            {
                HandPickDrops.testForDrops(world, player, pos, state, entity, tool);
            }
            else if(tool.getItem() == ItemInit.HAND_TILLER)
            {
                HandTillerDrops.testForDrops(world, player, pos, state, entity, tool);
            }
            else if(tool.getItem() == ItemInit.TREE_TRIMMER ||
                    tool.getItem() == ItemInit.TREE_TRIMMER_COPPER)
            {
                TreeTrimmerDrops.testForDrops(world, player, pos, state, entity, tool);
            }
            else if(tool.getItem() == ItemInit.CLAIM_DIGGER)
            {
                ClamDiggerDrops.testForDrops(world, player, pos, state, entity, tool);
            }
        }

        return true;
    }
}