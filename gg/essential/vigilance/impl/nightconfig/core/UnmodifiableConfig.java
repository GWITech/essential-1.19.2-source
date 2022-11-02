package gg.essential.vigilance.impl.nightconfig.core;

import gg.essential.vigilance.impl.nightconfig.core.utils.*;
import java.util.function.*;
import java.util.*;

public interface UnmodifiableConfig
{
    default <T> T get(final String path) {
        return this.get(StringUtils.split(path, '.'));
    }
    
    default <T> T get(final List<String> path) {
        final Object raw = this.getRaw(path);
        return (T)((raw == NullObject.NULL_OBJECT) ? null : raw);
    }
    
    default <T> T getRaw(final String path) {
        return this.getRaw(StringUtils.split(path, '.'));
    }
    
     <T> T getRaw(final List<String> p0);
    
    default <T> Optional<T> getOptional(final String path) {
        return this.getOptional(StringUtils.split(path, '.'));
    }
    
    default <T> Optional<T> getOptional(final List<String> path) {
        return Optional.ofNullable(this.get(path));
    }
    
    default <T> T getOrElse(final String path, final T defaultValue) {
        return this.getOrElse(StringUtils.split(path, '.'), defaultValue);
    }
    
    default <T> T getOrElse(final List<String> path, final T defaultValue) {
        final T value = this.getRaw(path);
        return (value == null || value == NullObject.NULL_OBJECT) ? defaultValue : value;
    }
    
    default <T> T getOrElse(final List<String> path, final Supplier<T> defaultValueSupplier) {
        final T value = this.getRaw(path);
        return (value == null || value == NullObject.NULL_OBJECT) ? defaultValueSupplier.get() : value;
    }
    
    default <T> T getOrElse(final String path, final Supplier<T> defaultValueSupplier) {
        return this.getOrElse(StringUtils.split(path, '.'), defaultValueSupplier);
    }
    
    default <T extends Enum<T>> T getEnum(final String path, final Class<T> enumType, final EnumGetMethod method) {
        return this.getEnum(StringUtils.split(path, '.'), enumType, method);
    }
    
    default <T extends Enum<T>> T getEnum(final String path, final Class<T> enumType) {
        return this.getEnum(StringUtils.split(path, '.'), enumType, EnumGetMethod.NAME_IGNORECASE);
    }
    
    default <T extends Enum<T>> T getEnum(final List<String> path, final Class<T> enumType, final EnumGetMethod method) {
        final Object value = this.getRaw(path);
        return (T)method.get(value, (Class)enumType);
    }
    
    default <T extends Enum<T>> T getEnum(final List<String> path, final Class<T> enumType) {
        return this.getEnum(path, enumType, EnumGetMethod.NAME_IGNORECASE);
    }
    
    default <T extends Enum<T>> Optional<T> getOptionalEnum(final String path, final Class<T> enumType, final EnumGetMethod method) {
        return this.getOptionalEnum(StringUtils.split(path, '.'), enumType, method);
    }
    
    default <T extends Enum<T>> Optional<T> getOptionalEnum(final String path, final Class<T> enumType) {
        return this.getOptionalEnum(path, enumType, EnumGetMethod.NAME_IGNORECASE);
    }
    
    default <T extends Enum<T>> Optional<T> getOptionalEnum(final List<String> path, final Class<T> enumType, final EnumGetMethod method) {
        return Optional.ofNullable((T)this.getEnum(path, (Class<T>)enumType, method));
    }
    
    default <T extends Enum<T>> Optional<T> getOptionalEnum(final List<String> path, final Class<T> enumType) {
        return this.getOptionalEnum(path, enumType, EnumGetMethod.NAME_IGNORECASE);
    }
    
    default <T extends Enum<T>> T getEnumOrElse(final String path, final T defaultValue, final EnumGetMethod method) {
        return this.getEnumOrElse(StringUtils.split(path, '.'), defaultValue, method);
    }
    
    default <T extends Enum<T>> T getEnumOrElse(final String path, final T defaultValue) {
        return this.getEnumOrElse(path, defaultValue, EnumGetMethod.NAME_IGNORECASE);
    }
    
    default <T extends Enum<T>> T getEnumOrElse(final List<String> path, final T defaultValue, final EnumGetMethod method) {
        final T value = this.getEnum(path, defaultValue.getDeclaringClass(), method);
        return (value == null) ? defaultValue : value;
    }
    
    default <T extends Enum<T>> T getEnumOrElse(final List<String> path, final T defaultValue) {
        return this.getEnumOrElse(path, defaultValue, EnumGetMethod.NAME_IGNORECASE);
    }
    
    default <T extends Enum<T>> T getEnumOrElse(final String path, final Class<T> enumType, final EnumGetMethod method, final Supplier<T> defaultValueSupplier) {
        return this.getEnumOrElse(StringUtils.split(path, '.'), enumType, method, defaultValueSupplier);
    }
    
    default <T extends Enum<T>> T getEnumOrElse(final String path, final Class<T> enumType, final Supplier<T> defaultValueSupplier) {
        return this.getEnumOrElse(path, enumType, EnumGetMethod.NAME_IGNORECASE, defaultValueSupplier);
    }
    
    default <T extends Enum<T>> T getEnumOrElse(final List<String> path, final Class<T> enumType, final EnumGetMethod method, final Supplier<T> defaultValueSupplier) {
        final T value = this.getEnum(path, enumType, method);
        return (value == null) ? defaultValueSupplier.get() : value;
    }
    
