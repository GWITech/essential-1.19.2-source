package gg.essential.gui.common;

import kotlin.*;
import kotlin.reflect.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import java.util.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000B
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0011
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0010\u000b
                                                   \u0002\b\r
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   \u0018\u00002\u00020\u0001B?\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u001e\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020	0\u00030\b"\b\u0012\u0004\u0012\u00020	0\u0003¢\u0006\u0002\u0010
                                                   BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u001e\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020	0\u00030\b"\b\u0012\u0004\u0012\u00020	0\u0003¢\u0006\u0002\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u000f\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R"\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012
                                                    \u001d*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u001e\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b \u0010\u0013\u001a\u0004\b\u001f\u0010\u0011R\u001b\u0010!\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b#\u0010\u0013\u001a\u0004\b"\u0010\u0011R"\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012
                                                    \u001d*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b)\u0010\u0013\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b,\u0010\u0013\u001a\u0004\b+\u0010\u0011R\u001b\u0010-\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b/\u0010\u0013\u001a\u0004\b.\u0010\u0011¨\u00060""" }, d2 = { "Lgg/essential/gui/common/NoticeFlag;", "Lgg/essential/elementa/components/UIBlock;", "style", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/common/MenuButton$Style;", "alignment", "Lgg/essential/gui/common/MenuButton$Alignment;", "text", "", "", "(Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;[Lgg/essential/elementa/state/State;)V", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;[Lgg/essential/elementa/state/State;)V", "backgroundColor", "Lgg/essential/elementa/state/MappedState;", "Ljava/awt/Color;", "bottomLeftCorner", "getBottomLeftCorner", "()Lgg/essential/elementa/components/UIBlock;", "bottomLeftCorner$delegate", "Lkotlin/properties/ReadWriteProperty;", "bottomShadow", "getBottomShadow", "bottomShadow$delegate", "hasBottom", "", "hasLeft", "hasRight", "hasTop", "highlightColor", "kotlin.jvm.PlatformType", "leftHighlight", "getLeftHighlight", "leftHighlight$delegate", "rightShadow", "getRightShadow", "rightShadow$delegate", "shadowColor", "textContainer", "Lgg/essential/elementa/components/UIContainer;", "getTextContainer", "()Lgg/essential/elementa/components/UIContainer;", "textContainer$delegate", "topHighlight", "getTopHighlight", "topHighlight$delegate", "topRightCorner", "getTopRightCorner", "topRightCorner$delegate", "essential" })
public final class NoticeFlag extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final MappedState<MenuButton.Style, Color> backgroundColor;
    @NotNull
    private final MappedState<Color, Color> highlightColor;
    @NotNull
    private final MappedState<Color, Color> shadowColor;
    @NotNull
    private final MappedState<MenuButton.Style, Boolean> hasLeft;
    @NotNull
    private final MappedState<MenuButton.Style, Boolean> hasRight;
    @NotNull
    private final MappedState<MenuButton.Style, Boolean> hasTop;
    @NotNull
    private final MappedState<MenuButton.Style, Boolean> hasBottom;
    @NotNull
    private final ReadWriteProperty textContainer$delegate;
    
    public NoticeFlag(@NotNull final State<MenuButton.Style> style, @NotNull final State<MenuButton.Alignment> alignment, @NotNull final State<String>... text) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "style"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* alignment */
        //     7: ldc             "alignment"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* text */
        //    13: ldc             "text"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload_0         /* this */
        //    19: aconst_null    
        //    20: iconst_1       
        //    21: aconst_null    
        //    22: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    25: aload_0         /* this */
        //    26: aload_1         /* style */
        //    27: getstatic       gg/essential/gui/common/NoticeFlag$backgroundColor$1.INSTANCE:Lgg/essential/gui/common/NoticeFlag$backgroundColor$1;
        //    30: checkcast       Lkotlin/jvm/functions/Function1;
        //    33: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    36: putfield        gg/essential/gui/common/NoticeFlag.backgroundColor:Lgg/essential/elementa/state/MappedState;
        //    39: aload_0         /* this */
        //    40: aload_0         /* this */
        //    41: getfield        gg/essential/gui/common/NoticeFlag.backgroundColor:Lgg/essential/elementa/state/MappedState;
        //    44: getstatic       gg/essential/gui/common/NoticeFlag$highlightColor$1.INSTANCE:Lgg/essential/gui/common/NoticeFlag$highlightColor$1;
        //    47: checkcast       Lkotlin/jvm/functions/Function1;
        //    50: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    53: putfield        gg/essential/gui/common/NoticeFlag.highlightColor:Lgg/essential/elementa/state/MappedState;
        //    56: aload_0         /* this */
        //    57: aload_0         /* this */
        //    58: getfield        gg/essential/gui/common/NoticeFlag.backgroundColor:Lgg/essential/elementa/state/MappedState;
        //    61: getstatic       gg/essential/gui/common/NoticeFlag$shadowColor$1.INSTANCE:Lgg/essential/gui/common/NoticeFlag$shadowColor$1;
        //    64: checkcast       Lkotlin/jvm/functions/Function1;
        //    67: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    70: putfield        gg/essential/gui/common/NoticeFlag.shadowColor:Lgg/essential/elementa/state/MappedState;
        //    73: aload_0         /* this */
        //    74: aload_1         /* style */
        //    75: getstatic       gg/essential/gui/common/NoticeFlag$hasLeft$1.INSTANCE:Lgg/essential/gui/common/NoticeFlag$hasLeft$1;
        //    78: checkcast       Lkotlin/jvm/functions/Function1;
        //    81: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    84: putfield        gg/essential/gui/common/NoticeFlag.hasLeft:Lgg/essential/elementa/state/MappedState;
        //    87: aload_0         /* this */
        //    88: aload_1         /* style */
        //    89: getstatic       gg/essential/gui/common/NoticeFlag$hasRight$1.INSTANCE:Lgg/essential/gui/common/NoticeFlag$hasRight$1;
        //    92: checkcast       Lkotlin/jvm/functions/Function1;
        //    95: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    98: putfield        gg/essential/gui/common/NoticeFlag.hasRight:Lgg/essential/elementa/state/MappedState;
        //   101: aload_0         /* this */
        //   102: aload_1         /* style */
        //   103: getstatic       gg/essential/gui/common/NoticeFlag$hasTop$1.INSTANCE:Lgg/essential/gui/common/NoticeFlag$hasTop$1;
        //   106: checkcast       Lkotlin/jvm/functions/Function1;
        //   109: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   112: putfield        gg/essential/gui/common/NoticeFlag.hasTop:Lgg/essential/elementa/state/MappedState;
        //   115: aload_0         /* this */
        //   116: aload_1         /* style */
        //   117: getstatic       gg/essential/gui/common/NoticeFlag$hasBottom$1.INSTANCE:Lgg/essential/gui/common/NoticeFlag$hasBottom$1;
        //   120: checkcast       Lkotlin/jvm/functions/Function1;
        //   123: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   126: putfield        gg/essential/gui/common/NoticeFlag.hasBottom:Lgg/essential/elementa/state/MappedState;
        //   129: new             Lgg/essential/elementa/components/UIBlock;
        //   132: dup            
        //   133: aload_0         /* this */
        //   134: getfield        gg/essential/gui/common/NoticeFlag.highlightColor:Lgg/essential/elementa/state/MappedState;
        //   137: checkcast       Lgg/essential/elementa/state/State;
        //   140: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   143: checkcast       Lgg/essential/elementa/UIComponent;
        //   146: astore          $this$constrain$iv
        //   148: aload           $this$constrain$iv
        //   150: astore          5
        //   152: aload           5
        //   154: astore          $this$constrain_u24lambda_u2d0$iv
        //   156: aload           $this$constrain_u24lambda_u2d0$iv
        //   158: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   161: astore          $this$topHighlight_delegate_u24lambda_u2d0
        //   163: aload           $this$topHighlight_delegate_u24lambda_u2d0
        //   165: bipush          100
        //   167: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   170: checkcast       Ljava/lang/Number;
        //   173: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   176: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   179: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   182: aload           $this$topHighlight_delegate_u24lambda_u2d0
        //   184: iconst_1       
        //   185: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   188: checkcast       Ljava/lang/Number;
        //   191: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   194: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   197: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   200: aload           5
        //   202: aload_0         /* this */
        //   203: checkcast       Lgg/essential/elementa/UIComponent;
        //   206: aload_0         /* this */
        //   207: getfield        gg/essential/gui/common/NoticeFlag.hasTop:Lgg/essential/elementa/state/MappedState;
        //   210: checkcast       Lgg/essential/elementa/state/State;
        //   213: iconst_0       
        //   214: aconst_null    
        //   215: bipush          12
        //   217: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   220: aload_0         /* this */
        //   221: getstatic       gg/essential/gui/common/NoticeFlag.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   224: iconst_0       
        //   225: aaload         
        //   226: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   229: pop            
        //   230: new             Lgg/essential/elementa/components/UIBlock;
        //   233: dup            
        //   234: aload_0         /* this */
        //   235: getfield        gg/essential/gui/common/NoticeFlag.highlightColor:Lgg/essential/elementa/state/MappedState;
        //   238: checkcast       Lgg/essential/elementa/state/State;
        //   241: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   244: checkcast       Lgg/essential/elementa/UIComponent;
        //   247: astore          $this$constrain$iv
        //   249: aload           $this$constrain$iv
        //   251: astore          5
        //   253: aload           5
        //   255: astore          $this$constrain_u24lambda_u2d0$iv
        //   257: aload           $this$constrain_u24lambda_u2d0$iv
        //   259: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   262: astore          $this$leftHighlight_delegate_u24lambda_u2d1
        //   264: aload           $this$leftHighlight_delegate_u24lambda_u2d1
        //   266: iconst_1       
        //   267: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   270: checkcast       Ljava/lang/Number;
        //   273: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   276: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   279: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   282: aload           $this$leftHighlight_delegate_u24lambda_u2d1
        //   284: bipush          100
        //   286: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   289: checkcast       Ljava/lang/Number;
        //   292: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   295: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   298: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   301: aload           5
        //   303: aload_0         /* this */
        //   304: checkcast       Lgg/essential/elementa/UIComponent;
        //   307: aload_0         /* this */
        //   308: getfield        gg/essential/gui/common/NoticeFlag.hasLeft:Lgg/essential/elementa/state/MappedState;
        //   311: checkcast       Lgg/essential/elementa/state/State;
        //   314: iconst_0       
        //   315: aconst_null    
        //   316: bipush          12
        //   318: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   321: aload_0         /* this */
        //   322: getstatic       gg/essential/gui/common/NoticeFlag.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   325: iconst_1       
        //   326: aaload         
        //   327: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   330: pop            
        //   331: new             Lgg/essential/elementa/components/UIBlock;
        //   334: dup            
        //   335: aload_0         /* this */
        //   336: getfield        gg/essential/gui/common/NoticeFlag.shadowColor:Lgg/essential/elementa/state/MappedState;
        //   339: checkcast       Lgg/essential/elementa/state/State;
        //   342: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   345: checkcast       Lgg/essential/elementa/UIComponent;
        //   348: astore          $this$constrain$iv
        //   350: aload           $this$constrain$iv
        //   352: astore          5
        //   354: aload           5
        //   356: astore          $this$constrain_u24lambda_u2d0$iv
        //   358: aload           $this$constrain_u24lambda_u2d0$iv
        //   360: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   363: astore          $this$rightShadow_delegate_u24lambda_u2d2
        //   365: aload           $this$rightShadow_delegate_u24lambda_u2d2
        //   367: iconst_0       
        //   368: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   371: checkcast       Ljava/lang/Number;
        //   374: iconst_1       
        //   375: iconst_0       
        //   376: iconst_2       
        //   377: aconst_null    
        //   378: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   381: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   384: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   387: aload           $this$rightShadow_delegate_u24lambda_u2d2
        //   389: iconst_1       
        //   390: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   393: checkcast       Ljava/lang/Number;
        //   396: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   399: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   402: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   405: aload           $this$rightShadow_delegate_u24lambda_u2d2
        //   407: bipush          100
        //   409: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   412: checkcast       Ljava/lang/Number;
        //   415: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   418: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   421: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   424: aload           5
        //   426: aload_0         /* this */
        //   427: checkcast       Lgg/essential/elementa/UIComponent;
        //   430: aload_0         /* this */
        //   431: getfield        gg/essential/gui/common/NoticeFlag.hasRight:Lgg/essential/elementa/state/MappedState;
        //   434: checkcast       Lgg/essential/elementa/state/State;
        //   437: iconst_0       
        //   438: aconst_null    
        //   439: bipush          12
        //   441: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   444: aload_0         /* this */
        //   445: getstatic       gg/essential/gui/common/NoticeFlag.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   448: iconst_2       
        //   449: aaload         
        //   450: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   453: pop            
        //   454: new             Lgg/essential/elementa/components/UIBlock;
        //   457: dup            
        //   458: aload_0         /* this */
        //   459: getfield        gg/essential/gui/common/NoticeFlag.shadowColor:Lgg/essential/elementa/state/MappedState;
        //   462: checkcast       Lgg/essential/elementa/state/State;
        //   465: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   468: checkcast       Lgg/essential/elementa/UIComponent;
        //   471: astore          $this$constrain$iv
        //   473: aload           $this$constrain$iv
        //   475: astore          5
        //   477: aload           5
        //   479: astore          $this$constrain_u24lambda_u2d0$iv
        //   481: aload           $this$constrain_u24lambda_u2d0$iv
        //   483: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   486: astore          $this$bottomShadow_delegate_u24lambda_u2d3
        //   488: aload           $this$bottomShadow_delegate_u24lambda_u2d3
        //   490: iconst_0       
        //   491: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   494: checkcast       Ljava/lang/Number;
        //   497: iconst_1       
        //   498: iconst_0       
        //   499: iconst_2       
        //   500: aconst_null    
        //   501: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   504: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   507: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   510: aload           $this$bottomShadow_delegate_u24lambda_u2d3
        //   512: bipush          100
        //   514: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   517: checkcast       Ljava/lang/Number;
        //   520: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   523: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   526: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   529: aload           $this$bottomShadow_delegate_u24lambda_u2d3
        //   531: iconst_1       
        //   532: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   535: checkcast       Ljava/lang/Number;
        //   538: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   541: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   544: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   547: aload           5
        //   549: aload_0         /* this */
        //   550: checkcast       Lgg/essential/elementa/UIComponent;
        //   553: aload_0         /* this */
        //   554: getfield        gg/essential/gui/common/NoticeFlag.hasBottom:Lgg/essential/elementa/state/MappedState;
        //   557: checkcast       Lgg/essential/elementa/state/State;
        //   560: iconst_0       
        //   561: aconst_null    
        //   562: bipush          12
        //   564: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   567: aload_0         /* this */
        //   568: getstatic       gg/essential/gui/common/NoticeFlag.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   571: iconst_3       
        //   572: aaload         
        //   573: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   576: pop            
        //   577: new             Lgg/essential/elementa/components/UIBlock;
        //   580: dup            
        //   581: aload_0         /* this */
        //   582: getfield        gg/essential/gui/common/NoticeFlag.backgroundColor:Lgg/essential/elementa/state/MappedState;
        //   585: checkcast       Lgg/essential/elementa/state/State;
        //   588: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   591: checkcast       Lgg/essential/elementa/UIComponent;
        //   594: astore          $this$constrain$iv
        //   596: aload           $this$constrain$iv
        //   598: astore          5
        //   600: aload           5
        //   602: astore          $this$constrain_u24lambda_u2d0$iv
        //   604: aload           $this$constrain_u24lambda_u2d0$iv
        //   606: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   609: astore          $this$topRightCorner_delegate_u24lambda_u2d4
        //   611: aload           $this$topRightCorner_delegate_u24lambda_u2d4
        //   613: iconst_0       
        //   614: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   617: checkcast       Ljava/lang/Number;
        //   620: iconst_1       
        //   621: iconst_0       
        //   622: iconst_2       
        //   623: aconst_null    
        //   624: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   627: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   630: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   633: aload           $this$topRightCorner_delegate_u24lambda_u2d4
        //   635: iconst_1       
        //   636: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   639: checkcast       Ljava/lang/Number;
        //   642: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   645: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   648: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   651: aload           $this$topRightCorner_delegate_u24lambda_u2d4
        //   653: iconst_1       
        //   654: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   657: checkcast       Ljava/lang/Number;
        //   660: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   663: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   666: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   669: aload           5
        //   671: aload_0         /* this */
        //   672: checkcast       Lgg/essential/elementa/UIComponent;
        //   675: aload_0         /* this */
        //   676: getfield        gg/essential/gui/common/NoticeFlag.hasTop:Lgg/essential/elementa/state/MappedState;
        //   679: checkcast       Lgg/essential/elementa/state/State;
        //   682: aload_0         /* this */
        //   683: getfield        gg/essential/gui/common/NoticeFlag.hasRight:Lgg/essential/elementa/state/MappedState;
        //   686: checkcast       Lgg/essential/elementa/state/State;
        //   689: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   692: checkcast       Lgg/essential/elementa/state/State;
        //   695: iconst_0       
        //   696: aconst_null    
        //   697: bipush          12
        //   699: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   702: aload_0         /* this */
        //   703: getstatic       gg/essential/gui/common/NoticeFlag.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   706: iconst_4       
        //   707: aaload         
        //   708: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   711: pop            
        //   712: new             Lgg/essential/elementa/components/UIBlock;
        //   715: dup            
        //   716: aload_0         /* this */
        //   717: getfield        gg/essential/gui/common/NoticeFlag.backgroundColor:Lgg/essential/elementa/state/MappedState;
        //   720: checkcast       Lgg/essential/elementa/state/State;
        //   723: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   726: checkcast       Lgg/essential/elementa/UIComponent;
        //   729: astore          $this$constrain$iv
        //   731: aload           $this$constrain$iv
        //   733: astore          5
        //   735: aload           5
        //   737: astore          $this$constrain_u24lambda_u2d0$iv
        //   739: aload           $this$constrain_u24lambda_u2d0$iv
        //   741: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   744: astore          $this$bottomLeftCorner_delegate_u24lambda_u2d5
        //   746: aload           $this$bottomLeftCorner_delegate_u24lambda_u2d5
        //   748: iconst_0       
        //   749: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   752: checkcast       Ljava/lang/Number;
        //   755: iconst_1       
        //   756: iconst_0       
        //   757: iconst_2       
        //   758: aconst_null    
        //   759: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   762: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   765: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   768: aload           $this$bottomLeftCorner_delegate_u24lambda_u2d5
        //   770: iconst_1       
        //   771: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   774: checkcast       Ljava/lang/Number;
        //   777: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   780: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   783: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   786: aload           $this$bottomLeftCorner_delegate_u24lambda_u2d5
        //   788: iconst_1       
        //   789: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   792: checkcast       Ljava/lang/Number;
        //   795: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   798: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   801: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   804: aload           5
        //   806: aload_0         /* this */
        //   807: checkcast       Lgg/essential/elementa/UIComponent;
        //   810: aload_0         /* this */
        //   811: getfield        gg/essential/gui/common/NoticeFlag.hasLeft:Lgg/essential/elementa/state/MappedState;
        //   814: checkcast       Lgg/essential/elementa/state/State;
        //   817: aload_0         /* this */
        //   818: getfield        gg/essential/gui/common/NoticeFlag.hasBottom:Lgg/essential/elementa/state/MappedState;
        //   821: checkcast       Lgg/essential/elementa/state/State;
        //   824: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   827: checkcast       Lgg/essential/elementa/state/State;
        //   830: iconst_0       
        //   831: aconst_null    
        //   832: bipush          12
        //   834: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   837: aload_0         /* this */
        //   838: getstatic       gg/essential/gui/common/NoticeFlag.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   841: iconst_5       
        //   842: aaload         
        //   843: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   846: pop            
        //   847: aload_0         /* this */
        //   848: new             Lgg/essential/elementa/components/UIContainer;
        //   851: dup            
        //   852: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   855: checkcast       Lgg/essential/elementa/UIComponent;
        //   858: astore          $this$constrain$iv
        //   860: aload           $this$constrain$iv
        //   862: astore          5
        //   864: aload           5
        //   866: astore          $this$constrain_u24lambda_u2d0$iv
        //   868: aload           $this$constrain_u24lambda_u2d0$iv
        //   870: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   873: astore          8
        //   875: astore          13
        //   877: aload           $this$textContainer_delegate_u24lambda_u2d6
        //   879: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   882: dup            
        //   883: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   886: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   889: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   892: aload           $this$textContainer_delegate_u24lambda_u2d6
        //   894: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   897: dup            
        //   898: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   901: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   904: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   907: aload           $this$textContainer_delegate_u24lambda_u2d6
        //   909: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   912: dup            
        //   913: fconst_0       
        //   914: iconst_1       
        //   915: aconst_null    
        //   916: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   919: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   922: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   925: aload           13
        //   927: aload           5
        //   929: aload_2         /* alignment */
        //   930: getstatic       gg/essential/gui/common/NoticeFlag$textContainer$3.INSTANCE:Lgg/essential/gui/common/NoticeFlag$textContainer$3;
        //   933: checkcast       Lkotlin/jvm/functions/Function2;
        //   936: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   939: aload_0         /* this */
        //   940: checkcast       Lgg/essential/elementa/UIComponent;
        //   943: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   946: aload_0         /* this */
        //   947: getstatic       gg/essential/gui/common/NoticeFlag.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   950: bipush          6
        //   952: aaload         
        //   953: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   956: putfield        gg/essential/gui/common/NoticeFlag.textContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   959: aload_0         /* this */
        //   960: checkcast       Lgg/essential/elementa/UIComponent;
        //   963: astore          $this$constrain$iv
        //   965: aload           $this$constrain$iv
        //   967: astore          5
        //   969: aload           5
        //   971: astore          $this$constrain_u24lambda_u2d0$iv
        //   973: aload           $this$constrain_u24lambda_u2d0$iv
        //   975: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   978: astore          $this$_init__u24lambda_u2d7
        //   980: aload           $this$_init__u24lambda_u2d7
        //   982: bipush          100
        //   984: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   987: checkcast       Ljava/lang/Number;
        //   990: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   993: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   996: aload_0         /* this */
        //   997: invokespecial   gg/essential/gui/common/NoticeFlag.getTextContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1000: checkcast       Lgg/essential/elementa/UIComponent;
        //  1003: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1006: bipush          8
        //  1008: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1011: checkcast       Ljava/lang/Number;
        //  1014: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1017: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1020: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1023: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1026: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1029: aload           $this$_init__u24lambda_u2d7
        //  1031: bipush          100
        //  1033: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1036: checkcast       Ljava/lang/Number;
        //  1039: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1042: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1045: aload_0         /* this */
        //  1046: invokespecial   gg/essential/gui/common/NoticeFlag.getTextContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1049: checkcast       Lgg/essential/elementa/UIComponent;
        //  1052: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1055: bipush          6
        //  1057: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1060: checkcast       Ljava/lang/Number;
        //  1063: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1066: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1069: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1072: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1075: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1078: aload           $this$_init__u24lambda_u2d7
        //  1080: aload_0         /* this */
        //  1081: getfield        gg/essential/gui/common/NoticeFlag.backgroundColor:Lgg/essential/elementa/state/MappedState;
        //  1084: checkcast       Lgg/essential/elementa/state/State;
        //  1087: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1090: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1093: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1096: aload_3         /* text */
        //  1097: astore          $this$forEach$iv
        //  1099: iconst_0       
        //  1100: istore          5
        //  1102: aload           $this$forEach$iv
        //  1104: arraylength    
        //  1105: istore          6
        //  1107: iload           5
        //  1109: iload           6
        //  1111: if_icmpge       1269
        //  1114: aload           $this$forEach$iv
        //  1116: iload           5
        //  1118: aaload         
        //  1119: astore          element$iv
        //  1121: aload           element$iv
        //  1123: astore          it
        //  1125: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1128: dup            
        //  1129: aconst_null    
        //  1130: iconst_0       
        //  1131: getstatic       gg/essential/gui/EssentialPalette.TEXT_SHADOW:Ljava/awt/Color;
        //  1134: iconst_0       
        //  1135: iconst_0       
        //  1136: iconst_0       
        //  1137: bipush          59
        //  1139: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  1142: aload           it
        //  1144: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //  1147: checkcast       Lgg/essential/elementa/UIComponent;
        //  1150: astore          $this$constrain$iv
        //  1152: aload           $this$constrain$iv
        //  1154: astore          10
        //  1156: aload           10
        //  1158: astore          $this$constrain_u24lambda_u2d0$iv
        //  1160: aload           $this$constrain_u24lambda_u2d0$iv
        //  1162: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1165: astore          $this$lambda_u2d9_u24lambda_u2d8
        //  1167: aload           $this$lambda_u2d9_u24lambda_u2d8
        //  1169: aload_3         /* text */
        //  1170: arraylength    
        //  1171: iconst_1       
        //  1172: if_icmple       1194
        //  1175: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1178: dup            
        //  1179: ldc_w           4.0
        //  1182: iconst_0       
        //  1183: iconst_2       
        //  1184: aconst_null    
        //  1185: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1188: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1191: goto            1223
        //  1194: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1197: dup            
        //  1198: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1201: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1204: iconst_0       
        //  1205: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1208: checkcast       Ljava/lang/Number;
        //  1211: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1214: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1217: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  1220: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1223: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1226: aload           $this$lambda_u2d9_u24lambda_u2d8
        //  1228: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  1231: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1234: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1237: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1240: aload           10
        //  1242: aload_2         /* alignment */
        //  1243: getstatic       gg/essential/gui/common/NoticeFlag$2$2.INSTANCE:Lgg/essential/gui/common/NoticeFlag$2$2;
        //  1246: checkcast       Lkotlin/jvm/functions/Function2;
        //  1249: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1252: aload_0         /* this */
        //  1253: invokespecial   gg/essential/gui/common/NoticeFlag.getTextContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1256: checkcast       Lgg/essential/elementa/UIComponent;
        //  1259: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1262: pop            
        //  1263: iinc            5, 1
        //  1266: goto            1107
        //  1269: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Lgg/essential/gui/common/MenuButton$Style;>;Lgg/essential/elementa/state/State<Lgg/essential/gui/common/MenuButton$Alignment;>;[Lgg/essential/elementa/state/State<Ljava/lang/String;>;)V
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  style      
        //  alignment  
        //  text       
        //    StackMapTable: 00 04 FF 04 53 00 07 07 00 02 00 07 00 6E 07 01 1E 07 01 1E 01 01 00 00 FF 00 56 00 0D 07 00 02 00 07 00 6E 07 01 1E 07 01 1E 01 01 00 00 00 07 00 9A 00 07 00 B0 00 01 07 00 B0 FF 00 1C 00 0D 07 00 02 00 07 00 6E 07 01 1E 07 01 1E 01 01 00 00 00 07 00 9A 00 07 00 B0 00 02 07 00 B0 07 00 D8 FF 00 2D 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public NoticeFlag(@NotNull final State<MenuButton.Style> style, @NotNull final MenuButton.Alignment alignment, @NotNull final State<String>... text) {
        Intrinsics.checkNotNullParameter((Object)style, "style");
        Intrinsics.checkNotNullParameter((Object)alignment, "alignment");
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(style, new BasicState<MenuButton.Alignment>(alignment), (State<String>[])Arrays.copyOf(text, 1));
    }
    
    private final UIContainer getTextContainer() {
        return (UIContainer)this.textContainer$delegate.getValue((Object)this, (KProperty)NoticeFlag.$$delegatedProperties[6]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NoticeFlag.class, "topHighlight", "getTopHighlight()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NoticeFlag.class, "leftHighlight", "getLeftHighlight()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NoticeFlag.class, "rightShadow", "getRightShadow()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NoticeFlag.class, "bottomShadow", "getBottomShadow()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NoticeFlag.class, "topRightCorner", "getTopRightCorner()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NoticeFlag.class, "bottomLeftCorner", "getBottomLeftCorner()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NoticeFlag.class, "textContainer", "getTextContainer()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
}
