package gg.essential.lib.mixinextras.utils;

import org.spongepowered.asm.mixin.injection.struct.*;

public class InjectorUtils
{
    public InjectorUtils() {
        super();
    }
    
    public static boolean isVirtualRedirect(final InjectionNodes.InjectionNode node) {
        return node.isReplaced() && node.hasDecoration("redirector") && node.getCurrentTarget().getOpcode() != 184;
    }
}
