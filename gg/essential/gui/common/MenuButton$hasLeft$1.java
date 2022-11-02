package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.effects.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/common/MenuButton$Style;", "invoke", "(Lgg/essential/gui/common/MenuButton$Style;)Ljava/lang/Boolean;" })
static final class MenuButton$hasLeft$1 extends Lambda implements Function1<Style, Boolean> {
    public static final MenuButton$hasLeft$1 INSTANCE;
    
    MenuButton$hasLeft$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Style it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it.getSides().contains(OutlineEffect.Side.Left);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Style)p1);
    }
    
    static {
        MenuButton$hasLeft$1.INSTANCE = new MenuButton$hasLeft$1();
    }
}