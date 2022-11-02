package gg.essential.network.cosmetics.dev;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.network.cosmetics.*;
import gg.essential.mod.cosmetics.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010$
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR \u0010	\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020
                                                   0\u0004X\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u000e""" }, d2 = { "Lgg/essential/network/cosmetics/dev/DevCosmetics$None;", "Lgg/essential/network/cosmetics/dev/DevCosmetics;", "()V", "all", "", "", "Lgg/essential/network/cosmetics/Cosmetic;", "getAll", "()Ljava/util/Map;", "types", "Lgg/essential/mod/cosmetics/CosmeticType;", "getTypes", "substitute", "liveCosmetic", "essential" })
public static final class None implements DevCosmetics
{
    @NotNull
    public static final None INSTANCE;
    @NotNull
    private static final Map<String, Cosmetic> all;
    @NotNull
    private static final Map<String, CosmeticType> types;
    
    private None() {
        super();
    }
    
    @NotNull
    @Override
    public Map<String, Cosmetic> getAll() {
        return None.all;
    }
    
    @NotNull
    @Override
    public Map<String, CosmeticType> getTypes() {
        return None.types;
    }
    
    @NotNull
    @Override
    public Cosmetic substitute(@NotNull final Cosmetic liveCosmetic) {
        Intrinsics.checkNotNullParameter((Object)liveCosmetic, "liveCosmetic");
        return liveCosmetic;
    }
    
    static {
        INSTANCE = new None();
        all = MapsKt.emptyMap();
        types = MapsKt.emptyMap();
    }
}
