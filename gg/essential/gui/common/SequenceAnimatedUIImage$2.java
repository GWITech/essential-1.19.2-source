package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class SequenceAnimatedUIImage$2 extends Lambda implements Function1<Long, Unit> {
    final /* synthetic */ SequenceAnimatedUIImage this$0;
    
    SequenceAnimatedUIImage$2(final SequenceAnimatedUIImage $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(final long it) {
        if (SequenceAnimatedUIImage.access$getActiveTimer$p(this.this$0) != -1) {
            this.this$0.stopTimer(SequenceAnimatedUIImage.access$getActiveTimer$p(this.this$0));
        }
        SequenceAnimatedUIImage.access$setActiveTimer$p(this.this$0, this.this$0.startTimer(it, 0L, (Function1<? super Integer, Unit>)new Function1<Integer, Unit>() {
            final /* synthetic */ SequenceAnimatedUIImage this$0 = SequenceAnimatedUIImage$2.this.this$0;
            
            SequenceAnimatedUIImage$2$1() {
                super(1);
            }
            
            public final void invoke$13462e() {
                this.this$0.getCurrentFrame().set((kotlin.jvm.functions.Function1<? super Object, ?>)new Function1<Integer, Integer>() {
                    final /* synthetic */ SequenceAnimatedUIImage this$0 = SequenceAnimatedUIImage$2$1.this.this$0;
                    
                    SequenceAnimatedUIImage$2$1$1() {
                        super(1);
                    }
                    
                    @NotNull
                    public final Integer invoke(final int current) {
                        return (1 + current + 4) % 4;
                    }
                    
                    public /* bridge */ Object invoke(final Object p1) {
                        return this.invoke(((Number)p1).intValue());
                    }
                });
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                ((Number)p1).intValue();
                this.invoke$13462e();
                return Unit.INSTANCE;
            }
        }));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(((Number)p1).longValue());
        return Unit.INSTANCE;
    }
}