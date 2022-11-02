package gg.essential.util;

import java.util.concurrent.*;
import java.net.*;
import gg.essential.config.*;
import kotlin.jvm.internal.*;
import java.time.temporal.*;
import java.time.format.*;
import java.time.*;
import org.jetbrains.annotations.*;
import java.util.function.*;
import gg.essential.*;
import net.minecraft.resource.*;
import kotlin.*;
import gg.essential.util.resource.*;
import net.minecraft.text.*;
import com.sparkuniverse.toolbox.util.*;
import kotlin.text.*;
import kotlin.collections.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.screenshot.components.*;
import java.nio.file.*;
import gg.essential.handlers.screenshot.*;
import java.util.*;
import java.io.*;
import org.apache.logging.log4j.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { """
                                                   \u0000\u0090\u0001
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u0011
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0007\u001a\u0014\u0010	\u001a\u00020
                                                   2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a\u0016\u0010\u000e\u001a
                                                    \u0004*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122
                                                   \u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014\u001a\u000e\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u000e\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0019\u001a\u0016\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010"\u001a\u00020\u001d\u001a6\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010'\u001a\u00020\b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0)\u001a\u000e\u0010*\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u001a\u0010+\u001a\u00020
                                                   2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020
                                                   0-H\u0086\b\u00f8\u0001\u0000\u001a\u000e\u0010.\u001a\u00020
                                                   2\u0006\u0010/\u001a\u00020\b\u001a\u0016\u00100\u001a
                                                    \u0004*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001\u001a/\u00101\u001a
                                                    \u0004*\u0004\u0018\u00010\u000f0\u000f2\u0006\u00102\u001a\u00020\u00012\u0012\u00103\u001a
                                                   \u0012\u0006\b\u0001\u0012\u00020504"\u000205¢\u0006\u0002\u00106\u001a\u0012\u00107\u001a\u00020\u0001*\u00020\u00192\u0006\u00108\u001a\u00020\u0001\u001a.\u00109\u001a\u000e\u0012\u0004\u0012\u0002H:\u0012\u0004\u0012\u0002H;0)"\u0004\b\u0000\u0010:"\u0004\b\u0001\u0010;*\u000e\u0012\u0004\u0012\u0002H:\u0012\u0004\u0012\u0002H;0)"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002
                                                   \u0000"\u0016\u0010\u0002\u001a
                                                    \u0004*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000"\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000\u0082\u0002\u0007
                                                   \u0005\b\u009920\u0001¨\u0006<""" }, d2 = { "DATE_FORMAT", "", "LOGGER", "Lorg/apache/logging/log4j/Logger;", "kotlin.jvm.PlatformType", "jarFileCopies", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/net/URL;", "Ljava/nio/file/Path;", "addEssentialResourcePack", "", "consumer", "Ljava/util/function/Consumer;", "Lnet/minecraft/resource/ResourcePack;", "buttonLiteral", "Lnet/minecraft/text/MutableText;", "str", "findCodeSource", "Lgg/essential/util/CodeSource;", "javaClass", "Ljava/lang/Class;", "formatDate", "date", "Ljava/time/LocalDate;", "formatDateAndTime", "Ljava/time/temporal/TemporalAccessor;", "formatTime", "time", "includeSeconds", "", "getImageTime", "Lcom/sparkuniverse/toolbox/util/DateTime;", "properties", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "useEditIfPresent", "getOrderedPaths", "", "files", "", "rootPath", "timeExtractor", "Lkotlin/Function1;", "getTimeFormat", "loop", "block", "Lkotlin/Function0;", "openFileInDirectory", "path", "textLiteral", "textTranslatable", "key", "components", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Lnet/minecraft/text/MutableText;", "formatter", "pattern", "memoize", "T", "R", "essential" })
public final class HelpersKt
{
    private static final Logger LOGGER;
    @NotNull
    private static final ConcurrentHashMap<URL, Path> jarFileCopies;
    
    @NotNull
    public static final String getTimeFormat(final boolean includeSeconds) {
        final String seconds = includeSeconds ? ":ss" : "";
        return (EssentialConfig.INSTANCE.getTimeFormat() == 0) ? ("h:mm" + seconds + " a") : ("HH:mm" + seconds);
    }
    
    @NotNull
    public static final String formatDate(@NotNull final LocalDate date) {
        Intrinsics.checkNotNullParameter((Object)date, "date");
        return formatter(date, "MMM dd, yyyy");
    }
    
