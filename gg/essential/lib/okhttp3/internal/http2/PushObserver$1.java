package gg.essential.lib.okhttp3.internal.http2;

import gg.essential.lib.okio.*;
import java.io.*;

final class PushObserver$1 implements PushObserver {
    PushObserver$1() {
        super();
    }
    
    @Override
    public boolean onData$749b27ff(final BufferedSource source, final int byteCount) throws IOException {
        source.skip(byteCount);
        return true;
    }
}