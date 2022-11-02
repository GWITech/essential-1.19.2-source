package gg.essential.mixins.impl.entity.player;

import gg.essential.mixins.impl.*;
import net.minecraft.entity.player.*;
import gg.essential.*;
import gg.essential.event.entity.*;

public class EntityPlayerHook extends ClassHook<PlayerEntity>
{
    public EntityPlayerHook(final PlayerEntity instance) {
        super(instance);
    }
    
    public void tickPre() {
        Essential.EVENT_BUS.post(new PlayerTickEvent(true, (PlayerEntity)this.instance));
    }
    
    public void tickPost() {
        Essential.EVENT_BUS.post(new PlayerTickEvent(false, (PlayerEntity)this.instance));
    }
}
