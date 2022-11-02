package gg.essential.mixins.transformers.server.integrated;

import org.spongepowered.asm.mixin.*;
import net.minecraft.server.*;
import java.util.*;
import net.minecraft.server.network.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ PlayerManager.class })
public interface LanConnectionsAccessor
{
    @Accessor("players")
    List<ServerPlayerEntity> getPlayerEntityList();
}
