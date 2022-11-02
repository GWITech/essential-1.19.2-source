package gg.essential.gui.studio;

import kotlin.*;
import org.jetbrains.annotations.*;

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
