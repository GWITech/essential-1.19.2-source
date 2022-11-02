package gg.essential.elementa.transitions;

import kotlin.jvm.internal.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
final synthetic class RecursiveFadeInTransition$doTransition$1$1 extends MutablePropertyReference0Impl {
    RecursiveFadeInTransition$doTransition$1$1(final Object receiver) {
        super(receiver, (Class)RecursiveFadeInTransition.class, "alpha", "getAlpha()F", 0);
    }
    
    @Nullable
    public Object get() {
        return RecursiveFadeInTransition.access$getAlpha((RecursiveFadeInTransition)this.receiver);
    }
    
    public void set(@Nullable final Object value) {
        RecursiveFadeInTransition.access$setAlpha((RecursiveFadeInTransition)this.receiver, ((Number)value).floatValue());
    }
}