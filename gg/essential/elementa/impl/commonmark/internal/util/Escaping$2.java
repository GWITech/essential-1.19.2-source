package gg.essential.elementa.impl.commonmark.internal.util;

import java.nio.charset.*;

static final class Escaping$2 implements Replacer {
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
                sb.append(Escaping.access$000()[b >> 4 & 0xF]);
                sb.append(Escaping.access$000()[b & 0xF]);
            }
        }
    }
}