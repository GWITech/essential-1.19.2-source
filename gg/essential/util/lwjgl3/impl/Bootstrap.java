package gg.essential.util.lwjgl3.impl;

import org.jetbrains.annotations.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import java.nio.file.*;
import org.lwjgl.system.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e" }, d2 = { "Lgg/essential/util/lwjgl3/impl/Bootstrap;", "", "()V", "gl3", "Lkotlin/Lazy;", "", "getGl3", "()Lkotlin/Lazy;", "setGl3", "(Lkotlin/Lazy;)V", "init", "", "nativesDir", "Ljava/nio/file/Path;", "impl" })
public final class Bootstrap
{
    @NotNull
    public static final Bootstrap INSTANCE;
    public static Lazy<Boolean> gl3;
    
    private Bootstrap() {
        super();
    }
    
    @NotNull
    public final Lazy<Boolean> getGl3() {
        final Lazy<Boolean> gl3 = Bootstrap.gl3;
        if (gl3 != null) {
            return gl3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gl3");
        return null;
    }
    
    public final void setGl3(@NotNull final Lazy<Boolean> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        Bootstrap.gl3 = <set-?>;
    }
    
    @JvmStatic
    public static final void init(@NotNull final Path nativesDir, @NotNull final Lazy<Boolean> gl3) {
        Intrinsics.checkNotNullParameter((Object)nativesDir, "nativesDir");
        Intrinsics.checkNotNullParameter((Object)gl3, "gl3");
        Bootstrap.INSTANCE.setGl3(gl3);
        Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.set((Object)nativesDir.toAbsolutePath().toString());
    }
    
    static {
        INSTANCE = new Bootstrap();
    }
}
