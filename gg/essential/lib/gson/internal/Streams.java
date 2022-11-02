package gg.essential.lib.gson.internal;

import gg.essential.lib.gson.internal.bind.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.stream.*;
import java.io.*;

public final class Streams
{
    public static JsonElement parse(final JsonReader reader) throws JsonParseException {
        boolean isEmpty = true;
        try {
            reader.peek();
            isEmpty = false;
            return TypeAdapters.JSON_ELEMENT.read(reader);
        }
        catch (final EOFException e) {
            if (isEmpty) {
                return JsonNull.INSTANCE;
            }
            throw new JsonSyntaxException(e);
        }
        catch (final MalformedJsonException e2) {
            throw new JsonSyntaxException(e2);
        }
        catch (final IOException e3) {
            throw new JsonIOException(e3);
        }
        catch (final NumberFormatException e4) {
            throw new JsonSyntaxException(e4);
        }
    }
    
    public static void write(final JsonElement element, final JsonWriter writer) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(writer, element);
    }
    
    public static Writer writerForAppendable(final Appendable appendable) {
        return (appendable instanceof Writer) ? ((Writer)appendable) : new AppendableWriter(appendable);
    }
    
    private static final class AppendableWriter extends Writer
    {
        private final Appendable appendable;
        private final AppendableWriter.CurrentWrite currentWrite;
        
        AppendableWriter(final Appendable appendable) {
            super();
            this.currentWrite = new AppendableWriter.CurrentWrite();
            this.appendable = appendable;
        }
        
        @Override
        public void write(final char[] chars, final int offset, final int length) throws IOException {
            this.currentWrite.chars = chars;
            this.appendable.append((CharSequence)this.currentWrite, offset, offset + length);
        }
        
        @Override
        public void write(final int i) throws IOException {
            this.appendable.append((char)i);
        }
        
        @Override
        public void flush() {
        }
        
        @Override
        public void close() {
        }
    }
}
