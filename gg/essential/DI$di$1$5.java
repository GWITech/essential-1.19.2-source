package gg.essential;

import kotlin.jvm.functions.*;
import org.kodein.di.bindings.*;
import gg.essential.api.config.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000\u0010\u0000\u001a\u00070\u0001�\u0006\u0002\b\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   �\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "Lgg/essential/api/config/EssentialConfig;", "Lorg/jetbrains/annotations/NotNull;", "Lorg/kodein/di/bindings/NoArgBindingDI;", "", "invoke" })
static final class DI$di$1$5 extends Lambda implements Function1<NoArgBindingDI<?>, EssentialConfig> {
    public static final DI$di$1$5 INSTANCE;
    
    DI$di$1$5() {
        super(1);
    }
    
    @NotNull
    public final EssentialConfig invoke(@NotNull final NoArgBindingDI<?> $this$singleton) {
        Intrinsics.checkNotNullParameter((Object)$this$singleton, "$this$singleton");
        return Essential.getInstance().config();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((NoArgBindingDI)p1);
    }
    
    static {
        DI$di$1$5.INSTANCE = new DI$di$1$5();
    }
}