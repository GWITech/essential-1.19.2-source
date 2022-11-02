package gg.essential.lib.mixinextras.injector;

import org.spongepowered.asm.mixin.injection.struct.*;
import org.spongepowered.asm.mixin.transformer.*;
import org.objectweb.asm.tree.*;
import org.spongepowered.asm.mixin.injection.code.*;

@InjectionInfo.AnnotationType(ModifyExpressionValue.class)
@InjectionInfo.HandlerPrefix("modifyExpressionValue")
public class ModifyExpressionValueInjectionInfo extends InjectionInfo
{
    public ModifyExpressionValueInjectionInfo(final MixinTargetContext mixin, final MethodNode method, final AnnotationNode annotation) {
        super(mixin, method, annotation);
    }
    
    protected Injector parseInjector(final AnnotationNode injectAnnotation) {
        return new ModifyExpressionValueInjector(this);
    }
}
