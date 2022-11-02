package gg.essential.gui.screenshot.providers;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.nio.file.*;
import java.util.*;
import kotlin.ranges.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000H
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b
                                                   
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010$
                                                   \u0002\b\u0002
                                                   \u0002\u0010"
                                                   \u0002\b\b\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012H\u0002J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00122\u0006\u0010!\u001a\u00020 2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012H\u0002J0\u0010"\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130&H\u0016J\u0014\u0010'\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010(\u001a\u00020\u0007H\u0002J\u0014\u0010)\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010(\u001a\u00020\u0007H\u0002J\u0016\u0010*\u001a\u0004\u0018\u00010\u001c*\u00020\u001c2\u0006\u0010+\u001a\u00020\u001cH\u0002J\u0014\u0010,\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010(\u001a\u00020\u0007H\u0002J\f\u0010-\u001a\u00020\u0007*\u00020\u001cH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b	\u0010
                                                   "\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\r\u0010\u000e"\u0004\b\u000f\u0010\u0010R7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128V@VX\u0096\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0017\u0010\u0018"\u0004\b\u0019\u0010\u001a*\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006.""" }, d2 = { "Lgg/essential/gui/screenshot/providers/ScopeExpansionWindowProvider;", "T", "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "sourceProvider", "expansionFactor", "", "expansionPerFrame", "", "(Lgg/essential/gui/screenshot/providers/WindowedProvider;FI)V", "getExpansionFactor", "()F", "setExpansionFactor", "(F)V", "getExpansionPerFrame", "()I", "setExpansionPerFrame", "(I)V", "<set-?>", "", "Ljava/nio/file/Path;", "items", "getItems$delegate", "(Lgg/essential/gui/screenshot/providers/ScopeExpansionWindowProvider;)Ljava/lang/Object;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "previousScopes", "Lkotlin/ranges/IntRange;", "combine", "inputWindows", "expand", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "window", "provide", "", "windows", "optional", "", "expandLeft", "amount", "expandRight", "intersects", "other", "shift", "size", "essential" })
public class ScopeExpansionWindowProvider<T> implements WindowedProvider<T>
{
    @NotNull
    private final WindowedProvider<T> sourceProvider;
    private float expansionFactor;
    private int expansionPerFrame;
    @NotNull
    private List<IntRange> previousScopes;
    
    public ScopeExpansionWindowProvider(@NotNull final WindowedProvider<? extends T> sourceProvider, final byte b) {
        Intrinsics.checkNotNullParameter((Object)sourceProvider, "sourceProvider");
        super();
        this.sourceProvider = (WindowedProvider<T>)sourceProvider;
        this.expansionFactor = 1.0f;
        this.expansionPerFrame = 1;
        this.previousScopes = CollectionsKt.emptyList();
    }
    
