package gg.essential.util;

import kotlin.*;
import java.nio.file.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000*
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010	\u001a\u00020
                                                   2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011""" }, d2 = { "Lgg/essential/util/CodeSource$Jar;", "Lgg/essential/util/CodeSource;", "path", "Ljava/nio/file/Path;", "(Ljava/nio/file/Path;)V", "getPath", "()Ljava/nio/file/Path;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "essential" })
public static final class Jar implements CodeSource
{
    @NotNull
    private final Path path;
    
    public Jar(@NotNull final Path path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        super();
        this.path = path;
    }
    
    @NotNull
    public final Path getPath() {
        return this.path;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Jar(path=" + this.path;
    }
    
    @Override
    public int hashCode() {
        return this.path.hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof Jar && Intrinsics.areEqual((Object)this.path, (Object)((Jar)other).path));
    }
}
