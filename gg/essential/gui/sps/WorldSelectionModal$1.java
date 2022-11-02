package gg.essential.gui.sps;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/sps/WorldSelectionModal$WorldEntry;", "invoke", "(Lgg/essential/gui/sps/WorldSelectionModal$WorldEntry;)Ljava/lang/Boolean;" })
static final class WorldSelectionModal$1 extends Lambda implements Function1<WorldEntry, Boolean> {
    public static final WorldSelectionModal$1 INSTANCE;
    
    WorldSelectionModal$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@Nullable final WorldEntry it) {
        return it != null;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((WorldEntry)p1);
    }
    
    static {
        INSTANCE = new Function1<WorldEntry, Boolean>() {
            public static final WorldSelectionModal$1 INSTANCE;
            
            WorldSelectionModal$1() {
                super(1);
            }
            
            @NotNull
            public final Boolean invoke(@Nullable final WorldEntry it) {
                return it != null;
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((WorldEntry)p1);
            }
        };
    }
}