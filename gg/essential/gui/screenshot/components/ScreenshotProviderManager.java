package gg.essential.gui.screenshot.components;

import gg.essential.util.lwjgl3.api.*;
import gg.essential.gui.screenshot.concurrent.*;
import gg.essential.gui.screenshot.bytebuf.*;
import java.nio.file.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import net.minecraft.util.*;
import io.netty.buffer.*;
import kotlin.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import gg.essential.gui.screenshot.downsampling.*;
import kotlin.jvm.functions.*;
import gg.essential.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.components.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;
import java.io.*;
import gg.essential.gui.screenshot.providers.*;
import gg.essential.gui.screenshot.handler.*;
import java.util.*;
import kotlin.collections.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000¸\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0011
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0010"
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\b\b\u0018\u0000 R2\u00020\u0001:\u0001RB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010<\u001a\u00020=J\u001c\u0010>\u001a\u00020\u00182\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c08H\u0002J&\u0010@\u001a\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u00162\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c08H\u0002J&\u0010A\u001a\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u00162\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c08H\u0002J\u0014\u0010C\u001a\u00020=2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020	0EJ\u001e\u0010F\u001a\u00020=2\u0006\u0010G\u001a\u00020&2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020=0IJ\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020\u00150KJ\u001a\u0010L\u001a\u000e\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020\u00150K2\u0006\u0010:\u001a\u00020/J \u0010L\u001a\u000e\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020\u00150K2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020/0\bJ\u000e\u0010N\u001a\u00020=2\u0006\u0010G\u001a\u00020&J\u0006\u0010O\u001a\u00020=J\u0010\u0010P\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001cH\u0002J(\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c082\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c08H\u0002J \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020\u00150K2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020	0\bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020	0\bX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000b"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020	0\bX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0011\u0010\u000b"\u0004\b\u0012\u0010\rR\u0018\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u0016X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0016\u0010\u001d\u001a
                                                    \u001f*\u0004\u0018\u00010\u001e0\u001eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010"\u001a\u00020#X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020&0%¢\u0006\b
                                                   \u0000\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150*X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010+\u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00150\u00140,X\u0082\u0004¢\u0006\u0004
                                                   \u0002\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b0\u00101"\u0004\b2\u00103R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\u001505X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0807X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0807X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006S""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotProviderManager;", "", "browser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "scroller", "Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;", "(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;)V", "allPaths", "", "Ljava/nio/file/Path;", "getAllPaths", "()Ljava/util/List;", "setAllPaths", "(Ljava/util/List;)V", "allocator", "Lgg/essential/gui/screenshot/bytebuf/WorkStealingAllocator;", "currentPaths", "getCurrentPaths", "setCurrentPaths", "focusImageResolution", "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "Lnet/minecraft/util/Identifier;", "Lgg/essential/gui/screenshot/providers/WindowedTextureProvider;", "minResolutionBicubicProvider", "Lgg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider;", "minResolutionMinecraftWindowedTextureProvider", "Lgg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider;", "nThread", "", "nativeImageReader", "Lgg/essential/util/lwjgl3/api/NativeImageReader;", "kotlin.jvm.PlatformType", "nonBlockingAllocator", "Lgg/essential/gui/screenshot/bytebuf/LimitedAllocator;", "pool", "Lgg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor;", "propertyMap", "", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "getPropertyMap", "()Ljava/util/Map;", "provider", "Lgg/essential/gui/screenshot/providers/PriorityDelegatedWindowProvider;", "providerArray", "", "[Lgg/essential/gui/screenshot/providers/WindowedProvider;", "renderedLastFrame", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "getRenderedLastFrame", "()Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "setRenderedLastFrame", "(Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;)V", "scopePreservedMinResolutionProvider", "Lgg/essential/gui/screenshot/providers/ScopePreservingWindowedProvider;", "targetFocusImageSize", "Lgg/essential/elementa/state/State;", "Lkotlin/Pair;", "targetPreviewImageSize", "window", "Lgg/essential/elementa/components/Window;", "cleanup", "", "createFileCachedBicubicProvider", "targetResolution", "createFocusImageProvider", "createWindowedTextureProvider", "resolution", "externalDelete", "paths", "", "handleDelete", "properties", "delete", "Lkotlin/Function0;", "provide", "", "provideFocus", "windows", "registerImage", "reloadItems", "roundResolutionToCommonValues", "updateItems", "Companion", "essential" })
public final class ScreenshotProviderManager
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final ScreenshotBrowser browser;
    @NotNull
    private final ScreenshotScrollComponent scroller;
    private final NativeImageReader nativeImageReader;
    @NotNull
    private final Window window;
    private final int nThread;
    @NotNull
    private final PriorityThreadPoolExecutor pool;
    @NotNull
    private final LimitedAllocator nonBlockingAllocator;
    @NotNull
    private final WorkStealingAllocator allocator;
    @NotNull
    private final Map<Path, ScreenshotProperties> propertyMap;
    @Nullable
    private WindowedProvider$Window renderedLastFrame;
    @NotNull
    private final State<Pair<Integer, Integer>> targetPreviewImageSize;
    @NotNull
    private final State<Pair<Integer, Integer>> targetFocusImageSize;
    @NotNull
    private final FileCachedWindowedImageProvider minResolutionBicubicProvider;
    @NotNull
    private WindowedProvider<? extends Identifier> focusImageResolution;
    @NotNull
    private final MinecraftWindowedTextureProvider minResolutionMinecraftWindowedTextureProvider;
    @NotNull
    private final ScopePreservingWindowedProvider<Identifier> scopePreservedMinResolutionProvider;
    @NotNull
    private final WindowedProvider<Identifier>[] providerArray;
    @NotNull
    private final PriorityDelegatedWindowProvider<Identifier> provider;
    @NotNull
    private List<? extends Path> currentPaths;
    @NotNull
    private List<? extends Path> allPaths;
    @JvmField
    @NotNull
    public static final Pair<Integer, Integer> minResolutionTargetResolution;
    private static final long MAX_MEMORY;
    
    public ScreenshotProviderManager(@NotNull final ScreenshotBrowser browser, @NotNull final ScreenshotScrollComponent scroller) {
        Intrinsics.checkNotNullParameter((Object)browser, "browser");
        Intrinsics.checkNotNullParameter((Object)scroller, "scroller");
        super();
        this.browser = browser;
        this.scroller = scroller;
        this.nativeImageReader = this.browser.getScreenshotManager().getNativeImageReader();
        this.window = this.browser.getWindow();
        this.nThread = Runtime.getRuntime().availableProcessors() * 4;
        this.pool = new PriorityThreadPoolExecutor(this.nThread);
        final PooledByteBufAllocator default1 = PooledByteBufAllocator.DEFAULT;
        Intrinsics.checkNotNullExpressionValue((Object)default1, "DEFAULT");
        this.nonBlockingAllocator = new LimitedAllocator((ByteBufAllocator)default1, ScreenshotProviderManager.MAX_MEMORY);
        this.allocator = new WorkStealingAllocator(this.nonBlockingAllocator, (Function0<Unit>)new ScreenshotProviderManager$allocator.ScreenshotProviderManager$allocator$1(this));
        this.propertyMap = new LinkedHashMap<Path, ScreenshotProperties>();
        this.targetPreviewImageSize = ExtensionsKt.pollingState(this.window, ScreenshotProviderManager.minResolutionTargetResolution, (kotlin.jvm.functions.Function0<? extends Pair<Integer, Integer>>)new ScreenshotProviderManager$targetPreviewImageSize.ScreenshotProviderManager$targetPreviewImageSize$1(this));
        this.targetFocusImageSize = ExtensionsKt.pollingState(this.window, ScreenshotProviderManager.minResolutionTargetResolution, (kotlin.jvm.functions.Function0<? extends Pair<Integer, Integer>>)new ScreenshotProviderManager$targetFocusImageSize.ScreenshotProviderManager$targetFocusImageSize$1(this));
        this.minResolutionBicubicProvider = this.createFileCachedBicubicProvider(ScreenshotProviderManager.minResolutionTargetResolution);
        this.focusImageResolution = this.createFocusImageProvider(ScreenshotProviderManager.minResolutionTargetResolution);
        this.minResolutionMinecraftWindowedTextureProvider = new MinecraftWindowedTextureProvider(new ThreadedWindowedProvider<PixelBuffer>(this.minResolutionBicubicProvider, this.pool, 1));
        this.scopePreservedMinResolutionProvider = new ScopePreservingWindowedProvider<Identifier>(new MaxScopeExpansionWindowProvider<Identifier>(this.minResolutionMinecraftWindowedTextureProvider));
        this.providerArray = new WindowedProvider[] { this.createWindowedTextureProvider((Pair<Integer, Integer>)new Pair((Object)200, (Object)200)), this.scopePreservedMinResolutionProvider };
        this.provider = new PriorityDelegatedWindowProvider<Identifier>(this.providerArray);
        this.currentPaths = CollectionsKt.emptyList();
        this.allPaths = CollectionsKt.emptyList();
        this.reloadItems();
        this.updateItems(this.allPaths);
        this.provider.setItems(this.currentPaths);
        this.focusImageResolution.setItems(this.currentPaths);
        this.targetFocusImageSize.onSetValue((kotlin.jvm.functions.Function1<? super Pair<Integer, Integer>, Unit>)new Function1<Pair<? extends Integer, ? extends Integer>, Unit>() {
            final /* synthetic */ ScreenshotProviderManager this$0;
            
            ScreenshotProviderManager$1() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(@NotNull final Pair<Integer, Integer> it) {
                Intrinsics.checkNotNullParameter((Object)it, "it");
                ScreenshotProviderManager.access$setFocusImageResolution$p(this.this$0, new TransitionWindowedProvider(ScreenshotProviderManager.this.createFocusImageProvider(it), ScreenshotProviderManager.access$getFocusImageResolution$p(this.this$0)));
                ScreenshotProviderManager.access$getFocusImageResolution$p(this.this$0).setItems(this.this$0.getCurrentPaths());
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((Pair<Integer, Integer>)p1);
                return Unit.INSTANCE;
            }
        });
        this.targetPreviewImageSize.onSetValue((kotlin.jvm.functions.Function1<? super Pair<Integer, Integer>, Unit>)new Function1<Pair<? extends Integer, ? extends Integer>, Unit>() {
            final /* synthetic */ ScreenshotProviderManager this$0;
            
            ScreenshotProviderManager$2() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(@NotNull final Pair<Integer, Integer> it) {
                Intrinsics.checkNotNullParameter((Object)it, "it");
                final WindowedProvider newTargetProvider = ScreenshotProviderManager.this.createWindowedTextureProvider(it);
                final WindowedProvider currentTargetProvider = ScreenshotProviderManager.access$getProviderArray$p(this.this$0)[0];
                Essential.logger.debug("Updating provider to target resolution " + it);
                final TransitionWindowedProvider transitionWindowedProvider = new TransitionWindowedProvider(newTargetProvider, currentTargetProvider);
                transitionWindowedProvider.setItems(this.this$0.getCurrentPaths());
                ScreenshotProviderManager.access$getProviderArray$p(this.this$0)[0] = transitionWindowedProvider;
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((Pair<Integer, Integer>)p1);
                return Unit.INSTANCE;
            }
        });
        if (OptionsKt.getElementaDev() || Intrinsics.areEqual((Object)System.getProperty("essential.debugScreenshots", "false"), (Object)"true")) {
            final Window window = this.browser.getWindow();
            final State text = ExtensionsKt.pollingState$default$a9b5a09$5bde5825(window, (Function0)new ScreenshotProviderManager$text.ScreenshotProviderManager$text$1(this));
            final UIComponent $this$constrain_u24lambda_u2d0$iv;
            final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIText(null, false, null, 7, null).bindText(text);
            final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$_init__u24lambda_u2d0.setX(UtilitiesKt.pixels$default(5, true, false, 2, null));
            $this$_init__u24lambda_u2d0.setY(UtilitiesKt.getPixels(5));
            ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, window);
        }
    }
    
    @NotNull
    public final Map<Path, ScreenshotProperties> getPropertyMap() {
        return this.propertyMap;
    }
    
    @Nullable
    public final WindowedProvider$Window getRenderedLastFrame() {
        return this.renderedLastFrame;
    }
    
    public final void setRenderedLastFrame(@Nullable final WindowedProvider$Window <set-?>) {
        this.renderedLastFrame = <set-?>;
    }
    
    @NotNull
    public final List<Path> getCurrentPaths() {
        return (List<Path>)this.currentPaths;
    }
    
    @NotNull
    public final List<Path> getAllPaths() {
        return (List<Path>)this.allPaths;
    }
    
    private final Pair<Integer, Integer> roundResolutionToCommonValues(final Pair<Integer, Integer> targetResolution) {
        final int width = ((Number)targetResolution.component1()).intValue();
        final int height = ((Number)targetResolution.component2()).intValue();
        return (Pair<Integer, Integer>)new Pair((Object)this.roundResolutionToCommonValues(width), (Object)this.roundResolutionToCommonValues(height));
    }
    
    private final int roundResolutionToCommonValues(final int targetResolution) {
        float outputLTInput = 200.0f;
        float outputGTInput;
        for (outputGTInput = 260.0f; outputGTInput < targetResolution; outputGTInput *= 1.3f) {
            outputLTInput = outputGTInput;
        }
        final float deltaLt = targetResolution - outputLTInput;
        final float deltaGt = outputGTInput - targetResolution;
        return (deltaLt < deltaGt) ? ((int)outputLTInput) : ((int)outputGTInput);
    }
    
    private final FileCachedWindowedImageProvider createFileCachedBicubicProvider(final Pair<Integer, Integer> targetResolution) {
        final Companion companion = ScreenshotProviderManager.Companion;
        final PriorityThreadPoolExecutor pool = this.pool;
        final ByteBufAllocator byteBufAllocator = (ByteBufAllocator)this.allocator;
        final File baseDir = Essential.getInstance().getBaseDir();
        Intrinsics.checkNotNullExpressionValue((Object)baseDir, "getInstance().baseDir");
        final NativeImageReader nativeImageReader = this.nativeImageReader;
        Intrinsics.checkNotNullExpressionValue((Object)nativeImageReader, "nativeImageReader");
        return ScreenshotProviderManager.Companion.createFileCachedBicubicProvider$default$3df65092$572ad3ee(companion, targetResolution, pool, byteBufAllocator, baseDir, nativeImageReader);
    }
    
    private final WindowedProvider<Identifier> createFocusImageProvider(final Pair<Integer, Integer> targetResolution) {
        return new MinecraftWindowedTextureProvider(new ThreadedWindowedProvider<PixelBuffer>(this.createFileCachedBicubicProvider(targetResolution), this.pool, 10));
    }
    
    private final WindowedProvider<Identifier> createWindowedTextureProvider(final Pair<Integer, Integer> resolution) {
        return new ScopeExpansionWindowProvider<Identifier>(new MinecraftWindowedTextureProvider(new ThreadedWindowedProvider<PixelBuffer>(this.createFileCachedBicubicProvider(this.roundResolutionToCommonValues(resolution)), this.pool, 0)));
    }
    
    public final void reloadItems() {
        final List<Path> orderedPaths = Essential.getInstance().getConnectionManager().getScreenshotManager().getOrderedPaths();
        Intrinsics.checkNotNullExpressionValue((Object)orderedPaths, "getInstance().connection\u2026nshotManager.orderedPaths");
        this.allPaths = orderedPaths;
        for (final Path path : this.allPaths) {
            final Map<Path, ScreenshotProperties> propertyMap = this.propertyMap;
            final Path path2 = path;
            final ScreenshotMetadataManager screenshotMetadataManager = this.browser.getScreenshotManager().getScreenshotMetadataManager();
            final File file = path.toFile();
            Intrinsics.checkNotNullExpressionValue((Object)file, "path.toFile()");
            propertyMap.put(path, new ScreenshotProperties(path2, screenshotMetadataManager.getMetadata(file)));
        }
    }
    
    @NotNull
    public final Map<Path, Identifier> updateItems(@NotNull final List<? extends Path> paths) {
        Intrinsics.checkNotNullParameter((Object)paths, "paths");
        this.provider.setItems(paths);
        this.focusImageResolution.setItems(paths);
        this.currentPaths = paths;
        return this.provide();
    }
    
    public final void cleanup() {
        this.provider.provide(CollectionsKt.emptyList(), SetsKt.emptySet());
        this.focusImageResolution.provide(CollectionsKt.emptyList(), SetsKt.emptySet());
        this.pool.shutdown();
    }
    
    @NotNull
    public final Map<Path, Identifier> provide() {
        final WindowedProvider$Window renderedLastFrame = this.renderedLastFrame;
        final List windows = CollectionsKt.listOfNotNull((Object)((renderedLastFrame != null) ? renderedLastFrame.inRange(CollectionsKt.getIndices((Collection)this.provider.getItems())) : null));
        if (windows.isEmpty()) {
            return MapsKt.emptyMap();
        }
        return this.provider.provide(windows, SetsKt.emptySet());
    }
    
    @NotNull
    public final Map<Path, Identifier> provideFocus(@NotNull final List<WindowedProvider$Window> windows) {
        Intrinsics.checkNotNullParameter((Object)windows, "windows");
        return (Map<Path, Identifier>)this.focusImageResolution.provide(windows, SetsKt.emptySet());
    }
    
    public final void handleDelete(@NotNull final ScreenshotProperties properties, @NotNull final Function0<Unit> delete) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "properties"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_2         /* delete */
        //     8: ldc_w           "delete"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: getstatic       gg/essential/util/GuiUtil.INSTANCE:Lgg/essential/util/GuiUtil;
        //    17: new             Lgg/essential/gui/common/modal/DangerConfirmationEssentialModal;
        //    20: dup            
        //    21: ldc_w           "Delete"
        //    24: invokespecial   gg/essential/gui/common/modal/DangerConfirmationEssentialModal.<init>:(Ljava/lang/String;)V
        //    27: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //    30: astore_3        /* $this$configure$iv */
        //    31: aload_3         /* $this$configure$iv */
        //    32: astore          4
        //    34: aload           4
        //    36: astore          $this$configure_u24lambda_u2d0$iv
        //    38: aload           $this$configure_u24lambda_u2d0$iv
        //    40: checkcast       Lgg/essential/gui/common/modal/DangerConfirmationEssentialModal;
        //    43: astore          6
        //    45: astore          7
        //    47: aload           $this$handleDelete_u24lambda_u2d1
        //    49: aload_1         /* properties */
        //    50: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotProperties.getPath:()Ljava/nio/file/Path;
        //    53: invokeinterface java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
        //    58: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
        //    63: invokevirtual   gg/essential/gui/common/modal/DangerConfirmationEssentialModal.setContentText:(Ljava/lang/String;)V
        //    66: aload           7
        //    68: aload           4
        //    70: checkcast       Lgg/essential/gui/common/modal/DangerConfirmationEssentialModal;
        //    73: new             Lgg/essential/gui/screenshot/components/ScreenshotProviderManager$handleDelete$3;
        //    76: dup            
        //    77: aload_0         /* this */
        //    78: aload_1         /* properties */
        //    79: aload_2         /* delete */
        //    80: invokespecial   gg/essential/gui/screenshot/components/ScreenshotProviderManager$handleDelete$3.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotProviderManager;Lgg/essential/gui/screenshot/components/ScreenshotProperties;Lkotlin/jvm/functions/Function0;)V
        //    83: checkcast       Lkotlin/jvm/functions/Function0;
        //    86: invokevirtual   gg/essential/gui/common/modal/DangerConfirmationEssentialModal.onPrimaryAction:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    89: checkcast       Lgg/essential/gui/common/modal/Modal;
        //    92: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //    95: pop            
        //    96: return         
        //    Signature:
        //  (Lgg/essential/gui/screenshot/components/ScreenshotProperties;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V
        //    MethodParameters:
        //  Name        Flags  
        //  ----------  -----
        //  properties  
        //  delete      
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void externalDelete(@NotNull final Set<? extends Path> paths) {
        Intrinsics.checkNotNullParameter((Object)paths, "paths");
        for (final Path path : paths) {
            this.scopePreservedMinResolutionProvider.handleDelete(path);
        }
        this.reloadItems();
    }
    
    public static final /* synthetic */ ScopePreservingWindowedProvider access$getScopePreservedMinResolutionProvider$p(final ScreenshotProviderManager $this) {
        return $this.scopePreservedMinResolutionProvider;
    }
    
    public static final /* synthetic */ ScreenshotBrowser access$getBrowser$p(final ScreenshotProviderManager $this) {
        return $this.browser;
    }
    
    public static final /* synthetic */ PriorityThreadPoolExecutor access$getPool$p(final ScreenshotProviderManager $this) {
        return $this.pool;
    }
    
    public static final /* synthetic */ ScreenshotScrollComponent access$getScroller$p(final ScreenshotProviderManager $this) {
        return $this.scroller;
    }
    
    public static final /* synthetic */ Pair access$roundResolutionToCommonValues(final ScreenshotProviderManager $this, final Pair targetResolution) {
        return $this.roundResolutionToCommonValues((Pair<Integer, Integer>)targetResolution);
    }
    
    public static final /* synthetic */ Window access$getWindow$p(final ScreenshotProviderManager $this) {
        return $this.window;
    }
    
    public static final /* synthetic */ void access$setFocusImageResolution$p(final ScreenshotProviderManager $this, final WindowedProvider <set-?>) {
        $this.focusImageResolution = <set-?>;
    }
    
    public static final /* synthetic */ WindowedProvider access$createFocusImageProvider(final ScreenshotProviderManager $this, final Pair targetResolution) {
        return $this.createFocusImageProvider((Pair<Integer, Integer>)targetResolution);
    }
    
    public static final /* synthetic */ WindowedProvider access$getFocusImageResolution$p(final ScreenshotProviderManager $this) {
        return $this.focusImageResolution;
    }
    
    public static final /* synthetic */ WindowedProvider access$createWindowedTextureProvider(final ScreenshotProviderManager $this, final Pair resolution) {
        return $this.createWindowedTextureProvider((Pair<Integer, Integer>)resolution);
    }
    
    public static final /* synthetic */ WindowedProvider[] access$getProviderArray$p(final ScreenshotProviderManager $this) {
        return $this.providerArray;
    }
    
    public static final /* synthetic */ LimitedAllocator access$getNonBlockingAllocator$p(final ScreenshotProviderManager $this) {
        return $this.nonBlockingAllocator;
    }
    
    static {
        Companion = new Companion((byte)0);
        minResolutionTargetResolution = new Pair((Object)40, (Object)40);
        final String property = System.getProperty("essential.screenshots.max_mem_mb");
        MAX_MEMORY = ((property != null) ? Long.parseLong(property) : 100L) * 1000000L;
    }
    
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
}
