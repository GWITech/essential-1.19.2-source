package gg.essential.gui.screenshot.components;

import kotlin.*;
import gg.essential.gui.screenshot.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
public final synthetic class WhenMappings
{
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    
    static {
        final int[] $EnumSwitchMapping$2 = new int[Tab.values().length];
        $EnumSwitchMapping$2[Tab.ALL.ordinal()] = 1;
        $EnumSwitchMapping$2[Tab.WORLDS.ordinal()] = 2;
        $EnumSwitchMapping$2[Tab.SERVERS.ordinal()] = 3;
        $EnumSwitchMapping$2[Tab.LIKED.ordinal()] = 4;
        $EnumSwitchMapping$0 = $EnumSwitchMapping$2;
        final int[] $EnumSwitchMapping$3 = new int[DateRange.values().length];
        $EnumSwitchMapping$3[DateRange.TODAY.ordinal()] = 1;
        $EnumSwitchMapping$3[DateRange.YESTERDAY.ordinal()] = 2;
        $EnumSwitchMapping$3[DateRange.EARLIER_WEEK.ordinal()] = 3;
        $EnumSwitchMapping$3[DateRange.LAST_WEEK.ordinal()] = 4;
        $EnumSwitchMapping$3[DateRange.EARLIER_MONTH.ordinal()] = 5;
        $EnumSwitchMapping$3[DateRange.LAST_MONTH.ordinal()] = 6;
        $EnumSwitchMapping$3[DateRange.MONTH_OTHER.ordinal()] = 7;
        $EnumSwitchMapping$1 = $EnumSwitchMapping$3;
    }
}
