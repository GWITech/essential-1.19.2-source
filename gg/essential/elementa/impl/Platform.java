package gg.essential.elementa.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u000eH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0001X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013\u00c0\u0006\u0003" }, d2 = { "Lgg/essential/elementa/impl/Platform;", "", "currentScreen", "getCurrentScreen", "()Ljava/lang/Object;", "setCurrentScreen", "(Ljava/lang/Object;)V", "mcVersion", "", "getMcVersion", "()I", "enableStencil", "", "isAllowedInChat", "", "char", "", "isCallingFromMinecraftThread", "Companion", "Elementa" })
@ApiStatus.Internal
public interface Platform
{
    @NotNull
    public static final Companion Companion = Platform.Companion.$$INSTANCE;
    
    int getMcVersion();
    
    @Nullable
    Object getCurrentScreen();
    
    void setCurrentScreen(@Nullable final Object p0);
    
    boolean isAllowedInChat(final char p0);
    
    void enableStencil();
    
    boolean isCallingFromMinecraftThread();
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/elementa/impl/Platform$Companion;", "", "()V", "platform", "Lgg/essential/elementa/impl/Platform;", "getPlatform$Elementa", "()Lgg/essential/elementa/impl/Platform;", "Elementa" })
    @ApiStatus.Internal
    public static final class Companion
    {
        static final /* synthetic */ Companion $$INSTANCE;
        @NotNull
        private static final Platform platform;
        
        private Companion() {
            super();
        }
        
        @NotNull
        public final Platform getPlatform$Elementa() {
            return Companion.platform;
        }
        
        static {
            $$INSTANCE = new Companion();
            final Platform next = ServiceLoader.load(Platform.class, Platform.class.getClassLoader()).iterator().next();
            Intrinsics.checkNotNullExpressionValue((Object)next, "load(Platform::class.jav\u2026Loader).iterator().next()");
            platform = next;
        }
    }
}
