package gg.essential.gui.multiplayer;

import kotlin.*;
import gg.essential.util.*;
import net.minecraft.client.gui.screen.multiplayer.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.mixins.ext.client.gui.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J
                                                   \u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/multiplayer/EssentialMultiplayerGui$Companion;", "", "()V", "getInstance", "Lgg/essential/gui/multiplayer/EssentialMultiplayerGui;", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    @Nullable
    public final EssentialMultiplayerGui getInstance() {
        final Screen openedScreen = GuiUtil.INSTANCE.openedScreen();
        final MultiplayerScreen multiplayerScreen = (openedScreen instanceof MultiplayerScreen) ? openedScreen : null;
        if (multiplayerScreen != null) {
            final GuiMultiplayerExt ext = GuiMultiplayerExtKt.getExt(multiplayerScreen);
            if (ext != null) {
                return GuiMultiplayerExtKt.getEssential(ext);
            }
        }
        return null;
    }
    
    public Companion(final byte b) {
        this();
    }
}
