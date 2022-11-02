package gg.essential.elementa.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
final synthetic class ScrollComponent$horizontalScrollAdjustEvents$1 extends FunctionReferenceImpl implements Function3<Float, Float, Boolean, Unit> {
    ScrollComponent$horizontalScrollAdjustEvents$1(final Object receiver) {
        super(3, receiver, (Class)ScrollComponent.class, "updateScrollBar", "updateScrollBar(FFZ)V", 0);
    }
    
    public final void invoke(final float p0, final float p1, final boolean p2) {
        ScrollComponent.access$updateScrollBar((ScrollComponent)this.receiver, p0, p1, p2);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
        this.invoke(((Number)p1).floatValue(), ((Number)p2).floatValue(), (boolean)p3);
        return Unit.INSTANCE;
    }
}