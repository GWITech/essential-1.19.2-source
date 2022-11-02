package gg.essential.elementa.effects;

import kotlin.*;
import gg.essential.elementa.impl.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/effects/StencilEffect$Companion;", "", "()V", "enableStencil", "", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    public final void enableStencil() {
        Platform.Companion.getPlatform$Elementa().enableStencil();
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
