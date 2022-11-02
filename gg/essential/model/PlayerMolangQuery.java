package gg.essential.model;

import gg.essential.model.molang.*;
import net.minecraft.entity.player.*;
import gg.essential.gui.common.*;
import gg.essential.*;
import gg.essential.event.render.*;
import gg.essential.lib.kbrewster.eventbus.*;

public class PlayerMolangQuery implements MolangQueryEntity
{
    private final PlayerEntity player;
    private static float partialTicksMenu;
    private static float partialTicksInGame;
    
    public PlayerMolangQuery(final PlayerEntity player) {
        super();
        this.player = player;
    }
    
    private float getPartialTicks() {
        return (this.player instanceof EmulatedUI3DPlayer.EmulatedPlayer) ? PlayerMolangQuery.partialTicksMenu : PlayerMolangQuery.partialTicksInGame;
    }
    
    @Override
    public float getLifeTime() {
        if (this.player.field_6012 <= 1) {
            return this.player.field_6012 / 20.0f;
        }
        return (this.player.field_6012 + this.getPartialTicks()) / 20.0f;
    }
    
    @Override
    public float getModifiedDistanceMoved() {
        final float next = this.player.field_5973;
        final float prev = this.player.field_6039;
        final float now = prev + (next - prev) * this.getPartialTicks();
        return now * 16.0f;
    }
    
    @Override
    public float getModifiedMoveSpeed() {
        final float next = this.player.field_5973;
        final float prev = this.player.field_6039;
        return (next - prev) * 16.0f;
    }
    
    static {
        Essential.EVENT_BUS.register(new Object() {
            PlayerMolangQuery$1() {
                super();
            }
            
            @Subscribe
            private void renderWorld(final RenderTickEvent event) {
                PlayerMolangQuery.partialTicksMenu = event.getPartialTicksMenu();
                PlayerMolangQuery.partialTicksInGame = event.getPartialTicksInGame();
            }
        });
    }
}
