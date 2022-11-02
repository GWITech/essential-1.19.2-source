package gg.essential.vigilance.impl.nightconfig.toml;

import gg.essential.vigilance.impl.nightconfig.core.io.*;
import java.util.*;

final class ArrayWriter
{
    private static final char[] EMPTY_ARRAY;
    static final char[] ELEMENT_SEPARATOR;
    
    static void write(final List<?> values, final CharacterOutput output, final TomlWriter writer) {
        if (values.isEmpty()) {
            output.write(ArrayWriter.EMPTY_ARRAY);
            return;
        }
        output.write('[');
        final boolean indent = writer.writesIndented(values);
        if (indent) {
            writer.increaseIndentLevel();
        }
        final Iterator<?> iterator = values.iterator();
        boolean hasNext = iterator.hasNext();
        while (hasNext) {
            if (indent) {
                writer.writeNewline(output);
                writer.writeIndent(output);
            }
            final Object value = iterator.next();
            ValueWriter.write(value, output, writer);
            if (hasNext = iterator.hasNext()) {
                if (indent) {
                    output.write(',');
                }
                else {
                    output.write(ArrayWriter.ELEMENT_SEPARATOR);
                }
            }
        }
        if (indent) {
            writer.decreaseIndentLevel();
            writer.writeNewline(output);
        }
        output.write(']');
    }
    
    private ArrayWriter() {
        super();
    }
    
    static {
        EMPTY_ARRAY = new char[] { '[', ']' };
        ELEMENT_SEPARATOR = new char[] { ',', ' ' };
    }
}
