package gg.essential.main;

import org.spongepowered.asm.launch.*;
import gg.essential.util.*;
import org.spongepowered.asm.mixin.*;
import gg.essential.mixins.*;

public class Bootstrap
{
    public Bootstrap() {
        super();
    }
    
    public static void initialize() {
        MixinBootstrap.init();
        MixinUtils.addTransformerExclusion("bre.smoothfont.asm.Transformer");
        MixinUtils.addTransformerExclusion("com.therandomlabs.randompatches.core.RPTransformer");
        MixinUtils.addTransformerExclusion("lakmoore.sel.common.Transformer");
        MixinUtils.addTransformerExclusion("openmods.core.OpenModsClassTransformer");
        MixinUtils.addTransformerExclusion("net.creeperhost.launchertray.transformer.MinecraftTransformer");
        Mixins.addConfiguration("mixins.essential.json");
        Mixins.addConfiguration("mixins.essential.init.json");
        Mixins.addConfiguration("mixins.essential.modcompat.json");
        Mixins.registerErrorHandlerClass(MixinErrorHandler.class.getName());
    }
}
