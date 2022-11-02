package gg.essential.lib.okhttp3;

class ConnectionPool$1 implements Runnable {
    final /* synthetic */ ConnectionPool this$0;
    
    ConnectionPool$1(final ConnectionPool this$0) {
        this.this$0 = this$0;
        super();
    }
    
    @Override
    public void run() {
        while (true) {
            long waitNanos = this.this$0.cleanup(System.nanoTime());
            if (waitNanos == -1L) {
                break;
            }
            if (waitNanos <= 0L) {
                continue;
            }
            final long waitMillis = waitNanos / 1000000L;
            waitNanos -= waitMillis * 1000000L;
            synchronized (this.this$0) {
                try {
                    this.this$0.wait(waitMillis, (int)waitNanos);
                }
                catch (final InterruptedException ex) {}
            }
        }
    }
}