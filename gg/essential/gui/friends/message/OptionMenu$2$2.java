package gg.essential.gui.friends.message;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.image.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/image/ImageFactory;", "invoke" })
static final class OptionMenu$2$2 extends Lambda implements Function1<ImageFactory, Unit> {
    final /* synthetic */ MappedState<Boolean, Color> $shadowColorState;
    final /* synthetic */ ReadWriteProperty<Object, UIContainer> $imageContainer$delegate;
    final /* synthetic */ MappedState<Pair<Boolean, Boolean>, Color> $primaryColor;
    
    OptionMenu$2$2(final MappedState<Boolean, Color> $shadowColorState, final ReadWriteProperty<Object, UIContainer> $imageContainer$delegate, final MappedState<Pair<Boolean, Boolean>, Color> $primaryColor) {
        this.$shadowColorState = $shadowColorState;
        this.$imageContainer$delegate = $imageContainer$delegate;
        this.$primaryColor = $primaryColor;
        super(1);
    }
    
    public final void invoke(@Nullable final ImageFactory it) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/friends/message/OptionMenu$2$2.$imageContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //     4: invokestatic    gg/essential/gui/friends/message/OptionMenu.access$lambda-11$lambda-8:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //     7: invokevirtual   gg/essential/elementa/components/UIContainer.clearChildren:()Lgg/essential/elementa/UIComponent;
        //    10: pop            
        //    11: aload_1         /* it */
        //    12: ifnull          100
        //    15: aload_1         /* it */
        //    16: invokevirtual   gg/essential/gui/image/ImageFactory.create:()Lgg/essential/elementa/components/UIImage;
        //    19: checkcast       Lgg/essential/elementa/UIComponent;
        //    22: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    25: astore_2       
        //    26: aload_0         /* this */
        //    27: getfield        gg/essential/gui/friends/message/OptionMenu$2$2.$primaryColor:Lgg/essential/elementa/state/MappedState;
        //    30: astore_3       
        //    31: aload_2         /* $this$constrain$iv */
        //    32: astore          4
        //    34: aload           4
        //    36: astore          $this$constrain_u24lambda_u2d0$iv
        //    38: aload           $this$constrain_u24lambda_u2d0$iv
        //    40: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    43: astore          $this$invoke_u24lambda_u2d0
        //    45: aload           $this$invoke_u24lambda_u2d0
        //    47: aload_3        
        //    48: checkcast       Lgg/essential/elementa/state/State;
        //    51: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //    54: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //    57: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //    60: aload           4
        //    62: aload_0         /* this */
        //    63: getfield        gg/essential/gui/friends/message/OptionMenu$2$2.$imageContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //    66: invokestatic    gg/essential/gui/friends/message/OptionMenu.access$lambda-11$lambda-8:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
        //    69: checkcast       Lgg/essential/elementa/UIComponent;
        //    72: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    75: new             Lgg/essential/gui/common/shadow/ShadowEffect;
        //    78: dup            
        //    79: iconst_0       
        //    80: invokespecial   gg/essential/gui/common/shadow/ShadowEffect.<init>:(B)V
        //    83: aload_0         /* this */
        //    84: getfield        gg/essential/gui/friends/message/OptionMenu$2$2.$shadowColorState:Lgg/essential/elementa/state/MappedState;
        //    87: checkcast       Lgg/essential/elementa/state/State;
        //    90: invokevirtual   gg/essential/gui/common/shadow/ShadowEffect.rebindColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowEffect;
        //    93: checkcast       Lgg/essential/elementa/effects/Effect;
        //    96: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //    99: pop            
        //   100: return         
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  it    
        //    StackMapTable: 00 01 F9 00 64
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((ImageFactory)p1);
        return Unit.INSTANCE;
    }
}