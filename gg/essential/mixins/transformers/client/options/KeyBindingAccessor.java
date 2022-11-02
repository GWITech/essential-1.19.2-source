package gg.essential.mixins.transformers.client.options;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.option.*;
import net.minecraft.client.util.*;
import org.spongepowered.asm.mixin.gen.*;
import java.util.*;
import org.spongepowered.asm.mixin.transformer.meta.*;

@Mixin({ KeyBinding.class })
public interface KeyBindingAccessor
{
    @Accessor
    InputUtil.Key getBoundKey();
    
    @Accessor("KEYS_BY_ID")
    @MixinProxy(sessionId = "8123bd13-2a4c-46a4-b56e-a2a9e7ae5fb3")
    default /* synthetic */ Map<String, KeyBinding> getKeybinds() {
        return KeyBinding.getKeybinds_$md$ae5fb3$0();
    }
}
