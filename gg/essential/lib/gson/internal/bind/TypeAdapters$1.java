package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$1 extends TypeAdapter<Class> {
    TypeAdapters$1() {
        super();
    }
    
    public void write$6e7ab411(final Class value) throws IOException {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + value.getName() + ". Forgot to register a type adapter?");
    }
    
    public Class read$2e86ecf7() throws IOException {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader jsonReader) throws IOException {
        return this.read$2e86ecf7();
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter jsonWriter, final Object o) throws IOException {
        this.write$6e7ab411((Class)o);
    }
}