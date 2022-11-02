package gg.essential.gui.overlay;

import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.gui.screen.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\f
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J"\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010""" }, d2 = { "Lgg/essential/gui/overlay/OverlayManagerImpl$OverlayInteractionScreen;", "Lgg/essential/universal/UScreen;", "layer", "Lgg/essential/gui/overlay/Layer;", "(Lgg/essential/gui/overlay/Layer;)V", "getLayer", "()Lgg/essential/gui/overlay/Layer;", "onKeyPressed", "", "keyCode", "", "typedChar", "", "modifiers", "Lgg/essential/universal/UKeyboard$Modifiers;", "onTick", "essential" })
private static final class OverlayInteractionScreen extends UScreen
{
    @NotNull
    private final Layer layer;
    
    public OverlayInteractionScreen(@NotNull final Layer layer) {
        Intrinsics.checkNotNullParameter((Object)layer, "layer");
        super(false, 0, 3, null);
        this.layer = layer;
    }
    
    @NotNull
    public final Layer getLayer() {
        return this.layer;
    }
    
    @Override
    public void onKeyPressed(final int keyCode, final char typedChar, @Nullable final UKeyboard$Modifiers modifiers) {
    }
    
    @Override
    public void onTick() {
        if (!OverlayManagerImpl.access$getLayers$p().contains(this.layer)) {
            UScreen.Companion.displayScreen(null);
        }
        super.onTick();
    }
}
