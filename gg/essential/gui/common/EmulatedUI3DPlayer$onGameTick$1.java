package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import net.minecraft.entity.player.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.*;
import gg.essential.event.entity.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "player", "Lnet/minecraft/entity/player/PlayerEntity;", "invoke" })
static final class EmulatedUI3DPlayer$onGameTick$1 extends Lambda implements Function1<PlayerEntity, Unit> {
    EmulatedUI3DPlayer$onGameTick$1(final EmulatedUI3DPlayer $receiver) {
        super(1);
    }
    
    public final void invoke(@NotNull final PlayerEntity player) {
        Intrinsics.checkNotNullParameter((Object)player, "player");
        ++player.field_6012;
        Essential.EVENT_BUS.post(new PlayerTickEvent(true, player));
        Essential.EVENT_BUS.post(new PlayerTickEvent(false, player));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((PlayerEntity)p1);
        return Unit.INSTANCE;
    }
}