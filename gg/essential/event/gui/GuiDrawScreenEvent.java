package gg.essential.event.gui;

import net.minecraft.client.gui.screen.*;
import gg.essential.universal.*;

public class GuiDrawScreenEvent
{
    private final Screen screen;
    private final UMatrixStack matrixStack;
    private final int originalMouseX;
    private final int originalMouseY;
    private int mouseX;
    private int mouseY;
    private final boolean post;
    
    public GuiDrawScreenEvent(final Screen screen, final UMatrixStack matrixStack, final int mouseX, final int mouseY, final boolean post) {
        super();
        this.screen = screen;
        this.matrixStack = matrixStack;
        this.originalMouseX = mouseX;
        this.originalMouseY = mouseY;
        this.mouseX = mouseX;
        this.mouseY = mouseY;
        this.post = post;
    }
    
    public Screen getScreen() {
        return this.screen;
    }
    
    public UMatrixStack getMatrixStack() {
        return this.matrixStack;
    }
    
    public int getOriginalMouseX() {
        return this.originalMouseX;
    }
    
    public int getOriginalMouseY() {
        return this.originalMouseY;
    }
    
    public int getMouseX() {
        return this.mouseX;
    }
    
    public void setMouseX$13462e() {
        this.mouseX = -1000000;
    }
    
    public int getMouseY() {
        return this.mouseY;
    }
    
    public void setMouseY$13462e() {
        this.mouseY = -1000000;
    }
    
    public boolean isPre() {
        return !this.post;
    }
    
    public static class Priority extends GuiDrawScreenEvent
    {
        public Priority(final Screen screen, final UMatrixStack matrixStack, final int mouseX, final int mouseY) {
            super(screen, matrixStack, mouseX, mouseY, true);
        }
    }
}
