package gg.essential.event.gui;

import gg.essential.event.*;
import net.minecraft.client.gui.screen.*;

public class GuiOpenEvent extends CancellableEvent
{
    private Screen gui;
    
    public GuiOpenEvent(final Screen gui) {
        super();
        this.gui = gui;
    }
    
    public Screen getGui() {
        return this.gui;
    }
}
