package gg.essential.util;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.lwjgl.opengl.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0004\b\u0002\u0010\u0003""" }, d2 = { "<anonymous>", "", "invoke", "()Ljava/lang/Boolean;" })
static final class GLUtil$isGL30$1 extends Lambda implements Function0<Boolean> {
    public static final GLUtil$isGL30$1 INSTANCE;
    
    GLUtil$isGL30$1() {
        super(0);
    }
    
    @NotNull
    public final Boolean invoke() {
        return GL.getCapabilities().OpenGL30;
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        GLUtil$isGL30$1.INSTANCE = new GLUtil$isGL30$1();
    }
}