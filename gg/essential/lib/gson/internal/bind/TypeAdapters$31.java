package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import gg.essential.lib.gson.reflect.*;

class TypeAdapters$31 implements TypeAdapterFactory {
    final /* synthetic */ Class val$type;
    final /* synthetic */ TypeAdapter val$typeAdapter;
    
    TypeAdapters$31(final Class val$type, final TypeAdapter val$typeAdapter) {
        this.val$type = val$type;
        this.val$typeAdapter = val$typeAdapter;
        super();
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        return (typeToken.getRawType() == this.val$type) ? this.val$typeAdapter : null;
    }
    
    @Override
    public String toString() {
        return "Factory[type=" + this.val$type.getName() + ",adapter=" + this.val$typeAdapter + "]";
    }
}