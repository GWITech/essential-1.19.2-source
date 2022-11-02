package gg.essential.vigilance.impl.nightconfig.core.file;

import gg.essential.vigilance.impl.nightconfig.core.*;
import java.net.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

@FunctionalInterface
public interface FileNotFoundAction
{
    public static final FileNotFoundAction CREATE_EMPTY = (f, c) -> {
        Files.createFile(f, (FileAttribute<?>[])new FileAttribute[0]);
        c.initEmptyFile(f);
        return false;
    };
    public static final FileNotFoundAction READ_NOTHING = (f, c) -> false;
    public static final FileNotFoundAction THROW_ERROR = (f, c) -> {
        throw new NoSuchFileException(f.toAbsolutePath().toString());
    };
    
    boolean run(final Path p0, final ConfigFormat<?> p1) throws IOException;
    
    default FileNotFoundAction copyData(final URL url) {
        return (f, c) -> {
            Files.copy(url.openStream(), f, new CopyOption[0]);
            return true;
        };
    }
    
    default FileNotFoundAction copyData(final File file) {
        return (f, c) -> {
            Files.copy(new FileInputStream(file), f, new CopyOption[0]);
            return true;
        };
    }
    
    default FileNotFoundAction copyData(final Path file) {
        return (f, c) -> {
            Files.copy(file, f, new CopyOption[0]);
            return true;
        };
    }
    
    default FileNotFoundAction copyData(final InputStream data) {
        return (f, c) -> {
            Files.copy(data, f, new CopyOption[0]);
            return true;
        };
    }
    
    default FileNotFoundAction copyResource(final String resourcePath) {
        return copyData(FileNotFoundAction.class.getResource(resourcePath));
    }
    
    default /* synthetic */ boolean lambda$copyData$6(final InputStream data, final Path f, final ConfigFormat c) throws IOException {
        Files.copy(data, f, new CopyOption[0]);
        return true;
    }
    
    default /* synthetic */ boolean lambda$copyData$5(final Path file, final Path f, final ConfigFormat c) throws IOException {
        Files.copy(file, f, new CopyOption[0]);
        return true;
    }
    
    default /* synthetic */ boolean lambda$copyData$4(final File file, final Path f, final ConfigFormat c) throws IOException {
        Files.copy(new FileInputStream(file), f, new CopyOption[0]);
        return true;
    }
    
    default /* synthetic */ boolean lambda$copyData$3(final URL url, final Path f, final ConfigFormat c) throws IOException {
        Files.copy(url.openStream(), f, new CopyOption[0]);
        return true;
    }
    
    default /* synthetic */ boolean lambda$static$2(final Path f, final ConfigFormat c) throws IOException {
        throw new NoSuchFileException(f.toAbsolutePath().toString());
    }
    
    default /* synthetic */ boolean lambda$static$1(final Path f, final ConfigFormat c) throws IOException {
        return false;
    }
    
    default /* synthetic */ boolean lambda$static$0(final Path f, final ConfigFormat c) throws IOException {
        Files.createFile(f, (FileAttribute<?>[])new FileAttribute[0]);
        c.initEmptyFile(f);
        return false;
    }
}
