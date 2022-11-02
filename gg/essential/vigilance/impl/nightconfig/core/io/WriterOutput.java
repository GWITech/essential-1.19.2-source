package gg.essential.vigilance.impl.nightconfig.core.io;

import java.io.*;

public final class WriterOutput implements CharacterOutput
{
    private final Writer writer;
    
    public WriterOutput(final Writer writer) {
        super();
        this.writer = writer;
    }
    
    @Override
    public void write(final char c) {
        try {
            this.writer.write(c);
        }
        catch (final IOException e) {
            throw new WritingException(e);
        }
    }
    
    @Override
    public void write(final char[] chars, final int offset, final int length) {
        try {
            this.writer.write(chars, offset, length);
        }
        catch (final IOException e) {
            throw new WritingException(e);
        }
    }
    
    @Override
    public void write(final String s, final int offset, final int length) {
        try {
            this.writer.write(s, offset, length);
        }
        catch (final IOException e) {
            throw new WritingException(e);
        }
    }
}
