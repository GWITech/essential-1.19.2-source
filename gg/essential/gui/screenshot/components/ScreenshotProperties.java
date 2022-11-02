package gg.essential.gui.screenshot.components;

import kotlin.*;
import java.nio.file.*;
import gg.essential.handlers.screenshot.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J	\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032
                                                   \b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J	\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0007\u0010\b"\u0004\b	\u0010
                                                   R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "", "path", "Ljava/nio/file/Path;", "metadata", "Lgg/essential/handlers/screenshot/ClientScreenshotMetadata;", "(Ljava/nio/file/Path;Lgg/essential/handlers/screenshot/ClientScreenshotMetadata;)V", "getMetadata", "()Lgg/essential/handlers/screenshot/ClientScreenshotMetadata;", "setMetadata", "(Lgg/essential/handlers/screenshot/ClientScreenshotMetadata;)V", "getPath", "()Ljava/nio/file/Path;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "essential" })
public final class ScreenshotProperties
{
    @NotNull
    private final Path path;
    @Nullable
    private ClientScreenshotMetadata metadata;
    
    public ScreenshotProperties(@NotNull final Path path, @Nullable final ClientScreenshotMetadata metadata) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        super();
        this.path = path;
        this.metadata = metadata;
    }
    
    @NotNull
    public final Path getPath() {
        return this.path;
    }
    
    @Nullable
    public final ClientScreenshotMetadata getMetadata() {
        return this.metadata;
    }
    
    public final void setMetadata(@Nullable final ClientScreenshotMetadata <set-?>) {
        this.metadata = <set-?>;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return other instanceof ScreenshotProperties && Intrinsics.areEqual((Object)this.path, (Object)((ScreenshotProperties)other).path);
    }
    
    @Override
    public int hashCode() {
        return this.path.hashCode();
    }
    
    @NotNull
    public final Path component1() {
        return this.path;
    }
    
    @Nullable
    public final ClientScreenshotMetadata component2() {
        return this.metadata;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ScreenshotProperties(path=" + this.path + ", metadata=" + this.metadata;
    }
}
