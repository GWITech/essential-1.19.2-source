package gg.essential.mixins.modcompat;

import java.util.*;
import org.objectweb.asm.tree.*;
import org.spongepowered.asm.mixin.extensibility.*;
import org.spongepowered.asm.service.*;

public class Plugin implements IMixinConfigPlugin
{
    public Plugin() {
        super();
    }
    
    public void onLoad(final String mixinPackage) {
    }
    
    public String getRefMapperConfig() {
        return null;
    }
    
    public boolean shouldApplyMixin(final String targetClassName, final String mixinClassName) {
        return hasClass(targetClassName);
    }
    
    public void acceptTargets(final Set<String> myTargets, final Set<String> otherTargets) {
    }
    
    public List<String> getMixins() {
        return null;
    }
    
    public void preApply(final String targetClassName, final ClassNode targetClass, final String mixinClassName, final IMixinInfo mixinInfo) {
    }
    
    public void postApply(final String targetClassName, final ClassNode targetClass, final String mixinClassName, final IMixinInfo mixinInfo) {
    }
    
    private static boolean hasClass(final String name) {
        try {
            MixinService.getService().getBytecodeProvider().getClassNode(name);
            return true;
        }
        catch (final ClassNotFoundException ex) {
            return false;
        }
        catch (final Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
