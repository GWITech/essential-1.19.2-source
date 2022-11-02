package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import java.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001e\u0010\u0003\u001a\u001a\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke" })
static final class CosmeticStudio$cartItems$1 extends Lambda implements Function1<Pair<? extends Set<? extends String>, ? extends Set<? extends String>>, Set<? extends String>> {
    public static final CosmeticStudio$cartItems$1 INSTANCE;
    
    CosmeticStudio$cartItems$1() {
        super(1);
    }
    
    @NotNull
    public final Set<String> invoke(@NotNull final Pair<? extends Set<String>, ? extends Set<String>> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final Set explicit = (Set)pair.component1();
        final Set implicit = (Set)pair.component2();
        return SetsKt.plus(explicit, (Iterable)implicit);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        CosmeticStudio$cartItems$1.INSTANCE = new CosmeticStudio$cartItems$1();
    }
}