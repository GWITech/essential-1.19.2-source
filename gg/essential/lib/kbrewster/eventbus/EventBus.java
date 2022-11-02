package gg.essential.lib.kbrewster.eventbus;

import kotlin.*;
import gg.essential.lib.kbrewster.eventbus.exception.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.kbrewster.eventbus.collection.*;
import java.lang.reflect.*;
import java.util.concurrent.*;
import java.util.*;
import kotlin.jvm.*;
import gg.essential.lib.kbrewster.eventbus.invokers.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 16 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB%\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000bJ)\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0016\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00110\u0014H\u0082\bJ\u001f\u0010\u0015\u001a\u00020\u0011\"\u0006\b\u0000\u0010\u0016\u0018\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0086\bJ\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0001J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d" }, d2 = { "Lgg/essential/lib/kbrewster/eventbus/EventBus;", "", "invokerType", "Lgg/essential/lib/kbrewster/eventbus/invokers/InvokerType;", "exceptionHandler", "Lgg/essential/lib/kbrewster/eventbus/exception/ExceptionHandler;", "threadSaftey", "", "(Lme/kbrewster/eventbus/invokers/InvokerType;Lme/kbrewster/eventbus/exception/ExceptionHandler;Z)V", "subscribers", "Ljava/util/AbstractMap;", "Ljava/lang/Class;", "", "Lgg/essential/lib/kbrewster/eventbus/EventBus$Subscriber;", "getSubscribedEvents", "clazz", "iterateSubclasses", "", "obj", "body", "Lkotlin/Function1;", "post", "T", "supplier", "Lkotlin/Function0;", "event", "register", "unregister", "Subscriber", "KeventBus" })
public final class EventBus
{
    private final AbstractMap<Class<?>, List<Subscriber>> subscribers;
    private final InvokerType invokerType;
    private final ExceptionHandler exceptionHandler;
    private final boolean threadSaftey;
    
    public final void register(@NotNull final Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        for (final Method method : obj.getClass().getDeclaredMethods()) {
            final Subscribe subscribe = method.getAnnotation(Subscribe.class);
            if (subscribe != null) {
                final Subscribe sub = subscribe;
                final Method method2 = method;
                Intrinsics.checkExpressionValueIsNotNull((Object)method2, "method");
                final Class parameterClazz = method2.getParameterTypes()[0];
                if (method.getParameterCount() != 1) {
                    throw new IllegalArgumentException("Subscribed method must only have one parameter.");
                }
                if (Intrinsics.areEqual((Object)method.getReturnType(), (Object)Void.TYPE) ^ true) {
                    throw new IllegalArgumentException("Subscribed method must be of type 'Void'. ");
                }
                final Class clazz = parameterClazz;
                Intrinsics.checkExpressionValueIsNotNull((Object)clazz, "parameterClazz");
                if (clazz.isPrimitive()) {
                    throw new IllegalArgumentException("Cannot subscribe method to a primitive.");
                }
                if ((parameterClazz.getModifiers() & 0x600) != 0x0) {
                    throw new IllegalArgumentException("Cannot subscribe method to a polymorphic class.");
                }
                final InvokerType.SubscriberMethod subscriberMethod = this.invokerType.setup(obj, obj.getClass(), parameterClazz, method);
                final Subscriber subscriber = new Subscriber(obj, sub.priority(), subscriberMethod);
                this.subscribers.putIfAbsent(parameterClazz, this.threadSaftey ? ((List)new ConcurrentSubscriberArrayList()) : ((List)new SubscriberArrayList()));
                final List<Subscriber> value = this.subscribers.get(parameterClazz);
                if (value == null) {
                    Intrinsics.throwNpe();
                }
                value.add(subscriber);
            }
        }
    }
    
    public final void unregister(@NotNull final Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        for (final Method method : obj.getClass().getDeclaredMethods()) {
            if (method.getAnnotation(Subscribe.class) != null) {
                final AbstractMap<Class<?>, List<Subscriber>> subscribers = this.subscribers;
                final Method method2 = method;
                Intrinsics.checkExpressionValueIsNotNull((Object)method2, "method");
                final List list = subscribers.get(method2.getParameterTypes()[0]);
                if (list != null) {
                    list.remove(new Subscriber(obj, -1, null));
                }
            }
        }
    }
    
