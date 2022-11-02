package gg.essential.elementa.constraints.animation;

import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\r\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0002\b\u0010J\u0006\u0010\u0011\u001a\u00020\u0000J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0015J*\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001aH\u0007J\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001aJ*\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020 2\b\b\u0002\u0010\u001d\u001a\u00020\u001aH\u0007J*\u0010!\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\"2\b\b\u0002\u0010\u001d\u001a\u00020\u001aH\u0007J*\u0010#\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020 2\b\b\u0002\u0010\u001d\u001a\u00020\u001aH\u0007J*\u0010$\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020%2\b\b\u0002\u0010\u001d\u001a\u00020\u001aH\u0007J*\u0010&\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020'2\b\b\u0002\u0010\u001d\u001a\u00020\u001aH\u0007J*\u0010(\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020)2\b\b\u0002\u0010\u001d\u001a\u00020\u001aH\u0007R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*" }, d2 = { "Lgg/essential/elementa/constraints/animation/AnimatingConstraints;", "Lgg/essential/elementa/UIConstraints;", "component", "Lgg/essential/elementa/UIComponent;", "oldConstraints", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIConstraints;)V", "completeAction", "Lkotlin/Function0;", "", "getCompleteAction", "()Lkotlin/jvm/functions/Function0;", "setCompleteAction", "(Lkotlin/jvm/functions/Function0;)V", "extraDelayFrames", "", "animationFrame", "animationFrame$Elementa", "begin", "onComplete", "method", "onCompleteRunnable", "Ljava/lang/Runnable;", "setColorAnimation", "strategy", "Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "time", "", "newConstraint", "Lgg/essential/elementa/constraints/ColorConstraint;", "delay", "setExtraDelay", "setHeightAnimation", "Lgg/essential/elementa/constraints/HeightConstraint;", "setRadiusAnimation", "Lgg/essential/elementa/constraints/RadiusConstraint;", "setTextScaleAnimation", "setWidthAnimation", "Lgg/essential/elementa/constraints/WidthConstraint;", "setXAnimation", "Lgg/essential/elementa/constraints/XConstraint;", "setYAnimation", "Lgg/essential/elementa/constraints/YConstraint;", "Elementa" })
public final class AnimatingConstraints extends UIConstraints
{
    @NotNull
    private final UIConstraints oldConstraints;
    @NotNull
    private Function0<Unit> completeAction;
    private int extraDelayFrames;
    
