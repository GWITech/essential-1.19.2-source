package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;", "invoke" })
static final class ListViewComponent$emptyScreenshotText$1 extends Lambda implements Function1<Tab, String> {
    public static final ListViewComponent$emptyScreenshotText$1 INSTANCE;
    
    ListViewComponent$emptyScreenshotText$1() {
        super(1);
    }
    
    @NotNull
    public final String invoke(@NotNull final Tab it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return switch (WhenMappings.$EnumSwitchMapping$0[it.ordinal()]) {
            case 1 -> "You have no screenshots";
            case 2 -> "No screenshots with Essential in Singleplayer";
            case 3 -> "No screenshots with Essential in Multiplayer";
            case 4 -> "No favorite screenshots";
            default -> throw new NoWhenBranchMatchedException();
        };
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Tab)p1);
    }
    
    static {
        ListViewComponent$emptyScreenshotText$1.INSTANCE = new ListViewComponent$emptyScreenshotText$1();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[Tab.values().length];
            $EnumSwitchMapping$[Tab.ALL.ordinal()] = 1;
            $EnumSwitchMapping$[Tab.WORLDS.ordinal()] = 2;
            $EnumSwitchMapping$[Tab.SERVERS.ordinal()] = 3;
            $EnumSwitchMapping$[Tab.LIKED.ordinal()] = 4;
            WhenMappings.$EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}