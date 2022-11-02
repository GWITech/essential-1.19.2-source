package gg.essential.vigilance.gui;

import java.awt.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.effects.*;
import gg.essential.elementa.events.*;
import kotlin.jvm.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.utils.*;
import gg.essential.universal.*;
import gg.essential.elementa.constraints.*;
import kotlin.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b" }, d2 = { "Lgg/essential/vigilance/gui/ExpandingClickEffect;", "Lgg/essential/elementa/effects/Effect;", "color", "Ljava/awt/Color;", "animationTime", "", "scissorBoundingBox", "Lgg/essential/elementa/UIComponent;", "(Ljava/awt/Color;FLgg/essential/elementa/UIComponent;)V", "circle", "Lgg/essential/elementa/components/UICircle;", "lastClick", "Lgg/essential/elementa/events/UIClickEvent;", "radiusDelta", "scissorEffect", "Lgg/essential/elementa/effects/ScissorEffect;", "state", "Lgg/essential/vigilance/gui/ExpandingClickEffect$State;", "targetRadius", "animationFrame", "", "beforeDraw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "setup", "Companion", "State", "Vigilance" })
public final class ExpandingClickEffect extends Effect
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Color color;
    private final float animationTime;
    @Nullable
    private final UIComponent scissorBoundingBox;
    @NotNull
    private State state;
    private float targetRadius;
    private float radiusDelta;
    private ScissorEffect scissorEffect;
    private UIClickEvent lastClick;
    @NotNull
    private UICircle circle;
    
    @JvmOverloads
    public ExpandingClickEffect(@NotNull final Color color, final float animationTime, @Nullable final UIComponent scissorBoundingBox) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        super();
        this.color = color;
        this.animationTime = animationTime;
        this.scissorBoundingBox = scissorBoundingBox;
        this.state = State.NotActive;
        this.targetRadius = -1.0f;
        this.radiusDelta = -1.0f;
        this.circle = new UICircle(0.0f, this.color, 0, 5, null);
    }
    
    public ExpandingClickEffect(final Color color, float animationTime, UIComponent scissorBoundingBox, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            animationTime = 0.2f;
        }
        if ((n & 0x4) != 0x0) {
            scissorBoundingBox = null;
        }
        this(color, animationTime, scissorBoundingBox);
    }
    
    @Override
    public void setup() {
        UIComponent uiComponent;
        if ((uiComponent = this.scissorBoundingBox) == null) {
            uiComponent = this.getBoundComponent();
        }
        this.scissorEffect = new ScissorEffect(uiComponent, false, 2, null);
        final UIComponent $this$effect = this.circle;
        ScissorEffect scissorEffect;
        if ((scissorEffect = this.scissorEffect) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scissorEffect");
            scissorEffect = null;
        }
        ComponentsKt.effect($this$effect, scissorEffect);
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new ExpandingClickEffect$setup.ExpandingClickEffect$setup$1(this));
        UIComponent $this$onLeftClick$iv = this.getBoundComponent();
        int $i$f$onLeftClick = 0;
        $this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this) {
            final /* synthetic */ ExpandingClickEffect this$0;
            
            public ExpandingClickEffect$setup$$inlined$onLeftClick$1(final ExpandingClickEffect this$0) {
                this.this$0 = this$0;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: ldc             "$this$onMouseClick"
                //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
                //     6: aload_2         /* it */
                //     7: ldc             "it"
                //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
                //    12: aload_2         /* it */
                //    13: invokevirtual   gg/essential/elementa/events/UIClickEvent.getMouseButton:()I
                //    16: ifne            35
                //    19: aload_1         /* $this$onMouseClick */
                //    20: aload_2         /* it */
                //    21: astore_3       
                //    22: astore          $this$setup_u24lambda_u2d1
                //    24: iconst_0       
                //    25: istore          $i$a$-onLeftClick-ExpandingClickEffect$setup$2
                //    27: aload_0         /* this */
                //    28: getfield        gg/essential/vigilance/gui/ExpandingClickEffect$setup$$inlined$onLeftClick$1.this$0:Lgg/essential/vigilance/gui/ExpandingClickEffect;
                //    31: aload_3         /* it */
                //    32: invokestatic    gg/essential/vigilance/gui/ExpandingClickEffect.access$setup$onClickHandler:(Lgg/essential/vigilance/gui/ExpandingClickEffect;Lgg/essential/elementa/events/UIClickEvent;)V
                //    35: return         
                //    MethodParameters:
                //  Name                Flags  
                //  ------------------  -----
                //  $this$onMouseClick  
                //  it                  
                //    StackMapTable: 00 01 23
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
        $this$onLeftClick$iv = this.circle;
        $i$f$onLeftClick = 0;
        $this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this) {
            final /* synthetic */ ExpandingClickEffect this$0;
            
            public ExpandingClickEffect$setup$$inlined$onLeftClick$2(final ExpandingClickEffect this$0) {
                this.this$0 = this$0;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: ldc             "$this$onMouseClick"
                //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
                //     6: aload_2         /* it */
                //     7: ldc             "it"
                //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
                //    12: aload_2         /* it */
                //    13: invokevirtual   gg/essential/elementa/events/UIClickEvent.getMouseButton:()I
                //    16: ifne            36
                //    19: aload_1         /* $this$onMouseClick */
                //    20: aload_2         /* it */
                //    21: astore_3       
                //    22: astore          $this$setup_u24lambda_u2d2
                //    24: iconst_0       
                //    25: istore          $i$a$-onLeftClick-ExpandingClickEffect$setup$3
                //    27: aload_0         /* this */
                //    28: getfield        gg/essential/vigilance/gui/ExpandingClickEffect$setup$$inlined$onLeftClick$2.this$0:Lgg/essential/vigilance/gui/ExpandingClickEffect;
                //    31: aload_3         /* it */
                //    32: invokestatic    gg/essential/vigilance/gui/ExpandingClickEffect.access$setup$onClickHandler:(Lgg/essential/vigilance/gui/ExpandingClickEffect;Lgg/essential/elementa/events/UIClickEvent;)V
                //    35: nop            
                //    36: return         
                //    MethodParameters:
                //  Name                Flags  
                //  ------------------  -----
                //  $this$onMouseClick  
                //  it                  
                //    StackMapTable: 00 01 24
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
    }
    
    @Override
    public void animationFrame() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
            case 2: {
                final float newRadius = this.circle.getRadius() + this.radiusDelta;
                if (newRadius >= this.targetRadius) {
                    this.state = State.Expanded;
                    break;
                }
                this.circle.setRadius(UtilitiesKt.getPixels(newRadius));
                break;
            }
            case 3: {
                final Color currentColor = this.circle.getColor();
                final int alpha = currentColor.getAlpha() - 2;
                if (alpha <= 0) {
                    this.state = State.NotActive;
                    this.targetRadius = -1.0f;
                    this.radiusDelta = -1.0f;
                    this.circle.hide(true);
                    break;
                }
                this.circle.setColor(UtilitiesKt.toConstraint(ExtensionsKt.withAlpha(currentColor, alpha)));
                break;
            }
        }
    }
    
    @Override
    public void beforeDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        if (this.state != State.NotActive) {
            this.circle.draw(matrixStack);
        }
    }
    
    @JvmOverloads
    public ExpandingClickEffect(@NotNull final Color color, final float animationTime) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this(color, animationTime, null, 4, null);
    }
    
    @JvmOverloads
    public ExpandingClickEffect(@NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this(color, 0.0f, null, 6, null);
    }
    
    private static final void setup$onClickHandler(final ExpandingClickEffect this$0, final UIClickEvent clickEvent) {
        this$0.lastClick = clickEvent;
        UIComponent.unhide$default(this$0.circle, false, 1, null);
        this$0.state = State.Expanding;
        final float left = this$0.getBoundComponent().getLeft();
        final float top = this$0.getBoundComponent().getTop();
        final float right = this$0.getBoundComponent().getRight();
        final float bottom = this$0.getBoundComponent().getBottom();
        final Pair center = TuplesKt.to((Object)clickEvent.getAbsoluteX(), (Object)clickEvent.getAbsoluteY());
        this$0.targetRadius = Math.max(Math.max(ExpandingClickEffect.Companion.distance((Pair<Float, Float>)center, (Pair<Float, Float>)TuplesKt.to((Object)left, (Object)top)), ExpandingClickEffect.Companion.distance((Pair<Float, Float>)center, (Pair<Float, Float>)TuplesKt.to((Object)left, (Object)bottom))), Math.max(ExpandingClickEffect.Companion.distance((Pair<Float, Float>)center, (Pair<Float, Float>)TuplesKt.to((Object)right, (Object)top)), ExpandingClickEffect.Companion.distance((Pair<Float, Float>)center, (Pair<Float, Float>)TuplesKt.to((Object)right, (Object)bottom)))) + 2.0f;
        this$0.radiusDelta = this$0.targetRadius / this$0.animationTime / Window.Companion.of(this$0.getBoundComponent()).getAnimationFPS();
        final UIComponent $this$constrain$iv = this$0.circle;
        final int $i$f$constrain = 0;
        final UIComponent $this$constrain_u24lambda_u2d0$iv = $this$constrain$iv;
        final int n = 0;
        final UIConstraints $this$setup_u24onClickHandler_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        final int n2 = 0;
        $this$setup_u24onClickHandler_u24lambda_u2d0.setX(UtilitiesKt.getPixels(clickEvent.getAbsoluteX()));
        $this$setup_u24onClickHandler_u24lambda_u2d0.setY(UtilitiesKt.getPixels(clickEvent.getAbsoluteY()));
        $this$setup_u24onClickHandler_u24lambda_u2d0.setColor(UtilitiesKt.toConstraint(this$0.color));
        $this$setup_u24onClickHandler_u24lambda_u2d0.setRadius(UtilitiesKt.getPixels(0));
    }
    
    public static final /* synthetic */ UICircle access$getCircle$p(final ExpandingClickEffect $this) {
        return $this.circle;
    }
    
    public static final /* synthetic */ UIComponent access$getBoundComponent(final ExpandingClickEffect $this) {
        return $this.getBoundComponent();
    }
    
    public static final /* synthetic */ void access$setup$onClickHandler(final ExpandingClickEffect this$0, final UIClickEvent clickEvent) {
        setup$onClickHandler(this$0, clickEvent);
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lgg/essential/vigilance/gui/ExpandingClickEffect$State;", "", "(Ljava/lang/String;I)V", "NotActive", "Expanding", "Expanded", "Vigilance" })
    public enum State
    {
        NotActive("NotActive", 0), 
        Expanding("Expanding", 1), 
        Expanded("Expanded", 2);
        
        private static final /* synthetic */ State[] $VALUES;
        
        private State(final String $enum$name, final int $enum$ordinal) {
        }
        
        public static State[] values() {
            return State.$VALUES.clone();
        }
        
        public static State valueOf(final String value) {
            return Enum.valueOf(State.class, value);
        }
        
        private static final /* synthetic */ State[] $values() {
            return new State[] { State.NotActive, State.Expanding, State.Expanded };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¨\u0006\b" }, d2 = { "Lgg/essential/vigilance/gui/ExpandingClickEffect$Companion;", "", "()V", "distance", "", "p1", "Lkotlin/Pair;", "p2", "Vigilance" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        private final float distance(final Pair<Float, Float> p1, final Pair<Float, Float> p2) {
            return (float)Math.sqrt((float)Math.pow(((Number)p1.getFirst()).floatValue() - ((Number)p2.getFirst()).floatValue(), 2.0f) + (float)Math.pow(((Number)p1.getSecond()).floatValue() - ((Number)p2.getSecond()).floatValue(), 2.0f));
        }
        
        public static final /* synthetic */ float access$distance(final Companion $this, final Pair p1, final Pair p2) {
            return $this.distance((Pair<Float, Float>)p1, (Pair<Float, Float>)p2);
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[State.values().length];
            $EnumSwitchMapping$[State.NotActive.ordinal()] = 1;
            $EnumSwitchMapping$[State.Expanding.ordinal()] = 2;
            $EnumSwitchMapping$[State.Expanded.ordinal()] = 3;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
