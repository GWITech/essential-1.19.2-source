package gg.essential.lib.gson.internal;

import java.util.*;

class EntrySet extends AbstractSet<Map.Entry<K, V>>
{
    final /* synthetic */ LinkedTreeMap this$0;
    
    EntrySet(final LinkedTreeMap this$0) {
        this.this$0 = this$0;
        super();
    }
    
    @Override
    public int size() {
        return this.this$0.size;
    }
    
    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return new LinkedTreeMapIterator(this) {
            LinkedTreeMap$EntrySet$1(final EntrySet this$1) {
                this$1.this$0.super();
            }
            
            @Override
            public Map.Entry<K, V> next() {
                return this.nextNode();
            }
            
            @Override
            public /* bridge */ Object next() {
                return this.next();
            }
        };
    }
    
    @Override
    public boolean contains(final Object o) {
        return o instanceof Map.Entry && this.this$0.findByEntry((Map.Entry<?, ?>)o) != null;
    }
    
    @Override
    public boolean remove(final Object o) {
        if (!(o instanceof Map.Entry)) {
            return false;
        }
        final Node<K, V> node = this.this$0.findByEntry((Map.Entry<?, ?>)o);
        if (node == null) {
            return false;
        }
        this.this$0.removeInternal(node, true);
        return true;
    }
    
    @Override
    public void clear() {
        this.this$0.clear();
    }
}
