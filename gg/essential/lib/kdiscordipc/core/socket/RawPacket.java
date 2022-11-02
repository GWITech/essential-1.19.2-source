package gg.essential.lib.kdiscordipc.core.socket;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/socket/RawPacket;", "", "opcode", "", "length", "data", "", "(II[B)V", "getData", "()[B", "getLength", "()I", "getOpcode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "KDiscordIPC" })
public final class RawPacket
{
    private final int opcode;
    private final int length;
    @NotNull
    private final byte[] data;
    
    public RawPacket(final int opcode, final int length, @NotNull final byte[] data) {
        Intrinsics.checkNotNullParameter((Object)data, "data");
        super();
        this.opcode = opcode;
        this.length = length;
        this.data = data;
    }
    
    public final int getOpcode() {
        return this.opcode;
    }
    
    public final int getLength() {
        return this.length;
    }
    
    @NotNull
    public final byte[] getData() {
        return this.data;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual((Object)this.getClass(), (Object)((other == null) ? null : other.getClass()))) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type dev.cbyrne.kdiscordipc.core.socket.RawPacket");
        }
        return this.opcode == ((RawPacket)other).opcode && this.length == ((RawPacket)other).length && Arrays.equals(this.data, ((RawPacket)other).data);
    }
    
    @Override
    public int hashCode() {
        int result = this.opcode;
        result = 31 * result + this.length;
        result = 31 * result + Arrays.hashCode(this.data);
        return result;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "RawPacket(opcode=" + this.opcode + ", length=" + this.length + ", data=" + Arrays.toString(this.data) + ')';
    }
}
