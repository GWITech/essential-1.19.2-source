package gg.essential.elementa.impl.commonmark.internal.util;

import java.util.*;
import java.util.regex.*;
import java.nio.charset.*;

public class Escaping
{
    public static final String ESCAPABLE = "[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]";
    public static final String ENTITY = "&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});";
    private static final Pattern BACKSLASH_OR_AMP;
    private static final Pattern ENTITY_OR_ESCAPED_CHAR;
    private static final Pattern ESCAPE_IN_URI;
    private static final char[] HEX_DIGITS;
    private static final Pattern WHITESPACE;
    private static final Replacer UNESCAPE_REPLACER;
    private static final Replacer URI_REPLACER;
    
    public Escaping() {
        super();
    }
    
    public static String escapeHtml(final String input) {
        StringBuilder sb = null;
        for (int i = 0; i < input.length(); ++i) {
            final char c = input.charAt(i);
            String replacement = null;
            switch (c) {
                case '&': {
                    replacement = "&amp;";
                    break;
                }
                case '<': {
                    replacement = "&lt;";
                    break;
                }
                case '>': {
                    replacement = "&gt;";
                    break;
                }
                case '\"': {
                    replacement = "&quot;";
                    break;
                }
                default: {
                    if (sb != null) {
                        sb.append(c);
                    }
                    continue;
                }
            }
            if (sb == null) {
                sb = new StringBuilder();
                sb.append(input, 0, i);
            }
            sb.append(replacement);
        }
        return (sb != null) ? sb.toString() : input;
    }
    
    public static String unescapeString(final String s) {
        if (Escaping.BACKSLASH_OR_AMP.matcher(s).find()) {
            return replaceAll(Escaping.ENTITY_OR_ESCAPED_CHAR, s, Escaping.UNESCAPE_REPLACER);
        }
        return s;
    }
    
    public static String percentEncodeUrl(final String s) {
        return replaceAll(Escaping.ESCAPE_IN_URI, s, Escaping.URI_REPLACER);
    }
    
    public static String normalizeLabelContent(final String input) {
        final String trimmed = input.trim();
        final String lowercase = trimmed.toLowerCase(Locale.ROOT);
        return Escaping.WHITESPACE.matcher(lowercase).replaceAll(" ");
    }
    
    private static String replaceAll(final Pattern p, final String s, final Replacer replacer) {
        final Matcher matcher = p.matcher(s);
        if (!matcher.find()) {
            return s;
        }
        final StringBuilder sb = new StringBuilder(s.length() + 16);
        int lastEnd = 0;
        do {
            sb.append(s, lastEnd, matcher.start());
            replacer.replace(matcher.group(), sb);
            lastEnd = matcher.end();
        } while (matcher.find());
        if (lastEnd != s.length()) {
            sb.append(s, lastEnd, s.length());
        }
        return sb.toString();
    }
    
    static /* synthetic */ char[] access$000() {
        return Escaping.HEX_DIGITS;
    }
    
    static {
        BACKSLASH_OR_AMP = Pattern.compile("[\\\\&]");
        ENTITY_OR_ESCAPED_CHAR = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
        ESCAPE_IN_URI = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        HEX_DIGITS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        WHITESPACE = Pattern.compile("[ \t\r\n]+");
        UNESCAPE_REPLACER = new Replacer() {
            Escaping$1() {
                super();
            }
            
            @Override
            public void replace(final String input, final StringBuilder sb) {
                if (input.charAt(0) == '\\') {
                    sb.append(input, 1, input.length());
                }
                else {
                    sb.append(Html5Entities.entityToString(input));
                }
            }
        };
        URI_REPLACER = new Replacer() {
            Escaping$2() {
                super();
            }
            
            @Override
            public void replace(final String input, final StringBuilder sb) {
                if (input.startsWith("%")) {
                    if (input.length() == 3) {
                        sb.append(input);
                    }
                    else {
                        sb.append("%25");
                        sb.append(input, 1, input.length());
                    }
                }
                else {
                    final byte[] bytes2;
                    final byte[] bytes = bytes2 = input.getBytes(Charset.forName("UTF-8"));
                    for (final byte b : bytes2) {
                        sb.append('%');
                        sb.append(Escaping.HEX_DIGITS[b >> 4 & 0xF]);
                        sb.append(Escaping.HEX_DIGITS[b & 0xF]);
                    }
                }
            }
        };
    }
    
    private interface Replacer
    {
        void replace(final String p0, final StringBuilder p1);
    }
}
