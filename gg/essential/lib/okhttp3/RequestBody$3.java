package gg.essential.lib.okhttp3;

import javax.annotation.*;
import gg.essential.lib.okhttp3.internal.*;
import gg.essential.lib.okio.*;
import java.io.*;

final class RequestBody$3 extends RequestBody {
    final /* synthetic */ MediaType val$contentType;
    final /* synthetic */ File val$file;
    
    RequestBody$3(final MediaType val$contentType, final File val$file) {
        this.val$contentType = val$contentType;
        this.val$file = val$file;
        super();
    }
    
    @Nullable
    @Override
    public MediaType contentType() {
        return this.val$contentType;
    }
    
    @Override
    public long contentLength() {
        return this.val$file.length();
    }
    
    @Override
    public void writeTo(final BufferedSink sink) throws IOException {
        Source source = null;
        try {
            source = Okio.source(this.val$file);
            sink.writeAll(source);
        }
        finally {
            Util.closeQuietly(source);
        }
    }
}