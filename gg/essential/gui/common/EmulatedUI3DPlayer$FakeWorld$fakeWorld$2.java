package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.universal.*;
import net.minecraft.client.network.*;
import net.minecraft.client.world.*;
import net.minecraft.world.*;
import net.minecraft.util.registry.*;
import net.minecraft.world.dimension.*;
import java.util.function.*;
import net.minecraft.client.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.profiler.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lnet/minecraft/client/world/ClientWorld;", "invoke" })
static final class EmulatedUI3DPlayer$FakeWorld$fakeWorld$2 extends Lambda implements Function0<ClientWorld> {
    public static final EmulatedUI3DPlayer$FakeWorld$fakeWorld$2 INSTANCE;
    
    EmulatedUI3DPlayer$FakeWorld$fakeWorld$2() {
        super(0);
    }
    
    @NotNull
    public final ClientWorld invoke() {
        final MinecraftClient mc = UMinecraft.getMinecraft();
        return new ClientWorld((ClientPlayNetworkHandler)EmulatedUI3DPlayer.FakeWorld.INSTANCE.getFakeNetHandler(), new ClientWorld$Properties(Difficulty.EASY, false, false), World.OVERWORLD, DynamicRegistryManager.createAndLoad().method_30530(Registry.DIMENSION_TYPE_KEY).entryOf(DimensionTypes.OVERWORLD), 0, 0, (Supplier)EmulatedUI3DPlayer$FakeWorld$fakeWorld$2::invoke$lambda-0, mc.worldRenderer, false, 0L);
    }
    
    private static final Profiler invoke$lambda-0(final MinecraftClient $mc) {
        Intrinsics.checkNotNullParameter((Object)$mc, "$mc");
        return $mc.getProfiler();
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        EmulatedUI3DPlayer$FakeWorld$fakeWorld$2.INSTANCE = new EmulatedUI3DPlayer$FakeWorld$fakeWorld$2();
    }
}