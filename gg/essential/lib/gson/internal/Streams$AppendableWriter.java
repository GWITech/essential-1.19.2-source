package gg.essential.lib.gson.internal;

import java.io.*;

private static final class AppendableWriter extends Writer
{
    private final Appendable appendable;
    private final AppendableWriter.CurrentWrite currentWrite;
    
    AppendableWriter(final Appendable appendable) {
        super();
        this.currentWrite = new AppendableWriter.CurrentWrite();
        this.appendable = appendable;
    }
    
    @Override
    public void write(final char[] chars, final int offset, final int length) throws IOException {
        this.currentWrite.chars = chars;
        this.appendable.append((CharSequence)this.currentWrite, offset, offset + length);
    }
    
    @Override
    public void write(final int i) throws IOException {
        this.appendable.append((char)i);
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void close() {
    }
}
