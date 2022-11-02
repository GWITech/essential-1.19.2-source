package gg.essential.vigilance.gui.common;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.vigilance.gui.*;
import gg.essential.elementa.effects.*;
import java.util.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import gg.essential.universal.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.utils.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e" }, d2 = { "Lgg/essential/vigilance/gui/common/EssentialTooltip;", "Lgg/essential/vigilance/gui/common/Tooltip;", "logicalParent", "Lgg/essential/elementa/UIComponent;", "belowComponent", "", "notchSize", "", "notchBoundToParent", "(Lgg/essential/elementa/UIComponent;ZIZ)V", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "Vigilance" })
public final class EssentialTooltip extends Tooltip
{
    @NotNull
    private final UIComponent logicalParent;
    private final boolean belowComponent;
    private final int notchSize;
    private final boolean notchBoundToParent;
    
    public EssentialTooltip(@NotNull final UIComponent logicalParent, final boolean belowComponent, final int notchSize, final boolean notchBoundToParent) {
        Intrinsics.checkNotNullParameter((Object)logicalParent, "logicalParent");
        super(logicalParent);
        this.logicalParent = logicalParent;
        this.belowComponent = belowComponent;
        this.notchSize = notchSize;
        this.notchBoundToParent = notchBoundToParent;
        this.getTextColorState().set(VigilancePalette.INSTANCE.getText());
        ComponentsKt.effect((UIComponent)this, new OutlineEffect(VigilancePalette.INSTANCE.getComponentBorderDark(), 1.0f, false, false, null, 28, null));
        final UIComponent $this$constrain$iv = this;
        final int $i$f$constrain = 0;
        final UIComponent $this$constrain_u24lambda_u2d0$iv = $this$constrain$iv;
        final int n = 0;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        final int n2 = 0;
        $this$_init__u24lambda_u2d0.setWidth(ConstraintsKt.plus(new ChildBasedMaxSizeConstraint(), UtilitiesKt.getPixels(6)));
        $this$_init__u24lambda_u2d0.setHeight(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(4)));
    }
    
    public EssentialTooltip(final UIComponent logicalParent, final boolean belowComponent, int notchSize, boolean notchBoundToParent, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x4) != 0x0) {
            notchSize = 3;
        }
        if ((n & 0x8) != 0x0) {
            notchBoundToParent = false;
        }
        this(logicalParent, belowComponent, notchSize, notchBoundToParent);
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        super.beforeDraw(matrixStack);
        UIBlock.Companion.drawBlock(matrixStack, VigilancePalette.INSTANCE.getComponentBackground(), this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
        super.draw(matrixStack);
        final double center = ExtensionsKt.roundToRealPixels(this.notchBoundToParent ? ((this.logicalParent.getLeft() + this.logicalParent.getRight()) / 2.0) : ((this.getContent().getLeft() + this.getContent().getRight()) / 2.0));
        if (this.belowComponent) {
            final double top = this.getTop() + (double)1;
            int n = 1;
            final int notchSize = this.notchSize;
            if (n <= notchSize) {
                int i;
                do {
                    i = n;
                    ++n;
                    UIBlock.Companion.drawBlock(matrixStack, VigilancePalette.INSTANCE.getComponentBorderDark(), center - (this.notchSize - i) - 0.5, top - 2 - i, center + (this.notchSize - i) + 0.5, top - i - 1);
                } while (i != notchSize);
            }
            int n2 = 1;
            final int notchSize2 = this.notchSize;
            if (n2 <= notchSize2) {
                int i;
                do {
                    i = n2;
                    ++n2;
                    UIBlock.Companion.drawBlock(matrixStack, VigilancePalette.INSTANCE.getComponentBackground(), center - (this.notchSize - i) - 0.5, top - 1 - i, center + (this.notchSize - i) + 0.5, top - i);
                } while (i != notchSize2);
            }
        }
        else {
            final double bottom = this.getBottom() - (double)1;
            int n3 = 1;
            final int notchSize3 = this.notchSize;
            if (n3 <= notchSize3) {
                int i;
                do {
                    i = n3;
                    ++n3;
                    UIBlock.Companion.drawBlock(matrixStack, VigilancePalette.INSTANCE.getComponentBorderDark(), center - (this.notchSize - i) - 0.5, bottom + i, center + (this.notchSize - i) + 0.5, bottom + i + 2);
                } while (i != notchSize3);
            }
            int n4 = 1;
            final int notchSize4 = this.notchSize;
            if (n4 <= notchSize4) {
                int i;
                do {
                    i = n4;
                    ++n4;
                    UIBlock.Companion.drawBlock(matrixStack, VigilancePalette.INSTANCE.getComponentBackground(), center - (this.notchSize - i) - 0.5, bottom + i, center + (this.notchSize - i) + 0.5, bottom + i + 1);
                } while (i != notchSize4);
            }
        }
    }
}
