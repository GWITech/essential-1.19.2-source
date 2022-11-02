package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$14 extends TypeAdapter<Character> {
    TypeAdapters$14() {
        super();
    }
    
    @Override
    public Character read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        final String str = in.nextString();
        if (str.length() != 1) {
            throw new JsonSyntaxException("Expecting character, got: " + str + "; at " + in.getPreviousPath());
        }
        return str.charAt(0);
    }
    
    @Override
    public void write(final JsonWriter out, final Character value) throws IOException {
        out.value((value == null) ? null : String.valueOf(value));
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Character)o);
    }
}