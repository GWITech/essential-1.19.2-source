package gg.essential.event.gui;

import gg.essential.event.*;
import net.minecraft.client.gui.screen.*;
import org.jetbrains.annotations.*;

public class MouseScrollEvent extends CancellableEvent
{
    private final double amount;
    @Nullable
    private final Screen screen;
    
    public MouseScrollEvent(final double amount, @Nullable final Screen screen) {
        super();
        this.amount = amount;
        this.screen = screen;
    }
    
    public double getAmount() {
        return this.amount;
    }
    
    @Nullable
    public Screen getScreen() {
        return this.screen;
    }
}
