package gg.essential.event.render;

import gg.essential.universal.*;

public final class RenderTickEvent
{
    private final boolean pre;
    private final UMatrixStack matrixStack;
    private final float partialTicksMenu;
    private final float partialTicksInGame;
    
    public RenderTickEvent(final boolean pre, final UMatrixStack matrixStack, final float partialTicksMenu, final float partialTicksInGame) {
        super();
        this.pre = pre;
        this.matrixStack = matrixStack;
        this.partialTicksMenu = partialTicksMenu;
        this.partialTicksInGame = partialTicksInGame;
    }
    
    public boolean isPre() {
        return this.pre;
    }
    
    public UMatrixStack getMatrixStack() {
        return this.matrixStack;
    }
    
    public float getPartialTicksMenu() {
        return this.partialTicksMenu;
    }
    
    public float getPartialTicksInGame() {
        return this.partialTicksInGame;
    }
}
