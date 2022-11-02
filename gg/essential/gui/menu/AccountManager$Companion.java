package gg.essential.gui.menu;

import kotlin.jvm.functions.*;
import net.minecraft.client.util.*;
import kotlin.*;
import gg.essential.universal.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import gg.essential.*;
import gg.essential.gui.account.factory.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import net.minecraft.client.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062<\b\u0002\u0010\u0007\u001a6\u0012\u0013\u0012\u00110	¢\u0006\f\b
                                                   \u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b
                                                   \u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0007JX\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00062<\b\u0002\u0010\u0007\u001a6\u0012\u0013\u0012\u00110	¢\u0006\f\b
                                                   \u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b
                                                   \u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0007¨\u0006\u0012""" }, d2 = { "Lgg/essential/gui/menu/AccountManager$Companion;", "", "()V", "refreshCurrentSession", "", "force", "", "callback", "Lkotlin/Function2;", "Lnet/minecraft/client/util/Session;", "Lkotlin/ParameterName;", "name", "session", "", "error", "refreshSession", "uuid", "Ljava/util/UUID;", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    @JvmOverloads
    public final void refreshCurrentSession(final boolean force, @Nullable final Function2<? super Session, ? super String, Unit> callback) {
        final UUID id = UMinecraft.getMinecraft().getSession().getProfile().getId();
        Intrinsics.checkNotNullExpressionValue((Object)id, "getMinecraft().session.profile.id");
        this.refreshSession(id, force, callback);
    }
    
    public static /* synthetic */ void refreshCurrentSession$default$666edfaa$653bc506(final Companion companion, final boolean b) {
        companion.refreshCurrentSession(true, null);
    }
    
    @JvmStatic
    @JvmOverloads
    public final void refreshSession(@NotNull final UUID uuid, final boolean force, @Nullable final Function2<? super Session, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final MinecraftClient mc = UMinecraft.getMinecraft();
        final List<SessionFactory> sessionFactories = Essential.getInstance().getSessionFactories();
        Intrinsics.checkNotNullExpressionValue((Object)sessionFactories, "getInstance().sessionFactories");
        while (true) {
            for (final Object next : sessionFactories) {
                final SessionFactory it = (SessionFactory)next;
                if (it.getSessions().containsKey(uuid)) {
                    final SessionFactory sessionFactory = (SessionFactory)next;
                    final SessionFactory sessionFactory2 = sessionFactory;
                    final ManagedSessionFactory factory = (sessionFactory2 instanceof ManagedSessionFactory) ? ((ManagedSessionFactory)sessionFactory2) : null;
                    if (factory == null) {
                        final List<SessionFactory> sessionFactories2 = Essential.getInstance().getSessionFactories();
                        Intrinsics.checkNotNullExpressionValue((Object)sessionFactories2, "getInstance().sessionFactories");
                        while (true) {
                            for (final Object next2 : sessionFactories2) {
                                final SessionFactory it2 = (SessionFactory)next2;
                                if (it2.getSessions().containsKey(uuid)) {
                                    final SessionFactory sessionFactory3 = (SessionFactory)next2;
                                    final SessionFactory sessionFactory4 = sessionFactory3;
                                    final InitialSessionFactory initialSessionFactory = (sessionFactory4 instanceof InitialSessionFactory) ? ((InitialSessionFactory)sessionFactory4) : null;
                                    if (initialSessionFactory == null) {
                                        refreshSession$error$default$4f00b92b$1a65acc7(callback, mc, "Failed to refresh session: Unknown account");
                                        return;
                                    }
                                    final InitialSessionFactory initialSession = initialSessionFactory;
                                    final MinecraftClient minecraft = UMinecraft.getMinecraft();
                                    final Session value = initialSession.getSessions().get(uuid);
                                    Intrinsics.checkNotNull((Object)value);
                                    ExtensionsKt.setSession(minecraft, value);
                                    if (callback != null) {
                                        final Session value2 = initialSession.getSessions().get(uuid);
                                        Intrinsics.checkNotNull((Object)value2);
                                        callback.invoke((Object)value2, (Object)null);
                                    }
                                    return;
                                }
                            }
                            final SessionFactory sessionFactory3 = null;
                            continue;
                        }
                    }
                    CompletableFuture.supplyAsync(Companion::refreshSession$lambda-1).whenCompleteAsync(Companion::refreshSession$lambda-3, ExtensionsKt.getExecutor(mc));
                    return;
                }
            }
            final SessionFactory sessionFactory = null;
            continue;
        }
    }
    
    public static /* synthetic */ void refreshSession$default$532a872a$6a749132(final Companion companion, final UUID uuid, final Function2 callback) {
        companion.refreshSession(uuid, false, (Function2<? super Session, ? super String, Unit>)callback);
    }
    
    @JvmStatic
    @JvmOverloads
    public final void refreshCurrentSession$1385ff() {
        refreshCurrentSession$default$666edfaa$653bc506(this, true);
    }
    
    private static final void refreshSession$error(final Function2<? super Session, ? super String, Unit> $callback, final MinecraftClient mc, final String message, final Throwable throwable) {
        Essential.logger.error(message, throwable);
        if ($callback != null) {
            final Session session = mc.getSession();
            Intrinsics.checkNotNullExpressionValue((Object)session, "mc.session");
            $callback.invoke((Object)session, (Object)message);
        }
    }
    
    static /* synthetic */ void refreshSession$error$default$4f00b92b$1a65acc7(final Function2 $callback, final MinecraftClient mc, final String message) {
        refreshSession$error((Function2<? super Session, ? super String, Unit>)$callback, mc, message, null);
    }
    
    private static final Session refreshSession$lambda-1(final ManagedSessionFactory $factory, final UUID $uuid, final boolean $force) {
        Intrinsics.checkNotNullParameter((Object)$uuid, "$uuid");
        final Session value = $factory.getSessions().get($uuid);
        Intrinsics.checkNotNull((Object)value);
        return $factory.refresh(value, $force);
    }
    
    private static final void refreshSession$lambda-3(final Function2 $callback, final MinecraftClient $mc, final Session session, final Throwable err) {
        Intrinsics.checkNotNullParameter((Object)$mc, "$mc");
        if (session != null) {
            Essential.logger.info("Successfully refreshed session token.");
            ExtensionsKt.setSession(UMinecraft.getMinecraft(), session);
            if ($callback != null) {
                $callback.invoke((Object)session, (Object)null);
            }
        }
        else if (err != null) {
            final Throwable it = err;
            refreshSession$error((Function2<? super Session, ? super String, Unit>)$callback, $mc, "Failed to refresh session: " + it.getMessage(), it);
        }
    }
    
    public Companion(final byte b) {
        this();
    }
}
