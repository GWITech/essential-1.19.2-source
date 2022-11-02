package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import net.minecraft.client.network.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lnet/minecraft/client/network/OtherClientPlayerEntity;", "invoke" })
static final class EmulatedUI3DPlayer$configurePlayer$1 extends Lambda implements Function1<OtherClientPlayerEntity, Unit> {
    public static final EmulatedUI3DPlayer$configurePlayer$1 INSTANCE;
    
    EmulatedUI3DPlayer$configurePlayer$1() {
        super(1);
    }
    
    public final void invoke(@NotNull final OtherClientPlayerEntity $this$null) {
        Intrinsics.checkNotNullParameter((Object)$this$null, "$this$null");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((OtherClientPlayerEntity)p1);
        return Unit.INSTANCE;
    }
    
    static {
        EmulatedUI3DPlayer$configurePlayer$1.INSTANCE = new EmulatedUI3DPlayer$configurePlayer$1();
    }
}