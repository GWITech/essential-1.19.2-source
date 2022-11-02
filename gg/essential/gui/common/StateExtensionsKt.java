package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.effects.*;
import kotlin.*;
import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.utils.*;
import kotlin.ranges.*;
import kotlin.collections.*;
import java.util.*;
import java.util.function.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { """
                                                   \u0000\u009a\u0001
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u001a9\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00060\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0086\u0004\u001au\u0010	\u001a\u0002H
                                                   "\b\b\u0000\u0010
                                                   *\u00020\u000b"\u0004\b\u0001\u0010\f*\u0002H
                                                   2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00060\u00102\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012j
                                                   \u0012\u0004\u0012\u00020\u000b\u0018\u0001`\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\u0010\u0015\u001aL\u0010\u0016\u001a\u0002H
                                                   "\b\b\u0000\u0010
                                                   *\u00020\u000b"\u0004\b\u0001\u0010\u0017*\u0002H
                                                   2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00072\u001d\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u00020\u001b0\u0001¢\u0006\u0002\b\u001c¢\u0006\u0002\u0010\u001d\u001a9\u0010\u001e\u001a\u0002H
                                                   "\b\b\u0000\u0010
                                                   *\u00020\u000b*\u0002H
                                                   2\u0006\u0010\u001f\u001a\u00020 2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00072\b\b\u0002\u0010!\u001a\u00020\u0006¢\u0006\u0002\u0010"\u001a'\u0010#\u001a\u0002H
                                                   "\b\b\u0000\u0010
                                                   *\u00020\u000b*\u0002H
                                                   2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007¢\u0006\u0002\u0010$\u001aE\u0010%\u001a\u0002H
                                                   "\b\b\u0000\u0010
                                                   *\u00020\u000b*\u0002H
                                                   2\u0006\u0010&\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00072\b\b\u0002\u0010!\u001a\u00020\u00062
                                                   \b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010(\u001a?\u0010%\u001a\u0002H
                                                   "\b\b\u0000\u0010
                                                   *\u00020\u000b*\u0002H
                                                   2\u000e\u0010\u0018\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00072\b\b\u0002\u0010!\u001a\u00020\u00062
                                                   \b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010)\u001a\u001c\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020+0\u0007\u001a2\u0010,\u001a\u0002H
                                                   "\u0004\b\u0000\u0010
                                                   *\b\u0012\u0004\u0012\u0002H
                                                   0\u00072\u0006\u0010-\u001a\u00020.2
                                                   \u0010/\u001a\u0006\u0012\u0002\b\u000300H\u0086\u0002¢\u0006\u0002\u00101\u001a6\u00102\u001a\b\u0012\u0004\u0012\u0002H30\u000e"\u0004\b\u0000\u0010\f"\u0004\b\u0001\u00103*\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H30\u0010\u001a \u00104\u001a\u000205*\b\u0012\u0004\u0012\u00020\u00060\u00072\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000207\u001a6\u00109\u001a\b\u0012\u0004\u0012\u0002H30\u000e"\u0004\b\u0000\u0010\f"\u0004\b\u0001\u00103*\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H30\u0010\u001a"\u0010:\u001a\u000e\u0012\u0004\u0012\u0002H
                                                   \u0012\u0004\u0012\u00020+0\u0004"\u0004\b\u0000\u0010
                                                   *\b\u0012\u0004\u0012\u0002H
                                                   0\u0007\u001a\u001f\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0086\u0002\u001a0\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001b0="\u0004\b\u0000\u0010
                                                   *\b\u0012\u0004\u0012\u0002H
                                                   0\u00072\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u0002H
                                                   \u0012\u0004\u0012\u00020\u001b0\u0010\u001a9\u0010?\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00060\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0086\u0004\u001a\u001c\u0010@\u001a\b\u0012\u0004\u0012\u0002H
                                                   0A"\u0004\b\u0000\u0010
                                                   *\b\u0012\u0004\u0012\u0002H
                                                   0\u0007\u001a:\u0010B\u001a\u00020\u001b"\u0004\b\u0000\u0010
                                                   *\b\u0012\u0004\u0012\u0002H
                                                   0\u00072\u0006\u0010-\u001a\u00020.2
                                                   \u0010/\u001a\u0006\u0012\u0002\b\u0003002\u0006\u0010C\u001a\u0002H
                                                   H\u0086\u0002¢\u0006\u0002\u0010D\u001a\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H
                                                   0E"\u0004\b\u0000\u0010
                                                   *\u0002H
                                                   ¢\u0006\u0002\u0010F\u001a\u001c\u0010G\u001a\b\u0012\u0004\u0012\u0002H
                                                   0H"\u0004\b\u0000\u0010
                                                   *\b\u0012\u0004\u0012\u0002H
                                                   0\u0007""\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006I""" }, d2 = { "updateCount", "Lkotlin/Function2;", "", "and", "Lgg/essential/elementa/state/MappedState;", "Lkotlin/Pair;", "", "Lgg/essential/elementa/state/State;", "other", "bindChildren", "T", "Lgg/essential/elementa/UIComponent;", "E", "list", "Lgg/essential/elementa/utils/ObservableList;", "filter", "Lkotlin/Function1;", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "mapper", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/utils/ObservableList;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;", "bindConstraints", "S", "state", "config", "Lgg/essential/elementa/UIConstraints;", "", "Lkotlin/ExtensionFunctionType;", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;", "bindEffect", "effect", "Lgg/essential/elementa/effects/Effect;", "delayed", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;Lgg/essential/elementa/state/State;Z)Lgg/essential/elementa/UIComponent;", "bindFloating", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/UIComponent;", "bindParent", "parent", "index", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;)Lgg/essential/elementa/UIComponent;", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;)Lgg/essential/elementa/UIComponent;", "empty", "", "getValue", "obj", "", "property", "Lkotlin/reflect/KProperty;", "(Lgg/essential/elementa/state/State;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "map", "V", "mapToPixels", "Lgg/essential/elementa/constraints/PixelConstraint;", "disabled", "", "enabled", "mapToSet", "mapToString", "not", "onSetValueAndNow", "Lkotlin/Function0;", "listener", "or", "readOnly", "Lgg/essential/gui/common/ReadOnlyState;", "setValue", "value", "(Lgg/essential/elementa/state/State;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Lgg/essential/elementa/state/BasicState;", "(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;", "weak", "Lgg/essential/gui/common/WeakState;", "essential" })
public final class StateExtensionsKt
{
    @NotNull
    private static final Function2<Integer, Integer, Integer> updateCount;
    
    @NotNull
    public static final <T> Function0<Unit> onSetValueAndNow(@NotNull final State<T> $this$onSetValueAndNow, @NotNull final Function1<? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter((Object)$this$onSetValueAndNow, "<this>");
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        final Function0<Unit> onSetValue = $this$onSetValueAndNow.onSetValue(listener);
        listener.invoke((Object)$this$onSetValueAndNow.get());
        return onSetValue;
    }
    
    @NotNull
    public static final <T extends UIComponent, S> T bindConstraints(@NotNull final T $this$bindConstraints, @NotNull final State<S> state, @NotNull final Function2<? super UIConstraints, ? super S, Unit> config) {
        Intrinsics.checkNotNullParameter((Object)$this$bindConstraints, "<this>");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        Intrinsics.checkNotNullParameter((Object)config, "config");
        final UIComponent $this$bindConstraints_u24lambda_u2d1 = $this$bindConstraints;
        onSetValueAndNow(state, (kotlin.jvm.functions.Function1<? super S, Unit>)new StateExtensionsKt$bindConstraints$1.StateExtensionsKt$bindConstraints$1$1((Function2)config, $this$bindConstraints_u24lambda_u2d1));
        return $this$bindConstraints;
    }
    
    @NotNull
    public static final <T extends UIComponent> T bindParent(@NotNull final T $this$bindParent, @NotNull final UIComponent parent, @NotNull final State<Boolean> state, final boolean delayed, @Nullable final Integer index) {
        Intrinsics.checkNotNullParameter((Object)$this$bindParent, "<this>");
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        return bindParent($this$bindParent, (State<UIComponent>)state.map((kotlin.jvm.functions.Function1<? super Boolean, ?>)new StateExtensionsKt$bindParent.StateExtensionsKt$bindParent$1(parent)), delayed, index);
    }
    
    public static /* synthetic */ UIComponent bindParent$default$6fcd5b6b(final UIComponent $this$bindParent, final UIComponent parent, final State state, boolean delayed, Integer index, final int n) {
        if ((n & 0x4) != 0x0) {
            delayed = false;
        }
        if ((n & 0x8) != 0x0) {
            index = null;
        }
        return bindParent($this$bindParent, parent, state, delayed, index);
    }
    
    @NotNull
    public static final <T extends UIComponent> T bindFloating(@NotNull final T $this$bindFloating, @NotNull final State<Boolean> state) {
        Intrinsics.checkNotNullParameter((Object)$this$bindFloating, "<this>");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final UIComponent $this$bindFloating_u24lambda_u2d2 = $this$bindFloating;
        onSetValueAndNow((State<Object>)state, (kotlin.jvm.functions.Function1<? super Object, Unit>)new StateExtensionsKt$bindFloating$1.StateExtensionsKt$bindFloating$1$1($this$bindFloating_u24lambda_u2d2));
        return $this$bindFloating;
    }
    
    @NotNull
    public static final <T extends UIComponent> T bindEffect$160adfe(@NotNull final T $this$bindEffect, @NotNull final Effect effect, @NotNull final State<Boolean> state) {
        Intrinsics.checkNotNullParameter((Object)$this$bindEffect, "<this>");
        Intrinsics.checkNotNullParameter((Object)effect, "effect");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final UIComponent $this$bindEffect_u24lambda_u2d3 = $this$bindEffect;
        onSetValueAndNow((State<Object>)state, (kotlin.jvm.functions.Function1<? super Object, Unit>)new StateExtensionsKt$bindEffect$1.StateExtensionsKt$bindEffect$1$1(true, $this$bindEffect_u24lambda_u2d3, effect));
        return $this$bindEffect;
    }
    
    public static /* synthetic */ UIComponent bindEffect$default$21ee9c1f$52d905c5(final UIComponent $this$bindEffect, final Effect effect, final State state) {
        return bindEffect$160adfe($this$bindEffect, effect, state);
    }
    
    @NotNull
    public static final <T extends UIComponent> T bindParent(@NotNull final T $this$bindParent, @NotNull final State<UIComponent> state, final boolean delayed, @Nullable final Integer index) {
        Intrinsics.checkNotNullParameter((Object)$this$bindParent, "<this>");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final UIComponent $this$bindParent_u24lambda_u2d4 = $this$bindParent;
        onSetValueAndNow((State<Object>)state, (kotlin.jvm.functions.Function1<? super Object, Unit>)new StateExtensionsKt$bindParent$2.StateExtensionsKt$bindParent$2$1(delayed, $this$bindParent_u24lambda_u2d4, index));
        return $this$bindParent;
    }
    
    public static /* synthetic */ UIComponent bindParent$default$2f137ab3$3e3b8d17(final UIComponent $this$bindParent, final State state) {
        return bindParent($this$bindParent, state, false, null);
    }
    
    @NotNull
    public static final <T> WeakState<T> weak(@NotNull final State<T> $this$weak) {
        Intrinsics.checkNotNullParameter((Object)$this$weak, "<this>");
        return new WeakState<T>($this$weak);
    }
    
    @NotNull
    public static final MappedState<String, Boolean> empty(@NotNull final State<String> $this$empty) {
        Intrinsics.checkNotNullParameter((Object)$this$empty, "<this>");
        return $this$empty.map((kotlin.jvm.functions.Function1<? super String, ? extends Boolean>)StateExtensionsKt$empty.StateExtensionsKt$empty$1.INSTANCE);
    }
    
    @NotNull
    public static final MappedState<Boolean, Boolean> not(@NotNull final State<Boolean> $this$not) {
        Intrinsics.checkNotNullParameter((Object)$this$not, "<this>");
        return $this$not.map((kotlin.jvm.functions.Function1<? super Boolean, ? extends Boolean>)StateExtensionsKt$not.StateExtensionsKt$not$1.INSTANCE);
    }
    
    @NotNull
    public static final MappedState<Pair<Boolean, Boolean>, Boolean> and(@NotNull final State<Boolean> $this$and, @NotNull final State<Boolean> other) {
        Intrinsics.checkNotNullParameter((Object)$this$and, "<this>");
        Intrinsics.checkNotNullParameter((Object)other, "other");
        return (MappedState<Pair<Boolean, Boolean>, Boolean>)$this$and.zip((State<Object>)other).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Boolean, Object>, ? extends Boolean>)StateExtensionsKt$and.StateExtensionsKt$and$1.INSTANCE);
    }
    
    @NotNull
    public static final MappedState<Pair<Boolean, Boolean>, Boolean> or(@NotNull final State<Boolean> $this$or, @NotNull final State<Boolean> other) {
        Intrinsics.checkNotNullParameter((Object)$this$or, "<this>");
        Intrinsics.checkNotNullParameter((Object)other, "other");
        return (MappedState<Pair<Boolean, Boolean>, Boolean>)$this$or.zip((State<Object>)other).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Boolean, Object>, ? extends Boolean>)StateExtensionsKt$or.StateExtensionsKt$or$1.INSTANCE);
    }
    
    public static final <T> T getValue(@NotNull final State<T> $this$getValue, @NotNull final Object obj, @NotNull final KProperty<?> property) {
        Intrinsics.checkNotNullParameter((Object)$this$getValue, "<this>");
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter((Object)property, "property");
        return $this$getValue.get();
    }
    
    public static final <T> void setValue(@NotNull final State<T> $this$setValue, @NotNull final Object obj, @NotNull final KProperty<?> property, final T value) {
        Intrinsics.checkNotNullParameter((Object)$this$setValue, "<this>");
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter((Object)property, "property");
        $this$setValue.set(value);
    }
    
    @NotNull
    public static final <T> MappedState<T, String> mapToString(@NotNull final State<T> $this$mapToString) {
        Intrinsics.checkNotNullParameter((Object)$this$mapToString, "<this>");
        return $this$mapToString.map((kotlin.jvm.functions.Function1<? super T, ? extends String>)StateExtensionsKt$mapToString.StateExtensionsKt$mapToString$1.INSTANCE);
    }
    
    @NotNull
    public static final <T> BasicState<T> state(final T $this$state) {
        return new BasicState<T>($this$state);
    }
    
    @NotNull
    public static final <T extends UIComponent, E> T bindChildren(@NotNull final T $this$bindChildren, @NotNull final ObservableList<E> list, @NotNull final Function1<? super E, Boolean> filter, @Nullable final Comparator<UIComponent> comparator, @NotNull final Function1<? super E, ? extends UIComponent> mapper) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* list */
        //     7: ldc_w           "list"
        //    10: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    13: aload_2         /* filter */
        //    14: ldc_w           "filter"
        //    17: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    20: aload           mapper
        //    22: ldc_w           "mapper"
        //    25: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    28: new             Ljava/util/ArrayList;
        //    31: dup            
        //    32: invokespecial   java/util/ArrayList.<init>:()V
        //    35: checkcast       Ljava/util/List;
        //    38: astore          components
        //    40: aload_1         /* list */
        //    41: aload           components
        //    43: aload_0         /* $this$bindChildren */
        //    44: aload_3         /* comparator */
        //    45: aload_2         /* filter */
        //    46: aload           mapper
        //    48: invokedynamic   BootstrapMethod #0, update:(Ljava/util/List;Lgg/essential/elementa/UIComponent;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Observer;
        //    53: invokevirtual   gg/essential/elementa/utils/ObservableList.addObserver:(Ljava/util/Observer;)V
        //    56: aload_1         /* list */
        //    57: checkcast       Ljava/lang/Iterable;
        //    60: astore          $this$forEachIndexed$iv
        //    62: iconst_0       
        //    63: istore          index$iv
        //    65: aload           $this$forEachIndexed$iv
        //    67: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    72: astore          8
        //    74: aload           8
        //    76: invokeinterface java/util/Iterator.hasNext:()Z
        //    81: ifeq            134
        //    84: aload           8
        //    86: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    91: astore          item$iv
        //    93: iload           index$iv
        //    95: iinc            index$iv, 1
        //    98: istore          10
        //   100: iload           10
        //   102: ifge            108
        //   105: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //   108: iload           10
        //   110: aload           item$iv
        //   112: astore          11
        //   114: istore          index
        //   116: aload_2         /* filter */
        //   117: aload           components
        //   119: aload           mapper
        //   121: aload_0         /* $this$bindChildren */
        //   122: aload_3         /* comparator */
        //   123: aload           e
        //   125: iload           index
        //   127: iconst_0       
        //   128: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindChildren$handleNewItem:(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lgg/essential/elementa/UIComponent;Ljava/util/Comparator;Ljava/lang/Object;IZ)V
        //   131: goto            74
        //   134: aload_0         /* $this$bindChildren */
        //   135: areturn        
        //    Signature:
        //  <T:Lgg/essential/elementa/UIComponent;E:Ljava/lang/Object;>(TT;Lgg/essential/elementa/utils/ObservableList<TE;>;Lkotlin/jvm/functions/Function1<-TE;Ljava/lang/Boolean;>;Ljava/util/Comparator<Lgg/essential/elementa/UIComponent;>;Lkotlin/jvm/functions/Function1<-TE;+Lgg/essential/elementa/UIComponent;>;)TT;
        //    MethodParameters:
        //  Name                Flags  
        //  ------------------  -----
        //  $this$bindChildren  
        //  list                
        //  filter              
        //  comparator          
        //  mapper              
        //    StackMapTable: 00 03 FF 00 4A 00 09 07 01 2A 00 07 00 8D 07 01 2C 07 00 8D 07 01 0A 00 01 07 01 2E 00 00 FD 00 21 07 00 04 01 FF 00 19 00 01 07 01 2A 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ UIComponent bindChildren$default$5794d177(final UIComponent $this$bindChildren, final ObservableList list, Function1 filter, Comparator comparator, final Function1 mapper, final int n) {
        if ((n & 0x2) != 0x0) {
            filter = (Function1)StateExtensionsKt$bindChildren.StateExtensionsKt$bindChildren$1.INSTANCE;
        }
        if ((n & 0x4) != 0x0) {
            comparator = null;
        }
        return bindChildren($this$bindChildren, (ObservableList<Object>)list, (kotlin.jvm.functions.Function1<? super Object, Boolean>)filter, comparator, (kotlin.jvm.functions.Function1<? super Object, ? extends UIComponent>)mapper);
    }
    
    @NotNull
    public static final <E, V> ObservableList<V> map(@NotNull final ObservableList<E> $this$map, @NotNull final Function1<? super E, ? extends V> mapper) {
        Intrinsics.checkNotNullParameter((Object)$this$map, "<this>");
        Intrinsics.checkNotNullParameter((Object)mapper, "mapper");
        final ObservableList result = new ObservableList((List<T>)new ArrayList<Object>());
        $this$map.addObserver(StateExtensionsKt::map$lambda-9);
        final Iterable $this$forEach$iv = $this$map;
        for (final Object it : $this$forEach$iv) {
            final Object element$iv = it;
            result.add(mapper.invoke(it));
        }
        return result;
    }
    
    @NotNull
    public static final <E, V> ObservableList<V> mapToSet(@NotNull final ObservableList<E> $this$mapToSet, @NotNull final Function1<? super E, ? extends V> mapper) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* mapper */
        //     7: ldc_w           "mapper"
        //    10: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    13: new             Lgg/essential/elementa/utils/ObservableList;
        //    16: dup            
        //    17: new             Ljava/util/ArrayList;
        //    20: dup            
        //    21: invokespecial   java/util/ArrayList.<init>:()V
        //    24: checkcast       Ljava/util/List;
        //    27: invokespecial   gg/essential/elementa/utils/ObservableList.<init>:(Ljava/util/List;)V
        //    30: astore_2        /* set */
        //    31: new             Ljava/util/LinkedHashMap;
        //    34: dup            
        //    35: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    38: checkcast       Ljava/util/Map;
        //    41: astore_3        /* entryCount */
        //    42: new             Ljava/util/ArrayList;
        //    45: dup            
        //    46: invokespecial   java/util/ArrayList.<init>:()V
        //    49: checkcast       Ljava/util/List;
        //    52: astore          allEntries
        //    54: aload_0         /* $this$mapToSet */
        //    55: aload           allEntries
        //    57: aload_3         /* entryCount */
        //    58: aload_2         /* set */
        //    59: aload_1         /* mapper */
        //    60: invokedynamic   BootstrapMethod #2, update:(Ljava/util/List;Ljava/util/Map;Lgg/essential/elementa/utils/ObservableList;Lkotlin/jvm/functions/Function1;)Ljava/util/Observer;
        //    65: invokevirtual   gg/essential/elementa/utils/ObservableList.addObserver:(Ljava/util/Observer;)V
        //    68: aload_0         /* $this$mapToSet */
        //    69: checkcast       Ljava/lang/Iterable;
        //    72: astore          $this$forEachIndexed$iv
        //    74: iconst_0       
        //    75: istore          index$iv
        //    77: aload           $this$forEachIndexed$iv
        //    79: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    84: astore          7
        //    86: aload           7
        //    88: invokeinterface java/util/Iterator.hasNext:()Z
        //    93: ifeq            143
        //    96: aload           7
        //    98: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   103: astore          item$iv
        //   105: iload           index$iv
        //   107: iinc            index$iv, 1
        //   110: istore          9
        //   112: iload           9
        //   114: ifge            120
        //   117: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //   120: iload           9
        //   122: aload           item$iv
        //   124: astore          10
        //   126: istore          index
        //   128: aload_1         /* mapper */
        //   129: aload           allEntries
        //   131: aload_3         /* entryCount */
        //   132: aload_2         /* set */
        //   133: iload           index
        //   135: aload           e
        //   137: invokestatic    gg/essential/gui/common/StateExtensionsKt.mapToSet$insert:(Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/util/Map;Lgg/essential/elementa/utils/ObservableList;ILjava/lang/Object;)V
        //   140: goto            86
        //   143: aload_2         /* set */
        //   144: areturn        
        //    Signature:
        //  <E:Ljava/lang/Object;V:Ljava/lang/Object;>(Lgg/essential/elementa/utils/ObservableList<TE;>;Lkotlin/jvm/functions/Function1<-TE;+TV;>;)Lgg/essential/elementa/utils/ObservableList<TV;>;
        //    MethodParameters:
        //  Name            Flags  
        //  --------------  -----
        //  $this$mapToSet  
        //  mapper          
        //    StackMapTable: 00 03 FF 00 56 00 08 00 07 00 8D 07 01 1E 07 01 69 07 01 0A 00 01 07 01 2E 00 00 FD 00 21 07 00 04 01 FF 00 16 00 03 00 00 07 01 1E 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final <T extends UIComponent> void bindChildren$sort(final Comparator<UIComponent> $comparator, final T $this_bindChildren) {
        if ($comparator != null) {
            if ($this_bindChildren instanceof final ScrollComponent scrollComponent) {
                scrollComponent.sortChildren($comparator);
            }
            else {
                CollectionsKt.sortWith((List)$this_bindChildren.getChildren(), (Comparator)$comparator);
            }
        }
    }
    
    private static final <E, T extends UIComponent> void bindChildren$handleNewItem(final Function1<? super E, Boolean> $filter, final List<UIComponent> components, final Function1<? super E, ? extends UIComponent> $mapper, final T $this_bindChildren, final Comparator<UIComponent> $comparator, final E item, final int index, final boolean delayed) {
        if (!(boolean)$filter.invoke((Object)item)) {
            components.add(index, null);
            return;
        }
        final UIComponent element = (UIComponent)$mapper.invoke((Object)item);
        components.add(index, element);
        final Function0 addAndSort = (Function0)new StateExtensionsKt$bindChildren$handleNewItem$addAndSort.StateExtensionsKt$bindChildren$handleNewItem$addAndSort$1((UIComponent)$this_bindChildren, element, (Comparator)$comparator);
        if (delayed) {
            Window.Companion.enqueueRenderOperation((Function0<Unit>)addAndSort);
        }
        else {
            addAndSort.invoke();
        }
    }
    
    private static final <T extends UIComponent> void bindChildren$removeItem(final List<UIComponent> components, final T $this_bindChildren, final Comparator<UIComponent> $comparator, final int index) {
        final UIComponent uiComponent = components.remove(index);
        if (uiComponent != null) {
            final UIComponent it = uiComponent;
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new StateExtensionsKt$bindChildren$removeItem$1.StateExtensionsKt$bindChildren$removeItem$1$1((UIComponent)$this_bindChildren, it, (Comparator)$comparator));
        }
    }
    
    private static final void bindChildren$lambda-7(final List $components, final UIComponent $this_bindChildren, final Comparator $comparator, final Function1 $filter, final Function1 $mapper, final Observable observable, final Object arg) {
        Intrinsics.checkNotNullParameter((Object)$components, "$components");
        Intrinsics.checkNotNullParameter((Object)$this_bindChildren, "$this_bindChildren");
        Intrinsics.checkNotNullParameter((Object)$filter, "$filter");
        Intrinsics.checkNotNullParameter((Object)$mapper, "$mapper");
        if (arg instanceof final ObservableRemoveEvent observableRemoveEvent) {
            bindChildren$removeItem($components, $this_bindChildren, $comparator, observableRemoveEvent.getElement().getIndex());
        }
        else if (arg instanceof final ObservableAddEvent observableAddEvent) {
            bindChildren$handleNewItem((kotlin.jvm.functions.Function1<? super Object, Boolean>)$filter, $components, (kotlin.jvm.functions.Function1<? super Object, ? extends UIComponent>)$mapper, $this_bindChildren, $comparator, observableAddEvent.getElement().getValue(), observableAddEvent.getElement().getIndex(), true);
        }
        else if (arg instanceof ObservableClearEvent) {
            final Iterable $this$forEach$iv = (Iterable)RangesKt.reversed((IntProgression)CollectionsKt.getIndices((Collection)$components));
            final Iterator iterator = $this$forEach$iv.iterator();
            while (iterator.hasNext()) {
                final int element$iv = ((IntIterator)iterator).nextInt();
                bindChildren$removeItem($components, $this_bindChildren, $comparator, element$iv);
            }
        }
    }
    
    private static final void map$lambda-9(final ObservableList $result, final Function1 $mapper, final Observable observable, final Object arg) {
        Intrinsics.checkNotNullParameter((Object)$result, "$result");
        Intrinsics.checkNotNullParameter((Object)$mapper, "$mapper");
        if (arg instanceof final ObservableRemoveEvent observableRemoveEvent) {
            $result.remove(observableRemoveEvent.getElement().getIndex());
        }
        else if (arg instanceof final ObservableAddEvent observableAddEvent) {
            $result.add(observableAddEvent.getElement().getIndex(), $mapper.invoke(observableAddEvent.getElement().getValue()));
        }
        else if (arg instanceof ObservableClearEvent) {
            $result.clear();
        }
    }
    
    private static final Integer mapToSet$insert$lambda-11(final Function2 $tmp0, final Integer p0, final Integer p1) {
        Intrinsics.checkNotNullParameter((Object)$tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter((Object)p0, "p0");
        Intrinsics.checkNotNullParameter((Object)p1, "p1");
        return (Integer)$tmp0.invoke((Object)p0, (Object)p1);
    }
    
    private static final <E, V> void mapToSet$insert(final Function1<? super E, ? extends V> $mapper, final List<V> allEntries, final Map<V, Integer> entryCount, final ObservableList<V> set, final int index, final E key) {
        final Object mappedValue = $mapper.invoke((Object)key);
        allEntries.add(index, (V)mappedValue);
        final Integer n = entryCount.merge((V)mappedValue, 1, StateExtensionsKt::mapToSet$insert$lambda-11);
        if (n != null) {
            if (n == 1) {
                set.add((V)mappedValue);
            }
        }
    }
    
    private static final Integer mapToSet$lambda-13$lambda-12(final Function2 $tmp0, final Integer p0, final Integer p1) {
        Intrinsics.checkNotNullParameter((Object)$tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter((Object)p0, "p0");
        Intrinsics.checkNotNullParameter((Object)p1, "p1");
        return (Integer)$tmp0.invoke((Object)p0, (Object)p1);
    }
    
    private static final void mapToSet$lambda-13(final List $allEntries, final Map $entryCount, final ObservableList $set, final Function1 $mapper, final Observable observable, final Object arg) {
        Intrinsics.checkNotNullParameter((Object)$allEntries, "$allEntries");
        Intrinsics.checkNotNullParameter((Object)$entryCount, "$entryCount");
        Intrinsics.checkNotNullParameter((Object)$set, "$set");
        Intrinsics.checkNotNullParameter((Object)$mapper, "$mapper");
        if (arg instanceof final ObservableRemoveEvent observableRemoveEvent) {
            final Object value = $allEntries.get(observableRemoveEvent.getElement().getIndex());
            $allEntries.remove(((ObservableRemoveEvent)arg).getElement().getIndex());
            if ($entryCount.merge(value, -1, StateExtensionsKt::mapToSet$lambda-13$lambda-12) == null) {
                $set.remove(value);
            }
        }
        else if (arg instanceof final ObservableAddEvent observableAddEvent) {
            mapToSet$insert((kotlin.jvm.functions.Function1<? super Object, ?>)$mapper, $allEntries, $entryCount, (ObservableList<Object>)$set, observableAddEvent.getElement().getIndex(), observableAddEvent.getElement().getValue());
        }
        else if (arg instanceof ObservableClearEvent) {
            $set.clear();
            $allEntries.clear();
            $entryCount.clear();
        }
    }
    
    public static final /* synthetic */ void access$bindChildren$sort(final Comparator $comparator, final UIComponent $this_bindChildren) {
        bindChildren$sort($comparator, $this_bindChildren);
    }
    
    static {
        updateCount = (Function2)StateExtensionsKt$updateCount.StateExtensionsKt$updateCount$1.INSTANCE;
    }
}
