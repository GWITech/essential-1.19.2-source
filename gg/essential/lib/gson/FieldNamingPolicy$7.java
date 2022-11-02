package gg.essential.lib.gson;

import java.lang.reflect.*;
import java.util.*;

enum FieldNamingPolicy$7
{
    FieldNamingPolicy$7(final String x0) {
    }
    
    @Override
    public String translateName(final Field f) {
        return FieldNamingPolicy.separateCamelCase(f.getName(), '.').toLowerCase(Locale.ENGLISH);
    }
}