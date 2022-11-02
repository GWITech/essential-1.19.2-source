package gg.essential.gui.common;

import org.jetbrains.annotations.*;
import gg.essential.gui.*;
import gg.essential.elementa.effects.*;
import java.util.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import gg.essential.universal.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.utils.*;
import kotlin.*;
import java.awt.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020	¢\u0006\u0002\u0010
                                                   J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\b\u001a\u00020	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0010""" }, d2 = { "Lgg/essential/gui/common/EssentialTooltip;", "Lgg/essential/gui/common/Tooltip;", "logicalParent", "Lgg/essential/elementa/UIComponent;", "position", "Lgg/essential/gui/common/EssentialTooltip$Position;", "notchSize", "", "notchBoundToParent", "", "(Lgg/essential/elementa/UIComponent;Lgg/essential/gui/common/EssentialTooltip$Position;IZ)V", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "Position", "essential" })
public final class EssentialTooltip extends Tooltip
{
    @NotNull
    private final UIComponent logicalParent;
    @NotNull
    private final Position position;
    private final int notchSize;
    private final boolean notchBoundToParent;
    
    public EssentialTooltip(@NotNull final UIComponent logicalParent, @NotNull final Position position, final int notchSize, final boolean notchBoundToParent) {
        Intrinsics.checkNotNullParameter((Object)logicalParent, "logicalParent");
        Intrinsics.checkNotNullParameter((Object)position, "position");
        super(logicalParent);
        this.logicalParent = logicalParent;
        this.position = position;
        this.notchSize = notchSize;
        this.notchBoundToParent = notchBoundToParent;
        this.getTextColorState().set(EssentialPalette.TEXT);
        ComponentsKt.effect((UIComponent)this, new OutlineEffect(EssentialPalette.BLACK, 1.0f, false, false, null, 28, null));
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setWidth(ConstraintsKt.plus(new ChildBasedMaxSizeConstraint(), UtilitiesKt.getPixels(8)));
        $this$_init__u24lambda_u2d0.setHeight(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(6)));
    }
    
    public EssentialTooltip(final UIComponent logicalParent, final Position position, int notchSize, boolean notchBoundToParent, final int n) {
        if ((n & 0x4) != 0x0) {
            notchSize = 3;
        }
        if ((n & 0x8) != 0x0) {
            notchBoundToParent = false;
        }
        this(logicalParent, position, notchSize, notchBoundToParent);
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        super.beforeDraw(matrixStack);
        UIBlock.Companion.drawBlock(matrixStack, EssentialPalette.COMPONENT_BACKGROUND, this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
        super.draw(matrixStack);
        final double hCenter = ExtensionsKt.roundToRealPixels(this.notchBoundToParent ? ((this.logicalParent.getLeft() + this.logicalParent.getRight()) / 2.0) : ((this.getContent().getLeft() + this.getContent().getRight()) / 2.0));
        final double vCenter = ExtensionsKt.roundToRealPixels(this.notchBoundToParent ? ((this.logicalParent.getTop() + this.logicalParent.getBottom()) / 2.0) : ((this.getContent().getTop() + this.getContent().getBottom()) / 2.0));
        final double left = this.getLeft() + 1.0;
        final double right = this.getRight() - 1.0;
        final double top = this.getTop() + 1.0;
        final double bottom = this.getBottom() - 1.0;
        int i = 1;
        final int notchSize = this.notchSize;
        if (1 <= notchSize) {
            while (true) {
                final UIBlock.Companion companion = UIBlock.Companion;
                final Color black = EssentialPalette.BLACK;
                companion.drawBlock(matrixStack, black, switch (WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()]) {
                    case 1 -> right + 1.0 + i;
                    case 2 -> left - 2.0 - i;
                    case 3 -> hCenter - (this.notchSize - i) - 0.5;
                    case 4 -> hCenter - (this.notchSize - i) - 0.5;
                    default -> throw new NoWhenBranchMatchedException();
                }, switch (WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()]) {
                    case 1 -> vCenter - (this.notchSize - i) - 0.5;
                    case 2 -> vCenter - (this.notchSize - i) - 0.5;
                    case 3 -> bottom + i;
                    case 4 -> top - 2.0 - i;
                    default -> throw new NoWhenBranchMatchedException();
                }, switch (WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()]) {
                    case 1 -> right + 2.0 + i;
                    case 2 -> left - 1.0 - i;
                    case 3 -> hCenter + (this.notchSize - i) + 0.5;
                    case 4 -> hCenter + (this.notchSize - i) + 0.5;
                    default -> throw new NoWhenBranchMatchedException();
                }, switch (WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()]) {
                    case 1 -> vCenter + (this.notchSize - i) + 0.5;
                    case 2 -> vCenter + (this.notchSize - i) + 0.5;
                    case 3 -> bottom + i + 2.0;
                    case 4 -> top - i - 1.0;
                    default -> throw new NoWhenBranchMatchedException();
                });
                final UIBlock.Companion companion2 = UIBlock.Companion;
                final Color component_BACKGROUND = EssentialPalette.COMPONENT_BACKGROUND;
                companion2.drawBlock(matrixStack, component_BACKGROUND, switch (WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()]) {
                    case 1 -> right + i;
                    case 2 -> left - 1.0 - i;
                    case 3 -> hCenter - (this.notchSize - i) - 0.5;
                    case 4 -> hCenter - (this.notchSize - i) - 0.5;
                    default -> throw new NoWhenBranchMatchedException();
                }, switch (WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()]) {
                    case 1 -> vCenter - (this.notchSize - i) - 0.5;
                    case 2 -> vCenter - (this.notchSize - i) - 0.5;
                    case 3 -> bottom + i;
                    case 4 -> top - 1.0 - i;
                    default -> throw new NoWhenBranchMatchedException();
                }, switch (WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()]) {
                    case 1 -> right + 1.0 + i;
                    case 2 -> left - i;
                    case 3 -> hCenter + (this.notchSize - i) + 0.5;
                    case 4 -> hCenter + (this.notchSize - i) + 0.5;
                    default -> throw new NoWhenBranchMatchedException();
                }, switch (WhenMappings.$EnumSwitchMapping$0[this.position.ordinal()]) {
                    case 1 -> vCenter + (this.notchSize - i) + 0.5;
                    case 2 -> vCenter + (this.notchSize - i) + 0.5;
                    case 3 -> bottom + i + 1.0;
                    case 4 -> top - i;
                    default -> throw new NoWhenBranchMatchedException();
                });
                if (i == notchSize) {
                    break;
                }
                ++i;
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/common/EssentialTooltip$Position;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "ABOVE", "BELOW", "essential" })
    public enum Position
    {
        LEFT("LEFT", 0), 
        RIGHT("RIGHT", 1), 
        ABOVE("ABOVE", 2), 
        BELOW("BELOW", 3);
        
        private static final /* synthetic */ Position[] $VALUES;
        
        private Position(final String $enum$name, final int $enum$ordinal) {
        }
        
        public static Position[] values() {
            return Position.$VALUES.clone();
        }
        
        public static Position valueOf(final String value) {
            return Enum.valueOf(Position.class, value);
        }
        
        private static final /* synthetic */ Position[] $values() {
            return new Position[] { Position.LEFT, Position.RIGHT, Position.ABOVE, Position.BELOW };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[Position.values().length];
            $EnumSwitchMapping$[Position.LEFT.ordinal()] = 1;
            $EnumSwitchMapping$[Position.RIGHT.ordinal()] = 2;
            $EnumSwitchMapping$[Position.ABOVE.ordinal()] = 3;
            $EnumSwitchMapping$[Position.BELOW.ordinal()] = 4;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
