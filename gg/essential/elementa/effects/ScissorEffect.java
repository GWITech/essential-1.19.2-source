package gg.essential.elementa.effects;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.utils.*;
import gg.essential.universal.*;
import org.lwjgl.opengl.*;
import kotlin.math.*;
import kotlin.ranges.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u0018\u0019B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001d\b\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\f\u0010\u0016\u001a\u00020\u0010*\u00020\u000bH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a" }, d2 = { "Lgg/essential/elementa/effects/ScissorEffect;", "Lgg/essential/elementa/effects/Effect;", "x1", "", "y1", "x2", "y2", "scissorIntersection", "", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Z)V", "customBoundingBox", "Lgg/essential/elementa/UIComponent;", "(Lgg/essential/elementa/UIComponent;Z)V", "oldState", "Lgg/essential/elementa/effects/ScissorEffect$ScissorState;", "scissorBounds", "Lgg/essential/elementa/effects/ScissorEffect$ScissorBounds;", "afterDraw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "beforeDraw", "getScissorBounds", "Companion", "ScissorBounds", "ScissorState", "Elementa" })
public final class ScissorEffect extends Effect
{
    @NotNull
    public static final Companion Companion;
    @Nullable
    private final UIComponent customBoundingBox;
    private final boolean scissorIntersection;
    @Nullable
    private ScissorState oldState;
    @Nullable
    private ScissorBounds scissorBounds;
    @Nullable
    private static ScissorState currentScissorState;
    
    @JvmOverloads
    public ScissorEffect(@Nullable final UIComponent customBoundingBox, final boolean scissorIntersection) {
        super();
        this.customBoundingBox = customBoundingBox;
        this.scissorIntersection = scissorIntersection;
    }
    
