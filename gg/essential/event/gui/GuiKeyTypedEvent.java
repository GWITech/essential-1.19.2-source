package gg.essential.event.gui;

import gg.essential.event.*;
import net.minecraft.client.gui.screen.*;

public class GuiKeyTypedEvent extends CancellableEvent
{
    private final Screen screen;
    private final char typedChar;
    private final int keyCode;
    
    public GuiKeyTypedEvent(final Screen screen, final char typedChar, final int keyCode) {
        super();
        this.screen = screen;
        this.typedChar = typedChar;
        this.keyCode = keyCode;
    }
    
    public Screen getScreen() {
        return this.screen;
    }
    
    public char getTypedChar() {
        return this.typedChar;
    }
    
    public int getKeyCode() {
        return this.keyCode;
    }
}
