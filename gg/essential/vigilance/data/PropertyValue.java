package gg.essential.vigilance.data;

import kotlin.*;
import gg.essential.vigilance.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\rH&J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\rH&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u0011" }, d2 = { "Lgg/essential/vigilance/data/PropertyValue;", "", "()V", "initialized", "", "getInitialized", "()Z", "setInitialized", "(Z)V", "writeDataToFile", "getWriteDataToFile", "getValue", "instance", "Lgg/essential/vigilance/Vigilant;", "setValue", "", "value", "Vigilance" })
public abstract class PropertyValue
{
    private boolean initialized;
    private final boolean writeDataToFile;
    
    public PropertyValue() {
        super();
        this.writeDataToFile = true;
    }
    
    public final boolean getInitialized() {
        return this.initialized;
    }
    
    public final void setInitialized(final boolean <set-?>) {
        this.initialized = <set-?>;
    }
    
    public boolean getWriteDataToFile() {
        return this.writeDataToFile;
    }
    
    @Nullable
    public abstract Object getValue(@NotNull final Vigilant p0);
    
    public abstract void setValue(@Nullable final Object p0, @NotNull final Vigilant p1);
}
