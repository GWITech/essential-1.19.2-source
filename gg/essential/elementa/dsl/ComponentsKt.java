package gg.essential.elementa.dsl;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.effects.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import kotlin.properties.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\b\u0005H\u0086\f\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a$\u0010\u0007\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0004¢\u0006\u0002\u0010\t\u001a8\u0010\n\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u0005H\u0086\f\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a$\u0010\u000e\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0004¢\u0006\u0002\u0010\u0010\u001a@\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u0002H\u00010\u0012\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0086\u0002¢\u0006\u0002\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018" }, d2 = { "addChild", "T", "Lgg/essential/elementa/UIComponent;", "child", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;", "childOf", "parent", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;", "constrain", "config", "Lgg/essential/elementa/UIConstraints;", "", "effect", "Lgg/essential/elementa/effects/Effect;", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;", "provideDelegate", "Lkotlin/properties/ReadWriteProperty;", "", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;", "Elementa" })
public final class ComponentsKt
{
    @NotNull
    public static final <T extends UIComponent> T constrain(@NotNull final T $this$constrain, @NotNull final Function1<? super UIConstraints, Unit> config) {
        Intrinsics.checkNotNullParameter((Object)$this$constrain, "<this>");
        Intrinsics.checkNotNullParameter((Object)config, "config");
        final int $i$f$constrain = 0;
        final UIComponent $this$constrain_u24lambda_u2d0 = $this$constrain;
        final int n = 0;
        config.invoke((Object)$this$constrain_u24lambda_u2d0.getConstraints());
        return $this$constrain;
    }
    
    @NotNull
    public static final <T extends UIComponent> T addChild(@NotNull final T $this$addChild, @NotNull final Function1<? super T, ? extends UIComponent> child) {
        Intrinsics.checkNotNullParameter((Object)$this$addChild, "<this>");
        Intrinsics.checkNotNullParameter((Object)child, "child");
        final int $i$f$addChild = 0;
        final UIComponent $this$addChild_u24lambda_u2d1 = $this$addChild;
        final int n = 0;
        $this$addChild_u24lambda_u2d1.addChild((UIComponent)child.invoke((Object)$this$addChild_u24lambda_u2d1));
        return $this$addChild;
    }
    
    @NotNull
    public static final <T extends UIComponent> T childOf(@NotNull final T $this$childOf, @NotNull final UIComponent parent) {
        Intrinsics.checkNotNullParameter((Object)$this$childOf, "<this>");
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        final UIComponent $this$childOf_u24lambda_u2d2 = $this$childOf;
        final int n = 0;
        parent.addChild($this$childOf_u24lambda_u2d2);
        return $this$childOf;
    }
    
    @NotNull
    public static final <T extends UIComponent> T effect(@NotNull final T $this$effect, @NotNull final Effect effect) {
        Intrinsics.checkNotNullParameter((Object)$this$effect, "<this>");
        Intrinsics.checkNotNullParameter((Object)effect, "effect");
        final UIComponent $this$effect_u24lambda_u2d3 = $this$effect;
        final int n = 0;
        $this$effect_u24lambda_u2d3.enableEffect(effect);
        return $this$effect;
    }
    
    @NotNull
    public static final <T extends UIComponent> ReadWriteProperty<Object, T> provideDelegate(@NotNull final T $this$provideDelegate, @Nullable final Object thisRef, @NotNull final KProperty<?> property) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* property */
        //     7: ldc             "property"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: getstatic       kotlin/properties/Delegates.INSTANCE:Lkotlin/properties/Delegates;
        //    15: astore_3       
        //    16: aload_0         /* $this$provideDelegate */
        //    17: astore          4
        //    19: aload           4
        //    21: astore          it
        //    23: iconst_0       
        //    24: istore          $i$a$-also-ComponentsKt$provideDelegate$1
        //    26: aload_0         /* $this$provideDelegate */
        //    27: aload_2         /* property */
        //    28: invokeinterface kotlin/reflect/KProperty.getName:()Ljava/lang/String;
        //    33: invokevirtual   gg/essential/elementa/UIComponent.setComponentName:(Ljava/lang/String;)V
        //    36: aload           4
        //    38: astore          4
        //    40: nop            
        //    41: iconst_0       
        //    42: istore          $i$f$observable
        //    44: new             Lgg/essential/elementa/dsl/ComponentsKt$provideDelegate$$inlined$observable$1;
        //    47: dup            
        //    48: aload           initialValue$iv
        //    50: aload           initialValue$iv
        //    52: aload_2         /* property */
        //    53: invokespecial   gg/essential/elementa/dsl/ComponentsKt$provideDelegate$$inlined$observable$1.<init>:(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/reflect/KProperty;)V
        //    56: checkcast       Lkotlin/properties/ReadWriteProperty;
        //    59: nop            
        //    60: areturn        
        //    Signature:
        //  <T:Lgg/essential/elementa/UIComponent;>(TT;Ljava/lang/Object;Lkotlin/reflect/KProperty<*>;)Lkotlin/properties/ReadWriteProperty<Ljava/lang/Object;TT;>;
        //    MethodParameters:
        //  Name                   Flags  
        //  ---------------------  -----
        //  $this$provideDelegate  
        //  thisRef                
        //  property               
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
