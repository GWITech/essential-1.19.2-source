package gg.essential.universal;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b	\u0010\u0002\u001a\u0004\b
                                                   \u0010\u0007¨\u0006\u000b""" }, d2 = { "Lgg/essential/universal/UMouse$Raw;", "", "()V", "x", "", "getX$annotations", "getX", "()D", "y", "getY$annotations", "getY", "universalcraft" })
public static final class Raw
{
    @NotNull
    public static final Raw INSTANCE;
    
    private Raw() {
        super();
    }
    
    public static final double getX() {
        return UMinecraft.getMinecraft().mouse.getX();
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getX$annotations() {
    }
    
    public static final double getY() {
        return UMinecraft.getMinecraft().mouse.getY();
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getY$annotations() {
    }
    
    static {
        Raw.INSTANCE = new Raw();
    }
}