    public AnimatingConstraints(@NotNull final UIComponent component, @NotNull final UIConstraints oldConstraints) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        Intrinsics.checkNotNullParameter((Object)oldConstraints, "oldConstraints");
        super(component);
        this.oldConstraints = oldConstraints;
        this.completeAction = (Function0<Unit>)AnimatingConstraints$completeAction.AnimatingConstraints$completeAction$1.INSTANCE;
        this.setX(this.oldConstraints.getX());
        this.setY(this.oldConstraints.getY());
        this.setWidth(this.oldConstraints.getWidth());
        this.setHeight(this.oldConstraints.getHeight());
        this.setRadius(this.oldConstraints.getRadius());
        this.setTextScale(this.oldConstraints.getTextScale());
        this.setColor(this.oldConstraints.getColor());
        this.setFontProvider(this.oldConstraints.getFontProvider());
    }
    
    @NotNull
    public final Function0<Unit> getCompleteAction() {
        return this.completeAction;
    }
    
    public final void setCompleteAction(@NotNull final Function0<Unit> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.completeAction = <set-?>;
    }
    
    @NotNull
    public final AnimatingConstraints begin() {
        final AnimatingConstraints $this$begin_u24lambda_u2d0 = this;
        final int n = 0;
        $this$begin_u24lambda_u2d0.getComponent().animateTo($this$begin_u24lambda_u2d0);
        return this;
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setXAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final XConstraint newConstraint, final float delay) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        final AnimatingConstraints $this$setXAnimation_u24lambda_u2d1 = this;
        final int n = 0;
        final float totalFrames = time * Window.Companion.of($this$setXAnimation_u24lambda_u2d1.getComponent()).getAnimationFPS();
        final float totalDelay = delay * Window.Companion.of($this$setXAnimation_u24lambda_u2d1.getComponent()).getAnimationFPS();
        $this$setXAnimation_u24lambda_u2d1.setX(new XAnimationComponent(strategy, (int)totalFrames, $this$setXAnimation_u24lambda_u2d1.oldConstraints.getX(), newConstraint, (int)totalDelay));
        return this;
    }
    
    public static /* synthetic */ AnimatingConstraints setXAnimation$default(final AnimatingConstraints animatingConstraints, final AnimationStrategy strategy, final float time, final XConstraint newConstraint, float delay, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        return animatingConstraints.setXAnimation(strategy, time, newConstraint, delay);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setYAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final YConstraint newConstraint, final float delay) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        final AnimatingConstraints $this$setYAnimation_u24lambda_u2d2 = this;
        final int n = 0;
        final float totalFrames = time * Window.Companion.of($this$setYAnimation_u24lambda_u2d2.getComponent()).getAnimationFPS();
        final float totalDelay = delay * Window.Companion.of($this$setYAnimation_u24lambda_u2d2.getComponent()).getAnimationFPS();
        $this$setYAnimation_u24lambda_u2d2.setY(new YAnimationComponent(strategy, (int)totalFrames, $this$setYAnimation_u24lambda_u2d2.oldConstraints.getY(), newConstraint, (int)totalDelay));
        return this;
    }
    
    public static /* synthetic */ AnimatingConstraints setYAnimation$default(final AnimatingConstraints animatingConstraints, final AnimationStrategy strategy, final float time, final YConstraint newConstraint, float delay, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        return animatingConstraints.setYAnimation(strategy, time, newConstraint, delay);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setWidthAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final WidthConstraint newConstraint, final float delay) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        final AnimatingConstraints $this$setWidthAnimation_u24lambda_u2d3 = this;
        final int n = 0;
        final float totalFrames = time * Window.Companion.of($this$setWidthAnimation_u24lambda_u2d3.getComponent()).getAnimationFPS();
        final float totalDelay = delay * Window.Companion.of($this$setWidthAnimation_u24lambda_u2d3.getComponent()).getAnimationFPS();
        $this$setWidthAnimation_u24lambda_u2d3.setWidth(new WidthAnimationComponent(strategy, (int)totalFrames, $this$setWidthAnimation_u24lambda_u2d3.oldConstraints.getWidth(), newConstraint, (int)totalDelay));
        return this;
    }
    
    public static /* synthetic */ AnimatingConstraints setWidthAnimation$default(final AnimatingConstraints animatingConstraints, final AnimationStrategy strategy, final float time, final WidthConstraint newConstraint, float delay, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        return animatingConstraints.setWidthAnimation(strategy, time, newConstraint, delay);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setHeightAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final HeightConstraint newConstraint, final float delay) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        final AnimatingConstraints $this$setHeightAnimation_u24lambda_u2d4 = this;
        final int n = 0;
        final float totalFrames = time * Window.Companion.of($this$setHeightAnimation_u24lambda_u2d4.getComponent()).getAnimationFPS();
        final float totalDelay = delay * Window.Companion.of($this$setHeightAnimation_u24lambda_u2d4.getComponent()).getAnimationFPS();
        $this$setHeightAnimation_u24lambda_u2d4.setHeight(new HeightAnimationComponent(strategy, (int)totalFrames, $this$setHeightAnimation_u24lambda_u2d4.oldConstraints.getHeight(), newConstraint, (int)totalDelay));
        return this;
    }
    
    public static /* synthetic */ AnimatingConstraints setHeightAnimation$default(final AnimatingConstraints animatingConstraints, final AnimationStrategy strategy, final float time, final HeightConstraint newConstraint, float delay, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        return animatingConstraints.setHeightAnimation(strategy, time, newConstraint, delay);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setRadiusAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final RadiusConstraint newConstraint, final float delay) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        final AnimatingConstraints $this$setRadiusAnimation_u24lambda_u2d5 = this;
        final int n = 0;
        final float totalFrames = time * Window.Companion.of($this$setRadiusAnimation_u24lambda_u2d5.getComponent()).getAnimationFPS();
        final float totalDelay = delay * Window.Companion.of($this$setRadiusAnimation_u24lambda_u2d5.getComponent()).getAnimationFPS();
        $this$setRadiusAnimation_u24lambda_u2d5.setRadius(new RadiusAnimationComponent(strategy, (int)totalFrames, $this$setRadiusAnimation_u24lambda_u2d5.oldConstraints.getRadius(), newConstraint, (int)totalDelay));
        return this;
    }
    
    public static /* synthetic */ AnimatingConstraints setRadiusAnimation$default(final AnimatingConstraints animatingConstraints, final AnimationStrategy strategy, final float time, final RadiusConstraint newConstraint, float delay, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        return animatingConstraints.setRadiusAnimation(strategy, time, newConstraint, delay);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setTextScaleAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final HeightConstraint newConstraint, final float delay) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        final AnimatingConstraints $this$setTextScaleAnimation_u24lambda_u2d6 = this;
        final int n = 0;
        final float totalFrames = time * Window.Companion.of($this$setTextScaleAnimation_u24lambda_u2d6.getComponent()).getAnimationFPS();
        final float totalDelay = delay * Window.Companion.of($this$setTextScaleAnimation_u24lambda_u2d6.getComponent()).getAnimationFPS();
        $this$setTextScaleAnimation_u24lambda_u2d6.setTextScale(new HeightAnimationComponent(strategy, (int)totalFrames, $this$setTextScaleAnimation_u24lambda_u2d6.oldConstraints.getTextScale(), newConstraint, (int)totalDelay));
        return this;
    }
    
    public static /* synthetic */ AnimatingConstraints setTextScaleAnimation$default(final AnimatingConstraints animatingConstraints, final AnimationStrategy strategy, final float time, final HeightConstraint newConstraint, float delay, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        return animatingConstraints.setTextScaleAnimation(strategy, time, newConstraint, delay);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setColorAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final ColorConstraint newConstraint, final float delay) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        final AnimatingConstraints $this$setColorAnimation_u24lambda_u2d7 = this;
        final int n = 0;
        final float totalFrames = time * Window.Companion.of($this$setColorAnimation_u24lambda_u2d7.getComponent()).getAnimationFPS();
        final float totalDelay = delay * Window.Companion.of($this$setColorAnimation_u24lambda_u2d7.getComponent()).getAnimationFPS();
        $this$setColorAnimation_u24lambda_u2d7.setColor(new ColorAnimationComponent(strategy, (int)totalFrames, $this$setColorAnimation_u24lambda_u2d7.oldConstraints.getColor(), newConstraint, (int)totalDelay));
        return this;
    }
    
    public static /* synthetic */ AnimatingConstraints setColorAnimation$default(final AnimatingConstraints animatingConstraints, final AnimationStrategy strategy, final float time, final ColorConstraint newConstraint, float delay, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        return animatingConstraints.setColorAnimation(strategy, time, newConstraint, delay);
    }
    
    public final void setExtraDelay(final float delay) {
        this.extraDelayFrames = (int)(delay * Window.Companion.of(this.getComponent()).getAnimationFPS());
    }
    
    @NotNull
    public final AnimatingConstraints onComplete(@NotNull final Function0<Unit> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final AnimatingConstraints $this$onComplete_u24lambda_u2d8 = this;
        final int n = 0;
        $this$onComplete_u24lambda_u2d8.setCompleteAction(method);
        return this;
    }
    
    @NotNull
    public final AnimatingConstraints onCompleteRunnable(@NotNull final Runnable method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final AnimatingConstraints $this$onCompleteRunnable_u24lambda_u2d9 = this;
        final int n = 0;
        $this$onCompleteRunnable_u24lambda_u2d9.setCompleteAction((Function0<Unit>)new AnimatingConstraints$onCompleteRunnable$1.AnimatingConstraints$onCompleteRunnable$1$1((Object)method));
        return this;
    }
    
    @Override
    public void animationFrame$Elementa() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   gg/essential/elementa/UIConstraints.animationFrame$Elementa:()V
        //     4: iconst_0       
        //     5: istore_1        /* anyLeftAnimating */
        //     6: aload_0         /* this */
        //     7: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getX:()Lgg/essential/elementa/constraints/XConstraint;
        //    10: astore_2        /* x */
        //    11: aload_2         /* x */
        //    12: instanceof      Lgg/essential/elementa/constraints/animation/XAnimationComponent;
        //    15: ifeq            44
        //    18: aload_2         /* x */
        //    19: checkcast       Lgg/essential/elementa/constraints/animation/XAnimationComponent;
        //    22: invokevirtual   gg/essential/elementa/constraints/animation/XAnimationComponent.isComplete:()Z
        //    25: ifeq            42
        //    28: aload_0         /* this */
        //    29: aload_2         /* x */
        //    30: checkcast       Lgg/essential/elementa/constraints/animation/XAnimationComponent;
        //    33: invokevirtual   gg/essential/elementa/constraints/animation/XAnimationComponent.getNewConstraint:()Lgg/essential/elementa/constraints/XConstraint;
        //    36: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //    39: goto            44
        //    42: iconst_1       
        //    43: istore_1        /* anyLeftAnimating */
        //    44: aload_0         /* this */
        //    45: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getY:()Lgg/essential/elementa/constraints/YConstraint;
        //    48: astore_3        /* y */
        //    49: aload_3         /* y */
        //    50: instanceof      Lgg/essential/elementa/constraints/animation/YAnimationComponent;
        //    53: ifeq            82
        //    56: aload_3         /* y */
        //    57: checkcast       Lgg/essential/elementa/constraints/animation/YAnimationComponent;
        //    60: invokevirtual   gg/essential/elementa/constraints/animation/YAnimationComponent.isComplete:()Z
        //    63: ifeq            80
        //    66: aload_0         /* this */
        //    67: aload_3         /* y */
        //    68: checkcast       Lgg/essential/elementa/constraints/animation/YAnimationComponent;
        //    71: invokevirtual   gg/essential/elementa/constraints/animation/YAnimationComponent.getNewConstraint:()Lgg/essential/elementa/constraints/YConstraint;
        //    74: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    77: goto            82
        //    80: iconst_1       
        //    81: istore_1        /* anyLeftAnimating */
        //    82: aload_0         /* this */
        //    83: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getWidth:()Lgg/essential/elementa/constraints/WidthConstraint;
        //    86: astore          width
        //    88: aload           width
        //    90: instanceof      Lgg/essential/elementa/constraints/animation/WidthAnimationComponent;
        //    93: ifeq            124
        //    96: aload           width
        //    98: checkcast       Lgg/essential/elementa/constraints/animation/WidthAnimationComponent;
        //   101: invokevirtual   gg/essential/elementa/constraints/animation/WidthAnimationComponent.isComplete:()Z
        //   104: ifeq            122
        //   107: aload_0         /* this */
        //   108: aload           width
        //   110: checkcast       Lgg/essential/elementa/constraints/animation/WidthAnimationComponent;
        //   113: invokevirtual   gg/essential/elementa/constraints/animation/WidthAnimationComponent.getNewConstraint:()Lgg/essential/elementa/constraints/WidthConstraint;
        //   116: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   119: goto            124
        //   122: iconst_1       
        //   123: istore_1        /* anyLeftAnimating */
        //   124: aload_0         /* this */
        //   125: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getHeight:()Lgg/essential/elementa/constraints/HeightConstraint;
        //   128: astore          height
        //   130: aload           height
        //   132: instanceof      Lgg/essential/elementa/constraints/animation/HeightAnimationComponent;
        //   135: ifeq            166
        //   138: aload           height
        //   140: checkcast       Lgg/essential/elementa/constraints/animation/HeightAnimationComponent;
        //   143: invokevirtual   gg/essential/elementa/constraints/animation/HeightAnimationComponent.isComplete:()Z
        //   146: ifeq            164
        //   149: aload_0         /* this */
        //   150: aload           height
        //   152: checkcast       Lgg/essential/elementa/constraints/animation/HeightAnimationComponent;
        //   155: invokevirtual   gg/essential/elementa/constraints/animation/HeightAnimationComponent.getNewConstraint:()Lgg/essential/elementa/constraints/HeightConstraint;
        //   158: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   161: goto            166
        //   164: iconst_1       
        //   165: istore_1        /* anyLeftAnimating */
        //   166: aload_0         /* this */
        //   167: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getRadius:()Lgg/essential/elementa/constraints/RadiusConstraint;
        //   170: astore          radius
        //   172: aload           radius
        //   174: instanceof      Lgg/essential/elementa/constraints/animation/RadiusAnimationComponent;
        //   177: ifeq            208
        //   180: aload           radius
        //   182: checkcast       Lgg/essential/elementa/constraints/animation/RadiusAnimationComponent;
        //   185: invokevirtual   gg/essential/elementa/constraints/animation/RadiusAnimationComponent.isComplete:()Z
        //   188: ifeq            206
        //   191: aload_0         /* this */
        //   192: aload           radius
        //   194: checkcast       Lgg/essential/elementa/constraints/animation/RadiusAnimationComponent;
        //   197: invokevirtual   gg/essential/elementa/constraints/animation/RadiusAnimationComponent.getNewConstraint:()Lgg/essential/elementa/constraints/RadiusConstraint;
        //   200: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.setRadius:(Lgg/essential/elementa/constraints/RadiusConstraint;)V
        //   203: goto            208
        //   206: iconst_1       
        //   207: istore_1        /* anyLeftAnimating */
        //   208: aload_0         /* this */
        //   209: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getTextScale:()Lgg/essential/elementa/constraints/HeightConstraint;
        //   212: astore          textScale
        //   214: aload           textScale
        //   216: instanceof      Lgg/essential/elementa/constraints/animation/HeightAnimationComponent;
        //   219: ifeq            250
        //   222: aload           textScale
        //   224: checkcast       Lgg/essential/elementa/constraints/animation/HeightAnimationComponent;
        //   227: invokevirtual   gg/essential/elementa/constraints/animation/HeightAnimationComponent.isComplete:()Z
        //   230: ifeq            248
        //   233: aload_0         /* this */
        //   234: aload           textScale
        //   236: checkcast       Lgg/essential/elementa/constraints/animation/HeightAnimationComponent;
        //   239: invokevirtual   gg/essential/elementa/constraints/animation/HeightAnimationComponent.getNewConstraint:()Lgg/essential/elementa/constraints/HeightConstraint;
        //   242: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.setTextScale:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   245: goto            250
        //   248: iconst_1       
        //   249: istore_1        /* anyLeftAnimating */
        //   250: aload_0         /* this */
        //   251: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getColor:()Lgg/essential/elementa/constraints/ColorConstraint;
        //   254: astore          color
        //   256: aload           color
        //   258: instanceof      Lgg/essential/elementa/constraints/animation/ColorAnimationComponent;
        //   261: ifeq            292
        //   264: aload           color
        //   266: checkcast       Lgg/essential/elementa/constraints/animation/ColorAnimationComponent;
        //   269: invokevirtual   gg/essential/elementa/constraints/animation/ColorAnimationComponent.isComplete:()Z
        //   272: ifeq            290
        //   275: aload_0         /* this */
        //   276: aload           color
        //   278: checkcast       Lgg/essential/elementa/constraints/animation/ColorAnimationComponent;
        //   281: invokevirtual   gg/essential/elementa/constraints/animation/ColorAnimationComponent.getNewConstraint:()Lgg/essential/elementa/constraints/ColorConstraint;
        //   284: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   287: goto            292
        //   290: iconst_1       
        //   291: istore_1        /* anyLeftAnimating */
        //   292: aload_0         /* this */
        //   293: getfield        gg/essential/elementa/constraints/animation/AnimatingConstraints.extraDelayFrames:I
        //   296: ifle            315
        //   299: iconst_1       
        //   300: istore_1        /* anyLeftAnimating */
        //   301: aload_0         /* this */
        //   302: getfield        gg/essential/elementa/constraints/animation/AnimatingConstraints.extraDelayFrames:I
        //   305: istore          9
        //   307: aload_0         /* this */
        //   308: iload           9
        //   310: iconst_m1      
        //   311: iadd           
        //   312: putfield        gg/essential/elementa/constraints/animation/AnimatingConstraints.extraDelayFrames:I
        //   315: iload_1         /* anyLeftAnimating */
        //   316: ifne            435
        //   319: aload_0         /* this */
        //   320: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getComponent:()Lgg/essential/elementa/UIComponent;
        //   323: new             Lgg/essential/elementa/UIConstraints;
        //   326: dup            
        //   327: aload_0         /* this */
        //   328: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getComponent:()Lgg/essential/elementa/UIComponent;
        //   331: invokespecial   gg/essential/elementa/UIConstraints.<init>:(Lgg/essential/elementa/UIComponent;)V
        //   334: astore          9
        //   336: aload           9
        //   338: astore          10
        //   340: astore          12
        //   342: iconst_0       
        //   343: istore          $i$a$-apply-AnimatingConstraints$animationFrame$1
        //   345: aload           $this$animationFrame_u24lambda_u2d10
        //   347: aload_0         /* this */
        //   348: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getX:()Lgg/essential/elementa/constraints/XConstraint;
        //   351: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   354: aload           $this$animationFrame_u24lambda_u2d10
        //   356: aload_0         /* this */
        //   357: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getY:()Lgg/essential/elementa/constraints/YConstraint;
        //   360: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   363: aload           $this$animationFrame_u24lambda_u2d10
        //   365: aload_0         /* this */
        //   366: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getWidth:()Lgg/essential/elementa/constraints/WidthConstraint;
        //   369: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   372: aload           $this$animationFrame_u24lambda_u2d10
        //   374: aload_0         /* this */
        //   375: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getHeight:()Lgg/essential/elementa/constraints/HeightConstraint;
        //   378: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   381: aload           $this$animationFrame_u24lambda_u2d10
        //   383: aload_0         /* this */
        //   384: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getRadius:()Lgg/essential/elementa/constraints/RadiusConstraint;
        //   387: invokevirtual   gg/essential/elementa/UIConstraints.setRadius:(Lgg/essential/elementa/constraints/RadiusConstraint;)V
        //   390: aload           $this$animationFrame_u24lambda_u2d10
        //   392: aload_0         /* this */
        //   393: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getTextScale:()Lgg/essential/elementa/constraints/HeightConstraint;
        //   396: invokevirtual   gg/essential/elementa/UIConstraints.setTextScale:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   399: aload           $this$animationFrame_u24lambda_u2d10
        //   401: aload_0         /* this */
        //   402: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getColor:()Lgg/essential/elementa/constraints/ColorConstraint;
        //   405: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   408: aload           $this$animationFrame_u24lambda_u2d10
        //   410: aload_0         /* this */
        //   411: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.getFontProvider:()Lgg/essential/elementa/font/FontProvider;
        //   414: invokevirtual   gg/essential/elementa/UIConstraints.setFontProvider:(Lgg/essential/elementa/font/FontProvider;)V
        //   417: nop            
        //   418: aload           12
        //   420: aload           9
        //   422: invokevirtual   gg/essential/elementa/UIComponent.setConstraints:(Lgg/essential/elementa/UIConstraints;)V
        //   425: aload_0         /* this */
        //   426: getfield        gg/essential/elementa/constraints/animation/AnimatingConstraints.completeAction:Lkotlin/jvm/functions/Function0;
        //   429: invokeinterface kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
        //   434: pop            
        //   435: return         
        //    StackMapTable: 00 10 FD 00 2A 01 07 00 C2 01 FC 00 23 07 00 D3 01 FC 00 27 07 00 E1 01 FC 00 27 07 00 EF 01 FC 00 27 07 00 FD 01 FC 00 27 07 00 EF 01 FC 00 27 07 01 10 01 16 FB 00 77
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setXAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final XConstraint newConstraint) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        return setXAnimation$default(this, strategy, time, newConstraint, 0.0f, 8, null);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setYAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final YConstraint newConstraint) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        return setYAnimation$default(this, strategy, time, newConstraint, 0.0f, 8, null);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setWidthAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final WidthConstraint newConstraint) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        return setWidthAnimation$default(this, strategy, time, newConstraint, 0.0f, 8, null);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setHeightAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final HeightConstraint newConstraint) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        return setHeightAnimation$default(this, strategy, time, newConstraint, 0.0f, 8, null);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setRadiusAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final RadiusConstraint newConstraint) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        return setRadiusAnimation$default(this, strategy, time, newConstraint, 0.0f, 8, null);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setTextScaleAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final HeightConstraint newConstraint) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        return setTextScaleAnimation$default(this, strategy, time, newConstraint, 0.0f, 8, null);
    }
    
    @JvmOverloads
    @NotNull
    public final AnimatingConstraints setColorAnimation(@NotNull final AnimationStrategy strategy, final float time, @NotNull final ColorConstraint newConstraint) {
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newConstraint, "newConstraint");
        return setColorAnimation$default(this, strategy, time, newConstraint, 0.0f, 8, null);
    }
}
