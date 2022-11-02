package gg.essential.lib.mixinextras.injector;

import org.spongepowered.asm.mixin.injection.struct.*;
import org.spongepowered.asm.mixin.transformer.*;
import org.objectweb.asm.tree.*;
import org.spongepowered.asm.mixin.injection.code.*;

@InjectionInfo.AnnotationType(ModifyReturnValue.class)
@InjectionInfo.HandlerPrefix("modifyReturnValue")
public class ModifyReturnValueInjectionInfo extends InjectionInfo
{
    public ModifyReturnValueInjectionInfo(final MixinTargetContext mixin, final MethodNode method, final AnnotationNode annotation) {
        super(mixin, method, annotation);
    }
    
    protected Injector parseInjector(final AnnotationNode injectAnnotation) {
        return new ModifyReturnValueInjector(this);
    }
}
