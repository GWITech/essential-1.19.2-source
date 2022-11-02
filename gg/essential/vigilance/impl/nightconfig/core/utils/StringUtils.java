package gg.essential.vigilance.impl.nightconfig.core.utils;

import java.util.*;

public final class StringUtils
{
    private StringUtils() {
        super();
    }
    
    public static List<String> split(final String str, final char sep) {
        final List<String> list = new ArrayList<String>(8);
        split(str, sep, list);
        return list;
    }
    
    public static void split(final String str, final char sep, final List<String> list) {
        int pos0 = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == sep) {
                list.add(str.substring(pos0, i));
                pos0 = i + 1;
            }
        }
        list.add(str.substring(pos0));
    }
    
    public static List<String> splitLines(final String str) {
        if (str == null || str.isEmpty()) {
            return Collections.emptyList();
        }
        final List<String> list = new ArrayList<String>(8);
        splitLines(str, list);
        return list;
    }
    
    public static void splitLines(final String str, final List<String> list) {
        int pos0 = 0;
        for (int i = 0; i < str.length(); ++i) {
            final char ch = str.charAt(i);
            if (ch == '\n') {
                list.add(str.substring(pos0, i));
                pos0 = i + 1;
            }
            else if (ch == '\r') {
                list.add(str.substring(pos0, i));
                final int next = i + 1;
                if (next < str.length() && str.charAt(next) == '\n') {
                    ++i;
                }
                pos0 = i + 1;
            }
        }
        final String lastPart = str.substring(pos0);
        list.add(lastPart);
    }
}
