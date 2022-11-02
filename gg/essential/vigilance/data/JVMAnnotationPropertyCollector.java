package gg.essential.vigilance.data;

import kotlin.*;
import gg.essential.vigilance.*;
import org.jetbrains.annotations.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b" }, d2 = { "Lgg/essential/vigilance/data/JVMAnnotationPropertyCollector;", "Lgg/essential/vigilance/data/PropertyCollector;", "()V", "collectProperties", "", "Lgg/essential/vigilance/data/PropertyData;", "instance", "Lgg/essential/vigilance/Vigilant;", "Vigilance" })
public final class JVMAnnotationPropertyCollector extends PropertyCollector
{
    public JVMAnnotationPropertyCollector() {
        super();
    }
    
    @NotNull
    @Override
    protected List<PropertyData> collectProperties(@NotNull final Vigilant instance) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "instance"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* instance */
        //     7: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    10: invokevirtual   java/lang/Class.getDeclaredFields:()[Ljava/lang/reflect/Field;
        //    13: astore_3       
        //    14: aload_3        
        //    15: ldc             "instance::class.java.declaredFields"
        //    17: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    20: aload_3        
        //    21: checkcast       [Ljava/lang/Object;
        //    24: astore_3       
        //    25: nop            
        //    26: iconst_0       
        //    27: istore          $i$f$filter
        //    29: aload_3         /* $this$filter$iv */
        //    30: astore          5
        //    32: new             Ljava/util/ArrayList;
        //    35: dup            
        //    36: invokespecial   java/util/ArrayList.<init>:()V
        //    39: checkcast       Ljava/util/Collection;
        //    42: astore          destination$iv$iv
        //    44: iconst_0       
        //    45: istore          $i$f$filterTo
        //    47: aload           $this$filterTo$iv$iv
        //    49: astore          8
        //    51: aload           8
        //    53: arraylength    
        //    54: istore          9
        //    56: iconst_0       
        //    57: istore          10
        //    59: iload           10
        //    61: iload           9
        //    63: if_icmpge       109
        //    66: aload           8
        //    68: iload           10
        //    70: aaload         
        //    71: astore          element$iv$iv
        //    73: aload           element$iv$iv
        //    75: checkcast       Ljava/lang/reflect/Field;
        //    78: astore          it
        //    80: iconst_0       
        //    81: istore          $i$a$-filter-JVMAnnotationPropertyCollector$collectProperties$fieldPropertyData$1
        //    83: aload           it
        //    85: ldc             Lgg/essential/vigilance/data/Property;.class
        //    87: invokevirtual   java/lang/reflect/Field.isAnnotationPresent:(Ljava/lang/Class;)Z
        //    90: ifeq            103
        //    93: aload           destination$iv$iv
        //    95: aload           element$iv$iv
        //    97: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   102: pop            
        //   103: iinc            10, 1
        //   106: goto            59
        //   109: aload           destination$iv$iv
        //   111: checkcast       Ljava/util/List;
        //   114: nop            
        //   115: checkcast       Ljava/lang/Iterable;
        //   118: astore_3       
        //   119: nop            
        //   120: iconst_0       
        //   121: istore          $i$f$map
        //   123: aload_3         /* $this$map$iv */
        //   124: astore          5
        //   126: new             Ljava/util/ArrayList;
        //   129: dup            
        //   130: aload_3         /* $this$map$iv */
        //   131: bipush          10
        //   133: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   136: invokespecial   java/util/ArrayList.<init>:(I)V
        //   139: checkcast       Ljava/util/Collection;
        //   142: astore          destination$iv$iv
        //   144: iconst_0       
        //   145: istore          $i$f$mapTo
        //   147: aload           $this$mapTo$iv$iv
        //   149: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   154: astore          8
        //   156: aload           8
        //   158: invokeinterface java/util/Iterator.hasNext:()Z
        //   163: ifeq            359
        //   166: aload           8
        //   168: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   173: astore          item$iv$iv
        //   175: aload           destination$iv$iv
        //   177: aload           item$iv$iv
        //   179: checkcast       Ljava/lang/reflect/Field;
        //   182: astore          10
        //   184: astore          16
        //   186: iconst_0       
        //   187: istore          $i$a$-map-JVMAnnotationPropertyCollector$collectProperties$fieldPropertyData$2
        //   189: aload           field
        //   191: iconst_1       
        //   192: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   195: getstatic       gg/essential/vigilance/data/PropertyData.Companion:Lgg/essential/vigilance/data/PropertyData$Companion;
        //   198: aload           field
        //   200: ldc             Lgg/essential/vigilance/data/Property;.class
        //   202: invokevirtual   java/lang/reflect/Field.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   205: astore          12
        //   207: aload           12
        //   209: ldc             "field.getAnnotation(Property::class.java)"
        //   211: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   214: aload           12
        //   216: checkcast       Lgg/essential/vigilance/data/Property;
        //   219: aload           field
        //   221: ldc             "field"
        //   223: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   226: aload           field
        //   228: aload_1         /* instance */
        //   229: invokevirtual   gg/essential/vigilance/data/PropertyData$Companion.fromField:(Lgg/essential/vigilance/data/Property;Ljava/lang/reflect/Field;Lgg/essential/vigilance/Vigilant;)Lgg/essential/vigilance/data/PropertyData;
        //   232: astore          12
        //   234: aload           12
        //   236: astore          data
        //   238: iconst_0       
        //   239: istore          $i$a$-also-JVMAnnotationPropertyCollector$collectProperties$fieldPropertyData$2$1
        //   241: aload           data
        //   243: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   246: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getType:()Lgg/essential/vigilance/data/PropertyType;
        //   249: aload           field
        //   251: invokevirtual   gg/essential/vigilance/data/PropertyType.isFieldValid:(Ljava/lang/reflect/Field;)Z
        //   254: ifne            343
        //   257: new             Ljava/lang/IllegalStateException;
        //   260: dup            
        //   261: new             Ljava/lang/StringBuilder;
        //   264: dup            
        //   265: invokespecial   java/lang/StringBuilder.<init>:()V
        //   268: ldc             "[Vigilance] Error while creating GUI "
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: aload_1         /* instance */
        //   274: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   277: invokestatic    kotlin/jvm/internal/Reflection.getOrCreateKotlinClass:(Ljava/lang/Class;)Lkotlin/reflect/KClass;
        //   280: invokeinterface kotlin/reflect/KClass.getSimpleName:()Ljava/lang/String;
        //   285: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   288: ldc             ": field "
        //   290: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   293: aload           field
        //   295: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   301: ldc             " of PropertyType "
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   306: aload           data
        //   308: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   311: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getType:()Lgg/essential/vigilance/data/PropertyType;
        //   314: invokevirtual   gg/essential/vigilance/data/PropertyType.name:()Ljava/lang/String;
        //   317: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   320: ldc             " has invalid JVM type "
        //   322: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   325: aload           field
        //   327: invokevirtual   java/lang/reflect/Field.getType:()Ljava/lang/Class;
        //   330: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   333: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   336: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   339: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   342: athrow         
        //   343: nop            
        //   344: aload           12
        //   346: nop            
        //   347: aload           16
        //   349: swap           
        //   350: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   355: pop            
        //   356: goto            156
        //   359: aload           destination$iv$iv
        //   361: checkcast       Ljava/util/List;
        //   364: nop            
        //   365: astore_2        /* fieldPropertyData */
        //   366: aload_1         /* instance */
        //   367: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   370: invokevirtual   java/lang/Class.getDeclaredMethods:()[Ljava/lang/reflect/Method;
        //   373: astore          4
        //   375: aload           4
        //   377: ldc             "instance::class.java.declaredMethods"
        //   379: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   382: aload           4
        //   384: checkcast       [Ljava/lang/Object;
        //   387: astore          4
        //   389: nop            
        //   390: iconst_0       
        //   391: istore          $i$f$filter
        //   393: aload           $this$filter$iv
        //   395: astore          6
        //   397: new             Ljava/util/ArrayList;
        //   400: dup            
        //   401: invokespecial   java/util/ArrayList.<init>:()V
        //   404: checkcast       Ljava/util/Collection;
        //   407: astore          destination$iv$iv
        //   409: iconst_0       
        //   410: istore          $i$f$filterTo
        //   412: aload           $this$filterTo$iv$iv
        //   414: astore          9
        //   416: aload           9
        //   418: arraylength    
        //   419: istore          10
        //   421: iconst_0       
        //   422: istore          11
        //   424: iload           11
        //   426: iload           10
        //   428: if_icmpge       474
        //   431: aload           9
        //   433: iload           11
        //   435: aaload         
        //   436: astore          element$iv$iv
        //   438: aload           element$iv$iv
        //   440: checkcast       Ljava/lang/reflect/Method;
        //   443: astore          it
        //   445: iconst_0       
        //   446: istore          $i$a$-filter-JVMAnnotationPropertyCollector$collectProperties$methodPropertyData$1
        //   448: aload           it
        //   450: ldc             Lgg/essential/vigilance/data/Property;.class
        //   452: invokevirtual   java/lang/reflect/Method.isAnnotationPresent:(Ljava/lang/Class;)Z
        //   455: ifeq            468
        //   458: aload           destination$iv$iv
        //   460: aload           element$iv$iv
        //   462: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   467: pop            
        //   468: iinc            11, 1
        //   471: goto            424
        //   474: aload           destination$iv$iv
        //   476: checkcast       Ljava/util/List;
        //   479: nop            
        //   480: checkcast       Ljava/lang/Iterable;
        //   483: astore          4
        //   485: nop            
        //   486: iconst_0       
        //   487: istore          $i$f$map
        //   489: aload           $this$map$iv
        //   491: astore          6
        //   493: new             Ljava/util/ArrayList;
        //   496: dup            
        //   497: aload           $this$map$iv
        //   499: bipush          10
        //   501: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   504: invokespecial   java/util/ArrayList.<init>:(I)V
        //   507: checkcast       Ljava/util/Collection;
        //   510: astore          destination$iv$iv
        //   512: iconst_0       
        //   513: istore          $i$f$mapTo
        //   515: aload           $this$mapTo$iv$iv
        //   517: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   522: astore          9
        //   524: aload           9
        //   526: invokeinterface java/util/Iterator.hasNext:()Z
        //   531: ifeq            709
        //   534: aload           9
        //   536: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   541: astore          item$iv$iv
        //   543: aload           destination$iv$iv
        //   545: aload           item$iv$iv
        //   547: checkcast       Ljava/lang/reflect/Method;
        //   550: astore          11
        //   552: astore          16
        //   554: iconst_0       
        //   555: istore          $i$a$-map-JVMAnnotationPropertyCollector$collectProperties$methodPropertyData$2
        //   557: aload           method
        //   559: iconst_1       
        //   560: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //   563: getstatic       gg/essential/vigilance/data/PropertyData.Companion:Lgg/essential/vigilance/data/PropertyData$Companion;
        //   566: aload           method
        //   568: ldc             Lgg/essential/vigilance/data/Property;.class
        //   570: invokevirtual   java/lang/reflect/Method.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   573: astore          13
        //   575: aload           13
        //   577: ldc             "method.getAnnotation(Property::class.java)"
        //   579: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   582: aload           13
        //   584: checkcast       Lgg/essential/vigilance/data/Property;
        //   587: aload           method
        //   589: ldc             "method"
        //   591: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   594: aload           method
        //   596: aload_1         /* instance */
        //   597: invokevirtual   gg/essential/vigilance/data/PropertyData$Companion.fromMethod:(Lgg/essential/vigilance/data/Property;Ljava/lang/reflect/Method;Lgg/essential/vigilance/Vigilant;)Lgg/essential/vigilance/data/PropertyData;
        //   600: astore          13
        //   602: aload           13
        //   604: astore          data
        //   606: iconst_0       
        //   607: istore          $i$a$-also-JVMAnnotationPropertyCollector$collectProperties$methodPropertyData$2$1
        //   609: aload           data
        //   611: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   614: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getType:()Lgg/essential/vigilance/data/PropertyType;
        //   617: getstatic       gg/essential/vigilance/data/PropertyType.BUTTON:Lgg/essential/vigilance/data/PropertyType;
        //   620: if_acmpeq       693
        //   623: new             Ljava/lang/IllegalStateException;
        //   626: dup            
        //   627: new             Ljava/lang/StringBuilder;
        //   630: dup            
        //   631: invokespecial   java/lang/StringBuilder.<init>:()V
        //   634: ldc             "[Vigilance] Error while creating GUI "
        //   636: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   639: aload_1         /* instance */
        //   640: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   643: invokestatic    kotlin/jvm/internal/Reflection.getOrCreateKotlinClass:(Ljava/lang/Class;)Lkotlin/reflect/KClass;
        //   646: invokeinterface kotlin/reflect/KClass.getSimpleName:()Ljava/lang/String;
        //   651: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   654: ldc             ": expected method "
        //   656: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   659: aload           method
        //   661: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //   664: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   667: ldc             " to have PropertyType BUTTON, but found PropertyType "
        //   669: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   672: aload           data
        //   674: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   677: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getType:()Lgg/essential/vigilance/data/PropertyType;
        //   680: invokevirtual   gg/essential/vigilance/data/PropertyType.name:()Ljava/lang/String;
        //   683: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   686: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   689: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   692: athrow         
        //   693: nop            
        //   694: aload           13
        //   696: nop            
        //   697: aload           16
        //   699: swap           
        //   700: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   705: pop            
        //   706: goto            524
        //   709: aload           destination$iv$iv
        //   711: checkcast       Ljava/util/List;
        //   714: nop            
        //   715: astore_3        /* methodPropertyData */
        //   716: aload_2         /* fieldPropertyData */
        //   717: checkcast       Ljava/util/Collection;
        //   720: aload_3         /* methodPropertyData */
        //   721: checkcast       Ljava/lang/Iterable;
        //   724: invokestatic    kotlin/collections/CollectionsKt.plus:(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
        //   727: areturn        
        //    Signature:
        //  (Lgg/essential/vigilance/Vigilant;)Ljava/util/List<Lgg/essential/vigilance/data/PropertyData;>;
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  instance  
        //    StackMapTable: 00 0C FF 00 3B 00 0B 07 00 02 07 00 41 00 07 00 3A 01 07 00 3A 07 00 3F 01 07 00 3A 01 01 00 00 FE 00 2B 07 00 29 07 00 43 01 F8 00 05 FF 00 2E 00 09 07 00 02 07 00 41 00 07 00 51 01 07 00 51 07 00 3F 01 07 00 60 00 00 FF 00 BA 00 11 07 00 02 07 00 41 00 07 00 51 01 07 00 51 07 00 3F 01 07 00 60 07 00 29 07 00 43 01 07 00 6E 07 00 6E 01 00 07 00 3F 00 00 FF 00 0F 00 09 07 00 02 07 00 41 00 07 00 51 01 07 00 51 07 00 3F 01 07 00 60 00 00 FF 00 40 00 0C 07 00 02 07 00 41 07 00 4F 07 00 51 07 00 3A 01 07 00 3A 07 00 3F 01 07 00 3A 01 01 00 00 FE 00 2B 07 00 29 07 00 C7 01 F8 00 05 FF 00 31 00 0A 07 00 02 07 00 41 07 00 4F 07 00 51 07 00 51 01 07 00 51 07 00 3F 01 07 00 60 00 00 FF 00 A8 00 11 07 00 02 07 00 41 07 00 4F 07 00 51 07 00 51 01 07 00 51 07 00 3F 01 07 00 60 07 00 29 07 00 C7 01 07 00 6E 07 00 6E 01 07 00 3F 00 00 FF 00 0F 00 0A 07 00 02 07 00 41 07 00 4F 07 00 51 07 00 51 01 07 00 51 07 00 3F 01 07 00 60 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
