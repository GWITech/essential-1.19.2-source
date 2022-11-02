package gg.essential.lib.kdiscordipc.core.error;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0006\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/error/DecodeError;", "Ljava/lang/Error;", "Lkotlin/Error;", "reason", "", "(Ljava/lang/String;)V", "InvalidData", "NotSupported", "Lgg/essential/lib/kdiscordipc/core/error/DecodeError$NotSupported;", "Lgg/essential/lib/kdiscordipc/core/error/DecodeError$InvalidData;", "KDiscordIPC" })
public abstract class DecodeError extends Error
{
    private DecodeError(final String reason) {
        super(reason);
    }
    
    public DecodeError(final String reason, final byte b) {
        this(reason);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/error/DecodeError$InvalidData;", "Lgg/essential/lib/kdiscordipc/core/error/DecodeError;", "()V", "KDiscordIPC" })
    public static final class InvalidData extends DecodeError
    {
        @NotNull
        public static final InvalidData INSTANCE;
        
        private InvalidData() {
            super("Didn't get to read full data due to the client disconnecting prematurely.", (byte)0);
        }
        
        static {
            INSTANCE = new InvalidData();
        }
    }
}
