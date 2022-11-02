package gg.essential.gui.common;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import kotlin.jvm.functions.*;
import gg.essential.util.*;
import kotlin.ranges.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000J
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u001a\u0010\u001f\u001a\u00020\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001cJ\u0010\u0010!\u001a\u00020"2\u0006\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010	\u001a\b\u0012\u0004\u0012\u00020\u000b0
                                                   X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011R \u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006&""" }, d2 = { "Lgg/essential/gui/common/EssentialSlider;", "Lgg/essential/elementa/components/UIContainer;", "initialValueFraction", "", "(F)V", "fraction", "Lgg/essential/elementa/state/BasicState;", "getFraction", "()Lgg/essential/elementa/state/BasicState;", "hoveredState", "Lgg/essential/elementa/state/State;", "", "notchWidth", "", "sliderBar", "Lgg/essential/elementa/components/UIBlock;", "getSliderBar", "()Lgg/essential/elementa/components/UIBlock;", "sliderBar$delegate", "Lkotlin/properties/ReadWriteProperty;", "sliderCovered", "getSliderCovered", "sliderCovered$delegate", "sliderNotch", "getSliderNotch", "sliderNotch$delegate", "updates", "", "Lkotlin/Function1;", "", "afterInitialization", "onUpdateFraction", "callback", "reduceFractionToDisplay", "", "updateSlider", "mouseX", "updateSliderValue", "essential" })
public abstract class EssentialSlider extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final BasicState<Float> fraction;
    @NotNull
    private final ReadWriteProperty sliderBar$delegate;
    @NotNull
    private final ReadWriteProperty sliderNotch$delegate;
    @NotNull
    private State<Boolean> hoveredState;
    
    public EssentialSlider(final float initialValueFraction) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //     4: aload_0         /* this */
        //     5: new             Lgg/essential/elementa/state/BasicState;
        //     8: dup            
        //     9: fload_1         /* initialValueFraction */
        //    10: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    13: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    16: putfield        gg/essential/gui/common/EssentialSlider.fraction:Lgg/essential/elementa/state/BasicState;
        //    19: new             Ljava/util/ArrayList;
        //    22: invokespecial   java/util/ArrayList.<init>:()V
        //    25: aload_0         /* this */
        //    26: new             Lgg/essential/elementa/components/UIBlock;
        //    29: dup            
        //    30: getstatic       gg/essential/gui/EssentialPalette.BUTTON_HIGHLIGHT:Ljava/awt/Color;
        //    33: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //    36: checkcast       Lgg/essential/elementa/UIComponent;
        //    39: astore_2        /* $this$constrain$iv */
        //    40: aload_2         /* $this$constrain$iv */
        //    41: astore          4
        //    43: aload           4
        //    45: astore          $this$constrain_u24lambda_u2d0$iv
        //    47: aload           $this$constrain_u24lambda_u2d0$iv
        //    49: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    52: astore          6
        //    54: astore          7
        //    56: aload           $this$sliderBar_delegate_u24lambda_u2d0
        //    58: bipush          100
        //    60: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    63: checkcast       Ljava/lang/Number;
        //    66: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    69: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    72: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    75: aload           $this$sliderBar_delegate_u24lambda_u2d0
        //    77: bipush          100
        //    79: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    82: checkcast       Ljava/lang/Number;
        //    85: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    88: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    91: iconst_2       
        //    92: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    95: checkcast       Ljava/lang/Number;
        //    98: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   101: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   104: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   107: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   110: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   113: aload           $this$sliderBar_delegate_u24lambda_u2d0
        //   115: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   118: dup            
        //   119: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   122: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   125: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   128: aload           7
        //   130: aload           4
        //   132: aload_0         /* this */
        //   133: checkcast       Lgg/essential/elementa/UIComponent;
        //   136: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   139: aload_0         /* this */
        //   140: getstatic       gg/essential/gui/common/EssentialSlider.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   143: iconst_0       
        //   144: aaload         
        //   145: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   148: putfield        gg/essential/gui/common/EssentialSlider.sliderBar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   151: aload_0         /* this */
        //   152: new             Lgg/essential/elementa/components/UIBlock;
        //   155: dup            
        //   156: aconst_null    
        //   157: iconst_1       
        //   158: aconst_null    
        //   159: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   162: checkcast       Lgg/essential/elementa/UIComponent;
        //   165: astore_2        /* $this$constrain$iv */
        //   166: aload_2         /* $this$constrain$iv */
        //   167: astore          4
        //   169: aload           4
        //   171: astore          $this$constrain_u24lambda_u2d0$iv
        //   173: aload           $this$constrain_u24lambda_u2d0$iv
        //   175: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   178: astore          6
        //   180: astore          7
        //   182: aload           $this$sliderNotch_delegate_u24lambda_u2d1
        //   184: iconst_3       
        //   185: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   188: checkcast       Ljava/lang/Number;
        //   191: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   194: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   197: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   200: aload           $this$sliderNotch_delegate_u24lambda_u2d1
        //   202: bipush          100
        //   204: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   207: checkcast       Ljava/lang/Number;
        //   210: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   213: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   216: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   219: aload           $this$sliderNotch_delegate_u24lambda_u2d1
        //   221: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   224: dup            
        //   225: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   228: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   231: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   234: aload           $this$sliderNotch_delegate_u24lambda_u2d1
        //   236: new             Lgg/essential/gui/common/EssentialSlider$sliderNotch$2$1;
        //   239: dup            
        //   240: aload_0         /* this */
        //   241: invokespecial   gg/essential/gui/common/EssentialSlider$sliderNotch$2$1.<init>:(Lgg/essential/gui/common/EssentialSlider;)V
        //   244: checkcast       Lkotlin/jvm/functions/Function1;
        //   247: invokestatic    gg/essential/elementa/dsl/BasicConstraintsKt.basicXConstraint:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/constraints/XConstraint;
        //   250: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   253: aload           7
        //   255: aload           4
        //   257: aload_0         /* this */
        //   258: checkcast       Lgg/essential/elementa/UIComponent;
        //   261: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   264: aload_0         /* this */
        //   265: getstatic       gg/essential/gui/common/EssentialSlider.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   268: iconst_1       
        //   269: aaload         
        //   270: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   273: putfield        gg/essential/gui/common/EssentialSlider.sliderNotch$delegate:Lkotlin/properties/ReadWriteProperty;
        //   276: new             Lgg/essential/elementa/components/UIBlock;
        //   279: dup            
        //   280: getstatic       gg/essential/gui/EssentialPalette.ACCENT_BLUE:Ljava/awt/Color;
        //   283: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   286: checkcast       Lgg/essential/elementa/UIComponent;
        //   289: astore_2        /* $this$constrain$iv */
        //   290: aload_2         /* $this$constrain$iv */
        //   291: astore          4
        //   293: aload           4
        //   295: astore          $this$constrain_u24lambda_u2d0$iv
        //   297: aload           $this$constrain_u24lambda_u2d0$iv
        //   299: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   302: astore          $this$sliderCovered_delegate_u24lambda_u2d2
        //   304: aload           $this$sliderCovered_delegate_u24lambda_u2d2
        //   306: bipush          100
        //   308: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   311: checkcast       Ljava/lang/Number;
        //   314: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   317: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   320: iconst_2       
        //   321: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   324: checkcast       Ljava/lang/Number;
        //   327: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   330: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   333: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   336: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   339: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   342: aload           $this$sliderCovered_delegate_u24lambda_u2d2
        //   344: new             Lgg/essential/gui/common/EssentialSlider$sliderCovered$2$1;
        //   347: dup            
        //   348: aload_0         /* this */
        //   349: invokespecial   gg/essential/gui/common/EssentialSlider$sliderCovered$2$1.<init>:(Lgg/essential/gui/common/EssentialSlider;)V
        //   352: checkcast       Lkotlin/jvm/functions/Function1;
        //   355: invokestatic    gg/essential/elementa/dsl/BasicConstraintsKt.basicWidthConstraint:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/constraints/WidthConstraint;
        //   358: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   361: aload           $this$sliderCovered_delegate_u24lambda_u2d2
        //   363: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   366: dup            
        //   367: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   370: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   373: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   376: aload           4
        //   378: aload_0         /* this */
        //   379: checkcast       Lgg/essential/elementa/UIComponent;
        //   382: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   385: aload_0         /* this */
        //   386: getstatic       gg/essential/gui/common/EssentialSlider.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   389: iconst_2       
        //   390: aaload         
        //   391: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   394: pop            
        //   395: new             Lgg/essential/elementa/state/BasicState;
        //   398: dup            
        //   399: iconst_0       
        //   400: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   403: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   406: astore_2        /* mouseHeld */
        //   407: aload_0         /* this */
        //   408: checkcast       Lgg/essential/elementa/UIComponent;
        //   411: astore_3        /* $this$onLeftClick$iv */
        //   412: aload_3         /* $this$onLeftClick$iv */
        //   413: new             Lgg/essential/gui/common/EssentialSlider$special$$inlined$onLeftClick$1;
        //   416: dup            
        //   417: aload_2         /* mouseHeld */
        //   418: aload_0         /* this */
        //   419: invokespecial   gg/essential/gui/common/EssentialSlider$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/elementa/state/BasicState;Lgg/essential/gui/common/EssentialSlider;)V
        //   422: checkcast       Lkotlin/jvm/functions/Function2;
        //   425: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   428: pop            
        //   429: aload_0         /* this */
        //   430: new             Lgg/essential/gui/common/EssentialSlider$2;
        //   433: dup            
        //   434: aload_2         /* mouseHeld */
        //   435: invokespecial   gg/essential/gui/common/EssentialSlider$2.<init>:(Lgg/essential/elementa/state/BasicState;)V
        //   438: checkcast       Lkotlin/jvm/functions/Function1;
        //   441: invokevirtual   gg/essential/gui/common/EssentialSlider.onMouseRelease:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   444: pop            
        //   445: aload_0         /* this */
        //   446: invokespecial   gg/essential/gui/common/EssentialSlider.getSliderBar:()Lgg/essential/elementa/components/UIBlock;
        //   449: new             Lgg/essential/gui/common/EssentialSlider$3;
        //   452: dup            
        //   453: aload_2         /* mouseHeld */
        //   454: aload_0         /* this */
        //   455: invokespecial   gg/essential/gui/common/EssentialSlider$3.<init>:(Lgg/essential/elementa/state/BasicState;Lgg/essential/gui/common/EssentialSlider;)V
        //   458: checkcast       Lkotlin/jvm/functions/Function4;
        //   461: invokevirtual   gg/essential/elementa/components/UIBlock.onMouseDrag:(Lkotlin/jvm/functions/Function4;)Lgg/essential/elementa/UIComponent;
        //   464: pop            
        //   465: aload_0         /* this */
        //   466: aload_0         /* this */
        //   467: checkcast       Lgg/essential/elementa/UIComponent;
        //   470: iconst_0       
        //   471: iconst_0       
        //   472: iconst_3       
        //   473: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   476: aload_0         /* this */
        //   477: invokespecial   gg/essential/gui/common/EssentialSlider.getSliderNotch:()Lgg/essential/elementa/components/UIBlock;
        //   480: checkcast       Lgg/essential/elementa/UIComponent;
        //   483: iconst_0       
        //   484: iconst_0       
        //   485: iconst_3       
        //   486: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   489: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   492: checkcast       Lgg/essential/elementa/state/State;
        //   495: aload_2         /* mouseHeld */
        //   496: checkcast       Lgg/essential/elementa/state/State;
        //   499: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   502: checkcast       Lgg/essential/elementa/state/State;
        //   505: putfield        gg/essential/gui/common/EssentialSlider.hoveredState:Lgg/essential/elementa/state/State;
        //   508: aload_0         /* this */
        //   509: invokespecial   gg/essential/gui/common/EssentialSlider.getSliderNotch:()Lgg/essential/elementa/components/UIBlock;
        //   512: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   515: aload_0         /* this */
        //   516: getfield        gg/essential/gui/common/EssentialSlider.hoveredState:Lgg/essential/elementa/state/State;
        //   519: invokevirtual   gg/essential/gui/EssentialPalette.getTextColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   522: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   525: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   528: invokevirtual   gg/essential/elementa/components/UIBlock.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   531: pop            
        //   532: return         
        //    MethodParameters:
        //  Name                  Flags  
        //  --------------------  -----
        //  initialValueFraction  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final BasicState<Float> getFraction() {
        return this.fraction;
    }
    
    private final UIBlock getSliderBar() {
        return (UIBlock)this.sliderBar$delegate.getValue((Object)this, (KProperty)EssentialSlider.$$delegatedProperties[0]);
    }
    
    private final UIBlock getSliderNotch() {
        return (UIBlock)this.sliderNotch$delegate.getValue((Object)this, (KProperty)EssentialSlider.$$delegatedProperties[1]);
    }
    
    @Override
    public void afterInitialization() {
        super.afterInitialization();
        ExtensionsKt.bindEssentialTooltip$default$5d648aca(this.getSliderNotch(), this.hoveredState, this.fraction.map((kotlin.jvm.functions.Function1<? super Object, ?>)new EssentialSlider$afterInitialization.EssentialSlider$afterInitialization$1(this)), null, 0.0f, null, null, 60);
    }
    
    private final void updateSlider(final float mouseX) {
        final float updatedValue = this.updateSliderValue(((Number)RangesKt.coerceIn((Comparable)((mouseX - this.getSliderNotch().getWidth() / 2.0f) / (this.getWidth() - this.getSliderNotch().getWidth())), RangesKt.rangeTo(0.0f, 1.0f))).floatValue());
        this.fraction.set(updatedValue);
    }
    
    @NotNull
    public abstract String reduceFractionToDisplay(final float p0);
    
    public float updateSliderValue(final float fraction) {
        return fraction;
    }
    
    public static final /* synthetic */ void access$updateSlider(final EssentialSlider $this, final float mouseX) {
        $this.updateSlider(mouseX);
    }
    
    public static final /* synthetic */ int access$getNotchWidth$p$68584c70() {
        return 3;
    }
    
    public static final /* synthetic */ UIBlock access$getSliderNotch(final EssentialSlider $this) {
        return $this.getSliderNotch();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialSlider.class, "sliderBar", "getSliderBar()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialSlider.class, "sliderNotch", "getSliderNotch()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialSlider.class, "sliderCovered", "getSliderCovered()Lgg/essential/elementa/components/UIBlock;", 0)) };
    }
}
