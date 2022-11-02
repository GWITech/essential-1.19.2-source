package gg.essential.vigilance.impl.nightconfig.core;

import java.util.*;
import gg.essential.vigilance.impl.nightconfig.core.utils.*;

public interface UnmodifiableCommentedConfig extends UnmodifiableConfig
{
    default String getComment(final String path) {
        return this.getComment(StringUtils.split(path, '.'));
    }
    
    String getComment(final List<String> p0);
    
    default Optional<String> getOptionalComment(final String path) {
        return this.getOptionalComment(StringUtils.split(path, '.'));
    }
    
    default Optional<String> getOptionalComment(final List<String> path) {
        return Optional.ofNullable(this.getComment(path));
    }
    
    default boolean containsComment(final String path) {
        return this.containsComment(StringUtils.split(path, '.'));
    }
    
    boolean containsComment(final List<String> p0);
    
    Map<String, String> commentMap();
    
    default Map<String, UnmodifiableCommentedConfig.CommentNode> getComments() {
        final Map<String, UnmodifiableCommentedConfig.CommentNode> map = new HashMap<String, UnmodifiableCommentedConfig.CommentNode>();
        this.getComments(map);
        return map;
    }
    
    default void getComments(final Map<String, UnmodifiableCommentedConfig.CommentNode> destination) {
        for (final Entry entry : this.entrySet()) {
            final String key = entry.getKey();
            final String comment = entry.getComment();
            final Object value = entry.getValue();
            if (comment != null || value instanceof UnmodifiableCommentedConfig) {
                final Map<String, UnmodifiableCommentedConfig.CommentNode> children = (value instanceof UnmodifiableCommentedConfig) ? ((UnmodifiableCommentedConfig)value).getComments() : null;
                final UnmodifiableCommentedConfig.CommentNode node = new UnmodifiableCommentedConfig.CommentNode(comment, (Map)children);
                destination.put(key, node);
            }
        }
    }
    
    Set<? extends Entry> entrySet();
    
    default UnmodifiableCommentedConfig fake(final UnmodifiableConfig config) {
        if (config instanceof UnmodifiableCommentedConfig) {
            return (UnmodifiableCommentedConfig)config;
        }
        return (UnmodifiableCommentedConfig)new FakeUnmodifiableCommentedConfig(config);
    }
    
    public interface Entry extends UnmodifiableConfig.Entry
    {
        String getComment();
    }
}
