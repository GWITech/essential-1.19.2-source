package gg.essential.gui.friends;

import kotlin.*;
import gg.essential.util.*;
import net.minecraft.client.gui.screen.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import gg.essential.config.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J
                                                   \u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/friends/SocialMenu$Companion;", "", "()V", "getGuiScaleOffset", "", "getInstance", "Lgg/essential/gui/friends/SocialMenu;", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    @Nullable
    public final SocialMenu getInstance() {
        final Screen openedScreen = GuiUtil.INSTANCE.openedScreen();
        return (openedScreen instanceof SocialMenu) ? ((SocialMenu)openedScreen) : null;
    }
    
    public final float getGuiScaleOffset() {
        return EssentialConfig.INSTANCE.getEnlargeSocialMenuChatMetadata() ? 0.0f : -1.0f;
    }
    
    public Companion(final byte b) {
        this();
    }
}
