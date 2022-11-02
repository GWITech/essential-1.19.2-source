package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$6 extends TypeAdapter<Number> {
    TypeAdapters$6() {
        super();
    }
    
    @Override
    public Number read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        int intValue;
        try {
            intValue = in.nextInt();
        }
        catch (final NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
        if (intValue > 65535 || intValue < -32768) {
            throw new JsonSyntaxException("Lossy conversion from " + intValue + " to short; at path " + in.getPreviousPath());
        }
        return (short)intValue;
    }
    
    @Override
    public void write(final JsonWriter out, final Number value) throws IOException {
        out.value(value);
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Number)o);
    }
}