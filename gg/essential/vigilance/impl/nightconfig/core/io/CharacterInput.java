package gg.essential.vigilance.impl.nightconfig.core.io;

public interface CharacterInput
{
    int read();
    
    char readChar();
    
    default int readAndSkip(final char[] toSkip) {
        int c;
        do {
            c = this.read();
        } while (c != -1 && Utils.arrayContains(toSkip, (char)c));
        return c;
    }
    
    default char readCharAndSkip(final char[] toSkip) {
        char c;
        do {
            c = this.readChar();
        } while (Utils.arrayContains(toSkip, c));
        return c;
    }
    
    default CharsWrapper read(final int n) {
        final CharsWrapper.Builder builder = new CharsWrapper.Builder(n);
        for (int i = 0; i < n; ++i) {
            final int next = this.read();
            if (next == -1) {
                break;
            }
            builder.append((char)next);
        }
        return builder.build();
    }
    
    default CharsWrapper readChars(final int n) {
        final char[] chars = new char[n];
        for (int i = 0; i < n; ++i) {
            final int next = this.read();
            if (next == -1) {
                throw ParsingException.notEnoughData();
            }
            chars[i] = (char)next;
        }
        return new CharsWrapper(chars);
    }
    
    CharsWrapper readUntil(final char[] p0);
    
    CharsWrapper readCharsUntil(final char[] p0);
    
    int peek();
    
    int peek(final int p0);
    
    char peekChar();
    
    char peekChar(final int p0);
    
    void skipPeeks();
    
    void pushBack(final char p0);
}
