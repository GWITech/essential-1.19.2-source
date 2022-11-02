package gg.essential.gui.common;

import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import java.util.*;
import java.lang.ref.*;
import java.util.function.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006\u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\b	B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006
                                                   """ }, d2 = { "Lgg/essential/gui/common/WeakState;", "T", "Lgg/essential/elementa/state/BasicState;", "inner", "Lgg/essential/elementa/state/State;", "(Lgg/essential/elementa/state/State;)V", "get", "()Ljava/lang/Object;", "Companion", "WeakListener", "essential" })
public final class WeakState<T> extends BasicState<T>
{
    @NotNull
    private final State<T> inner;
    @Deprecated
    @NotNull
    private static final WeakHashMap<State<?>, ReferenceQueue<State<?>>> referenceQueues;
    
    public WeakState(@NotNull final State<T> inner) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "inner"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: aload_1         /* inner */
        //     8: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //    11: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    14: aload_0         /* this */
        //    15: aload_1         /* inner */
        //    16: putfield        gg/essential/gui/common/WeakState.inner:Lgg/essential/elementa/state/State;
        //    19: getstatic       gg/essential/gui/common/WeakState.referenceQueues:Ljava/util/WeakHashMap;
        //    22: checkcast       Ljava/util/Map;
        //    25: astore_3       
        //    26: aload_0         /* this */
        //    27: getfield        gg/essential/gui/common/WeakState.inner:Lgg/essential/elementa/state/State;
        //    30: astore          key$iv
        //    32: aload_3         /* $this$getOrPut$iv */
        //    33: aload           key$iv
        //    35: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    40: astore          value$iv
        //    42: aload           value$iv
        //    44: ifnonnull       72
        //    47: new             Ljava/lang/ref/ReferenceQueue;
        //    50: dup            
        //    51: invokespecial   java/lang/ref/ReferenceQueue.<init>:()V
        //    54: astore          answer$iv
        //    56: aload_3         /* $this$getOrPut$iv */
        //    57: aload           key$iv
        //    59: aload           answer$iv
        //    61: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    66: pop            
        //    67: aload           answer$iv
        //    69: goto            74
        //    72: aload           value$iv
        //    74: checkcast       Ljava/lang/ref/ReferenceQueue;
        //    77: astore_2        /* referenceQueue */
        //    78: aload_2         /* referenceQueue */
        //    79: invokevirtual   java/lang/ref/ReferenceQueue.poll:()Ljava/lang/ref/Reference;
        //    82: dup            
        //    83: ifnonnull       90
        //    86: pop            
        //    87: goto            107
        //    90: astore_3        /* reference */
        //    91: aload_3         /* reference */
        //    92: checkcast       Lgg/essential/gui/common/WeakState$WeakListener;
        //    95: invokevirtual   gg/essential/gui/common/WeakState$WeakListener.getUnregister:()Lkotlin/jvm/functions/Function0;
        //    98: invokeinterface kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
        //   103: pop            
        //   104: goto            78
        //   107: new             Lgg/essential/gui/common/WeakState$WeakListener;
        //   110: dup            
        //   111: aload_0         /* this */
        //   112: aload_2         /* referenceQueue */
        //   113: invokespecial   gg/essential/gui/common/WeakState$WeakListener.<init>:(Lgg/essential/gui/common/WeakState;Ljava/lang/ref/ReferenceQueue;)V
        //   116: astore_3        /* listener */
        //   117: aload_3         /* listener */
        //   118: aload_0         /* this */
        //   119: getfield        gg/essential/gui/common/WeakState.inner:Lgg/essential/elementa/state/State;
        //   122: aload_3         /* listener */
        //   123: checkcast       Ljava/util/function/Consumer;
        //   126: invokevirtual   gg/essential/elementa/state/State.onSetValue:(Ljava/util/function/Consumer;)Lkotlin/jvm/functions/Function0;
        //   129: invokevirtual   gg/essential/gui/common/WeakState$WeakListener.setUnregister:(Lkotlin/jvm/functions/Function0;)V
        //   132: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<TT;>;)V
        //    MethodParameters:
        //  Name   Flags  
        //  -----  -----
        //  inner  
        //    StackMapTable: 00 05 FF 00 48 00 06 07 00 02 00 00 00 00 07 00 4A 00 00 FF 00 01 00 01 07 00 02 00 01 07 00 4A FD 00 03 00 07 00 41 4B 07 00 50 10
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public T get() {
        return this.inner.get();
    }
    
    static {
        new Companion((byte)0);
        referenceQueues = new WeakHashMap<State<?>, ReferenceQueue<State<?>>>();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000.
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0002
                                                       \u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012
                                                       \u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\b¢\u0006\u0002\u0010	J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0013R \u0010
                                                       \u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\u0010\u000e"\u0004\b\u000f\u0010\u0010¨\u0006\u0014""" }, d2 = { "Lgg/essential/gui/common/WeakState$WeakListener;", "T", "Ljava/lang/ref/WeakReference;", "Lgg/essential/elementa/state/State;", "Ljava/util/function/Consumer;", "weakState", "Lgg/essential/gui/common/WeakState;", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "(Lgg/essential/gui/common/WeakState;Ljava/lang/ref/ReferenceQueue;)V", "unregister", "Lkotlin/Function0;", "", "getUnregister", "()Lkotlin/jvm/functions/Function0;", "setUnregister", "(Lkotlin/jvm/functions/Function0;)V", "accept", "value", "(Ljava/lang/Object;)V", "essential" })
    private static final class WeakListener<T> extends WeakReference<State<T>> implements Consumer<T>
    {
        public Function0<Unit> unregister;
        
        public WeakListener(@NotNull final WeakState<T> weakState, @NotNull final ReferenceQueue<State<?>> referenceQueue) {
            Intrinsics.checkNotNullParameter((Object)weakState, "weakState");
            Intrinsics.checkNotNullParameter((Object)referenceQueue, "referenceQueue");
            super(weakState, referenceQueue);
        }
        
        @NotNull
        public final Function0<Unit> getUnregister() {
            final Function0<Unit> unregister = this.unregister;
            if (unregister != null) {
                return unregister;
            }
            Intrinsics.throwUninitializedPropertyAccessException("unregister");
            return null;
        }
        
        public final void setUnregister(@NotNull final Function0<Unit> <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            this.unregister = <set-?>;
        }
        
        @Override
        public void accept(final T value) {
            final State state = this.get();
            if (state != null) {
                state.set(value);
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001c
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R+\u0010\u0003\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00060\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0007\u0010\b¨\u0006	""" }, d2 = { "Lgg/essential/gui/common/WeakState$Companion;", "", "()V", "referenceQueues", "Ljava/util/WeakHashMap;", "Lgg/essential/elementa/state/State;", "Ljava/lang/ref/ReferenceQueue;", "getReferenceQueues", "()Ljava/util/WeakHashMap;", "essential" })
    private static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
