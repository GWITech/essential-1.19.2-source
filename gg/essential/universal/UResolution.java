package gg.essential.universal;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001c
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0004
                                                   \u0002\u0010\b
                                                   \u0002\b\u0013\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020	8FX\u0087\u0004¢\u0006\f\u0012\u0004\b
                                                   \u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u001a\u00020	8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020	8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020	8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020	8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020	8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c""" }, d2 = { "Lgg/essential/universal/UResolution;", "", "()V", "scaleFactor", "", "getScaleFactor$annotations", "getScaleFactor", "()D", "scaledHeight", "", "getScaledHeight$annotations", "getScaledHeight", "()I", "scaledWidth", "getScaledWidth$annotations", "getScaledWidth", "viewportHeight", "getViewportHeight$annotations", "getViewportHeight", "viewportWidth", "getViewportWidth$annotations", "getViewportWidth", "windowHeight", "getWindowHeight$annotations", "getWindowHeight", "windowWidth", "getWindowWidth$annotations", "getWindowWidth", "universalcraft" })
public final class UResolution
{
    @NotNull
    public static final UResolution INSTANCE;
    
    private UResolution() {
        super();
    }
    
    public static final int getWindowWidth() {
        return UMinecraft.getMinecraft().getWindow().getWidth();
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getWindowWidth$annotations() {
    }
    
    public static final int getWindowHeight() {
        return UMinecraft.getMinecraft().getWindow().getHeight();
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getWindowHeight$annotations() {
    }
    
    public static final int getViewportWidth() {
        return UMinecraft.getMinecraft().getWindow().getFramebufferWidth();
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getViewportWidth$annotations() {
    }
    
    public static final int getViewportHeight() {
        return UMinecraft.getMinecraft().getWindow().getFramebufferHeight();
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getViewportHeight$annotations() {
    }
    
    public static final int getScaledWidth() {
        return UMinecraft.getMinecraft().getWindow().getScaledWidth();
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getScaledWidth$annotations() {
    }
    
    public static final int getScaledHeight() {
        return UMinecraft.getMinecraft().getWindow().getScaledHeight();
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getScaledHeight$annotations() {
    }
    
    public static final double getScaleFactor() {
        return UMinecraft.getMinecraft().getWindow().getScaleFactor();
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getScaleFactor$annotations() {
    }
    
    static {
        INSTANCE = new UResolution();
    }
}
