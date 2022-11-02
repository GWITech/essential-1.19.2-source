package gg.essential.gui.screenshot.bytebuf;

import kotlin.*;
import java.util.concurrent.atomic.*;
import kotlin.jvm.internal.*;
import io.netty.buffer.*;
import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000H
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010	\u001a\u00020\u0005J\b\u0010
                                                   \u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\u0014\u0010\u0012\u001a\u00060\u0013R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\rH\u0002JR\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f26\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\u0016H\u0002J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u001c""" }, d2 = { "Lgg/essential/gui/screenshot/bytebuf/LimitedAllocator;", "Lio/netty/buffer/AbstractByteBufAllocator;", "alloc", "Lio/netty/buffer/ByteBufAllocator;", "limit", "", "(Lio/netty/buffer/ByteBufAllocator;J)V", "allocatedBytes", "Ljava/util/concurrent/atomic/AtomicLong;", "getAllocatedBytes", "isDirectBufferPooled", "", "newDirectBuffer", "Lio/netty/buffer/ByteBuf;", "initialCapacity", "", "maxCapacity", "newHeapBuffer", "trackNew", "Lgg/essential/gui/screenshot/bytebuf/LimitedAllocator$TrackedByteBuf;", "buf", "tryAlloc", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "tryDirectBuffer", "tryHeapBuffer", "TrackedByteBuf", "essential" })
public final class LimitedAllocator extends AbstractByteBufAllocator
{
    @NotNull
    private final ByteBufAllocator alloc;
    private final long limit;
    @NotNull
    private final AtomicLong allocatedBytes;
    
    public LimitedAllocator(@NotNull final ByteBufAllocator alloc, final long limit) {
        Intrinsics.checkNotNullParameter((Object)alloc, "alloc");
        super();
        this.alloc = alloc;
        this.limit = limit;
        this.allocatedBytes = new AtomicLong();
    }
    
    public final long getAllocatedBytes() {
        return this.allocatedBytes.get();
    }
    
    @Nullable
    public final ByteBuf tryHeapBuffer(final int initialCapacity, final int maxCapacity) {
        return this.tryAlloc(initialCapacity, maxCapacity, (Function2<? super Integer, ? super Integer, ? extends ByteBuf>)new LimitedAllocator$tryHeapBuffer.LimitedAllocator$tryHeapBuffer$1((Object)this));
    }
    
    @Nullable
    public final ByteBuf tryDirectBuffer(final int initialCapacity, final int maxCapacity) {
        return this.tryAlloc(initialCapacity, maxCapacity, (Function2<? super Integer, ? super Integer, ? extends ByteBuf>)new LimitedAllocator$tryDirectBuffer.LimitedAllocator$tryDirectBuffer$1((Object)this));
    }
    
    private final ByteBuf tryAlloc(final int initialCapacity, final int maxCapacity, final Function2<? super Integer, ? super Integer, ? extends ByteBuf> alloc) {
        if (initialCapacity > this.limit) {
            return (ByteBuf)alloc.invoke((Object)initialCapacity, (Object)maxCapacity);
        }
        long prev;
        long next;
        do {
            prev = this.allocatedBytes.get();
            next = prev + initialCapacity;
            if (next > this.limit) {
                return null;
            }
        } while (!this.allocatedBytes.compareAndSet(prev, next));
        final Object invoke = alloc.invoke((Object)initialCapacity, (Object)maxCapacity);
        this.allocatedBytes.addAndGet(-initialCapacity);
        return (ByteBuf)invoke;
    }
    
    private final LimitedAllocator.TrackedByteBuf trackNew(final ByteBuf buf) {
        final int trackedCapacity = buf.capacity();
        this.allocatedBytes.addAndGet(trackedCapacity);
        return new LimitedAllocator.TrackedByteBuf(this, buf, trackedCapacity);
    }
    
    @NotNull
    protected ByteBuf newHeapBuffer(final int initialCapacity, final int maxCapacity) {
        final ByteBuf heapBuffer = this.alloc.heapBuffer(initialCapacity, maxCapacity);
        Intrinsics.checkNotNullExpressionValue((Object)heapBuffer, "alloc.heapBuffer(initialCapacity, maxCapacity)");
        return (ByteBuf)this.trackNew(heapBuffer);
    }
    
    @NotNull
    protected ByteBuf newDirectBuffer(final int initialCapacity, final int maxCapacity) {
        final ByteBuf directBuffer = this.alloc.directBuffer(initialCapacity, maxCapacity);
        Intrinsics.checkNotNullExpressionValue((Object)directBuffer, "alloc.directBuffer(initialCapacity, maxCapacity)");
        return (ByteBuf)this.trackNew(directBuffer);
    }
    
    public boolean isDirectBufferPooled() {
        return this.alloc.isDirectBufferPooled();
    }
    
    public static final /* synthetic */ AtomicLong access$getAllocatedBytes$p(final LimitedAllocator $this) {
        return $this.allocatedBytes;
    }
    
    public static final /* synthetic */ LimitedAllocator.TrackedByteBuf access$trackNew(final LimitedAllocator $this, final ByteBuf buf) {
        return $this.trackNew(buf);
    }
}
