package gg.essential.lib.okhttp3.internal.connection;

import java.io.*;
import java.lang.reflect.*;

public final class RouteException extends RuntimeException
{
    private static final Method addSuppressedExceptionMethod;
    private IOException lastException;
    
    public RouteException(final IOException cause) {
        super(cause);
        this.lastException = cause;
    }
    
    public IOException getLastConnectException() {
        return this.lastException;
    }
    
    public void addConnectException(final IOException e) {
        this.addSuppressedIfPossible(e, this.lastException);
        this.lastException = e;
    }
    
    private void addSuppressedIfPossible(final IOException e, final IOException suppressed) {
        if (RouteException.addSuppressedExceptionMethod != null) {
            try {
                RouteException.addSuppressedExceptionMethod.invoke(e, suppressed);
            }
            catch (final InvocationTargetException | IllegalAccessException ex) {}
        }
    }
    
    static {
        Method m;
        try {
            m = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        }
        catch (final Exception ex) {
            m = null;
        }
        addSuppressedExceptionMethod = m;
    }
}
