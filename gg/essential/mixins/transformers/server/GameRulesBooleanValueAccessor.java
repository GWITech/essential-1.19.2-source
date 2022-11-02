package gg.essential.mixins.transformers.server;

import org.spongepowered.asm.mixin.*;
import net.minecraft.world.*;
import org.spongepowered.asm.mixin.gen.*;
import org.spongepowered.asm.mixin.transformer.meta.*;

@Mixin({ GameRules.BooleanRule.class })
public interface GameRulesBooleanValueAccessor
{
    @Invoker
    @MixinProxy(sessionId = "8123bd13-2a4c-46a4-b56e-a2a9e7ae5fb3")
    default /* synthetic */ GameRules.Type<GameRules.BooleanRule> invokeCreate(final boolean defaultValue) {
        return (GameRules.Type<GameRules.BooleanRule>)GameRules.BooleanRule.invokeCreate_$md$ae5fb3$0(defaultValue);
    }
}
