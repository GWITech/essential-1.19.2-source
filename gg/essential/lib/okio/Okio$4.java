package gg.essential.lib.okio;

import javax.annotation.*;
import java.net.*;
import java.io.*;
import java.util.logging.*;

final class Okio$4 extends AsyncTimeout {
    final /* synthetic */ Socket val$socket;
    
    Okio$4(final Socket val$socket) {
        this.val$socket = val$socket;
        super();
    }
    
    @Override
    protected IOException newTimeoutException(@Nullable final IOException cause) {
        final InterruptedIOException ioe = new SocketTimeoutException("timeout");
        if (cause != null) {
            ioe.initCause(cause);
        }
        return ioe;
    }
    
    @Override
    protected void timedOut() {
        try {
            this.val$socket.close();
        }
        catch (final Exception e) {
            Okio.logger.log(Level.WARNING, "Failed to close timed out socket " + this.val$socket, e);
        }
        catch (final AssertionError e2) {
            if (!Okio.isAndroidGetsocknameError(e2)) {
                throw e2;
            }
            Okio.logger.log(Level.WARNING, "Failed to close timed out socket " + this.val$socket, e2);
        }
    }
}