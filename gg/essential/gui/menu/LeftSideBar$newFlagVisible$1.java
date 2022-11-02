package gg.essential.gui.menu;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00030\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;" })
static final class LeftSideBar$newFlagVisible$1 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Pair<? extends Boolean, ? extends Boolean>>, Boolean> {
    public static final LeftSideBar$newFlagVisible$1 INSTANCE;
    
    LeftSideBar$newFlagVisible$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Pair<Boolean, Pair<Boolean, Boolean>> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final boolean sale = (boolean)pair.component1();
        final Pair menuSize = (Pair)pair.component2();
        final boolean isCollapsed = (boolean)menuSize.component1();
        final boolean compact = (boolean)menuSize.component2();
        return !sale || (!isCollapsed && !compact);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        LeftSideBar$newFlagVisible$1.INSTANCE = new LeftSideBar$newFlagVisible$1();
    }
}