package gg.essential.api.utils;

import kotlin.*;
import net.minecraft.client.gui.screen.*;
import org.jetbrains.annotations.*;
import gg.essential.api.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J
                                                   \u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b""" }, d2 = { "Lgg/essential/api/utils/GuiUtil$Companion;", "", "()V", "getOpenedScreen", "Lnet/minecraft/client/gui/screen/Screen;", "open", "", "screen", "essential-api" })
public static final class Companion
{
    static final /* synthetic */ Companion $$INSTANCE;
    
    private Companion() {
        super();
    }
    
    @JvmStatic
    public final void open(@Nullable final Screen screen) {
        EssentialAPI.Companion.getGuiUtil().openScreen(screen);
    }
    
    @JvmStatic
    @Nullable
    public final Screen getOpenedScreen() {
        return EssentialAPI.Companion.getGuiUtil().openedScreen();
    }
    
    static {
        $$INSTANCE = new Companion();
    }
}
