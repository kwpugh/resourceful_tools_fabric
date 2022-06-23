package com.kwpugh.resourceful_tools.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class HandTiller extends ShovelItem
{
	public HandTiller(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}

	 @Override
	 public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	 {
		 tooltip.add(Text.translatable("item.resourceful_tools.hand_tiller.line1").formatted(Formatting.YELLOW));
	 } 
}
