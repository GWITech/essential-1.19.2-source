package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.*;

class NumberTypeAdapter$1 implements TypeAdapterFactory {
    final /* synthetic */ NumberTypeAdapter val$adapter;
    
    NumberTypeAdapter$1(final NumberTypeAdapter val$adapter) {
        this.val$adapter = val$adapter;
        super();
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
        return (TypeAdapter<T>)((type.getRawType() == Number.class) ? this.val$adapter : null);
    }
}