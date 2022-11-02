package gg.essential.lib.okhttp3;

import javax.annotation.*;
import gg.essential.lib.okhttp3.internal.*;
import java.nio.charset.*;
import java.io.*;
import gg.essential.lib.okio.*;

public abstract class ResponseBody implements Closeable
{
    public ResponseBody() {
        super();
    }
    
    @Nullable
    public abstract MediaType contentType();
    
    public abstract long contentLength();
    
    public abstract BufferedSource source();
    
    public final String string() throws IOException {
        final BufferedSource source = this.source();
        try {
            final Charset charset = Util.bomAwareCharset(source, this.charset());
            return source.readString(charset);
        }
        finally {
            Util.closeQuietly(source);
        }
    }
    
    private Charset charset() {
        final MediaType contentType = this.contentType();
        return (contentType != null) ? contentType.charset(Util.UTF_8) : Util.UTF_8;
    }
    
    @Override
    public void close() {
        Util.closeQuietly(this.source());
    }
    
    public static ResponseBody create(@Nullable final MediaType contentType, final byte[] content) {
        final Buffer buffer = new Buffer().write(content);
        return create(contentType, content.length, buffer);
    }
    
    public static ResponseBody create(@Nullable final MediaType contentType, final long contentLength, final BufferedSource content) {
        if (content == null) {
            throw new NullPointerException("source == null");
        }
        return new ResponseBody() {
            final /* synthetic */ MediaType val$contentType;
            final /* synthetic */ long val$contentLength;
            final /* synthetic */ BufferedSource val$content;
            
            ResponseBody$1() {
                super();
            }
            
            @Nullable
            @Override
            public MediaType contentType() {
                return contentType;
            }
            
            @Override
            public long contentLength() {
                return contentLength;
            }
            
            @Override
            public BufferedSource source() {
                return content;
            }
        };
    }
}
