package gg.essential.model;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.*;
import gg.essential.model.molang.*;
import kotlin.ranges.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J$\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0015H\u0002J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019R\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c" }, d2 = { "Lgg/essential/model/ModelAnimationState;", "", "entity", "Lgg/essential/model/molang/MolangQueryEntity;", "(Lgg/essential/model/molang/MolangQueryEntity;)V", "active", "", "Lgg/essential/model/ModelAnimationState$AnimationState;", "getActive", "()Ljava/util/List;", "getEntity", "()Lgg/essential/model/molang/MolangQueryEntity;", "apply", "", "model", "Lgg/essential/model/Bone;", "affectPose", "", "findAndResetBones", "bone", "map", "", "", "startAnimation", "animation", "Lgg/essential/model/Animation;", "stopAnimation", "AnimationState", "cosmetics" })
public final class ModelAnimationState
{
    @NotNull
    private final MolangQueryEntity entity;
    @NotNull
    private final List<AnimationState> active;
    
    public ModelAnimationState(@NotNull final MolangQueryEntity entity) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        super();
        this.entity = entity;
        this.active = new ArrayList<AnimationState>();
    }
    
    @NotNull
    public final MolangQueryEntity getEntity() {
        return this.entity;
    }
    
    @NotNull
    public final List<AnimationState> getActive() {
        return this.active;
    }
    
    public final void startAnimation(@NotNull final Animation animation) {
        Intrinsics.checkNotNullParameter((Object)animation, "animation");
        final Iterable $this$any$iv = this.active;
        boolean b = false;
        Label_0085: {
            if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                b = false;
            }
            else {
                for (final Object element$iv : $this$any$iv) {
                    final AnimationState it = (AnimationState)element$iv;
                    if (Intrinsics.areEqual((Object)it.getAnimation(), (Object)animation)) {
                        b = true;
                        break Label_0085;
                    }
                }
                b = false;
            }
        }
        if (b) {
            return;
        }
        this.active.add(new AnimationState(animation));
    }
    
    private final void findAndResetBones(final Bone bone, final Map<String, Bone> map) {
        map.put(bone.boxName, bone);
        bone.resetAnimationOffsets(false);
        if (bone.childModels != null) {
            for (final Bone childModel : bone.childModels) {
                this.findAndResetBones(childModel, map);
            }
        }
    }
    
    public final void apply(@NotNull final Bone model, final boolean affectPose) {
        Intrinsics.checkNotNullParameter((Object)model, "model");
        final Map bones = new LinkedHashMap();
        this.findAndResetBones(model, bones);
        for (final AnimationState state : this.active) {
            for (final Map.Entry<String, V> entry : state.getAnimation().getBones().entrySet()) {
                final String boneName = entry.getKey();
                final Channels channels = (Channels)entry.getValue();
                final Bone bone2 = bones.get(boneName);
                if (bone2 == null) {
                    continue;
                }
                final Bone bone = bone2;
                if (bone.getAffectsPose() != affectPose) {
                    continue;
                }
                final Keyframes position = channels.getPosition();
                if (position != null) {
                    final Triple<Float, Float, Float> eval = position.eval(state.getContext());
                    if (eval != null) {
                        final Triple<Float, Float, Float> triple = eval;
                        final float x = ((Number)triple.component1()).floatValue();
                        final float y = ((Number)triple.component2()).floatValue();
                        final float z = ((Number)triple.component3()).floatValue();
                        bone.animOffsetX += x;
                        bone.animOffsetY += y;
                        bone.animOffsetZ += z;
                    }
                }
                final Keyframes rotation = channels.getRotation();
                if (rotation != null) {
                    final Triple<Float, Float, Float> eval2 = rotation.eval(state.getContext());
                    if (eval2 != null) {
                        final Triple<Float, Float, Float> triple2 = eval2;
                        final float x = ((Number)triple2.component1()).floatValue();
                        final float y = ((Number)triple2.component2()).floatValue();
                        final float z = ((Number)triple2.component3()).floatValue();
                        bone.setAnimRotX((float)(x / 180.0f * 3.141592653589793));
                        bone.setAnimRotY((float)(y / 180.0f * 3.141592653589793));
                        bone.setAnimRotZ((float)(z / 180.0f * 3.141592653589793));
                    }
                }
                final Keyframes scale = channels.getScale();
                if (scale == null) {
                    continue;
                }
                final Triple<Float, Float, Float> eval3 = scale.eval(state.getContext());
                if (eval3 == null) {
                    continue;
                }
                final Triple<Float, Float, Float> triple3 = eval3;
                final float x = ((Number)triple3.component1()).floatValue();
                final float y = ((Number)triple3.component2()).floatValue();
                final float z = ((Number)triple3.component3()).floatValue();
                bone.setAnimScaleX(bone.getAnimScaleX() * x);
                bone.setAnimScaleY(bone.getAnimScaleY() * y);
                bone.setAnimScaleZ(bone.getAnimScaleZ() * z);
            }
        }
    }
    
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
}