    public final void post(@NotNull final Object event) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "event"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getfield        gg/essential/lib/kbrewster/eventbus/EventBus.subscribers:Ljava/util/AbstractMap;
        //    10: aload_1         /* event */
        //    11: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    14: invokevirtual   java/util/AbstractMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    17: checkcast       Ljava/util/List;
        //    20: dup            
        //    21: ifnull          27
        //    24: goto            29
        //    27: pop            
        //    28: return         
        //    29: dup            
        //    30: ldc             "subscribers[event.javaClass] ?: return"
        //    32: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    35: astore_2        /* events */
        //    36: aload_2         /* events */
        //    37: invokeinterface java/util/List.size:()I
        //    42: iconst_1       
        //    43: isub           
        //    44: istore_3       
        //    45: iload_3        
        //    46: iflt            85
        //    49: aload_2         /* events */
        //    50: iload_3         /* i */
        //    51: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    56: checkcast       Lgg/essential/lib/kbrewster/eventbus/EventBus$Subscriber;
        //    59: aload_1         /* event */
        //    60: invokevirtual   gg/essential/lib/kbrewster/eventbus/EventBus$Subscriber.invoke:(Ljava/lang/Object;)V
        //    63: goto            79
        //    66: astore          e
        //    68: aload_0         /* this */
        //    69: getfield        gg/essential/lib/kbrewster/eventbus/EventBus.exceptionHandler:Lgg/essential/lib/kbrewster/eventbus/exception/ExceptionHandler;
        //    72: aload           e
        //    74: invokeinterface gg/essential/lib/kbrewster/eventbus/exception/ExceptionHandler.handle:(Ljava/lang/Exception;)V
        //    79: iinc            i, -1
        //    82: goto            45
        //    85: return         
        //    MethodParameters:
        //  Name   Flags  
        //  -----  -----
        //  event  
        //    StackMapTable: 00 06 FF 00 1B 00 00 00 01 07 00 99 FF 00 01 00 02 07 00 02 07 00 04 00 01 07 00 99 FD 00 0F 07 00 99 01 54 07 00 BA 0C FF 00 05 00 00 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  49     63     66     79     Ljava/lang/Exception;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmOverloads
    public EventBus(@NotNull final InvokerType invokerType, @NotNull final ExceptionHandler exceptionHandler, final boolean threadSaftey) {
        Intrinsics.checkParameterIsNotNull((Object)invokerType, "invokerType");
        Intrinsics.checkParameterIsNotNull((Object)exceptionHandler, "exceptionHandler");
        super();
        this.invokerType = invokerType;
        this.exceptionHandler = exceptionHandler;
        this.threadSaftey = threadSaftey;
        this.subscribers = (this.threadSaftey ? new ConcurrentHashMap<Class<?>, List<Subscriber>>() : ((AbstractMap)new HashMap<Class<?>, List<Subscriber>>()));
    }
    
    public EventBus(InvokerType invokerType, ExceptionHandler exceptionHandler, boolean threadSaftey, final int n) {
        if ((n & 0x1) != 0x0) {
            invokerType = (InvokerType)new ReflectionInvoker();
        }
        if ((n & 0x2) != 0x0) {
            exceptionHandler = (ExceptionHandler)new EventBus.EventBus$1();
        }
        if ((n & 0x4) != 0x0) {
            threadSaftey = true;
        }
        this(invokerType, exceptionHandler, threadSaftey);
    }
    
    @JvmOverloads
    public EventBus(@NotNull final InvokerType invokerType, @NotNull final ExceptionHandler exceptionHandler) {
        this(invokerType, exceptionHandler, false, 4);
    }
    
    @JvmOverloads
    public EventBus() {
        this(null, null, false, 7);
    }
    
    @Metadata(mv = { 1, 1, 16 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0086\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013" }, d2 = { "Lgg/essential/lib/kbrewster/eventbus/EventBus$Subscriber;", "", "obj", "priority", "", "invoker", "Lgg/essential/lib/kbrewster/eventbus/invokers/InvokerType$SubscriberMethod;", "(Ljava/lang/Object;ILme/kbrewster/eventbus/invokers/InvokerType$SubscriberMethod;)V", "getObj", "()Ljava/lang/Object;", "getPriority", "()I", "equals", "", "other", "hashCode", "invoke", "", "arg", "KeventBus" })
    public static final class Subscriber
    {
        @NotNull
        private final Object obj;
        private final int priority;
        private final InvokerType.SubscriberMethod invoker;
        
        public final void invoke(@Nullable final Object arg) throws Exception {
            final InvokerType.SubscriberMethod invoker = this.invoker;
            if (invoker == null) {
                Intrinsics.throwNpe();
            }
            invoker.invoke(arg);
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            return ((other != null) ? other.hashCode() : 0) == this.hashCode();
        }
        
        @Override
        public int hashCode() {
            return this.obj.hashCode();
        }
        
        public final int getPriority() {
            return this.priority;
        }
        
        public Subscriber(@NotNull final Object obj, final int priority, @Nullable final InvokerType.SubscriberMethod invoker) {
            Intrinsics.checkParameterIsNotNull(obj, "obj");
            super();
            this.obj = obj;
            this.priority = priority;
            this.invoker = invoker;
        }
    }
}
