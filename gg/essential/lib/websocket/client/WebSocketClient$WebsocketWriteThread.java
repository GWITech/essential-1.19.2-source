package gg.essential.lib.websocket.client;

import java.io.*;
import java.nio.*;
import java.util.*;

private class WebsocketWriteThread implements Runnable
{
    final /* synthetic */ WebSocketClient this$0;
    
    WebsocketWriteThread(final WebSocketClient this$0) {
        this.this$0 = this$0;
        super();
    }
    
    @Override
    public void run() {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        try {
            this.runWriteData();
        }
        catch (final IOException e) {
            WebSocketClient.access$000(this.this$0, e);
        }
        finally {
            this.closeSocket();
            WebSocketClient.access$102(this.this$0, null);
        }
    }
    
    private void runWriteData() throws IOException {
        try {
            while (!Thread.interrupted()) {
                final ByteBuffer buffer = WebSocketClient.access$200(this.this$0).outQueue.take();
                WebSocketClient.access$300(this.this$0).write(buffer.array(), 0, buffer.limit());
                WebSocketClient.access$300(this.this$0).flush();
            }
        }
        catch (final InterruptedException ex) {
            for (final ByteBuffer buffer2 : WebSocketClient.access$200(this.this$0).outQueue) {
                WebSocketClient.access$300(this.this$0).write(buffer2.array(), 0, buffer2.limit());
                WebSocketClient.access$300(this.this$0).flush();
            }
            Thread.currentThread().interrupt();
        }
    }
    
    private void closeSocket() {
        try {
            if (WebSocketClient.access$400(this.this$0) != null) {
                WebSocketClient.access$400(this.this$0).close();
            }
        }
        catch (final IOException ex) {
            this.this$0.onWebsocketError$6d401871(ex);
        }
    }
}
