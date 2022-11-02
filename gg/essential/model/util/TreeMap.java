package gg.essential.model.util;

import kotlin.jvm.internal.markers.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.collections.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import kotlin.comparisons.*;
import java.util.function.*;
import kotlinx.serialization.*;

@Serializable(with = TreeMapSerializer.class)
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 4*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u00014B\u001b\b\u0016\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0006B7\b\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\nJ!\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00028\u0001H\u0096\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J3\u0010%\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010(J!\u0010)\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0002\u0010\u001bJ\u0018\u0010*\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\u0012H\u0016J!\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0002\u0010\u001bJ\t\u0010.\u001a\u00020\u001dH\u0096\u0001J\r\u0010/\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u00100J!\u00101\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0002\u0010\u001bJ\b\u00102\u001a\u000203H\u0016R$\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u00065" }, d2 = { "Lgg/essential/model/util/TreeMap;", "K", "", "V", "", "map", "(Ljava/util/Map;)V", "list", "", "", "(Ljava/util/List;Ljava/util/Map;)V", "entries", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "ceilingEntry", "key", "(Ljava/lang/Comparable;)Ljava/util/Map$Entry;", "containsKey", "", "(Ljava/lang/Comparable;)Z", "containsValue", "value", "(Ljava/lang/Object;)Z", "equals", "other", "", "findEntry", "below", "inclusive", "(ZZLjava/lang/Comparable;)Ljava/util/Map$Entry;", "floorEntry", "get", "(Ljava/lang/Comparable;)Ljava/lang/Object;", "hashCode", "higherEntry", "isEmpty", "lastKey", "()Ljava/lang/Comparable;", "lowerEntry", "toString", "", "Companion", "cosmetics" })
public final class TreeMap<K extends Comparable<? super K>, V> implements Map<K, V>, KMappedMarker
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final List<Entry<K, V>> list;
    @NotNull
    private final Map<K, V> map;
    
    private TreeMap(final List<? extends Entry<? extends K, ? extends V>> list, final Map<K, ? extends V> map) {
        super();
        this.list = (List<Entry<K, V>>)list;
        this.map = (Map<K, V>)map;
    }
    
    TreeMap(final List p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Ljava/lang/Iterable;
        //     4: astore_3        /* $this$associate$iv */
        //     5: aload_3         /* $this$associate$iv */
        //     6: bipush          10
        //     8: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    11: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //    14: bipush          16
        //    16: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //    19: istore          capacity$iv
        //    21: aload_3         /* $this$associate$iv */
        //    22: astore          5
        //    24: new             Ljava/util/LinkedHashMap;
        //    27: dup            
        //    28: iload           capacity$iv
        //    30: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //    33: checkcast       Ljava/util/Map;
        //    36: astore          destination$iv$iv
        //    38: aload           $this$associateTo$iv$iv
        //    40: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    45: astore          7
        //    47: aload           7
        //    49: invokeinterface java/util/Iterator.hasNext:()Z
        //    54: ifeq            128
        //    57: aload           7
        //    59: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    64: astore          element$iv$iv
        //    66: aload           destination$iv$iv
        //    68: astore          9
        //    70: aload           element$iv$iv
        //    72: checkcast       Ljava/util/Map$Entry;
        //    75: astore          10
        //    77: aload           10
        //    79: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    84: checkcast       Ljava/lang/Comparable;
        //    87: astore          k
        //    89: aload           10
        //    91: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    96: astore          v
        //    98: aload           k
        //   100: aload           v
        //   102: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   105: astore          10
        //   107: aload           9
        //   109: aload           10
        //   111: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   114: aload           10
        //   116: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   119: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   124: pop            
        //   125: goto            47
        //   128: aload           destination$iv$iv
        //   130: astore_2       
        //   131: aload_0        
        //   132: aload_1        
        //   133: aload_2        
        //   134: invokespecial   gg/essential/model/util/TreeMap.<init>:(Ljava/util/List;Ljava/util/Map;)V
        //   137: return         
        //    StackMapTable: 00 02 FF 00 2F 00 08 06 07 00 77 00 00 00 00 07 00 07 07 00 79 00 00 FA 00 50
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public Set<Entry<K, V>> getEntries() {
        return this.map.entrySet();
    }
    
    @NotNull
    public Set<K> getKeys() {
        return this.map.keySet();
    }
    
    public int getSize() {
        return this.map.size();
    }
    
    @NotNull
    public Collection<V> getValues() {
        return this.map.values();
    }
    
    public boolean containsKey(@NotNull final K key) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        return this.map.containsKey(key);
    }
    
    @Override
    public boolean containsValue(final Object value) {
        return this.map.containsValue(value);
    }
    
    @Nullable
    public V get(@NotNull final K key) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        return this.map.get(key);
    }
    
    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }
    
    public TreeMap(@NotNull final Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter((Object)map, "map");
        final Iterable $this$sortedBy$iv = map.entrySet();
        this(CollectionsKt.sortedWith($this$sortedBy$iv, (Comparator)new Comparator() {
            public TreeMap$special$$inlined$sortedBy$1() {
                super();
            }
            
            @Override
            public final int compare(final T a, final T b) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: checkcast       Ljava/util/Map$Entry;
                //     4: astore_3        /* it */
                //     5: aload_3         /* it */
                //     6: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
                //    11: checkcast       Ljava/lang/Comparable;
                //    14: aload_2         /* b */
                //    15: checkcast       Ljava/util/Map$Entry;
                //    18: astore_3       
                //    19: astore          4
                //    21: aload_3         /* it */
                //    22: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
                //    27: checkcast       Ljava/lang/Comparable;
                //    30: aload           4
                //    32: swap           
                //    33: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
                //    36: ireturn        
                //    Signature:
                //  (TT;TT;)I
                //    MethodParameters:
                //  Name  Flags  
                //  ----  -----
                //  a     
                //  b     
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
        }));
    }
    
    @Nullable
    public final Entry<K, V> lowerEntry(@NotNull final K key) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        return this.findEntry(true, false, key);
    }
    
    @Nullable
    public final Entry<K, V> floorEntry(@NotNull final K key) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        return this.findEntry(true, true, key);
    }
    
    @Nullable
    public final Entry<K, V> ceilingEntry(@NotNull final K key) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        return this.findEntry(false, true, key);
    }
    
    @Nullable
    public final Entry<K, V> higherEntry(@NotNull final K key) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        return this.findEntry(false, false, key);
    }
    
    private final Entry<K, V> findEntry(final boolean below, final boolean inclusive, final K key) {
        if (this.list.isEmpty()) {
            return null;
        }
        final List $this$binarySearchBy_u24default$iv = this.list;
        final int toIndex$iv = $this$binarySearchBy_u24default$iv.size();
        final List $this$binarySearchBy$iv$iv = $this$binarySearchBy_u24default$iv;
        final int index = CollectionsKt.binarySearch($this$binarySearchBy$iv$iv, 0, toIndex$iv, (Function1)new Function1<Entry<? extends K, ? extends V>, Integer>(key) {
            final /* synthetic */ Comparable $key;
            
            public TreeMap$findEntry$$inlined$binarySearchBy$default$1(final Comparable $key) {
                this.$key = $key;
                super(1);
            }
            
            @NotNull
            public final Integer invoke(final Entry<? extends K, ? extends V> it) {
                final Entry it2 = it;
                return ComparisonsKt.compareValues((Comparable)it2.getKey(), this.$key);
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke(p1);
            }
        });
        final List<Entry<K, V>> list = this.list;
        int n;
        if (index >= 0) {
            n = (inclusive ? index : (below ? (index - 1) : (index + 1)));
        }
        else {
            final int insertionPoint = -index - 1;
            n = (below ? (insertionPoint - 1) : insertionPoint);
        }
        return (Entry)CollectionsKt.getOrNull((List)list, n);
    }
    
    @Nullable
    public final K lastKey() {
        final Entry entry = (Entry)CollectionsKt.lastOrNull((List)this.list);
        return (K)((entry != null) ? ((K)entry.getKey()) : null);
    }
    
    @NotNull
    @Override
    public String toString() {
        return this.map.toString();
    }
    
    @Override
    public int hashCode() {
        return this.map.hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        final TreeMap treeMap = (other instanceof TreeMap) ? ((TreeMap)other) : null;
        if (treeMap != null) {
            final List<Entry<K, V>> list = treeMap.list;
            if (list != null) {
                return list.equals(this.list);
            }
        }
        return false;
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> from) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public V remove(final Object key) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean remove(final Object key, final Object value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void replaceAll(final BiFunction<? super K, ? super V, ? extends V> p0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ Set<Entry<K, V>> entrySet() {
        return this.getEntries();
    }
    
    @Override
    public final /* bridge */ Set<K> keySet() {
        return this.getKeys();
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.getSize();
    }
    
    @Override
    public final /* bridge */ Collection<V> values() {
        return this.getValues();
    }
    
    @Override
    public final /* bridge */ boolean containsKey(final Object key) {
        return key instanceof Comparable && this.containsKey((K)key);
    }
    
    @Override
    public final /* bridge */ V get(final Object key) {
        if (!(key instanceof Comparable)) {
            return null;
        }
        return this.get((K)key);
    }
    
    @Override
    public /* bridge */ Object compute(final Object p0, final BiFunction p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object computeIfAbsent(final Object p0, final Function p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object computeIfPresent(final Object p0, final BiFunction p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object merge(final Object p0, final Object p1, final BiFunction p2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object put(final Object key, final Object value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object putIfAbsent(final Object p0, final Object p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ boolean replace(final Object p0, final Object p1, final Object p2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object replace(final Object p0, final Object p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u00050\u0004\"\u0004\b\u0002\u0010\u0006\"\u0004\b\u0003\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004H\u00c6\u0001¨\u0006\n" }, d2 = { "Lgg/essential/model/util/TreeMap$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/util/TreeMap;", "T0", "T1", "typeSerial0", "typeSerial1", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final <T0, T1> KSerializer<TreeMap<T0, T1>> serializer(@NotNull final KSerializer<T0> typeSerial0, @NotNull final KSerializer<T1> typeSerial1) {
            Intrinsics.checkNotNullParameter((Object)typeSerial0, "typeSerial0");
            Intrinsics.checkNotNullParameter((Object)typeSerial1, "typeSerial1");
            return (KSerializer<TreeMap<T0, T1>>)new TreeMapSerializer((kotlinx.serialization.KSerializer<Comparable>)typeSerial0, (kotlinx.serialization.KSerializer<Object>)typeSerial1);
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
