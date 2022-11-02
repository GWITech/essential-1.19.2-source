package gg.essential.mixins;

import org.spongepowered.asm.mixin.extensibility.*;

public class MixinErrorHandler implements IMixinErrorHandler
{
    public MixinErrorHandler() {
        super();
    }
    
    public IMixinErrorHandler.ErrorAction onPrepareError(final IMixinConfig config, final Throwable th, final IMixinInfo mixin, final IMixinErrorHandler.ErrorAction defaultAction) {
        return defaultAction;
    }
    
    public IMixinErrorHandler.ErrorAction onApplyError(final String targetClassName, final Throwable th, final IMixinInfo mixin, final IMixinErrorHandler.ErrorAction defaultAction) {
        if ("mixins.essential.json".equals(mixin.getConfig().getName()) && defaultAction == IMixinErrorHandler.ErrorAction.ERROR) {
            return IMixinErrorHandler.ErrorAction.WARN;
        }
        return defaultAction;
    }
}
