package gg.essential.mixins.impl.client.renderer.entity;

import gg.essential.mixins.impl.*;
import net.minecraft.client.render.entity.*;
import net.minecraft.entity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.client.network.*;
import gg.essential.event.render.*;
import gg.essential.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.util.*;
import gg.essential.universal.*;

public class RenderHook extends ClassHook<EntityRenderer<?>>
{
    public RenderHook(final EntityRenderer<?> instance) {
        super(instance);
    }
    
    public void renderLivingLabel(final Entity entityIn, final CallbackInfo ci) {
        if (!(entityIn instanceof AbstractClientPlayerEntity)) {
            return;
        }
        final RenderNameTagEvent renderNameTagEvent = new RenderNameTagEvent();
        Essential.EVENT_BUS.post(renderNameTagEvent);
        if (renderNameTagEvent.isCancelled() || GuiUtil.INSTANCE.openedScreen() instanceof TitleScreen) {
            ci.cancel();
            UGraphics.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
}
