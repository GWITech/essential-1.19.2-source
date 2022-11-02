package gg.essential.vigilance.gui.settings;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "kotlin.jvm.PlatformType", "it", "invoke" })
static final class SwitchComponent$3$1$1 extends Lambda implements Function1<Color, Color> {
    public static final SwitchComponent$3$1$1 INSTANCE;
    
    SwitchComponent$3$1$1() {
        super(1);
    }
    
    public final Color invoke(final Color it) {
        return it.brighter();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Color)p1);
    }
    
    static {
        SwitchComponent$3$1$1.INSTANCE = new SwitchComponent$3$1$1();
    }
}