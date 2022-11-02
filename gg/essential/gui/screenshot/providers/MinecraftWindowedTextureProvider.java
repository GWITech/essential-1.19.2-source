package gg.essential.gui.screenshot.providers;

import net.minecraft.util.*;
import kotlin.*;
import gg.essential.gui.screenshot.downsampling.*;
import java.nio.file.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import gg.essential.*;
import kotlin.jvm.functions.*;
import gg.essential.universal.*;
import gg.essential.util.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000T
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0010%
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010$
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\b\u0005\u0018\u0000 %2\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003:\u0001%B\u0017\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00050\u0001j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0004J\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J0\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020
                                                   \u0012\u0004\u0012\u00020\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0	2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020
                                                   0!H\u0016J\u001c\u0010"\u001a\u00020\u0002*\u00020\u00162\u0006\u0010#\u001a\u00020
                                                   2\u0006\u0010$\u001a\u00020\u0005H\u0002R7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020
                                                   0	2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020
                                                   0	8V@VX\u0096\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u000e\u0010\u000f"\u0004\b\u0010\u0010\u0011*\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020
                                                   \u0012\u0004\u0012\u00020\u00020\u0013X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020
                                                   \u0012\u0004\u0012\u00020\u00020\u0013X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0018\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00050\u0001j\u0002`\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006&""" }, d2 = { "Lgg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider;", "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "Lnet/minecraft/util/Identifier;", "Lgg/essential/gui/screenshot/providers/WindowedTextureProvider;", "sourceProvider", "Lgg/essential/gui/screenshot/downsampling/PixelBuffer;", "Lgg/essential/gui/screenshot/providers/WindowedImageProvider;", "(Lgg/essential/gui/screenshot/providers/WindowedProvider;)V", "<set-?>", "", "Ljava/nio/file/Path;", "items", "getItems$delegate", "(Lgg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider;)Ljava/lang/Object;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "loaded", "", "loading", "textureManager", "Lgg/essential/gui/screenshot/providers/AsyncTextureManager;", "finalize", "", "invalidateAll", "onRemoval", "location", "provide", "", "windows", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "optional", "", "createResource", "path", "image", "Companion", "essential" })
public final class MinecraftWindowedTextureProvider implements WindowedProvider<Identifier>
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final WindowedProvider<PixelBuffer> sourceProvider;
    @NotNull
    private final Map<Path, Identifier> loaded;
    @NotNull
    private final Map<Path, Identifier> loading;
    @Nullable
    private AsyncTextureManager textureManager;
    private static int nextUniqueId;
    
    public MinecraftWindowedTextureProvider(@NotNull final WindowedProvider<? extends PixelBuffer> sourceProvider) {
        Intrinsics.checkNotNullParameter((Object)sourceProvider, "sourceProvider");
        super();
        this.sourceProvider = (WindowedProvider<PixelBuffer>)sourceProvider;
        this.loaded = new LinkedHashMap<Path, Identifier>();
        this.loading = new LinkedHashMap<Path, Identifier>();
    }
    
    @NotNull
    @Override
    public List<Path> getItems() {
        return this.sourceProvider.getItems();
    }
    
    @Override
    public void setItems(@NotNull final List<? extends Path> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.sourceProvider.setItems(<set-?>);
    }
    
    @NotNull
    @Override
    public Map<Path, Identifier> provide(@NotNull final List<WindowedProvider$Window> windows, @NotNull final Set<? extends Path> optional) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "windows"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* optional */
        //     7: ldc             "optional"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_1         /* windows */
        //    13: invokeinterface java/util/List.isEmpty:()Z
        //    18: ifeq            32
        //    21: aload_0         /* this */
        //    22: getfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.textureManager:Lgg/essential/gui/screenshot/providers/AsyncTextureManager;
        //    25: ifnonnull       32
        //    28: invokestatic    kotlin/collections/MapsKt.emptyMap:()Ljava/util/Map;
        //    31: areturn        
        //    32: aload_0         /* this */
        //    33: getfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.textureManager:Lgg/essential/gui/screenshot/providers/AsyncTextureManager;
        //    36: dup            
        //    37: ifnonnull       62
        //    40: pop            
        //    41: new             Lgg/essential/gui/screenshot/providers/AsyncTextureManager;
        //    44: dup            
        //    45: invokespecial   gg/essential/gui/screenshot/providers/AsyncTextureManager.<init>:()V
        //    48: astore          5
        //    50: aload           5
        //    52: astore          it
        //    54: aload_0         /* this */
        //    55: aload           it
        //    57: putfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.textureManager:Lgg/essential/gui/screenshot/providers/AsyncTextureManager;
        //    60: aload           5
        //    62: astore_3        /* textureManager */
        //    63: new             Ljava/util/LinkedHashMap;
        //    66: dup            
        //    67: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    70: checkcast       Ljava/util/Map;
        //    73: astore          processed
        //    75: aload_1         /* windows */
        //    76: checkcast       Ljava/lang/Iterable;
        //    79: astore          6
        //    81: new             Ljava/util/LinkedHashSet;
        //    84: dup            
        //    85: invokespecial   java/util/LinkedHashSet.<init>:()V
        //    88: checkcast       Ljava/util/Set;
        //    91: checkcast       Ljava/util/Collection;
        //    94: astore          destination$iv
        //    96: aload           $this$flatMapTo$iv
        //    98: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   103: astore          9
        //   105: aload           9
        //   107: invokeinterface java/util/Iterator.hasNext:()Z
        //   112: ifeq            183
        //   115: aload           9
        //   117: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   122: astore          element$iv
        //   124: aload           element$iv
        //   126: checkcast       Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //   129: astore          window
        //   131: aload           window
        //   133: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getRange:()Lkotlin/ranges/IntRange;
        //   136: checkcast       Ljava/lang/Iterable;
        //   139: invokestatic    kotlin/collections/CollectionsKt.asSequence:(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
        //   142: new             Lgg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider$provide$requestedPaths$1$1;
        //   145: dup            
        //   146: aload_0         /* this */
        //   147: invokespecial   gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider$provide$requestedPaths$1$1.<init>:(Lgg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider;)V
        //   150: checkcast       Lkotlin/jvm/functions/Function1;
        //   153: invokestatic    kotlin/sequences/SequencesKt.map:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
        //   156: new             Lgg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider$provide$requestedPaths$1$2;
        //   159: dup            
        //   160: aload_2         /* optional */
        //   161: invokespecial   gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider$provide$requestedPaths$1$2.<init>:(Ljava/util/Set;)V
        //   164: checkcast       Lkotlin/jvm/functions/Function1;
        //   167: invokestatic    kotlin/sequences/SequencesKt.filterNot:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
        //   170: astore          list$iv
        //   172: aload           destination$iv
        //   174: aload           list$iv
        //   176: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Lkotlin/sequences/Sequence;)Z
        //   179: pop            
        //   180: goto            105
        //   183: aload           destination$iv
        //   185: checkcast       Ljava/util/Set;
        //   188: astore          requestedPaths
        //   190: aload           requestedPaths
        //   192: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   197: astore          6
        //   199: aload           6
        //   201: invokeinterface java/util/Iterator.hasNext:()Z
        //   206: ifeq            264
        //   209: aload           6
        //   211: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   216: checkcast       Ljava/nio/file/Path;
        //   219: astore          path
        //   221: aload           processed
        //   223: astore          8
        //   225: aload_0         /* this */
        //   226: getfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.loaded:Ljava/util/Map;
        //   229: aload           path
        //   231: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   236: checkcast       Lnet/minecraft/util/Identifier;
        //   239: dup            
        //   240: ifnonnull       247
        //   243: pop            
        //   244: goto            199
        //   247: astore          9
        //   249: aload           8
        //   251: aload           path
        //   253: aload           9
        //   255: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   260: pop            
        //   261: goto            199
        //   264: aload_0         /* this */
        //   265: getfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.sourceProvider:Lgg/essential/gui/screenshot/providers/WindowedProvider;
        //   268: aload_1         /* windows */
        //   269: aload_2         /* optional */
        //   270: aload_0         /* this */
        //   271: getfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.loaded:Ljava/util/Map;
        //   274: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   279: checkcast       Ljava/lang/Iterable;
        //   282: invokestatic    kotlin/collections/SetsKt.plus:(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
        //   285: aload_0         /* this */
        //   286: getfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.loading:Ljava/util/Map;
        //   289: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   294: checkcast       Ljava/lang/Iterable;
        //   297: invokestatic    kotlin/collections/SetsKt.plus:(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
        //   300: invokeinterface gg/essential/gui/screenshot/providers/WindowedProvider.provide:(Ljava/util/List;Ljava/util/Set;)Ljava/util/Map;
        //   305: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   310: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   315: astore          6
        //   317: aload           6
        //   319: invokeinterface java/util/Iterator.hasNext:()Z
        //   324: ifeq            427
        //   327: aload           6
        //   329: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   334: checkcast       Ljava/util/Map$Entry;
        //   337: astore          entry
        //   339: aload           entry
        //   341: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   346: checkcast       Ljava/nio/file/Path;
        //   349: astore          path
        //   351: aload_0         /* this */
        //   352: getfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.loaded:Ljava/util/Map;
        //   355: aload           path
        //   357: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   362: ifne            408
        //   365: aload_0         /* this */
        //   366: getfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.loading:Ljava/util/Map;
        //   369: aload           path
        //   371: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   376: ifne            408
        //   379: aload_2         /* optional */
        //   380: aload           path
        //   382: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   387: ifne            408
        //   390: aload_0         /* this */
        //   391: aload_3         /* textureManager */
        //   392: aload           path
        //   394: aload           entry
        //   396: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   401: checkcast       Lgg/essential/gui/screenshot/downsampling/PixelBuffer;
        //   404: invokespecial   gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.createResource:(Lgg/essential/gui/screenshot/providers/AsyncTextureManager;Ljava/nio/file/Path;Lgg/essential/gui/screenshot/downsampling/PixelBuffer;)Lnet/minecraft/util/Identifier;
        //   407: pop            
        //   408: aload           entry
        //   410: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   415: checkcast       Lgg/essential/gui/screenshot/downsampling/PixelBuffer;
        //   418: invokeinterface gg/essential/gui/screenshot/downsampling/PixelBuffer.release:()Z
        //   423: pop            
        //   424: goto            317
        //   427: aload_3         /* textureManager */
        //   428: invokevirtual   gg/essential/gui/screenshot/providers/AsyncTextureManager.getFinished:()Ljava/util/Set;
        //   431: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   436: astore          6
        //   438: aload           6
        //   440: invokeinterface java/util/Iterator.hasNext:()Z
        //   445: ifeq            521
        //   448: aload           6
        //   450: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   455: checkcast       Ljava/nio/file/Path;
        //   458: astore          path
        //   460: aload_0         /* this */
        //   461: getfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.loading:Ljava/util/Map;
        //   464: aload           path
        //   466: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   471: dup            
        //   472: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //   475: checkcast       Lnet/minecraft/util/Identifier;
        //   478: astore          resourceLocation
        //   480: aload_0         /* this */
        //   481: getfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.loaded:Ljava/util/Map;
        //   484: aload           path
        //   486: aload           resourceLocation
        //   488: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   493: pop            
        //   494: aload           requestedPaths
        //   496: aload           path
        //   498: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   503: ifeq            438
        //   506: aload           processed
        //   508: aload           path
        //   510: aload           resourceLocation
        //   512: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   517: pop            
        //   518: goto            438
        //   521: aload_0         /* this */
        //   522: getfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.loaded:Ljava/util/Map;
        //   525: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   530: aload           processed
        //   532: aload_0         /* this */
        //   533: invokedynamic   BootstrapMethod #0, test:(Ljava/util/Map;Lgg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider;)Ljava/util/function/Predicate;
        //   538: invokeinterface java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
        //   543: pop            
        //   544: aload_1         /* windows */
        //   545: invokeinterface java/util/List.isEmpty:()Z
        //   550: ifeq            562
        //   553: aload_3         /* textureManager */
        //   554: invokevirtual   gg/essential/gui/screenshot/providers/AsyncTextureManager.cleanup:()V
        //   557: aload_0         /* this */
        //   558: aconst_null    
        //   559: putfield        gg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider.textureManager:Lgg/essential/gui/screenshot/providers/AsyncTextureManager;
        //   562: aload           processed
        //   564: areturn        
        //    Signature:
        //  (Ljava/util/List<Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;>;Ljava/util/Set<+Ljava/nio/file/Path;>;)Ljava/util/Map<Ljava/nio/file/Path;Lnet/minecraft/util/Identifier;>;
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  windows   
        //  optional  
        //    StackMapTable: 00 0D 20 5D 07 00 7A FF 00 2A 00 0A 07 00 02 07 00 6C 07 00 82 07 00 7A 07 00 59 00 07 00 7D 07 00 84 00 07 00 8A 00 00 FB 00 4D FF 00 0F 00 0A 07 00 02 07 00 6C 07 00 82 07 00 7A 07 00 59 07 00 82 07 00 8A 07 00 05 00 07 00 05 00 00 FF 00 2F 00 0A 07 00 02 07 00 6C 07 00 82 07 00 7A 07 00 59 07 00 82 07 00 8A 07 00 B5 07 00 59 07 00 05 00 01 07 00 BB FF 00 10 00 0A 07 00 02 07 00 6C 07 00 82 07 00 7A 07 00 59 07 00 82 07 00 8A 07 00 05 00 07 00 05 00 00 34 FF 00 5A 00 0A 07 00 02 07 00 6C 07 00 82 07 00 7A 07 00 59 07 00 82 07 00 8A 07 00 D0 07 00 B5 07 00 05 00 00 FF 00 12 00 0A 07 00 02 07 00 6C 07 00 82 07 00 7A 07 00 59 07 00 82 07 00 8A 07 00 05 00 07 00 05 00 00 0A FB 00 52 28
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    protected final void finalize() {
        final AsyncTextureManager textureManager = this.textureManager;
        if (textureManager != null) {
            textureManager.cleanup();
        }
        this.textureManager = null;
        if (!this.loaded.isEmpty()) {
            Essential.logger.warn("Entries in provider cleaned up during finalize instead of prior. Did you forget to call `provide(emptyList())`?");
            this.invalidateAll();
        }
    }
    
    public final void invalidateAll() {
        this.loaded.entrySet().removeIf(MinecraftWindowedTextureProvider::invalidateAll$lambda-3);
    }
    
    private final Identifier createResource(final AsyncTextureManager $this$createResource, final Path path, final PixelBuffer image) {
        final Identifier nextResourceLocation = MinecraftWindowedTextureProvider.Companion.nextResourceLocation();
        this.loading.put(path, nextResourceLocation);
        image.retain();
        $this$createResource.upload(path, (Function0)new MinecraftWindowedTextureProvider$createResource.MinecraftWindowedTextureProvider$createResource$1(image, nextResourceLocation));
        return nextResourceLocation;
    }
    
    private final void onRemoval(final Identifier location) {
        ExtensionsKt.getExecutor(UMinecraft.getMinecraft()).execute(MinecraftWindowedTextureProvider::onRemoval$lambda-4);
    }
    
    private static final boolean provide$lambda-2(final Map $processed, final MinecraftWindowedTextureProvider this$0, final Map.Entry it) {
        Intrinsics.checkNotNullParameter((Object)$processed, "$processed");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (!$processed.containsKey(it.getKey())) {
            this$0.onRemoval((Identifier)it.getValue());
            return true;
        }
        return false;
    }
    
    private static final boolean invalidateAll$lambda-3(final MinecraftWindowedTextureProvider this$0, final Map.Entry it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        this$0.onRemoval(it.getValue());
        return true;
    }
    
    private static final void onRemoval$lambda-4(final Identifier $location) {
        Intrinsics.checkNotNullParameter((Object)$location, "$location");
        MinecraftClient.getInstance().getTextureManager().destroyTexture($location);
    }
    
    public static final /* synthetic */ int access$getNextUniqueId$cp() {
        return MinecraftWindowedTextureProvider.nextUniqueId;
    }
    
    public static final /* synthetic */ void access$setNextUniqueId$cp(final int <set-?>) {
        MinecraftWindowedTextureProvider.nextUniqueId = <set-?>;
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0018
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                       \u0000¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/screenshot/providers/MinecraftWindowedTextureProvider$Companion;", "", "()V", "nextUniqueId", "", "nextResourceLocation", "Lnet/minecraft/util/Identifier;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        private final synchronized Identifier nextResourceLocation() {
            final String s = "essential";
            final int access$getNextUniqueId$cp = MinecraftWindowedTextureProvider.access$getNextUniqueId$cp();
            MinecraftWindowedTextureProvider.access$setNextUniqueId$cp(access$getNextUniqueId$cp + 1);
            return new Identifier(s, "screenshots/" + access$getNextUniqueId$cp);
        }
        
        public static final /* synthetic */ Identifier access$nextResourceLocation(final Companion $this) {
            return $this.nextResourceLocation();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
