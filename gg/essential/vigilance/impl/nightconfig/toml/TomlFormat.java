package gg.essential.vigilance.impl.nightconfig.toml;

import java.util.function.*;
import java.util.*;
import java.time.temporal.*;
import gg.essential.vigilance.impl.nightconfig.core.*;
import gg.essential.vigilance.impl.nightconfig.core.io.*;
import gg.essential.vigilance.impl.nightconfig.core.file.*;

public final class TomlFormat implements ConfigFormat<CommentedConfig>
{
    private static final TomlFormat INSTANCE;
    
    public static TomlFormat instance() {
        return TomlFormat.INSTANCE;
    }
    
    public static CommentedConfig newConfig() {
        return TomlFormat.INSTANCE.createConfig();
    }
    
    public static CommentedConfig newConfig(final Supplier<Map<String, Object>> s) {
        return TomlFormat.INSTANCE.createConfig(s);
    }
    
    public static CommentedConfig newConcurrentConfig() {
        return TomlFormat.INSTANCE.createConcurrentConfig();
    }
    
    private TomlFormat() {
        super();
    }
    
    @Override
    public TomlWriter createWriter() {
        return new TomlWriter();
    }
    
    @Override
    public TomlParser createParser() {
        return new TomlParser();
    }
    
    @Override
    public CommentedConfig createConfig(final Supplier<Map<String, Object>> mapCreator) {
        return CommentedConfig.of(mapCreator, this);
    }
    
    @Override
    public boolean supportsComments() {
        return true;
    }
    
    @Override
    public boolean supportsType(final Class<?> type) {
        return super.supportsType(type) || Temporal.class.isAssignableFrom(type);
    }
    
    @Override
    public /* bridge */ Config createConfig(final Supplier mapCreator) {
        return this.createConfig((Supplier<Map<String, Object>>)mapCreator);
    }
    
    @Override
    public /* bridge */ ConfigParser createParser() {
        return this.createParser();
    }
    
    @Override
    public /* bridge */ ConfigWriter createWriter() {
        return this.createWriter();
    }
    
    static {
        FormatDetector.registerExtension("toml", INSTANCE = new TomlFormat());
    }
}
