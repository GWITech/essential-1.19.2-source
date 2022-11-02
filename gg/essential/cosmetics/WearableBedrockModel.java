package gg.essential.cosmetics;

import gg.essential.model.molang.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.network.cosmetics.*;
import kotlin.jvm.internal.*;
import gg.essential.cosmetics.events.*;
import gg.essential.model.util.*;
import gg.essential.model.backend.*;
import gg.essential.model.*;
import kotlin.collections.*;
import kotlin.random.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00012B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rJ\u000e\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u000bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u00152\u0006\u0010#\u001a\u00020\u000bH\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0015H\u0002J\b\u0010'\u001a\u00020\fH\u0002J\u000e\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020*J\u001e\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063" }, d2 = { "Lgg/essential/cosmetics/WearableBedrockModel;", "", "bedrockModel", "Lgg/essential/model/BedrockModel;", "entity", "Lgg/essential/model/molang/MolangQueryEntity;", "animationTargets", "", "Lgg/essential/cosmetics/events/AnimationTarget;", "onAnimation", "Lkotlin/Function1;", "", "", "(Lgg/essential/model/BedrockModel;Lgg/essential/model/molang/MolangQueryEntity;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "animationStates", "Lgg/essential/cosmetics/WearableBedrockModel$AnimationEffectStates;", "cosmetic", "Lgg/essential/network/cosmetics/Cosmetic;", "getCosmetic", "()Lgg/essential/network/cosmetics/Cosmetic;", "highestPriority", "Lgg/essential/cosmetics/events/AnimationEvent;", "getHighestPriority", "()Lgg/essential/cosmetics/events/AnimationEvent;", "lastFrame", "", "model", "Lgg/essential/model/ModelInstance;", "getModel", "()Lgg/essential/model/ModelInstance;", "ongoingAnimations", "", "fireTriggerFromAnimation", "animationName", "getAnimationByName", "name", "handleProbability", "", "event", "maybeFireTextureAnimationStartEvent", "processEvent", "type", "Lgg/essential/cosmetics/events/AnimationEventType;", "render", "matrixStack", "Lgg/essential/model/util/UMatrixStack;", "vertexConsumerProvider", "Lgg/essential/model/backend/RenderBackend$VertexConsumerProvider;", "renderMetadata", "Lgg/essential/model/RenderMetadata;", "AnimationEffectStates", "cosmetics" })
public final class WearableBedrockModel
{
    @NotNull
    private final MolangQueryEntity entity;
    @NotNull
    private final Set<AnimationTarget> animationTargets;
    @NotNull
    private final Function1<String, Unit> onAnimation;
    @NotNull
    private final Cosmetic cosmetic;
    @NotNull
    private final ModelInstance model;
    @NotNull
    private final Set<AnimationEvent> ongoingAnimations;
    @NotNull
    private final AnimationEffectStates animationStates;
    private float lastFrame;
    
    public WearableBedrockModel(@NotNull final BedrockModel bedrockModel, @NotNull final MolangQueryEntity entity, @NotNull final Set<? extends AnimationTarget> animationTargets, @NotNull final Function1<? super String, Unit> onAnimation) {
        Intrinsics.checkNotNullParameter((Object)bedrockModel, "bedrockModel");
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        Intrinsics.checkNotNullParameter((Object)animationTargets, "animationTargets");
        Intrinsics.checkNotNullParameter((Object)onAnimation, "onAnimation");
        super();
        this.entity = entity;
        this.animationTargets = (Set<AnimationTarget>)animationTargets;
        this.onAnimation = (Function1<String, Unit>)onAnimation;
        this.cosmetic = bedrockModel.getCosmetic();
        this.model = new ModelInstance(bedrockModel, this.entity);
        this.ongoingAnimations = new LinkedHashSet<AnimationEvent>();
        this.animationStates = new AnimationEffectStates();
        this.processEvent(AnimationEventType.IDLE);
    }
    
    @NotNull
    public final Cosmetic getCosmetic() {
        return this.cosmetic;
    }
    
    @NotNull
    public final ModelInstance getModel() {
        return this.model;
    }
    
