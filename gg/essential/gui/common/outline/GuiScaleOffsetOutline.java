package gg.essential.gui.common.outline;

import kotlin.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.effects.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00008
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0017""" }, d2 = { "Lgg/essential/gui/common/outline/GuiScaleOffsetOutline;", "Lgg/essential/elementa/effects/Effect;", "offset", "", "color", "Ljava/awt/Color;", "(FLjava/awt/Color;)V", "Lgg/essential/elementa/state/State;", "(FLgg/essential/elementa/state/State;)V", "getColor", "()Lgg/essential/elementa/state/State;", "getOffset", "()F", "outline", "Lgg/essential/elementa/effects/OutlineEffect;", "width", "Lgg/essential/elementa/state/BasicState;", "afterDraw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "beforeChildrenDraw", "updateOutline", "essential" })
public final class GuiScaleOffsetOutline extends Effect
{
    @NotNull
    private final State<Color> color;
    @NotNull
    private final BasicState<Float> width;
    @NotNull
    private final OutlineEffect outline;
    
    public GuiScaleOffsetOutline(@NotNull final State<Color> color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        super();
        this.color = color;
        this.width = new BasicState<Float>(1.0f);
        this.outline = new OutlineEffect(this.color, this.width, false, false, null, 28, null);
    }
    
    private final void updateOutline() {
        this.outline.bindComponent(this.getBoundComponent());
        final double scaleFactor = UResolution.getScaleFactor();
        this.width.set((float)(RangesKt.coerceAtLeast(scaleFactor - 1.0, 1.0) / scaleFactor));
    }
    
    @Override
    public void beforeChildrenDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.updateOutline();
        this.outline.beforeChildrenDraw(matrixStack);
    }
    
    @Override
    public void afterDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.outline.afterDraw(matrixStack);
    }
}
