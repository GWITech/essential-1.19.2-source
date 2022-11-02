package gg.essential.event.gui;

import net.minecraft.client.gui.screen.*;
import java.util.*;
import net.minecraft.client.gui.widget.*;

public class InitGuiEvent
{
    private final Screen screen;
    private final List<ClickableWidget> buttonList;
    
    public InitGuiEvent(final Screen screen, final List<ClickableWidget> buttonList) {
        super();
        this.screen = screen;
        this.buttonList = buttonList;
    }
    
    public Screen getScreen() {
        return this.screen;
    }
    
    public List<ClickableWidget> getButtonList() {
        return this.buttonList;
    }
}
