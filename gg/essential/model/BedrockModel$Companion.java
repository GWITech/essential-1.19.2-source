package gg.essential.model;

import kotlin.*;
import gg.essential.model.backend.*;
import gg.essential.network.cosmetics.*;
import kotlin.jvm.functions.*;
import gg.essential.mod.*;
import kotlin.coroutines.*;
import org.jetbrains.annotations.*;

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
