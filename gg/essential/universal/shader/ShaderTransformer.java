package gg.essential.universal.shader;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010#
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0005
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010\u0007R\u001d\u0010
                                                   \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u000e¨\u0006\u0011""" }, d2 = { "Lgg/essential/universal/shader/ShaderTransformer;", "", "()V", "attributes", "", "", "getAttributes", "()Ljava/util/Set;", "samplers", "getSamplers", "uniforms", "", "Lgg/essential/universal/shader/UniformType;", "getUniforms", "()Ljava/util/Map;", "transform", "originalSource", "universalcraft" })
public final class ShaderTransformer
{
    @NotNull
    private final Set<String> attributes;
    @NotNull
    private final Set<String> samplers;
    @NotNull
    private final Map<String, UniformType> uniforms;
    
    public ShaderTransformer() {
        super();
        this.attributes = new LinkedHashSet<String>();
        this.samplers = new LinkedHashSet<String>();
        this.uniforms = new LinkedHashMap<String, UniformType>();
    }
    
    @NotNull
    public final Set<String> getAttributes() {
        return this.attributes;
    }
    
    @NotNull
    public final Set<String> getSamplers() {
        return this.samplers;
    }
    
    @NotNull
    public final Map<String, UniformType> getUniforms() {
        return this.uniforms;
    }
    
    @NotNull
    public final String transform(@NotNull final String originalSource) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "originalSource"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //     9: dup            
        //    10: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //    13: astore_2        /* source */
        //    14: aload_2         /* source */
        //    15: aload_1         /* originalSource */
        //    16: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    19: aload_2         /* source */
        //    20: aload_2         /* source */
        //    21: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    24: checkcast       Ljava/lang/String;
        //    27: ldc             "gl_ModelViewProjectionMatrix"
        //    29: ldc             "gl_ProjectionMatrix * gl_ModelViewMatrix"
        //    31: iconst_0       
        //    32: iconst_4       
        //    33: aconst_null    
        //    34: invokestatic    kotlin/text/StringsKt.replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
        //    37: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    40: aload_2         /* source */
        //    41: aload_2         /* source */
        //    42: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    45: checkcast       Ljava/lang/String;
        //    48: ldc             "texture2D"
        //    50: ldc             "texture"
        //    52: iconst_0       
        //    53: iconst_4       
        //    54: aconst_null    
        //    55: invokestatic    kotlin/text/StringsKt.replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
        //    58: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    61: new             Ljava/util/LinkedHashMap;
        //    64: dup            
        //    65: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    68: checkcast       Ljava/util/Map;
        //    71: astore_3        /* replacements */
        //    72: new             Ljava/util/ArrayList;
        //    75: dup            
        //    76: invokespecial   java/util/ArrayList.<init>:()V
        //    79: checkcast       Ljava/util/List;
        //    82: astore          transformed
        //    84: aload           transformed
        //    86: ldc             "#version 150"
        //    88: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    93: pop            
        //    94: aload_2         /* source */
        //    95: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    98: checkcast       Ljava/lang/CharSequence;
        //   101: ldc             "gl_FragColor"
        //   103: checkcast       Ljava/lang/CharSequence;
        //   106: iconst_0       
        //   107: iconst_2       
        //   108: aconst_null    
        //   109: invokestatic    kotlin/text/StringsKt.contains$default:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
        //   112: istore          frag
        //   114: iload           frag
        //   116: ifne            123
        //   119: iconst_1       
        //   120: goto            124
        //   123: iconst_0       
        //   124: istore          vert
        //   126: iload           frag
        //   128: ifeq            164
        //   131: aload           transformed
        //   133: ldc             "out vec4 uc_FragColor;"
        //   135: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   140: pop            
        //   141: aload_3         /* replacements */
        //   142: astore          7
        //   144: ldc             "gl_FragColor"
        //   146: astore          8
        //   148: ldc             "uc_FragColor"
        //   150: astore          9
        //   152: aload           7
        //   154: aload           8
        //   156: aload           9
        //   158: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   163: pop            
        //   164: iload           vert
        //   166: ifeq            223
        //   169: aload_2         /* source */
        //   170: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   173: checkcast       Ljava/lang/CharSequence;
        //   176: ldc             "gl_FrontColor"
        //   178: checkcast       Ljava/lang/CharSequence;
        //   181: iconst_0       
        //   182: iconst_2       
        //   183: aconst_null    
        //   184: invokestatic    kotlin/text/StringsKt.contains$default:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
        //   187: ifeq            223
        //   190: aload           transformed
        //   192: ldc             "out vec4 uc_FrontColor;"
        //   194: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   199: pop            
        //   200: aload_3         /* replacements */
        //   201: astore          7
        //   203: ldc             "gl_FrontColor"
        //   205: astore          8
        //   207: ldc             "uc_FrontColor"
        //   209: astore          9
        //   211: aload           7
        //   213: aload           8
        //   215: aload           9
        //   217: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   222: pop            
        //   223: iload           frag
        //   225: ifeq            282
        //   228: aload_2         /* source */
        //   229: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   232: checkcast       Ljava/lang/CharSequence;
        //   235: ldc             "gl_Color"
        //   237: checkcast       Ljava/lang/CharSequence;
        //   240: iconst_0       
        //   241: iconst_2       
        //   242: aconst_null    
        //   243: invokestatic    kotlin/text/StringsKt.contains$default:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
        //   246: ifeq            282
        //   249: aload           transformed
        //   251: ldc             "in vec4 uc_FrontColor;"
        //   253: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   258: pop            
        //   259: aload_3         /* replacements */
        //   260: astore          7
        //   262: ldc             "gl_Color"
        //   264: astore          8
        //   266: ldc             "uc_FrontColor"
        //   268: astore          9
        //   270: aload           7
        //   272: aload           8
        //   274: aload           9
        //   276: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   281: pop            
        //   282: iload           vert
        //   284: ifeq            380
        //   287: aload_2         /* source */
        //   288: aload_3         /* replacements */
        //   289: aload_0         /* this */
        //   290: aload           transformed
        //   292: ldc             "gl_Vertex"
        //   294: ldc             "vec3"
        //   296: aconst_null    
        //   297: ldc             "vec4(uc_Vertex, 1.0)"
        //   299: bipush          64
        //   301: aconst_null    
        //   302: invokestatic    gg/essential/universal/shader/ShaderTransformer.transform$replaceAttribute$default:(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Map;Lgg/essential/universal/shader/ShaderTransformer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
        //   305: aload_2         /* source */
        //   306: aload_3         /* replacements */
        //   307: aload_0         /* this */
        //   308: aload           transformed
        //   310: ldc             "gl_Color"
        //   312: ldc             "vec4"
        //   314: aconst_null    
        //   315: aconst_null    
        //   316: sipush          192
        //   319: aconst_null    
        //   320: invokestatic    gg/essential/universal/shader/ShaderTransformer.transform$replaceAttribute$default:(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Map;Lgg/essential/universal/shader/ShaderTransformer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
        //   323: aload_2         /* source */
        //   324: aload_3         /* replacements */
        //   325: aload_0         /* this */
        //   326: aload           transformed
        //   328: ldc             "gl_MultiTexCoord0.st"
        //   330: ldc             "vec2"
        //   332: ldc             "uc_UV0"
        //   334: aconst_null    
        //   335: sipush          128
        //   338: aconst_null    
        //   339: invokestatic    gg/essential/universal/shader/ShaderTransformer.transform$replaceAttribute$default:(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Map;Lgg/essential/universal/shader/ShaderTransformer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
        //   342: aload_2         /* source */
        //   343: aload_3         /* replacements */
        //   344: aload_0         /* this */
        //   345: aload           transformed
        //   347: ldc             "gl_MultiTexCoord1.st"
        //   349: ldc             "vec2"
        //   351: ldc             "uc_UV1"
        //   353: aconst_null    
        //   354: sipush          128
        //   357: aconst_null    
        //   358: invokestatic    gg/essential/universal/shader/ShaderTransformer.transform$replaceAttribute$default:(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Map;Lgg/essential/universal/shader/ShaderTransformer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
        //   361: aload_2         /* source */
        //   362: aload_3         /* replacements */
        //   363: aload_0         /* this */
        //   364: aload           transformed
        //   366: ldc             "gl_MultiTexCoord2.st"
        //   368: ldc             "vec2"
        //   370: ldc             "uc_UV2"
        //   372: aconst_null    
        //   373: sipush          128
        //   376: aconst_null    
        //   377: invokestatic    gg/essential/universal/shader/ShaderTransformer.transform$replaceAttribute$default:(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Map;Lgg/essential/universal/shader/ShaderTransformer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
        //   380: aload_2         /* source */
        //   381: aload_3         /* replacements */
        //   382: aload_0         /* this */
        //   383: aload           transformed
        //   385: ldc             "gl_ModelViewMatrix"
        //   387: getstatic       gg/essential/universal/shader/UniformType.Mat4:Lgg/essential/universal/shader/UniformType;
        //   390: ldc             "ModelViewMat"
        //   392: aconst_null    
        //   393: sipush          128
        //   396: aconst_null    
        //   397: invokestatic    gg/essential/universal/shader/ShaderTransformer.transform$replaceUniform$default:(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Map;Lgg/essential/universal/shader/ShaderTransformer;Ljava/util/List;Ljava/lang/String;Lgg/essential/universal/shader/UniformType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
        //   400: aload_2         /* source */
        //   401: aload_3         /* replacements */
        //   402: aload_0         /* this */
        //   403: aload           transformed
        //   405: ldc             "gl_ProjectionMatrix"
        //   407: getstatic       gg/essential/universal/shader/UniformType.Mat4:Lgg/essential/universal/shader/UniformType;
        //   410: ldc             "ProjMat"
        //   412: aconst_null    
        //   413: sipush          128
        //   416: aconst_null    
        //   417: invokestatic    gg/essential/universal/shader/ShaderTransformer.transform$replaceUniform$default:(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Map;Lgg/essential/universal/shader/ShaderTransformer;Ljava/util/List;Ljava/lang/String;Lgg/essential/universal/shader/UniformType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
        //   420: aload_2         /* source */
        //   421: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   424: checkcast       Ljava/lang/CharSequence;
        //   427: invokestatic    kotlin/text/StringsKt.lines:(Ljava/lang/CharSequence;)Ljava/util/List;
        //   430: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   435: astore          7
        //   437: aload           7
        //   439: invokeinterface java/util/Iterator.hasNext:()Z
        //   444: ifeq            780
        //   447: aload           7
        //   449: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   454: checkcast       Ljava/lang/String;
        //   457: astore          line
        //   459: aload           transformed
        //   461: aload           line
        //   463: ldc             "#version"
        //   465: iconst_0       
        //   466: iconst_2       
        //   467: aconst_null    
        //   468: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   471: ifeq            478
        //   474: pop            
        //   475: goto            437
        //   478: aload           line
        //   480: ldc             "varying "
        //   482: iconst_0       
        //   483: iconst_2       
        //   484: aconst_null    
        //   485: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   488: ifeq            521
        //   491: iload           frag
        //   493: ifeq            501
        //   496: ldc             "in "
        //   498: goto            503
        //   501: ldc             "out "
        //   503: aload           line
        //   505: ldc             "varying "
        //   507: aconst_null    
        //   508: iconst_2       
        //   509: aconst_null    
        //   510: invokestatic    kotlin/text/StringsKt.substringAfter$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
        //   513: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   518: goto            771
        //   521: aload           line
        //   523: ldc             "uniform "
        //   525: iconst_0       
        //   526: iconst_2       
        //   527: aconst_null    
        //   528: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   531: ifeq            663
        //   534: aload           line
        //   536: iconst_1       
        //   537: newarray        C
        //   539: astore          10
        //   541: aload           10
        //   543: iconst_0       
        //   544: bipush          59
        //   546: castore        
        //   547: aload           10
        //   549: invokestatic    kotlin/text/StringsKt.trimEnd:(Ljava/lang/String;[C)Ljava/lang/String;
        //   552: checkcast       Ljava/lang/CharSequence;
        //   555: iconst_1       
        //   556: anewarray       Ljava/lang/String;
        //   559: astore          10
        //   561: aload           10
        //   563: iconst_0       
        //   564: ldc             " "
        //   566: aastore        
        //   567: aload           10
        //   569: iconst_0       
        //   570: iconst_0       
        //   571: bipush          6
        //   573: aconst_null    
        //   574: invokestatic    kotlin/text/StringsKt.split$default:(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
        //   577: astore          9
        //   579: aload           9
        //   581: iconst_1       
        //   582: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   587: checkcast       Ljava/lang/String;
        //   590: astore          glslType
        //   592: aload           9
        //   594: iconst_2       
        //   595: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   600: checkcast       Ljava/lang/String;
        //   603: astore          name
        //   605: aload           glslType
        //   607: ldc             "sampler2D"
        //   609: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   612: ifeq            630
        //   615: aload_0         /* this */
        //   616: getfield        gg/essential/universal/shader/ShaderTransformer.samplers:Ljava/util/Set;
        //   619: aload           name
        //   621: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   626: pop            
        //   627: goto            658
        //   630: aload_0         /* this */
        //   631: getfield        gg/essential/universal/shader/ShaderTransformer.uniforms:Ljava/util/Map;
        //   634: astore          12
        //   636: getstatic       gg/essential/universal/shader/UniformType.Companion:Lgg/essential/universal/shader/UniformType$Companion;
        //   639: aload           glslType
        //   641: invokevirtual   gg/essential/universal/shader/UniformType$Companion.fromGlsl:(Ljava/lang/String;)Lgg/essential/universal/shader/UniformType;
        //   644: astore          13
        //   646: aload           12
        //   648: aload           name
        //   650: aload           13
        //   652: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   657: pop            
        //   658: aload           line
        //   660: goto            771
        //   663: aload_3         /* replacements */
        //   664: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   669: checkcast       Ljava/lang/Iterable;
        //   672: astore          9
        //   674: astore          19
        //   676: iconst_0       
        //   677: istore          $i$f$fold
        //   679: aload           line
        //   681: astore          accumulator$iv
        //   683: aload           $this$fold$iv
        //   685: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   690: astore          12
        //   692: aload           12
        //   694: invokeinterface java/util/Iterator.hasNext:()Z
        //   699: ifeq            766
        //   702: aload           12
        //   704: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   709: astore          element$iv
        //   711: aload           accumulator$iv
        //   713: aload           element$iv
        //   715: checkcast       Ljava/util/Map$Entry;
        //   718: astore          14
        //   720: astore          acc
        //   722: iconst_0       
        //   723: istore          $i$a$-fold-ShaderTransformer$transform$1
        //   725: aload           $dstr$needle$replacement
        //   727: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   732: checkcast       Ljava/lang/String;
        //   735: astore          needle
        //   737: aload           $dstr$needle$replacement
        //   739: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   744: checkcast       Ljava/lang/String;
        //   747: astore          replacement
        //   749: aload           acc
        //   751: aload           needle
        //   753: aload           replacement
        //   755: iconst_0       
        //   756: iconst_4       
        //   757: aconst_null    
        //   758: invokestatic    kotlin/text/StringsKt.replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
        //   761: astore          accumulator$iv
        //   763: goto            692
        //   766: aload           accumulator$iv
        //   768: aload           19
        //   770: swap           
        //   771: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   776: pop            
        //   777: goto            437
        //   780: aload           transformed
        //   782: checkcast       Ljava/lang/Iterable;
        //   785: ldc_w           "\n"
        //   788: checkcast       Ljava/lang/CharSequence;
        //   791: aconst_null    
        //   792: aconst_null    
        //   793: iconst_0       
        //   794: aconst_null    
        //   795: aconst_null    
        //   796: bipush          62
        //   798: aconst_null    
        //   799: invokestatic    kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        //   802: areturn        
        //    MethodParameters:
        //  Name            Flags  
        //  --------------  -----
        //  originalSource  
        //    StackMapTable: 00 12 FF 00 7B 00 06 07 00 02 07 00 4B 07 00 44 07 00 35 07 00 5E 01 00 00 40 01 FC 00 27 01 3A 3A FB 00 61 FC 00 38 07 00 B3 FF 00 28 00 09 07 00 02 07 00 4B 07 00 44 07 00 35 07 00 5E 01 01 07 00 B3 07 00 4B 00 01 07 00 5E 56 07 00 5E FF 00 01 00 09 07 00 02 07 00 4B 07 00 44 07 00 35 07 00 5E 01 01 07 00 B3 07 00 4B 00 02 07 00 5E 07 00 4B 51 07 00 5E FF 00 6C 00 0C 07 00 02 07 00 4B 07 00 44 07 00 35 07 00 5E 01 01 07 00 B3 07 00 4B 07 00 5E 07 00 4B 07 00 4B 00 01 07 00 5E 5B 07 00 5E FF 00 04 00 09 07 00 02 07 00 4B 07 00 44 07 00 35 07 00 5E 01 01 07 00 B3 07 00 4B 00 01 07 00 5E FF 00 1C 00 14 07 00 02 07 00 4B 07 00 44 07 00 35 07 00 5E 01 01 07 00 B3 07 00 4B 07 00 FD 01 07 00 4B 07 00 B3 00 00 00 00 00 00 07 00 5E 00 00 FB 00 49 FF 00 04 00 09 07 00 02 07 00 4B 07 00 44 07 00 35 07 00 5E 01 01 07 00 B3 07 00 4B 00 02 07 00 5E 07 00 4B FA 00 08
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final void transform$replaceAttribute(final Ref$ObjectRef<String> source, final Map<String, String> replacements, final ShaderTransformer this$0, final List<String> transformed, final String needle, final String type, final String replacementName, final String replacement) {
        if (StringsKt.contains$default((CharSequence)source.element, (CharSequence)needle, false, 2, (Object)null)) {
            replacements.put(needle, replacement);
            if (!this$0.attributes.contains(replacementName)) {
                this$0.attributes.add(replacementName);
                transformed.add("in " + type + " " + replacementName);
            }
        }
    }
    
    static /* synthetic */ void transform$replaceAttribute$default(final Ref$ObjectRef source, final Map replacements, final ShaderTransformer this$0, final List transformed, final String needle, final String type, String replacementName, String replacement, final int n, final Object o) {
        if ((n & 0x40) != 0x0) {
            replacementName = "uc_" + StringsKt.substringAfter$default(needle, "_", (String)null, 2, (Object)null);
        }
        if ((n & 0x80) != 0x0) {
            replacement = replacementName;
        }
        transform$replaceAttribute((Ref$ObjectRef<String>)source, replacements, this$0, transformed, needle, type, replacementName, replacement);
    }
    
    private static final void transform$replaceUniform(final Ref$ObjectRef<String> source, final Map<String, String> replacements, final ShaderTransformer this$0, final List<String> transformed, final String needle, final UniformType type, final String replacementName, final String replacement) {
        if (StringsKt.contains$default((CharSequence)source.element, (CharSequence)needle, false, 2, (Object)null)) {
            replacements.put(needle, replacement);
            if (!this$0.uniforms.containsKey(replacementName)) {
                this$0.uniforms.put(replacementName, type);
                transformed.add("uniform " + type.getGlslName() + " " + replacementName);
            }
        }
    }
    
    static /* synthetic */ void transform$replaceUniform$default(final Ref$ObjectRef source, final Map replacements, final ShaderTransformer this$0, final List transformed, final String needle, final UniformType type, final String replacementName, String replacement, final int n, final Object o) {
        if ((n & 0x80) != 0x0) {
            replacement = replacementName;
        }
        transform$replaceUniform((Ref$ObjectRef<String>)source, replacements, this$0, transformed, needle, type, replacementName, replacement);
    }
}
