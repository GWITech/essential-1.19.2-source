package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import gg.essential.lib.gson.internal.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$18 extends TypeAdapter<LazilyParsedNumber> {
    TypeAdapters$18() {
        super();
    }
    
    @Override
    public LazilyParsedNumber read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return new LazilyParsedNumber(in.nextString());
    }
    
    @Override
    public void write(final JsonWriter out, final LazilyParsedNumber value) throws IOException {
        out.value(value);
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (LazilyParsedNumber)o);
    }
}