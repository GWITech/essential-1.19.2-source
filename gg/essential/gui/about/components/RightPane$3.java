package gg.essential.gui.about.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import kotlin.properties.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "scrollPercentage", "", "<anonymous parameter 1>", "invoke" })
static final class RightPane$3 extends Lambda implements Function2<Float, Float, Unit> {
    final /* synthetic */ Ref$BooleanRef $scrollTopVisible;
    final /* synthetic */ ReadWriteProperty<Object, UIComponent> $scrollToTopButton$delegate;
    
    RightPane$3(final Ref$BooleanRef $scrollTopVisible, final ReadWriteProperty<Object, UIComponent> $scrollToTopButton$delegate) {
        this.$scrollTopVisible = $scrollTopVisible;
        this.$scrollToTopButton$delegate = $scrollToTopButton$delegate;
        super(2);
    }
    
    public final void invoke$2548a35(final float scrollPercentage) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: f2d            
        //     2: ldc2_w          0.01
        //     5: dcmpl          
        //     6: ifle            97
        //     9: aload_0         /* this */
        //    10: getfield        gg/essential/gui/about/components/RightPane$3.$scrollTopVisible:Lkotlin/jvm/internal/Ref$BooleanRef;
        //    13: getfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //    16: ifne            97
        //    19: aload_0         /* this */
        //    20: getfield        gg/essential/gui/about/components/RightPane$3.$scrollToTopButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //    23: invokestatic    gg/essential/gui/about/components/RightPane.access$_init_$lambda-8:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //    26: astore_2       
        //    27: aload_0         /* this */
        //    28: getfield        gg/essential/gui/about/components/RightPane$3.$scrollTopVisible:Lkotlin/jvm/internal/Ref$BooleanRef;
        //    31: astore_3       
        //    32: aload_2         /* $this$animate$iv */
        //    33: astore          4
        //    35: aload           4
        //    37: astore          $this$animate_u24lambda_u2d0$iv
        //    39: aload           $this$animate_u24lambda_u2d0$iv
        //    41: invokevirtual   gg/essential/elementa/UIComponent.makeAnimation:()Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //    44: astore          anim$iv
        //    46: aload           anim$iv
        //    48: astore          $this$invoke_u24lambda_u2d0
        //    50: aload           $this$invoke_u24lambda_u2d0
        //    52: getstatic       gg/essential/elementa/constraints/animation/Animations.OUT_EXP:Lgg/essential/elementa/constraints/animation/Animations;
        //    55: checkcast       Lgg/essential/elementa/constraints/animation/AnimationStrategy;
        //    58: ldc             0.5
        //    60: iconst_0       
        //    61: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    64: checkcast       Ljava/lang/Number;
        //    67: iconst_1       
        //    68: iconst_0       
        //    69: iconst_2       
        //    70: aconst_null    
        //    71: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    74: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    77: fconst_0       
        //    78: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.setYAnimation:(Lgg/essential/elementa/constraints/animation/AnimationStrategy;FLgg/essential/elementa/constraints/YConstraint;F)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //    81: pop            
        //    82: aload_3        
        //    83: iconst_1       
        //    84: putfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //    87: aload           $this$animate_u24lambda_u2d0$iv
        //    89: aload           anim$iv
        //    91: invokevirtual   gg/essential/elementa/UIComponent.animateTo:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;)V
        //    94: goto            188
        //    97: fload_1         /* scrollPercentage */
        //    98: f2d            
        //    99: ldc2_w          0.01
        //   102: dcmpg          
        //   103: ifgt            188
        //   106: aload_0         /* this */
        //   107: getfield        gg/essential/gui/about/components/RightPane$3.$scrollTopVisible:Lkotlin/jvm/internal/Ref$BooleanRef;
        //   110: getfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //   113: ifeq            188
        //   116: aload_0         /* this */
        //   117: getfield        gg/essential/gui/about/components/RightPane$3.$scrollToTopButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //   120: invokestatic    gg/essential/gui/about/components/RightPane.access$_init_$lambda-8:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //   123: astore_2       
        //   124: aload_0         /* this */
        //   125: getfield        gg/essential/gui/about/components/RightPane$3.$scrollTopVisible:Lkotlin/jvm/internal/Ref$BooleanRef;
        //   128: astore_3       
        //   129: aload_2         /* $this$animate$iv */
        //   130: astore          4
        //   132: aload           4
        //   134: astore          $this$animate_u24lambda_u2d0$iv
        //   136: aload           $this$animate_u24lambda_u2d0$iv
        //   138: invokevirtual   gg/essential/elementa/UIComponent.makeAnimation:()Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //   141: astore          anim$iv
        //   143: aload           anim$iv
        //   145: astore          $this$invoke_u24lambda_u2d1
        //   147: aload           $this$invoke_u24lambda_u2d1
        //   149: getstatic       gg/essential/elementa/constraints/animation/Animations.OUT_EXP:Lgg/essential/elementa/constraints/animation/Animations;
        //   152: checkcast       Lgg/essential/elementa/constraints/animation/AnimationStrategy;
        //   155: ldc             0.5
        //   157: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   160: dup            
        //   161: fconst_0       
        //   162: iconst_0       
        //   163: iconst_3       
        //   164: aconst_null    
        //   165: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   168: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   171: fconst_0       
        //   172: invokevirtual   gg/essential/elementa/constraints/animation/AnimatingConstraints.setYAnimation:(Lgg/essential/elementa/constraints/animation/AnimationStrategy;FLgg/essential/elementa/constraints/YConstraint;F)Lgg/essential/elementa/constraints/animation/AnimatingConstraints;
        //   175: pop            
        //   176: aload_3        
        //   177: iconst_0       
        //   178: putfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //   181: aload           $this$animate_u24lambda_u2d0$iv
        //   183: aload           anim$iv
        //   185: invokevirtual   gg/essential/elementa/UIComponent.animateTo:(Lgg/essential/elementa/constraints/animation/AnimatingConstraints;)V
        //   188: return         
        //    MethodParameters:
        //  Name              Flags  
        //  ----------------  -----
        //  scrollPercentage  
        //    StackMapTable: 00 02 FB 00 61 F9 00 5A
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        final float floatValue = ((Number)p1).floatValue();
        ((Number)p2).floatValue();
        this.invoke$2548a35(floatValue);
        return Unit.INSTANCE;
    }
}