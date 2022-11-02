package gg.essential.elementa.components.image;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import java.awt.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" })
static final class ImageProvider$drawImageCompat$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ImageProvider this$0;
    final /* synthetic */ double $x;
    final /* synthetic */ double $y;
    final /* synthetic */ double $width;
    final /* synthetic */ double $height;
    final /* synthetic */ Color $color;
    
    ImageProvider$drawImageCompat$1(final ImageProvider $receiver, final double $x, final double $y, final double $width, final double $height, final Color $color) {
        this.this$0 = $receiver;
        this.$x = $x;
        this.$y = $y;
        this.$width = $width;
        this.$height = $height;
        this.$color = $color;
        super(0);
    }
    
    public final void invoke() {
        this.this$0.drawImage(this.$x, this.$y, this.$width, this.$height, this.$color);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}