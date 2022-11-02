package gg.essential.gui.studio;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b
                                                   \b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b	j\u0002\b
                                                   j\u0002\b\u000b¨\u0006""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$SortOption;", "", "displayName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "CUSTOM_COLLECTION", "RELEASE_DATE", "NAME", "PRICE", "IS_PURCHASED", "Companion", "essential" })
public enum SortOption
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String displayName;
    
    CUSTOM_COLLECTION("CUSTOM_COLLECTION", 0, "Featured"), 
    RELEASE_DATE("RELEASE_DATE", 1, "Release"), 
    NAME("NAME", 2, "Name"), 
    PRICE("PRICE", 3, "Price"), 
    IS_PURCHASED("IS_PURCHASED", 4, "Owned");
    
    private static final /* synthetic */ SortOption[] $VALUES;
    
    private SortOption(final String $enum$name, final int $enum$ordinal, final String displayName) {
        this.displayName = displayName;
    }
    
    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public static SortOption[] values() {
        return SortOption.$VALUES.clone();
    }
    
    public static SortOption valueOf(final String value) {
        return Enum.valueOf(SortOption.class, value);
    }
    
    private static final /* synthetic */ SortOption[] $values() {
        return new SortOption[] { SortOption.CUSTOM_COLLECTION, SortOption.RELEASE_DATE, SortOption.NAME, SortOption.PRICE, SortOption.IS_PURCHASED };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0018
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$SortOption$Companion;", "", "()V", "fromIndex", "Lgg/essential/gui/studio/CosmeticStudio$SortOption;", "index", "", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final SortOption fromIndex(final int index) {
            return SortOption.values()[index];
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
