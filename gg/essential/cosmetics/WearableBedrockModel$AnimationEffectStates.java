package gg.essential.cosmetics;

import kotlin.*;
import java.util.*;
import gg.essential.cosmetics.events.*;
import org.jetbrains.annotations.*;

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
