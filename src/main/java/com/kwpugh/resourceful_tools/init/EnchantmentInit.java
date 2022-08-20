package com.kwpugh.resourceful_tools.init;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.enchantments.ResourcefulnessEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnchantmentInit
{
    public static final Enchantment RESOURCEFULNESS = new ResourcefulnessEnchantment(Enchantment.Rarity.COMMON, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    public static void registerEnchantments()
    {
        Registry.register(Registry.ENCHANTMENT, new Identifier(ResourcefulTools.MOD_ID, "resourcefulness"), RESOURCEFULNESS);
    }
}