package gg.essential.vigilance.impl.nightconfig.core;

import java.util.function.*;
import java.util.concurrent.*;
import gg.essential.vigilance.impl.nightconfig.core.utils.*;
import java.util.*;

public abstract class AbstractCommentedConfig extends AbstractConfig implements CommentedConfig
{
    private final Map<String, String> commentMap;
    
    public AbstractCommentedConfig(final boolean concurrent) {
        super(concurrent);
        this.commentMap = getDefaultCommentMap(concurrent);
    }
    
    public AbstractCommentedConfig(final Supplier<Map<String, Object>> mapCreator) {
        super(mapCreator);
        this.commentMap = (Map)AbstractConfig.getWildcardMapCreator(mapCreator).get();
    }
    
    public AbstractCommentedConfig(final Map<String, Object> valuesMap) {
        super(valuesMap);
        this.commentMap = getDefaultCommentMap(valuesMap instanceof ConcurrentMap);
    }
    
    public AbstractCommentedConfig(final UnmodifiableConfig toCopy, final boolean concurrent) {
        super(toCopy, concurrent);
        this.commentMap = getDefaultCommentMap(concurrent);
    }
    
    public AbstractCommentedConfig(final UnmodifiableConfig toCopy, final Supplier<Map<String, Object>> mapCreator) {
        super(toCopy, mapCreator);
        this.commentMap = (Map)AbstractConfig.getWildcardMapCreator(mapCreator).get();
    }
    
    public AbstractCommentedConfig(final UnmodifiableCommentedConfig toCopy, final boolean concurrent) {
        super(toCopy, concurrent);
        (this.commentMap = getDefaultCommentMap(concurrent)).putAll(toCopy.commentMap());
    }
    
    public AbstractCommentedConfig(final UnmodifiableCommentedConfig toCopy, final Supplier<Map<String, Object>> mapCreator) {
        super(toCopy, mapCreator);
        this.commentMap = (Map)AbstractConfig.getWildcardMapCreator(mapCreator).get();
    }
    
    protected static Map<String, String> getDefaultCommentMap(final boolean concurrent) {
        return (Map)AbstractConfig.getDefaultMapCreator(concurrent).get();
    }
    
    @Override
    public String getComment(final List<String> path) {
        final int lastIndex = path.size() - 1;
        final String lastKey = path.get(lastIndex);
        if (lastIndex == 0) {
            return this.commentMap.get(lastKey);
        }
        final Object parent = this.getRaw(path.subList(0, lastIndex));
        if (parent instanceof UnmodifiableCommentedConfig) {
            final List<String> lastPath = Collections.singletonList(lastKey);
            return ((UnmodifiableCommentedConfig)parent).getComment(lastPath);
        }
        return null;
    }
    
    @Override
    public String setComment(final List<String> path, final String comment) {
        final int lastIndex = path.size() - 1;
        final String lastKey = path.get(lastIndex);
        if (lastIndex == 0) {
            return this.commentMap.put(lastKey, comment);
        }
        final List<String> parentPath = path.subList(0, lastIndex);
        final Object parent = this.getRaw(parentPath);
        final List<String> lastPath = Collections.singletonList(lastKey);
        if (parent instanceof CommentedConfig) {
            return ((CommentedConfig)parent).setComment(lastPath, comment);
        }
        if (parent == null) {
            final CommentedConfig commentedParent = this.createSubConfig();
            this.set(parentPath, commentedParent);
            return commentedParent.setComment(lastPath, comment);
        }
        throw new IllegalArgumentException("Cannot set a comment to path " + path + " because the parent entry is of incompatible type " + parent.getClass());
    }
    
    @Override
    public String removeComment(final List<String> path) {
        final int lastIndex = path.size() - 1;
        final String lastKey = path.get(lastIndex);
        if (lastIndex == 0) {
            return this.commentMap.remove(lastKey);
        }
        final Object parent = this.getRaw(path.subList(0, lastIndex));
        if (parent instanceof CommentedConfig) {
            final List<String> lastPath = Collections.singletonList(lastKey);
            return ((CommentedConfig)parent).removeComment(lastPath);
        }
        return null;
    }
    
    @Override
    public boolean containsComment(final List<String> path) {
        final int lastIndex = path.size() - 1;
        final String lastKey = path.get(lastIndex);
        if (lastIndex == 0) {
            return this.commentMap.containsKey(lastKey);
        }
        final Object parent = this.getRaw(path.subList(0, lastIndex));
        if (parent instanceof CommentedConfig) {
            final List<String> lastPath = Collections.singletonList(lastKey);
            return ((CommentedConfig)parent).containsComment(lastPath);
        }
        return false;
    }
    
    @Override
    public Map<String, String> commentMap() {
        return this.commentMap;
    }
    
    @Override
    public Set<? extends CommentedConfig.Entry> entrySet() {
        return new TransformingSet<Object, CommentedConfig.Entry>(this.map.entrySet(), x$0 -> new CommentedEntryWrapper(x$0), o -> null, o -> o);
    }
    
    @Override
    public abstract AbstractCommentedConfig clone();
    
    @Override
    public void clear() {
        super.clear();
        this.clearComments();
    }
    
    @Override
    public void clearComments() {
        this.commentMap.clear();
        for (final Object o : this.map.values()) {
            if (o instanceof CommentedConfig) {
                ((CommentedConfig)o).clearComments();
            }
        }
    }
    
    @Override
    public /* bridge */ AbstractConfig clone() {
        return this.clone();
    }
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.clone();
    }
    
    private static /* synthetic */ Object lambda$entrySet$2(final Object o) {
        return o;
    }
    
    private static /* synthetic */ Map.Entry lambda$entrySet$1(final CommentedEntryWrapper o) {
        return null;
    }
    
    private /* synthetic */ CommentedEntryWrapper lambda$entrySet$0(final Map.Entry x$0) {
        return new CommentedEntryWrapper(x$0);
    }
    
    protected class CommentedEntryWrapper extends EntryWrapper implements CommentedConfig.Entry
    {
        private List<String> path;
        final /* synthetic */ AbstractCommentedConfig this$0;
        
        public CommentedEntryWrapper(final AbstractCommentedConfig this$0, final Map.Entry<String, Object> mapEntry) {
            this.this$0 = this$0;
            super(mapEntry);
            this.path = null;
        }
        
        protected List<String> getPath() {
            if (this.path == null) {
                this.path = Collections.singletonList(this.getKey());
            }
            return this.path;
        }
        
        @Override
        public String getComment() {
            return this.this$0.getComment(this.getPath());
        }
        
        @Override
        public String setComment(final String comment) {
            return this.this$0.setComment(this.getPath(), comment);
        }
        
        @Override
        public String removeComment() {
            return this.this$0.removeComment(this.getPath());
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CommentedEntryWrapper) {
                final CommentedEntryWrapper other = (CommentedEntryWrapper)obj;
                return Objects.equals(this.getKey(), other.getKey()) && Objects.equals(this.getValue(), other.getValue()) && Objects.equals(this.getComment(), other.getComment());
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Objects.hashCode(this.getKey());
            result = 31 * result + Objects.hashCode(this.getValue());
            result = 31 * result + Objects.hashCode(this.getComment());
            return result;
        }
    }
}
