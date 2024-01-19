package io.github.amdyep.bntfa.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayer.class)
public class Mixin$ServerPlayer {
    @Inject(
            method = "bedInRange",
            at = @At("HEAD"),
            cancellable = true
    )
    private void bntfa$inject$bedInRange(BlockPos pPos, Direction pDirection, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
