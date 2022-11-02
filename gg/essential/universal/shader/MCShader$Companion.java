package gg.essential.universal.shader;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import net.minecraft.util.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020\b2\u0006\u0010
                                                   \u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\f""" }, d2 = { "Lgg/essential/universal/shader/MCShader$Companion;", "", "()V", "DEBUG_LEGACY", "", "fromLegacyShader", "Lgg/essential/universal/shader/MCShader;", "vertSource", "", "fragSource", "blendState", "Lgg/essential/universal/shader/BlendState;", "universalcraft" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final MCShader fromLegacyShader(@NotNull final String vertSource, @NotNull final String fragSource, @NotNull final BlendState blendState) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "vertSource"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* fragSource */
        //     7: ldc             "fragSource"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* blendState */
        //    13: ldc             "blendState"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: new             Lgg/essential/universal/shader/ShaderTransformer;
        //    21: dup            
        //    22: invokespecial   gg/essential/universal/shader/ShaderTransformer.<init>:()V
        //    25: astore          transformer
        //    27: aload           transformer
        //    29: aload_1         /* vertSource */
        //    30: invokevirtual   gg/essential/universal/shader/ShaderTransformer.transform:(Ljava/lang/String;)Ljava/lang/String;
        //    33: astore          transformedVertSource
        //    35: aload           transformer
        //    37: aload_2         /* fragSource */
        //    38: invokevirtual   gg/essential/universal/shader/ShaderTransformer.transform:(Ljava/lang/String;)Ljava/lang/String;
        //    41: astore          transformedFragSource
        //    43: aload_3         /* blendState */
        //    44: invokevirtual   gg/essential/universal/shader/BlendState.getEquation:()Lgg/essential/universal/shader/BlendState$Equation;
        //    47: invokevirtual   gg/essential/universal/shader/BlendState$Equation.getMcStr$universalcraft:()Ljava/lang/String;
        //    50: aload_3         /* blendState */
        //    51: invokevirtual   gg/essential/universal/shader/BlendState.getSrcRgb:()Lgg/essential/universal/shader/BlendState$Param;
        //    54: invokevirtual   gg/essential/universal/shader/BlendState$Param.getMcStr$universalcraft:()Ljava/lang/String;
        //    57: aload_3         /* blendState */
        //    58: invokevirtual   gg/essential/universal/shader/BlendState.getDstRgb:()Lgg/essential/universal/shader/BlendState$Param;
        //    61: invokevirtual   gg/essential/universal/shader/BlendState$Param.getMcStr$universalcraft:()Ljava/lang/String;
        //    64: aload_3         /* blendState */
        //    65: invokevirtual   gg/essential/universal/shader/BlendState.getSrcAlpha:()Lgg/essential/universal/shader/BlendState$Param;
        //    68: invokevirtual   gg/essential/universal/shader/BlendState$Param.getMcStr$universalcraft:()Ljava/lang/String;
        //    71: aload_3         /* blendState */
        //    72: invokevirtual   gg/essential/universal/shader/BlendState.getDstAlpha:()Lgg/essential/universal/shader/BlendState$Param;
        //    75: invokevirtual   gg/essential/universal/shader/BlendState$Param.getMcStr$universalcraft:()Ljava/lang/String;
        //    78: aload           transformedVertSource
        //    80: invokestatic    org/apache/commons/codec/digest/DigestUtils.sha1Hex:(Ljava/lang/String;)Ljava/lang/String;
        //    83: astore          8
        //    85: aload           8
        //    87: ldc             "sha1Hex(transformedVertSource)"
        //    89: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    92: aload           8
        //    94: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //    97: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   100: dup            
        //   101: ldc             "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)"
        //   103: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   106: aload           transformedFragSource
        //   108: invokestatic    org/apache/commons/codec/digest/DigestUtils.sha1Hex:(Ljava/lang/String;)Ljava/lang/String;
        //   111: astore          8
        //   113: aload           8
        //   115: ldc             "sha1Hex(transformedFragSource)"
        //   117: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   120: aload           8
        //   122: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //   125: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   128: dup            
        //   129: ldc             "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)"
        //   131: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   134: aload           transformer
        //   136: invokevirtual   gg/essential/universal/shader/ShaderTransformer.getAttributes:()Ljava/util/Set;
        //   139: checkcast       Ljava/lang/Iterable;
        //   142: aconst_null    
        //   143: aconst_null    
        //   144: aconst_null    
        //   145: iconst_0       
        //   146: aconst_null    
        //   147: getstatic       gg/essential/universal/shader/MCShader$Companion$fromLegacyShader$json$1.INSTANCE:Lgg/essential/universal/shader/MCShader$Companion$fromLegacyShader$json$1;
        //   150: checkcast       Lkotlin/jvm/functions/Function1;
        //   153: bipush          31
        //   155: aconst_null    
        //   156: invokestatic    kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        //   159: aload           transformer
        //   161: invokevirtual   gg/essential/universal/shader/ShaderTransformer.getSamplers:()Ljava/util/Set;
        //   164: checkcast       Ljava/lang/Iterable;
        //   167: ldc             ",\n"
        //   169: checkcast       Ljava/lang/CharSequence;
        //   172: aconst_null    
        //   173: aconst_null    
        //   174: iconst_0       
        //   175: aconst_null    
        //   176: getstatic       gg/essential/universal/shader/MCShader$Companion$fromLegacyShader$json$2.INSTANCE:Lgg/essential/universal/shader/MCShader$Companion$fromLegacyShader$json$2;
        //   179: checkcast       Lkotlin/jvm/functions/Function1;
        //   182: bipush          30
        //   184: aconst_null    
        //   185: invokestatic    kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        //   188: aload           transformer
        //   190: invokevirtual   gg/essential/universal/shader/ShaderTransformer.getUniforms:()Ljava/util/Map;
        //   193: astore          8
        //   195: astore          29
        //   197: astore          28
        //   199: astore          27
        //   201: astore          26
        //   203: astore          25
        //   205: astore          24
        //   207: astore          23
        //   209: astore          22
        //   211: astore          21
        //   213: iconst_0       
        //   214: istore          $i$f$map
        //   216: aload           $this$map$iv
        //   218: astore          10
        //   220: new             Ljava/util/ArrayList;
        //   223: dup            
        //   224: aload           $this$map$iv
        //   226: invokeinterface java/util/Map.size:()I
        //   231: invokespecial   java/util/ArrayList.<init>:(I)V
        //   234: checkcast       Ljava/util/Collection;
        //   237: astore          destination$iv$iv
        //   239: iconst_0       
        //   240: istore          $i$f$mapTo
        //   242: aload           $this$mapTo$iv$iv
        //   244: astore          13
        //   246: aload           13
        //   248: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   253: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   258: astore          15
        //   260: aload           15
        //   262: invokeinterface java/util/Iterator.hasNext:()Z
        //   267: ifeq            367
        //   270: aload           15
        //   272: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   277: checkcast       Ljava/util/Map$Entry;
        //   280: astore          item$iv$iv
        //   282: aload           destination$iv$iv
        //   284: aload           item$iv$iv
        //   286: astore          17
        //   288: astore          30
        //   290: iconst_0       
        //   291: istore          $i$a$-map-MCShader$Companion$fromLegacyShader$json$3
        //   293: aload           $dstr$name$type
        //   295: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   300: checkcast       Ljava/lang/String;
        //   303: astore          name
        //   305: aload           $dstr$name$type
        //   307: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   312: checkcast       Lgg/essential/universal/shader/UniformType;
        //   315: astore          type
        //   317: aload           name
        //   319: aload           type
        //   321: invokevirtual   gg/essential/universal/shader/UniformType.getTypeName:()Ljava/lang/String;
        //   324: aload           type
        //   326: invokevirtual   gg/essential/universal/shader/UniformType.getDefault:()[I
        //   329: arraylength    
        //   330: aload           type
        //   332: invokevirtual   gg/essential/universal/shader/UniformType.getDefault:()[I
        //   335: aconst_null    
        //   336: aconst_null    
        //   337: aconst_null    
        //   338: iconst_0       
        //   339: aconst_null    
        //   340: aconst_null    
        //   341: bipush          63
        //   343: aconst_null    
        //   344: invokestatic    kotlin/collections/ArraysKt.joinToString$default:([ILjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        //   347: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
        //   352: invokestatic    kotlin/text/StringsKt.trimIndent:(Ljava/lang/String;)Ljava/lang/String;
        //   355: aload           30
        //   357: swap           
        //   358: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   363: pop            
        //   364: goto            260
        //   367: aload           destination$iv$iv
        //   369: checkcast       Ljava/util/List;
        //   372: nop            
        //   373: astore          30
        //   375: aload           21
        //   377: aload           22
        //   379: aload           23
        //   381: aload           24
        //   383: aload           25
        //   385: aload           26
        //   387: aload           27
        //   389: aload           28
        //   391: aload           29
        //   393: aload           30
        //   395: checkcast       Ljava/lang/Iterable;
        //   398: ldc             ",\n"
        //   400: checkcast       Ljava/lang/CharSequence;
        //   403: aconst_null    
        //   404: aconst_null    
        //   405: iconst_0       
        //   406: aconst_null    
        //   407: aconst_null    
        //   408: bipush          62
        //   410: aconst_null    
        //   411: invokestatic    kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        //   414: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   419: invokestatic    kotlin/text/StringsKt.trimIndent:(Ljava/lang/String;)Ljava/lang/String;
        //   422: astore          json
        //   424: invokestatic    gg/essential/universal/shader/MCShader.access$getDEBUG_LEGACY$cp:()Z
        //   427: ifeq            454
        //   430: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   433: aload           transformedVertSource
        //   435: invokevirtual   java/io/PrintStream.println:(Ljava/lang/Object;)V
        //   438: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   441: aload           transformedFragSource
        //   443: invokevirtual   java/io/PrintStream.println:(Ljava/lang/Object;)V
        //   446: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   449: aload           json
        //   451: invokevirtual   java/io/PrintStream.println:(Ljava/lang/Object;)V
        //   454: new             Lgg/essential/universal/shader/MCShader$Companion$fromLegacyShader$factory$1;
        //   457: dup            
        //   458: aload           json
        //   460: aload           transformedVertSource
        //   462: aload           transformedFragSource
        //   464: invokespecial   gg/essential/universal/shader/MCShader$Companion$fromLegacyShader$factory$1.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   467: checkcast       Lkotlin/jvm/functions/Function1;
        //   470: astore          factory
        //   472: aload           transformer
        //   474: invokevirtual   gg/essential/universal/shader/ShaderTransformer.getAttributes:()Ljava/util/Set;
        //   477: checkcast       Ljava/lang/Iterable;
        //   480: astore          $this$associateWith$iv
        //   482: iconst_0       
        //   483: istore          $i$f$associateWith
        //   485: new             Ljava/util/LinkedHashMap;
        //   488: dup            
        //   489: aload           $this$associateWith$iv
        //   491: bipush          10
        //   493: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   496: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //   499: bipush          16
        //   501: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //   504: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //   507: astore          result$iv
        //   509: aload           $this$associateWith$iv
        //   511: astore          $this$associateWithTo$iv$iv
        //   513: iconst_0       
        //   514: istore          $i$f$associateWithTo
        //   516: aload           $this$associateWithTo$iv$iv
        //   518: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   523: astore          15
        //   525: aload           15
        //   527: invokeinterface java/util/Iterator.hasNext:()Z
        //   532: ifeq            585
        //   535: aload           15
        //   537: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   542: astore          element$iv$iv
        //   544: aload           result$iv
        //   546: checkcast       Ljava/util/Map;
        //   549: aload           element$iv$iv
        //   551: aload           element$iv$iv
        //   553: checkcast       Ljava/lang/String;
        //   556: astore          17
        //   558: astore          24
        //   560: astore          23
        //   562: iconst_0       
        //   563: istore          $i$a$-associateWith-MCShader$Companion$fromLegacyShader$vertexFormat$1
        //   565: getstatic       net/minecraft/client/render/VertexFormats.POSITION_ELEMENT:Lnet/minecraft/client/render/VertexFormatElement;
        //   568: astore          25
        //   570: aload           23
        //   572: aload           24
        //   574: aload           25
        //   576: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   581: pop            
        //   582: goto            525
        //   585: aload           result$iv
        //   587: checkcast       Ljava/util/Map;
        //   590: nop            
        //   591: invokestatic    com/google/common/collect/ImmutableMap.copyOf:(Ljava/util/Map;)Lcom/google/common/collect/ImmutableMap;
        //   594: astore          31
        //   596: new             Lnet/minecraft/client/render/VertexFormat;
        //   599: dup            
        //   600: aload           31
        //   602: invokespecial   net/minecraft/client/render/VertexFormat.<init>:(Lcom/google/common/collect/ImmutableMap;)V
        //   605: astore          vertexFormat
        //   607: aload           json
        //   609: invokestatic    org/apache/commons/codec/digest/DigestUtils.sha1Hex:(Ljava/lang/String;)Ljava/lang/String;
        //   612: astore          11
        //   614: aload           11
        //   616: ldc_w           "sha1Hex(json)"
        //   619: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   622: aload           11
        //   624: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //   627: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   630: dup            
        //   631: ldc             "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)"
        //   633: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   636: astore          name
        //   638: new             Lgg/essential/universal/shader/MCShader;
        //   641: dup            
        //   642: new             Lnet/minecraft/client/render/Shader;
        //   645: dup            
        //   646: aload           factory
        //   648: invokedynamic   BootstrapMethod #2, method_14486:(Lkotlin/jvm/functions/Function1;)Lnet/minecraft/resource/ResourceFactory;
        //   653: aload           name
        //   655: aload           vertexFormat
        //   657: invokespecial   net/minecraft/client/render/Shader.<init>:(Lnet/minecraft/resource/ResourceFactory;Ljava/lang/String;Lnet/minecraft/client/render/VertexFormat;)V
        //   660: aload_3         /* blendState */
        //   661: invokespecial   gg/essential/universal/shader/MCShader.<init>:(Lnet/minecraft/client/render/Shader;Lgg/essential/universal/shader/BlendState;)V
        //   664: areturn        
        //    MethodParameters:
        //  Name        Flags  
        //  ----------  -----
        //  vertSource  
        //  fragSource  
        //  blendState  
        //    StackMapTable: 00 05 FF 01 04 00 1E 07 00 02 07 00 68 07 00 68 07 00 3C 07 00 35 07 00 68 07 00 68 00 07 00 94 01 07 00 94 07 00 9D 01 07 00 94 00 07 00 A8 00 00 00 00 00 07 00 68 07 00 68 07 00 68 07 00 68 07 00 68 07 00 68 07 00 68 07 00 68 07 00 68 00 00 FB 00 6A FF 00 56 00 1F 07 00 02 07 00 68 07 00 68 07 00 3C 07 00 35 07 00 68 07 00 68 07 00 68 07 00 94 01 07 00 94 07 00 9D 01 07 00 94 00 07 00 A8 00 00 00 00 00 07 00 68 07 00 68 07 00 68 07 00 68 07 00 68 07 00 68 07 00 68 07 00 68 07 00 68 07 00 DD 00 00 FF 00 46 00 1F 07 00 02 07 00 68 07 00 68 07 00 3C 07 00 35 07 00 68 07 00 68 07 00 68 07 00 7C 01 07 00 76 01 07 00 F6 07 00 76 01 07 00 A8 00 00 00 00 00 07 00 68 07 00 68 07 00 04 07 00 04 07 00 04 07 00 68 07 00 68 07 00 68 07 00 68 07 00 DD 00 00 3B
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final Optional fromLegacyShader$lambda-2(final Function1 $tmp0, final Identifier id) {
        Intrinsics.checkNotNullParameter((Object)$tmp0, "$tmp0");
        return (Optional)$tmp0.invoke((Object)id);
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
