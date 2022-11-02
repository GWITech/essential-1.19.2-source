package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.*;
import java.awt.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "Lgg/essential/gui/common/MenuButton$Style;", "it", "invoke" })
static final class MenuButton$1 extends Lambda implements Function1<Style, Style> {
    public static final MenuButton$1 INSTANCE;
    
    MenuButton$1() {
        super(1);
    }
    
    @NotNull
    public final Style invoke(@NotNull final Style it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return Style.copy$default$562a9903(it, EssentialPalette.TEXT_DISABLED, null, null, null, 14);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Style)p1);
    }
    
    static {
        INSTANCE = new Function1<Style, Style>() {
            public static final MenuButton$1 INSTANCE;
            
            MenuButton$1() {
                super(1);
            }
            
            @NotNull
            public final Style invoke(@NotNull final Style it) {
                Intrinsics.checkNotNullParameter((Object)it, "it");
                return Style.copy$default$562a9903(it, EssentialPalette.TEXT_DISABLED, null, null, null, 14);
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((Style)p1);
            }
        };
    }
}