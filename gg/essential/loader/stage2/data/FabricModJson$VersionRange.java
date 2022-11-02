package gg.essential.loader.stage2.data;

import com.google.gson.*;
import java.util.*;
import java.io.*;
import com.google.gson.stream.*;

public static class VersionRange extends ArrayList<String>
{
    public VersionRange() {
        super();
    }
    
    public VersionRange(final String version) {
        super();
        this.add(version);
    }
    
    private static class JsonAdapter extends TypeAdapter<VersionRange>
    {
        private JsonAdapter() {
            super();
        }
        
        @Override
        public void write(final JsonWriter out, final VersionRange values) throws IOException {
            if (values.size() == 1) {
                out.value(values.get(0));
            }
            else {
                out.beginArray();
                for (final String value : values) {
                    out.value(value);
                }
                out.endArray();
            }
        }
        
        @Override
        public VersionRange read(final JsonReader in) throws IOException {
            final VersionRange values = new VersionRange();
            if (in.peek() != JsonToken.BEGIN_ARRAY) {
                values.add(in.nextString());
            }
            else {
                in.beginArray();
                while (in.peek() != JsonToken.END_ARRAY) {
                    values.add(in.nextString());
                }
                in.endArray();
            }
            return values;
        }
        
        @Override
        public /* bridge */ Object read(final JsonReader in) throws IOException {
            return this.read(in);
        }
        
        @Override
        public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
            this.write(out, (VersionRange)o);
        }
        
        JsonAdapter(final FabricModJson.FabricModJson$1 x0) {
            this();
        }
    }
}
