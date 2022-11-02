package gg.essential.lib.gson.internal;

class LinkedTreeMap$KeySet$1 extends LinkedTreeMapIterator {
    LinkedTreeMap$KeySet$1(final KeySet this$1) {
        this$1.this$0.super();
    }
    
    @Override
    public K next() {
        return this.nextNode().key;
    }
}