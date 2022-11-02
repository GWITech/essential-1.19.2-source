package gg.essential.gui.screenshot.providers;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.nio.file.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010"
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u000e\u0010\u0004\u001a
                                                   \u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002¢\u0006\u0002\u0010\u0005J0\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016R\u0016\u0010\u0004\u001a
                                                   \u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002
                                                   \u0000R0\u0010	\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b
                                                   \u0010\u000b"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a
                                                   \u0012\u0004\u0012\u00020\b\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/screenshot/providers/TransitionWindowedProvider;", "T", "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "primaryProvider", "fallbackProvider", "(Lgg/essential/gui/screenshot/providers/WindowedProvider;Lgg/essential/gui/screenshot/providers/WindowedProvider;)V", "value", "", "Ljava/nio/file/Path;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "knownFallbackItems", "", "provide", "", "windows", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "optional", "essential" })
public final class TransitionWindowedProvider<T> implements WindowedProvider<T>
{
    @NotNull
    private final WindowedProvider<T> primaryProvider;
    @Nullable
    private WindowedProvider<? extends T> fallbackProvider;
    @Nullable
    private Set<? extends Path> knownFallbackItems;
    
    public TransitionWindowedProvider(@NotNull final WindowedProvider<? extends T> primaryProvider, @Nullable final WindowedProvider<? extends T> fallbackProvider) {
        Intrinsics.checkNotNullParameter((Object)primaryProvider, "primaryProvider");
        super();
        this.primaryProvider = (WindowedProvider<T>)primaryProvider;
        this.fallbackProvider = fallbackProvider;
    }
    
    @NotNull
    @Override
    public List<Path> getItems() {
        return this.primaryProvider.getItems();
    }
    
    @Override
    public void setItems(@NotNull final List<? extends Path> value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.primaryProvider.setItems(value);
        final WindowedProvider<? extends T> fallbackProvider = this.fallbackProvider;
        if (fallbackProvider != null) {
            fallbackProvider.setItems(value);
        }
    }
    
