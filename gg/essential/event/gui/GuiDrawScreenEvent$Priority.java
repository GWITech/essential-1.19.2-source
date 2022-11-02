package gg.essential.event.gui;

import net.minecraft.client.gui.screen.*;
import gg.essential.universal.*;

public static class Priority extends GuiDrawScreenEvent
{
    public Priority(final Screen screen, final UMatrixStack matrixStack, final int mouseX, final int mouseY) {
        super(screen, matrixStack, mouseX, mouseY, true);
    }
}
