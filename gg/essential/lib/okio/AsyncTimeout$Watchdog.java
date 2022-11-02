package gg.essential.lib.okio;

private static final class Watchdog extends Thread
{
    Watchdog() {
        super("Okio Watchdog");
        this.setDaemon(true);
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    final AsyncTimeout timedOut;
                    synchronized (AsyncTimeout.class) {
                        timedOut = AsyncTimeout.awaitTimeout();
                        if (timedOut == null) {
                            continue;
                        }
                        if (timedOut == AsyncTimeout.head) {
                            AsyncTimeout.head = null;
                            return;
                        }
                    }
                    timedOut.timedOut();
                }
            }
            catch (final InterruptedException ex) {
                continue;
            }
            break;
        }
    }
}
