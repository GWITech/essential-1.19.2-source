package gg.essential.model;

import gg.essential.network.cosmetics.*;
import org.jetbrains.annotations.*;
import gg.essential.mod.cosmetics.*;
import kotlin.jvm.internal.*;
import gg.essential.model.file.*;
import kotlin.ranges.*;
import kotlin.text.*;
import kotlin.*;
import java.util.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\nH\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020 *\u0004\u0018\u00010!H\u0002J\f\u0010\"\u001a\u00020#*\u00020#H\u0002R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%" }, d2 = { "Lgg/essential/model/ModelParser;", "", "cosmetic", "Lgg/essential/network/cosmetics/Cosmetic;", "textureWidth", "", "textureHeight", "(Lgg/essential/network/cosmetics/Cosmetic;II)V", "boneByName", "", "", "Lgg/essential/model/Bone;", "boundingBoxes", "", "Lgg/essential/model/Box3;", "getBoundingBoxes", "()Ljava/util/List;", "rootBone", "getRootBone", "()Lgg/essential/model/Bone;", "textureFrameCount", "getTextureFrameCount", "()I", "setTextureFrameCount", "(I)V", "makeBone", "name", "parse", "", "file", "Lgg/essential/model/file/ModelFile;", "toFloatArray", "", "Lgg/essential/model/file/ModelFile$UvFace;", "toRadians", "", "Companion", "cosmetics" })
public final class ModelParser
{
    @NotNull
    private final Cosmetic cosmetic;
    private final int textureWidth;
    private final int textureHeight;
    @NotNull
    private final Map<String, Bone> boneByName;
    @NotNull
    private final List<Box3> boundingBoxes;
    @NotNull
    private final Bone rootBone;
    private int textureFrameCount;
    @NotNull
    private static final Set<CosmeticSlot> NEEDS_EXTRA_INFLATE;
    
    public ModelParser(@NotNull final Cosmetic cosmetic, final int textureWidth, final int textureHeight) {
        Intrinsics.checkNotNullParameter((Object)cosmetic, "cosmetic");
        super();
        this.cosmetic = cosmetic;
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;
        this.boneByName = new LinkedHashMap<String, Bone>();
        this.boundingBoxes = new ArrayList<Box3>();
        this.rootBone = this.makeBone("_root");
        this.textureFrameCount = 1;
    }
    
    @NotNull
    public final List<Box3> getBoundingBoxes() {
        return this.boundingBoxes;
    }
    
    @NotNull
    public final Bone getRootBone() {
        return this.rootBone;
    }
    
    public final int getTextureFrameCount() {
        return this.textureFrameCount;
    }
    
    private final Bone makeBone(final String name) {
        final Bone bone = new Bone(name);
        bone.setTextureWidth(this.textureWidth);
        bone.setTextureHeight(this.textureHeight);
        this.boneByName.put(name, bone);
        return bone;
    }
    
