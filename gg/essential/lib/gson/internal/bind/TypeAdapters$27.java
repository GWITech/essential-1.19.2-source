package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.util.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$27 extends TypeAdapter<Locale> {
    TypeAdapters$27() {
        super();
    }
    
    @Override
    public Locale read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        final String locale = in.nextString();
        final StringTokenizer tokenizer = new StringTokenizer(locale, "_");
        String language = null;
        String country = null;
        String variant = null;
        if (tokenizer.hasMoreElements()) {
            language = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            country = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            variant = tokenizer.nextToken();
        }
        if (country == null && variant == null) {
            return new Locale(language);
        }
        if (variant == null) {
            return new Locale(language, country);
        }
        return new Locale(language, country, variant);
    }
    
    @Override
    public void write(final JsonWriter out, final Locale value) throws IOException {
        out.value((value == null) ? null : value.toString());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Locale)o);
    }
}