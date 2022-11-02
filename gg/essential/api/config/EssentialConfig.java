package gg.essential.api.config;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0010\b
                                                   \u0002\bj\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005"\u0004\b\u0006\u0010\u0007R"\u0010\b\u001a\u00020	8&@&X§\u000e¢\u0006\u0012\u0012\u0004\b
                                                   \u0010\u000b\u001a\u0004\b\f\u0010\r"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020	X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r"\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0013\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0005"\u0004\b\u0015\u0010\u0007R\u0018\u0010\u0016\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0005"\u0004\b\u0018\u0010\u0007R\u0018\u0010\u0019\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0005"\u0004\b\u001b\u0010\u0007R"\u0010\u001c\u001a\u00020\u00038&@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0005"\u0004\b\u001f\u0010\u0007R\u0018\u0010 \u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0005"\u0004\b"\u0010\u0007R\u0018\u0010#\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0005"\u0004\b%\u0010\u0007R\u0018\u0010&\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0005"\u0004\b(\u0010\u0007R\u0018\u0010)\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0005"\u0004\b+\u0010\u0007R\u0018\u0010,\u001a\u00020	X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\r"\u0004\b.\u0010\u000fR\u0018\u0010/\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0005"\u0004\b1\u0010\u0007R\u0018\u00102\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0005"\u0004\b4\u0010\u0007R\u0018\u00105\u001a\u00020	X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010\r"\u0004\b7\u0010\u000fR\u0018\u00108\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010\u0005"\u0004\b:\u0010\u0007R\u0018\u0010;\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0005"\u0004\b=\u0010\u0007R\u0018\u0010>\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b?\u0010\u0005"\u0004\b@\u0010\u0007R\u0018\u0010A\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bB\u0010\u0005"\u0004\bC\u0010\u0007R\u0018\u0010D\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bE\u0010\u0005"\u0004\bF\u0010\u0007R\u0018\u0010G\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bH\u0010\u0005"\u0004\bI\u0010\u0007R\u0018\u0010J\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bK\u0010\u0005"\u0004\bL\u0010\u0007R"\u0010M\u001a\u00020\u00038&@&X§\u000e¢\u0006\u0012\u0012\u0004\bN\u0010\u000b\u001a\u0004\bO\u0010\u0005"\u0004\bP\u0010\u0007R\u0018\u0010Q\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bR\u0010\u0005"\u0004\bS\u0010\u0007R\u0018\u0010T\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bU\u0010\u0005"\u0004\bV\u0010\u0007R\u0018\u0010W\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bX\u0010\u0005"\u0004\bY\u0010\u0007R\u0018\u0010Z\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b[\u0010\u0005"\u0004\b\\u0010\u0007R"\u0010]\u001a\u00020	8&@&X§\u000e¢\u0006\u0012\u0012\u0004\b^\u0010\u000b\u001a\u0004\b_\u0010\r"\u0004\b`\u0010\u000fR\u0018\u0010a\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bb\u0010\u0005"\u0004\bc\u0010\u0007R\u0018\u0010d\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\be\u0010\u0005"\u0004\bf\u0010\u0007R\u0018\u0010g\u001a\u00020	X¦\u000e¢\u0006\f\u001a\u0004\bh\u0010\r"\u0004\bi\u0010\u000fR\u0018\u0010j\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bk\u0010\u0005"\u0004\bl\u0010\u0007R\u0018\u0010m\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bn\u0010\u0005"\u0004\bo\u0010\u0007R\u0018\u0010p\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bq\u0010\u0005"\u0004\br\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006s\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/api/config/EssentialConfig;", "", "autoRefreshSession", "", "getAutoRefreshSession", "()Z", "setAutoRefreshSession", "(Z)V", "cosmeticArmorSetting", "", "getCosmeticArmorSetting$annotations", "()V", "getCosmeticArmorSetting", "()I", "setCosmeticArmorSetting", "(I)V", "currentMultiplayerTab", "getCurrentMultiplayerTab", "setCurrentMultiplayerTab", "disableAllNotifications", "getDisableAllNotifications", "setDisableAllNotifications", "discordAllowAskToJoin", "getDiscordAllowAskToJoin", "setDiscordAllowAskToJoin", "discordRichPresence", "getDiscordRichPresence", "setDiscordRichPresence", "discordSdk", "getDiscordSdk$annotations", "getDiscordSdk", "setDiscordSdk", "discordShowCurrentServer", "getDiscordShowCurrentServer", "setDiscordShowCurrentServer", "discordShowUsernameAndAvatar", "getDiscordShowUsernameAndAvatar", "setDiscordShowUsernameAndAvatar", "enableVanillaScreenshotMessage", "getEnableVanillaScreenshotMessage", "setEnableVanillaScreenshotMessage", "essentialFull", "getEssentialFull", "setEssentialFull", "essentialGuiScale", "getEssentialGuiScale", "setEssentialGuiScale", "essentialScreenshots", "getEssentialScreenshots", "setEssentialScreenshots", "friendConnectionStatus", "getFriendConnectionStatus", "setFriendConnectionStatus", "friendRequestPrivacy", "getFriendRequestPrivacy", "setFriendRequestPrivacy", "groupMessageReceivedNotifications", "getGroupMessageReceivedNotifications", "setGroupMessageReceivedNotifications", "hideCosmeticsWhenServerOverridesSkin", "getHideCosmeticsWhenServerOverridesSkin", "setHideCosmeticsWhenServerOverridesSkin", "linkWarning", "getLinkWarning", "setLinkWarning", "messageReceivedNotifications", "getMessageReceivedNotifications", "setMessageReceivedNotifications", "messageSound", "getMessageSound", "setMessageSound", "modCoreWarning", "getModCoreWarning", "setModCoreWarning", "openToFriends", "getOpenToFriends", "setOpenToFriends", "overrideGuiScale", "getOverrideGuiScale$annotations", "getOverrideGuiScale", "setOverrideGuiScale", "screenshotSounds", "getScreenshotSounds", "setScreenshotSounds", "sendServerUpdates", "getSendServerUpdates", "setSendServerUpdates", "showEssentialIndicatorOnNametag", "getShowEssentialIndicatorOnNametag", "setShowEssentialIndicatorOnNametag", "showEssentialIndicatorOnTab", "getShowEssentialIndicatorOnTab", "setShowEssentialIndicatorOnTab", "smoothZoomAlgorithm", "getSmoothZoomAlgorithm$annotations", "getSmoothZoomAlgorithm", "setSmoothZoomAlgorithm", "smoothZoomAnimation", "getSmoothZoomAnimation", "setSmoothZoomAnimation", "streamerMode", "getStreamerMode", "setStreamerMode", "timeFormat", "getTimeFormat", "setTimeFormat", "toggleToZoom", "getToggleToZoom", "setToggleToZoom", "updateModal", "getUpdateModal", "setUpdateModal", "zoomSmoothCamera", "getZoomSmoothCamera", "setZoomSmoothCamera", "essential-api" })
