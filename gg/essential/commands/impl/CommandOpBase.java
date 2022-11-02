package gg.essential.commands.impl;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.commands.engine.*;
import gg.essential.*;
import kotlin.jvm.functions.*;
import gg.essential.util.*;
import kotlin.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.api.commands.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020\u00032\u0006\u0010
                                                   \u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u00020\u000eH\u0007¨\u0006\u000f""" }, d2 = { "Lgg/essential/commands/impl/CommandOpBase;", "Lgg/essential/api/commands/Command;", "name", "", "(Ljava/lang/String;)V", "apply", "", "uuid", "Ljava/util/UUID;", "username", "spsManager", "Lgg/essential/network/connectionmanager/sps/SPSManager;", "handle", "user", "Lgg/essential/commands/engine/EssentialUser;", "essential" })
public abstract class CommandOpBase extends Command
{
    public CommandOpBase(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        super(name, false, false, 6, null);
    }
    
    @DefaultHandler
    public final void handle(@DisplayName("player") @NotNull final EssentialUser user) {
        Intrinsics.checkNotNullParameter((Object)user, "user");
        final SPSManager spsManager2 = Essential.getInstance().getConnectionManager().getSpsManager();
        Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "getInstance().connectionManager.spsManager");
        final SPSManager spsManager = spsManager2;
        if (Intrinsics.areEqual((Object)user.getUuid(), (Object)UUIDUtil.getClientUUID())) {
            MinecraftUtils.INSTANCE.sendMessage("The host always has OP status");
            return;
        }
        ExtensionsKt.thenAcceptOnMainThread(user.getUsername(), (kotlin.jvm.functions.Function1<? super String, Unit>)new CommandOpBase$handle.CommandOpBase$handle$1(spsManager, user, this));
    }
    
    public abstract void apply(@NotNull final UUID p0, @NotNull final String p1, @NotNull final SPSManager p2);
}
