package gg.essential.lib.gson.internal.bind;

import java.util.*;
import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$24 extends TypeAdapter<UUID> {
    TypeAdapters$24() {
        super();
    }
    
    @Override
    public UUID read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        final String s = in.nextString();
        try {
            return java.util.UUID.fromString(s);
        }
        catch (final IllegalArgumentException e) {
            throw new JsonSyntaxException("Failed parsing '" + s + "' as UUID; at path " + in.getPreviousPath(), e);
        }
    }
    
    @Override
    public void write(final JsonWriter out, final UUID value) throws IOException {
        out.value((value == null) ? null : value.toString());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (UUID)o);
    }
}