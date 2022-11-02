package gg.essential.gui.account.factory;

import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import java.util.*;
import net.minecraft.client.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001c
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048VX\u0096\u0084\u0002¢\u0006\f
                                                   \u0004\b	\u0010
                                                   \u001a\u0004\b\u0007\u0010\b¨\u0006\u000b""" }, d2 = { "Lgg/essential/gui/account/factory/InitialSessionFactory;", "Lgg/essential/gui/account/factory/SessionFactory;", "()V", "sessions", "", "Ljava/util/UUID;", "Lnet/minecraft/client/util/Session;", "getSessions", "()Ljava/util/Map;", "sessions$delegate", "Lkotlin/Lazy;", "essential" })
public final class InitialSessionFactory implements SessionFactory
{
    @NotNull
    private final Lazy sessions$delegate;
    
    public InitialSessionFactory() {
        super();
        this.sessions$delegate = LazyKt.lazy((Function0)InitialSessionFactory$sessions.InitialSessionFactory$sessions$2.INSTANCE);
    }
    
    @NotNull
    @Override
    public Map<UUID, Session> getSessions() {
        return (Map)this.sessions$delegate.getValue();
    }
}
