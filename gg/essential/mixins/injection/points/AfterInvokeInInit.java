package gg.essential.mixins.injection.points;

import org.spongepowered.asm.mixin.injection.points.*;
import org.spongepowered.asm.mixin.injection.struct.*;
import org.spongepowered.asm.mixin.injection.*;
import java.util.*;
import org.objectweb.asm.tree.*;

@InjectionPoint.AtCode("AFTER_INVOKE_IN_INIT")
public class AfterInvokeInInit extends BeforeInvoke
{
    public AfterInvokeInInit(final InjectionPointData data) {
        super(data);
    }
    
    public InjectionPoint.RestrictTargetLevel getTargetRestriction(final IInjectionPointContext context) {
        return InjectionPoint.RestrictTargetLevel.CONSTRUCTORS_AFTER_DELEGATE;
    }
    
    protected boolean addInsn(final InsnList insns, final Collection<AbstractInsnNode> nodes, final AbstractInsnNode insn) {
        nodes.add(InjectionPoint.nextNode(insns, insn));
        return true;
    }
    
    public boolean find(final String desc, final InsnList insns, final Collection<AbstractInsnNode> nodes) {
        return super.find(desc, insns, (Collection)nodes);
    }
}
