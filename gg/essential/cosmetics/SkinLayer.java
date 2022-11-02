package gg.essential.cosmetics;

public enum SkinLayer
{
    CAPE, 
    JACKET, 
    LEFT_SLEEVE, 
    RIGHT_SLEEVE, 
    LEFT_PANTS_LEG, 
    RIGHT_PANTS_LEG, 
    HAT;
    
    private static final /* synthetic */ SkinLayer[] $VALUES;
    
    public static SkinLayer[] values() {
        return SkinLayer.$VALUES.clone();
    }
    
    public static SkinLayer valueOf(final String name) {
        return Enum.valueOf(SkinLayer.class, name);
    }
    
    private static /* synthetic */ SkinLayer[] $values() {
        return new SkinLayer[] { SkinLayer.CAPE, SkinLayer.JACKET, SkinLayer.LEFT_SLEEVE, SkinLayer.RIGHT_SLEEVE, SkinLayer.LEFT_PANTS_LEG, SkinLayer.RIGHT_PANTS_LEG, SkinLayer.HAT };
    }
    
    static {
        $VALUES = $values();
    }
}
