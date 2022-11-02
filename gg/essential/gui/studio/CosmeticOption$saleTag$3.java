package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.gui.state.*;
import java.time.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class CosmeticOption$saleTag$3 extends Lambda implements Function0<String> {
    final /* synthetic */ CosmeticOption this$0;
    
    CosmeticOption$saleTag$3(final CosmeticOption $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final String invoke() {
        final Sale sale = CosmeticOption.access$getActiveSale$p(this.this$0).get();
        Instant expiration;
        Instant now;
        if (sale == null || (now = (expiration = sale.getExpiration())) == null) {
            expiration = (now = Instant.now());
        }
        Intrinsics.checkNotNullExpressionValue((Object)now, "activeSale.get()?.expiration ?: Instant.now()");
        return "Sale Ends In: " + ExtensionsKt.toCosmeticOptionTime(expiration);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}