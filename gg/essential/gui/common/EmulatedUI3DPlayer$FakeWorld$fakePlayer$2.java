package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.client.*;
import net.minecraft.client.network.*;
import net.minecraft.stat.*;
import net.minecraft.client.recipebook.*;
import net.minecraft.client.input.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lnet/minecraft/client/network/ClientPlayerEntity;", "invoke" })
static final class EmulatedUI3DPlayer$FakeWorld$fakePlayer$2 extends Lambda implements Function0<ClientPlayerEntity> {
    public static final EmulatedUI3DPlayer$FakeWorld$fakePlayer$2 INSTANCE;
    
    EmulatedUI3DPlayer$FakeWorld$fakePlayer$2() {
        super(0);
    }
    
    @Nullable
    public final ClientPlayerEntity invoke() {
        ClientPlayerEntity clientPlayerEntity;
        try {
            final MinecraftClient mcClient = MinecraftClient.getInstance();
            final ClientPlayerEntity player = new ClientPlayerEntity(mcClient, EmulatedUI3DPlayer.FakeWorld.INSTANCE.getFakeWorld(), (ClientPlayNetworkHandler)EmulatedUI3DPlayer.FakeWorld.INSTANCE.getFakeNetHandler(), new StatHandler(), new ClientRecipeBook(), false, false);
            player.setServerBrand("Emulated3DPlayer");
            player.input = (Input)new KeyboardInput(mcClient.options);
            try {
                mcClient.gameRenderer.getCamera().update((BlockView)EmulatedUI3DPlayer.FakeWorld.INSTANCE.getFakeWorld(), (Entity)player, false, false, 0.0f);
            }
            catch (final Exception e) {
                e.printStackTrace();
            }
            clientPlayerEntity = player;
        }
        catch (final Throwable e2) {
            e2.printStackTrace();
            clientPlayerEntity = null;
        }
        return clientPlayerEntity;
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        EmulatedUI3DPlayer$FakeWorld$fakePlayer$2.INSTANCE = new EmulatedUI3DPlayer$FakeWorld$fakePlayer$2();
    }
}