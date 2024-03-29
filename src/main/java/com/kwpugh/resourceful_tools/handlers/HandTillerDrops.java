package com.kwpugh.resourceful_tools.handlers;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class HandTillerDrops
{
    static double ink = ResourcefulTools.CONFIG.GENERAL.clayInkDropChance;
    static double bone = ResourcefulTools.CONFIG.GENERAL.gravelBoneDropChance;
    static double slime = ResourcefulTools.CONFIG.GENERAL.rootedDirtlimeDropChance;

    public static void testForDrops(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity entity, ItemStack stack)
    {
        Random random = new Random();

        Block block = state.getBlock();

        if (!world.isClient)
        {
            if(block == Blocks.GRAVEL)
            {
                double r = random.nextDouble();
                if (r <= bone)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.BONE_FRAGMENT, 1)));
                }
            }
            else if(block == Blocks.CLAY)
            {
                double r = random.nextDouble();
                if (r <= ink)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.INK_SAC, 1)));
                }
            }
            else if(block == Blocks.ROOTED_DIRT)
            {
                double r = random.nextDouble();
                if (r <= slime)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.BIT_O_SLIME, 1)));
                }
            }
        }
    }
}
