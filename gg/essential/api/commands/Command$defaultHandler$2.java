package gg.essential.api.commands;

import kotlin.jvm.functions.*;
import java.util.*;
import java.lang.reflect.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u0010\u0012\f\u0012
                                                    \u0003*\u0004\u0018\u00010\u00020\u00020\u00012
                                                   \u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H
                                                   ¢\u0006\u0002\b\u0006""" }, d2 = { "<anonymous>", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "it", "Ljava/lang/Class;", "invoke" })
static final class Command$defaultHandler$2 extends Lambda implements Function1<Class<?>, List<? extends Method>> {
    public static final Command$defaultHandler$2 INSTANCE;
    
    Command$defaultHandler$2() {
        super(1);
    }
    
    @NotNull
    public final List<Method> invoke(@NotNull final Class<?> it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final Method[] declaredMethods = it.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue((Object)declaredMethods, "it.declaredMethods");
        return ArraysKt.toList((Object[])declaredMethods);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Class)p1);
    }
    
    static {
        Command$defaultHandler$2.INSTANCE = new Command$defaultHandler$2();
    }
}