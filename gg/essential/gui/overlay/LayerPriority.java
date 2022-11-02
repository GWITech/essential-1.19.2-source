package gg.essential.gui.overlay;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006	""" }, d2 = { "Lgg/essential/gui/overlay/LayerPriority;", "", "(Ljava/lang/String;I)V", "BelowScreenContent", "AboveScreenContent", "AboveScreen", "Modal", "Notifications", "Highest", "essential" })
public enum LayerPriority
{
    BelowScreenContent("BelowScreenContent", 0), 
    AboveScreenContent("AboveScreenContent", 1), 
    AboveScreen("AboveScreen", 2), 
    Modal("Modal", 3), 
    Notifications("Notifications", 4), 
    Highest("Highest", 5);
    
    private static final /* synthetic */ LayerPriority[] $VALUES;
    
    private LayerPriority(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static LayerPriority[] values() {
        return LayerPriority.$VALUES.clone();
    }
    
    public static LayerPriority valueOf(final String value) {
        return Enum.valueOf(LayerPriority.class, value);
    }
    
    private static final /* synthetic */ LayerPriority[] $values() {
        return new LayerPriority[] { LayerPriority.BelowScreenContent, LayerPriority.AboveScreenContent, LayerPriority.AboveScreen, LayerPriority.Modal, LayerPriority.Notifications, LayerPriority.Highest };
    }
    
    static {
        $VALUES = $values();
    }
}
