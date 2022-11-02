package gg.essential.elementa.impl.commonmark.internal.util;

static final class Escaping$1 implements Replacer {
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
}