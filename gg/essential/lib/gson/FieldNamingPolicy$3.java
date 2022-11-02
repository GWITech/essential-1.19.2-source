package gg.essential.lib.gson;

import java.lang.reflect.*;

enum FieldNamingPolicy$3
{
    FieldNamingPolicy$3(final String x0) {
    }
    
    @Override
    public String translateName(final Field f) {
        return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(f.getName(), ' '));
    }
}