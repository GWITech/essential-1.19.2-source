package gg.essential.lib.gson.internal;

import gg.essential.lib.gson.stream.*;
import java.io.*;

public abstract class JsonReaderInternalAccess
{
    public static JsonReaderInternalAccess INSTANCE;
    
    public JsonReaderInternalAccess() {
        super();
    }
    
    public abstract void promoteNameToValue(final JsonReader p0) throws IOException;
}
