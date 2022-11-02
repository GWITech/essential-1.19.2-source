package gg.essential.gui.screenshot.providers;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.screenshot.downsampling.*;
import gg.essential.image.imagescaling.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lgg/essential/gui/screenshot/downsampling/PixelBuffer;", "invoke" })
static final class PostProcessWindowedImageProvider$Companion$bicubicFilter$1 extends Lambda implements Function1<PixelBuffer, PixelBuffer> {
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ int $maxHeight;
    
    PostProcessWindowedImageProvider$Companion$bicubicFilter$1(final int $maxWidth, final int $maxHeight) {
        this.$maxWidth = $maxWidth;
        this.$maxHeight = $maxHeight;
        super(1);
    }
    
    @NotNull
    public final PixelBuffer invoke(@NotNull final PixelBuffer $this$null) {
        Intrinsics.checkNotNullParameter((Object)$this$null, "$this$null");
        PixelBuffer filter;
        if ($this$null instanceof ErrorImage) {
            $this$null.retain();
            filter = $this$null;
        }
        else {
            final DimensionConstrain dimension = DimensionConstrain.createMaxDimension(this.$maxWidth, this.$maxHeight).coerceAtLeast$75da2f87();
            final ResampleOp resampleOp = new ResampleOp(dimension);
            resampleOp.setFilter(ResampleFilters.getBiCubicFilter());
            Intrinsics.checkNotNullExpressionValue((Object)(filter = resampleOp.filter($this$null)), """
                                                                                                     {
                                                                                                                     val di\u2026ilter(this)
                                                                                                                 }""");
        }
        return filter;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((PixelBuffer)p1);
    }
}