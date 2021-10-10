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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class HandPickDrops
{
    static double sandstone = ResourcefulTools.CONFIG.GENERAL.sandstoneDropChance;
    static double netherrack = ResourcefulTools.CONFIG.GENERAL.netherrackDropChance;
    static double magma = ResourcefulTools.CONFIG.GENERAL.magmaDropChance;
    static double quartz = ResourcefulTools.CONFIG.GENERAL.quartzDropChance;
    static double blackstone = ResourcefulTools.CONFIG.GENERAL.blackstoneDropChance;
    static double endstone = ResourcefulTools.CONFIG.GENERAL.endstoneDropChance;

    public static void testForDrops(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity entity, ItemStack stack)
    {
        Random random = world.random;

        Block block = state.getBlock();

        if (!world.isClient)
        {
            if (block == Blocks.SANDSTONE)
            {
                double r = random.nextDouble();
                if (r <= sandstone)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_SALTPETER, 1)));
                }
            } else if (block == Blocks.NETHERRACK)
            {
                double r = random.nextDouble();
                if (r <= netherrack)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_SULFUR, 1)));
                }
            } else if (block == Blocks.MAGMA_BLOCK)
            {
                double r = random.nextDouble();
                if (r <= magma)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.SMALL_BLAZE_POWDER, 1)));
                }
            } else if (block == Blocks.NETHER_QUARTZ_ORE)
            {
                double r = random.nextDouble();
                if (r <= quartz)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.GHAST_TEAR_FRAGMENT, 1)));
                }
            } else if (block == Blocks.BLACKSTONE)
            {
                double r = random.nextDouble();
                if (r <= blackstone)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.NETHERITE_FRAGMENT, 1)));
                }
            } else if (block == Blocks.END_STONE)
            {
                double r = random.nextDouble();
                if (r <= endstone)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.NETHER_STAR_FRAGMENT, 1)));
                }
            }
        }
    }
}


