package gg.essential.gui.overlay;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.mixins.transformers.client.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0002\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b""" }, d2 = { "Lgg/essential/gui/overlay/OverlayManagerImpl$GlobalMouseOverride;", "", "()V", "set", "", "mouseX", "", "mouseY", "essential" })
private static final class GlobalMouseOverride
{
    @NotNull
    public static final GlobalMouseOverride INSTANCE;
    
    private GlobalMouseOverride() {
        super();
    }
    
    public final void set(final double mouseX, final double mouseY) {
        final Mouse mouse2 = OverlayManagerImpl.access$getMc$p().mouse;
        if (mouse2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type gg.essential.mixins.transformers.client.MouseHelperAccessor");
        }
        final MouseHelperAccessor mouse = (MouseHelperAccessor)mouse2;
        mouse.setMouseX(mouseX);
        mouse.setMouseY(mouseY);
    }
    
    static {
        INSTANCE = new GlobalMouseOverride();
    }
}
