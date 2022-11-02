package gg.essential.vigilance.impl.nightconfig.core.file;

import gg.essential.vigilance.impl.nightconfig.core.*;
import java.util.function.*;
import java.util.*;
import java.nio.charset.*;
import java.net.*;
import java.nio.file.*;
import gg.essential.vigilance.impl.nightconfig.core.io.*;
import java.io.*;

public abstract class GenericBuilder<Base extends Config, Result extends FileConfig>
{
    protected final Path file;
    private Base config;
    protected final ConfigFormat<? extends Base> format;
    protected final ConfigWriter writer;
    protected final ConfigParser<? extends Base> parser;
    protected Charset charset;
    protected WritingMode writingMode;
    protected ParsingMode parsingMode;
    protected FileNotFoundAction nefAction;
    protected boolean sync;
    protected boolean autosave;
    protected boolean autoreload;
    protected boolean concurrent;
    protected boolean insertionOrder;
    protected Supplier<Map<String, Object>> mapCreator;
    
    GenericBuilder(final Path file, final ConfigFormat<? extends Base> format) {
        super();
        this.charset = StandardCharsets.UTF_8;
        this.writingMode = WritingMode.REPLACE;
        this.parsingMode = ParsingMode.REPLACE;
        this.nefAction = FileNotFoundAction.CREATE_EMPTY;
        this.sync = false;
        this.autosave = false;
        this.autoreload = false;
        this.concurrent = false;
        this.insertionOrder = Config.isInsertionOrderPreserved();
        this.mapCreator = null;
        this.file = file;
        this.format = format;
        this.writer = format.createWriter();
        this.parser = format.createParser();
    }
    
    public GenericBuilder<Base, Result> charset(final Charset charset) {
        this.charset = charset;
        return this;
    }
    
    public GenericBuilder<Base, Result> writingMode(final WritingMode writingMode) {
        this.writingMode = writingMode;
        return this;
    }
    
    public GenericBuilder<Base, Result> parsingMode(final ParsingMode parsingMode) {
        this.parsingMode = parsingMode;
        return this;
    }
    
    public GenericBuilder<Base, Result> onFileNotFound(final FileNotFoundAction nefAction) {
        this.nefAction = nefAction;
        return this;
    }
    
    public GenericBuilder<Base, Result> defaultResource(final String resourcePath) {
        return this.onFileNotFound(FileNotFoundAction.copyResource(resourcePath));
    }
    
    public GenericBuilder<Base, Result> defaultData(final File file) {
        return this.onFileNotFound(FileNotFoundAction.copyData(file));
    }
    
    public GenericBuilder<Base, Result> defaultData(final Path file) {
        return this.onFileNotFound(FileNotFoundAction.copyData(file));
    }
    
    public GenericBuilder<Base, Result> defaultData(final URL url) {
        return this.onFileNotFound(FileNotFoundAction.copyData(url));
    }
    
    public GenericBuilder<Base, Result> sync() {
        this.sync = true;
        return this;
    }
    
    public GenericBuilder<Base, Result> autosave() {
        this.autosave = true;
        return this;
    }
    
    public GenericBuilder<Base, Result> autoreload() {
        this.autoreload = true;
        return this;
    }
    
    public GenericBuilder<Base, Result> concurrent() {
        if (this.config == null) {
            this.config = (Base)this.format.createConcurrentConfig();
        }
        this.concurrent = true;
        return this;
    }
    
    public GenericBuilder<Base, Result> preserveInsertionOrder() {
        this.insertionOrder = true;
        return this;
    }
    
    public GenericBuilder<Base, Result> backingMapCreator(final Supplier<Map<String, Object>> s) {
        this.mapCreator = s;
        return this;
    }
    
    public Result build() {
        FileConfig fileConfig;
        if (this.sync) {
            fileConfig = (FileConfig)new WriteSyncFileConfig(this.getConfig(), this.file, this.charset, this.writer, this.writingMode, (ConfigParser)this.parser, this.parsingMode, this.nefAction);
        }
        else {
            if (this.autoreload) {
                this.concurrent();
            }
            fileConfig = new WriteAsyncFileConfig<Object>(this.getConfig(), this.file, this.charset, this.writer, this.writingMode, this.parser, this.parsingMode, this.nefAction);
        }
        if (this.autoreload) {
            if (Files.notExists(this.file, new LinkOption[0])) {
                try {
                    this.nefAction.run(this.file, this.format);
                }
                catch (final IOException e) {
                    throw new WritingException("An exception occured while executing the FileNotFoundAction for file " + this.file, e);
                }
            }
            fileConfig = (FileConfig)new AutoreloadFileConfig(fileConfig);
        }
        if (this.autosave) {
            return this.buildAutosave(fileConfig);
        }
        return this.buildNormal(fileConfig);
    }
    
    protected abstract Result buildAutosave(final FileConfig p0);
    
    protected abstract Result buildNormal(final FileConfig p0);
    
    protected final Base getConfig() {
        if (this.config == null) {
            if (this.mapCreator == null) {
                this.mapCreator = Config.getDefaultMapCreator(this.concurrent, this.insertionOrder);
            }
            this.config = (Base)this.format.createConfig(this.mapCreator);
        }
        return this.config;
    }
}
