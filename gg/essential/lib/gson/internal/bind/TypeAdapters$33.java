package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import gg.essential.lib.gson.reflect.*;

class TypeAdapters$33 implements TypeAdapterFactory {
    final /* synthetic */ Class val$base;
    final /* synthetic */ Class val$sub;
    final /* synthetic */ TypeAdapter val$typeAdapter;
    
    TypeAdapters$33(final Class val$base, final Class val$sub, final TypeAdapter val$typeAdapter) {
        this.val$base = val$base;
        this.val$sub = val$sub;
        this.val$typeAdapter = val$typeAdapter;
        super();
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final Class<? super T> rawType = typeToken.getRawType();
        return (rawType == this.val$base || rawType == this.val$sub) ? this.val$typeAdapter : null;
    }
    
    @Override
    public String toString() {
        return "Factory[type=" + this.val$base.getName() + "+" + this.val$sub.getName() + ",adapter=" + this.val$typeAdapter + "]";
    }
}