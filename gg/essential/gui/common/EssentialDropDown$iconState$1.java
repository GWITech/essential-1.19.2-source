package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.image.*;
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
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/gui/image/ImageFactory;", "it", "", "invoke" })
static final class EssentialDropDown$iconState$1 extends Lambda implements Function1<Boolean, ImageFactory> {
    public static final EssentialDropDown$iconState$1 INSTANCE;
    
    EssentialDropDown$iconState$1() {
        super(1);
    }
    
    @NotNull
    public final ImageFactory invoke(final boolean it) {
        return it ? EssentialPalette.ARROW_UP_7X4 : EssentialPalette.ARROW_DOWN_7X4;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
    
    static {
        EssentialDropDown$iconState$1.INSTANCE = new EssentialDropDown$iconState$1();
    }
}