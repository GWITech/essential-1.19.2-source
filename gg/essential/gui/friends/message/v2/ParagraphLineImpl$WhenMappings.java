package gg.essential.gui.friends.message.v2;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
public final synthetic class WhenMappings
{
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    
    static {
        final int[] $EnumSwitchMapping$ = new int[SendState.values().length];
        $EnumSwitchMapping$[SendState.CONFIRMED.ordinal()] = 1;
        $EnumSwitchMapping$[SendState.SENDING.ordinal()] = 2;
        $EnumSwitchMapping$[SendState.FAILED.ordinal()] = 3;
        $EnumSwitchMapping$0 = $EnumSwitchMapping$;
    }
}
