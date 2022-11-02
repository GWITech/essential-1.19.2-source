package gg.essential.util;

import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/util/GLUtil;", "", "()V", "isGL30", "Lkotlin/Lazy;", "", "()Lkotlin/Lazy;", "essential" })
public final class GLUtil
{
    @NotNull
    public static final GLUtil INSTANCE;
    @NotNull
    private static final Lazy<Boolean> isGL30;
    
    private GLUtil() {
        super();
    }
    
    @NotNull
    public final Lazy<Boolean> isGL30() {
        return GLUtil.isGL30;
    }
    
    static {
        INSTANCE = new GLUtil();
        isGL30 = LazyKt.lazy((Function0)GLUtil$isGL30.GLUtil$isGL30$1.INSTANCE);
    }
}
