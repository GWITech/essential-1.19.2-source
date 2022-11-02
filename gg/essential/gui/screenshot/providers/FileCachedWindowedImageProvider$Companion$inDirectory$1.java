package gg.essential.gui.screenshot.providers;

import kotlin.jvm.functions.*;
import java.nio.file.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a
                                                    \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "invoke" })
static final class FileCachedWindowedImageProvider$Companion$inDirectory$1 extends Lambda implements Function1<Path, Path> {
    final /* synthetic */ Path $path;
    
    FileCachedWindowedImageProvider$Companion$inDirectory$1(final Path $path) {
        this.$path = $path;
        super(1);
    }
    
    public final Path invoke(@NotNull final Path $this$null) {
        Intrinsics.checkNotNullParameter((Object)$this$null, "$this$null");
        final Path resolve = this.$path.resolve($this$null.getFileName().toString());
        Intrinsics.checkNotNullExpressionValue((Object)resolve, "path.resolve(this.fileName.toString())");
        return resolve;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Path)p1);
    }
}