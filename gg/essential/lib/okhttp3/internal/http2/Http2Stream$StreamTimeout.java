package gg.essential.lib.okhttp3.internal.http2;

import gg.essential.lib.okio.*;
import java.io.*;
import java.net.*;

class StreamTimeout extends AsyncTimeout
{
    final /* synthetic */ Http2Stream this$0;
    
    StreamTimeout(final Http2Stream this$0) {
        this.this$0 = this$0;
        super();
    }
    
    @Override
    protected void timedOut() {
        this.this$0.closeLater(ErrorCode.CANCEL);
    }
    
    @Override
    protected IOException newTimeoutException(final IOException cause) {
        final SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (cause != null) {
            socketTimeoutException.initCause(cause);
        }
        return socketTimeoutException;
    }
    
    public void exitAndThrowIfTimedOut() throws IOException {
        if (this.exit()) {
            throw this.newTimeoutException(null);
        }
    }
}
