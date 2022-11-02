package gg.essential.gui.friends.message;

import kotlin.jvm.functions.*;
import kotlin.*;
import java.awt.*;
import kotlin.properties.*;
import gg.essential.elementa.effects.*;
import gg.essential.elementa.*;
import kotlin.reflect.*;
import gg.essential.elementa.constraints.animation.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.image.*;
import gg.essential.gui.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.events.*;
import gg.essential.elementa.components.*;
import java.util.*;
import gg.essential.elementa.dsl.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000d
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0011
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002\u0018\u0000 .2\u00020\u0001:\u0003./0B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a
                                                   \u0012\u0006\b\u0001\u0012\u00020\u00070\u0006"\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010%\u001a\u00020\fH\u0002J\u0006\u0010&\u001a\u00020\fJ\u0014\u0010'\u001a\u00020\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0016\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0016\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003R\u001a\u0010	\u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\f0\u000b0
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082D¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002
                                                   \u0000R+\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012
                                                   \u0004\b \u0010\u0013\u001a\u0004\b\u001c\u0010\u001d"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0"X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010$\u001a\u00020\u0003X\u0082D¢\u0006\u0002
                                                   \u0000¨\u00061²\u0006
                                                   \u00102\u001a\u000203X\u008a\u0084\u0002²\u0006
                                                   \u00104\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006
                                                   \u00105\u001a\u000206X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/friends/message/OptionMenu;", "Lgg/essential/elementa/components/UIContainer;", "posX", "", "posY", "options", "", "Lgg/essential/gui/friends/message/OptionMenu$Option;", "(FF[Lgg/essential/gui/friends/message/OptionMenu$Option;)V", "closeActions", "", "Lkotlin/Function0;", "", "horizontalContainerPadding", "optionContainer", "Lgg/essential/elementa/components/UIBlock;", "getOptionContainer", "()Lgg/essential/elementa/components/UIBlock;", "optionContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "optionContent", "getOptionContent", "()Lgg/essential/elementa/components/UIContainer;", "optionContent$delegate", "optionsOutlineEffect", "Lgg/essential/elementa/effects/OutlineEffect;", "<set-?>", "outlineColorAlpha", "getOutlineColorAlpha", "()F", "setOutlineColorAlpha", "(F)V", "outlineColorAlpha$delegate", "outlineColorState", "Lgg/essential/elementa/state/BasicState;", "Ljava/awt/Color;", "outlineWidth", "handleClose", "init", "onClose", "action", "reposition", "x", "Lgg/essential/elementa/constraints/XConstraint;", "y", "Lgg/essential/elementa/constraints/YConstraint;", "Companion", "Option", "Position", "essential", "container", "Lgg/essential/elementa/UIComponent;", "imageContainer", "text", "Lgg/essential/elementa/components/UIText;" })
public final class OptionMenu extends UIContainer
{
    @NotNull
    public static final Companion Companion;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final List<Function0<Unit>> closeActions;
    @NotNull
    private final BasicState<Color> outlineColorState;
    @NotNull
    private final ReadWriteProperty outlineColorAlpha$delegate;
    @NotNull
    private final OutlineEffect optionsOutlineEffect;
    @NotNull
    private final ReadWriteProperty optionContainer$delegate;
    @NotNull
    private final ReadWriteProperty optionContent$delegate;
    
