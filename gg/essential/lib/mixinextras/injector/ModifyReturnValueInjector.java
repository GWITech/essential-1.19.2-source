package gg.essential.lib.mixinextras.injector;

import org.spongepowered.asm.mixin.injection.code.*;
import org.spongepowered.asm.mixin.injection.struct.*;
import gg.essential.lib.mixinextras.utils.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public class ModifyReturnValueInjector extends Injector
{
    public ModifyReturnValueInjector(final InjectionInfo info) {
        super(info, "@ModifyReturnValue");
    }
    
    protected void inject(final Target target, final InjectionNodes.InjectionNode node) {
        final int opcode = node.getCurrentTarget().getOpcode();
        if (opcode < 172 || opcode >= 177) {
            throw CompatibilityHelper.makeInvalidInjectionException(this.info, String.format("%s annotation is targeting an invalid insn in %s in %s", this.annotationType, target, this));
        }
        this.checkTargetModifiers(target, false);
        this.injectReturnValueModifier(target, node);
    }
    
    private void injectReturnValueModifier(final Target target, final InjectionNodes.InjectionNode node) {
        final Injector.InjectorData handler = new Injector.InjectorData(target, "return value modifier");
        final InsnList insns = new InsnList();
        this.validateParams(handler, target.returnType, new Type[] { target.returnType });
        if (!this.isStatic) {
            insns.add(new VarInsnNode(25, 0));
            if (target.returnType.getSize() == 2) {
                insns.add(new InsnNode(91));
                insns.add(new InsnNode(87));
            }
            else {
                insns.add(new InsnNode(95));
            }
        }
        if (handler.captureTargetArgs > 0) {
            this.pushArgs(target.arguments, insns, target.getArgIndices(), 0, handler.captureTargetArgs);
        }
        this.invokeHandler(insns);
        target.insertBefore(node, insns);
    }
}
