package com.kwpugh.resourceful_tools.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;

public class ResourcefulnessEnchantment extends Enchantment
{
    public ResourcefulnessEnchantment(Rarity weight, EnchantmentTarget enchantmentTarget, EquipmentSlot[] slotTypes)
    {
        super(weight, enchantmentTarget, slotTypes);
    }

    @Override
    public int getMinPower(int level)
    {
        return 10 * (level - 1);
    }

    @Override
    public int getMaxPower(int level)
    {
        return super.getMinPower(level) + 50;
    }

    @Override
    public int getMaxLevel()
    {
        return 1;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack)
    {
        Item tool = stack.getItem();

        if(tool instanceof PickaxeItem || tool instanceof ShovelItem || tool instanceof HoeItem)
        {
            return this.type.isAcceptableItem(stack.getItem());
        }
        else
        {
            return false;
        }
    }
}
