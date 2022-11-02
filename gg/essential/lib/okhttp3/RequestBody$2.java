package gg.essential.lib.okhttp3;

import javax.annotation.*;
import gg.essential.lib.okio.*;
import java.io.*;

final class RequestBody$2 extends RequestBody {
    final /* synthetic */ MediaType val$contentType;
    final /* synthetic */ int val$byteCount;
    final /* synthetic */ byte[] val$content;
    final /* synthetic */ int val$offset;
    
    RequestBody$2(final MediaType val$contentType, final int val$byteCount, final byte[] val$content) {
        this.val$contentType = val$contentType;
        this.val$byteCount = val$byteCount;
        this.val$content = val$content;
        this.val$offset = 0;
        super();
    }
    
    @Nullable
    @Override
    public MediaType contentType() {
        return this.val$contentType;
    }
    
    @Override
    public long contentLength() {
        return this.val$byteCount;
    }
    
    @Override
    public void writeTo(final BufferedSink sink) throws IOException {
        sink.write(this.val$content, 0, this.val$byteCount);
    }
}