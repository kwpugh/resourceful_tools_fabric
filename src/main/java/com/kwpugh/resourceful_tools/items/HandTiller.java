package com.kwpugh.resourceful_tools.items;

import java.util.List;
import java.util.Random;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HandTiller extends ShovelItem
{
	public HandTiller(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}

	static double clay = ResourcefulTools.CONFIG.GENERAL.clayDropChance;
	static double gravel = ResourcefulTools.CONFIG.GENERAL.gravelDropChance;
	Random random = new Random();

	 public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entity)
	{
		Block block = state.getBlock();
		
		if (!world.isClient)
		{
			if(block == Blocks.GRAVEL)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= clay)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.BONE_FRAGMENT, 1)));
		        }	
			}
			else if(block == Blocks.CLAY)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= gravel)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.INK_SAC, 1)));
		        }
			}
			
			if(!(block == Blocks.CLAY) || !(block == Blocks.GRAVEL))
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });		
			}
	    }

		return true;
	}

	 @Override
	 public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	 {
		 tooltip.add(new TranslatableText("item.resourceful_tools.hand_tiller.line1").formatted(Formatting.YELLOW));
	 } 
}
