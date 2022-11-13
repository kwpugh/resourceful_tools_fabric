package com.kwpugh.resourceful_tools.util;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.init.BlockInit;
import com.kwpugh.resourceful_tools.init.ItemInit;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ResourcefulToolsGroup
{
    public static void addGroup()
    {
        // force class run when we want
    }

    private static final ItemGroup RESOURCEFUL_TOOLS_GROUP = FabricItemGroup.builder(new Identifier(ResourcefulTools.MOD_ID, "resourceful_tools_group"))
            .icon(() -> new ItemStack(ItemInit.TREE_TRIMMER))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(BlockInit.DIRT_SINGLE);
                entries.add(BlockInit.DIRT_DOUBLE);
                entries.add(BlockInit.DIRT_TRIPLE);

                entries.add(BlockInit.GRAVEL_SINGLE);
                entries.add(BlockInit.GRAVEL_DOUBLE);
                entries.add(BlockInit.GRAVEL_TRIPLE);

                entries.add(BlockInit.SAND_SINGLE);
                entries.add(BlockInit.SAND_DOUBLE);
                entries.add(BlockInit.SAND_TRIPLE);

                entries.add(BlockInit.COBBLESTONE_SINGLE);
                entries.add(BlockInit.COBBLESTONE_DOUBLE);
                entries.add(BlockInit.COBBLESTONE_TRIPLE);

                entries.add(BlockInit.STONE_SINGLE);
                entries.add(BlockInit.STONE_DOUBLE);
                entries.add(BlockInit.STONE_TRIPLE);

                entries.add(BlockInit.ANDESITE_SINGLE);
                entries.add(BlockInit.ANDESITE_DOUBLE);
                entries.add(BlockInit.ANDESITE_TRIPLE);

                entries.add(BlockInit.DIORITE_SINGLE);
                entries.add(BlockInit.DIORITE_DOUBLE);
                entries.add(BlockInit.DIORITE_TRIPLE);

                entries.add(BlockInit.GRANITE_SINGLE);
                entries.add(BlockInit.GRANITE_DOUBLE);
                entries.add(BlockInit.GRANITE_TRIPLE);

                entries.add(BlockInit.NETHERRACK_SINGLE);
                entries.add(BlockInit.NETHERRACK_DOUBLE);
                entries.add(BlockInit.NETHERRACK_TRIPLE);

                entries.add(BlockInit.COBBLED_DEEPSLATE_SINGLE);
                entries.add(BlockInit.COBBLED_DEEPSLATE_DOUBLE);
                entries.add(BlockInit.COBBLED_DEEPSLATE_TRIPLE);

                entries.add(BlockInit.TUFF_SINGLE);
                entries.add(BlockInit.TUFF_DOUBLE);
                entries.add(BlockInit.TUFF_TRIPLE);

                entries.add(BlockInit.BASALT_SINGLE);
                entries.add(BlockInit.BASALT_DOUBLE);
                entries.add(BlockInit.BASALT_TRIPLE);

                entries.add(BlockInit.LAVASPRING);
                entries.add(BlockInit.WELLSPRING);

                entries.add(ItemInit.HOOK_KNIFE_COPPER);
                entries.add(ItemInit.HOOK_KNIFE);
                entries.add(ItemInit.TREE_TRIMMER_COPPER);
                entries.add(ItemInit.TREE_TRIMMER);
                entries.add(ItemInit.HAND_TILLER_COPPER);
                entries.add(ItemInit.HAND_TILLER);
                entries.add(ItemInit.CLAM_DIGGER_COPPER);
                entries.add(ItemInit.CLAM_DIGGER);
                entries.add(ItemInit.HAND_PICK_COPPER);
                entries.add(ItemInit.HAND_PICK);
                entries.add(ItemInit.GLASS_PLACER);
                entries.add(ItemInit.CRACK_HAMMER_COPPER);
                entries.add(ItemInit.CRACK_HAMMER);
                entries.add(ItemInit.DIAMOND_CRACK_HAMMER);

                entries.add(ItemInit.COPPER_NUGGET);
                entries.add(ItemInit.POWDER_CARBON);
                entries.add(ItemInit.POWDER_IRON);
                entries.add(ItemInit.POWDER_GOLD);
                entries.add(ItemInit.POWDER_EMERALD);
                entries.add(ItemInit.POWDER_DIAMOND);
                entries.add(ItemInit.POWDER_NETHERITE);
                entries.add(ItemInit.POWDER_COPPER);
                entries.add(ItemInit.POWDER_TIN);
                entries.add(ItemInit.POWDER_STEEL);

                entries.add(ItemInit.POWDER_SALTPETER);
                entries.add(ItemInit.POWDER_SULFUR);
                entries.add(ItemInit.BONE_FRAGMENT);
                entries.add(ItemInit.BIT_O_SLIME);
                entries.add(ItemInit.SMALL_BLAZE_POWDER);
                entries.add(ItemInit.PEARL_FRAGMENT);
                entries.add(ItemInit.GHAST_TEAR_FRAGMENT);
                entries.add(ItemInit.NETHER_STAR_FRAGMENT);
                entries.add(ItemInit.NETHERITE_FRAGMENT);

                entries.add(ItemInit.BAMBOO_SHEET);
                entries.add(ItemInit.LARGE_BAMBOO_SHEET);
                entries.add(ItemInit.REAM_OF_PAPER);

                entries.add(ItemInit.CLAM);
                entries.add(ItemInit.RAW_CLAM);
                entries.add(ItemInit.COOKED_CLAM);
                entries.add(ItemInit.JERKY);
                entries.add(ItemInit.ACORN);
                entries.add(ItemInit.ACORN_DARK);

                entries.add(ItemInit.TRASH_CAN);
            })
            .build();

