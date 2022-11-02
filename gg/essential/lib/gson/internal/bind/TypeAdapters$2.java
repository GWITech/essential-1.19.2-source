package gg.essential.lib.gson.internal.bind;

import java.util.*;
import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$2 extends TypeAdapter<BitSet> {
    TypeAdapters$2() {
        super();
    }
    
    @Override
    public BitSet read(final JsonReader in) throws IOException {
        final BitSet bitset = new BitSet();
        in.beginArray();
        int i = 0;
        for (JsonToken tokenType = in.peek(); tokenType != JsonToken.END_ARRAY; tokenType = in.peek()) {
            boolean set = false;
            switch (tokenType) {
                case NUMBER:
                case STRING: {
                    final int intValue = in.nextInt();
                    if (intValue == 0) {
                        set = false;
                        break;
                    }
                    if (intValue == 1) {
                        set = true;
                        break;
                    }
                    throw new JsonSyntaxException("Invalid bitset value " + intValue + ", expected 0 or 1; at path " + in.getPreviousPath());
                }
                case BOOLEAN: {
                    set = in.nextBoolean();
                    break;
                }
                default: {
                    throw new JsonSyntaxException("Invalid bitset value type: " + tokenType + "; at path " + in.getPath());
                }
            }
            if (set) {
                bitset.set(i);
            }
            ++i;
        }
        in.endArray();
        return bitset;
    }
    
    @Override
    public void write(final JsonWriter out, final BitSet src) throws IOException {
        out.beginArray();
        for (int i = 0, length = src.length(); i < length; ++i) {
            final int value = src.get(i) ? 1 : 0;
            out.value(value);
        }
        out.endArray();
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (BitSet)o);
    }
}