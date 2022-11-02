package gg.essential.vigilance.impl.nightconfig.core.io;

public interface CharacterOutput
{
    void write(final char p0);
    
    default void write(final char... chars) {
        this.write(chars, 0, chars.length);
    }
    
    void write(final char[] p0, final int p1, final int p2);
    
    default void write(final String s) {
        this.write(s, 0, s.length());
    }
    
    void write(final String p0, final int p1, final int p2);
    
    default void write(final CharsWrapper cw) {
        this.write(cw.chars, cw.offset, cw.limit - cw.offset);
    }
}
