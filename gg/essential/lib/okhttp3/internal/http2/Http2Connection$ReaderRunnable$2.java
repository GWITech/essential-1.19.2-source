package gg.essential.lib.okhttp3.internal.http2;

import gg.essential.lib.okhttp3.internal.*;

class Http2Connection$ReaderRunnable$2 extends NamedRunnable {
    final /* synthetic */ ReaderRunnable this$1;
    
    Http2Connection$ReaderRunnable$2(final ReaderRunnable this$1, final String format, final Object... args) {
        this.this$1 = this$1;
        super(format, args);
    }
    
    public void execute() {
        this.this$1.this$0.listener.onSettings(this.this$1.this$0);
    }
}