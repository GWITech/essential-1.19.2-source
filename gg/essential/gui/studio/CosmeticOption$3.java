package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0004\b\u0002\u0010\u0003""" }, d2 = { "<anonymous>", "", "invoke", "()Ljava/lang/Boolean;" })
static final class CosmeticOption$3 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ CosmeticOption this$0;
    
    CosmeticOption$3(final CosmeticOption $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final Boolean invoke() {
        return Intrinsics.areEqual((Object)Essential.getInstance().getConnectionManager().getCosmeticsManager().getEquippedCosmetics().get(CosmeticOption.access$getShopCategory$p(this.this$0)), (Object)this.this$0.getCosmetic().getId());
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}