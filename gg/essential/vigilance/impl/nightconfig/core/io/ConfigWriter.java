package gg.essential.vigilance.impl.nightconfig.core.io;

import gg.essential.vigilance.impl.nightconfig.core.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.io.*;
import java.net.*;

public interface ConfigWriter
{
    void write(final UnmodifiableConfig p0, final Writer p1);
    
    default void write(final UnmodifiableConfig config, final OutputStream output, final Charset charset) {
        final Writer writer = new BufferedWriter(new OutputStreamWriter(output, charset));
        this.write(config, writer);
        try {
            writer.flush();
        }
        catch (final IOException e) {
            throw new WritingException("Failed to flush the writer", e);
        }
    }
    
    default void write(final UnmodifiableConfig config, final OutputStream output) {
        this.write(config, output, StandardCharsets.UTF_8);
    }
    
    default void write(final UnmodifiableConfig config, final Path file, final WritingMode writingMode) {
        this.write(config, file, writingMode, StandardCharsets.UTF_8);
    }
    
    default void write(final UnmodifiableConfig config, final Path file, final WritingMode writingMode, final Charset charset) {
        StandardOpenOption[] options;
        if (writingMode == WritingMode.APPEND) {
            options = new StandardOpenOption[] { StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.APPEND };
        }
        else {
            options = new StandardOpenOption[] { StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING };
        }
        try (final OutputStream output = Files.newOutputStream(file, (OpenOption[])options)) {
            this.write(config, output, charset);
        }
        catch (final IOException e) {
            throw new WritingException("An I/O error occured", e);
        }
    }
    
    default void write(final UnmodifiableConfig config, final File file, final WritingMode writingMode) {
        this.write(config, file, writingMode, StandardCharsets.UTF_8);
    }
    
    default void write(final UnmodifiableConfig config, final File file, final WritingMode writingMode, final Charset charset) {
        this.write(config, file.toPath(), writingMode, charset);
    }
    
    default void write(final UnmodifiableConfig config, final URL url) {
        URLConnection connection;
        try {
            connection = url.openConnection();
        }
        catch (final IOException e) {
            throw new WritingException("Unable to connect to the URL", e);
        }
        final String encoding = connection.getContentEncoding();
        final Charset charset = (encoding == null) ? StandardCharsets.UTF_8 : Charset.forName(encoding);
        try (final OutputStream output = connection.getOutputStream()) {
            this.write(config, output, charset);
        }
        catch (final IOException e2) {
            throw new WritingException("An I/O error occured", e2);
        }
    }
    
    default String writeToString(final UnmodifiableConfig config) {
        final CharsWrapper.Builder builder = new CharsWrapper.Builder(64);
        this.write(config, builder);
        return builder.toString();
    }
}
