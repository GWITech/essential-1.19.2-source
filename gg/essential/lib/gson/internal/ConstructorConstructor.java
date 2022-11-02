package gg.essential.lib.gson.internal;

import gg.essential.lib.gson.*;
import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.internal.reflect.*;
import java.util.concurrent.*;
import java.lang.reflect.*;
import java.util.*;

public final class ConstructorConstructor
{
    private final Map<Type, InstanceCreator<?>> instanceCreators;
    private final boolean useJdkUnsafe;
    
    public ConstructorConstructor(final Map<Type, InstanceCreator<?>> instanceCreators, final boolean useJdkUnsafe) {
        super();
        this.instanceCreators = instanceCreators;
        this.useJdkUnsafe = useJdkUnsafe;
    }
    
    public <T> ObjectConstructor<T> get(final TypeToken<T> typeToken) {
        final Type type = typeToken.getType();
        final Class<? super T> rawType = typeToken.getRawType();
        final InstanceCreator<T> typeCreator = (InstanceCreator<T>)this.instanceCreators.get(type);
        if (typeCreator != null) {
            return (ObjectConstructor<T>)new ConstructorConstructor.ConstructorConstructor$1((InstanceCreator)typeCreator);
        }
        final InstanceCreator<T> rawTypeCreator = (InstanceCreator<T>)this.instanceCreators.get(rawType);
        if (rawTypeCreator != null) {
            return (ObjectConstructor<T>)new ConstructorConstructor.ConstructorConstructor$2((InstanceCreator)rawTypeCreator);
        }
        final ObjectConstructor<T> defaultConstructor = this.newDefaultConstructor(rawType);
        if (defaultConstructor != null) {
            return defaultConstructor;
        }
        final ObjectConstructor<T> defaultImplementation = this.newDefaultImplementationConstructor(type, rawType);
        if (defaultImplementation != null) {
            return defaultImplementation;
        }
        return this.newUnsafeAllocator(rawType);
    }
    
    private <T> ObjectConstructor<T> newDefaultConstructor(final Class<? super T> rawType) {
        if (Modifier.isAbstract(rawType.getModifiers())) {
            return null;
        }
        Constructor<? super T> constructor;
        try {
            constructor = rawType.getDeclaredConstructor((Class<?>[])new Class[0]);
        }
        catch (final NoSuchMethodException ex) {
            return null;
        }
        final String exceptionMessage = ReflectionHelper.tryMakeAccessible(constructor);
        if (exceptionMessage != null) {
            return (ObjectConstructor<T>)new ConstructorConstructor.ConstructorConstructor$3(exceptionMessage);
        }
        return new ObjectConstructor<T>() {
            final /* synthetic */ Constructor val$constructor;
            
            ConstructorConstructor$4() {
                super();
            }
            
            @Override
            public T construct() {
                try {
                    final T newInstance = constructor.newInstance(new Object[0]);
                    return newInstance;
                }
                catch (final InstantiationException e) {
                    throw new RuntimeException("Failed to invoke " + constructor + " with no args", e);
                }
                catch (final InvocationTargetException e2) {
                    throw new RuntimeException("Failed to invoke " + constructor + " with no args", e2.getTargetException());
                }
                catch (final IllegalAccessException e3) {
                    throw new AssertionError((Object)e3);
                }
            }
        };
    }
    
    private <T> ObjectConstructor<T> newDefaultImplementationConstructor(final Type type, final Class<? super T> rawType) {
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                return (ObjectConstructor<T>)new ConstructorConstructor.ConstructorConstructor$5();
            }
            if (EnumSet.class.isAssignableFrom(rawType)) {
                return (ObjectConstructor<T>)new ConstructorConstructor.ConstructorConstructor$6(type);
            }
            if (Set.class.isAssignableFrom(rawType)) {
                return new ObjectConstructor<T>() {
                    ConstructorConstructor$7() {
                        super();
                    }
                    
                    @Override
                    public T construct() {
                        return (T)new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(rawType)) {
                return (ObjectConstructor<T>)new ConstructorConstructor.ConstructorConstructor$8();
            }
            return new ObjectConstructor<T>() {
                ConstructorConstructor$9() {
                    super();
                }
                
                @Override
                public T construct() {
                    return (T)new ArrayList();
                }
            };
        }
        else {
            if (!Map.class.isAssignableFrom(rawType)) {
                return null;
            }
            if (rawType == EnumMap.class) {
                return (ObjectConstructor<T>)new ConstructorConstructor.ConstructorConstructor$10(type);
            }
            if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                return (ObjectConstructor<T>)new ConstructorConstructor.ConstructorConstructor$11();
            }
            if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                return (ObjectConstructor<T>)new ConstructorConstructor.ConstructorConstructor$12();
            }
            if (SortedMap.class.isAssignableFrom(rawType)) {
                return (ObjectConstructor<T>)new ConstructorConstructor.ConstructorConstructor$13();
            }
            if (type instanceof ParameterizedType && !String.class.isAssignableFrom(TypeToken.get(((ParameterizedType)type).getActualTypeArguments()[0]).getRawType())) {
                return new ObjectConstructor<T>() {
                    ConstructorConstructor$14() {
                        super();
                    }
                    
                    @Override
                    public T construct() {
                        return (T)new LinkedHashMap();
                    }
                };
            }
            return new ObjectConstructor<T>() {
                ConstructorConstructor$15() {
                    super();
                }
                
                @Override
                public T construct() {
                    return (T)new LinkedTreeMap();
                }
            };
        }
    }
    
    private <T> ObjectConstructor<T> newUnsafeAllocator(final Class<? super T> rawType) {
        if (this.useJdkUnsafe) {
            return new ObjectConstructor<T>() {
                private final UnsafeAllocator unsafeAllocator = UnsafeAllocator.create();
                final /* synthetic */ Class val$rawType;
                
                ConstructorConstructor$16() {
                    super();
                }
                
                @Override
                public T construct() {
                    try {
                        final T newInstance = this.unsafeAllocator.newInstance(rawType);
                        return newInstance;
                    }
                    catch (final Exception e) {
                        throw new RuntimeException("Unable to create instance of " + rawType + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
                    }
                }
            };
        }
        final String exceptionMessage = "Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        return (ObjectConstructor<T>)new ConstructorConstructor.ConstructorConstructor$17(exceptionMessage);
    }
    
    @Override
    public String toString() {
        return this.instanceCreators.toString();
    }
}
