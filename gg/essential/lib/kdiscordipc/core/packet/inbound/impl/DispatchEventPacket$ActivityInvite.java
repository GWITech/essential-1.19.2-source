package gg.essential.lib.kdiscordipc.core.packet.inbound.impl;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.descriptors.*;
import kotlinx.serialization.*;
import gg.essential.lib.kdiscordipc.core.event.data.*;
import kotlin.jvm.*;
import kotlinx.serialization.internal.*;
import kotlin.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B?\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\t\u0010\u0010\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u00c7\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/DispatchEventPacket$ActivityInvite;", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/DispatchEventPacket;", "seen1", "", "opcode", "cmd", "", "nonce", "data", "Lgg/essential/lib/kdiscordipc/core/event/data/ActivityInviteEventData;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ldev/cbyrne/kdiscordipc/core/event/data/ActivityInviteEventData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ldev/cbyrne/kdiscordipc/core/event/data/ActivityInviteEventData;)V", "getData", "()Ldev/cbyrne/kdiscordipc/core/event/data/ActivityInviteEventData;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KDiscordIPC" })
public static final class ActivityInvite extends DispatchEventPacket
{
    @NotNull
    public static final ActivityInvite.Companion Companion;
    @NotNull
    private final ActivityInviteEventData data = data;
    
    @NotNull
    public ActivityInviteEventData getData() {
        return this.data;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ActivityInvite(data=" + this.getData() + ')';
    }
    
    @Override
    public int hashCode() {
        return this.getData().hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof ActivityInvite && Intrinsics.areEqual((Object)this.getData(), (Object)((ActivityInvite)other).getData()));
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final ActivityInvite self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        DispatchEventPacket.write$Self(self, output, serialDesc);
        output.encodeSerializableElement(serialDesc, 3, (SerializationStrategy)ActivityInviteEventData$$serializer.INSTANCE, (Object)self.getData());
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public ActivityInvite(final int seen1, final int opcode, final String cmd, final String nonce, final ActivityInviteEventData data) {
        if (0x8 != (0x8 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 8, ActivityInvite.serializer.INSTANCE.getDescriptor());
        }
        super(seen1, opcode, cmd, nonce);
    }
    
    static {
        Companion = new ActivityInvite.Companion((byte)0);
    }
}
