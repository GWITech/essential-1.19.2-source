package gg.essential.key;

import gg.essential.*;
import gg.essential.config.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import net.minecraft.client.option.*;
import gg.essential.universal.*;
import gg.essential.gui.friends.*;
import gg.essential.api.utils.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.gui.studio.*;
import gg.essential.gui.screenshot.components.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.components.inspector.*;
import gg.essential.elementa.*;
import net.minecraft.client.network.*;
import gg.essential.gui.notification.*;
import net.minecraft.client.*;
import gg.essential.gui.sps.*;
import gg.essential.util.*;
import gg.essential.handlers.*;
import gg.essential.gui.overlay.*;
import gg.essential.elementa.components.*;
import net.minecraft.entity.*;
import java.util.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.event.client.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.network.connectionmanager.relationship.*;

public class EssentialKeybindingRegistry
{
    private EssentialKeybinding cosmetics_visibility_toggle;
    private boolean holdingChatPeek;
    
    public EssentialKeybindingRegistry() {
        super();
    }
    
    public void refreshBinds() {
        final CosmeticsManager cosmeticsManager = Essential.getInstance().getConnectionManager().getCosmeticsManager();
        for (final EssentialKeybinding bind : EssentialKeybinding.ALL_BINDS) {
            if (bind.getRequiresEssentialFull() && !EssentialConfig.INSTANCE.getEssentialFull()) {
                bind.unregister();
            }
            else {
                if (bind.isRegisteredWithMinecraft()) {
                    continue;
                }
                if ((bind.getCustomUnlockStatus() != null && bind.getCustomUnlockStatus().get()) || (bind.getRequiresUnlocked() != null && cosmeticsManager.hasEquipped(bind.getRequiresUnlocked())) || (bind.getCustomUnlockStatus() == null && bind.getRequiresUnlocked() == null)) {
                    bind.register();
                }
                else {
                    bind.unregister();
                }
            }
        }
    }
    
