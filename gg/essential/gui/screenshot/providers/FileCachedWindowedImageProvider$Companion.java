package gg.essential.gui.screenshot.providers;

import kotlin.*;
import java.nio.file.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000*
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\u0010\u0001
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020	0\b¢\u0006\u0002\b
                                                   2\u0006\u0010\u000b\u001a\u00020	R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\f""" }, d2 = { "Lgg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider$Companion;", "", "()V", "locks", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "inDirectory", "Lkotlin/Function1;", "Ljava/nio/file/Path;", "Lkotlin/ExtensionFunctionType;", "path", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final Function1<Path, Path> inDirectory(@NotNull final Path path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        return (Function1<Path, Path>)new FileCachedWindowedImageProvider$Companion$inDirectory.FileCachedWindowedImageProvider$Companion$inDirectory$1(path);
    }
    
    public Companion(final byte b) {
        this();
    }
}
