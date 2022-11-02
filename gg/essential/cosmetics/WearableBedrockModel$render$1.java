package gg.essential.cosmetics;

import kotlin.jvm.functions.*;
import gg.essential.cosmetics.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.model.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "ongoingAnimation", "Lgg/essential/cosmetics/events/AnimationEvent;", "invoke", "(Lgg/essential/cosmetics/events/AnimationEvent;)Ljava/lang/Boolean;" })
static final class WearableBedrockModel$render$1 extends Lambda implements Function1<AnimationEvent, Boolean> {
    final /* synthetic */ WearableBedrockModel this$0;
    final /* synthetic */ List<AnimationEvent> $onComplete;
    
    WearableBedrockModel$render$1(final WearableBedrockModel $receiver, final List<AnimationEvent> $onComplete) {
        this.this$0 = $receiver;
        this.$onComplete = $onComplete;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final AnimationEvent ongoingAnimation) {
        Intrinsics.checkNotNullParameter((Object)ongoingAnimation, "ongoingAnimation");
        for (final ModelAnimationState.AnimationState animationState : this.this$0.getModel().getAnimationState().getActive()) {
            if (Intrinsics.areEqual((Object)animationState.getAnimation().getName(), (Object)ongoingAnimation.getName()) && ongoingAnimation.getLoops() > 0) {
                final boolean remove = animationState.getAnimTime() > animationState.getAnimation().getAnimationLength() * ongoingAnimation.getLoops();
                if (remove && ongoingAnimation.getOnComplete() != null) {
                    this.$onComplete.add(ongoingAnimation.getOnComplete());
                }
                return remove;
            }
        }
        return false;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((AnimationEvent)p1);
    }
}