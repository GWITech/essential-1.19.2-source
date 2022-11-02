package gg.essential.lib.kdiscordipc.core.socket.handler;

import gg.essential.lib.kdiscordipc.core.socket.*;
import gg.essential.lib.kdiscordipc.core.packet.inbound.*;
import kotlin.jvm.internal.*;
import kotlinx.coroutines.channels.*;
import kotlin.jvm.functions.*;
import kotlinx.coroutines.flow.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.lib.kdiscordipc.core.error.*;
import java.net.*;
import kotlinx.coroutines.*;
import java.io.*;
import gg.essential.lib.kdiscordipc.core.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002J\u0019\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001eR\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/socket/handler/SocketHandler;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "socketSupplier", "Lkotlin/Function0;", "Lgg/essential/lib/kdiscordipc/core/socket/Socket;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V", "connected", "", "getConnected", "()Z", "events", "Lkotlinx/coroutines/flow/Flow;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/InboundPacket;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "outboundBytes", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "socket", "connect", "", "index", "", "disconnect", "findIPCFile", "Ljava/io/File;", "write", "bytes", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KDiscordIPC" })
public final class SocketHandler
{
    @NotNull
    private final Socket socket;
    @NotNull
    private final MutableSharedFlow<byte[]> outboundBytes;
    @NotNull
    private final Flow<InboundPacket> events;
    
    public SocketHandler(@NotNull final CoroutineScope scope, @NotNull final Function0<? extends Socket> socketSupplier) {
        Intrinsics.checkNotNullParameter((Object)scope, "scope");
        Intrinsics.checkNotNullParameter((Object)socketSupplier, "socketSupplier");
        super();
        this.socket = (Socket)socketSupplier.invoke();
        this.outboundBytes = (MutableSharedFlow<byte[]>)SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow)null, 7, (Object)null);
        this.events = (Flow<InboundPacket>)FlowKt.flowOn(FlowKt.flow((Function2)new SocketHandler$events.SocketHandler$events$1(this, (Continuation)null)), (CoroutineContext)Dispatchers.getIO());
        FlowKt.launchIn(FlowKt.onEach((Flow)this.outboundBytes, (Function2)new Function2<byte[], Continuation<? super Unit>, Object>() {
            /* synthetic */ Object L$0;
            final /* synthetic */ SocketHandler this$0;
            
            SocketHandler$1(final SocketHandler $receiver, final Continuation<? super SocketHandler$1> $completion) {
                this.this$0 = $receiver;
                super(2, (Continuation)$completion);
            }
            
            @Nullable
            public final Object invokeSuspend(@NotNull final Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure($result);
                final byte[] it = (byte[])this.L$0;
                SocketHandler.access$getSocket$p(this.this$0).write(it);
                return Unit.INSTANCE;
            }
            
            @NotNull
            public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
                final Function2<byte[], Continuation<? super Unit>, Object> function2 = (Function2<byte[], Continuation<? super Unit>, Object>)new Function2<byte[], Continuation<? super Unit>, Object>() {
                    /* synthetic */ Object L$0;
                    final /* synthetic */ SocketHandler this$0 = this.this$0;
                    
                    SocketHandler$1(final Continuation<? super SocketHandler$1> $completion) {
                        super(2, (Continuation)$completion);
                    }
                    
                    @Nullable
                    public final Object invokeSuspend(@NotNull final Object $result) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        ResultKt.throwOnFailure($result);
                        final byte[] it = (byte[])this.L$0;
                        SocketHandler.access$getSocket$p(this.this$0).write(it);
                        return Unit.INSTANCE;
                    }
                };
                function2.L$0 = value;
                return (Continuation<Unit>)function2;
            }
            
            @Nullable
            public final Object invoke(@NotNull final byte[] p1, @Nullable final Continuation<? super Unit> p2) {
                return ((SocketHandler$1)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                return this.invoke((byte[])p1, (Continuation<? super Unit>)p2);
            }
        }), scope);
    }
    
    public final boolean getConnected() {
        return this.socket.getConnected();
    }
    
    @NotNull
    public final Flow<InboundPacket> getEvents() {
        return this.events;
    }
    
    public final void connect(final int index) {
        if (this.socket.getConnected()) {
            throw ConnectionError.AlreadyConnected.INSTANCE;
        }
        try {
            this.socket.connect(this.findIPCFile(index));
        }
        catch (final SocketException ex) {
            throw ConnectionError.Failed.INSTANCE;
        }
    }
    
    public final void disconnect() {
        this.socket.close();
    }
    
    @Nullable
    public final Object write(@NotNull final byte[] bytes, @NotNull final Continuation<? super Unit> $completion) {
        if (!this.socket.getConnected()) {
            throw ConnectionError.NotConnected.INSTANCE;
        }
        final Object withContext = BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), (Function2)new SocketHandler$write.SocketHandler$write$2(this, bytes, (Continuation)null), (Continuation)$completion);
        if (withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return withContext;
        }
        return Unit.INSTANCE;
    }
    
    private final File findIPCFile(final int index) throws ConnectionError.NoIPCFile {
        if (index > 9) {
            throw ConnectionError.NoIPCFile.INSTANCE;
        }
        final String base = (PlatformKt.getPlatform() == Platform.WINDOWS) ? "\\\\?\\pipe\\" : TemporaryDirectoryKt.getTemporaryDirectory();
        final File it;
        final File file = it = new File(base, Intrinsics.stringPlus("discord-ipc-", (Object)index));
        File ipcFile = it.exists() ? it : null;
        if (ipcFile == null) {
            ipcFile = this.findIPCFile(index + 1);
        }
        return ipcFile;
    }
    
    public static final /* synthetic */ MutableSharedFlow access$getOutboundBytes$p(final SocketHandler $this) {
        return $this.outboundBytes;
    }
    
    public static final /* synthetic */ Socket access$getSocket$p(final SocketHandler $this) {
        return $this.socket;
    }
}
