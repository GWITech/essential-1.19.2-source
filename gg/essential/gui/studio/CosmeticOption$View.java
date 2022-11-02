package gg.essential.gui.studio;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/studio/CosmeticOption$View;", "", "(Ljava/lang/String;I)V", "Grid", "Cart", "essential" })
public enum View
{
    Grid("Grid", 0), 
    Cart("Cart", 1);
    
    private static final /* synthetic */ View[] $VALUES;
    
    private View(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static View[] values() {
        return View.$VALUES.clone();
    }
    
    public static View valueOf(final String value) {
        return Enum.valueOf(View.class, value);
    }
    
    private static final /* synthetic */ View[] $values() {
        return new View[] { View.Grid, View.Cart };
    }
    
    static {
        $VALUES = $values();
    }
}