    @NotNull
    public static final String formatTime(@NotNull final TemporalAccessor time, final boolean includeSeconds) {
        Intrinsics.checkNotNullParameter((Object)time, "time");
        return formatter(time, getTimeFormat(includeSeconds));
    }
    
    @NotNull
    public static final String formatDateAndTime(@NotNull final TemporalAccessor date) {
        Intrinsics.checkNotNullParameter((Object)date, "date");
        return formatter(date, "MMM dd, yyyy @ " + getTimeFormat(false));
    }
    
    @NotNull
    public static final String formatter(@NotNull final TemporalAccessor $this$formatter, @NotNull final String pattern) {
        Intrinsics.checkNotNullParameter((Object)$this$formatter, "<this>");
        Intrinsics.checkNotNullParameter((Object)pattern, "pattern");
        final DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH).withZone(ZoneId.systemDefault());
        final String format2 = format.format($this$formatter);
        Intrinsics.checkNotNullExpressionValue((Object)format2, "format.format(this)");
        return format2;
    }
    
    @Nullable
    public static final CodeSource findCodeSource(@NotNull final Class<?> javaClass) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "javaClass"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* javaClass */
        //     7: invokevirtual   java/lang/Class.getProtectionDomain:()Ljava/security/ProtectionDomain;
        //    10: invokevirtual   java/security/ProtectionDomain.getCodeSource:()Ljava/security/CodeSource;
        //    13: dup            
        //    14: ifnull          24
        //    17: invokevirtual   java/security/CodeSource.getLocation:()Ljava/net/URL;
        //    20: dup            
        //    21: ifnonnull       89
        //    24: pop            
        //    25: aload_0         /* javaClass */
        //    26: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    29: aload_0         /* javaClass */
        //    30: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    33: dup            
        //    34: ldc             "javaClass.name"
        //    36: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    39: bipush          46
        //    41: bipush          47
        //    43: iconst_0       
        //    44: iconst_4       
        //    45: aconst_null    
        //    46: invokestatic    kotlin/text/StringsKt.replace$default:(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;
        //    49: invokedynamic   BootstrapMethod #3, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //    54: invokevirtual   java/lang/ClassLoader.getResources:(Ljava/lang/String;)Ljava/util/Enumeration;
        //    57: dup            
        //    58: ifnull          80
        //    61: invokestatic    kotlin/collections/CollectionsKt.iterator:(Ljava/util/Enumeration;)Ljava/util/Iterator;
        //    64: invokestatic    kotlin/sequences/SequencesKt.asSequence:(Ljava/util/Iterator;)Lkotlin/sequences/Sequence;
        //    67: dup            
        //    68: ifnull          80
        //    71: invokestatic    kotlin/sequences/SequencesKt.firstOrNull:(Lkotlin/sequences/Sequence;)Ljava/lang/Object;
        //    74: checkcast       Ljava/net/URL;
        //    77: goto            82
        //    80: pop            
        //    81: aconst_null    
        //    82: dup            
        //    83: ifnonnull       89
        //    86: pop            
        //    87: aconst_null    
        //    88: areturn        
        //    89: astore_1        /* url */
        //    90: aload_0         /* javaClass */
        //    91: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    94: dup            
        //    95: ldc             "javaClass.name"
        //    97: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   100: bipush          46
        //   102: bipush          47
        //   104: iconst_0       
        //   105: iconst_4       
        //   106: aconst_null    
        //   107: invokestatic    kotlin/text/StringsKt.replace$default:(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;
        //   110: invokedynamic   BootstrapMethod #4, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   115: astore_2        /* classSuffix */
        //   116: aload_2         /* classSuffix */
        //   117: invokedynamic   BootstrapMethod #5, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   122: astore_3        /* jarSuffix */
        //   123: aload_1         /* url */
        //   124: invokevirtual   java/net/URL.getProtocol:()Ljava/lang/String;
        //   127: ldc             "jar"
        //   129: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   132: ifeq            185
        //   135: aload_1         /* url */
        //   136: invokevirtual   java/net/URL.getFile:()Ljava/lang/String;
        //   139: dup            
        //   140: ldc_w           "url.file"
        //   143: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   146: aload_3         /* jarSuffix */
        //   147: iconst_0       
        //   148: iconst_2       
        //   149: aconst_null    
        //   150: invokestatic    kotlin/text/StringsKt.endsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   153: ifeq            185
        //   156: new             Ljava/net/URL;
        //   159: dup            
        //   160: aload_1         /* url */
        //   161: invokevirtual   java/net/URL.getFile:()Ljava/lang/String;
        //   164: dup            
        //   165: ldc_w           "url.file"
        //   168: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   171: aload_3         /* jarSuffix */
        //   172: checkcast       Ljava/lang/CharSequence;
        //   175: invokestatic    kotlin/text/StringsKt.removeSuffix:(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   178: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   181: astore_1        /* url */
        //   182: goto            257
        //   185: aload_1         /* url */
        //   186: invokevirtual   java/net/URL.getProtocol:()Ljava/lang/String;
        //   189: ldc_w           "file"
        //   192: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   195: ifeq            257
        //   198: aload_1         /* url */
        //   199: invokevirtual   java/net/URL.getFile:()Ljava/lang/String;
        //   202: dup            
        //   203: ldc_w           "url.file"
        //   206: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   209: aload_2         /* classSuffix */
        //   210: iconst_0       
        //   211: iconst_2       
        //   212: aconst_null    
        //   213: invokestatic    kotlin/text/StringsKt.endsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   216: ifeq            257
        //   219: new             Ljava/net/URL;
        //   222: dup            
        //   223: aload_1         /* url */
        //   224: invokevirtual   java/net/URL.getProtocol:()Ljava/lang/String;
        //   227: aload_1         /* url */
        //   228: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //   231: aload_1         /* url */
        //   232: invokevirtual   java/net/URL.getPort:()I
        //   235: aload_1         /* url */
        //   236: invokevirtual   java/net/URL.getFile:()Ljava/lang/String;
        //   239: dup            
        //   240: ldc_w           "url.file"
        //   243: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   246: aload_2         /* classSuffix */
        //   247: checkcast       Ljava/lang/CharSequence;
        //   250: invokestatic    kotlin/text/StringsKt.removeSuffix:(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   253: invokespecial   java/net/URL.<init>:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
        //   256: astore_1        /* url */
        //   257: aload_1         /* url */
        //   258: invokevirtual   java/net/URL.getProtocol:()Ljava/lang/String;
        //   261: ldc_w           "union"
        //   264: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   267: ifeq            343
        //   270: aload_1         /* url */
        //   271: invokevirtual   java/net/URL.toURI:()Ljava/net/URI;
        //   274: invokevirtual   java/net/URI.getPath:()Ljava/lang/String;
        //   277: astore          unionPath
        //   279: ldc_w           "file"
        //   282: astore          originalScheme
        //   284: aload           unionPath
        //   286: ldc_w           "unionPath"
        //   289: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   292: aload           unionPath
        //   294: iconst_0       
        //   295: aload           unionPath
        //   297: checkcast       Ljava/lang/CharSequence;
        //   300: ldc_w           "#"
        //   303: iconst_0       
        //   304: iconst_0       
        //   305: bipush          6
        //   307: aconst_null    
        //   308: invokestatic    kotlin/text/StringsKt.lastIndexOf$default:(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I
        //   311: invokestatic    kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
        //   314: invokestatic    kotlin/text/StringsKt.substring:(Ljava/lang/String;Lkotlin/ranges/IntRange;)Ljava/lang/String;
        //   317: astore          originalPath
        //   319: new             Ljava/net/URI;
        //   322: dup            
        //   323: aload           originalScheme
        //   325: aconst_null    
        //   326: aload           originalPath
        //   328: aconst_null    
        //   329: invokespecial   java/net/URI.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   332: invokevirtual   java/net/URI.toURL:()Ljava/net/URL;
        //   335: dup            
        //   336: ldc_w           "URI(originalScheme, null\u2026iginalPath, null).toURL()"
        //   339: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   342: astore_1        /* url */
        //   343: aload_1         /* url */
        //   344: invokevirtual   java/net/URL.getFile:()Ljava/lang/String;
        //   347: dup            
        //   348: ldc_w           "url.file"
        //   351: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   354: ldc_w           ".jar"
        //   357: iconst_0       
        //   358: iconst_2       
        //   359: aconst_null    
        //   360: invokestatic    kotlin/text/StringsKt.endsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   363: ifeq            691
        //   366: aload_1         /* url */
        //   367: invokevirtual   java/net/URL.toURI:()Ljava/net/URI;
        //   370: dup            
        //   371: ldc_w           "url.toURI()"
        //   374: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   377: invokestatic    java/nio/file/Paths.get:(Ljava/net/URI;)Ljava/nio/file/Path;
        //   380: dup            
        //   381: ldc_w           "get(this)"
        //   384: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   387: invokeinterface java/nio/file/Path.toAbsolutePath:()Ljava/nio/file/Path;
        //   392: astore          5
        //   394: aload           5
        //   396: astore          it
        //   398: aload           it
        //   400: invokeinterface java/nio/file/Path.getFileSystem:()Ljava/nio/file/FileSystem;
        //   405: invokestatic    java/nio/file/FileSystems.getDefault:()Ljava/nio/file/FileSystem;
        //   408: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   411: ifne            436
        //   414: new             Ljava/io/IOException;
        //   417: dup            
        //   418: aload           it
        //   420: aload           it
        //   422: invokeinterface java/nio/file/Path.getFileSystem:()Ljava/nio/file/FileSystem;
        //   427: invokedynamic   BootstrapMethod #6, makeConcatWithConstants:(Ljava/nio/file/Path;Ljava/nio/file/FileSystem;)Ljava/lang/String;
        //   432: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   435: athrow         
        //   436: aload           it
        //   438: iconst_0       
        //   439: anewarray       Ljava/nio/file/LinkOption;
        //   442: invokestatic    java/nio/file/Files.notExists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
        //   445: ifeq            463
        //   448: new             Ljava/io/IOException;
        //   451: dup            
        //   452: aload           it
        //   454: invokedynamic   BootstrapMethod #7, makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
        //   459: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   462: athrow         
        //   463: aload           5
        //   465: astore          5
        //   467: goto            660
        //   470: astore          e
        //   472: getstatic       gg/essential/util/HelpersKt.LOGGER:Lorg/apache/logging/log4j/Logger;
        //   475: aload_1         /* url */
        //   476: invokedynamic   BootstrapMethod #8, makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
        //   481: aload           e
        //   483: checkcast       Ljava/lang/Throwable;
        //   486: invokeinterface org/apache/logging/log4j/Logger.debug:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   491: getstatic       gg/essential/util/HelpersKt.jarFileCopies:Ljava/util/concurrent/ConcurrentHashMap;
        //   494: checkcast       Ljava/util/concurrent/ConcurrentMap;
        //   497: astore          7
        //   499: aload_1         /* url */
        //   500: astore          key$iv
        //   502: aload           $this$getOrPut$iv
        //   504: aload           key$iv
        //   506: invokeinterface java/util/concurrent/ConcurrentMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   511: dup            
        //   512: ifnonnull       655
        //   515: pop            
        //   516: ldc_w           "essential"
        //   519: ldc_w           ".jar"
        //   522: iconst_0       
        //   523: anewarray       Ljava/nio/file/attribute/FileAttribute;
        //   526: invokestatic    java/nio/file/Files.createTempFile:(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
        //   529: astore          9
        //   531: aload           9
        //   533: astore          tmpFile
        //   535: aload           tmpFile
        //   537: invokeinterface java/nio/file/Path.toFile:()Ljava/io/File;
        //   542: invokevirtual   java/io/File.deleteOnExit:()V
        //   545: aload_1         /* url */
        //   546: checkcast       Ljava/net/URL;
        //   549: invokevirtual   java/net/URL.openStream:()Ljava/io/InputStream;
        //   552: checkcast       Ljava/io/Closeable;
        //   555: astore          11
        //   557: aconst_null    
        //   558: astore          12
        //   560: aload           11
        //   562: checkcast       Ljava/io/InputStream;
        //   565: astore          it
        //   567: aload           it
        //   569: aload           tmpFile
        //   571: iconst_1       
        //   572: anewarray       Ljava/nio/file/CopyOption;
        //   575: astore          14
        //   577: aload           14
        //   579: iconst_0       
        //   580: getstatic       java/nio/file/StandardCopyOption.REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;
        //   583: checkcast       Ljava/nio/file/CopyOption;
        //   586: aastore        
        //   587: aload           14
        //   589: invokestatic    java/nio/file/Files.copy:(Ljava/io/InputStream;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)J
        //   592: pop2           
        //   593: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   596: pop            
        //   597: aload           11
        //   599: aload           12
        //   601: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   604: goto            628
        //   607: astore          13
        //   609: aload           13
        //   611: astore          12
        //   613: aload           13
        //   615: athrow         
        //   616: astore          13
        //   618: aload           11
        //   620: aload           12
        //   622: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   625: aload           13
        //   627: athrow         
        //   628: aload           9
        //   630: invokeinterface java/nio/file/Path.toAbsolutePath:()Ljava/nio/file/Path;
        //   635: astore          default$iv
        //   637: aload           $this$getOrPut$iv
        //   639: aload           key$iv
        //   641: aload           default$iv
        //   643: invokeinterface java/util/concurrent/ConcurrentMap.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   648: dup            
        //   649: ifnonnull       655
        //   652: pop            
        //   653: aload           default$iv
        //   655: checkcast       Ljava/nio/file/Path;
        //   658: astore          5
        //   660: aload           5
        //   662: astore          4
        //   664: aload           4
        //   666: ldc_w           "try {\n            // Try\u2026)\n            }\n        }"
        //   669: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   672: aload           4
        //   674: astore          16
        //   676: new             Lgg/essential/util/CodeSource$Jar;
        //   679: dup            
        //   680: aload           16
        //   682: invokespecial   gg/essential/util/CodeSource$Jar.<init>:(Ljava/nio/file/Path;)V
        //   685: checkcast       Lgg/essential/util/CodeSource;
        //   688: goto            771
        //   691: new             Lgg/essential/util/CodeSource$Directory;
        //   694: dup            
        //   695: aload_1         /* url */
        //   696: invokevirtual   java/net/URL.toURI:()Ljava/net/URI;
        //   699: dup            
        //   700: ldc_w           "url.toURI()"
        //   703: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   706: invokestatic    java/nio/file/Paths.get:(Ljava/net/URI;)Ljava/nio/file/Path;
        //   709: dup            
        //   710: ldc_w           "get(this)"
        //   713: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   716: invokeinterface java/nio/file/Path.toFile:()Ljava/io/File;
        //   721: invokevirtual   java/io/File.toPath:()Ljava/nio/file/Path;
        //   724: dup            
        //   725: ldc_w           "url.toURI().toPath().toFile().toPath()"
        //   728: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   731: invokespecial   gg/essential/util/CodeSource$Directory.<init>:(Ljava/nio/file/Path;)V
        //   734: astore          4
        //   736: goto            766
        //   739: astore          e
        //   741: getstatic       gg/essential/util/HelpersKt.LOGGER:Lorg/apache/logging/log4j/Logger;
        //   744: aload_1         /* url */
        //   745: invokedynamic   BootstrapMethod #9, makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
        //   750: aload           e
        //   752: checkcast       Ljava/lang/Throwable;
        //   755: invokeinterface org/apache/logging/log4j/Logger.warn:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   760: aconst_null    
        //   761: checkcast       Lgg/essential/util/CodeSource$Directory;
        //   764: astore          4
        //   766: aload           4
        //   768: checkcast       Lgg/essential/util/CodeSource;
        //   771: areturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;)Lgg/essential/util/CodeSource;
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  javaClass  
        //    StackMapTable: 00 13 58 07 00 04 77 07 00 04 41 07 00 EC 46 07 00 EC FE 00 5F 07 00 EC 07 00 52 07 00 52 FB 00 47 FB 00 55 FE 00 5C 00 07 01 4C 07 01 4C 1A FF 00 06 00 04 07 00 B1 07 00 EC 07 00 52 07 00 52 00 01 07 00 AE FF 00 88 00 0D 07 00 B1 07 00 EC 07 00 52 07 00 52 00 00 07 00 AE 07 01 7F 07 00 EC 07 01 4C 07 01 4C 07 01 99 05 00 01 07 00 AC FF 00 08 00 0D 07 00 B1 07 00 EC 07 00 52 07 00 52 00 00 07 00 AE 07 01 7F 07 00 EC 07 01 4C 07 01 4C 07 01 99 07 00 AC 00 01 07 00 AC FF 00 0B 00 0F 07 00 B1 07 00 EC 07 00 52 07 00 52 00 00 07 00 AE 07 01 7F 07 00 EC 07 01 4C 07 01 4C 07 01 99 05 07 01 9B 07 01 B4 00 00 FF 00 1A 00 09 07 00 B1 07 00 EC 07 00 52 07 00 52 00 00 07 00 AE 07 01 7F 07 00 EC 00 01 07 00 04 FF 00 04 00 07 07 00 B1 07 00 EC 07 00 52 07 00 52 00 07 01 4C 07 00 04 00 00 F8 00 1E 6F 07 00 AE FC 00 1A 07 01 C3 FF 00 04 00 05 07 00 B1 07 00 EC 07 00 52 07 00 52 07 00 04 00 01 07 01 C1
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  560    597    607    616    Ljava/lang/Throwable;
        //  560    597    616    628    Any
        //  607    616    616    628    Any
        //  366    467    470    660    Ljava/lang/Exception;
        //  691    736    739    766    Ljava/lang/Exception;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final void addEssentialResourcePack(@NotNull final Consumer<ResourcePack> consumer) {
        Intrinsics.checkNotNullParameter((Object)consumer, "consumer");
        final CodeSource source = findCodeSource(Essential.class);
        AbstractFileResourcePack abstractFileResourcePack;
        if (source instanceof final CodeSource.Jar jar) {
            abstractFileResourcePack = (AbstractFileResourcePack)new ZipResourcePack(jar.getPath().toFile());
        }
        else if (source instanceof final CodeSource.Directory directory) {
            abstractFileResourcePack = (AbstractFileResourcePack)new DirectoryResourcePack(directory.getPath().toFile());
        }
        else {
            if (source == null) {
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        final AbstractFileResourcePack pack = abstractFileResourcePack;
        consumer.accept((ResourcePack)new Lang3As4Pack((ResourcePack)pack));
    }
    
    public static final MutableText textLiteral(@NotNull final String str) {
        Intrinsics.checkNotNullParameter((Object)str, "str");
        return Text.literal(str);
    }
    
    public static final MutableText textTranslatable(@NotNull final String key, @NotNull final Object... components) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        Intrinsics.checkNotNullParameter((Object)components, "components");
        return Text.translatable(key, Arrays.copyOf(components, components.length));
    }
    
    public static final MutableText buttonLiteral(@NotNull final String str) {
        Intrinsics.checkNotNullParameter((Object)str, "str");
        return textLiteral(str);
    }
    
    @NotNull
    public static final DateTime getImageTime(@NotNull final ScreenshotProperties properties, final boolean useEditIfPresent) {
        Intrinsics.checkNotNullParameter((Object)properties, "properties");
        final Path path = properties.component1();
        final ClientScreenshotMetadata metadata = properties.component2();
        if (metadata != null) {
            DateTime dateTime;
            if (useEditIfPresent) {
                if ((dateTime = metadata.getEditTime()) == null) {
                    dateTime = metadata.getTime();
                }
            }
            else {
                dateTime = metadata.getTime();
            }
            return dateTime;
        }
        final String name = StringsKt.removeSuffix(CollectionsKt.joinToString$default((Iterable)CollectionsKt.take((Iterable)StringsKt.split$default((CharSequence)path.getFileName().toString(), new String[] { "_" }, false, 0, 6, (Object)null), 2), (CharSequence)"_", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null), (CharSequence)".png");
        long time;
        try {
            time = ScreenshotBrowser.Companion.getDATE_FORMAT().parse(name).getTime();
        }
        catch (final Exception ex) {
            long millis2;
            try {
                millis2 = Files.getLastModifiedTime(path, new LinkOption[0]).toMillis();
            }
            catch (final Exception ex2) {
                millis2 = 0L;
            }
            time = millis2;
        }
        final long millis = time;
        return new DateTime(millis);
    }
    
    public static final void openFileInDirectory(@NotNull final Path path) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "path"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: new             Lgg/essential/util/HelpersKt$openFileInDirectory$1;
        //    10: dup            
        //    11: aload_0         /* path */
        //    12: invokespecial   gg/essential/util/HelpersKt$openFileInDirectory$1.<init>:(Ljava/nio/file/Path;)V
        //    15: checkcast       Lkotlin/jvm/functions/Function0;
        //    18: astore_1       
        //    19: iconst_3       
        //    20: anewarray       Lkotlin/reflect/KClass;
        //    23: astore_2       
        //    24: aload_2        
        //    25: iconst_0       
        //    26: ldc_w           Ljava/lang/NoSuchMethodException;.class
        //    29: invokestatic    kotlin/jvm/internal/Reflection.getOrCreateKotlinClass:(Ljava/lang/Class;)Lkotlin/reflect/KClass;
        //    32: aastore        
        //    33: aload_2        
        //    34: iconst_1       
        //    35: ldc_w           Ljava/lang/reflect/InvocationTargetException;.class
        //    38: invokestatic    kotlin/jvm/internal/Reflection.getOrCreateKotlinClass:(Ljava/lang/Class;)Lkotlin/reflect/KClass;
        //    41: aastore        
        //    42: aload_2        
        //    43: iconst_2       
        //    44: ldc_w           Ljava/awt/HeadlessException;.class
        //    47: invokestatic    kotlin/jvm/internal/Reflection.getOrCreateKotlinClass:(Ljava/lang/Class;)Lkotlin/reflect/KClass;
        //    50: aastore        
        //    51: aload_2        
        //    52: astore_2        /* exceptions$iv */
        //    53: aload_1         /* $this$catch$iv */
        //    54: invokeinterface kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
        //    59: pop            
        //    60: goto            261
        //    63: astore_3        /* e$iv */
        //    64: aload_2         /* exceptions$iv */
        //    65: astore          $this$any$iv$iv
        //    67: iconst_0       
        //    68: istore          5
        //    70: iload           5
        //    72: iconst_3       
        //    73: if_icmpge       111
        //    76: aload           $this$any$iv$iv
        //    78: iload           5
        //    80: aaload         
        //    81: astore          element$iv$iv
        //    83: aload           element$iv$iv
        //    85: checkcast       Lkotlin/reflect/KClass;
        //    88: astore          it$iv
        //    90: aload           it$iv
        //    92: aload_3         /* e$iv */
        //    93: invokeinterface kotlin/reflect/KClass.isInstance:(Ljava/lang/Object;)Z
        //    98: ifeq            105
        //   101: iconst_1       
        //   102: goto            112
        //   105: iinc            5, 1
        //   108: goto            70
        //   111: iconst_0       
        //   112: ifeq            259
        //   115: aload_3         /* e$iv */
        //   116: astore          throwable
        //   118: aload           throwable
        //   120: instanceof      Ljava/lang/reflect/InvocationTargetException;
        //   123: ifeq            142
        //   126: aload           throwable
        //   128: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   131: instanceof      Ljava/lang/UnsupportedOperationException;
        //   134: ifne            142
        //   137: aload           throwable
        //   139: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //   142: invokestatic    gg/essential/universal/UDesktop.isWindows:()Z
        //   145: ifeq            189
        //   148: iconst_3       
        //   149: anewarray       Ljava/lang/String;
        //   152: astore          9
        //   154: aload           9
        //   156: iconst_0       
        //   157: ldc_w           "explorer.exe"
        //   160: aastore        
        //   161: aload           9
        //   163: iconst_1       
        //   164: ldc_w           "/select,"
        //   167: aastore        
        //   168: aload           9
        //   170: iconst_2       
        //   171: aload_0         /* path */
        //   172: invokeinterface java/nio/file/Path.toAbsolutePath:()Ljava/nio/file/Path;
        //   177: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   180: aastore        
        //   181: aload           9
        //   183: invokestatic    gg/essential/util/HelpersKt.openFileInDirectory$lambda-5$command:([Ljava/lang/String;)Z
        //   186: ifne            256
        //   189: invokestatic    gg/essential/universal/UDesktop.isMac:()Z
        //   192: ifeq            236
        //   195: iconst_3       
        //   196: anewarray       Ljava/lang/String;
        //   199: astore          9
        //   201: aload           9
        //   203: iconst_0       
        //   204: ldc_w           "open"
        //   207: aastore        
        //   208: aload           9
        //   210: iconst_1       
        //   211: ldc_w           "-R"
        //   214: aastore        
        //   215: aload           9
        //   217: iconst_2       
        //   218: aload_0         /* path */
        //   219: invokeinterface java/nio/file/Path.toAbsolutePath:()Ljava/nio/file/Path;
        //   224: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   227: aastore        
        //   228: aload           9
        //   230: invokestatic    gg/essential/util/HelpersKt.openFileInDirectory$lambda-5$command:([Ljava/lang/String;)Z
        //   233: ifne            256
        //   236: aload_0         /* path */
        //   237: invokeinterface java/nio/file/Path.toFile:()Ljava/io/File;
        //   242: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //   245: dup            
        //   246: ldc_w           "path.toFile().parentFile"
        //   249: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   252: invokestatic    gg/essential/universal/UDesktop.open:(Ljava/io/File;)Z
        //   255: pop            
        //   256: goto            261
        //   259: aload_3         /* e$iv */
        //   260: athrow         
        //   261: return         
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  path  
        //    StackMapTable: 00 0B FF 00 3F 00 03 07 01 4C 07 02 7A 07 02 8E 00 01 07 00 AC FE 00 06 07 00 AC 07 02 8E 01 FD 00 22 07 02 7C 07 02 7C F9 00 05 40 01 FE 00 1D 00 00 07 00 AC 2E 2E 13 F8 00 02 F8 00 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  53     60     63     261    Ljava/lang/Throwable;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <T, R> Function1<T, R> memoize(@NotNull final Function1<? super T, ? extends R> $this$memoize) {
        Intrinsics.checkNotNullParameter((Object)$this$memoize, "<this>");
        return (Function1<T, R>)new Memoize((kotlin.jvm.functions.Function1<? super Object, ?>)$this$memoize);
    }
    
    @NotNull
    public static final List<Path> getOrderedPaths(@NotNull final Set<String> files, @NotNull final Path rootPath, @NotNull final Function1<? super Path, ? extends DateTime> timeExtractor) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "files"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1         /* rootPath */
        //     8: ldc_w           "rootPath"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_2         /* timeExtractor */
        //    15: ldc_w           "timeExtractor"
        //    18: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    21: aload_2         /* timeExtractor */
        //    22: invokestatic    gg/essential/util/HelpersKt.memoize:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
        //    25: astore_3        /* memoized */
        //    26: aload_0         /* files */
        //    27: checkcast       Ljava/lang/Iterable;
        //    30: astore          $this$map$iv
        //    32: aload           $this$map$iv
        //    34: astore          5
        //    36: new             Ljava/util/ArrayList;
        //    39: dup            
        //    40: aload           $this$map$iv
        //    42: bipush          10
        //    44: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    47: invokespecial   java/util/ArrayList.<init>:(I)V
        //    50: checkcast       Ljava/util/Collection;
        //    53: astore          destination$iv$iv
        //    55: aload           $this$mapTo$iv$iv
        //    57: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    62: astore          7
        //    64: aload           7
        //    66: invokeinterface java/util/Iterator.hasNext:()Z
        //    71: ifeq            114
        //    74: aload           7
        //    76: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    81: astore          item$iv$iv
        //    83: aload           destination$iv$iv
        //    85: aload           item$iv$iv
        //    87: checkcast       Ljava/lang/String;
        //    90: astore          9
        //    92: astore          10
        //    94: aload_1         /* rootPath */
        //    95: aload           it
        //    97: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //   102: aload           10
        //   104: swap           
        //   105: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   110: pop            
        //   111: goto            64
        //   114: aload           destination$iv$iv
        //   116: checkcast       Ljava/util/List;
        //   119: checkcast       Ljava/lang/Iterable;
        //   122: new             Lgg/essential/util/HelpersKt$getOrderedPaths$$inlined$compareByDescending$1;
        //   125: dup            
        //   126: aload_3         /* memoized */
        //   127: invokespecial   gg/essential/util/HelpersKt$getOrderedPaths$$inlined$compareByDescending$1.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   130: checkcast       Ljava/util/Comparator;
        //   133: astore          4
        //   135: new             Lgg/essential/util/HelpersKt$getOrderedPaths$$inlined$thenBy$1;
        //   138: dup            
        //   139: aload           4
        //   141: invokespecial   gg/essential/util/HelpersKt$getOrderedPaths$$inlined$thenBy$1.<init>:(Ljava/util/Comparator;)V
        //   144: checkcast       Ljava/util/Comparator;
        //   147: invokestatic    kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        //   150: areturn        
        //    Signature:
        //  (Ljava/util/Set<Ljava/lang/String;>;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function1<-Ljava/nio/file/Path;+Lcom/sparkuniverse/toolbox/util/DateTime;>;)Ljava/util/List<Ljava/nio/file/Path;>;
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  files          
        //  rootPath       
        //  timeExtractor  
        //    StackMapTable: 00 02 FF 00 40 00 08 07 02 E7 07 01 4C 07 02 CF 07 02 CF 07 02 40 07 02 40 07 02 E2 07 02 E9 00 00 31
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final boolean openFileInDirectory$lambda-5$command(final String... command) {
        boolean b;
        try {
            final Process it = Runtime.getRuntime().exec(command);
            b = (it != null && it.isAlive());
        }
        catch (final IOException ex) {
            b = false;
        }
        return b;
    }
    
    static {
        LOGGER = LogManager.getLogger();
        jarFileCopies = new ConcurrentHashMap<URL, Path>();
    }
}
