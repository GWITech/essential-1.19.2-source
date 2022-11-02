package gg.essential.mod.cosmetics;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lgg/essential/mod/cosmetics/SkinLayer;", "", "(Ljava/lang/String;I)V", "CAPE", "JACKET", "LEFT_SLEEVE", "RIGHT_SLEEVE", "LEFT_PANTS_LEG", "RIGHT_PANTS_LEG", "HAT", "cosmetics" })
public enum SkinLayer
{
    CAPE("CAPE", 0), 
    JACKET("JACKET", 1), 
    LEFT_SLEEVE("LEFT_SLEEVE", 2), 
    RIGHT_SLEEVE("RIGHT_SLEEVE", 3), 
    LEFT_PANTS_LEG("LEFT_PANTS_LEG", 4), 
    RIGHT_PANTS_LEG("RIGHT_PANTS_LEG", 5), 
    HAT("HAT", 6);
    
    private static final /* synthetic */ SkinLayer[] $VALUES;
    
    private SkinLayer(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static SkinLayer[] values() {
        return SkinLayer.$VALUES.clone();
    }
    
    public static SkinLayer valueOf(final String value) {
        return Enum.valueOf(SkinLayer.class, value);
    }
    
    private static final /* synthetic */ SkinLayer[] $values() {
        return new SkinLayer[] { SkinLayer.CAPE, SkinLayer.JACKET, SkinLayer.LEFT_SLEEVE, SkinLayer.RIGHT_SLEEVE, SkinLayer.LEFT_PANTS_LEG, SkinLayer.RIGHT_PANTS_LEG, SkinLayer.HAT };
    }
    
    static {
        $VALUES = $values();
    }
}
