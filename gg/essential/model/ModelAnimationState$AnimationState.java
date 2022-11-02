package gg.essential.model;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.model.molang.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\tR\u0012\u0010\u0015\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0012\u0010\u0017\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019" }, d2 = { "Lgg/essential/model/ModelAnimationState$AnimationState;", "Lgg/essential/model/molang/MolangQuery;", "Lgg/essential/model/molang/MolangQueryEntity;", "animation", "Lgg/essential/model/Animation;", "(Lgg/essential/model/ModelAnimationState;Lgg/essential/model/Animation;)V", "animLoopTime", "", "getAnimLoopTime", "()F", "animStartTime", "animTime", "getAnimTime", "getAnimation", "()Lgg/essential/model/Animation;", "context", "Lgg/essential/model/molang/MolangContext;", "getContext", "()Lgg/essential/model/molang/MolangContext;", "lifeTime", "getLifeTime", "modifiedDistanceMoved", "getModifiedDistanceMoved", "modifiedMoveSpeed", "getModifiedMoveSpeed", "cosmetics" })
public final class AnimationState implements MolangQuery
{
    @NotNull
    private final Animation animation;
    private final /* synthetic */ MolangQueryEntity $$delegate_0;
    @NotNull
    private final MolangContext context;
    private final float animStartTime;
    final /* synthetic */ ModelAnimationState this$0;
    
    public AnimationState(@NotNull final ModelAnimationState this$0, final Animation animation) {
        Intrinsics.checkNotNullParameter((Object)animation, "animation");
        this.this$0 = this$0;
        super();
        this.animation = animation;
        this.$$delegate_0 = this.this$0.getEntity();
        this.context = new MolangContext(this);
        this.animStartTime = this.this$0.getEntity().getLifeTime();
    }
    
    @NotNull
    public final Animation getAnimation() {
        return this.animation;
    }
    
    @Override
    public float getLifeTime() {
        return this.$$delegate_0.getLifeTime();
    }
    
    @Override
    public float getModifiedDistanceMoved() {
        return this.$$delegate_0.getModifiedDistanceMoved();
    }
    
    @Override
    public float getModifiedMoveSpeed() {
        return this.$$delegate_0.getModifiedMoveSpeed();
    }
    
    @NotNull
    public final MolangContext getContext() {
        return this.context;
    }
    
    @Override
    public float getAnimTime() {
        return this.this$0.getEntity().getLifeTime() - this.animStartTime;
    }
    
    @Override
    public float getAnimLoopTime() {
        return this.animation.getHoldOnLastFrame() ? RangesKt.coerceAtMost(this.getAnimTime(), this.animation.getAnimationLength()) : (this.getAnimTime() % this.animation.getAnimationLength());
    }
}
