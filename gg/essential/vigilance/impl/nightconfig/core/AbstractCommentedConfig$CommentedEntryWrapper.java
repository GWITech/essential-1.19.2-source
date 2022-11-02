package gg.essential.vigilance.impl.nightconfig.core;

import java.util.*;

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
