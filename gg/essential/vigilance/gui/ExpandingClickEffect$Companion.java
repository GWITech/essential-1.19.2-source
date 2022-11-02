package gg.essential.vigilance.gui;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¨\u0006\b" }, d2 = { "Lgg/essential/vigilance/gui/ExpandingClickEffect$Companion;", "", "()V", "distance", "", "p1", "Lkotlin/Pair;", "p2", "Vigilance" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    private final float distance(final Pair<Float, Float> p1, final Pair<Float, Float> p2) {
        return (float)Math.sqrt((float)Math.pow(((Number)p1.getFirst()).floatValue() - ((Number)p2.getFirst()).floatValue(), 2.0f) + (float)Math.pow(((Number)p1.getSecond()).floatValue() - ((Number)p2.getSecond()).floatValue(), 2.0f));
    }
    
    public static final /* synthetic */ float access$distance(final Companion $this, final Pair p1, final Pair p2) {
        return $this.distance((Pair<Float, Float>)p1, (Pair<Float, Float>)p2);
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
