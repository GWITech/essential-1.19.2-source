package gg.essential.cosmetics;

import kotlin.*;
import gg.essential.network.cosmetics.*;
import gg.essential.mod.cosmetics.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u000e" }, d2 = { "Lgg/essential/cosmetics/CosmeticsState$Companion;", "", "()V", "BODY_PART_MAP", "", "", "", "Lgg/essential/model/EnumPart;", "EMPTY", "Lgg/essential/cosmetics/CosmeticsState;", "isAffectedByExclusions", "", "Lgg/essential/network/cosmetics/Cosmetic;", "(Lgg/essential/network/cosmetics/Cosmetic;)Z", "cosmetics" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    private final boolean isAffectedByExclusions(final Cosmetic $this$isAffectedByExclusions) {
        return switch (WhenMappings.$EnumSwitchMapping$0[$this$isAffectedByExclusions.getType().getSlot().ordinal()]) {
            case 1,  2 -> true;
            default -> false;
        };
    }
    
    public static final /* synthetic */ boolean access$isAffectedByExclusions(final Companion $this, final Cosmetic $receiver) {
        return $this.isAffectedByExclusions($receiver);
    }
    
    public Companion(final byte b) {
        this();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[CosmeticSlot.values().length];
            $EnumSwitchMapping$[CosmeticSlot.FULL_BODY.ordinal()] = 1;
            $EnumSwitchMapping$[CosmeticSlot.SUITS.ordinal()] = 2;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
