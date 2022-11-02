package gg.essential.lib.caffeine.cache;

import sun.misc.*;
import java.lang.reflect.*;

final class UnsafeAccess
{
    static final String ANDROID = "THE_ONE";
    static final String OPEN_JDK = "theUnsafe";
    public static final Unsafe UNSAFE;
    
    public static long objectFieldOffset(final Class<?> clazz, final String fieldName) {
        try {
            return UnsafeAccess.UNSAFE.objectFieldOffset(clazz.getDeclaredField(fieldName));
        }
        catch (final NoSuchFieldException | SecurityException e) {
            throw new Error(e);
        }
    }
    
    static Unsafe load(final String openJdk, final String android) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Field field;
        try {
            field = Unsafe.class.getDeclaredField(openJdk);
        }
        catch (final NoSuchFieldException ex) {
            try {
                field = Unsafe.class.getDeclaredField(android);
            }
            catch (final NoSuchFieldException ex2) {
                final Constructor<Unsafe> unsafeConstructor = Unsafe.class.getDeclaredConstructor((Class<?>[])new Class[0]);
                unsafeConstructor.setAccessible(true);
                return unsafeConstructor.newInstance(new Object[0]);
            }
        }
        field.setAccessible(true);
        return (Unsafe)field.get(null);
    }
    
    private UnsafeAccess() {
        super();
    }
    
    static {
        try {
            UNSAFE = load("theUnsafe", "THE_ONE");
        }
        catch (final Exception e) {
            throw new Error("Failed to load sun.misc.Unsafe", e);
        }
    }
}
