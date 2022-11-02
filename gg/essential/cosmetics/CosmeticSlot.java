package gg.essential.cosmetics;

public enum CosmeticSlot
{
    BACK, 
    EARS, 
    FACE, 
    FULL_BODY, 
    HAT, 
    PET, 
    TAIL, 
    ARMS, 
    SHOULDERS, 
    SUITS, 
    SHOES, 
    PANTS, 
    WINGS, 
    EFFECT, 
    CAPE;
    
    private static final /* synthetic */ CosmeticSlot[] $VALUES;
    
    public static CosmeticSlot[] values() {
        return CosmeticSlot.$VALUES.clone();
    }
    
    public static CosmeticSlot valueOf(final String name) {
        return Enum.valueOf(CosmeticSlot.class, name);
    }
    
    private static /* synthetic */ CosmeticSlot[] $values() {
        return new CosmeticSlot[] { CosmeticSlot.BACK, CosmeticSlot.EARS, CosmeticSlot.FACE, CosmeticSlot.FULL_BODY, CosmeticSlot.HAT, CosmeticSlot.PET, CosmeticSlot.TAIL, CosmeticSlot.ARMS, CosmeticSlot.SHOULDERS, CosmeticSlot.SUITS, CosmeticSlot.SHOES, CosmeticSlot.PANTS, CosmeticSlot.WINGS, CosmeticSlot.EFFECT, CosmeticSlot.CAPE };
    }
    
    static {
        $VALUES = $values();
    }
}
