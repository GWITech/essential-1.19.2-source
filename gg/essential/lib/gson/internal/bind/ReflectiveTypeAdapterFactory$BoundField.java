package gg.essential.lib.gson.internal.bind;

import java.io.*;
import gg.essential.lib.gson.stream.*;

abstract static class BoundField
{
    final String name;
    final boolean serialized;
    final boolean deserialized;
    
    protected BoundField(final String name, final boolean serialized, final boolean deserialized) {
        super();
        this.name = name;
        this.serialized = serialized;
        this.deserialized = deserialized;
    }
    
    abstract boolean writeField(final Object p0) throws IOException, IllegalAccessException;
    
    abstract void write(final JsonWriter p0, final Object p1) throws IOException, IllegalAccessException;
    
    abstract void read(final JsonReader p0, final Object p1) throws IOException, IllegalAccessException;
}
