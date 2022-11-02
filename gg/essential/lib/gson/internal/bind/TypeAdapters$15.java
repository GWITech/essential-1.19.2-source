package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$15 extends TypeAdapter<String> {
    TypeAdapters$15() {
        super();
    }
    
    @Override
    public String read(final JsonReader in) throws IOException {
        final JsonToken peek = in.peek();
        if (peek == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        if (peek == JsonToken.BOOLEAN) {
            return Boolean.toString(in.nextBoolean());
        }
        return in.nextString();
    }
    
    @Override
    public void write(final JsonWriter out, final String value) throws IOException {
        out.value(value);
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (String)o);
    }
}