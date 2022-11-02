package gg.essential.model;

import gg.essential.model.file.*;
import gg.essential.model.util.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import gg.essential.model.molang.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.*;

@Serializable(with = KeyframesSerializer.class)
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J$\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018" }, d2 = { "Lgg/essential/model/Keyframes;", "", "frames", "Lgg/essential/model/util/TreeMap;", "", "Lgg/essential/model/Keyframe;", "(Lgg/essential/model/util/TreeMap;)V", "getFrames", "()Lgg/essential/model/util/TreeMap;", "component1", "copy", "equals", "", "other", "eval", "Lkotlin/Triple;", "Lgg/essential/model/FloatVector;", "context", "Lgg/essential/model/molang/MolangContext;", "hashCode", "", "toString", "", "Companion", "cosmetics" })
public final class Keyframes
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final TreeMap<Float, Keyframe> frames;
    
    public Keyframes(@NotNull final TreeMap<Float, Keyframe> frames) {
        Intrinsics.checkNotNullParameter((Object)frames, "frames");
        super();
        this.frames = frames;
    }
    
    @NotNull
    public final TreeMap<Float, Keyframe> getFrames() {
        return this.frames;
    }
    
    @NotNull
    public final Triple<Float, Float, Float> eval(@NotNull final MolangContext context) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        final float animTime = context.getQuery().getAnimLoopTime();
        final Map.Entry floor = this.frames.floorEntry(animTime);
        final Map.Entry ceil = this.frames.ceilingEntry(animTime);
        final Map.Entry entry = floor;
        Triple eval = null;
        Label_0080: {
            if (entry != null) {
                final Keyframe keyframe = (Keyframe)entry.getValue();
                if (keyframe != null) {
                    final Triple<MolangExpression, MolangExpression, MolangExpression> post = keyframe.getPost();
                    if (post != null) {
                        eval = AnimationKt.eval(post, context);
                        break Label_0080;
                    }
                }
            }
            eval = null;
        }
        final Triple floorValue = eval;
        final Map.Entry entry2 = ceil;
        Triple eval2 = null;
        Label_0116: {
            if (entry2 != null) {
                final Keyframe keyframe2 = (Keyframe)entry2.getValue();
                if (keyframe2 != null) {
                    final Triple<MolangExpression, MolangExpression, MolangExpression> pre = keyframe2.getPre();
                    if (pre != null) {
                        eval2 = AnimationKt.eval(pre, context);
                        break Label_0116;
                    }
                }
            }
            eval2 = null;
        }
        final Triple ceilValue = eval2;
        Triple catmullRom;
        if (floorValue == null) {
            Intrinsics.checkNotNull((Object)(catmullRom = ceilValue));
        }
        else if (ceilValue == null) {
            catmullRom = floorValue;
        }
        else if (Intrinsics.areEqual((Object)floor, (Object)ceil)) {
            catmullRom = floorValue;
        }
        else if (floor.getValue().getSmooth() || ceil.getValue().getSmooth()) {
            final Map.Entry beforeFloor = this.frames.lowerEntry((Float)floor.getKey());
            final Map.Entry afterCeil = this.frames.higherEntry((Float)ceil.getKey());
            final Map.Entry entry3 = beforeFloor;
            Triple eval3 = null;
            Label_0259: {
                if (entry3 != null) {
                    final Keyframe keyframe3 = (Keyframe)entry3.getValue();
                    if (keyframe3 != null) {
                        final Triple<MolangExpression, MolangExpression, MolangExpression> post2 = keyframe3.getPost();
                        if (post2 != null) {
                            eval3 = AnimationKt.eval(post2, context);
                            break Label_0259;
                        }
                    }
                }
                eval3 = floorValue;
            }
            final Triple beforeFloorValue = eval3;
            final Map.Entry entry4 = afterCeil;
            Triple eval4 = null;
            Label_0296: {
                if (entry4 != null) {
                    final Keyframe keyframe4 = (Keyframe)entry4.getValue();
                    if (keyframe4 != null) {
                        final Triple<MolangExpression, MolangExpression, MolangExpression> post3 = keyframe4.getPost();
                        if (post3 != null) {
                            eval4 = AnimationKt.eval(post3, context);
                            break Label_0296;
                        }
                    }
                }
                eval4 = ceilValue;
            }
            final Triple afterCeilValue = eval4;
            final float t = (animTime - floor.getKey().floatValue()) / (ceil.getKey().floatValue() - floor.getKey().floatValue());
            catmullRom = AnimationKt.catmullRom(t, (Triple<Float, Float, Float>)beforeFloorValue, (Triple<Float, Float, Float>)floorValue, (Triple<Float, Float, Float>)ceilValue, (Triple<Float, Float, Float>)afterCeilValue);
        }
        else {
            catmullRom = (Intrinsics.areEqual((Object)floorValue, (Object)ceilValue) ? floorValue : AnimationKt.lerp((Triple<Float, Float, Float>)floorValue, (Triple<Float, Float, Float>)ceilValue, (animTime - floor.getKey().floatValue()) / (ceil.getKey().floatValue() - floor.getKey().floatValue())));
        }
        return (Triple<Float, Float, Float>)catmullRom;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Keyframes(frames=" + this.frames + ')';
    }
    
    @Override
    public int hashCode() {
        return this.frames.hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof Keyframes && Intrinsics.areEqual((Object)this.frames, (Object)((Keyframes)other).frames));
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/Keyframes$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/Keyframes;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<Keyframes> serializer() {
            return (KSerializer<Keyframes>)new KeyframesSerializer();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
