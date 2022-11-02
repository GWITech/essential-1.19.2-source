package gg.essential.lib.mixinextras;

import org.spongepowered.asm.mixin.injection.struct.*;
import gg.essential.lib.mixinextras.injector.*;

public class MixinExtrasBootstrap
{
    private static boolean initialized;
    @Deprecated
    public static final String VERSION = "0.0.12";
    
    public MixinExtrasBootstrap() {
        super();
    }
    
    public static void init() {
        if (!MixinExtrasBootstrap.initialized) {
            MixinExtrasBootstrap.initialized = true;
            InjectionInfo.register((Class)ModifyExpressionValueInjectionInfo.class);
            InjectionInfo.register((Class)ModifyReceiverInjectionInfo.class);
            InjectionInfo.register((Class)ModifyReturnValueInjectionInfo.class);
            InjectionInfo.register((Class)WrapWithConditionInjectionInfo.class);
        }
    }
    
    public static String getVersion() {
        return "0.0.12";
    }
    
    static {
        MixinExtrasBootstrap.initialized = false;
    }
}
