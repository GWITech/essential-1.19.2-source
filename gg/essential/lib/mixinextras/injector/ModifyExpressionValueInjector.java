package gg.essential.lib.mixinextras.injector;

import org.spongepowered.asm.mixin.injection.code.*;
import org.spongepowered.asm.mixin.injection.struct.*;
import org.objectweb.asm.*;
import gg.essential.lib.mixinextras.utils.*;
import org.objectweb.asm.tree.*;
import org.spongepowered.asm.util.*;

public class ModifyExpressionValueInjector extends Injector
{
    public ModifyExpressionValueInjector(final InjectionInfo info) {
        super(info, "@ModifyExpressionValue");
    }
    
    protected void inject(final Target target, final InjectionNodes.InjectionNode node) {
        this.checkTargetReturnsAValue(target, node);
        this.checkTargetModifiers(target, false);
        AbstractInsnNode valueNode = node.getCurrentTarget();
        final Type valueType = this.getReturnType(valueNode);
        if (valueNode instanceof TypeInsnNode && valueNode.getOpcode() == 187) {
            valueNode = target.findInitNodeFor((TypeInsnNode)valueNode);
        }
        this.injectValueModifier(target, valueNode, valueType);
    }
    
    private void checkTargetReturnsAValue(final Target target, final InjectionNodes.InjectionNode node) {
        final Type returnType = this.getReturnType(node.getCurrentTarget());
        if (returnType == Type.VOID_TYPE) {
            throw CompatibilityHelper.makeInvalidInjectionException(this.info, String.format("%s annotation is targeting an instruction with a return type of 'void' in %s in %s", this.annotationType, target, this));
        }
        if (returnType == null) {
            throw CompatibilityHelper.makeInvalidInjectionException(this.info, String.format("%s annotation is targeting an invalid insn in %s in %s", this.annotationType, target, this));
        }
    }
    
    private void injectValueModifier(final Target target, final AbstractInsnNode valueNode, final Type valueType) {
        final Target.Extension extraStack = target.extendStack();
        final InsnList after = new InsnList();
        this.invokeHandler(valueType, target, extraStack, after);
        extraStack.apply();
        target.insns.insert(valueNode, after);
    }
    
    private void invokeHandler(final Type valueType, final Target target, final Target.Extension extraStack, final InsnList after) {
        final Injector.InjectorData handler = new Injector.InjectorData(target, "expression value modifier");
        this.validateParams(handler, valueType, new Type[] { valueType });
        if (!this.isStatic) {
            after.add(new VarInsnNode(25, 0));
            if (valueType.getSize() == 2) {
                after.add(new InsnNode(91));
                after.add(new InsnNode(87));
            }
            else {
                after.add(new InsnNode(95));
            }
        }
        if (handler.captureTargetArgs > 0) {
            this.pushArgs(target.arguments, after, target.getArgIndices(), 0, handler.captureTargetArgs, extraStack);
        }
        this.invokeHandler(after);
    }
    
    private Type getReturnType(final AbstractInsnNode node) {
        if (node instanceof MethodInsnNode) {
            final MethodInsnNode methodInsnNode = (MethodInsnNode)node;
            return Type.getReturnType(methodInsnNode.desc);
        }
        if (node instanceof FieldInsnNode) {
            final FieldInsnNode fieldInsnNode = (FieldInsnNode)node;
            if (fieldInsnNode.getOpcode() == 180 || fieldInsnNode.getOpcode() == 178) {
                return Type.getType(fieldInsnNode.desc);
            }
            return Type.VOID_TYPE;
        }
        else {
            if (Bytecode.isConstant(node)) {
                return Bytecode.getConstantType(node);
            }
            if (node instanceof TypeInsnNode && node.getOpcode() == 187) {
                final TypeInsnNode typeInsnNode = (TypeInsnNode)node;
                return Type.getObjectType(typeInsnNode.desc);
            }
            return null;
        }
    }
}
