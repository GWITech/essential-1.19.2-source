package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.util.*;
import java.time.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class CosmeticOption$timerTooltip$1 extends Lambda implements Function0<String> {
    final /* synthetic */ CosmeticOption this$0;
    
    CosmeticOption$timerTooltip$1(final CosmeticOption $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final String invoke() {
        String cosmeticOptionTime;
        if (this.this$0.getCosmetic().isAvailable()) {
            final Instant availableUntil = this.this$0.getCosmetic().getAvailableUntil();
            if (availableUntil == null || (cosmeticOptionTime = ExtensionsKt.toCosmeticOptionTime(availableUntil)) == null) {
                cosmeticOptionTime = "This cosmetic has no expiry time.";
            }
        }
        else {
            cosmeticOptionTime = "";
        }
        return cosmeticOptionTime;
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}