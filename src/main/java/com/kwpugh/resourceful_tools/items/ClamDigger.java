package com.kwpugh.resourceful_tools.items;

import java.util.List;
import java.util.Random;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.init.ItemInit;

//import net.fabricmc.fabric.impl.biome.InternalBiomeUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ClamDigger extends ShovelItem
{
    public ClamDigger(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings)
    {
        super(material, attackDamage, attackSpeed, settings);
    }

    static double clam = ResourcefulTools.CONFIG.GENERAL.clamDropChance;

    Random random = new Random();

    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entity)
    {
        Biome currentBiome = world.getBiome(pos);

        //if(!world.isClient && (currentBiome.getCategory() == Biome.Category.BEACH) && InternalBiomeUtils.neighborsOcean(10, 10, 10, 10))
        if(!world.isClient && (currentBiome.getCategory() == Biome.Category.BEACH))
        {
            Block block = state.getBlock();

                if(block == Blocks.SAND)
                {
                    stack.damage(1, entity, (p_220038_0_) -> {
                        p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
                    });

                    double r = random.nextDouble();
                    if (r <= clam)
                    {
                        world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.CLAM, 1)));
                    }
                }

                if(!(block == Blocks.SAND))
                {
                    stack.damage(1, entity, (p_220038_0_) -> {
                        p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
                    });
                }

            return true;
        }

        return false;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(new TranslatableText("item.resourceful_tools.clam_digger.line1").formatted(Formatting.YELLOW));
        tooltip.add(new TranslatableText("item.resourceful_tools.clam_digger.line2").formatted(Formatting.BLUE));
    }
}
