package com.kwpugh.resourceful_tools.items;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class TrashCan extends Item
{
	public TrashCan(Settings settings)
	{
		super(settings);
	}

	public static final TranslatableText TITLE = new TranslatableText("WARNING!!! ITEMS WILL BE LOST");
	 
	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand)
	{
		ItemStack itemStack = player.getStackInHand(hand);
		player.setCurrentHand(hand);
			
		if (!world.isClient)
		{
            player.openHandledScreen(new SimpleNamedScreenHandlerFactory((i, playerInventory, playerEntity) -> {
               return GenericContainerScreenHandler.createGeneric9x6(i, playerInventory, new SimpleInventory(54));
            }, TITLE));
		}
			
		return TypedActionResult.success(itemStack);
	}	   
	   	   
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
	    tooltip.add(new TranslatableText("item.resourceful_tools.trash_can.line1").formatted(Formatting.YELLOW));
	}
}