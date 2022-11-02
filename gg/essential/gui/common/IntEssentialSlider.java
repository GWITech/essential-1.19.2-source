package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import java.util.*;
import kotlin.ranges.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020	H\u0002J\u001a\u0010\u0010\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020	H\u0016J\u0010\u0010\u0014\u001a\u00020	2\u0006\u0010\u000f\u001a\u00020	H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u0010
                                                   \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/common/IntEssentialSlider;", "Lgg/essential/gui/common/EssentialSlider;", "minValue", "", "maxValue", "initialValue", "(III)V", "intValue", "Lgg/essential/elementa/state/MappedState;", "", "updates", "", "Lkotlin/Function1;", "", "mapFractionToRange", "fraction", "onUpdateInt", "callback", "reduceFractionToDisplay", "", "updateSliderValue", "essential" })
public final class IntEssentialSlider extends EssentialSlider
{
    private final int minValue;
    private final int maxValue;
    @NotNull
    private final List<Function1<Integer, Unit>> updates;
    @NotNull
    private final MappedState<Float, Integer> intValue;
    
    public IntEssentialSlider(final int minValue, final int maxValue, final int initialValue) {
        super((initialValue - minValue) / (float)(maxValue - minValue));
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.updates = new ArrayList<Function1<Integer, Unit>>();
        (this.intValue = this.getFraction().map((kotlin.jvm.functions.Function1<? super Float, ? extends Integer>)new IntEssentialSlider$intValue.IntEssentialSlider$intValue$1(this))).onSetValue((kotlin.jvm.functions.Function1<? super Object, Unit>)new Function1<Integer, Unit>() {
            final /* synthetic */ IntEssentialSlider this$0;
            
            IntEssentialSlider$1() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(final int it) {
                for (final Function1 update : IntEssentialSlider.access$getUpdates$p(this.this$0)) {
                    update.invoke((Object)it);
                }
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke(((Number)p1).intValue());
                return Unit.INSTANCE;
            }
        });
    }
    
    private final int mapFractionToRange(final float fraction) {
        final int range = this.maxValue - this.minValue;
        return RangesKt.coerceIn((int)(this.minValue + (float)Math.rint(fraction * range)), (ClosedRange)new IntRange(this.minValue, this.maxValue));
    }
    
    public final void onUpdateInt(@NotNull final Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        this.updates.add((Function1<Integer, Unit>)callback);
    }
    
    @NotNull
    @Override
    public String reduceFractionToDisplay(final float fraction) {
        return String.valueOf(this.mapFractionToRange(fraction));
    }
    
    @Override
    public float updateSliderValue(final float fraction) {
        final int range = this.maxValue - this.minValue;
        return (float)Math.rint(fraction * range) / range;
    }
    
    public static final /* synthetic */ int access$mapFractionToRange(final IntEssentialSlider $this, final float fraction) {
        return $this.mapFractionToRange(fraction);
    }
    
    public static final /* synthetic */ List access$getUpdates$p(final IntEssentialSlider $this) {
        return $this.updates;
    }
}
