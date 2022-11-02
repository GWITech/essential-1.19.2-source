package gg.essential.mixins.transformers.server;

import org.spongepowered.asm.mixin.*;
import net.minecraft.world.*;
import org.spongepowered.asm.mixin.gen.*;
import org.spongepowered.asm.mixin.transformer.meta.*;

@Mixin({ GameRules.class })
public interface GameRulesAccessor
{
    @Invoker
    @MixinProxy(sessionId = "8123bd13-2a4c-46a4-b56e-a2a9e7ae5fb3")
    default /* synthetic */  <T extends GameRules.Rule<T>> GameRules.Key<T> invokeRegister(final String name, final GameRules.Category category, final GameRules.Type<T> type) {
        return (GameRules.Key<T>)GameRules.invokeRegister_$md$ae5fb3$0(name, category, (GameRules.Type)type);
    }
}
