package gg.essential.vigilance.data;

import kotlin.*;
import java.lang.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.vigilance.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b" }, d2 = { "Lgg/essential/vigilance/data/MethodBackedPropertyValue;", "Lgg/essential/vigilance/data/CallablePropertyValue;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "getMethod$Vigilance", "()Ljava/lang/reflect/Method;", "invoke", "", "instance", "Lgg/essential/vigilance/Vigilant;", "Vigilance" })
public final class MethodBackedPropertyValue extends CallablePropertyValue
{
    @NotNull
    private final Method method;
    
    public MethodBackedPropertyValue(@NotNull final Method method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        super();
        this.method = method;
    }
    
    @NotNull
    public final Method getMethod$Vigilance() {
        return this.method;
    }
    
    @Override
    public void invoke(@NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        this.method.invoke(instance, new Object[0]);
    }
}
