package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "it", "invoke" })
static final class GradientComponent$startColorState$1 extends Lambda implements Function1<Color, Color> {
    public static final GradientComponent$startColorState$1 INSTANCE;
    
    GradientComponent$startColorState$1() {
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
        GradientComponent$startColorState$1.INSTANCE = new GradientComponent$startColorState$1();
    }
}