package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class SequenceAnimatedUIImage$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ SequenceAnimatedUIImage this$0;
    final /* synthetic */ UIImage[] $frames;
    
    SequenceAnimatedUIImage$1(final SequenceAnimatedUIImage $receiver, final UIImage[] $frames) {
        this.this$0 = $receiver;
        this.$frames = $frames;
        super(1);
    }
    
    public final void invoke(final int it) {
        this.this$0.clearChildren();
        this.this$0.addChild(this.$frames[it]);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(((Number)p1).intValue());
        return Unit.INSTANCE;
    }
}