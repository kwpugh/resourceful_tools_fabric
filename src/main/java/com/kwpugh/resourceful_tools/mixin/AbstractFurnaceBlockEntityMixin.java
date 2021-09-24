package com.kwpugh.resourceful_tools.mixin;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.api.LavaSource;
import net.minecraft.block.BlockState;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;

import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractFurnaceBlockEntity.class)
abstract class AbstractFurnaceBlockEntityMixin extends BlockEntity
{
    @Shadow private int burnTime;
    @Shadow private int cookTime;
    @Shadow private int cookTimeTotal;

    boolean lavaPowersFurnace = ResourcefulTools.CONFIG.GENERAL.laveSpringPowerFurnace;

    public AbstractFurnaceBlockEntityMixin(BlockEntityType<?> type, BlockPos pos, BlockState state)
    {
        super(type, pos, state);
    }

    @Inject(method = "isBurning", at = @At("RETURN"))
    public void isBurning(CallbackInfoReturnable<Boolean> cir)
    {
        if (world != null && !world.isClient && lavaPowersFurnace)
    	{
    	    // if next to a furnace, blast furnace, or smoker, keep fuel constant and speed up process
    		if( (this.world.getBlockState(this.pos.north()).getBlock() instanceof LavaSource)  ||
    			  (this.world.getBlockState(this.pos.south()).getBlock() instanceof LavaSource) ||
    			  (this.world.getBlockState(this.pos.east()).getBlock() instanceof LavaSource) ||
    			  (this.world.getBlockState(this.pos.west()).getBlock() instanceof LavaSource))
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


    }
}