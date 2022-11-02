package gg.essential.mixins.transformers.client.gui;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.gui.screen.*;
import java.util.*;
import org.spongepowered.asm.mixin.gen.*;
import net.minecraft.client.gui.*;

@Mixin({ Screen.class })
public interface GuiScreenAccessor
{
    @Accessor
    List<Drawable> getDrawables();
    
    @Accessor
    List<Selectable> getSelectables();
    
    @Accessor("children")
    List<Element> essential$getChildren();
}
