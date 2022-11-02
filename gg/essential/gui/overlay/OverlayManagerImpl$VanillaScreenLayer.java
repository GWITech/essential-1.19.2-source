package gg.essential.gui.overlay;

import kotlin.*;
import gg.essential.universal.*;
import net.minecraft.client.gui.screen.*;
import net.minecraft.client.gui.widget.*;
import net.minecraft.client.gui.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020	¨\u0006
                                                   """ }, d2 = { "Lgg/essential/gui/overlay/OverlayManagerImpl$VanillaScreenLayer;", "Lgg/essential/gui/overlay/Layer;", "()V", "isAnythingHovered", "", "mouseX", "", "mouseY", "unfocus", "", "essential" })
private static final class VanillaScreenLayer extends Layer
{
    public VanillaScreenLayer() {
        super(LayerPriority.AboveScreenContent);
    }
    
    public final boolean isAnythingHovered(final float mouseX, final float mouseY) {
        final Screen currentScreen = UScreen.Companion.getCurrentScreen();
        if (currentScreen == null) {
            return false;
        }
        final Screen screen = currentScreen;
        return screen.method_19355((double)mouseX, (double)mouseY).isPresent();
    }
    
    public final void unfocus() {
        final Screen currentScreen = UScreen.Companion.getCurrentScreen();
        if (currentScreen == null) {
            return;
        }
        final Screen screen = currentScreen;
        final ClickableWidget clickableWidget = (ClickableWidget)screen.method_25399();
        if (clickableWidget == null) {
            return;
        }
        final ClickableWidget focused = clickableWidget;
        if (!focused.isFocused()) {
            return;
        }
        if (focused.method_25407(false)) {
            return;
        }
        screen.method_25395((Element)null);
    }
}
