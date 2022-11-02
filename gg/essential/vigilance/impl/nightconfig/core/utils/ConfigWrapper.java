package gg.essential.vigilance.impl.nightconfig.core.utils;

import gg.essential.vigilance.impl.nightconfig.core.*;
import java.util.*;

public abstract class ConfigWrapper<C extends Config> extends UnmodifiableConfigWrapper<C> implements Config
{
    protected ConfigWrapper(final C config) {
        super(config);
    }
    
    @Override
    public Set<? extends Config.Entry> entrySet() {
        return this.config.entrySet();
    }
    
    @Override
    public <T> T set(final List<String> path, final Object value) {
        return this.config.set(path, value);
    }
    
    @Override
    public boolean add(final List<String> path, final Object value) {
        return this.config.add(path, value);
    }
    
    @Override
    public <T> T remove(final List<String> path) {
        return this.config.remove(path);
    }
    
    @Override
    public void clear() {
        this.config.clear();
    }
    
    @Override
    public Config createSubConfig() {
        return this.config.createSubConfig();
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ':' + this.config;
    }
}
