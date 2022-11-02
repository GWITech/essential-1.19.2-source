package gg.essential.event.gui;

import net.minecraft.client.gui.screen.*;

public class GuiMouseReleaseEvent
{
    private final Screen screen;
    
    public GuiMouseReleaseEvent(final Screen screen) {
        super();
        this.screen = screen;
    }
    
    public Screen getScreen() {
        return this.screen;
    }
}
