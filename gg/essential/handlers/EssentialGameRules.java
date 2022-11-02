package gg.essential.handlers;

import kotlin.*;
import net.minecraft.world.*;
import gg.essential.mixins.transformers.server.*;
import net.minecraft.server.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010	\u001a\u00020
                                                   2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R5\u0010\u0003\u001a&\u0012\f\u0012
                                                    \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012
                                                    \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e""" }, d2 = { "Lgg/essential/handlers/EssentialGameRules;", "", "()V", "pvpGameRule", "Lnet/minecraft/world/GameRules$Key;", "Lnet/minecraft/world/GameRules$BooleanRule;", "kotlin.jvm.PlatformType", "getPvpGameRule", "()Lnet/minecraft/world/GameRules$Key;", "getBoolean", "", "server", "Lnet/minecraft/server/MinecraftServer;", "rule", "essential" })
public final class EssentialGameRules
{
    private final GameRules$Key<GameRules$BooleanRule> pvpGameRule;
    
    public EssentialGameRules() {
        super();
        this.pvpGameRule = GameRulesAccessor.invokeRegister("pvp", GameRules$Category.PLAYER, GameRulesBooleanValueAccessor.invokeCreate(true));
    }
    
    public final GameRules$Key<GameRules$BooleanRule> getPvpGameRule() {
        return this.pvpGameRule;
    }
    
    public final boolean getBoolean(@NotNull final MinecraftServer server, @NotNull final GameRules$Key<GameRules$BooleanRule> rule) {
        Intrinsics.checkNotNullParameter((Object)server, "server");
        Intrinsics.checkNotNullParameter((Object)rule, "rule");
        return server.getGameRules().getBoolean((GameRules$Key)rule);
    }
}
