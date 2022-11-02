package gg.essential.lib.gson;

import java.lang.reflect.*;

enum FieldNamingPolicy$1
{
    FieldNamingPolicy$1(final String x0) {
    }
    
    @Override
    public String translateName(final Field f) {
        return f.getName();
    }
}