package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "Lgg/essential/gui/common/MenuButton$Style;", "it", "invoke" })
static final class MenuButton$defaultStyle$1 extends Lambda implements Function1<Style, Style> {
    public static final MenuButton$defaultStyle$1 INSTANCE;
    
    MenuButton$defaultStyle$1() {
        super(1);
    }
    
    @NotNull
    public final Style invoke(@NotNull final Style it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Style)p1);
    }
    
    static {
        MenuButton$defaultStyle$1.INSTANCE = new MenuButton$defaultStyle$1();
    }
}