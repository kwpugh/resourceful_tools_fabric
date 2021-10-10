package com.kwpugh.resourceful_tools.items;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class HandPick extends PickaxeItem
{
	public HandPick(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}

	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
	    tooltip.add(new TranslatableText("item.resourceful_tools.hand_pick.line1").formatted(Formatting.YELLOW));
	}  
}
