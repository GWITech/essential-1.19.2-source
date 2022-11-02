package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.net.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$23 extends TypeAdapter<InetAddress> {
    TypeAdapters$23() {
        super();
    }
    
    @Override
    public InetAddress read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return InetAddress.getByName(in.nextString());
    }
    
    @Override
    public void write(final JsonWriter out, final InetAddress value) throws IOException {
        out.value((value == null) ? null : value.getHostAddress());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (InetAddress)o);
    }
}