package gg.essential.lib.mixinextras.injector;

import org.spongepowered.asm.mixin.transformer.*;
import org.spongepowered.asm.mixin.injection.code.*;
import org.spongepowered.asm.mixin.injection.struct.*;
import org.objectweb.asm.*;
import java.util.*;
import org.objectweb.asm.tree.*;

@InjectionInfo.AnnotationType(WrapWithCondition.class)
@InjectionInfo.HandlerPrefix("wrapWithCondition")
public class WrapWithConditionInjectionInfo extends InjectionInfo
{
    static final String POPPED_OPERATION_DECORATOR = "mixinextras_operationIsImmediatelyPopped";
    
    public WrapWithConditionInjectionInfo(final MixinTargetContext mixin, final MethodNode method, final AnnotationNode annotation) {
        super(mixin, method, annotation);
    }
    
    protected Injector parseInjector(final AnnotationNode injectAnnotation) {
        return new WrapWithConditionInjector(this);
    }
    
    public void prepare() {
        super.prepare();
        for (final List<InjectionNodes.InjectionNode> nodeList : this.targetNodes.values()) {
            for (final InjectionNodes.InjectionNode node : nodeList) {
                final AbstractInsnNode currentTarget = node.getCurrentTarget();
                if (currentTarget instanceof MethodInsnNode) {
                    final Type returnType = Type.getReturnType(((MethodInsnNode)currentTarget).desc);
                    if (!this.isTypePoppedByInstruction(returnType, currentTarget.getNext())) {
                        continue;
                    }
                    node.decorate("mixinextras_operationIsImmediatelyPopped", (Object)true);
                }
            }
        }
    }
    
    private boolean isTypePoppedByInstruction(final Type type, final AbstractInsnNode insn) {
        switch (type.getSize()) {
            case 2: {
                return insn.getOpcode() == 88;
            }
            case 1: {
                return insn.getOpcode() == 87;
            }
            default: {
                return false;
            }
        }
    }
}
