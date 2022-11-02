package gg.essential.vigilance.utils;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;" })
static final class ExtensionsKt$and$1 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Boolean> {
    public static final ExtensionsKt$and$1 INSTANCE;
    
    ExtensionsKt$and$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Pair<Boolean, Boolean> $dstr$a$b) {
        Intrinsics.checkNotNullParameter((Object)$dstr$a$b, "$dstr$a$b");
        final boolean a = (boolean)$dstr$a$b.component1();
        final boolean b = (boolean)$dstr$a$b.component2();
        return a && b;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        ExtensionsKt$and$1.INSTANCE = new ExtensionsKt$and$1();
    }
}