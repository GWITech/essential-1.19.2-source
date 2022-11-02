package gg.essential.lib.kbrewster.eventbus.invokers;

import java.lang.invoke.*;
import java.lang.reflect.*;
import sun.misc.*;

enum MethodLookup
{
    JAVA_8 {
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
    }, 
    JAVA_9 {
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
    };
    
    private static final /* synthetic */ MethodLookup[] $VALUES;
    
    public static MethodLookup[] values() {
        return MethodLookup.$VALUES.clone();
    }
    
    public static MethodLookup valueOf(final String name) {
        return Enum.valueOf(MethodLookup.class, name);
    }
    
    abstract MethodHandles.Lookup privateLookup(final Class p0) throws Exception;
    
    MethodLookup(final String x0, final int x1, final byte b) {
        this();
    }
    
    static {
        $VALUES = new MethodLookup[] { MethodLookup.JAVA_8, MethodLookup.JAVA_9 };
    }
}
