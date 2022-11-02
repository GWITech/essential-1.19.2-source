package gg.essential.lib.okio;

import java.io.*;

public abstract class ForwardingSource implements Source
{
    private final Source delegate;
    
    public ForwardingSource(final Source delegate) {
        super();
        if (delegate == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = delegate;
    }
    
    public final Source delegate() {
        return this.delegate;
    }
    
    @Override
    public long read(final Buffer sink, final long byteCount) throws IOException {
        return this.delegate.read(sink, byteCount);
    }
    
    @Override
    public Timeout timeout() {
        return this.delegate.timeout();
    }
    
    @Override
    public void close() throws IOException {
        this.delegate.close();
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }
}
