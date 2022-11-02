package gg.essential.util;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.mod.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;
import java.util.*;
import gg.essential.universal.*;
import net.fabricmc.loader.api.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000:
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0000
                                                   \u0002\u0010\u001e
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050	J\f\u0010
                                                   \u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0002J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050	H\u0002J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0016""" }, d2 = { "Lgg/essential/util/ModLoaderUtil;", "", "()V", "PARTNER_MODS", "", "", "createModsAnnouncePacket", "Lgg/essential/connectionmanager/common/packet/mod/ClientModsAnnouncePacket;", "getLoadedPartnerModIds", "", "getLoadedPartnerModsNames", "", "getMinecraftVersion", "getModChecksums", "getPartnerModName", "identifier", "getPlatform", "Lgg/essential/connectionmanager/common/packet/mod/ClientModsAnnouncePacket$Platform;", "getPlatformVersion", "isModLoaded", "", "modId", "essential" })
public final class ModLoaderUtil
{
    @NotNull
    public static final ModLoaderUtil INSTANCE;
    
    private ModLoaderUtil() {
        super();
    }
    
    @JvmStatic
    @NotNull
    public static final ClientModsAnnouncePacket createModsAnnouncePacket() {
        final String minecraftVersion = ModLoaderUtil.INSTANCE.getMinecraftVersion();
        final Collection thisCollection$iv;
        final Collection $this$toTypedArray$iv = thisCollection$iv = ModLoaderUtil.INSTANCE.getModChecksums().values();
        final String[] array = thisCollection$iv.toArray(new String[0]);
        Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new ClientModsAnnouncePacket(minecraftVersion, array, ModLoaderUtil.INSTANCE.getPlatform(), ModLoaderUtil.INSTANCE.getPlatformVersion());
    }
    
    private final ClientModsAnnouncePacket.Platform getPlatform() {
        return ClientModsAnnouncePacket.Platform.FABRIC;
    }
    
    private final Map<String, String> getModChecksums() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokeinterface net/fabricmc/loader/api/FabricLoader.getAllMods:()Ljava/util/Collection;
        //     8: dup            
        //     9: ldc             "getInstance().allMods"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: checkcast       Ljava/lang/Iterable;
        //    17: astore_1        /* $this$map$iv */
        //    18: aload_1         /* $this$map$iv */
        //    19: astore_2       
        //    20: new             Ljava/util/ArrayList;
        //    23: dup            
        //    24: aload_1         /* $this$map$iv */
        //    25: bipush          10
        //    27: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    30: invokespecial   java/util/ArrayList.<init>:(I)V
        //    33: checkcast       Ljava/util/Collection;
        //    36: astore_3        /* destination$iv$iv */
        //    37: aload_2         /* $this$mapTo$iv$iv */
        //    38: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    43: astore          4
        //    45: aload           4
        //    47: invokeinterface java/util/Iterator.hasNext:()Z
        //    52: ifeq            561
        //    55: aload           4
        //    57: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    62: astore          item$iv$iv
        //    64: aload_3         /* destination$iv$iv */
        //    65: aload           item$iv$iv
        //    67: checkcast       Lnet/fabricmc/loader/api/ModContainer;
        //    70: astore          6
        //    72: astore          21
        //    74: aload           modContainer
        //    76: invokeinterface net/fabricmc/loader/api/ModContainer.getMetadata:()Lnet/fabricmc/loader/api/metadata/ModMetadata;
        //    81: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.getId:()Ljava/lang/String;
        //    86: astore          modId
        //    88: aload           modContainer
        //    90: invokeinterface net/fabricmc/loader/api/ModContainer.getRootPath:()Ljava/nio/file/Path;
        //    95: astore          sourceFile
        //    97: aload           modId
        //    99: ldc             "modId"
        //   101: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   104: aload           modId
        //   106: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //   109: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   112: dup            
        //   113: ldc             "this as java.lang.String).toLowerCase(Locale.ROOT)"
        //   115: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   118: astore          9
        //   120: aload           9
        //   122: ldc             "forge"
        //   124: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   127: ifeq            134
        //   130: iconst_1       
        //   131: goto            141
        //   134: aload           9
        //   136: ldc             "fml"
        //   138: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   141: ifeq            148
        //   144: aconst_null    
        //   145: goto            549
        //   148: aload           sourceFile
        //   150: invokeinterface java/nio/file/Path.isAbsolute:()Z
        //   155: ifeq            218
        //   158: aload           sourceFile
        //   160: invokeinterface java/nio/file/Path.getParent:()Ljava/nio/file/Path;
        //   165: ifnonnull       218
        //   168: aload           sourceFile
        //   170: dup            
        //   171: ldc             "sourceFile"
        //   173: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   176: invokestatic    java/nio/file/Files.getFileStore:(Ljava/nio/file/Path;)Ljava/nio/file/FileStore;
        //   179: dup            
        //   180: ldc             "getFileStore(this)"
        //   182: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   185: invokevirtual   java/nio/file/FileStore.type:()Ljava/lang/String;
        //   188: ldc             "zipfs"
        //   190: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   193: ifeq            218
        //   196: invokestatic    java/nio/file/FileSystems.getDefault:()Ljava/nio/file/FileSystem;
        //   199: aload           sourceFile
        //   201: invokeinterface java/nio/file/Path.getFileSystem:()Ljava/nio/file/FileSystem;
        //   206: invokevirtual   java/nio/file/FileSystem.toString:()Ljava/lang/String;
        //   209: iconst_0       
        //   210: anewarray       Ljava/lang/String;
        //   213: invokevirtual   java/nio/file/FileSystem.getPath:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        //   216: astore          sourceFile
        //   218: aload           sourceFile
        //   220: dup            
        //   221: ldc             "sourceFile"
        //   223: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   226: astore          9
        //   228: iconst_0       
        //   229: anewarray       Ljava/nio/file/LinkOption;
        //   232: astore          10
        //   234: aload           9
        //   236: aload           10
        //   238: iconst_0       
        //   239: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   242: checkcast       [Ljava/nio/file/LinkOption;
        //   245: invokestatic    java/nio/file/Files.isRegularFile:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
        //   248: ifne            255
        //   251: aconst_null    
        //   252: goto            549
        //   255: aload           sourceFile
        //   257: aconst_null    
        //   258: checkcast       Ljava/lang/ClassLoader;
        //   261: invokestatic    java/nio/file/FileSystems.newFileSystem:(Ljava/nio/file/Path;Ljava/lang/ClassLoader;)Ljava/nio/file/FileSystem;
        //   264: checkcast       Ljava/io/Closeable;
        //   267: astore          11
        //   269: aconst_null    
        //   270: astore          12
        //   272: aload           11
        //   274: checkcast       Ljava/nio/file/FileSystem;
        //   277: astore          fileSystem
        //   279: aload           fileSystem
        //   281: ldc             "META-INF"
        //   283: iconst_1       
        //   284: anewarray       Ljava/lang/String;
        //   287: astore          14
        //   289: aload           14
        //   291: iconst_0       
        //   292: ldc             "MANIFEST.MF"
        //   294: aastore        
        //   295: aload           14
        //   297: invokevirtual   java/nio/file/FileSystem.getPath:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        //   300: astore          manifestPath
        //   302: aload           manifestPath
        //   304: astore          16
        //   306: aload           16
        //   308: astore          it
        //   310: aload           it
        //   312: iconst_0       
        //   313: anewarray       Ljava/nio/file/LinkOption;
        //   316: invokestatic    java/nio/file/Files.exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
        //   319: ifeq            327
        //   322: aload           16
        //   324: goto            328
        //   327: aconst_null    
        //   328: astore          14
        //   330: aload           14
        //   332: ifnull          437
        //   335: aload           14
        //   337: astore          p0
        //   339: aload           p0
        //   341: iconst_0       
        //   342: anewarray       Ljava/nio/file/OpenOption;
        //   345: invokestatic    java/nio/file/Files.newInputStream:(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
        //   348: astore          16
        //   350: aload           16
        //   352: ifnull          437
        //   355: aload           16
        //   357: checkcast       Ljava/io/Closeable;
        //   360: astore          18
        //   362: aconst_null    
        //   363: astore          19
        //   365: aload           18
        //   367: checkcast       Ljava/io/InputStream;
        //   370: astore          p0
        //   372: new             Ljava/util/jar/Manifest;
        //   375: dup            
        //   376: aload           p0
        //   378: invokespecial   java/util/jar/Manifest.<init>:(Ljava/io/InputStream;)V
        //   381: astore          null
        //   383: aload           18
        //   385: aload           19
        //   387: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   390: aload           20
        //   392: goto            416
        //   395: astore          20
        //   397: aload           20
        //   399: astore          19
        //   401: aload           20
        //   403: athrow         
        //   404: astore          20
        //   406: aload           18
        //   408: aload           19
        //   410: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   413: aload           20
        //   415: athrow         
        //   416: invokevirtual   java/util/jar/Manifest.getMainAttributes:()Ljava/util/jar/Attributes;
        //   419: astore          18
        //   421: aload           18
        //   423: ifnull          437
        //   426: aload           18
        //   428: ldc_w           "Essential-Mod-Checksum"
        //   431: invokevirtual   java/util/jar/Attributes.getValue:(Ljava/lang/String;)Ljava/lang/String;
        //   434: goto            438
        //   437: aconst_null    
        //   438: astore          null
        //   440: aload           11
        //   442: aload           12
        //   444: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   447: aload           13
        //   449: goto            473
        //   452: astore          13
        //   454: aload           13
        //   456: astore          12
        //   458: aload           13
        //   460: athrow         
        //   461: astore          13
        //   463: aload           11
        //   465: aload           12
        //   467: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   470: aload           13
        //   472: athrow         
        //   473: dup            
        //   474: ifnonnull       493
        //   477: pop            
        //   478: aload           sourceFile
        //   480: invokestatic    java/nio/file/Files.readAllBytes:(Ljava/nio/file/Path;)[B
        //   483: dup            
        //   484: ldc_w           "readAllBytes(this)"
        //   487: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   490: invokestatic    org/apache/commons/codec/digest/DigestUtils.md5Hex:([B)Ljava/lang/String;
        //   493: astore          10
        //   495: goto            521
        //   498: astore          e
        //   500: getstatic       gg/essential/Essential.logger:Lorg/apache/logging/log4j/Logger;
        //   503: ldc_w           "Error occurred when getting md5 checksum for mod {} (file={})."
        //   506: aload           modId
        //   508: aload           sourceFile
        //   510: aload           e
        //   512: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   517: aconst_null    
        //   518: goto            549
        //   521: aload           10
        //   523: astore          checksum
        //   525: aload           modId
        //   527: aload           modId
        //   529: ldc_w           "feather"
        //   532: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   535: ifne            543
        //   538: aload           checksum
        //   540: goto            546
        //   543: ldc_w           "e3d04e686b28b34b5a98ce078e4f9da8"
        //   546: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   549: aload           21
        //   551: swap           
        //   552: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   557: pop            
        //   558: goto            45
        //   561: aload_3         /* destination$iv$iv */
        //   562: checkcast       Ljava/util/List;
        //   565: checkcast       Ljava/lang/Iterable;
        //   568: invokestatic    kotlin/collections/CollectionsKt.filterNotNull:(Ljava/lang/Iterable;)Ljava/util/List;
        //   571: checkcast       Ljava/lang/Iterable;
        //   574: invokestatic    kotlin/collections/MapsKt.toMap:(Ljava/lang/Iterable;)Ljava/util/Map;
        //   577: areturn        
        //    Signature:
        //  ()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
        //    StackMapTable: 00 17 FF 00 2D 00 05 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 00 00 FF 00 58 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 3C 00 00 00 00 00 00 00 00 00 00 00 07 00 3E 00 00 46 01 06 FB 00 45 FF 00 24 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 AE 07 00 E3 00 00 00 00 00 00 00 00 00 00 07 00 3E 00 00 FF 00 47 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 AE 07 00 E3 07 00 EF 05 07 00 D2 07 00 4C 07 00 AE 07 00 AE 07 00 AE 00 00 00 07 00 3E 00 00 40 07 00 AE FF 00 42 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 AE 07 00 E3 07 00 EF 05 07 00 D2 07 00 AE 07 00 AE 07 00 FE 07 00 AE 07 00 EF 05 00 07 00 3E 00 01 07 00 5F FF 00 08 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 AE 07 00 E3 07 00 EF 05 07 00 D2 07 00 AE 07 00 AE 07 00 FE 07 00 AE 07 00 EF 07 00 5F 00 07 00 3E 00 01 07 00 5F FF 00 0B 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 AE 07 00 E3 07 00 EF 05 07 00 D2 07 00 AE 07 00 AE 07 00 FE 07 00 AE 07 00 EF 05 07 01 00 07 00 3E 00 01 07 01 00 FF 00 14 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 AE 07 00 E3 07 00 EF 05 07 00 D2 07 00 AE 07 00 AE 07 00 04 07 00 AE 00 00 00 07 00 3E 00 00 40 07 00 3C FF 00 0D 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 AE 07 00 E3 07 00 EF 05 00 00 00 00 00 00 00 00 07 00 3E 00 01 07 00 5F FF 00 08 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 AE 07 00 E3 07 00 EF 07 00 5F 00 00 00 00 00 00 00 00 07 00 3E 00 01 07 00 5F FF 00 0B 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 AE 07 00 E3 07 00 EF 05 07 00 3C 07 00 AE 07 00 AE 07 00 04 07 00 AE 00 00 00 07 00 3E 00 01 07 00 3C 53 07 00 3C FF 00 04 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 AE 07 00 04 00 00 00 00 00 00 00 00 00 00 07 00 3E 00 01 07 00 61 FF 00 16 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 AE 07 00 3C 07 00 EF 05 07 00 3C 07 00 AE 07 00 AE 07 00 04 07 00 AE 00 00 00 07 00 3E 00 00 FF 00 15 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 3C 07 00 3C 07 00 EF 05 07 00 3C 07 00 AE 07 00 AE 07 00 04 07 00 AE 00 00 00 07 00 3E 00 01 07 00 3C FF 00 02 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 3C 07 00 3C 07 00 EF 05 07 00 3C 07 00 AE 07 00 AE 07 00 04 07 00 AE 00 00 00 07 00 3E 00 02 07 00 3C 07 00 3C FF 00 02 00 16 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 07 00 04 07 00 8C 07 00 3C 07 00 AE 07 00 04 00 00 00 00 00 00 00 00 00 00 00 07 00 3E 00 01 07 01 3B FF 00 0B 00 05 07 00 02 07 00 71 07 00 71 07 00 3E 07 00 82 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  365    383    395    404    Ljava/lang/Throwable;
        //  365    383    404    416    Any
        //  395    404    404    416    Any
        //  272    440    452    461    Ljava/lang/Throwable;
        //  272    440    461    473    Any
        //  452    461    461    473    Any
        //  255    495    498    521    Ljava/io/IOException;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final String getMinecraftVersion() {
        final String id = UMinecraft.getMinecraft().getGame().getVersion().getId();
        Intrinsics.checkNotNullExpressionValue((Object)id, "getMinecraft().game.version.id");
        return id;
    }
    
    private final String getPlatformVersion() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1        /* loader */
        //     4: aload_1         /* loader */
        //     5: invokeinterface net/fabricmc/loader/api/FabricLoader.getAllMods:()Ljava/util/Collection;
        //    10: dup            
        //    11: ldc_w           "loader.allMods"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: checkcast       Ljava/lang/Iterable;
        //    20: astore_3        /* $this$map$iv */
        //    21: aload_3         /* $this$map$iv */
        //    22: astore          5
        //    24: new             Ljava/util/ArrayList;
        //    27: dup            
        //    28: aload_3         /* $this$map$iv */
        //    29: bipush          10
        //    31: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    34: invokespecial   java/util/ArrayList.<init>:(I)V
        //    37: checkcast       Ljava/util/Collection;
        //    40: astore          destination$iv$iv
        //    42: aload           $this$mapTo$iv$iv
        //    44: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    49: astore          8
        //    51: aload           8
        //    53: invokeinterface java/util/Iterator.hasNext:()Z
        //    58: ifeq            100
        //    61: aload           8
        //    63: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    68: astore          item$iv$iv
        //    70: aload           destination$iv$iv
        //    72: aload           item$iv$iv
        //    74: checkcast       Lnet/fabricmc/loader/api/ModContainer;
        //    77: astore          10
        //    79: astore          11
        //    81: aload           it
        //    83: invokeinterface net/fabricmc/loader/api/ModContainer.getMetadata:()Lnet/fabricmc/loader/api/metadata/ModMetadata;
        //    88: aload           11
        //    90: swap           
        //    91: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    96: pop            
        //    97: goto            51
        //   100: aload           destination$iv$iv
        //   102: checkcast       Ljava/util/List;
        //   105: checkcast       Ljava/lang/Iterable;
        //   108: astore          4
        //   110: aload           4
        //   112: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   117: astore          5
        //   119: aload           5
        //   121: invokeinterface java/util/Iterator.hasNext:()Z
        //   126: ifeq            192
        //   129: aload           5
        //   131: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   136: astore          6
        //   138: aload           6
        //   140: checkcast       Lnet/fabricmc/loader/api/metadata/ModMetadata;
        //   143: astore          it
        //   145: aload           it
        //   147: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.getId:()Ljava/lang/String;
        //   152: ldc_w           "fabricloader"
        //   155: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   158: ifne            179
        //   161: aload           it
        //   163: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.getProvides:()Ljava/util/Collection;
        //   168: ldc_w           "fabricloader"
        //   171: invokeinterface java/util/Collection.contains:(Ljava/lang/Object;)Z
        //   176: ifeq            183
        //   179: iconst_1       
        //   180: goto            184
        //   183: iconst_0       
        //   184: ifeq            119
        //   187: aload           6
        //   189: goto            193
        //   192: aconst_null    
        //   193: checkcast       Lnet/fabricmc/loader/api/metadata/ModMetadata;
        //   196: astore_2       
        //   197: aload_2        
        //   198: ifnull          237
        //   201: aload_2        
        //   202: astore          it
        //   204: aload           it
        //   206: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.getId:()Ljava/lang/String;
        //   211: aload           it
        //   213: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.getVersion:()Lnet/fabricmc/loader/api/Version;
        //   218: invokeinterface net/fabricmc/loader/api/Version.getFriendlyString:()Ljava/lang/String;
        //   223: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   228: astore_3       
        //   229: aload_3        
        //   230: ifnull          237
        //   233: aload_3        
        //   234: goto            240
        //   237: ldc_w           "unknown"
        //   240: areturn        
        //   241: astore_2        /* e */
        //   242: aload_2         /* e */
        //   243: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //   246: aload_2         /* e */
        //   247: instanceof      Ljava/lang/UnsupportedOperationException;
        //   250: ifeq            336
        //   253: aload_2         /* e */
        //   254: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   257: ldc_w           "Provides cannot be represented as a Fabric construct"
        //   260: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   263: ifeq            336
        //   266: aload_1         /* loader */
        //   267: ldc_w           "quilt_loader"
        //   270: invokeinterface net/fabricmc/loader/api/FabricLoader.getModContainer:(Ljava/lang/String;)Ljava/util/Optional;
        //   275: aconst_null    
        //   276: invokevirtual   java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        //   279: checkcast       Lnet/fabricmc/loader/api/ModContainer;
        //   282: astore          4
        //   284: aload           4
        //   286: ifnull          327
        //   289: aload           4
        //   291: invokeinterface net/fabricmc/loader/api/ModContainer.getMetadata:()Lnet/fabricmc/loader/api/metadata/ModMetadata;
        //   296: astore          5
        //   298: aload           5
        //   300: ifnull          327
        //   303: aload           5
        //   305: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.getVersion:()Lnet/fabricmc/loader/api/Version;
        //   310: astore          6
        //   312: aload           6
        //   314: ifnull          327
        //   317: aload           6
        //   319: invokeinterface net/fabricmc/loader/api/Version.getFriendlyString:()Ljava/lang/String;
        //   324: goto            328
        //   327: aconst_null    
        //   328: astore_3        /* version */
        //   329: aload_3         /* version */
        //   330: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   335: areturn        
        //   336: aload_1         /* loader */
        //   337: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   340: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   343: aload_2         /* e */
        //   344: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   347: invokedynamic   BootstrapMethod #2, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   352: areturn        
        //    StackMapTable: 00 0E FF 00 33 00 09 07 00 02 07 00 63 00 07 00 71 00 07 00 71 07 00 3E 00 07 00 82 00 00 30 FF 00 12 00 09 07 00 02 07 00 63 00 07 00 71 07 00 71 07 00 82 07 00 04 00 07 00 82 00 00 FF 00 3B 00 09 07 00 02 07 00 63 00 07 00 71 07 00 71 07 00 82 07 00 04 07 00 92 07 00 82 00 00 03 40 01 FF 00 07 00 09 07 00 02 07 00 63 00 07 00 71 07 00 71 07 00 82 07 00 04 00 07 00 82 00 00 40 07 00 04 FF 00 2B 00 09 07 00 02 07 00 63 07 00 92 07 00 04 07 00 71 07 00 04 07 00 04 00 07 00 82 00 00 42 07 00 3C FF 00 00 00 02 07 00 02 07 00 63 00 01 07 00 5F FE 00 55 07 00 5F 00 07 00 8C 40 07 00 3C F9 00 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      241    241    353    Ljava/lang/Throwable;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean isModLoaded(@NotNull final String modId) {
        Intrinsics.checkNotNullParameter((Object)modId, "modId");
        return FabricLoader.getInstance().isModLoaded(modId);
    }
    
    static {
        INSTANCE = new ModLoaderUtil();
        CollectionsKt.listOf((Object[])new String[] { "level_head", "skytils", "patcher", "text_overflow_scroll", "keystrokesmod", "autogg", "autotip", "hypixel_auto_complete", "tnttime", "nick_hider", "popup_events", "sk1er-bedwars_resource_display", "motionblurmod", "compactchat", "bossbar_customizer", "sk1er_fullscreen", "cpsmod", "combat_info", "victory_royale", "mousebindfix", "lobby_sounds", "autocorrect", "better_fps_limiter", "autogl", "item_optimization", "subtitles_mod", "case_commands", "autodab", "thanosmod", "command_patcher", "hypixel_join_hider_2", "cross_chat", "mouse_sensitivity_tweak", "20_20_20", "winter_weather", "Sk1er-UHCstars", "cape_editor", "ChromaHUD" });
    }
}
