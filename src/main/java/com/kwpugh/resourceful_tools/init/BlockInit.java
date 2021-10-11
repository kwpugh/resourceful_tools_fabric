package com.kwpugh.resourceful_tools.init;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.blocks.Lavaspring;
import com.kwpugh.resourceful_tools.blocks.Wellspring;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit
{
	static boolean enableLavaSpring = ResourcefulTools.CONFIG.GENERAL.enableLavaSpring;
	static boolean enableWellSpring = ResourcefulTools.CONFIG.GENERAL.enableWellSpring;
	
	public static final Block DIRT_SINGLE = new Block(FabricBlockSettings.of(Material.SOIL).strength(2.0F, 2.0F));
	public static final Block DIRT_DOUBLE = new Block(FabricBlockSettings.of(Material.SOIL).strength(2.0F, 2.0F));
	public static final Block DIRT_TRIPLE = new Block(FabricBlockSettings.of(Material.SOIL).strength(2.0F, 2.0F));

	public static final Block GRAVEL_SINGLE = new Block(FabricBlockSettings.of(Material.SOIL).strength(2.0F, 2.0F));
	public static final Block GRAVEL_DOUBLE = new Block(FabricBlockSettings.of(Material.SOIL).strength(2.0F, 2.0F));
	public static final Block GRAVEL_TRIPLE = new Block(FabricBlockSettings.of(Material.SOIL).strength(2.0F, 2.0F));

	public static final Block SAND_SINGLE = new Block(FabricBlockSettings.of(Material.SOIL).strength(2.0F, 2.0F));
	public static final Block SAND_DOUBLE = new Block(FabricBlockSettings.of(Material.SOIL).strength(2.0F, 2.0F));
	public static final Block SAND_TRIPLE = new Block(FabricBlockSettings.of(Material.SOIL).strength(2.0F, 2.0F));
	
	public static final Block COBBLESTONE_SINGLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block COBBLESTONE_DOUBLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block COBBLESTONE_TRIPLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));

	public static final Block ANDESITE_SINGLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block ANDESITE_DOUBLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block ANDESITE_TRIPLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));

	public static final Block DIORITE_SINGLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block DIORITE_DOUBLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block DIORITE_TRIPLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));

	public static final Block GRANITE_SINGLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block GRANITE_DOUBLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block GRANITE_TRIPLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));

	public static final Block NETHERRACK_SINGLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block NETHERRACK_DOUBLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block NETHERRACK_TRIPLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));

	public static final Block COBBLED_DEEPSLATE_SINGLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block COBBLED_DEEPSLATE_DOUBLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block COBBLED_DEEPSLATE_TRIPLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));

	public static final Block TUFF_SINGLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block TUFF_DOUBLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block TUFF_TRIPLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));

	public static final Block BASALT_SINGLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block BASALT_DOUBLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block BASALT_TRIPLE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F));

	public static final Block LAVASPRING = new Lavaspring(FabricBlockSettings.of(Material.METAL).strength(3.0F, 3.0F));
	public static final Block WELLSPRING = new Wellspring(FabricBlockSettings.of(Material.METAL).strength(3.0F, 3.0F));

	public static void registerBlocks()
	{
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "dirt_single"), DIRT_SINGLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "dirt_double"), DIRT_DOUBLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "dirt_triple"), DIRT_TRIPLE);

		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "gravel_single"), GRAVEL_SINGLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "gravel_double"), GRAVEL_DOUBLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "gravel_triple"), GRAVEL_TRIPLE);
	
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "sand_single"), SAND_SINGLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "sand_double"), SAND_DOUBLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "sand_triple"), SAND_TRIPLE);
		
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "cobblestone_single"), COBBLESTONE_SINGLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "cobblestone_double"), COBBLESTONE_DOUBLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "cobblestone_triple"), COBBLESTONE_TRIPLE);

		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "andesite_single"), ANDESITE_SINGLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "andesite_double"), ANDESITE_DOUBLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "andesite_triple"), ANDESITE_TRIPLE);

		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "diorite_single"), DIORITE_SINGLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "diorite_double"), DIORITE_DOUBLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "diorite_triple"), DIORITE_TRIPLE);

		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "granite_single"), GRANITE_SINGLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "granite_double"), GRANITE_DOUBLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "granite_triple"), GRANITE_TRIPLE);

		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "netherrack_single"), NETHERRACK_SINGLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "netherrack_double"), NETHERRACK_DOUBLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "netherrack_triple"), NETHERRACK_TRIPLE);

		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "cobbled_deepslate_single"), COBBLED_DEEPSLATE_SINGLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "cobbled_deepslate_double"), COBBLED_DEEPSLATE_DOUBLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "cobbled_deepslate_triple"), COBBLED_DEEPSLATE_TRIPLE);

		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "tuff_single"), TUFF_SINGLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "tuff_double"), TUFF_DOUBLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "tuff_triple"), TUFF_TRIPLE);

		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "basalt_single"), BASALT_SINGLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "basalt_double"), BASALT_DOUBLE);
		Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "basalt_triple"), BASALT_TRIPLE);

		if(enableLavaSpring)
		{
			Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "lavaspring"), LAVASPRING);
		}

		if(enableWellSpring)
		{
			Registry.register(Registry.BLOCK, new Identifier(ResourcefulTools.MOD_ID, "wellspring"), WELLSPRING);
		}
	}

	public static void registerBlockItems()
	{
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "dirt_single"), new BlockItem(DIRT_SINGLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "dirt_double"), new BlockItem(DIRT_DOUBLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "dirt_triple"), new BlockItem(DIRT_TRIPLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "gravel_single"), new BlockItem(GRAVEL_SINGLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "gravel_double"), new BlockItem(GRAVEL_DOUBLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "gravel_triple"), new BlockItem(GRAVEL_TRIPLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "sand_single"), new BlockItem(SAND_SINGLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "sand_double"), new BlockItem(SAND_DOUBLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "sand_triple"), new BlockItem(SAND_TRIPLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "cobblestone_single"), new BlockItem(COBBLESTONE_SINGLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "cobblestone_double"), new BlockItem(COBBLESTONE_DOUBLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "cobblestone_triple"), new BlockItem(COBBLESTONE_TRIPLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "andesite_single"), new BlockItem(ANDESITE_SINGLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "andesite_double"), new BlockItem(ANDESITE_DOUBLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "andesite_triple"), new BlockItem(ANDESITE_TRIPLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "diorite_single"), new BlockItem(DIORITE_SINGLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "diorite_double"), new BlockItem(DIORITE_DOUBLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "diorite_triple"), new BlockItem(DIORITE_TRIPLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "granite_single"), new BlockItem(GRANITE_SINGLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "granite_double"), new BlockItem(GRANITE_DOUBLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "granite_triple"), new BlockItem(GRANITE_TRIPLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "netherrack_single"), new BlockItem(NETHERRACK_SINGLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "netherrack_double"), new BlockItem(NETHERRACK_DOUBLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "netherrack_triple"), new BlockItem(NETHERRACK_TRIPLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "cobbled_deepslate_single"), new BlockItem(COBBLED_DEEPSLATE_SINGLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "cobbled_deepslate_double"), new BlockItem(COBBLED_DEEPSLATE_DOUBLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "cobbled_deepslate_triple"), new BlockItem(COBBLED_DEEPSLATE_TRIPLE , new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "tuff_single"), new BlockItem(TUFF_SINGLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "tuff_double"), new BlockItem(TUFF_DOUBLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "tuff_triple"), new BlockItem(TUFF_TRIPLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "basalt_single"), new BlockItem(BASALT_SINGLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "basalt_double"), new BlockItem(BASALT_DOUBLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "basalt_triple"), new BlockItem(BASALT_TRIPLE, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));

		if(enableLavaSpring)
		{
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "lavaspring"), new BlockItem(LAVASPRING, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		}

		if(enableWellSpring)
		{
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "wellspring"), new BlockItem(WELLSPRING, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP)));
		}
	}
}