    public ScopeExpansionWindowProvider(final WindowedProvider sourceProvider) {
        this(sourceProvider, (byte)0);
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
        //    12: aload_1         /* windows */
        //    13: checkcast       Ljava/util/Collection;
        //    16: invokestatic    kotlin/collections/CollectionsKt.toMutableList:(Ljava/util/Collection;)Ljava/util/List;
        //    19: astore_3        /* expandedWindows */
        //    20: aload_0         /* this */
        //    21: invokevirtual   gg/essential/gui/screenshot/providers/ScopeExpansionWindowProvider.getItems:()Ljava/util/List;
        //    24: checkcast       Ljava/util/Collection;
        //    27: invokeinterface java/util/Collection.isEmpty:()Z
        //    32: ifne            39
        //    35: iconst_1       
        //    36: goto            40
        //    39: iconst_0       
        //    40: ifeq            140
        //    43: aload_1         /* windows */
        //    44: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    49: astore          4
        //    51: aload           4
        //    53: invokeinterface java/util/Iterator.hasNext:()Z
        //    58: ifeq            140
        //    61: aload           4
        //    63: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    68: checkcast       Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //    71: astore          window
        //    73: aload_0         /* this */
        //    74: aload           window
        //    76: aload_0         /* this */
        //    77: getfield        gg/essential/gui/screenshot/providers/ScopeExpansionWindowProvider.previousScopes:Ljava/util/List;
        //    80: invokespecial   gg/essential/gui/screenshot/providers/ScopeExpansionWindowProvider.expand:(Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;Ljava/util/List;)Ljava/util/List;
        //    83: astore          elements
        //    85: aload           elements
        //    87: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    92: astore          7
        //    94: aload           7
        //    96: invokeinterface java/util/Iterator.hasNext:()Z
        //   101: ifeq            51
        //   104: aload           7
        //   106: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   111: checkcast       Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //   114: astore          entry
        //   116: aload_0         /* this */
        //   117: aload           entry
        //   119: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getRange:()Lkotlin/ranges/IntRange;
        //   122: invokespecial   gg/essential/gui/screenshot/providers/ScopeExpansionWindowProvider.size:(Lkotlin/ranges/IntRange;)I
        //   125: ifle            94
        //   128: aload_3         /* expandedWindows */
        //   129: aload           entry
        //   131: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   136: pop            
        //   137: goto            94
        //   140: aload_0         /* this */
        //   141: aload_0         /* this */
        //   142: aload_3         /* expandedWindows */
        //   143: checkcast       Ljava/lang/Iterable;
        //   146: astore          4
        //   148: astore          13
        //   150: astore          12
        //   152: aload           $this$map$iv
        //   154: astore          6
        //   156: new             Ljava/util/ArrayList;
        //   159: dup            
        //   160: aload           $this$map$iv
        //   162: bipush          10
        //   164: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   167: invokespecial   java/util/ArrayList.<init>:(I)V
        //   170: checkcast       Ljava/util/Collection;
        //   173: astore          destination$iv$iv
        //   175: aload           $this$mapTo$iv$iv
        //   177: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   182: astore          9
        //   184: aload           9
        //   186: invokeinterface java/util/Iterator.hasNext:()Z
        //   191: ifeq            231
        //   194: aload           9
        //   196: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   201: astore          item$iv$iv
        //   203: aload           destination$iv$iv
        //   205: aload           item$iv$iv
        //   207: checkcast       Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;
        //   210: astore          11
        //   212: astore          14
        //   214: aload           it
        //   216: invokevirtual   gg/essential/gui/screenshot/providers/WindowedProvider$Window.getRange:()Lkotlin/ranges/IntRange;
        //   219: aload           14
        //   221: swap           
        //   222: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   227: pop            
        //   228: goto            184
        //   231: aload           destination$iv$iv
        //   233: checkcast       Ljava/util/List;
        //   236: astore          14
        //   238: aload           12
        //   240: aload           13
        //   242: aload           14
        //   244: invokespecial   gg/essential/gui/screenshot/providers/ScopeExpansionWindowProvider.combine:(Ljava/util/List;)Ljava/util/List;
        //   247: putfield        gg/essential/gui/screenshot/providers/ScopeExpansionWindowProvider.previousScopes:Ljava/util/List;
        //   250: aload_0         /* this */
        //   251: getfield        gg/essential/gui/screenshot/providers/ScopeExpansionWindowProvider.sourceProvider:Lgg/essential/gui/screenshot/providers/WindowedProvider;
        //   254: aload_3         /* expandedWindows */
        //   255: aload_2         /* optional */
        //   256: invokeinterface gg/essential/gui/screenshot/providers/WindowedProvider.provide:(Ljava/util/List;Ljava/util/Set;)Ljava/util/Map;
        //   261: areturn        
        //    Signature:
        //  (Ljava/util/List<Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;>;Ljava/util/Set<+Ljava/nio/file/Path;>;)Ljava/util/Map<Ljava/nio/file/Path;TT;>;
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  windows   
        //  optional  
        //    StackMapTable: 00 07 FC 00 27 07 00 7A 40 01 FF 00 0A 00 05 07 00 02 00 07 00 80 07 00 7A 07 00 82 00 00 FE 00 2A 00 00 07 00 82 FF 00 2D 00 04 07 00 02 00 07 00 80 07 00 7A 00 00 FF 00 2B 00 0E 07 00 02 00 07 00 80 07 00 7A 00 00 00 07 00 6F 00 07 00 82 00 00 07 00 02 07 00 02 00 00 FF 00 2E 00 0E 07 00 02 00 07 00 80 07 00 7A 00 00 00 07 00 6F 00 00 00 00 07 00 02 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final List<IntRange> combine(final List<IntRange> inputWindows) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: checkcast       Ljava/util/List;
        //    10: astore_2        /* combined */
        //    11: aload_2         /* combined */
        //    12: aload_1         /* inputWindows */
        //    13: checkcast       Ljava/lang/Iterable;
        //    16: astore_3        /* $this$sortedBy$iv */
        //    17: aload_3         /* $this$sortedBy$iv */
        //    18: new             Lgg/essential/gui/screenshot/providers/ScopeExpansionWindowProvider$combine$$inlined$sortedBy$1;
        //    21: dup            
        //    22: invokespecial   gg/essential/gui/screenshot/providers/ScopeExpansionWindowProvider$combine$$inlined$sortedBy$1.<init>:()V
        //    25: checkcast       Ljava/util/Comparator;
        //    28: invokestatic    kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        //    31: checkcast       Ljava/lang/Iterable;
        //    34: astore_3       
        //    35: astore          8
        //    37: aload_3         /* $this$reduceOrNull$iv */
        //    38: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    43: astore          iterator$iv
        //    45: aload           iterator$iv
        //    47: invokeinterface java/util/Iterator.hasNext:()Z
        //    52: ifne            59
        //    55: aconst_null    
        //    56: goto            150
        //    59: aload           iterator$iv
        //    61: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    66: astore          accumulator$iv
        //    68: aload           iterator$iv
        //    70: invokeinterface java/util/Iterator.hasNext:()Z
        //    75: ifeq            148
        //    78: aload           accumulator$iv
        //    80: aload           iterator$iv
        //    82: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    87: checkcast       Lkotlin/ranges/IntRange;
        //    90: astore          6
        //    92: checkcast       Lkotlin/ranges/IntRange;
        //    95: astore          range
        //    97: aload           next
        //    99: invokevirtual   kotlin/ranges/IntRange.getFirst:()I
        //   102: aload           range
        //   104: invokevirtual   kotlin/ranges/IntRange.getLast:()I
        //   107: isub           
        //   108: iconst_1       
        //   109: if_icmpgt       132
        //   112: new             Lkotlin/ranges/IntRange;
        //   115: dup            
        //   116: aload           range
        //   118: invokevirtual   kotlin/ranges/IntRange.getFirst:()I
        //   121: aload           next
        //   123: invokevirtual   kotlin/ranges/IntRange.getLast:()I
        //   126: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   129: goto            143
        //   132: aload_2         /* combined */
        //   133: aload           range
        //   135: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   140: pop            
        //   141: aload           next
        //   143: astore          accumulator$iv
        //   145: goto            68
        //   148: aload           accumulator$iv
        //   150: aload           8
        //   152: swap           
        //   153: checkcast       Lkotlin/ranges/IntRange;
        //   156: dup            
        //   157: ifnonnull       165
        //   160: pop            
        //   161: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   164: areturn        
        //   165: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   170: pop            
        //   171: aload_2         /* combined */
        //   172: areturn        
        //    Signature:
        //  (Ljava/util/List<Lkotlin/ranges/IntRange;>;)Ljava/util/List<Lkotlin/ranges/IntRange;>;
        //    MethodParameters:
        //  Name          Flags  
        //  ------------  -----
        //  inputWindows  
        //    StackMapTable: 00 07 FF 00 3B 00 09 00 00 07 00 7A 00 07 00 82 00 00 00 07 00 7A 00 00 FF 00 08 00 09 00 00 07 00 7A 00 07 00 82 07 00 05 00 00 07 00 7A 00 00 FF 00 3F 00 09 00 00 07 00 7A 00 07 00 82 00 07 00 C5 07 00 C5 07 00 7A 00 00 FF 00 0A 00 09 00 00 07 00 7A 00 07 00 82 00 00 00 07 00 7A 00 01 07 00 C5 FF 00 04 00 09 00 00 07 00 7A 00 00 07 00 05 00 00 07 00 7A 00 00 FF 00 01 00 09 00 00 07 00 7A 00 00 00 00 00 07 00 7A 00 01 07 00 05 FF 00 0E 00 03 00 00 07 00 7A 00 02 07 00 7A 07 00 C5
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final List<WindowedProvider$Window> expand(final WindowedProvider$Window window, final List<IntRange> previousScopes) {
        final boolean backwards = window.getBackwards();
        final IntRange windowRange = window.getRange();
        final int maxBackwardsSize = (int)(this.size(windowRange) * this.expansionFactor);
        final IntRange backRange = this.shift(windowRange, -maxBackwardsSize);
        while (true) {
            for (final IntRange it : previousScopes) {
                final IntRange intersects = this.intersects(it, backRange);
                if (intersects != null) {
                    final IntRange intRange2;
                    IntRange intRange = intRange2 = intersects;
                    if (intRange2 == null) {
                        intRange = new IntRange(windowRange.getFirst(), windowRange.getFirst());
                    }
                    IntRange intersectedRangeBackwards = intRange;
                    if (this.size(intersectedRangeBackwards) < maxBackwardsSize) {
                        intersectedRangeBackwards = this.expandLeft(intersectedRangeBackwards, this.expansionPerFrame);
                    }
                    final int maxForwardSize = (int)(this.size(windowRange) * this.expansionFactor);
                    final IntRange forwardRange = this.shift(windowRange, maxForwardSize);
                    while (true) {
                        for (final IntRange it2 : previousScopes) {
                            final IntRange intersects2 = this.intersects(it2, forwardRange);
                            if (intersects2 != null) {
                                final IntRange intRange4;
                                IntRange intRange3 = intRange4 = intersects2;
                                if (intRange4 == null) {
                                    intRange3 = new IntRange(windowRange.getLast(), windowRange.getLast());
                                }
                                IntRange intersectedRangeForwards = intRange3;
                                if (this.size(intersectedRangeForwards) < maxForwardSize) {
                                    intersectedRangeForwards = this.expandRight(intersectedRangeForwards, this.expansionPerFrame);
                                }
                                final List newRegions = CollectionsKt.listOf((Object[])new WindowedProvider$Window[] { new WindowedProvider$Window(intersectedRangeBackwards, backwards), new WindowedProvider$Window(intersectedRangeForwards, backwards) });
                                return backwards ? newRegions : CollectionsKt.reversed((Iterable)newRegions);
                            }
                        }
                        IntRange intRange4;
                        IntRange intRange3 = intRange4 = null;
                        continue;
                    }
                }
            }
            IntRange intRange2;
            IntRange intRange = intRange2 = null;
            continue;
        }
    }
    
    private final int size(final IntRange $this$size) {
        return $this$size.getEndInclusive() - $this$size.getStart();
    }
    
    private final IntRange shift(final IntRange $this$shift, final int amount) {
        return new IntRange(RangesKt.coerceIn($this$shift.getStart() + amount, (ClosedRange)CollectionsKt.getIndices((Collection)this.getItems())), RangesKt.coerceIn($this$shift.getEndInclusive() + amount, (ClosedRange)CollectionsKt.getIndices((Collection)this.getItems())));
    }
    
    private final IntRange expandLeft(final IntRange $this$expandLeft, final int amount) {
        return new IntRange(Math.max(0, $this$expandLeft.getStart() - amount), (int)$this$expandLeft.getEndInclusive());
    }
    
    private final IntRange expandRight(final IntRange $this$expandRight, final int amount) {
        return new IntRange((int)$this$expandRight.getStart(), RangesKt.coerceIn($this$expandRight.getEndInclusive() + amount, (ClosedRange)CollectionsKt.getIndices((Collection)this.getItems())));
    }
    
    private final IntRange intersects(final IntRange $this$intersects, final IntRange other) {
        if (other.getFirst() < $this$intersects.getFirst()) {
            return this.intersects(other, $this$intersects);
        }
        if (other.getLast() <= $this$intersects.getLast()) {
            return new IntRange(other.getFirst(), other.getLast());
        }
        if (other.getFirst() < $this$intersects.getLast()) {
            return new IntRange(other.getFirst(), $this$intersects.getLast());
        }
        return null;
    }
}
