package gg.essential.commands.engine;

import kotlin.*;
import java.util.*;
import com.sparkuniverse.toolbox.chat.model.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\f
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ	\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J	\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J	\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u000e¨\u0006\u0019""" }, d2 = { "Lgg/essential/commands/engine/EssentialFriend;", "", "ign", "", "uuid", "Ljava/util/UUID;", "channel", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "(Ljava/lang/String;Ljava/util/UUID;Lcom/sparkuniverse/toolbox/chat/model/Channel;)V", "getChannel", "()Lcom/sparkuniverse/toolbox/chat/model/Channel;", "getIgn", "()Ljava/lang/String;", "getUuid", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "essential" })
public final class EssentialFriend
{
    @NotNull
    private final String ign;
    @NotNull
    private final UUID uuid;
    @NotNull
    private final Channel channel;
    
    public EssentialFriend(@NotNull final String ign, @NotNull final UUID uuid, @NotNull final Channel channel) {
        Intrinsics.checkNotNullParameter((Object)ign, "ign");
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        Intrinsics.checkNotNullParameter((Object)channel, "channel");
        super();
        this.ign = ign;
        this.uuid = uuid;
        this.channel = channel;
    }
    
    @NotNull
    public final String getIgn() {
        return this.ign;
    }
    
    @NotNull
    public final UUID getUuid() {
        return this.uuid;
    }
    
    @NotNull
    public final Channel getChannel() {
        return this.channel;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "EssentialFriend(ign=" + this.ign + ", uuid=" + this.uuid + ", channel=" + this.channel;
    }
    
    @Override
    public int hashCode() {
        int result = this.ign.hashCode();
        result = result * 31 + this.uuid.hashCode();
        result = result * 31 + this.channel.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EssentialFriend)) {
            return false;
        }
        final EssentialFriend essentialFriend = (EssentialFriend)other;
        return Intrinsics.areEqual((Object)this.ign, (Object)essentialFriend.ign) && Intrinsics.areEqual((Object)this.uuid, (Object)essentialFriend.uuid) && Intrinsics.areEqual((Object)this.channel, (Object)essentialFriend.channel);
    }
}
