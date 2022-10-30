package com.kwpugh.resourceful_tools;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import com.kwpugh.resourceful_tools.handlers.EventHandler;
import com.kwpugh.resourceful_tools.init.BlockInit;
import com.kwpugh.resourceful_tools.init.EnchantmentInit;
import com.kwpugh.resourceful_tools.init.ItemInit;
import com.kwpugh.resourceful_tools.util.ResourcefulToolsGroup;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;

public class ResourcefulTools implements ModInitializer
{
	public static final String MOD_ID = "resourceful_tools";
	public static final ResourcefulToolsConfig CONFIG = AutoConfig.register(ResourcefulToolsConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();
	
    @Override
    public void onInitialize()
    {	
    	BlockInit.registerBlocks();
    	BlockInit.registerBlockItems();    	
    	ItemInit.registerItems();
		ResourcefulToolsGroup.addGroup();
		EnchantmentInit.registerEnchantments();
		PlayerBlockBreakEvents.AFTER.register(EventHandler::onBlockBreak);
    }	
}