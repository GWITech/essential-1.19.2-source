package gg.essential.network.connectionmanager.ice;

import java.util.*;
import org.apache.logging.log4j.*;
import java.util.logging.*;
import org.apache.logging.log4j.message.*;
import java.util.concurrent.*;

public class Log4jAsJulLogger extends Logger
{
    private static final Map<Level, org.apache.logging.log4j.Level> levelMap;
    private final org.apache.logging.log4j.Logger logger;
    
    public Log4jAsJulLogger(final String name) {
        this(LogManager.getLogger(name));
    }
    
    public Log4jAsJulLogger(final org.apache.logging.log4j.Logger logger) {
        super(logger.getName(), null);
        super.setLevel(Level.FINEST);
        this.logger = logger;
    }
    
    private static org.apache.logging.log4j.Level mapLevel(final Level julLevel) {
        return Log4jAsJulLogger.levelMap.getOrDefault(julLevel, org.apache.logging.log4j.Level.INFO);
    }
    
    @Override
    public void log(final LogRecord record) {
        final Filter filter = this.getFilter();
        if (filter != null && !filter.isLoggable(record)) {
            return;
        }
        final org.apache.logging.log4j.Level level = mapLevel(record.getLevel());
        final Message message = this.logger.getMessageFactory().newMessage(record.getMessage(), record.getParameters());
        final Throwable thrown = record.getThrown();
        this.logger.log(level, (Marker)null, message, thrown);
    }
    
    @Override
    public boolean isLoggable(final Level level) {
        return this.logger.isEnabled(mapLevel(level));
    }
    
    @Override
    public String getName() {
        return this.logger.getName();
    }
    
    @Override
    public void setLevel(final Level newLevel) throws SecurityException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void setParent(final Logger parent) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void log(final Level level, final String msg) {
        this.logger.log(mapLevel(level), msg);
    }
    
    @Override
    public void log(final Level level, final String msg, final Object param1) {
        this.logger.log(mapLevel(level), msg, param1);
    }
    
    @Override
    public void log(final Level level, final String msg, final Object[] params) {
        this.logger.log(mapLevel(level), msg, params);
    }
    
    @Override
    public void log(final Level level, final String msg, final Throwable thrown) {
        this.logger.log(mapLevel(level), msg, thrown);
    }
    
    @Override
    public void entering(final String sourceClass, final String sourceMethod) {
        this.logger.entry();
    }
    
    @Override
    public void entering(final String sourceClass, final String sourceMethod, final Object param1) {
        this.logger.entry(new Object[] { param1 });
    }
    
    @Override
    public void entering(final String sourceClass, final String sourceMethod, final Object[] params) {
        this.logger.entry(params);
    }
    
    @Override
    public void exiting(final String sourceClass, final String sourceMethod) {
        this.logger.exit();
    }
    
    @Override
    public void exiting(final String sourceClass, final String sourceMethod, final Object result) {
        this.logger.exit(result);
    }
    
    @Override
    public void throwing(final String sourceClass, final String sourceMethod, final Throwable thrown) {
        this.logger.throwing(thrown);
    }
    
    static {
        (levelMap = new ConcurrentHashMap<Level, org.apache.logging.log4j.Level>()).put(Level.ALL, org.apache.logging.log4j.Level.ALL);
        Log4jAsJulLogger.levelMap.put(Level.FINEST, org.apache.logging.log4j.Level.TRACE);
        Log4jAsJulLogger.levelMap.put(Level.FINER, org.apache.logging.log4j.Level.TRACE);
        Log4jAsJulLogger.levelMap.put(Level.FINE, org.apache.logging.log4j.Level.DEBUG);
        Log4jAsJulLogger.levelMap.put(Level.CONFIG, org.apache.logging.log4j.Level.DEBUG);
        Log4jAsJulLogger.levelMap.put(Level.INFO, org.apache.logging.log4j.Level.INFO);
        Log4jAsJulLogger.levelMap.put(Level.WARNING, org.apache.logging.log4j.Level.WARN);
        Log4jAsJulLogger.levelMap.put(Level.SEVERE, org.apache.logging.log4j.Level.ERROR);
        Log4jAsJulLogger.levelMap.put(Level.OFF, org.apache.logging.log4j.Level.OFF);
    }
}
