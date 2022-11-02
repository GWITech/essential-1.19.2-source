package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import gg.essential.lib.gson.annotations.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T>
{
    private final Map<String, T> nameToConstant;
    private final Map<T, String> constantToName;
    
    public EnumTypeAdapter(final Class<T> classOfT) {
        super();
        this.nameToConstant = new HashMap<String, T>();
        this.constantToName = new HashMap<T, String>();
        try {
            final Field[] array;
            final Field[] constantFields = array = AccessController.doPrivileged((PrivilegedAction<Field[]>)new PrivilegedAction<Field[]>() {
                final /* synthetic */ Class val$classOfT;
                
                TypeAdapters$EnumTypeAdapter$1() {
                    super();
                }
                
                @Override
                public Field[] run() {
                    final Field[] fields = classOfT.getDeclaredFields();
                    final ArrayList<Field> constantFieldsList = new ArrayList<Field>(fields.length);
                    for (final Field f : fields) {
                        if (f.isEnumConstant()) {
                            constantFieldsList.add(f);
                        }
                    }
                    final Field[] constantFields = constantFieldsList.toArray(new Field[0]);
                    AccessibleObject.setAccessible(constantFields, true);
                    return constantFields;
                }
                
                @Override
                public /* bridge */ Object run() {
                    return this.run();
                }
            });
            for (final Field constantField : array) {
                final T constant = (T)constantField.get(null);
                String name = constant.name();
                final SerializedName annotation = constantField.getAnnotation(SerializedName.class);
                if (annotation != null) {
                    name = annotation.value();
                    for (final String alternate : annotation.alternate()) {
                        this.nameToConstant.put(alternate, constant);
                    }
                }
                this.nameToConstant.put(name, constant);
                this.constantToName.put(constant, name);
            }
        }
        catch (final IllegalAccessException e) {
            throw new AssertionError((Object)e);
        }
    }
    
    @Override
    public T read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return this.nameToConstant.get(in.nextString());
    }
    
    @Override
    public void write(final JsonWriter out, final T value) throws IOException {
        out.value((value == null) ? null : this.constantToName.get(value));
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (T)o);
    }
}
