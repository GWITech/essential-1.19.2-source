package gg.essential.mixins.transformers.feature.gamerules;

import org.spongepowered.asm.mixin.*;
import net.minecraft.world.*;
import java.util.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ GameRules.class })
public interface MixinGameRulesAccessor
{
    @Accessor
    Map<GameRules.Key<?>, GameRules.Rule<?>> getRules();
}
