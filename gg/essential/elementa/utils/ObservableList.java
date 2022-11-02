package gg.essential.elementa.utils;

import kotlin.jvm.internal.markers.*;
import kotlin.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0001J\u0016\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0003¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u000bH\u0096\u0001J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0096\u0003J\u0016\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u001aJ\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0096\u0001J\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0001J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0018J\u0016\u0010$\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u001e\u0010%\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010&J\u001a\u0010'\u001a\u00020\u000e2\u0010\u0010(\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010)H\u0016J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0096\u0001J\u0016\u0010-\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0002R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060" }, d2 = { "Lgg/essential/elementa/utils/ObservableList;", "T", "", "Ljava/util/Observable;", "wrapped", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "sort", "c", "Ljava/util/Comparator;", "subList", "fromIndex", "toIndex", "update", "event", "Lgg/essential/elementa/utils/ObservableListEvent;", "Elementa" })
public final class ObservableList<T> extends Observable implements List<T>, KMutableList
{
    @NotNull
    private final List<T> wrapped;
    
    public ObservableList(@NotNull final List<T> wrapped) {
        Intrinsics.checkNotNullParameter((Object)wrapped, "wrapped");
        super();
        this.wrapped = wrapped;
    }
    
    public int getSize() {
        return this.wrapped.size();
    }
    
    @Override
    public boolean contains(final Object element) {
        return this.wrapped.contains(element);
    }
    
    @Override
    public boolean containsAll(@NotNull final Collection<?> elements) {
        Intrinsics.checkNotNullParameter((Object)elements, "elements");
        return this.wrapped.containsAll(elements);
    }
    
    @Override
    public T get(final int index) {
        return this.wrapped.get(index);
    }
    
    @Override
    public int indexOf(final Object element) {
        return this.wrapped.indexOf(element);
    }
    
    @Override
    public boolean isEmpty() {
        return this.wrapped.isEmpty();
    }
    
    @NotNull
    @Override
    public Iterator<T> iterator() {
        return this.wrapped.iterator();
    }
    
    @Override
    public int lastIndexOf(final Object element) {
        return this.wrapped.lastIndexOf(element);
    }
    
    @NotNull
    @Override
    public ListIterator<T> listIterator() {
        return this.wrapped.listIterator();
    }
    
    @NotNull
    @Override
    public ListIterator<T> listIterator(final int index) {
        return this.wrapped.listIterator(index);
    }
    
    @NotNull
    @Override
    public List<T> subList(final int fromIndex, final int toIndex) {
        return this.wrapped.subList(fromIndex, toIndex);
    }
    
    private final void update(final ObservableListEvent<T> event) {
        this.setChanged();
        this.notifyObservers(event);
    }
    
    @Override
    public boolean add(final T element) {
        if (this.wrapped.add(element)) {
            this.update(new ObservableAddEvent<T>((kotlin.collections.IndexedValue<? extends T>)ObservableListKt.withIndex(element, CollectionsKt.getLastIndex((List)this.wrapped))));
            return true;
        }
        return false;
    }
    
    @Override
    public void add(final int index, final T element) {
        this.wrapped.add(index, element);
        this.update(new ObservableAddEvent<T>((kotlin.collections.IndexedValue<? extends T>)ObservableListKt.withIndex(element, index)));
    }
    
    @Override
    public boolean remove(final Object element) {
        final int index = this.wrapped.indexOf(element);
        if (index != -1) {
            this.wrapped.remove(index);
            this.update(new ObservableRemoveEvent<T>((kotlin.collections.IndexedValue<? extends T>)ObservableListKt.withIndex(element, index)));
            return true;
        }
        return false;
    }
    
