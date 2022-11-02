package gg.essential.vigilance.impl.nightconfig.toml;

import java.util.function.*;
import gg.essential.vigilance.impl.nightconfig.core.*;
import java.io.*;
import gg.essential.vigilance.impl.nightconfig.core.io.*;
import gg.essential.vigilance.impl.nightconfig.core.utils.*;
import java.util.*;

public final class TomlWriter implements ConfigWriter
{
    private boolean lenientBareKeys;
    private Predicate<UnmodifiableConfig> writeTableInlinePredicate;
    private Predicate<String> writeStringLiteralPredicate;
    private Predicate<List<?>> indentArrayElementsPredicate;
    private char[] indent;
    private char[] newline;
    private int currentIndentLevel;
    
    public TomlWriter() {
        super();
        this.lenientBareKeys = false;
        this.writeTableInlinePredicate = UnmodifiableConfig::isEmpty;
        this.writeStringLiteralPredicate = (c -> false);
        this.indentArrayElementsPredicate = (c -> false);
        this.indent = IndentStyle.TABS.chars;
        this.newline = NewlineStyle.system().chars;
    }
    
    @Override
    public void write(final UnmodifiableConfig config, final Writer writer) {
        this.currentIndentLevel = -1;
        final CharacterOutput output = new WriterOutput(writer);
        TableWriter.writeNormal(config, new ArrayList<String>(), output, this);
    }
    
    public boolean isLenientWithBareKeys() {
        return this.lenientBareKeys;
    }
    
    public void setLenientWithBareKeys(final boolean lenientBareKeys) {
        this.lenientBareKeys = lenientBareKeys;
    }
    
    public void setWriteTableInlinePredicate(final Predicate<UnmodifiableConfig> writeTableInlinePredicate) {
        this.writeTableInlinePredicate = writeTableInlinePredicate;
    }
    
    public void setWriteStringLiteralPredicate(final Predicate<String> writeStringLiteralPredicate) {
        this.writeStringLiteralPredicate = writeStringLiteralPredicate;
    }
    
    public void setIndentArrayElementsPredicate(final Predicate<List<?>> indentArrayElementsPredicate) {
        this.indentArrayElementsPredicate = indentArrayElementsPredicate;
    }
    
    public void setIndent(final IndentStyle indentStyle) {
        this.indent = indentStyle.chars;
    }
    
    public void setIndent(final String indentString) {
        this.indent = indentString.toCharArray();
    }
    
    public void setNewline(final NewlineStyle newlineStyle) {
        this.newline = newlineStyle.chars;
    }
    
    public void setNewline(final String newlineString) {
        this.newline = newlineString.toCharArray();
    }
    
    void increaseIndentLevel() {
        ++this.currentIndentLevel;
    }
    
    void decreaseIndentLevel() {
        --this.currentIndentLevel;
    }
    
    void writeIndent(final CharacterOutput output) {
        for (int i = 0; i < this.currentIndentLevel; ++i) {
            output.write(this.indent);
        }
    }
    
    void writeNewline(final CharacterOutput output) {
        output.write(this.newline);
    }
    
    void writeComment(final String commentString, final CharacterOutput output) {
        final List<String> comments = StringUtils.splitLines(commentString);
        for (final String comment : comments) {
            this.writeIndent(output);
            output.write('#');
            output.write(comment);
            output.write(this.newline);
        }
    }
    
    void writeKey(final String key, final CharacterOutput output) {
        if (Toml.isValidBareKey(key, this.lenientBareKeys)) {
            output.write(key);
        }
        else if (this.writeStringLiteralPredicate.test(key)) {
            StringWriter.writeLiteral(key, output);
        }
        else {
            StringWriter.writeBasic(key, output);
        }
    }
    
    boolean writesInline(final UnmodifiableConfig config) {
        return this.writeTableInlinePredicate.test(config);
    }
    
    boolean writesLiteral(final String string) {
        return this.writeStringLiteralPredicate.test(string);
    }
    
    boolean writesIndented(final List<?> list) {
        return this.indentArrayElementsPredicate.test(list);
    }
    
    private static /* synthetic */ boolean lambda$new$1(final List c) {
        return false;
    }
    
    private static /* synthetic */ boolean lambda$new$0(final String c) {
        return false;
    }
}
