package gg.essential.vigilance.utils;

import kotlin.*;
import gg.essential.elementa.utils.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/vigilance/utils/ResourceImageFactory$Companion;", "", "()V", "cache", "Lgg/essential/elementa/utils/ResourceCache;", "getCache", "()Lgg/essential/elementa/utils/ResourceCache;", "Vigilance" })
private static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final ResourceCache getCache() {
        return ResourceImageFactory.access$getCache$cp();
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
