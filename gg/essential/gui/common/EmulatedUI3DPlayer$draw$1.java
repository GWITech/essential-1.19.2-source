package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import net.minecraft.entity.player.*;
import kotlin.*;
import gg.essential.universal.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lnet/minecraft/entity/player/PlayerEntity;", "invoke" })
static final class EmulatedUI3DPlayer$draw$1 extends Lambda implements Function1<PlayerEntity, Unit> {
    final /* synthetic */ EmulatedUI3DPlayer this$0;
    final /* synthetic */ UMatrixStack $matrixStack;
    
    EmulatedUI3DPlayer$draw$1(final EmulatedUI3DPlayer $receiver, final UMatrixStack $matrixStack) {
        this.this$0 = $receiver;
        this.$matrixStack = $matrixStack;
        super(1);
    }
    
    public final void invoke(@NotNull final PlayerEntity it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        EmulatedUI3DPlayer.access$updateVisibleModelParts(this.this$0, it);
        EmulatedUI3DPlayer.access$getMcClient$p(this.this$0).getEntityRenderDispatcher().configure((World)FakeWorld.INSTANCE.getFakeWorld(), EmulatedUI3DPlayer.access$getMcClient$p(this.this$0).gameRenderer.getCamera(), (Entity)null);
        EmulatedUI3DPlayer.access$draw$s-1316132026(this.this$0, this.$matrixStack);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((PlayerEntity)p1);
        return Unit.INSTANCE;
    }
}