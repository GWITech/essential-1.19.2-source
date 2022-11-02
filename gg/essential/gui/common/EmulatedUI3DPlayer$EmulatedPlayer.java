package gg.essential.gui.common;

import kotlin.*;
import com.mojang.authlib.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.network.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000"
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010	R\u0012\u0010
                                                   \u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u000e\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/gui/common/EmulatedUI3DPlayer$EmulatedPlayer;", "", "emulatedUI3DPlayer", "Lgg/essential/gui/common/EmulatedUI3DPlayer;", "getEmulatedUI3DPlayer", "()Lgg/essential/gui/common/EmulatedUI3DPlayer;", "networkInfo", "Lnet/minecraft/client/network/PlayerListEntry;", "getNetworkInfo", "()Lnet/minecraft/client/network/PlayerListEntry;", "originalProfile", "Lcom/mojang/authlib/GameProfile;", "getOriginalProfile", "()Lcom/mojang/authlib/GameProfile;", "essential" })
public interface EmulatedPlayer
{
    @NotNull
    GameProfile getOriginalProfile();
    
    @NotNull
    PlayerListEntry getNetworkInfo();
    
    @NotNull
    EmulatedUI3DPlayer getEmulatedUI3DPlayer();
}
