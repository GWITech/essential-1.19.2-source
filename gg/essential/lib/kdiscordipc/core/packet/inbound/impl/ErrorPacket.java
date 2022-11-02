package gg.essential.lib.kdiscordipc.core.packet.inbound.impl;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.descriptors.*;
import kotlinx.serialization.*;
import gg.essential.lib.kdiscordipc.core.packet.inbound.*;
import kotlin.jvm.*;
import kotlinx.serialization.internal.*;
import kotlin.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+BQ\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0006H\u00d6\u0001J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u00c7\u0001R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006," }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/ErrorPacket;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/InboundPacket;", "seen1", "", "code", "message", "", "opcode", "cmd", "data", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/InboundPacket$Data;", "nonce", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;ILjava/lang/String;Ldev/cbyrne/kdiscordipc/core/packet/inbound/InboundPacket$Data;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;I)V", "getCmd", "()Ljava/lang/String;", "getCode", "()I", "getData", "()Ldev/cbyrne/kdiscordipc/core/packet/inbound/InboundPacket$Data;", "getMessage", "getNonce", "getOpcode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KDiscordIPC" })
public final class ErrorPacket extends InboundPacket
{
    @NotNull
    public static final ErrorPacket.Companion Companion;
    private final int code = code;
    @NotNull
    private final String message = message;
    private final int opcode;
    @Nullable
    private final String cmd;
    @Nullable
    private final Data data;
    @Nullable
    private final String nonce;
    
    public final int getCode() {
        return this.code;
    }
    
    @NotNull
    public final String getMessage() {
        return this.message;
    }
    
    public int getOpcode() {
        return this.opcode;
    }
    
    @Nullable
    public String getCmd() {
        return this.cmd;
    }
    
    @Nullable
    public Data getData() {
        return this.data;
    }
    
    @Nullable
    @Override
    public String getNonce() {
        return this.nonce;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ErrorPacket(code=" + this.code + ", message=" + this.message + ", opcode=" + this.getOpcode() + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Integer.hashCode(this.code);
        result = result * 31 + this.message.hashCode();
        result = result * 31 + Integer.hashCode(this.getOpcode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorPacket)) {
            return false;
        }
        final ErrorPacket errorPacket = (ErrorPacket)other;
        return this.code == errorPacket.code && Intrinsics.areEqual((Object)this.message, (Object)errorPacket.message) && this.getOpcode() == errorPacket.getOpcode();
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final ErrorPacket self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.code);
        output.encodeStringElement(serialDesc, 1, self.message);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.getOpcode() != 2) {
            output.encodeIntElement(serialDesc, 2, self.getOpcode());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.getCmd() != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)StringSerializer.INSTANCE, (Object)self.getCmd());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.getData() != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (SerializationStrategy)InboundPacket$Data$$serializer.INSTANCE, (Object)self.getData());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getNonce() != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (SerializationStrategy)StringSerializer.INSTANCE, (Object)self.getNonce());
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public ErrorPacket(final int seen1, final int code, String message, final int opcode, final String cmd, final Data data, final String nonce) {
        if (0x3 != (0x3 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 3, ErrorPacket.serializer.INSTANCE.getDescriptor());
        }
        super();
        if ((seen1 & 0x4) == 0x0) {
            this.opcode = 2;
        }
        else {
            this.opcode = opcode;
        }
        if ((seen1 & 0x8) == 0x0) {
            this.cmd = null;
        }
        else {
            this.cmd = cmd;
        }
        if ((seen1 & 0x10) == 0x0) {
            this.data = null;
        }
        else {
            this.data = data;
        }
        if ((seen1 & 0x20) == 0x0) {
            this.nonce = null;
        }
        else {
            this.nonce = nonce;
        }
    }
    
    static {
        Companion = new ErrorPacket.Companion((byte)0);
    }
}
