package gg.essential.model;

import kotlin.*;
import kotlin.jvm.*;
import gg.essential.lib.kotgl.matrix.matrices.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.model.util.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u0000J\u0006\u0010T\u001a\u00020\u0006J\u0006\u0010U\u001a\u00020\u0000J\u0018\u0010V\u001a\u00020R2\u0006\u0010W\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010>J.\u0010X\u001a\u00020R2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020D2\u0006\u0010^\u001a\u00020\f2\u0006\u0010_\u001a\u00020\fJ\u000e\u0010`\u001a\u00020R2\u0006\u0010a\u001a\u00020\u0006J\u0016\u0010b\u001a\u00020R2\u0006\u0010c\u001a\u00020D2\u0006\u0010d\u001a\u00020DR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000$8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020'0$8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010/\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\b\"\u0004\b3\u0010\nR\u0012\u00104\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00105\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00106\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00108\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00109\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\b\"\u0004\b<\u0010\nR\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR\u0012\u0010L\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010M\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010N\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010O\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010P¨\u0006e" }, d2 = { "Lgg/essential/model/Bone;", "", "boxName", "", "(Ljava/lang/String;)V", "affectsPose", "", "getAffectsPose", "()Z", "setAffectsPose", "(Z)V", "animOffsetX", "", "animOffsetY", "animOffsetZ", "animRotX", "getAnimRotX", "()F", "setAnimRotX", "(F)V", "animRotY", "getAnimRotY", "setAnimRotY", "animRotZ", "getAnimRotZ", "setAnimRotZ", "animScaleX", "getAnimScaleX", "setAnimScaleX", "animScaleY", "getAnimScaleY", "setAnimScaleY", "animScaleZ", "getAnimScaleZ", "setAnimScaleZ", "childModels", "", "childScale", "cubeList", "Lgg/essential/model/Cube;", "extra", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "getExtra", "()Ldev/folomeev/kotgl/matrix/matrices/Mat4;", "setExtra", "(Ldev/folomeev/kotgl/matrix/matrices/Mat4;)V", "fullyInvisible", "isHidden", "isVisible", "mirror", "getMirror", "setMirror", "pivotX", "pivotY", "pivotZ", "rotateAngleX", "rotateAngleY", "rotateAngleZ", "showModel", "getShowModel", "setShowModel", "side", "Lgg/essential/model/Side;", "getSide", "()Lgg/essential/model/Side;", "setSide", "(Lgg/essential/model/Side;)V", "textureHeight", "", "getTextureHeight", "()I", "setTextureHeight", "(I)V", "textureWidth", "getTextureWidth", "setTextureWidth", "userOffsetX", "userOffsetY", "userOffsetZ", "visible", "Ljava/lang/Boolean;", "addChild", "", "child", "containsVisibleBoxes", "deepCopy", "propagateVisibility", "parentVisible", "render", "matrixStack", "Lgg/essential/model/util/UMatrixStack;", "renderer", "Lgg/essential/model/util/UVertexConsumer;", "light", "scale", "verticalUVOffset", "resetAnimationOffsets", "recursive", "setTextureSize", "p_setTextureSize_1_", "p_setTextureSize_2_", "cosmetics" })
public final class Bone
{
    @JvmField
    @NotNull
    public final String boxName;
    private int textureWidth;
    private int textureHeight;
    @JvmField
    public float pivotX;
    @JvmField
    public float pivotY;
    @JvmField
    public float pivotZ;
    @JvmField
    public float rotateAngleX;
    @JvmField
    public float rotateAngleY;
    @JvmField
    public float rotateAngleZ;
    @Nullable
    private Mat4 extra;
    private boolean showModel;
    @JvmField
    @NotNull
    public List<Cube> cubeList;
    @JvmField
    @NotNull
    public List<Bone> childModels;
    @JvmField
    public float animOffsetX;
    @JvmField
    public float animOffsetY;
    @JvmField
    public float animOffsetZ;
    private float animRotX;
    private float animRotY;
    private float animRotZ;
    private float animScaleX;
    private float animScaleY;
    private float animScaleZ;
    @JvmField
    public float userOffsetX;
    @JvmField
    public float userOffsetY;
    @JvmField
    public float userOffsetZ;
    @JvmField
    public float childScale;
    @Nullable
    private Side side;
    @JvmField
    @Nullable
    public Boolean visible;
    private boolean isVisible;
    private boolean fullyInvisible;
    private boolean affectsPose;
    
    public Bone(@NotNull final String boxName) {
        Intrinsics.checkNotNullParameter((Object)boxName, "boxName");
        super();
        this.boxName = boxName;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.showModel = true;
        this.cubeList = new ArrayList<Cube>();
        this.childModels = new ArrayList<Bone>();
        this.childScale = 1.0f;
        this.isVisible = true;
        this.resetAnimationOffsets(false);
    }
    
    public final int getTextureWidth() {
        return this.textureWidth;
    }
    
    public final void setTextureWidth(final int <set-?>) {
        this.textureWidth = <set-?>;
    }
    
    public final int getTextureHeight() {
        return this.textureHeight;
    }
    
    public final void setTextureHeight(final int <set-?>) {
        this.textureHeight = <set-?>;
    }
    
    @Nullable
    public final Mat4 getExtra() {
        return this.extra;
    }
    
    public final void setExtra(@Nullable final Mat4 <set-?>) {
        this.extra = <set-?>;
    }
    
    public final float getAnimRotX() {
        return this.animRotX;
    }
    
    public final void setAnimRotX(final float <set-?>) {
        this.animRotX = <set-?>;
    }
    
    public final float getAnimRotY() {
        return this.animRotY;
    }
    
    public final void setAnimRotY(final float <set-?>) {
        this.animRotY = <set-?>;
    }
    
    public final float getAnimRotZ() {
        return this.animRotZ;
    }
    
    public final void setAnimRotZ(final float <set-?>) {
        this.animRotZ = <set-?>;
    }
    
    public final float getAnimScaleX() {
        return this.animScaleX;
    }
    
    public final void setAnimScaleX(final float <set-?>) {
        this.animScaleX = <set-?>;
    }
    
    public final float getAnimScaleY() {
        return this.animScaleY;
    }
    
    public final void setAnimScaleY(final float <set-?>) {
        this.animScaleY = <set-?>;
    }
    
    public final float getAnimScaleZ() {
        return this.animScaleZ;
    }
    
    public final void setAnimScaleZ(final float <set-?>) {
        this.animScaleZ = <set-?>;
    }
    
    @Nullable
    public final Side getSide() {
        return this.side;
    }
    
    public final void setSide(@Nullable final Side <set-?>) {
        this.side = <set-?>;
    }
    
    public final boolean getAffectsPose() {
        return this.affectsPose;
    }
    
    public final void setAffectsPose(final boolean <set-?>) {
        this.affectsPose = <set-?>;
    }
    
    public final void addChild(@NotNull final Bone child) {
        Intrinsics.checkNotNullParameter((Object)child, "child");
        this.childModels.add(child);
    }
    
    public final void propagateVisibility(final boolean parentVisible, @Nullable final Side side) {
        if (this.side != null && side != null && this.side != side) {
            this.isVisible = false;
            this.fullyInvisible = true;
            return;
        }
        boolean booleanValue;
        if (this.visible == null) {
            booleanValue = parentVisible;
        }
        else {
            final Boolean visible = this.visible;
            Intrinsics.checkNotNull((Object)visible);
            booleanValue = visible;
        }
        final boolean isVisible = booleanValue;
        boolean fullyInvisible = !isVisible;
        for (final Bone child : this.childModels) {
            child.propagateVisibility(isVisible, side);
            fullyInvisible &= child.fullyInvisible;
        }
        this.isVisible = isVisible;
        this.fullyInvisible = fullyInvisible;
    }
    
    public final void resetAnimationOffsets(final boolean recursive) {
        this.animOffsetZ = 0.0f;
        this.animOffsetY = this.animOffsetZ;
        this.animOffsetX = this.animOffsetY;
        this.animRotZ = 0.0f;
        this.animRotY = this.animRotZ;
        this.animRotX = this.animRotY;
        this.animScaleZ = 1.0f;
        this.animScaleY = this.animScaleZ;
        this.animScaleX = this.animScaleY;
        if (recursive) {
            for (final Bone childModel : this.childModels) {
                childModel.resetAnimationOffsets(true);
            }
        }
    }
    
    public final void render(@NotNull final UMatrixStack matrixStack, @NotNull final UVertexConsumer renderer, final int light, final float scale, final float verticalUVOffset) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "matrixStack"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* renderer */
        //     7: ldc             "renderer"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: getfield        gg/essential/model/Bone.showModel:Z
        //    16: ifeq            416
        //    19: aload_0         /* this */
        //    20: getfield        gg/essential/model/Bone.fullyInvisible:Z
        //    23: ifne            416
        //    26: aload_1         /* matrixStack */
        //    27: invokevirtual   gg/essential/model/util/UMatrixStack.push:()V
        //    30: aload_1         /* matrixStack */
        //    31: aload_0         /* this */
        //    32: getfield        gg/essential/model/Bone.childScale:F
        //    35: aload_0         /* this */
        //    36: getfield        gg/essential/model/Bone.childScale:F
        //    39: aload_0         /* this */
        //    40: getfield        gg/essential/model/Bone.childScale:F
        //    43: invokevirtual   gg/essential/model/util/UMatrixStack.scale:(FFF)V
        //    46: aload_0         /* this */
        //    47: getfield        gg/essential/model/Bone.pivotX:F
        //    50: fload           scale
        //    52: fmul           
        //    53: aload_0         /* this */
        //    54: getfield        gg/essential/model/Bone.animOffsetX:F
        //    57: fload           scale
        //    59: fmul           
        //    60: fadd           
        //    61: fstore          translateX
        //    63: aload_0         /* this */
        //    64: getfield        gg/essential/model/Bone.pivotY:F
        //    67: fload           scale
        //    69: fmul           
        //    70: aload_0         /* this */
        //    71: getfield        gg/essential/model/Bone.animOffsetY:F
        //    74: fload           scale
        //    76: fmul           
        //    77: fsub           
        //    78: fstore          translateY
        //    80: aload_0         /* this */
        //    81: getfield        gg/essential/model/Bone.pivotZ:F
        //    84: fload           scale
        //    86: fmul           
        //    87: aload_0         /* this */
        //    88: getfield        gg/essential/model/Bone.animOffsetZ:F
        //    91: fload           scale
        //    93: fmul           
        //    94: fadd           
        //    95: fstore          translateZ
        //    97: aload_1         /* matrixStack */
        //    98: fload           translateX
        //   100: fload           translateY
        //   102: fload           translateZ
        //   104: invokevirtual   gg/essential/model/util/UMatrixStack.translate:(FFF)V
        //   107: aload_1         /* matrixStack */
        //   108: aload_0         /* this */
        //   109: getfield        gg/essential/model/Bone.rotateAngleZ:F
        //   112: aload_0         /* this */
        //   113: getfield        gg/essential/model/Bone.animRotZ:F
        //   116: fadd           
        //   117: fconst_0       
        //   118: fconst_0       
        //   119: fconst_1       
        //   120: iconst_0       
        //   121: invokevirtual   gg/essential/model/util/UMatrixStack.rotate:(FFFFZ)V
        //   124: aload_1         /* matrixStack */
        //   125: aload_0         /* this */
        //   126: getfield        gg/essential/model/Bone.rotateAngleY:F
        //   129: aload_0         /* this */
        //   130: getfield        gg/essential/model/Bone.animRotY:F
        //   133: fadd           
        //   134: fconst_0       
        //   135: fconst_1       
        //   136: fconst_0       
        //   137: iconst_0       
        //   138: invokevirtual   gg/essential/model/util/UMatrixStack.rotate:(FFFFZ)V
        //   141: aload_1         /* matrixStack */
        //   142: aload_0         /* this */
        //   143: getfield        gg/essential/model/Bone.rotateAngleX:F
        //   146: aload_0         /* this */
        //   147: getfield        gg/essential/model/Bone.animRotX:F
        //   150: fadd           
        //   151: fconst_1       
        //   152: fconst_0       
        //   153: fconst_0       
        //   154: iconst_0       
        //   155: invokevirtual   gg/essential/model/util/UMatrixStack.rotate:(FFFFZ)V
        //   158: aload_0         /* this */
        //   159: getfield        gg/essential/model/Bone.extra:Lgg/essential/lib/kotgl/matrix/matrices/Mat4;
        //   162: dup            
        //   163: ifnull          241
        //   166: astore          it
        //   168: aload_1         /* matrixStack */
        //   169: invokevirtual   gg/essential/model/util/UMatrixStack.peek:()Lgg/essential/model/util/UMatrixStack$Entry;
        //   172: invokevirtual   gg/essential/model/util/UMatrixStack$Entry.getModel:()Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;
        //   175: aload           it
        //   177: invokestatic    gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices.toMutable:(Lgg/essential/lib/kotgl/matrix/matrices/Mat4;)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;
        //   180: astore          12
        //   182: aload           12
        //   184: astore          13
        //   186: astore          14
        //   188: aload           $this$render_u24lambda_u2d1_u24lambda_u2d0
        //   190: aload           $this$render_u24lambda_u2d1_u24lambda_u2d0
        //   192: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.getM03:()F
        //   195: fload           scale
        //   197: fmul           
        //   198: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.setM03:(F)V
        //   201: aload           $this$render_u24lambda_u2d1_u24lambda_u2d0
        //   203: aload           $this$render_u24lambda_u2d1_u24lambda_u2d0
        //   205: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.getM13:()F
        //   208: fload           scale
        //   210: fmul           
        //   211: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.setM13:(F)V
        //   214: aload           $this$render_u24lambda_u2d1_u24lambda_u2d0
        //   216: aload           $this$render_u24lambda_u2d1_u24lambda_u2d0
        //   218: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.getM23:()F
        //   221: fload           scale
        //   223: fmul           
        //   224: invokevirtual   gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4.setM23:(F)V
        //   227: aload           14
        //   229: aload           12
        //   231: checkcast       Lgg/essential/lib/kotgl/matrix/matrices/Mat4;
        //   234: invokestatic    gg/essential/lib/kotgl/matrix/matrices/mutables/MutableMatrices.timesSelf:(Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;Lgg/essential/lib/kotgl/matrix/matrices/Mat4;)Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;
        //   237: pop            
        //   238: goto            242
        //   241: pop            
        //   242: aload_1         /* matrixStack */
        //   243: aload_0         /* this */
        //   244: getfield        gg/essential/model/Bone.animScaleX:F
        //   247: aload_0         /* this */
        //   248: getfield        gg/essential/model/Bone.animScaleY:F
        //   251: aload_0         /* this */
        //   252: getfield        gg/essential/model/Bone.animScaleZ:F
        //   255: invokevirtual   gg/essential/model/util/UMatrixStack.scale:(FFF)V
        //   258: aload_1         /* matrixStack */
        //   259: aload_0         /* this */
        //   260: getfield        gg/essential/model/Bone.pivotX:F
        //   263: fneg           
        //   264: fload           scale
        //   266: fmul           
        //   267: aload_0         /* this */
        //   268: getfield        gg/essential/model/Bone.userOffsetX:F
        //   271: fload           scale
        //   273: fmul           
        //   274: fsub           
        //   275: aload_0         /* this */
        //   276: getfield        gg/essential/model/Bone.pivotY:F
        //   279: fneg           
        //   280: fload           scale
        //   282: fmul           
        //   283: aload_0         /* this */
        //   284: getfield        gg/essential/model/Bone.userOffsetY:F
        //   287: fload           scale
        //   289: fmul           
        //   290: fsub           
        //   291: aload_0         /* this */
        //   292: getfield        gg/essential/model/Bone.pivotZ:F
        //   295: fneg           
        //   296: fload           scale
        //   298: fmul           
        //   299: aload_0         /* this */
        //   300: getfield        gg/essential/model/Bone.userOffsetZ:F
        //   303: fload           scale
        //   305: fmul           
        //   306: fsub           
        //   307: invokevirtual   gg/essential/model/util/UMatrixStack.translate:(FFF)V
        //   310: aload_0         /* this */
        //   311: getfield        gg/essential/model/Bone.isVisible:Z
        //   314: ifeq            364
        //   317: aload_0         /* this */
        //   318: getfield        gg/essential/model/Bone.cubeList:Ljava/util/List;
        //   321: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   326: astore          9
        //   328: aload           9
        //   330: invokeinterface java/util/Iterator.hasNext:()Z
        //   335: ifeq            364
        //   338: aload           9
        //   340: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   345: checkcast       Lgg/essential/model/Cube;
        //   348: astore          cube
        //   350: aload           cube
        //   352: aload_1         /* matrixStack */
        //   353: aload_2         /* renderer */
        //   354: fload           scale
        //   356: fload           verticalUVOffset
        //   358: invokevirtual   gg/essential/model/Cube.render$55fcef95:(Lgg/essential/model/util/UMatrixStack;Lgg/essential/model/util/UVertexConsumer;FF)V
        //   361: goto            328
        //   364: aload_0         /* this */
        //   365: getfield        gg/essential/model/Bone.childModels:Ljava/util/List;
        //   368: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   373: astore          9
        //   375: aload           9
        //   377: invokeinterface java/util/Iterator.hasNext:()Z
        //   382: ifeq            412
        //   385: aload           9
        //   387: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   392: checkcast       Lgg/essential/model/Bone;
        //   395: astore          childModel
        //   397: aload           childModel
        //   399: aload_1         /* matrixStack */
        //   400: aload_2         /* renderer */
        //   401: iload_3         /* light */
        //   402: fload           scale
        //   404: fload           verticalUVOffset
        //   406: invokevirtual   gg/essential/model/Bone.render:(Lgg/essential/model/util/UMatrixStack;Lgg/essential/model/util/UVertexConsumer;IFF)V
        //   409: goto            375
        //   412: aload_1         /* matrixStack */
        //   413: invokevirtual   gg/essential/model/util/UMatrixStack.pop:()V
        //   416: return         
        //    MethodParameters:
        //  Name              Flags  
        //  ----------------  -----
        //  matrixStack       
        //  renderer          
        //  light             
        //  scale             
        //  verticalUVOffset  
        //    StackMapTable: 00 07 F7 00 F1 07 01 22 00 FF 00 55 00 0A 07 00 02 07 00 E3 07 01 2E 01 02 02 00 00 00 07 00 CE 00 00 FF 00 23 00 06 07 00 02 07 00 E3 07 01 2E 01 02 02 00 00 FF 00 0A 00 0A 00 07 00 E3 07 01 2E 01 02 02 00 00 00 07 00 CE 00 00 FF 00 24 00 02 00 07 00 E3 00 00 F9 00 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Bone deepCopy() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0         /* this */
        //     5: getfield        gg/essential/model/Bone.boxName:Ljava/lang/String;
        //     8: invokespecial   gg/essential/model/Bone.<init>:(Ljava/lang/String;)V
        //    11: astore_1        /* bone */
        //    12: aload_1         /* bone */
        //    13: aload_0         /* this */
        //    14: getfield        gg/essential/model/Bone.textureWidth:I
        //    17: putfield        gg/essential/model/Bone.textureWidth:I
        //    20: aload_1         /* bone */
        //    21: aload_0         /* this */
        //    22: getfield        gg/essential/model/Bone.textureHeight:I
        //    25: putfield        gg/essential/model/Bone.textureHeight:I
        //    28: aload_1         /* bone */
        //    29: aload_0         /* this */
        //    30: getfield        gg/essential/model/Bone.pivotX:F
        //    33: putfield        gg/essential/model/Bone.pivotX:F
        //    36: aload_1         /* bone */
        //    37: aload_0         /* this */
        //    38: getfield        gg/essential/model/Bone.pivotY:F
        //    41: putfield        gg/essential/model/Bone.pivotY:F
        //    44: aload_1         /* bone */
        //    45: aload_0         /* this */
        //    46: getfield        gg/essential/model/Bone.pivotZ:F
        //    49: putfield        gg/essential/model/Bone.pivotZ:F
        //    52: aload_1         /* bone */
        //    53: aload_0         /* this */
        //    54: getfield        gg/essential/model/Bone.rotateAngleX:F
        //    57: putfield        gg/essential/model/Bone.rotateAngleX:F
        //    60: aload_1         /* bone */
        //    61: aload_0         /* this */
        //    62: getfield        gg/essential/model/Bone.rotateAngleY:F
        //    65: putfield        gg/essential/model/Bone.rotateAngleY:F
        //    68: aload_1         /* bone */
        //    69: aload_0         /* this */
        //    70: getfield        gg/essential/model/Bone.rotateAngleZ:F
        //    73: putfield        gg/essential/model/Bone.rotateAngleZ:F
        //    76: aload_1         /* bone */
        //    77: new             Ljava/util/ArrayList;
        //    80: dup            
        //    81: invokespecial   java/util/ArrayList.<init>:()V
        //    84: checkcast       Ljava/util/List;
        //    87: putfield        gg/essential/model/Bone.cubeList:Ljava/util/List;
        //    90: aload_0         /* this */
        //    91: getfield        gg/essential/model/Bone.cubeList:Ljava/util/List;
        //    94: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    99: astore_2       
        //   100: aload_2        
        //   101: invokeinterface java/util/Iterator.hasNext:()Z
        //   106: ifeq            367
        //   109: aload_2        
        //   110: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   115: checkcast       Lgg/essential/model/Cube;
        //   118: astore_3        /* cube */
        //   119: aload_1         /* bone */
        //   120: getfield        gg/essential/model/Bone.cubeList:Ljava/util/List;
        //   123: aload_3         /* cube */
        //   124: invokevirtual   gg/essential/model/Cube.getQuadList:()Ljava/util/List;
        //   127: checkcast       Ljava/lang/Iterable;
        //   130: astore          4
        //   132: astore          18
        //   134: aload           $this$map$iv
        //   136: astore          5
        //   138: new             Ljava/util/ArrayList;
        //   141: dup            
        //   142: aload           $this$map$iv
        //   144: bipush          10
        //   146: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   149: invokespecial   java/util/ArrayList.<init>:(I)V
        //   152: checkcast       Ljava/util/Collection;
        //   155: astore          destination$iv$iv
        //   157: aload           $this$mapTo$iv$iv
        //   159: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   164: astore          7
        //   166: aload           7
        //   168: invokeinterface java/util/Iterator.hasNext:()Z
        //   173: ifeq            339
        //   176: aload           7
        //   178: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   183: astore          item$iv$iv
        //   185: aload           destination$iv$iv
        //   187: aload           item$iv$iv
        //   189: checkcast       Lgg/essential/model/Face;
        //   192: astore          9
        //   194: astore          19
        //   196: aload           face
        //   198: getfield        gg/essential/model/Face.vertexPositions:[Lgg/essential/model/PositionTexVertex;
        //   201: astore          $this$map$iv
        //   203: aload           $this$map$iv
        //   205: astore          11
        //   207: new             Ljava/util/ArrayList;
        //   210: dup            
        //   211: aload           $this$map$iv
        //   213: arraylength    
        //   214: invokespecial   java/util/ArrayList.<init>:(I)V
        //   217: checkcast       Ljava/util/Collection;
        //   220: astore          destination$iv$iv
        //   222: iconst_0       
        //   223: istore          13
        //   225: aload           $this$mapTo$iv$iv
        //   227: arraylength    
        //   228: istore          14
        //   230: iload           13
        //   232: iload           14
        //   234: if_icmpge       272
        //   237: aload           $this$mapTo$iv$iv
        //   239: iload           13
        //   241: aaload         
        //   242: astore          item$iv$iv
        //   244: aload           destination$iv$iv
        //   246: aload           item$iv$iv
        //   248: astore          16
        //   250: astore          17
        //   252: aload           it
        //   254: invokevirtual   gg/essential/model/PositionTexVertex.copy:()Lgg/essential/model/PositionTexVertex;
        //   257: aload           17
        //   259: swap           
        //   260: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   265: pop            
        //   266: iinc            13, 1
        //   269: goto            230
        //   272: aload           destination$iv$iv
        //   274: checkcast       Ljava/util/List;
        //   277: checkcast       Ljava/util/Collection;
        //   280: astore          $this$toTypedArray$iv
        //   282: aload           $this$toTypedArray$iv
        //   284: astore          thisCollection$iv
        //   286: aload           thisCollection$iv
        //   288: iconst_0       
        //   289: anewarray       Lgg/essential/model/PositionTexVertex;
        //   292: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   297: dup            
        //   298: ifnonnull       313
        //   301: pop            
        //   302: new             Ljava/lang/NullPointerException;
        //   305: dup            
        //   306: ldc_w           "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        //   309: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   312: athrow         
        //   313: checkcast       [Lgg/essential/model/PositionTexVertex;
        //   316: astore          20
        //   318: new             Lgg/essential/model/Face;
        //   321: dup            
        //   322: aload           20
        //   324: invokespecial   gg/essential/model/Face.<init>:([Lgg/essential/model/PositionTexVertex;)V
        //   327: aload           19
        //   329: swap           
        //   330: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   335: pop            
        //   336: goto            166
        //   339: aload           destination$iv$iv
        //   341: checkcast       Ljava/util/List;
        //   344: aload           18
        //   346: swap           
        //   347: astore          21
        //   349: new             Lgg/essential/model/Cube;
        //   352: dup            
        //   353: aload           21
        //   355: invokespecial   gg/essential/model/Cube.<init>:(Ljava/util/List;)V
        //   358: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   363: pop            
        //   364: goto            100
        //   367: aload_0         /* this */
        //   368: getfield        gg/essential/model/Bone.childModels:Ljava/util/List;
        //   371: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   376: astore_2       
        //   377: aload_2        
        //   378: invokeinterface java/util/Iterator.hasNext:()Z
        //   383: ifeq            407
        //   386: aload_2        
        //   387: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   392: checkcast       Lgg/essential/model/Bone;
        //   395: astore_3        /* childModel */
        //   396: aload_1         /* bone */
        //   397: aload_3         /* childModel */
        //   398: invokevirtual   gg/essential/model/Bone.deepCopy:()Lgg/essential/model/Bone;
        //   401: invokevirtual   gg/essential/model/Bone.addChild:(Lgg/essential/model/Bone;)V
        //   404: goto            377
        //   407: aload_1         /* bone */
        //   408: aload_0         /* this */
        //   409: getfield        gg/essential/model/Bone.affectsPose:Z
        //   412: putfield        gg/essential/model/Bone.affectsPose:Z
        //   415: aload_1         /* bone */
        //   416: areturn        
        //    StackMapTable: 00 09 FD 00 64 07 00 02 07 00 CE FF 00 41 00 13 07 00 02 07 00 02 07 00 CE 00 00 00 07 01 53 07 00 CE 00 00 00 00 00 00 00 00 00 00 07 00 92 00 00 FF 00 3F 00 14 07 00 02 07 00 02 07 00 CE 00 00 00 07 01 53 07 00 CE 00 00 00 07 01 5B 07 01 53 01 01 00 00 00 07 00 92 07 01 53 00 00 FF 00 29 00 14 07 00 02 07 00 02 07 00 CE 00 00 00 07 01 53 07 00 CE 00 00 00 00 07 01 53 00 00 00 00 00 07 00 92 07 01 53 00 00 FF 00 28 00 14 07 00 02 07 00 02 07 00 CE 00 00 00 07 01 53 07 00 CE 00 00 00 00 00 00 00 00 00 00 07 00 92 07 01 53 00 01 07 01 6D FF 00 19 00 13 07 00 02 07 00 02 07 00 CE 00 00 00 07 01 53 00 00 00 00 00 00 00 00 00 00 00 07 00 92 00 00 FF 00 1B 00 02 07 00 02 07 00 02 00 00 FC 00 09 07 00 CE FA 00 1D
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean containsVisibleBoxes() {
        if (!this.fullyInvisible) {
            if (this.cubeList.isEmpty() || !this.isVisible) {
                final Iterable $this$any$iv = this.childModels;
                boolean b = false;
                Label_0110: {
                    if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                        b = false;
                    }
                    else {
                        for (final Object element$iv : $this$any$iv) {
                            final Bone it = (Bone)element$iv;
                            if (it.containsVisibleBoxes()) {
                                b = true;
                                break Label_0110;
                            }
                        }
                        b = false;
                    }
                }
                if (!b) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
