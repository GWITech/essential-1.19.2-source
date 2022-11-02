package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.net.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$22 extends TypeAdapter<URI> {
    TypeAdapters$22() {
        super();
    }
    
    @Override
    public URI read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        try {
            final String nextString = in.nextString();
            return "null".equals(nextString) ? null : new URI(nextString);
        }
        catch (final URISyntaxException e) {
            throw new JsonIOException(e);
        }
    }
    
    @Override
    public void write(final JsonWriter out, final URI value) throws IOException {
        out.value((value == null) ? null : value.toASCIIString());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (URI)o);
    }
}