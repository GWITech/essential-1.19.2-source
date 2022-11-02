package gg.essential.lib.kbrewster.eventbus.invokers;

import java.lang.invoke.*;
import sun.misc.*;
import java.lang.reflect.*;

enum LMFInvoker$MethodLookup$2
{
    LMFInvoker$MethodLookup$2(final String x0) {
    }
    
    @Override
    MethodHandles.Lookup privateLookup(final Class clazz) throws Exception {
        final Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        final Unsafe unsafe = (Unsafe)theUnsafe.get(null);
        final Field implLookup = MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");
        MethodHandles.publicLookup();
        final MethodHandles.Lookup lookup = (MethodHandles.Lookup)unsafe.getObject(unsafe.staticFieldBase(implLookup), unsafe.staticFieldOffset(implLookup));
        return lookup.in(clazz);
    }
}