package gg.essential.gui.menu.compact;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.handlers.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/UIComponent;", "invoke", "(Lgg/essential/elementa/UIComponent;)Ljava/lang/Float;" })
static final class CompactAccountSwitcher$accountScroller$2$1 extends Lambda implements Function1<UIComponent, Float> {
    public static final CompactAccountSwitcher$accountScroller$2$1 INSTANCE;
    
    CompactAccountSwitcher$accountScroller$2$1() {
        super(1);
    }
    
    @NotNull
    public final Float invoke(@NotNull final UIComponent it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return 19.0f * (float)Math.floor((PauseMenuDisplay.Companion.getWindow().getWidth() - 65.0f) / 19.0f);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIComponent)p1);
    }
    
    static {
        CompactAccountSwitcher$accountScroller$2$1.INSTANCE = new CompactAccountSwitcher$accountScroller$2$1();
    }
}