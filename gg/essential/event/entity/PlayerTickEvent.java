package gg.essential.event.entity;

import net.minecraft.entity.player.*;

public class PlayerTickEvent
{
    private final boolean pre;
    private final PlayerEntity player;
    
    public PlayerTickEvent(final boolean pre, final PlayerEntity player) {
        super();
        this.pre = pre;
        this.player = player;
    }
    
    public PlayerEntity getPlayer() {
        return this.player;
    }
    
    public boolean isPre() {
        return this.pre;
    }
}
