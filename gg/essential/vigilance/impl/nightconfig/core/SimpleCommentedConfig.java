package gg.essential.vigilance.impl.nightconfig.core;

import java.util.concurrent.*;
import java.util.*;
import java.util.function.*;

final class SimpleCommentedConfig extends AbstractCommentedConfig
{
    private final ConfigFormat<?> configFormat;
    
    SimpleCommentedConfig(final ConfigFormat<?> configFormat, final boolean concurrent) {
        super((Map<String, Object>)(concurrent ? new ConcurrentHashMap<Object, Object>() : new HashMap<Object, Object>()));
        this.configFormat = configFormat;
    }
    
    SimpleCommentedConfig(final Map<String, Object> valueMap, final ConfigFormat<?> configFormat) {
        super(valueMap);
        this.configFormat = configFormat;
    }
    
    SimpleCommentedConfig(final Supplier<Map<String, Object>> mapCreator, final ConfigFormat<?> configFormat) {
        super(mapCreator);
        this.configFormat = configFormat;
    }
    
    SimpleCommentedConfig(final UnmodifiableConfig toCopy, final ConfigFormat<?> configFormat, final boolean concurrent) {
        super(toCopy, concurrent);
        this.configFormat = configFormat;
    }
    
    public SimpleCommentedConfig(final UnmodifiableConfig toCopy, final Supplier<Map<String, Object>> mapCreator, final ConfigFormat<?> configFormat) {
        super(toCopy, mapCreator);
        this.configFormat = configFormat;
    }
    
    SimpleCommentedConfig(final UnmodifiableCommentedConfig toCopy, final ConfigFormat<?> configFormat, final boolean concurrent) {
        super(toCopy, concurrent);
        this.configFormat = configFormat;
    }
    
    public SimpleCommentedConfig(final UnmodifiableCommentedConfig toCopy, final Supplier<Map<String, Object>> mapCreator, final ConfigFormat<?> configFormat) {
        super(toCopy, mapCreator);
        this.configFormat = configFormat;
    }
    
    @Override
    public ConfigFormat<?> configFormat() {
        return this.configFormat;
    }
    
    @Override
    public SimpleCommentedConfig createSubConfig() {
        return new SimpleCommentedConfig(this.mapCreator, this.configFormat);
    }
    
    @Override
    public AbstractCommentedConfig clone() {
        return new SimpleCommentedConfig(this, this.mapCreator, this.configFormat);
    }
    
    @Override
    public /* bridge */ CommentedConfig createSubConfig() {
        return this.createSubConfig();
    }
    
    @Override
    public /* bridge */ Config createSubConfig() {
        return this.createSubConfig();
    }
    
    @Override
    public /* bridge */ AbstractConfig clone() {
        return this.clone();
    }
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.clone();
    }
}
