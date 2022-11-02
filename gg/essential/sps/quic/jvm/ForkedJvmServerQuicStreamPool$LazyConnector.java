package gg.essential.sps.quic.jvm;

import gg.essential.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006	""" }, d2 = { "Lgg/essential/sps/quic/jvm/ForkedJvmServerQuicStreamPool$LazyConnector;", "", "()V", "inner", "Lgg/essential/util/RefCounted;", "Lgg/essential/sps/quic/jvm/ForkedJvmQuicConnector;", "obtain", "release", "", "essential" })
private static final class LazyConnector
{
    @NotNull
    private final RefCounted<ForkedJvmQuicConnector> inner;
    
    public LazyConnector() {
        super();
        this.inner = new RefCounted<ForkedJvmQuicConnector>();
    }
    
    @NotNull
    public final ForkedJvmQuicConnector obtain() {
        return this.inner.obtain((kotlin.jvm.functions.Function0<? extends ForkedJvmQuicConnector>)ForkedJvmServerQuicStreamPool$LazyConnector$obtain.ForkedJvmServerQuicStreamPool$LazyConnector$obtain$1.INSTANCE);
    }
    
    public final void release() {
        this.inner.release((kotlin.jvm.functions.Function1<? super ForkedJvmQuicConnector, Unit>)ForkedJvmServerQuicStreamPool$LazyConnector$release.ForkedJvmServerQuicStreamPool$LazyConnector$release$1.INSTANCE);
    }
}
