package gg.essential.api.utils;

import kotlin.*;
import net.minecraft.client.gui.screen.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import gg.essential.api.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\bf\u0018\u0000 
                                                   2\u00020\u0001:\u0001
                                                   J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J
                                                   \u0010	\u001a\u0004\u0018\u00010\bH&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u000b\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/api/utils/GuiUtil;", "", "getGuiScale", "", "step", "openScreen", "", "screen", "Lnet/minecraft/client/gui/screen/Screen;", "openedScreen", "Companion", "essential-api" })
public interface GuiUtil
{
    @NotNull
    public static final Companion Companion = GuiUtil.Companion.$$INSTANCE;
    
    void openScreen(@Nullable final Screen p0);
    
    @Nullable
    Screen openedScreen();
    
    int getGuiScale();
    
    int getGuiScale(final int p0);
    
    @JvmStatic
    default void open(@Nullable final Screen screen) {
        GuiUtil.Companion.open(screen);
    }
    
    @JvmStatic
    @Nullable
    default Screen getOpenedScreen() {
        return GuiUtil.Companion.getOpenedScreen();
    }
    
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
}
