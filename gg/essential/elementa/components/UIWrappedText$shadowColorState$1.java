package gg.essential.elementa.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "it", "invoke" })
static final class UIWrappedText$shadowColorState$1 extends Lambda implements Function1<Color, Color> {
    public static final UIWrappedText$shadowColorState$1 INSTANCE;
    
    UIWrappedText$shadowColorState$1() {
        super(1);
    }
    
    @Nullable
    public final Color invoke(@Nullable final Color it) {
        return it;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Color)p1);
    }
    
    static {
        UIWrappedText$shadowColorState$1.INSTANCE = new UIWrappedText$shadowColorState$1();
    }
}