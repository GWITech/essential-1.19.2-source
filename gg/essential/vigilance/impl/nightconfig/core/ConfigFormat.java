package gg.essential.vigilance.impl.nightconfig.core;

import gg.essential.vigilance.impl.nightconfig.core.io.*;
import java.util.function.*;
import java.util.*;
import java.nio.file.*;
import gg.essential.vigilance.impl.nightconfig.core.utils.*;
import java.io.*;

public interface ConfigFormat<C extends Config>
{
    ConfigWriter createWriter();
    
    ConfigParser<C> createParser();
    
    default C createConfig() {
        return this.createConfig(Config.getDefaultMapCreator(false));
    }
    
    default C createConcurrentConfig() {
        return this.createConfig(Config.getDefaultMapCreator(true));
    }
    
    C createConfig(final Supplier<Map<String, Object>> p0);
    
    boolean supportsComments();
    
    default boolean supportsType(final Class<?> type) {
        return InMemoryFormat.DEFAULT_PREDICATE.test(type);
    }
    
    default boolean isInMemory() {
        return false;
    }
    
    default void initEmptyFile(final Path f) throws IOException {
        this.initEmptyFile(() -> Files.newBufferedWriter(f, new OpenOption[0]));
    }
    
    default void initEmptyFile(final File f) throws IOException {
        this.initEmptyFile(f.toPath());
    }
    
    default void initEmptyFile(final WriterSupplier ws) throws IOException {
    }
    
    default /* synthetic */ Writer lambda$initEmptyFile$0(final Path f) throws IOException {
        return Files.newBufferedWriter(f, new OpenOption[0]);
    }
}
