package gg.essential.vigilance.gui.settings;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import gg.essential.vigilance.gui.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "it", "", "invoke" })
static final class DropDownComponent$3$1 extends Lambda implements Function1<Boolean, Color> {
    public static final DropDownComponent$3$1 INSTANCE;
    
    DropDownComponent$3$1() {
        super(1);
    }
    
    @NotNull
    public final Color invoke(final boolean it) {
        return it ? VigilancePalette.INSTANCE.getButton() : VigilancePalette.INSTANCE.getComponentBackground();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
    
    static {
        DropDownComponent$3$1.INSTANCE = new DropDownComponent$3$1();
    }
}