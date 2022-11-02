package gg.essential.vigilance.impl.nightconfig.core.utils;

import java.util.function.*;
import java.util.*;

public final class ObservedMap<K, V> extends AbstractObserved implements Map<K, V>
{
    private final Map<K, V> map;
    
    public ObservedMap(final Map<K, V> map, final Runnable callback) {
        super(callback);
        this.map = map;
    }
    
    @Override
    public int size() {
        return this.map.size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }
    
    @Override
    public boolean containsKey(final Object key) {
        return this.map.containsKey(key);
    }
    
    @Override
    public boolean containsValue(final Object value) {
        return this.map.containsValue(value);
    }
    
    @Override
    public V get(final Object key) {
        return this.map.get(key);
    }
    
    @Override
    public V put(final K key, final V value) {
        final V result = this.map.put(key, value);
        this.callback.run();
        return result;
    }
    
    @Override
    public V remove(final Object key) {
        final V result = this.map.remove(key);
        this.callback.run();
        return result;
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> m) {
        this.map.putAll(m);
        this.callback.run();
    }
    
    @Override
    public void replaceAll(final BiFunction<? super K, ? super V, ? extends V> function) {
        this.map.replaceAll(function);
        this.callback.run();
    }
    
    @Override
    public V putIfAbsent(final K key, final V value) {
        final V result = this.map.putIfAbsent(key, value);
        if (result != value) {
            this.callback.run();
        }
        return result;
    }
    
    @Override
    public boolean remove(final Object key, final Object value) {
        final boolean removed = this.map.remove(key, value);
        if (removed) {
            this.callback.run();
        }
        return removed;
    }
    
    @Override
    public boolean replace(final K key, final V oldValue, final V newValue) {
        final boolean replaced = this.map.replace(key, oldValue, newValue);
        if (replaced) {
            this.callback.run();
        }
        return replaced;
    }
    
    @Override
    public V replace(final K key, final V value) {
        final V result = this.map.replace(key, value);
        if (result != value) {
            this.callback.run();
        }
        return result;
    }
    
    @Override
    public V computeIfAbsent(final K key, final Function<? super K, ? extends V> mappingFunction) {
        final V result = this.map.computeIfAbsent(key, mappingFunction);
        if (result != null) {
            this.callback.run();
        }
        return result;
    }
    
    @Override
    public V computeIfPresent(final K key, final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        final V result = this.map.computeIfPresent(key, remappingFunction);
        this.callback.run();
        return result;
    }
    
    @Override
    public V compute(final K key, final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        final V result = this.map.compute(key, remappingFunction);
        this.callback.run();
        return result;
    }
    
    @Override
    public V merge(final K key, final V value, final BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        final V result = this.map.merge(key, value, remappingFunction);
        this.callback.run();
        return result;
    }
    
    @Override
    public void clear() {
        this.map.clear();
        this.callback.run();
    }
    
    @Override
    public Set<K> keySet() {
        return (Set<K>)new ObservedSet((Set)this.map.keySet(), this.callback);
    }
    
    @Override
    public Collection<V> values() {
        return this.map.values();
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        final Function<Entry<K, V>, ObservedEntry<K, V>> readT = (Function<Entry<K, V>, ObservedEntry<K, V>>)(e -> new ObservedEntry(e, this.callback));
        final Function<ObservedEntry<K, V>, Entry<K, V>> writeT = (Function<ObservedEntry<K, V>, Entry<K, V>>)(oe -> oe.entry);
        final Function<Object, Object> searchT = o -> {
            if (o instanceof ObservedEntry) {
                final ObservedEntry<?, ?> observedEntry2 = (ObservedEntry<?, ?>)o;
                return observedEntry2.entry;
            }
            else {
                return o;
            }
        };
        final TransformingSet<Entry<K, V>, ObservedEntry<K, V>> tset = new TransformingSet<Entry<K, V>, ObservedEntry<K, V>>(this.map.entrySet(), readT, writeT, searchT);
        return (Set<Entry<K, V>>)new ObservedSet((Set)this.map.entrySet(), this.callback);
    }
    
    @Override
    public boolean equals(final Object obj) {
        return this.map.equals(obj);
    }
    
    @Override
    public int hashCode() {
        return this.map.hashCode();
    }
    
    private static /* synthetic */ Object lambda$entrySet$2(final Object o) {
        if (o instanceof ObservedEntry) {
            final ObservedEntry<?, ?> observedEntry = (ObservedEntry<?, ?>)o;
            return observedEntry.entry;
        }
        return o;
    }
    
    private static /* synthetic */ Entry lambda$entrySet$1(final ObservedEntry oe) {
        return oe.entry;
    }
    
    private /* synthetic */ ObservedEntry lambda$entrySet$0(final Entry e) {
        return new ObservedEntry(e, this.callback);
    }
}
