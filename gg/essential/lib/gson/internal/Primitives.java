package gg.essential.lib.gson.internal;

import java.lang.reflect.*;

public final class Primitives
{
    public static boolean isPrimitive(final Type type) {
        return type instanceof Class && ((Class)type).isPrimitive();
    }
    
    public static <T> Class<T> wrap(final Class<T> type) {
        if (type == Integer.TYPE) {
            return (Class<T>)Integer.class;
        }
        if (type == Float.TYPE) {
            return (Class<T>)Float.class;
        }
        if (type == Byte.TYPE) {
            return (Class<T>)Byte.class;
        }
        if (type == Double.TYPE) {
            return (Class<T>)Double.class;
        }
        if (type == Long.TYPE) {
            return (Class<T>)Long.class;
        }
        if (type == Character.TYPE) {
            return (Class<T>)Character.class;
        }
        if (type == Boolean.TYPE) {
            return (Class<T>)Boolean.class;
        }
        if (type == Short.TYPE) {
            return (Class<T>)Short.class;
        }
        if (type == Void.TYPE) {
            return (Class<T>)Void.class;
        }
        return type;
    }
}
