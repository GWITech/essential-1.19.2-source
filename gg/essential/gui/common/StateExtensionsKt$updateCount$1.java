package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "a", "b", "invoke", "(II)Ljava/lang/Integer;" })
static final class StateExtensionsKt$updateCount$1 extends Lambda implements Function2<Integer, Integer, Integer> {
    public static final StateExtensionsKt$updateCount$1 INSTANCE;
    
    StateExtensionsKt$updateCount$1() {
        super(2);
    }
    
    @Nullable
    public final Integer invoke(final int a, final int b) {
        final Integer value = a + b;
        final int it = value.intValue();
        return (it > 0) ? value : null;
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke(((Number)p1).intValue(), ((Number)p2).intValue());
    }
    
    static {
        StateExtensionsKt$updateCount$1.INSTANCE = new StateExtensionsKt$updateCount$1();
    }
}