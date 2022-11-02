package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.net.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$21 extends TypeAdapter<URL> {
    TypeAdapters$21() {
        super();
    }
    
    @Override
    public URL read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        final String nextString = in.nextString();
        return "null".equals(nextString) ? null : new URL(nextString);
    }
    
    @Override
    public void write(final JsonWriter out, final URL value) throws IOException {
        out.value((value == null) ? null : value.toExternalForm());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (URL)o);
    }
}