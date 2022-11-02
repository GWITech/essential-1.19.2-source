package gg.essential.gui.menu;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.image.*;
import gg.essential.handlers.*;
import gg.essential.gui.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lgg/essential/gui/image/ImageFactory;", "invoke" })
static final class RightSideBar$inviteIcon$1 extends Lambda implements Function0<ImageFactory> {
    final /* synthetic */ PauseMenuDisplay.MenuType $menuType;
    final /* synthetic */ RightSideBar this$0;
    
    RightSideBar$inviteIcon$1(final PauseMenuDisplay.MenuType $menuType, final RightSideBar $receiver) {
        this.$menuType = $menuType;
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final ImageFactory invoke() {
        return switch (WhenMappings.$EnumSwitchMapping$0[this.$menuType.ordinal()]) {
            case 1 -> EssentialPalette.WORLD_8X;
            case 2 -> (this.this$0.getConnectionManager().getSpsManager().getLocalSession() != null) ? EssentialPalette.INVITE_10X6 : EssentialPalette.WORLD_8X;
            case 3 -> EssentialPalette.INVITE_10X6;
            default -> throw new NoWhenBranchMatchedException();
        };
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[PauseMenuDisplay.MenuType.values().length];
            $EnumSwitchMapping$[PauseMenuDisplay.MenuType.MAIN.ordinal()] = 1;
            $EnumSwitchMapping$[PauseMenuDisplay.MenuType.SINGLEPLAYER.ordinal()] = 2;
            $EnumSwitchMapping$[PauseMenuDisplay.MenuType.SERVER.ordinal()] = 3;
            WhenMappings.$EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}