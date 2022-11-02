package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "", "invoke", "(F)Ljava/lang/Integer;" })
static final class IntEssentialSlider$intValue$1 extends Lambda implements Function1<Float, Integer> {
    final /* synthetic */ IntEssentialSlider this$0;
    
    IntEssentialSlider$intValue$1(final IntEssentialSlider $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Integer invoke(final float it) {
        return IntEssentialSlider.access$mapFractionToRange(this.this$0, it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(((Number)p1).floatValue());
    }
}