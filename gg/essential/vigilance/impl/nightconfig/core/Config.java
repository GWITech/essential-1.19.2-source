package gg.essential.vigilance.impl.nightconfig.core;

import gg.essential.vigilance.impl.nightconfig.core.utils.*;
import java.util.function.*;
import java.util.concurrent.*;
import java.util.*;

public interface Config extends UnmodifiableConfig
{
    default <T> T set(final String path, final Object value) {
        return this.set(StringUtils.split(path, '.'), value);
    }
    
     <T> T set(final List<String> p0, final Object p1);
    
    boolean add(final List<String> p0, final Object p1);
    
    default boolean add(final String path, final Object value) {
        return this.add(StringUtils.split(path, '.'), value);
    }
    
    default void addAll(final UnmodifiableConfig config) {
        for (final UnmodifiableConfig.Entry ue : config.entrySet()) {
            final List<String> key = Collections.singletonList(ue.getKey());
            final Object value = ue.getRawValue();
            final boolean existed = !this.add(key, value);
            if (!existed || value instanceof UnmodifiableConfig) {}
        }
    }
    
    default void putAll(final UnmodifiableConfig config) {
        this.valueMap().putAll(config.valueMap());
    }
    
    default <T> T remove(final String path) {
        return this.remove(StringUtils.split(path, '.'));
    }
    
     <T> T remove(final List<String> p0);
    
    default void removeAll(final UnmodifiableConfig config) {
        this.valueMap().keySet().removeAll(config.valueMap().keySet());
    }
    
    void clear();
    
    default UnmodifiableConfig unmodifiable() {
        return (UnmodifiableConfig)new Config.Config$1(this);
    }
    
    default Config checked() {
        return (Config)new CheckedConfig(this);
    }
    
    Map<String, Object> valueMap();
    
    Set<? extends Entry> entrySet();
    
    Config createSubConfig();
    
    default void update(final String path, final Object value) {
        this.set(path, value);
    }
    
    default void update(final List<String> path, final Object value) {
        this.set(path, value);
    }
    
    default Config of(final ConfigFormat<? extends Config> format) {
        return (Config)new SimpleConfig((ConfigFormat)format, false);
    }
    
    default Config of(final Supplier<Map<String, Object>> mapCreator, final ConfigFormat<?> format) {
        return (Config)new SimpleConfig((Supplier)mapCreator, (ConfigFormat)format);
    }
    
    default Config ofConcurrent(final ConfigFormat<? extends Config> format) {
        return (Config)new SimpleConfig((ConfigFormat)format, true);
    }
    
    default Config inMemory() {
        return InMemoryFormat.defaultInstance().createConfig();
    }
    
    default Config inMemoryUniversal() {
        return InMemoryFormat.withUniversalSupport().createConfig();
    }
    
    default Config inMemoryConcurrent() {
        return InMemoryFormat.defaultInstance().createConcurrentConfig();
    }
    
    default Config inMemoryUniversalConcurrent() {
        return InMemoryFormat.withUniversalSupport().createConcurrentConfig();
    }
    
    default Config wrap(final Map<String, Object> map, final ConfigFormat<?> format) {
        return (Config)new SimpleConfig((Map)map, (ConfigFormat)format);
    }
    
    default Config copy(final UnmodifiableConfig config) {
        return (Config)new SimpleConfig(config, (ConfigFormat)config.configFormat(), false);
    }
    
    default Config copy(final UnmodifiableConfig config, final Supplier<Map<String, Object>> mapCreator) {
        return (Config)new SimpleConfig(config, (Supplier)mapCreator, (ConfigFormat)config.configFormat());
    }
    
    default Config copy(final UnmodifiableConfig config, final ConfigFormat<?> format) {
        return (Config)new SimpleConfig(config, (ConfigFormat)format, false);
    }
    
    default Config copy(final UnmodifiableConfig config, final Supplier<Map<String, Object>> mapCreator, final ConfigFormat<?> format) {
        return (Config)new SimpleConfig(config, (Supplier)mapCreator, (ConfigFormat)format);
    }
    
    default Config concurrentCopy(final UnmodifiableConfig config) {
        return (Config)new SimpleConfig(config, (ConfigFormat)config.configFormat(), true);
    }
    
    default Config concurrentCopy(final UnmodifiableConfig config, final ConfigFormat<?> format) {
        return (Config)new SimpleConfig(config, (ConfigFormat)format, true);
    }
    
    default boolean isInsertionOrderPreserved() {
        final String prop = System.getProperty("nightconfig.preserveInsertionOrder");
        return prop != null && (prop.equals("true") || prop.equals("1"));
    }
    
    default void setInsertionOrderPreserved(final boolean orderPreserved) {
        System.setProperty("nightconfig.preserveInsertionOrder", orderPreserved ? "true" : "false");
    }
    
    default <T> Supplier<Map<String, T>> getDefaultMapCreator(final boolean concurrent, final boolean insertionOrderPreserved) {
        if (insertionOrderPreserved) {
            return (Supplier<Map<String, T>>)(concurrent ? (() -> Collections.synchronizedMap(new LinkedHashMap<Object, Object>())) : LinkedHashMap::new);
        }
        return (Supplier<Map<String, T>>)(concurrent ? ConcurrentHashMap::new : HashMap::new);
    }
    
    default <T> Supplier<Map<String, T>> getDefaultMapCreator(final boolean concurrent) {
        return getDefaultMapCreator(concurrent, isInsertionOrderPreserved());
    }
    
    default /* synthetic */ Map lambda$getDefaultMapCreator$0() {
        return Collections.synchronizedMap(new LinkedHashMap<Object, Object>());
    }
    
    public interface Entry extends UnmodifiableConfig.Entry
    {
         <T> T setValue(final Object p0);
    }
}
