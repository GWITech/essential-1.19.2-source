package gg.essential.lib.kdiscordipc.core.event.impl;

import gg.essential.lib.kdiscordipc.core.event.*;
import kotlin.*;
import gg.essential.lib.kdiscordipc.core.event.data.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/event/impl/ErrorEvent;", "Lgg/essential/lib/kdiscordipc/core/event/Event;", "data", "Lgg/essential/lib/kdiscordipc/core/event/data/ErrorEventData;", "(Ldev/cbyrne/kdiscordipc/core/event/data/ErrorEventData;)V", "getData", "()Ldev/cbyrne/kdiscordipc/core/event/data/ErrorEventData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "KDiscordIPC" })
public final class ErrorEvent implements Event
{
    @NotNull
    private final ErrorEventData data;
    
    public ErrorEvent(@NotNull final ErrorEventData data) {
        Intrinsics.checkNotNullParameter((Object)data, "data");
        super();
        this.data = data;
    }
    
    @NotNull
    public final ErrorEventData getData() {
        return this.data;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ErrorEvent(data=" + this.data + ')';
    }
    
    @Override
    public int hashCode() {
        return this.data.hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof ErrorEvent && Intrinsics.areEqual((Object)this.data, (Object)((ErrorEvent)other).data));
    }
}
