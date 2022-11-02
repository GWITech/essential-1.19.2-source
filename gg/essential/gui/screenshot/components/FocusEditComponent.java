package gg.essential.gui.screenshot.components;

import kotlin.*;
import kotlin.reflect.*;
import gg.essential.gui.screenshot.image.*;
import gg.essential.elementa.state.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.screenshot.editor.*;
import gg.essential.gui.screenshot.providers.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import java.util.*;
import net.minecraft.client.texture.*;
import java.util.concurrent.*;
import java.io.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000^
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010#\u001a\u00020$H\u0016J\u000e\u0010%\u001a
                                                   \u0012\u0004\u0012\u00020'\u0018\u00010&J\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020$H\u0016J\b\u0010+\u001a\u00020$H\u0016J\b\u0010,\u001a\u00020$H\u0002R\u001c\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010	\u001a\u00020
                                                   8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0016\u0010\u001c\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001dX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b"\u0010\u000e\u001a\u0004\b \u0010!¨\u0006-""" }, d2 = { "Lgg/essential/gui/screenshot/components/FocusEditComponent;", "Lgg/essential/gui/screenshot/components/FocusComponent;", "screenshotBrowser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;)V", "aspectConstraint", "Lgg/essential/elementa/state/MappedState;", "Lgg/essential/gui/screenshot/image/PixelBufferTexture;", "", "canvas", "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;", "getCanvas", "()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;", "canvas$delegate", "Lkotlin/properties/ReadWriteProperty;", "imageSize", "Lgg/essential/elementa/components/UIContainer;", "getImageSize", "()Lgg/essential/elementa/components/UIContainer;", "imageSize$delegate", "imageSizeContainer", "getImageSizeContainer", "imageSizeContainer$delegate", "saveButton", "Lgg/essential/gui/common/IconButton;", "getSaveButton", "()Lgg/essential/gui/common/IconButton;", "saveButton$delegate", "textureState", "Lgg/essential/elementa/state/BasicState;", "toolbar", "Lgg/essential/gui/screenshot/components/EditorToolbar;", "getToolbar", "()Lgg/essential/gui/screenshot/components/EditorToolbar;", "toolbar$delegate", "animationFrame", "", "exportEditImageToTempFile", "Ljava/util/concurrent/CompletableFuture;", "Ljava/io/File;", "hasEdits", "", "onBackButtonPressed", "onClose", "saveCurrentChanges", "essential" })
