package com.kwpugh.resourceful_tools.materials;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IronToolMaterial implements ToolMaterial
{
    private static int durability = ResourcefulTools.CONFIG.GENERAL.ironDurability;
    private static float miningSpeed = ResourcefulTools.CONFIG.GENERAL.ironMiningSpeed;
    private static float attackDamage = ResourcefulTools.CONFIG.GENERAL.ironAttackDamage;
    private static int miningLevel = ResourcefulTools.CONFIG.GENERAL.ironMiningLevel;
    private static int enchantability = ResourcefulTools.CONFIG.GENERAL.ironEnchantability;

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