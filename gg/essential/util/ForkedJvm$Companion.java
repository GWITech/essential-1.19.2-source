package gg.essential.util;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a
                                                    \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\b""" }, d2 = { "Lgg/essential/util/ForkedJvm$Companion;", "", "()V", "LOGGER", "Lorg/apache/logging/log4j/Logger;", "kotlin.jvm.PlatformType", "defaultClassPath", "", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final String defaultClassPath() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: anewarray       Ljava/lang/Class;
        //     5: astore_1       
        //     6: aload_1        
        //     7: iconst_0       
        //     8: ldc             Lgg/essential/util/ForkedJvm;.class
        //    10: aastore        
        //    11: aload_1        
        //    12: iconst_1       
        //    13: ldc             Lkotlin/Unit;.class
        //    15: aastore        
        //    16: aload_1        
        //    17: iconst_2       
        //    18: ldc             "kotlin.io.path.PathsKt"
        //    20: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    23: aastore        
        //    24: aload_1        
        //    25: iconst_3       
        //    26: ldc             "kotlin.collections.jdk8.CollectionsJDK8Kt"
        //    28: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    31: aastore        
        //    32: aload_1        
        //    33: iconst_4       
        //    34: ldc             Lkotlin/reflect/full/IllegalCallableAccessException;.class
        //    36: aastore        
        //    37: aload_1        
        //    38: iconst_5       
        //    39: ldc             Lkotlin/coroutines/CoroutineContext;.class
        //    41: aastore        
        //    42: aload_1        
        //    43: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //    46: checkcast       Ljava/lang/Iterable;
        //    49: astore_1        /* $this$map$iv */
        //    50: aload_1         /* $this$map$iv */
        //    51: astore_3       
        //    52: new             Ljava/util/ArrayList;
        //    55: dup            
        //    56: aload_1         /* $this$map$iv */
        //    57: bipush          10
        //    59: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    62: invokespecial   java/util/ArrayList.<init>:(I)V
        //    65: checkcast       Ljava/util/Collection;
        //    68: astore          destination$iv$iv
        //    70: aload_3         /* $this$mapTo$iv$iv */
        //    71: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    76: astore          5
        //    78: aload           5
        //    80: invokeinterface java/util/Iterator.hasNext:()Z
        //    85: ifeq            152
        //    88: aload           5
        //    90: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    95: astore          item$iv$iv
        //    97: aload           destination$iv$iv
        //    99: aload           item$iv$iv
        //   101: checkcast       Ljava/lang/Class;
        //   104: astore          7
        //   106: astore          13
        //   108: aload           cls
        //   110: ldc             "cls"
        //   112: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   115: aload           cls
        //   117: invokestatic    gg/essential/util/HelpersKt.findCodeSource:(Ljava/lang/Class;)Lgg/essential/util/CodeSource;
        //   120: dup            
        //   121: ifnonnull       140
        //   124: pop            
        //   125: new             Ljava/lang/UnsupportedOperationException;
        //   128: dup            
        //   129: aload           cls
        //   131: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/Class;)Ljava/lang/String;
        //   136: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //   139: athrow         
        //   140: aload           13
        //   142: swap           
        //   143: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   148: pop            
        //   149: goto            78
        //   152: aload           destination$iv$iv
        //   154: checkcast       Ljava/util/List;
        //   157: astore_1        /* $this$map$iv */
        //   158: aload_1        
        //   159: astore_2        /* it */
        //   160: aload_2         /* it */
        //   161: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        //   164: instanceof      Lgg/essential/util/CodeSource$Directory;
        //   167: ifeq            182
        //   170: ldc             "java.class.path"
        //   172: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   175: dup            
        //   176: ldc             "getProperty(\"java.class.path\")"
        //   178: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   181: areturn        
        //   182: aload_1        
        //   183: checkcast       Ljava/lang/Iterable;
        //   186: astore_1        /* $this$mapNotNull$iv */
        //   187: aload_1         /* $this$mapNotNull$iv */
        //   188: astore_3       
        //   189: new             Ljava/util/ArrayList;
        //   192: dup            
        //   193: invokespecial   java/util/ArrayList.<init>:()V
        //   196: checkcast       Ljava/util/Collection;
        //   199: astore          destination$iv$iv
        //   201: aload_3         /* $this$mapNotNullTo$iv$iv */
        //   202: astore          $this$forEach$iv$iv$iv
        //   204: aload           $this$forEach$iv$iv$iv
        //   206: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   211: astore          7
        //   213: aload           7
        //   215: invokeinterface java/util/Iterator.hasNext:()Z
        //   220: ifeq            317
        //   223: aload           7
        //   225: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   230: astore          element$iv$iv$iv
        //   232: aload           element$iv$iv$iv
        //   234: astore          element$iv$iv
        //   236: aload           element$iv$iv
        //   238: checkcast       Lgg/essential/util/CodeSource;
        //   241: astore          it
        //   243: aload           it
        //   245: astore          11
        //   247: aload           11
        //   249: instanceof      Lgg/essential/util/CodeSource$Jar;
        //   252: ifeq            274
        //   255: aload           it
        //   257: checkcast       Lgg/essential/util/CodeSource$Jar;
        //   260: invokevirtual   gg/essential/util/CodeSource$Jar.getPath:()Ljava/nio/file/Path;
        //   263: invokeinterface java/nio/file/Path.toAbsolutePath:()Ljava/nio/file/Path;
        //   268: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   271: goto            294
        //   274: aload           11
        //   276: instanceof      Lgg/essential/util/CodeSource$Directory;
        //   279: ifeq            286
        //   282: aconst_null    
        //   283: goto            294
        //   286: new             Lkotlin/NoWhenBranchMatchedException;
        //   289: dup            
        //   290: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   293: athrow         
        //   294: dup            
        //   295: ifnull          313
        //   298: astore          it$iv$iv
        //   300: aload           destination$iv$iv
        //   302: aload           it$iv$iv
        //   304: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   309: pop            
        //   310: goto            213
        //   313: pop            
        //   314: goto            213
        //   317: aload           destination$iv$iv
        //   319: checkcast       Ljava/util/List;
        //   322: checkcast       Ljava/lang/Iterable;
        //   325: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //   328: checkcast       Ljava/lang/Iterable;
        //   331: ldc             "path.separator"
        //   333: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   336: dup            
        //   337: ldc             "getProperty(\"path.separator\")"
        //   339: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   342: checkcast       Ljava/lang/CharSequence;
        //   345: aconst_null    
        //   346: aconst_null    
        //   347: iconst_0       
        //   348: aconst_null    
        //   349: aconst_null    
        //   350: bipush          62
        //   352: aconst_null    
        //   353: invokestatic    kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        //   356: areturn        
        //    StackMapTable: 00 0A FF 00 4E 00 06 00 00 00 00 07 00 44 07 00 4A 00 00 FF 00 3D 00 0E 00 00 00 00 07 00 44 07 00 4A 00 00 00 00 00 00 00 07 00 44 00 01 07 00 73 FF 00 0B 00 05 00 00 00 00 07 00 44 00 00 FF 00 1D 00 02 00 07 00 79 00 00 FF 00 1E 00 08 00 00 00 00 07 00 44 00 00 07 00 4A 00 00 FF 00 3C 00 0C 00 00 00 00 07 00 44 00 00 07 00 4A 00 00 00 07 00 73 00 00 FF 00 0B 00 00 00 00 FF 00 07 00 08 00 00 00 00 07 00 44 00 00 07 00 4A 00 01 07 00 9D 52 07 00 9D F8 00 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Companion(final byte b) {
        this();
    }
}
