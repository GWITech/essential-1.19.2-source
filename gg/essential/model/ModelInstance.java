package gg.essential.model;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.model.molang.*;
import kotlin.jvm.internal.*;
import gg.essential.cosmetics.boxmask.*;
import java.util.*;
import gg.essential.model.backend.*;
import gg.essential.model.util.*;
import kotlin.collections.*;
import kotlin.ranges.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$J\u0010\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002J\u0014\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020!0\u000fJ\u001e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020\u0010J\u000e\u00103\u001a\u00020,2\u0006\u00105\u001a\u00020\u001cJ\u000e\u00106\u001a\u00020,2\u0006\u00105\u001a\u00020\u001cJ\u0006\u00107\u001a\u00020,R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0012¨\u00068" }, d2 = { "Lgg/essential/model/ModelInstance;", "", "model", "Lgg/essential/model/BedrockModel;", "entity", "Lgg/essential/model/molang/MolangQueryEntity;", "(Lgg/essential/model/BedrockModel;Lgg/essential/model/molang/MolangQueryEntity;)V", "animationOffsets", "", "", "animationState", "Lgg/essential/model/ModelAnimationState;", "getAnimationState", "()Lgg/essential/model/ModelAnimationState;", "animations", "", "Lgg/essential/model/Animation;", "getAnimations", "()Ljava/util/List;", "currentLifetimeOffset", "getEntity", "()Lgg/essential/model/molang/MolangQueryEntity;", "lastTextureAdjustment", "getModel", "()Lgg/essential/model/BedrockModel;", "modelClipper", "Lgg/essential/cosmetics/boxmask/ModelClipper;", "modelName", "", "mostRecentLifetime", "mostRecentSync", "", "renderExclusions", "Lgg/essential/model/Box3;", "getRenderExclusions", "computePose", "Lgg/essential/model/backend/PlayerPose;", "basePose", "getAdjustedLifetime", "lifetime", "getRootBone", "Lgg/essential/model/Bone;", "exclusionsFromOtherCosmetics", "render", "", "matrixStack", "Lgg/essential/model/util/UMatrixStack;", "vertexConsumerProvider", "Lgg/essential/model/backend/RenderBackend$VertexConsumerProvider;", "renderMetadata", "Lgg/essential/model/RenderMetadata;", "startAnimation", "animation", "name", "stopAnimation", "syncTextureStart", "cosmetics" })
public final class ModelInstance
{
    @NotNull
    private final BedrockModel model;
    @NotNull
    private final ModelAnimationState animationState;
    @Nullable
    private final String modelName;
    @NotNull
    private final ModelClipper modelClipper;
    @NotNull
    private final List<Float> animationOffsets;
    private float mostRecentLifetime;
    private long mostRecentSync;
    private float currentLifetimeOffset;
    private float lastTextureAdjustment;
    
    public ModelInstance(@NotNull final BedrockModel model, @NotNull final MolangQueryEntity entity) {
        Intrinsics.checkNotNullParameter((Object)model, "model");
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        super();
        this.model = model;
        this.animationState = new ModelAnimationState(entity);
        this.modelName = this.model.getCosmetic().getDisplayName("en_us");
        this.modelClipper = new CachingModelClipper(new ModelClipperImpl());
        this.animationOffsets = new ArrayList<Float>();
    }
    
    @NotNull
    public final BedrockModel getModel() {
        return this.model;
    }
    
    @NotNull
    public final ModelAnimationState getAnimationState() {
        return this.animationState;
    }
    
    public final void startAnimation(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        final Animation animationByName = this.model.getAnimationByName(name);
        if (animationByName == null) {
            System.out.println((Object)("Animation '" + name + "' not found for " + this.modelName));
            return;
        }
        this.startAnimation(animationByName);
    }
    
    public final void startAnimation(@NotNull final Animation animation) {
        Intrinsics.checkNotNullParameter((Object)animation, "animation");
        this.animationState.startAnimation(animation);
    }
    
    @NotNull
    public final MolangQueryEntity getEntity() {
        return this.animationState.getEntity();
    }
    
    @NotNull
    public final List<Box3> getRenderExclusions() {
        return this.model.boundingBoxes;
    }
    
