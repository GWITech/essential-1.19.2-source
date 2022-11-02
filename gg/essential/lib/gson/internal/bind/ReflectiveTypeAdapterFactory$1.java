package gg.essential.lib.gson.internal.bind;

import java.lang.reflect.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.reflect.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class ReflectiveTypeAdapterFactory$1 extends BoundField {
    final /* synthetic */ Field val$field;
    final /* synthetic */ boolean val$jsonAdapterPresent;
    final /* synthetic */ TypeAdapter val$typeAdapter;
    final /* synthetic */ Gson val$context;
    final /* synthetic */ TypeToken val$fieldType;
    final /* synthetic */ boolean val$isPrimitive;
    
    ReflectiveTypeAdapterFactory$1(final String name, final boolean serialized, final boolean deserialized, final Field val$field, final boolean val$jsonAdapterPresent, final TypeAdapter val$typeAdapter, final Gson val$context, final TypeToken val$fieldType, final boolean val$isPrimitive) {
        this.val$field = val$field;
        this.val$jsonAdapterPresent = val$jsonAdapterPresent;
        this.val$typeAdapter = val$typeAdapter;
        this.val$context = val$context;
        this.val$fieldType = val$fieldType;
        this.val$isPrimitive = val$isPrimitive;
        super(name, serialized, deserialized);
    }
    
    @Override
    void write(final JsonWriter writer, final Object value) throws IOException, IllegalAccessException {
        final Object fieldValue = this.val$field.get(value);
        final TypeAdapter t = this.val$jsonAdapterPresent ? this.val$typeAdapter : new TypeAdapterRuntimeTypeWrapper(this.val$context, this.val$typeAdapter, this.val$fieldType.getType());
        t.write(writer, fieldValue);
    }
    
    @Override
    void read(final JsonReader reader, final Object value) throws IOException, IllegalAccessException {
        final Object fieldValue = this.val$typeAdapter.read(reader);
        if (fieldValue != null || !this.val$isPrimitive) {
            this.val$field.set(value, fieldValue);
        }
    }
    
    public boolean writeField(final Object value) throws IOException, IllegalAccessException {
        if (!this.serialized) {
            return false;
        }
        final Object fieldValue = this.val$field.get(value);
        return fieldValue != value;
    }
}