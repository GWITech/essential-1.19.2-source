package gg.essential.lib.gson.internal;

import java.util.*;

class LinkedTreeMap$1 implements Comparator<Comparable> {
    LinkedTreeMap$1() {
        super();
    }
    
    @Override
    public int compare(final Comparable a, final Comparable b) {
        return a.compareTo(b);
    }
    
    @Override
    public /* bridge */ int compare(final Object o, final Object o2) {
        return this.compare((Comparable)o, (Comparable)o2);
    }
}