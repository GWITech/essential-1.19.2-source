package gg.essential.event.gui;

import net.minecraft.client.gui.screen.*;

public static class Priority extends GuiClickEvent
{
    public Priority(final double mouseX, final double mouseY, final int button, final Screen screen) {
        super(mouseX, mouseY, button, screen);
    }
}
