package gg.essential.gui.common;

import kotlin.*;
import net.minecraft.client.network.*;
import net.minecraft.client.*;
import org.jetbrains.annotations.*;
import net.minecraft.network.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.util.*;
import java.util.*;
import com.mojang.authlib.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b	\u0010
                                                   "\u0004\b\u000b\u0010\f¨\u0006\u0012""" }, d2 = { "Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;", "Lnet/minecraft/client/network/ClientPlayNetworkHandler;", "mcIn", "Lnet/minecraft/client/MinecraftClient;", "netManager", "Lnet/minecraft/network/ClientConnection;", "(Lnet/minecraft/client/MinecraftClient;Lnet/minecraft/network/ClientConnection;)V", "playerInfo", "Lnet/minecraft/client/network/PlayerListEntry;", "getPlayerInfo", "()Lnet/minecraft/client/network/PlayerListEntry;", "setPlayerInfo", "(Lnet/minecraft/client/network/PlayerListEntry;)V", "getPlayerListEntry", "uniqueId", "Ljava/util/UUID;", "name", "", "essential" })
private static final class FakeNetHandlerPlayClient extends ClientPlayNetworkHandler
{
    @Nullable
    private PlayerListEntry playerInfo;
    
    public FakeNetHandlerPlayClient(@NotNull final MinecraftClient mcIn, @NotNull final ClientConnection netManager) {
        Intrinsics.checkNotNullParameter((Object)mcIn, "mcIn");
        Intrinsics.checkNotNullParameter((Object)netManager, "netManager");
        Screen currentScreen;
        if ((currentScreen = mcIn.currentScreen) == null) {
            currentScreen = (Screen)new FakeNetHandlerPlayClient.EmulatedUI3DPlayer$FakeNetHandlerPlayClient$1(HelpersKt.textLiteral(""));
        }
        super(mcIn, currentScreen, netManager, new GameProfile(UUID.randomUUID(), "EmulatedClient"), mcIn.createTelemetrySender());
    }
    
    @Nullable
    public final PlayerListEntry getPlayerInfo() {
        return this.playerInfo;
    }
    
    public final void setPlayerInfo(@Nullable final PlayerListEntry <set-?>) {
        this.playerInfo = <set-?>;
    }
    
    @Nullable
    public PlayerListEntry getPlayerListEntry(@NotNull final UUID uniqueId) {
        Intrinsics.checkNotNullParameter((Object)uniqueId, "uniqueId");
        return this.playerInfo;
    }
    
    @Nullable
    public PlayerListEntry getPlayerListEntry(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        return this.playerInfo;
    }
}