    default <T extends Enum<T>> T getEnumOrElse(final List<String> path, final Class<T> enumType, final Supplier<T> defaultValueSupplier) {
        return this.getEnumOrElse(path, enumType, EnumGetMethod.NAME_IGNORECASE, defaultValueSupplier);
    }
    
    default int getInt(final String path) {
        return this.get(path).intValue();
    }
    
    default int getInt(final List<String> path) {
        return this.getRaw(path).intValue();
    }
    
    default OptionalInt getOptionalInt(final String path) {
        return this.getOptionalInt(StringUtils.split(path, '.'));
    }
    
    default OptionalInt getOptionalInt(final List<String> path) {
        final Number n = this.get(path);
        return (n == null) ? OptionalInt.empty() : OptionalInt.of(n.intValue());
    }
    
    default int getIntOrElse(final String path, final int defaultValue) {
        return this.getIntOrElse(StringUtils.split(path, '.'), defaultValue);
    }
    
    default int getIntOrElse(final List<String> path, final int defaultValue) {
        final Number n = this.get(path);
        return (n == null) ? defaultValue : n.intValue();
    }
    
    default int getIntOrElse(final String path, final IntSupplier defaultValueSupplier) {
        return this.getIntOrElse(StringUtils.split(path, '.'), defaultValueSupplier);
    }
    
    default int getIntOrElse(final List<String> path, final IntSupplier defaultValueSupplier) {
        final Number n = this.get(path);
        return (n == null) ? defaultValueSupplier.getAsInt() : n.intValue();
    }
    
    default long getLong(final String path) {
        return this.getRaw(path).longValue();
    }
    
    default long getLong(final List<String> path) {
        return this.getRaw(path).longValue();
    }
    
    default OptionalLong getOptionalLong(final String path) {
        return this.getOptionalLong(StringUtils.split(path, '.'));
    }
    
    default OptionalLong getOptionalLong(final List<String> path) {
        final Number n = this.get(path);
        return (n == null) ? OptionalLong.empty() : OptionalLong.of(n.longValue());
    }
    
    default long getLongOrElse(final String path, final long defaultValue) {
        return this.getLongOrElse(StringUtils.split(path, '.'), defaultValue);
    }
    
    default long getLongOrElse(final List<String> path, final long defaultValue) {
        final Number n = this.get(path);
        return (n == null) ? defaultValue : n.longValue();
    }
    
    default long getLongOrElse(final String path, final LongSupplier defaultValueSupplier) {
        return this.getLongOrElse(StringUtils.split(path, '.'), defaultValueSupplier);
    }
    
    default long getLongOrElse(final List<String> path, final LongSupplier defaultValueSupplier) {
        final Number n = this.get(path);
        return (n == null) ? defaultValueSupplier.getAsLong() : n.longValue();
    }
    
    default byte getByte(final String path) {
        return this.getRaw(path).byteValue();
    }
    
    default byte getByte(final List<String> path) {
        return this.getRaw(path).byteValue();
    }
    
    default byte getByteOrElse(final String path, final byte defaultValue) {
        return this.getByteOrElse(StringUtils.split(path, '.'), defaultValue);
    }
    
    default byte getByteOrElse(final List<String> path, final byte defaultValue) {
        final Number n = this.get(path);
        return (n == null) ? defaultValue : n.byteValue();
    }
    
    default short getShort(final String path) {
        return this.getRaw(path).shortValue();
    }
    
    default short getShort(final List<String> path) {
        return this.getRaw(path).shortValue();
    }
    
    default short getShortOrElse(final String path, final short defaultValue) {
        return this.getShortOrElse(StringUtils.split(path, '.'), defaultValue);
    }
    
    default short getShortOrElse(final List<String> path, final short defaultValue) {
        final Number n = this.get(path);
        return (n == null) ? defaultValue : n.shortValue();
    }
    
    default char getChar(final String path) {
        return (char)this.getInt(path);
    }
    
    default char getChar(final List<String> path) {
        final Object value = this.getRaw(path);
        if (value instanceof Number) {
            return (char)((Number)value).intValue();
        }
        if (value instanceof CharSequence) {
            return ((CharSequence)value).charAt(0);
        }
        return (char)value;
    }
    
    default char getCharOrElse(final String path, final char defaultValue) {
        return this.getCharOrElse(StringUtils.split(path, '.'), defaultValue);
    }
    
    default char getCharOrElse(final List<String> path, final char defaultValue) {
        final Object value = this.getRaw(path);
        if (value == null || value == NullObject.NULL_OBJECT) {
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
    
    default boolean contains(final String path) {
        return this.contains(StringUtils.split(path, '.'));
    }
    
    boolean contains(final List<String> p0);
    
    default boolean isNull(final String path) {
        return this.isNull(StringUtils.split(path, '.'));
    }
    
    default boolean isNull(final List<String> path) {
        return this.getRaw(path) == NullObject.NULL_OBJECT;
    }
    
    int size();
    
    default boolean isEmpty() {
        return this.size() == 0;
    }
    
    Map<String, Object> valueMap();
    
    Set<? extends Entry> entrySet();
    
    ConfigFormat<?> configFormat();
    
    default <T> T apply(final String path) {
        return (T)this.get(path);
    }
    
    default <T> T apply(final List<String> path) {
        return (T)this.get(path);
    }
    
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
}
