package gg.essential.lib.gson.internal.bind;

import java.util.concurrent.atomic.*;
import java.math.*;
import gg.essential.lib.gson.internal.*;
import gg.essential.lib.gson.reflect.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import java.net.*;
import gg.essential.lib.gson.*;
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import gg.essential.lib.gson.annotations.*;

public final class TypeAdapters
{
    public static final TypeAdapter<Class> CLASS;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter<BitSet> BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter<Boolean> BOOLEAN;
    public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING;
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapter<Number> BYTE;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter<Number> SHORT;
    public static final TypeAdapterFactory SHORT_FACTORY;
    public static final TypeAdapter<Number> INTEGER;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final TypeAdapter<Number> LONG;
    public static final TypeAdapter<Number> FLOAT;
    public static final TypeAdapter<Number> DOUBLE;
    public static final TypeAdapter<Character> CHARACTER;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter<String> STRING;
    public static final TypeAdapter<BigDecimal> BIG_DECIMAL;
    public static final TypeAdapter<BigInteger> BIG_INTEGER;
    public static final TypeAdapter<LazilyParsedNumber> LAZILY_PARSED_NUMBER;
    public static final TypeAdapterFactory STRING_FACTORY;
    public static final TypeAdapter<StringBuilder> STRING_BUILDER;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final TypeAdapter<StringBuffer> STRING_BUFFER;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final TypeAdapter<URL> URL;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter<URI> URI;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter<InetAddress> INET_ADDRESS;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapter<UUID> UUID;
    public static final TypeAdapterFactory UUID_FACTORY;
    public static final TypeAdapter<Currency> CURRENCY;
    public static final TypeAdapterFactory CURRENCY_FACTORY;
    public static final TypeAdapter<Calendar> CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter<Locale> LOCALE;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapter<JsonElement> JSON_ELEMENT;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final TypeAdapterFactory ENUM_FACTORY;
    
