package gg.essential.mixins.transformers.resources;

import org.spongepowered.asm.mixin.*;
import net.minecraft.resource.*;
import java.io.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ AbstractFileResourcePack.class })
public interface AbstractResourcePackAccessor
{
    @Accessor("base")
    File getResourcePackFile();
}
