package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$5 extends TypeAdapter<Number> {
    TypeAdapters$5() {
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
        if (intValue > 255 || intValue < -128) {
            throw new JsonSyntaxException("Lossy conversion from " + intValue + " to byte; at path " + in.getPreviousPath());
        }
        return (byte)intValue;
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