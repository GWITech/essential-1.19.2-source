package gg.essential.lib.okio;

import java.util.concurrent.*;
import java.io.*;

final class Timeout$1 extends Timeout {
    Timeout$1() {
        super();
    }
    
    @Override
    public Timeout timeout(final long timeout, final TimeUnit unit) {
        return this;
    }
    
    @Override
    public Timeout deadlineNanoTime(final long deadlineNanoTime) {
        return this;
    }
    
    @Override
    public void throwIfReached() throws IOException {
    }
}