package gg.essential.commands.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.sps.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
import kotlin.collections.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   H\u0016¨\u0006\u000b""" }, d2 = { "Lgg/essential/commands/impl/CommandOp;", "Lgg/essential/commands/impl/CommandOpBase;", "()V", "apply", "", "uuid", "Ljava/util/UUID;", "username", "", "spsManager", "Lgg/essential/network/connectionmanager/sps/SPSManager;", "essential" })
public final class CommandOp extends CommandOpBase
{
    @NotNull
    public static final CommandOp INSTANCE;
    
    private CommandOp() {
        super("op");
    }
    
    @Override
    public void apply(@NotNull final UUID uuid, @NotNull final String username, @NotNull final SPSManager spsManager) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        Intrinsics.checkNotNullParameter((Object)username, "username");
        Intrinsics.checkNotNullParameter((Object)spsManager, "spsManager");
        if (spsManager.getOppedPlayers().contains(uuid)) {
            MinecraftUtils.INSTANCE.sendMessage(username + " is already opped.");
        }
        else {
            final Set<UUID> oppedPlayers = spsManager.getOppedPlayers();
            Intrinsics.checkNotNullExpressionValue((Object)oppedPlayers, "spsManager.oppedPlayers");
            spsManager.updateOppedPlayers(SetsKt.plus((Set)oppedPlayers, (Object)uuid), spsManager.isAllowCheats());
            MinecraftUtils.INSTANCE.sendMessage(username + " is now opped.");
        }
    }
    
    static {
        INSTANCE = new CommandOp();
    }
}
