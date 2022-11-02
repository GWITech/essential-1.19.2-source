package gg.essential.loader.stage2.data;

import org.jetbrains.annotations.*;
import java.util.*;
import java.nio.file.*;
import java.io.*;
import java.util.jar.*;
import gg.essential.loader.stage2.util.*;

public class ModJarMetadata
{
    public static final ModJarMetadata EMPTY;
    @NotNull
    private final ModId mod;
    @NotNull
    private final ModVersion version;
    private final String platform;
    private final String checksum;
    
    public ModJarMetadata(@NotNull final ModId mod, @NotNull final ModVersion version, final String platform, final String checksum) {
        super();
        this.mod = mod;
        this.version = version;
        this.platform = platform;
        this.checksum = checksum;
    }
    
    @NotNull
    public ModId getMod() {
        return this.mod;
    }
    
    @NotNull
    public ModVersion getVersion() {
        return this.version;
    }
    
    public String getPlatform() {
        return this.platform;
    }
    
    public String getChecksum() {
        return this.checksum;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final ModJarMetadata that = (ModJarMetadata)o;
        return this.mod.equals(that.mod) && this.version.equals(that.version) && Objects.equals(this.platform, that.platform) && Objects.equals(this.checksum, that.checksum);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.mod, this.version, this.platform, this.checksum);
    }
    
    public void write(final Path jarFile) throws IOException {
        try (final FileSystem fileSystem = FileSystems.newFileSystem(jarFile, (ClassLoader)null)) {
            final Path manifestPath = fileSystem.getPath("META-INF", "MANIFEST.MF");
            final Manifest manifest = new Manifest();
            if (Files.exists(manifestPath, new LinkOption[0])) {
                try (final InputStream in = Files.newInputStream(manifestPath, new OpenOption[0])) {
                    manifest.read(in);
                }
            }
            this.write(manifest.getMainAttributes());
            try (final OutputStream out = Files.newOutputStream(manifestPath, StandardOpenOption.CREATE)) {
                manifest.write(out);
            }
        }
    }
    
    public void write(final Attributes attributes) {
        put(attributes, "Essential-Mod-Publisher-Id", this.mod.getPublisherId());
        put(attributes, "Essential-Mod-Publisher-Slug", this.mod.getPublisherSlug());
        put(attributes, "Essential-Mod-Id", this.mod.getModId());
        put(attributes, "Essential-Mod-Slug", this.mod.getModSlug());
        put(attributes, "Essential-Mod-Version-Id", this.version.getId());
        put(attributes, "Essential-Mod-Version", this.version.getVersion());
        put(attributes, "Essential-Mod-Platform", this.platform);
        put(attributes, "Essential-Mod-Checksum", this.checksum);
    }
    
    private static void put(final Attributes attributes, final String key, final String value) {
        if (value != null) {
            attributes.putValue(key, value);
        }
    }
    
    public static ModJarMetadata read(final Attributes attributes) {
        return new ModJarMetadata(new ModId(attributes.getValue("Essential-Mod-Publisher-Id"), attributes.getValue("Essential-Mod-Publisher-Slug"), attributes.getValue("Essential-Mod-Id"), attributes.getValue("Essential-Mod-Slug")), new ModVersion(attributes.getValue("Essential-Mod-Version-Id"), attributes.getValue("Essential-Mod-Version")), attributes.getValue("Essential-Mod-Platform"), attributes.getValue("Essential-Mod-Checksum"));
    }
    
    public static ModJarMetadata read(final Path jarFile) throws IOException {
        ModJarMetadata metadata = ModJarMetadata.EMPTY;
        try (final FileSystem fileSystem = FileSystems.newFileSystem(jarFile, (ClassLoader)null)) {
            final Path manifestPath = fileSystem.getPath("META-INF", "MANIFEST.MF");
            if (Files.exists(manifestPath, new LinkOption[0])) {
                try (final InputStream in = Files.newInputStream(manifestPath, new OpenOption[0])) {
                    metadata = read(new Manifest(in).getMainAttributes());
                }
            }
        }
        if (metadata.getChecksum() == null) {
            final String checksum = Checksum.getChecksum(jarFile);
            metadata = new ModJarMetadata(metadata.mod, metadata.version, metadata.platform, checksum);
        }
        return metadata;
    }
    
    static {
        EMPTY = new ModJarMetadata(ModId.UNKNOWN, ModVersion.UNKNOWN, null, null);
    }
}
