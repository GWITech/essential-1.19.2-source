package gg.essential;

import kotlin.jvm.functions.*;
import org.kodein.di.bindings.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000\u0010\u0000\u001a
                                                    \u0002*\u0004\u0018\u00010\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "Lgg/essential/Essential;", "kotlin.jvm.PlatformType", "Lorg/kodein/di/bindings/NoArgBindingDI;", "", "invoke" })
static final class DI$di$1$1 extends Lambda implements Function1<NoArgBindingDI<?>, Essential> {
    public static final DI$di$1$1 INSTANCE;
    
    DI$di$1$1() {
        super(1);
    }
    
    public final Essential invoke(@NotNull final NoArgBindingDI<?> $this$provider) {
        Intrinsics.checkNotNullParameter((Object)$this$provider, "$this$provider");
        return Essential.getInstance();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((NoArgBindingDI)p1);
    }
    
    static {
        DI$di$1$1.INSTANCE = new DI$di$1$1();
    }
}