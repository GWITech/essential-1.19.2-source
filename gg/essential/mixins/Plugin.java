package gg.essential.mixins;

import gg.essential.asm.*;
import com.google.common.collect.*;
import gg.essential.lib.mixinextras.*;
import gg.essential.util.*;
import org.spongepowered.asm.mixin.injection.*;
import gg.essential.mixins.injection.points.*;
import java.util.*;
import org.objectweb.asm.tree.*;
import org.spongepowered.asm.mixin.extensibility.*;
import org.spongepowered.asm.service.*;

public class Plugin implements IMixinConfigPlugin
{
    private final boolean hasOptifine;
    private final EssentialTransformer[] transformers;
    private final Multimap<String, EssentialTransformer> transformerMap;
    
    public Plugin() {
        super();
        this.hasOptifine = (hasClass("optifine.OptiFineForgeTweaker") || hasClass("me.modmuss50.optifabric.mod.OptifineInjector"));
        this.transformers = new EssentialTransformer[0];
        this.transformerMap = (Multimap<String, EssentialTransformer>)ArrayListMultimap.create();
    }
    
    public void onLoad(final String mixinPackage) {
        MixinExtrasBootstrap.init();
        MixinUtils.registerInjectionPoint((Class<? extends InjectionPoint>)AfterInvokeInInit.class);
        MixinUtils.registerInjectionPoint((Class<? extends InjectionPoint>)BeforeConstantInInit.class);
        for (final EssentialTransformer transformer : this.transformers) {
            for (final String target : transformer.getTargets()) {
                this.transformerMap.put(target, transformer);
            }
        }
    }
    
    public String getRefMapperConfig() {
        return null;
    }
    
    public boolean shouldApplyMixin(final String targetClassName, final String mixinClassName) {
        return (this.hasOptifine || !mixinClassName.endsWith("_Optifine")) && (!this.hasOptifine || !mixinClassName.endsWith("_Zoom")) && (!mixinClassName.contains("compatibility") || hasClass(targetClassName));
    }
    
    public void acceptTargets(final Set<String> myTargets, final Set<String> otherTargets) {
    }
    
    public List<String> getMixins() {
        return null;
    }
    
    public void preApply(final String targetClassName, final ClassNode targetClass, final String mixinClassName, final IMixinInfo mixinInfo) {
        for (EssentialTransformer essentialTransformer : this.transformerMap.get(targetClassName)) {}
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
