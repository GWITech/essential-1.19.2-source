package gg.essential.vigilance.impl.nightconfig.core.utils;

import java.util.*;
import gg.essential.vigilance.impl.nightconfig.core.*;

public abstract class UnmodifiableConfigWrapper<C extends UnmodifiableConfig> implements UnmodifiableConfig
{
    protected final C config;
    
    protected UnmodifiableConfigWrapper(final C config) {
        super();
        this.config = Objects.requireNonNull(config, "The wrapped config must not be null");
    }
    
    @Override
    public <T> T getRaw(final List<String> path) {
        return this.config.getRaw(path);
    }
    
    @Override
    public Map<String, Object> valueMap() {
        return this.config.valueMap();
    }
    
    @Override
    public Set<? extends Entry> entrySet() {
        return this.config.entrySet();
    }
    
    @Override
    public boolean contains(final List<String> path) {
        return this.config.contains(path);
    }
    
    @Override
    public int size() {
        return this.config.size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.config.isEmpty();
    }
    
    @Override
    public boolean equals(final Object obj) {
        return this.config.equals(obj);
    }
    
    @Override
    public int hashCode() {
        return this.config.hashCode();
    }
    
    @Override
    public ConfigFormat<?> configFormat() {
        return this.config.configFormat();
    }
}
