package gg.essential.lib.gson;

import gg.essential.lib.gson.stream.*;
import java.io.*;
import gg.essential.lib.gson.internal.*;

public final class JsonParser
{
    @Deprecated
    public JsonParser() {
        super();
    }
    
    public static JsonElement parseString(final String json) throws JsonSyntaxException {
        return parseReader(new StringReader(json));
    }
    
    public static JsonElement parseReader(final Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            final JsonReader jsonReader = new JsonReader(reader);
            final JsonElement element = parseReader(jsonReader);
            if (!element.isJsonNull() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return element;
        }
        catch (final MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        }
        catch (final IOException e2) {
            throw new JsonIOException(e2);
        }
        catch (final NumberFormatException e3) {
            throw new JsonSyntaxException(e3);
        }
    }
    
    public static JsonElement parseReader(final JsonReader reader) throws JsonIOException, JsonSyntaxException {
        final boolean lenient = reader.isLenient();
        reader.setLenient(true);
        try {
            return Streams.parse(reader);
        }
        catch (final StackOverflowError e) {
            throw new JsonParseException("Failed parsing JSON source: " + reader + " to Json", e);
        }
        catch (final OutOfMemoryError e2) {
            throw new JsonParseException("Failed parsing JSON source: " + reader + " to Json", e2);
        }
        finally {
            reader.setLenient(lenient);
        }
    }
    
    @Deprecated
    public JsonElement parse(final String json) throws JsonSyntaxException {
        return parseString(json);
    }
}
