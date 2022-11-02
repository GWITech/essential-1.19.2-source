package gg.essential.lib.okhttp3.internal.http2;

import java.io.*;

public abstract static class Listener
{
    public static final Listener REFUSE_INCOMING_STREAMS;
    
    public Listener() {
        super();
    }
    
    public abstract void onStream(final Http2Stream p0) throws IOException;
    
    public void onSettings(final Http2Connection connection) {
    }
    
    static {
        REFUSE_INCOMING_STREAMS = new Listener() {
            Http2Connection$Listener$1() {
                super();
            }
            
            @Override
            public void onStream(final Http2Stream stream) throws IOException {
                stream.close(ErrorCode.REFUSED_STREAM);
            }
        };
    }
}