public final class FocusEditComponent extends FocusComponent
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ScreenshotBrowser screenshotBrowser;
    @NotNull
    private final BasicState<PixelBufferTexture> textureState;
    @NotNull
    private final MappedState<PixelBufferTexture, Float> aspectConstraint;
    @NotNull
    private final ReadWriteProperty imageSizeContainer$delegate;
    @NotNull
    private final ReadWriteProperty imageSize$delegate;
    @NotNull
    private final ReadWriteProperty canvas$delegate;
    
    public FocusEditComponent(@NotNull final ScreenshotBrowser screenshotBrowser) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "screenshotBrowser"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: aload_1         /* screenshotBrowser */
        //     8: getstatic       gg/essential/gui/screenshot/components/FocusType.EDIT:Lgg/essential/gui/screenshot/components/FocusType;
        //    11: invokespecial   gg/essential/gui/screenshot/components/FocusComponent.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;Lgg/essential/gui/screenshot/components/FocusType;)V
        //    14: aload_0         /* this */
        //    15: aload_1         /* screenshotBrowser */
        //    16: putfield        gg/essential/gui/screenshot/components/FocusEditComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //    19: aload_0         /* this */
        //    20: new             Lgg/essential/elementa/state/BasicState;
        //    23: dup            
        //    24: aconst_null    
        //    25: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    28: putfield        gg/essential/gui/screenshot/components/FocusEditComponent.textureState:Lgg/essential/elementa/state/BasicState;
        //    31: aload_0         /* this */
        //    32: aload_0         /* this */
        //    33: getfield        gg/essential/gui/screenshot/components/FocusEditComponent.textureState:Lgg/essential/elementa/state/BasicState;
        //    36: getstatic       gg/essential/gui/screenshot/components/FocusEditComponent$aspectConstraint$1.INSTANCE:Lgg/essential/gui/screenshot/components/FocusEditComponent$aspectConstraint$1;
        //    39: checkcast       Lkotlin/jvm/functions/Function1;
        //    42: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    45: putfield        gg/essential/gui/screenshot/components/FocusEditComponent.aspectConstraint:Lgg/essential/elementa/state/MappedState;
        //    48: aload_0         /* this */
        //    49: new             Lgg/essential/elementa/components/UIContainer;
        //    52: dup            
        //    53: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    56: checkcast       Lgg/essential/elementa/UIComponent;
        //    59: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    62: astore_2        /* $this$constrain$iv */
        //    63: aload_2         /* $this$constrain$iv */
        //    64: astore          4
        //    66: aload           4
        //    68: astore          $this$constrain_u24lambda_u2d0$iv
        //    70: aload           $this$constrain_u24lambda_u2d0$iv
        //    72: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    75: astore          6
        //    77: astore          7
        //    79: aload           $this$imageSizeContainer_delegate_u24lambda_u2d0
        //    81: bipush          67
        //    83: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    86: checkcast       Ljava/lang/Number;
        //    89: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    92: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    95: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    98: aload           $this$imageSizeContainer_delegate_u24lambda_u2d0
        //   100: bipush          100
        //   102: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   105: checkcast       Ljava/lang/Number;
        //   108: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   111: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   114: bipush          40
        //   116: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   119: checkcast       Ljava/lang/Number;
        //   122: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   125: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   128: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   131: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   134: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   137: aload           7
        //   139: aload           4
        //   141: aload_0         /* this */
        //   142: invokevirtual   gg/essential/gui/screenshot/components/FocusEditComponent.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   145: checkcast       Lgg/essential/elementa/UIComponent;
        //   148: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   151: aload_0         /* this */
        //   152: getstatic       gg/essential/gui/screenshot/components/FocusEditComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   155: iconst_0       
        //   156: aaload         
        //   157: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   160: putfield        gg/essential/gui/screenshot/components/FocusEditComponent.imageSizeContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   163: aload_0         /* this */
        //   164: new             Lgg/essential/elementa/components/UIContainer;
        //   167: dup            
        //   168: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   171: checkcast       Lgg/essential/elementa/UIComponent;
        //   174: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   177: astore_2        /* $this$constrain$iv */
        //   178: aload_2         /* $this$constrain$iv */
        //   179: astore          4
        //   181: aload           4
        //   183: astore          $this$constrain_u24lambda_u2d0$iv
        //   185: aload           $this$constrain_u24lambda_u2d0$iv
        //   187: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   190: astore          6
        //   192: astore          7
        //   194: aload           $this$imageSize_delegate_u24lambda_u2d1
        //   196: new             Lgg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint;
        //   199: dup            
        //   200: aload_0         /* this */
        //   201: getfield        gg/essential/gui/screenshot/components/FocusEditComponent.aspectConstraint:Lgg/essential/elementa/state/MappedState;
        //   204: checkcast       Lgg/essential/elementa/state/State;
        //   207: invokespecial   gg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint.<init>:(Lgg/essential/elementa/state/State;)V
        //   210: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   213: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   216: aload           $this$imageSize_delegate_u24lambda_u2d1
        //   218: new             Lgg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint;
        //   221: dup            
        //   222: aload_0         /* this */
        //   223: getfield        gg/essential/gui/screenshot/components/FocusEditComponent.aspectConstraint:Lgg/essential/elementa/state/MappedState;
        //   226: checkcast       Lgg/essential/elementa/state/State;
        //   229: invokespecial   gg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint.<init>:(Lgg/essential/elementa/state/State;)V
        //   232: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   235: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   238: aload           7
        //   240: aload           4
        //   242: aload_0         /* this */
        //   243: invokespecial   gg/essential/gui/screenshot/components/FocusEditComponent.getImageSizeContainer:()Lgg/essential/elementa/components/UIContainer;
        //   246: checkcast       Lgg/essential/elementa/UIComponent;
        //   249: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   252: aload_0         /* this */
        //   253: getstatic       gg/essential/gui/screenshot/components/FocusEditComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   256: iconst_1       
        //   257: aaload         
        //   258: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   261: putfield        gg/essential/gui/screenshot/components/FocusEditComponent.imageSize$delegate:Lkotlin/properties/ReadWriteProperty;
        //   264: aload_0         /* this */
        //   265: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //   268: dup            
        //   269: aload_0         /* this */
        //   270: getfield        gg/essential/gui/screenshot/components/FocusEditComponent.textureState:Lgg/essential/elementa/state/BasicState;
        //   273: checkcast       Lgg/essential/elementa/state/State;
        //   276: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas.<init>:(Lgg/essential/elementa/state/State;)V
        //   279: checkcast       Lgg/essential/elementa/UIComponent;
        //   282: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   285: astore_2        /* $this$constrain$iv */
        //   286: aload_2         /* $this$constrain$iv */
        //   287: astore          4
        //   289: aload           4
        //   291: astore          $this$constrain_u24lambda_u2d0$iv
        //   293: aload           $this$constrain_u24lambda_u2d0$iv
        //   295: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   298: astore          6
        //   300: astore          7
        //   302: aload           $this$canvas_delegate_u24lambda_u2d2
        //   304: bipush          100
        //   306: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   309: checkcast       Ljava/lang/Number;
        //   312: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   315: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   318: aload_0         /* this */
        //   319: invokespecial   gg/essential/gui/screenshot/components/FocusEditComponent.getImageSize:()Lgg/essential/elementa/components/UIContainer;
        //   322: checkcast       Lgg/essential/elementa/UIComponent;
        //   325: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   328: iconst_4       
        //   329: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   332: checkcast       Ljava/lang/Number;
        //   335: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   338: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   341: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   344: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   347: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   350: aload           $this$canvas_delegate_u24lambda_u2d2
        //   352: bipush          100
        //   354: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   357: checkcast       Ljava/lang/Number;
        //   360: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   363: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   366: aload_0         /* this */
        //   367: invokespecial   gg/essential/gui/screenshot/components/FocusEditComponent.getImageSize:()Lgg/essential/elementa/components/UIContainer;
        //   370: checkcast       Lgg/essential/elementa/UIComponent;
        //   373: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   376: iconst_4       
        //   377: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   380: checkcast       Ljava/lang/Number;
        //   383: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   386: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   389: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   392: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   395: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   398: aload           7
        //   400: aload           4
        //   402: astore_2        /* $this$constrain$iv */
        //   403: aload_2        
        //   404: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //   407: astore_3       
        //   408: astore          7
        //   410: aload_0         /* this */
        //   411: getfield        gg/essential/gui/screenshot/components/FocusEditComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   414: new             Lgg/essential/gui/screenshot/components/FocusEditComponent$canvas$3$1;
        //   417: dup            
        //   418: aload_3         /* $this$canvas_delegate_u24lambda_u2d3 */
        //   419: invokespecial   gg/essential/gui/screenshot/components/FocusEditComponent$canvas$3$1.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
        //   422: checkcast       Lkotlin/jvm/functions/Function0;
        //   425: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.closeOperation:(Lkotlin/jvm/functions/Function0;)V
        //   428: aload           7
        //   430: aload_2        
        //   431: aload_0         /* this */
        //   432: invokevirtual   gg/essential/gui/screenshot/components/FocusEditComponent.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   435: checkcast       Lgg/essential/elementa/UIComponent;
        //   438: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   441: aload_0         /* this */
        //   442: getstatic       gg/essential/gui/screenshot/components/FocusEditComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   445: iconst_2       
        //   446: aaload         
        //   447: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   450: putfield        gg/essential/gui/screenshot/components/FocusEditComponent.canvas$delegate:Lkotlin/properties/ReadWriteProperty;
        //   453: new             Lgg/essential/gui/screenshot/components/EditorToolbar;
        //   456: dup            
        //   457: aload_0         /* this */
        //   458: getfield        gg/essential/gui/screenshot/components/FocusEditComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   461: aload_0         /* this */
        //   462: invokespecial   gg/essential/gui/screenshot/components/FocusEditComponent.getCanvas:()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //   465: aload_0         /* this */
        //   466: invokevirtual   gg/essential/gui/screenshot/components/FocusEditComponent.getActive:()Lgg/essential/elementa/state/State;
        //   469: invokespecial   gg/essential/gui/screenshot/components/EditorToolbar.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/elementa/state/State;)V
        //   472: checkcast       Lgg/essential/elementa/UIComponent;
        //   475: astore_2        /* $this$constrain$iv */
        //   476: aload_2         /* $this$constrain$iv */
        //   477: astore          4
        //   479: aload           4
        //   481: astore          $this$constrain_u24lambda_u2d0$iv
        //   483: aload           $this$constrain_u24lambda_u2d0$iv
        //   485: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   488: astore          $this$toolbar_delegate_u24lambda_u2d4
        //   490: aload           $this$toolbar_delegate_u24lambda_u2d4
        //   492: bipush          10
        //   494: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   497: checkcast       Ljava/lang/Number;
        //   500: iconst_1       
        //   501: iconst_0       
        //   502: iconst_2       
        //   503: aconst_null    
        //   504: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   507: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   510: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   513: aload           $this$toolbar_delegate_u24lambda_u2d4
        //   515: bipush          10
        //   517: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   520: checkcast       Ljava/lang/Number;
        //   523: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   526: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   529: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   532: aload           4
        //   534: aload_0         /* this */
        //   535: invokevirtual   gg/essential/gui/screenshot/components/FocusEditComponent.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   538: checkcast       Lgg/essential/elementa/UIComponent;
        //   541: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   544: aload_0         /* this */
        //   545: getstatic       gg/essential/gui/screenshot/components/FocusEditComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   548: iconst_3       
        //   549: aaload         
        //   550: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   553: pop            
        //   554: new             Lgg/essential/gui/common/IconButton;
        //   557: dup            
        //   558: getstatic       gg/essential/gui/EssentialPalette.SAVE_9X:Lgg/essential/gui/image/ImageFactory;
        //   561: ldc_w           "Save"
        //   564: aconst_null    
        //   565: iconst_1       
        //   566: iconst_0       
        //   567: iconst_0       
        //   568: bipush          52
        //   570: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   573: new             Lgg/essential/gui/common/IconButton$Dimension$Fixed;
        //   576: dup            
        //   577: ldc_w           47.0
        //   580: ldc_w           17.0
        //   583: invokespecial   gg/essential/gui/common/IconButton$Dimension$Fixed.<init>:(FF)V
        //   586: checkcast       Lgg/essential/gui/common/IconButton$Dimension;
        //   589: invokevirtual   gg/essential/gui/common/IconButton.setDimension:(Lgg/essential/gui/common/IconButton$Dimension;)Lgg/essential/gui/common/IconButton;
        //   592: aload_0         /* this */
        //   593: invokespecial   gg/essential/gui/screenshot/components/FocusEditComponent.getCanvas:()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //   596: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas.getHasChanges:()Lgg/essential/elementa/state/State;
        //   599: invokevirtual   gg/essential/gui/common/IconButton.rebindEnabled:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/IconButton;
        //   602: new             Lgg/essential/gui/screenshot/components/FocusEditComponent$saveButton$2;
        //   605: dup            
        //   606: aload_0         /* this */
        //   607: invokespecial   gg/essential/gui/screenshot/components/FocusEditComponent$saveButton$2.<init>:(Lgg/essential/gui/screenshot/components/FocusEditComponent;)V
        //   610: checkcast       Lkotlin/jvm/functions/Function0;
        //   613: invokevirtual   gg/essential/gui/common/IconButton.onActiveClick:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/IconButton;
        //   616: checkcast       Lgg/essential/elementa/UIComponent;
        //   619: astore_2        /* $this$constrain$iv */
        //   620: aload_2         /* $this$constrain$iv */
        //   621: astore          4
        //   623: aload           4
        //   625: astore          $this$constrain_u24lambda_u2d0$iv
        //   627: aload           $this$constrain_u24lambda_u2d0$iv
        //   629: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   632: astore          $this$saveButton_delegate_u24lambda_u2d5
        //   634: aload           $this$saveButton_delegate_u24lambda_u2d5
        //   636: bipush          10
        //   638: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   641: checkcast       Ljava/lang/Number;
        //   644: iconst_1       
        //   645: iconst_0       
        //   646: iconst_2       
        //   647: aconst_null    
        //   648: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   651: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   654: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   657: aload           $this$saveButton_delegate_u24lambda_u2d5
        //   659: bipush          10
        //   661: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   664: checkcast       Ljava/lang/Number;
        //   667: iconst_1       
        //   668: iconst_0       
        //   669: iconst_2       
        //   670: aconst_null    
        //   671: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   674: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   677: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   680: aload           4
        //   682: aload_0         /* this */
        //   683: invokevirtual   gg/essential/gui/screenshot/components/FocusEditComponent.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   686: checkcast       Lgg/essential/elementa/UIComponent;
        //   689: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   692: aload_0         /* this */
        //   693: getstatic       gg/essential/gui/screenshot/components/FocusEditComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   696: iconst_4       
        //   697: aaload         
        //   698: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   701: pop            
        //   702: aload_0         /* this */
        //   703: getfield        gg/essential/gui/screenshot/components/FocusEditComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   706: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getFocusing:()Lgg/essential/elementa/state/BasicState;
        //   709: astore_2        /* focusing */
        //   710: aload_0         /* this */
        //   711: invokevirtual   gg/essential/gui/screenshot/components/FocusEditComponent.getTime:()Lgg/essential/gui/common/shadow/EssentialUIText;
        //   714: aload_0         /* this */
        //   715: invokespecial   gg/essential/gui/screenshot/components/FocusEditComponent.getCanvas:()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //   718: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas.getHasChanges:()Lgg/essential/elementa/state/State;
        //   721: aload_2         /* focusing */
        //   722: checkcast       Lgg/essential/elementa/state/State;
        //   725: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   728: getstatic       gg/essential/gui/screenshot/components/FocusEditComponent$1.INSTANCE:Lgg/essential/gui/screenshot/components/FocusEditComponent$1;
        //   731: checkcast       Lkotlin/jvm/functions/Function1;
        //   734: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   737: checkcast       Lgg/essential/elementa/state/State;
        //   740: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   743: pop            
        //   744: return         
        //    MethodParameters:
        //  Name               Flags  
        //  -----------------  -----
        //  screenshotBrowser  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIContainer getImageSizeContainer() {
        return (UIContainer)this.imageSizeContainer$delegate.getValue((Object)this, (KProperty)FocusEditComponent.$$delegatedProperties[0]);
    }
    
    private final UIContainer getImageSize() {
        return (UIContainer)this.imageSize$delegate.getValue((Object)this, (KProperty)FocusEditComponent.$$delegatedProperties[1]);
    }
    
    private final ScreenshotCanvas getCanvas() {
        return (ScreenshotCanvas)this.canvas$delegate.getValue((Object)this, (KProperty)FocusEditComponent.$$delegatedProperties[2]);
    }
    
    private final void saveCurrentChanges() {
        final ScreenshotProperties source = this.screenshotBrowser.getFocusing().get();
        if (source != null) {
            ScreenshotCanvas.exportImage$default$361f293f$27c9ee5d(this.getCanvas(), source, this.screenshotBrowser.getScreenshotManager(), this.screenshotBrowser, false, true);
        }
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        final ScreenshotProperties focused = this.screenshotBrowser.getFocusing().get();
        if (this.getActive().get() && focused != null) {
            final int targetIndex = this.getProviderManager().getCurrentPaths().indexOf(focused.getPath());
            if (targetIndex != -1) {
                final Map provideFocus = this.getProviderManager().provideFocus(WindowProviderKt.toSingleWindowRequest(targetIndex));
                final Identifier resourceLocation = provideFocus.get(focused.getPath());
                if (resourceLocation != null) {
                    final TextureManager textureManager = MinecraftClient.getInstance().getTextureManager();
                    final PixelBufferTexture texture = (PixelBufferTexture)textureManager.getTexture(resourceLocation);
                    if (texture != null) {
                        this.textureState.set(texture);
                        this.aspectConstraint.set(Float.valueOf(texture.getImageWidth() / (float)texture.getImageHeight()));
                        return;
                    }
                }
            }
        }
        this.textureState.set((PixelBufferTexture)null);
    }
    
    public final boolean hasEdits() {
        return this.getCanvas().getHasChanges().get();
    }
    
    @Nullable
    public final CompletableFuture<File> exportEditImageToTempFile() {
        final ScreenshotProperties source = this.screenshotBrowser.getFocusing().get();
        return (source != null) ? ScreenshotCanvas.exportImage$default$361f293f$27c9ee5d(this.getCanvas(), source, this.screenshotBrowser.getScreenshotManager(), this.screenshotBrowser, true, false) : ((CompletableFuture<File>)null);
    }
    
    @Override
    public void onClose() {
        this.getCanvas().reset();
    }
    
    @Override
    public void onBackButtonPressed() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   gg/essential/gui/screenshot/components/FocusEditComponent.getCanvas:()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //     4: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas.getHasChanges:()Lgg/essential/elementa/state/State;
        //     7: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //    10: checkcast       Ljava/lang/Boolean;
        //    13: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    16: ifeq            92
        //    19: getstatic       gg/essential/util/GuiUtil.INSTANCE:Lgg/essential/util/GuiUtil;
        //    22: new             Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    25: dup            
        //    26: iconst_0       
        //    27: invokespecial   gg/essential/gui/common/modal/ConfirmDenyModal.<init>:(Z)V
        //    30: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //    33: astore_1        /* $this$configure$iv */
        //    34: aload_1         /* $this$configure$iv */
        //    35: astore_2       
        //    36: aload_2        
        //    37: astore_3        /* $this$configure_u24lambda_u2d0$iv */
        //    38: aload_3         /* $this$configure_u24lambda_u2d0$iv */
        //    39: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    42: astore          4
        //    44: astore          5
        //    46: aload           $this$onBackButtonPressed_u24lambda_u2d6
        //    48: ldc_w           "Continue"
        //    51: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setPrimaryButtonText:(Ljava/lang/String;)V
        //    54: aload           $this$onBackButtonPressed_u24lambda_u2d6
        //    56: ldc_w           "Are you sure you want to quit without saving?"
        //    59: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setTitleText:(Ljava/lang/String;)V
        //    62: aload           5
        //    64: aload_2        
        //    65: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    68: new             Lgg/essential/gui/screenshot/components/FocusEditComponent$onBackButtonPressed$2;
        //    71: dup            
        //    72: aload_0         /* this */
        //    73: invokespecial   gg/essential/gui/screenshot/components/FocusEditComponent$onBackButtonPressed$2.<init>:(Lgg/essential/gui/screenshot/components/FocusEditComponent;)V
        //    76: checkcast       Lkotlin/jvm/functions/Function0;
        //    79: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.onPrimaryAction:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    82: checkcast       Lgg/essential/gui/common/modal/Modal;
        //    85: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //    88: pop            
        //    89: goto            96
        //    92: aload_0         /* this */
        //    93: invokespecial   gg/essential/gui/screenshot/components/FocusComponent.onBackButtonPressed:()V
        //    96: return         
        //    StackMapTable: 00 02 FB 00 5C 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final /* synthetic */ void access$onBackButtonPressed$s346859301(final FocusEditComponent $this) {
        $this.onBackButtonPressed();
    }
    
    public static final /* synthetic */ void access$saveCurrentChanges(final FocusEditComponent $this) {
        $this.saveCurrentChanges();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusEditComponent.class, "imageSizeContainer", "getImageSizeContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusEditComponent.class, "imageSize", "getImageSize()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusEditComponent.class, "canvas", "getCanvas()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusEditComponent.class, "toolbar", "getToolbar()Lgg/essential/gui/screenshot/components/EditorToolbar;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusEditComponent.class, "saveButton", "getSaveButton()Lgg/essential/gui/common/IconButton;", 0)) };
    }
}
