package com.kwpugh.resourceful_tools.mixin;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.api.FuelSource;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.entity.BrewingStandBlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingStandBlockEntity.class)
abstract class BrewingStandBlockEntityMixin
{
    @Shadow private int fuel;

    @Inject(at = @At("HEAD"), method = "writeNbt")
    protected void writeNbt(NbtCompound nbt, CallbackInfo ci)
    {
        BrewingStandBlockEntity self = (BrewingStandBlockEntity) (Object) this;
        BlockPos posDown = self.getPos().down();
        World world = self.getWorld();

        if(world != null && !world.isClient)
        {
            BlockState state = world.getBlockState(posDown);
            Block block = state.getBlock();

            if(ResourcefulTools.CONFIG.GENERAL.lavaSpringPowerBrewingStand && block instanceof FuelSource)
            {
                this.fuel = 20;
            }

            if(ResourcefulTools.CONFIG.GENERAL.campfirePowerBrewingStand && block instanceof CampfireBlock)
            {
                this.fuel = 20;
            }
        }
    }
}
