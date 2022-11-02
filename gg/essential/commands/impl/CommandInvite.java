package gg.essential.commands.impl;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.*;
import gg.essential.universal.*;
import net.minecraft.client.*;
import gg.essential.gui.sps.*;
import kotlin.collections.*;
import net.minecraft.world.level.storage.*;
import java.util.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.network.connectionmanager.social.*;
import net.minecraft.client.network.*;
import gg.essential.commands.engine.*;
import kotlin.jvm.functions.*;
import gg.essential.util.*;
import kotlin.*;
import gg.essential.api.commands.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007¨\u0006	""" }, d2 = { "Lgg/essential/commands/impl/CommandInvite;", "Lgg/essential/api/commands/Command;", "()V", "handle", "", "friend", "Lgg/essential/commands/engine/EssentialFriend;", "handleCancelInvite", "Lgg/essential/commands/engine/EssentialUser;", "essential" })
public final class CommandInvite extends Command
{
    @NotNull
    public static final CommandInvite INSTANCE;
    
    private CommandInvite() {
        super("einvite", false, false, 6, null);
    }
    
    @DefaultHandler
    public final void handle(@DisplayName("friend") @NotNull final EssentialFriend friend) {
        Intrinsics.checkNotNullParameter((Object)friend, "friend");
        if (Intrinsics.areEqual((Object)friend.getUuid(), (Object)UUIDUtil.getClientUUID())) {
            MinecraftUtils.INSTANCE.sendMessage("You cannot invite yourself.");
            return;
        }
        final String username = friend.getIgn();
        final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
        Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
        final ConnectionManager connectionManager = connectionManager2;
        final SPSManager spsManager2 = connectionManager.getSpsManager();
        Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "connectionManager.spsManager");
        final SPSManager spsManager = spsManager2;
        final SocialManager socialManager2 = connectionManager.getSocialManager();
        Intrinsics.checkNotNullExpressionValue((Object)socialManager2, "connectionManager.socialManager");
        final SocialManager socialManager = socialManager2;
        final UUID uuid = friend.getUuid();
        final ServerInfo currentServerData = UMinecraft.getMinecraft().getCurrentServerEntry();
        if (spsManager.getLocalSession() == null) {
            if (MinecraftClient.getInstance().isInSingleplayer()) {
                InviteFriendsModal.show$default$7781189c(InviteFriendsModal.INSTANCE, null, SetsKt.setOf((Object)uuid), false, false, null, 29);
                return;
            }
            if (currentServerData == null) {
                MinecraftUtils.INSTANCE.sendMessage("You cannot invite players to this server.");
                return;
            }
            if (spsManager.isSpsAddress(currentServerData.address) || UMinecraft.getMinecraft().isConnectedToRealms()) {
                MinecraftUtils.INSTANCE.sendMessage("You cannot invite players to this server.");
                return;
            }
            final Set invites = socialManager.getInvitesOnServer(currentServerData.address);
            if (invites.contains(uuid)) {
                final SocialManager socialManager3 = socialManager;
                final String address = currentServerData.address;
                Intrinsics.checkNotNullExpressionValue((Object)invites, "invites");
                socialManager3.setInvitedFriendsOnServer(address, SetsKt.minus(invites, (Object)uuid));
            }
            final SocialManager socialManager4 = socialManager;
            final String address2 = currentServerData.address;
            Intrinsics.checkNotNullExpressionValue((Object)invites, "invites");
            socialManager4.setInvitedFriendsOnServer(address2, SetsKt.plus(invites, (Object)uuid));
            MinecraftUtils.INSTANCE.sendMessage("Invited " + username);
        }
        else {
            if (spsManager.getInvitedUsers().contains(uuid)) {
                MinecraftUtils.INSTANCE.sendMessage(username + " is already invited to your world.");
                return;
            }
            final SPSManager spsManager3 = spsManager;
            final Set<UUID> invitedUsers = spsManager.getInvitedUsers();
            Intrinsics.checkNotNullExpressionValue((Object)invitedUsers, "spsManager.invitedUsers");
            spsManager3.updateInvitedUsers(SetsKt.plus((Set)invitedUsers, (Object)uuid));
            MinecraftUtils.INSTANCE.sendMessage("Invited " + username + " to your world.");
        }
    }
    
    @SubCommand(value = "cancel", description = "Cancel invite to player")
    public final void handleCancelInvite(@DisplayName("friend") @NotNull final EssentialUser friend) {
        Intrinsics.checkNotNullParameter((Object)friend, "friend");
        if (Intrinsics.areEqual((Object)friend.getUuid(), (Object)UUIDUtil.getClientUUID())) {
            MinecraftUtils.INSTANCE.sendMessage("You cannot remove an invite from yourself.");
            return;
        }
        ExtensionsKt.thenAcceptOnMainThread(friend.getUsername(), (kotlin.jvm.functions.Function1<? super String, Unit>)new CommandInvite$handleCancelInvite.CommandInvite$handleCancelInvite$1(friend));
    }
    
    static {
        INSTANCE = new CommandInvite();
    }
}
