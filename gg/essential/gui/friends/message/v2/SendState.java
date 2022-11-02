package gg.essential.gui.friends.message.v2;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "Lgg/essential/gui/friends/message/v2/SendState;", "", "(Ljava/lang/String;I)V", "SENDING", "CONFIRMED", "FAILED", "essential" })
public enum SendState
{
    SENDING("SENDING", 0), 
    CONFIRMED("CONFIRMED", 1), 
    FAILED("FAILED", 2);
    
    private static final /* synthetic */ SendState[] $VALUES;
    
    private SendState(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static SendState[] values() {
        return SendState.$VALUES.clone();
    }
    
    public static SendState valueOf(final String value) {
        return Enum.valueOf(SendState.class, value);
    }
    
    private static final /* synthetic */ SendState[] $values() {
        return new SendState[] { SendState.SENDING, SendState.CONFIRMED, SendState.FAILED };
    }
    
    static {
        $VALUES = $values();
    }
}
