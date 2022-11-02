package gg.essential.lib.kdiscordipc.core.error;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0006\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError;", "Ljava/lang/Error;", "Lkotlin/Error;", "reason", "", "(Ljava/lang/String;)V", "AlreadyConnected", "Disconnected", "Failed", "NoIPCFile", "NotConnected", "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError$NoIPCFile;", "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError$AlreadyConnected;", "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError$NotConnected;", "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError$Failed;", "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError$Disconnected;", "KDiscordIPC" })
public abstract class ConnectionError extends Error
{
    private ConnectionError(final String reason) {
        super(reason);
    }
    
    public ConnectionError(final String reason, final byte b) {
        this(reason);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError$NoIPCFile;", "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError;", "()V", "KDiscordIPC" })
    public static final class NoIPCFile extends ConnectionError
    {
        @NotNull
        public static final NoIPCFile INSTANCE;
        
        private NoIPCFile() {
            super("Failed to find an IPC file. Is Discord open? Is this application allowed to access temporary files?", (byte)0);
        }
        
        static {
            INSTANCE = new NoIPCFile();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError$AlreadyConnected;", "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError;", "()V", "KDiscordIPC" })
    public static final class AlreadyConnected extends ConnectionError
    {
        @NotNull
        public static final AlreadyConnected INSTANCE;
        
        private AlreadyConnected() {
            super("You are already connected!", (byte)0);
        }
        
        static {
            INSTANCE = new AlreadyConnected();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError$NotConnected;", "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError;", "()V", "KDiscordIPC" })
    public static final class NotConnected extends ConnectionError
    {
        @NotNull
        public static final NotConnected INSTANCE;
        
        private NotConnected() {
            super("This socket has either been closed, or, was never connected.", (byte)0);
        }
        
        static {
            INSTANCE = new NotConnected();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError$Failed;", "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError;", "()V", "KDiscordIPC" })
    public static final class Failed extends ConnectionError
    {
        @NotNull
        public static final Failed INSTANCE;
        
        private Failed() {
            super("Failed to connect to socket.", (byte)0);
        }
        
        static {
            INSTANCE = new Failed();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError$Disconnected;", "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError;", "()V", "KDiscordIPC" })
    public static final class Disconnected extends ConnectionError
    {
        @NotNull
        public static final Disconnected INSTANCE;
        
        private Disconnected() {
            super("The discord application disconnected from the socket.", (byte)0);
        }
        
        static {
            INSTANCE = new Disconnected();
        }
    }
}
