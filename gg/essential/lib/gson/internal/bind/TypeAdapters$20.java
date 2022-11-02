package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$20 extends TypeAdapter<StringBuffer> {
    TypeAdapters$20() {
        super();
    }
    
    @Override
    public StringBuffer read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return new StringBuffer(in.nextString());
    }
    
    @Override
    public void write(final JsonWriter out, final StringBuffer value) throws IOException {
        out.value((value == null) ? null : value.toString());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (StringBuffer)o);
    }
}