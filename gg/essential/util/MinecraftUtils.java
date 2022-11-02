package gg.essential.util;

import kotlin.*;
import gg.essential.universal.wrappers.message.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.resource.language.*;
import gg.essential.universal.wrappers.*;
import gg.essential.universal.*;
import java.util.*;
import kotlin.text.*;
import net.minecraft.util.*;
import java.awt.image.*;
import javax.imageio.*;
import org.apache.commons.io.*;
import java.io.*;
import org.jetbrains.annotations.*;
import net.fabricmc.loader.api.*;
import gg.essential.event.client.*;
import gg.essential.lib.kbrewster.eventbus.*;
import net.minecraft.server.integrated.*;
import net.minecraft.world.*;
import net.minecraft.client.network.*;
import net.minecraft.client.gui.screen.*;
import kotlin.jvm.*;
import gg.essential.*;
import java.util.concurrent.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000`
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0011
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J)\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00042\u0012\u0010 \u001a
                                                   \u0012\u0006\b\u0001\u0012\u00020"0!"\u00020"H\u0016¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0012\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010(H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002
                                                   \u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e
                                                   \u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010	R\u000e\u0010
                                                   \u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006)""" }, d2 = { "Lgg/essential/util/MinecraftUtils;", "Lgg/essential/api/utils/MinecraftUtils;", "()V", "MESSAGE_PREFIX", "", "currentProtocolVersion", "", "getCurrentProtocolVersion$annotations", "getCurrentProtocolVersion", "()I", "mc", "Lnet/minecraft/client/MinecraftClient;", "messages", "Ljava/util/Queue;", "Lgg/essential/universal/wrappers/message/UTextComponent;", "connectToServer", "", "hostName", "address", "resourceMode", "Lnet/minecraft/client/network/ServerInfo$ResourcePackPolicy;", "getResourceImage", "Ljava/awt/image/BufferedImage;", "location", "Lnet/minecraft/util/Identifier;", "getWorldName", "isDevelopment", "", "isHostingSPS", "isHypixel", "sendChatMessageAndFormat", "message", "parameters", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "sendMessage", "prefix", "tick", "event", "Lgg/essential/event/client/ClientTickEvent;", "essential" })
public final class MinecraftUtils implements gg.essential.api.utils.MinecraftUtils
{
    @NotNull
    public static final MinecraftUtils INSTANCE;
    @NotNull
    private static final Queue<UTextComponent> messages;
    @NotNull
    private static final MinecraftClient mc;
    private static final int currentProtocolVersion;
    
    private MinecraftUtils() {
        super();
    }
    
    public static final int getCurrentProtocolVersion() {
        return MinecraftUtils.currentProtocolVersion;
    }
    
    @Override
    public void sendMessage(@NotNull final UTextComponent message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        MinecraftUtils.messages.add(message);
    }
    
    @Override
    public void sendChatMessageAndFormat(@NotNull final String message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        final String translate = I18n.translate(message, new Object[0]);
        Intrinsics.checkNotNullExpressionValue((Object)translate, "translate(message)");
        this.sendMessage(translate);
    }
    
    @Override
    public void sendChatMessageAndFormat(@NotNull final String message, @NotNull final Object... parameters) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        Intrinsics.checkNotNullParameter((Object)parameters, "parameters");
        final String translate = I18n.translate(message, Arrays.copyOf(parameters, parameters.length));
        Intrinsics.checkNotNullExpressionValue((Object)translate, "translate(message, *parameters)");
        this.sendMessage(translate);
    }
    
    @Override
    public void sendMessage(@NotNull final String message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        this.sendMessage(ChatColor.GREEN + "[Essential] ", message);
    }
    
    @Override
    public void sendMessage(@NotNull final String prefix, @NotNull final String message) {
        Intrinsics.checkNotNullParameter((Object)prefix, "prefix");
        Intrinsics.checkNotNullParameter((Object)message, "message");
        this.sendMessage(new UTextComponent(prefix + ChatColor.RESET + I18n.translate(message, new Object[0])));
    }
    
    @Override
    public boolean isHypixel() {
        if (!UPlayer.hasPlayer() || UMinecraft.getWorld() == null || MinecraftUtils.mc.isIntegratedServerRunning()) {
            return false;
        }
        final ClientPlayerEntity player = UPlayer.getPlayer();
        if (player != null) {
            final String serverBrand2 = player.getServerBrand();
            if (serverBrand2 != null) {
                final String s;
                final String serverBrand = s = serverBrand2;
                final Locale english = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue((Object)english, "ENGLISH");
                final String lowerCase = s.toLowerCase(english);
                Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
                return StringsKt.contains$default((CharSequence)lowerCase, (CharSequence)"hypixel", false, 2, (Object)null);
            }
        }
        return false;
    }
    
    @Nullable
    @Override
    public BufferedImage getResourceImage(@NotNull final Identifier location) {
        Intrinsics.checkNotNullParameter((Object)location, "location");
        final InputStream stream = MinecraftUtils.mc.getResourceManager().open(location);
        try {
            BufferedImage bufferedimage;
            try {
                final BufferedImage read = ImageIO.read(stream);
                Intrinsics.checkNotNullExpressionValue((Object)read, "read(stream)");
                bufferedimage = read;
            }
            finally {
                IOUtils.closeQuietly(stream);
            }
            return bufferedimage;
        }
        catch (final IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isDevelopment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }
    
    @Subscribe
    public final void tick(@Nullable final ClientTickEvent event) {
        if (!UPlayer.hasPlayer()) {
            return;
        }
        while (true) {
            final UTextComponent poll = MinecraftUtils.messages.poll();
            final Object message;
            final UTextComponent it = (UTextComponent)(message = poll);
            if (poll == null) {
                break;
            }
            final Object message2 = message;
            if (message2 == null) {
                continue;
            }
            UPlayer.sendClientSideMessage((UTextComponent)message2);
        }
    }
    
    @Nullable
    public final String getWorldName() {
        final IntegratedServer server = MinecraftClient.getInstance().getServer();
        if (server != null) {
            final SaveProperties method_27728 = server.method_27728();
            if (method_27728 != null) {
                return method_27728.getLevelName();
            }
        }
        return null;
    }
    
    @JvmOverloads
    public final void connectToServer(@NotNull final String hostName, @NotNull final String address, @NotNull final ServerInfo$ResourcePackPolicy resourceMode) {
        Intrinsics.checkNotNullParameter((Object)hostName, "hostName");
        Intrinsics.checkNotNullParameter((Object)address, "address");
        Intrinsics.checkNotNullParameter((Object)resourceMode, "resourceMode");
        Screen currentScreen = MinecraftUtils.mc.currentScreen;
        if (currentScreen == null) {
            currentScreen = (Screen)new TitleScreen();
        }
        final ServerInfo serverData = new ServerInfo(hostName, address, false);
        serverData.setResourcePackPolicy(resourceMode);
        ConnectScreen.connect(currentScreen, MinecraftUtils.mc, ServerAddress.parse(serverData.address), serverData);
    }
    
    public static /* synthetic */ void connectToServer$default$50c0524c$501403d8(final MinecraftUtils minecraftUtils, final String hostName, final String address) {
        minecraftUtils.connectToServer(hostName, address, ServerInfo$ResourcePackPolicy.PROMPT);
    }
    
    public final boolean isHostingSPS() {
        return Essential.getInstance().getConnectionManager().getSpsManager().getLocalSession() != null;
    }
    
    @JvmOverloads
    public final void connectToServer(@NotNull final String hostName, @NotNull final String address) {
        Intrinsics.checkNotNullParameter((Object)hostName, "hostName");
        Intrinsics.checkNotNullParameter((Object)address, "address");
        connectToServer$default$50c0524c$501403d8(this, hostName, address);
    }
    
    static {
        INSTANCE = new MinecraftUtils();
        messages = new ConcurrentLinkedQueue<UTextComponent>();
        mc = UMinecraft.getMinecraft();
        currentProtocolVersion = new ServerInfo("", "", false).protocolVersion;
    }
}
