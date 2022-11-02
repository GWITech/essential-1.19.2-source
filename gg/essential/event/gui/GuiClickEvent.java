package gg.essential.event.gui;

import gg.essential.event.*;
import net.minecraft.client.gui.screen.*;

public class GuiClickEvent extends CancellableEvent
{
    private final double mouseX;
    private final double mouseY;
    private final int button;
    private final Screen screen;
    
    public GuiClickEvent(final double mouseX, final double mouseY, final int button, final Screen screen) {
        super();
        this.mouseX = mouseX;
        this.mouseY = mouseY;
        this.button = button;
        this.screen = screen;
    }
    
    public double getMouseX() {
        return this.mouseX;
    }
    
    public double getMouseY() {
        return this.mouseY;
    }
    
    public int getButton() {
        return this.button;
    }
    
    public Screen getScreen() {
        return this.screen;
    }
    
    public static class Priority extends GuiClickEvent
    {
        public Priority(final double mouseX, final double mouseY, final int button, final Screen screen) {
            super(mouseX, mouseY, button, screen);
        }
    }
}
