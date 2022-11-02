package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/gui/studio/CosmeticOption$View;", "cart", "", "invoke" })
static final class CosmeticStudio$view$1 extends Lambda implements Function1<Boolean, CosmeticOption.View> {
    public static final CosmeticStudio$view$1 INSTANCE;
    
    CosmeticStudio$view$1() {
        super(1);
    }
    
    @NotNull
    public final CosmeticOption.View invoke(final boolean cart) {
        return cart ? CosmeticOption.View.Cart : CosmeticOption.View.Grid;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
    
    static {
        CosmeticStudio$view$1.INSTANCE = new CosmeticStudio$view$1();
    }
}