package gg.essential.vigilance.gui.settings;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.vigilance.utils.*;
import kotlin.*;
import gg.essential.vigilance.gui.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "Lgg/essential/vigilance/utils/ImageFactory;", "it", "", "invoke" })
static final class DropDownComponent$iconState$1 extends Lambda implements Function1<Boolean, ImageFactory> {
    public static final DropDownComponent$iconState$1 INSTANCE;
    
    DropDownComponent$iconState$1() {
        super(1);
    }
    
    @NotNull
    public final ImageFactory invoke(final boolean it) {
        return it ? VigilancePalette.INSTANCE.getARROW_UP_7X4$Vigilance() : VigilancePalette.INSTANCE.getARROW_DOWN_7X4$Vigilance();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
    
    static {
        DropDownComponent$iconState$1.INSTANCE = new DropDownComponent$iconState$1();
    }
}