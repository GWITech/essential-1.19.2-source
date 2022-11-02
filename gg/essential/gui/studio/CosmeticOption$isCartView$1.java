package gg.essential.gui.studio;

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
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/studio/CosmeticOption$View;", "invoke", "(Lgg/essential/gui/studio/CosmeticOption$View;)Ljava/lang/Boolean;" })
static final class CosmeticOption$isCartView$1 extends Lambda implements Function1<View, Boolean> {
    public static final CosmeticOption$isCartView$1 INSTANCE;
    
    CosmeticOption$isCartView$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final View it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it == View.Cart;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((View)p1);
    }
    
    static {
        CosmeticOption$isCartView$1.INSTANCE = new CosmeticOption$isCartView$1();
    }
}