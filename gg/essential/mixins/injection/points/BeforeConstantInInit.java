package gg.essential.mixins.injection.points;

import org.spongepowered.asm.mixin.injection.points.*;
import org.spongepowered.asm.mixin.injection.struct.*;
import org.spongepowered.asm.mixin.injection.*;
import java.util.*;
import org.objectweb.asm.tree.*;

@InjectionPoint.AtCode("CONSTANT_IN_INIT")
public class BeforeConstantInInit extends BeforeConstant
{
    public BeforeConstantInInit(final InjectionPointData data) {
        super(data);
    }
    
    public InjectionPoint.RestrictTargetLevel getTargetRestriction(final IInjectionPointContext context) {
        return InjectionPoint.RestrictTargetLevel.CONSTRUCTORS_AFTER_DELEGATE;
    }
    
    public boolean find(final String desc, final InsnList insns, final Collection<AbstractInsnNode> nodes) {
        return super.find(desc, insns, (Collection)nodes);
    }
}
