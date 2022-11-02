package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import gg.essential.gui.state.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lgg/essential/gui/studio/CosmeticOption$View;", "Lgg/essential/gui/state/Sale;", "invoke" })
static final class CosmeticOption$priceTextState$1 extends Lambda implements Function1<Pair<? extends View, ? extends Sale>, String> {
    final /* synthetic */ CosmeticOption this$0;
    
    CosmeticOption$priceTextState$1(final CosmeticOption $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final String invoke(@NotNull final Pair<? extends View, Sale> pair) {
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final View view = (View)pair.component1();
        final Sale saleActive = (Sale)pair.component2();
        final boolean cart = view == View.Cart;
        final String priceSeparator = cart ? "§r " : "§r\n";
        String format;
        if (Intrinsics.areEqual(this.this$0.getCosmetic().getPrice("USD"), 0.0)) {
            format = "FREE";
        }
        else {
            final Double price = this.this$0.getCosmetic().getPrice("USD");
            if (saleActive == null) {
                format = "§r$" + price;
            }
            else {
                final String format2 = "§r§8§m$" + price + priceSeparator + "$%.2f";
                final Object[] original = { null };
                final int n = 0;
                final Double n2 = price;
                original[n] = ((n2 != null) ? Double.valueOf(n2 * ((100 - saleActive.getDiscountPercent()) / 100.0)) : null);
                Intrinsics.checkNotNullExpressionValue((Object)(format = String.format(format2, Arrays.copyOf(original, 1))), "format(this, *args)");
            }
        }
        return format;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
}