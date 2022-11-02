package gg.essential.vigilance.impl.nightconfig.core.file;

import java.nio.file.*;
import gg.essential.vigilance.impl.nightconfig.core.*;

public class FileConfigBuilder extends GenericBuilder<Config, FileConfig>
{
    FileConfigBuilder(final Path file, final ConfigFormat<? extends Config> format) {
        super(file, format);
    }
    
    @Override
    protected FileConfig buildAutosave(final FileConfig chain) {
        return (FileConfig)new AutosaveFileConfig(chain);
    }
    
    @Override
    protected FileConfig buildNormal(final FileConfig chain) {
        return chain;
    }
}
