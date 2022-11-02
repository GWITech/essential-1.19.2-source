package gg.essential.model;

import kotlin.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.model.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001BE\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fB\u0013\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0013R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001d" }, d2 = { "Lgg/essential/model/Face;", "", "vertices", "", "Lgg/essential/model/PositionTexVertex;", "texcoordU1", "", "texcoordV1", "texcoordU2", "texcoordV2", "frameWidth", "frameHeight", "([Lgg/essential/model/PositionTexVertex;FFFFFF)V", "vertexPositions", "([Lgg/essential/model/PositionTexVertex;)V", "normal", "Lgg/essential/model/Vector3;", "[Lgg/essential/model/PositionTexVertex;", "draw", "", "matrixStack", "Lgg/essential/model/util/UMatrixStack;", "buffer", "Lgg/essential/model/util/UVertexConsumer;", "light", "", "scale", "verticalUVOffset", "flipFace", "cosmetics" })
public final class Face
{
    @JvmField
    @NotNull
    public PositionTexVertex[] vertexPositions;
    @NotNull
    private Vector3 normal;
    
    public Face(@NotNull final PositionTexVertex[] vertexPositions) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "vertexPositions"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* vertexPositions */
        //    12: putfield        gg/essential/model/Face.vertexPositions:[Lgg/essential/model/PositionTexVertex;
        //    15: aload_0         /* this */
        //    16: getfield        gg/essential/model/Face.vertexPositions:[Lgg/essential/model/PositionTexVertex;
        //    19: astore_3        /* $this$map$iv */
        //    20: aload_3         /* $this$map$iv */
        //    21: astore          5
        //    23: new             Ljava/util/ArrayList;
        //    26: dup            
        //    27: aload_3         /* $this$map$iv */
        //    28: arraylength    
        //    29: invokespecial   java/util/ArrayList.<init>:(I)V
        //    32: checkcast       Ljava/util/Collection;
        //    35: astore          destination$iv$iv
        //    37: iconst_0       
        //    38: istore          7
        //    40: aload           $this$mapTo$iv$iv
        //    42: arraylength    
        //    43: istore          8
        //    45: iload           7
        //    47: iload           8
        //    49: if_icmpge       87
        //    52: aload           $this$mapTo$iv$iv
        //    54: iload           7
        //    56: aaload         
        //    57: astore          item$iv$iv
        //    59: aload           destination$iv$iv
        //    61: aload           item$iv$iv
        //    63: astore          10
        //    65: astore          11
        //    67: aload           it
        //    69: getfield        gg/essential/model/PositionTexVertex.vector3:Lgg/essential/model/Vector3;
        //    72: aload           11
        //    74: swap           
        //    75: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    80: pop            
        //    81: iinc            7, 1
        //    84: goto            45
        //    87: aload           destination$iv$iv
        //    89: checkcast       Ljava/util/List;
        //    92: astore_2       
        //    93: aload_2        
        //    94: iconst_0       
        //    95: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   100: checkcast       Lgg/essential/model/Vector3;
        //   103: astore_3        /* a */
        //   104: aload_2        
        //   105: iconst_1       
        //   106: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   111: checkcast       Lgg/essential/model/Vector3;
        //   114: astore          b
        //   116: aload_2        
        //   117: iconst_2       
        //   118: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   123: checkcast       Lgg/essential/model/Vector3;
        //   126: astore          c
        //   128: aload_0         /* this */
        //   129: aload           c
        //   131: aload           b
        //   133: invokevirtual   gg/essential/model/Vector3.minus:(Lgg/essential/model/Vector3;)Lgg/essential/model/Vector3;
        //   136: aload_3         /* a */
        //   137: aload           b
        //   139: invokevirtual   gg/essential/model/Vector3.minus:(Lgg/essential/model/Vector3;)Lgg/essential/model/Vector3;
        //   142: invokevirtual   gg/essential/model/Vector3.cross:(Lgg/essential/model/Vector3;)Lgg/essential/model/Vector3;
        //   145: invokevirtual   gg/essential/model/Vector3.normalize:()Lgg/essential/model/Vector3;
        //   148: putfield        gg/essential/model/Face.normal:Lgg/essential/model/Vector3;
        //   151: return         
        //    MethodParameters:
        //  Name             Flags  
        //  ---------------  -----
        //  vertexPositions  
        //    StackMapTable: 00 02 FF 00 2D 00 09 07 00 02 00 00 00 00 07 00 41 07 00 40 01 01 00 00 FF 00 29 00 07 07 00 02 00 00 00 00 00 07 00 40 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Face(@NotNull final PositionTexVertex[] vertices, final float texcoordU1, final float texcoordV1, final float texcoordU2, final float texcoordV2, final float frameWidth, final float frameHeight) {
        Intrinsics.checkNotNullParameter((Object)vertices, "vertices");
        this(vertices);
        final float u1 = (float)Math.floor(texcoordU1);
        final float v1 = (float)Math.floor(texcoordV1);
        final float u2 = (float)Math.floor(texcoordU2);
        final float v2 = (float)Math.floor(texcoordV2);
        final float du = 0.0f / frameWidth;
        final float dv = 0.0f / frameHeight;
        vertices[0] = vertices[0].setTexturePosition(u2 / frameWidth - du, v1 / frameHeight + dv);
        vertices[1] = vertices[1].setTexturePosition(u1 / frameWidth + du, v1 / frameHeight + dv);
        vertices[2] = vertices[2].setTexturePosition(u1 / frameWidth + du, v2 / frameHeight - dv);
        vertices[3] = vertices[3].setTexturePosition(u2 / frameWidth - du, v2 / frameHeight - dv);
    }
    
    public final void flipFace() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0         /* this */
        //     2: getfield        gg/essential/model/Face.vertexPositions:[Lgg/essential/model/PositionTexVertex;
        //     5: astore_1       
        //     6: astore          8
        //     8: aload_1         /* $this$mapIndexed$iv */
        //     9: astore_2       
        //    10: new             Ljava/util/ArrayList;
        //    13: dup            
        //    14: aload_1         /* $this$mapIndexed$iv */
        //    15: arraylength    
        //    16: invokespecial   java/util/ArrayList.<init>:(I)V
        //    19: checkcast       Ljava/util/Collection;
        //    22: astore_3        /* destination$iv$iv */
        //    23: iconst_0       
        //    24: istore          index$iv$iv
        //    26: iconst_0       
        //    27: istore          5
        //    29: aload_2         /* $this$mapIndexedTo$iv$iv */
        //    30: arraylength    
        //    31: istore          6
        //    33: iload           5
        //    35: iload           6
        //    37: if_icmpge       80
        //    40: aload_3         /* destination$iv$iv */
        //    41: iload           index$iv$iv
        //    43: iinc            index$iv$iv, 1
        //    46: istore          7
        //    48: astore          9
        //    50: aload_0         /* this */
        //    51: getfield        gg/essential/model/Face.vertexPositions:[Lgg/essential/model/PositionTexVertex;
        //    54: aload_0         /* this */
        //    55: getfield        gg/essential/model/Face.vertexPositions:[Lgg/essential/model/PositionTexVertex;
        //    58: arraylength    
        //    59: iload           i
        //    61: isub           
        //    62: iconst_1       
        //    63: isub           
        //    64: aaload         
        //    65: aload           9
        //    67: swap           
        //    68: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    73: pop            
        //    74: iinc            5, 1
        //    77: goto            33
        //    80: aload_3         /* destination$iv$iv */
        //    81: checkcast       Ljava/util/List;
        //    84: aload           8
        //    86: swap           
        //    87: checkcast       Ljava/util/Collection;
        //    90: astore_1        /* $this$toTypedArray$iv */
        //    91: aload_1         /* $this$toTypedArray$iv */
        //    92: astore_2        /* thisCollection$iv */
        //    93: aload_2         /* thisCollection$iv */
        //    94: iconst_0       
        //    95: anewarray       Lgg/essential/model/PositionTexVertex;
        //    98: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   103: dup            
        //   104: ifnonnull       118
        //   107: pop            
        //   108: new             Ljava/lang/NullPointerException;
        //   111: dup            
        //   112: ldc             "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        //   114: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   117: athrow         
        //   118: checkcast       [Lgg/essential/model/PositionTexVertex;
        //   121: putfield        gg/essential/model/Face.vertexPositions:[Lgg/essential/model/PositionTexVertex;
        //   124: aload_0         /* this */
        //   125: new             Lgg/essential/model/Vector3;
        //   128: dup            
        //   129: invokespecial   gg/essential/model/Vector3.<init>:()V
        //   132: aload_0         /* this */
        //   133: getfield        gg/essential/model/Face.normal:Lgg/essential/model/Vector3;
        //   136: invokevirtual   gg/essential/model/Vector3.sub:(Lgg/essential/model/Vector3;)Lgg/essential/model/Vector3;
        //   139: putfield        gg/essential/model/Face.normal:Lgg/essential/model/Vector3;
        //   142: return         
        //    StackMapTable: 00 03 FF 00 21 00 09 07 00 02 00 00 07 00 40 01 01 01 00 07 00 02 00 00 FF 00 2E 00 09 07 00 02 00 00 07 00 40 00 00 00 00 07 00 02 00 00 FF 00 25 00 01 07 00 02 00 02 07 00 02 07 00 8D
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void draw$55fcef95(@NotNull final UMatrixStack matrixStack, @NotNull final UVertexConsumer buffer, final float scale, final float verticalUVOffset) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)buffer, "buffer");
        final float nx = this.normal.x;
        final float ny = this.normal.y;
        final float nz = this.normal.z;
        for (int i = 0; i < 4; ++i) {
            final PositionTexVertex PositionTexVertex = this.vertexPositions[i];
            buffer.pos(matrixStack, PositionTexVertex.vector3.x * scale, PositionTexVertex.vector3.y * scale, PositionTexVertex.vector3.z * scale);
            buffer.tex(PositionTexVertex.getTexturePositionX(), PositionTexVertex.texturePositionY + verticalUVOffset);
            buffer.norm(matrixStack, nx, ny, nz);
            buffer.endVertex();
        }
    }
}
