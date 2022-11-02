package gg.essential.elementa.dsl;

import kotlin.properties.*;
import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, d1 = { "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000" }, d2 = { "kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib" })
public static final class ComponentsKt$provideDelegate$$inlined$observable$1 extends ObservableProperty<T> {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ KProperty $property$inlined;
    
    public ComponentsKt$provideDelegate$$inlined$observable$1(final Object $captured_local_variable$1, final Object $super_call_param$2, final KProperty $property$inlined) {
        this.$initialValue = $captured_local_variable$1;
        this.$property$inlined = $property$inlined;
        super($super_call_param$2);
    }
    
    protected void afterChange(@NotNull final KProperty<?> property, final T oldValue, final T newValue) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "property"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* property */
        //     7: aload_2         /* oldValue */
        //     8: aload_3         /* newValue */
        //     9: checkcast       Lgg/essential/elementa/UIComponent;
        //    12: astore          4
        //    14: checkcast       Lgg/essential/elementa/UIComponent;
        //    17: astore          5
        //    19: astore          $noName_0
        //    21: iconst_0       
        //    22: istore          $i$a$-observable-ComponentsKt$provideDelegate$2
        //    24: aload           value
        //    26: aload_0         /* this */
        //    27: getfield        gg/essential/elementa/dsl/ComponentsKt$provideDelegate$$inlined$observable$1.$property$inlined:Lkotlin/reflect/KProperty;
        //    30: invokeinterface kotlin/reflect/KProperty.getName:()Ljava/lang/String;
        //    35: invokevirtual   gg/essential/elementa/UIComponent.setComponentName:(Ljava/lang/String;)V
        //    38: nop            
        //    39: return         
        //    Signature:
        //  (Lkotlin/reflect/KProperty<*>;TT;TT;)V
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  property  
        //  oldValue  
        //  newValue  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}