package gg.essential.util;

import gg.essential.lib.kbrewster.mojangapi.*;
import java.util.*;
import java.util.concurrent.*;
import gg.essential.gui.common.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import gg.essential.universal.*;
import gg.essential.*;
import gg.essential.event.client.*;
import gg.essential.lib.kbrewster.eventbus.*;

public class UUIDUtil
{
    private static final ConcurrentHashMap<UUID, CompletableFuture<String>> uuidLoadingFutures;
    private static final ConcurrentHashMap<String, CompletableFuture<UUID>> nameLoadingFutures;
    private static UUID cachedUUID;
    
    public static CompletableFuture<String> getName(final UUID uuid) {
        return UUIDUtil.uuidLoadingFutures.computeIfAbsent(uuid, ignored1 -> CompletableFuture.supplyAsync(() -> {
            try {
                final String loadedName = MojangAPI.getUsername(uuid);
                UUIDUtil.nameLoadingFutures.put(loadedName.toLowerCase(Locale.ROOT), CompletableFuture.completedFuture(uuid));
                return loadedName;
            }
            catch (final Exception e) {
                UUIDUtil.uuidLoadingFutures.remove(uuid);
                throw new RuntimeException("Failed to load name", e);
            }
        }, Multithreading.POOL));
    }
    
    public static CompletableFuture<UUID> getUUID(final String userName) {
        return UUIDUtil.nameLoadingFutures.computeIfAbsent(userName.toLowerCase(Locale.ROOT), nameLower -> CompletableFuture.supplyAsync(() -> {
            try {
                return MojangAPI.getUUID(nameLower);
            }
            catch (final Exception e) {
                UUIDUtil.nameLoadingFutures.remove(nameLower);
                throw new RuntimeException("Failed to load UUID", e);
            }
        }, Multithreading.POOL));
    }
    
    public static void populate(final String username, final UUID uuid) {
        UUIDUtil.uuidLoadingFutures.computeIfAbsent(uuid, k -> new CompletableFuture()).complete(username);
        UUIDUtil.nameLoadingFutures.computeIfAbsent(username.toLowerCase(Locale.ROOT), k -> new CompletableFuture()).complete(uuid);
    }
    
    public static ReadOnlyState<String> getNameAsState(final UUID uuid) {
        return getNameAsState(uuid, "");
    }
    
    public static ReadOnlyState<String> getNameAsState(final UUID uuid, final String initialValue) {
        final State<String> state = new BasicState<String>(initialValue);
        ExtensionsKt.thenAcceptOnMainThread(getName(uuid), (kotlin.jvm.functions.Function1<? super String, Unit>)(s -> {
            state.set(s);
            return Unit.INSTANCE;
        }));
        return new ReadOnlyState<String>(state);
    }
    
    public static UUID getClientUUID() {
        final UUID cached = UUIDUtil.cachedUUID;
        if (cached != null) {
            return cached;
        }
        return UUIDUtil.cachedUUID = UMinecraft.getMinecraft().getSession().getProfile().getId();
    }
    
    public static UUID formatWithDashes(final String uuidWithoutDashes) {
        return UUID.fromString(uuidWithoutDashes.replaceAll("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5"));
    }
    
    private static /* synthetic */ Unit lambda$getNameAsState$6(final State state, final String s) {
        state.set(s);
        return Unit.INSTANCE;
    }
    
    private static /* synthetic */ CompletableFuture lambda$populate$5(final String k) {
        return new CompletableFuture();
    }
    
    private static /* synthetic */ CompletableFuture lambda$populate$4(final UUID k) {
        return new CompletableFuture();
    }
    
    private static /* synthetic */ CompletableFuture lambda$getUUID$3(final String nameLower) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return MojangAPI.getUUID(nameLower);
            }
            catch (final Exception e) {
                UUIDUtil.nameLoadingFutures.remove(nameLower);
                throw new RuntimeException("Failed to load UUID", e);
            }
        }, Multithreading.POOL);
    }
    
    private static /* synthetic */ UUID lambda$getUUID$2(final String nameLower) {
        try {
            return MojangAPI.getUUID(nameLower);
        }
        catch (final Exception e) {
            UUIDUtil.nameLoadingFutures.remove(nameLower);
            throw new RuntimeException("Failed to load UUID", e);
        }
    }
    
    private static /* synthetic */ CompletableFuture lambda$getName$1(final UUID uuid, final UUID ignored1) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                final String loadedName = MojangAPI.getUsername(uuid);
                UUIDUtil.nameLoadingFutures.put(loadedName.toLowerCase(Locale.ROOT), CompletableFuture.completedFuture(uuid));
                return loadedName;
            }
            catch (final Exception e) {
                UUIDUtil.uuidLoadingFutures.remove(uuid);
                throw new RuntimeException("Failed to load name", e);
            }
        }, Multithreading.POOL);
    }
    
    private static /* synthetic */ String lambda$getName$0(final UUID uuid) {
        try {
            final String loadedName = MojangAPI.getUsername(uuid);
            UUIDUtil.nameLoadingFutures.put(loadedName.toLowerCase(Locale.ROOT), CompletableFuture.completedFuture(uuid));
            return loadedName;
        }
        catch (final Exception e) {
            UUIDUtil.uuidLoadingFutures.remove(uuid);
            throw new RuntimeException("Failed to load name", e);
        }
    }
    
    static {
        uuidLoadingFutures = new ConcurrentHashMap<UUID, CompletableFuture<String>>();
        nameLoadingFutures = new ConcurrentHashMap<String, CompletableFuture<UUID>>();
        UUIDUtil.cachedUUID = null;
        Essential.EVENT_BUS.register(new Object() {
            UUIDUtil$1() {
                super();
            }
            
            @Subscribe
            private void clearUUIDCache(final ReAuthEvent.Pre event) {
                UUIDUtil.cachedUUID = null;
            }
        });
    }
}
