package gg.essential;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import org.kodein.di.*;
import java.util.*;
import org.apache.logging.log4j.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0006\u0010\u0011\u001a\u00020\u000fR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010	\u001a\u00020
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0012""" }, d2 = { "Lgg/essential/DI;", "Lgg/essential/api/DI;", "()V", "di", "Lorg/kodein/di/DI;", "getDi", "()Lorg/kodein/di/DI;", "hasStarted", "", "logger", "Lorg/apache/logging/log4j/Logger;", "modules", "", "Lorg/kodein/di/DI$Module;", "addModule", "", "module", "startDI", "essential" })
public final class DI extends gg.essential.api.DI
{
    @NotNull
    public static final DI INSTANCE;
    @NotNull
    private static final List<DI$Module> modules;
    @NotNull
    private static final Logger logger;
    private static boolean hasStarted;
    
    private DI() {
        super();
    }
    
    public final void startDI() {
        if (DI.hasStarted) {
            DI.logger.error("Essential Dependency Injection attempted to start, but has already started.");
            return;
        }
        DI.logger.info("Starting DI!");
        this.init();
        DI.hasStarted = true;
    }
    
    @Override
    public void addModule(@NotNull final DI$Module module) {
        Intrinsics.checkNotNullParameter((Object)module, "module");
        DI.modules.add(module);
    }
    
    @NotNull
    public org.kodein.di.DI getDi() {
        return DI$Companion.invoke$default(org.kodein.di.DI.Companion, false, (Function1)DI$di.DI$di$1.INSTANCE, 1, (Object)null);
    }
    
    public static final /* synthetic */ List access$getModules$p() {
        return DI.modules;
    }
    
    static {
        INSTANCE = new DI();
        modules = new ArrayList<DI$Module>();
        final Logger logger2 = LogManager.getLogger("Essential - DI");
        Intrinsics.checkNotNullExpressionValue((Object)logger2, "getLogger(\"Essential - DI\")");
        logger = logger2;
    }
}
