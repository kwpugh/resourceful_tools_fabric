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
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HandPick extends PickaxeItem
{
	public HandPick(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}
	static double sandstone = ResourcefulTools.CONFIG.GENERAL.sandstoneDropChance;
	static double netherrack = ResourcefulTools.CONFIG.GENERAL.netherrackDropChance;
	static double magma = ResourcefulTools.CONFIG.GENERAL.magmaDropChance;
	static double quartz = ResourcefulTools.CONFIG.GENERAL.quartzDropChance;
	static double blackstone = ResourcefulTools.CONFIG.GENERAL.blackstoneDropChance;
	static double endstone = ResourcefulTools.CONFIG.GENERAL.endstoneDropChance;
	Random random = new Random();

	public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entity)
	{
		Block block = state.getBlock();
		
		if (!world.isClient)
		{
			if(block == Blocks.SANDSTONE)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= sandstone)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_SALTPETER, 1)));
		        }	
			}
			else if(block == Blocks.NETHERRACK)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= netherrack)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_SULFUR, 1)));
		        }	
			}
			else if(block == Blocks.MAGMA_BLOCK)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= magma)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.SMALL_BLAZE_POWDER, 1)));
		        }	
			}		
			else if(block == Blocks.NETHER_QUARTZ_ORE)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= quartz)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.GHAST_TEAR_FRAGMENT, 1)));
		        }	
			}
			else if(block == Blocks.BLACKSTONE)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= blackstone)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.NETHERITE_FRAGMENT, 1)));
		        }	
			}
			else if(block == Blocks.END_STONE)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= endstone)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.NETHER_STAR_FRAGMENT, 1)));
		        }	
			}
						
			if(!(block == Blocks.SANDSTONE) || 
					!(block == Blocks.NETHERRACK) || 
					!(block == Blocks.MAGMA_BLOCK) || 
					!(block == Blocks.NETHER_QUARTZ_ORE) || 
					!(block == Blocks.BLACKSTONE) || 
					!(block == Blocks.END_STONE))
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
	    tooltip.add(new TranslatableText("item.resourceful_tools.hand_pick.line1").formatted(Formatting.YELLOW));
	}  
}
