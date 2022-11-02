package gg.essential.api.tweaker;

import java.io.*;
import java.lang.reflect.*;

@Deprecated
public class EssentialTweaker
{
    public static boolean initialized;
    
    public EssentialTweaker() {
        super();
    }
    
    @Deprecated
    public static void initialize(final File gameDir) {
        EssentialTweaker.initialized = true;
        try {
            Class.forName("gg.essential.main.Bootstrap", false, EssentialTweaker.class.getClassLoader()).getDeclaredMethod("initialize", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    
    static {
        EssentialTweaker.initialized = false;
    }
}
