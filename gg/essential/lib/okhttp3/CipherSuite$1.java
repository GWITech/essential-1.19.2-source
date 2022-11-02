package gg.essential.lib.okhttp3;

import java.util.*;

final class CipherSuite$1 implements Comparator<String> {
    CipherSuite$1() {
        super();
    }
    
    @Override
    public int compare(final String a, final String b) {
        for (int i = 4, limit = Math.min(a.length(), b.length()); i < limit; ++i) {
            final char charA = a.charAt(i);
            final char charB = b.charAt(i);
            if (charA != charB) {
                return (charA < charB) ? -1 : 1;
            }
        }
        final int lengthA = a.length();
        final int lengthB = b.length();
        if (lengthA != lengthB) {
            return (lengthA < lengthB) ? -1 : 1;
        }
        return 0;
    }
    
    @Override
    public /* bridge */ int compare(final Object o, final Object o2) {
        return this.compare((String)o, (String)o2);
    }
}