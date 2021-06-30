package com.kwpugh.resourceful_tools.api;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface LavaSource 
{
	default boolean fuelSource(World world, BlockPos pos) 
	{
		return true;
	}
}