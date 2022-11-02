package gg.essential.lib.gson;

import java.lang.reflect.*;
import java.util.*;

enum FieldNamingPolicy$5
{
    FieldNamingPolicy$5(final String x0) {
    }
    
    @Override
    public String translateName(final Field f) {
        return FieldNamingPolicy.separateCamelCase(f.getName(), '_').toLowerCase(Locale.ENGLISH);
    }
}