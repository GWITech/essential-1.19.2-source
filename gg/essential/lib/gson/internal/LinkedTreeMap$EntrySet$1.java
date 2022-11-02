package gg.essential.lib.gson.internal;

import java.util.*;

class LinkedTreeMap$EntrySet$1 extends LinkedTreeMapIterator {
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
}