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

public class TreeTrimmer extends ShovelItem
{
	public TreeTrimmer(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}

	static double spruce = ResourcefulTools.CONFIG.GENERAL.spruceDropChance;
	static double brich = ResourcefulTools.CONFIG.GENERAL.birchDropChance;
	static double oak = ResourcefulTools.CONFIG.GENERAL.oakDropChance;
	static double acacia = ResourcefulTools.CONFIG.GENERAL.acaciaDropChance;
	static double jungle = ResourcefulTools.CONFIG.GENERAL.jungleDropChance;
	static double darkoak = ResourcefulTools.CONFIG.GENERAL.darkOakDropChance;
	static double seagrass = ResourcefulTools.CONFIG.GENERAL.seagrassDropChance;
	static double kelp = ResourcefulTools.CONFIG.GENERAL.kelpDropChance;
	Random random = new Random();

	public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entity)
	{
		Block block = state.getBlock();
		
		if (!world.isClient)
		{
			if(block == Blocks.SPRUCE_LEAVES)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= spruce)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.FEATHER, 1)));
		        }	
			}
			else if(block == Blocks.BIRCH_LEAVES)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= brich)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.STRING, 1)));
		        }	
			}
			else if(block == Blocks.OAK_LEAVES)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= oak)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.APPLE, 1)));
		        }	
			}
			else if(block == Blocks.ACACIA_LEAVES)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= acacia)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.RABBIT_FOOT, 1)));
		        }	
			}
			else if(block == Blocks.JUNGLE_LEAVES)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= jungle)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SPIDER_EYE, 1)));
		        }	
			}			
			else if(block == Blocks.DARK_OAK_LEAVES)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= darkoak)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.PEARL_FRAGMENT, 1)));
		        }	
			}
			else if(block == Blocks.TALL_SEAGRASS)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= seagrass)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_CRYSTALS, 1)));
		        }	
			}	
			else if(block == Blocks.KELP_PLANT)
			{
		        stack.damage(1, entity, (p_220038_0_) -> {
		            p_220038_0_.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= kelp)
		        {
		        	world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_SHARD, 1)));
		        }	
			}				

			if(!(block == Blocks.SPRUCE_LEAVES) || 
					!(block == Blocks.BIRCH_LEAVES) || 
					!(block == Blocks.OAK_LEAVES) || 
					!(block == Blocks.ACACIA_LEAVES) || 
					!(block == Blocks.JUNGLE_LEAVES) || 
					!(block == Blocks.DARK_OAK_LEAVES) || 
					!(block == Blocks.TALL_SEAGRASS) || 
					!(block == Blocks.KELP_PLANT))
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
		tooltip.add(new TranslatableText("item.resourceful_tools.tree_trimmer.line1").formatted(Formatting.YELLOW));
	} 
}
