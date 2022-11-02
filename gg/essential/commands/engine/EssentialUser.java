package gg.essential.commands.engine;

import kotlin.*;
import java.util.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0007
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J	\u0010\u0013\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010	R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000b¨\u0006\u0014""" }, d2 = { "Lgg/essential/commands/engine/EssentialUser;", "", "uuid", "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "username", "Ljava/util/concurrent/CompletableFuture;", "", "getUsername", "()Ljava/util/concurrent/CompletableFuture;", "getUuid", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "essential" })
public final class EssentialUser
{
    @NotNull
    private final UUID uuid;
    @NotNull
    private final CompletableFuture<String> username;
    
    public EssentialUser(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        super();
        this.uuid = uuid;
        final CompletableFuture<String> name = UUIDUtil.getName(this.uuid);
        Intrinsics.checkNotNullExpressionValue((Object)name, "getName(uuid)");
        this.username = name;
    }
    
    @NotNull
    public final UUID getUuid() {
        return this.uuid;
    }
    
    @NotNull
    public final CompletableFuture<String> getUsername() {
        return this.username;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "EssentialUser(uuid=" + this.uuid;
    }
    
    @Override
    public int hashCode() {
        return this.uuid.hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof EssentialUser && Intrinsics.areEqual((Object)this.uuid, (Object)((EssentialUser)other).uuid));
    }
}
