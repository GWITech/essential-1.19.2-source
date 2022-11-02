package gg.essential.lib.kdiscordipc.core.packet.outbound;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.descriptors.*;
import kotlinx.serialization.*;
import kotlin.jvm.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0005¢\u0006\u0002\u0010\fJ!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u00c7\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f\u0080\u00e5\b\u0004\u0080\u00e5\b\u0006\u0080\u00e5\b\u0007" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/IrregularOutboundPacket;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;", "seen1", "", "nonce", "", "cmd", "args", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ldev/cbyrne/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getArgs", "()Ldev/cbyrne/kdiscordipc/core/packet/outbound/OutboundPacket$Arguments;", "getCmd", "()Ljava/lang/String;", "getNonce", "setNonce", "(Ljava/lang/String;)V", "opcode", "getOpcode", "()I", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "KDiscordIPC" })
public abstract class IrregularOutboundPacket extends OutboundPacket
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private String nonce;
    @NotNull
    private final String cmd;
    @Nullable
    private final Arguments args;
    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    
    public IrregularOutboundPacket() {
        super();
        this.nonce = "";
        this.cmd = "";
    }
    
    @NotNull
    public String getNonce() {
        return this.nonce;
    }
    
    @Override
    public void setNonce(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.nonce = <set-?>;
    }
    
    @NotNull
    public String getCmd() {
        return this.cmd;
    }
    
    @Nullable
    public Arguments getArgs() {
        return this.args;
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final IrregularOutboundPacket self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual((Object)self.getNonce(), (Object)"")) {
            output.encodeStringElement(serialDesc, 0, self.getNonce());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual((Object)self.getCmd(), (Object)"")) {
            output.encodeStringElement(serialDesc, 1, self.getCmd());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.getArgs() != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)Arguments.serializer.INSTANCE, (Object)self.getArgs());
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public IrregularOutboundPacket(final int seen1, final String nonce, final String cmd, final Arguments args) {
        super();
        if ((seen1 & 0x1) == 0x0) {
            this.nonce = "";
        }
        else {
            this.nonce = nonce;
        }
        if ((seen1 & 0x2) == 0x0) {
            this.cmd = "";
        }
        else {
            this.cmd = cmd;
        }
        if ((seen1 & 0x4) == 0x0) {
            this.args = null;
        }
        else {
            this.args = args;
        }
    }
    
    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        return IrregularOutboundPacket.$cachedSerializer$delegate;
    }
    
    static {
        Companion = new Companion((byte)0);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0)IrregularOutboundPacket$Companion$$cachedSerializer$delegate.IrregularOutboundPacket$Companion$$cachedSerializer$delegate$1.INSTANCE);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/outbound/IrregularOutboundPacket$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/IrregularOutboundPacket;", "KDiscordIPC" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<IrregularOutboundPacket> serializer() {
            return (KSerializer<IrregularOutboundPacket>)this.get$cachedSerializer$delegate().getValue();
        }
        
        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return IrregularOutboundPacket.access$get$cachedSerializer$delegate$cp();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
