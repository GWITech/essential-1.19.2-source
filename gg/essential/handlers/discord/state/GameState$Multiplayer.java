package gg.essential.handlers.discord.state;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010	\u001a\u00020
                                                   2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010""" }, d2 = { "Lgg/essential/handlers/discord/state/GameState$Multiplayer;", "Lgg/essential/handlers/discord/state/GameState;", "ip", "", "(Ljava/lang/String;)V", "getIp", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "essential" })
public static final class Multiplayer extends GameState
{
    @NotNull
    private final String ip;
    
    public Multiplayer(@NotNull final String ip) {
        Intrinsics.checkNotNullParameter((Object)ip, "ip");
        super((byte)0);
        this.ip = ip;
    }
    
    @NotNull
    public final String getIp() {
        return this.ip;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Multiplayer(ip=" + this.ip;
    }
    
    @Override
    public int hashCode() {
        return this.ip.hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof Multiplayer && Intrinsics.areEqual((Object)this.ip, (Object)((Multiplayer)other).ip));
    }
}