public interface EssentialConfig
{
    boolean getFriendConnectionStatus();
    
    void setFriendConnectionStatus(final boolean p0);
    
    boolean getOpenToFriends();
    
    void setOpenToFriends(final boolean p0);
    
    boolean getDisableAllNotifications();
    
    void setDisableAllNotifications(final boolean p0);
    
    boolean getMessageReceivedNotifications();
    
    void setMessageReceivedNotifications(final boolean p0);
    
    boolean getGroupMessageReceivedNotifications();
    
    void setGroupMessageReceivedNotifications(final boolean p0);
    
    boolean getMessageSound();
    
    void setMessageSound(final boolean p0);
    
    boolean getUpdateModal();
    
    void setUpdateModal(final boolean p0);
    
    boolean getShowEssentialIndicatorOnTab();
    
    void setShowEssentialIndicatorOnTab(final boolean p0);
    
    boolean getShowEssentialIndicatorOnNametag();
    
    void setShowEssentialIndicatorOnNametag(final boolean p0);
    
    boolean getSendServerUpdates();
    
    void setSendServerUpdates(final boolean p0);
    
    int getFriendRequestPrivacy();
    
    void setFriendRequestPrivacy(final int p0);
    
    int getCurrentMultiplayerTab();
    
    void setCurrentMultiplayerTab(final int p0);
    
