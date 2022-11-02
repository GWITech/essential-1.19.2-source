package gg.essential.lib.mixinextras.injector;

import org.spongepowered.asm.mixin.injection.code.*;
import org.spongepowered.asm.mixin.injection.struct.*;
import org.objectweb.asm.*;
import gg.essential.lib.mixinextras.utils.*;
import org.apache.commons.lang3.*;
import org.objectweb.asm.tree.*;

public class WrapWithConditionInjector extends Injector
{
    public WrapWithConditionInjector(final InjectionInfo info) {
        super(info, "@WrapWithCondition");
    }
    
    protected void inject(final Target target, final InjectionNodes.InjectionNode node) {
        this.checkTargetIsLogicallyVoid(target, node);
        this.checkTargetModifiers(target, false);
        this.wrapTargetWithCondition(target, node);
    }
    
    private void checkTargetIsLogicallyVoid(final Target target, final InjectionNodes.InjectionNode node) {
        if (node.hasDecoration("mixinextras_operationIsImmediatelyPopped")) {
            return;
        }
        final Type returnType = this.getReturnType(node.getCurrentTarget());
        if (returnType == null) {
            throw CompatibilityHelper.makeInvalidInjectionException(this.info, String.format("%s annotation is targeting an invalid insn in %s in %s", this.annotationType, target, this));
        }
        if (returnType != Type.VOID_TYPE) {
            throw CompatibilityHelper.makeInvalidInjectionException(this.info, String.format("%s annotation is targeting an instruction with a non-void return type in %s in %s", this.annotationType, target, this));
        }
    }
    
    private void wrapTargetWithCondition(final Target target, final InjectionNodes.InjectionNode node) {
        final AbstractInsnNode currentTarget = node.getCurrentTarget();
        final Type returnType = this.getReturnType(currentTarget);
        final Type[] originalArgTypes = this.getEffectiveArgTypes(node.getOriginalTarget());
        final Type[] currentArgTypes = this.getEffectiveArgTypes(currentTarget);
        final InsnList before = new InsnList();
        final InsnList after = new InsnList();
        final boolean isVirtualRedirect = InjectorUtils.isVirtualRedirect(node);
        this.invokeHandler(target, returnType, originalArgTypes, currentArgTypes, isVirtualRedirect, before, after);
        target.wrapNode(currentTarget, currentTarget, before, after);
    }
    
    private void invokeHandler(final Target target, final Type returnType, final Type[] originalArgTypes, final Type[] currentArgTypes, final boolean isVirtualRedirect, final InsnList before, final InsnList after) {
        final Injector.InjectorData handler = new Injector.InjectorData(target, "condition wrapper");
        this.validateParams(handler, Type.BOOLEAN_TYPE, originalArgTypes);
        final int[] argMap = this.storeArgs(target, currentArgTypes, before, 0);
        int[] handlerArgMap = ArrayUtils.addAll(argMap, target.getArgIndices());
        if (isVirtualRedirect) {
            handlerArgMap = ArrayUtils.remove(handlerArgMap, 0);
        }
        this.invokeHandlerWithArgs(this.methodArgs, before, handlerArgMap);
        final LabelNode afterOperation = new LabelNode();
        final LabelNode afterDummy = new LabelNode();
        before.add(new JumpInsnNode(153, afterOperation));
        this.pushArgs(currentArgTypes, before, argMap, 0, argMap.length);
        after.add(new JumpInsnNode(167, afterDummy));
        after.add(afterOperation);
        if (returnType != Type.VOID_TYPE) {
            after.add(new InsnNode(this.getDummyOpcodeForType(returnType)));
        }
        after.add(afterDummy);
    }
    
    private Type getReturnType(final AbstractInsnNode node) {
        if (node instanceof MethodInsnNode) {
            final MethodInsnNode methodInsnNode = (MethodInsnNode)node;
            return Type.getReturnType(methodInsnNode.desc);
        }
        if (!(node instanceof FieldInsnNode)) {
            return null;
        }
        final FieldInsnNode fieldInsnNode = (FieldInsnNode)node;
        if (fieldInsnNode.getOpcode() == 180 || fieldInsnNode.getOpcode() == 178) {
            return Type.getType(fieldInsnNode.desc);
        }
        return Type.VOID_TYPE;
    }
    
    private Type[] getEffectiveArgTypes(final AbstractInsnNode node) {
        if (node instanceof MethodInsnNode) {
            final MethodInsnNode methodInsnNode = (MethodInsnNode)node;
            return (node.getOpcode() == 184) ? Type.getArgumentTypes(methodInsnNode.desc) : ArrayUtils.addAll(new Type[] { Type.getObjectType(methodInsnNode.owner) }, Type.getArgumentTypes(methodInsnNode.desc));
        }
        if (node instanceof FieldInsnNode) {
            final FieldInsnNode fieldInsnNode = (FieldInsnNode)node;
            if (fieldInsnNode.getOpcode() == 181) {
                return new Type[] { Type.getObjectType(fieldInsnNode.owner), Type.getType(fieldInsnNode.desc) };
            }
            if (fieldInsnNode.getOpcode() == 179) {
                return new Type[] { Type.getType(fieldInsnNode.desc) };
            }
        }
        throw new UnsupportedOperationException();
    }
    
    private int getDummyOpcodeForType(final Type type) {
        switch (type.getSort()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                return 3;
            }
            case 6: {
                return 11;
            }
            case 7: {
                return 9;
            }
            case 8: {
                return 14;
            }
            case 9:
            case 10: {
                return 1;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }
}
