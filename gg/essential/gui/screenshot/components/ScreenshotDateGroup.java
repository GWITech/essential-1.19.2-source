package gg.essential.gui.screenshot.components;

import kotlin.reflect.*;
import gg.essential.gui.screenshot.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import java.text.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000d
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0002\b\r
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u000202J\b\u00106\u001a\u000207H\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020908J\u0006\u0010:\u001a\u000200J\u0006\u0010;\u001a\u000200J\u0016\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u0002092\u0006\u0010>\u001a\u000209R\u001b\u0010\u0007\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b
                                                   \u0010\u000b\u001a\u0004\b\b\u0010	R\u001b\u0010\f\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010	R\u001b\u0010\u000f\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010	R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001f\u0010 R+\u0010#\u001a\u00020"2\u0006\u0010!\u001a\u00020"8F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\b(\u0010\u000b\u001a\u0004\b$\u0010%"\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b-\u0010\u000b\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002000/X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006@""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotDateGroup;", "Lgg/essential/elementa/components/UIContainer;", "range", "Lgg/essential/gui/screenshot/DateRange;", "startTime", "", "(Lgg/essential/gui/screenshot/DateRange;J)V", "content", "getContent", "()Lgg/essential/elementa/components/UIContainer;", "content$delegate", "Lkotlin/properties/ReadWriteProperty;", "dateDividerContainer", "getDateDividerContainer", "dateDividerContainer$delegate", "images", "getImages", "images$delegate", "leftBlock", "Lgg/essential/elementa/components/UIBlock;", "getLeftBlock", "()Lgg/essential/elementa/components/UIBlock;", "leftBlock$delegate", "numChildren", "Lgg/essential/elementa/state/BasicState;", "", "getRange", "()Lgg/essential/gui/screenshot/DateRange;", "rightBlock", "getRightBlock", "rightBlock$delegate", "getStartTime", "()J", "<set-?>", "Lgg/essential/gui/common/HollowUIContainer;", "textContainer", "getTextContainer", "()Lgg/essential/gui/common/HollowUIContainer;", "setTextContainer", "(Lgg/essential/gui/common/HollowUIContainer;)V", "textContainer$delegate", "title", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getTitle", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "title$delegate", "visible", "Lgg/essential/elementa/state/MappedState;", "", "addScreenshot", "", "screenshot", "Lgg/essential/gui/screenshot/components/ScreenshotPreview;", "cleanup", "getDateName", "", "", "Lgg/essential/elementa/UIComponent;", "isEmpty", "isVisible", "setupParent", "scroller", "navigation", "Companion", "essential" })
