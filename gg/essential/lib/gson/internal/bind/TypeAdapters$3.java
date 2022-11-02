package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$3 extends TypeAdapter<Boolean> {
    TypeAdapters$3() {
        super();
    }
    
    @Override
    public Boolean read(final JsonReader in) throws IOException {
        final JsonToken peek = in.peek();
        if (peek == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        if (peek == JsonToken.STRING) {
            return Boolean.parseBoolean(in.nextString());
        }
        return in.nextBoolean();
    }
    
    @Override
    public void write(final JsonWriter out, final Boolean value) throws IOException {
        out.value(value);
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