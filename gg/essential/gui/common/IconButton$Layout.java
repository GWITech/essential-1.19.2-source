package gg.essential.gui.common;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/common/IconButton$Layout;", "", "(Ljava/lang/String;I)V", "ICON_FIRST", "TEXT_FIRST", "essential" })
public enum Layout
{
    ICON_FIRST("ICON_FIRST", 0), 
    TEXT_FIRST("TEXT_FIRST", 1);
    
    private static final /* synthetic */ Layout[] $VALUES;
    
    private Layout(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static Layout[] values() {
        return Layout.$VALUES.clone();
    }
    
    public static Layout valueOf(final String value) {
        return Enum.valueOf(Layout.class, value);
    }
    
    private static final /* synthetic */ Layout[] $values() {
        return new Layout[] { Layout.ICON_FIRST, Layout.TEXT_FIRST };
    }
    
    static {
        $VALUES = $values();
    }
}
