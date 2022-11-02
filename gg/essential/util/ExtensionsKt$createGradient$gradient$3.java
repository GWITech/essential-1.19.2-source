package gg.essential.util;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import gg.essential.elementa.utils.*;
import kotlin.ranges.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000\u0010\u0000\u001a\u00020\u0001"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "T", "Lgg/essential/elementa/UIComponent;", "it", "", "invoke" })
static final class ExtensionsKt$createGradient$gradient$3 extends Lambda implements Function1<Float, Color> {
    final /* synthetic */ boolean $top;
    final /* synthetic */ Color $color;
    final /* synthetic */ int $maxGradient;
    
    ExtensionsKt$createGradient$gradient$3(final boolean $top, final Color $color, final int $maxGradient) {
        this.$top = $top;
        this.$color = $color;
        this.$maxGradient = $maxGradient;
        super(1);
    }
    
    @NotNull
    public final Color invoke(final float it) {
        return this.$top ? gg.essential.elementa.utils.ExtensionsKt.withAlpha(this.$color, 0) : gg.essential.elementa.utils.ExtensionsKt.withAlpha(this.$color, RangesKt.coerceIn((int)((1.0f - it) * 1000.0f), (ClosedRange)new IntRange(0, this.$maxGradient)));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(((Number)p1).floatValue());
    }
}