    public static <TT> TypeAdapterFactory newFactory(final TypeToken<TT> type, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            final /* synthetic */ TypeToken val$type;
            final /* synthetic */ TypeAdapter val$typeAdapter;
            
            TypeAdapters$30() {
                super();
            }
            
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                return (TypeAdapter<T>)(typeToken.equals(type) ? typeAdapter : null);
            }
        };
    }
    
    public static <TT> TypeAdapterFactory newFactory(final Class<TT> type, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() {
            final /* synthetic */ Class val$type;
            final /* synthetic */ TypeAdapter val$typeAdapter;
            
            TypeAdapters$31() {
                super();
            }
            
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                return (TypeAdapter<T>)((typeToken.getRawType() == type) ? typeAdapter : null);
            }
            
            @Override
            public String toString() {
                return "Factory[type=" + type.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
    
    public static <TT> TypeAdapterFactory newFactory(final Class<TT> unboxed, final Class<TT> boxed, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            final /* synthetic */ Class val$unboxed;
            final /* synthetic */ Class val$boxed;
            final /* synthetic */ TypeAdapter val$typeAdapter;
            
            TypeAdapters$32() {
                super();
            }
            
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                final Class<? super T> rawType = typeToken.getRawType();
                return (TypeAdapter<T>)((rawType == unboxed || rawType == boxed) ? typeAdapter : null);
            }
            
            @Override
            public String toString() {
                return "Factory[type=" + boxed.getName() + "+" + unboxed.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
    
    public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(final Class<TT> base, final Class<? extends TT> sub, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() {
            final /* synthetic */ Class val$base;
            final /* synthetic */ Class val$sub;
            final /* synthetic */ TypeAdapter val$typeAdapter;
            
            TypeAdapters$33() {
                super();
            }
            
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                final Class<? super T> rawType = typeToken.getRawType();
                return (TypeAdapter<T>)((rawType == base || rawType == sub) ? typeAdapter : null);
            }
            
            @Override
            public String toString() {
                return "Factory[type=" + base.getName() + "+" + sub.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
    
    public static <T1> TypeAdapterFactory newTypeHierarchyFactory(final Class<T1> clazz, final TypeAdapter<T1> typeAdapter) {
        return new TypeAdapterFactory() {
            final /* synthetic */ Class val$clazz;
            final /* synthetic */ TypeAdapter val$typeAdapter;
            
            TypeAdapters$34() {
                super();
            }
            
            @Override
            public <T2> TypeAdapter<T2> create(final Gson gson, final TypeToken<T2> typeToken) {
                final Class<? super T2> requestedType = typeToken.getRawType();
                if (!clazz.isAssignableFrom(requestedType)) {
                    return null;
                }
                return (TypeAdapter<T2>)new TypeAdapter<T1>() {
                    final /* synthetic */ Class val$requestedType;
                    final /* synthetic */ TypeAdapters$34 this$0;
                    
                    TypeAdapters$34$1() {
                        this.this$0 = this$0;
                        super();
                    }
                    
                    @Override
                    public void write(final JsonWriter out, final T1 value) throws IOException {
                        typeAdapter.write(out, value);
                    }
                    
                    @Override
                    public T1 read(final JsonReader in) throws IOException {
                        final T1 result = typeAdapter.read(in);
                        if (result != null && !requestedType.isInstance(result)) {
                            throw new JsonSyntaxException("Expected a " + requestedType.getName() + " but was " + result.getClass().getName() + "; at path " + in.getPreviousPath());
                        }
                        return result;
                    }
                };
            }
            
            @Override
            public String toString() {
                return "Factory[typeHierarchy=" + clazz.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
    
    static {
        CLASS = new TypeAdapter<Class>() {
            TypeAdapters$1() {
                super();
            }
            
            public void write$6e7ab411(final Class value) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + value.getName() + ". Forgot to register a type adapter?");
            }
            
            public Class read$2e86ecf7() throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader jsonReader) throws IOException {
                return this.read$2e86ecf7();
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter jsonWriter, final Object o) throws IOException {
                this.write$6e7ab411((Class)o);
            }
        }.nullSafe();
        CLASS_FACTORY = newFactory(Class.class, TypeAdapters.CLASS);
        BIT_SET = new TypeAdapter<BitSet>() {
            TypeAdapters$2() {
                super();
            }
            
            @Override
            public BitSet read(final JsonReader in) throws IOException {
                final BitSet bitset = new BitSet();
                in.beginArray();
                int i = 0;
                for (JsonToken tokenType = in.peek(); tokenType != JsonToken.END_ARRAY; tokenType = in.peek()) {
                    boolean set = false;
                    switch (tokenType) {
                        case NUMBER:
                        case STRING: {
                            final int intValue = in.nextInt();
                            if (intValue == 0) {
                                set = false;
                                break;
                            }
                            if (intValue == 1) {
                                set = true;
                                break;
                            }
                            throw new JsonSyntaxException("Invalid bitset value " + intValue + ", expected 0 or 1; at path " + in.getPreviousPath());
                        }
                        case BOOLEAN: {
                            set = in.nextBoolean();
                            break;
                        }
                        default: {
                            throw new JsonSyntaxException("Invalid bitset value type: " + tokenType + "; at path " + in.getPath());
                        }
                    }
                    if (set) {
                        bitset.set(i);
                    }
                    ++i;
                }
                in.endArray();
                return bitset;
            }
            
            @Override
            public void write(final JsonWriter out, final BitSet src) throws IOException {
                out.beginArray();
                for (int i = 0, length = src.length(); i < length; ++i) {
                    final int value = src.get(i) ? 1 : 0;
                    out.value(value);
                }
                out.endArray();
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (BitSet)o);
            }
        }.nullSafe();
        BIT_SET_FACTORY = newFactory(BitSet.class, TypeAdapters.BIT_SET);
        BOOLEAN = new TypeAdapter<Boolean>() {
            TypeAdapters$3() {
                super();
            }
            
            @Override
            public Boolean read(final JsonReader in) throws IOException {
                final JsonToken peek = in.peek();
                if (peek == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                if (peek == JsonToken.STRING) {
                    return Boolean.parseBoolean(in.nextString());
                }
                return in.nextBoolean();
            }
            
            @Override
            public void write(final JsonWriter out, final Boolean value) throws IOException {
                out.value(value);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Boolean)o);
            }
        };
        BOOLEAN_AS_STRING = new TypeAdapter<Boolean>() {
            TypeAdapters$4() {
                super();
            }
            
            @Override
            public Boolean read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return Boolean.valueOf(in.nextString());
            }
            
            @Override
            public void write(final JsonWriter out, final Boolean value) throws IOException {
                out.value((value == null) ? "null" : value.toString());
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Boolean)o);
            }
        };
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, TypeAdapters.BOOLEAN);
        BYTE = new TypeAdapter<Number>() {
            TypeAdapters$5() {
                super();
            }
            
            @Override
            public Number read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                int intValue;
                try {
                    intValue = in.nextInt();
                }
                catch (final NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
                if (intValue > 255 || intValue < -128) {
                    throw new JsonSyntaxException("Lossy conversion from " + intValue + " to byte; at path " + in.getPreviousPath());
                }
                return (byte)intValue;
            }
            
            @Override
            public void write(final JsonWriter out, final Number value) throws IOException {
                out.value(value);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Number)o);
            }
        };
        BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, TypeAdapters.BYTE);
        SHORT = new TypeAdapter<Number>() {
            TypeAdapters$6() {
                super();
            }
            
            @Override
            public Number read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                int intValue;
                try {
                    intValue = in.nextInt();
                }
                catch (final NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
                if (intValue > 65535 || intValue < -32768) {
                    throw new JsonSyntaxException("Lossy conversion from " + intValue + " to short; at path " + in.getPreviousPath());
                }
                return (short)intValue;
            }
            
            @Override
            public void write(final JsonWriter out, final Number value) throws IOException {
                out.value(value);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Number)o);
            }
        };
        SHORT_FACTORY = newFactory(Short.TYPE, Short.class, TypeAdapters.SHORT);
        INTEGER = new TypeAdapter<Number>() {
            TypeAdapters$7() {
                super();
            }
            
            @Override
            public Number read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                try {
                    return in.nextInt();
                }
                catch (final NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
            
            @Override
            public void write(final JsonWriter out, final Number value) throws IOException {
                out.value(value);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Number)o);
            }
        };
        INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, TypeAdapters.INTEGER);
        ATOMIC_INTEGER = new TypeAdapter<AtomicInteger>() {
            TypeAdapters$8() {
                super();
            }
            
            @Override
            public AtomicInteger read(final JsonReader in) throws IOException {
                try {
                    return new AtomicInteger(in.nextInt());
                }
                catch (final NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
            
            @Override
            public void write(final JsonWriter out, final AtomicInteger value) throws IOException {
                out.value(value.get());
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (AtomicInteger)o);
            }
        }.nullSafe();
        ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, TypeAdapters.ATOMIC_INTEGER);
        ATOMIC_BOOLEAN = new TypeAdapter<AtomicBoolean>() {
            TypeAdapters$9() {
                super();
            }
            
            @Override
            public AtomicBoolean read(final JsonReader in) throws IOException {
                return new AtomicBoolean(in.nextBoolean());
            }
            
            @Override
            public void write(final JsonWriter out, final AtomicBoolean value) throws IOException {
                out.value(value.get());
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (AtomicBoolean)o);
            }
        }.nullSafe();
        ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, TypeAdapters.ATOMIC_BOOLEAN);
        ATOMIC_INTEGER_ARRAY = new TypeAdapter<AtomicIntegerArray>() {
            TypeAdapters$10() {
                super();
            }
            
            @Override
            public AtomicIntegerArray read(final JsonReader in) throws IOException {
                final List<Integer> list = new ArrayList<Integer>();
                in.beginArray();
                while (in.hasNext()) {
                    try {
                        final int integer = in.nextInt();
                        list.add(integer);
                        continue;
                    }
                    catch (final NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                    break;
                }
                in.endArray();
                final int length = list.size();
                final AtomicIntegerArray array = new AtomicIntegerArray(length);
                for (int i = 0; i < length; ++i) {
                    array.set(i, list.get(i));
                }
                return array;
            }
            
            @Override
            public void write(final JsonWriter out, final AtomicIntegerArray value) throws IOException {
                out.beginArray();
                for (int i = 0, length = value.length(); i < length; ++i) {
                    out.value(value.get(i));
                }
                out.endArray();
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (AtomicIntegerArray)o);
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, TypeAdapters.ATOMIC_INTEGER_ARRAY);
        LONG = new TypeAdapter<Number>() {
            TypeAdapters$11() {
                super();
            }
            
            @Override
            public Number read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                try {
                    return in.nextLong();
                }
                catch (final NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
            
            @Override
            public void write(final JsonWriter out, final Number value) throws IOException {
                out.value(value);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Number)o);
            }
        };
        FLOAT = new TypeAdapter<Number>() {
            TypeAdapters$12() {
                super();
            }
            
            @Override
            public Number read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return (float)in.nextDouble();
            }
            
            @Override
            public void write(final JsonWriter out, final Number value) throws IOException {
                out.value(value);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Number)o);
            }
        };
        DOUBLE = new TypeAdapter<Number>() {
            TypeAdapters$13() {
                super();
            }
            
            @Override
            public Number read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return in.nextDouble();
            }
            
            @Override
            public void write(final JsonWriter out, final Number value) throws IOException {
                out.value(value);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Number)o);
            }
        };
        CHARACTER = new TypeAdapter<Character>() {
            TypeAdapters$14() {
                super();
            }
            
            @Override
            public Character read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                final String str = in.nextString();
                if (str.length() != 1) {
                    throw new JsonSyntaxException("Expecting character, got: " + str + "; at " + in.getPreviousPath());
                }
                return str.charAt(0);
            }
            
            @Override
            public void write(final JsonWriter out, final Character value) throws IOException {
                out.value((value == null) ? null : String.valueOf(value));
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Character)o);
            }
        };
        CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, TypeAdapters.CHARACTER);
        STRING = new TypeAdapter<String>() {
            TypeAdapters$15() {
                super();
            }
            
            @Override
            public String read(final JsonReader in) throws IOException {
                final JsonToken peek = in.peek();
                if (peek == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                if (peek == JsonToken.BOOLEAN) {
                    return Boolean.toString(in.nextBoolean());
                }
                return in.nextString();
            }
            
            @Override
            public void write(final JsonWriter out, final String value) throws IOException {
                out.value(value);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (String)o);
            }
        };
        BIG_DECIMAL = new TypeAdapter<BigDecimal>() {
            TypeAdapters$16() {
                super();
            }
            
            @Override
            public BigDecimal read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                final String s = in.nextString();
                try {
                    return new BigDecimal(s);
                }
                catch (final NumberFormatException e) {
                    throw new JsonSyntaxException("Failed parsing '" + s + "' as BigDecimal; at path " + in.getPreviousPath(), e);
                }
            }
            
            @Override
            public void write(final JsonWriter out, final BigDecimal value) throws IOException {
                out.value(value);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (BigDecimal)o);
            }
        };
        BIG_INTEGER = new TypeAdapter<BigInteger>() {
            TypeAdapters$17() {
                super();
            }
            
            @Override
            public BigInteger read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                final String s = in.nextString();
                try {
                    return new BigInteger(s);
                }
                catch (final NumberFormatException e) {
                    throw new JsonSyntaxException("Failed parsing '" + s + "' as BigInteger; at path " + in.getPreviousPath(), e);
                }
            }
            
            @Override
            public void write(final JsonWriter out, final BigInteger value) throws IOException {
                out.value(value);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (BigInteger)o);
            }
        };
        LAZILY_PARSED_NUMBER = new TypeAdapter<LazilyParsedNumber>() {
            TypeAdapters$18() {
                super();
            }
            
            @Override
            public LazilyParsedNumber read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return new LazilyParsedNumber(in.nextString());
            }
            
            @Override
            public void write(final JsonWriter out, final LazilyParsedNumber value) throws IOException {
                out.value(value);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (LazilyParsedNumber)o);
            }
        };
        STRING_FACTORY = newFactory(String.class, TypeAdapters.STRING);
        STRING_BUILDER = new TypeAdapter<StringBuilder>() {
            TypeAdapters$19() {
                super();
            }
            
            @Override
            public StringBuilder read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return new StringBuilder(in.nextString());
            }
            
            @Override
            public void write(final JsonWriter out, final StringBuilder value) throws IOException {
                out.value((value == null) ? null : value.toString());
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (StringBuilder)o);
            }
        };
        STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, TypeAdapters.STRING_BUILDER);
        STRING_BUFFER = new TypeAdapter<StringBuffer>() {
            TypeAdapters$20() {
                super();
            }
            
            @Override
            public StringBuffer read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return new StringBuffer(in.nextString());
            }
            
            @Override
            public void write(final JsonWriter out, final StringBuffer value) throws IOException {
                out.value((value == null) ? null : value.toString());
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (StringBuffer)o);
            }
        };
        STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, TypeAdapters.STRING_BUFFER);
        URL = new TypeAdapter<URL>() {
            TypeAdapters$21() {
                super();
            }
            
            @Override
            public URL read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                final String nextString = in.nextString();
                return "null".equals(nextString) ? null : new URL(nextString);
            }
            
            @Override
            public void write(final JsonWriter out, final URL value) throws IOException {
                out.value((value == null) ? null : value.toExternalForm());
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (URL)o);
            }
        };
        URL_FACTORY = newFactory(URL.class, TypeAdapters.URL);
        URI = new TypeAdapter<URI>() {
            TypeAdapters$22() {
                super();
            }
            
            @Override
            public URI read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                try {
                    final String nextString = in.nextString();
                    return "null".equals(nextString) ? null : new URI(nextString);
                }
                catch (final URISyntaxException e) {
                    throw new JsonIOException(e);
                }
            }
            
            @Override
            public void write(final JsonWriter out, final URI value) throws IOException {
                out.value((value == null) ? null : value.toASCIIString());
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (URI)o);
            }
        };
        URI_FACTORY = newFactory(URI.class, TypeAdapters.URI);
        INET_ADDRESS = new TypeAdapter<InetAddress>() {
            TypeAdapters$23() {
                super();
            }
            
            @Override
            public InetAddress read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return InetAddress.getByName(in.nextString());
            }
            
            @Override
            public void write(final JsonWriter out, final InetAddress value) throws IOException {
                out.value((value == null) ? null : value.getHostAddress());
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (InetAddress)o);
            }
        };
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, TypeAdapters.INET_ADDRESS);
        UUID = new TypeAdapter<UUID>() {
            TypeAdapters$24() {
                super();
            }
            
            @Override
            public UUID read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                final String s = in.nextString();
                try {
                    return java.util.UUID.fromString(s);
                }
                catch (final IllegalArgumentException e) {
                    throw new JsonSyntaxException("Failed parsing '" + s + "' as UUID; at path " + in.getPreviousPath(), e);
                }
            }
            
            @Override
            public void write(final JsonWriter out, final UUID value) throws IOException {
                out.value((value == null) ? null : value.toString());
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (UUID)o);
            }
        };
        UUID_FACTORY = newFactory(UUID.class, TypeAdapters.UUID);
        CURRENCY = new TypeAdapter<Currency>() {
            TypeAdapters$25() {
                super();
            }
            
            @Override
            public Currency read(final JsonReader in) throws IOException {
                final String s = in.nextString();
                try {
                    return Currency.getInstance(s);
                }
                catch (final IllegalArgumentException e) {
                    throw new JsonSyntaxException("Failed parsing '" + s + "' as Currency; at path " + in.getPreviousPath(), e);
                }
            }
            
            @Override
            public void write(final JsonWriter out, final Currency value) throws IOException {
                out.value(value.getCurrencyCode());
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Currency)o);
            }
        }.nullSafe();
        CURRENCY_FACTORY = newFactory(Currency.class, TypeAdapters.CURRENCY);
        CALENDAR = new TypeAdapter<Calendar>() {
            TypeAdapters$26() {
                super();
            }
            
            @Override
            public Calendar read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                in.beginObject();
                int year = 0;
                int month = 0;
                int dayOfMonth = 0;
                int hourOfDay = 0;
                int minute = 0;
                int second = 0;
                while (in.peek() != JsonToken.END_OBJECT) {
                    final String name = in.nextName();
                    final int value = in.nextInt();
                    if ("year".equals(name)) {
                        year = value;
                    }
                    else if ("month".equals(name)) {
                        month = value;
                    }
                    else if ("dayOfMonth".equals(name)) {
                        dayOfMonth = value;
                    }
                    else if ("hourOfDay".equals(name)) {
                        hourOfDay = value;
                    }
                    else if ("minute".equals(name)) {
                        minute = value;
                    }
                    else {
                        if (!"second".equals(name)) {
                            continue;
                        }
                        second = value;
                    }
                }
                in.endObject();
                return new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);
            }
            
            @Override
            public void write(final JsonWriter out, final Calendar value) throws IOException {
                if (value == null) {
                    out.nullValue();
                    return;
                }
                out.beginObject();
                out.name("year");
                out.value(value.get(1));
                out.name("month");
                out.value(value.get(2));
                out.name("dayOfMonth");
                out.value(value.get(5));
                out.name("hourOfDay");
                out.value(value.get(11));
                out.name("minute");
                out.value(value.get(12));
                out.name("second");
                out.value(value.get(13));
                out.endObject();
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Calendar)o);
            }
        };
        CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, TypeAdapters.CALENDAR);
        LOCALE = new TypeAdapter<Locale>() {
            TypeAdapters$27() {
                super();
            }
            
            @Override
            public Locale read(final JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                final String locale = in.nextString();
                final StringTokenizer tokenizer = new StringTokenizer(locale, "_");
                String language = null;
                String country = null;
                String variant = null;
                if (tokenizer.hasMoreElements()) {
                    language = tokenizer.nextToken();
                }
                if (tokenizer.hasMoreElements()) {
                    country = tokenizer.nextToken();
                }
                if (tokenizer.hasMoreElements()) {
                    variant = tokenizer.nextToken();
                }
                if (country == null && variant == null) {
                    return new Locale(language);
                }
                if (variant == null) {
                    return new Locale(language, country);
                }
                return new Locale(language, country, variant);
            }
            
            @Override
            public void write(final JsonWriter out, final Locale value) throws IOException {
                out.value((value == null) ? null : value.toString());
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (Locale)o);
            }
        };
        LOCALE_FACTORY = newFactory(Locale.class, TypeAdapters.LOCALE);
        JSON_ELEMENT = new TypeAdapter<JsonElement>() {
            TypeAdapters$28() {
                super();
            }
            
            @Override
            public JsonElement read(final JsonReader in) throws IOException {
                if (in instanceof JsonTreeReader) {
                    return ((JsonTreeReader)in).nextJsonElement();
                }
                switch (in.peek()) {
                    case STRING: {
                        return new JsonPrimitive(in.nextString());
                    }
                    case NUMBER: {
                        final String number = in.nextString();
                        return new JsonPrimitive(new LazilyParsedNumber(number));
                    }
                    case BOOLEAN: {
                        return new JsonPrimitive(in.nextBoolean());
                    }
                    case NULL: {
                        in.nextNull();
                        return JsonNull.INSTANCE;
                    }
                    case BEGIN_ARRAY: {
                        final JsonArray array = new JsonArray();
                        in.beginArray();
                        while (in.hasNext()) {
                            array.add(this.read(in));
                        }
                        in.endArray();
                        return array;
                    }
                    case BEGIN_OBJECT: {
                        final JsonObject object = new JsonObject();
                        in.beginObject();
                        while (in.hasNext()) {
                            object.add(in.nextName(), this.read(in));
                        }
                        in.endObject();
                        return object;
                    }
                    default: {
                        throw new IllegalArgumentException();
                    }
                }
            }
            
            @Override
            public void write(final JsonWriter out, final JsonElement value) throws IOException {
                if (value == null || value.isJsonNull()) {
                    out.nullValue();
                }
                else if (value.isJsonPrimitive()) {
                    final JsonPrimitive primitive = value.getAsJsonPrimitive();
                    if (primitive.isNumber()) {
                        out.value(primitive.getAsNumber());
                    }
                    else if (primitive.isBoolean()) {
                        out.value(primitive.getAsBoolean());
                    }
                    else {
                        out.value(primitive.getAsString());
                    }
                }
                else if (value.isJsonArray()) {
                    out.beginArray();
                    for (final JsonElement e : value.getAsJsonArray()) {
                        this.write(out, e);
                    }
                    out.endArray();
                }
                else {
                    if (!value.isJsonObject()) {
                        throw new IllegalArgumentException("Couldn't write " + value.getClass());
                    }
                    out.beginObject();
                    for (final Map.Entry<String, JsonElement> e2 : value.getAsJsonObject().entrySet()) {
                        out.name(e2.getKey());
                        this.write(out, e2.getValue());
                    }
                    out.endObject();
                }
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader in) throws IOException {
                return this.read(in);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
                this.write(out, (JsonElement)o);
            }
        };
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, TypeAdapters.JSON_ELEMENT);
        ENUM_FACTORY = new TypeAdapterFactory() {
            TypeAdapters$29() {
                super();
            }
            
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter<T>((Class<T>)rawType);
            }
        };
    }
    
    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T>
    {
        private final Map<String, T> nameToConstant;
        private final Map<T, String> constantToName;
        
        public EnumTypeAdapter(final Class<T> classOfT) {
            super();
            this.nameToConstant = new HashMap<String, T>();
            this.constantToName = new HashMap<T, String>();
            try {
                final Field[] array;
                final Field[] constantFields = array = AccessController.doPrivileged((PrivilegedAction<Field[]>)new PrivilegedAction<Field[]>() {
                    final /* synthetic */ Class val$classOfT;
                    
                    TypeAdapters$EnumTypeAdapter$1() {
                        super();
                    }
                    
                    @Override
                    public Field[] run() {
                        final Field[] fields = classOfT.getDeclaredFields();
                        final ArrayList<Field> constantFieldsList = new ArrayList<Field>(fields.length);
                        for (final Field f : fields) {
                            if (f.isEnumConstant()) {
                                constantFieldsList.add(f);
                            }
                        }
                        final Field[] constantFields = constantFieldsList.toArray(new Field[0]);
                        AccessibleObject.setAccessible(constantFields, true);
                        return constantFields;
                    }
                    
                    @Override
                    public /* bridge */ Object run() {
                        return this.run();
                    }
                });
                for (final Field constantField : array) {
                    final T constant = (T)constantField.get(null);
                    String name = constant.name();
                    final SerializedName annotation = constantField.getAnnotation(SerializedName.class);
                    if (annotation != null) {
                        name = annotation.value();
                        for (final String alternate : annotation.alternate()) {
                            this.nameToConstant.put(alternate, constant);
                        }
                    }
                    this.nameToConstant.put(name, constant);
                    this.constantToName.put(constant, name);
                }
            }
            catch (final IllegalAccessException e) {
                throw new AssertionError((Object)e);
            }
        }
        
        @Override
        public T read(final JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            return this.nameToConstant.get(in.nextString());
        }
        
        @Override
        public void write(final JsonWriter out, final T value) throws IOException {
            out.value((value == null) ? null : this.constantToName.get(value));
        }
        
        @Override
        public /* bridge */ Object read(final JsonReader in) throws IOException {
            return this.read(in);
        }
        
        @Override
        public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
            this.write(out, (T)o);
        }
    }
}
