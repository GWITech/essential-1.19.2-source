package gg.essential.gui.sps;

import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "it", "Lkotlin/Pair;", "", "invoke" })
static final class WorldSelectionModal$WorldEntry$2 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Color> {
    public static final WorldSelectionModal$WorldEntry$2 INSTANCE;
    
    WorldSelectionModal$WorldEntry$2() {
        super(1);
    }
    
    @NotNull
    public final Color invoke(@NotNull final Pair<Boolean, Boolean> it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final boolean hovered = (boolean)it.component1();
        final boolean selected = (boolean)it.component2();
        return selected ? EssentialPalette.MESSAGE_SENT : (hovered ? EssentialPalette.TEXT : EssentialPalette.MODAL_OUTLINE);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair<Boolean, Boolean>)p1);
    }
    
    static {
        INSTANCE = new Function1<Pair<? extends Boolean, ? extends Boolean>, Color>() {
            public static final WorldSelectionModal$WorldEntry$2 INSTANCE;
            
            WorldSelectionModal$WorldEntry$2() {
                super(1);
            }
            
            @NotNull
            public final Color invoke(@NotNull final Pair<Boolean, Boolean> it) {
                Intrinsics.checkNotNullParameter((Object)it, "it");
                final boolean hovered = (boolean)it.component1();
                final boolean selected = (boolean)it.component2();
                return selected ? EssentialPalette.MESSAGE_SENT : (hovered ? EssentialPalette.TEXT : EssentialPalette.MODAL_OUTLINE);
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((Pair<Boolean, Boolean>)p1);
            }
        };
    }
}