package gg.essential.util;

import org.spongepowered.asm.util.*;
import org.spongepowered.asm.service.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.*;
import java.util.*;
import java.lang.reflect.*;
import org.apache.logging.log4j.*;

public class MixinUtils
{
    private static final Logger logger;
    private static final VersionNumber MIXIN_0_8_2;
    
    public static void addTransformerExclusion(final String name) {
        final ITransformerProvider transformers = MixinService.getService().getTransformerProvider();
        if (transformers != null) {
            transformers.addTransformerExclusion(name);
        }
    }
    
    public static void registerInjectionPoint(final Class<? extends InjectionPoint> clazz) {
        final InjectionPoint.AtCode atCode = clazz.getAnnotation(InjectionPoint.AtCode.class);
        if (atCode == null) {
            throw new IllegalArgumentException("Injection point class " + clazz + " is not annotated with @AtCode");
        }
        if (VersionNumber.parse(MixinEnvironment.getCurrentEnvironment().getVersion()).compareTo(MixinUtils.MIXIN_0_8_2) > 0) {
            InjectionPoint.register((Class)clazz, "ESSENTIAL");
        }
        else {
            try {
                final Field typesField = InjectionPoint.class.getDeclaredField("types");
                typesField.setAccessible(true);
                final Map<String, Class<? extends InjectionPoint>> types = (Map<String, Class<? extends InjectionPoint>>)typesField.get(null);
                types.put("ESSENTIAL:" + atCode.value(), clazz);
            }
            catch (final Throwable t) {
                MixinUtils.logger.error("Failed to register InjectionPoint class " + clazz, t);
            }
        }
    }
    
    static {
        logger = LogManager.getLogger();
        MIXIN_0_8_2 = VersionNumber.parse("0.8.2");
    }
}
