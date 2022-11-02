package gg.essential.mixins.transformers.client.options;

import net.minecraft.client.option.*;
import org.spongepowered.asm.mixin.gen.*;
import org.spongepowered.asm.mixin.*;

@Mixin({ GameOptions.class })
public interface GameOptionsAccessor
{
    @Accessor("allKeys")
    @Mutable
    void setKeyBindings(final KeyBinding[] p0);
}
