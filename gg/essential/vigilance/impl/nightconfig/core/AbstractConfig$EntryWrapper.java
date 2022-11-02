package gg.essential.vigilance.impl.nightconfig.core;

import java.util.*;

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