    @NotNull
    public final PlayerPose computePose(@NotNull final PlayerPose basePose) {
        Intrinsics.checkNotNullParameter((Object)basePose, "basePose");
        final Iterable $this$none$iv = this.animationState.getActive();
        boolean b = false;
        Label_0087: {
            if ($this$none$iv instanceof Collection && ((Collection)$this$none$iv).isEmpty()) {
                b = true;
            }
            else {
                for (final Object element$iv : $this$none$iv) {
                    final ModelAnimationState.AnimationState it = (ModelAnimationState.AnimationState)element$iv;
                    if (it.getAnimation().getAffectsPose()) {
                        b = false;
                        break Label_0087;
                    }
                }
                b = true;
            }
        }
        if (b) {
            return basePose;
        }
        this.animationState.apply(this.model.getRootBone(), true);
        this.model.applyPose(this.model.getRootBone(), basePose);
        return this.model.retrievePose(this.model.getRootBone(), basePose);
    }
    
    public final void render(@NotNull final UMatrixStack matrixStack, @NotNull final RenderBackend.VertexConsumerProvider vertexConsumerProvider, @NotNull final RenderMetadata renderMetadata) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)vertexConsumerProvider, "vertexConsumerProvider");
        Intrinsics.checkNotNullParameter((Object)renderMetadata, "renderMetadata");
        this.mostRecentSync = InstantKt.now().toEpochMilli();
        this.mostRecentLifetime = this.getEntity().getLifeTime();
        final List exclusionsFromOtherCosmetics = CollectionsKt.toMutableList((Collection)renderMetadata.getRenderExclusion());
        exclusionsFromOtherCosmetics.removeAll(this.model.boundingBoxes);
        final Bone rootBone = this.modelClipper.compute(this.model.getRootBone(), exclusionsFromOtherCosmetics);
        this.animationState.apply(rootBone, false);
        for (final Bone bone : this.model.getBones(rootBone)) {
            if (EnumPart.Companion.fromBoneName(bone.boxName) != null) {
                bone.userOffsetX = renderMetadata.getPositionAdjustment().x;
                bone.userOffsetY = renderMetadata.getPositionAdjustment().y;
                bone.userOffsetZ = renderMetadata.getPositionAdjustment().z;
            }
        }
        this.model.render(matrixStack, vertexConsumerProvider, rootBone, renderMetadata, this.getAdjustedLifetime(this.getEntity().getLifeTime()));
    }
    
    @NotNull
    public final Bone getRootBone(@NotNull final List<Box3> exclusionsFromOtherCosmetics) {
        Intrinsics.checkNotNullParameter((Object)exclusionsFromOtherCosmetics, "exclusionsFromOtherCosmetics");
        return this.modelClipper.compute(this.model.getRootBone(), exclusionsFromOtherCosmetics);
    }
    
    private final float getAdjustedLifetime(final float lifetime) {
        if (this.animationOffsets.isEmpty()) {
            return lifetime;
        }
        float totalValues = 0.0f;
        float totalEntries = 0.0f;
        final Iterator<Float> iterator = this.animationOffsets.iterator();
        while (iterator.hasNext()) {
            final float animationOffset = iterator.next().floatValue();
            totalValues += animationOffset;
            ++totalEntries;
        }
        final float targetOffsetTime = totalValues / totalEntries;
        final float totalAnimationTime = this.model.getTextureFrameCount() / 7.0f;
        final float deltaTimeBackwards = targetOffsetTime - (this.currentLifetimeOffset + totalAnimationTime);
        final float deltaTimeForwards = targetOffsetTime - this.currentLifetimeOffset;
        if (lifetime - this.lastTextureAdjustment > 0.05) {
            final float timeAdjustment = (Math.abs(deltaTimeBackwards) < Math.abs(deltaTimeForwards)) ? RangesKt.coerceIn(deltaTimeBackwards, -0.01f, 0.01f) : RangesKt.coerceIn(deltaTimeForwards, -0.01f, 0.01f);
            this.currentLifetimeOffset += timeAdjustment;
            this.lastTextureAdjustment = lifetime;
        }
        return lifetime + this.currentLifetimeOffset;
    }
    
    public final void syncTextureStart() {
        final int totalFrames = this.model.getTextureFrameCount();
        final float lifeTime = (InstantKt.now().toEpochMilli() - this.mostRecentSync) / 1000.0f + this.mostRecentLifetime;
        final int frame = (int)(lifeTime * 7.0f);
        final int completedFrames = frame % totalFrames;
        final float targetLifetimeOffset = (totalFrames - completedFrames) / 7.0f;
        if (this.animationOffsets.size() > 3) {
            CollectionsKt.removeFirst((List)this.animationOffsets);
        }
        this.animationOffsets.add(targetLifetimeOffset);
    }
}
