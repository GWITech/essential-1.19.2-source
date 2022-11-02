package gg.essential.gui.studio;

import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010	\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\f\u0010\b\u001a\u0004\b
                                                   \u0010\u000bR\u001b\u0010\r\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010\b\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0010""" }, d2 = { "Lgg/essential/gui/studio/CosmeticOption$CartGridButton;", "Lgg/essential/elementa/components/UIBlock;", "(Lgg/essential/gui/studio/CosmeticOption;)V", "addToCart", "Lgg/essential/gui/common/shadow/ShadowIcon;", "getAddToCart", "()Lgg/essential/gui/common/shadow/ShadowIcon;", "addToCart$delegate", "Lkotlin/properties/ReadWriteProperty;", "content", "getContent", "()Lgg/essential/elementa/components/UIBlock;", "content$delegate", "removeFromCart", "getRemoveFromCart", "removeFromCart$delegate", "essential" })
public final class CartGridButton extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty content$delegate;
    final /* synthetic */ CosmeticOption this$0;
    
    public CartGridButton(final CosmeticOption this$0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1         /* this$0 */
        //     2: putfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //     5: aload_0         /* this */
        //     6: aconst_null    
        //     7: iconst_1       
        //     8: aconst_null    
        //     9: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    12: aload_0         /* this */
        //    13: new             Lgg/essential/elementa/components/UIBlock;
        //    16: dup            
        //    17: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //    20: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //    23: checkcast       Lgg/essential/elementa/UIComponent;
        //    26: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    29: astore_2        /* $this$constrain$iv */
        //    30: aload_2         /* $this$constrain$iv */
        //    31: astore          4
        //    33: aload           4
        //    35: astore          $this$constrain_u24lambda_u2d0$iv
        //    37: aload           $this$constrain_u24lambda_u2d0$iv
        //    39: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    42: astore          6
        //    44: astore          7
        //    46: aload           $this$content_delegate_u24lambda_u2d0
        //    48: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //    51: dup            
        //    52: fconst_0       
        //    53: iconst_1       
        //    54: aconst_null    
        //    55: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    58: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    61: iconst_2       
        //    62: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    65: checkcast       Ljava/lang/Number;
        //    68: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    71: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    74: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //    77: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    80: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    83: aload           $this$content_delegate_u24lambda_u2d0
        //    85: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //    88: dup            
        //    89: fconst_0       
        //    90: iconst_1       
        //    91: aconst_null    
        //    92: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    95: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    98: iconst_2       
        //    99: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   102: checkcast       Ljava/lang/Number;
        //   105: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   108: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   111: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   114: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   117: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   120: aload           7
        //   122: aload           4
        //   124: aload_0         /* this */
        //   125: checkcast       Lgg/essential/elementa/UIComponent;
        //   128: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   131: aload_0         /* this */
        //   132: getstatic       gg/essential/gui/studio/CosmeticOption$CartGridButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   135: iconst_0       
        //   136: aaload         
        //   137: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   140: putfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //   143: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //   146: dup            
        //   147: getstatic       gg/essential/gui/EssentialPalette.REMOVE_FROM_CART_17X7:Lgg/essential/gui/image/ImageFactory;
        //   150: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //   153: checkcast       Lgg/essential/elementa/UIComponent;
        //   156: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   159: checkcast       Lgg/essential/gui/common/shadow/ShadowIcon;
        //   162: new             Lgg/essential/elementa/state/BasicState;
        //   165: dup            
        //   166: getstatic       gg/essential/gui/EssentialPalette.GREEN:Ljava/awt/Color;
        //   169: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   172: checkcast       Lgg/essential/elementa/state/State;
        //   175: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //   178: checkcast       Lgg/essential/elementa/UIComponent;
        //   181: aload_0         /* this */
        //   182: invokespecial   gg/essential/gui/studio/CosmeticOption$CartGridButton.getContent:()Lgg/essential/elementa/components/UIBlock;
        //   185: checkcast       Lgg/essential/elementa/UIComponent;
        //   188: aload_0         /* this */
        //   189: getfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //   192: invokevirtual   gg/essential/gui/studio/CosmeticOption.isInCart:()Lgg/essential/elementa/state/MappedState;
        //   195: checkcast       Lgg/essential/elementa/state/State;
        //   198: iconst_0       
        //   199: aconst_null    
        //   200: bipush          12
        //   202: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   205: aload_0         /* this */
        //   206: getstatic       gg/essential/gui/studio/CosmeticOption$CartGridButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   209: iconst_1       
        //   210: aaload         
        //   211: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   214: pop            
        //   215: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //   218: dup            
        //   219: getstatic       gg/essential/gui/EssentialPalette.ADD_TO_CART_17X7:Lgg/essential/gui/image/ImageFactory;
        //   222: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //   225: checkcast       Lgg/essential/elementa/UIComponent;
        //   228: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   231: checkcast       Lgg/essential/gui/common/shadow/ShadowIcon;
        //   234: new             Lgg/essential/elementa/state/BasicState;
        //   237: dup            
        //   238: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //   241: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   244: checkcast       Lgg/essential/elementa/state/State;
        //   247: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //   250: checkcast       Lgg/essential/elementa/UIComponent;
        //   253: aload_0         /* this */
        //   254: invokespecial   gg/essential/gui/studio/CosmeticOption$CartGridButton.getContent:()Lgg/essential/elementa/components/UIBlock;
        //   257: checkcast       Lgg/essential/elementa/UIComponent;
        //   260: aload_0         /* this */
        //   261: getfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //   264: invokevirtual   gg/essential/gui/studio/CosmeticOption.isInCart:()Lgg/essential/elementa/state/MappedState;
        //   267: checkcast       Lgg/essential/elementa/state/State;
        //   270: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   273: checkcast       Lgg/essential/elementa/state/State;
        //   276: iconst_0       
        //   277: aconst_null    
        //   278: bipush          12
        //   280: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   283: aload_0         /* this */
        //   284: getstatic       gg/essential/gui/studio/CosmeticOption$CartGridButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   287: iconst_2       
        //   288: aaload         
        //   289: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   292: pop            
        //   293: aload_0         /* this */
        //   294: checkcast       Lgg/essential/elementa/UIComponent;
        //   297: astore_2        /* $this$constrain$iv */
        //   298: aload_2         /* $this$constrain$iv */
        //   299: astore          4
        //   301: aload           4
        //   303: astore          $this$constrain_u24lambda_u2d0$iv
        //   305: aload           $this$constrain_u24lambda_u2d0$iv
        //   307: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   310: astore          $this$_init__u24lambda_u2d1
        //   312: aload           $this$_init__u24lambda_u2d1
        //   314: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   317: dup            
        //   318: fconst_0       
        //   319: iconst_1       
        //   320: aconst_null    
        //   321: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   324: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   327: iconst_2       
        //   328: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   331: checkcast       Ljava/lang/Number;
        //   334: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   337: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   340: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   343: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   346: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   349: aload           $this$_init__u24lambda_u2d1
        //   351: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   354: dup            
        //   355: fconst_0       
        //   356: iconst_1       
        //   357: aconst_null    
        //   358: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   361: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   364: iconst_2       
        //   365: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   368: checkcast       Ljava/lang/Number;
        //   371: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   374: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   377: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   380: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   383: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   386: aload_0         /* this */
        //   387: checkcast       Lgg/essential/elementa/UIComponent;
        //   390: iconst_0       
        //   391: iconst_0       
        //   392: iconst_3       
        //   393: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   396: astore_2        /* hovered */
        //   397: aload_0         /* this */
        //   398: aload_2         /* hovered */
        //   399: getstatic       gg/essential/gui/studio/CosmeticOption$CartGridButton$6.INSTANCE:Lgg/essential/gui/studio/CosmeticOption$CartGridButton$6;
        //   402: checkcast       Lkotlin/jvm/functions/Function1;
        //   405: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   408: checkcast       Lgg/essential/elementa/state/State;
        //   411: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   414: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   417: invokevirtual   gg/essential/gui/studio/CosmeticOption$CartGridButton.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   420: pop            
        //   421: aload_0         /* this */
        //   422: checkcast       Lgg/essential/elementa/UIComponent;
        //   425: astore_3       
        //   426: aload_0         /* this */
        //   427: getfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //   430: astore          4
        //   432: aload_3         /* $this$onLeftClick$iv */
        //   433: new             Lgg/essential/gui/studio/CosmeticOption$CartGridButton$special$$inlined$onLeftClick$1;
        //   436: dup            
        //   437: aload           4
        //   439: aload_2         /* hovered */
        //   440: invokespecial   gg/essential/gui/studio/CosmeticOption$CartGridButton$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;Lgg/essential/elementa/state/State;)V
        //   443: checkcast       Lkotlin/jvm/functions/Function2;
        //   446: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   449: pop            
        //   450: aload_0         /* this */
        //   451: checkcast       Lgg/essential/elementa/UIComponent;
        //   454: aload_2         /* hovered */
        //   455: aload_0         /* this */
        //   456: getfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.this$0:Lgg/essential/gui/studio/CosmeticOption;
        //   459: invokevirtual   gg/essential/gui/studio/CosmeticOption.isInCart:()Lgg/essential/elementa/state/MappedState;
        //   462: getstatic       gg/essential/gui/studio/CosmeticOption$CartGridButton$8.INSTANCE:Lgg/essential/gui/studio/CosmeticOption$CartGridButton$8;
        //   465: checkcast       Lkotlin/jvm/functions/Function1;
        //   468: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   471: checkcast       Lgg/essential/elementa/state/State;
        //   474: aconst_null    
        //   475: fconst_0       
        //   476: aconst_null    
        //   477: aconst_null    
        //   478: bipush          60
        //   480: invokestatic    gg/essential/util/ExtensionsKt.bindEssentialTooltip$default$5d648aca:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //   483: pop            
        //   484: return         
        //    Signature:
        //  (Lgg/essential/gui/studio/CosmeticOption;)V [from metadata: ()V]
        //  
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  this$0  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIBlock getContent() {
        return (UIBlock)this.content$delegate.getValue((Object)this, (KProperty)CartGridButton.$$delegatedProperties[0]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CartGridButton.class, "content", "getContent()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CartGridButton.class, "removeFromCart", "getRemoveFromCart()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CartGridButton.class, "addToCart", "getAddToCart()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)) };
    }
}
