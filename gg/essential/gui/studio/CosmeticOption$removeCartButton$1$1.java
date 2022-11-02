package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import java.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "", "it", "invoke" })
static final class CosmeticOption$removeCartButton$1$1 extends Lambda implements Function1<Set<? extends String>, Set<? extends String>> {
    final /* synthetic */ CosmeticOption this$0;
    
    CosmeticOption$removeCartButton$1$1(final CosmeticOption $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Set<String> invoke(@NotNull final Set<String> it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return SetsKt.minus((Set)it, (Object)this.this$0.getCosmetic().getId());
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Set)p1);
    }
}