//    public static final ItemGroup RESOURCEFUL_TOOLS_GROUP = new FabricItemGroup(new Identifier(ResourcefulTools.MOD_ID, "resourceful_tools_group"))
//    {
//        @Override
//        public ItemStack createIcon()
//        {
//            return new ItemStack(ItemInit.TREE_TRIMMER);
//        }
//
//        @Override
//        protected void addItems(FeatureSet enabledFeatures, Entries entries, boolean haPermission)
//        {
//            entries.add(BlockInit.DIRT_SINGLE);
//            entries.add(BlockInit.DIRT_DOUBLE);
//            entries.add(BlockInit.DIRT_TRIPLE);
//
//            entries.add(BlockInit.GRAVEL_SINGLE);
//            entries.add(BlockInit.GRAVEL_DOUBLE);
//            entries.add(BlockInit.GRAVEL_TRIPLE);
//
//            entries.add(BlockInit.SAND_SINGLE);
//            entries.add(BlockInit.SAND_DOUBLE);
//            entries.add(BlockInit.SAND_TRIPLE);
//
//            entries.add(BlockInit.COBBLESTONE_SINGLE);
//            entries.add(BlockInit.COBBLESTONE_DOUBLE);
//            entries.add(BlockInit.COBBLESTONE_TRIPLE);
//
//            entries.add(BlockInit.STONE_SINGLE);
//            entries.add(BlockInit.STONE_DOUBLE);
//            entries.add(BlockInit.STONE_TRIPLE);
//
//            entries.add(BlockInit.ANDESITE_SINGLE);
//            entries.add(BlockInit.ANDESITE_DOUBLE);
//            entries.add(BlockInit.ANDESITE_TRIPLE);
//
//            entries.add(BlockInit.DIORITE_SINGLE);
//            entries.add(BlockInit.DIORITE_DOUBLE);
//            entries.add(BlockInit.DIORITE_TRIPLE);
//
//            entries.add(BlockInit.GRANITE_SINGLE);
//            entries.add(BlockInit.GRANITE_DOUBLE);
//            entries.add(BlockInit.GRANITE_TRIPLE);
//
//            entries.add(BlockInit.NETHERRACK_SINGLE);
//            entries.add(BlockInit.NETHERRACK_DOUBLE);
//            entries.add(BlockInit.NETHERRACK_TRIPLE);
//
//            entries.add(BlockInit.COBBLED_DEEPSLATE_SINGLE);
//            entries.add(BlockInit.COBBLED_DEEPSLATE_DOUBLE);
//            entries.add(BlockInit.COBBLED_DEEPSLATE_TRIPLE);
//
//            entries.add(BlockInit.TUFF_SINGLE);
//            entries.add(BlockInit.TUFF_DOUBLE);
//            entries.add(BlockInit.TUFF_TRIPLE);
//
//            entries.add(BlockInit.BASALT_SINGLE);
//            entries.add(BlockInit.BASALT_DOUBLE);
//            entries.add(BlockInit.BASALT_TRIPLE);
//
//            entries.add(BlockInit.LAVASPRING);
//            entries.add(BlockInit.WELLSPRING);
//
//            entries.add(ItemInit.HOOK_KNIFE_COPPER);
//            entries.add(ItemInit.HOOK_KNIFE);
//            entries.add(ItemInit.TREE_TRIMMER_COPPER);
//            entries.add(ItemInit.TREE_TRIMMER);
//            entries.add(ItemInit.HAND_TILLER_COPPER);
//            entries.add(ItemInit.HAND_TILLER);
//            entries.add(ItemInit.CLAM_DIGGER_COPPER);
//            entries.add(ItemInit.CLAM_DIGGER);
//            entries.add(ItemInit.HAND_PICK_COPPER);
//            entries.add(ItemInit.HAND_PICK);
//            entries.add(ItemInit.GLASS_PLACER);
//            entries.add(ItemInit.CRACK_HAMMER_COPPER);
//            entries.add(ItemInit.CRACK_HAMMER);
//            entries.add(ItemInit.DIAMOND_CRACK_HAMMER);
//
//            entries.add(ItemInit.COPPER_NUGGET);
//            entries.add(ItemInit.POWDER_CARBON);
//            entries.add(ItemInit.POWDER_IRON);
//            entries.add(ItemInit.POWDER_GOLD);
//            entries.add(ItemInit.POWDER_EMERALD);
//            entries.add(ItemInit.POWDER_DIAMOND);
//            entries.add(ItemInit.POWDER_NETHERITE);
//            entries.add(ItemInit.POWDER_COPPER);
//            entries.add(ItemInit.POWDER_TIN);
//            entries.add(ItemInit.POWDER_STEEL);
//
//            entries.add(ItemInit.POWDER_SALTPETER);
//            entries.add(ItemInit.POWDER_SULFUR);
//            entries.add(ItemInit.BONE_FRAGMENT);
//            entries.add(ItemInit.BIT_O_SLIME);
//            entries.add(ItemInit.SMALL_BLAZE_POWDER);
//            entries.add(ItemInit.PEARL_FRAGMENT);
//            entries.add(ItemInit.GHAST_TEAR_FRAGMENT);
//            entries.add(ItemInit.NETHER_STAR_FRAGMENT);
//            entries.add(ItemInit.NETHERITE_FRAGMENT);
//
//            entries.add(ItemInit.BAMBOO_SHEET);
//            entries.add(ItemInit.LARGE_BAMBOO_SHEET);
//            entries.add(ItemInit.REAM_OF_PAPER);
//
//            entries.add(ItemInit.CLAM);
//            entries.add(ItemInit.RAW_CLAM);
//            entries.add(ItemInit.COOKED_CLAM);
//            entries.add(ItemInit.JERKY);
//            entries.add(ItemInit.ACORN);
//            entries.add(ItemInit.ACORN_DARK);
//
//            entries.add(ItemInit.TRASH_CAN);
//        }
//    };
}
