package gg.essential.lib.gson;

import java.lang.reflect.*;
import java.util.*;

public enum FieldNamingPolicy implements FieldNamingStrategy
{
    IDENTITY {
        FieldNamingPolicy$1(final String x0) {
        }
        
        @Override
        public String translateName(final Field f) {
            return f.getName();
        }
    }, 
    UPPER_CAMEL_CASE {
        FieldNamingPolicy$2(final String x0) {
        }
        
        @Override
        public String translateName(final Field f) {
            return FieldNamingPolicy.upperCaseFirstLetter(f.getName());
        }
    }, 
    UPPER_CAMEL_CASE_WITH_SPACES {
        FieldNamingPolicy$3(final String x0) {
        }
        
        @Override
        public String translateName(final Field f) {
            return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(f.getName(), ' '));
        }
    }, 
    UPPER_CASE_WITH_UNDERSCORES {
        FieldNamingPolicy$4(final String x0) {
        }
        
        @Override
        public String translateName(final Field f) {
            return FieldNamingPolicy.separateCamelCase(f.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    }, 
    LOWER_CASE_WITH_UNDERSCORES {
        FieldNamingPolicy$5(final String x0) {
        }
        
        @Override
        public String translateName(final Field f) {
            return FieldNamingPolicy.separateCamelCase(f.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    }, 
    LOWER_CASE_WITH_DASHES {
        FieldNamingPolicy$6(final String x0) {
        }
        
        @Override
        public String translateName(final Field f) {
            return FieldNamingPolicy.separateCamelCase(f.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    }, 
    LOWER_CASE_WITH_DOTS {
        FieldNamingPolicy$7(final String x0) {
        }
        
        @Override
        public String translateName(final Field f) {
            return FieldNamingPolicy.separateCamelCase(f.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };
    
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES;
    
    public static FieldNamingPolicy[] values() {
        return FieldNamingPolicy.$VALUES.clone();
    }
    
    public static FieldNamingPolicy valueOf(final String name) {
        return Enum.valueOf(FieldNamingPolicy.class, name);
    }
    
    static String separateCamelCase(final String name, final char separator) {
        final StringBuilder translation = new StringBuilder();
        for (int i = 0, length = name.length(); i < length; ++i) {
            final char character = name.charAt(i);
            if (Character.isUpperCase(character) && translation.length() != 0) {
                translation.append(separator);
            }
            translation.append(character);
        }
        return translation.toString();
    }
    
    static String upperCaseFirstLetter(final String s) {
        final int length = s.length();
        int i = 0;
        while (i < length) {
            final char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    return s;
                }
                final char uppercased = Character.toUpperCase(c);
                if (i == 0) {
                    return uppercased + s.substring(1);
                }
                return s.substring(0, i) + uppercased + s.substring(i + 1);
            }
            else {
                ++i;
            }
        }
        return s;
    }
    
    FieldNamingPolicy(final String x0, final int x1, final byte b) {
        this();
    }
    
    static {
        $VALUES = new FieldNamingPolicy[] { FieldNamingPolicy.IDENTITY, FieldNamingPolicy.UPPER_CAMEL_CASE, FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES, FieldNamingPolicy.UPPER_CASE_WITH_UNDERSCORES, FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES, FieldNamingPolicy.LOWER_CASE_WITH_DASHES, FieldNamingPolicy.LOWER_CASE_WITH_DOTS };
    }
}
