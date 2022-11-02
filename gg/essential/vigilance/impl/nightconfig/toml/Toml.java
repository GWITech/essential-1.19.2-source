package gg.essential.vigilance.impl.nightconfig.toml;

import java.util.*;
import gg.essential.vigilance.impl.nightconfig.core.io.*;

final class Toml
{
    private static final char[] WHITESPACE_OR_NEWLINE;
    private static final char[] WHITESPACE;
    private static final char[] NEWLINE;
    private static final char[] FORBIDDEN_IN_ALL_BARE_KEYS;
    
    static char readUsefulChar(final CharacterInput input) {
        char next;
        for (next = input.readCharAndSkip(Toml.WHITESPACE_OR_NEWLINE); next == '#'; next = input.readCharAndSkip(Toml.WHITESPACE_OR_NEWLINE)) {
            input.readCharsUntil(Toml.NEWLINE);
        }
        return next;
    }
    
    static int readUseful(final CharacterInput input, final List<CharsWrapper> commentsList) {
        int next;
        for (next = input.readAndSkip(Toml.WHITESPACE_OR_NEWLINE); next == 35; next = input.readAndSkip(Toml.WHITESPACE_OR_NEWLINE)) {
            final CharsWrapper comment = readLine(input);
            commentsList.add(comment);
        }
        return next;
    }
    
    static char readNonSpaceChar(final CharacterInput input, final boolean skipNewlines) {
        return skipNewlines ? input.readCharAndSkip(Toml.WHITESPACE_OR_NEWLINE) : input.readCharAndSkip(Toml.WHITESPACE);
    }
    
    static int readNonSpace(final CharacterInput input, final boolean skipNewlines) {
        return skipNewlines ? input.readAndSkip(Toml.WHITESPACE_OR_NEWLINE) : input.readAndSkip(Toml.WHITESPACE);
    }
    
    static CharsWrapper readLine(final CharacterInput input) {
        final CharsWrapper chars = input.readUntil(Toml.NEWLINE);
        final int lastIndex = chars.length() - 1;
        if (lastIndex >= 0 && chars.get(lastIndex) == '\r') {
            return chars.subView(0, lastIndex);
        }
        return chars;
    }
    
    static boolean isValidInBareKey(final char c, final boolean lenient) {
        if (lenient) {
            return c > ' ' && !Utils.arrayContains(Toml.FORBIDDEN_IN_ALL_BARE_KEYS, c);
        }
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '-' || c == '_';
    }
    
    static boolean isValidBareKey(final CharSequence csq, final boolean lenient) {
        for (int i = 0; i < csq.length(); ++i) {
            if (!isValidInBareKey(csq.charAt(i), lenient)) {
                return false;
            }
        }
        return true;
    }
    
    static boolean isKeyValueSeparator(final char c, final boolean lenient) {
        return c == '=' || (lenient && c == ':');
    }
    
    private Toml() {
        super();
    }
    
    static {
        WHITESPACE_OR_NEWLINE = new char[] { '\t', ' ', '\n', '\r' };
        WHITESPACE = new char[] { '\t', ' ' };
        NEWLINE = new char[] { '\n' };
        FORBIDDEN_IN_ALL_BARE_KEYS = new char[] { '.', '[', ']', '#', '=' };
    }
}
