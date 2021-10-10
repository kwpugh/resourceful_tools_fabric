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
import net.minecraft.world.biome.Biome;

import java.util.Random;

public class ClamDiggerDrops
{
    static double clam = ResourcefulTools.CONFIG.GENERAL.clamDropChance;

    public static void testForDrops(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity entity, ItemStack stack)
    {
        Random random = world.random;
        Biome currentBiome = world.getBiome(pos);

        if(!world.isClient && (currentBiome.getCategory() == Biome.Category.BEACH))
        {
            Block block = state.getBlock();

            if(block == Blocks.SAND)
            {
                double r = random.nextDouble();
                if (r <= clam)
                {
                    world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.CLAM, 1)));
                }
            }
        }
    }
}
