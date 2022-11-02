package gg.essential.util;

import kotlin.jvm.internal.markers.*;
import kotlin.jvm.internal.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000P
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010#
                                                   \u0002\u0010'
                                                   \u0002\b\u0005
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u001f
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u000b
                                                   \u0002\u0010$
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u0005B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00028\u0001H\u0096\u0001¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010 J	\u0010!\u001a\u00020\u001aH\u0096\u0001J\u001f\u0010"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010#J\u001f\u0010$\u001a\u00020\u00182\u0014\u0010%\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0096\u0001J\u0017\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u001c\u0010(\u001a\u00020\u00182\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*H\u0002R$\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010
                                                   0	X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000	X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0012\u0010\u000f\u001a\u00020\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006+""" }, d2 = { "Lgg/essential/util/SimpleObservableMap;", "K", "V", "", "", "Ljava/util/Observable;", "wrapped", "(Ljava/util/Map;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "update", "event", "Lgg/essential/util/ObservableMapEvent;", "essential" })
public final class SimpleObservableMap<K, V> extends Observable implements Map<K, V>, KMutableMap
{
    @NotNull
    private final Map<K, V> wrapped;
    
    public SimpleObservableMap(@NotNull final Map<K, V> wrapped) {
        Intrinsics.checkNotNullParameter((Object)wrapped, "wrapped");
        super();
        this.wrapped = wrapped;
    }
    
    @NotNull
    public Set<Entry<K, V>> getEntries() {
        return this.wrapped.entrySet();
    }
    
    @NotNull
    public Set<K> getKeys() {
        return this.wrapped.keySet();
    }
    
    public int getSize() {
        return this.wrapped.size();
    }
    
    @NotNull
    public Collection<V> getValues() {
        return this.wrapped.values();
    }
    
    @Override
    public boolean containsKey(final Object key) {
        return this.wrapped.containsKey(key);
    }
    
    @Override
    public boolean containsValue(@Nullable final Object value) {
        return value != null && this.wrapped.containsValue(value);
    }
    
    @Nullable
    @Override
    public V get(final Object key) {
        return this.wrapped.get(key);
    }
    
    @Override
    public boolean isEmpty() {
        return this.wrapped.isEmpty();
    }
    
    @Override
    public void putAll(@NotNull final Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter((Object)from, "from");
        this.wrapped.putAll(from);
    }
    
    private final void update(final ObservableMapEvent<K, V> event) {
        this.setChanged();
        this.notifyObservers(event);
    }
    
    @Override
    public void clear() {
        this.wrapped.clear();
        this.update(new ObservableMapEvent.Clear<K, V>());
    }
    
    @Nullable
    @Override
    public V put(final K key, @NotNull final V value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        final Object it;
        final Object o = it = this.wrapped.put(key, value);
        if (it != value) {
            if (it != null) {
                this.update((ObservableMapEvent<K, V>)new ObservableMapEvent$Remove(TuplesKt.to((Object)key, it)));
            }
            this.update((ObservableMapEvent<K, V>)new ObservableMapEvent$Add(TuplesKt.to((Object)key, (Object)value)));
        }
        return (V)o;
    }
    
    @Nullable
    @Override
    public V remove(final Object key) {
        final Object it;
        final Object o = it = this.wrapped.remove(key);
        if (it != null) {
            this.update((ObservableMapEvent<K, V>)new ObservableMapEvent$Remove(TuplesKt.to(key, it)));
        }
        return (V)o;
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
}
