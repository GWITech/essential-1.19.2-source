package gg.essential.lib.okhttp3.internal.connection;

import java.lang.ref.*;

public static final class StreamAllocationReference extends WeakReference<StreamAllocation>
{
    public final Object callStackTrace;
    
    StreamAllocationReference(final StreamAllocation referent, final Object callStackTrace) {
        super(referent);
        this.callStackTrace = callStackTrace;
    }
}
