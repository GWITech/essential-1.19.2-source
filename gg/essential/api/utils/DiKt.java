package gg.essential.api.utils;

import kotlin.*;
import gg.essential.api.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import org.kodein.di.*;
import org.kodein.type.*;
import org.apache.logging.log4j.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002\u001a\u001a\u0010\f\u001a\u0002H\r"
                                                   \b\u0000\u0010\r\u0018\u0001*\u00020\u000eH\u0086\b¢\u0006\u0002\u0010\u000f"*\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@@X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0003\u0010\u0004"\u0004\b\u0005\u0010\u0006"\u001e\u0010	\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000b¨\u0006\u0010""" }, d2 = { "value", "Lgg/essential/api/DI;", "essentialDI", "getEssentialDI", "()Lgg/essential/api/DI;", "setEssentialDI", "(Lgg/essential/api/DI;)V", "<set-?>", "", "initialised", "getInitialised", "()Z", "get", "T", "", "()Ljava/lang/Object;", "essential-api" })
public final class DiKt
{
    private static boolean initialised;
    @Nullable
    private static DI essentialDI;
    
    public static final /* synthetic */  <T> T get() {
        final DI essentialDI = getEssentialDI();
        Intrinsics.checkNotNull((Object)essentialDI);
        final DirectDIAware $this$instance_u24default$iv = (DirectDIAware)DIAwareKt.getDirect((DIAware)essentialDI);
        final Object tag$iv = null;
        final DirectDI directDI = $this$instance_u24default$iv.getDirectDI();
        Intrinsics.needClassReification();
        final JVMTypeToken typeToken = TypeTokensJVMKt.typeToken(new DiKt$get$$inlined$instance$default$1().getSuperType());
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T)directDI.Instance((TypeToken)new GenericJVMTypeTokenDelegate(typeToken, (Class)Object.class), tag$iv);
    }
    
    public static final boolean getInitialised() {
        return DiKt.initialised;
    }
    
    @Nullable
    public static final DI getEssentialDI() {
        if (DiKt.initialised) {
            return DiKt.essentialDI;
        }
        throw new RuntimeException("DI not initialised!");
    }
    
    public static final void setEssentialDI(@Nullable final DI value) {
        if (DiKt.initialised) {
            LogManager.getLogger("Essential - DI").error("DI already set!");
        }
        else {
            DiKt.essentialDI = value;
            DiKt.initialised = true;
        }
    }
}
