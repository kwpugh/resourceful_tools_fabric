package com.kwpugh.resourceful_tools.materials;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperToolMaterial implements ToolMaterial
{
    private static int durability = ResourcefulTools.CONFIG.GENERAL.copperDurability;
    private static float miningSpeed = ResourcefulTools.CONFIG.GENERAL.copperMiningSpeed;
    private static float attackDamage = ResourcefulTools.CONFIG.GENERAL.copperAttackDamage;
    private static int miningLevel = ResourcefulTools.CONFIG.GENERAL.copperMiningLevel;
    private static int enchantability = ResourcefulTools.CONFIG.GENERAL.copperEnchantability;

    @Override
    public int getDurability()
    {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage()
    {
        return attackDamage;
    }

    @Override
    public int getMiningLevel()
    {
        return miningLevel;
    }

    @Override
    public int getEnchantability()
    {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }
}