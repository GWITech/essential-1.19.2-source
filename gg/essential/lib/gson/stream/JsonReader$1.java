package gg.essential.lib.gson.stream;

import gg.essential.lib.gson.internal.*;
import gg.essential.lib.gson.internal.bind.*;
import java.io.*;

class JsonReader$1 extends JsonReaderInternalAccess {
    JsonReader$1() {
        super();
    }
    
    @Override
    public void promoteNameToValue(final JsonReader reader) throws IOException {
        if (reader instanceof JsonTreeReader) {
            ((JsonTreeReader)reader).promoteNameToValue();
            return;
        }
        int p = reader.peeked;
        if (p == 0) {
            p = reader.doPeek();
        }
        if (p == 13) {
            reader.peeked = 9;
        }
        else if (p == 12) {
            reader.peeked = 8;
        }
        else {
            if (p != 14) {
                throw new IllegalStateException("Expected a name but was " + reader.peek() + reader.locationString());
            }
            reader.peeked = 10;
        }
    }
}