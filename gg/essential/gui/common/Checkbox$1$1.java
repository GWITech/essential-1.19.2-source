package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a
                                                    \u0002*\u0004\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke" })
static final class Checkbox$1$1 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Color>, Color> {
    public static final Checkbox$1$1 INSTANCE;
    
    Checkbox$1$1() {
        super(1);
    }
    
    public final Color invoke(@NotNull final Pair<Boolean, ? extends Color> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final boolean hovered = (boolean)pair.component1();
        final Color color = (Color)pair.component2();
        return hovered ? color.brighter() : color;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        Checkbox$1$1.INSTANCE = new Checkbox$1$1();
    }
}