package gg.essential.lib.okhttp3;

import gg.essential.lib.okio.*;
import javax.annotation.*;

final class ResponseBody$1 extends ResponseBody {
    final /* synthetic */ MediaType val$contentType;
    final /* synthetic */ long val$contentLength;
    final /* synthetic */ BufferedSource val$content;
    
    ResponseBody$1(final MediaType val$contentType, final long val$contentLength, final BufferedSource val$content) {
        this.val$contentType = val$contentType;
        this.val$contentLength = val$contentLength;
        this.val$content = val$content;
        super();
    }
    
    @Nullable
    @Override
    public MediaType contentType() {
        return this.val$contentType;
    }
    
    @Override
    public long contentLength() {
        return this.val$contentLength;
    }
    
    @Override
    public BufferedSource source() {
        return this.val$content;
    }
}