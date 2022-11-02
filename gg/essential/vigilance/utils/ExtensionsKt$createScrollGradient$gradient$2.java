package gg.essential.vigilance.utils;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import kotlin.ranges.*;
import gg.essential.elementa.utils.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "it", "", "invoke" })
static final class ExtensionsKt$createScrollGradient$gradient$2 extends Lambda implements Function1<Float, Color> {
    final /* synthetic */ boolean $top;
    final /* synthetic */ Color $color;
    final /* synthetic */ int $maxGradient;
    
    ExtensionsKt$createScrollGradient$gradient$2(final boolean $top, final Color $color, final int $maxGradient) {
        this.$top = $top;
        this.$color = $color;
        this.$maxGradient = $maxGradient;
        super(1);
    }
    
    @NotNull
    public final Color invoke(final float it) {
        return this.$top ? gg.essential.elementa.utils.ExtensionsKt.withAlpha(this.$color, RangesKt.coerceIn((int)(it * 1000), (ClosedRange)new IntRange(0, this.$maxGradient))) : gg.essential.elementa.utils.ExtensionsKt.withAlpha(this.$color, 0);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(((Number)p1).floatValue());
    }
}