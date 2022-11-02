package gg.essential.universal;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class UScreen$onDrawScreenCompat$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ UScreen this$0;
    final /* synthetic */ int $mouseX;
    final /* synthetic */ int $mouseY;
    final /* synthetic */ float $partialTicks;
    
    UScreen$onDrawScreenCompat$1(final UScreen $receiver, final int $mouseX, final int $mouseY, final float $partialTicks) {
        this.this$0 = $receiver;
        this.$mouseX = $mouseX;
        this.$mouseY = $mouseY;
        this.$partialTicks = $partialTicks;
        super(0);
    }
    
    public final void invoke() {
        this.this$0.onDrawScreen(this.$mouseX, this.$mouseY, this.$partialTicks);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}