package gg.essential.gui.screenshot.components;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.screenshot.concurrent.*;
import io.netty.buffer.*;
import java.io.*;
import gg.essential.util.lwjgl3.api.*;
import gg.essential.gui.screenshot.providers.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000B
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\b\u001a\u00020	2\u0012\u0010
                                                   \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotProviderManager$Companion;", "", "()V", "MAX_MEMORY", "", "minResolutionTargetResolution", "Lkotlin/Pair;", "", "createFileCachedBicubicProvider", "Lgg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider;", "targetResolution", "pool", "Lgg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor;", "alloc", "Lio/netty/buffer/ByteBufAllocator;", "essentialDir", "Ljava/io/File;", "nativeImageReader", "Lgg/essential/util/lwjgl3/api/NativeImageReader;", "precomputeOnly", "", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmOverloads
    @NotNull
    public final FileCachedWindowedImageProvider createFileCachedBicubicProvider(@NotNull final Pair<Integer, Integer> targetResolution, @NotNull final PriorityThreadPoolExecutor pool, @NotNull final ByteBufAllocator alloc, @NotNull final File essentialDir, @NotNull final NativeImageReader nativeImageReader, final boolean precomputeOnly) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "targetResolution"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* pool */
        //     7: ldc             "pool"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* alloc */
        //    13: ldc             "alloc"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           essentialDir
        //    20: ldc             "essentialDir"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload           nativeImageReader
        //    27: ldc             "nativeImageReader"
        //    29: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    32: aload_1         /* targetResolution */
        //    33: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //    36: checkcast       Ljava/lang/Number;
        //    39: invokevirtual   java/lang/Number.intValue:()I
        //    42: istore          targetWidth
        //    44: aload_1         /* targetResolution */
        //    45: invokevirtual   kotlin/Pair.component2:()Ljava/lang/Object;
        //    48: checkcast       Ljava/lang/Number;
        //    51: invokevirtual   java/lang/Number.intValue:()I
        //    54: istore          targetHeight
        //    56: new             Lgg/essential/gui/screenshot/providers/PostProcessWindowedImageProvider;
        //    59: dup            
        //    60: new             Lgg/essential/gui/screenshot/providers/DiskWindowedImageProvider;
        //    63: dup            
        //    64: aload           nativeImageReader
        //    66: aload_3         /* alloc */
        //    67: invokespecial   gg/essential/gui/screenshot/providers/DiskWindowedImageProvider.<init>:(Lgg/essential/util/lwjgl3/api/NativeImageReader;Lio/netty/buffer/ByteBufAllocator;)V
        //    70: checkcast       Lgg/essential/gui/screenshot/providers/WindowedProvider;
        //    73: getstatic       gg/essential/gui/screenshot/providers/PostProcessWindowedImageProvider.Companion:Lgg/essential/gui/screenshot/providers/PostProcessWindowedImageProvider$Companion;
        //    76: iload           targetWidth
        //    78: iload           targetHeight
        //    80: invokevirtual   gg/essential/gui/screenshot/providers/PostProcessWindowedImageProvider$Companion.bicubicFilter:(II)Lkotlin/jvm/functions/Function1;
        //    83: invokespecial   gg/essential/gui/screenshot/providers/PostProcessWindowedImageProvider.<init>:(Lgg/essential/gui/screenshot/providers/WindowedProvider;Lkotlin/jvm/functions/Function1;)V
        //    86: checkcast       Lgg/essential/gui/screenshot/providers/WindowedProvider;
        //    89: getstatic       gg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider.Companion:Lgg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider$Companion;
        //    92: aload           essentialDir
        //    94: invokevirtual   java/io/File.toPath:()Ljava/nio/file/Path;
        //    97: ldc             "screenshot-cache"
        //    99: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //   104: iload           targetWidth
        //   106: iload           targetHeight
        //   108: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(II)Ljava/lang/String;
        //   113: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //   118: astore          9
        //   120: aload           9
        //   122: astore          10
        //   124: astore          12
        //   126: astore          11
        //   128: aload           p0
        //   130: iconst_0       
        //   131: anewarray       Ljava/nio/file/attribute/FileAttribute;
        //   134: invokestatic    java/nio/file/Files.createDirectories:(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
        //   137: pop            
        //   138: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   141: pop            
        //   142: aload           11
        //   144: aload           12
        //   146: aload           9
        //   148: dup            
        //   149: ldc             "essentialDir.toPath().re\u2026Files::createDirectories)"
        //   151: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   154: invokevirtual   gg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider$Companion.inDirectory:(Ljava/nio/file/Path;)Lkotlin/jvm/functions/Function1;
        //   157: aload_2         /* pool */
        //   158: aload           nativeImageReader
        //   160: aload_3         /* alloc */
        //   161: iload           precomputeOnly
        //   163: istore          13
        //   165: astore          14
        //   167: astore          15
        //   169: astore          16
        //   171: astore          17
        //   173: astore          18
        //   175: new             Lgg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider;
        //   178: dup            
        //   179: aload           18
        //   181: aload           17
        //   183: aload           16
        //   185: aload           15
        //   187: aload           14
        //   189: iload           13
        //   191: invokespecial   gg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider.<init>:(Lgg/essential/gui/screenshot/providers/WindowedProvider;Lkotlin/jvm/functions/Function1;Lgg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor;Lgg/essential/util/lwjgl3/api/NativeImageReader;Lio/netty/buffer/ByteBufAllocator;Z)V
        //   194: areturn        
        //    Signature:
        //  (Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;Lgg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor;Lio/netty/buffer/ByteBufAllocator;Ljava/io/File;Lgg/essential/util/lwjgl3/api/NativeImageReader;Z)Lgg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider;
        //    MethodParameters:
        //  Name               Flags  
        //  -----------------  -----
        //  targetResolution   
        //  pool               
        //  alloc              
        //  essentialDir       
        //  nativeImageReader  
        //  precomputeOnly     
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ FileCachedWindowedImageProvider createFileCachedBicubicProvider$default$3df65092$572ad3ee(final Companion companion, final Pair targetResolution, final PriorityThreadPoolExecutor pool, final ByteBufAllocator alloc, final File essentialDir, final NativeImageReader nativeImageReader) {
        return companion.createFileCachedBicubicProvider((Pair<Integer, Integer>)targetResolution, pool, alloc, essentialDir, nativeImageReader, false);
    }
    
    public Companion(final byte b) {
        this();
    }
}
