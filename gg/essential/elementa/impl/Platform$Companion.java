package gg.essential.elementa.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/elementa/impl/Platform$Companion;", "", "()V", "platform", "Lgg/essential/elementa/impl/Platform;", "getPlatform$Elementa", "()Lgg/essential/elementa/impl/Platform;", "Elementa" })
@ApiStatus.Internal
public static final class Companion
{
    static final /* synthetic */ Companion $$INSTANCE;
    @NotNull
    private static final Platform platform;
    
    private Companion() {
        super();
    }
    
    @NotNull
    public final Platform getPlatform$Elementa() {
        return Companion.platform;
    }
    
    static {
        $$INSTANCE = new Companion();
        final Platform next = ServiceLoader.load(Platform.class, Platform.class.getClassLoader()).iterator().next();
        Intrinsics.checkNotNullExpressionValue((Object)next, "load(Platform::class.jav\u2026Loader).iterator().next()");
        platform = next;
    }
}
