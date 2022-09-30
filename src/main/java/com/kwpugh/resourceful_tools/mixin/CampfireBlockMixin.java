package com.kwpugh.resourceful_tools.mixin;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CampfireBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(CampfireBlock.class)
public class CampfireBlockMixin
{
    @Inject(method = "spawnSmokeParticle(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ZZ)V", at = @At(value = "HEAD"), cancellable = true)
    private static void spawnColoredParticle(World world, BlockPos pos, boolean isSignal, boolean lotsOfSmoke, CallbackInfo cir)
    {
        Block blockUp = world.getBlockState(pos.up()).getBlock();

        if (!(blockUp instanceof AbstractFurnaceBlock) && world.isReceivingRedstonePower(pos))
        {
            Random random = new Random();

            world.addImportantParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE,
                    true,
                    (double) pos.getX() + 0.5D + random.nextDouble() / 3.0D * (double) (random.nextBoolean() ? 1 : -1),
                    (double) pos.getY() + random.nextDouble() + random.nextDouble(),
                    (double) pos.getZ() + 0.5D + random.nextDouble() / 3.0D * (double) (random.nextBoolean() ? 1 : -1),
                    pos.getX(), pos.getY(), pos.getZ());

            cir.cancel();
        }
    }
}
