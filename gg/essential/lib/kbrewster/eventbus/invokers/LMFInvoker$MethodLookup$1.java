package gg.essential.lib.kbrewster.eventbus.invokers;

import java.lang.invoke.*;
import java.lang.reflect.*;

enum LMFInvoker$MethodLookup$1
{
    LMFInvoker$MethodLookup$1(final String x0) {
    }
    
    @Override
    MethodHandles.Lookup privateLookup(final Class clazz) throws Exception {
        final MethodHandles.Lookup lookupIn = MethodHandles.lookup().in(clazz);
        final Field modes = MethodHandles.Lookup.class.getDeclaredField("allowedModes");
        modes.setAccessible(true);
        modes.setInt(lookupIn, -1);
        return lookupIn;
    }
}