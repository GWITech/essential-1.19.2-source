package gg.essential.mixins.transformers.client;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ Mouse.class })
public interface MouseHelperAccessor
{
    @Accessor("x")
    void setMouseX(final double p0);
    
    @Accessor("y")
    void setMouseY(final double p0);
}
