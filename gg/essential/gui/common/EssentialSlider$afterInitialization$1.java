package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "fraction", "", "invoke" })
static final class EssentialSlider$afterInitialization$1 extends Lambda implements Function1<Float, String> {
    final /* synthetic */ EssentialSlider this$0;
    
    EssentialSlider$afterInitialization$1(final EssentialSlider $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final String invoke(final float fraction) {
        return this.this$0.reduceFractionToDisplay(fraction);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(((Number)p1).floatValue());
    }
}