package gg.essential.elementa.transitions;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.effects.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.*;
import gg.essential.elementa.*;
import kotlin.reflect.*;
import gg.essential.elementa.constraints.animation.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0014R+\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d" }, d2 = { "Lgg/essential/elementa/transitions/RecursiveFadeInTransition;", "Lgg/essential/elementa/transitions/Transition;", "time", "", "animationType", "Lgg/essential/elementa/constraints/animation/Animations;", "(FLgg/essential/elementa/constraints/animation/Animations;)V", "<set-?>", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "alpha$delegate", "Lkotlin/properties/ReadWriteProperty;", "effect", "Lgg/essential/elementa/effects/RecursiveFadeEffect;", "isOverridden", "Lgg/essential/elementa/state/BasicState;", "", "overriddenAlphaPercentage", "afterTransition", "", "component", "Lgg/essential/elementa/UIComponent;", "beforeTransition", "doTransition", "constraints", "Lgg/essential/elementa/constraints/animation/AnimatingConstraints;", "Elementa" })
public final class RecursiveFadeInTransition extends Transition
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private final float time;
    @NotNull
    private final Animations animationType;
    @NotNull
    private final BasicState<Boolean> isOverridden;
    @NotNull
    private final BasicState<Float> overriddenAlphaPercentage;
    @NotNull
    private final ReadWriteProperty alpha$delegate;
    @NotNull
    private final RecursiveFadeEffect effect;
    
    @JvmOverloads
    public RecursiveFadeInTransition(final float time, @NotNull final Animations animationType) {
        Intrinsics.checkNotNullParameter((Object)animationType, "animationType");
        super();
        this.time = time;
        this.animationType = animationType;
        this.isOverridden = new BasicState<Boolean>(false);
        this.overriddenAlphaPercentage = new BasicState<Float>(0.0f);
        final Delegates instance = Delegates.INSTANCE;
        final Object initialValue$iv = 0.0f;
        final int $i$f$observable = 0;
        this.alpha$delegate = (ReadWriteProperty)new ObservableProperty<Float>(initialValue$iv, initialValue$iv, this) {
            final /* synthetic */ Object $initialValue;
            final /* synthetic */ RecursiveFadeInTransition this$0;
            
            public RecursiveFadeInTransition$special$$inlined$observable$1(final Object $captured_local_variable$1, final Object $super_call_param$2, final RecursiveFadeInTransition this$0) {
                this.$initialValue = $captured_local_variable$1;
                this.this$0 = this$0;
                super($super_call_param$2);
            }
            
            protected void afterChange(@NotNull final KProperty<?> property, final Float oldValue, final Float newValue) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: ldc             "property"
                //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
                //     6: aload_1         /* property */
                //     7: aload_2         /* oldValue */
                //     8: aload_3         /* newValue */
                //     9: checkcast       Ljava/lang/Number;
                //    12: invokevirtual   java/lang/Number.floatValue:()F
                //    15: fstore          4
                //    17: checkcast       Ljava/lang/Number;
                //    20: invokevirtual   java/lang/Number.floatValue:()F
                //    23: fstore          5
                //    25: astore          $noName_0
                //    27: iconst_0       
                //    28: istore          $i$a$-observable-RecursiveFadeInTransition$alpha$2
                //    30: aload_0         /* this */
                //    31: getfield        gg/essential/elementa/transitions/RecursiveFadeInTransition$special$$inlined$observable$1.this$0:Lgg/essential/elementa/transitions/RecursiveFadeInTransition;
                //    34: invokestatic    gg/essential/elementa/transitions/RecursiveFadeInTransition.access$getOverriddenAlphaPercentage$p:(Lgg/essential/elementa/transitions/RecursiveFadeInTransition;)Lgg/essential/elementa/state/BasicState;
                //    37: fload           newValue
                //    39: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
                //    42: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
                //    45: nop            
                //    46: return         
                //    Signature:
                //  (Lkotlin/reflect/KProperty<*>;Ljava/lang/Float;Ljava/lang/Float;)V
                //    MethodParameters:
                //  Name      Flags  
                //  --------  -----
                //  property  
                //  oldValue  
                //  newValue  
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
        };
        this.effect = new RecursiveFadeEffect(this.isOverridden, this.overriddenAlphaPercentage);
    }
    
    public RecursiveFadeInTransition(float time, Animations out_EXP, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            time = 1.0f;
        }
        if ((n & 0x2) != 0x0) {
            out_EXP = Animations.OUT_EXP;
        }
        this(time, out_EXP);
    }
    
    private final float getAlpha() {
        return ((Number)this.alpha$delegate.getValue((Object)this, (KProperty)RecursiveFadeInTransition.$$delegatedProperties[0])).floatValue();
    }
    
    private final void setAlpha(final float <set-?>) {
        this.alpha$delegate.setValue((Object)this, (KProperty)RecursiveFadeInTransition.$$delegatedProperties[0], (Object)<set-?>);
    }
    
    @Override
    protected void beforeTransition(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this.effect.bindComponent(component);
        component.getEffects().add(this.effect);
        this.effect.setup();
        this.setAlpha(0.0f);
        this.isOverridden.set(true);
    }
    
    @Override
    protected void doTransition(@NotNull final UIComponent component, @NotNull final AnimatingConstraints constraints) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        Intrinsics.checkNotNullParameter((Object)constraints, "constraints");
        constraints.setExtraDelay(this.time);
        final UIComponent $this$doTransition_u24lambda_u2d1 = component;
        final int n = 0;
        UIComponent.animate$default($this$doTransition_u24lambda_u2d1, (KMutableProperty0)new RecursiveFadeInTransition$doTransition$1.RecursiveFadeInTransition$doTransition$1$1((Object)this), this.animationType, this.time, 1.0f, 0.0f, 8, null);
    }
    
    @Override
    protected void afterTransition(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        this.effect.remove();
    }
    
    @JvmOverloads
    public RecursiveFadeInTransition(final float time) {
        this(time, null, 2, null);
    }
    
    @JvmOverloads
    public RecursiveFadeInTransition() {
        this(0.0f, null, 3, null);
    }
    
    public static final /* synthetic */ BasicState access$getOverriddenAlphaPercentage$p(final RecursiveFadeInTransition $this) {
        return $this.overriddenAlphaPercentage;
    }
    
    public static final /* synthetic */ float access$getAlpha(final RecursiveFadeInTransition $this) {
        return $this.getAlpha();
    }
    
    public static final /* synthetic */ void access$setAlpha(final RecursiveFadeInTransition $this, final float <set-?>) {
        $this.setAlpha(<set-?>);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)RecursiveFadeInTransition.class, "alpha", "getAlpha()F", 0)) };
    }
}
