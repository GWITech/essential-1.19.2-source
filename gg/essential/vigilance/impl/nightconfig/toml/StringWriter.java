package gg.essential.vigilance.impl.nightconfig.toml;

import gg.essential.vigilance.impl.nightconfig.core.io.*;

final class StringWriter
{
    private static final char[] ESCAPED_B;
    private static final char[] ESCAPED_F;
    private static final char[] ESCAPED_N;
    private static final char[] ESCAPED_R;
    private static final char[] ESCAPED_T;
    private static final char[] ESCAPED_BACKSLASH;
    private static final char[] ESCAPED_QUOTE;
    
    static void writeBasic(final CharSequence csq, final CharacterOutput output) {
        output.write('\"');
        for (int l = csq.length(), i = 0; i < l; ++i) {
            writeBasicChar(csq.charAt(i), output);
        }
        output.write('\"');
    }
    
    static void writeLiteral(final String str, final CharacterOutput output) {
        output.write('\'');
        output.write(str);
        output.write('\'');
    }
    
    private static void writeBasicChar(final char c, final CharacterOutput output) {
        switch (c) {
            case '\\': {
                output.write(StringWriter.ESCAPED_BACKSLASH);
                break;
            }
            case '\"': {
                output.write(StringWriter.ESCAPED_QUOTE);
                break;
            }
            case '\b': {
                output.write(StringWriter.ESCAPED_B);
                break;
            }
            case '\f': {
                output.write(StringWriter.ESCAPED_F);
                break;
            }
            case '\n': {
                output.write(StringWriter.ESCAPED_N);
                break;
            }
            case '\r': {
                output.write(StringWriter.ESCAPED_R);
                break;
            }
            case '\t': {
                output.write(StringWriter.ESCAPED_T);
                break;
            }
            default: {
                output.write(c);
                break;
            }
        }
    }
    
    private StringWriter() {
        super();
    }
    
    static {
        ESCAPED_B = new char[] { '\\', 'b' };
        ESCAPED_F = new char[] { '\\', 'f' };
        ESCAPED_N = new char[] { '\\', 'n' };
        ESCAPED_R = new char[] { '\\', 'r' };
        ESCAPED_T = new char[] { '\\', 't' };
        ESCAPED_BACKSLASH = new char[] { '\\', '\\' };
        ESCAPED_QUOTE = new char[] { '\\', '\"' };
    }
}
