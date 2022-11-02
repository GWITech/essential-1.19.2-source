package gg.essential.lib.okhttp3.internal;

import java.util.concurrent.*;

final class Util$2 implements ThreadFactory {
    final /* synthetic */ String val$name;
    final /* synthetic */ boolean val$daemon;
    
    Util$2(final String val$name, final boolean val$daemon) {
        this.val$name = val$name;
        this.val$daemon = val$daemon;
        super();
    }
    
    @Override
    public Thread newThread(final Runnable runnable) {
        final Thread result = new Thread(runnable, this.val$name);
        result.setDaemon(this.val$daemon);
        return result;
    }
}