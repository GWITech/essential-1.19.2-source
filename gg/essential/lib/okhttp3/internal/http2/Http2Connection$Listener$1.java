package gg.essential.lib.okhttp3.internal.http2;

import java.io.*;

final class Http2Connection$Listener$1 extends Listener {
    Http2Connection$Listener$1() {
        super();
    }
    
    @Override
    public void onStream(final Http2Stream stream) throws IOException {
        stream.close(ErrorCode.REFUSED_STREAM);
    }
}