package gg.essential.lib.gson.internal;

import java.io.*;
import java.lang.reflect.*;

private static final class GenericArrayTypeImpl implements Serializable, GenericArrayType
{
    private final Type componentType;
    
    public GenericArrayTypeImpl(final Type componentType) {
        super();
        this.componentType = $Gson$Types.canonicalize(componentType);
    }
    
    @Override
    public Type getGenericComponentType() {
        return this.componentType;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof GenericArrayType && $Gson$Types.equals(this, (Type)o);
    }
    
    @Override
    public int hashCode() {
        return this.componentType.hashCode();
    }
    
    @Override
    public String toString() {
        return $Gson$Types.typeToString(this.componentType) + "[]";
    }
}
