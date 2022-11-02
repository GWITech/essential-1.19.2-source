package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import gg.essential.lib.gson.reflect.*;

class TypeAdapters$32 implements TypeAdapterFactory {
    final /* synthetic */ Class val$unboxed;
    final /* synthetic */ Class val$boxed;
    final /* synthetic */ TypeAdapter val$typeAdapter;
    
    TypeAdapters$32(final Class val$unboxed, final Class val$boxed, final TypeAdapter val$typeAdapter) {
        this.val$unboxed = val$unboxed;
        this.val$boxed = val$boxed;
        this.val$typeAdapter = val$typeAdapter;
        super();
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final Class<? super T> rawType = typeToken.getRawType();
        return (rawType == this.val$unboxed || rawType == this.val$boxed) ? this.val$typeAdapter : null;
    }
    
    @Override
    public String toString() {
        return "Factory[type=" + this.val$boxed.getName() + "+" + this.val$unboxed.getName() + ",adapter=" + this.val$typeAdapter + "]";
    }
}