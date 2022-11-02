package gg.essential.config;

import gg.essential.vigilance.*;
import org.jetbrains.annotations.*;
import gg.essential.*;
import java.io.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.*;
import net.minecraft.client.network.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.gui.notification.*;
import gg.essential.universal.*;
import gg.essential.elementa.*;
import gg.essential.commands.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.connectionmanager.common.packet.response.*;
import com.sparkuniverse.toolbox.relationships.enums.*;
import gg.essential.connectionmanager.common.packet.relationships.privacy.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.handlers.discord.*;
import gg.essential.gui.common.modal.*;
import gg.essential.gui.modals.*;
import gg.essential.connectionmanager.common.packet.telemetry.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.collections.*;
import gg.essential.data.*;
import gg.essential.util.*;
import java.lang.reflect.*;
import java.util.*;
import gg.essential.vigilance.data.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000A
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0010\b
                                                   \u0003\b\u0080\u0001
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u001b
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002³\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J	\u0010¦\u0001\u001a\u00020\u0005H\u0002J\u0010\u0010§\u0001\u001a\u00030¨\u0001H\u0001¢\u0006\u0003\b©\u0001J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010ª\u0001\u001a\u00030«\u0001H\u0007J\u0016\u0010¬\u0001\u001a\u00030¨\u00012
                                                   \u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u0001H\u0002J
                                                   \u0010¯\u0001\u001a\u00030¨\u0001H\u0002J
                                                   \u0010°\u0001\u001a\u00030¨\u0001H\u0003J\u0013\u0010±\u0001\u001a\u00030¨\u00012\u0007\u0010²\u0001\u001a\u00020\u0005H\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007"\u0004\b\b\u0010	R$\u0010
                                                   \u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0014
                                                   \u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u000e"\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8G@GX\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0013\u0010\u000e"\u0004\b\u0014\u0010\u0010R&\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8G@GX\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0016\u0010\u000e"\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0018\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0019\u0010\u000e"\u0004\b\u001a\u0010\u0010R\u001e\u0010\u001b\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001c\u0010\u0007"\u0004\b\u001d\u0010	R\u001e\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001f\u0010\u0007"\u0004\b \u0010	R&\u0010!\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00058G@GX\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b"\u0010\u0007"\u0004\b#\u0010	R\u001e\u0010$\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b%\u0010\u0007"\u0004\b&\u0010	R\u001e\u0010'\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b(\u0010\u0007"\u0004\b)\u0010	R$\u0010*\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0014
                                                   \u0000\u0012\u0004\b+\u0010\u0003\u001a\u0004\b,\u0010\u0007"\u0004\b-\u0010	R\u001e\u0010.\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b/\u0010\u0007"\u0004\b0\u0010	R\u001e\u00101\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b2\u0010\u0007"\u0004\b3\u0010	R\u001e\u00104\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b5\u0010\u0007"\u0004\b6\u0010	R\u001e\u00107\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b8\u0010\u0007"\u0004\b9\u0010	R\u001e\u0010:\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b;\u0010\u0007"\u0004\b<\u0010	R\u001e\u0010=\u001a\u00020\u00058V@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b>\u0010\u0007"\u0004\b?\u0010	R\u001e\u0010@\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bA\u0010\u000e"\u0004\bB\u0010\u0010R&\u0010C\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8G@GX\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bD\u0010\u000e"\u0004\bE\u0010\u0010R\u001e\u0010F\u001a\u00020\u00058V@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bG\u0010\u0007"\u0004\bH\u0010	R\u001e\u0010I\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bJ\u0010\u0007"\u0004\bK\u0010	R\u001e\u0010L\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bM\u0010\u000e"\u0004\bN\u0010\u0010R\u001e\u0010O\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bP\u0010\u0007"\u0004\bQ\u0010	R\u001e\u0010R\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bS\u0010\u0007"\u0004\bT\u0010	R\u001e\u0010U\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bV\u0010\u0007"\u0004\bW\u0010	R$\u0010X\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014
                                                   \u0000\u0012\u0004\bY\u0010\u0003\u001a\u0004\bZ\u0010\u0007"\u0004\b[\u0010	R\u001e\u0010\\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b]\u0010\u0007"\u0004\b^\u0010	R\u001e\u0010_\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b`\u0010\u0007"\u0004\ba\u0010	R\u001e\u0010b\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bc\u0010\u0007"\u0004\bd\u0010	R\u001a\u0010e\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bf\u0010\u0007"\u0004\bg\u0010	R$\u0010h\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0014
                                                   \u0000\u0012\u0004\bi\u0010\u0003\u001a\u0004\bj\u0010\u0007"\u0004\bk\u0010	R\u001e\u0010l\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bm\u0010\u000e"\u0004\bn\u0010\u0010R\u001e\u0010o\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bp\u0010\u0007"\u0004\bq\u0010	R&\u0010r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8G@GX\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bs\u0010\u000e"\u0004\bt\u0010\u0010R\u001e\u0010u\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bv\u0010\u0007"\u0004\bw\u0010	R\u001e\u0010x\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\by\u0010\u0007"\u0004\bz\u0010	R\u001e\u0010{\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b|\u0010\u0007"\u0004\b}\u0010	R\u001f\u0010~\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000f
                                                   \u0000\u001a\u0004\b\u007f\u0010\u0007"\u0005\b\u0080\u0001\u0010	R$\u0010\u0081\u0001\u001a\u00020\u000bX\u0096\u000e¢\u0006\u0017
                                                   \u0000\u0012\u0005\b\u0082\u0001\u0010\u0003\u001a\u0005\b\u0083\u0001\u0010\u000e"\u0005\b\u0084\u0001\u0010\u0010R!\u0010\u0085\u0001\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0010
                                                   \u0000\u001a\u0005\b\u0086\u0001\u0010\u0007"\u0005\b\u0087\u0001\u0010	R)\u0010\u0088\u0001\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00058G@GX\u0087\u000e¢\u0006\u0010
                                                   \u0000\u001a\u0005\b\u0089\u0001\u0010\u0007"\u0005\b\u008a\u0001\u0010	R$\u0010\u008b\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012
                                                   \u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001"\u0006\b\u008f\u0001\u0010\u0090\u0001R!\u0010\u0091\u0001\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0010
                                                   \u0000\u001a\u0005\b\u0092\u0001\u0010\u0007"\u0005\b\u0093\u0001\u0010	R!\u0010\u0094\u0001\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0010
                                                   \u0000\u001a\u0005\b\u0095\u0001\u0010\u000e"\u0005\b\u0096\u0001\u0010\u0010R!\u0010\u0097\u0001\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0010
                                                   \u0000\u001a\u0005\b\u0098\u0001\u0010\u0007"\u0005\b\u0099\u0001\u0010	R!\u0010\u009a\u0001\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0010
                                                   \u0000\u001a\u0005\b\u009b\u0001\u0010\u0007"\u0005\b\u009c\u0001\u0010	R!\u0010\u009d\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010
                                                   \u0000\u001a\u0005\b\u009e\u0001\u0010\u000e"\u0005\b\u009f\u0001\u0010\u0010R!\u0010 \u0001\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010
                                                   \u0000\u001a\u0005\b¡\u0001\u0010\u0007"\u0005\b¢\u0001\u0010	R!\u0010£\u0001\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0010
                                                   \u0000\u001a\u0005\b¤\u0001\u0010\u0007"\u0005\b¥\u0001\u0010	¨\u0006´\u0001""" }, d2 = { "Lgg/essential/config/EssentialConfig;", "Lgg/essential/vigilance/Vigilant;", "Lgg/essential/api/config/EssentialConfig;", "()V", "autoRefreshSession", "", "getAutoRefreshSession", "()Z", "setAutoRefreshSession", "(Z)V", "cosmeticArmorSetting", "", "getCosmeticArmorSetting$annotations", "getCosmeticArmorSetting", "()I", "setCosmeticArmorSetting", "(I)V", "<set-?>", "cosmeticArmorSettingOther", "getCosmeticArmorSettingOther", "setCosmeticArmorSettingOther", "cosmeticArmorSettingSelf", "getCosmeticArmorSettingSelf", "setCosmeticArmorSettingSelf", "currentMultiplayerTab", "getCurrentMultiplayerTab", "setCurrentMultiplayerTab", "disableAllNotifications", "getDisableAllNotifications", "setDisableAllNotifications", "disableCosmetics", "getDisableCosmetics", "setDisableCosmetics", "disableCosmeticsInInventory", "getDisableCosmeticsInInventory", "setDisableCosmeticsInInventory", "discordAllowAskToJoin", "getDiscordAllowAskToJoin", "setDiscordAllowAskToJoin", "discordRichPresence", "getDiscordRichPresence", "setDiscordRichPresence", "discordSdk", "getDiscordSdk$annotations", "getDiscordSdk", "setDiscordSdk", "discordShowCurrentServer", "getDiscordShowCurrentServer", "setDiscordShowCurrentServer", "discordShowUsernameAndAvatar", "getDiscordShowUsernameAndAvatar", "setDiscordShowUsernameAndAvatar", "enableVanillaScreenshotMessage", "getEnableVanillaScreenshotMessage", "setEnableVanillaScreenshotMessage", "enlargeSocialMenuChatMetadata", "getEnlargeSocialMenuChatMetadata", "setEnlargeSocialMenuChatMetadata", "essentialEnabled", "getEssentialEnabled", "setEssentialEnabled", "essentialFull", "getEssentialFull", "setEssentialFull", "essentialGuiScale", "getEssentialGuiScale", "setEssentialGuiScale", "essentialMenuLayout", "getEssentialMenuLayout", "setEssentialMenuLayout", "essentialScreenshots", "getEssentialScreenshots", "setEssentialScreenshots", "friendConnectionStatus", "getFriendConnectionStatus", "setFriendConnectionStatus", "friendRequestPrivacy", "getFriendRequestPrivacy", "setFriendRequestPrivacy", "groupMessageReceivedNotifications", "getGroupMessageReceivedNotifications", "setGroupMessageReceivedNotifications", "hideCosmeticsWhenServerOverridesSkin", "getHideCosmeticsWhenServerOverridesSkin", "setHideCosmeticsWhenServerOverridesSkin", "linkWarning", "getLinkWarning", "setLinkWarning", "menuVisible", "getMenuVisible$annotations", "getMenuVisible", "setMenuVisible", "messageReceivedNotifications", "getMessageReceivedNotifications", "setMessageReceivedNotifications", "messageSound", "getMessageSound", "setMessageSound", "modCoreWarning", "getModCoreWarning", "setModCoreWarning", "openToFriends", "getOpenToFriends", "setOpenToFriends", "overrideGuiScale", "getOverrideGuiScale$annotations", "getOverrideGuiScale", "setOverrideGuiScale", "screenshotBrowserItemsPerRow", "getScreenshotBrowserItemsPerRow", "setScreenshotBrowserItemsPerRow", "screenshotSounds", "getScreenshotSounds", "setScreenshotSounds", "screenshotToastDuration", "getScreenshotToastDuration", "setScreenshotToastDuration", "sendServerUpdates", "getSendServerUpdates", "setSendServerUpdates", "showEssentialIndicatorOnNametag", "getShowEssentialIndicatorOnNametag", "setShowEssentialIndicatorOnNametag", "showEssentialIndicatorOnTab", "getShowEssentialIndicatorOnTab", "setShowEssentialIndicatorOnTab", "showQuickActionBar", "getShowQuickActionBar", "setShowQuickActionBar", "smoothZoomAlgorithm", "getSmoothZoomAlgorithm$annotations", "getSmoothZoomAlgorithm", "setSmoothZoomAlgorithm", "smoothZoomAnimation", "getSmoothZoomAnimation", "setSmoothZoomAnimation", "spsIPWarning", "getSpsIPWarning", "setSpsIPWarning", "spsPinnedGameRules", "", "getSpsPinnedGameRules", "()Ljava/lang/String;", "setSpsPinnedGameRules", "(Ljava/lang/String;)V", "streamerMode", "getStreamerMode", "setStreamerMode", "timeFormat", "getTimeFormat", "setTimeFormat", "toggleToZoom", "getToggleToZoom", "setToggleToZoom", "updateModal", "getUpdateModal", "setUpdateModal", "wardrobeSortOption", "getWardrobeSortOption", "setWardrobeSortOption", "wardrobeSortOptionMigration", "getWardrobeSortOptionMigration", "setWardrobeSortOptionMigration", "zoomSmoothCamera", "getZoomSmoothCamera", "setZoomSmoothCamera", "checkSPS", "disableEssential", "", "disableEssential$essential", "entity", "Lnet/minecraft/entity/Entity;", "refreshScreen", "screen", "Lgg/essential/elementa/WindowScreen;", "revokeTos", "revokeTosButton", "toggleEssential", "enabling", "ConfigSorting", "essential" })
public final class EssentialConfig extends Vigilant implements gg.essential.api.config.EssentialConfig
{
    @NotNull
    public static final EssentialConfig INSTANCE;
    @Property(type = PropertyType.SWITCH, name = "Show Essential Indicator on Tab", category = "General", subcategory = "Online Status", description = "Display an indicator for users on Essential on Tab.")
    private static boolean showEssentialIndicatorOnTab;
    @Property(type = PropertyType.SWITCH, name = "Show Essential Indicator on Nametags", category = "General", subcategory = "Online Status", description = "Display an indicator for users on Essential on their nametag.")
    private static boolean showEssentialIndicatorOnNametag;
    @Property(type = PropertyType.SWITCH, name = "Display Current Server", category = "Privacy", subcategory = "General", description = "Display your current server in the Friends GUI.")
    private static boolean sendServerUpdates;
    @Property(type = PropertyType.SELECTOR, name = "Friend Privacy Settings", category = "Privacy", subcategory = "General", description = "Determines who can send you a friend request on Essential.", options = { "Anyone", "Friends Of Friends", "Nobody" })
    private static int friendRequestPrivacy;
    @Property(type = PropertyType.SWITCH, name = "Streamer Mode", category = "General", subcategory = "General", description = "Disables notifications and notification sounds on Essential.")
    private static boolean streamerMode;
    @Property(type = PropertyType.SWITCH, name = "ModCore Warning", category = "General", subcategory = "General", description = "Receive a popup on startup warning you about mods that are still on ModCore.", hidden = true)
    private static boolean modCoreWarning;
    @Property(type = PropertyType.SWITCH, name = "Prompt when visiting trusted hosts", category = "General", subcategory = "General", description = "Display a confirmation modal before opening a link to a trusted host.")
    private static boolean linkWarning;
    @Property(type = PropertyType.SWITCH, name = "Online Friend Alert", category = "Notifications", subcategory = "General", description = "Receive a notification when a friend comes online.")
    private static boolean friendConnectionStatus;
    private static boolean openToFriends;
    @Property(type = PropertyType.SWITCH, name = "Disable All Notifications", category = "Notifications", subcategory = "General", description = "Stop any Essential notification from appearing.")
    private static boolean disableAllNotifications;
    @Property(type = PropertyType.SWITCH, name = "Message Notifications", category = "Notifications", subcategory = "General", description = "Receive a notification when you receive a message from someone.")
    private static boolean messageReceivedNotifications;
    @Property(type = PropertyType.SWITCH, name = "Group Message Notifications", category = "Notifications", subcategory = "General", description = "Receive a notification when you receive a message in a group.")
    private static boolean groupMessageReceivedNotifications;
    @Property(type = PropertyType.SWITCH, name = "Message Sound", category = "Notifications", subcategory = "General", description = "Play a sound when receiving a message.")
    private static boolean messageSound;
    @Property(type = PropertyType.SWITCH, name = "Update Notifications", category = "Notifications", subcategory = "General", description = "Displays a notification modal after Essential has updated.")
    private static boolean updateModal;
    @Property(type = PropertyType.SWITCH, name = "Host World IP Warning", category = "Notifications", subcategory = "General", description = "Show an IP warning modal when hosting a world.")
    private static boolean spsIPWarning;
    @Property(type = PropertyType.SELECTOR, name = "Screeenshot Toast Duration", category = "Notifications", subcategory = "General", description = "Control the duration (in seconds) that the screenshot toasts are shown.", options = { "3", "5", "10" })
    private static int screenshotToastDuration;
    @Property(type = PropertyType.SWITCH, name = "Smooth Camera when Zoomed", category = "Quality of Life", subcategory = "Zoom", description = "Enable smooth camera when the zoom key is held.")
    private static boolean zoomSmoothCamera;
    @Property(type = PropertyType.SWITCH, name = "Smooth Zoom Animation", category = "Quality of Life", subcategory = "Zoom", description = "Use a smooth animation when zooming in and out.")
    private static boolean smoothZoomAnimation;
    private static int smoothZoomAlgorithm;
    @Property(type = PropertyType.SWITCH, name = "Toggle to Zoom", category = "Quality of Life", subcategory = "Zoom", description = "Zoom when the zoom key is toggled rather than held.")
    private static boolean toggleToZoom;
    private static int currentMultiplayerTab;
    @Property(type = PropertyType.SWITCH, name = "Essential Full", category = "General", subcategory = "Experience", description = "Enables all features available in Essential")
    private static boolean essentialFull;
    @Property(type = PropertyType.SWITCH, name = "Enable Essential", category = "General", subcategory = "Experience", description = "Enables Essential mod features")
    private static boolean essentialEnabled;
    @Property(type = PropertyType.SWITCH, name = "Show Menus", category = "General", subcategory = "Experience", description = "Show Essential buttons in the main and pause menus")
    @Deprecated
    private static boolean menuVisible;
    @Property(type = PropertyType.SELECTOR, name = "Essential Menu Layout", category = "General", subcategory = "Experience", description = "Choose the layout of the Essential main and pause menus", options = { "Full", "Sidebar", "Off" })
    private static int essentialMenuLayout;
    @Property(type = PropertyType.SELECTOR, name = "Essential GUI Scale", category = "General", subcategory = "General", description = "Choose the size of all Essential Menus. The \"Minecraft\" option will use the current GUI Scale setting from the Vanilla options menu.", options = { "Auto", "Small", "Medium", "Large", "Very Large", "Minecraft" })
    private static int essentialGuiScale;
    @Property(type = PropertyType.SWITCH, name = "Auto Refresh Session", category = "Quality of Life", subcategory = "General", description = "Automatically refresh your active session if it's expired when connecting to a server")
    private static boolean autoRefreshSession;
    @Property(type = PropertyType.SWITCH, name = "Disable cosmetics", category = "Cosmetics", subcategory = "General", description = "Disables cosmetic rendering on all players")
    private static boolean disableCosmetics;
    @Property(type = PropertyType.SWITCH, name = "Hide cosmetics on server skins", category = "Cosmetics", subcategory = "General", description = "Hides cosmetics on players when the server modifies the user's skin")
    private static boolean hideCosmeticsWhenServerOverridesSkin;
    @Deprecated
    private static boolean discordSdk;
    @Property(type = PropertyType.SWITCH, name = "Set activity status on Discord", category = "Quality of Life", subcategory = "Discord Integration", description = "Display Essential as your current activity on Discord.")
    private static boolean discordRichPresence;
    @Property(type = PropertyType.SWITCH, name = "Allow Ask To Join", category = "Quality of Life", subcategory = "Discord Integration", description = "Allows other people to ask you to join your world.")
    private static boolean discordAllowAskToJoin;
    @Property(type = PropertyType.SWITCH, name = "Show username and avatar", category = "Quality of Life", subcategory = "Discord Integration", description = "Shows your username and avatar on your rich presence.")
    private static boolean discordShowUsernameAndAvatar;
    @Property(type = PropertyType.SWITCH, name = "Show current server", category = "Quality of Life", subcategory = "Discord Integration", description = "Shows the server that you are connected to on your rich presence.")
    private static boolean discordShowCurrentServer;
    @Property(type = PropertyType.SELECTOR, name = "Cosmetic armor handling", category = "Cosmetics", subcategory = "General", description = "Essential cosmetics do not render over armor by default. This setting allows you to override this behavior behavior and show cosmetics even when the player is wearing armor.", options = { "Hide on all", "Show on self", "Show on all" })
    @Deprecated
    private static int cosmeticArmorSetting;
    @Property(type = PropertyType.SWITCH, name = "Disable cosmetics in inventory", category = "Cosmetics", subcategory = "General", description = "Determines whether cosmetics show on the player display inside the inventory")
    private static boolean disableCosmeticsInInventory;
    @Property(type = PropertyType.SELECTOR, name = "Show my armor", category = "Cosmetics", subcategory = "General", description = """
                                                                                                                                   Choose what to show when you are wearing armor and an overlapping cosmetic at the same time.
                                                                                                                                   
                                                                                                                                   This only affects how you see yourself, not how others see you.""", options = { "Hide conflicting cosmetics", "Hide conflicting armor", "Show cosmetics and armor", "Always hide armor" })
    private static int cosmeticArmorSettingSelf;
    @Property(type = PropertyType.SELECTOR, name = "Show other players' armor", category = "Cosmetics", subcategory = "General", description = "Choose what to show when other players are wearing armor and an overlapping cosmetic at the same time.", options = { "Hide conflicting cosmetics", "Hide conflicting armor", "Show cosmetics and armor", "Always hide armor" })
    private static int cosmeticArmorSettingOther;
    @Property(type = PropertyType.SWITCH, name = "Essential Screenshots", category = "Quality of Life", subcategory = "Screenshots", description = "Enable Essential's screenshot preview and actions on capture")
    private static boolean essentialScreenshots;
    @Property(type = PropertyType.SWITCH, name = "Screenshot Sounds", category = "Quality of Life", subcategory = "Screenshots", description = "Play a capture sound when taking screenshots")
    private static boolean screenshotSounds;
    @Property(type = PropertyType.SWITCH, name = "Vanilla screenshot message", category = "Quality of Life", subcategory = "Screenshots", description = "Print the vanilla screenshot capture message to the ingame chat")
    private static boolean enableVanillaScreenshotMessage;
    @Property(type = PropertyType.SELECTOR, name = "Timestamps Format", category = "General", subcategory = "General", description = "Choose between using 12 or 24 hour time for dates/timestamps in Essential menus.", options = { "12 Hour", "24 Hour" })
    private static int timeFormat;
    @Property(type = PropertyType.SWITCH, name = "Quick Action Bar", category = "General", subcategory = "Experience", description = "Show a quick action bar in the main menu and pause menu to quickly toggle notifications, cosmetics, and fullscreen")
    private static boolean showQuickActionBar;
    @Property(type = PropertyType.SWITCH, name = "GUI Scale", category = "General", subcategory = "General", hidden = true)
    private static boolean overrideGuiScale;
    @Property(type = PropertyType.NUMBER, name = "screenshotBrowserItemsPerRow", category = "Hidden", subcategory = "Hidden", hidden = true)
    private static int screenshotBrowserItemsPerRow;
    @Property(type = PropertyType.NUMBER, name = "wardrobeSortOption", category = "Hidden", subcategory = "Hidden", hidden = true)
    private static int wardrobeSortOption;
    @Property(type = PropertyType.SWITCH, name = "wardrobeSortOptionMigration", category = "Hidden", subcategory = "Hidden", hidden = true)
    private static boolean wardrobeSortOptionMigration;
    @Property(type = PropertyType.TEXT, name = "spsPinnedGameRules", category = "Hidden", subcategory = "Hidden", hidden = true)
    @NotNull
    private static String spsPinnedGameRules;
    @Property(type = PropertyType.SWITCH, name = "Enlarge chat metadata", category = "Quality of Life", subcategory = "Accessibility", description = "Uses a larger font for the usernames and timestamps in the social menu's chat windows.")
    private static boolean enlargeSocialMenuChatMetadata;
    
    private EssentialConfig() {
        super(new File(Essential.getInstance().getBaseDir(), "config.toml"), "Essential Settings", null, ConfigSorting.INSTANCE, 4, null);
    }
    
    @Override
    public boolean getShowEssentialIndicatorOnTab() {
        return EssentialConfig.showEssentialIndicatorOnTab;
    }
    
    @Override
    public void setShowEssentialIndicatorOnTab(final boolean <set-?>) {
        EssentialConfig.showEssentialIndicatorOnTab = <set-?>;
    }
    
    @Override
    public boolean getShowEssentialIndicatorOnNametag() {
        return EssentialConfig.showEssentialIndicatorOnNametag;
    }
    
    @Override
    public void setShowEssentialIndicatorOnNametag(final boolean <set-?>) {
        EssentialConfig.showEssentialIndicatorOnNametag = <set-?>;
    }
    
    @Override
    public boolean getSendServerUpdates() {
        return EssentialConfig.sendServerUpdates;
    }
    
    @Override
    public void setSendServerUpdates(final boolean <set-?>) {
        EssentialConfig.sendServerUpdates = <set-?>;
    }
    
    @Override
    public int getFriendRequestPrivacy() {
        return EssentialConfig.friendRequestPrivacy;
    }
    
    @Override
    public void setFriendRequestPrivacy(final int <set-?>) {
        EssentialConfig.friendRequestPrivacy = <set-?>;
    }
    
    @Override
    public boolean getStreamerMode() {
        return EssentialConfig.streamerMode;
    }
    
    @Override
    public void setStreamerMode(final boolean <set-?>) {
        EssentialConfig.streamerMode = <set-?>;
    }
    
    @Override
    public boolean getModCoreWarning() {
        return EssentialConfig.modCoreWarning;
    }
    
    @Override
    public void setModCoreWarning(final boolean <set-?>) {
        EssentialConfig.modCoreWarning = <set-?>;
    }
    
    @Override
    public boolean getLinkWarning() {
        return EssentialConfig.linkWarning;
    }
    
    @Override
    public void setLinkWarning(final boolean <set-?>) {
        EssentialConfig.linkWarning = <set-?>;
    }
    
    @Override
    public boolean getFriendConnectionStatus() {
        return EssentialConfig.friendConnectionStatus;
    }
    
    @Override
    public void setFriendConnectionStatus(final boolean <set-?>) {
        EssentialConfig.friendConnectionStatus = <set-?>;
    }
    
    @Override
    public boolean getOpenToFriends() {
        return EssentialConfig.openToFriends;
    }
    
    @Override
    public void setOpenToFriends(final boolean <set-?>) {
        EssentialConfig.openToFriends = <set-?>;
    }
    
    @Override
    public boolean getDisableAllNotifications() {
        return EssentialConfig.disableAllNotifications;
    }
    
    @Override
    public void setDisableAllNotifications(final boolean <set-?>) {
        EssentialConfig.disableAllNotifications = <set-?>;
    }
    
    @Override
    public boolean getMessageReceivedNotifications() {
        return EssentialConfig.messageReceivedNotifications;
    }
    
    @Override
    public void setMessageReceivedNotifications(final boolean <set-?>) {
        EssentialConfig.messageReceivedNotifications = <set-?>;
    }
    
    @Override
    public boolean getGroupMessageReceivedNotifications() {
        return EssentialConfig.groupMessageReceivedNotifications;
    }
    
    @Override
    public void setGroupMessageReceivedNotifications(final boolean <set-?>) {
        EssentialConfig.groupMessageReceivedNotifications = <set-?>;
    }
    
    @Override
    public boolean getMessageSound() {
        return EssentialConfig.messageSound;
    }
    
    @Override
    public void setMessageSound(final boolean <set-?>) {
        EssentialConfig.messageSound = <set-?>;
    }
    
    @Override
    public boolean getUpdateModal() {
        return EssentialConfig.updateModal;
    }
    
    @Override
    public void setUpdateModal(final boolean <set-?>) {
        EssentialConfig.updateModal = <set-?>;
    }
    
    public final boolean getSpsIPWarning() {
        return EssentialConfig.spsIPWarning;
    }
    
    public final void setSpsIPWarning(final boolean <set-?>) {
        EssentialConfig.spsIPWarning = <set-?>;
    }
    
    public final int getScreenshotToastDuration() {
        return EssentialConfig.screenshotToastDuration;
    }
    
    @Override
    public boolean getZoomSmoothCamera() {
        return EssentialConfig.zoomSmoothCamera;
    }
    
    @Override
    public void setZoomSmoothCamera(final boolean <set-?>) {
        EssentialConfig.zoomSmoothCamera = <set-?>;
    }
    
    @Override
    public boolean getSmoothZoomAnimation() {
        return EssentialConfig.smoothZoomAnimation;
    }
    
    @Override
    public void setSmoothZoomAnimation(final boolean <set-?>) {
        EssentialConfig.smoothZoomAnimation = <set-?>;
    }
    
    @Override
    public int getSmoothZoomAlgorithm() {
        return EssentialConfig.smoothZoomAlgorithm;
    }
    
    @Override
    public void setSmoothZoomAlgorithm(final int <set-?>) {
        EssentialConfig.smoothZoomAlgorithm = <set-?>;
    }
    
    @Override
    public boolean getToggleToZoom() {
        return EssentialConfig.toggleToZoom;
    }
    
    @Override
    public void setToggleToZoom(final boolean <set-?>) {
        EssentialConfig.toggleToZoom = <set-?>;
    }
    
    @Override
    public int getCurrentMultiplayerTab() {
        return EssentialConfig.currentMultiplayerTab;
    }
    
    @Override
    public void setCurrentMultiplayerTab(final int <set-?>) {
        EssentialConfig.currentMultiplayerTab = <set-?>;
    }
    
    @Override
    public boolean getEssentialFull() {
        return EssentialConfig.essentialEnabled;
    }
    
    @Override
    public void setEssentialFull(final boolean <set-?>) {
        EssentialConfig.essentialFull = <set-?>;
    }
    
    public final boolean getEssentialEnabled() {
        return EssentialConfig.essentialEnabled;
    }
    
    public final int getEssentialMenuLayout() {
        return EssentialConfig.essentialMenuLayout;
    }
    
    @Override
    public int getEssentialGuiScale() {
        return EssentialConfig.essentialGuiScale;
    }
    
    @Override
    public void setEssentialGuiScale(final int <set-?>) {
        EssentialConfig.essentialGuiScale = <set-?>;
    }
    
    @Override
    public boolean getAutoRefreshSession() {
        return EssentialConfig.autoRefreshSession;
    }
    
    @Override
    public void setAutoRefreshSession(final boolean <set-?>) {
        EssentialConfig.autoRefreshSession = <set-?>;
    }
    
    public final boolean getDisableCosmetics() {
        return EssentialConfig.disableCosmetics;
    }
    
    public final void setDisableCosmetics$1385ff() {
        EssentialConfig.disableCosmetics = false;
    }
    
    @Override
    public boolean getHideCosmeticsWhenServerOverridesSkin() {
        return EssentialConfig.hideCosmeticsWhenServerOverridesSkin;
    }
    
    @Override
    public void setHideCosmeticsWhenServerOverridesSkin(final boolean <set-?>) {
        EssentialConfig.hideCosmeticsWhenServerOverridesSkin = <set-?>;
    }
    
    @Override
    @Deprecated
    public boolean getDiscordSdk() {
        return EssentialConfig.discordSdk;
    }
    
    @Override
    @Deprecated
    public void setDiscordSdk(final boolean <set-?>) {
        EssentialConfig.discordSdk = <set-?>;
    }
    
    @Override
    public boolean getDiscordRichPresence() {
        return EssentialConfig.discordRichPresence;
    }
    
    @Override
    public void setDiscordRichPresence(final boolean <set-?>) {
        EssentialConfig.discordRichPresence = <set-?>;
    }
    
    @Override
    public boolean getDiscordAllowAskToJoin() {
        return EssentialConfig.discordAllowAskToJoin;
    }
    
    @Override
    public void setDiscordAllowAskToJoin(final boolean <set-?>) {
        EssentialConfig.discordAllowAskToJoin = <set-?>;
    }
    
    @Override
    public boolean getDiscordShowUsernameAndAvatar() {
        return EssentialConfig.discordShowUsernameAndAvatar;
    }
    
    @Override
    public void setDiscordShowUsernameAndAvatar(final boolean <set-?>) {
        EssentialConfig.discordShowUsernameAndAvatar = <set-?>;
    }
    
    @Override
    public boolean getDiscordShowCurrentServer() {
        return EssentialConfig.discordShowCurrentServer;
    }
    
    @Override
    public void setDiscordShowCurrentServer(final boolean <set-?>) {
        EssentialConfig.discordShowCurrentServer = <set-?>;
    }
    
    @Property(type = PropertyType.BUTTON, name = "Revoke Terms of Service and Privacy Policy", category = "Privacy", subcategory = "General", description = "Deny the Essential terms of service and privacy policy. This will prevent the use of Essential features.", placeholder = "Deny TOS")
    private final void revokeTosButton() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: new             Lgg/essential/gui/common/modal/DangerConfirmationEssentialModal;
        //     6: dup            
        //     7: ldc_w           "Confirm"
        //    10: invokespecial   gg/essential/gui/common/modal/DangerConfirmationEssentialModal.<init>:(Ljava/lang/String;)V
        //    13: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //    16: astore_1        /* $this$configure$iv */
        //    17: aload_1         /* $this$configure$iv */
        //    18: astore_2       
        //    19: aload_2        
        //    20: astore_3        /* $this$configure_u24lambda_u2d0$iv */
        //    21: aload_3         /* $this$configure_u24lambda_u2d0$iv */
        //    22: checkcast       Lgg/essential/gui/common/modal/DangerConfirmationEssentialModal;
        //    25: astore          4
        //    27: astore          5
        //    29: aload           $this$revokeTosButton_u24lambda_u2d0
        //    31: ldc_w           "Revoking Essential's Terms of Service and Privacy Policy will cause Essential features not to work. Are you sure you want to proceed?"
        //    34: invokevirtual   gg/essential/gui/common/modal/DangerConfirmationEssentialModal.setTitleText:(Ljava/lang/String;)V
        //    37: aload           5
        //    39: aload_2        
        //    40: checkcast       Lgg/essential/gui/common/modal/DangerConfirmationEssentialModal;
        //    43: getstatic       gg/essential/config/EssentialConfig$revokeTosButton$2.INSTANCE:Lgg/essential/config/EssentialConfig$revokeTosButton$2;
        //    46: checkcast       Lkotlin/jvm/functions/Function0;
        //    49: invokevirtual   gg/essential/gui/common/modal/DangerConfirmationEssentialModal.onPrimaryAction:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    52: checkcast       Lgg/essential/gui/common/modal/Modal;
        //    55: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //    58: pop            
        //    59: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void revokeTos() {
        if (this.checkSPS()) {
            OnboardingData.setDeniedTos();
            Essential.getInstance().getConnectionManager().onTosRevokedOrEssentialDisabled();
        }
    }
    
    @Override
    @Deprecated
    public int getCosmeticArmorSetting() {
        return EssentialConfig.cosmeticArmorSetting;
    }
    
    @Override
    @Deprecated
    public void setCosmeticArmorSetting(final int <set-?>) {
        EssentialConfig.cosmeticArmorSetting = <set-?>;
    }
    
    public final boolean getDisableCosmeticsInInventory() {
        return EssentialConfig.disableCosmeticsInInventory;
    }
    
    public final void setCosmeticArmorSettingSelf(final int <set-?>) {
        EssentialConfig.cosmeticArmorSettingSelf = <set-?>;
    }
    
    public final int getCosmeticArmorSettingOther() {
        return EssentialConfig.cosmeticArmorSettingOther;
    }
    
    public final void setCosmeticArmorSettingOther(final int <set-?>) {
        EssentialConfig.cosmeticArmorSettingOther = <set-?>;
    }
    
    @Override
    public boolean getEssentialScreenshots() {
        return EssentialConfig.essentialEnabled && EssentialConfig.essentialScreenshots;
    }
    
    @Override
    public void setEssentialScreenshots(final boolean <set-?>) {
        EssentialConfig.essentialScreenshots = <set-?>;
    }
    
    @Override
    public boolean getScreenshotSounds() {
        return EssentialConfig.screenshotSounds;
    }
    
    @Override
    public void setScreenshotSounds(final boolean <set-?>) {
        EssentialConfig.screenshotSounds = <set-?>;
    }
    
    @Override
    public boolean getEnableVanillaScreenshotMessage() {
        return EssentialConfig.enableVanillaScreenshotMessage;
    }
    
    @Override
    public void setEnableVanillaScreenshotMessage(final boolean <set-?>) {
        EssentialConfig.enableVanillaScreenshotMessage = <set-?>;
    }
    
    @Override
    public int getTimeFormat() {
        return EssentialConfig.timeFormat;
    }
    
    @Override
    public void setTimeFormat(final int <set-?>) {
        EssentialConfig.timeFormat = <set-?>;
    }
    
    public final boolean getShowQuickActionBar() {
        return EssentialConfig.showQuickActionBar;
    }
    
    @Override
    public boolean getOverrideGuiScale() {
        return EssentialConfig.overrideGuiScale;
    }
    
    @Override
    public void setOverrideGuiScale(final boolean <set-?>) {
        EssentialConfig.overrideGuiScale = <set-?>;
    }
    
    public final int getScreenshotBrowserItemsPerRow() {
        return EssentialConfig.screenshotBrowserItemsPerRow;
    }
    
    public final void setScreenshotBrowserItemsPerRow(final int <set-?>) {
        EssentialConfig.screenshotBrowserItemsPerRow = <set-?>;
    }
    
    public final int getWardrobeSortOption() {
        return EssentialConfig.wardrobeSortOption;
    }
    
    public final void setWardrobeSortOption(final int <set-?>) {
        EssentialConfig.wardrobeSortOption = <set-?>;
    }
    
    @NotNull
    public final String getSpsPinnedGameRules() {
        return EssentialConfig.spsPinnedGameRules;
    }
    
    public final void setSpsPinnedGameRules(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        EssentialConfig.spsPinnedGameRules = <set-?>;
    }
    
    public final boolean getEnlargeSocialMenuChatMetadata() {
        return EssentialConfig.enlargeSocialMenuChatMetadata;
    }
    
    public final int getCosmeticArmorSetting(@NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        return (entity instanceof ClientPlayerEntity) ? EssentialConfig.cosmeticArmorSettingSelf : EssentialConfig.cosmeticArmorSettingOther;
    }
    
    private final boolean checkSPS() {
        boolean b;
        if (Essential.getInstance().getConnectionManager().getSpsManager().getLocalState() != SPSState.INACTIVE) {
            Notifications.INSTANCE.push("Disabling Essential", "Unable to proceed. Please exit the world and try again.");
            b = false;
        }
        else {
            b = true;
        }
        return b;
    }
    
    private final void toggleEssential(final boolean enabling) {
        final Screen currentScreen = UScreen.Companion.getCurrentScreen();
        final WindowScreen screen = (currentScreen instanceof WindowScreen) ? ((WindowScreen)currentScreen) : null;
        if (!enabling && !this.checkSPS()) {
            EssentialConfig.essentialEnabled = true;
            this.refreshScreen(screen);
            return;
        }
        EssentialConfig.essentialEnabled = enabling;
        this.markDirty();
        Essential.getInstance().getKeybindingRegistry().refreshBinds();
        ((EssentialCommandRegistry)Essential.getInstance().commandRegistry()).checkMiniCommands();
        Essential.getInstance().checkListeners();
        if (enabling) {
            Essential.getInstance().getConnectionManager().connect();
        }
        else {
            Essential.getInstance().getConnectionManager().onTosRevokedOrEssentialDisabled();
        }
    }
    
    private final void refreshScreen(final WindowScreen screen) {
        if (screen != null) {
            screen.restorePreviousScreen();
        }
        GuiUtil.INSTANCE.openScreen(this.gui());
    }
    
    private static final void lambda-2$lambda-1(final Optional it) {
        final Packet get = it.orElse(null);
        if (get == null || !(get instanceof ResponseActionPacket) || !((ResponseActionPacket)get).isSuccessful()) {
            Notifications.INSTANCE.push("Friend Privacy", "An error occurred while updating your friend privacy setting. ");
        }
    }
    
    private static final void _init_$lambda-2(final int it) {
        if (OnboardingData.hasAcceptedTos()) {
            final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
            Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
            final ConnectionManager connectionManager = connectionManager2;
            final FriendRequestPrivacySetting privacy = FriendRequestPrivacySetting.values()[it];
            connectionManager.getRelationshipManager();
            connectionManager.send(new FriendRequestPrivacySettingPacket(privacy), EssentialConfig::lambda-2$lambda-1);
        }
    }
    
    private static final void _init_$lambda-3(final Function2 $sendAbTogglePacket, final boolean it) {
        Intrinsics.checkNotNullParameter((Object)$sendAbTogglePacket, "$sendAbTogglePacket");
        $sendAbTogglePacket.invoke((Object)it, (Object)"discordRichPresence");
        DiscordIntegration.INSTANCE.discordSettingsToggled();
        if (!it) {
            return;
        }
        GuiUtil.INSTANCE.pushModal((Modal)new DiscordActivityStatusModal());
    }
    
    private static final void lambda-5$lambda-4(final boolean b) {
        DiscordIntegration.INSTANCE.discordSettingsToggled();
    }
    
    private static final void lambda-8$lambda-7(final Function2 $sendAbTogglePacket, final String $setting, final Object it) {
        Intrinsics.checkNotNullParameter((Object)$sendAbTogglePacket, "$sendAbTogglePacket");
        Intrinsics.checkNotNullParameter((Object)$setting, "$setting");
        Intrinsics.checkNotNullParameter(it, "it");
        $sendAbTogglePacket.invoke(it, (Object)$setting);
    }
    
    private static final void lambda-10$sendValue(final String $name, final Object value) {
        Essential.getInstance().getConnectionManager().getTelemetryManager().enqueue(new ClientTelemetryPacket("SETTING_STATE", MapsKt.mapOf(TuplesKt.to((Object)$name, value))));
    }
    
    private static final void lambda-10$lambda-9(final String $name, final Object it) {
        Intrinsics.checkNotNullParameter((Object)$name, "$name");
        Intrinsics.checkNotNullParameter(it, "it");
        lambda-10$sendValue($name, it);
    }
    
    private static final void _init_$lambda-12(final boolean enabling) {
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new EssentialConfig$8.EssentialConfig$8$1(enabling));
    }
    
    public static final /* synthetic */ void access$revokeTos(final EssentialConfig $this) {
        $this.revokeTos();
    }
    
    public static final /* synthetic */ void access$toggleEssential(final EssentialConfig $this, final boolean enabling) {
        $this.toggleEssential(enabling);
    }
    
    static {
        INSTANCE = new EssentialConfig();
        EssentialConfig.showEssentialIndicatorOnTab = true;
        EssentialConfig.showEssentialIndicatorOnNametag = true;
        EssentialConfig.modCoreWarning = true;
        EssentialConfig.friendConnectionStatus = true;
        EssentialConfig.openToFriends = true;
        EssentialConfig.messageReceivedNotifications = true;
        EssentialConfig.groupMessageReceivedNotifications = true;
        EssentialConfig.messageSound = true;
        EssentialConfig.updateModal = true;
        EssentialConfig.spsIPWarning = true;
        EssentialConfig.screenshotToastDuration = 1;
        EssentialConfig.zoomSmoothCamera = true;
        EssentialConfig.essentialFull = true;
        EssentialConfig.essentialEnabled = true;
        EssentialConfig.menuVisible = true;
        EssentialConfig.essentialMenuLayout = -1;
        EssentialConfig.essentialGuiScale = -1;
        EssentialConfig.autoRefreshSession = true;
        EssentialConfig.discordRichPresence = true;
        EssentialConfig.discordAllowAskToJoin = true;
        EssentialConfig.discordShowUsernameAndAvatar = true;
        EssentialConfig.cosmeticArmorSettingSelf = -1;
        EssentialConfig.cosmeticArmorSettingOther = -1;
        EssentialConfig.essentialScreenshots = true;
        EssentialConfig.screenshotSounds = true;
        EssentialConfig.showQuickActionBar = true;
        EssentialConfig.overrideGuiScale = true;
        EssentialConfig.screenshotBrowserItemsPerRow = 3;
        EssentialConfig.spsPinnedGameRules = "";
        EssentialConfig.INSTANCE.initialize();
        final Class clazz = EssentialConfig.INSTANCE.getClass();
        final EssentialConfig instance = EssentialConfig.INSTANCE;
        final Field declaredField2 = clazz.getDeclaredField("friendRequestPrivacy");
        Intrinsics.checkNotNullExpressionValue((Object)declaredField2, "clazz.getDeclaredField(\"friendRequestPrivacy\")");
        instance.registerListener(declaredField2, EssentialConfig::_init_$lambda-2);
        final EssentialConfig instance2 = EssentialConfig.INSTANCE;
        final Field declaredField3 = clazz.getDeclaredField("cosmeticArmorSetting");
        Intrinsics.checkNotNullExpressionValue((Object)declaredField3, "clazz.getDeclaredField(\"cosmeticArmorSetting\")");
        instance2.hidePropertyIf(declaredField3, true);
        if (EssentialConfig.essentialMenuLayout == -1) {
            EssentialConfig.essentialMenuLayout = (EssentialConfig.menuVisible ? 0 : 2);
            EssentialConfig.INSTANCE.markDirty();
        }
        final EssentialConfig instance3 = EssentialConfig.INSTANCE;
        final Field declaredField4 = clazz.getDeclaredField("menuVisible");
        Intrinsics.checkNotNullExpressionValue((Object)declaredField4, "clazz.getDeclaredField(\"menuVisible\")");
        instance3.hidePropertyIf(declaredField4, true);
        if (!EssentialConfig.wardrobeSortOptionMigration) {
            ++EssentialConfig.wardrobeSortOption;
            EssentialConfig.wardrobeSortOptionMigration = true;
            EssentialConfig.INSTANCE.markDirty();
        }
        final Map abFeatures = MapsKt.mapOf(new Pair[] { TuplesKt.to((Object)"discordAllowAskToJoin", (Object)true), TuplesKt.to((Object)"disableCosmetics", (Object)true), TuplesKt.to((Object)"essentialEnabled", (Object)true), TuplesKt.to((Object)"essentialMenuLayout", (Object)true) });
        final Function2 sendAbTogglePacket = (Function2)EssentialConfig$sendAbTogglePacket.EssentialConfig$sendAbTogglePacket$1.INSTANCE;
        final List discordSettings = CollectionsKt.listOf((Object[])new String[] { "discordRichPresence", "discordAllowAskToJoin", "discordShowUsernameAndAvatar", "discordShowCurrentServer" });
        final EssentialConfig instance4 = EssentialConfig.INSTANCE;
        final Field declaredField5 = clazz.getDeclaredField("discordRichPresence");
        Intrinsics.checkNotNullExpressionValue((Object)declaredField5, "clazz.getDeclaredField(\"discordRichPresence\")");
        instance4.registerListener(declaredField5, EssentialConfig::_init_$lambda-3);
        final Iterable $this$forEach$iv = CollectionsKt.minus((Iterable)discordSettings, (Iterable)CollectionsKt.listOf((Object)"discordRichPresence"));
        for (final Object element$iv : $this$forEach$iv) {
            final String it = (String)element$iv;
            final EssentialConfig instance5 = EssentialConfig.INSTANCE;
            final Field declaredField6 = clazz.getDeclaredField(it);
            Intrinsics.checkNotNullExpressionValue((Object)declaredField6, "clazz.getDeclaredField(it)");
            instance5.registerListener(declaredField6, EssentialConfig::lambda-5$lambda-4);
        }
        final Map $this$forEach$iv2 = abFeatures;
        for (Map.Entry entry : $this$forEach$iv2.entrySet()) {
            final Map.Entry element$iv2 = entry;
            final String setting = (String)entry.getKey();
            final boolean enabled = (boolean)entry.getValue();
            final EssentialConfig instance6 = EssentialConfig.INSTANCE;
            final Field declaredField7 = clazz.getDeclaredField(setting);
            Intrinsics.checkNotNullExpressionValue((Object)declaredField7, "clazz.getDeclaredField(setting)");
            instance6.hidePropertyIf(declaredField7, !enabled);
            if (enabled) {
                if (!ABTestingData.INSTANCE.hasData("Setting:" + setting)) {
                    sendAbTogglePacket.invoke((Object)null, (Object)setting);
                }
                final EssentialConfig instance7 = EssentialConfig.INSTANCE;
                final Field declaredField8 = clazz.getDeclaredField(setting);
                Intrinsics.checkNotNullExpressionValue((Object)declaredField8, "clazz.getDeclaredField(setting)");
                instance7.registerListener(declaredField8, EssentialConfig::lambda-8$lambda-7);
            }
        }
        final List trackedFeatureState = CollectionsKt.plus((Collection)CollectionsKt.listOf((Object)"menuVisible"), (Iterable)CollectionsKt.listOf((Object[])new String[] { "cosmeticArmorSettingSelf", "cosmeticArmorSettingOther" }));
        Iterable $this$forEach$iv3 = trackedFeatureState;
        for (final Object element$iv3 : $this$forEach$iv3) {
            final String name = (String)element$iv3;
            final Field declaredField = clazz.getDeclaredField(name);
            final EssentialConfig instance8 = EssentialConfig.INSTANCE;
            Intrinsics.checkNotNullExpressionValue((Object)declaredField, "declaredField");
            instance8.registerListener(declaredField, EssentialConfig::lambda-10$lambda-9);
            final String $name = name;
            final Object value = declaredField.get(EssentialConfig.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(value, "declaredField.get(this)");
            lambda-10$sendValue($name, value);
        }
        final EssentialConfig instance9 = EssentialConfig.INSTANCE;
        final Field declaredField9 = clazz.getDeclaredField("essentialFull");
        Intrinsics.checkNotNullExpressionValue((Object)declaredField9, "clazz.getDeclaredField(\"essentialFull\")");
        instance9.hidePropertyIf(declaredField9, true);
        $this$forEach$iv3 = CollectionsKt.listOf((Object[])new String[] { "zoomSmoothCamera", "smoothZoomAnimation", "toggleToZoom" });
        for (final Object element$iv3 : $this$forEach$iv3) {
            final String it2 = (String)element$iv3;
            final EssentialConfig instance10 = EssentialConfig.INSTANCE;
            final Field declaredField10 = clazz.getDeclaredField(it2);
            Intrinsics.checkNotNullExpressionValue((Object)declaredField10, "clazz.getDeclaredField(it)");
            instance10.hidePropertyIf(declaredField10, OptiFineUtil.isLoaded());
        }
        EssentialConfig.INSTANCE.registerListener("essentialEnabled", EssentialConfig::_init_$lambda-12);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000$
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010 
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\b0\u0007j
                                                       \u0012\u0006\b\u0000\u0012\u00020\b`	H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006
                                                       """ }, d2 = { "Lgg/essential/config/EssentialConfig$ConfigSorting;", "Lgg/essential/vigilance/data/SortingBehavior;", "()V", "order", "", "", "getCategoryComparator", "Ljava/util/Comparator;", "Lgg/essential/vigilance/data/Category;", "Lkotlin/Comparator;", "essential" })
    private static final class ConfigSorting extends SortingBehavior
    {
        @NotNull
        public static final ConfigSorting INSTANCE;
        @NotNull
        private static final List<String> order;
        
        private ConfigSorting() {
            super();
        }
        
        @NotNull
        @Override
        public Comparator<? super Category> getCategoryComparator() {
            return ConfigSorting::getCategoryComparator$lambda-1;
        }
        
        private static final int getCategoryComparator$lambda-1(final Category o1, final Category o2) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
            //     4: ldc             "General"
            //     6: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //     9: ifeq            16
            //    12: iconst_m1      
            //    13: goto            106
            //    16: aload_1         /* o2 */
            //    17: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
            //    20: ldc             "General"
            //    22: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //    25: ifeq            32
            //    28: iconst_1       
            //    29: goto            106
            //    32: aload_0         /* o1 */
            //    33: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
            //    36: ldc             "Notifications"
            //    38: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //    41: ifeq            60
            //    44: aload_1         /* o2 */
            //    45: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
            //    48: ldc             "Cosmetics"
            //    50: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //    53: ifeq            60
            //    56: iconst_1       
            //    57: goto            106
            //    60: aload_0         /* o1 */
            //    61: astore_2        /* cat */
            //    62: getstatic       gg/essential/config/EssentialConfig$ConfigSorting.order:Ljava/util/List;
            //    65: aload_2         /* cat */
            //    66: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
            //    69: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
            //    74: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    77: checkcast       Ljava/lang/Comparable;
            //    80: aload_1         /* o2 */
            //    81: astore_2       
            //    82: astore_3       
            //    83: getstatic       gg/essential/config/EssentialConfig$ConfigSorting.order:Ljava/util/List;
            //    86: aload_2         /* cat */
            //    87: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
            //    90: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
            //    95: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    98: checkcast       Ljava/lang/Comparable;
            //   101: aload_3        
            //   102: swap           
            //   103: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
            //   106: ireturn        
            //    MethodParameters:
            //  Name  Flags  
            //  ----  -----
            //  o1    
            //  o2    
            //    StackMapTable: 00 04 10 0F 1B FF 00 2D 00 00 00 01 01
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        static {
            INSTANCE = new ConfigSorting();
            order = CollectionsKt.listOf((Object[])new String[] { "General", "Notifications", "Cosmetics", "Quality of Life", "Privacy" });
        }
    }
}
