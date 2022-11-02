package gg.essential.loader.stage2.data;

import org.jetbrains.annotations.*;
import java.io.*;
import java.nio.file.*;
import java.lang.reflect.*;
import com.google.gson.*;
import java.util.*;
import com.google.gson.stream.*;

public class FabricModJson
{
    private static final Gson GSON;
    private final int schemaVersion;
    @NotNull
    private final String id;
    @NotNull
    private final String version;
    @Nullable
    private final String name;
    @Nullable
    private final Map<String, VersionRange> depends;
    @Nullable
    private final List<Jar> jars;
    
    public FabricModJson(final int schemaVersion, @NotNull final String id, @NotNull final String version, @Nullable final String name, @Nullable final Map<String, VersionRange> depends, @Nullable final List<Jar> jars) {
        super();
        this.schemaVersion = schemaVersion;
        this.id = id;
        this.version = version;
        this.name = name;
        this.depends = depends;
        this.jars = jars;
    }
    
    public int getSchemaVersion() {
        return this.schemaVersion;
    }
    
    @NotNull
    public String getId() {
        return this.id;
    }
    
    @NotNull
    public String getVersion() {
        return this.version;
    }
    
    @Nullable
    public String getName() {
        return this.name;
    }
    
    public Map<String, VersionRange> getDepends() {
        return (this.depends == null) ? Collections.emptyMap() : this.depends;
    }
    
    public List<Jar> getJars() {
        return (this.jars == null) ? Collections.emptyList() : this.jars;
    }
    
    private FabricModJson validate() throws IOException {
        if (this.id == null) {
            throw new IOException("Missing \"id\" in fabric.mod.json.");
        }
        if (this.version == null) {
            throw new IOException("Missing \"version\" in fabric.mod.json.");
        }
        return this;
    }
    
    public static void write(final Path jsonFile, final FabricModJson json) throws IOException {
        try (final BufferedWriter out = Files.newBufferedWriter(jsonFile, StandardOpenOption.CREATE)) {
            FabricModJson.GSON.toJson(json, out);
        }
    }
    
    public static FabricModJson read(final Path jsonFile) throws IOException {
        try (final BufferedReader in = Files.newBufferedReader(jsonFile)) {
            return FabricModJson.GSON.fromJson(in, FabricModJson.class).validate();
        }
    }
    
    public static FabricModJson readFromJar(final Path jarFile) throws IOException {
        try (final FileSystem fileSystem = FileSystems.newFileSystem(jarFile, (ClassLoader)null)) {
            return read(fileSystem.getPath("fabric.mod.json", new String[0]));
        }
    }
    
    static {
        GSON = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(VersionRange.class, new VersionRange.JsonAdapter(null)).create();
    }
    
    public static class Jar
    {
        private final String file;
        
        public Jar(final String file) {
            super();
            this.file = file;
        }
        
        public String getFile() {
            return this.file;
        }
    }
    
    public static class VersionRange extends ArrayList<String>
    {
        public VersionRange() {
            super();
        }
        
        public VersionRange(final String version) {
            super();
            this.add(version);
        }
        
        private static class JsonAdapter extends TypeAdapter<VersionRange>
        {
            private JsonAdapter() {
                super();
            }
            
            @Override
            public void write(final JsonWriter out, final VersionRange values) throws IOException {
                if (values.size() == 1) {
                    out.value(values.get(0));
                }
                else {
                    out.beginArray();
                    for (final String value : values) {
                        out.value(value);
                    }
                    out.endArray();
                }
            }
            
            @Override
            public VersionRange read(final JsonReader in) throws IOException {
                final VersionRange values = new VersionRange();
                if (in.peek() != JsonToken.BEGIN_ARRAY) {
                    values.add(in.nextString());
                }
                else {
                    in.beginArray();
                    while (in.peek() != JsonToken.END_ARRAY) {
                        values.add(in.nextString());
                    }
                    in.endArray();
                }
                return values;
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (VersionRange)o);
            }
            
            JsonAdapter(final FabricModJson.FabricModJson$1 x0) {
                this();
            }
        }
    }
}
