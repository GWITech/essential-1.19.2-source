package gg.essential.handlers;

import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.mixins.ext.client.gui.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.config.*;
import kotlin.jvm.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.*;
import gg.essential.universal.*;
import net.minecraft.client.*;
import gg.essential.data.*;
import gg.essential.util.*;
import gg.essential.gui.common.modal.*;
import gg.essential.gui.modals.*;
import gg.essential.gui.notification.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.gui.sps.*;
import net.minecraft.world.level.storage.*;
import java.util.*;
import gg.essential.network.connectionmanager.*;
import net.minecraft.client.network.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u001d\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0001¢\u0006\u0002\b\u0016R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e
                                                   \u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020	X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000b"\u0004\b\f\u0010¨\u0006\u0017""" }, d2 = { "Lgg/essential/handlers/PauseMenuDisplay$Companion;", "", "()V", "minWidth", "", "getMinWidth$annotations", "getMinWidth", "()I", "window", "Lgg/essential/elementa/components/Window;", "getWindow", "()Lgg/essential/elementa/components/Window;", "setWindow", "(Lgg/essential/elementa/components/Window;)V", "canRescale", "", "screen", "Lnet/minecraft/client/gui/screen/Screen;", "showInviteOrHostModal", "", "callback", "Lkotlin/Function0;", "showInviteOrHostModal$essential", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final Window getWindow() {
        return PauseMenuDisplay.access$getWindow$cp();
    }
    
    public final int getMinWidth() {
        return PauseMenuDisplay.access$getMinWidth$cp();
    }
    
    @JvmStatic
    public final boolean canRescale(@NotNull final Screen screen) {
        Intrinsics.checkNotNullParameter((Object)screen, "screen");
        return (screen instanceof GuiMainMenu || screen instanceof GameMenuScreen) && EssentialConfig.INSTANCE.getEssentialGuiScale() == 0;
    }
    
    @JvmStatic
    public final void showInviteOrHostModal$essential(@NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
        Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
        final ConnectionManager connectionManager = connectionManager2;
        final ServerInfo currentServerData = UMinecraft.getMinecraft().getCurrentServerEntry();
        if (MinecraftClient.getInstance().currentScreen instanceof GuiMainMenu) {
            if (OnboardingData.hasAcceptedTos()) {
                if (!connectionManager.isAuthenticated()) {
                    GuiUtil.INSTANCE.pushModal((Modal)new NotAuthenticatedModal((Function0)new PauseMenuDisplay$Companion$showInviteOrHostModal.PauseMenuDisplay$Companion$showInviteOrHostModal$2((Function0)callback)));
                }
                else {
                    GuiUtil.INSTANCE.pushModal(new WorldSelectionModal((byte)0));
                }
            }
            else {
                GuiUtil.INSTANCE.pushModal(new TOSModal(true, (Function0)new PauseMenuDisplay$Companion$showInviteOrHostModal.PauseMenuDisplay$Companion$showInviteOrHostModal$3((Function0)callback), null, 9));
            }
            return;
        }
        if (UMinecraft.getMinecraft().getServer() != null) {
            if (UPnPWrapper.getCompatibility() != UPnPWrapper.UPnPCompatibility.COMPATIBLE) {
                Notifications.INSTANCE.push("Invite Friends unavailable", "UPnP isn't supported on your router");
                return;
            }
            if (connectionManager.getSpsManager().getLocalState() == SPSState.OPENING) {
                Notifications.INSTANCE.push("Invite Friends unavailable", "Please wait for the world to open");
                return;
            }
        }
        else {
            if (currentServerData == null) {
                Notifications.INSTANCE.push("Invite Friends unavailable", "You cannot invite friends to this world");
                return;
            }
            final String serverAddress = currentServerData.address;
            final boolean isSPSServer = connectionManager.getSpsManager().isSpsAddress(serverAddress);
            if (isSPSServer) {
                Notifications.INSTANCE.push("Invite Friends unavailable", "You cannot invite friends to this world");
                return;
            }
        }
        if (OnboardingData.hasAcceptedTos()) {
            if (!connectionManager.isAuthenticated()) {
                GuiUtil.INSTANCE.pushModal((Modal)new NotAuthenticatedModal((Function0)new PauseMenuDisplay$Companion$showInviteOrHostModal.PauseMenuDisplay$Companion$showInviteOrHostModal$5((Function0)callback)));
                return;
            }
            InviteFriendsModal.show$default$7781189c(InviteFriendsModal.INSTANCE, null, null, false, false, callback, 15);
        }
        else {
            GuiUtil.INSTANCE.pushModal(new TOSModal(true, (Function0)new PauseMenuDisplay$Companion$showInviteOrHostModal.PauseMenuDisplay$Companion$showInviteOrHostModal$6((Function0)callback), null, 9));
        }
    }
    
    public static /* synthetic */ void showInviteOrHostModal$essential$default$577b675f$45cb9dbd(final Companion companion) {
        companion.showInviteOrHostModal$essential((Function0<Unit>)PauseMenuDisplay$Companion$showInviteOrHostModal.PauseMenuDisplay$Companion$showInviteOrHostModal$1.INSTANCE);
    }
    
    public Companion(final byte b) {
        this();
    }
}
