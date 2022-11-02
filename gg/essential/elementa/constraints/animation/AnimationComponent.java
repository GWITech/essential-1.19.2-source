package gg.essential.elementa.constraints.animation;

import gg.essential.elementa.constraints.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u0019J\u0006\u0010\u001f\u001a\u00020\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010\u0082\u0001\u0007 !\"#$%&¨\u0006'" }, d2 = { "Lgg/essential/elementa/constraints/animation/AnimationComponent;", "T", "Lgg/essential/elementa/constraints/SuperConstraint;", "strategy", "Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "totalFrames", "", "delayFrames", "(Lgg/essential/elementa/constraints/animation/AnimationStrategy;II)V", "animationPaused", "", "getAnimationPaused", "()Z", "setAnimationPaused", "(Z)V", "getDelayFrames", "()I", "elapsedFrames", "getElapsedFrames", "setElapsedFrames", "(I)V", "getStrategy", "()Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "getTotalFrames", "animationFrame", "", "getPercentComplete", "", "isComplete", "pause", "resume", "stop", "Lgg/essential/elementa/constraints/animation/XAnimationComponent;", "Lgg/essential/elementa/constraints/animation/YAnimationComponent;", "Lgg/essential/elementa/constraints/animation/RadiusAnimationComponent;", "Lgg/essential/elementa/constraints/animation/WidthAnimationComponent;", "Lgg/essential/elementa/constraints/animation/HeightAnimationComponent;", "Lgg/essential/elementa/constraints/animation/ColorAnimationComponent;", "Lgg/essential/elementa/constraints/animation/FieldAnimationComponent;", "Elementa" })
public abstract class AnimationComponent<T> implements SuperConstraint<T>
{
    @NotNull
    private final AnimationStrategy strategy;
    private final int totalFrames;
    private final int delayFrames;
    private int elapsedFrames;
    private boolean animationPaused;
    
    private AnimationComponent(final AnimationStrategy strategy, final int totalFrames, final int delayFrames) {
        super();
        this.strategy = strategy;
        this.totalFrames = totalFrames;
        this.delayFrames = delayFrames;
    }
    
    @NotNull
    public final AnimationStrategy getStrategy() {
        return this.strategy;
    }
    
    public final int getTotalFrames() {
        return this.totalFrames;
    }
    
    public final int getDelayFrames() {
        return this.delayFrames;
    }
    
    public final int getElapsedFrames() {
        return this.elapsedFrames;
    }
    
    public final void setElapsedFrames(final int <set-?>) {
        this.elapsedFrames = <set-?>;
    }
    
    public final boolean getAnimationPaused() {
        return this.animationPaused;
    }
    
    public final void setAnimationPaused(final boolean <set-?>) {
        this.animationPaused = <set-?>;
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        if (this.isComplete() || this.animationPaused) {
            return;
        }
        ++this.elapsedFrames;
    }
    
    public final void stop() {
        this.elapsedFrames = this.totalFrames + this.delayFrames;
    }
    
    public final void pause() {
        this.animationPaused = true;
    }
    
    public final void resume() {
        this.animationPaused = false;
    }
    
    public final boolean isComplete() {
        return this.elapsedFrames - this.delayFrames >= this.totalFrames;
    }
    
    public final float getPercentComplete() {
        return this.strategy.getValue(Math.max(this.elapsedFrames - this.delayFrames, 0) / (float)this.totalFrames);
    }
    
    public AnimationComponent(final AnimationStrategy strategy, final int totalFrames, final int delayFrames, final DefaultConstructorMarker $constructor_marker) {
        this(strategy, totalFrames, delayFrames);
    }
}
