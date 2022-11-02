package gg.essential.lib.gson.internal.bind;

import java.util.concurrent.atomic.*;
import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$8 extends TypeAdapter<AtomicInteger> {
    TypeAdapters$8() {
        super();
    }
    
    @Override
    public AtomicInteger read(final JsonReader in) throws IOException {
        try {
            return new AtomicInteger(in.nextInt());
        }
        catch (final NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }
    
    @Override
    public void write(final JsonWriter out, final AtomicInteger value) throws IOException {
        out.value(value.get());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (AtomicInteger)o);
    }
}