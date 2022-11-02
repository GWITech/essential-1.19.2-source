package gg.essential.vigilance.data;

import kotlin.*;
import gg.essential.vigilance.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH¦\u0002J\u001a\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010" }, d2 = { "Lgg/essential/vigilance/data/CallablePropertyValue;", "Lgg/essential/vigilance/data/PropertyValue;", "()V", "writeDataToFile", "", "getWriteDataToFile", "()Z", "getValue", "", "instance", "Lgg/essential/vigilance/Vigilant;", "invoke", "", "setValue", "value", "", "Vigilance" })
public abstract class CallablePropertyValue extends PropertyValue
{
    private final boolean writeDataToFile;
    
    public CallablePropertyValue() {
        super();
    }
    
    @Override
    public boolean getWriteDataToFile() {
        return this.writeDataToFile;
    }
    
    @NotNull
    @Override
    public Void getValue(@NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        throw new IllegalStateException();
    }
    
    @NotNull
    public Void setValue(@Nullable final Object value, @NotNull final Vigilant instance) {
        Intrinsics.checkNotNullParameter((Object)instance, "instance");
        throw new IllegalStateException();
    }
    
    public abstract void invoke(@NotNull final Vigilant p0);
    
    @Override
    public /* bridge */ Object getValue(final Vigilant instance) {
        return this.getValue(instance);
    }
    
    @Override
    public /* bridge */ void setValue(final Object value, final Vigilant instance) {
        this.setValue(value, instance);
    }
}
