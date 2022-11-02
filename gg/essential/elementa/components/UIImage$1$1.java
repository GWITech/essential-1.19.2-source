package gg.essential.elementa.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.universal.utils.*;
import gg.essential.elementa.components.image.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" })
static final class UIImage$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ReleasedDynamicTexture $texture;
    final /* synthetic */ UIImage this$0;
    
    UIImage$1$1(final ReleasedDynamicTexture $texture, final UIImage $receiver) {
        this.$texture = $texture;
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        final ReleasedDynamicTexture $texture = this.$texture;
        if ($texture != null) {
            $texture.uploadTexture();
        }
        UIImage.access$setTexture$p(this.this$0, this.$texture);
        while (!UIImage.access$getWaiting$p(this.this$0).isEmpty()) {
            UIImage.access$getWaiting$p(this.this$0).poll().applyTexture(this.$texture);
        }
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}