    public final void parse(@NotNull final ModelFile file) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        final ModelFile.Geometry geometry2 = (ModelFile.Geometry)CollectionsKt.firstOrNull((List)file.getGeometries());
        if (geometry2 == null) {
            return;
        }
        final ModelFile.Geometry geometry = geometry2;
        this.textureFrameCount = RangesKt.coerceAtLeast(this.textureHeight / geometry.getDescription().getTextureHeight(), 1);
        final float extraInflate = Intrinsics.areEqual((Object)this.cosmetic.getType().getId(), (Object)"PLAYER") ? 0.0f : (ModelParser.NEEDS_EXTRA_INFLATE.contains(this.cosmetic.getType().getSlot()) ? 0.04f : 0.02f);
        for (final ModelFile.Bone bone : geometry.getBones()) {
            if (StringsKt.startsWith$default(bone.getName(), "bbox_", false, 2, (Object)null)) {
                for (final ModelFile.Cube cube : bone.getCubes()) {
                    final Vector3 origin = cube.getOrigin();
                    final Vector3 size = cube.getSize();
                    final Box3 box = new Box3((byte)0);
                    box.expandByPoint(Vector3.copy$default$43f21962$6d547e82(origin).negateY());
                    box.expandByPoint(origin.plus(size).negateY());
                    box.expandByScalar(cube.getInflate() + 0.025f);
                    this.boundingBoxes.add(box);
                }
            }
            else {
                final Bone boneModel = this.makeBone(bone.getName());
                boneModel.pivotX = bone.getPivot().x;
                boneModel.pivotY = -bone.getPivot().y;
                boneModel.pivotZ = bone.getPivot().z;
                boneModel.rotateAngleX = this.toRadians(bone.getRotation().x);
                boneModel.rotateAngleY = this.toRadians(bone.getRotation().y);
                boneModel.rotateAngleZ = this.toRadians(bone.getRotation().z);
                bone.getMirror();
                boneModel.setSide(bone.getSide());
                for (final ModelFile.Cube cube2 : bone.getCubes()) {
                    final Vector3 negateY = Vector3.copy$default$43f21962$6d547e82(cube2.getOrigin()).negateY();
                    final float x = negateY.component1();
                    final float y = negateY.component2();
                    final float z = negateY.component3();
                    final Vector3 size2 = cube2.getSize();
                    final float dx = size2.component1();
                    final float dy = size2.component2();
                    final float dz = size2.component3();
                    final Boolean mirror2 = cube2.getMirror();
                    final boolean mirror = (mirror2 != null) ? mirror2 : bone.getMirror();
                    final float inflate = cube2.getInflate() + extraInflate;
                    final ModelFile.Uvs uv = cube2.getUv();
                    Cube cube3;
                    if (uv instanceof ModelFile.Uvs.PerFace) {
                        final CubeUvData uvData = new CubeUvData(this.toFloatArray(((ModelFile.Uvs.PerFace)uv).getNorth()), this.toFloatArray(((ModelFile.Uvs.PerFace)uv).getEast()), this.toFloatArray(((ModelFile.Uvs.PerFace)uv).getSouth()), this.toFloatArray(((ModelFile.Uvs.PerFace)uv).getWest()), this.toFloatArray(((ModelFile.Uvs.PerFace)uv).getUp()), this.toFloatArray(((ModelFile.Uvs.PerFace)uv).getDown()));
                        cube3 = new Cube(boneModel, x, y - dy, z, dx, dy, dz, inflate, mirror, uvData);
                    }
                    else {
                        if (!(uv instanceof ModelFile.Uvs.Box)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final float[] uv2 = ((ModelFile.Uvs.Box)uv).getUv();
                        final float u = uv2[0];
                        final float v = uv2[1];
                        cube3 = new Cube(boneModel, u, v, x, y - dy, z, dx, dy, dz, inflate, mirror);
                    }
                    final Cube cubeModel = cube3;
                    boneModel.cubeList.add(cubeModel);
                }
                Bone rootBone;
                if ((rootBone = this.boneByName.get(bone.getParent())) == null) {
                    rootBone = this.rootBone;
                }
                rootBone.addChild(boneModel);
            }
        }
        parse$setAffectsPoseFlag(this.rootBone);
    }
    
    private final float toRadians(final float $this$toRadians) {
        return (float)($this$toRadians / 180.0 * 3.141592653589793);
    }
    
    private final float[] toFloatArray(final ModelFile.UvFace $this$toFloatArray) {
        if ($this$toFloatArray == null) {
            return new float[] { 0.0f, 0.0f, 0.0f, 0.0f };
        }
        final float[] uv = $this$toFloatArray.getUv();
        final float u = uv[0];
        final float v = uv[1];
        final float[] size = $this$toFloatArray.getSize();
        final float du = size[0];
        final float dv = size[1];
        return new float[] { u, v, u + du, v + dv };
    }
    
