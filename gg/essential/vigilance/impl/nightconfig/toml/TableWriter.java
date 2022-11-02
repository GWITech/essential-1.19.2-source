package gg.essential.vigilance.impl.nightconfig.toml;

import java.util.*;
import gg.essential.vigilance.impl.nightconfig.core.*;
import gg.essential.vigilance.impl.nightconfig.core.io.*;

final class TableWriter
{
    private static final char[] KEY_VALUE_SEPARATOR;
    private static final char[] INLINE_ENTRY_SEPARATOR;
    private static final char[] ARRAY_OF_TABLES_NAME_BEGIN;
    private static final char[] ARRAY_OF_TABLES_NAME_END;
    private static final char[] TABLE_NAME_BEGIN;
    private static final char[] TABLE_NAME_END;
    
    static void writeInline(final UnmodifiableConfig config, final CharacterOutput output, final TomlWriter writer) {
        output.write('{');
        for (final Map.Entry<String, Object> entry : config.valueMap().entrySet()) {
            final String key = entry.getKey();
            final Object value = entry.getValue();
            writer.writeKey(key, output);
            output.write(TableWriter.KEY_VALUE_SEPARATOR);
            ValueWriter.write(value, output, writer);
            output.write(TableWriter.INLINE_ENTRY_SEPARATOR);
        }
        output.write('}');
    }
    
    static void writeNormal(final UnmodifiableConfig config, final List<String> configPath, final CharacterOutput output, final TomlWriter writer) {
        final UnmodifiableCommentedConfig commentedConfig = UnmodifiableCommentedConfig.fake(config);
        writeNormal(commentedConfig, configPath, output, writer);
    }
    
    private static void writeNormal(final UnmodifiableCommentedConfig config, final List<String> configPath, final CharacterOutput output, final TomlWriter writer) {
        final List<UnmodifiableCommentedConfig.Entry> tablesEntries = new ArrayList<UnmodifiableCommentedConfig.Entry>();
        final List<UnmodifiableCommentedConfig.Entry> tableArraysEntries = new ArrayList<UnmodifiableCommentedConfig.Entry>();
        writer.increaseIndentLevel();
        for (final UnmodifiableCommentedConfig.Entry entry : config.entrySet()) {
            final String key = entry.getKey();
            final Object value = entry.getValue();
            final String comment = entry.getComment();
            if (value instanceof UnmodifiableConfig && !writer.writesInline((UnmodifiableConfig)value)) {
                tablesEntries.add(entry);
            }
            else {
                if (value instanceof List) {
                    final List<?> list = (List<?>)value;
                    if (!list.isEmpty() && list.get(0) instanceof UnmodifiableConfig) {
                        tableArraysEntries.add(entry);
                        continue;
                    }
                }
                writer.writeComment(comment, output);
                writer.writeIndent(output);
                writer.writeKey(key, output);
                output.write(TableWriter.KEY_VALUE_SEPARATOR);
                ValueWriter.write(value, output, writer);
                writer.writeNewline(output);
            }
        }
        writer.writeNewline(output);
        for (final UnmodifiableCommentedConfig.Entry entry : tablesEntries) {
            writer.writeComment(entry.getComment(), output);
            configPath.add(entry.getKey());
            writeTableName(configPath, output, writer);
            writer.writeNewline(output);
            writeNormal(entry.getValue(), configPath, output, writer);
            configPath.remove(configPath.size() - 1);
        }
        for (final UnmodifiableCommentedConfig.Entry entry : tableArraysEntries) {
            writer.writeComment(entry.getComment(), output);
            configPath.add(entry.getKey());
            final List<Config> tableArray = entry.getValue();
            for (final UnmodifiableConfig table : tableArray) {
                writeTableArrayName(configPath, output, writer);
                writer.writeNewline(output);
                writeNormal(table, configPath, output, writer);
            }
            configPath.remove(configPath.size() - 1);
        }
        writer.decreaseIndentLevel();
    }
    
    private static void writeTableArrayName(final List<String> name, final CharacterOutput output, final TomlWriter writer) {
        writeTableName(name, output, writer, TableWriter.ARRAY_OF_TABLES_NAME_BEGIN, TableWriter.ARRAY_OF_TABLES_NAME_END);
    }
    
    private static void writeTableName(final List<String> name, final CharacterOutput output, final TomlWriter writer) {
        writeTableName(name, output, writer, TableWriter.TABLE_NAME_BEGIN, TableWriter.TABLE_NAME_END);
    }
    
    private static void writeTableName(final List<String> name, final CharacterOutput output, final TomlWriter writer, final char[] begin, final char[] end) {
        if (name.isEmpty()) {
            throw new WritingException("Invalid empty table name.");
        }
        writer.writeIndent(output);
        output.write(begin);
        final Iterator<String> it = name.iterator();
        writer.writeKey(it.next(), output);
        while (it.hasNext()) {
            output.write('.');
            writer.writeKey(it.next(), output);
        }
        output.write(end);
    }
    
    private TableWriter() {
        super();
    }
    
    static {
        KEY_VALUE_SEPARATOR = new char[] { ' ', '=', ' ' };
        INLINE_ENTRY_SEPARATOR = ArrayWriter.ELEMENT_SEPARATOR;
        ARRAY_OF_TABLES_NAME_BEGIN = new char[] { '[', '[' };
        ARRAY_OF_TABLES_NAME_END = new char[] { ']', ']' };
        TABLE_NAME_BEGIN = new char[] { '[' };
        TABLE_NAME_END = new char[] { ']' };
    }
}
