package gg.essential.lib.okhttp3.internal;

import java.util.*;

final class Util$1 implements Comparator<String> {
    Util$1() {
        super();
    }
    
    @Override
    public int compare(final String a, final String b) {
        return a.compareTo(b);
    }
    
    @Override
    public /* bridge */ int compare(final Object o, final Object o2) {
        return this.compare((String)o, (String)o2);
    }
}