    private static final void parse$setAffectsPoseFlag(final Bone $this$parse_u24setAffectsPoseFlag) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/model/Bone.childModels:Ljava/util/List;
        //     4: checkcast       Ljava/lang/Iterable;
        //     7: astore_1        /* $this$forEach$iv */
        //     8: aload_1         /* $this$forEach$iv */
        //     9: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    14: astore_2       
        //    15: aload_2        
        //    16: invokeinterface java/util/Iterator.hasNext:()Z
        //    21: ifeq            45
        //    24: aload_2        
        //    25: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    30: astore_3        /* element$iv */
        //    31: aload_3         /* element$iv */
        //    32: checkcast       Lgg/essential/model/Bone;
        //    35: astore          it
        //    37: aload           it
        //    39: invokestatic    gg/essential/model/ModelParser.parse$setAffectsPoseFlag:(Lgg/essential/model/Bone;)V
        //    42: goto            15
        //    45: aload_0         /* $this$parse_u24setAffectsPoseFlag */
        //    46: getstatic       gg/essential/model/EnumPart.Companion:Lgg/essential/model/EnumPart$Companion;
        //    49: aload_0         /* $this$parse_u24setAffectsPoseFlag */
        //    50: getfield        gg/essential/model/Bone.boxName:Ljava/lang/String;
        //    53: invokevirtual   gg/essential/model/EnumPart$Companion.fromBoneName:(Ljava/lang/String;)Lgg/essential/model/EnumPart;
        //    56: ifnonnull       143
        //    59: aload_0         /* $this$parse_u24setAffectsPoseFlag */
        //    60: getfield        gg/essential/model/Bone.childModels:Ljava/util/List;
        //    63: checkcast       Ljava/lang/Iterable;
        //    66: astore_1       
        //    67: astore          5
        //    69: aload_1         /* $this$any$iv */
        //    70: instanceof      Ljava/util/Collection;
        //    73: ifeq            92
        //    76: aload_1         /* $this$any$iv */
        //    77: checkcast       Ljava/util/Collection;
        //    80: invokeinterface java/util/Collection.isEmpty:()Z
        //    85: ifeq            92
        //    88: iconst_0       
        //    89: goto            134
        //    92: aload_1         /* $this$any$iv */
        //    93: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    98: astore_2       
        //    99: aload_2        
        //   100: invokeinterface java/util/Iterator.hasNext:()Z
        //   105: ifeq            133
        //   108: aload_2        
        //   109: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   114: astore_3        /* element$iv */
        //   115: aload_3         /* element$iv */
        //   116: checkcast       Lgg/essential/model/Bone;
        //   119: astore          it
        //   121: aload           it
        //   123: invokevirtual   gg/essential/model/Bone.getAffectsPose:()Z
        //   126: ifeq            99
        //   129: iconst_1       
        //   130: goto            134
        //   133: iconst_0       
        //   134: istore          6
        //   136: aload           5
        //   138: iload           6
        //   140: ifeq            147
        //   143: iconst_1       
        //   144: goto            148
        //   147: iconst_0       
        //   148: invokevirtual   gg/essential/model/Bone.setAffectsPose:(Z)V
        //   151: return         
        //    MethodParameters:
        //  Name                               Flags  
        //  ---------------------------------  -----
        //  $this$parse_u24setAffectsPoseFlag  
        //    StackMapTable: 00 09 FD 00 0F 00 07 00 BC F9 00 1D FF 00 2E 00 06 00 07 01 AF 00 00 00 07 00 66 00 00 FF 00 06 00 06 00 00 07 00 BC 00 00 07 00 66 00 00 FF 00 21 00 06 00 00 00 00 00 07 00 66 00 00 40 01 FF 00 08 00 00 00 01 07 00 66 43 07 00 66 FF 00 00 00 00 00 02 07 00 66 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        new Companion((byte)0);
        NEEDS_EXTRA_INFLATE = SetsKt.setOf((Object[])new CosmeticSlot[] { CosmeticSlot.ARMS, CosmeticSlot.PANTS, CosmeticSlot.SHOES, CosmeticSlot.FACE });
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006" }, d2 = { "Lgg/essential/model/ModelParser$Companion;", "", "()V", "NEEDS_EXTRA_INFLATE", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
