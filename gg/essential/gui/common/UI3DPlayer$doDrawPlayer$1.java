package gg.essential.gui.common;

import net.minecraft.client.render.*;
import kotlin.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u0001¨\u0006\u0002""" }, d2 = { "gg/essential/gui/common/UI3DPlayer$doDrawPlayer$1", "Lnet/minecraft/client/render/Camera;", "essential" })
public static final class UI3DPlayer$doDrawPlayer$1 extends Camera {
    UI3DPlayer$doDrawPlayer$1(final PlayerEntity $p, final UI3DPlayer $receiver) {
        super();
    }
    
    {
        this.update((BlockView)$p.field_6002, (Entity)$p, true, true, 0.0f);
        this.setRotation(UI3DPlayer.access$getRotationAngleHorizontal$p($receiver), UI3DPlayer.access$getRotationAngleVerticalFront$p($receiver) * 0.0f);
        this.moveBy(4.0, 0.0, 0.0);
    }
}