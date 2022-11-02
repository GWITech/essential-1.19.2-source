package gg.essential.gui.common;

import net.minecraft.client.world.*;
import net.minecraft.client.network.*;
import org.jetbrains.annotations.*;
import net.minecraft.network.*;
import io.netty.channel.*;
import io.netty.channel.embedded.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000*
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010	\u001a\u00020
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld;", "", "()V", "fakeNetHandler", "Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;", "getFakeNetHandler", "()Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;", "fakeNetHandler$delegate", "Lkotlin/Lazy;", "fakeNetworkManager", "Lnet/minecraft/network/ClientConnection;", "fakePlayer", "Lnet/minecraft/client/network/ClientPlayerEntity;", "getFakePlayer", "()Lnet/minecraft/client/network/ClientPlayerEntity;", "fakePlayer$delegate", "fakeWorld", "Lnet/minecraft/client/world/ClientWorld;", "getFakeWorld", "()Lnet/minecraft/client/world/ClientWorld;", "fakeWorld$delegate", "essential" })
private static final class FakeWorld
{
    @NotNull
    public static final FakeWorld INSTANCE;
    @NotNull
    private static final ClientConnection fakeNetworkManager;
    @NotNull
    private static final Lazy fakeNetHandler$delegate;
    @NotNull
    private static final Lazy fakeWorld$delegate;
    @NotNull
    private static final Lazy fakePlayer$delegate;
    
    private FakeWorld() {
        super();
    }
    
    @NotNull
    public final FakeNetHandlerPlayClient getFakeNetHandler() {
        return (FakeNetHandlerPlayClient)FakeWorld.fakeNetHandler$delegate.getValue();
    }
    
    @NotNull
    public final ClientWorld getFakeWorld() {
        return (ClientWorld)FakeWorld.fakeWorld$delegate.getValue();
    }
    
    @Nullable
    public final ClientPlayerEntity getFakePlayer() {
        return (ClientPlayerEntity)FakeWorld.fakePlayer$delegate.getValue();
    }
    
    public static final /* synthetic */ ClientConnection access$getFakeNetworkManager$p() {
        return FakeWorld.fakeNetworkManager;
    }
    
    static {
        INSTANCE = new FakeWorld();
        final ClientConnection it = new ClientConnection(NetworkSide.CLIENTBOUND);
        new EmbeddedChannel(new ChannelHandler[] { (ChannelHandler)it }).pipeline().fireChannelActive();
        fakeNetworkManager = it;
        fakeNetHandler$delegate = LazyKt.lazy((Function0)EmulatedUI3DPlayer$FakeWorld$fakeNetHandler.EmulatedUI3DPlayer$FakeWorld$fakeNetHandler$2.INSTANCE);
        fakeWorld$delegate = LazyKt.lazy((Function0)EmulatedUI3DPlayer$FakeWorld$fakeWorld.EmulatedUI3DPlayer$FakeWorld$fakeWorld$2.INSTANCE);
        fakePlayer$delegate = LazyKt.lazy((Function0)EmulatedUI3DPlayer$FakeWorld$fakePlayer.EmulatedUI3DPlayer$FakeWorld$fakePlayer$2.INSTANCE);
    }
}
