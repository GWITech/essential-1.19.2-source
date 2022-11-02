package gg.essential.lib.kdiscordipc.core.packet.inbound;

import org.jetbrains.annotations.*;
import kotlinx.serialization.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u00c7\u0001¨\u0006\u0010" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/inbound/CommandPacket;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/InboundPacket;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "KDiscordIPC" })
public abstract class CommandPacket extends InboundPacket
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    
    public CommandPacket() {
        super();
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final CommandPacket self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public CommandPacket(final byte b) {
        super();
    }
    
    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        return CommandPacket.$cachedSerializer$delegate;
    }
    
    static {
        Companion = new Companion((byte)0);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0)CommandPacket$Companion$$cachedSerializer$delegate.CommandPacket$Companion$$cachedSerializer$delegate$1.INSTANCE);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/inbound/CommandPacket$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/CommandPacket;", "KDiscordIPC" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<CommandPacket> serializer() {
            return (KSerializer<CommandPacket>)this.get$cachedSerializer$delegate().getValue();
        }
        
        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return CommandPacket.access$get$cachedSerializer$delegate$cp();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
