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

public class TreeTrimmerDrops
{
    static double spruce = ResourcefulTools.CONFIG.GENERAL.spruceDropChance;
    static double brich = ResourcefulTools.CONFIG.GENERAL.birchDropChance;
    static double oak = ResourcefulTools.CONFIG.GENERAL.oakDropChance;
    static double acacia = ResourcefulTools.CONFIG.GENERAL.acaciaDropChance;
    static double jungle = ResourcefulTools.CONFIG.GENERAL.jungleDropChance;
    static double darkoak = ResourcefulTools.CONFIG.GENERAL.darkOakDropChance;
    static double seagrass = ResourcefulTools.CONFIG.GENERAL.seagrassDropChance;
    static double kelp = ResourcefulTools.CONFIG.GENERAL.kelpDropChance;
    static double egg = ResourcefulTools.CONFIG.GENERAL.eggDropChance;
    static double membrane = ResourcefulTools.CONFIG.GENERAL.phantomMembraneDropChance;

    public static void testForDrops(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity entity, ItemStack stack)
    {
        Random random = world.random;

        Block block = state.getBlock();

        if (!world.isClient)
        {
            if(block == Blocks.SPRUCE_LEAVES)
            {
                double r = random.nextDouble();
                if (r <= spruce)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.FEATHER, 1)));
                }
            }
            else if(block == Blocks.BIRCH_LEAVES)
            {
                double r = random.nextDouble();
                if (r <= brich)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.STRING, 1)));
                }
            }
            else if(block == Blocks.OAK_LEAVES)
            {
                double r = random.nextDouble();
                if (r <= oak)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.APPLE, 1)));
                }
            }
            else if(block == Blocks.ACACIA_LEAVES)
            {
                double r = random.nextDouble();
                if (r <= acacia)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.RABBIT_FOOT, 1)));
                }
            }
            else if(block == Blocks.JUNGLE_LEAVES)
            {
                double r = random.nextDouble();
                if (r <= jungle)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SPIDER_EYE, 1)));
                }
            }
            else if(block == Blocks.DARK_OAK_LEAVES)
            {
                double r = random.nextDouble();
                if (r <= darkoak)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.PEARL_FRAGMENT, 1)));
                }
            }
            else if(block == Blocks.TALL_SEAGRASS)
            {
                double r = random.nextDouble();
                if (r <= seagrass)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_CRYSTALS, 1)));
                }
            }
            else if(block == Blocks.KELP_PLANT)
            {
                double r = random.nextDouble();
                if (r <= kelp)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_SHARD, 1)));
                }
            }
            else if(block == Blocks.AZALEA_LEAVES ||
                    block == Blocks.FLOWERING_AZALEA_LEAVES)
            {
                double r = random.nextDouble();
                if (r <= membrane)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PHANTOM_MEMBRANE, 1)));
                }
            }
            else if(block == Blocks.HAY_BLOCK)
            {
                double r = random.nextDouble();
                if (r <= egg)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.EGG, 1)));
                }
            }
        }
    }
}
