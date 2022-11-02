package gg.essential.lib.gson;

import gg.essential.lib.gson.stream.*;
import java.io.*;

enum ToNumberPolicy$1
{
    ToNumberPolicy$1(final String x0) {
    }
    
    @Override
    public Double readNumber(final JsonReader in) throws IOException {
        return in.nextDouble();
    }
    
    @Override
    public /* bridge */ Number readNumber(final JsonReader in) throws IOException {
        return this.readNumber(in);
    }
}