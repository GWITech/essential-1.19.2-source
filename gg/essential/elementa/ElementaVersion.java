package gg.essential.elementa;

import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f" }, d2 = { "Lgg/essential/elementa/ElementaVersion;", "", "(Ljava/lang/String;I)V", "enableFor", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "V0", "V1", "V2", "Companion", "Elementa" })
public enum ElementaVersion
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private static final String DEPRECATION_MESSAGE = "This version of Elementa has been deprecated.\nIt may still be used but its behavior has been determined to be unexpected, suboptimal or broken in same way.\nWe therefore recommend you opt-in to a newer version.\nBe sure to read through all the changes between your current version and your new version to be able to act in case you are affected by them.\n";
    @NotNull
    private static final ElementaVersion v0;
    @NotNull
    private static final ElementaVersion v1;
    @NotNull
    private static final ElementaVersion v2;
    @NotNull
    private static ElementaVersion active;
    
    @Deprecated(message = "This version of Elementa has been deprecated.\nIt may still be used but its behavior has been determined to be unexpected, suboptimal or broken in same way.\nWe therefore recommend you opt-in to a newer version.\nBe sure to read through all the changes between your current version and your new version to be able to act in case you are affected by them.\n")
    @java.lang.Deprecated
    V0("V0", 0), 
    @Deprecated(message = "This version of Elementa has been deprecated.\nIt may still be used but its behavior has been determined to be unexpected, suboptimal or broken in same way.\nWe therefore recommend you opt-in to a newer version.\nBe sure to read through all the changes between your current version and your new version to be able to act in case you are affected by them.\n")
    @java.lang.Deprecated
    V1("V1", 1), 
    V2("V2", 2);
    
    private static final /* synthetic */ ElementaVersion[] $VALUES;
    
    private ElementaVersion(final String $enum$name, final int $enum$ordinal) {
    }
    
    public final <T> T enableFor(@NotNull final Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final int $i$f$enableFor = 0;
        final ElementaVersion prevVersion = ElementaVersion.Companion.getActive();
        ElementaVersion.Companion.setActive(this);
        try {
            return (T)block.invoke();
        }
        finally {
            InlineMarker.finallyStart(1);
            ElementaVersion.Companion.setActive(prevVersion);
            InlineMarker.finallyEnd(1);
        }
    }
    
    public static ElementaVersion[] values() {
        return ElementaVersion.$VALUES.clone();
    }
    
    public static ElementaVersion valueOf(final String value) {
        return Enum.valueOf(ElementaVersion.class, value);
    }
    
    private static final /* synthetic */ ElementaVersion[] $values() {
        return new ElementaVersion[] { ElementaVersion.V0, ElementaVersion.V1, ElementaVersion.V2 };
    }
    
    public static final /* synthetic */ ElementaVersion access$getV0$cp() {
        return ElementaVersion.v0;
    }
    
    public static final /* synthetic */ ElementaVersion access$getV1$cp() {
        return ElementaVersion.v1;
    }
    
    public static final /* synthetic */ ElementaVersion access$getV2$cp() {
        return ElementaVersion.v2;
    }
    
    public static final /* synthetic */ ElementaVersion access$getActive$cp() {
        return ElementaVersion.active;
    }
    
    public static final /* synthetic */ void access$setActive$cp(final ElementaVersion <set-?>) {
        ElementaVersion.active = <set-?>;
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
        v0 = ElementaVersion.V0;
        v1 = ElementaVersion.V1;
        v2 = ElementaVersion.V2;
        ElementaVersion.active = ElementaVersion.v0;
    }
    
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
        
        @java.lang.Deprecated
        public static /* synthetic */ void getV0$Elementa$annotations() {
        }
        
        @NotNull
        public final ElementaVersion getV1$Elementa() {
            return ElementaVersion.access$getV1$cp();
        }
        
        @java.lang.Deprecated
        public static /* synthetic */ void getV1$Elementa$annotations() {
        }
        
        @NotNull
        public final ElementaVersion getV2$Elementa() {
            return ElementaVersion.access$getV2$cp();
        }
        
        @java.lang.Deprecated
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
        @java.lang.Deprecated
        public static /* synthetic */ void getActive$annotations() {
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
