package gg.essential.vigilance.impl.nightconfig.core.file;

import java.util.function.*;
import gg.essential.vigilance.impl.nightconfig.core.*;
import java.io.*;
import java.nio.file.*;
import gg.essential.vigilance.impl.nightconfig.core.utils.*;
import java.util.*;
import java.util.concurrent.*;

public final class FormatDetector
{
    private static final Map<String, Supplier<ConfigFormat<?>>> registry;
    
    public static void registerExtension(final String fileExtension, final ConfigFormat<?> format) {
        FormatDetector.registry.put(fileExtension, () -> format);
    }
    
    public static void registerExtension(final String fileExtension, final Supplier<ConfigFormat<?>> formatSupplier) {
        FormatDetector.registry.put(fileExtension, formatSupplier);
    }
    
    public static ConfigFormat<?> detect(final File file) {
        return detectByName(file.getName());
    }
    
    public static ConfigFormat<?> detect(final Path file) {
        return detectByName(file.getFileName().toString());
    }
    
    public static ConfigFormat<?> detectByName(final String fileName) {
        final List<String> splitted = StringUtils.split(fileName, '.');
        final String fileExtension = splitted.get(splitted.size() - 1);
        final Supplier<ConfigFormat<?>> supplier = FormatDetector.registry.get(fileExtension);
        return (supplier == null) ? null : supplier.get();
    }
    
    private static void tryLoad(final String className) {
        try {
            Class.forName(className);
        }
        catch (final ClassNotFoundException ex) {}
    }
    
    private FormatDetector() {
        super();
    }
    
    private static /* synthetic */ ConfigFormat lambda$registerExtension$0(final ConfigFormat format) {
        return format;
    }
    
    static {
        registry = new ConcurrentHashMap<String, Supplier<ConfigFormat<?>>>();
        tryLoad("gg.essential.vigilance.impl.nightconfig.toml.TomlFormat");
        tryLoad("gg.essential.vigilance.impl.nightconfig.hocon.HoconFormat");
        tryLoad("gg.essential.vigilance.impl.nightconfig.json.JsonFormat");
        tryLoad("gg.essential.vigilance.impl.nightconfig.yaml.YamlFormat");
    }
}
