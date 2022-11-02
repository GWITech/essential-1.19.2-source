package gg.essential.lib.gson.internal;

import java.util.*;

final class KeySet extends AbstractSet<K>
{
    final /* synthetic */ LinkedTreeMap this$0;
    
    KeySet(final LinkedTreeMap this$0) {
        this.this$0 = this$0;
        super();
    }
    
    @Override
    public int size() {
        return this.this$0.size;
    }
    
    @Override
    public Iterator<K> iterator() {
        return new LinkedTreeMapIterator(this) {
            LinkedTreeMap$KeySet$1(final KeySet this$1) {
                this$1.this$0.super();
            }
            
            @Override
            public K next() {
                return this.nextNode().key;
            }
        };
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.this$0.containsKey(o);
    }
    
    @Override
    public boolean remove(final Object key) {
        return this.this$0.removeInternalByKey(key) != null;
    }
    
    @Override
    public void clear() {
        this.this$0.clear();
    }
}
