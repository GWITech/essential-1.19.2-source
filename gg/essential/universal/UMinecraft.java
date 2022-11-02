package gg.essential.universal;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import kotlin.jvm.*;
import net.minecraft.client.world.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.network.*;
import net.minecraft.client.font.*;
import net.minecraft.client.util.*;
import net.minecraft.client.gui.hud.*;
import net.minecraft.client.option.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000J
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b
                                                   
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J
                                                   \u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J
                                                   \u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J
                                                   \u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0007J
                                                   \u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b"\u0004\b	\u0010
                                                   R$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\f\u0010\b"\u0004\b\r\u0010
                                                   R\u0010\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000¨\u0006 """ }, d2 = { "Lgg/essential/universal/UMinecraft;", "", "()V", "value", "", "guiScale", "getGuiScale$annotations", "getGuiScale", "()I", "setGuiScale", "(I)V", "guiScaleValue", "getGuiScaleValue", "setGuiScaleValue", "isRunningOnMac", "", "getChatGUI", "Lnet/minecraft/client/gui/hud/ChatHud;", "getFontRenderer", "Lnet/minecraft/client/font/TextRenderer;", "getMinecraft", "Lnet/minecraft/client/MinecraftClient;", "getNetHandler", "Lnet/minecraft/client/network/ClientPlayNetworkHandler;", "getPlayer", "Lnet/minecraft/client/network/ClientPlayerEntity;", "getSettings", "Lnet/minecraft/client/option/GameOptions;", "getTime", "", "getWorld", "Lnet/minecraft/client/world/ClientWorld;", "universalcraft" })
public final class UMinecraft
{
    @NotNull
    public static final UMinecraft INSTANCE;
    @JvmField
    public static final boolean isRunningOnMac;
    
    private UMinecraft() {
        super();
    }
    
    private final int getGuiScaleValue() {
        final Object value = getSettings().getGuiScale().getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getSettings().guiScale.value");
        return ((Number)value).intValue();
    }
    
    private final void setGuiScaleValue(final int value) {
        getSettings().getGuiScale().setValue((Object)value);
    }
    
    public static final int getGuiScale() {
        return UMinecraft.INSTANCE.getGuiScaleValue();
    }
    
    public static final void setGuiScale(final int value) {
        UMinecraft.INSTANCE.setGuiScaleValue(value);
        final UMinecraft instance = UMinecraft.INSTANCE;
        final MinecraftClient mc = getMinecraft();
        final Window window = mc.getWindow();
        final int scaleFactor = window.calculateScaleFactor(value, mc.forcesUnicodeFont());
        window.setScaleFactor((double)scaleFactor);
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void getGuiScale$annotations() {
    }
    
    @JvmStatic
    @NotNull
    public static final MinecraftClient getMinecraft() {
        final MinecraftClient instance = MinecraftClient.getInstance();
        Intrinsics.checkNotNullExpressionValue((Object)instance, "getInstance()");
        return instance;
    }
    
    @JvmStatic
    @Nullable
    public static final ClientWorld getWorld() {
        final UMinecraft instance = UMinecraft.INSTANCE;
        return getMinecraft().world;
    }
    
    @JvmStatic
    @Nullable
    public static final ClientPlayNetworkHandler getNetHandler() {
        final UMinecraft instance = UMinecraft.INSTANCE;
        return getMinecraft().getNetworkHandler();
    }
    
    @JvmStatic
    @Nullable
    public static final ClientPlayerEntity getPlayer() {
        final UMinecraft instance = UMinecraft.INSTANCE;
        return getMinecraft().player;
    }
    
    @JvmStatic
    @NotNull
    public static final TextRenderer getFontRenderer() {
        final UMinecraft instance = UMinecraft.INSTANCE;
        final TextRenderer textRenderer = getMinecraft().textRenderer;
        Intrinsics.checkNotNullExpressionValue((Object)textRenderer, "getMinecraft().textRenderer");
        return textRenderer;
    }
    
    @JvmStatic
    public static final long getTime() {
        return (long)(GlfwUtil.getTime() * 1000);
    }
    
    @JvmStatic
    @Nullable
    public static final ChatHud getChatGUI() {
        final UMinecraft instance = UMinecraft.INSTANCE;
        final InGameHud inGameHud = getMinecraft().inGameHud;
        return (inGameHud == null) ? null : inGameHud.getChatHud();
    }
    
    @JvmStatic
    @NotNull
    public static final GameOptions getSettings() {
        final UMinecraft instance = UMinecraft.INSTANCE;
        final GameOptions options = getMinecraft().options;
        Intrinsics.checkNotNullExpressionValue((Object)options, "getMinecraft().options");
        return options;
    }
    
    static {
        INSTANCE = new UMinecraft();
        isRunningOnMac = MinecraftClient.IS_SYSTEM_MAC;
    }
}
