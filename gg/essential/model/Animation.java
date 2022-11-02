package gg.essential.model;

import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.model.file.*;
import org.jetbrains.annotations.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.model.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0002\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\rH\u00c6\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\rH\u00c6\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u00c6\u0001J\u0013\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'" }, d2 = { "Lgg/essential/model/Animation;", "", "name", "", "file", "Lgg/essential/model/file/AnimationFile$Animation;", "bones", "", "Lgg/essential/model/Bone;", "(Ljava/lang/String;Lgg/essential/model/file/AnimationFile$Animation;Ljava/util/List;)V", "animationLength", "", "holdOnLastFrame", "", "", "Lgg/essential/model/Channels;", "affectsPose", "(Ljava/lang/String;FZLjava/util/Map;Z)V", "getAffectsPose", "()Z", "getAnimationLength", "()F", "getBones", "()Ljava/util/Map;", "getHoldOnLastFrame", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "cosmetics" })
public final class Animation
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String name;
    private final float animationLength;
    private final boolean holdOnLastFrame;
    @NotNull
    private final Map<String, Channels> bones;
    private final boolean affectsPose;
    
    public Animation(@NotNull final String name, final float animationLength, final boolean holdOnLastFrame, @NotNull final Map<String, Channels> bones, final boolean affectsPose) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)bones, "bones");
        super();
        this.name = name;
        this.animationLength = animationLength;
        this.holdOnLastFrame = holdOnLastFrame;
        this.bones = bones;
        this.affectsPose = affectsPose;
    }
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    public final float getAnimationLength() {
        return this.animationLength;
    }
    
    public final boolean getHoldOnLastFrame() {
        return this.holdOnLastFrame;
    }
    
    @NotNull
    public final Map<String, Channels> getBones() {
        return this.bones;
    }
    
    public final boolean getAffectsPose() {
        return this.affectsPose;
    }
    
    public Animation(@NotNull final String name, @NotNull final AnimationFile.Animation file, @NotNull final List<Bone> bones) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "name"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* file */
        //     7: ldc             "file"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* bones */
        //    13: ldc             "bones"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload_0         /* this */
        //    19: aload_1         /* name */
        //    20: aload_2         /* file */
        //    21: invokevirtual   gg/essential/model/file/AnimationFile$Animation.getAnimationLength:()Ljava/lang/Float;
        //    24: dup            
        //    25: ifnull          34
        //    28: invokevirtual   java/lang/Float.floatValue:()F
        //    31: goto            45
        //    34: pop            
        //    35: getstatic       gg/essential/model/Animation.Companion:Lgg/essential/model/Animation$Companion;
        //    38: aload_2         /* file */
        //    39: invokevirtual   gg/essential/model/file/AnimationFile$Animation.getBones:()Ljava/util/Map;
        //    42: invokestatic    gg/essential/model/Animation$Companion.access$calcAnimationLength:(Lgg/essential/model/Animation$Companion;Ljava/util/Map;)F
        //    45: aload_2         /* file */
        //    46: invokevirtual   gg/essential/model/file/AnimationFile$Animation.getLoop:()Lgg/essential/model/file/AnimationFile$Loop;
        //    49: getstatic       gg/essential/model/file/AnimationFile$Loop.HoldOnLastFrame:Lgg/essential/model/file/AnimationFile$Loop;
        //    52: if_acmpne       59
        //    55: iconst_1       
        //    56: goto            60
        //    59: iconst_0       
        //    60: aload_2         /* file */
        //    61: invokevirtual   gg/essential/model/file/AnimationFile$Animation.getBones:()Ljava/util/Map;
        //    64: aload_3         /* bones */
        //    65: checkcast       Ljava/lang/Iterable;
        //    68: astore          4
        //    70: astore          12
        //    72: istore          11
        //    74: fstore          10
        //    76: astore          9
        //    78: astore          8
        //    80: aload           $this$any$iv
        //    82: instanceof      Ljava/util/Collection;
        //    85: ifeq            105
        //    88: aload           $this$any$iv
        //    90: checkcast       Ljava/util/Collection;
        //    93: invokeinterface java/util/Collection.isEmpty:()Z
        //    98: ifeq            105
        //   101: iconst_0       
        //   102: goto            178
        //   105: aload           $this$any$iv
        //   107: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   112: astore          5
        //   114: aload           5
        //   116: invokeinterface java/util/Iterator.hasNext:()Z
        //   121: ifeq            177
        //   124: aload           5
        //   126: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   131: astore          element$iv
        //   133: aload           element$iv
        //   135: checkcast       Lgg/essential/model/Bone;
        //   138: astore          it
        //   140: aload           it
        //   142: invokevirtual   gg/essential/model/Bone.getAffectsPose:()Z
        //   145: ifeq            169
        //   148: aload_2         /* file */
        //   149: invokevirtual   gg/essential/model/file/AnimationFile$Animation.getBones:()Ljava/util/Map;
        //   152: aload           it
        //   154: getfield        gg/essential/model/Bone.boxName:Ljava/lang/String;
        //   157: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   162: ifeq            169
        //   165: iconst_1       
        //   166: goto            170
        //   169: iconst_0       
        //   170: ifeq            114
        //   173: iconst_1       
        //   174: goto            178
        //   177: iconst_0       
        //   178: istore          13
        //   180: aload           8
        //   182: aload           9
        //   184: fload           10
        //   186: iload           11
        //   188: aload           12
        //   190: iload           13
        //   192: invokespecial   gg/essential/model/Animation.<init>:(Ljava/lang/String;FZLjava/util/Map;Z)V
        //   195: return         
        //    Signature:
        //  (Ljava/lang/String;Lgg/essential/model/file/AnimationFile$Animation;Ljava/util/List<Lgg/essential/model/Bone;>;)V
        //    MethodParameters:
        //  Name   Flags  
        //  -----  -----
        //  name   
        //  file   
        //  bones  
        //    StackMapTable: 00 0A FF 00 22 00 04 06 00 07 00 58 07 00 62 00 03 06 07 00 64 07 00 5D FF 00 0A 00 04 06 00 07 00 58 07 00 62 00 03 06 07 00 64 02 FF 00 0D 00 04 06 00 07 00 58 07 00 62 00 03 06 07 00 64 02 FF 00 00 00 04 06 00 07 00 58 07 00 62 00 04 06 07 00 64 02 01 FF 00 2C 00 0D 06 00 07 00 58 00 07 00 78 00 00 00 06 07 00 64 02 01 07 00 7F 00 00 FF 00 08 00 0D 06 00 07 00 58 00 00 07 00 85 00 00 06 07 00 64 02 01 07 00 7F 00 00 36 40 01 FF 00 06 00 0D 06 00 00 00 00 00 00 00 06 07 00 64 02 01 07 00 7F 00 00 40 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Animation(name=" + this.name + ", animationLength=" + this.animationLength + ", holdOnLastFrame=" + this.holdOnLastFrame + ", bones=" + this.bones + ", affectsPose=" + this.affectsPose + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.name.hashCode();
        result = result * 31 + Float.hashCode(this.animationLength);
        final int n = result * 31;
        int holdOnLastFrame;
        if ((holdOnLastFrame = (this.holdOnLastFrame ? 1 : 0)) != 0) {
            holdOnLastFrame = 1;
        }
        result = n + holdOnLastFrame;
        result = result * 31 + this.bones.hashCode();
        final int n2 = result * 31;
        int affectsPose;
        if ((affectsPose = (this.affectsPose ? 1 : 0)) != 0) {
            affectsPose = 1;
        }
        result = n2 + affectsPose;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Animation)) {
            return false;
        }
        final Animation animation = (Animation)other;
        return Intrinsics.areEqual((Object)this.name, (Object)animation.name) && Intrinsics.areEqual((Object)this.animationLength, (Object)animation.animationLength) && this.holdOnLastFrame == animation.holdOnLastFrame && Intrinsics.areEqual((Object)this.bones, (Object)animation.bones) && this.affectsPose == animation.affectsPose;
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
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
}
