package gg.essential.gui.account.factory;

import kotlin.*;
import java.util.*;
import net.minecraft.client.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\b\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/gui/account/factory/SessionFactory;", "", "sessions", "", "Ljava/util/UUID;", "Lnet/minecraft/client/util/Session;", "getSessions", "()Ljava/util/Map;", "essential" })
public interface SessionFactory
{
    @NotNull
    Map<UUID, Session> getSessions();
}
