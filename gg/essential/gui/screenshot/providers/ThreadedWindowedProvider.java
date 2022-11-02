package gg.essential.gui.screenshot.providers;

import java.nio.file.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import kotlin.jvm.internal.*;
import io.netty.util.*;
import java.util.*;
import java.util.function.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000Z
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010	J0\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0!H\u0016R8\u0010
                                                   \u001a,\u0012\u0004\u0012\u00020\f\u0012"\u0012 \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\r0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0012\u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00140\u000e0\u0013X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a
                                                   \u0012\u0004\u0012\u00020\f\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006"""" }, d2 = { "Lgg/essential/gui/screenshot/providers/ThreadedWindowedProvider;", "T", "", "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "innerProvider", "threadPool", "Ljava/util/concurrent/ExecutorService;", "providerPriority", "", "(Lgg/essential/gui/screenshot/providers/WindowedProvider;Ljava/util/concurrent/ExecutorService;I)V", "activeTasks", "", "Ljava/nio/file/Path;", "Lkotlin/Pair;", "Ljava/util/concurrent/CompletableFuture;", "", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cache", "canceledTasks", "", "Ljava/lang/Void;", "value", "", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "newItemsRequested", "provide", "windows", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "optional", "", "essential" })
public final class ThreadedWindowedProvider<T> implements WindowedProvider<T>
{
    @NotNull
    private final WindowedProvider<T> innerProvider;
    @NotNull
    private final ExecutorService threadPool;
    private final int providerPriority;
    @Nullable
    private List<? extends Path> newItemsRequested;
    @NotNull
    private final Map<Path, Pair<CompletableFuture<Map<Path, T>>, AtomicBoolean>> activeTasks;
    @NotNull
    private final List<CompletableFuture<Void>> canceledTasks;
    @NotNull
    private final Map<Path, T> cache;
    
    public ThreadedWindowedProvider(@NotNull final WindowedProvider<? extends T> innerProvider, @NotNull final ExecutorService threadPool, final int providerPriority) {
        Intrinsics.checkNotNullParameter((Object)innerProvider, "innerProvider");
        Intrinsics.checkNotNullParameter((Object)threadPool, "threadPool");
        super();
        this.innerProvider = (WindowedProvider<T>)innerProvider;
        this.threadPool = threadPool;
        this.providerPriority = providerPriority;
        this.activeTasks = new LinkedHashMap<Path, Pair<CompletableFuture<Map<Path, T>>, AtomicBoolean>>();
        this.canceledTasks = new ArrayList<CompletableFuture<Void>>();
        this.cache = new LinkedHashMap<Path, T>();
    }
    
    @NotNull
    @Override
    public List<Path> getItems() {
        List<? extends Path> list;
        if ((list = this.newItemsRequested) == null) {
            list = this.innerProvider.getItems();
        }
        return (List<Path>)list;
    }
    
    @Override
    public void setItems(@NotNull final List<? extends Path> value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        if (this.activeTasks.isEmpty() && this.canceledTasks.isEmpty()) {
            this.innerProvider.setItems(value);
            this.newItemsRequested = null;
        }
        else {
            this.newItemsRequested = value;
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
        //    13: astore_3       
        //    14: aload_3        
        //    15: monitorenter   
        //    16: aload_0         /* this */
        //    17: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.newItemsRequested:Ljava/util/List;
        //    20: astore          newItemsRequested
        //    22: aload           newItemsRequested
        //    24: dup            
        //    25: ifnonnull       33
        //    28: pop            
        //    29: aload_0         /* this */
        //    30: invokevirtual   gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.getItems:()Ljava/util/List;
        //    33: astore          items
        //    35: aload_1         /* windows */
        //    36: checkcast       Ljava/lang/Iterable;
        //    39: astore          7
        //    41: new             Ljava/util/LinkedHashSet;
        //    44: dup            
        //    45: invokespecial   java/util/LinkedHashSet.<init>:()V
        //    48: checkcast       Ljava/util/Set;
        //    51: checkcast       Ljava/util/Collection;
        //    54: astore          destination$iv
        //    56: aload           $this$flatMapTo$iv
        //    58: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    63: astore          10
        //    65: aload           10
        //    67: invokeinterface java/util/Iterator.hasNext:()Z
        //    72: ifeq            144
        //    75: aload           10
        //    77: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    82: astore          element$iv
        //    84: aload           element$iv
        //    86: checkcast       Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //    89: astore          window
        //    91: aload           window
        //    93: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getRange:()Lkotlin/ranges/IntRange;
        //    96: checkcast       Ljava/lang/Iterable;
        //    99: invokestatic    kotlin/collections/CollectionsKt.asSequence:(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
        //   102: new             Lgg/essential/gui/screenshot/providers/ThreadedWindowedProvider$provide$1$requestedPaths$1$1;
        //   105: dup            
        //   106: aload           items
        //   108: invokespecial   gg/essential/gui/screenshot/providers/ThreadedWindowedProvider$provide$1$requestedPaths$1$1.<init>:(Ljava/util/List;)V
        //   111: checkcast       Lkotlin/jvm/functions/Function1;
        //   114: invokestatic    kotlin/sequences/SequencesKt.map:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
        //   117: new             Lgg/essential/gui/screenshot/providers/ThreadedWindowedProvider$provide$1$requestedPaths$1$2;
        //   120: dup            
        //   121: aload_2         /* optional */
        //   122: invokespecial   gg/essential/gui/screenshot/providers/ThreadedWindowedProvider$provide$1$requestedPaths$1$2.<init>:(Ljava/util/Set;)V
        //   125: checkcast       Lkotlin/jvm/functions/Function1;
        //   128: invokestatic    kotlin/sequences/SequencesKt.filterNot:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
        //   131: astore          list$iv
        //   133: aload           destination$iv
        //   135: aload           list$iv
        //   137: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Lkotlin/sequences/Sequence;)Z
        //   140: pop            
        //   141: goto            65
        //   144: aload           destination$iv
        //   146: checkcast       Ljava/util/Set;
        //   149: astore          requestedPaths
        //   151: aload_0         /* this */
        //   152: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.activeTasks:Ljava/util/Map;
        //   155: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   160: aload           requestedPaths
        //   162: aload           newItemsRequested
        //   164: aload_0         /* this */
        //   165: invokedynamic   BootstrapMethod #0, test:(Ljava/util/Set;Ljava/util/List;Lgg/essential/gui/screenshot/providers/ThreadedWindowedProvider;)Ljava/util/function/Predicate;
        //   170: invokeinterface java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
        //   175: pop            
        //   176: aload_0         /* this */
        //   177: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.canceledTasks:Ljava/util/List;
        //   180: invokedynamic   BootstrapMethod #1, test:()Ljava/util/function/Predicate;
        //   185: invokeinterface java/util/List.removeIf:(Ljava/util/function/Predicate;)Z
        //   190: pop            
        //   191: aload_0         /* this */
        //   192: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.activeTasks:Ljava/util/Map;
        //   195: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   200: aload_0         /* this */
        //   201: invokedynamic   BootstrapMethod #2, test:(Lgg/essential/gui/screenshot/providers/ThreadedWindowedProvider;)Ljava/util/function/Predicate;
        //   206: invokeinterface java/util/Collection.removeIf:(Ljava/util/function/Predicate;)Z
        //   211: pop            
        //   212: aload           newItemsRequested
        //   214: ifnonnull       462
        //   217: aload_1         /* windows */
        //   218: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   223: astore          7
        //   225: iconst_0       
        //   226: istore          8
        //   228: aload           7
        //   230: invokeinterface java/util/Iterator.hasNext:()Z
        //   235: ifeq            492
        //   238: iload           8
        //   240: istore          windowIndex
        //   242: iload           8
        //   244: iconst_1       
        //   245: iadd           
        //   246: istore          8
        //   248: aload           7
        //   250: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   255: checkcast       Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //   258: astore          window
        //   260: aload           window
        //   262: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getRange:()Lkotlin/ranges/IntRange;
        //   265: aload           window
        //   267: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getBackwards:()Z
        //   270: invokestatic    gg/essential/util/ExtensionsKt.reversed:(Lkotlin/ranges/IntRange;Z)Lkotlin/ranges/IntProgression;
        //   273: astore          11
        //   275: aload           11
        //   277: invokevirtual   kotlin/ranges/IntProgression.getFirst:()I
        //   280: istore          index
        //   282: aload           11
        //   284: invokevirtual   kotlin/ranges/IntProgression.getLast:()I
        //   287: istore          13
        //   289: aload           11
        //   291: invokevirtual   kotlin/ranges/IntProgression.getStep:()I
        //   294: istore          15
        //   296: iload           15
        //   298: ifle            308
        //   301: iload           index
        //   303: iload           13
        //   305: if_icmple       320
        //   308: iload           15
        //   310: ifge            228
        //   313: iload           13
        //   315: iload           index
        //   317: if_icmpgt       228
        //   320: aload           items
        //   322: iload           index
        //   324: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   329: checkcast       Ljava/nio/file/Path;
        //   332: astore          path
        //   334: aload_0         /* this */
        //   335: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.cache:Ljava/util/Map;
        //   338: aload           path
        //   340: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   345: ifne            373
        //   348: aload_0         /* this */
        //   349: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.activeTasks:Ljava/util/Map;
        //   352: aload           path
        //   354: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   359: ifne            373
        //   362: aload_2         /* optional */
        //   363: aload           path
        //   365: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   370: ifeq            376
        //   373: goto            445
        //   376: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //   379: dup            
        //   380: iconst_0       
        //   381: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //   384: astore          isCanceled
        //   386: aload           isCanceled
        //   388: aload_0         /* this */
        //   389: iload           index
        //   391: invokedynamic   BootstrapMethod #3, get:(Ljava/util/concurrent/atomic/AtomicBoolean;Lgg/essential/gui/screenshot/providers/ThreadedWindowedProvider;I)Ljava/util/function/Supplier;
        //   396: getstatic       gg/essential/gui/screenshot/concurrent/PrioritizedCallable.Companion:Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable$Companion;
        //   399: aload_0         /* this */
        //   400: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.threadPool:Ljava/util/concurrent/ExecutorService;
        //   403: checkcast       Ljava/util/concurrent/Executor;
        //   406: iload           windowIndex
        //   408: aload_0         /* this */
        //   409: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.providerPriority:I
        //   412: iload           index
        //   414: invokevirtual   gg/essential/gui/screenshot/concurrent/PrioritizedCallable$Companion.withPriority:(Ljava/util/concurrent/Executor;III)Ljava/util/concurrent/Executor;
        //   417: invokestatic    java/util/concurrent/CompletableFuture.supplyAsync:(Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
        //   420: astore          future
        //   422: aload_0         /* this */
        //   423: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.activeTasks:Ljava/util/Map;
        //   426: aload           path
        //   428: new             Lkotlin/Pair;
        //   431: dup            
        //   432: aload           future
        //   434: aload           isCanceled
        //   436: invokespecial   kotlin/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   439: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   444: pop            
        //   445: iload           index
        //   447: iload           13
        //   449: if_icmpeq       228
        //   452: iload           index
        //   454: iload           15
        //   456: iadd           
        //   457: istore          index
        //   459: goto            320
        //   462: aload_0         /* this */
        //   463: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.activeTasks:Ljava/util/Map;
        //   466: invokeinterface java/util/Map.isEmpty:()Z
        //   471: ifeq            492
        //   474: aload_0         /* this */
        //   475: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.canceledTasks:Ljava/util/List;
        //   478: invokeinterface java/util/List.isEmpty:()Z
        //   483: ifeq            492
        //   486: aload_0         /* this */
        //   487: aload           newItemsRequested
        //   489: invokevirtual   gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.setItems:(Ljava/util/List;)V
        //   492: aload_0         /* this */
        //   493: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.cache:Ljava/util/Map;
        //   496: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   501: aload           requestedPaths
        //   503: invokedynamic   BootstrapMethod #4, test:(Ljava/util/Set;)Ljava/util/function/Predicate;
        //   508: invokeinterface java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
        //   513: pop            
        //   514: aload_0         /* this */
        //   515: getfield        gg/essential/gui/screenshot/providers/ThreadedWindowedProvider.cache:Ljava/util/Map;
        //   518: astore          $this$mapValues$iv
        //   520: aload           $this$mapValues$iv
        //   522: astore          9
        //   524: new             Ljava/util/LinkedHashMap;
        //   527: dup            
        //   528: aload           $this$mapValues$iv
        //   530: invokeinterface java/util/Map.size:()I
        //   535: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //   538: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //   541: checkcast       Ljava/util/Map;
        //   544: astore          destination$iv$iv
        //   546: aload           $this$mapValuesTo$iv$iv
        //   548: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   553: checkcast       Ljava/lang/Iterable;
        //   556: astore          $this$associateByTo$iv$iv$iv
        //   558: aload           $this$associateByTo$iv$iv$iv
        //   560: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   565: astore          15
        //   567: aload           15
        //   569: invokeinterface java/util/Iterator.hasNext:()Z
        //   574: ifeq            645
        //   577: aload           15
        //   579: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   584: astore          element$iv$iv$iv
        //   586: aload           destination$iv$iv
        //   588: aload           element$iv$iv$iv
        //   590: checkcast       Ljava/util/Map$Entry;
        //   593: astore          17
        //   595: astore          18
        //   597: aload           it$iv$iv
        //   599: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   604: aload           18
        //   606: swap           
        //   607: aload           element$iv$iv$iv
        //   609: checkcast       Ljava/util/Map$Entry;
        //   612: astore          19
        //   614: astore          20
        //   616: astore          21
        //   618: aload           it
        //   620: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   625: invokestatic    io/netty/util/ReferenceCountUtil.retain:(Ljava/lang/Object;)Ljava/lang/Object;
        //   628: astore          22
        //   630: aload           21
        //   632: aload           20
        //   634: aload           22
        //   636: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   641: pop            
        //   642: goto            567
        //   645: aload           destination$iv$iv
        //   647: astore          23
        //   649: aload_3        
        //   650: monitorexit    
        //   651: aload           23
        //   653: areturn        
        //   654: astore          4
        //   656: aload_3        
        //   657: monitorexit    
        //   658: aload           4
        //   660: athrow         
        //    Signature:
        //  (Ljava/util/List<Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;>;Ljava/util/Set<+Ljava/nio/file/Path;>;)Ljava/util/Map<Ljava/nio/file/Path;TT;>;
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  windows   
        //  optional  
        //    StackMapTable: 00 0E FF 00 21 00 06 07 00 02 07 00 5D 07 00 77 07 00 02 00 07 00 5D 00 01 07 00 5D FF 00 1F 00 0B 07 00 02 07 00 5D 07 00 77 07 00 02 00 07 00 5D 07 00 5D 00 07 00 7E 00 07 00 84 00 00 F9 00 4E FF 00 53 00 0F 07 00 02 00 07 00 77 07 00 02 00 00 07 00 5D 07 00 84 01 00 00 00 00 00 07 00 77 00 00 FF 00 4F 00 10 07 00 02 00 07 00 77 07 00 02 00 00 07 00 5D 07 00 84 01 01 00 00 01 01 07 00 77 01 00 00 0B 34 FC 00 02 07 00 FC FA 00 44 FF 00 10 00 0F 07 00 02 00 00 07 00 02 00 07 00 5D 00 00 00 00 00 00 00 00 07 00 77 00 00 FF 00 1D 00 0F 07 00 02 00 00 07 00 02 00 00 00 00 00 00 00 00 00 00 07 00 77 00 00 FF 00 4A 00 10 00 00 00 07 00 02 00 00 00 00 00 00 07 00 56 00 00 00 00 07 00 84 00 00 FF 00 4D 00 0B 00 00 00 07 00 02 00 00 00 00 00 00 07 00 56 00 00 FF 00 08 00 04 00 00 00 07 00 02 00 01 07 01 54
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  16     649    654    661    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final void provide$lambda-9$lambda-2$lambda-1(final Map result) {
        final Iterable $this$forEach$iv = result.values();
        for (final Object p0 : $this$forEach$iv) {
            final Object element$iv = p0;
            ReferenceCountUtil.release(p0);
        }
    }
    
    private static final boolean provide$lambda-9$lambda-2(final Set $requestedPaths, final List $newItemsRequested, final ThreadedWindowedProvider this$0, final Map.Entry entry2) {
        Intrinsics.checkNotNullParameter((Object)$requestedPaths, "$requestedPaths");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)entry2, "<name for destructuring parameter 0>");
        final Path path = entry2.getKey();
        final Pair entry = (Pair)entry2.getValue();
        boolean b;
        if (!$requestedPaths.contains(path) || $newItemsRequested != null) {
            final CompletableFuture future = (CompletableFuture)entry.component1();
            final AtomicBoolean canceled = (AtomicBoolean)entry.component2();
            canceled.set(true);
            final List<CompletableFuture<Void>> canceledTasks = this$0.canceledTasks;
            final CompletableFuture thenAccept = future.thenAccept((Consumer)ThreadedWindowedProvider::provide$lambda-9$lambda-2$lambda-1);
            Intrinsics.checkNotNullExpressionValue((Object)thenAccept, "future.thenAccept { resu\u2026se)\n                    }");
            canceledTasks.add(thenAccept);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    private static final boolean provide$lambda-9$lambda-3(final CompletableFuture it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it.isDone();
    }
    
    private static final boolean provide$lambda-9$lambda-5(final ThreadedWindowedProvider this$0, final Pair pair) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)pair, "<name for destructuring parameter 0>");
        final CompletableFuture future = (CompletableFuture)pair.component1();
        final Map map = future.getNow(null);
        if (map == null) {
            return false;
        }
        final Map $this$forEach$iv;
        final Map result = $this$forEach$iv = map;
        for (final Map.Entry entry : $this$forEach$iv.entrySet()) {
            final Map.Entry element$iv = entry;
            final Path key = (Path)entry.getKey();
            final Object value = entry.getValue();
            ReferenceCountUtil.release((Object)this$0.cache.put(key, (T)value));
        }
        return true;
    }
    
    private static final Map provide$lambda-9$lambda-6(final AtomicBoolean $isCanceled, final ThreadedWindowedProvider this$0, final int $index) {
        Intrinsics.checkNotNullParameter((Object)$isCanceled, "$isCanceled");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        return $isCanceled.get() ? MapsKt.emptyMap() : this$0.innerProvider.provide(WindowProviderKt.toSingleWindowRequest($index), SetsKt.emptySet());
    }
    
    private static final boolean provide$lambda-9$lambda-7(final Set $requestedPaths, final Map.Entry it) {
        Intrinsics.checkNotNullParameter((Object)$requestedPaths, "$requestedPaths");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        boolean b;
        if (!$requestedPaths.contains(it.getKey())) {
            ReferenceCountUtil.release((Object)it.getValue());
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
