package com.kwpugh.resourceful_tools.foods;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import net.minecraft.item.FoodComponent;

public class FoodList
{
    public static FoodComponent jerky = (new FoodComponent.Builder())
            .hunger(ResourcefulTools.CONFIG.GENERAL.jerky_hunger)
            .saturationModifier(ResourcefulTools.CONFIG.GENERAL.jerky_saturation)
            .build();

    public static FoodComponent cooked_clam = (new FoodComponent.Builder())
            .hunger(ResourcefulTools.CONFIG.GENERAL.cooked_clam_hunger)
            .saturationModifier(ResourcefulTools.CONFIG.GENERAL.cooked_clam_saturation)
            .build();

    public static FoodComponent acorn = (new FoodComponent.Builder())
            .hunger(ResourcefulTools.CONFIG.GENERAL.acorn_hunger)
            .saturationModifier(ResourcefulTools.CONFIG.GENERAL.acorn_saturation)
            .build();

    public static FoodComponent acorn_dark = (new FoodComponent.Builder())
            .hunger(ResourcefulTools.CONFIG.GENERAL.acorn_dark_hunger)
            .saturationModifier(ResourcefulTools.CONFIG.GENERAL.acorn_dark_saturation)
            .build();
}
