package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.internal.*;
import java.lang.reflect.*;

class ArrayTypeAdapter$1 implements TypeAdapterFactory {
    ArrayTypeAdapter$1() {
        super();
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final Type type = typeToken.getType();
        if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class)type).isArray())) {
            return null;
        }
        final Type componentType = $Gson$Types.getArrayComponentType(type);
        final TypeAdapter<?> componentTypeAdapter = gson.getAdapter(TypeToken.get(componentType));
        return (TypeAdapter<T>)new ArrayTypeAdapter(gson, (TypeAdapter<Object>)componentTypeAdapter, (Class<Object>)$Gson$Types.getRawType(componentType));
    }
}