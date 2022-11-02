package gg.essential.lib.mixinextras.injector;

import org.spongepowered.asm.mixin.injection.code.*;
import org.spongepowered.asm.mixin.injection.struct.*;
import gg.essential.lib.mixinextras.utils.*;
import org.objectweb.asm.*;
import org.apache.commons.lang3.*;
import org.objectweb.asm.tree.*;

public class ModifyReceiverInjector extends Injector
{
    public ModifyReceiverInjector(final InjectionInfo info) {
        super(info, "@ModifyReceiver");
    }
    
    protected void inject(final Target target, final InjectionNodes.InjectionNode node) {
        this.checkTargetIsValid(target, node);
        this.checkTargetModifiers(target, false);
        this.modifyReceiverOfTarget(target, node);
    }
    
    private void checkTargetIsValid(final Target target, final InjectionNodes.InjectionNode node) {
        final AbstractInsnNode insn = node.getOriginalTarget();
        switch (insn.getOpcode()) {
            case 180:
            case 181:
            case 182:
            case 183:
            case 185: {
                return;
            }
            default: {
                throw CompatibilityHelper.makeInvalidInjectionException(this.info, String.format("%s annotation is targeting an invalid insn in %s in %s", this.annotationType, target, this));
            }
        }
    }
    
    private void modifyReceiverOfTarget(final Target target, final InjectionNodes.InjectionNode node) {
        final AbstractInsnNode currentTarget = node.getCurrentTarget();
        final Type[] originalArgTypes = this.getEffectiveArgTypes(node.getOriginalTarget());
        final Type[] currentArgTypes = this.getEffectiveArgTypes(currentTarget);
        final InsnList insns = new InsnList();
        final boolean isVirtualRedirect = InjectorUtils.isVirtualRedirect(node);
        this.injectReceiverModifier(target, originalArgTypes, currentArgTypes, isVirtualRedirect, insns);
        target.insertBefore(node, insns);
    }
    
    private void injectReceiverModifier(final Target target, final Type[] originalArgTypes, final Type[] currentArgTypes, final boolean isVirtualRedirect, final InsnList insns) {
        final Injector.InjectorData handler = new Injector.InjectorData(target, "receiver modifier");
        this.validateParams(handler, originalArgTypes[0], originalArgTypes);
        final int[] argMap = this.storeArgs(target, currentArgTypes, insns, 0);
        int[] handlerArgMap = ArrayUtils.addAll(argMap, target.getArgIndices());
        if (isVirtualRedirect) {
            handlerArgMap = ArrayUtils.remove(handlerArgMap, 0);
            insns.add(new VarInsnNode(25, 0));
        }
        this.invokeHandlerWithArgs(this.methodArgs, insns, handlerArgMap);
        this.pushArgs(currentArgTypes, insns, argMap, isVirtualRedirect ? 2 : 1, argMap.length);
    }
    
    private Type[] getEffectiveArgTypes(final AbstractInsnNode node) {
        switch (node.getOpcode()) {
            case 182:
            case 183:
            case 185: {
                final MethodInsnNode methodInsnNode = (MethodInsnNode)node;
                return ArrayUtils.addAll(new Type[] { Type.getObjectType(methodInsnNode.owner) }, Type.getArgumentTypes(methodInsnNode.desc));
            }
            case 180: {
                final FieldInsnNode fieldInsnNode = (FieldInsnNode)node;
                return new Type[] { Type.getObjectType(fieldInsnNode.owner) };
            }
            case 181: {
                final FieldInsnNode fieldInsnNode = (FieldInsnNode)node;
                return new Type[] { Type.getObjectType(fieldInsnNode.owner), Type.getType(fieldInsnNode.desc) };
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }
}
