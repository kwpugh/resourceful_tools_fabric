package com.kwpugh.resourceful_tools;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import com.kwpugh.resourceful_tools.handlers.EventHandler;
import com.kwpugh.resourceful_tools.init.BlockInit;
import com.kwpugh.resourceful_tools.init.ItemInit;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ResourcefulTools implements ModInitializer
{
	public static final String MOD_ID = "resourceful_tools";	
	public static final ItemGroup RESOURCEFUL_TOOLS_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "resourceful_tools_group"), () -> new ItemStack(ItemInit.HAND_TILLER));
	public static final ResourcefulToolsConfig CONFIG = AutoConfig.register(ResourcefulToolsConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();
	
    @Override
    public void onInitialize()
    {	
    	BlockInit.registerBlocks();
    	BlockInit.registerBlockItems();    	
    	ItemInit.registerItems();

		PlayerBlockBreakEvents.AFTER.register(EventHandler::onBlockBreak);
    }	
}