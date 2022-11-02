package gg.essential.elementa.effects;

import java.awt.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import gg.essential.elementa.state.*;
import gg.essential.universal.*;
import gg.essential.elementa.components.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00015B;\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fBG\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\u000eJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u000bJ\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0014\u00100\u001a\u00020\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\rJ\u0014\u00102\u001a\u00020\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ\u0010\u00103\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u000e\u00104\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u000bR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066" }, d2 = { "Lgg/essential/elementa/effects/OutlineEffect;", "Lgg/essential/elementa/effects/Effect;", "color", "Ljava/awt/Color;", "width", "", "drawAfterChildren", "", "drawInsideChildren", "sides", "", "Lgg/essential/elementa/effects/OutlineEffect$Side;", "(Ljava/awt/Color;FZZLjava/util/Set;)V", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;ZZLjava/util/Set;)V", "value", "getColor", "()Ljava/awt/Color;", "setColor", "(Ljava/awt/Color;)V", "colorState", "Lgg/essential/elementa/state/MappedState;", "getDrawAfterChildren", "()Z", "setDrawAfterChildren", "(Z)V", "getDrawInsideChildren", "setDrawInsideChildren", "hasBottom", "hasLeft", "hasRight", "hasTop", "getSides", "()Ljava/util/Set;", "setSides", "(Ljava/util/Set;)V", "getWidth", "()F", "setWidth", "(F)V", "widthState", "addSide", "side", "afterDraw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "beforeChildrenDraw", "bindColor", "state", "bindWidth", "drawOutline", "removeSide", "Side", "Elementa" })
public final class OutlineEffect extends Effect
{
    private boolean drawAfterChildren;
    private boolean drawInsideChildren;
    private boolean hasLeft;
    private boolean hasTop;
    private boolean hasRight;
    private boolean hasBottom;
    @NotNull
    private final MappedState<Color, Color> colorState;
    @NotNull
    private final MappedState<Float, Float> widthState;
    @NotNull
    private Set<? extends Side> sides;
    
