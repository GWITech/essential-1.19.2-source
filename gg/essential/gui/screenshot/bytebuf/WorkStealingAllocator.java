package gg.essential.gui.screenshot.bytebuf;

import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import io.netty.buffer.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020	H\u0016J\u0018\u0010
                                                   \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0010""" }, d2 = { "Lgg/essential/gui/screenshot/bytebuf/WorkStealingAllocator;", "Lio/netty/buffer/AbstractByteBufAllocator;", "alloc", "Lgg/essential/gui/screenshot/bytebuf/LimitedAllocator;", "work", "Lkotlin/Function0;", "", "(Lgg/essential/gui/screenshot/bytebuf/LimitedAllocator;Lkotlin/jvm/functions/Function0;)V", "isDirectBufferPooled", "", "newDirectBuffer", "Lio/netty/buffer/ByteBuf;", "initialCapacity", "", "maxCapacity", "newHeapBuffer", "essential" })
public final class WorkStealingAllocator extends AbstractByteBufAllocator
{
    @NotNull
    private final LimitedAllocator alloc;
    @NotNull
    private final Function0<Unit> work;
    
    public WorkStealingAllocator(@NotNull final LimitedAllocator alloc, @NotNull final Function0<Unit> work) {
        Intrinsics.checkNotNullParameter((Object)alloc, "alloc");
        Intrinsics.checkNotNullParameter((Object)work, "work");
        super();
        this.alloc = alloc;
        this.work = work;
    }
    
    public boolean isDirectBufferPooled() {
        return this.alloc.isDirectBufferPooled();
    }
    
    @NotNull
    protected ByteBuf newHeapBuffer(final int initialCapacity, final int maxCapacity) {
        ByteBuf buf;
        while (true) {
            buf = this.alloc.tryHeapBuffer(initialCapacity, maxCapacity);
            if (buf != null) {
                break;
            }
            this.work.invoke();
        }
        return buf;
    }
    
    @NotNull
    protected ByteBuf newDirectBuffer(final int initialCapacity, final int maxCapacity) {
        ByteBuf buf;
        while (true) {
            buf = this.alloc.tryDirectBuffer(initialCapacity, maxCapacity);
            if (buf != null) {
                break;
            }
            this.work.invoke();
        }
        return buf;
    }
}