    public final void render(@NotNull final UMatrixStack matrixStack, @NotNull final RenderBackend.VertexConsumerProvider vertexConsumerProvider, @NotNull final RenderMetadata renderMetadata) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)vertexConsumerProvider, "vertexConsumerProvider");
        Intrinsics.checkNotNullParameter((Object)renderMetadata, "renderMetadata");
        this.maybeFireTextureAnimationStartEvent();
        final List onComplete = new ArrayList();
        CollectionsKt.removeAll((Iterable)this.ongoingAnimations, (Function1)new WearableBedrockModel$render.WearableBedrockModel$render$1(this, onComplete));
        this.ongoingAnimations.addAll(onComplete);
        final AnimationEvent highestPriority = this.getHighestPriority();
        CollectionsKt.removeAll((List)this.model.getAnimationState().getActive(), (Function1)new WearableBedrockModel$render.WearableBedrockModel$render$2(this, highestPriority));
        if (this.model.getAnimationState().getActive().isEmpty() && highestPriority != null) {
            this.model.startAnimation(highestPriority.getName());
        }
        this.model.render(matrixStack, vertexConsumerProvider, renderMetadata);
    }
    
    private final AnimationEvent getHighestPriority() {
        final Iterable $this$maxByOrNull$iv = this.ongoingAnimations;
        final Iterator iterator$iv = $this$maxByOrNull$iv.iterator();
        Object o;
        if (!iterator$iv.hasNext()) {
            o = null;
        }
        else {
            Object maxElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                o = maxElem$iv;
            }
            else {
                final AnimationEvent obj = (AnimationEvent)maxElem$iv;
                int maxValue$iv = obj.getPriority();
                do {
                    final Object e$iv = iterator$iv.next();
                    final AnimationEvent obj2 = (AnimationEvent)e$iv;
                    final int v$iv = obj2.getPriority();
                    if (maxValue$iv < v$iv) {
                        maxElem$iv = e$iv;
                        maxValue$iv = v$iv;
                    }
                } while (iterator$iv.hasNext());
                o = maxElem$iv;
            }
        }
        return (AnimationEvent)o;
    }
    
    private final AnimationEvent getAnimationByName(final String name) {
        for (final AnimationEvent ongoingAnimation : this.ongoingAnimations) {
            if (Intrinsics.areEqual((Object)ongoingAnimation.getName(), (Object)name)) {
                return ongoingAnimation;
            }
        }
        return null;
    }
    
    public final void processEvent(@NotNull final AnimationEventType type) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        final List animationEvents = this.model.getModel().getAnimationEvents();
        final AnimationEvent highestPriority2;
        final AnimationEvent highestPriority = highestPriority2 = this.getHighestPriority();
        final int priority = (highestPriority2 != null) ? highestPriority2.getPriority() : 0;
        for (final AnimationEvent event : animationEvents) {
            if (priority <= event.getPriority()) {
                if (event.getType() != type) {
                    continue;
                }
                if (event.getTarget() != AnimationTarget.ALL && !CollectionsKt.contains((Iterable)this.animationTargets, (Object)event.getTarget())) {
                    continue;
                }
                if (event.getSkips() != 0) {
                    Integer value;
                    if ((value = this.animationStates.getSkips().get(event)) == null) {
                        value = 0;
                    }
                    final int i = value + 1;
                    this.animationStates.getSkips().put(event, i);
                    if (i % event.getSkips() != 0) {
                        continue;
                    }
                }
                if (!this.handleProbability(event)) {
                    continue;
                }
                this.onAnimation.invoke((Object)event.getName());
                this.ongoingAnimations.add(event);
            }
        }
    }
    
    public final void fireTriggerFromAnimation(@NotNull final String animationName) {
        Intrinsics.checkNotNullParameter((Object)animationName, "animationName");
        if (Intrinsics.areEqual((Object)animationName, (Object)"texture_start")) {
            this.model.syncTextureStart();
            return;
        }
        for (final AnimationEvent animationEvent : this.model.getModel().getAnimationEvents()) {
            if (Intrinsics.areEqual((Object)animationEvent.getName(), (Object)animationName)) {
                this.ongoingAnimations.add(animationEvent);
                break;
            }
        }
    }
    
    private final void maybeFireTextureAnimationStartEvent() {
        final BedrockModel model = this.model.getModel();
        final int totalFrames = model.getTextureFrameCount();
        final int frame = (int)(this.entity.getLifeTime() * 7.0f);
        if (frame % totalFrames < this.lastFrame) {
            this.onAnimation.invoke((Object)"texture_start");
            this.processEvent(AnimationEventType.TEXTURE_ANIMATION_START);
        }
        this.lastFrame = (float)(frame % totalFrames);
    }
    
    private final boolean handleProbability(final AnimationEvent event) {
        return event.getProbability() > Random.Default.nextDouble();
    }
    
    public static final /* synthetic */ AnimationEvent access$getAnimationByName(final WearableBedrockModel $this, final String name) {
        return $this.getAnimationByName(name);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R6\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f" }, d2 = { "Lgg/essential/cosmetics/WearableBedrockModel$AnimationEffectStates;", "", "()V", "skips", "Ljava/util/HashMap;", "Lgg/essential/cosmetics/events/AnimationEvent;", "", "Lkotlin/collections/HashMap;", "getSkips", "()Ljava/util/HashMap;", "setSkips", "(Ljava/util/HashMap;)V", "cosmetics" })
    public static final class AnimationEffectStates
    {
        @NotNull
        private HashMap<AnimationEvent, Integer> skips;
        
        public AnimationEffectStates() {
            super();
            this.skips = new HashMap<AnimationEvent, Integer>();
        }
        
        @NotNull
        public final HashMap<AnimationEvent, Integer> getSkips() {
            return this.skips;
        }
    }
}
