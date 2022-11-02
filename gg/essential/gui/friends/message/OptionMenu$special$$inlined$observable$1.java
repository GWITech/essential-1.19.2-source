package gg.essential.gui.friends.message;

import kotlin.properties.*;
import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0019
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004*\u0001\u0000\b
                                                   \u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032
                                                   \u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006	¸\u0006\u0000""" }, d2 = { "kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib" })
public static final class OptionMenu$special$$inlined$observable$1 extends ObservableProperty<Float> {
    final /* synthetic */ OptionMenu this$0;
    
    public OptionMenu$special$$inlined$observable$1(final Object $initialValue, final OptionMenu this$0) {
        this.this$0 = this$0;
        super($initialValue);
    }
    
    protected void afterChange(@NotNull final KProperty<?> property, final Float oldValue, final Float newValue) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "property"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* oldValue */
        //     7: aload_3         /* newValue */
        //     8: checkcast       Ljava/lang/Number;
        //    11: invokevirtual   java/lang/Number.floatValue:()F
        //    14: fstore          4
        //    16: checkcast       Ljava/lang/Number;
        //    19: invokevirtual   java/lang/Number.floatValue:()F
        //    22: pop            
        //    23: aload_0         /* this */
        //    24: getfield        gg/essential/gui/friends/message/OptionMenu$special$$inlined$observable$1.this$0:Lgg/essential/gui/friends/message/OptionMenu;
        //    27: invokestatic    gg/essential/gui/friends/message/OptionMenu.access$getOutlineColorState$p:(Lgg/essential/gui/friends/message/OptionMenu;)Lgg/essential/elementa/state/BasicState;
        //    30: getstatic       gg/essential/gui/EssentialPalette.BUTTON_HIGHLIGHT:Ljava/awt/Color;
        //    33: fload           newValue
        //    35: invokestatic    gg/essential/elementa/utils/ExtensionsKt.withAlpha:(Ljava/awt/Color;F)Ljava/awt/Color;
        //    38: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //    41: return         
        //    Signature:
        //  (Lkotlin/reflect/KProperty<*>;Ljava/lang/Float;Ljava/lang/Float;)V
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