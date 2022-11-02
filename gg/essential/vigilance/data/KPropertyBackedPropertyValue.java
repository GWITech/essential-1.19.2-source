package gg.essential.vigilance.data;

import kotlin.*;
import kotlin.reflect.*;
import kotlin.jvm.internal.*;
import gg.essential.vigilance.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010" }, d2 = { "Lgg/essential/vigilance/data/KPropertyBackedPropertyValue;", "T", "Lgg/essential/vigilance/data/PropertyValue;", "property", "Lkotlin/reflect/KMutableProperty0;", "(Lkotlin/reflect/KMutableProperty0;)V", "getProperty$Vigilance", "()Lkotlin/reflect/KMutableProperty0;", "getValue", "instance", "Lgg/essential/vigilance/Vigilant;", "(Lgg/essential/vigilance/Vigilant;)Ljava/lang/Object;", "setValue", "", "value", "", "Vigilance" })
public final class KPropertyBackedPropertyValue<T> extends PropertyValue
{
    @NotNull
    private final KMutableProperty0<T> property;
    
    public KPropertyBackedPropertyValue(@NotNull final KMutableProperty0<T> property) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        super();
        this.property = property;
    }
    
    @NotNull
    public final KMutableProperty0<T> getProperty$Vigilance() {
        return this.property;
    }
    
    @Override
    public T getValue(@NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        return (T)this.property.get();
    }
    
    @Override
    public void setValue(@Nullable final Object value, @NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        this.property.set(value);
    }
}
