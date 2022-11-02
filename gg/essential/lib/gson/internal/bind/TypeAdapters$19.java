package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$19 extends TypeAdapter<StringBuilder> {
    TypeAdapters$19() {
        super();
    }
    
    @Override
    public StringBuilder read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return new StringBuilder(in.nextString());
    }
    
    @Override
    public void write(final JsonWriter out, final StringBuilder value) throws IOException {
        out.value((value == null) ? null : value.toString());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (StringBuilder)o);
    }
}