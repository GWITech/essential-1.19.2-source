package gg.essential.model;

import gg.essential.network.cosmetics.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import gg.essential.cosmetics.events.*;
import gg.essential.model.file.*;
import kotlin.jvm.internal.*;
import gg.essential.model.backend.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.lib.kotgl.matrix.matrices.*;
import gg.essential.model.util.*;
import gg.essential.lib.kotgl.matrix.matrices.mutables.*;
import gg.essential.lib.kotgl.matrix.vectors.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.mod.*;
import kotlin.coroutines.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 M2\u00020\u0001:\u0002MNB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0016\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200J \u00101\u001a\u00020.2\u0006\u0010/\u001a\u0002022\u0006\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u0004\u0018\u00010\u00132\u0006\u00107\u001a\u000208J\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0\f2\u0006\u00103\u001a\u00020\u001eJ6\u0010:\u001a\u00020.2\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002080>2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010>J.\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020.J\u0016\u0010K\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010L\u001a\u000200R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006O" }, d2 = { "Lgg/essential/model/BedrockModel;", "", "cosmetic", "Lgg/essential/network/cosmetics/Cosmetic;", "data", "Lgg/essential/model/file/ModelFile;", "animationData", "Lgg/essential/model/file/AnimationFile;", "texture", "Lgg/essential/model/backend/RenderBackend$Texture;", "(Lgg/essential/network/cosmetics/Cosmetic;Lgg/essential/model/file/ModelFile;Lgg/essential/model/file/AnimationFile;Lgg/essential/model/backend/RenderBackend$Texture;)V", "animationEvents", "", "Lgg/essential/cosmetics/events/AnimationEvent;", "getAnimationEvents", "()Ljava/util/List;", "setAnimationEvents", "(Ljava/util/List;)V", "animations", "Lgg/essential/model/Animation;", "getAnimations", "setAnimations", "boundingBoxes", "Lgg/essential/model/Box3;", "getCosmetic", "()Lgg/essential/network/cosmetics/Cosmetic;", "isContainsSideOption", "", "()Z", "rootBone", "Lgg/essential/model/Bone;", "getRootBone", "()Lgg/essential/model/Bone;", "setRootBone", "(Lgg/essential/model/Bone;)V", "getTexture", "()Lgg/essential/model/backend/RenderBackend$Texture;", "setTexture", "(Lgg/essential/model/backend/RenderBackend$Texture;)V", "textureFrameCount", "", "getTextureFrameCount", "()I", "setTextureFrameCount", "(I)V", "applyPose", "", "pose", "Lgg/essential/model/backend/PlayerPose;", "copy", "Lgg/essential/model/backend/PlayerPose$Part;", "bone", "offset", "Lgg/essential/model/BedrockModel$Offset;", "getAnimationByName", "name", "", "getBones", "propagateVisibilityToRootBone", "side", "Lgg/essential/model/Side;", "hiddenBones", "", "parts", "Lgg/essential/model/EnumPart;", "render", "matrixStack", "Lgg/essential/model/util/UMatrixStack;", "vertexConsumerProvider", "Lgg/essential/model/backend/RenderBackend$VertexConsumerProvider;", "metadata", "Lgg/essential/model/RenderMetadata;", "lifetime", "", "resetAngles", "retrievePose", "basePose", "Companion", "Offset", "cosmetics" })
public final class BedrockModel
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Cosmetic cosmetic;
    @Nullable
    private RenderBackend.Texture texture;
    @JvmField
    @NotNull
    public List<Box3> boundingBoxes;
    @NotNull
    private Bone rootBone;
    private int textureFrameCount;
    @NotNull
    private List<Animation> animations;
    @NotNull
    private List<AnimationEvent> animationEvents;
    private final boolean isContainsSideOption;
    @NotNull
    private static final Offset RIGHT_ARM;
    @NotNull
    private static final Offset LEFT_ARM;
    @NotNull
    private static final Offset LEFT_LEG;
    @NotNull
    private static final Offset RIGHT_LEG;
    @NotNull
    private static final Offset BODY;
    @NotNull
    private static final Offset HEAD;
    @NotNull
    private static final Map<EnumPart, Offset> OFFSETS;
    
    public BedrockModel(@NotNull final Cosmetic cosmetic, @Nullable final ModelFile data, @Nullable final AnimationFile animationData, @Nullable final RenderBackend.Texture texture) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "cosmetic"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* cosmetic */
        //    12: putfield        gg/essential/model/BedrockModel.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //    15: aload_0         /* this */
        //    16: aload           texture
        //    18: putfield        gg/essential/model/BedrockModel.texture:Lgg/essential/model/backend/RenderBackend$Texture;
        //    21: aload_0         /* this */
        //    22: iconst_1       
        //    23: putfield        gg/essential/model/BedrockModel.textureFrameCount:I
        //    26: aload_0         /* this */
        //    27: getfield        gg/essential/model/BedrockModel.texture:Lgg/essential/model/backend/RenderBackend$Texture;
        //    30: astore          texture
        //    32: aload_2         /* data */
        //    33: ifnull          119
        //    36: new             Lgg/essential/model/ModelParser;
        //    39: dup            
        //    40: aload_0         /* this */
        //    41: getfield        gg/essential/model/BedrockModel.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //    44: aload           texture
        //    46: dup            
        //    47: ifnull          58
        //    50: invokeinterface gg/essential/model/backend/RenderBackend$Texture.getWidth:()I
        //    55: goto            61
        //    58: pop            
        //    59: bipush          64
        //    61: aload           texture
        //    63: dup            
        //    64: ifnull          75
        //    67: invokeinterface gg/essential/model/backend/RenderBackend$Texture.getHeight:()I
        //    72: goto            78
        //    75: pop            
        //    76: bipush          64
        //    78: invokespecial   gg/essential/model/ModelParser.<init>:(Lgg/essential/network/cosmetics/Cosmetic;II)V
        //    81: astore          parser
        //    83: aload           parser
        //    85: aload_2         /* data */
        //    86: invokevirtual   gg/essential/model/ModelParser.parse:(Lgg/essential/model/file/ModelFile;)V
        //    89: aload_0         /* this */
        //    90: aload           parser
        //    92: invokevirtual   gg/essential/model/ModelParser.getRootBone:()Lgg/essential/model/Bone;
        //    95: putfield        gg/essential/model/BedrockModel.rootBone:Lgg/essential/model/Bone;
        //    98: aload_0         /* this */
        //    99: aload           parser
        //   101: invokevirtual   gg/essential/model/ModelParser.getBoundingBoxes:()Ljava/util/List;
        //   104: putfield        gg/essential/model/BedrockModel.boundingBoxes:Ljava/util/List;
        //   107: aload_0         /* this */
        //   108: aload           parser
        //   110: invokevirtual   gg/essential/model/ModelParser.getTextureFrameCount:()I
        //   113: putfield        gg/essential/model/BedrockModel.textureFrameCount:I
        //   116: goto            139
        //   119: aload_0         /* this */
        //   120: new             Lgg/essential/model/Bone;
        //   123: dup            
        //   124: ldc             "_root"
        //   126: invokespecial   gg/essential/model/Bone.<init>:(Ljava/lang/String;)V
        //   129: putfield        gg/essential/model/BedrockModel.rootBone:Lgg/essential/model/Bone;
        //   132: aload_0         /* this */
        //   133: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   136: putfield        gg/essential/model/BedrockModel.boundingBoxes:Ljava/util/List;
        //   139: aload_0         /* this */
        //   140: aload_0         /* this */
        //   141: aload_0         /* this */
        //   142: getfield        gg/essential/model/BedrockModel.rootBone:Lgg/essential/model/Bone;
        //   145: invokevirtual   gg/essential/model/BedrockModel.getBones:(Lgg/essential/model/Bone;)Ljava/util/List;
        //   148: checkcast       Ljava/lang/Iterable;
        //   151: astore          6
        //   153: astore          13
        //   155: aload           $this$any$iv
        //   157: instanceof      Ljava/util/Collection;
        //   160: ifeq            180
        //   163: aload           $this$any$iv
        //   165: checkcast       Ljava/util/Collection;
        //   168: invokeinterface java/util/Collection.isEmpty:()Z
        //   173: ifeq            180
        //   176: iconst_0       
        //   177: goto            236
        //   180: aload           $this$any$iv
        //   182: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   187: astore          7
        //   189: aload           7
        //   191: invokeinterface java/util/Iterator.hasNext:()Z
        //   196: ifeq            235
        //   199: aload           7
        //   201: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   206: astore          element$iv
        //   208: aload           element$iv
        //   210: checkcast       Lgg/essential/model/Bone;
        //   213: astore          it
        //   215: aload           it
        //   217: invokevirtual   gg/essential/model/Bone.getSide:()Lgg/essential/model/Side;
        //   220: ifnull          227
        //   223: iconst_1       
        //   224: goto            228
        //   227: iconst_0       
        //   228: ifeq            189
        //   231: iconst_1       
        //   232: goto            236
        //   235: iconst_0       
        //   236: istore          14
        //   238: aload           13
        //   240: iload           14
        //   242: putfield        gg/essential/model/BedrockModel.isContainsSideOption:Z
        //   245: aload_3         /* animationData */
        //   246: ifnull          394
        //   249: aload_0         /* this */
        //   250: aload_3         /* animationData */
        //   251: invokevirtual   gg/essential/model/file/AnimationFile.getAnimations:()Ljava/util/Map;
        //   254: astore          6
        //   256: astore          13
        //   258: aload           $this$map$iv
        //   260: astore          7
        //   262: new             Ljava/util/ArrayList;
        //   265: dup            
        //   266: aload           $this$map$iv
        //   268: invokeinterface java/util/Map.size:()I
        //   273: invokespecial   java/util/ArrayList.<init>:(I)V
        //   276: checkcast       Ljava/util/Collection;
        //   279: astore          destination$iv$iv
        //   281: aload           $this$mapTo$iv$iv
        //   283: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   288: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   293: astore          10
        //   295: aload           10
        //   297: invokeinterface java/util/Iterator.hasNext:()Z
        //   302: ifeq            372
        //   305: aload           10
        //   307: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   312: checkcast       Ljava/util/Map$Entry;
        //   315: astore          item$iv$iv
        //   317: aload           destination$iv$iv
        //   319: aload           item$iv$iv
        //   321: astore          12
        //   323: astore          14
        //   325: new             Lgg/essential/model/Animation;
        //   328: dup            
        //   329: aload           it
        //   331: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   336: checkcast       Ljava/lang/String;
        //   339: aload           it
        //   341: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   346: checkcast       Lgg/essential/model/file/AnimationFile$Animation;
        //   349: aload_0         /* this */
        //   350: aload_0         /* this */
        //   351: getfield        gg/essential/model/BedrockModel.rootBone:Lgg/essential/model/Bone;
        //   354: invokevirtual   gg/essential/model/BedrockModel.getBones:(Lgg/essential/model/Bone;)Ljava/util/List;
        //   357: invokespecial   gg/essential/model/Animation.<init>:(Ljava/lang/String;Lgg/essential/model/file/AnimationFile$Animation;Ljava/util/List;)V
        //   360: aload           14
        //   362: swap           
        //   363: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   368: pop            
        //   369: goto            295
        //   372: aload           destination$iv$iv
        //   374: checkcast       Ljava/util/List;
        //   377: aload           13
        //   379: swap           
        //   380: putfield        gg/essential/model/BedrockModel.animations:Ljava/util/List;
        //   383: aload_0         /* this */
        //   384: aload_3         /* animationData */
        //   385: invokevirtual   gg/essential/model/file/AnimationFile.getTriggers:()Ljava/util/List;
        //   388: putfield        gg/essential/model/BedrockModel.animationEvents:Ljava/util/List;
        //   391: goto            408
        //   394: aload_0         /* this */
        //   395: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   398: putfield        gg/essential/model/BedrockModel.animations:Ljava/util/List;
        //   401: aload_0         /* this */
        //   402: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   405: putfield        gg/essential/model/BedrockModel.animationEvents:Ljava/util/List;
        //   408: return         
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  cosmetic       
        //  data           
        //  animationData  
        //  texture        
        //    StackMapTable: 00 10 FF 00 3A 00 06 07 00 02 00 07 00 8C 07 00 8E 00 07 00 87 00 04 08 00 24 08 00 24 07 00 90 07 00 87 FF 00 02 00 06 07 00 02 00 07 00 8C 07 00 8E 00 07 00 87 00 04 08 00 24 08 00 24 07 00 90 01 FF 00 0D 00 04 07 00 02 00 07 00 8C 07 00 8E 00 05 08 00 24 08 00 24 07 00 90 01 07 00 87 FF 00 02 00 04 07 00 02 00 07 00 8C 07 00 8E 00 05 08 00 24 08 00 24 07 00 90 01 01 FF 00 28 00 04 07 00 02 00 00 07 00 8E 00 00 13 FF 00 28 00 0E 07 00 02 00 00 07 00 8E 00 00 07 00 B6 00 00 00 00 00 00 07 00 02 00 00 FF 00 08 00 0E 07 00 02 00 00 07 00 8E 00 00 00 07 00 C1 00 00 00 00 00 07 00 02 00 00 25 40 01 FF 00 06 00 0E 07 00 02 00 00 07 00 8E 00 00 00 00 00 00 00 00 00 07 00 02 00 00 40 01 FF 00 3A 00 0E 07 00 02 00 00 07 00 8E 00 00 00 00 07 00 B8 00 07 00 C1 00 00 07 00 02 00 00 FF 00 4C 00 0E 07 00 02 00 00 07 00 8E 00 00 00 00 07 00 B8 00 00 00 00 07 00 02 00 00 FF 00 15 00 01 07 00 02 00 00 FA 00 0D
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Cosmetic getCosmetic() {
        return this.cosmetic;
    }
    
    public final void setTexture(@Nullable final RenderBackend.Texture <set-?>) {
        this.texture = <set-?>;
    }
    
    @NotNull
    public final Bone getRootBone() {
        return this.rootBone;
    }
    
    public final int getTextureFrameCount() {
        return this.textureFrameCount;
    }
    
    @NotNull
    public final List<AnimationEvent> getAnimationEvents() {
        return this.animationEvents;
    }
    
    public final boolean isContainsSideOption() {
        return this.isContainsSideOption;
    }
    
    @Nullable
    public final Animation getAnimationByName(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        for (final Animation animation : this.animations) {
            if (Intrinsics.areEqual((Object)animation.getName(), (Object)name)) {
                return animation;
            }
        }
        return null;
    }
    
    public final void applyPose(@NotNull final Bone rootBone, @NotNull final PlayerPose pose) {
        Intrinsics.checkNotNullParameter((Object)rootBone, "rootBone");
        Intrinsics.checkNotNullParameter((Object)pose, "pose");
        for (final Bone bone : this.getBones(rootBone)) {
            final EnumPart fromBoneName = EnumPart.Companion.fromBoneName(bone.boxName);
            if (fromBoneName == null) {
                continue;
            }
            final EnumPart part = fromBoneName;
            this.copy((PlayerPose.Part)pose.get((Object)part), bone, (Offset)MapsKt.getValue((Map)BedrockModel.OFFSETS, (Object)part));
            if (!pose.getChild()) {
                continue;
            }
            if (part == EnumPart.HEAD) {
                bone.childScale = 0.75f;
                bone.animOffsetY -= 8.0f;
            }
            else {
                bone.childScale = 0.5f;
            }
        }
    }
    
    @NotNull
    public final PlayerPose retrievePose(@NotNull final Bone rootBone, @NotNull final PlayerPose basePose) {
        Intrinsics.checkNotNullParameter((Object)rootBone, "rootBone");
        Intrinsics.checkNotNullParameter((Object)basePose, "basePose");
        final Map parts = MapsKt.toMap((Map)basePose, (Map)new LinkedHashMap());
        retrievePose$visit(rootBone, parts, new UMatrixStack(), false);
        return PlayerPose.Companion.fromMap(parts, basePose.getChild());
    }
    
    public final void render(@NotNull final UMatrixStack matrixStack, @NotNull final RenderBackend.VertexConsumerProvider vertexConsumerProvider, @NotNull final Bone rootBone, @NotNull final RenderMetadata metadata, final float lifetime) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)vertexConsumerProvider, "vertexConsumerProvider");
        Intrinsics.checkNotNullParameter((Object)rootBone, "rootBone");
        Intrinsics.checkNotNullParameter((Object)metadata, "metadata");
        RenderBackend.Texture texture;
        if ((texture = this.texture) == null) {
            texture = metadata.getSkin();
        }
        final RenderBackend.Texture textureLocation = texture;
        final float totalFrames = (float)this.textureFrameCount;
        final int frame = (int)(lifetime * 7.0f);
        final float offset = frame % totalFrames / totalFrames;
        final PlayerPose pose = metadata.getPose();
        if (pose != null) {
            this.applyPose(rootBone, pose);
        }
        this.propagateVisibilityToRootBone(metadata.getSide(), rootBone, metadata.getHiddenBones(), metadata.getParts());
        vertexConsumerProvider.provide(textureLocation, (Function1<? super UVertexConsumer, Unit>)new BedrockModel$render.BedrockModel$render$1(rootBone, matrixStack, metadata, offset));
    }
    
    @NotNull
    public final List<Bone> getBones(@NotNull final Bone bone) {
        Intrinsics.checkNotNullParameter((Object)bone, "bone");
        final List bones = CollectionsKt.mutableListOf((Object[])new Bone[] { bone });
        for (final Bone childModel : bone.childModels) {
            bones.addAll(this.getBones(childModel));
        }
        return bones;
    }
    
    public final void propagateVisibilityToRootBone(@Nullable final Side side, @NotNull final Bone rootBone, @NotNull final Set<String> hiddenBones, @Nullable final Set<? extends EnumPart> parts) {
        Intrinsics.checkNotNullParameter((Object)rootBone, "rootBone");
        Intrinsics.checkNotNullParameter((Object)hiddenBones, "hiddenBones");
        Side side2 = side;
        if (side2 == null && this.isContainsSideOption) {
            side2 = Side.Companion.getDefaultSide();
        }
        for (final Bone bone : this.getBones(rootBone)) {
            final EnumPart part = EnumPart.Companion.fromBoneName(bone.boxName);
            if (part == null) {
                bone.visible = (hiddenBones.contains(bone.boxName) ? Boolean.valueOf(false) : null);
            }
            else {
                bone.visible = ((parts == null || parts.contains(part)) && !hiddenBones.contains(bone.boxName));
            }
        }
        rootBone.propagateVisibility(true, side2);
    }
    
    private final void copy(final PlayerPose.Part pose, final Bone bone, final Offset offset) {
        bone.rotateAngleX = pose.getRotateAngleX();
        bone.rotateAngleY = pose.getRotateAngleY();
        bone.rotateAngleZ = pose.getRotateAngleZ();
        bone.pivotX = offset.getPivotX();
        bone.pivotY = offset.getPivotY();
        bone.pivotZ = 0.0f;
        bone.animOffsetX += pose.getPivotX() + offset.getOffsetX();
        bone.animOffsetY += -pose.getPivotY() + offset.getOffsetY();
        bone.animOffsetZ += pose.getPivotZ() + 0.0f;
        bone.setExtra(pose.getExtra());
        bone.childScale = 1.0f;
    }
    
    private static final void retrievePose$visit(final Bone $this$retrievePose_u24visit, final Map<EnumPart, PlayerPose.Part> parts, final UMatrixStack matrixStack, final boolean parentHasScaling) {
        final EnumPart part = EnumPart.Companion.fromBoneName($this$retrievePose_u24visit.boxName);
        if (part == null && $this$retrievePose_u24visit.childModels.isEmpty()) {
            return;
        }
        final boolean hasScaling = parentHasScaling || $this$retrievePose_u24visit.getAnimScaleX() != 1.0f || $this$retrievePose_u24visit.getAnimScaleY() != 1.0f || $this$retrievePose_u24visit.getAnimScaleZ() != 1.0f;
        matrixStack.push();
        matrixStack.translate($this$retrievePose_u24visit.pivotX + $this$retrievePose_u24visit.animOffsetX, $this$retrievePose_u24visit.pivotY - $this$retrievePose_u24visit.animOffsetY, $this$retrievePose_u24visit.pivotZ + $this$retrievePose_u24visit.animOffsetZ);
        matrixStack.rotate($this$retrievePose_u24visit.rotateAngleZ + $this$retrievePose_u24visit.getAnimRotZ(), 0.0f, 0.0f, 1.0f, false);
        matrixStack.rotate($this$retrievePose_u24visit.rotateAngleY + $this$retrievePose_u24visit.getAnimRotY(), 0.0f, 1.0f, 0.0f, false);
        matrixStack.rotate($this$retrievePose_u24visit.rotateAngleX + $this$retrievePose_u24visit.getAnimRotX(), 1.0f, 0.0f, 0.0f, false);
        final Mat4 extra2 = $this$retrievePose_u24visit.getExtra();
        if (extra2 != null) {
            final Mat4 it = extra2;
            MutableMatrices.timesSelf(matrixStack.peek().getModel(), it);
        }
        matrixStack.scale($this$retrievePose_u24visit.getAnimScaleX(), $this$retrievePose_u24visit.getAnimScaleY(), $this$retrievePose_u24visit.getAnimScaleZ());
        matrixStack.translate(-$this$retrievePose_u24visit.pivotX - $this$retrievePose_u24visit.userOffsetX, -$this$retrievePose_u24visit.pivotY - $this$retrievePose_u24visit.userOffsetY, -$this$retrievePose_u24visit.pivotZ - $this$retrievePose_u24visit.userOffsetZ);
        if (part != null) {
            final Offset offset = (Offset)MapsKt.getValue((Map)BedrockModel.OFFSETS, (Object)part);
            final MutableMat4 matrix = matrixStack.peek().getModel();
            final Vec4 localPivot = Vectors.vec4($this$retrievePose_u24visit.pivotX, $this$retrievePose_u24visit.pivotY, $this$retrievePose_u24visit.pivotZ, 1.0f);
            final Vec4 globalPivot = KotglKt.times(localPivot, matrix);
            final Vec3 globalRotation = KotglKt.getRotationEulerZYX(matrix);
            MutableMat4 times;
            if (!hasScaling) {
                times = null;
            }
            else {
                final UMatrixStack resultStack = new UMatrixStack();
                resultStack.translate(globalPivot.getX(), globalPivot.getY(), globalPivot.getZ());
                resultStack.rotate(globalRotation.getZ(), 0.0f, 0.0f, 1.0f, false);
                resultStack.rotate(globalRotation.getY(), 0.0f, 1.0f, 0.0f, false);
                resultStack.rotate(globalRotation.getX(), 1.0f, 0.0f, 0.0f, false);
                final UMatrixStack expectedStack = matrixStack.fork();
                expectedStack.translate($this$retrievePose_u24visit.pivotX, $this$retrievePose_u24visit.pivotY, $this$retrievePose_u24visit.pivotZ);
                times = MutableMatrices.times(MutableMatrices.inverse(resultStack.peek().getModel()), expectedStack.peek().getModel());
            }
            final MutableMat4 extra = times;
            parts.put(part, new PlayerPose.Part(globalPivot.getX() - offset.getPivotX() - offset.getOffsetX(), globalPivot.getY() - offset.getPivotY() + offset.getOffsetY(), globalPivot.getZ() - 0.0f - 0.0f, globalRotation.getX(), globalRotation.getY(), globalRotation.getZ(), extra));
        }
        for (final Bone childModel : $this$retrievePose_u24visit.childModels) {
            retrievePose$visit(childModel, parts, matrixStack, hasScaling);
        }
        matrixStack.pop();
    }
    
    static {
        Companion = new Companion((byte)0);
        RIGHT_ARM = new Offset(-5.0f, -22.0f, 5.0f, 2.0f);
        LEFT_ARM = new Offset(5.0f, -22.0f, -5.0f, 2.0f);
        LEFT_LEG = new Offset(1.9f, -12.0f, -1.9f, 12.0f);
        RIGHT_LEG = new Offset(-1.9f, -12.0f, 1.9f, 12.0f);
        BODY = new Offset(0.0f, -24.0f, 0.0f, 0.0f);
        HEAD = new Offset(0.0f, -24.0f, 0.0f, 0.0f);
        OFFSETS = MapsKt.mapOf(new Pair[] { TuplesKt.to((Object)EnumPart.HEAD, (Object)BedrockModel.HEAD), TuplesKt.to((Object)EnumPart.BODY, (Object)BedrockModel.BODY), TuplesKt.to((Object)EnumPart.LEFT_ARM, (Object)BedrockModel.LEFT_ARM), TuplesKt.to((Object)EnumPart.RIGHT_ARM, (Object)BedrockModel.RIGHT_ARM), TuplesKt.to((Object)EnumPart.LEFT_LEG, (Object)BedrockModel.LEFT_LEG), TuplesKt.to((Object)EnumPart.RIGHT_LEG, (Object)BedrockModel.RIGHT_LEG) });
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011" }, d2 = { "Lgg/essential/model/BedrockModel$Offset;", "", "pivotX", "", "pivotY", "pivotZ", "offsetX", "offsetY", "offsetZ", "(FFFFFF)V", "getOffsetX", "()F", "getOffsetY", "getOffsetZ", "getPivotX", "getPivotY", "getPivotZ", "cosmetics" })
    private static final class Offset
    {
        private final float pivotX;
        private final float pivotY;
        private final float offsetX;
        private final float offsetY;
        
        public Offset(final float pivotX, final float pivotY, final float offsetX, final float offsetY) {
            super();
            this.pivotX = pivotX;
            this.pivotY = pivotY;
            this.offsetX = offsetX;
            this.offsetY = offsetY;
        }
        
        public final float getPivotX() {
            return this.pivotX;
        }
        
        public final float getPivotY() {
            return this.pivotY;
        }
        
        public final float getOffsetX() {
            return this.offsetX;
        }
        
        public final float getOffsetY() {
            return this.offsetY;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JM\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d" }, d2 = { "Lgg/essential/model/BedrockModel$Companion;", "", "()V", "BODY", "Lgg/essential/model/BedrockModel$Offset;", "HEAD", "LEFT_ARM", "LEFT_LEG", "OFFSETS", "", "Lgg/essential/model/EnumPart;", "RIGHT_ARM", "RIGHT_LEG", "TEXTURE_ANIMATION_FPS", "", "create", "Lgg/essential/model/BedrockModel;", "renderBackend", "Lgg/essential/model/backend/RenderBackend;", "cosmetic", "Lgg/essential/network/cosmetics/Cosmetic;", "skinType", "", "getAssetBytes", "Lkotlin/Function2;", "Lgg/essential/mod/EssentialAsset;", "Lkotlin/coroutines/Continuation;", "", "(Lgg/essential/model/backend/RenderBackend;Lgg/essential/network/cosmetics/Cosmetic;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @Nullable
        public final Object create(@NotNull final RenderBackend renderBackend, @NotNull final Cosmetic cosmetic, @NotNull final String skinType, @NotNull final Function2<? super EssentialAsset, ? super Continuation<? super byte[]>, ?> getAssetBytes, @NotNull final Continuation<? super BedrockModel> p4) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     2: instanceof      Lgg/essential/model/BedrockModel$Companion$create$1;
            //     5: ifeq            41
            //     8: aload           5
            //    10: checkcast       Lgg/essential/model/BedrockModel$Companion$create$1;
            //    13: astore          19
            //    15: aload           19
            //    17: getfield        gg/essential/model/BedrockModel$Companion$create$1.label:I
            //    20: ldc             -2147483648
            //    22: iand           
            //    23: ifeq            41
            //    26: aload           19
            //    28: dup            
            //    29: getfield        gg/essential/model/BedrockModel$Companion$create$1.label:I
            //    32: ldc             -2147483648
            //    34: isub           
            //    35: putfield        gg/essential/model/BedrockModel$Companion$create$1.label:I
            //    38: goto            53
            //    41: new             Lgg/essential/model/BedrockModel$Companion$create$1;
            //    44: dup            
            //    45: aload_0        
            //    46: aload           5
            //    48: invokespecial   gg/essential/model/BedrockModel$Companion$create$1.<init>:(Lgg/essential/model/BedrockModel$Companion;Lkotlin/coroutines/Continuation;)V
            //    51: astore          $continuation
            //    53: aload           $continuation
            //    55: getfield        gg/essential/model/BedrockModel$Companion$create$1.result:Ljava/lang/Object;
            //    58: astore          $result
            //    60: invokestatic    kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
            //    63: astore          20
            //    65: aload           $continuation
            //    67: getfield        gg/essential/model/BedrockModel$Companion$create$1.label:I
            //    70: tableswitch {
            //                0: 104
            //                1: 233
            //                2: 393
            //                3: 569
            //                4: 691
            //          default: 807
            //        }
            //   104: aload           $result
            //   106: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
            //   109: aconst_null    
            //   110: astore          modelFile
            //   112: aconst_null    
            //   113: astore          animationFile
            //   115: aconst_null    
            //   116: astore          textureFile
            //   118: aload_2         /* cosmetic */
            //   119: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getAssets:()Lgg/essential/mod/cosmetics/CosmeticAssets;
            //   122: dup            
            //   123: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
            //   126: astore          assets
            //   128: aload           assets
            //   130: invokevirtual   gg/essential/mod/cosmetics/CosmeticAssets.getGeometry:()Lgg/essential/mod/cosmetics/CosmeticAssets$Geometry;
            //   133: astore          10
            //   135: aload           10
            //   137: invokevirtual   gg/essential/mod/cosmetics/CosmeticAssets$Geometry.component1:()Lgg/essential/mod/EssentialAsset;
            //   140: astore          11
            //   142: aload           10
            //   144: invokevirtual   gg/essential/mod/cosmetics/CosmeticAssets$Geometry.component2:()Lgg/essential/mod/EssentialAsset;
            //   147: astore          alex
            //   149: getstatic       gg/essential/model/file/ModelFile.Companion:Lgg/essential/model/file/ModelFile$Companion;
            //   152: astore          17
            //   154: aload           getAssetBytes
            //   156: ldc             "slim"
            //   158: aload_3         /* skinType */
            //   159: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   162: ifeq            170
            //   165: aload           alex
            //   167: goto            171
            //   170: aconst_null    
            //   171: dup            
            //   172: ifnonnull       178
            //   175: pop            
            //   176: aload           steve
            //   178: aload           $continuation
            //   180: aload           $continuation
            //   182: aload_1         /* renderBackend */
            //   183: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$0:Ljava/lang/Object;
            //   186: aload           $continuation
            //   188: aload_2         /* cosmetic */
            //   189: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$1:Ljava/lang/Object;
            //   192: aload           $continuation
            //   194: aload           getAssetBytes
            //   196: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$2:Ljava/lang/Object;
            //   199: aload           $continuation
            //   201: aload           assets
            //   203: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$3:Ljava/lang/Object;
            //   206: aload           $continuation
            //   208: aload           17
            //   210: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$4:Ljava/lang/Object;
            //   213: aload           $continuation
            //   215: iconst_1       
            //   216: putfield        gg/essential/model/BedrockModel$Companion$create$1.label:I
            //   219: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   224: dup            
            //   225: aload           20
            //   227: if_acmpne       297
            //   230: aload           20
            //   232: areturn        
            //   233: aload           $continuation
            //   235: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$4:Ljava/lang/Object;
            //   238: checkcast       Lgg/essential/model/file/ModelFile$Companion;
            //   241: astore          17
            //   243: aload           $continuation
            //   245: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$3:Ljava/lang/Object;
            //   248: checkcast       Lgg/essential/mod/cosmetics/CosmeticAssets;
            //   251: astore          assets
            //   253: aconst_null    
            //   254: astore          8
            //   256: aconst_null    
            //   257: astore          7
            //   259: aconst_null    
            //   260: astore          6
            //   262: aload           $continuation
            //   264: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$2:Ljava/lang/Object;
            //   267: checkcast       Lkotlin/jvm/functions/Function2;
            //   270: astore          getAssetBytes
            //   272: aload           $continuation
            //   274: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$1:Ljava/lang/Object;
            //   277: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
            //   280: astore_2        /* cosmetic */
            //   281: aload           $continuation
            //   283: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$0:Ljava/lang/Object;
            //   286: checkcast       Lgg/essential/model/backend/RenderBackend;
            //   289: astore_1        /* renderBackend */
            //   290: aload           $result
            //   292: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
            //   295: aload           $result
            //   297: aload           17
            //   299: swap           
            //   300: checkcast       [B
            //   303: invokestatic    kotlin/text/StringsKt.decodeToString:([B)Ljava/lang/String;
            //   306: invokevirtual   gg/essential/model/file/ModelFile$Companion.parse:(Ljava/lang/String;)Lgg/essential/model/file/ModelFile;
            //   309: astore          modelFile
            //   311: aload           assets
            //   313: invokevirtual   gg/essential/mod/cosmetics/CosmeticAssets.getAnimations:()Lgg/essential/mod/EssentialAsset;
            //   316: dup            
            //   317: ifnull          479
            //   320: astore          it
            //   322: getstatic       gg/essential/model/file/AnimationFile.Companion:Lgg/essential/model/file/AnimationFile$Companion;
            //   325: astore          14
            //   327: aload           getAssetBytes
            //   329: aload           it
            //   331: aload           $continuation
            //   333: aload           $continuation
            //   335: aload_1         /* renderBackend */
            //   336: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$0:Ljava/lang/Object;
            //   339: aload           $continuation
            //   341: aload_2         /* cosmetic */
            //   342: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$1:Ljava/lang/Object;
            //   345: aload           $continuation
            //   347: aload           getAssetBytes
            //   349: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$2:Ljava/lang/Object;
            //   352: aload           $continuation
            //   354: aload           modelFile
            //   356: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$3:Ljava/lang/Object;
            //   359: aload           $continuation
            //   361: aload           assets
            //   363: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$4:Ljava/lang/Object;
            //   366: aload           $continuation
            //   368: aload           14
            //   370: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$5:Ljava/lang/Object;
            //   373: aload           $continuation
            //   375: iconst_2       
            //   376: putfield        gg/essential/model/BedrockModel$Companion$create$1.label:I
            //   379: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   384: dup            
            //   385: aload           20
            //   387: if_acmpne       464
            //   390: aload           20
            //   392: areturn        
            //   393: aload           $continuation
            //   395: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$5:Ljava/lang/Object;
            //   398: checkcast       Lgg/essential/model/file/AnimationFile$Companion;
            //   401: astore          14
            //   403: aload           $continuation
            //   405: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$4:Ljava/lang/Object;
            //   408: checkcast       Lgg/essential/mod/cosmetics/CosmeticAssets;
            //   411: astore          9
            //   413: aconst_null    
            //   414: astore          8
            //   416: aconst_null    
            //   417: astore          7
            //   419: aload           $continuation
            //   421: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$3:Ljava/lang/Object;
            //   424: checkcast       Lgg/essential/model/file/ModelFile;
            //   427: astore          6
            //   429: aload           $continuation
            //   431: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$2:Ljava/lang/Object;
            //   434: checkcast       Lkotlin/jvm/functions/Function2;
            //   437: astore          4
            //   439: aload           $continuation
            //   441: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$1:Ljava/lang/Object;
            //   444: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
            //   447: astore_2       
            //   448: aload           $continuation
            //   450: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$0:Ljava/lang/Object;
            //   453: checkcast       Lgg/essential/model/backend/RenderBackend;
            //   456: astore_1       
            //   457: aload           $result
            //   459: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
            //   462: aload           $result
            //   464: aload           14
            //   466: swap           
            //   467: checkcast       [B
            //   470: invokestatic    kotlin/text/StringsKt.decodeToString:([B)Ljava/lang/String;
            //   473: invokevirtual   gg/essential/model/file/AnimationFile$Companion.parse:(Ljava/lang/String;)Lgg/essential/model/file/AnimationFile;
            //   476: goto            481
            //   479: pop            
            //   480: aconst_null    
            //   481: astore          animationFile
            //   483: aload           assets
            //   485: invokevirtual   gg/essential/mod/cosmetics/CosmeticAssets.getTexture:()Lgg/essential/mod/EssentialAsset;
            //   488: dup            
            //   489: ifnull          736
            //   492: astore          it
            //   494: aload_1         /* renderBackend */
            //   495: aload_2         /* cosmetic */
            //   496: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
            //   499: astore          14
            //   501: astore          15
            //   503: aload           getAssetBytes
            //   505: aload           it
            //   507: aload           $continuation
            //   509: aload           $continuation
            //   511: aload_2         /* cosmetic */
            //   512: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$0:Ljava/lang/Object;
            //   515: aload           $continuation
            //   517: aload           modelFile
            //   519: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$1:Ljava/lang/Object;
            //   522: aload           $continuation
            //   524: aload           animationFile
            //   526: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$2:Ljava/lang/Object;
            //   529: aload           $continuation
            //   531: aload           14
            //   533: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$3:Ljava/lang/Object;
            //   536: aload           $continuation
            //   538: aload           15
            //   540: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$4:Ljava/lang/Object;
            //   543: aload           $continuation
            //   545: aconst_null    
            //   546: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$5:Ljava/lang/Object;
            //   549: aload           $continuation
            //   551: iconst_3       
            //   552: putfield        gg/essential/model/BedrockModel$Companion$create$1.label:I
            //   555: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   560: dup            
            //   561: aload           20
            //   563: if_acmpne       628
            //   566: aload           20
            //   568: areturn        
            //   569: aload           $continuation
            //   571: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$4:Ljava/lang/Object;
            //   574: checkcast       Lgg/essential/model/backend/RenderBackend;
            //   577: astore          15
            //   579: aload           $continuation
            //   581: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$3:Ljava/lang/Object;
            //   584: checkcast       Ljava/lang/String;
            //   587: astore          14
            //   589: aconst_null    
            //   590: astore          8
            //   592: aload           $continuation
            //   594: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$2:Ljava/lang/Object;
            //   597: checkcast       Lgg/essential/model/file/AnimationFile;
            //   600: astore          animationFile
            //   602: aload           $continuation
            //   604: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$1:Ljava/lang/Object;
            //   607: checkcast       Lgg/essential/model/file/ModelFile;
            //   610: astore          modelFile
            //   612: aload           $continuation
            //   614: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$0:Ljava/lang/Object;
            //   617: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
            //   620: astore_2        /* cosmetic */
            //   621: aload           $result
            //   623: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
            //   626: aload           $result
            //   628: astore          16
            //   630: aload           15
            //   632: aload           14
            //   634: aload           16
            //   636: checkcast       [B
            //   639: aload           $continuation
            //   641: aload_2         /* cosmetic */
            //   642: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$0:Ljava/lang/Object;
            //   645: aload           $continuation
            //   647: aload           modelFile
            //   649: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$1:Ljava/lang/Object;
            //   652: aload           $continuation
            //   654: aload           animationFile
            //   656: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$2:Ljava/lang/Object;
            //   659: aload           $continuation
            //   661: aconst_null    
            //   662: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$3:Ljava/lang/Object;
            //   665: aload           $continuation
            //   667: aconst_null    
            //   668: putfield        gg/essential/model/BedrockModel$Companion$create$1.L$4:Ljava/lang/Object;
            //   671: aload           $continuation
            //   673: iconst_4       
            //   674: putfield        gg/essential/model/BedrockModel$Companion$create$1.label:I
            //   677: invokeinterface gg/essential/model/backend/RenderBackend.readTexture$23cb99da:(Ljava/lang/String;[B)Ljava/lang/Object;
            //   682: dup            
            //   683: aload           20
            //   685: if_acmpne       730
            //   688: aload           20
            //   690: areturn        
            //   691: aconst_null    
            //   692: astore          8
            //   694: aload           $continuation
            //   696: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$2:Ljava/lang/Object;
            //   699: checkcast       Lgg/essential/model/file/AnimationFile;
            //   702: astore          7
            //   704: aload           $continuation
            //   706: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$1:Ljava/lang/Object;
            //   709: checkcast       Lgg/essential/model/file/ModelFile;
            //   712: astore          6
            //   714: aload           $continuation
            //   716: getfield        gg/essential/model/BedrockModel$Companion$create$1.L$0:Ljava/lang/Object;
            //   719: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
            //   722: astore_2       
            //   723: aload           $result
            //   725: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
            //   728: aload           $result
            //   730: checkcast       Lgg/essential/model/backend/RenderBackend$Texture;
            //   733: goto            738
            //   736: pop            
            //   737: aconst_null    
            //   738: astore          8
            //   740: goto            792
            //   743: astore          e
            //   745: new             Ljava/lang/StringBuilder;
            //   748: dup            
            //   749: invokespecial   java/lang/StringBuilder.<init>:()V
            //   752: ldc             "Failed to parse cosmetics data for "
            //   754: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   757: aload_2        
            //   758: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
            //   761: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   764: ldc             ": "
            //   766: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   769: aload           e
            //   771: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
            //   774: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   777: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   780: getstatic       java/lang/System.out:Ljava/io/PrintStream;
            //   783: swap           
            //   784: invokevirtual   java/io/PrintStream.println:(Ljava/lang/Object;)V
            //   787: aload           e
            //   789: invokevirtual   java/lang/Exception.printStackTrace:()V
            //   792: new             Lgg/essential/model/BedrockModel;
            //   795: dup            
            //   796: aload_2         /* cosmetic */
            //   797: aload           modelFile
            //   799: aload           animationFile
            //   801: aload           textureFile
            //   803: invokespecial   gg/essential/model/BedrockModel.<init>:(Lgg/essential/network/cosmetics/Cosmetic;Lgg/essential/model/file/ModelFile;Lgg/essential/model/file/AnimationFile;Lgg/essential/model/backend/RenderBackend$Texture;)V
            //   806: areturn        
            //   807: new             Ljava/lang/IllegalStateException;
            //   810: dup            
            //   811: ldc             "call to 'resume' before 'invoke' with coroutine"
            //   813: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
            //   816: athrow         
            //    Signature:
            //  (Lgg/essential/model/backend/RenderBackend;Lgg/essential/network/cosmetics/Cosmetic;Ljava/lang/String;Lkotlin/jvm/functions/Function2<-Lgg/essential/mod/EssentialAsset;-Lkotlin/coroutines/Continuation<-[B>;*>;Lkotlin/coroutines/Continuation<-Lgg/essential/model/BedrockModel;>;)Ljava/lang/Object; [from metadata: (Lgg/essential/model/backend/RenderBackend;Lgg/essential/network/cosmetics/Cosmetic;Ljava/lang/String;Lkotlin/jvm/functions/Function2<-Lgg/essential/mod/EssentialAsset;-Lkotlin/coroutines/Continuation<-[B>;+Ljava/lang/Object;>;Lkotlin/coroutines/Continuation<-Lgg/essential/model/BedrockModel;>;)Ljava/lang/Object;]
            //  
            //    StackMapTable: 00 15 29 FF 00 0B 00 14 00 07 00 42 07 00 44 07 00 46 07 00 48 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 2C 00 00 FF 00 32 00 15 00 07 00 42 07 00 44 07 00 46 07 00 48 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 04 07 00 2C 07 00 04 00 00 FF 00 41 00 15 00 07 00 42 07 00 44 00 07 00 48 00 05 05 05 07 00 63 00 07 00 7D 00 00 00 00 00 07 00 7F 00 07 00 2C 07 00 04 00 01 07 00 48 FF 00 00 00 15 00 07 00 42 07 00 44 00 07 00 48 00 05 05 05 07 00 63 00 07 00 7D 00 00 00 00 00 07 00 7F 00 07 00 2C 07 00 04 00 02 07 00 48 07 00 7D FF 00 06 00 15 00 07 00 42 07 00 44 00 07 00 48 00 05 05 05 07 00 63 00 00 00 00 00 00 00 07 00 7F 00 07 00 2C 07 00 04 00 02 07 00 48 07 00 7D FF 00 36 00 15 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 04 07 00 2C 07 00 04 00 00 FF 00 3F 00 15 00 07 00 42 07 00 44 00 07 00 48 00 05 05 05 07 00 63 00 00 00 00 00 00 00 07 00 7F 00 07 00 2C 07 00 04 00 01 07 00 04 FF 00 5F 00 15 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 04 07 00 2C 07 00 04 00 00 FF 00 46 00 15 00 07 00 42 07 00 44 00 07 00 48 00 07 00 72 05 05 07 00 63 00 00 00 00 07 00 AB 00 00 00 00 07 00 2C 07 00 04 00 01 07 00 04 FF 00 0E 00 15 00 07 00 42 07 00 44 00 07 00 48 00 07 00 72 05 05 07 00 63 00 00 00 00 00 00 00 00 00 07 00 2C 07 00 04 00 01 07 00 7D 41 07 00 A3 FF 00 57 00 15 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 04 07 00 2C 07 00 04 00 00 FF 00 3A 00 15 00 00 07 00 44 00 00 00 07 00 72 07 00 A3 05 00 00 00 00 00 07 00 46 07 00 42 00 00 00 07 00 2C 07 00 04 00 01 07 00 04 FF 00 3E 00 14 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 04 07 00 2C 00 00 FF 00 26 00 09 00 00 07 00 44 00 00 00 07 00 72 07 00 A3 05 00 01 07 00 04 45 07 00 7D 41 07 00 BB FF 00 04 00 09 00 00 07 00 44 00 00 00 07 00 72 07 00 A3 07 00 BB 00 01 07 00 38 30 FF 00 0E 00 00 00 00
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  118    224    743    792    Ljava/lang/Exception;
            //  290    384    743    792    Ljava/lang/Exception;
            //  457    560    743    792    Ljava/lang/Exception;
            //  621    682    743    792    Ljava/lang/Exception;
            //  723    740    743    792    Ljava/lang/Exception;
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
