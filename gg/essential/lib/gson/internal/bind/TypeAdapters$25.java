package gg.essential.lib.gson.internal.bind;

import java.util.*;
import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$25 extends TypeAdapter<Currency> {
    TypeAdapters$25() {
        super();
    }
    
    @Override
    public Currency read(final JsonReader in) throws IOException {
        final String s = in.nextString();
        try {
            return Currency.getInstance(s);
        }
        catch (final IllegalArgumentException e) {
            throw new JsonSyntaxException("Failed parsing '" + s + "' as Currency; at path " + in.getPreviousPath(), e);
        }
    }
    
    @Override
    public void write(final JsonWriter out, final Currency value) throws IOException {
        out.value(value.getCurrencyCode());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Currency)o);
    }
}