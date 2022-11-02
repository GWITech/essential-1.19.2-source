package gg.essential.cosmetics;

import kotlin.jvm.functions.*;
import gg.essential.model.*;
import kotlin.*;
import gg.essential.cosmetics.events.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "<anonymous>", "", "animationState", "Lgg/essential/model/ModelAnimationState$AnimationState;", "Lgg/essential/model/ModelAnimationState;", "invoke", "(Lgg/essential/model/ModelAnimationState$AnimationState;)Ljava/lang/Boolean;" })
static final class WearableBedrockModel$render$2 extends Lambda implements Function1<ModelAnimationState.AnimationState, Boolean> {
    final /* synthetic */ WearableBedrockModel this$0;
    final /* synthetic */ AnimationEvent $highestPriority;
    
    WearableBedrockModel$render$2(final WearableBedrockModel $receiver, final AnimationEvent $highestPriority) {
        this.this$0 = $receiver;
        this.$highestPriority = $highestPriority;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final ModelAnimationState.AnimationState animationState) {
        Intrinsics.checkNotNullParameter((Object)animationState, "animationState");
        final AnimationEvent animationByName = WearableBedrockModel.access$getAnimationByName(this.this$0, animationState.getAnimation().getName());
        return animationByName != this.$highestPriority;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((ModelAnimationState.AnimationState)p1);
    }
}