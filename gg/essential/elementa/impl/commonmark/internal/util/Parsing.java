package gg.essential.elementa.impl.commonmark.internal.util;

public class Parsing
{
    private static final String TAGNAME = "[A-Za-z][A-Za-z0-9-]*";
    private static final String ATTRIBUTENAME = "[a-zA-Z_:][a-zA-Z0-9:._-]*";
    private static final String UNQUOTEDVALUE = "[^\"'=<>`\\x00-\\x20]+";
    private static final String SINGLEQUOTEDVALUE = "'[^']*'";
    private static final String DOUBLEQUOTEDVALUE = "\"[^\"]*\"";
    private static final String ATTRIBUTEVALUE = "(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\")";
    private static final String ATTRIBUTEVALUESPEC = "(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))";
    private static final String ATTRIBUTE = "(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)";
    public static final String OPENTAG = "<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>";
    public static final String CLOSETAG = "</[A-Za-z][A-Za-z0-9-]*\\s*[>]";
    public static int CODE_BLOCK_INDENT;
    
    public Parsing() {
        super();
    }
    
    public static int columnsToNextTabStop(final int column) {
        return 4 - column % 4;
    }
    
    public static int find(final char c, final CharSequence s, final int startIndex) {
        for (int length = s.length(), i = startIndex; i < length; ++i) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
    
    public static int findLineBreak(final CharSequence s, final int startIndex) {
        final int length = s.length();
        int i = startIndex;
        while (i < length) {
            switch (s.charAt(i)) {
                case '\n':
                case '\r': {
                    return i;
                }
                default: {
                    ++i;
                    continue;
                }
            }
        }
        return -1;
    }
    
    public static boolean isBlank(final CharSequence s) {
        return findNonSpace(s, 0) == -1;
    }
    
    public static boolean hasNonSpace(final CharSequence s) {
        final int length = s.length();
        final int skipped = skip(' ', s, 0, length);
        return skipped != length;
    }
    
    public static boolean isLetter(final CharSequence s, final int index) {
        final int codePoint = Character.codePointAt(s, index);
        return Character.isLetter(codePoint);
    }
    
    public static boolean isSpaceOrTab(final CharSequence s, final int index) {
        if (index < s.length()) {
            switch (s.charAt(index)) {
                case '\t':
                case ' ': {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isEscapable(final char c) {
        switch (c) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case '{':
            case '|':
            case '}':
            case '~': {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public static boolean isPunctuationCodePoint(final int codePoint) {
        switch (Character.getType(codePoint)) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 29:
            case 30: {
                return true;
            }
            default: {
                switch (codePoint) {
                    case 36:
                    case 43:
                    case 60:
                    case 61:
                    case 62:
                    case 94:
                    case 96:
                    case 124:
                    case 126: {
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
                break;
            }
        }
    }
    
    public static boolean isWhitespaceCodePoint(final int codePoint) {
        switch (codePoint) {
            case 9:
            case 10:
            case 12:
            case 13:
            case 32: {
                return true;
            }
            default: {
                return Character.getType(codePoint) == 12;
            }
        }
    }
    
    public static CharSequence prepareLine(final CharSequence line) {
        StringBuilder sb = null;
        for (int length = line.length(), i = 0; i < length; ++i) {
            final char c = line.charAt(i);
            if (c == '\0') {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append(line, 0, i);
                }
                sb.append('\ufffd');
            }
            else if (sb != null) {
                sb.append(c);
            }
        }
        if (sb != null) {
            return sb.toString();
        }
        return line;
    }
    
    public static int skip(final char skip, final CharSequence s, final int startIndex, final int endIndex) {
        for (int i = startIndex; i < endIndex; ++i) {
            if (s.charAt(i) != skip) {
                return i;
            }
        }
        return endIndex;
    }
    
    public static int skipBackwards(final char skip, final CharSequence s, final int startIndex, final int lastIndex) {
        for (int i = startIndex; i >= lastIndex; --i) {
            if (s.charAt(i) != skip) {
                return i;
            }
        }
        return lastIndex - 1;
    }
    
    public static int skipSpaceTab(final CharSequence s, final int startIndex, final int endIndex) {
        int i = startIndex;
        while (i < endIndex) {
            switch (s.charAt(i)) {
                case '\t':
                case ' ': {
                    ++i;
                    continue;
                }
                default: {
                    return i;
                }
            }
        }
        return endIndex;
    }
    
    public static int skipSpaceTabBackwards(final CharSequence s, final int startIndex, final int lastIndex) {
        int i = startIndex;
        while (i >= lastIndex) {
            switch (s.charAt(i)) {
                case '\t':
                case ' ': {
                    --i;
                    continue;
                }
                default: {
                    return i;
                }
            }
        }
        return lastIndex - 1;
    }
    
    private static int findNonSpace(final CharSequence s, final int startIndex) {
        final int length = s.length();
        int i = startIndex;
        while (i < length) {
            switch (s.charAt(i)) {
                case '\t':
                case '\n':
                case '\u000b':
                case '\f':
                case '\r':
                case ' ': {
                    ++i;
                    continue;
                }
                default: {
                    return i;
                }
            }
        }
        return -1;
    }
    
    static {
        Parsing.CODE_BLOCK_INDENT = 4;
    }
}
