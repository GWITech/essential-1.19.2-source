package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "it", "invoke" })
static final class IconButton$textColor$1 extends Lambda implements Function1<Color, Color> {
    public static final IconButton$textColor$1 INSTANCE;
    
    IconButton$textColor$1() {
        super(1);
    }
    
    @NotNull
    public final Color invoke(@NotNull final Color it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Color)p1);
    }
    
    static {
        IconButton$textColor$1.INSTANCE = new IconButton$textColor$1();
    }
}