    public OptionMenu(final float posX, final float posY, @NotNull final Option... options) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "options"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    10: aload_0         /* this */
        //    11: new             Ljava/util/ArrayList;
        //    14: dup            
        //    15: invokespecial   java/util/ArrayList.<init>:()V
        //    18: checkcast       Ljava/util/List;
        //    21: putfield        gg/essential/gui/friends/message/OptionMenu.closeActions:Ljava/util/List;
        //    24: aload_0         /* this */
        //    25: new             Lgg/essential/elementa/state/BasicState;
        //    28: dup            
        //    29: getstatic       gg/essential/gui/EssentialPalette.BUTTON_HIGHLIGHT:Ljava/awt/Color;
        //    32: invokestatic    gg/essential/elementa/utils/ExtensionsKt.invisible:(Ljava/awt/Color;)Ljava/awt/Color;
        //    35: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    38: putfield        gg/essential/gui/friends/message/OptionMenu.outlineColorState:Lgg/essential/elementa/state/BasicState;
        //    41: aload_0         /* this */
        //    42: getstatic       kotlin/properties/Delegates.INSTANCE:Lkotlin/properties/Delegates;
        //    45: pop            
        //    46: fconst_0       
        //    47: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    50: astore          initialValue$iv
        //    52: new             Lgg/essential/gui/friends/message/OptionMenu$special$$inlined$observable$1;
        //    55: dup            
        //    56: aload           initialValue$iv
        //    58: aload_0         /* this */
        //    59: invokespecial   gg/essential/gui/friends/message/OptionMenu$special$$inlined$observable$1.<init>:(Ljava/lang/Object;Lgg/essential/gui/friends/message/OptionMenu;)V
        //    62: checkcast       Lkotlin/properties/ReadWriteProperty;
        //    65: putfield        gg/essential/gui/friends/message/OptionMenu.outlineColorAlpha$delegate:Lkotlin/properties/ReadWriteProperty;
        //    68: aload_0         /* this */
        //    69: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //    72: astore          4
        //    74: new             Lgg/essential/elementa/effects/OutlineEffect;
        //    77: dup            
        //    78: aload           4
        //    80: fconst_2       
        //    81: iconst_1       
        //    82: iconst_1       
        //    83: aconst_null    
        //    84: bipush          16
        //    86: aconst_null    
        //    87: invokespecial   gg/essential/elementa/effects/OutlineEffect.<init>:(Ljava/awt/Color;FZZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    90: aload_0         /* this */
        //    91: getfield        gg/essential/gui/friends/message/OptionMenu.outlineColorState:Lgg/essential/elementa/state/BasicState;
        //    94: checkcast       Lgg/essential/elementa/state/State;
        //    97: invokevirtual   gg/essential/elementa/effects/OutlineEffect.bindColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/effects/OutlineEffect;
        //   100: putfield        gg/essential/gui/friends/message/OptionMenu.optionsOutlineEffect:Lgg/essential/elementa/effects/OutlineEffect;
        //   103: aload_0         /* this */
        //   104: new             Lgg/essential/elementa/components/UIBlock;
        //   107: dup            
        //   108: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   111: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   114: checkcast       Lgg/essential/elementa/UIComponent;
        //   117: astore          $this$constrain$iv
        //   119: aload           $this$constrain$iv
        //   121: astore          6
        //   123: aload           6
        //   125: astore          $this$constrain_u24lambda_u2d0$iv
        //   127: aload           $this$constrain_u24lambda_u2d0$iv
        //   129: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   132: astore          9
        //   134: astore          30
        //   136: aload           $this$optionContainer_delegate_u24lambda_u2d1
        //   138: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   141: dup            
        //   142: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   145: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   148: fconst_2       
        //   149: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   152: checkcast       Ljava/lang/Number;
        //   155: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   158: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   161: iconst_2       
        //   162: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   165: checkcast       Ljava/lang/Number;
        //   168: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.times:(Lgg/essential/elementa/constraints/SuperConstraint;Ljava/lang/Number;)Lgg/essential/elementa/constraints/ScaleConstraint;
        //   171: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   174: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   177: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   180: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   183: aload           $this$optionContainer_delegate_u24lambda_u2d1
        //   185: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   188: dup            
        //   189: fconst_0       
        //   190: iconst_1       
        //   191: aconst_null    
        //   192: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   195: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   198: bipush          6
        //   200: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   203: checkcast       Ljava/lang/Number;
        //   206: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   209: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   212: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   215: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   218: fconst_2       
        //   219: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   222: checkcast       Ljava/lang/Number;
        //   225: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   228: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   231: iconst_2       
        //   232: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   235: checkcast       Ljava/lang/Number;
        //   238: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.times:(Lgg/essential/elementa/constraints/SuperConstraint;Ljava/lang/Number;)Lgg/essential/elementa/constraints/ScaleConstraint;
        //   241: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   244: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   247: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   250: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   253: aload           30
        //   255: aload           6
        //   257: aload_0         /* this */
        //   258: checkcast       Lgg/essential/elementa/UIComponent;
        //   261: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   264: aload_0         /* this */
        //   265: getfield        gg/essential/gui/friends/message/OptionMenu.optionsOutlineEffect:Lgg/essential/elementa/effects/OutlineEffect;
        //   268: checkcast       Lgg/essential/elementa/effects/Effect;
        //   271: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   274: aload_0         /* this */
        //   275: getstatic       gg/essential/gui/friends/message/OptionMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   278: iconst_1       
        //   279: aaload         
        //   280: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   283: putfield        gg/essential/gui/friends/message/OptionMenu.optionContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   286: aload_0         /* this */
        //   287: new             Lgg/essential/elementa/components/UIContainer;
        //   290: dup            
        //   291: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   294: checkcast       Lgg/essential/elementa/UIComponent;
        //   297: astore          $this$constrain$iv
        //   299: aload           $this$constrain$iv
        //   301: astore          6
        //   303: aload           6
        //   305: astore          $this$constrain_u24lambda_u2d0$iv
        //   307: aload           $this$constrain_u24lambda_u2d0$iv
        //   309: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   312: astore          9
        //   314: astore          30
        //   316: aload           $this$optionContent_delegate_u24lambda_u2d2
        //   318: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   321: dup            
        //   322: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   325: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   328: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   331: aload           $this$optionContent_delegate_u24lambda_u2d2
        //   333: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   336: dup            
        //   337: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   340: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   343: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   346: aload           $this$optionContent_delegate_u24lambda_u2d2
        //   348: getstatic       gg/essential/gui/friends/message/OptionMenu$optionContent$2$1.INSTANCE:Lgg/essential/gui/friends/message/OptionMenu$optionContent$2$1;
        //   351: checkcast       Lkotlin/jvm/functions/Function1;
        //   354: invokestatic    gg/essential/elementa/dsl/BasicConstraintsKt.basicWidthConstraint:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/constraints/WidthConstraint;
        //   357: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   360: ldc_w           16.0
        //   363: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   366: checkcast       Ljava/lang/Number;
        //   369: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   372: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   375: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   378: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   381: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   384: aload           $this$optionContent_delegate_u24lambda_u2d2
        //   386: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   389: dup            
        //   390: fconst_0       
        //   391: iconst_1       
        //   392: aconst_null    
        //   393: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   396: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   399: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   402: aload           30
        //   404: aload           6
        //   406: aload_0         /* this */
        //   407: invokespecial   gg/essential/gui/friends/message/OptionMenu.getOptionContainer:()Lgg/essential/elementa/components/UIBlock;
        //   410: checkcast       Lgg/essential/elementa/UIComponent;
        //   413: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   416: aload_0         /* this */
        //   417: getstatic       gg/essential/gui/friends/message/OptionMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   420: iconst_2       
        //   421: aaload         
        //   422: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   425: putfield        gg/essential/gui/friends/message/OptionMenu.optionContent$delegate:Lkotlin/properties/ReadWriteProperty;
        //   428: aload_0         /* this */
        //   429: checkcast       Lgg/essential/elementa/UIComponent;
        //   432: astore          $this$constrain$iv
        //   434: aload           $this$constrain$iv
        //   436: astore          6
        //   438: aload           6
        //   440: astore          $this$constrain_u24lambda_u2d0$iv
        //   442: aload           $this$constrain_u24lambda_u2d0$iv
        //   444: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   447: astore          $this$_init__u24lambda_u2d3
        //   449: aload           $this$_init__u24lambda_u2d3
        //   451: bipush          100
        //   453: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   456: checkcast       Ljava/lang/Number;
        //   459: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   462: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   465: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   468: aload           $this$_init__u24lambda_u2d3
        //   470: bipush          100
        //   472: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   475: checkcast       Ljava/lang/Number;
        //   478: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   481: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   484: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   487: aload           $this$_init__u24lambda_u2d3
        //   489: iconst_0       
        //   490: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   493: checkcast       Ljava/lang/Number;
        //   496: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   499: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   502: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   505: aload           $this$_init__u24lambda_u2d3
        //   507: iconst_0       
        //   508: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   511: checkcast       Ljava/lang/Number;
        //   514: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   517: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   520: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   523: aload_0         /* this */
        //   524: fload_1         /* posX */
        //   525: fload_2         /* posY */
        //   526: invokevirtual   gg/essential/gui/friends/message/OptionMenu.reposition:(FF)V
        //   529: aload_3         /* options */
        //   530: astore          $this$forEach$iv
        //   532: iconst_0       
        //   533: istore          6
        //   535: aload           $this$forEach$iv
        //   537: arraylength    
        //   538: istore          7
        //   540: iload           6
        //   542: iload           7
        //   544: if_icmpge       1076
        //   547: aload           $this$forEach$iv
        //   549: iload           6
        //   551: aaload         
        //   552: astore          element$iv
        //   554: aload           element$iv
        //   556: astore          9
        //   558: aload           9
        //   560: invokevirtual   gg/essential/gui/friends/message/OptionMenu$Option.component1:()Lgg/essential/elementa/state/State;
        //   563: astore          textState
        //   565: aload           9
        //   567: invokevirtual   gg/essential/gui/friends/message/OptionMenu$Option.component2:()Lgg/essential/elementa/state/State;
        //   570: astore          disabled
        //   572: aload           9
        //   574: invokevirtual   gg/essential/gui/friends/message/OptionMenu$Option.component3:()Lgg/essential/elementa/state/State;
        //   577: astore          image
        //   579: aload           9
        //   581: invokevirtual   gg/essential/gui/friends/message/OptionMenu$Option.component4:()Ljava/awt/Color;
        //   584: astore          color
        //   586: aload           9
        //   588: invokevirtual   gg/essential/gui/friends/message/OptionMenu$Option.component5:()Ljava/awt/Color;
        //   591: astore          hoverColor
        //   593: aload           9
        //   595: invokevirtual   gg/essential/gui/friends/message/OptionMenu$Option.component6:()Ljava/awt/Color;
        //   598: astore          shadowColor
        //   600: aload           9
        //   602: invokevirtual   gg/essential/gui/friends/message/OptionMenu$Option.component7:()Ljava/awt/Color;
        //   605: astore          hoveredShadow
        //   607: aload           9
        //   609: invokevirtual   gg/essential/gui/friends/message/OptionMenu$Option.component8:()Lkotlin/jvm/functions/Function0;
        //   612: astore          action
        //   614: new             Lgg/essential/elementa/components/UIBlock;
        //   617: dup            
        //   618: aconst_null    
        //   619: iconst_1       
        //   620: aconst_null    
        //   621: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   624: checkcast       Lgg/essential/elementa/UIComponent;
        //   627: astore          $this$constrain$iv
        //   629: aload           $this$constrain$iv
        //   631: astore          20
        //   633: aload           20
        //   635: astore          $this$constrain_u24lambda_u2d0$iv
        //   637: aload           $this$constrain_u24lambda_u2d0$iv
        //   639: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   642: astore          $this$lambda_u2d11_u24lambda_u2d4
        //   644: aload           $this$lambda_u2d11_u24lambda_u2d4
        //   646: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   649: dup            
        //   650: fconst_0       
        //   651: iconst_0       
        //   652: iconst_3       
        //   653: aconst_null    
        //   654: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   657: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   660: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   663: aload           $this$lambda_u2d11_u24lambda_u2d4
        //   665: bipush          100
        //   667: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   670: checkcast       Ljava/lang/Number;
        //   673: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   676: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   679: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   682: aload           $this$lambda_u2d11_u24lambda_u2d4
        //   684: bipush          20
        //   686: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   689: checkcast       Ljava/lang/Number;
        //   692: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   695: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   698: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   701: aload           20
        //   703: astore          $this$onLeftClick$iv
        //   705: aload           $this$onLeftClick$iv
        //   707: new             Lgg/essential/gui/friends/message/OptionMenu$_init_$lambda-11$$inlined$onLeftClick$1;
        //   710: dup            
        //   711: aload           disabled
        //   713: aload           action
        //   715: invokespecial   gg/essential/gui/friends/message/OptionMenu$_init_$lambda-11$$inlined$onLeftClick$1.<init>:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function0;)V
        //   718: checkcast       Lkotlin/jvm/functions/Function2;
        //   721: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   724: aload_0         /* this */
        //   725: invokespecial   gg/essential/gui/friends/message/OptionMenu.getOptionContent:()Lgg/essential/elementa/components/UIContainer;
        //   728: checkcast       Lgg/essential/elementa/UIComponent;
        //   731: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   734: aconst_null    
        //   735: getstatic       gg/essential/gui/friends/message/OptionMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   738: iconst_3       
        //   739: aaload         
        //   740: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   743: astore          container$delegate
        //   745: aload           container$delegate
        //   747: invokestatic    gg/essential/gui/friends/message/OptionMenu.lambda-11$lambda-6:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //   750: iconst_0       
        //   751: iconst_0       
        //   752: iconst_3       
        //   753: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   756: astore          hoveredState
        //   758: aload           container$delegate
        //   760: invokestatic    gg/essential/gui/friends/message/OptionMenu.lambda-11$lambda-6:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //   763: aload           hoveredState
        //   765: getstatic       gg/essential/gui/friends/message/OptionMenu$2$1.INSTANCE:Lgg/essential/gui/friends/message/OptionMenu$2$1;
        //   768: checkcast       Lkotlin/jvm/functions/Function1;
        //   771: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   774: checkcast       Lgg/essential/elementa/state/State;
        //   777: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   780: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   783: invokevirtual   gg/essential/elementa/UIComponent.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   786: pop            
        //   787: aload           hoveredState
        //   789: aload           disabled
        //   791: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   794: new             Lgg/essential/gui/friends/message/OptionMenu$2$primaryColor$1;
        //   797: dup            
        //   798: aload           hoverColor
        //   800: aload           color
        //   802: invokespecial   gg/essential/gui/friends/message/OptionMenu$2$primaryColor$1.<init>:(Ljava/awt/Color;Ljava/awt/Color;)V
        //   805: checkcast       Lkotlin/jvm/functions/Function1;
        //   808: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   811: astore          primaryColor
        //   813: aload           hoveredState
        //   815: new             Lgg/essential/gui/friends/message/OptionMenu$2$shadowColorState$1;
        //   818: dup            
        //   819: aload           hoveredShadow
        //   821: aload           shadowColor
        //   823: invokespecial   gg/essential/gui/friends/message/OptionMenu$2$shadowColorState$1.<init>:(Ljava/awt/Color;Ljava/awt/Color;)V
        //   826: checkcast       Lkotlin/jvm/functions/Function1;
        //   829: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   832: astore          shadowColorState
        //   834: new             Lgg/essential/elementa/components/UIContainer;
        //   837: dup            
        //   838: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   841: checkcast       Lgg/essential/elementa/UIComponent;
        //   844: astore          $this$constrain$iv
        //   846: aload           $this$constrain$iv
        //   848: astore          24
        //   850: aload           24
        //   852: astore          $this$constrain_u24lambda_u2d0$iv
        //   854: aload           $this$constrain_u24lambda_u2d0$iv
        //   856: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   859: astore          $this$lambda_u2d11_u24lambda_u2d7
        //   861: aload           $this$lambda_u2d11_u24lambda_u2d7
        //   863: aload           image
        //   865: getstatic       gg/essential/gui/friends/message/OptionMenu$2$imageContainer$2$1.INSTANCE:Lgg/essential/gui/friends/message/OptionMenu$2$imageContainer$2$1;
        //   868: checkcast       Lkotlin/jvm/functions/Function1;
        //   871: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   874: checkcast       Lgg/essential/elementa/state/State;
        //   877: iconst_0       
        //   878: iconst_0       
        //   879: iconst_3       
        //   880: aconst_null    
        //   881: invokestatic    gg/essential/elementa/state/ExtensionsKt.pixels$default:(Lgg/essential/elementa/state/State;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   884: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   887: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   890: aload           $this$lambda_u2d11_u24lambda_u2d7
        //   892: bipush          100
        //   894: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   897: checkcast       Ljava/lang/Number;
        //   900: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   903: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   906: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   909: aload           24
        //   911: aload           container$delegate
        //   913: invokestatic    gg/essential/gui/friends/message/OptionMenu.lambda-11$lambda-6:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //   916: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   919: aconst_null    
        //   920: getstatic       gg/essential/gui/friends/message/OptionMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   923: iconst_4       
        //   924: aaload         
        //   925: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   928: astore          imageContainer$delegate
        //   930: aload           image
        //   932: new             Lgg/essential/gui/friends/message/OptionMenu$2$2;
        //   935: dup            
        //   936: aload           shadowColorState
        //   938: aload           imageContainer$delegate
        //   940: aload           primaryColor
        //   942: invokespecial   gg/essential/gui/friends/message/OptionMenu$2$2.<init>:(Lgg/essential/elementa/state/MappedState;Lkotlin/properties/ReadWriteProperty;Lgg/essential/elementa/state/MappedState;)V
        //   945: checkcast       Lkotlin/jvm/functions/Function1;
        //   948: invokestatic    gg/essential/gui/common/StateExtensionsKt.onSetValueAndNow:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   951: pop            
        //   952: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   955: dup            
        //   956: aconst_null    
        //   957: iconst_0       
        //   958: aconst_null    
        //   959: iconst_0       
        //   960: iconst_0       
        //   961: iconst_0       
        //   962: bipush          55
        //   964: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   967: aload           shadowColorState
        //   969: checkcast       Lgg/essential/elementa/state/State;
        //   972: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindShadowColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   975: aload           textState
        //   977: invokevirtual   gg/essential/elementa/components/UIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   980: checkcast       Lgg/essential/elementa/UIComponent;
        //   983: astore          $this$constrain$iv
        //   985: aload           $this$constrain$iv
        //   987: astore          26
        //   989: aload           26
        //   991: astore          $this$constrain_u24lambda_u2d0$iv
        //   993: aload           $this$constrain_u24lambda_u2d0$iv
        //   995: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   998: astore          $this$lambda_u2d11_u24lambda_u2d9
        //  1000: aload           $this$lambda_u2d11_u24lambda_u2d9
        //  1002: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1005: dup            
        //  1006: fconst_0       
        //  1007: iconst_0       
        //  1008: iconst_3       
        //  1009: aconst_null    
        //  1010: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1013: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1016: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1019: aload           $this$lambda_u2d11_u24lambda_u2d9
        //  1021: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1024: dup            
        //  1025: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1028: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1031: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1034: aload           $this$lambda_u2d11_u24lambda_u2d9
        //  1036: aload           primaryColor
        //  1038: checkcast       Lgg/essential/elementa/state/State;
        //  1041: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1044: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1047: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1050: aload           26
        //  1052: aload           container$delegate
        //  1054: invokestatic    gg/essential/gui/friends/message/OptionMenu.lambda-11$lambda-6:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //  1057: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1060: aconst_null    
        //  1061: getstatic       gg/essential/gui/friends/message/OptionMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1064: iconst_5       
        //  1065: aaload         
        //  1066: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1069: pop            
        //  1070: iinc            6, 1
        //  1073: goto            540
        //  1076: aload_0         /* this */
        //  1077: new             Lgg/essential/gui/friends/message/OptionMenu$3;
        //  1080: dup            
        //  1081: aload_0         /* this */
        //  1082: invokespecial   gg/essential/gui/friends/message/OptionMenu$3.<init>:(Lgg/essential/gui/friends/message/OptionMenu;)V
        //  1085: checkcast       Lkotlin/jvm/functions/Function2;
        //  1088: invokevirtual   gg/essential/gui/friends/message/OptionMenu.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1091: pop            
        //  1092: aload_0         /* this */
        //  1093: new             Lgg/essential/gui/friends/message/OptionMenu$4;
        //  1096: dup            
        //  1097: aload_0         /* this */
        //  1098: invokespecial   gg/essential/gui/friends/message/OptionMenu$4.<init>:(Lgg/essential/gui/friends/message/OptionMenu;)V
        //  1101: checkcast       Lkotlin/jvm/functions/Function3;
        //  1104: invokevirtual   gg/essential/gui/friends/message/OptionMenu.onKeyType:(Lkotlin/jvm/functions/Function3;)Lgg/essential/elementa/UIComponent;
        //  1107: pop            
        //  1108: return         
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  posX     
        //  posY     
        //  options  
        //    StackMapTable: 00 02 FF 02 1C 00 08 07 00 02 00 00 00 07 01 26 00 01 01 00 00 FF 02 17 00 01 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final float getOutlineColorAlpha() {
        return ((Number)this.outlineColorAlpha$delegate.getValue((Object)this, (KProperty)OptionMenu.$$delegatedProperties[0])).floatValue();
    }
    
    private final void setOutlineColorAlpha(final float <set-?>) {
        this.outlineColorAlpha$delegate.setValue((Object)this, (KProperty)OptionMenu.$$delegatedProperties[0], (Object)<set-?>);
    }
    
    private final UIBlock getOptionContainer() {
        return (UIBlock)this.optionContainer$delegate.getValue((Object)this, (KProperty)OptionMenu.$$delegatedProperties[1]);
    }
    
    private final UIContainer getOptionContent() {
        return (UIContainer)this.optionContent$delegate.getValue((Object)this, (KProperty)OptionMenu.$$delegatedProperties[2]);
    }
    
    private final void handleClose() {
        for (final Function0 closeAction : this.closeActions) {
            closeAction.invoke();
        }
        this.releaseWindowFocus();
        this.getParent().removeChild(this);
    }
    
    public final void onClose(@NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter((Object)action, "action");
        this.closeActions.add(action);
    }
    
    public final void init() {
        super.afterInitialization();
        UIComponent.animate$default(this, (KMutableProperty0)new OptionMenu$init.OptionMenu$init$1((Object)this), Animations.OUT_EXP, 0.5f, 1.0f, 0.0f, 8, null);
        this.grabWindowFocus();
    }
    
    public final void reposition(final float x, final float y) {
        this.reposition(UtilitiesKt.getPixels(x), UtilitiesKt.getPixels(y));
    }
    
    public final void reposition(@NotNull final XConstraint x, @NotNull final YConstraint y) {
        Intrinsics.checkNotNullParameter((Object)x, "x");
        Intrinsics.checkNotNullParameter((Object)y, "y");
        this.getOptionContainer().setX(ConstraintsKt.coerceAtMost(x, UtilitiesKt.pixels$default(0, true, false, 2, null)));
        this.getOptionContainer().setY(ConstraintsKt.coerceAtMost(y, UtilitiesKt.pixels$default(0, true, false, 2, null)));
    }
    
    private static final UIComponent lambda-11$lambda-6(final ReadWriteProperty<Object, UIComponent> $container$delegate) {
        return (UIComponent)$container$delegate.getValue((Object)null, (KProperty)OptionMenu.$$delegatedProperties[3]);
    }
    
    private static final UIContainer lambda-11$lambda-8(final ReadWriteProperty<Object, UIContainer> $imageContainer$delegate) {
        return (UIContainer)$imageContainer$delegate.getValue((Object)null, (KProperty)OptionMenu.$$delegatedProperties[4]);
    }
    
    public static final /* synthetic */ float access$getOutlineColorAlpha(final OptionMenu $this) {
        return $this.getOutlineColorAlpha();
    }
    
    public static final /* synthetic */ void access$setOutlineColorAlpha(final OptionMenu $this, final float <set-?>) {
        $this.setOutlineColorAlpha(<set-?>);
    }
    
    public static final /* synthetic */ BasicState access$getOutlineColorState$p(final OptionMenu $this) {
        return $this.outlineColorState;
    }
    
    public static final /* synthetic */ void access$handleClose(final OptionMenu $this) {
        $this.handleClose();
    }
    
    public static final /* synthetic */ UIContainer access$lambda-11$lambda-8(final ReadWriteProperty $imageContainer$delegate) {
        return lambda-11$lambda-8((ReadWriteProperty<Object, UIContainer>)$imageContainer$delegate);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)OptionMenu.class, "outlineColorAlpha", "getOutlineColorAlpha()F", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)OptionMenu.class, "optionContainer", "getOptionContainer()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)OptionMenu.class, "optionContent", "getOptionContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)OptionMenu.class, "container", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)OptionMenu.class, "imageContainer", "<v#1>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)OptionMenu.class, "text", "<v#2>", 0)) };
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000<
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0002
                                                       \u0002\b\u001b
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012
                                                       \b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010	\u001a\u00020
                                                       \u0012\b\b\u0002\u0010\u000b\u001a\u00020
                                                       \u0012\b\b\u0002\u0010\f\u001a\u00020
                                                       \u0012\b\b\u0002\u0010\r\u001a\u00020
                                                       \u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011Bk\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a
                                                       \u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020
                                                       \u0012\b\b\u0002\u0010\u000b\u001a\u00020
                                                       \u0012\b\b\u0002\u0010\f\u001a\u00020
                                                       \u0012\b\b\u0002\u0010\r\u001a\u00020
                                                       \u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0014J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0011\u0010"\u001a
                                                       \u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u00c6\u0003J	\u0010#\u001a\u00020
                                                       H\u00c6\u0003J	\u0010$\u001a\u00020
                                                       H\u00c6\u0003J	\u0010%\u001a\u00020
                                                       H\u00c6\u0003J	\u0010&\u001a\u00020
                                                       H\u00c6\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003Js\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a
                                                       \u0012\u0006\u0012\u0004\u0018\u00010\b0\u00052\b\b\u0002\u0010\u0013\u001a\u00020
                                                       2\b\b\u0002\u0010\u000b\u001a\u00020
                                                       2\b\b\u0002\u0010\f\u001a\u00020
                                                       2\b\b\u0002\u0010\r\u001a\u00020
                                                       2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0001J\u0013\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010+\u001a\u00020,H\u00d6\u0001J	\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0013\u001a\u00020
                                                       ¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020
                                                       ¢\u0006\b
                                                       \u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\r\u001a\u00020
                                                       ¢\u0006\b
                                                       \u0000\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\u0007\u001a
                                                       \u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\f\u001a\u00020
                                                       ¢\u0006\b
                                                       \u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b\u001f\u0010\u001a¨\u0006.""" }, d2 = { "Lgg/essential/gui/friends/message/OptionMenu$Option;", "", "text", "", "disabled", "Lgg/essential/elementa/state/State;", "", "image", "Lgg/essential/gui/image/ImageFactory;", "textColor", "Ljava/awt/Color;", "hoveredColor", "shadowColor", "hoveredShadowColor", "action", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/gui/image/ImageFactory;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Lkotlin/jvm/functions/Function0;)V", "textState", "color", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "getColor", "()Ljava/awt/Color;", "getDisabled", "()Lgg/essential/elementa/state/State;", "getHoveredColor", "getHoveredShadowColor", "getImage", "getShadowColor", "getTextState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "essential" })
    public static final class Option
    {
        @NotNull
        private final State<String> textState;
        @NotNull
        private final State<Boolean> disabled;
        @NotNull
        private final State<ImageFactory> image;
        @NotNull
        private final Color color;
        @NotNull
        private final Color hoveredColor;
        @NotNull
        private final Color shadowColor;
        @NotNull
        private final Color hoveredShadowColor;
        @NotNull
        private final Function0<Unit> action;
        
        public Option(@NotNull final State<String> textState, @NotNull final State<Boolean> disabled, @NotNull final State<ImageFactory> image, @NotNull final Color color, @NotNull final Color hoveredColor, @NotNull final Color shadowColor, @NotNull final Color hoveredShadowColor, @NotNull final Function0<Unit> action) {
            Intrinsics.checkNotNullParameter((Object)textState, "textState");
            Intrinsics.checkNotNullParameter((Object)disabled, "disabled");
            Intrinsics.checkNotNullParameter((Object)image, "image");
            Intrinsics.checkNotNullParameter((Object)color, "color");
            Intrinsics.checkNotNullParameter((Object)hoveredColor, "hoveredColor");
            Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
            Intrinsics.checkNotNullParameter((Object)hoveredShadowColor, "hoveredShadowColor");
            Intrinsics.checkNotNullParameter((Object)action, "action");
            super();
            this.textState = textState;
            this.disabled = disabled;
            this.image = image;
            this.color = color;
            this.hoveredColor = hoveredColor;
            this.shadowColor = shadowColor;
            this.hoveredShadowColor = hoveredShadowColor;
            this.action = action;
        }
        
        public Option(final State textState, final State image, final Function0 action) {
            final State disabled = new BasicState(false);
            final Color text = EssentialPalette.TEXT;
            final Color text_HIGHLIGHT = EssentialPalette.TEXT_HIGHLIGHT;
            final Color text_SHADOW_LIGHT = EssentialPalette.TEXT_SHADOW_LIGHT;
            this(textState, disabled, image, text, text_HIGHLIGHT, text_SHADOW_LIGHT, text_SHADOW_LIGHT, (Function0<Unit>)action);
        }
        
        public Option(@NotNull final String text, @NotNull final State<Boolean> disabled, @Nullable final ImageFactory image, @NotNull final Color textColor, @NotNull final Color hoveredColor, @NotNull final Color shadowColor, @NotNull final Color hoveredShadowColor, @NotNull final Function0<Unit> action) {
            Intrinsics.checkNotNullParameter((Object)text, "text");
            Intrinsics.checkNotNullParameter((Object)disabled, "disabled");
            Intrinsics.checkNotNullParameter((Object)textColor, "textColor");
            Intrinsics.checkNotNullParameter((Object)hoveredColor, "hoveredColor");
            Intrinsics.checkNotNullParameter((Object)shadowColor, "shadowColor");
            Intrinsics.checkNotNullParameter((Object)hoveredShadowColor, "hoveredShadowColor");
            Intrinsics.checkNotNullParameter((Object)action, "action");
            this(new BasicState<String>(text), disabled, new BasicState<ImageFactory>(image), textColor, hoveredColor, shadowColor, hoveredShadowColor, action);
        }
        
        public Option(final String text, State disabled, ImageFactory image, Color text2, Color text_HIGHLIGHT, Color text_SHADOW_LIGHT, Color hoveredShadowColor, final Function0 action, final int n) {
            if ((n & 0x2) != 0x0) {
                disabled = new BasicState(false);
            }
            if ((n & 0x4) != 0x0) {
                image = null;
            }
            if ((n & 0x8) != 0x0) {
                text2 = EssentialPalette.TEXT;
            }
            if ((n & 0x10) != 0x0) {
                text_HIGHLIGHT = EssentialPalette.TEXT_HIGHLIGHT;
            }
            if ((n & 0x20) != 0x0) {
                text_SHADOW_LIGHT = EssentialPalette.TEXT_SHADOW_LIGHT;
            }
            if ((n & 0x40) != 0x0) {
                hoveredShadowColor = text_SHADOW_LIGHT;
            }
            this(text, disabled, image, text2, text_HIGHLIGHT, text_SHADOW_LIGHT, hoveredShadowColor, (Function0<Unit>)action);
        }
        
        @NotNull
        public final State<String> component1() {
            return this.textState;
        }
        
        @NotNull
        public final State<Boolean> component2() {
            return this.disabled;
        }
        
        @NotNull
        public final State<ImageFactory> component3() {
            return this.image;
        }
        
        @NotNull
        public final Color component4() {
            return this.color;
        }
        
        @NotNull
        public final Color component5() {
            return this.hoveredColor;
        }
        
        @NotNull
        public final Color component6() {
            return this.shadowColor;
        }
        
        @NotNull
        public final Color component7() {
            return this.hoveredShadowColor;
        }
        
        @NotNull
        public final Function0<Unit> component8() {
            return this.action;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Option(textState=" + this.textState + ", disabled=" + this.disabled + ", image=" + this.image + ", color=" + this.color + ", hoveredColor=" + this.hoveredColor + ", shadowColor=" + this.shadowColor + ", hoveredShadowColor=" + this.hoveredShadowColor + ", action=" + this.action;
        }
        
        @Override
        public int hashCode() {
            int result = this.textState.hashCode();
            result = result * 31 + this.disabled.hashCode();
            result = result * 31 + this.image.hashCode();
            result = result * 31 + this.color.hashCode();
            result = result * 31 + this.hoveredColor.hashCode();
            result = result * 31 + this.shadowColor.hashCode();
            result = result * 31 + this.hoveredShadowColor.hashCode();
            result = result * 31 + this.action.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            final Option option = (Option)other;
            return Intrinsics.areEqual((Object)this.textState, (Object)option.textState) && Intrinsics.areEqual((Object)this.disabled, (Object)option.disabled) && Intrinsics.areEqual((Object)this.image, (Object)option.image) && Intrinsics.areEqual((Object)this.color, (Object)option.color) && Intrinsics.areEqual((Object)this.hoveredColor, (Object)option.hoveredColor) && Intrinsics.areEqual((Object)this.shadowColor, (Object)option.shadowColor) && Intrinsics.areEqual((Object)this.hoveredShadowColor, (Object)option.hoveredShadowColor) && Intrinsics.areEqual((Object)this.action, (Object)option.action);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000B
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\u0007
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u000b
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020	¢\u0006\u0002\u0010
                                                       B\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rB\u0015\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J	\u0010\u0017\u001a\u00020\u000fH\u00c6\u0003J	\u0010\u0018\u001a\u00020\u0011H\u00c6\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020	2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J	\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 """ }, d2 = { "Lgg/essential/gui/friends/message/OptionMenu$Position;", "", "x", "", "y", "(FF)V", "component", "Lgg/essential/elementa/UIComponent;", "alignOppositeX", "", "(Lgg/essential/elementa/UIComponent;Z)V", "event", "Lgg/essential/elementa/events/UIClickEvent;", "(Lgg/essential/elementa/events/UIClickEvent;)V", "xConstraint", "Lgg/essential/elementa/constraints/XConstraint;", "yConstraint", "Lgg/essential/elementa/constraints/YConstraint;", "(Lgg/essential/elementa/constraints/XConstraint;Lgg/essential/elementa/constraints/YConstraint;)V", "getXConstraint", "()Lgg/essential/elementa/constraints/XConstraint;", "getYConstraint", "()Lgg/essential/elementa/constraints/YConstraint;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "essential" })
    public static final class Position
    {
        @NotNull
        private final XConstraint xConstraint;
        @NotNull
        private final YConstraint yConstraint;
        
        public Position(@NotNull final XConstraint xConstraint, @NotNull final YConstraint yConstraint) {
            Intrinsics.checkNotNullParameter((Object)xConstraint, "xConstraint");
            Intrinsics.checkNotNullParameter((Object)yConstraint, "yConstraint");
            super();
            this.xConstraint = xConstraint;
            this.yConstraint = yConstraint;
        }
        
        @NotNull
        public final XConstraint getXConstraint() {
            return this.xConstraint;
        }
        
        @NotNull
        public final YConstraint getYConstraint() {
            return this.yConstraint;
        }
        
        public Position(final float x, final float y) {
            this(UtilitiesKt.getPixels(x), UtilitiesKt.getPixels(y));
        }
        
        public Position(@NotNull final UIComponent component, final boolean alignOppositeX) {
            Intrinsics.checkNotNullParameter((Object)component, "component");
            this(ConstraintsKt.boundTo((XConstraint)UtilitiesKt.pixels$default(0, alignOppositeX, false, 2, null), component), ConstraintsKt.boundTo((YConstraint)UtilitiesKt.pixels(0, true, true), component));
        }
        
        public Position(@NotNull final UIClickEvent event) {
            Intrinsics.checkNotNullParameter((Object)event, "event");
            this(event.getAbsoluteX(), event.getAbsoluteY());
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Position(xConstraint=" + this.xConstraint + ", yConstraint=" + this.yConstraint;
        }
        
        @Override
        public int hashCode() {
            int result = this.xConstraint.hashCode();
            result = result * 31 + this.yConstraint.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Position)) {
                return false;
            }
            final Position position = (Position)other;
            return Intrinsics.areEqual((Object)this.xConstraint, (Object)position.xConstraint) && Intrinsics.areEqual((Object)this.yConstraint, (Object)position.yConstraint);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00008
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u0011
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a
                                                       \u0012\u0006\b\u0001\u0012\u00020	0\b"\u00020	2\u000e\b\u0002\u0010
                                                       \u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\u0010\fJ?\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0007\u001a
                                                       \u0012\u0006\b\u0001\u0012\u00020	0\b"\u00020	2\u000e\b\u0002\u0010
                                                       \u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\u0010\u0011¨\u0006\u0012""" }, d2 = { "Lgg/essential/gui/friends/message/OptionMenu$Companion;", "", "()V", "create", "", "boundTo", "Lgg/essential/elementa/UIComponent;", "option", "", "Lgg/essential/gui/friends/message/OptionMenu$Option;", "onClose", "Lkotlin/Function0;", "(Lgg/essential/elementa/UIComponent;[Lgg/essential/gui/friends/message/OptionMenu$Option;Lkotlin/jvm/functions/Function0;)V", "position", "Lgg/essential/gui/friends/message/OptionMenu$Position;", "window", "Lgg/essential/elementa/components/Window;", "(Lgg/essential/gui/friends/message/OptionMenu$Position;Lgg/essential/elementa/components/Window;[Lgg/essential/gui/friends/message/OptionMenu$Option;Lkotlin/jvm/functions/Function0;)V", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public final void create(@NotNull final Position position, @NotNull final Window window, @NotNull final Option[] option, @NotNull final Function0<Unit> onClose) {
            Intrinsics.checkNotNullParameter((Object)position, "position");
            Intrinsics.checkNotNullParameter((Object)window, "window");
            Intrinsics.checkNotNullParameter((Object)option, "option");
            Intrinsics.checkNotNullParameter((Object)onClose, "onClose");
            final OptionMenu menu = ComponentsKt.childOf(new OptionMenu(0.0f, 0.0f, (Option[])Arrays.copyOf(option, option.length)), window);
            menu.reposition(position.getXConstraint(), position.getYConstraint());
            menu.init();
            menu.onClose(onClose);
        }
        
        public static /* synthetic */ void create$default$458aa9e1$630f7efd(final Companion companion, final Position position, final Window window, final Option[] option) {
            companion.create(position, window, option, (Function0<Unit>)OptionMenu$Companion$create.OptionMenu$Companion$create$2.INSTANCE);
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
