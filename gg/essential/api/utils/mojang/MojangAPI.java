package gg.essential.api.utils.mojang;

import kotlin.*;
import java.util.concurrent.*;
import org.jetbrains.annotations.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000<
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a
                                                   \u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0012\u001a
                                                   \u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0014\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/api/utils/mojang/MojangAPI;", "", "changeSkin", "Lgg/essential/api/utils/mojang/SkinResponse;", "accessToken", "", "uuid", "Ljava/util/UUID;", "model", "Lgg/essential/api/utils/mojang/Model;", "url", "getName", "Ljava/util/concurrent/CompletableFuture;", "getNameHistory", "", "Lgg/essential/api/utils/mojang/Name;", "getProfile", "Lgg/essential/api/utils/mojang/Profile;", "getUUID", "name", "essential-api" })
public interface MojangAPI
{
    @Nullable
    CompletableFuture<UUID> getUUID(@NotNull final String p0);
    
    @Nullable
    CompletableFuture<String> getName(@NotNull final UUID p0);
    
    @Nullable
    List<Name> getNameHistory(@Nullable final UUID p0);
    
    @Nullable
    Profile getProfile(@NotNull final UUID p0);
    
    @Nullable
    SkinResponse changeSkin(@NotNull final String p0, @NotNull final UUID p1, @NotNull final Model p2, @NotNull final String p3);
}
