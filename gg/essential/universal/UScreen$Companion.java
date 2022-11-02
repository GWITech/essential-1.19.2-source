package gg.essential.universal;

import kotlin.*;
import net.minecraft.client.gui.screen.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001c
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020	2\b\u0010
                                                   \u001a\u0004\u0018\u00010\u0004H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b""" }, d2 = { "Lgg/essential/universal/UScreen$Companion;", "", "()V", "currentScreen", "Lnet/minecraft/client/gui/screen/Screen;", "getCurrentScreen$annotations", "getCurrentScreen", "()Lnet/minecraft/client/gui/screen/Screen;", "displayScreen", "", "screen", "universalcraft" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @Nullable
    public final Screen getCurrentScreen() {
        return UMinecraft.getMinecraft().currentScreen;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getCurrentScreen$annotations() {
    }
    
    @JvmStatic
    public final void displayScreen(@Nullable final Screen screen) {
        UMinecraft.getMinecraft().setScreen(screen);
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
