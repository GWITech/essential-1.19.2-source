package gg.essential.lib.gson.internal.bind;

import java.util.concurrent.atomic.*;
import gg.essential.lib.gson.*;
import java.util.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$10 extends TypeAdapter<AtomicIntegerArray> {
    TypeAdapters$10() {
        super();
    }
    
    @Override
    public AtomicIntegerArray read(final JsonReader in) throws IOException {
        final List<Integer> list = new ArrayList<Integer>();
        in.beginArray();
        while (in.hasNext()) {
            try {
                final int integer = in.nextInt();
                list.add(integer);
                continue;
            }
            catch (final NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
            break;
        }
        in.endArray();
        final int length = list.size();
        final AtomicIntegerArray array = new AtomicIntegerArray(length);
        for (int i = 0; i < length; ++i) {
            array.set(i, list.get(i));
        }
        return array;
    }
    
    @Override
    public void write(final JsonWriter out, final AtomicIntegerArray value) throws IOException {
        out.beginArray();
        for (int i = 0, length = value.length(); i < length; ++i) {
            out.value(value.get(i));
        }
        out.endArray();
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (AtomicIntegerArray)o);
    }
}