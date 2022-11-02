package gg.essential.util;

import kotlin.*;
import gg.essential.gui.common.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
public final synthetic class WhenMappings
{
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    
    static {
        final int[] $EnumSwitchMapping$2 = new int[OperatingSystem.values().length];
        $EnumSwitchMapping$2[OperatingSystem.WINDOWS.ordinal()] = 1;
        $EnumSwitchMapping$2[OperatingSystem.MACOS.ordinal()] = 2;
        $EnumSwitchMapping$0 = $EnumSwitchMapping$2;
        final int[] $EnumSwitchMapping$3 = new int[EssentialTooltip.Position.values().length];
        $EnumSwitchMapping$3[EssentialTooltip.Position.LEFT.ordinal()] = 1;
        $EnumSwitchMapping$3[EssentialTooltip.Position.RIGHT.ordinal()] = 2;
        $EnumSwitchMapping$3[EssentialTooltip.Position.ABOVE.ordinal()] = 3;
        $EnumSwitchMapping$3[EssentialTooltip.Position.BELOW.ordinal()] = 4;
        $EnumSwitchMapping$1 = $EnumSwitchMapping$3;
    }
}