public final class ScreenshotDateGroup extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final DateRange range;
    private final long startTime;
    @NotNull
    private BasicState<Integer> numChildren;
    @NotNull
    private final MappedState<Integer, Boolean> visible;
    @NotNull
    private final ReadWriteProperty content$delegate;
    @NotNull
    private final ReadWriteProperty textContainer$delegate;
    @NotNull
    private final ReadWriteProperty title$delegate;
    @NotNull
    private final ReadWriteProperty dateDividerContainer$delegate;
    @NotNull
    private final ReadWriteProperty leftBlock$delegate;
    @NotNull
    private final ReadWriteProperty images$delegate;
    @NotNull
    private static final SimpleDateFormat format;
    
    public ScreenshotDateGroup(@NotNull final DateRange range, final long startTime) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "range"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* range */
        //    12: putfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.range:Lgg/essential/gui/screenshot/DateRange;
        //    15: aload_0         /* this */
        //    16: lload_2         /* startTime */
        //    17: putfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.startTime:J
        //    20: aload_0         /* this */
        //    21: new             Lgg/essential/elementa/state/BasicState;
        //    24: dup            
        //    25: iconst_0       
        //    26: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    29: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    32: putfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.numChildren:Lgg/essential/elementa/state/BasicState;
        //    35: aload_0         /* this */
        //    36: aload_0         /* this */
        //    37: getfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.numChildren:Lgg/essential/elementa/state/BasicState;
        //    40: getstatic       gg/essential/gui/screenshot/components/ScreenshotDateGroup$visible$1.INSTANCE:Lgg/essential/gui/screenshot/components/ScreenshotDateGroup$visible$1;
        //    43: checkcast       Lkotlin/jvm/functions/Function1;
        //    46: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    49: putfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.visible:Lgg/essential/elementa/state/MappedState;
        //    52: aload_0         /* this */
        //    53: new             Lgg/essential/elementa/components/UIContainer;
        //    56: dup            
        //    57: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    60: checkcast       Lgg/essential/elementa/UIComponent;
        //    63: astore          $this$constrain$iv
        //    65: aload           $this$constrain$iv
        //    67: astore          5
        //    69: aload           5
        //    71: astore          $this$constrain_u24lambda_u2d0$iv
        //    73: aload           $this$constrain_u24lambda_u2d0$iv
        //    75: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    78: astore          7
        //    80: astore          8
        //    82: aload           $this$content_delegate_u24lambda_u2d0
        //    84: bipush          100
        //    86: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    89: checkcast       Ljava/lang/Number;
        //    92: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    95: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    98: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   101: aload           $this$content_delegate_u24lambda_u2d0
        //   103: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   106: dup            
        //   107: fconst_0       
        //   108: iconst_1       
        //   109: aconst_null    
        //   110: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   113: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   116: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   119: aload           8
        //   121: aload           5
        //   123: aload_0         /* this */
        //   124: checkcast       Lgg/essential/elementa/UIComponent;
        //   127: aload_0         /* this */
        //   128: getfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.visible:Lgg/essential/elementa/state/MappedState;
        //   131: checkcast       Lgg/essential/elementa/state/State;
        //   134: iconst_0       
        //   135: aconst_null    
        //   136: bipush          12
        //   138: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   141: aload_0         /* this */
        //   142: getstatic       gg/essential/gui/screenshot/components/ScreenshotDateGroup.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   145: iconst_0       
        //   146: aaload         
        //   147: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   150: putfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //   153: aload_0         /* this */
        //   154: new             Lgg/essential/gui/common/HollowUIContainer;
        //   157: dup            
        //   158: invokespecial   gg/essential/gui/common/HollowUIContainer.<init>:()V
        //   161: checkcast       Lgg/essential/elementa/UIComponent;
        //   164: astore          $this$constrain$iv
        //   166: aload           $this$constrain$iv
        //   168: astore          5
        //   170: aload           5
        //   172: astore          $this$constrain_u24lambda_u2d0$iv
        //   174: aload           $this$constrain_u24lambda_u2d0$iv
        //   176: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   179: astore          7
        //   181: astore          8
        //   183: aload           $this$textContainer_delegate_u24lambda_u2d1
        //   185: bipush          100
        //   187: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   190: checkcast       Ljava/lang/Number;
        //   193: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   196: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   199: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   202: aload           $this$textContainer_delegate_u24lambda_u2d1
        //   204: bipush          100
        //   206: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   209: checkcast       Ljava/lang/Number;
        //   212: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   215: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   218: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   221: aload           8
        //   223: aload           5
        //   225: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   228: dup            
        //   229: aconst_null    
        //   230: iconst_0       
        //   231: iconst_3       
        //   232: aconst_null    
        //   233: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   236: checkcast       Lgg/essential/elementa/effects/Effect;
        //   239: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   242: aload_0         /* this */
        //   243: getstatic       gg/essential/gui/screenshot/components/ScreenshotDateGroup.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   246: iconst_1       
        //   247: aaload         
        //   248: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   251: putfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.textContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   254: aload_0         /* this */
        //   255: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   258: dup            
        //   259: aload_0         /* this */
        //   260: invokespecial   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getDateName:()Ljava/lang/String;
        //   263: iconst_0       
        //   264: aconst_null    
        //   265: iconst_0       
        //   266: iconst_0       
        //   267: iconst_0       
        //   268: bipush          62
        //   270: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   273: checkcast       Lgg/essential/elementa/UIComponent;
        //   276: astore          $this$constrain$iv
        //   278: aload           $this$constrain$iv
        //   280: astore          5
        //   282: aload           5
        //   284: astore          $this$constrain_u24lambda_u2d0$iv
        //   286: aload           $this$constrain_u24lambda_u2d0$iv
        //   288: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   291: astore          7
        //   293: astore          8
        //   295: aload           $this$title_delegate_u24lambda_u2d2
        //   297: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   300: dup            
        //   301: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   304: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   307: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   310: aload           8
        //   312: aload           5
        //   314: aload_0         /* this */
        //   315: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getTextContainer:()Lgg/essential/gui/common/HollowUIContainer;
        //   318: checkcast       Lgg/essential/elementa/UIComponent;
        //   321: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   324: aload_0         /* this */
        //   325: getstatic       gg/essential/gui/screenshot/components/ScreenshotDateGroup.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   328: iconst_2       
        //   329: aaload         
        //   330: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   333: putfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.title$delegate:Lkotlin/properties/ReadWriteProperty;
        //   336: aload_0         /* this */
        //   337: new             Lgg/essential/elementa/components/UIContainer;
        //   340: dup            
        //   341: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   344: checkcast       Lgg/essential/elementa/UIComponent;
        //   347: astore          $this$constrain$iv
        //   349: aload           $this$constrain$iv
        //   351: astore          5
        //   353: aload           5
        //   355: astore          $this$constrain_u24lambda_u2d0$iv
        //   357: aload           $this$constrain_u24lambda_u2d0$iv
        //   359: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   362: astore          7
        //   364: astore          8
        //   366: aload           $this$dateDividerContainer_delegate_u24lambda_u2d3
        //   368: bipush          100
        //   370: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   373: checkcast       Ljava/lang/Number;
        //   376: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   379: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   382: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   385: aload           $this$dateDividerContainer_delegate_u24lambda_u2d3
        //   387: ldc             30.0
        //   389: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   392: checkcast       Ljava/lang/Number;
        //   395: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   398: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   401: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   404: aload           8
        //   406: aload           5
        //   408: aload_0         /* this */
        //   409: invokespecial   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   412: checkcast       Lgg/essential/elementa/UIComponent;
        //   415: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   418: aload_0         /* this */
        //   419: getstatic       gg/essential/gui/screenshot/components/ScreenshotDateGroup.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   422: iconst_3       
        //   423: aaload         
        //   424: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   427: putfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.dateDividerContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   430: aload_0         /* this */
        //   431: new             Lgg/essential/elementa/components/UIBlock;
        //   434: dup            
        //   435: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   438: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   441: checkcast       Lgg/essential/elementa/UIComponent;
        //   444: astore          $this$constrain$iv
        //   446: aload           $this$constrain$iv
        //   448: astore          5
        //   450: aload           5
        //   452: astore          $this$constrain_u24lambda_u2d0$iv
        //   454: aload           $this$constrain_u24lambda_u2d0$iv
        //   456: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   459: astore          7
        //   461: astore          8
        //   463: aload           $this$leftBlock_delegate_u24lambda_u2d4
        //   465: iconst_1       
        //   466: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   469: checkcast       Ljava/lang/Number;
        //   472: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   475: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   478: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   481: aload           $this$leftBlock_delegate_u24lambda_u2d4
        //   483: bipush          100
        //   485: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   488: checkcast       Ljava/lang/Number;
        //   491: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   494: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   497: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   500: dup            
        //   501: iconst_0       
        //   502: iconst_1       
        //   503: aconst_null    
        //   504: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   507: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   510: aload_0         /* this */
        //   511: invokespecial   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getTitle:()Lgg/essential/gui/common/shadow/EssentialUIText;
        //   514: checkcast       Lgg/essential/elementa/UIComponent;
        //   517: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   520: bipush          20
        //   522: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   525: checkcast       Ljava/lang/Number;
        //   528: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   531: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   534: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   537: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   540: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   543: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   546: iconst_2       
        //   547: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   550: checkcast       Ljava/lang/Number;
        //   553: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.div:(Lgg/essential/elementa/constraints/SuperConstraint;Ljava/lang/Number;)Lgg/essential/elementa/constraints/ScaleConstraint;
        //   556: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   559: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   562: aload           $this$leftBlock_delegate_u24lambda_u2d4
        //   564: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   567: dup            
        //   568: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   571: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   574: aload_0         /* this */
        //   575: invokespecial   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getTitle:()Lgg/essential/gui/common/shadow/EssentialUIText;
        //   578: checkcast       Lgg/essential/elementa/UIComponent;
        //   581: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   584: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   587: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   590: aload           8
        //   592: aload           5
        //   594: aload_0         /* this */
        //   595: invokespecial   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getDateDividerContainer:()Lgg/essential/elementa/components/UIContainer;
        //   598: checkcast       Lgg/essential/elementa/UIComponent;
        //   601: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   604: aload_0         /* this */
        //   605: getstatic       gg/essential/gui/screenshot/components/ScreenshotDateGroup.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   608: iconst_4       
        //   609: aaload         
        //   610: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   613: putfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.leftBlock$delegate:Lkotlin/properties/ReadWriteProperty;
        //   616: new             Lgg/essential/elementa/components/UIBlock;
        //   619: dup            
        //   620: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   623: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   626: checkcast       Lgg/essential/elementa/UIComponent;
        //   629: astore          $this$constrain$iv
        //   631: aload           $this$constrain$iv
        //   633: astore          5
        //   635: aload           5
        //   637: astore          $this$constrain_u24lambda_u2d0$iv
        //   639: aload           $this$constrain_u24lambda_u2d0$iv
        //   641: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   644: astore          $this$rightBlock_delegate_u24lambda_u2d5
        //   646: aload           $this$rightBlock_delegate_u24lambda_u2d5
        //   648: iconst_0       
        //   649: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   652: checkcast       Ljava/lang/Number;
        //   655: iconst_1       
        //   656: iconst_0       
        //   657: iconst_2       
        //   658: aconst_null    
        //   659: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   662: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   665: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   668: aload           $this$rightBlock_delegate_u24lambda_u2d5
        //   670: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   673: dup            
        //   674: iconst_0       
        //   675: iconst_1       
        //   676: aconst_null    
        //   677: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   680: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   683: aload_0         /* this */
        //   684: invokespecial   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getLeftBlock:()Lgg/essential/elementa/components/UIBlock;
        //   687: checkcast       Lgg/essential/elementa/UIComponent;
        //   690: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   693: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   696: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   699: aload           $this$rightBlock_delegate_u24lambda_u2d5
        //   701: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   704: dup            
        //   705: iconst_0       
        //   706: iconst_1       
        //   707: aconst_null    
        //   708: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   711: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   714: aload_0         /* this */
        //   715: invokespecial   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getLeftBlock:()Lgg/essential/elementa/components/UIBlock;
        //   718: checkcast       Lgg/essential/elementa/UIComponent;
        //   721: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   724: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   727: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   730: aload           $this$rightBlock_delegate_u24lambda_u2d5
        //   732: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   735: dup            
        //   736: iconst_0       
        //   737: iconst_1       
        //   738: aconst_null    
        //   739: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   742: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   745: aload_0         /* this */
        //   746: invokespecial   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getLeftBlock:()Lgg/essential/elementa/components/UIBlock;
        //   749: checkcast       Lgg/essential/elementa/UIComponent;
        //   752: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   755: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   758: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   761: aload           5
        //   763: aload_0         /* this */
        //   764: invokespecial   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getDateDividerContainer:()Lgg/essential/elementa/components/UIContainer;
        //   767: checkcast       Lgg/essential/elementa/UIComponent;
        //   770: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   773: aload_0         /* this */
        //   774: getstatic       gg/essential/gui/screenshot/components/ScreenshotDateGroup.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   777: iconst_5       
        //   778: aaload         
        //   779: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   782: pop            
        //   783: aload_0         /* this */
        //   784: new             Lgg/essential/elementa/components/UIContainer;
        //   787: dup            
        //   788: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   791: checkcast       Lgg/essential/elementa/UIComponent;
        //   794: astore          $this$constrain$iv
        //   796: aload           $this$constrain$iv
        //   798: astore          5
        //   800: aload           5
        //   802: astore          $this$constrain_u24lambda_u2d0$iv
        //   804: aload           $this$constrain_u24lambda_u2d0$iv
        //   806: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   809: astore          7
        //   811: astore          8
        //   813: aload           $this$images_delegate_u24lambda_u2d6
        //   815: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   818: dup            
        //   819: fconst_0       
        //   820: iconst_0       
        //   821: iconst_3       
        //   822: aconst_null    
        //   823: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   826: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   829: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   832: aload           $this$images_delegate_u24lambda_u2d6
        //   834: bipush          100
        //   836: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   839: checkcast       Ljava/lang/Number;
        //   842: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   845: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   848: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   851: aload           $this$images_delegate_u24lambda_u2d6
        //   853: new             Lgg/essential/elementa/constraints/ChildBasedRangeConstraint;
        //   856: dup            
        //   857: invokespecial   gg/essential/elementa/constraints/ChildBasedRangeConstraint.<init>:()V
        //   860: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   863: fconst_2       
        //   864: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   867: checkcast       Ljava/lang/Number;
        //   870: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   873: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   876: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   879: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   882: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   885: aload           8
        //   887: aload           5
        //   889: aload_0         /* this */
        //   890: invokespecial   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   893: checkcast       Lgg/essential/elementa/UIComponent;
        //   896: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   899: aload_0         /* this */
        //   900: getstatic       gg/essential/gui/screenshot/components/ScreenshotDateGroup.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   903: bipush          6
        //   905: aaload         
        //   906: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   909: putfield        gg/essential/gui/screenshot/components/ScreenshotDateGroup.images$delegate:Lkotlin/properties/ReadWriteProperty;
        //   912: aload_0         /* this */
        //   913: checkcast       Lgg/essential/elementa/UIComponent;
        //   916: astore          $this$constrain$iv
        //   918: aload           $this$constrain$iv
        //   920: astore          5
        //   922: aload           5
        //   924: astore          $this$constrain_u24lambda_u2d0$iv
        //   926: aload           $this$constrain_u24lambda_u2d0$iv
        //   928: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   931: astore          $this$_init__u24lambda_u2d7
        //   933: aload           $this$_init__u24lambda_u2d7
        //   935: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   938: dup            
        //   939: fconst_0       
        //   940: iconst_0       
        //   941: iconst_3       
        //   942: aconst_null    
        //   943: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   946: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   949: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   952: aload           $this$_init__u24lambda_u2d7
        //   954: bipush          100
        //   956: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   959: checkcast       Ljava/lang/Number;
        //   962: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   965: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   968: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   971: aload           $this$_init__u24lambda_u2d7
        //   973: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   976: dup            
        //   977: fconst_0       
        //   978: iconst_1       
        //   979: aconst_null    
        //   980: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   983: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   986: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   989: return         
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  range      
        //  startTime  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final DateRange getRange() {
        return this.range;
    }
    
    public final long getStartTime() {
        return this.startTime;
    }
    
    private final UIContainer getContent() {
        return (UIContainer)this.content$delegate.getValue((Object)this, (KProperty)ScreenshotDateGroup.$$delegatedProperties[0]);
    }
    
    @NotNull
    public final HollowUIContainer getTextContainer() {
        return (HollowUIContainer)this.textContainer$delegate.getValue((Object)this, (KProperty)ScreenshotDateGroup.$$delegatedProperties[1]);
    }
    
    private final EssentialUIText getTitle() {
        return (EssentialUIText)this.title$delegate.getValue((Object)this, (KProperty)ScreenshotDateGroup.$$delegatedProperties[2]);
    }
    
    private final UIContainer getDateDividerContainer() {
        return (UIContainer)this.dateDividerContainer$delegate.getValue((Object)this, (KProperty)ScreenshotDateGroup.$$delegatedProperties[3]);
    }
    
    private final UIBlock getLeftBlock() {
        return (UIBlock)this.leftBlock$delegate.getValue((Object)this, (KProperty)ScreenshotDateGroup.$$delegatedProperties[4]);
    }
    
    private final UIContainer getImages() {
        return (UIContainer)this.images$delegate.getValue((Object)this, (KProperty)ScreenshotDateGroup.$$delegatedProperties[6]);
    }
    
    private final String getDateName() {
        String format = null;
        switch (WhenMappings.$EnumSwitchMapping$0[this.range.ordinal()]) {
            case 1: {
                format = "Today";
                break;
            }
            case 2: {
                format = "Yesterday";
                break;
            }
            case 3: {
                format = "Earlier This Week";
                break;
            }
            case 4: {
                format = "Last Week";
                break;
            }
            case 5: {
                format = "Earlier This Month";
                break;
            }
            case 6: {
                format = "Last Month";
                break;
            }
            case 7: {
                Intrinsics.checkNotNullExpressionValue((Object)(format = ScreenshotDateGroup.format.format(new Date(this.startTime))), "format.format(Date(startTime))");
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return format;
    }
    
    public final boolean isVisible() {
        return this.visible.get();
    }
    
    public final void cleanup() {
        this.numChildren.set(0);
        if (this.getTextContainer().getHasParent()) {
            this.getTextContainer().hide(true);
        }
    }
    
    public final void addScreenshot(@NotNull final ScreenshotPreview screenshot) {
        Intrinsics.checkNotNullParameter((Object)screenshot, "screenshot");
        ComponentsKt.childOf((UIComponent)screenshot, this.getImages());
        this.numChildren.set((kotlin.jvm.functions.Function1<? super Object, ?>)ScreenshotDateGroup$addScreenshot.ScreenshotDateGroup$addScreenshot$1.INSTANCE);
    }
    
    @NotNull
    public final List<UIComponent> getImages() {
        return this.getImages().getChildren();
    }
    
    @NotNull
    public final ScreenshotDateGroup setupParent(@NotNull final UIComponent scroller, @NotNull final UIComponent navigation) {
        Intrinsics.checkNotNullParameter((Object)scroller, "scroller");
        Intrinsics.checkNotNullParameter((Object)navigation, "navigation");
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this.getTitle();
        final UIConstraints $this$setupParent_u24lambda_u2d8 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$setupParent_u24lambda_u2d8.setY(ConstraintsKt.coerceIn(ConstraintsKt.boundTo((SuperConstraint<Float>)new CenterConstraint(), navigation), ConstraintsKt.boundTo((SuperConstraint<Float>)new CenterConstraint(), this.getDateDividerContainer()), ConstraintsKt.boundTo((SuperConstraint<Float>)UtilitiesKt.pixels$default(0, true, false, 2, null), this.getContent())));
        StateExtensionsKt.bindParent$default$6fcd5b6b(this.getTextContainer(), scroller.getParent(), this.visible, false, null, 12);
        return ComponentsKt.childOf(this, scroller);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotDateGroup.class, "content", "getContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)ScreenshotDateGroup.class, "textContainer", "getTextContainer()Lgg/essential/gui/common/HollowUIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotDateGroup.class, "title", "getTitle()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotDateGroup.class, "dateDividerContainer", "getDateDividerContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotDateGroup.class, "leftBlock", "getLeftBlock()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotDateGroup.class, "rightBlock", "getRightBlock()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotDateGroup.class, "images", "getImages()Lgg/essential/elementa/components/UIContainer;", 0)) };
        new Companion((byte)0);
        format = new SimpleDateFormat("MMMM YYYY");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotDateGroup$Companion;", "", "()V", "format", "Ljava/text/SimpleDateFormat;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[DateRange.values().length];
            $EnumSwitchMapping$[DateRange.TODAY.ordinal()] = 1;
            $EnumSwitchMapping$[DateRange.YESTERDAY.ordinal()] = 2;
            $EnumSwitchMapping$[DateRange.EARLIER_WEEK.ordinal()] = 3;
            $EnumSwitchMapping$[DateRange.LAST_WEEK.ordinal()] = 4;
            $EnumSwitchMapping$[DateRange.EARLIER_MONTH.ordinal()] = 5;
            $EnumSwitchMapping$[DateRange.LAST_MONTH.ordinal()] = 6;
            $EnumSwitchMapping$[DateRange.MONTH_OTHER.ordinal()] = 7;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
