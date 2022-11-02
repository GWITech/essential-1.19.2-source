package gg.essential.lib.jitsi.utils.logging2;

import java.util.*;
import java.util.logging.*;
import java.util.function.*;

public class LoggerImpl implements Logger
{
    private final java.util.logging.Logger loggerDelegate;
    private final Level minLogLevel;
    private final LogContext logContext;
    static Function<String, java.util.logging.Logger> loggerFactory;
    
    public LoggerImpl(final String name) {
        this(name, Level.ALL);
    }
    
    public LoggerImpl(final String name, final Level minLogLevel) {
        this(name, minLogLevel, new LogContext());
    }
    
    public LoggerImpl(final String name, final LogContext logContext) {
        this(name, Level.ALL, logContext);
    }
    
    public LoggerImpl(final String name, final Level minLogLevel, final LogContext logContext) {
        super();
        this.loggerDelegate = LoggerImpl.loggerFactory.apply(name);
        this.minLogLevel = minLogLevel;
        this.logContext = logContext;
    }
    
    @Override
    public Logger createChildLogger(final String name, final Map<String, String> context) {
        return new LoggerImpl(name, this.minLogLevel, this.logContext.createSubContext(context));
    }
    
    @Override
    public Logger createChildLogger(final String name) {
        return new LoggerImpl(name, this.minLogLevel, this.logContext.createSubContext(Collections.emptyMap()));
    }
    
    private boolean isLoggable(final Level level) {
        return level.intValue() >= this.minLogLevel.intValue() && this.loggerDelegate.isLoggable(level);
    }
    
    private void log(final Level level, final Object msg, final Throwable thrown) {
        if (!this.isLoggable(level)) {
            return;
        }
        final LogRecord lr = new ContextLogRecord(level, msg.toString());
        lr.setThrown(thrown);
        lr.setLoggerName(this.loggerDelegate.getName());
        this.loggerDelegate.log(lr);
    }
    
    private void log(final Level level, final Object msg) {
        if (!this.isLoggable(level)) {
            return;
        }
        final LogRecord lr = new ContextLogRecord(level, msg.toString());
        lr.setLoggerName(this.loggerDelegate.getName());
        this.loggerDelegate.log(lr);
    }
    
    private void log(final Level level, final Supplier<String> msgSupplier) {
        if (!this.isLoggable(level)) {
            return;
        }
        final LogRecord lr = new ContextLogRecord(level, msgSupplier.get());
        lr.setLoggerName(this.loggerDelegate.getName());
        this.loggerDelegate.log(lr);
    }
    
    @Override
    public boolean isTraceEnabled() {
        return this.isLoggable(Level.FINER);
    }
    
    @Override
    public void trace(final Object msg) {
        this.log(Level.FINER, msg);
    }
    
    @Override
    public void trace(final Supplier<String> msgSupplier) {
        this.log(Level.FINER, msgSupplier);
    }
    
    @Override
    public boolean isDebugEnabled() {
        return this.isLoggable(Level.FINE);
    }
    
    @Override
    public void debug(final Object msg) {
        this.log(Level.FINE, msg);
    }
    
    @Override
    public void debug(final Supplier<String> msgSupplier) {
        this.log(Level.FINE, msgSupplier);
    }
    
    @Override
    public boolean isInfoEnabled() {
        return this.isLoggable(Level.INFO);
    }
    
    @Override
    public void info(final Object msg) {
        this.log(Level.INFO, msg);
    }
    
    @Override
    public void info(final Supplier<String> msgSupplier) {
        this.log(Level.INFO, msgSupplier);
    }
    
    @Override
    public void warn(final Object msg) {
        this.log(Level.WARNING, msg);
    }
    
    @Override
    public void warn(final Object msg, final Throwable t) {
        this.log(Level.WARNING, msg, t);
    }
    
    @Override
    public void error(final Object msg) {
        this.log(Level.SEVERE, msg);
    }
    
    @Override
    public void error(final Object msg, final Throwable t) {
        this.log(Level.SEVERE, msg, t);
    }
    
    static {
        LoggerImpl.loggerFactory = java.util.logging.Logger::getLogger;
    }
}
