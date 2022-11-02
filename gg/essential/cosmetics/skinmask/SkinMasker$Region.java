package gg.essential.cosmetics.skinmask;

enum Region
{
    TOP, 
    BOTTOM, 
    RIGHT, 
    FRONT, 
    LEFT, 
    BACK, 
    NONE;
    
    private static final /* synthetic */ Region[] $VALUES;
    
    public static Region[] values() {
        return Region.$VALUES.clone();
    }
    
    public static Region valueOf(final String name) {
        return Enum.valueOf(Region.class, name);
    }
    
    private static /* synthetic */ Region[] $values() {
        return new Region[] { Region.TOP, Region.BOTTOM, Region.RIGHT, Region.FRONT, Region.LEFT, Region.BACK, Region.NONE };
    }
    
    static {
        $VALUES = $values();
    }
}
