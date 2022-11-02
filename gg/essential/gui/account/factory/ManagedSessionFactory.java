package gg.essential.gui.account.factory;

import kotlin.*;
import net.minecraft.client.util.*;
import org.jetbrains.annotations.*;
import com.mojang.authlib.exceptions.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u000b\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/gui/account/factory/ManagedSessionFactory;", "Lgg/essential/gui/account/factory/SessionFactory;", "refresh", "Lnet/minecraft/client/util/Session;", "session", "force", "", "remove", "", "uuid", "Ljava/util/UUID;", "essential" })
public interface ManagedSessionFactory extends SessionFactory
{
    @NotNull
    Session refresh(@NotNull final Session p0, final boolean p1) throws AuthenticationException;
    
    void remove(@NotNull final UUID p0);
}
