package com.kwpugh.resourceful_tools.init;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.foods.FoodList;
import com.kwpugh.resourceful_tools.items.*;
import com.kwpugh.resourceful_tools.materials.CopperToolMaterial;
import com.kwpugh.resourceful_tools.materials.IronToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit
{
	static int ironHammerDurability = ResourcefulTools.CONFIG.GENERAL.ironHammerDurability;
	static int diamondHammerDurability = ResourcefulTools.CONFIG.GENERAL.diamondHammerDurability;
	static int copperHammerDurability = ResourcefulTools.CONFIG.GENERAL.copperHammerDurability;

	static int ironDurability = ResourcefulTools.CONFIG.GENERAL.ironDurability;
	static int CopperDurability = ResourcefulTools.CONFIG.GENERAL.copperDurability;

	public static final ToolMaterial IRON_TOOL_MATERIAL = new IronToolMaterial();
	public static final ToolMaterial COPPER_TOOL_MATERIAL = new CopperToolMaterial();

	public static final Item HOOK_KNIFE = new HookKnife(new Item.Settings().maxDamage(ironDurability));
	public static final Item HOOK_KNIFE_COPPER = new HookKnife(new Item.Settings().maxDamage(CopperDurability));
	public static final Item TREE_TRIMMER = new TreeTrimmer(IRON_TOOL_MATERIAL, 0, -2.8F, new Item.Settings());
	public static final Item TREE_TRIMMER_COPPER = new TreeTrimmer(COPPER_TOOL_MATERIAL, 0, -2.8F, new Item.Settings());
	public static final Item HAND_TILLER = new HandTiller(IRON_TOOL_MATERIAL, 0.0F, -2.8F, new Item.Settings());
	public static final Item HAND_TILLER_COPPER = new HandTiller(COPPER_TOOL_MATERIAL, 0.0F, -2.8F, new Item.Settings());
	public static final Item CLAM_DIGGER = new ClamDigger(IRON_TOOL_MATERIAL, 0.0F, -2.8F, new Item.Settings());
	public static final Item CLAM_DIGGER_COPPER = new ClamDigger(COPPER_TOOL_MATERIAL, 0.0F, -2.8F, new Item.Settings());
	public static final Item HAND_PICK = new HandPick(IRON_TOOL_MATERIAL, 0, -2.8F, new Item.Settings());
	public static final Item HAND_PICK_COPPER = new HandPick(COPPER_TOOL_MATERIAL, 0, -2.8F, new Item.Settings());
	public static final Item GLASS_PLACER = new GlassPlacer(new Item.Settings().maxCount(1).maxDamage(64));
	public static final Item TRASH_CAN = new TrashCan(new Item.Settings());

	public static final Item CRACK_HAMMER_COPPER = new CrackHammer(new Item.Settings().maxDamage(copperHammerDurability));
	public static final Item CRACK_HAMMER = new CrackHammer(new Item.Settings().maxDamage(ironHammerDurability));
	public static final Item DIAMOND_CRACK_HAMMER = new CrackHammer(new Item.Settings().maxDamage(diamondHammerDurability));
	public static final Item COPPER_NUGGET = new Item(new Item.Settings());
	public static final Item POWDER_IRON = new Item(new Item.Settings());
	public static final Item POWDER_CARBON = new Item(new Item.Settings());
	public static final Item POWDER_GOLD = new Item(new Item.Settings());
	public static final Item POWDER_EMERALD = new Item(new Item.Settings());
	public static final Item POWDER_DIAMOND = new Item(new Item.Settings());
	public static final Item POWDER_NETHERITE = new Item(new Item.Settings());
	public static final Item POWDER_COPPER = new Item(new Item.Settings());
	public static final Item POWDER_TIN = new Item(new Item.Settings());
	public static final Item POWDER_STEEL = new Item(new Item.Settings());

	public static final Item POWDER_SALTPETER = new Item(new Item.Settings());
	public static final Item POWDER_SULFUR = new Item(new Item.Settings());
	public static final Item BONE_FRAGMENT = new Item(new Item.Settings());
	public static final Item BIT_O_SLIME = new Item(new Item.Settings());
	public static final Item SMALL_BLAZE_POWDER = new Item(new Item.Settings());
	public static final Item PEARL_FRAGMENT = new Item(new Item.Settings());
	public static final Item GHAST_TEAR_FRAGMENT = new Item(new Item.Settings());
	public static final Item NETHER_STAR_FRAGMENT = new Item(new Item.Settings());
	public static final Item NETHERITE_FRAGMENT = new Item(new Item.Settings());

	public static final Item BAMBOO_SHEET = new Item(new Item.Settings());
	public static final Item LARGE_BAMBOO_SHEET = new Item(new Item.Settings());
	public static final Item REAM_OF_PAPER = new Item(new Item.Settings());

	public static final Item CLAM = new Item(new Item.Settings());
	public static final Item RAW_CLAM = new Item(new Item.Settings());
	public static final Item COOKED_CLAM = new Item(new Item.Settings().food(FoodList.cooked_clam));
	public static final Item JERKY = new Item(new Item.Settings().food(FoodList.jerky));
	public static final Item ACORN = new Item(new Item.Settings().food(FoodList.acorn));
	public static final Item ACORN_DARK = new Item(new Item.Settings().food(FoodList.acorn_dark));

	public static void registerItems()
	{
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "hook_knife_copper"), HOOK_KNIFE_COPPER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "hook_knife"), HOOK_KNIFE);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "tree_trimmer_copper"), TREE_TRIMMER_COPPER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "tree_trimmer"), TREE_TRIMMER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "hand_tiller_copper"), HAND_TILLER_COPPER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "hand_tiller"), HAND_TILLER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "clam_digger_copper"), CLAM_DIGGER_COPPER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "clam_digger"), CLAM_DIGGER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "hand_pick_copper"), HAND_PICK_COPPER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "hand_pick"), HAND_PICK);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "glass_placer"), GLASS_PLACER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "crack_hammer_copper"), CRACK_HAMMER_COPPER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "crack_hammer"), CRACK_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "crack_hammer_diamond"), DIAMOND_CRACK_HAMMER);

		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "copper_nugget"), COPPER_NUGGET);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_carbon"), POWDER_CARBON);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_iron"), POWDER_IRON);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_gold"), POWDER_GOLD);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_emerald"), POWDER_EMERALD);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_diamond"), POWDER_DIAMOND);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_netherite"), POWDER_NETHERITE);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_copper"), POWDER_COPPER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_tin"), POWDER_TIN);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_steel"), POWDER_STEEL);

		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_saltpeter"), POWDER_SALTPETER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_sulfur"), POWDER_SULFUR);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "bone_fragment"), BONE_FRAGMENT);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "bit_o_slime"), BIT_O_SLIME);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "small_blaze_powder"), SMALL_BLAZE_POWDER);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "pearl_fragment"), PEARL_FRAGMENT);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "ghast_tear_fragment"), GHAST_TEAR_FRAGMENT);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "nether_star_fragment"), NETHER_STAR_FRAGMENT);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "netherite_fragment"), NETHERITE_FRAGMENT);
	 
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "bamboo_sheet"), BAMBOO_SHEET);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "large_bamboo_sheet"), LARGE_BAMBOO_SHEET);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "ream_of_paper"), REAM_OF_PAPER);

		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "clam"), CLAM);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "raw_clam"), RAW_CLAM);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "cooked_clam"), COOKED_CLAM);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "jerky"), JERKY);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "acorn"), ACORN);
		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "acorn_dark"), ACORN_DARK);

		Registry.register(Registries.ITEM, new Identifier(ResourcefulTools.MOD_ID, "trash_can"), TRASH_CAN);
	} 
}
