package gg.essential.lib.gson.internal.bind;

import java.math.*;
import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$16 extends TypeAdapter<BigDecimal> {
    TypeAdapters$16() {
        super();
    }
    
    @Override
    public BigDecimal read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        final String s = in.nextString();
        try {
            return new BigDecimal(s);
        }
        catch (final NumberFormatException e) {
            throw new JsonSyntaxException("Failed parsing '" + s + "' as BigDecimal; at path " + in.getPreviousPath(), e);
        }
    }
    
    @Override
    public void write(final JsonWriter out, final BigDecimal value) throws IOException {
        out.value(value);
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (BigDecimal)o);
    }
}