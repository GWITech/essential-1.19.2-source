package gg.essential.util.lwjgl3.asm;

import java.util.function.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b" }, d2 = { "Lgg/essential/util/lwjgl3/asm/GLBridgeTransformer;", "Ljava/util/function/BiFunction;", "", "", "()V", "apply", "name", "bytes", "lwjgl3" })
public final class GLBridgeTransformer implements BiFunction<String, byte[], byte[]>
{
    public GLBridgeTransformer() {
        super();
    }
    
    @NotNull
    @Override
    public byte[] apply(@NotNull final String name, @NotNull final byte[] bytes) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "name"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* bytes */
        //     7: ldc             "bytes"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_1         /* name */
        //    13: ldc             "org.lwjgl.nanovg.NanoVGGLConfig"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    18: ifeq            342
        //    21: new             Lorg/objectweb/asm/tree/ClassNode;
        //    24: dup            
        //    25: invokespecial   org/objectweb/asm/tree/ClassNode.<init>:()V
        //    28: astore          5
        //    30: aload           5
        //    32: astore          $this$apply_u24lambda_u2d0
        //    34: new             Lorg/objectweb/asm/ClassReader;
        //    37: dup            
        //    38: aload_2         /* bytes */
        //    39: invokespecial   org/objectweb/asm/ClassReader.<init>:([B)V
        //    42: aload           $this$apply_u24lambda_u2d0
        //    44: checkcast       Lorg/objectweb/asm/ClassVisitor;
        //    47: iconst_0       
        //    48: invokevirtual   org/objectweb/asm/ClassReader.accept:(Lorg/objectweb/asm/ClassVisitor;I)V
        //    51: aload           5
        //    53: astore          node
        //    55: aload           node
        //    57: getfield        org/objectweb/asm/tree/ClassNode.methods:Ljava/util/List;
        //    60: dup            
        //    61: ldc             "node.methods"
        //    63: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    66: checkcast       Ljava/lang/Iterable;
        //    69: astore          $this$first$iv
        //    71: aload           $this$first$iv
        //    73: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    78: astore          8
        //    80: aload           8
        //    82: invokeinterface java/util/Iterator.hasNext:()Z
        //    87: ifeq            124
        //    90: aload           8
        //    92: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    97: astore          element$iv
        //    99: aload           element$iv
        //   101: checkcast       Lorg/objectweb/asm/tree/MethodNode;
        //   104: astore          it
        //   106: aload           it
        //   108: getfield        org/objectweb/asm/tree/MethodNode.name:Ljava/lang/String;
        //   111: ldc             "configGL"
        //   113: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   116: ifeq            80
        //   119: aload           element$iv
        //   121: goto            134
        //   124: new             Ljava/util/NoSuchElementException;
        //   127: dup            
        //   128: ldc             "Collection contains no element matching the predicate."
        //   130: invokespecial   java/util/NoSuchElementException.<init>:(Ljava/lang/String;)V
        //   133: athrow         
        //   134: checkcast       Lorg/objectweb/asm/tree/MethodNode;
        //   137: getfield        org/objectweb/asm/tree/MethodNode.instructions:Lorg/objectweb/asm/tree/InsnList;
        //   140: invokevirtual   org/objectweb/asm/tree/InsnList.toArray:()[Lorg/objectweb/asm/tree/AbstractInsnNode;
        //   143: astore          5
        //   145: aload           5
        //   147: ldc             "node.methods\n           \u2026               .toArray()"
        //   149: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   152: aload           5
        //   154: checkcast       [Ljava/lang/Object;
        //   157: astore          $this$filterIsInstance$iv
        //   159: aload           $this$filterIsInstance$iv
        //   161: astore          7
        //   163: new             Ljava/util/ArrayList;
        //   166: dup            
        //   167: invokespecial   java/util/ArrayList.<init>:()V
        //   170: checkcast       Ljava/util/Collection;
        //   173: astore          destination$iv$iv
        //   175: iconst_0       
        //   176: istore          10
        //   178: aload           $this$filterIsInstanceTo$iv$iv
        //   180: arraylength    
        //   181: istore          11
        //   183: iload           10
        //   185: iload           11
        //   187: if_icmpge       221
        //   190: aload           $this$filterIsInstanceTo$iv$iv
        //   192: iload           10
        //   194: aaload         
        //   195: astore          element$iv$iv
        //   197: aload           element$iv$iv
        //   199: instanceof      Lorg/objectweb/asm/tree/LdcInsnNode;
        //   202: ifeq            215
        //   205: aload           destination$iv$iv
        //   207: aload           element$iv$iv
        //   209: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   214: pop            
        //   215: iinc            10, 1
        //   218: goto            183
        //   221: aload           destination$iv$iv
        //   223: checkcast       Ljava/util/List;
        //   226: checkcast       Ljava/lang/Iterable;
        //   229: astore          $this$first$iv
        //   231: aload           $this$first$iv
        //   233: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   238: astore          7
        //   240: aload           7
        //   242: invokeinterface java/util/Iterator.hasNext:()Z
        //   247: ifeq            284
        //   250: aload           7
        //   252: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   257: astore          element$iv
        //   259: aload           element$iv
        //   261: checkcast       Lorg/objectweb/asm/tree/LdcInsnNode;
        //   264: astore          it
        //   266: aload           it
        //   268: getfield        org/objectweb/asm/tree/LdcInsnNode.cst:Ljava/lang/Object;
        //   271: ldc             "org.lwjgl.opengl.GL"
        //   273: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   276: ifeq            240
        //   279: aload           element$iv
        //   281: goto            294
        //   284: new             Ljava/util/NoSuchElementException;
        //   287: dup            
        //   288: ldc             "Collection contains no element matching the predicate."
        //   290: invokespecial   java/util/NoSuchElementException.<init>:(Ljava/lang/String;)V
        //   293: athrow         
        //   294: checkcast       Lorg/objectweb/asm/tree/LdcInsnNode;
        //   297: ldc             "gg.essential.util.lwjgl3.impl.GLBridge"
        //   299: putfield        org/objectweb/asm/tree/LdcInsnNode.cst:Ljava/lang/Object;
        //   302: new             Lorg/objectweb/asm/ClassWriter;
        //   305: dup            
        //   306: iconst_0       
        //   307: invokespecial   org/objectweb/asm/ClassWriter.<init>:(I)V
        //   310: astore          5
        //   312: aload           5
        //   314: astore          $this$apply_u24lambda_u2d3
        //   316: aload           node
        //   318: aload           $this$apply_u24lambda_u2d3
        //   320: checkcast       Lorg/objectweb/asm/ClassVisitor;
        //   323: invokevirtual   org/objectweb/asm/tree/ClassNode.accept:(Lorg/objectweb/asm/ClassVisitor;)V
        //   326: aload           5
        //   328: invokevirtual   org/objectweb/asm/ClassWriter.toByteArray:()[B
        //   331: astore_3       
        //   332: aload_3        
        //   333: ldc             "{\n            val node =\u2026}.toByteArray()\n        }"
        //   335: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   338: aload_3        
        //   339: goto            343
        //   342: aload_2         /* bytes */
        //   343: areturn        
        //    MethodParameters:
        //  Name   Flags  
        //  -----  -----
        //  name   
        //  bytes  
        //    StackMapTable: 00 0B FF 00 50 00 09 00 00 00 00 07 00 31 00 00 00 07 00 4E 00 00 FF 00 2B 00 00 00 00 FF 00 09 00 05 00 00 00 00 07 00 31 00 01 07 00 05 FF 00 30 00 0C 00 00 00 00 07 00 31 00 00 07 00 72 07 00 77 00 01 01 00 00 1F FF 00 05 00 09 00 00 00 00 07 00 31 00 00 00 07 00 77 00 00 FF 00 12 00 08 00 00 00 00 07 00 31 00 00 07 00 4E 00 00 FF 00 2B 00 00 00 00 FF 00 09 00 05 00 00 00 00 07 00 31 00 01 07 00 05 FF 00 2F 00 03 00 00 07 00 97 00 00 FF 00 00 00 00 00 01 07 00 97
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public /* bridge */ Object apply(final Object p0, final Object p1) {
        return this.apply((String)p0, (byte[])p1);
    }
}
