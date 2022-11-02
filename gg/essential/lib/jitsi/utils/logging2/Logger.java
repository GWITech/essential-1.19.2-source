package gg.essential.lib.jitsi.utils.logging2;

import java.util.*;
import java.util.function.*;

public interface Logger
{
    Logger createChildLogger(final String p0, final Map<String, String> p1);
    
    Logger createChildLogger(final String p0);
    
    boolean isTraceEnabled();
    
    void trace(final Object p0);
    
    void trace(final Supplier<String> p0);
    
    boolean isDebugEnabled();
    
    void debug(final Object p0);
    
    void debug(final Supplier<String> p0);
    
    boolean isInfoEnabled();
    
    void info(final Object p0);
    
    void info(final Supplier<String> p0);
    
    void warn(final Object p0);
    
    void warn(final Object p0, final Throwable p1);
    
    void error(final Object p0);
    
    void error(final Object p0, final Throwable p1);
}
