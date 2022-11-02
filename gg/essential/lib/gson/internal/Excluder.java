package gg.essential.lib.gson.internal;

import gg.essential.lib.gson.reflect.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import java.lang.reflect.*;
import gg.essential.lib.gson.annotations.*;
import gg.essential.lib.gson.*;
import java.util.*;

public final class Excluder implements TypeAdapterFactory, Cloneable
{
    public static final Excluder DEFAULT;
    private double version;
    private int modifiers;
    private boolean serializeInnerClasses;
    private List<ExclusionStrategy> serializationStrategies;
    private List<ExclusionStrategy> deserializationStrategies;
    
    public Excluder() {
        super();
        this.version = -1.0;
        this.modifiers = 136;
        this.serializeInnerClasses = true;
        this.serializationStrategies = Collections.emptyList();
        this.deserializationStrategies = Collections.emptyList();
    }
    
    @Override
    protected Excluder clone() {
        try {
            return (Excluder)super.clone();
        }
        catch (final CloneNotSupportedException e) {
            throw new AssertionError((Object)e);
        }
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
        final Class<?> rawType = type.getRawType();
        final boolean excludeClass = this.excludeClassChecks(rawType);
        final boolean skipSerialize = excludeClass || this.excludeClassInStrategy$4a833490(true);
        final boolean skipDeserialize = excludeClass || this.excludeClassInStrategy$4a833490(false);
        if (!skipSerialize && !skipDeserialize) {
            return null;
        }
        return new TypeAdapter<T>() {
            private TypeAdapter<T> delegate;
            final /* synthetic */ boolean val$skipDeserialize;
            final /* synthetic */ boolean val$skipSerialize;
            final /* synthetic */ Gson val$gson;
            final /* synthetic */ TypeToken val$type;
            final /* synthetic */ Excluder this$0;
            
            Excluder$1() {
                this.this$0 = this$0;
                super();
            }
            
            @Override
            public T read(final JsonReader in) throws IOException {
                if (skipDeserialize) {
                    in.skipValue();
                    return null;
                }
                return this.delegate().read(in);
            }
            
            @Override
            public void write(final JsonWriter out, final T value) throws IOException {
                if (skipSerialize) {
                    out.nullValue();
                    return;
                }
                this.delegate().write(out, value);
            }
            
            private TypeAdapter<T> delegate() {
                final TypeAdapter<T> d = this.delegate;
                return (d != null) ? d : (this.delegate = gson.getDelegateAdapter(this.this$0, type));
            }
        };
    }
    
    public boolean excludeField(final Field field, final boolean serialize) {
        if ((this.modifiers & field.getModifiers()) != 0x0) {
            return true;
        }
        if (this.version != -1.0 && !this.isValidVersion(field.getAnnotation(Since.class), field.getAnnotation(Until.class))) {
            return true;
        }
        if (field.isSynthetic()) {
            return true;
        }
        if (!this.serializeInnerClasses && this.isInnerClass(field.getType())) {
            return true;
        }
        if (this.isAnonymousOrNonStaticLocal(field.getType())) {
            return true;
        }
        final List<ExclusionStrategy> list = serialize ? this.serializationStrategies : this.deserializationStrategies;
        if (!list.isEmpty()) {
            new FieldAttributes(field);
            for (final ExclusionStrategy exclusionStrategy : list) {
                if (exclusionStrategy.shouldSkipField$1a13a577()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean excludeClassChecks(final Class<?> clazz) {
        return (this.version != -1.0 && !this.isValidVersion(clazz.getAnnotation(Since.class), clazz.getAnnotation(Until.class))) || (!this.serializeInnerClasses && this.isInnerClass(clazz)) || this.isAnonymousOrNonStaticLocal(clazz);
    }
    
    public boolean excludeClass(final Class<?> clazz, final boolean serialize) {
        return this.excludeClassChecks(clazz) || this.excludeClassInStrategy$4a833490(serialize);
    }
    
    private boolean excludeClassInStrategy$4a833490(final boolean serialize) {
        final List<ExclusionStrategy> list = serialize ? this.serializationStrategies : this.deserializationStrategies;
        for (final ExclusionStrategy exclusionStrategy : list) {
            if (exclusionStrategy.shouldSkipClass$1b2d8b94()) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isAnonymousOrNonStaticLocal(final Class<?> clazz) {
        return !Enum.class.isAssignableFrom(clazz) && !this.isStatic(clazz) && (clazz.isAnonymousClass() || clazz.isLocalClass());
    }
    
    private boolean isInnerClass(final Class<?> clazz) {
        return clazz.isMemberClass() && !this.isStatic(clazz);
    }
    
    private boolean isStatic(final Class<?> clazz) {
        return (clazz.getModifiers() & 0x8) != 0x0;
    }
    
    private boolean isValidVersion(final Since since, final Until until) {
        return this.isValidSince(since) && this.isValidUntil(until);
    }
    
    private boolean isValidSince(final Since annotation) {
        if (annotation != null) {
            final double annotationVersion = annotation.value();
            if (annotationVersion > this.version) {
                return false;
            }
        }
        return true;
    }
    
    private boolean isValidUntil(final Until annotation) {
        if (annotation != null) {
            final double annotationVersion = annotation.value();
            if (annotationVersion <= this.version) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    protected /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.clone();
    }
    
    static {
        DEFAULT = new Excluder();
    }
}
