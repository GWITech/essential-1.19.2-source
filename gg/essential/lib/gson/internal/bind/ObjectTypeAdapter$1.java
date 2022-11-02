package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.*;

class ObjectTypeAdapter$1 implements TypeAdapterFactory {
    final /* synthetic */ ToNumberStrategy val$toNumberStrategy;
    
    ObjectTypeAdapter$1(final ToNumberStrategy val$toNumberStrategy) {
        this.val$toNumberStrategy = val$toNumberStrategy;
        super();
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
        if (type.getRawType() == Object.class) {
            return (TypeAdapter<T>)new ObjectTypeAdapter(gson, this.val$toNumberStrategy, (byte)0);
        }
        return null;
    }
}