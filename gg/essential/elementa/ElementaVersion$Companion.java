package gg.essential.elementa;

import org.jetbrains.annotations.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0006X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u000f\u001a\u00020\u0006X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0012\u001a\u00020\u0006X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015" }, d2 = { "Lgg/essential/elementa/ElementaVersion$Companion;", "", "()V", "DEPRECATION_MESSAGE", "", "active", "Lgg/essential/elementa/ElementaVersion;", "getActive$annotations", "getActive", "()Lgg/essential/elementa/ElementaVersion;", "setActive", "(Lgg/essential/elementa/ElementaVersion;)V", "v0", "getV0$Elementa$annotations", "getV0$Elementa", "v1", "getV1$Elementa$annotations", "getV1$Elementa", "v2", "getV2$Elementa$annotations", "getV2$Elementa", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final ElementaVersion getV0$Elementa() {
        return ElementaVersion.access$getV0$cp();
    }
    
    @Deprecated
    public static /* synthetic */ void getV0$Elementa$annotations() {
    }
    
    @NotNull
    public final ElementaVersion getV1$Elementa() {
        return ElementaVersion.access$getV1$cp();
    }
    
    @Deprecated
    public static /* synthetic */ void getV1$Elementa$annotations() {
    }
    
    @NotNull
    public final ElementaVersion getV2$Elementa() {
        return ElementaVersion.access$getV2$cp();
    }
    
    @Deprecated
    public static /* synthetic */ void getV2$Elementa$annotations() {
    }
    
    @NotNull
    public final ElementaVersion getActive() {
        return ElementaVersion.access$getActive$cp();
    }
    
    public final void setActive(@NotNull final ElementaVersion <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        ElementaVersion.access$setActive$cp(<set-?>);
    }
    
    @PublishedApi
    @Deprecated
    public static /* synthetic */ void getActive$annotations() {
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
