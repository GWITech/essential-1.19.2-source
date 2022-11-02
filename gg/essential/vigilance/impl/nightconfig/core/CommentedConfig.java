package gg.essential.vigilance.impl.nightconfig.core;

import java.util.*;
import java.util.function.*;
import gg.essential.vigilance.impl.nightconfig.core.utils.*;

public interface CommentedConfig extends UnmodifiableCommentedConfig, Config
{
    default String setComment(final String path, final String comment) {
        return this.setComment(StringUtils.split(path, '.'), comment);
    }
    
    String setComment(final List<String> p0, final String p1);
    
    default String removeComment(final String path) {
        return this.removeComment(StringUtils.split(path, '.'));
    }
    
    String removeComment(final List<String> p0);
    
    void clearComments();
    
    default void putAllComments(final Map<String, UnmodifiableCommentedConfig.CommentNode> comments) {
        for (final Map.Entry<String, UnmodifiableCommentedConfig.CommentNode> entry : comments.entrySet()) {
            final String key = entry.getKey();
            final UnmodifiableCommentedConfig.CommentNode node = entry.getValue();
            final String comment = node.getComment();
            if (comment != null) {
                this.setComment(Collections.singletonList(key), comment);
            }
            final Map<String, UnmodifiableCommentedConfig.CommentNode> children = node.getChildren();
            if (children != null) {
                final CommentedConfig config = this.getRaw(Collections.singletonList(key));
                config.putAllComments(children);
            }
        }
    }
    
    default void putAllComments(final UnmodifiableCommentedConfig commentedConfig) {
        for (final UnmodifiableCommentedConfig.Entry entry : commentedConfig.entrySet()) {
            final String key = entry.getKey();
            final String comment = entry.getComment();
            if (comment != null) {
                this.setComment(Collections.singletonList(key), comment);
            }
            final Object value = entry.getValue();
            if (value instanceof UnmodifiableCommentedConfig) {
                final CommentedConfig config = this.getRaw(Collections.singletonList(key));
                config.putAllComments((UnmodifiableCommentedConfig)value);
            }
        }
    }
    
    default UnmodifiableCommentedConfig unmodifiable() {
        return (UnmodifiableCommentedConfig)new CommentedConfig.CommentedConfig$1(this);
    }
    
    default CommentedConfig checked() {
        return (CommentedConfig)new CheckedCommentedConfig(this);
    }
    
    Map<String, String> commentMap();
    
    Set<? extends Entry> entrySet();
    
    CommentedConfig createSubConfig();
    
    default CommentedConfig of(final ConfigFormat<? extends CommentedConfig> format) {
        return new SimpleCommentedConfig(format, false);
    }
    
    default CommentedConfig of(final Supplier<Map<String, Object>> mapCreator, final ConfigFormat<? extends CommentedConfig> format) {
        return new SimpleCommentedConfig(mapCreator, format);
    }
    
    default CommentedConfig ofConcurrent(final ConfigFormat<? extends CommentedConfig> format) {
        return new SimpleCommentedConfig(format, false);
    }
    
    default CommentedConfig inMemory() {
        return (CommentedConfig)InMemoryCommentedFormat.defaultInstance().createConfig();
    }
    
    default CommentedConfig inMemoryConcurrent() {
        return (CommentedConfig)InMemoryCommentedFormat.defaultInstance().createConcurrentConfig();
    }
    
    default CommentedConfig wrap(final Map<String, Object> map, final ConfigFormat<?> format) {
        return new SimpleCommentedConfig(map, format);
    }
    
    default CommentedConfig copy(final UnmodifiableConfig config) {
        return new SimpleCommentedConfig(config, config.configFormat(), false);
    }
    
    default CommentedConfig copy(final UnmodifiableConfig config, final Supplier<Map<String, Object>> mapCreator) {
        return new SimpleCommentedConfig(config, mapCreator, config.configFormat());
    }
    
    default CommentedConfig copy(final UnmodifiableConfig config, final ConfigFormat<?> format) {
        return new SimpleCommentedConfig(config, format, false);
    }
    
    default CommentedConfig copy(final UnmodifiableConfig config, final Supplier<Map<String, Object>> mapCreator, final ConfigFormat<?> format) {
        return new SimpleCommentedConfig(config, mapCreator, format);
    }
    
    default CommentedConfig copy(final UnmodifiableCommentedConfig config) {
        return new SimpleCommentedConfig(config, config.configFormat(), false);
    }
    
    default CommentedConfig copy(final UnmodifiableCommentedConfig config, final Supplier<Map<String, Object>> mapCreator) {
        return new SimpleCommentedConfig(config, mapCreator, config.configFormat());
    }
    
    default CommentedConfig copy(final UnmodifiableCommentedConfig config, final ConfigFormat<?> format) {
        return new SimpleCommentedConfig(config, format, false);
    }
    
    default CommentedConfig copy(final UnmodifiableCommentedConfig config, final Supplier<Map<String, Object>> mapCreator, final ConfigFormat<? extends CommentedConfig> format) {
        return new SimpleCommentedConfig(config, mapCreator, format);
    }
    
    default CommentedConfig concurrentCopy(final UnmodifiableConfig config) {
        return new SimpleCommentedConfig(config, config.configFormat(), true);
    }
    
    default CommentedConfig concurrentCopy(final UnmodifiableConfig config, final ConfigFormat<?> format) {
        return new SimpleCommentedConfig(config, format, true);
    }
    
    default CommentedConfig concurrentCopy(final UnmodifiableCommentedConfig config) {
        return new SimpleCommentedConfig(config, config.configFormat(), true);
    }
    
    default CommentedConfig concurrentCopy(final UnmodifiableCommentedConfig config, final ConfigFormat<?> format) {
        return new SimpleCommentedConfig(config, format, true);
    }
    
    default CommentedConfig fake(final Config config) {
        if (config instanceof CommentedConfig) {
            return (CommentedConfig)config;
        }
        return (CommentedConfig)new FakeCommentedConfig(config);
    }
    
    default /* bridge */ Config createSubConfig() {
        return this.createSubConfig();
    }
    
    default /* bridge */ Config checked() {
        return this.checked();
    }
    
    default /* bridge */ UnmodifiableConfig unmodifiable() {
        return this.unmodifiable();
    }
    
    public interface Entry extends Config.Entry, UnmodifiableCommentedConfig.Entry
    {
        String setComment(final String p0);
        
        String removeComment();
    }
}
