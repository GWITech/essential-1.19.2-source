package gg.essential.mixins.transformers.entity.player;

import org.spongepowered.asm.mixin.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.data.*;
import org.spongepowered.asm.mixin.gen.*;
import org.spongepowered.asm.mixin.transformer.meta.*;

@Mixin({ PlayerEntity.class })
public interface EntityPlayerAccessor
{
    @Accessor("PLAYER_MODEL_PARTS")
    @MixinProxy(sessionId = "8123bd13-2a4c-46a4-b56e-a2a9e7ae5fb3")
    default /* synthetic */ TrackedData<Byte> getPlayerModelFlag() {
        return (TrackedData<Byte>)PlayerEntity.getPlayerModelFlag_$md$ae5fb3$0();
    }
}
