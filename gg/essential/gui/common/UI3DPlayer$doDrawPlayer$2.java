package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.client.gui.screen.ingame.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class UI3DPlayer$doDrawPlayer$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ int $scale;
    final /* synthetic */ PlayerEntity $p;
    
    UI3DPlayer$doDrawPlayer$2(final int $scale, final PlayerEntity $p) {
        this.$scale = $scale;
        this.$p = $p;
        super(0);
    }
    
    public final void invoke() {
        InventoryScreen.drawEntity(0, 0, this.$scale, 0.0f, 0.0f, (LivingEntity)this.$p);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}