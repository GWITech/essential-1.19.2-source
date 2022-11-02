package gg.essential.vigilance.impl.nightconfig.toml;

import java.io.*;
import gg.essential.vigilance.impl.nightconfig.core.*;
import java.util.*;
import gg.essential.vigilance.impl.nightconfig.core.io.*;

public final class TomlParser implements ConfigParser<CommentedConfig>
{
    private int initialStringBuilderCapacity;
    private int initialListCapacity;
    private boolean lenientBareKeys;
    private boolean lenientSeparators;
    private boolean configWasEmpty;
    private ParsingMode parsingMode;
    private String currentComment;
    
    public TomlParser() {
        super();
        this.initialStringBuilderCapacity = 16;
        this.initialListCapacity = 10;
        this.lenientBareKeys = false;
        this.lenientSeparators = false;
        this.configWasEmpty = false;
    }
    
    @Override
    public CommentedConfig parse(final Reader reader) {
        this.configWasEmpty = true;
        return this.parse((CharacterInput)new ReaderInput(reader), TomlFormat.instance().createConfig(), ParsingMode.MERGE);
    }
    
    @Override
    public void parse(final Reader reader, final Config destination, final ParsingMode parsingMode) {
        if (parsingMode == ParsingMode.REPLACE) {
            this.configWasEmpty = true;
        }
        this.parse((CharacterInput)new ReaderInput(reader), destination, parsingMode);
    }
    
    private <T extends Config> T parse(final CharacterInput input, final T destination, final ParsingMode parsingMode) {
        (this.parsingMode = parsingMode).prepareParsing(destination);
        final CommentedConfig commentedConfig = CommentedConfig.fake(destination);
        final CommentedConfig rootTable = TableParser.parseNormal(input, this, commentedConfig);
        int next;
        while ((next = input.peek()) != -1) {
            final boolean isArray = next == 91;
            if (isArray) {
                input.skipPeeks();
            }
            final List<String> path = TableParser.parseTableName(input, this, isArray);
            final int lastIndex = path.size() - 1;
            final String lastKey = path.get(lastIndex);
            final List<String> parentPath = path.subList(0, lastIndex);
            final Config parentConfig = this.getSubTable(rootTable, parentPath);
            final Map<String, Object> parentMap = (parentConfig != null) ? parentConfig.valueMap() : null;
            if (this.hasPendingComment()) {
                final String comment = this.consumeComment();
                if (parentConfig instanceof CommentedConfig) {
                    final List<String> lastPath = Collections.singletonList(lastKey);
                    ((CommentedConfig)parentConfig).setComment(lastPath, comment);
                }
            }
            if (isArray) {
                if (parentMap == null) {
                    throw new ParsingException("Cannot create entry " + path + " because of an invalid parent that isn't a table.");
                }
                final CommentedConfig table = TableParser.parseNormal(input, this);
                List<CommentedConfig> arrayOfTables = parentMap.get(lastKey);
                if (arrayOfTables == null) {
                    arrayOfTables = this.createList();
                    parentMap.put(lastKey, arrayOfTables);
                }
                arrayOfTables.add(table);
            }
            else {
                if (parentMap == null) {
                    throw new ParsingException("Cannot create entry " + path + " because of an invalid parent that isn't a table.");
                }
                final Object alreadyDeclared = parentMap.get(lastKey);
                if (alreadyDeclared == null) {
                    final CommentedConfig table2 = TableParser.parseNormal(input, this);
                    parentMap.put(lastKey, table2);
                }
                else if (alreadyDeclared instanceof Config) {
                    final Config table3 = (Config)alreadyDeclared;
                    this.checkContainsOnlySubtables(table3, path);
                    final CommentedConfig commentedTable = CommentedConfig.fake(table3);
                    TableParser.parseNormal(input, this, commentedTable);
                }
                else {
                    if (this.configWasEmpty) {
                        throw new ParsingException("Entry " + path + " has been defined twice.");
                    }
                    continue;
                }
            }
        }
        return destination;
    }
    
    private Config getSubTable(final Config parentTable, final List<String> path) {
        if (path.isEmpty()) {
            return parentTable;
        }
        Config currentConfig = parentTable;
        for (final String key : path) {
            final Object value = currentConfig.valueMap().get(key);
            if (value == null) {
                final Config sub = ((ConfigFormat<Config>)TomlFormat.instance()).createConfig();
                currentConfig.valueMap().put(key, sub);
                currentConfig = sub;
            }
            else if (value instanceof Config) {
                currentConfig = (Config)value;
            }
            else {
                if (!(value instanceof List)) {
                    return null;
                }
                final List<?> list = (List<?>)value;
                if (list.isEmpty() || !(list.get(0) instanceof Config)) {
                    return null;
                }
                final int lastIndex = list.size() - 1;
                currentConfig = (Config)list.get(lastIndex);
            }
        }
        return currentConfig;
    }
    
    private void checkContainsOnlySubtables(final Config table, final List<String> path) {
        for (final Object value : table.valueMap().values()) {
            if (!(value instanceof Config)) {
                throw new ParsingException("Table with path " + path + " has been declared twice.");
            }
        }
    }
    
    public boolean isLenientWithSeparators() {
        return this.lenientSeparators;
    }
    
    public TomlParser setLenientWithSeparators(final boolean lenientSeparators) {
        this.lenientSeparators = lenientSeparators;
        return this;
    }
    
    public boolean isLenientWithBareKeys() {
        return this.lenientBareKeys;
    }
    
    public TomlParser setLenientWithBareKeys(final boolean lenientBareKeys) {
        this.lenientBareKeys = lenientBareKeys;
        return this;
    }
    
    public TomlParser setInitialStringBuilderCapacity(final int initialStringBuilderCapacity) {
        this.initialStringBuilderCapacity = initialStringBuilderCapacity;
        return this;
    }
    
    public TomlParser setInitialListCapacity(final int initialListCapacity) {
        this.initialListCapacity = initialListCapacity;
        return this;
    }
    
    @Override
    public ConfigFormat<CommentedConfig> getFormat() {
        return TomlFormat.instance();
    }
    
    boolean configWasEmpty() {
        return this.configWasEmpty;
    }
    
    ParsingMode getParsingMode() {
        return this.parsingMode;
    }
    
     <T> List<T> createList() {
        return new ArrayList<T>(this.initialListCapacity);
    }
    
    CharsWrapper.Builder createBuilder() {
        return new CharsWrapper.Builder(this.initialStringBuilderCapacity);
    }
    
    boolean hasPendingComment() {
        return this.currentComment != null;
    }
    
    String consumeComment() {
        final String comment = this.currentComment;
        this.currentComment = null;
        return comment;
    }
    
    void setComment(final CharsWrapper comment) {
        if (comment != null) {
            if (this.currentComment == null) {
                this.currentComment = comment.toString();
            }
            else {
                this.currentComment = this.currentComment + '\n' + comment.toString();
            }
        }
    }
    
    void setComment(final List<CharsWrapper> commentsList) {
        final CharsWrapper.Builder builder = new CharsWrapper.Builder(32);
        if (!commentsList.isEmpty()) {
            final Iterator<CharsWrapper> it = commentsList.iterator();
            builder.append(it.next());
            while (it.hasNext()) {
                builder.append('\n');
                builder.append(it.next());
            }
            this.setComment(builder.build());
        }
    }
    
    @Override
    public /* bridge */ Config parse(final Reader reader) {
        return this.parse(reader);
    }
}
