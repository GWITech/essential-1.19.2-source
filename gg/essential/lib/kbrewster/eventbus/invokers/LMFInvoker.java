package gg.essential.lib.kbrewster.eventbus.invokers;

import java.lang.invoke.*;
import java.lang.reflect.*;
import sun.misc.*;

public class LMFInvoker implements InvokerType
{
    private MethodLookup lookup;
    
    public LMFInvoker() {
        super();
    }
    
    @Override
    public SubscriberMethod setup(final Object object, final Class clazz, final Class parameterClazz, final Method method) throws Throwable {
        method.setAccessible(true);
        final MethodHandles.Lookup caller = this.lazyPrivateLookup(clazz);
        final MethodType subscription = MethodType.methodType(Void.TYPE, parameterClazz);
        final MethodHandle target = caller.findVirtual(clazz, method.getName(), subscription);
        final CallSite site = LambdaMetafactory.metafactory(caller, "invoke", MethodType.methodType(SubscriberMethod.class, clazz), subscription.changeParameterType(0, (Class<?>)Object.class), target, subscription);
        final MethodHandle factory = site.getTarget();
        return factory.bindTo(object).invokeExact();
    }
    
    private MethodHandles.Lookup lazyPrivateLookup(final Class clazz) throws Exception {
        if (this.lookup == null) {
            try {
                this.lookup = MethodLookup.JAVA_9;
                return this.lookup.privateLookup(clazz);
            }
            catch (final NoSuchMethodException e) {
                this.lookup = MethodLookup.JAVA_8;
                return this.lookup.privateLookup(clazz);
            }
        }
        return this.lookup.privateLookup(clazz);
    }
    
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
}
