package gg.essential.api.commands;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012
                                                   \u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "Ljava/lang/Class;", "it", "invoke" })
static final class Command$defaultHandler$1 extends Lambda implements Function1<Class<?>, Class<?>> {
    public static final Command$defaultHandler$1 INSTANCE;
    
    Command$defaultHandler$1() {
        super(1);
    }
    
    @Nullable
    public final Class<?> invoke(@NotNull final Class<?> it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it.getSuperclass();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Class)p1);
    }
    
    static {
        Command$defaultHandler$1.INSTANCE = new Command$defaultHandler$1();
    }
}