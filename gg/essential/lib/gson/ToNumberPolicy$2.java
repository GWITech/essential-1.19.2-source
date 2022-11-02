package gg.essential.lib.gson;

import gg.essential.lib.gson.stream.*;
import gg.essential.lib.gson.internal.*;
import java.io.*;

enum ToNumberPolicy$2
{
    ToNumberPolicy$2(final String x0) {
    }
    
    @Override
    public Number readNumber(final JsonReader in) throws IOException {
        return new LazilyParsedNumber(in.nextString());
    }
}