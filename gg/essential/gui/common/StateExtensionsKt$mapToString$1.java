package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0004\u0010\u0000\u001a\u00020\u0001"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/String;" })
static final class StateExtensionsKt$mapToString$1 extends Lambda implements Function1<T, String> {
    public static final StateExtensionsKt$mapToString$1 INSTANCE;
    
    StateExtensionsKt$mapToString$1() {
        super(1);
    }
    
    @NotNull
    public final String invoke(final T it) {
        return String.valueOf(it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(p1);
    }
    
    static {
        StateExtensionsKt$mapToString$1.INSTANCE = new StateExtensionsKt$mapToString$1();
    }
}