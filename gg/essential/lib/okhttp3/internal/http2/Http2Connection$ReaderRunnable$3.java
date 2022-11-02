package gg.essential.lib.okhttp3.internal.http2;

import gg.essential.lib.okhttp3.internal.*;
import java.io.*;

class Http2Connection$ReaderRunnable$3 extends NamedRunnable {
    final /* synthetic */ Settings val$peerSettings;
    final /* synthetic */ ReaderRunnable this$1;
    
    Http2Connection$ReaderRunnable$3(final ReaderRunnable this$1, final String format, final Object[] args, final Settings val$peerSettings) {
        this.this$1 = this$1;
        this.val$peerSettings = val$peerSettings;
        super(format, args);
    }
    
    public void execute() {
        try {
            this.this$1.this$0.writer.applyAndAckSettings(this.val$peerSettings);
        }
        catch (final IOException ex) {}
    }
}