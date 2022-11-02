package gg.essential.gui.screenshot.providers;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.nio.file.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0010$
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0004J0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0016R7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u000b\u0010\f"\u0004\b\r\u0010\u000e*\u0004\b	\u0010
                                                   R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/screenshot/providers/MaxScopeExpansionWindowProvider;", "T", "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "sourceProvider", "(Lgg/essential/gui/screenshot/providers/WindowedProvider;)V", "<set-?>", "", "Ljava/nio/file/Path;", "items", "getItems$delegate", "(Lgg/essential/gui/screenshot/providers/MaxScopeExpansionWindowProvider;)Ljava/lang/Object;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "provide", "", "windows", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "optional", "", "essential" })
public final class MaxScopeExpansionWindowProvider<T> implements WindowedProvider<T>
{
    @NotNull
    private final WindowedProvider<T> sourceProvider;
    
    public MaxScopeExpansionWindowProvider(@NotNull final WindowedProvider<? extends T> sourceProvider) {
        Intrinsics.checkNotNullParameter((Object)sourceProvider, "sourceProvider");
        super();
        this.sourceProvider = (WindowedProvider<T>)sourceProvider;
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
        //    13: getfield        gg/essential/gui/screenshot/providers/MaxScopeExpansionWindowProvider.sourceProvider:Lgg/essential/gui/screenshot/providers/WindowedProvider;
        //    16: aload_1         /* windows */
        //    17: checkcast       Ljava/lang/Iterable;
        //    20: astore_3       
        //    21: astore          12
        //    23: aload_3         /* $this$flatMap$iv */
        //    24: astore          4
        //    26: new             Ljava/util/ArrayList;
        //    29: dup            
        //    30: invokespecial   java/util/ArrayList.<init>:()V
        //    33: checkcast       Ljava/util/Collection;
        //    36: astore          destination$iv$iv
        //    38: aload           $this$flatMapTo$iv$iv
        //    40: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    45: astore          6
        //    47: aload           6
        //    49: invokeinterface java/util/Iterator.hasNext:()Z
        //    54: ifeq            225
        //    57: aload           6
        //    59: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    64: astore          element$iv$iv
        //    66: aload           element$iv$iv
        //    68: checkcast       Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //    71: astore          it
        //    73: iconst_2       
        //    74: anewarray       Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //    77: astore          9
        //    79: aload           9
        //    81: iconst_0       
        //    82: new             Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //    85: dup            
        //    86: new             Lkotlin/ranges/IntRange;
        //    89: dup            
        //    90: iconst_0       
        //    91: aload           it
        //    93: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getRange:()Lkotlin/ranges/IntRange;
        //    96: invokevirtual   kotlin/ranges/IntRange.getFirst:()I
        //    99: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   102: aload           it
        //   104: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getBackwards:()Z
        //   107: invokespecial   gg/essential/gui/screenshot/providers/WindowedProvider$Window.<init>:(Lkotlin/ranges/IntRange;Z)V
        //   110: aastore        
        //   111: aload           9
        //   113: iconst_1       
        //   114: new             Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //   117: dup            
        //   118: new             Lkotlin/ranges/IntRange;
        //   121: dup            
        //   122: aload           it
        //   124: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getRange:()Lkotlin/ranges/IntRange;
        //   127: invokevirtual   kotlin/ranges/IntRange.getLast:()I
        //   130: aload_0         /* this */
        //   131: invokevirtual   gg/essential/gui/screenshot/providers/MaxScopeExpansionWindowProvider.getItems:()Ljava/util/List;
        //   134: invokestatic    kotlin/collections/CollectionsKt.getLastIndex:(Ljava/util/List;)I
        //   137: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   140: aload           it
        //   142: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getBackwards:()Z
        //   145: invokespecial   gg/essential/gui/screenshot/providers/WindowedProvider$Window.<init>:(Lkotlin/ranges/IntRange;Z)V
        //   148: aastore        
        //   149: aload           9
        //   151: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //   154: astore          expandedWindows
        //   156: iconst_1       
        //   157: anewarray       Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //   160: astore          11
        //   162: aload           11
        //   164: iconst_0       
        //   165: aload           it
        //   167: aastore        
        //   168: aload           11
        //   170: invokestatic    kotlin/collections/CollectionsKt.mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
        //   173: astore          aggregatedList
        //   175: aload           aggregatedList
        //   177: aload           it
        //   179: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getBackwards:()Z
        //   182: ifeq            190
        //   185: aload           expandedWindows
        //   187: goto            198
        //   190: aload           expandedWindows
        //   192: checkcast       Ljava/lang/Iterable;
        //   195: invokestatic    kotlin/collections/CollectionsKt.reversed:(Ljava/lang/Iterable;)Ljava/util/List;
        //   198: checkcast       Ljava/util/Collection;
        //   201: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   206: pop            
        //   207: aload           aggregatedList
        //   209: checkcast       Ljava/lang/Iterable;
        //   212: astore          list$iv$iv
        //   214: aload           destination$iv$iv
        //   216: aload           list$iv$iv
        //   218: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //   221: pop            
        //   222: goto            47
        //   225: aload           destination$iv$iv
        //   227: checkcast       Ljava/util/List;
        //   230: aload           12
        //   232: swap           
        //   233: aload_2         /* optional */
        //   234: invokeinterface gg/essential/gui/screenshot/providers/WindowedProvider.provide:(Ljava/util/List;Ljava/util/Set;)Ljava/util/Map;
        //   239: areturn        
        //    Signature:
        //  (Ljava/util/List<Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;>;Ljava/util/Set<+Ljava/nio/file/Path;>;)Ljava/util/Map<Ljava/nio/file/Path;TT;>;
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  windows   
        //  optional  
        //    StackMapTable: 00 04 FF 00 2F 00 0D 07 00 02 00 07 00 49 00 00 07 00 43 07 00 4B 00 00 00 00 00 07 00 07 00 00 FF 00 8E 00 0D 07 00 02 00 07 00 49 00 00 07 00 43 07 00 4B 00 00 07 00 7C 07 00 7C 00 07 00 07 00 01 07 00 7C FF 00 07 00 0D 07 00 02 00 07 00 49 00 00 07 00 43 07 00 4B 00 00 07 00 7C 00 00 07 00 07 00 02 07 00 7C 07 00 7C FF 00 1A 00 0D 00 00 07 00 49 00 00 07 00 43 00 00 00 00 00 00 07 00 07 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
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
}
