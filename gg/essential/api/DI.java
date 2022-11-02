package gg.essential.api;

import kotlin.*;
import gg.essential.api.utils.*;
import org.kodein.di.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H\u0004¨\u0006\b""" }, d2 = { "Lgg/essential/api/DI;", "Lorg/kodein/di/DIAware;", "()V", "addModule", "", "module", "Lorg/kodein/di/DI$Module;", "init", "essential-api" })
public abstract class DI implements DIAware
{
    public DI() {
        super();
    }
    
    public abstract void addModule(@NotNull final DI$Module p0);
    
    protected final void init() {
        DiKt.setEssentialDI(this);
    }
    
    @NotNull
    public DIContext<?> getDiContext() {
        return (DIContext<?>)DIAware$DefaultImpls.getDiContext((DIAware)this);
    }
    
    @Nullable
    public DITrigger getDiTrigger() {
        return DIAware$DefaultImpls.getDiTrigger((DIAware)this);
    }
}