    public ScissorEffect(UIComponent customBoundingBox, boolean scissorIntersection, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            customBoundingBox = null;
        }
        if ((n & 0x2) != 0x0) {
            scissorIntersection = true;
        }
        this(customBoundingBox, scissorIntersection);
    }
    
    @JvmOverloads
    public ScissorEffect(@NotNull final Number x1, @NotNull final Number y1, @NotNull final Number x2, @NotNull final Number y2, final boolean scissorIntersection) {
        Intrinsics.checkNotNullParameter((Object)x1, "x1");
        Intrinsics.checkNotNullParameter((Object)y1, "y1");
        Intrinsics.checkNotNullParameter((Object)x2, "x2");
        Intrinsics.checkNotNullParameter((Object)y2, "y2");
        this(null, scissorIntersection, 1, null);
        this.scissorBounds = new ScissorBounds(ExtensionsKt.roundToRealPixels(x1.floatValue()), ExtensionsKt.roundToRealPixels(y1.floatValue()), ExtensionsKt.roundToRealPixels(x2.floatValue()), ExtensionsKt.roundToRealPixels(y2.floatValue()));
    }
    
    public ScissorEffect(final Number x1, final Number y1, final Number x2, final Number y2, boolean scissorIntersection, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x10) != 0x0) {
            scissorIntersection = true;
        }
        this(x1, y1, x2, y2, scissorIntersection);
    }
    
    @Override
    public void beforeDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final UIComponent customBoundingBox = this.customBoundingBox;
        ScissorBounds scissorBounds = (customBoundingBox == null) ? null : this.getScissorBounds(customBoundingBox);
        if (scissorBounds == null && (scissorBounds = this.scissorBounds) == null) {
            scissorBounds = this.getScissorBounds(this.getBoundComponent());
        }
        final ScissorBounds bounds = scissorBounds;
        final int scaleFactor = (int)UResolution.getScaleFactor();
        if (ScissorEffect.currentScissorState == null) {
            GL11.glEnable(3089);
        }
        this.oldState = ScissorEffect.currentScissorState;
        final ScissorState state = this.oldState;
        int x = MathKt.roundToInt(bounds.getX1() * scaleFactor);
        int y = UResolution.getViewportHeight() - MathKt.roundToInt(bounds.getY2() * scaleFactor);
        int width = MathKt.roundToInt(bounds.getWidth() * scaleFactor);
        int height = MathKt.roundToInt(bounds.getHeight() * scaleFactor);
        if (state != null && this.scissorIntersection) {
            final int x2 = x + width;
            final int y2 = y + height;
            final int oldX = state.getX();
            final int oldY = state.getY();
            final int oldX2 = state.getX() + state.getWidth();
            final int oldY2 = state.getY() + state.getHeight();
            x = Math.max(x, oldX);
            y = Math.max(y, oldY);
            width = Math.min(x2, oldX2) - x;
            height = Math.min(y2, oldY2) - y;
        }
        GL11.glScissor(x, y, RangesKt.coerceAtLeast(width, 0), RangesKt.coerceAtLeast(height, 0));
        final Companion companion = ScissorEffect.Companion;
        ScissorEffect.currentScissorState = new ScissorState(x, y, RangesKt.coerceAtLeast(width, 0), RangesKt.coerceAtLeast(height, 0));
    }
    
    @Override
    public void afterDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final ScissorState state = this.oldState;
        if (state != null) {
            GL11.glScissor(state.getX(), state.getY(), state.getWidth(), state.getHeight());
            this.oldState = null;
        }
        else {
            GL11.glDisable(3089);
        }
        final Companion companion = ScissorEffect.Companion;
        ScissorEffect.currentScissorState = state;
    }
    
    private final ScissorBounds getScissorBounds(final UIComponent $this$getScissorBounds) {
        return new ScissorBounds(ExtensionsKt.roundToRealPixels($this$getScissorBounds.getLeft()), ExtensionsKt.roundToRealPixels($this$getScissorBounds.getTop()), ExtensionsKt.roundToRealPixels($this$getScissorBounds.getRight()), ExtensionsKt.roundToRealPixels($this$getScissorBounds.getBottom()));
    }
    
    @JvmOverloads
    public ScissorEffect(@Nullable final UIComponent customBoundingBox) {
        this(customBoundingBox, false, 2, null);
    }
    
    @JvmOverloads
    public ScissorEffect() {
        this(null, false, 3, null);
    }
    
    @JvmOverloads
    public ScissorEffect(@NotNull final Number x1, @NotNull final Number y1, @NotNull final Number x2, @NotNull final Number y2) {
        Intrinsics.checkNotNullParameter((Object)x1, "x1");
        Intrinsics.checkNotNullParameter((Object)y1, "y1");
        Intrinsics.checkNotNullParameter((Object)x2, "x2");
        Intrinsics.checkNotNullParameter((Object)y2, "y2");
        this(x1, y1, x2, y2, false, 16, null);
    }
    
    public static final /* synthetic */ ScissorState access$getCurrentScissorState$cp() {
        return ScissorEffect.currentScissorState;
    }
    
    public static final /* synthetic */ void access$setCurrentScissorState$cp(final ScissorState <set-?>) {
        ScissorEffect.currentScissorState = <set-?>;
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018" }, d2 = { "Lgg/essential/elementa/effects/ScissorEffect$ScissorState;", "", "x", "", "y", "width", "height", "(IIII)V", "getHeight", "()I", "getWidth", "getX", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Elementa" })
    public static final class ScissorState
    {
        private final int x;
        private final int y;
        private final int width;
        private final int height;
        
        public ScissorState(final int x, final int y, final int width, final int height) {
            super();
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
        
        public final int getX() {
            return this.x;
        }
        
        public final int getY() {
            return this.y;
        }
        
        public final int getWidth() {
            return this.width;
        }
        
        public final int getHeight() {
            return this.height;
        }
        
        public final int component1() {
            return this.x;
        }
        
        public final int component2() {
            return this.y;
        }
        
        public final int component3() {
            return this.width;
        }
        
        public final int component4() {
            return this.height;
        }
        
        @NotNull
        public final ScissorState copy(final int x, final int y, final int width, final int height) {
            return new ScissorState(x, y, width, height);
        }
        
        public static /* synthetic */ ScissorState copy$default(final ScissorState scissorState, int x, int y, int width, int height, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                x = scissorState.x;
            }
            if ((n & 0x2) != 0x0) {
                y = scissorState.y;
            }
            if ((n & 0x4) != 0x0) {
                width = scissorState.width;
            }
            if ((n & 0x8) != 0x0) {
                height = scissorState.height;
            }
            return scissorState.copy(x, y, width, height);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "ScissorState(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ')';
        }
        
        @Override
        public int hashCode() {
            int result = Integer.hashCode(this.x);
            result = result * 31 + Integer.hashCode(this.y);
            result = result * 31 + Integer.hashCode(this.width);
            result = result * 31 + Integer.hashCode(this.height);
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScissorState)) {
                return false;
            }
            final ScissorState scissorState = (ScissorState)other;
            return this.x == scissorState.x && this.y == scissorState.y && this.width == scissorState.width && this.height == scissorState.height;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u001d" }, d2 = { "Lgg/essential/elementa/effects/ScissorEffect$ScissorBounds;", "", "x1", "", "y1", "x2", "y2", "(FFFF)V", "height", "getHeight", "()F", "width", "getWidth", "getX1", "getX2", "getY1", "getY2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
    private static final class ScissorBounds
    {
        private final float x1;
        private final float y1;
        private final float x2;
        private final float y2;
        
        public ScissorBounds(final float x1, final float y1, final float x2, final float y2) {
            super();
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        
        public final float getX1() {
            return this.x1;
        }
        
        public final float getY1() {
            return this.y1;
        }
        
        public final float getX2() {
            return this.x2;
        }
        
        public final float getY2() {
            return this.y2;
        }
        
        public final float getWidth() {
            return this.x2 - this.x1;
        }
        
        public final float getHeight() {
            return this.y2 - this.y1;
        }
        
        public final float component1() {
            return this.x1;
        }
        
        public final float component2() {
            return this.y1;
        }
        
        public final float component3() {
            return this.x2;
        }
        
        public final float component4() {
            return this.y2;
        }
        
        @NotNull
        public final ScissorBounds copy(final float x1, final float y1, final float x2, final float y2) {
            return new ScissorBounds(x1, y1, x2, y2);
        }
        
        public static /* synthetic */ ScissorBounds copy$default(final ScissorBounds scissorBounds, float x1, float y1, float x2, float y2, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                x1 = scissorBounds.x1;
            }
            if ((n & 0x2) != 0x0) {
                y1 = scissorBounds.y1;
            }
            if ((n & 0x4) != 0x0) {
                x2 = scissorBounds.x2;
            }
            if ((n & 0x8) != 0x0) {
                y2 = scissorBounds.y2;
            }
            return scissorBounds.copy(x1, y1, x2, y2);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "ScissorBounds(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ')';
        }
        
        @Override
        public int hashCode() {
            int result = Float.hashCode(this.x1);
            result = result * 31 + Float.hashCode(this.y1);
            result = result * 31 + Float.hashCode(this.x2);
            result = result * 31 + Float.hashCode(this.y2);
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScissorBounds)) {
                return false;
            }
            final ScissorBounds scissorBounds = (ScissorBounds)other;
            return Intrinsics.areEqual((Object)this.x1, (Object)scissorBounds.x1) && Intrinsics.areEqual((Object)this.y1, (Object)scissorBounds.y1) && Intrinsics.areEqual((Object)this.x2, (Object)scissorBounds.x2) && Intrinsics.areEqual((Object)this.y2, (Object)scissorBounds.y2);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lgg/essential/elementa/effects/ScissorEffect$Companion;", "", "()V", "currentScissorState", "Lgg/essential/elementa/effects/ScissorEffect$ScissorState;", "getCurrentScissorState", "()Lgg/essential/elementa/effects/ScissorEffect$ScissorState;", "setCurrentScissorState", "(Lgg/essential/elementa/effects/ScissorEffect$ScissorState;)V", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @Nullable
        public final ScissorState getCurrentScissorState() {
            return ScissorEffect.access$getCurrentScissorState$cp();
        }
        
        public final void setCurrentScissorState(@Nullable final ScissorState <set-?>) {
            ScissorEffect.access$setCurrentScissorState$cp(<set-?>);
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
