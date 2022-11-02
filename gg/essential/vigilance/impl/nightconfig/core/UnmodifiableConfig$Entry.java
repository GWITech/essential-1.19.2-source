package gg.essential.vigilance.impl.nightconfig.core;

import java.util.*;

public interface Entry
{
    String getKey();
    
     <T> T getRawValue();
    
    default <T> T getValue() {
        final Object raw = this.getRawValue();
        return (T)((raw == NullObject.NULL_OBJECT) ? null : raw);
    }
    
    default boolean isNull() {
        return this.getRawValue() == NullObject.NULL_OBJECT;
    }
    
    default <T> Optional<T> getOptional() {
        return Optional.ofNullable(this.getValue());
    }
    
    default <T> T getOrElse(final T defaultValue) {
        final T value = this.getRawValue();
        return (value == null || value == NullObject.NULL_OBJECT) ? defaultValue : value;
    }
    
    default int getInt() {
        return this.getRawValue().intValue();
    }
    
    default OptionalInt getOptionalInt() {
        final Number value = this.getRawValue();
        return (value == null) ? OptionalInt.empty() : OptionalInt.of(value.intValue());
    }
    
    default int getIntOrElse(final int defaultValue) {
        final Number value = this.getRawValue();
        return (value == null) ? defaultValue : value.intValue();
    }
    
    default long getLong() {
        return this.getRawValue().longValue();
    }
    
    default OptionalLong getOptionalLong() {
        final Number value = this.getRawValue();
        return (value == null) ? OptionalLong.empty() : OptionalLong.of(value.longValue());
    }
    
    default long getLongOrElse(final long defaultValue) {
        final Number value = this.getRawValue();
        return (value == null) ? defaultValue : value.longValue();
    }
    
    default byte getByte() {
        return this.getRawValue().byteValue();
    }
    
    default byte getByteOrElse(final byte defaultValue) {
        final Number value = this.getRawValue();
        return (value == null) ? defaultValue : value.byteValue();
    }
    
    default short getShort() {
        return this.getRawValue().shortValue();
    }
    
    default short getShortOrElse(final short defaultValue) {
        final Number value = this.getRawValue();
        return (value == null) ? defaultValue : value.shortValue();
    }
    
    default char getChar() {
        final Object value = this.getRawValue();
        if (value instanceof Number) {
            return (char)((Number)value).intValue();
        }
        if (value instanceof CharSequence) {
            return ((CharSequence)value).charAt(0);
        }
        return (char)value;
    }
    
    default char getCharOrElse(final char defaultValue) {
        final Object value = this.getRawValue();
        if (value == null) {
            return defaultValue;
        }
        if (value instanceof Number) {
            return (char)((Number)value).intValue();
        }
        if (value instanceof CharSequence) {
            return ((CharSequence)value).charAt(0);
        }
        return (char)value;
    }
}
