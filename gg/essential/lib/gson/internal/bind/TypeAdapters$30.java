package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.*;

class TypeAdapters$30 implements TypeAdapterFactory {
    final /* synthetic */ TypeToken val$type;
    final /* synthetic */ TypeAdapter val$typeAdapter;
    
    TypeAdapters$30(final TypeToken val$type, final TypeAdapter val$typeAdapter) {
        this.val$type = val$type;
        this.val$typeAdapter = val$typeAdapter;
        super();
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        return typeToken.equals(this.val$type) ? this.val$typeAdapter : null;
    }
}