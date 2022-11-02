package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import gg.essential.gui.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "it", "", "invoke" })
static final class EssentialDropDown$2 extends Lambda implements Function1<Boolean, Color> {
    public static final EssentialDropDown$2 INSTANCE;
    
    EssentialDropDown$2() {
        super(1);
    }
    
    @NotNull
    public final Color invoke(final boolean it) {
        return it ? EssentialPalette.BUTTON_HIGHLIGHT : EssentialPalette.COMPONENT_BACKGROUND_HIGHLIGHT;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
    
    static {
        INSTANCE = new Function1<Boolean, Color>() {
            public static final EssentialDropDown$2 INSTANCE;
            
            EssentialDropDown$2() {
                super(1);
            }
            
            @NotNull
            public final Color invoke(final boolean it) {
                return it ? EssentialPalette.BUTTON_HIGHLIGHT : EssentialPalette.COMPONENT_BACKGROUND_HIGHLIGHT;
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((boolean)p1);
            }
        };
    }
}