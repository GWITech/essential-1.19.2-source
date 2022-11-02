package gg.essential.lib.gson.internal.bind;

import java.security.*;
import java.util.*;
import java.lang.reflect.*;

class TypeAdapters$EnumTypeAdapter$1 implements PrivilegedAction<Field[]> {
    final /* synthetic */ Class val$classOfT;
    
    TypeAdapters$EnumTypeAdapter$1(final Class val$classOfT) {
        this.val$classOfT = val$classOfT;
        super();
    }
    
    @Override
    public Field[] run() {
        final Field[] fields = this.val$classOfT.getDeclaredFields();
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
}