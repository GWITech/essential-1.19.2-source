package gg.essential.gui.common;

import kotlin.*;
import com.mojang.authlib.*;
import net.minecraft.client.network.*;
import net.minecraft.client.world.*;
import net.minecraft.world.*;
import net.minecraft.text.*;
import gg.essential.util.*;
import net.minecraft.network.packet.s2c.play.*;
import net.minecraft.network.encryption.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00005
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u00012\u00020\u0002J
                                                   \u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u000e¨\u0006\u0014""" }, d2 = { "gg/essential/gui/common/EmulatedUI3DPlayer$initPlayer$1$player$1", "Lnet/minecraft/client/network/OtherClientPlayerEntity;", "Lgg/essential/gui/common/EmulatedUI3DPlayer$EmulatedPlayer;", "emulatedUI3DPlayer", "Lgg/essential/gui/common/EmulatedUI3DPlayer;", "getEmulatedUI3DPlayer", "()Lgg/essential/gui/common/EmulatedUI3DPlayer;", "networkInfo", "Lnet/minecraft/client/network/PlayerListEntry;", "getNetworkInfo", "()Lnet/minecraft/client/network/PlayerListEntry;", "originalProfile", "Lcom/mojang/authlib/GameProfile;", "getOriginalProfile", "()Lcom/mojang/authlib/GameProfile;", "getCapeTexture", "Lnet/minecraft/util/Identifier;", "hasPassengers", "", "isCustomNameVisible", "essential" })
public static final class EmulatedUI3DPlayer$initPlayer$1$player$1 extends OtherClientPlayerEntity implements EmulatedPlayer {
    @NotNull
    private final GameProfile originalProfile = ExtensionsKt.copy($profile);
    @NotNull
    private final PlayerListEntry networkInfo = new PlayerListEntry(new PlayerListS2CPacket$Entry($profile, 0, GameMode.DEFAULT, (Text)HelpersKt.textLiteral(""), (PlayerPublicKey$PublicKeyData)null), EmulatedUI3DPlayer.access$getMcClient$p($receiver).getServicesSignatureVerifier(), false);
    final /* synthetic */ EmulatedUI3DPlayer this$0;
    
    EmulatedUI3DPlayer$initPlayer$1$player$1(final GameProfile $profile, final EmulatedUI3DPlayer $receiver, final ClientWorld $world) {
        this.this$0 = $receiver;
        super($world, $profile, (PlayerPublicKey)null);
    }
    
    @Nullable
    public Identifier method_3119() {
        if (this.this$0.getShowCape().get()) {
            return super.method_3119();
        }
        return null;
    }
    
    public boolean method_5807() {
        return false;
    }
    
    public boolean method_5782() {
        return true;
    }
    
    @NotNull
    public GameProfile getOriginalProfile() {
        return this.originalProfile;
    }
    
    @NotNull
    public PlayerListEntry getNetworkInfo() {
        return this.networkInfo;
    }
    
    @NotNull
    public EmulatedUI3DPlayer getEmulatedUI3DPlayer() {
        return this.this$0;
    }
}