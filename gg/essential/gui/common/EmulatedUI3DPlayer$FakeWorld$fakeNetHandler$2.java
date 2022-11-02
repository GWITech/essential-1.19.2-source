package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;", "invoke" })
static final class EmulatedUI3DPlayer$FakeWorld$fakeNetHandler$2 extends Lambda implements Function0<EmulatedUI3DPlayer.FakeNetHandlerPlayClient> {
    public static final EmulatedUI3DPlayer$FakeWorld$fakeNetHandler$2 INSTANCE;
    
    EmulatedUI3DPlayer$FakeWorld$fakeNetHandler$2() {
        super(0);
    }
    
    @NotNull
    public final EmulatedUI3DPlayer.FakeNetHandlerPlayClient invoke() {
        final MinecraftClient instance = MinecraftClient.getInstance();
        Intrinsics.checkNotNullExpressionValue((Object)instance, "getInstance()");
        return new EmulatedUI3DPlayer.FakeNetHandlerPlayClient(instance, EmulatedUI3DPlayer.FakeWorld.access$getFakeNetworkManager$p());
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        EmulatedUI3DPlayer$FakeWorld$fakeNetHandler$2.INSTANCE = new EmulatedUI3DPlayer$FakeWorld$fakeNetHandler$2();
    }
}