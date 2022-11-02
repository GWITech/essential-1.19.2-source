package gg.essential.vigilance.impl.nightconfig.core;

import java.util.concurrent.*;
import gg.essential.vigilance.impl.nightconfig.core.utils.*;
import java.util.function.*;
import java.util.*;

public abstract class AbstractConfig implements Config, Cloneable
{
    protected final Supplier<Map<String, Object>> mapCreator;
    final Map<String, Object> map;
    
    public AbstractConfig(final boolean concurrent) {
        this(getDefaultMapCreator(concurrent));
    }
    
    public AbstractConfig(final Supplier<Map<String, Object>> mapCreator) {
        super();
        this.mapCreator = mapCreator;
        this.map = mapCreator.get();
    }
    
    public AbstractConfig(final Map<String, Object> map) {
        super();
        this.map = map;
        this.mapCreator = getDefaultMapCreator(map instanceof ConcurrentMap);
    }
    
    public AbstractConfig(final UnmodifiableConfig toCopy, final boolean concurrent) {
        this(toCopy, getDefaultMapCreator(concurrent));
    }
    
    public AbstractConfig(final UnmodifiableConfig toCopy, final Supplier<Map<String, Object>> mapCreator) {
        super();
        (this.map = mapCreator.get()).putAll(toCopy.valueMap());
        this.mapCreator = mapCreator;
    }
    
    protected static <T> Supplier<Map<String, T>> getDefaultMapCreator(final boolean concurrent) {
        return Config.getDefaultMapCreator(concurrent);
    }
    
    protected static <T> Supplier<Map<String, T>> getWildcardMapCreator(final Supplier<Map<String, Object>> mapCreator) {
        return (Supplier<Map<String, T>>)(() -> {
            final Map<String, Object> map = mapCreator.get();
            map.clear();
            return map;
        });
    }
    
    @Override
    public <T> T getRaw(final List<String> path) {
        final int lastIndex = path.size() - 1;
        final Map<String, Object> parentMap = this.getMap(path.subList(0, lastIndex));
        if (parentMap == null) {
            return null;
        }
        final String lastKey = path.get(lastIndex);
        return (T)parentMap.get(lastKey);
    }
    
    @Override
    public <T> T set(final List<String> path, final Object value) {
        final int lastIndex = path.size() - 1;
        final Map<String, Object> parentMap = this.getOrCreateMap(path.subList(0, lastIndex));
        final String lastKey = path.get(lastIndex);
        final Object nonNull = (value == null) ? NullObject.NULL_OBJECT : value;
        return (T)parentMap.put(lastKey, nonNull);
    }
    
    @Override
    public boolean add(final List<String> path, final Object value) {
        final int lastIndex = path.size() - 1;
        final Map<String, Object> parentMap = this.getOrCreateMap(path.subList(0, lastIndex));
        final String lastKey = path.get(lastIndex);
        final Object nonNull = (value == null) ? NullObject.NULL_OBJECT : value;
        return parentMap.putIfAbsent(lastKey, nonNull) == null;
    }
    
    @Override
    public <T> T remove(final List<String> path) {
        final int lastIndex = path.size() - 1;
        final Map<String, Object> parentMap = this.getMap(path.subList(0, lastIndex));
        if (parentMap == null) {
            return null;
        }
        final String lastKey = path.get(lastIndex);
        return (T)parentMap.remove(lastKey);
    }
    
    @Override
    public boolean contains(final List<String> path) {
        final int lastIndex = path.size() - 1;
        final Map<String, Object> parentMap = this.getMap(path.subList(0, lastIndex));
        if (parentMap == null) {
            return false;
        }
        final String lastKey = path.get(lastIndex);
        return parentMap.containsKey(lastKey);
    }
    
    @Override
    public boolean isNull(final List<String> path) {
        final int lastIndex = path.size() - 1;
        final Map<String, Object> parentMap = this.getMap(path.subList(0, lastIndex));
        if (parentMap == null) {
            return false;
        }
        final String lastKey = path.get(lastIndex);
        final Object value = parentMap.get(lastKey);
        return value == NullObject.NULL_OBJECT;
    }
    
    private Map<String, Object> getOrCreateMap(final List<String> path) {
        Map<String, Object> currentMap = this.map;
        for (final String currentKey : path) {
            final Object currentValue = currentMap.get(currentKey);
            Config config;
            if (currentValue == null) {
                config = this.createSubConfig();
                currentMap.put(currentKey, config);
            }
            else {
                if (!(currentValue instanceof Config)) {
                    throw new IllegalArgumentException("Cannot add an element to an intermediary value of type: " + currentValue.getClass());
                }
                config = (Config)currentValue;
            }
            currentMap = config.valueMap();
        }
        return currentMap;
    }
    
    private Map<String, Object> getMap(final List<String> path) {
        Map<String, Object> currentMap = this.map;
        for (final String key : path) {
            final Object value = currentMap.get(key);
            if (!(value instanceof Config)) {
                return null;
            }
            currentMap = ((Config)value).valueMap();
        }
        return currentMap;
    }
    
    @Override
    public void clear() {
        this.map.clear();
    }
    
    @Override
    public int size() {
        return this.map.size();
    }
    
    @Override
    public Map<String, Object> valueMap() {
        return this.map;
    }
    
    @Override
    public Set<? extends Entry> entrySet() {
        return new TransformingSet<Object, Entry>(this.map.entrySet(), EntryWrapper::new, o -> null, o -> o);
    }
    
    public abstract AbstractConfig clone();
    
    @Override
    public int hashCode() {
        return this.map.hashCode();
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractConfig)) {
            return false;
        }
        final AbstractConfig other = (AbstractConfig)obj;
        return this.map.equals(other.map);
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ':' + this.valueMap();
    }
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.clone();
    }
    
    private static /* synthetic */ Object lambda$entrySet$2(final Object o) {
        return o;
    }
    
    private static /* synthetic */ Map.Entry lambda$entrySet$1(final EntryWrapper o) {
        return null;
    }
    
    private static /* synthetic */ Map lambda$getWildcardMapCreator$0(final Supplier mapCreator) {
        final Map<String, Object> map = mapCreator.get();
        map.clear();
        return map;
    }
    
    protected static class EntryWrapper implements Entry
    {
        protected final Map.Entry<String, Object> mapEntry;
        
        public EntryWrapper(final Map.Entry<String, Object> mapEntry) {
            super();
            this.mapEntry = mapEntry;
        }
        
        @Override
        public String getKey() {
            return this.mapEntry.getKey();
        }
        
        @Override
        public <T> T getRawValue() {
            return (T)this.mapEntry.getValue();
        }
        
        @Override
        public <T> T setValue(final Object value) {
            return (T)this.mapEntry.setValue(value);
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof EntryWrapper) {
                final EntryWrapper other = (EntryWrapper)obj;
                return Objects.equals(this.getKey(), other.getKey()) && Objects.equals(this.getValue(), other.getValue());
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Objects.hashCode(this.getKey());
            result = 31 * result + Objects.hashCode(this.getValue());
            return result;
        }
    }
}
