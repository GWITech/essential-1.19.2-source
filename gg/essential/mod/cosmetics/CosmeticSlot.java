package gg.essential.mod.cosmetics;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012" }, d2 = { "Lgg/essential/mod/cosmetics/CosmeticSlot;", "", "(Ljava/lang/String;I)V", "BACK", "EARS", "FACE", "FULL_BODY", "HAT", "PET", "TAIL", "ARMS", "SHOULDERS", "SUITS", "SHOES", "PANTS", "WINGS", "EFFECT", "CAPE", "cosmetics" })
public enum CosmeticSlot
{
    BACK("BACK", 0), 
    EARS("EARS", 1), 
    FACE("FACE", 2), 
    FULL_BODY("FULL_BODY", 3), 
    HAT("HAT", 4), 
    PET("PET", 5), 
    TAIL("TAIL", 6), 
    ARMS("ARMS", 7), 
    SHOULDERS("SHOULDERS", 8), 
    SUITS("SUITS", 9), 
    SHOES("SHOES", 10), 
    PANTS("PANTS", 11), 
    WINGS("WINGS", 12), 
    EFFECT("EFFECT", 13), 
    CAPE("CAPE", 14);
    
    private static final /* synthetic */ CosmeticSlot[] $VALUES;
    
    private CosmeticSlot(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static CosmeticSlot[] values() {
        return CosmeticSlot.$VALUES.clone();
    }
    
    public static CosmeticSlot valueOf(final String value) {
        return Enum.valueOf(CosmeticSlot.class, value);
    }
    
    private static final /* synthetic */ CosmeticSlot[] $values() {
        return new CosmeticSlot[] { CosmeticSlot.BACK, CosmeticSlot.EARS, CosmeticSlot.FACE, CosmeticSlot.FULL_BODY, CosmeticSlot.HAT, CosmeticSlot.PET, CosmeticSlot.TAIL, CosmeticSlot.ARMS, CosmeticSlot.SHOULDERS, CosmeticSlot.SUITS, CosmeticSlot.SHOES, CosmeticSlot.PANTS, CosmeticSlot.WINGS, CosmeticSlot.EFFECT, CosmeticSlot.CAPE };
    }
    
    static {
        $VALUES = $values();
    }
}
