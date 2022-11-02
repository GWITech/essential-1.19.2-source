package gg.essential.gui.menu;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\f\u0012
                                                    \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00010\u0003H
                                                   ¢\u0006\u0004\b\u0005\u0010\u0006""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Integer;" })
static final class RightSideBar$messageCount$1 extends Lambda implements Function1<Pair<? extends Integer, ? extends Integer>, Integer> {
    public static final RightSideBar$messageCount$1 INSTANCE;
    
    RightSideBar$messageCount$1() {
        super(1);
    }
    
    @NotNull
    public final Integer invoke(@NotNull final Pair<Integer, Integer> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final Integer messages = (Integer)pair.component1();
        final int friends = ((Number)pair.component2()).intValue();
        return messages + friends;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        RightSideBar$messageCount$1.INSTANCE = new RightSideBar$messageCount$1();
    }
}