package gg.essential.gui.account.factory;

import java.util.*;
import net.minecraft.client.util.*;
import gg.essential.universal.*;
import kotlin.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001c
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006	""" }, d2 = { "Lgg/essential/gui/account/factory/ActiveSessionFactory;", "Lgg/essential/gui/account/factory/SessionFactory;", "()V", "sessions", "", "Ljava/util/UUID;", "Lnet/minecraft/client/util/Session;", "getSessions", "()Ljava/util/Map;", "essential" })
public final class ActiveSessionFactory implements SessionFactory
{
    public ActiveSessionFactory() {
        super();
    }
    
    @NotNull
    @Override
    public Map<UUID, Session> getSessions() {
        final Session it = UMinecraft.getMinecraft().getSession();
        return MapsKt.mapOf(TuplesKt.to((Object)it.getProfile().getId(), (Object)it));
    }
}
