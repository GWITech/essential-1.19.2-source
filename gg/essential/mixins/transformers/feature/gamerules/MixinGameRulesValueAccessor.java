package gg.essential.mixins.transformers.feature.gamerules;

import org.spongepowered.asm.mixin.*;
import net.minecraft.world.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ GameRules.Rule.class })
public interface MixinGameRulesValueAccessor
{
    @Accessor
    GameRules.Type getType();
}
