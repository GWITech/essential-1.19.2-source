package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00030\u00030\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "Lgg/essential/gui/common/MenuButton$Style;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke" })
static final class MenuButton$styleState$1 extends Lambda implements Function1<Pair<? extends Pair<? extends Boolean, ? extends Boolean>, ? extends Pair<? extends Style, ? extends Pair<? extends Style, ? extends Style>>>, Style> {
    public static final MenuButton$styleState$1 INSTANCE;
    
    MenuButton$styleState$1() {
        super(1);
    }
    
    @NotNull
    public final Style invoke(@NotNull final Pair<Pair<Boolean, Boolean>, Pair<Style, Pair<Style, Style>>> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final Pair hoveredEnabled = (Pair)pair.component1();
        final Pair styles = (Pair)pair.component2();
        final boolean hovered = (boolean)hoveredEnabled.component1();
        final boolean enabled = (boolean)hoveredEnabled.component2();
        final Style standardStyle = (Style)styles.component1();
        final Pair hoveredDisableStyles = (Pair)styles.component2();
        final Style hoveredStyle = (Style)hoveredDisableStyles.component1();
        final Style disabledStyleState = (Style)hoveredDisableStyles.component2();
        return enabled ? (hovered ? hoveredStyle : standardStyle) : disabledStyleState;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        MenuButton$styleState$1.INSTANCE = new MenuButton$styleState$1();
    }
}