package gg.essential.vigilance.impl.nightconfig.toml;

import java.time.temporal.*;
import gg.essential.vigilance.impl.nightconfig.core.*;
import gg.essential.vigilance.impl.nightconfig.core.io.*;
import java.util.*;

final class ValueWriter
{
    private static void writeString(final String string, final CharacterOutput output, final TomlWriter writer) {
        if (writer.writesLiteral(string)) {
            StringWriter.writeLiteral(string, output);
        }
        else {
            StringWriter.writeBasic(string, output);
        }
    }
    
    static void write(final Object value, final CharacterOutput output, final TomlWriter writer) {
        if (value instanceof Config) {
            TableWriter.writeInline((UnmodifiableConfig)value, output, writer);
        }
        else if (value instanceof List) {
            final List<?> list = (List<?>)value;
            if (!list.isEmpty() && list.get(0) instanceof Config) {
                for (final Object table : list) {
                    TableWriter.writeInline((UnmodifiableConfig)table, output, writer);
                }
            }
            else {
                ArrayWriter.write((List<?>)value, output, writer);
            }
        }
        else if (value instanceof CharSequence) {
            writeString(value.toString(), output, writer);
        }
        else if (value instanceof Enum) {
            writeString(((Enum)value).name(), output, writer);
        }
        else if (value instanceof Temporal) {
            TemporalWriter.write((Temporal)value, output);
        }
        else if (value instanceof Float || value instanceof Double) {
            final double d = ((Number)value).doubleValue();
            if (Double.isNaN(d)) {
                output.write("nan");
            }
            else if (d == Double.POSITIVE_INFINITY) {
                output.write("+inf");
            }
            else if (d == Double.NEGATIVE_INFINITY) {
                output.write("-inf");
            }
            else {
                output.write(value.toString());
            }
        }
        else if (value instanceof Number || value instanceof Boolean) {
            output.write(value.toString());
        }
        else {
            if (value == null || value == NullObject.NULL_OBJECT) {
                throw new WritingException("TOML doesn't support null values");
            }
            throw new WritingException("Unsupported value type: " + value.getClass());
        }
    }
    
    private ValueWriter() {
        super();
    }
}
