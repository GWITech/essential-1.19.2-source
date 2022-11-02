package gg.essential.config;

import kotlin.*;
import gg.essential.*;
import java.util.*;

public class FeatureFlags
{
    public static final boolean COSMETIC_TOGGLE_ENABLED;
    public static final boolean UPDATED_COSMETIC_ARMOR_HIDING_ENABLED;
    public static final boolean SPS_HOST_COMMANDS_ENABLED;
    public static final Map<String, Pair<String, Boolean>> abTestingFlags;
    
    private static boolean property$505cbf47(final String featureName) {
        boolean result = true;
        final String str = System.getProperty("essential.feature." + featureName.toLowerCase(Locale.ROOT));
        if (str != null) {
            result = Boolean.parseBoolean(str);
            Essential.logger.warn("Explicitly {} feature flags \"{}\".", (Object)(result ? "enabled" : "disabled"), (Object)featureName);
        }
        return result;
    }
    
    static {
        COSMETIC_TOGGLE_ENABLED = true;
        property$505cbf47("POSE_TRANSFORMS");
        UPDATED_COSMETIC_ARMOR_HIDING_ENABLED = true;
        SPS_HOST_COMMANDS_ENABLED = property$505cbf47("SPS_HOST_COMMANDS");
        abTestingFlags = new HashMap<String, Pair<String, Boolean>>();
    }
}
