package gg.essential.vigilance.impl.nightconfig.core.io;

import gg.essential.vigilance.impl.nightconfig.core.*;
import gg.essential.vigilance.impl.nightconfig.core.utils.*;
import java.nio.charset.*;
import gg.essential.vigilance.impl.nightconfig.core.file.*;
import java.nio.file.*;
import java.io.*;
import java.net.*;

public interface ConfigParser<C extends Config>
{
    ConfigFormat<C> getFormat();
    
    C parse(final Reader p0);
    
    void parse(final Reader p0, final Config p1, final ParsingMode p2);
    
    default C parse(final String input) {
        return this.parse(new FastStringReader(input));
    }
    
    default void parse(final String input, final Config destination, final ParsingMode parsingMode) {
        this.parse(new StringReader(input), destination, parsingMode);
    }
    
    default C parse(final InputStream input) {
        return this.parse(input, StandardCharsets.UTF_8);
    }
    
    default C parse(final InputStream input, final Charset charset) {
        return this.parse(new BufferedReader(new InputStreamReader(input, charset)));
    }
    
    default void parse(final InputStream input, final Config destination, final ParsingMode parsingMode) {
        this.parse(input, destination, parsingMode, StandardCharsets.UTF_8);
    }
    
    default void parse(final InputStream input, final Config destination, final ParsingMode parsingMode, final Charset charset) {
        final Reader reader = new BufferedReader(new InputStreamReader(input, charset));
        this.parse(reader, destination, parsingMode);
    }
    
    default C parse(final File file, final FileNotFoundAction nefAction) {
        return this.parse(file, nefAction, StandardCharsets.UTF_8);
    }
    
    default C parse(final File file, final FileNotFoundAction nefAction, final Charset charset) {
        return this.parse(file.toPath(), nefAction, charset);
    }
    
    default void parse(final File file, final Config destination, final ParsingMode parsingMode, final FileNotFoundAction nefAction) {
        this.parse(file, destination, parsingMode, nefAction, StandardCharsets.UTF_8);
    }
    
    default void parse(final File file, final Config destination, final ParsingMode parsingMode, final FileNotFoundAction nefAction, final Charset charset) {
        this.parse(file.toPath(), destination, parsingMode, nefAction, charset);
    }
    
    default C parse(final Path file, final FileNotFoundAction nefAction) {
        return this.parse(file, nefAction, StandardCharsets.UTF_8);
    }
    
    default C parse(final Path file, final FileNotFoundAction nefAction, final Charset charset) {
        try {
            if (Files.notExists(file, new LinkOption[0]) && !nefAction.run(file, this.getFormat())) {
                return this.getFormat().createConfig();
            }
            try (final InputStream input = Files.newInputStream(file, new OpenOption[0])) {
                return this.parse(input, charset);
            }
        }
        catch (final IOException e) {
            throw new WritingException("An I/O error occured", e);
        }
    }
    
    default void parse(final Path file, final Config destination, final ParsingMode parsingMode, final FileNotFoundAction nefAction) {
        this.parse(file, destination, parsingMode, nefAction, StandardCharsets.UTF_8);
    }
    
    default void parse(final Path file, final Config destination, final ParsingMode parsingMode, final FileNotFoundAction nefAction, final Charset charset) {
        try {
            if (Files.notExists(file, new LinkOption[0]) && !nefAction.run(file, this.getFormat())) {
                return;
            }
            try (final InputStream input = Files.newInputStream(file, new OpenOption[0])) {
                this.parse(input, destination, parsingMode, charset);
            }
        }
        catch (final IOException e) {
            throw new WritingException("An I/O error occured", e);
        }
    }
    
    default C parse(final URL url) {
        URLConnection connection;
        try {
            connection = url.openConnection();
        }
        catch (final IOException e) {
            throw new WritingException("Unable to connect to the URL", e);
        }
        final String encoding = connection.getContentEncoding();
        final Charset charset = (encoding == null) ? StandardCharsets.UTF_8 : Charset.forName(encoding);
        try (final Reader reader = new BufferedReader(new InputStreamReader(url.openStream(), charset))) {
            return this.parse(reader);
        }
        catch (final IOException e2) {
            throw new WritingException("An I/O error occured", e2);
        }
    }
    
    default void parse(final URL url, final Config destination, final ParsingMode parsingMode) {
        URLConnection connection;
        try {
            connection = url.openConnection();
        }
        catch (final IOException e) {
            throw new WritingException("Unable to connect to the URL", e);
        }
        final String encoding = connection.getContentEncoding();
        final Charset charset = (encoding == null) ? StandardCharsets.UTF_8 : Charset.forName(encoding);
        try (final Reader reader = new BufferedReader(new InputStreamReader(url.openStream(), charset))) {
            this.parse(reader, destination, parsingMode);
        }
        catch (final IOException e2) {
            throw new WritingException("An I/O error occured", e2);
        }
    }
}
