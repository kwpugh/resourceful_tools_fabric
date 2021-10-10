package com.kwpugh.resourceful_tools.items;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class ClamDigger extends ShovelItem
{
    public ClamDigger(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings)
    {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(new TranslatableText("item.resourceful_tools.clam_digger.line1").formatted(Formatting.YELLOW));
        tooltip.add(new TranslatableText("item.resourceful_tools.clam_digger.line2").formatted(Formatting.BLUE));
    }
}