    boolean getModCoreWarning();
    
    void setModCoreWarning(final boolean p0);
    
    boolean getLinkWarning();
    
    void setLinkWarning(final boolean p0);
    
    boolean getZoomSmoothCamera();
    
    void setZoomSmoothCamera(final boolean p0);
    
    boolean getSmoothZoomAnimation();
    
    void setSmoothZoomAnimation(final boolean p0);
    
    @java.lang.Deprecated
    int getSmoothZoomAlgorithm();
    
    @java.lang.Deprecated
    void setSmoothZoomAlgorithm(final int p0);
    
    @Deprecated(message = "Removed.")
    @java.lang.Deprecated
    default /* synthetic */ void getSmoothZoomAlgorithm$annotations() {
    }
    
    boolean getToggleToZoom();
    
    void setToggleToZoom(final boolean p0);
    
    boolean getEssentialFull();
    
    void setEssentialFull(final boolean p0);
    
    int getEssentialGuiScale();
    
    void setEssentialGuiScale(final int p0);
    
    boolean getAutoRefreshSession();
    
    void setAutoRefreshSession(final boolean p0);
    
    boolean getStreamerMode();
    
    void setStreamerMode(final boolean p0);
    
    @java.lang.Deprecated
    boolean getDiscordSdk();
    
    @java.lang.Deprecated
    void setDiscordSdk(final boolean p0);
    
    @Deprecated(message = "This setting no longer has any effect")
    @java.lang.Deprecated
    default /* synthetic */ void getDiscordSdk$annotations() {
    }
    
    boolean getDiscordRichPresence();
    
    void setDiscordRichPresence(final boolean p0);
    
    boolean getDiscordAllowAskToJoin();
    
    void setDiscordAllowAskToJoin(final boolean p0);
    
    boolean getDiscordShowUsernameAndAvatar();
    
    void setDiscordShowUsernameAndAvatar(final boolean p0);
    
    boolean getDiscordShowCurrentServer();
    
    void setDiscordShowCurrentServer(final boolean p0);
    
    boolean getHideCosmeticsWhenServerOverridesSkin();
    
    void setHideCosmeticsWhenServerOverridesSkin(final boolean p0);
    
    boolean getEssentialScreenshots();
    
    void setEssentialScreenshots(final boolean p0);
    
    boolean getScreenshotSounds();
    
    void setScreenshotSounds(final boolean p0);
    
    boolean getEnableVanillaScreenshotMessage();
    
    void setEnableVanillaScreenshotMessage(final boolean p0);
    
    @java.lang.Deprecated
    int getCosmeticArmorSetting();
    
    @java.lang.Deprecated
    void setCosmeticArmorSetting(final int p0);
    
    @Deprecated(message = "This setting is no longer used")
    @java.lang.Deprecated
    default /* synthetic */ void getCosmeticArmorSetting$annotations() {
    }
    
    int getTimeFormat();
    
    void setTimeFormat(final int p0);
    
    @java.lang.Deprecated
    boolean getOverrideGuiScale();
    
    @java.lang.Deprecated
    void setOverrideGuiScale(final boolean p0);
    
    @Deprecated(message = "No longer used, replaced by essentialGuiScale.", replaceWith = @ReplaceWith(expression = "essentialGuiScale", imports = {}))
    @java.lang.Deprecated
    default /* synthetic */ void getOverrideGuiScale$annotations() {
    }
}
