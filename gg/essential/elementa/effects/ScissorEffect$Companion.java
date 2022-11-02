package gg.essential.elementa.effects;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lgg/essential/elementa/effects/ScissorEffect$Companion;", "", "()V", "currentScissorState", "Lgg/essential/elementa/effects/ScissorEffect$ScissorState;", "getCurrentScissorState", "()Lgg/essential/elementa/effects/ScissorEffect$ScissorState;", "setCurrentScissorState", "(Lgg/essential/elementa/effects/ScissorEffect$ScissorState;)V", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @Nullable
    public final ScissorState getCurrentScissorState() {
        return ScissorEffect.access$getCurrentScissorState$cp();
    }
    
    public final void setCurrentScissorState(@Nullable final ScissorState <set-?>) {
        ScissorEffect.access$setCurrentScissorState$cp(<set-?>);
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
