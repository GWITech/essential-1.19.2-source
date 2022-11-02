package gg.essential.util;

import gg.essential.*;
import java.lang.reflect.*;

public class OptiFineUtil
{
    private static final String version;
    
    public static boolean isLoaded() {
        return OptiFineUtil.version != null;
    }
    
    static {
        String detectedVersion;
        try {
            final Class<?> configClass = Class.forName("net.optifine.Config");
            final Field versionField = configClass.getField("VERSION");
            detectedVersion = (String)versionField.get(null);
            Essential.logger.info("OptiFine version {} detected.", (Object)detectedVersion);
        }
        catch (final ClassNotFoundException | NoSuchFieldException | IllegalAccessException ex) {
            detectedVersion = null;
            Essential.logger.info("OptiFine not detected.");
        }
        version = detectedVersion;
    }
}
