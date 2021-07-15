package com.kwpugh.resourceful_tools.foods;

import net.minecraft.item.FoodComponent;

public class FoodList
{
    public static FoodComponent jerky = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).build();
    public static FoodComponent cooked_clam = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.8F).build();
}
