package gg.essential.lib.gson;

import java.lang.reflect.*;

enum FieldNamingPolicy$2
{
    FieldNamingPolicy$2(final String x0) {
    }
    
    @Override
    public String translateName(final Field f) {
        return FieldNamingPolicy.upperCaseFirstLetter(f.getName());
    }
}