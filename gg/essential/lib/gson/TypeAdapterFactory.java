package gg.essential.lib.gson;

import gg.essential.lib.gson.reflect.*;

public interface TypeAdapterFactory
{
     <T> TypeAdapter<T> create(final Gson p0, final TypeToken<T> p1);
}