    public KeyBinding[] registerKeyBinds(KeyBinding[] allBindings) {
        new EssentialKeybinding("ESSENTIAL_FRIENDS", "Essential", UKeyboard.KEY_H).requiresEssentialFull().withInitialPress(() -> {
            if (!UKeyboard.isKeyDown(UKeyboard.KEY_F3) && UMinecraft.getMinecraft().currentScreen == null) {
                Multithreading.runAsync(() -> GuiUtil.open(new SocialMenu()));
            }
            return;
        });
        final EssentialKeybinding studio = new EssentialKeybinding("COSMETIC_STUDIO", "Essential", UKeyboard.KEY_B).withInitialPress(() -> {
            if (!UKeyboard.isKeyDown(UKeyboard.KEY_F3) && UMinecraft.getMinecraft().currentScreen == null) {
                Multithreading.runAsync(() -> GuiUtil.open(new CosmeticStudio()));
            }
            return;
        });
        new EssentialKeybinding("SCREENSHOT_MANAGER", "Essential", UKeyboard.KEY_I).requiresEssentialFull().withInitialPress(() -> {
            if (!UKeyboard.isKeyDown(UKeyboard.KEY_F3) && UMinecraft.getMinecraft().currentScreen == null) {
                Multithreading.runAsync(() -> GuiUtil.open(new ScreenshotBrowser()));
            }
            return;
        });
        if (System.getProperty("elementa.dev", "false").equals("true")) {
            new EssentialKeybinding("INSERT_INSPECTOR", "Essential", UKeyboard.KEY_EQUALS, true).withInitialPress(() -> {
                if (UKeyboard.isShiftKeyDown()) {
                    OptionsKt.setElementaDebug(!OptionsKt.getElementaDebug());
                }
                else {
                    final Screen openedScreen = GuiUtil.getOpenedScreen();
                    final Layer layer = OverlayManagerImpl.INSTANCE.getHoveredLayer();
                    Window window;
                    if (layer != null) {
                        window = layer.getWindow();
                    }
                    else if (openedScreen instanceof final WindowScreen windowScreen) {
                        window = windowScreen.getWindow();
                    }
                    else {
                        return;
                    }
                    final List<Inspector> inspectors = window.childrenOfType(Inspector.class);
                    if (inspectors.size() > 0) {
                        inspectors.iterator();
                        final Iterator iterator2;
                        while (iterator2.hasNext()) {
                            final Inspector inspector = iterator2.next();
                            window.removeChild(inspector);
                        }
                    }
                    else {
                        window.addChild(new Inspector(window));
                    }
                }
                return;
            });
            if (MinecraftUtils.INSTANCE.isDevelopment()) {
                new EssentialKeybinding("ESSENTIAL_DEBUG_KEY", "Essential", UKeyboard.KEY_MINUS, true).withInitialPress(() -> Essential.getInstance());
                new EssentialKeybinding("TOGGLE_DEBUG", "Essential", UKeyboard.KEY_BACKSLASH).withInitialPress(ExtensionsKt::toggleElementaDebug);
            }
        }
        this.cosmetics_visibility_toggle = new EssentialKeybinding("COSMETICS_VISIBILITY_TOGGLE", "Essential", UKeyboard.KEY_O, false).withInitialPress(() -> {
            if (OverlayManagerImpl.INSTANCE.getFocusedLayer() == null && !(OverlayManagerImpl.INSTANCE.getHoveredLayer() instanceof EphemeralLayer)) {
                Essential.getInstance().getConnectionManager().getCosmeticsManager().toggleOwnCosmeticVisibility(true);
            }
            return;
        });
        new EssentialKeybinding("ADD_FRIEND", "Essential", UKeyboard.KEY_NONE).requiresEssentialFull().withInitialPress(() -> {
            final Entity pointedEntity = UMinecraft.getMinecraft().targetedEntity;
            if (!(pointedEntity instanceof AbstractClientPlayerEntity)) {
                MinecraftUtils.INSTANCE.sendChatMessageAndFormat("keybind.feedback.lookatplayerfriend");
                return;
            }
            else {
                final UUID targetUUID = pointedEntity.method_5667();
                if (targetUUID.version() != 4) {
                    MinecraftUtils.INSTANCE.sendChatMessageAndFormat("keybind.error.nonplayer");
                    return;
                }
                else {
                    final ConnectionManager connectionManager = Essential.getInstance().getConnectionManager();
                    connectionManager.getRelationshipManager().createFriendRelationship(targetUUID, false).thenAcceptAsync(friendRequestState -> {
                        if (friendRequestState.getFriendRequestState() == FriendRequestState.SENT) {
                            UUIDUtil.getName(targetUUID).thenAcceptAsync(s -> Notifications.INSTANCE.push("Friend Request", "Sent a friend request to " + s), ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
                        }
                        else if (friendRequestState.getFriendRequestState() == FriendRequestState.ERROR_UNHANDLED) {
                            Notifications.INSTANCE.push("Friend Request", (friendRequestState.getMessage() != null) ? friendRequestState.getMessage() : "An unknown error occurred");
                        }
                    }, ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
                    return;
                }
            }
        });
        final EssentialKeybinding chatPeek = new EssentialKeybinding("CHAT_PEEK", "Essential", UKeyboard.KEY_Z).withRepeatedHold(() -> this.holdingChatPeek = true).withRelease(() -> {
            this.holdingChatPeek = false;
            MinecraftClient.getInstance().inGameHud.getChatHud().resetScroll();
            return;
        });
        final EssentialKeybinding essentialKeybinding = new EssentialKeybinding("INVITE_FRIENDS", "Essential", UKeyboard.KEY_NONE);
        final InviteFriendsModal instance = InviteFriendsModal.INSTANCE;
        Objects.requireNonNull(instance);
        final EssentialKeybinding invite = essentialKeybinding.withInitialPress(instance::show);
        if (!OptiFineUtil.isLoaded()) {
            final EssentialKeybinding zoom = new EssentialKeybinding("ZOOM", "Essential", UKeyboard.KEY_C);
            zoom.requiresEssentialFull();
            ZoomHandler.getInstance().zoomKeybinding = zoom.keyBinding;
        }
        studio.requiresEssentialFull();
        this.cosmetics_visibility_toggle.requiresEssentialFull();
        chatPeek.requiresEssentialFull();
        invite.requiresEssentialFull();
        for (final EssentialKeybinding binding : EssentialKeybinding.ALL_BINDS) {
            allBindings = binding.register(allBindings);
        }
        return allBindings;
    }
    
    @Subscribe
    public void tick(final ClientTickEvent event) {
        for (final EssentialKeybinding essentialKeybinding : EssentialKeybinding.ALL_BINDS) {
            essentialKeybinding.tickEvents();
        }
    }
    
    public boolean isHoldingChatPeek() {
        return this.holdingChatPeek;
    }
    
    private /* synthetic */ void lambda$registerKeyBinds$13() {
        this.holdingChatPeek = false;
        MinecraftClient.getInstance().inGameHud.getChatHud().resetScroll();
    }
    
    private /* synthetic */ void lambda$registerKeyBinds$12() {
        this.holdingChatPeek = true;
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$11() {
        final Entity pointedEntity = UMinecraft.getMinecraft().targetedEntity;
        if (!(pointedEntity instanceof AbstractClientPlayerEntity)) {
            MinecraftUtils.INSTANCE.sendChatMessageAndFormat("keybind.feedback.lookatplayerfriend");
            return;
        }
        final UUID targetUUID = pointedEntity.method_5667();
        if (targetUUID.version() != 4) {
            MinecraftUtils.INSTANCE.sendChatMessageAndFormat("keybind.error.nonplayer");
            return;
        }
        final ConnectionManager connectionManager = Essential.getInstance().getConnectionManager();
        connectionManager.getRelationshipManager().createFriendRelationship(targetUUID, false).thenAcceptAsync(friendRequestState -> {
            if (friendRequestState.getFriendRequestState() == FriendRequestState.SENT) {
                UUIDUtil.getName(targetUUID).thenAcceptAsync(s -> Notifications.INSTANCE.push("Friend Request", "Sent a friend request to " + s), ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
            }
            else if (friendRequestState.getFriendRequestState() == FriendRequestState.ERROR_UNHANDLED) {
                Notifications.INSTANCE.push("Friend Request", (friendRequestState.getMessage() != null) ? friendRequestState.getMessage() : "An unknown error occurred");
            }
        }, ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$10(final UUID targetUUID, final RelationshipResponse friendRequestState) {
        if (friendRequestState.getFriendRequestState() == FriendRequestState.SENT) {
            UUIDUtil.getName(targetUUID).thenAcceptAsync(s -> Notifications.INSTANCE.push("Friend Request", "Sent a friend request to " + s), ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
        }
        else if (friendRequestState.getFriendRequestState() == FriendRequestState.ERROR_UNHANDLED) {
            Notifications.INSTANCE.push("Friend Request", (friendRequestState.getMessage() != null) ? friendRequestState.getMessage() : "An unknown error occurred");
        }
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$9(final String s) {
        Notifications.INSTANCE.push("Friend Request", "Sent a friend request to " + s);
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$8() {
        if (OverlayManagerImpl.INSTANCE.getFocusedLayer() == null && !(OverlayManagerImpl.INSTANCE.getHoveredLayer() instanceof EphemeralLayer)) {
            Essential.getInstance().getConnectionManager().getCosmeticsManager().toggleOwnCosmeticVisibility(true);
        }
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$7() {
        Essential.getInstance();
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$6() {
        if (UKeyboard.isShiftKeyDown()) {
            OptionsKt.setElementaDebug(!OptionsKt.getElementaDebug());
        }
        else {
            final Screen openedScreen = GuiUtil.getOpenedScreen();
            final Layer layer = OverlayManagerImpl.INSTANCE.getHoveredLayer();
            Window window;
            if (layer != null) {
                window = layer.getWindow();
            }
            else {
                if (!(openedScreen instanceof WindowScreen)) {
                    return;
                }
                window = ((WindowScreen)openedScreen).getWindow();
            }
            final List<Inspector> inspectors = window.childrenOfType(Inspector.class);
            if (inspectors.size() > 0) {
                for (final Inspector inspector : inspectors) {
                    window.removeChild(inspector);
                }
            }
            else {
                window.addChild(new Inspector(window));
            }
        }
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$5() {
        if (!UKeyboard.isKeyDown(UKeyboard.KEY_F3) && UMinecraft.getMinecraft().currentScreen == null) {
            Multithreading.runAsync(() -> GuiUtil.open(new ScreenshotBrowser()));
        }
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$4() {
        GuiUtil.open(new ScreenshotBrowser());
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$3() {
        if (!UKeyboard.isKeyDown(UKeyboard.KEY_F3) && UMinecraft.getMinecraft().currentScreen == null) {
            Multithreading.runAsync(() -> GuiUtil.open(new CosmeticStudio()));
        }
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$2() {
        GuiUtil.open(new CosmeticStudio());
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$1() {
        if (!UKeyboard.isKeyDown(UKeyboard.KEY_F3) && UMinecraft.getMinecraft().currentScreen == null) {
            Multithreading.runAsync(() -> GuiUtil.open(new SocialMenu()));
        }
    }
    
    private static /* synthetic */ void lambda$registerKeyBinds$0() {
        GuiUtil.open(new SocialMenu());
    }
}
