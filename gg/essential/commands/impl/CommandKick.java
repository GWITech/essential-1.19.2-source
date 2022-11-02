package gg.essential.commands.impl;

import org.jetbrains.annotations.*;
import gg.essential.commands.engine.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.util.*;
import kotlin.*;
import gg.essential.api.commands.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007""" }, d2 = { "Lgg/essential/commands/impl/CommandKick;", "Lgg/essential/api/commands/Command;", "()V", "handle", "", "player", "Lgg/essential/commands/engine/EssentialUser;", "essential" })
public final class CommandKick extends Command
{
    @NotNull
    public static final CommandKick INSTANCE;
    
    private CommandKick() {
        super("kick", false, false, 6, null);
    }
    
    @DefaultHandler
    public final void handle(@DisplayName("player") @NotNull final EssentialUser player) {
        Intrinsics.checkNotNullParameter((Object)player, "player");
        if (Intrinsics.areEqual((Object)player.getUuid(), (Object)UUIDUtil.getClientUUID())) {
            MinecraftUtils.INSTANCE.sendMessage("You cannot kick yourself.");
            return;
        }
        ExtensionsKt.thenAcceptOnMainThread(player.getUsername(), (kotlin.jvm.functions.Function1<? super String, Unit>)new CommandKick$handle.CommandKick$handle$1(player));
    }
    
    static {
        INSTANCE = new CommandKick();
    }
}
