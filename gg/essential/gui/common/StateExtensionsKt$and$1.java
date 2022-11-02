package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;" })
static final class StateExtensionsKt$and$1 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Boolean> {
    public static final StateExtensionsKt$and$1 INSTANCE;
    
    StateExtensionsKt$and$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Pair<Boolean, Boolean> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final boolean a = (boolean)pair.component1();
        final boolean b = (boolean)pair.component2();
        return a && b;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        StateExtensionsKt$and$1.INSTANCE = new StateExtensionsKt$and$1();
    }
}