    @Override
    public boolean addAll(@NotNull final Collection<? extends T> elements) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "elements"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getfield        gg/essential/elementa/utils/ObservableList.wrapped:Ljava/util/List;
        //    10: invokeinterface java/util/List.size:()I
        //    15: istore_2        /* size */
        //    16: aload_0         /* this */
        //    17: getfield        gg/essential/elementa/utils/ObservableList.wrapped:Ljava/util/List;
        //    20: aload_1         /* elements */
        //    21: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //    26: ifeq            123
        //    29: aload_1         /* elements */
        //    30: checkcast       Ljava/lang/Iterable;
        //    33: astore_3        /* $this$forEachIndexed$iv */
        //    34: iconst_0       
        //    35: istore          $i$f$forEachIndexed
        //    37: iconst_0       
        //    38: istore          index$iv
        //    40: aload_3         /* $this$forEachIndexed$iv */
        //    41: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    46: astore          6
        //    48: aload           6
        //    50: invokeinterface java/util/Iterator.hasNext:()Z
        //    55: ifeq            120
        //    58: aload           6
        //    60: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    65: astore          item$iv
        //    67: iload           index$iv
        //    69: iinc            index$iv, 1
        //    72: istore          8
        //    74: iload           8
        //    76: ifge            82
        //    79: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //    82: iload           8
        //    84: aload           item$iv
        //    86: astore          9
        //    88: istore          i
        //    90: iconst_0       
        //    91: istore          $i$a$-forEachIndexed-ObservableList$addAll$1
        //    93: aload_0         /* this */
        //    94: new             Lgg/essential/elementa/utils/ObservableAddEvent;
        //    97: dup            
        //    98: aload           element
        //   100: iload           i
        //   102: iload_2         /* size */
        //   103: iadd           
        //   104: invokestatic    gg/essential/elementa/utils/ObservableListKt.withIndex:(Ljava/lang/Object;I)Lkotlin/collections/IndexedValue;
        //   107: invokespecial   gg/essential/elementa/utils/ObservableAddEvent.<init>:(Lkotlin/collections/IndexedValue;)V
        //   110: checkcast       Lgg/essential/elementa/utils/ObservableListEvent;
        //   113: invokespecial   gg/essential/elementa/utils/ObservableList.update:(Lgg/essential/elementa/utils/ObservableListEvent;)V
        //   116: nop            
        //   117: goto            48
        //   120: nop            
        //   121: iconst_1       
        //   122: ireturn        
        //   123: iconst_0       
        //   124: ireturn        
        //    Signature:
        //  (Ljava/util/Collection<+TT;>;)Z
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  elements  
        //    StackMapTable: 00 04 FF 00 30 00 07 07 00 02 07 00 A9 01 07 00 A6 01 01 07 00 AB 00 00 FD 00 21 07 00 B7 01 F9 00 25 FF 00 02 00 03 07 00 02 07 00 A9 01 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public boolean addAll(final int index, @NotNull final Collection<? extends T> elements) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "elements"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getfield        gg/essential/elementa/utils/ObservableList.wrapped:Ljava/util/List;
        //    10: iload_1         /* index */
        //    11: aload_2         /* elements */
        //    12: invokeinterface java/util/List.addAll:(ILjava/util/Collection;)Z
        //    17: ifeq            114
        //    20: aload_2         /* elements */
        //    21: checkcast       Ljava/lang/Iterable;
        //    24: astore_3        /* $this$forEachIndexed$iv */
        //    25: iconst_0       
        //    26: istore          $i$f$forEachIndexed
        //    28: iconst_0       
        //    29: istore          index$iv
        //    31: aload_3         /* $this$forEachIndexed$iv */
        //    32: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    37: astore          6
        //    39: aload           6
        //    41: invokeinterface java/util/Iterator.hasNext:()Z
        //    46: ifeq            111
        //    49: aload           6
        //    51: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    56: astore          item$iv
        //    58: iload           index$iv
        //    60: iinc            index$iv, 1
        //    63: istore          8
        //    65: iload           8
        //    67: ifge            73
        //    70: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //    73: iload           8
        //    75: aload           item$iv
        //    77: astore          9
        //    79: istore          i
        //    81: iconst_0       
        //    82: istore          $i$a$-forEachIndexed-ObservableList$addAll$2
        //    84: aload_0         /* this */
        //    85: new             Lgg/essential/elementa/utils/ObservableAddEvent;
        //    88: dup            
        //    89: aload           element
        //    91: iload           i
        //    93: iload_1         /* index */
        //    94: iadd           
        //    95: invokestatic    gg/essential/elementa/utils/ObservableListKt.withIndex:(Ljava/lang/Object;I)Lkotlin/collections/IndexedValue;
        //    98: invokespecial   gg/essential/elementa/utils/ObservableAddEvent.<init>:(Lkotlin/collections/IndexedValue;)V
        //   101: checkcast       Lgg/essential/elementa/utils/ObservableListEvent;
        //   104: invokespecial   gg/essential/elementa/utils/ObservableList.update:(Lgg/essential/elementa/utils/ObservableListEvent;)V
        //   107: nop            
        //   108: goto            39
        //   111: nop            
        //   112: iconst_1       
        //   113: ireturn        
        //   114: iconst_0       
        //   115: ireturn        
        //    Signature:
        //  (ILjava/util/Collection<+TT;>;)Z
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  index     
        //  elements  
        //    StackMapTable: 00 04 FF 00 27 00 07 07 00 02 01 07 00 A9 07 00 A6 01 01 07 00 AB 00 00 FD 00 21 07 00 B7 01 F9 00 25 FF 00 02 00 03 07 00 02 01 07 00 A9 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public boolean removeAll(@NotNull final Collection<?> elements) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "elements"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* elements */
        //     7: checkcast       Ljava/lang/Iterable;
        //    10: astore_2       
        //    11: iconst_0       
        //    12: istore_3        /* initial$iv */
        //    13: iconst_0       
        //    14: istore          $i$f$fold
        //    16: iload_3         /* initial$iv */
        //    17: istore          accumulator$iv
        //    19: aload_2         /* $this$fold$iv */
        //    20: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    25: astore          6
        //    27: aload           6
        //    29: invokeinterface java/util/Iterator.hasNext:()Z
        //    34: ifeq            130
        //    37: aload           6
        //    39: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    44: astore          element$iv
        //    46: iload           accumulator$iv
        //    48: aload           element$iv
        //    50: astore          8
        //    52: istore          acc
        //    54: iconst_0       
        //    55: istore          $i$a$-fold-ObservableList$removeAll$1
        //    57: aload_0         /* this */
        //    58: getfield        gg/essential/elementa/utils/ObservableList.wrapped:Ljava/util/List;
        //    61: aload           element
        //    63: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //    68: istore          index
        //    70: iload           index
        //    72: iconst_m1      
        //    73: if_icmpeq       109
        //    76: aload_0         /* this */
        //    77: getfield        gg/essential/elementa/utils/ObservableList.wrapped:Ljava/util/List;
        //    80: iload           index
        //    82: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
        //    87: pop            
        //    88: aload_0         /* this */
        //    89: new             Lgg/essential/elementa/utils/ObservableRemoveEvent;
        //    92: dup            
        //    93: aload           element
        //    95: iload           index
        //    97: invokestatic    gg/essential/elementa/utils/ObservableListKt.withIndex:(Ljava/lang/Object;I)Lkotlin/collections/IndexedValue;
        //   100: invokespecial   gg/essential/elementa/utils/ObservableRemoveEvent.<init>:(Lkotlin/collections/IndexedValue;)V
        //   103: checkcast       Lgg/essential/elementa/utils/ObservableListEvent;
        //   106: invokespecial   gg/essential/elementa/utils/ObservableList.update:(Lgg/essential/elementa/utils/ObservableListEvent;)V
        //   109: iload           acc
        //   111: ifne            120
        //   114: iload           index
        //   116: iconst_m1      
        //   117: if_icmpeq       124
        //   120: iconst_1       
        //   121: goto            125
        //   124: iconst_0       
        //   125: istore          accumulator$iv
        //   127: goto            27
        //   130: iload           accumulator$iv
        //   132: ireturn        
        //    Signature:
        //  (Ljava/util/Collection<*>;)Z [from metadata: (Ljava/util/Collection<+Ljava/lang/Object;>;)Z]
        //  
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  elements  
        //    StackMapTable: 00 06 FF 00 1B 00 07 07 00 02 07 00 A9 07 00 A6 01 01 01 07 00 AB 00 00 FF 00 51 00 0C 07 00 02 07 00 A9 07 00 A6 01 01 01 07 00 AB 07 00 B7 07 00 B7 01 01 01 00 00 0A 03 40 01 FF 00 04 00 07 07 00 02 07 00 A9 07 00 A6 01 01 01 07 00 AB 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public boolean retainAll(@NotNull final Collection<?> elements) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "elements"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: aload_0         /* this */
        //     8: getfield        gg/essential/elementa/utils/ObservableList.wrapped:Ljava/util/List;
        //    11: checkcast       Ljava/lang/Iterable;
        //    14: astore_2       
        //    15: astore          11
        //    17: iconst_0       
        //    18: istore_3        /* $i$f$filter */
        //    19: aload_2         /* $this$filter$iv */
        //    20: astore          4
        //    22: new             Ljava/util/ArrayList;
        //    25: dup            
        //    26: invokespecial   java/util/ArrayList.<init>:()V
        //    29: checkcast       Ljava/util/Collection;
        //    32: astore          destination$iv$iv
        //    34: iconst_0       
        //    35: istore          $i$f$filterTo
        //    37: aload           $this$filterTo$iv$iv
        //    39: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    44: astore          7
        //    46: aload           7
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            104
        //    56: aload           7
        //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    63: astore          element$iv$iv
        //    65: aload           element$iv$iv
        //    67: astore          it
        //    69: iconst_0       
        //    70: istore          $i$a$-filter-ObservableList$retainAll$1
        //    72: aload_1         /* elements */
        //    73: aload           it
        //    75: invokeinterface java/util/Collection.contains:(Ljava/lang/Object;)Z
        //    80: ifne            87
        //    83: iconst_1       
        //    84: goto            88
        //    87: iconst_0       
        //    88: ifeq            46
        //    91: aload           destination$iv$iv
        //    93: aload           element$iv$iv
        //    95: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   100: pop            
        //   101: goto            46
        //   104: aload           destination$iv$iv
        //   106: checkcast       Ljava/util/List;
        //   109: nop            
        //   110: aload           11
        //   112: swap           
        //   113: checkcast       Ljava/util/Collection;
        //   116: invokevirtual   gg/essential/elementa/utils/ObservableList.removeAll:(Ljava/util/Collection;)Z
        //   119: ireturn        
        //    Signature:
        //  (Ljava/util/Collection<*>;)Z [from metadata: (Ljava/util/Collection<+Ljava/lang/Object;>;)Z]
        //  
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  elements  
        //    StackMapTable: 00 04 FF 00 2E 00 0C 07 00 02 07 00 A9 07 00 A6 01 07 00 A6 07 00 A9 01 07 00 AB 00 00 00 07 00 02 00 00 FF 00 28 00 0C 07 00 02 07 00 A9 07 00 A6 01 07 00 A6 07 00 A9 01 07 00 AB 07 00 B7 07 00 B7 01 07 00 02 00 00 40 01 FF 00 0F 00 0C 07 00 02 07 00 A9 07 00 A6 01 07 00 A6 07 00 A9 01 07 00 AB 00 00 00 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void sort(@Nullable final Comparator<? super T> c) {
        Collections.sort(this.wrapped, c);
    }
    
    @Override
    public void clear() {
        final List oldChildren = CollectionsKt.toList((Iterable)this.wrapped);
        this.wrapped.clear();
        this.update(new ObservableClearEvent<T>(oldChildren));
    }
    
    @Override
    public T set(final int index, final T element) {
        final Object it;
        final Object o = it = this.wrapped.set(index, element);
        final int n = 0;
        this.update(new ObservableRemoveEvent<T>((kotlin.collections.IndexedValue<? extends T>)ObservableListKt.withIndex(it, index)));
        this.update(new ObservableAddEvent<T>((kotlin.collections.IndexedValue<? extends T>)ObservableListKt.withIndex(element, index)));
        return (T)o;
    }
    
    public T removeAt(final int index) {
        final Object it;
        final Object o = it = this.wrapped.remove(index);
        final int n = 0;
        this.update(new ObservableRemoveEvent<T>((kotlin.collections.IndexedValue<? extends T>)ObservableListKt.withIndex(it, index)));
        return (T)o;
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.getSize();
    }
    
    @Override
    public final /* bridge */ T remove(final int index) {
        return this.removeAt(index);
    }
    
    @Override
    public <T> T[] toArray(final T[] array) {
        Intrinsics.checkNotNullParameter((Object)array, "array");
        return (T[])CollectionToArray.toArray((Collection)this, (Object[])array);
    }
    
    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray((Collection)this);
    }
}
