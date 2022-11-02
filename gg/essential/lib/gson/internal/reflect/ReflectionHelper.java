package gg.essential.lib.gson.internal.reflect;

import gg.essential.lib.gson.*;
import java.lang.reflect.*;

public class ReflectionHelper
{
    public static void makeAccessible(final Field field) throws JsonIOException {
        try {
            field.setAccessible(true);
        }
        catch (final Exception exception) {
            throw new JsonIOException("Failed making field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type", exception);
        }
    }
    
    private static String constructorToString(final Constructor<?> constructor) {
        final StringBuilder stringBuilder = new StringBuilder(constructor.getDeclaringClass().getName()).append('#').append(constructor.getDeclaringClass().getSimpleName()).append('(');
        final Class<?>[] parameters = constructor.getParameterTypes();
        for (int i = 0; i < parameters.length; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(parameters[i].getSimpleName());
        }
        return stringBuilder.append(')').toString();
    }
    
    public static String tryMakeAccessible(final Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        }
        catch (final Exception exception) {
            return "Failed making constructor '" + constructorToString(constructor) + "' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + exception.getMessage();
        }
    }
}
