package gg.essential.lib.okhttp3;

import javax.annotation.*;
import gg.essential.lib.okhttp3.internal.*;
import java.nio.charset.*;
import java.io.*;
import gg.essential.lib.okio.*;

public abstract class RequestBody
{
    public RequestBody() {
        super();
    }
    
    @Nullable
    public abstract MediaType contentType();
    
    public long contentLength() throws IOException {
        return -1L;
    }
    
    public abstract void writeTo(final BufferedSink p0) throws IOException;
    
    public static RequestBody create(@Nullable MediaType contentType, final String content) {
        Charset charset = Util.UTF_8;
        if (contentType != null) {
            charset = contentType.charset();
            if (charset == null) {
                charset = Util.UTF_8;
                contentType = MediaType.parse(contentType + "; charset=utf-8");
            }
        }
        final byte[] bytes = content.getBytes(charset);
        return create(contentType, bytes);
    }
    
    public static RequestBody create(@Nullable final MediaType contentType, final byte[] content) {
        return create$b0ab1eb(contentType, content, content.length);
    }
    
    public static RequestBody create$b0ab1eb(@Nullable final MediaType contentType, final byte[] content, final int byteCount) {
        if (content == null) {
            throw new NullPointerException("content == null");
        }
        Util.checkOffsetAndCount$487762af(content.length, byteCount);
        return new RequestBody() {
            final /* synthetic */ MediaType val$contentType;
            final /* synthetic */ int val$byteCount;
            final /* synthetic */ byte[] val$content;
            final /* synthetic */ int val$offset;
            
            RequestBody$2() {
                this.val$offset = 0;
                super();
            }
            
            @Nullable
            @Override
            public MediaType contentType() {
                return contentType;
            }
            
            @Override
            public long contentLength() {
                return byteCount;
            }
            
            @Override
            public void writeTo(final BufferedSink sink) throws IOException {
                sink.write(content, 0, byteCount);
            }
        };
    }
    
    public static RequestBody create(@Nullable final MediaType contentType, final File file) {
        if (file == null) {
            throw new NullPointerException("content == null");
        }
        return new RequestBody() {
            final /* synthetic */ MediaType val$contentType;
            final /* synthetic */ File val$file;
            
            RequestBody$3() {
                super();
            }
            
            @Nullable
            @Override
            public MediaType contentType() {
                return contentType;
            }
            
            @Override
            public long contentLength() {
                return file.length();
            }
            
            @Override
            public void writeTo(final BufferedSink sink) throws IOException {
                Source source = null;
                try {
                    source = Okio.source(file);
                    sink.writeAll(source);
                }
                finally {
                    Util.closeQuietly(source);
                }
            }
        };
    }
}
