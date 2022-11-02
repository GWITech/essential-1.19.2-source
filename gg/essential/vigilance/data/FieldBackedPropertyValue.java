package gg.essential.vigilance.data;

import kotlin.*;
import java.lang.reflect.*;
import kotlin.jvm.internal.*;
import gg.essential.vigilance.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e" }, d2 = { "Lgg/essential/vigilance/data/FieldBackedPropertyValue;", "Lgg/essential/vigilance/data/PropertyValue;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "getField$Vigilance", "()Ljava/lang/reflect/Field;", "getValue", "", "instance", "Lgg/essential/vigilance/Vigilant;", "setValue", "", "value", "Vigilance" })
public final class FieldBackedPropertyValue extends PropertyValue
{
    @NotNull
    private final Field field;
    
    public FieldBackedPropertyValue(@NotNull final Field field) {
        Intrinsics.checkNotNullParameter((Object)field, "field");
        super();
        this.field = field;
    }
    
    @NotNull
    public final Field getField$Vigilance() {
        return this.field;
    }
    
    @Nullable
    @Override
    public Object getValue(@NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        return this.field.get(instance);
    }
    
    @Override
    public void setValue(@Nullable final Object value, @NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        if (value instanceof Double && Intrinsics.areEqual((Object)this.field.getType(), (Object)Float.TYPE)) {
            this.field.set(instance, (float)((Number)value).doubleValue());
        }
        else if (value instanceof Float && Intrinsics.areEqual((Object)this.field.getType(), (Object)Double.TYPE)) {
            this.field.set(instance, (double)((Number)value).floatValue());
        }
        else {
            this.field.set(instance, value);
        }
    }
}
