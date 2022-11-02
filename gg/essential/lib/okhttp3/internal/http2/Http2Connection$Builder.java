package gg.essential.lib.okhttp3.internal.http2;

import java.net.*;
import gg.essential.lib.okio.*;

public static class Builder
{
    Socket socket;
    String hostname;
    BufferedSource source;
    BufferedSink sink;
    Listener listener;
    PushObserver pushObserver;
    boolean client;
    
    public Builder() {
        super();
        this.listener = Listener.REFUSE_INCOMING_STREAMS;
        this.pushObserver = PushObserver.CANCEL;
        this.client = true;
    }
    
    public Builder socket(final Socket socket, final String hostname, final BufferedSource source, final BufferedSink sink) {
        this.socket = socket;
        this.hostname = hostname;
        this.source = source;
        this.sink = sink;
        return this;
    }
    
    public Builder listener(final Listener listener) {
        this.listener = listener;
        return this;
    }
    
    public Http2Connection build() {
        return new Http2Connection(this);
    }
}
