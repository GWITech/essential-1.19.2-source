package gg.essential.gui.screenshot.components;

import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import gg.essential.gui.screenshot.editor.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.screenshot.editor.tools.*;
import kotlin.properties.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000F
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010	J\b\u0010\u0012\u001a\u00020\u001fH\u0002J\b\u0010\u001c\u001a\u00020\u001fH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010
                                                   \u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001d\u0010\u0015¨\u0006 """ }, d2 = { "Lgg/essential/gui/screenshot/components/EditorToolbar;", "Lgg/essential/elementa/components/UIContainer;", "screenshotBrowser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "canvas", "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;", "active", "Lgg/essential/elementa/state/State;", "", "(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/elementa/state/State;)V", "colorPicker", "Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;", "getColorPicker", "()Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;", "colorPicker$delegate", "Lkotlin/properties/ReadWriteProperty;", "penTool", "Lgg/essential/gui/screenshot/editor/tools/PenTool;", "redo", "Lgg/essential/gui/common/IconButton;", "getRedo", "()Lgg/essential/gui/common/IconButton;", "redo$delegate", "strokeWidthComponent", "Lgg/essential/gui/screenshot/components/StrokeWidthComponent;", "getStrokeWidthComponent", "()Lgg/essential/gui/screenshot/components/StrokeWidthComponent;", "strokeWidthComponent$delegate", "undo", "getUndo", "undo$delegate", "", "essential" })
public final class EditorToolbar extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ScreenshotCanvas canvas;
    @NotNull
    private final State<Boolean> active;
    @NotNull
    private final PenTool penTool;
    @NotNull
    private final ReadWriteProperty colorPicker$delegate;
    
    public EditorToolbar(@NotNull final ScreenshotBrowser screenshotBrowser, @NotNull final ScreenshotCanvas canvas, @NotNull final State<Boolean> active) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "screenshotBrowser"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* canvas */
        //     7: ldc             "canvas"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* active */
        //    13: ldc             "active"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload_0         /* this */
        //    19: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    22: aload_0         /* this */
        //    23: aload_2         /* canvas */
        //    24: putfield        gg/essential/gui/screenshot/components/EditorToolbar.canvas:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //    27: aload_0         /* this */
        //    28: aload_3         /* active */
        //    29: putfield        gg/essential/gui/screenshot/components/EditorToolbar.active:Lgg/essential/elementa/state/State;
        //    32: aload_0         /* this */
        //    33: new             Lgg/essential/gui/screenshot/editor/tools/PenTool;
        //    36: dup            
        //    37: aload_0         /* this */
        //    38: getfield        gg/essential/gui/screenshot/components/EditorToolbar.canvas:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //    41: invokespecial   gg/essential/gui/screenshot/editor/tools/PenTool.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
        //    44: putfield        gg/essential/gui/screenshot/components/EditorToolbar.penTool:Lgg/essential/gui/screenshot/editor/tools/PenTool;
        //    47: aload_0         /* this */
        //    48: new             Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;
        //    51: dup            
        //    52: aload_0         /* this */
        //    53: getfield        gg/essential/gui/screenshot/components/EditorToolbar.penTool:Lgg/essential/gui/screenshot/editor/tools/PenTool;
        //    56: aload_1         /* screenshotBrowser */
        //    57: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getScreenshotManager:()Lgg/essential/network/connectionmanager/media/ScreenshotManager;
        //    60: aload_1         /* screenshotBrowser */
        //    61: aload_0         /* this */
        //    62: getfield        gg/essential/gui/screenshot/components/EditorToolbar.active:Lgg/essential/elementa/state/State;
        //    65: invokespecial   gg/essential/gui/screenshot/components/ScreenshotColorPicker.<init>:(Lgg/essential/gui/screenshot/editor/tools/PenTool;Lgg/essential/network/connectionmanager/media/ScreenshotManager;Lgg/essential/gui/screenshot/components/ScreenshotBrowser;Lgg/essential/elementa/state/State;)V
        //    68: checkcast       Lgg/essential/elementa/UIComponent;
        //    71: astore          $this$constrain$iv
        //    73: aload           $this$constrain$iv
        //    75: astore          5
        //    77: aload           5
        //    79: astore          $this$constrain_u24lambda_u2d0$iv
        //    81: aload           $this$constrain_u24lambda_u2d0$iv
        //    83: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    86: astore          7
        //    88: astore          8
        //    90: aload           $this$colorPicker_delegate_u24lambda_u2d0
        //    92: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //    95: dup            
        //    96: ldc             3.0
        //    98: iconst_0       
        //    99: iconst_2       
        //   100: aconst_null    
        //   101: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   104: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   107: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   110: aload           $this$colorPicker_delegate_u24lambda_u2d0
        //   112: iconst_0       
        //   113: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   116: checkcast       Ljava/lang/Number;
        //   119: iconst_1       
        //   120: iconst_0       
        //   121: iconst_2       
        //   122: aconst_null    
        //   123: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   126: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   129: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   132: aload           8
        //   134: aload           5
        //   136: aload_0         /* this */
        //   137: checkcast       Lgg/essential/elementa/UIComponent;
        //   140: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   143: aload_0         /* this */
        //   144: getstatic       gg/essential/gui/screenshot/components/EditorToolbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   147: iconst_0       
        //   148: aaload         
        //   149: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   152: putfield        gg/essential/gui/screenshot/components/EditorToolbar.colorPicker$delegate:Lkotlin/properties/ReadWriteProperty;
        //   155: new             Lgg/essential/gui/screenshot/components/StrokeWidthComponent;
        //   158: dup            
        //   159: aload_0         /* this */
        //   160: getfield        gg/essential/gui/screenshot/components/EditorToolbar.penTool:Lgg/essential/gui/screenshot/editor/tools/PenTool;
        //   163: invokespecial   gg/essential/gui/screenshot/components/StrokeWidthComponent.<init>:(Lgg/essential/gui/screenshot/editor/tools/PenTool;)V
        //   166: checkcast       Lgg/essential/elementa/UIComponent;
        //   169: astore          $this$constrain$iv
        //   171: aload           $this$constrain$iv
        //   173: astore          5
        //   175: aload           5
        //   177: astore          $this$constrain_u24lambda_u2d0$iv
        //   179: aload           $this$constrain_u24lambda_u2d0$iv
        //   181: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   184: astore          $this$strokeWidthComponent_delegate_u24lambda_u2d1
        //   186: aload           $this$strokeWidthComponent_delegate_u24lambda_u2d1
        //   188: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   191: dup            
        //   192: ldc             3.0
        //   194: iconst_0       
        //   195: iconst_2       
        //   196: aconst_null    
        //   197: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   200: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   203: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   206: aload           $this$strokeWidthComponent_delegate_u24lambda_u2d1
        //   208: iconst_0       
        //   209: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   212: checkcast       Ljava/lang/Number;
        //   215: iconst_1       
        //   216: iconst_0       
        //   217: iconst_2       
        //   218: aconst_null    
        //   219: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   222: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   225: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   228: aload           5
        //   230: aload_0         /* this */
        //   231: checkcast       Lgg/essential/elementa/UIComponent;
        //   234: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   237: aload_0         /* this */
        //   238: getstatic       gg/essential/gui/screenshot/components/EditorToolbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   241: iconst_1       
        //   242: aaload         
        //   243: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   246: pop            
        //   247: new             Lgg/essential/gui/common/IconButton;
        //   250: dup            
        //   251: getstatic       gg/essential/gui/EssentialPalette.UNDO_9X:Lgg/essential/gui/image/ImageFactory;
        //   254: aconst_null    
        //   255: ldc             "Undo"
        //   257: iconst_0       
        //   258: iconst_0       
        //   259: iconst_0       
        //   260: bipush          58
        //   262: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   265: checkcast       Lgg/essential/elementa/UIComponent;
        //   268: astore          $this$constrain$iv
        //   270: aload           $this$constrain$iv
        //   272: astore          5
        //   274: aload           5
        //   276: astore          $this$constrain_u24lambda_u2d0$iv
        //   278: aload           $this$constrain_u24lambda_u2d0$iv
        //   280: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   283: astore          $this$undo_delegate_u24lambda_u2d2
        //   285: aload           $this$undo_delegate_u24lambda_u2d2
        //   287: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   290: dup            
        //   291: ldc             3.0
        //   293: iconst_0       
        //   294: iconst_2       
        //   295: aconst_null    
        //   296: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   299: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   302: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   305: aload           $this$undo_delegate_u24lambda_u2d2
        //   307: iconst_0       
        //   308: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   311: checkcast       Ljava/lang/Number;
        //   314: iconst_1       
        //   315: iconst_0       
        //   316: iconst_2       
        //   317: aconst_null    
        //   318: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   321: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   324: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   327: aload           $this$undo_delegate_u24lambda_u2d2
        //   329: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   332: dup            
        //   333: fconst_1       
        //   334: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //   337: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   340: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   343: aload           $this$undo_delegate_u24lambda_u2d2
        //   345: bipush          100
        //   347: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   350: checkcast       Ljava/lang/Number;
        //   353: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   356: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   359: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   362: aload           5
        //   364: checkcast       Lgg/essential/gui/common/IconButton;
        //   367: aload_0         /* this */
        //   368: getfield        gg/essential/gui/screenshot/components/EditorToolbar.canvas:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //   371: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas.getUndoEnabled:()Lgg/essential/elementa/state/BasicState;
        //   374: checkcast       Lgg/essential/elementa/state/State;
        //   377: invokevirtual   gg/essential/gui/common/IconButton.rebindEnabled:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/IconButton;
        //   380: new             Lgg/essential/gui/screenshot/components/EditorToolbar$undo$3;
        //   383: dup            
        //   384: aload_0         /* this */
        //   385: invokespecial   gg/essential/gui/screenshot/components/EditorToolbar$undo$3.<init>:(Lgg/essential/gui/screenshot/components/EditorToolbar;)V
        //   388: checkcast       Lkotlin/jvm/functions/Function0;
        //   391: invokevirtual   gg/essential/gui/common/IconButton.onActiveClick:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/IconButton;
        //   394: checkcast       Lgg/essential/elementa/UIComponent;
        //   397: aload_0         /* this */
        //   398: checkcast       Lgg/essential/elementa/UIComponent;
        //   401: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   404: aload_0         /* this */
        //   405: getstatic       gg/essential/gui/screenshot/components/EditorToolbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   408: iconst_2       
        //   409: aaload         
        //   410: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   413: pop            
        //   414: new             Lgg/essential/gui/common/IconButton;
        //   417: dup            
        //   418: getstatic       gg/essential/gui/EssentialPalette.REDO_9X:Lgg/essential/gui/image/ImageFactory;
        //   421: aconst_null    
        //   422: ldc             "Redo"
        //   424: iconst_0       
        //   425: iconst_0       
        //   426: iconst_0       
        //   427: bipush          58
        //   429: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   432: checkcast       Lgg/essential/elementa/UIComponent;
        //   435: astore          $this$constrain$iv
        //   437: aload           $this$constrain$iv
        //   439: astore          5
        //   441: aload           5
        //   443: astore          $this$constrain_u24lambda_u2d0$iv
        //   445: aload           $this$constrain_u24lambda_u2d0$iv
        //   447: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   450: astore          $this$redo_delegate_u24lambda_u2d3
        //   452: aload           $this$redo_delegate_u24lambda_u2d3
        //   454: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   457: dup            
        //   458: ldc             3.0
        //   460: iconst_0       
        //   461: iconst_2       
        //   462: aconst_null    
        //   463: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   466: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   469: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   472: aload           $this$redo_delegate_u24lambda_u2d3
        //   474: iconst_0       
        //   475: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   478: checkcast       Ljava/lang/Number;
        //   481: iconst_1       
        //   482: iconst_0       
        //   483: iconst_2       
        //   484: aconst_null    
        //   485: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   488: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   491: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   494: aload           $this$redo_delegate_u24lambda_u2d3
        //   496: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   499: dup            
        //   500: fconst_1       
        //   501: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //   504: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   507: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   510: aload           $this$redo_delegate_u24lambda_u2d3
        //   512: bipush          100
        //   514: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   517: checkcast       Ljava/lang/Number;
        //   520: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   523: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   526: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   529: aload           5
        //   531: checkcast       Lgg/essential/gui/common/IconButton;
        //   534: aload_0         /* this */
        //   535: getfield        gg/essential/gui/screenshot/components/EditorToolbar.canvas:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //   538: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas.getRedoEnabled:()Lgg/essential/elementa/state/BasicState;
        //   541: checkcast       Lgg/essential/elementa/state/State;
        //   544: invokevirtual   gg/essential/gui/common/IconButton.rebindEnabled:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/IconButton;
        //   547: new             Lgg/essential/gui/screenshot/components/EditorToolbar$redo$3;
        //   550: dup            
        //   551: aload_0         /* this */
        //   552: invokespecial   gg/essential/gui/screenshot/components/EditorToolbar$redo$3.<init>:(Lgg/essential/gui/screenshot/components/EditorToolbar;)V
        //   555: checkcast       Lkotlin/jvm/functions/Function0;
        //   558: invokevirtual   gg/essential/gui/common/IconButton.onActiveClick:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/IconButton;
        //   561: checkcast       Lgg/essential/elementa/UIComponent;
        //   564: aload_0         /* this */
        //   565: checkcast       Lgg/essential/elementa/UIComponent;
        //   568: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   571: aload_0         /* this */
        //   572: getstatic       gg/essential/gui/screenshot/components/EditorToolbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   575: iconst_3       
        //   576: aaload         
        //   577: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   580: pop            
        //   581: aload_0         /* this */
        //   582: getfield        gg/essential/gui/screenshot/components/EditorToolbar.penTool:Lgg/essential/gui/screenshot/editor/tools/PenTool;
        //   585: invokevirtual   gg/essential/gui/screenshot/editor/tools/PenTool.enable:()V
        //   588: aload_0         /* this */
        //   589: checkcast       Lgg/essential/elementa/UIComponent;
        //   592: astore          $this$constrain$iv
        //   594: aload           $this$constrain$iv
        //   596: astore          5
        //   598: aload           5
        //   600: astore          $this$constrain_u24lambda_u2d0$iv
        //   602: aload           $this$constrain_u24lambda_u2d0$iv
        //   604: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   607: astore          $this$_init__u24lambda_u2d4
        //   609: aload           $this$_init__u24lambda_u2d4
        //   611: bipush          17
        //   613: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   616: checkcast       Ljava/lang/Number;
        //   619: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   622: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   625: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   628: aload           $this$_init__u24lambda_u2d4
        //   630: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   633: dup            
        //   634: fconst_0       
        //   635: iconst_1       
        //   636: aconst_null    
        //   637: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   640: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   643: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   646: aload_1         /* screenshotBrowser */
        //   647: new             Lgg/essential/gui/screenshot/components/EditorToolbar$2;
        //   650: dup            
        //   651: aload_0         /* this */
        //   652: invokespecial   gg/essential/gui/screenshot/components/EditorToolbar$2.<init>:(Lgg/essential/gui/screenshot/components/EditorToolbar;)V
        //   655: checkcast       Lkotlin/jvm/functions/Function0;
        //   658: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.closeOperation:(Lkotlin/jvm/functions/Function0;)V
        //   661: aload_1         /* screenshotBrowser */
        //   662: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getWindow:()Lgg/essential/elementa/components/Window;
        //   665: new             Lgg/essential/gui/screenshot/components/EditorToolbar$3;
        //   668: dup            
        //   669: aload_0         /* this */
        //   670: invokespecial   gg/essential/gui/screenshot/components/EditorToolbar$3.<init>:(Lgg/essential/gui/screenshot/components/EditorToolbar;)V
        //   673: checkcast       Lkotlin/jvm/functions/Function3;
        //   676: invokevirtual   gg/essential/elementa/components/Window.onKeyType:(Lkotlin/jvm/functions/Function3;)Lgg/essential/elementa/UIComponent;
        //   679: pop            
        //   680: return         
        //    Signature:
        //  (Lgg/essential/gui/screenshot/components/ScreenshotBrowser;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;)V
        //    MethodParameters:
        //  Name               Flags  
        //  -----------------  -----
        //  screenshotBrowser  
        //  canvas             
        //  active             
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final ScreenshotColorPicker getColorPicker() {
        return (ScreenshotColorPicker)this.colorPicker$delegate.getValue((Object)this, (KProperty)EditorToolbar.$$delegatedProperties[0]);
    }
    
    private final void undo() {
        this.canvas.getVectorEditingOverlay().undo();
    }
    
    private final void redo() {
        this.canvas.getVectorEditingOverlay().redo();
    }
    
    public static final /* synthetic */ void access$undo(final EditorToolbar $this) {
        $this.undo();
    }
    
    public static final /* synthetic */ void access$redo(final EditorToolbar $this) {
        $this.redo();
    }
    
    public static final /* synthetic */ ScreenshotColorPicker access$getColorPicker(final EditorToolbar $this) {
        return $this.getColorPicker();
    }
    
    public static final /* synthetic */ State access$getActive$p(final EditorToolbar $this) {
        return $this.active;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EditorToolbar.class, "colorPicker", "getColorPicker()Lgg/essential/gui/screenshot/components/ScreenshotColorPicker;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EditorToolbar.class, "strokeWidthComponent", "getStrokeWidthComponent()Lgg/essential/gui/screenshot/components/StrokeWidthComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EditorToolbar.class, "undo", "getUndo()Lgg/essential/gui/common/IconButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EditorToolbar.class, "redo", "getRedo()Lgg/essential/gui/common/IconButton;", 0)) };
    }
}
