package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;", "", "invoke" })
static final class ListViewComponent$TabComponent$textColorState$1 extends Lambda implements Function1<Pair<? extends Tab, ? extends Boolean>, Color> {
    final /* synthetic */ ListViewComponent.TabComponent this$0;
    
    ListViewComponent$TabComponent$textColorState$1(final ListViewComponent.TabComponent $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Color invoke(@NotNull final Pair<? extends Tab, Boolean> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final Tab selectedTab = (Tab)pair.component1();
        final boolean hovered = (boolean)pair.component2();
        return (selectedTab == this.this$0.getTab()) ? EssentialPalette.ACCENT_BLUE : (hovered ? EssentialPalette.TEXT_HIGHLIGHT : EssentialPalette.TEXT);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
}