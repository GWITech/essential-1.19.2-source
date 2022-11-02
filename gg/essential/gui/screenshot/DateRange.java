package gg.essential.gui.screenshot;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b	\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b	¨\u0006
                                                   """ }, d2 = { "Lgg/essential/gui/screenshot/DateRange;", "", "(Ljava/lang/String;I)V", "MONTH_OTHER", "LAST_MONTH", "EARLIER_MONTH", "LAST_WEEK", "EARLIER_WEEK", "YESTERDAY", "TODAY", "essential" })
public enum DateRange
{
    MONTH_OTHER("MONTH_OTHER", 0), 
    LAST_MONTH("LAST_MONTH", 1), 
    EARLIER_MONTH("EARLIER_MONTH", 2), 
    LAST_WEEK("LAST_WEEK", 3), 
    EARLIER_WEEK("EARLIER_WEEK", 4), 
    YESTERDAY("YESTERDAY", 5), 
    TODAY("TODAY", 6);
    
    private static final /* synthetic */ DateRange[] $VALUES;
    
    private DateRange(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static DateRange[] values() {
        return DateRange.$VALUES.clone();
    }
    
    public static DateRange valueOf(final String value) {
        return Enum.valueOf(DateRange.class, value);
    }
    
    private static final /* synthetic */ DateRange[] $values() {
        return new DateRange[] { DateRange.MONTH_OTHER, DateRange.LAST_MONTH, DateRange.EARLIER_MONTH, DateRange.LAST_WEEK, DateRange.EARLIER_WEEK, DateRange.YESTERDAY, DateRange.TODAY };
    }
    
    static {
        $VALUES = $values();
    }
}
