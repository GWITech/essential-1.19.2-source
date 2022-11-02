package gg.essential.universal.shader;

import kotlin.*;
import org.lwjgl.opengl.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0007""" }, d2 = { "Lgg/essential/universal/shader/BlendState$Companion;", "", "()V", "DISABLED", "Lgg/essential/universal/shader/BlendState;", "NORMAL", "active", "universalcraft" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    @NotNull
    public final BlendState active() {
        Equation equation;
        if ((equation = Equation.Companion.fromGl(GL11.glGetInteger(32777))) == null) {
            equation = Equation.ADD;
        }
        Param srcRgb;
        if ((srcRgb = Param.Companion.fromGl(GL11.glGetInteger(32969))) == null) {
            srcRgb = Param.ONE;
        }
        Param dstRgb;
        if ((dstRgb = Param.Companion.fromGl(GL11.glGetInteger(32968))) == null) {
            dstRgb = Param.ZERO;
        }
        Param srcAlpha;
        if ((srcAlpha = Param.Companion.fromGl(GL11.glGetInteger(32971))) == null) {
            srcAlpha = Param.ONE;
        }
        Param dstAlpha;
        if ((dstAlpha = Param.Companion.fromGl(GL11.glGetInteger(32970))) == null) {
            dstAlpha = Param.ZERO;
        }
        return new BlendState(equation, srcRgb, dstRgb, srcAlpha, dstAlpha, GL11.glGetBoolean(3042));
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