    @NotNull
    @Override
    public Map<Path, T> provide(@NotNull final List<WindowedProvider$Window> windows, @NotNull final Set<? extends Path> optional) {
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
        //    12: aload_0         /* this */
        //    13: getfield        gg/essential/gui/screenshot/providers/TransitionWindowedProvider.fallbackProvider:Lgg/essential/gui/screenshot/providers/WindowedProvider;
        //    16: dup            
        //    17: ifnonnull       33
        //    20: pop            
        //    21: aload_0         /* this */
        //    22: getfield        gg/essential/gui/screenshot/providers/TransitionWindowedProvider.primaryProvider:Lgg/essential/gui/screenshot/providers/WindowedProvider;
        //    25: aload_1         /* windows */
        //    26: aload_2         /* optional */
        //    27: invokeinterface gg/essential/gui/screenshot/providers/WindowedProvider.provide:(Ljava/util/List;Ljava/util/Set;)Ljava/util/Map;
        //    32: areturn        
        //    33: astore_3        /* fallbackProvider */
        //    34: aload_0         /* this */
        //    35: getfield        gg/essential/gui/screenshot/providers/TransitionWindowedProvider.primaryProvider:Lgg/essential/gui/screenshot/providers/WindowedProvider;
        //    38: aload_1         /* windows */
        //    39: aload_2         /* optional */
        //    40: invokeinterface gg/essential/gui/screenshot/providers/WindowedProvider.provide:(Ljava/util/List;Ljava/util/Set;)Ljava/util/Map;
        //    45: astore          primaryItems
        //    47: aload_1         /* windows */
        //    48: checkcast       Ljava/lang/Iterable;
        //    51: astore          $this$flatMap$iv
        //    53: aload           $this$flatMap$iv
        //    55: astore          8
        //    57: new             Ljava/util/ArrayList;
        //    60: dup            
        //    61: invokespecial   java/util/ArrayList.<init>:()V
        //    64: checkcast       Ljava/util/Collection;
        //    67: astore          destination$iv$iv
        //    69: aload           $this$flatMapTo$iv$iv
        //    71: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    76: astore          11
        //    78: aload           11
        //    80: invokeinterface java/util/Iterator.hasNext:()Z
        //    85: ifeq            132
        //    88: aload           11
        //    90: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    95: astore          element$iv$iv
        //    97: aload           element$iv$iv
        //    99: checkcast       Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //   102: astore          it
        //   104: aload_0         /* this */
        //   105: invokevirtual   gg/essential/gui/screenshot/providers/TransitionWindowedProvider.getItems:()Ljava/util/List;
        //   108: aload           it
        //   110: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getRange:()Lkotlin/ranges/IntRange;
        //   113: invokestatic    kotlin/collections/CollectionsKt.slice:(Ljava/util/List;Lkotlin/ranges/IntRange;)Ljava/util/List;
        //   116: checkcast       Ljava/lang/Iterable;
        //   119: astore          list$iv$iv
        //   121: aload           destination$iv$iv
        //   123: aload           list$iv$iv
        //   125: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //   128: pop            
        //   129: goto            78
        //   132: aload           destination$iv$iv
        //   134: checkcast       Ljava/util/List;
        //   137: astore          expectedPaths
        //   139: aload           expectedPaths
        //   141: checkcast       Ljava/lang/Iterable;
        //   144: astore          $this$all$iv
        //   146: aload           $this$all$iv
        //   148: checkcast       Ljava/util/Collection;
        //   151: invokeinterface java/util/Collection.isEmpty:()Z
        //   156: ifeq            163
        //   159: iconst_1       
        //   160: goto            234
        //   163: aload           $this$all$iv
        //   165: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   170: astore          8
        //   172: aload           8
        //   174: invokeinterface java/util/Iterator.hasNext:()Z
        //   179: ifeq            233
        //   182: aload           8
        //   184: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   189: astore          element$iv
        //   191: aload           element$iv
        //   193: checkcast       Ljava/nio/file/Path;
        //   196: astore          it
        //   198: aload           primaryItems
        //   200: aload           it
        //   202: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   207: ifne            221
        //   210: aload_2         /* optional */
        //   211: aload           it
        //   213: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   218: ifeq            225
        //   221: iconst_1       
        //   222: goto            226
        //   225: iconst_0       
        //   226: ifne            172
        //   229: iconst_0       
        //   230: goto            234
        //   233: iconst_1       
        //   234: ifeq            263
        //   237: aload_3         /* fallbackProvider */
        //   238: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   241: invokestatic    kotlin/collections/SetsKt.emptySet:()Ljava/util/Set;
        //   244: invokeinterface gg/essential/gui/screenshot/providers/WindowedProvider.provide:(Ljava/util/List;Ljava/util/Set;)Ljava/util/Map;
        //   249: pop            
        //   250: aload_0         /* this */
        //   251: aconst_null    
        //   252: putfield        gg/essential/gui/screenshot/providers/TransitionWindowedProvider.fallbackProvider:Lgg/essential/gui/screenshot/providers/WindowedProvider;
        //   255: aload_0         /* this */
        //   256: aconst_null    
        //   257: putfield        gg/essential/gui/screenshot/providers/TransitionWindowedProvider.knownFallbackItems:Ljava/util/Set;
        //   260: aload           primaryItems
        //   262: areturn        
        //   263: aload_1         /* windows */
        //   264: checkcast       Ljava/lang/Iterable;
        //   267: astore          7
        //   269: new             Ljava/util/LinkedHashSet;
        //   272: dup            
        //   273: invokespecial   java/util/LinkedHashSet.<init>:()V
        //   276: checkcast       Ljava/util/Set;
        //   279: checkcast       Ljava/util/Collection;
        //   282: astore          destination$iv
        //   284: aload           $this$flatMapTo$iv
        //   286: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   291: astore          10
        //   293: aload           10
        //   295: invokeinterface java/util/Iterator.hasNext:()Z
        //   300: ifeq            357
        //   303: aload           10
        //   305: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   310: astore          element$iv
        //   312: aload           element$iv
        //   314: checkcast       Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //   317: astore          window
        //   319: aload           window
        //   321: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getRange:()Lkotlin/ranges/IntRange;
        //   324: checkcast       Ljava/lang/Iterable;
        //   327: invokestatic    kotlin/collections/CollectionsKt.asSequence:(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
        //   330: new             Lgg/essential/gui/screenshot/providers/TransitionWindowedProvider$provide$paths$1$1;
        //   333: dup            
        //   334: aload_0         /* this */
        //   335: invokespecial   gg/essential/gui/screenshot/providers/TransitionWindowedProvider$provide$paths$1$1.<init>:(Lgg/essential/gui/screenshot/providers/TransitionWindowedProvider;)V
        //   338: checkcast       Lkotlin/jvm/functions/Function1;
        //   341: invokestatic    kotlin/sequences/SequencesKt.map:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
        //   344: astore          list$iv
        //   346: aload           destination$iv
        //   348: aload           list$iv
        //   350: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Lkotlin/sequences/Sequence;)Z
        //   353: pop            
        //   354: goto            293
        //   357: aload           destination$iv
        //   359: checkcast       Ljava/util/Set;
        //   362: astore          paths
        //   364: aload_0         /* this */
        //   365: getfield        gg/essential/gui/screenshot/providers/TransitionWindowedProvider.knownFallbackItems:Ljava/util/Set;
        //   368: dup            
        //   369: ifnull          388
        //   372: astore          it
        //   374: aload           paths
        //   376: aload           it
        //   378: checkcast       Ljava/lang/Iterable;
        //   381: invokestatic    kotlin/collections/SetsKt.minus:(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
        //   384: dup            
        //   385: ifnonnull       390
        //   388: pop            
        //   389: aload_2         /* optional */
        //   390: astore          fallbackOptional
        //   392: aload_3         /* fallbackProvider */
        //   393: aload_1         /* windows */
        //   394: aload           fallbackOptional
        //   396: invokeinterface gg/essential/gui/screenshot/providers/WindowedProvider.provide:(Ljava/util/List;Ljava/util/Set;)Ljava/util/Map;
        //   401: invokestatic    kotlin/collections/MapsKt.toMutableMap:(Ljava/util/Map;)Ljava/util/Map;
        //   404: astore          items
        //   406: aload_0         /* this */
        //   407: aload           items
        //   409: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   414: aload_2         /* optional */
        //   415: checkcast       Ljava/lang/Iterable;
        //   418: invokestatic    kotlin/collections/SetsKt.minus:(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
        //   421: aload           primaryItems
        //   423: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   428: checkcast       Ljava/lang/Iterable;
        //   431: invokestatic    kotlin/collections/SetsKt.minus:(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
        //   434: putfield        gg/essential/gui/screenshot/providers/TransitionWindowedProvider.knownFallbackItems:Ljava/util/Set;
        //   437: aload           primaryItems
        //   439: astore          $this$forEach$iv
        //   441: aload           $this$forEach$iv
        //   443: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   448: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   453: astore          11
        //   455: aload           11
        //   457: invokeinterface java/util/Iterator.hasNext:()Z
        //   462: ifeq            520
        //   465: aload           11
        //   467: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   472: checkcast       Ljava/util/Map$Entry;
        //   475: astore          element$iv
        //   477: aload           element$iv
        //   479: astore          13
        //   481: aload           13
        //   483: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   488: checkcast       Ljava/nio/file/Path;
        //   491: astore          key
        //   493: aload           13
        //   495: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   500: astore          value
        //   502: aload           items
        //   504: aload           key
        //   506: aload           value
        //   508: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   513: invokestatic    io/netty/util/ReferenceCountUtil.release:(Ljava/lang/Object;)Z
        //   516: pop            
        //   517: goto            455
        //   520: aload           items
        //   522: areturn        
        //    Signature:
        //  (Ljava/util/List<Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;>;Ljava/util/Set<+Ljava/nio/file/Path;>;)Ljava/util/Map<Ljava/nio/file/Path;TT;>;
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  windows   
        //  optional  
        //    StackMapTable: 00 11 61 07 00 07 FF 00 2C 00 0C 07 00 02 07 00 49 07 00 5D 07 00 07 07 00 5F 00 00 00 00 07 00 57 00 07 00 61 00 00 F9 00 35 FF 00 1E 00 07 07 00 02 07 00 49 07 00 5D 07 00 07 07 00 5F 00 07 00 52 00 00 FF 00 08 00 09 07 00 02 07 00 49 07 00 5D 07 00 07 07 00 5F 00 00 00 07 00 61 00 00 30 03 40 01 FF 00 06 00 05 07 00 02 07 00 49 07 00 5D 07 00 07 07 00 5F 00 00 40 01 1C FF 00 1D 00 0B 07 00 02 07 00 49 07 00 5D 07 00 07 07 00 5F 00 00 00 07 00 57 00 07 00 61 00 00 F9 00 3F FF 00 1E 00 05 07 00 02 07 00 49 07 00 5D 07 00 07 07 00 5F 00 01 07 00 5D 41 07 00 5D FF 00 40 00 0C 00 00 00 00 00 00 00 00 07 00 5F 00 00 07 00 61 00 00 F8 00 40
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
