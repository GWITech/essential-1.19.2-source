package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012 \u0010\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke" })
static final class MenuButton$textState$1 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Pair<? extends String, ? extends String>>, String> {
    public static final MenuButton$textState$1 INSTANCE;
    
    MenuButton$textState$1() {
        super(1);
    }
    
    @Nullable
    public final String invoke(@NotNull final Pair<Boolean, Pair<String, String>> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final boolean collapsed = (boolean)pair.component1();
        final Pair texts = (Pair)pair.component2();
        final String regularText = (String)texts.component1();
        final String collapsedText = (String)texts.component2();
        return collapsed ? collapsedText : regularText;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        MenuButton$textState$1.INSTANCE = new MenuButton$textState$1();
    }
}