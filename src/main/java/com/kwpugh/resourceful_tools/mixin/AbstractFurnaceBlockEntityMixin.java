package com.kwpugh.resourceful_tools.mixin;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.api.FuelSource;
import net.minecraft.block.BlockState;

import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;

import net.minecraft.fluid.LavaFluid;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractFurnaceBlockEntity.class)
abstract class AbstractFurnaceBlockEntityMixin extends BlockEntity
{
    @Shadow int burnTime;
    @Shadow int cookTime;
    @Shadow int cookTimeTotal;

    boolean lavaSpringPowersFurnace = ResourcefulTools.CONFIG.GENERAL.laveSpringPowerFurnace;
    boolean campfireFurnace = ResourcefulTools.CONFIG.GENERAL.campfirePowerFurnace;
    boolean lavaSourcePowersFurnace = ResourcefulTools.CONFIG.GENERAL.lavasourcePowerFurnace;

    public AbstractFurnaceBlockEntityMixin(BlockEntityType<?> type, BlockPos pos, BlockState state)
    {
        super(type, pos, state);
    }

    @Inject(method = "isBurning", at = @At("RETURN"))
    public void isBurning(CallbackInfoReturnable<Boolean> cir)
    {
        // Lava Spring source
        if (world != null && !world.isClient && lavaSpringPowersFurnace)
    	{
    	    // if next to a furnace, blast furnace, or smoker, keep fuel constant and speed up process
    		if( (this.world.getBlockState(this.pos.north()).getBlock() instanceof FuelSource)  ||
    			  (this.world.getBlockState(this.pos.south()).getBlock() instanceof FuelSource) ||
    			  (this.world.getBlockState(this.pos.east()).getBlock() instanceof FuelSource) ||
    			  (this.world.getBlockState(this.pos.west()).getBlock() instanceof FuelSource))
    		{
                this.burnTime = 400;

                if(this.cookTime > 0)
    			{
    				if(this.cookTime < this.cookTimeTotal - 1)
    				{
    					this.cookTime = this.cookTime + 1;  // Increase rate of cooking by an additional 4
    				}
    			}
    		}
    	}

        // Campfire source
        if (world != null && !world.isClient && campfireFurnace)
        {
            // if next to a furnace, blast furnace, or smoker, keep fuel constant and speed up process
            if(this.world.getBlockState(this.pos.down()).getBlock() instanceof CampfireBlock)
            {
                this.burnTime = 400;
            }
        }

        // Lava source block
        if (world != null && !world.isClient && lavaSourcePowersFurnace)
        {
            // if next to a furnace, blast furnace, or smoker, keep fuel constant and speed up process
            if(this.world.getBlockState(this.pos.down()).getBlock().equals(Blocks.LAVA))
            {
                this.burnTime = 400;
            }
        }
    }
}