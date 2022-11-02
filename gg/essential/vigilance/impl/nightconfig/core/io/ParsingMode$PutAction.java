package gg.essential.vigilance.impl.nightconfig.core.io;

import gg.essential.vigilance.impl.nightconfig.core.*;
import java.util.*;
import gg.essential.vigilance.impl.nightconfig.core.utils.*;

@FunctionalInterface
private interface PutAction
{
    Object put(final Config p0, final List<String> p1, final Object p2);
    
    default Object put(final Config config, final String key, final Object value) {
        return this.put(config, StringUtils.split(key, '.'), value);
    }
}
