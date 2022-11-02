package gg.essential.lib.okhttp3;

import java.util.*;
import gg.essential.lib.okhttp3.internal.*;

public static final class Builder
{
    final List<String> namesAndValues;
    
    public Builder() {
        super();
        this.namesAndValues = new ArrayList<String>(20);
    }
    
    Builder addLenient(final String line) {
        final int index = line.indexOf(":", 1);
        if (index != -1) {
            return this.addLenient(line.substring(0, index), line.substring(index + 1));
        }
        if (line.startsWith(":")) {
            return this.addLenient("", line.substring(1));
        }
        return this.addLenient("", line);
    }
    
    public Builder add(final String name, final String value) {
        this.checkNameAndValue(name, value);
        return this.addLenient(name, value);
    }
    
    Builder addLenient(final String name, final String value) {
        this.namesAndValues.add(name);
        this.namesAndValues.add(value.trim());
        return this;
    }
    
    public Builder removeAll(final String name) {
        for (int i = 0; i < this.namesAndValues.size(); i += 2) {
            if (name.equalsIgnoreCase(this.namesAndValues.get(i))) {
                this.namesAndValues.remove(i);
                this.namesAndValues.remove(i);
                i -= 2;
            }
        }
        return this;
    }
    
    public Builder set(final String name, final String value) {
        this.checkNameAndValue(name, value);
        this.removeAll(name);
        this.addLenient(name, value);
        return this;
    }
    
    private void checkNameAndValue(final String name, final String value) {
        if (name == null) {
            throw new NullPointerException("name == null");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        for (int i = 0, length = name.length(); i < length; ++i) {
            final char c = name.charAt(i);
            if (c <= ' ' || c >= '\u007f') {
                throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", (int)c, i, name));
            }
        }
        if (value == null) {
            throw new NullPointerException("value for name " + name + " == null");
        }
        for (int i = 0, length = value.length(); i < length; ++i) {
            final char c = value.charAt(i);
            if ((c <= '\u001f' && c != '\t') || c >= '\u007f') {
                throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", (int)c, i, name, value));
            }
        }
    }
    
    public Headers build() {
        return new Headers(this);
    }
}
