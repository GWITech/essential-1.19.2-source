package gg.essential.gui.studio;

import kotlin.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.util.*;
import net.minecraft.client.gui.screen.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0011
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J
                                                   \u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002
                                                   \u0000R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006
                                                   
                                                   \u0002\u0010\u000b\u001a\u0004\b	\u0010
                                                   ¨\u0006\u000e""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Companion;", "", "()V", "CART_HEIGHT", "", "categoryWidth", "slotOrder", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "getSlotOrder", "()[Lgg/essential/mod/cosmetics/CosmeticSlot;", "[Lgg/essential/mod/cosmetics/CosmeticSlot;", "getInstance", "Lgg/essential/gui/studio/CosmeticStudio;", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final CosmeticSlot[] getSlotOrder() {
        return CosmeticStudio.access$getSlotOrder$cp();
    }
    
    @JvmStatic
    @Nullable
    public final CosmeticStudio getInstance() {
        final Screen openedScreen = GuiUtil.INSTANCE.openedScreen();
        return (openedScreen instanceof CosmeticStudio) ? ((CosmeticStudio)openedScreen) : null;
    }
    
    public Companion(final byte b) {
        this();
    }
}
