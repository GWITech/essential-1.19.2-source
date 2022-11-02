package gg.essential.model;

import kotlin.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.model.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¨\u0006\b" }, d2 = { "Lgg/essential/model/Animation$Companion;", "", "()V", "calcAnimationLength", "", "", "", "Lgg/essential/model/Channels;", "cosmetics" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    private final float calcAnimationLength(final Map<String, Channels> $this$calcAnimationLength) {
        final Iterator iterator = $this$calcAnimationLength.entrySet().iterator();
        Float value;
        Float n;
        if (!iterator.hasNext()) {
            n = (value = null);
        }
        else {
            final Channels channels = ((Map.Entry<K, Channels>)iterator.next()).getValue();
            final Iterator iterator2 = CollectionsKt.listOf((Object[])new Keyframes[] { channels.getPosition(), channels.getRotation(), channels.getScale() }).iterator();
            Float value2;
            Float n2;
            if (!iterator2.hasNext()) {
                n2 = (value2 = null);
            }
            else {
                final Keyframes keyframes;
                final Keyframes it = keyframes = (Keyframes)iterator2.next();
                float floatValue = 0.0f;
                Label_0154: {
                    if (keyframes != null) {
                        final TreeMap<Float, Keyframe> frames = keyframes.getFrames();
                        if (frames != null) {
                            final Float n3 = frames.lastKey();
                            if (n3 != null) {
                                floatValue = n3;
                                break Label_0154;
                            }
                        }
                    }
                    floatValue = 0.0f;
                }
                float max = floatValue;
                while (iterator2.hasNext()) {
                    final Keyframes keyframes2;
                    final Keyframes it2 = keyframes2 = (Keyframes)iterator2.next();
                    float floatValue2 = 0.0f;
                    Label_0209: {
                        if (keyframes2 != null) {
                            final TreeMap<Float, Keyframe> frames2 = keyframes2.getFrames();
                            if (frames2 != null) {
                                final Float n4 = frames2.lastKey();
                                if (n4 != null) {
                                    floatValue2 = n4;
                                    break Label_0209;
                                }
                            }
                        }
                        floatValue2 = 0.0f;
                    }
                    max = Math.max(max, floatValue2);
                }
                n2 = (value2 = max);
            }
            float max2 = (value2 != null) ? n2 : 0.0f;
            while (iterator.hasNext()) {
                final Channels channels2 = ((Map.Entry<K, Channels>)iterator.next()).getValue();
                final Iterator iterator3 = CollectionsKt.listOf((Object[])new Keyframes[] { channels2.getPosition(), channels2.getRotation(), channels2.getScale() }).iterator();
                Float value3;
                Float n5;
                if (!iterator3.hasNext()) {
                    n5 = (value3 = null);
                }
                else {
                    final Keyframes keyframes3;
                    final Keyframes it2 = keyframes3 = (Keyframes)iterator3.next();
                    float floatValue3 = 0.0f;
                    Label_0378: {
                        if (keyframes3 != null) {
                            final TreeMap<Float, Keyframe> frames3 = keyframes3.getFrames();
                            if (frames3 != null) {
                                final Float n6 = frames3.lastKey();
                                if (n6 != null) {
                                    floatValue3 = n6;
                                    break Label_0378;
                                }
                            }
                        }
                        floatValue3 = 0.0f;
                    }
                    float max3 = floatValue3;
                    while (iterator3.hasNext()) {
                        final Keyframes keyframes4;
                        final Keyframes it3 = keyframes4 = (Keyframes)iterator3.next();
                        float floatValue4 = 0.0f;
                        Label_0433: {
                            if (keyframes4 != null) {
                                final TreeMap<Float, Keyframe> frames4 = keyframes4.getFrames();
                                if (frames4 != null) {
                                    final Float n7 = frames4.lastKey();
                                    if (n7 != null) {
                                        floatValue4 = n7;
                                        break Label_0433;
                                    }
                                }
                            }
                            floatValue4 = 0.0f;
                        }
                        max3 = Math.max(max3, floatValue4);
                    }
                    n5 = (value3 = max3);
                }
                max2 = Math.max(max2, (value3 != null) ? ((float)n5) : 0.0f);
            }
            n = (value = max2);
        }
        return (value != null) ? n : 0.0f;
    }
    
    public static final /* synthetic */ float access$calcAnimationLength(final Companion $this, final Map $receiver) {
        return $this.calcAnimationLength($receiver);
    }
    
    public Companion(final byte b) {
        this();
    }
}
