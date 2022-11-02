package gg.essential.vigilance.impl.nightconfig.core.file;

import java.io.*;
import gg.essential.vigilance.impl.nightconfig.core.*;
import java.nio.file.*;

public interface FileConfig extends Config, AutoCloseable
{
    File getFile();
    
    Path getNioPath();
    
    void save();
    
    void load();
    
    void close();
    
    default FileConfig checked() {
        return (FileConfig)new CheckedFileConfig(this);
    }
    
    default FileConfig of(final File file) {
        return of(file.toPath());
    }
    
    default FileConfig of(final File file, final ConfigFormat<? extends Config> format) {
        return of(file.toPath(), format);
    }
    
    default FileConfig of(final Path file) {
        final ConfigFormat<?> format = FormatDetector.detect(file);
        if (format == null) {
            throw new NoFormatFoundException("No suitable format for " + file.getFileName());
        }
        return of(file, (ConfigFormat<? extends Config>)format);
    }
    
    default FileConfig of(final Path file, final ConfigFormat<? extends Config> format) {
        return ((GenericBuilder<Base, FileConfig>)builder(file, format)).build();
    }
    
    default FileConfig of(final String filePath) {
        return of(Paths.get(filePath, new String[0]));
    }
    
    default FileConfig of(final String filePath, final ConfigFormat<?> format) {
        return of(Paths.get(filePath, new String[0]), (ConfigFormat<? extends Config>)format);
    }
    
    default FileConfig ofConcurrent(final File file) {
        return ofConcurrent(file.toPath());
    }
    
    default FileConfig ofConcurrent(final File file, final ConfigFormat<?> format) {
        return ofConcurrent(file.toPath(), format);
    }
    
    default FileConfig ofConcurrent(final Path file) {
        return builder(file).concurrent().build();
    }
    
    default FileConfig ofConcurrent(final Path file, final ConfigFormat<?> format) {
        return builder(file, format).concurrent().build();
    }
    
    default FileConfig ofConcurrent(final String filePath) {
        return ofConcurrent(Paths.get(filePath, new String[0]));
    }
    
    default FileConfig ofConcurrent(final String filePath, final ConfigFormat<?> format) {
        return ofConcurrent(Paths.get(filePath, new String[0]), format);
    }
    
    default FileConfigBuilder builder(final File file) {
        return builder(file.toPath());
    }
    
    default FileConfigBuilder builder(final File file, final ConfigFormat<?> format) {
        return builder(file.toPath(), format);
    }
    
    default FileConfigBuilder builder(final Path file) {
        final ConfigFormat<?> format = FormatDetector.detect(file);
        if (format == null) {
            throw new NoFormatFoundException("No suitable format for " + file.getFileName());
        }
        return builder(file, format);
    }
    
    default FileConfigBuilder builder(final Path file, final ConfigFormat<?> format) {
        return new FileConfigBuilder(file, (ConfigFormat<? extends Config>)format);
    }
    
    default FileConfigBuilder builder(final String filePath) {
        return builder(Paths.get(filePath, new String[0]));
    }
    
    default FileConfigBuilder builder(final String filePath, final ConfigFormat<?> format) {
        return builder(Paths.get(filePath, new String[0]), format);
    }
    
    default /* bridge */ Config checked() {
        return this.checked();
    }
}
