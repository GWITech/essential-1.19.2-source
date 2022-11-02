package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$4 extends TypeAdapter<Boolean> {
    TypeAdapters$4() {
        super();
    }
    
    @Override
    public Boolean read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return Boolean.valueOf(in.nextString());
    }
    
    @Override
    public void write(final JsonWriter out, final Boolean value) throws IOException {
        out.value((value == null) ? "null" : value.toString());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Boolean)o);
    }
}