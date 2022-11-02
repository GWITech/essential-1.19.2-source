package gg.essential.util.resource;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import net.minecraft.resource.*;
import net.minecraft.util.*;
import java.io.*;
import net.minecraft.resource.metadata.*;
import java.util.function.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000^
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u001e
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010"
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002$%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010
                                                   \u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\u0006\u0010
                                                   \u001a\u00020\u000bH\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010
                                                   \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J'\u0010\u001e\u001a\u0004\u0018\u0001H\u001f"\b\b\u0000\u0010\u001f*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0"H\u0016¢\u0006\u0002\u0010#R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006&""" }, d2 = { "Lgg/essential/util/resource/ResourcePackAdapter;", "Lnet/minecraft/resource/ResourcePack;", "parent", "(Lnet/minecraft/resource/ResourcePack;)V", "getParent", "()Lnet/minecraft/resource/ResourcePack;", "close", "", "contains", "", "type", "Lnet/minecraft/resource/ResourceType;", "id", "Lnet/minecraft/util/Identifier;", "findResources", "", "namespace", "", "path", "filter", "Ljava/util/function/Predicate;", "getName", "getNamespaces", "", "mapToParent", "Lgg/essential/util/resource/ResourcePackAdapter$FileMapper;", "mapToParentPath", "open", "Ljava/io/InputStream;", "openRoot", "parseMetadata", "T", "", "serializer", "Lnet/minecraft/resource/metadata/ResourceMetadataReader;", "(Lnet/minecraft/resource/metadata/ResourceMetadataReader;)Ljava/lang/Object;", "FileMapper", "PathChange", "essential" })
public class ResourcePackAdapter implements ResourcePack
{
    @NotNull
    private final ResourcePack parent;
    
    public ResourcePackAdapter(@NotNull final ResourcePack parent) {
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        super();
        this.parent = parent;
    }
    
    @Nullable
    public FileMapper mapToParent(@NotNull final String path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        return null;
    }
    
    private final String mapToParentPath(final String path) {
        final FileMapper mapToParent = this.mapToParent(path);
        String parentPath;
        if (mapToParent == null || (parentPath = mapToParent.getParentPath()) == null) {
            parentPath = path;
        }
        return parentPath;
    }
    
    @NotNull
    public InputStream open(@NotNull final ResourceType type, @NotNull final Identifier id) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)id, "id");
        final String path = id.getPath();
        Intrinsics.checkNotNullExpressionValue((Object)path, "id.path");
        final FileMapper mapToParent;
        final FileMapper mapper = mapToParent = this.mapToParent(path);
        Identifier identifier;
        if (mapToParent != null) {
            final FileMapper it = mapToParent;
            identifier = new Identifier(id.getNamespace(), it.getParentPath());
        }
        else {
            identifier = id;
        }
        final Identifier parentId = identifier;
        final InputStream stream = this.parent.open(type, parentId);
        final FileMapper fileMapper = mapper;
        InputStream map;
        if (fileMapper != null) {
            Intrinsics.checkNotNullExpressionValue((Object)stream, "stream");
            map = fileMapper.map(stream);
        }
        else {
            Intrinsics.checkNotNullExpressionValue((Object)stream, "stream");
            map = stream;
        }
        return map;
    }
    
    public boolean contains(@NotNull final ResourceType type, @NotNull final Identifier id) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)id, "id");
        final ResourcePack parent = this.parent;
        final String namespace = id.getNamespace();
        final String path = id.getPath();
        Intrinsics.checkNotNullExpressionValue((Object)path, "id.path");
        return parent.contains(type, new Identifier(namespace, this.mapToParentPath(path)));
    }
    
    @Nullable
    public <T> T parseMetadata(@NotNull final ResourceMetadataReader<T> serializer) {
        Intrinsics.checkNotNullParameter((Object)serializer, "serializer");
        return (T)this.parent.parseMetadata((ResourceMetadataReader)serializer);
    }
    
    @NotNull
    public Set<String> getNamespaces(@NotNull final ResourceType type) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        final Set namespaces = this.parent.getNamespaces(type);
        Intrinsics.checkNotNullExpressionValue((Object)namespaces, "parent.getNamespaces(type)");
        return namespaces;
    }
    
    @NotNull
    public String getName() {
        final String name = this.parent.getName();
        Intrinsics.checkNotNullExpressionValue((Object)name, "parent.name");
        return name;
    }
    
    public void close() {
        this.parent.close();
    }
    
    @NotNull
    public Collection<Identifier> findResources(@NotNull final ResourceType type, @NotNull final String namespace, @NotNull final String path, @NotNull final Predicate<Identifier> filter) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)namespace, "namespace");
        Intrinsics.checkNotNullParameter((Object)path, "path");
        Intrinsics.checkNotNullParameter((Object)filter, "filter");
        final Collection resources = this.parent.findResources(type, namespace, path, (Predicate)filter);
        Intrinsics.checkNotNullExpressionValue((Object)resources, "parent.findResources(typ\u2026 namespace, path, filter)");
        return resources;
    }
    
    @Nullable
    public InputStream openRoot(@NotNull final String path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        return this.parent.openRoot(path);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001a
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00f8\u0001\u0000\u0082\u0002\u0006
                                                       \u0004\b!0\u0001¨\u0006	\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/util/resource/ResourcePackAdapter$FileMapper;", "", "parentPath", "", "getParentPath", "()Ljava/lang/String;", "map", "Ljava/io/InputStream;", "stream", "essential" })
    public interface FileMapper
    {
        @NotNull
        String getParentPath();
        
        @NotNull
        InputStream map(@NotNull final InputStream p0);
    }
}