    @JvmOverloads
    public OutlineEffect(@NotNull final State<Color> color, @NotNull final State<Float> width, final boolean drawAfterChildren, final boolean drawInsideChildren, @NotNull final Set<? extends Side> sides) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)width, "width");
        Intrinsics.checkNotNullParameter((Object)sides, "sides");
        super();
        this.drawAfterChildren = drawAfterChildren;
        this.drawInsideChildren = drawInsideChildren;
        this.hasLeft = sides.contains(Side.Left);
        this.hasTop = sides.contains(Side.Top);
        this.hasRight = sides.contains(Side.Right);
        this.hasBottom = sides.contains(Side.Bottom);
        this.colorState = color.map((kotlin.jvm.functions.Function1<? super Color, ? extends Color>)OutlineEffect$colorState.OutlineEffect$colorState$1.INSTANCE);
        this.widthState = width.map((kotlin.jvm.functions.Function1<? super Float, ? extends Float>)OutlineEffect$widthState.OutlineEffect$widthState$1.INSTANCE);
        this.sides = sides;
    }
    
    public OutlineEffect(final State color, final State width, boolean drawAfterChildren, boolean drawInsideChildren, Set set, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x4) != 0x0) {
            drawAfterChildren = false;
        }
        if ((n & 0x8) != 0x0) {
            drawInsideChildren = false;
        }
        if ((n & 0x10) != 0x0) {
            set = SetsKt.setOf((Object[])new Side[] { Side.Left, Side.Top, Side.Right, Side.Bottom });
        }
        this(color, width, drawAfterChildren, drawInsideChildren, set);
    }
    
    public final boolean getDrawAfterChildren() {
        return this.drawAfterChildren;
    }
    
    public final void setDrawAfterChildren(final boolean <set-?>) {
        this.drawAfterChildren = <set-?>;
    }
    
    public final boolean getDrawInsideChildren() {
        return this.drawInsideChildren;
    }
    
    public final void setDrawInsideChildren(final boolean <set-?>) {
        this.drawInsideChildren = <set-?>;
    }
    
    @JvmOverloads
    public OutlineEffect(@NotNull final Color color, final float width, final boolean drawAfterChildren, final boolean drawInsideChildren, @NotNull final Set<? extends Side> sides) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)sides, "sides");
        this(new BasicState<Color>(color), new BasicState<Float>(width), drawAfterChildren, drawInsideChildren, sides);
    }
    
    public OutlineEffect(final Color color, final float width, boolean drawAfterChildren, boolean drawInsideChildren, Set set, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x4) != 0x0) {
            drawAfterChildren = false;
        }
        if ((n & 0x8) != 0x0) {
            drawInsideChildren = false;
        }
        if ((n & 0x10) != 0x0) {
            set = SetsKt.setOf((Object[])new Side[] { Side.Left, Side.Top, Side.Right, Side.Bottom });
        }
        this(color, width, drawAfterChildren, drawInsideChildren, set);
    }
    
    @NotNull
    public final Color getColor() {
        return this.colorState.get();
    }
    
    public final void setColor(@NotNull final Color value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.colorState.set(value);
    }
    
    public final float getWidth() {
        return this.widthState.get().floatValue();
    }
    
    public final void setWidth(final float value) {
        this.widthState.set(Float.valueOf(value));
    }
    
    @NotNull
    public final OutlineEffect bindColor(@NotNull final State<Color> state) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final OutlineEffect $this$bindColor_u24lambda_u2d0 = this;
        final int n = 0;
        $this$bindColor_u24lambda_u2d0.colorState.rebind(state);
        return this;
    }
    
    @NotNull
    public final OutlineEffect bindWidth(@NotNull final State<Float> state) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final OutlineEffect $this$bindWidth_u24lambda_u2d1 = this;
        final int n = 0;
        $this$bindWidth_u24lambda_u2d1.widthState.rebind(state);
        return this;
    }
    
    @NotNull
    public final Set<Side> getSides() {
        return (Set<Side>)this.sides;
    }
    
    public final void setSides(@NotNull final Set<? extends Side> value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.sides = value;
        this.hasLeft = this.sides.contains(Side.Left);
        this.hasTop = this.sides.contains(Side.Top);
        this.hasRight = this.sides.contains(Side.Right);
        this.hasBottom = this.sides.contains(Side.Bottom);
    }
    
    @NotNull
    public final OutlineEffect addSide(@NotNull final Side side) {
        Intrinsics.checkNotNullParameter((Object)side, "side");
        final OutlineEffect $this$addSide_u24lambda_u2d2 = this;
        final int n = 0;
        $this$addSide_u24lambda_u2d2.setSides(SetsKt.plus((Set)$this$addSide_u24lambda_u2d2.getSides(), (Object)side));
        return this;
    }
    
    @NotNull
    public final OutlineEffect removeSide(@NotNull final Side side) {
        Intrinsics.checkNotNullParameter((Object)side, "side");
        final OutlineEffect $this$removeSide_u24lambda_u2d3 = this;
        final int n = 0;
        $this$removeSide_u24lambda_u2d3.setSides(SetsKt.minus((Set)$this$removeSide_u24lambda_u2d3.getSides(), (Object)side));
        return this;
    }
    
    @Override
    public void beforeChildrenDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        if (!this.drawAfterChildren) {
            this.drawOutline(matrixStack);
        }
    }
    
    @Override
    public void afterDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        if (this.drawAfterChildren) {
            this.drawOutline(matrixStack);
        }
    }
    
    private final void drawOutline(final UMatrixStack matrixStack) {
        final Color color = this.colorState.get();
        final float width = this.widthState.get().floatValue();
        final double left = this.getBoundComponent().getLeft();
        final double right = this.getBoundComponent().getRight();
        final double top = this.getBoundComponent().getTop();
        final double bottom = this.getBoundComponent().getBottom();
        final Pair leftBounds = this.drawInsideChildren ? TuplesKt.to((Object)left, (Object)(left + width)) : TuplesKt.to((Object)(left - width), (Object)left);
        final Pair topBounds = this.drawInsideChildren ? TuplesKt.to((Object)top, (Object)(top + width)) : TuplesKt.to((Object)(top - width), (Object)top);
        final Pair rightBounds = this.drawInsideChildren ? TuplesKt.to((Object)(right - width), (Object)right) : TuplesKt.to((Object)right, (Object)(right + width));
        final Pair bottomBounds = this.drawInsideChildren ? TuplesKt.to((Object)(bottom - width), (Object)bottom) : TuplesKt.to((Object)bottom, (Object)(bottom + width));
        if (this.hasLeft) {
            UIBlock.Companion.drawBlock(matrixStack, color, ((Number)leftBounds.getFirst()).doubleValue(), top, ((Number)leftBounds.getSecond()).doubleValue(), bottom);
        }
        if (this.hasTop) {
            UIBlock.Companion.drawBlock(matrixStack, color, left, ((Number)topBounds.getFirst()).doubleValue(), right, ((Number)topBounds.getSecond()).doubleValue());
        }
        if (this.hasRight) {
            UIBlock.Companion.drawBlock(matrixStack, color, ((Number)rightBounds.getFirst()).doubleValue(), top, ((Number)rightBounds.getSecond()).doubleValue(), bottom);
        }
        if (this.hasBottom) {
            UIBlock.Companion.drawBlock(matrixStack, color, left, ((Number)bottomBounds.getFirst()).doubleValue(), right, ((Number)bottomBounds.getSecond()).doubleValue());
        }
        if (!this.drawInsideChildren) {
            if (this.hasLeft && this.hasTop) {
                UIBlock.Companion.drawBlock(matrixStack, color, ((Number)leftBounds.getFirst()).doubleValue(), ((Number)topBounds.getFirst()).doubleValue(), left, top);
            }
            if (this.hasRight && this.hasTop) {
                UIBlock.Companion.drawBlock(matrixStack, color, right, ((Number)topBounds.getFirst()).doubleValue(), ((Number)rightBounds.getSecond()).doubleValue(), top);
            }
            if (this.hasRight && this.hasBottom) {
                UIBlock.Companion.drawBlock(matrixStack, color, right, bottom, ((Number)rightBounds.getSecond()).doubleValue(), ((Number)bottomBounds.getSecond()).doubleValue());
            }
            if (this.hasBottom && this.hasLeft) {
                UIBlock.Companion.drawBlock(matrixStack, color, ((Number)leftBounds.getFirst()).doubleValue(), bottom, left, ((Number)bottomBounds.getSecond()).doubleValue());
            }
        }
    }
    
    @JvmOverloads
    public OutlineEffect(@NotNull final State<Color> color, @NotNull final State<Float> width, final boolean drawAfterChildren, final boolean drawInsideChildren) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)width, "width");
        this(color, width, drawAfterChildren, drawInsideChildren, null, 16, null);
    }
    
    @JvmOverloads
    public OutlineEffect(@NotNull final State<Color> color, @NotNull final State<Float> width, final boolean drawAfterChildren) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)width, "width");
        this(color, width, drawAfterChildren, false, null, 24, null);
    }
    
    @JvmOverloads
    public OutlineEffect(@NotNull final State<Color> color, @NotNull final State<Float> width) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)width, "width");
        this(color, width, false, false, null, 28, null);
    }
    
    @JvmOverloads
    public OutlineEffect(@NotNull final Color color, final float width, final boolean drawAfterChildren, final boolean drawInsideChildren) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this(color, width, drawAfterChildren, drawInsideChildren, null, 16, null);
    }
    
    @JvmOverloads
    public OutlineEffect(@NotNull final Color color, final float width, final boolean drawAfterChildren) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this(color, width, drawAfterChildren, false, null, 24, null);
    }
    
    @JvmOverloads
    public OutlineEffect(@NotNull final Color color, final float width) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this(color, width, false, false, null, 28, null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/elementa/effects/OutlineEffect$Side;", "", "(Ljava/lang/String;I)V", "Left", "Top", "Right", "Bottom", "Elementa" })
    public enum Side
    {
        Left("Left", 0), 
        Top("Top", 1), 
        Right("Right", 2), 
        Bottom("Bottom", 3);
        
        private static final /* synthetic */ Side[] $VALUES;
        
        private Side(final String $enum$name, final int $enum$ordinal) {
        }
        
        public static Side[] values() {
            return Side.$VALUES.clone();
        }
        
        public static Side valueOf(final String value) {
            return Enum.valueOf(Side.class, value);
        }
        
        private static final /* synthetic */ Side[] $values() {
            return new Side[] { Side.Left, Side.Top, Side.Right, Side.Bottom };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
