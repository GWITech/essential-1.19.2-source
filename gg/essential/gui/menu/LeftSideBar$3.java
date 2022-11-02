package gg.essential.gui.menu;

import kotlin.jvm.functions.*;
import gg.essential.gui.common.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.effects.*;
import kotlin.collections.*;
import java.awt.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "Lgg/essential/gui/common/MenuButton$Style;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke" })
static final class LeftSideBar$3 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, MenuButton.Style> {
    public static final LeftSideBar$3 INSTANCE;
    
    LeftSideBar$3() {
        super(1);
    }
    
    @NotNull
    public final MenuButton.Style invoke(@NotNull final Pair<Boolean, Boolean> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final boolean compact = (boolean)pair.component1();
        final boolean fakeSale = (boolean)pair.component2();
        final MenuButton.Style baseStyle = fakeSale ? MenuButton.Companion.getGREEN() : MenuButton.Companion.getLIGHT_RED();
        return (MenuButton.Style)(compact ? baseStyle : MenuButton.Style.copy$default$562a9903(baseStyle, null, null, null, SetsKt.setOf((Object[])new OutlineEffect.Side[] { OutlineEffect.Side.Top, OutlineEffect.Side.Left, OutlineEffect.Side.Right }), 7));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair<Boolean, Boolean>)p1);
    }
    
    static {
        INSTANCE = new Function1<Pair<? extends Boolean, ? extends Boolean>, MenuButton.Style>() {
            public static final LeftSideBar$3 INSTANCE;
            
            LeftSideBar$3() {
                super(1);
            }
            
            @NotNull
            public final MenuButton.Style invoke(@NotNull final Pair<Boolean, Boolean> pair) {
                Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
                final boolean compact = (boolean)pair.component1();
                final boolean fakeSale = (boolean)pair.component2();
                final MenuButton.Style baseStyle = fakeSale ? MenuButton.Companion.getGREEN() : MenuButton.Companion.getLIGHT_RED();
                return (MenuButton.Style)(compact ? baseStyle : MenuButton.Style.copy$default$562a9903(baseStyle, null, null, null, SetsKt.setOf((Object[])new OutlineEffect.Side[] { OutlineEffect.Side.Top, OutlineEffect.Side.Left, OutlineEffect.Side.Right }), 7));
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((Pair<Boolean, Boolean>)p1);
            }
        };
    }
}