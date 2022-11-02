package gg.essential.gui.screenshot.editor;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import gg.essential.elementa.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import gg.essential.network.connectionmanager.media.*;
import gg.essential.gui.screenshot.components.*;
import java.util.concurrent.*;
import java.io.*;
import javax.imageio.*;
import org.lwjgl.*;
import gg.essential.universal.*;
import java.awt.*;
import gg.essential.util.*;
import java.awt.image.*;
import java.nio.*;
import kotlin.ranges.*;
import kotlin.*;
import gg.essential.gui.screenshot.editor.change.*;
import gg.essential.gui.screenshot.image.*;
import gg.essential.gui.common.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import java.util.*;
import gg.essential.util.lwjgl3.api.nanovg.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0084\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b\u0018\u00002\u00020\u0001:\u0004IJKLB\u0015\u0012\u000e\u0010\u0002\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005J>\u00107\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020 2\b\b\u0002\u0010A\u001a\u00020 2\u0006\u0010B\u001a\u00020 J\f\u0010C\u001a\b\u0012\u0004\u0012\u00020 0\u0003J"\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160E2\u0006\u0010F\u001a\u00020\u00162\u0006\u0010G\u001a\u00020\u0016J\u0006\u0010H\u001a\u00020\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010	R\u0011\u0010
                                                   \u001a\u00020\u000b¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0011"\u0004\b\u0012\u0010\u0013R=\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0019\u0010\u001a"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u000fX\u0082D¢\u0006\u0002
                                                   \u0000R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b#\u0010$*\u0004\b!\u0010"R\u001b\u0010%\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0019\u0010\u0002\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020-¢\u0006\b
                                                   \u0000\u001a\u0004\b.\u0010/R!\u00100\u001a\b\u0012\u0004\u0012\u00020 0\u001f8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b2\u0010$*\u0004\b1\u0010"R\u0015\u00103\u001a\u000604R\u00020\u0000¢\u0006\b
                                                   \u0000\u001a\u0004\b5\u00106¨\u0006M""" }, d2 = { "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;", "Lgg/essential/elementa/components/UIContainer;", "screenshot", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/screenshot/image/PixelBufferTexture;", "(Lgg/essential/elementa/state/State;)V", "background", "Lgg/essential/elementa/components/UIBlock;", "getBackground", "()Lgg/essential/elementa/components/UIBlock;", "cropSettings", "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;", "getCropSettings", "()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;", "mouseButton", "", "getMouseButton", "()I", "setMouseButton", "(I)V", "onDraw", "Lkotlin/Function4;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnDraw", "()Lkotlin/jvm/functions/Function4;", "setOnDraw", "(Lkotlin/jvm/functions/Function4;)V", "padding", "redoEnabled", "Lgg/essential/elementa/state/BasicState;", "", "getRedoEnabled$delegate", "(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)Ljava/lang/Object;", "getRedoEnabled", "()Lgg/essential/elementa/state/BasicState;", "retainedImage", "getRetainedImage", "()Lgg/essential/elementa/components/UIContainer;", "retainedImage$delegate", "Lkotlin/properties/ReadWriteProperty;", "getScreenshot", "()Lgg/essential/elementa/state/State;", "screenshotDisplay", "Lgg/essential/elementa/UIComponent;", "getScreenshotDisplay", "()Lgg/essential/elementa/UIComponent;", "undoEnabled", "getUndoEnabled$delegate", "getUndoEnabled", "vectorEditingOverlay", "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;", "getVectorEditingOverlay", "()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;", "exportImage", "Ljava/util/concurrent/CompletableFuture;", "Ljava/io/File;", "source", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "screenshotManager", "Lgg/essential/network/connectionmanager/media/ScreenshotManager;", "screenshotBrowser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "temp", "favorite", "viewAfter", "getHasChanges", "getRelativeMousePosition", "Lkotlin/Pair;", "mouseX", "mouseY", "reset", "Crop", "CropAlignment", "ImageCropItem", "VectorEditingOverlay", "essential" })
public final class ScreenshotCanvas extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final State<PixelBufferTexture> screenshot;
    @NotNull
    private Function4<? super UIContainer, ? super Float, ? super Float, ? super Integer, Unit> onDraw;
    private int mouseButton;
    @NotNull
    private final UIComponent screenshotDisplay;
    @NotNull
    private final Crop cropSettings;
    @NotNull
    private final ReadWriteProperty retainedImage$delegate;
    @NotNull
    private final VectorEditingOverlay vectorEditingOverlay;
    
    public ScreenshotCanvas(@NotNull final State<PixelBufferTexture> screenshot) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "screenshot"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* screenshot */
        //    12: putfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.screenshot:Lgg/essential/elementa/state/State;
        //    15: aload_0         /* this */
        //    16: getstatic       gg/essential/gui/screenshot/editor/ScreenshotCanvas$onDraw$1.INSTANCE:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$onDraw$1;
        //    19: checkcast       Lkotlin/jvm/functions/Function4;
        //    22: putfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.onDraw:Lkotlin/jvm/functions/Function4;
        //    25: aload_0         /* this */
        //    26: iconst_m1      
        //    27: putfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.mouseButton:I
        //    30: aload_0         /* this */
        //    31: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$screenshotDisplay$1;
        //    34: dup            
        //    35: aload_0         /* this */
        //    36: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$screenshotDisplay$1.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
        //    39: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$screenshotDisplay$2;
        //    42: dup            
        //    43: aload_0         /* this */
        //    44: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$screenshotDisplay$2.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
        //    47: checkcast       Lkotlin/jvm/functions/Function2;
        //    50: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$screenshotDisplay$1.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //    53: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$screenshotDisplay$3;
        //    56: dup            
        //    57: aload_0         /* this */
        //    58: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$screenshotDisplay$3.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
        //    61: checkcast       Lkotlin/jvm/functions/Function1;
        //    64: invokevirtual   gg/essential/elementa/UIComponent.onMouseRelease:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //    67: astore_2        /* $this$constrain$iv */
        //    68: aload_2         /* $this$constrain$iv */
        //    69: astore_3       
        //    70: aload_3        
        //    71: astore          $this$constrain_u24lambda_u2d0$iv
        //    73: aload           $this$constrain_u24lambda_u2d0$iv
        //    75: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    78: astore          6
        //    80: astore          7
        //    82: aload           $this$screenshotDisplay_u24lambda_u2d0
        //    84: bipush          100
        //    86: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    89: checkcast       Ljava/lang/Number;
        //    92: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    95: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    98: iconst_4       
        //    99: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   102: checkcast       Ljava/lang/Number;
        //   105: iconst_0       
        //   106: iconst_0       
        //   107: iconst_3       
        //   108: aconst_null    
        //   109: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   112: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   115: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   118: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   121: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   124: aload           $this$screenshotDisplay_u24lambda_u2d0
        //   126: bipush          100
        //   128: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   131: checkcast       Ljava/lang/Number;
        //   134: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   137: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   140: iconst_4       
        //   141: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   144: checkcast       Ljava/lang/Number;
        //   147: iconst_0       
        //   148: iconst_0       
        //   149: iconst_3       
        //   150: aconst_null    
        //   151: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   154: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   157: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   160: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   163: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   166: aload           $this$screenshotDisplay_u24lambda_u2d0
        //   168: iconst_2       
        //   169: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   172: checkcast       Ljava/lang/Number;
        //   175: iconst_0       
        //   176: iconst_0       
        //   177: iconst_3       
        //   178: aconst_null    
        //   179: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   182: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   185: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   188: aload           $this$screenshotDisplay_u24lambda_u2d0
        //   190: iconst_2       
        //   191: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   194: checkcast       Ljava/lang/Number;
        //   197: iconst_0       
        //   198: iconst_0       
        //   199: iconst_3       
        //   200: aconst_null    
        //   201: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   204: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   207: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   210: aload           7
        //   212: aload_3        
        //   213: aload_0         /* this */
        //   214: checkcast       Lgg/essential/elementa/UIComponent;
        //   217: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   220: putfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.screenshotDisplay:Lgg/essential/elementa/UIComponent;
        //   223: new             Lgg/essential/elementa/components/UIBlock;
        //   226: dup            
        //   227: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   230: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getModalBackground:()Ljava/awt/Color;
        //   233: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   236: checkcast       Lgg/essential/elementa/UIComponent;
        //   239: astore_2        /* $this$constrain$iv */
        //   240: aload_2         /* $this$constrain$iv */
        //   241: astore_3       
        //   242: aload_3        
        //   243: astore          $this$constrain_u24lambda_u2d0$iv
        //   245: aload           $this$constrain_u24lambda_u2d0$iv
        //   247: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   250: astore          $this$background_u24lambda_u2d1
        //   252: aload           $this$background_u24lambda_u2d1
        //   254: bipush          100
        //   256: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   259: checkcast       Ljava/lang/Number;
        //   262: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   265: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   268: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   271: aload           $this$background_u24lambda_u2d1
        //   273: bipush          100
        //   275: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   278: checkcast       Ljava/lang/Number;
        //   281: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   284: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   287: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   290: aload_3        
        //   291: aload_0         /* this */
        //   292: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.screenshotDisplay:Lgg/essential/elementa/UIComponent;
        //   295: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   298: pop            
        //   299: aload_0         /* this */
        //   300: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;
        //   303: dup            
        //   304: iconst_0       
        //   305: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop.<init>:(B)V
        //   308: putfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.cropSettings:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;
        //   311: aload_0         /* this */
        //   312: new             Lgg/essential/elementa/components/UIContainer;
        //   315: dup            
        //   316: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   319: checkcast       Lgg/essential/elementa/UIComponent;
        //   322: astore_2        /* $this$constrain$iv */
        //   323: aload_2         /* $this$constrain$iv */
        //   324: astore_3       
        //   325: aload_3        
        //   326: astore          $this$constrain_u24lambda_u2d0$iv
        //   328: aload           $this$constrain_u24lambda_u2d0$iv
        //   330: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   333: astore          6
        //   335: astore          7
        //   337: aload           $this$retainedImage_delegate_u24lambda_u2d2
        //   339: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //   342: dup            
        //   343: fconst_1       
        //   344: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //   347: aload_0         /* this */
        //   348: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.cropSettings:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;
        //   351: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop.getLeft:()Lgg/essential/elementa/state/State;
        //   354: invokevirtual   gg/essential/elementa/constraints/RelativeConstraint.bindValue:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   357: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   360: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   363: aload           $this$retainedImage_delegate_u24lambda_u2d2
        //   365: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //   368: dup            
        //   369: fconst_1       
        //   370: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //   373: aload_0         /* this */
        //   374: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.cropSettings:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;
        //   377: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop.getTop:()Lgg/essential/elementa/state/State;
        //   380: invokevirtual   gg/essential/elementa/constraints/RelativeConstraint.bindValue:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   383: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   386: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   389: aload           $this$retainedImage_delegate_u24lambda_u2d2
        //   391: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //   394: dup            
        //   395: fconst_1       
        //   396: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //   399: aload_0         /* this */
        //   400: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.cropSettings:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;
        //   403: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop.getRight:()Lgg/essential/elementa/state/State;
        //   406: aload_0         /* this */
        //   407: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.cropSettings:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;
        //   410: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop.getLeft:()Lgg/essential/elementa/state/State;
        //   413: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   416: getstatic       gg/essential/gui/screenshot/editor/ScreenshotCanvas$retainedImage$2$1.INSTANCE:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$retainedImage$2$1;
        //   419: checkcast       Lkotlin/jvm/functions/Function1;
        //   422: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   425: checkcast       Lgg/essential/elementa/state/State;
        //   428: invokevirtual   gg/essential/elementa/constraints/RelativeConstraint.bindValue:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   431: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   434: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   437: aload           $this$retainedImage_delegate_u24lambda_u2d2
        //   439: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //   442: dup            
        //   443: fconst_1       
        //   444: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //   447: aload_0         /* this */
        //   448: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.cropSettings:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;
        //   451: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop.getBottom:()Lgg/essential/elementa/state/State;
        //   454: aload_0         /* this */
        //   455: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.cropSettings:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;
        //   458: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop.getTop:()Lgg/essential/elementa/state/State;
        //   461: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   464: getstatic       gg/essential/gui/screenshot/editor/ScreenshotCanvas$retainedImage$2$2.INSTANCE:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$retainedImage$2$2;
        //   467: checkcast       Lkotlin/jvm/functions/Function1;
        //   470: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   473: checkcast       Lgg/essential/elementa/state/State;
        //   476: invokevirtual   gg/essential/elementa/constraints/RelativeConstraint.bindValue:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   479: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   482: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   485: aload           7
        //   487: aload_3        
        //   488: aload_0         /* this */
        //   489: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.screenshotDisplay:Lgg/essential/elementa/UIComponent;
        //   492: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   495: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   498: dup            
        //   499: aconst_null    
        //   500: iconst_0       
        //   501: iconst_3       
        //   502: aconst_null    
        //   503: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   506: checkcast       Lgg/essential/elementa/effects/Effect;
        //   509: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   512: aload_0         /* this */
        //   513: getstatic       gg/essential/gui/screenshot/editor/ScreenshotCanvas.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   516: iconst_0       
        //   517: aaload         
        //   518: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   521: putfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.retainedImage$delegate:Lkotlin/properties/ReadWriteProperty;
        //   524: aload_0         /* this */
        //   525: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
        //   528: dup            
        //   529: aload_0         /* this */
        //   530: aload_0         /* this */
        //   531: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.screenshot:Lgg/essential/elementa/state/State;
        //   534: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/elementa/state/State;)V
        //   537: checkcast       Lgg/essential/elementa/UIComponent;
        //   540: astore_2        /* $this$constrain$iv */
        //   541: aload_2         /* $this$constrain$iv */
        //   542: astore_3       
        //   543: aload_3        
        //   544: astore          $this$constrain_u24lambda_u2d0$iv
        //   546: aload           $this$constrain_u24lambda_u2d0$iv
        //   548: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   551: astore          6
        //   553: astore          7
        //   555: aload           $this$vectorEditingOverlay_u24lambda_u2d3
        //   557: iconst_0       
        //   558: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   561: checkcast       Ljava/lang/Number;
        //   564: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   567: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   570: aload_0         /* this */
        //   571: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.screenshotDisplay:Lgg/essential/elementa/UIComponent;
        //   574: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   577: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   580: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   583: aload           $this$vectorEditingOverlay_u24lambda_u2d3
        //   585: iconst_0       
        //   586: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   589: checkcast       Ljava/lang/Number;
        //   592: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   595: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   598: aload_0         /* this */
        //   599: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.screenshotDisplay:Lgg/essential/elementa/UIComponent;
        //   602: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   605: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   608: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   611: aload           $this$vectorEditingOverlay_u24lambda_u2d3
        //   613: bipush          100
        //   615: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   618: checkcast       Ljava/lang/Number;
        //   621: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   624: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   627: aload_0         /* this */
        //   628: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.screenshotDisplay:Lgg/essential/elementa/UIComponent;
        //   631: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   634: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   637: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   640: aload           $this$vectorEditingOverlay_u24lambda_u2d3
        //   642: bipush          100
        //   644: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   647: checkcast       Ljava/lang/Number;
        //   650: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   653: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   656: aload_0         /* this */
        //   657: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.screenshotDisplay:Lgg/essential/elementa/UIComponent;
        //   660: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   663: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   666: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   669: aload           7
        //   671: aload_3        
        //   672: aload_0         /* this */
        //   673: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas.getRetainedImage:()Lgg/essential/elementa/components/UIContainer;
        //   676: checkcast       Lgg/essential/elementa/UIComponent;
        //   679: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   682: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
        //   685: putfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas.vectorEditingOverlay:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
        //   688: invokestatic    gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.values:()[Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
        //   691: astore_2        /* $this$forEach$iv */
        //   692: iconst_0       
        //   693: istore_3       
        //   694: aload_2         /* $this$forEach$iv */
        //   695: arraylength    
        //   696: istore          4
        //   698: iload_3        
        //   699: iload           4
        //   701: if_icmpge       740
        //   704: aload_2         /* $this$forEach$iv */
        //   705: iload_3        
        //   706: aaload         
        //   707: astore          element$iv
        //   709: aload           element$iv
        //   711: astore          alignment
        //   713: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;
        //   716: dup            
        //   717: aload_0         /* this */
        //   718: aload           alignment
        //   720: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;)V
        //   723: checkcast       Lgg/essential/elementa/UIComponent;
        //   726: aload_0         /* this */
        //   727: checkcast       Lgg/essential/elementa/UIComponent;
        //   730: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   733: pop            
        //   734: iinc            3, 1
        //   737: goto            698
        //   740: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Lgg/essential/gui/screenshot/image/PixelBufferTexture;>;)V
        //    MethodParameters:
        //  Name        Flags  
        //  ----------  -----
        //  screenshot  
        //    StackMapTable: 00 02 FF 02 BA 00 05 07 00 02 00 07 01 46 01 01 00 00 FF 00 29 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Function4<UIContainer, Float, Float, Integer, Unit> getOnDraw() {
        return (Function4<UIContainer, Float, Float, Integer, Unit>)this.onDraw;
    }
    
    public final void setOnDraw(@NotNull final Function4<? super UIContainer, ? super Float, ? super Float, ? super Integer, Unit> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.onDraw = <set-?>;
    }
    
    public final int getMouseButton() {
        return this.mouseButton;
    }
    
    public final void setMouseButton(final int <set-?>) {
        this.mouseButton = <set-?>;
    }
    
    @NotNull
    public final UIComponent getScreenshotDisplay() {
        return this.screenshotDisplay;
    }
    
    @NotNull
    public final Crop getCropSettings() {
        return this.cropSettings;
    }
    
    @NotNull
    public final UIContainer getRetainedImage() {
        return (UIContainer)this.retainedImage$delegate.getValue((Object)this, (KProperty)ScreenshotCanvas.$$delegatedProperties[0]);
    }
    
    @NotNull
    public final VectorEditingOverlay getVectorEditingOverlay() {
        return this.vectorEditingOverlay;
    }
    
    @NotNull
    public final BasicState<Boolean> getUndoEnabled() {
        return this.vectorEditingOverlay.getUndoEnabled();
    }
    
    @NotNull
    public final BasicState<Boolean> getRedoEnabled() {
        return this.vectorEditingOverlay.getRedoEnabled();
    }
    
    @NotNull
    public final State<Boolean> getHasChanges() {
        return this.getUndoEnabled();
    }
    
    @NotNull
    public final CompletableFuture<File> exportImage$26ba5704(@NotNull final ScreenshotProperties source, @NotNull final ScreenshotManager screenshotManager, @NotNull final ScreenshotBrowser screenshotBrowser, final boolean temp, final boolean viewAfter) {
        Intrinsics.checkNotNullParameter((Object)source, "source");
        Intrinsics.checkNotNullParameter((Object)screenshotManager, "screenshotManager");
        Intrinsics.checkNotNullParameter((Object)screenshotBrowser, "screenshotBrowser");
        final Crop cropSettings = this.cropSettings.clone();
        final CompletableFuture completableFuture = new CompletableFuture();
        final BufferedImage screenshot = ImageIO.read(source.getPath().toFile());
        final int fullWidth = screenshot.getWidth();
        final int fullHeight = screenshot.getHeight();
        final int drawableWidth = (int)this.screenshotDisplay.getWidth() * (int)UResolution.getScaleFactor();
        final FloatBuffer buffer = BufferUtils.createFloatBuffer(fullWidth * fullHeight * 4);
        final ScreenshotCanvas$exportImage$veoCopy.ScreenshotCanvas$exportImage$veoCopy$1 veoCopy = new ScreenshotCanvas$exportImage$veoCopy.ScreenshotCanvas$exportImage$veoCopy$1(this, buffer, this.vectorEditingOverlay);
        veoCopy.setScale(fullWidth / (float)drawableWidth);
        final ScreenshotCanvas$exportImage$veoCopy.ScreenshotCanvas$exportImage$veoCopy$1 screenshotCanvas$exportImage$veoCopy$1 = veoCopy;
        final UMatrixStack uMatrixStack = new UMatrixStack();
        final double n = 0.0;
        final double n2 = 0.0;
        final double n3 = fullWidth / UResolution.getScaleFactor();
        final double n4 = fullHeight / UResolution.getScaleFactor();
        final Color white = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
        screenshotCanvas$exportImage$veoCopy$1.drawImage(uMatrixStack, n, n2, n3, n4, white);
        veoCopy.delete();
        Multithreading.runAsync(ScreenshotCanvas::exportImage$lambda-6);
        return completableFuture;
    }
    
    public static /* synthetic */ CompletableFuture exportImage$default$361f293f$27c9ee5d(final ScreenshotCanvas screenshotCanvas, final ScreenshotProperties source, final ScreenshotManager screenshotManager, final ScreenshotBrowser screenshotBrowser, final boolean temp, final boolean viewAfter) {
        return screenshotCanvas.exportImage$26ba5704(source, screenshotManager, screenshotBrowser, temp, viewAfter);
    }
    
    @NotNull
    public final Pair<Float, Float> getRelativeMousePosition(final float mouseX, final float mouseY) {
        final float width = this.screenshotDisplay.getWidth();
        final float height = this.screenshotDisplay.getHeight();
        return (Pair<Float, Float>)TuplesKt.to((Object)RangesKt.coerceIn((Comparable)(mouseX / width), RangesKt.rangeTo(0.0f, 1.0f)), (Object)RangesKt.coerceIn((Comparable)(mouseY / height), RangesKt.rangeTo(0.0f, 1.0f)));
    }
    
    public final void reset() {
        this.cropSettings.reset();
        this.vectorEditingOverlay.reset();
    }
    
    private static final void exportImage$lambda-6(final FloatBuffer $buffer, final int $fullWidth, final int $fullHeight, final BufferedImage $screenshot, final Crop $cropSettings, final boolean $temp, final CompletableFuture $completableFuture, final ScreenshotManager $screenshotManager, final ScreenshotProperties $source, final ScreenshotBrowser $screenshotBrowser, final boolean $favorite, final boolean $viewAfter) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: ldc_w           "$cropSettings"
        //     5: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     8: aload           $completableFuture
        //    10: ldc_w           "$completableFuture"
        //    13: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: aload           $screenshotManager
        //    18: ldc_w           "$screenshotManager"
        //    21: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    24: aload           $source
        //    26: ldc_w           "$source"
        //    29: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    32: aload           $screenshotBrowser
        //    34: ldc_w           "$screenshotBrowser"
        //    37: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    40: aload_0         /* $buffer */
        //    41: invokevirtual   java/nio/FloatBuffer.rewind:()Ljava/nio/FloatBuffer;
        //    44: pop            
        //    45: iconst_0       
        //    46: aload_0         /* $buffer */
        //    47: invokevirtual   java/nio/FloatBuffer.limit:()I
        //    50: invokestatic    kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
        //    53: checkcast       Ljava/lang/Iterable;
        //    56: astore          $this$map$iv
        //    58: aload           $this$map$iv
        //    60: astore          15
        //    62: new             Ljava/util/ArrayList;
        //    65: dup            
        //    66: aload           $this$map$iv
        //    68: bipush          10
        //    70: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    73: invokespecial   java/util/ArrayList.<init>:(I)V
        //    76: checkcast       Ljava/util/Collection;
        //    79: astore          destination$iv$iv
        //    81: aload           $this$mapTo$iv$iv
        //    83: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    88: astore          18
        //    90: aload           18
        //    92: invokeinterface java/util/Iterator.hasNext:()Z
        //    97: ifeq            140
        //   100: aload           18
        //   102: checkcast       Lkotlin/collections/IntIterator;
        //   105: invokevirtual   kotlin/collections/IntIterator.nextInt:()I
        //   108: istore          item$iv$iv
        //   110: aload           destination$iv$iv
        //   112: astore          20
        //   114: aload_0         /* $buffer */
        //   115: iload           item$iv$iv
        //   117: invokevirtual   java/nio/FloatBuffer.get:(I)F
        //   120: ldc_w           255.0
        //   123: fmul           
        //   124: f2i            
        //   125: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   128: aload           20
        //   130: swap           
        //   131: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   136: pop            
        //   137: goto            90
        //   140: aload           destination$iv$iv
        //   142: checkcast       Ljava/util/List;
        //   145: checkcast       Ljava/lang/Iterable;
        //   148: iload_1         /* $fullWidth */
        //   149: iconst_4       
        //   150: imul           
        //   151: getstatic       gg/essential/gui/screenshot/editor/ScreenshotCanvas$exportImage$1$imgData$2.INSTANCE:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$exportImage$1$imgData$2;
        //   154: checkcast       Lkotlin/jvm/functions/Function1;
        //   157: invokestatic    kotlin/collections/CollectionsKt.chunked:(Ljava/lang/Iterable;ILkotlin/jvm/functions/Function1;)Ljava/util/List;
        //   160: checkcast       Ljava/lang/Iterable;
        //   163: invokestatic    kotlin/collections/CollectionsKt.reversed:(Ljava/lang/Iterable;)Ljava/util/List;
        //   166: checkcast       Ljava/lang/Iterable;
        //   169: invokestatic    kotlin/collections/CollectionsKt.flatten:(Ljava/lang/Iterable;)Ljava/util/List;
        //   172: checkcast       Ljava/util/Collection;
        //   175: invokestatic    kotlin/collections/CollectionsKt.toIntArray:(Ljava/util/Collection;)[I
        //   178: astore          imgData
        //   180: new             Ljava/awt/image/BufferedImage;
        //   183: dup            
        //   184: iload_1         /* $fullWidth */
        //   185: iload_2         /* $fullHeight */
        //   186: iconst_2       
        //   187: invokespecial   java/awt/image/BufferedImage.<init>:(III)V
        //   190: astore          image
        //   192: aload           image
        //   194: iconst_0       
        //   195: iconst_0       
        //   196: iload_1         /* $fullWidth */
        //   197: iload_2         /* $fullHeight */
        //   198: aload           imgData
        //   200: iconst_0       
        //   201: iload_1         /* $fullWidth */
        //   202: invokevirtual   java/awt/image/BufferedImage.setRGB:(IIII[III)V
        //   205: aload_3         /* $screenshot */
        //   206: invokevirtual   java/awt/image/BufferedImage.getGraphics:()Ljava/awt/Graphics;
        //   209: aload           image
        //   211: checkcast       Ljava/awt/Image;
        //   214: iconst_0       
        //   215: iconst_0       
        //   216: aconst_null    
        //   217: invokevirtual   java/awt/Graphics.drawImage:(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
        //   220: pop            
        //   221: iload_1         /* $fullWidth */
        //   222: i2f            
        //   223: aload           $cropSettings
        //   225: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop.getLeft:()Lgg/essential/elementa/state/State;
        //   228: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   231: checkcast       Ljava/lang/Number;
        //   234: invokevirtual   java/lang/Number.floatValue:()F
        //   237: fmul           
        //   238: f2i            
        //   239: istore          left
        //   241: iload_1         /* $fullWidth */
        //   242: i2f            
        //   243: aload           $cropSettings
        //   245: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop.getRight:()Lgg/essential/elementa/state/State;
        //   248: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   251: checkcast       Ljava/lang/Number;
        //   254: invokevirtual   java/lang/Number.floatValue:()F
        //   257: fmul           
        //   258: f2i            
        //   259: istore          right
        //   261: iload_2         /* $fullHeight */
        //   262: i2f            
        //   263: aload           $cropSettings
        //   265: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop.getTop:()Lgg/essential/elementa/state/State;
        //   268: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   271: checkcast       Ljava/lang/Number;
        //   274: invokevirtual   java/lang/Number.floatValue:()F
        //   277: fmul           
        //   278: f2i            
        //   279: istore          top
        //   281: iload_2         /* $fullHeight */
        //   282: i2f            
        //   283: aload           $cropSettings
        //   285: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop.getBottom:()Lgg/essential/elementa/state/State;
        //   288: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   291: checkcast       Ljava/lang/Number;
        //   294: invokevirtual   java/lang/Number.floatValue:()F
        //   297: fmul           
        //   298: f2i            
        //   299: istore          bottom
        //   301: aload_3         /* $screenshot */
        //   302: iload           left
        //   304: iload           top
        //   306: iload           right
        //   308: iload           left
        //   310: isub           
        //   311: iload           bottom
        //   313: iload           top
        //   315: isub           
        //   316: invokevirtual   java/awt/image/BufferedImage.getSubimage:(IIII)Ljava/awt/image/BufferedImage;
        //   319: astore          croppedImage
        //   321: iload           $temp
        //   323: ifeq            359
        //   326: ldc             "screenshot"
        //   328: aconst_null    
        //   329: invokestatic    java/io/File.createTempFile:(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //   332: astore          tempFile
        //   334: aload           croppedImage
        //   336: checkcast       Ljava/awt/image/RenderedImage;
        //   339: ldc_w           "png"
        //   342: aload           tempFile
        //   344: invokestatic    javax/imageio/ImageIO.write:(Ljava/awt/image/RenderedImage;Ljava/lang/String;Ljava/io/File;)Z
        //   347: pop            
        //   348: aload           $completableFuture
        //   350: aload           tempFile
        //   352: invokevirtual   java/util/concurrent/CompletableFuture.complete:(Ljava/lang/Object;)Z
        //   355: pop            
        //   356: goto            380
        //   359: aload           $completableFuture
        //   361: aload           $screenshotManager
        //   363: aload           $source
        //   365: aload           croppedImage
        //   367: aload           $screenshotBrowser
        //   369: iload           $favorite
        //   371: iload           $viewAfter
        //   373: invokevirtual   gg/essential/network/connectionmanager/media/ScreenshotManager.handleScreenshotEdited:(Lgg/essential/gui/screenshot/components/ScreenshotProperties;Ljava/awt/image/BufferedImage;Lgg/essential/gui/screenshot/components/ScreenshotBrowser;ZZ)Ljava/io/File;
        //   376: invokevirtual   java/util/concurrent/CompletableFuture.complete:(Ljava/lang/Object;)Z
        //   379: pop            
        //   380: return         
        //    MethodParameters:
        //  Name                Flags  
        //  ------------------  -----
        //  $buffer             
        //  $fullWidth          
        //  $fullHeight         
        //  $screenshot         
        //  $cropSettings       
        //  $temp               
        //  $completableFuture  
        //  $screenshotManager  
        //  $source             
        //  $screenshotBrowser  
        //  $favorite           
        //  $viewAfter          
        //    StackMapTable: 00 04 FF 00 5A 00 13 07 02 11 01 01 07 01 89 07 00 67 01 07 01 74 07 02 30 07 01 77 07 02 32 01 01 00 00 00 00 07 02 2A 00 07 02 34 00 00 FF 00 31 00 11 00 01 01 07 01 89 07 00 67 01 07 01 74 07 02 30 07 01 77 07 02 32 01 01 00 00 00 00 07 02 2A 00 00 FF 00 DA 00 13 00 00 00 00 00 00 07 01 74 07 02 30 07 01 77 07 02 32 01 01 00 00 00 00 00 00 07 01 89 00 00 FF 00 14 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final /* synthetic */ int access$getPadding$p$2da702bc() {
        return 2;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotCanvas.class, "retainedImage", "getRetainedImage()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000d
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0003
                                                       \u0002\u0010\u0007
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0010\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003\b\u0096\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012
                                                       \u0010\u0002\u001a\u00060\u0000R\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u000e\u0010\u0005\u001a
                                                       \u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\u0010\bJ\u0012\u0010 \u001a\u00060\u0000R\u00020\u00032\u0006\u0010!\u001a\u00020\u000bJ
                                                       \u0010"\u001a\u00060\u0000R\u00020\u0003J \u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0014J(\u0010)\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0014J\u0006\u0010,\u001a\u00020$J
                                                       \u0010-\u001a\u00060\u0000R\u00020\u0003R\u0014\u0010	\u001a\b\u0012\u0004\u0012\u00020\u000b0
                                                       X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0
                                                       X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u0019\u0010\u0005\u001a
                                                       \u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\b
                                                       \u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\u0016\u0010\u0017"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b
                                                       \u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u001e\u001a
                                                       \u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001fX\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006.""" }, d2 = { "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;", "Lgg/essential/gui/common/UINanoVG;", "veo", "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;", "(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;)V", "image", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/screenshot/image/PixelBufferTexture;", "(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/elementa/state/State;)V", "future", "Ljava/util/Stack;", "Lgg/essential/gui/screenshot/editor/change/Change;", "history", "getImage", "()Lgg/essential/elementa/state/State;", "redoEnabled", "Lgg/essential/elementa/state/BasicState;", "", "getRedoEnabled", "()Lgg/essential/elementa/state/BasicState;", "scale", "", "getScale", "()F", "setScale", "(F)V", "screenshotImage", "Lgg/essential/gui/screenshot/image/ScreenshotImage;", "undoEnabled", "getUndoEnabled", "weakImage", "Lgg/essential/gui/common/WeakState;", "pushChange", "change", "redo", "render", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "width", "height", "renderVG", "vg", "Lgg/essential/util/lwjgl3/api/nanovg/NanoVG;", "reset", "undo", "essential" })
    public class VectorEditingOverlay extends UINanoVG
    {
        @NotNull
        private final State<PixelBufferTexture> image;
        @NotNull
        private final Stack<Change> history;
        @NotNull
        private final Stack<Change> future;
        @NotNull
        private final ScreenshotImage screenshotImage;
        private float scale;
        @NotNull
        private final BasicState<Boolean> undoEnabled;
        @NotNull
        private final BasicState<Boolean> redoEnabled;
        @NotNull
        private final WeakState<PixelBufferTexture> weakImage;
        final /* synthetic */ ScreenshotCanvas this$0;
        
        public VectorEditingOverlay(@NotNull final ScreenshotCanvas this$0, final State<PixelBufferTexture> image) {
            Intrinsics.checkNotNullParameter((Object)image, "image");
            this.this$0 = this$0;
            super();
            this.image = image;
            this.history = new Stack<Change>();
            this.future = new Stack<Change>();
            this.screenshotImage = new ScreenshotImage(this.image);
            this.scale = 1.0f;
            this.undoEnabled = new BasicState<Boolean>(false);
            this.redoEnabled = new BasicState<Boolean>(false);
            (this.weakImage = StateExtensionsKt.weak(this.image)).onSetValue((kotlin.jvm.functions.Function1<? super Object, Unit>)new Function1<PixelBufferTexture, Unit>() {
                final /* synthetic */ VectorEditingOverlay this$0;
                
                ScreenshotCanvas$VectorEditingOverlay$2() {
                    this.this$0 = $receiver;
                    super(1);
                }
                
                public final void invoke$29222cb6() {
                    this.this$0.markDirty();
                }
                
                public /* bridge */ Object invoke(final Object p1) {
                    this.invoke$29222cb6();
                    return Unit.INSTANCE;
                }
            });
        }
        
        public final void setScale(final float <set-?>) {
            this.scale = <set-?>;
        }
        
        @NotNull
        public final BasicState<Boolean> getUndoEnabled() {
            return this.undoEnabled;
        }
        
        @NotNull
        public final BasicState<Boolean> getRedoEnabled() {
            return this.redoEnabled;
        }
        
        public final void reset() {
            this.undoEnabled.set(false);
            this.redoEnabled.set(false);
            this.history.clear();
            this.future.clear();
            this.markDirty();
        }
        
        public VectorEditingOverlay(@NotNull final ScreenshotCanvas this$0, final VectorEditingOverlay veo) {
            Intrinsics.checkNotNullParameter((Object)veo, "veo");
            this(this$0, veo.image);
            this.history.addAll((Collection<?>)veo.history);
            this.future.addAll((Collection<?>)veo.future);
            this.undoEnabled.set(veo.undoEnabled.get());
            this.redoEnabled.set(veo.redoEnabled.get());
        }
        
        @Override
        protected void render(@NotNull final UMatrixStack matrixStack, final float width, final float height) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            final ScreenshotImage screenshotImage = this.screenshotImage;
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            screenshotImage.renderImage(matrixStack, white, width, height);
            super.render(matrixStack, width, height);
        }
        
        @Override
        protected void renderVG(@NotNull final UMatrixStack matrixStack, @NotNull final NanoVG vg, final float width, final float height) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "matrixStack"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_2         /* vg */
            //     7: ldc             "vg"
            //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //    12: aload_0         /* this */
            //    13: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.history:Ljava/util/Stack;
            //    16: checkcast       Ljava/lang/Iterable;
            //    19: astore          $this$filterIsInstance$iv
            //    21: aload           $this$filterIsInstance$iv
            //    23: astore          6
            //    25: new             Ljava/util/ArrayList;
            //    28: dup            
            //    29: invokespecial   java/util/ArrayList.<init>:()V
            //    32: checkcast       Ljava/util/Collection;
            //    35: astore          destination$iv$iv
            //    37: aload           $this$filterIsInstanceTo$iv$iv
            //    39: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
            //    44: astore          9
            //    46: aload           9
            //    48: invokeinterface java/util/Iterator.hasNext:()Z
            //    53: ifeq            86
            //    56: aload           9
            //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //    63: astore          element$iv$iv
            //    65: aload           element$iv$iv
            //    67: instanceof      Lgg/essential/gui/screenshot/editor/change/VectorStroke;
            //    70: ifeq            46
            //    73: aload           destination$iv$iv
            //    75: aload           element$iv$iv
            //    77: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
            //    82: pop            
            //    83: goto            46
            //    86: aload           destination$iv$iv
            //    88: checkcast       Ljava/util/List;
            //    91: checkcast       Ljava/lang/Iterable;
            //    94: astore          $this$forEach$iv
            //    96: aload           $this$forEach$iv
            //    98: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
            //   103: astore          6
            //   105: aload           6
            //   107: invokeinterface java/util/Iterator.hasNext:()Z
            //   112: ifeq            147
            //   115: aload           6
            //   117: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //   122: astore          element$iv
            //   124: aload           element$iv
            //   126: checkcast       Lgg/essential/gui/screenshot/editor/change/VectorStroke;
            //   129: astore          vs
            //   131: aload           vs
            //   133: aload_2         /* vg */
            //   134: fload_3         /* width */
            //   135: fload           height
            //   137: aload_0         /* this */
            //   138: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.scale:F
            //   141: invokevirtual   gg/essential/gui/screenshot/editor/change/VectorStroke.render:(Lgg/essential/util/lwjgl3/api/nanovg/NanoVG;FFF)V
            //   144: goto            105
            //   147: return         
            //    MethodParameters:
            //  Name         Flags  
            //  -----------  -----
            //  matrixStack  
            //  vg           
            //  width        
            //  height       
            //    StackMapTable: 00 04 FF 00 2E 00 0A 07 00 02 00 07 00 C3 02 02 00 00 07 00 9C 00 07 00 C5 00 00 F9 00 27 FF 00 12 00 07 07 00 02 00 07 00 C3 02 02 00 07 00 C5 00 00 FF 00 29 00 00 00 00
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @NotNull
        public final VectorEditingOverlay pushChange(@NotNull final Change change) {
            Intrinsics.checkNotNullParameter((Object)change, "change");
            final VectorEditingOverlay $this$pushChange_u24lambda_u2d1 = this;
            $this$pushChange_u24lambda_u2d1.future.clear();
            $this$pushChange_u24lambda_u2d1.history.push(change);
            $this$pushChange_u24lambda_u2d1.markDirty();
            $this$pushChange_u24lambda_u2d1.undoEnabled.set(true);
            $this$pushChange_u24lambda_u2d1.redoEnabled.set(false);
            return this;
        }
        
        @NotNull
        public final VectorEditingOverlay undo() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: astore_1       
            //     2: aload_0         /* this */
            //     3: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
            //     6: astore_2       
            //     7: aload_1        
            //     8: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
            //    11: astore_3       
            //    12: aload_3        
            //    13: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.history:Ljava/util/Stack;
            //    16: invokevirtual   java/util/Stack.empty:()Z
            //    19: ifne            96
            //    22: aload_3        
            //    23: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.redoEnabled:Lgg/essential/elementa/state/BasicState;
            //    26: iconst_1       
            //    27: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //    30: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
            //    33: aload_3        
            //    34: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.future:Ljava/util/Stack;
            //    37: aload_3        
            //    38: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.history:Ljava/util/Stack;
            //    41: invokevirtual   java/util/Stack.pop:()Ljava/lang/Object;
            //    44: astore          4
            //    46: aload           4
            //    48: checkcast       Lgg/essential/gui/screenshot/editor/change/Change;
            //    51: astore          5
            //    53: astore          6
            //    55: aload           it
            //    57: aload_2        
            //    58: invokeinterface gg/essential/gui/screenshot/editor/change/Change.undo:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
            //    63: aload           6
            //    65: aload           4
            //    67: invokevirtual   java/util/Stack.push:(Ljava/lang/Object;)Ljava/lang/Object;
            //    70: pop            
            //    71: aload_3        
            //    72: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.undoEnabled:Lgg/essential/elementa/state/BasicState;
            //    75: aload_3        
            //    76: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.history:Ljava/util/Stack;
            //    79: invokevirtual   java/util/Stack.isEmpty:()Z
            //    82: ifne            89
            //    85: iconst_1       
            //    86: goto            90
            //    89: iconst_0       
            //    90: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //    93: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
            //    96: aload_1        
            //    97: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
            //   100: areturn        
            //    StackMapTable: 00 03 FF 00 59 00 02 00 07 00 02 00 01 07 00 6B FF 00 00 00 02 00 07 00 02 00 02 07 00 6B 01 05
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @NotNull
        public final VectorEditingOverlay redo() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: astore_1       
            //     2: aload_0         /* this */
            //     3: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
            //     6: astore_2       
            //     7: aload_1        
            //     8: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
            //    11: astore_3       
            //    12: aload_3        
            //    13: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.future:Ljava/util/Stack;
            //    16: invokevirtual   java/util/Stack.empty:()Z
            //    19: ifne            96
            //    22: aload_3        
            //    23: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.history:Ljava/util/Stack;
            //    26: aload_3        
            //    27: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.future:Ljava/util/Stack;
            //    30: invokevirtual   java/util/Stack.pop:()Ljava/lang/Object;
            //    33: astore          4
            //    35: aload           4
            //    37: checkcast       Lgg/essential/gui/screenshot/editor/change/Change;
            //    40: astore          5
            //    42: astore          6
            //    44: aload           it
            //    46: aload_2        
            //    47: invokeinterface gg/essential/gui/screenshot/editor/change/Change.redo:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
            //    52: aload           6
            //    54: aload           4
            //    56: invokevirtual   java/util/Stack.push:(Ljava/lang/Object;)Ljava/lang/Object;
            //    59: pop            
            //    60: aload_3        
            //    61: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.undoEnabled:Lgg/essential/elementa/state/BasicState;
            //    64: iconst_1       
            //    65: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //    68: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
            //    71: aload_3        
            //    72: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.redoEnabled:Lgg/essential/elementa/state/BasicState;
            //    75: aload_3        
            //    76: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.future:Ljava/util/Stack;
            //    79: invokevirtual   java/util/Stack.isEmpty:()Z
            //    82: ifne            89
            //    85: iconst_1       
            //    86: goto            90
            //    89: iconst_0       
            //    90: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //    93: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
            //    96: aload_1        
            //    97: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
            //   100: areturn        
            //    StackMapTable: 00 03 FF 00 59 00 02 00 07 00 02 00 01 07 00 6B FF 00 00 00 02 00 07 00 02 00 02 07 00 6B 01 05
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000"
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0005
                                                       \u0002\u0010\u0007
                                                       \u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b	\u0010
                                                       "\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\u000f\u0010\u0010"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\u0014\u0010\u0010"\u0004\b\u0015\u0010\u0012¨\u0006\u0016""" }, d2 = { "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;", "Lgg/essential/elementa/components/UIContainer;", "alignment", "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;", "(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;)V", "getAlignment", "()Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;", "dragging", "", "getDragging", "()Z", "setDragging", "(Z)V", "xDragOffset", "", "getXDragOffset", "()F", "setXDragOffset", "(F)V", "yDragOffset", "getYDragOffset", "setYDragOffset", "essential" })
    public final class ImageCropItem extends UIContainer
    {
        @NotNull
        private final CropAlignment alignment;
        private boolean dragging;
        private float xDragOffset;
        private float yDragOffset;
        final /* synthetic */ ScreenshotCanvas this$0;
        
        public ImageCropItem(@NotNull final ScreenshotCanvas this$0, final CropAlignment alignment) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "alignment"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_0         /* this */
            //     7: aload_1         /* this$0 */
            //     8: putfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
            //    11: aload_0         /* this */
            //    12: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
            //    15: aload_0         /* this */
            //    16: aload_2         /* alignment */
            //    17: putfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //    20: aload_0         /* this */
            //    21: checkcast       Lgg/essential/elementa/UIComponent;
            //    24: astore_3       
            //    25: aload_0         /* this */
            //    26: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
            //    29: astore          4
            //    31: aload_3         /* $this$constrain$iv */
            //    32: astore          6
            //    34: aload           6
            //    36: astore          $this$constrain_u24lambda_u2d0$iv
            //    38: aload           $this$constrain_u24lambda_u2d0$iv
            //    40: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //    43: astore          $this$_init__u24lambda_u2d0
            //    45: aload           $this$_init__u24lambda_u2d0
            //    47: bipush          15
            //    49: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    52: checkcast       Ljava/lang/Number;
            //    55: iconst_0       
            //    56: iconst_0       
            //    57: iconst_3       
            //    58: aconst_null    
            //    59: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //    62: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //    65: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //    68: aload           $this$_init__u24lambda_u2d0
            //    70: bipush          15
            //    72: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    75: checkcast       Ljava/lang/Number;
            //    78: iconst_0       
            //    79: iconst_0       
            //    80: iconst_3       
            //    81: aconst_null    
            //    82: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //    85: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //    88: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //    91: aload           $this$_init__u24lambda_u2d0
            //    93: aload_0         /* this */
            //    94: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //    97: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getCenterX:()Z
            //   100: ifeq            116
            //   103: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //   106: dup            
            //   107: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //   110: checkcast       Lgg/essential/elementa/constraints/PositionConstraint;
            //   113: goto            144
            //   116: invokestatic    gg/essential/gui/screenshot/editor/ScreenshotCanvas.access$getPadding$p$2da702bc:()I
            //   119: pop            
            //   120: bipush          -2
            //   122: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   125: checkcast       Ljava/lang/Number;
            //   128: aload_0         /* this */
            //   129: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   132: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpX:()Z
            //   135: iconst_0       
            //   136: iconst_2       
            //   137: aconst_null    
            //   138: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   141: checkcast       Lgg/essential/elementa/constraints/PositionConstraint;
            //   144: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   147: aload           4
            //   149: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas.getRetainedImage:()Lgg/essential/elementa/components/UIContainer;
            //   152: checkcast       Lgg/essential/elementa/UIComponent;
            //   155: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
            //   158: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   161: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   164: aload           $this$_init__u24lambda_u2d0
            //   166: aload_0         /* this */
            //   167: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   170: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getCenterY:()Z
            //   173: ifeq            189
            //   176: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //   179: dup            
            //   180: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //   183: checkcast       Lgg/essential/elementa/constraints/PositionConstraint;
            //   186: goto            217
            //   189: invokestatic    gg/essential/gui/screenshot/editor/ScreenshotCanvas.access$getPadding$p$2da702bc:()I
            //   192: pop            
            //   193: bipush          -2
            //   195: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   198: checkcast       Ljava/lang/Number;
            //   201: aload_0         /* this */
            //   202: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   205: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpY:()Z
            //   208: iconst_0       
            //   209: iconst_2       
            //   210: aconst_null    
            //   211: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   214: checkcast       Lgg/essential/elementa/constraints/PositionConstraint;
            //   217: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   220: aload           4
            //   222: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas.getRetainedImage:()Lgg/essential/elementa/components/UIContainer;
            //   225: checkcast       Lgg/essential/elementa/UIComponent;
            //   228: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
            //   231: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   234: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   237: aload_0         /* this */
            //   238: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   241: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getCorner:()Z
            //   244: ifeq            588
            //   247: aload_0         /* this */
            //   248: checkcast       Lgg/essential/elementa/UIComponent;
            //   251: astore_3        /* $this$addChild$iv */
            //   252: aload_3         /* $this$addChild$iv */
            //   253: astore          5
            //   255: aload           5
            //   257: astore          $this$addChild_u24lambda_u2d1$iv
            //   259: aload           $this$addChild_u24lambda_u2d1$iv
            //   261: aload           $this$addChild_u24lambda_u2d1$iv
            //   263: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;
            //   266: astore          8
            //   268: astore          14
            //   270: new             Lgg/essential/elementa/components/UIBlock;
            //   273: dup            
            //   274: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
            //   277: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
            //   280: checkcast       Lgg/essential/elementa/UIComponent;
            //   283: astore          $this$constrain$iv
            //   285: aload           $this$constrain$iv
            //   287: astore          11
            //   289: aload           11
            //   291: astore          $this$constrain_u24lambda_u2d0$iv
            //   293: aload           $this$constrain_u24lambda_u2d0$iv
            //   295: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   298: astore          $this$lambda_u2d2_u24lambda_u2d1
            //   300: aload           $this$lambda_u2d2_u24lambda_u2d1
            //   302: aload           $this$_init__u24lambda_u2d2
            //   304: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   307: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpX:()Z
            //   310: ifeq            317
            //   313: iconst_0       
            //   314: goto            318
            //   317: iconst_0       
            //   318: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   321: checkcast       Ljava/lang/Number;
            //   324: iconst_0       
            //   325: iconst_0       
            //   326: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
            //   329: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   332: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   335: aload           $this$lambda_u2d2_u24lambda_u2d1
            //   337: iconst_0       
            //   338: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   341: checkcast       Ljava/lang/Number;
            //   344: aload           $this$_init__u24lambda_u2d2
            //   346: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   349: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpY:()Z
            //   352: iconst_0       
            //   353: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
            //   356: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   359: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   362: aload           $this$lambda_u2d2_u24lambda_u2d1
            //   364: bipush          15
            //   366: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   369: checkcast       Ljava/lang/Number;
            //   372: iconst_0       
            //   373: iconst_0       
            //   374: iconst_3       
            //   375: aconst_null    
            //   376: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   379: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   382: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   385: aload           $this$lambda_u2d2_u24lambda_u2d1
            //   387: iconst_2       
            //   388: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   391: checkcast       Ljava/lang/Number;
            //   394: iconst_0       
            //   395: iconst_0       
            //   396: iconst_3       
            //   397: aconst_null    
            //   398: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   401: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   404: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   407: aload           11
            //   409: aload           14
            //   411: swap           
            //   412: invokevirtual   gg/essential/elementa/UIComponent.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   415: pop            
            //   416: aload_0         /* this */
            //   417: checkcast       Lgg/essential/elementa/UIComponent;
            //   420: astore_3        /* $this$addChild$iv */
            //   421: aload_3         /* $this$addChild$iv */
            //   422: astore          5
            //   424: aload           5
            //   426: astore          $this$addChild_u24lambda_u2d1$iv
            //   428: aload           $this$addChild_u24lambda_u2d1$iv
            //   430: aload           $this$addChild_u24lambda_u2d1$iv
            //   432: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;
            //   435: astore          8
            //   437: astore          14
            //   439: new             Lgg/essential/elementa/components/UIBlock;
            //   442: dup            
            //   443: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
            //   446: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
            //   449: checkcast       Lgg/essential/elementa/UIComponent;
            //   452: astore          $this$constrain$iv
            //   454: aload           $this$constrain$iv
            //   456: astore          11
            //   458: aload           11
            //   460: astore          $this$constrain_u24lambda_u2d0$iv
            //   462: aload           $this$constrain_u24lambda_u2d0$iv
            //   464: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   467: astore          $this$lambda_u2d4_u24lambda_u2d3
            //   469: aload           $this$lambda_u2d4_u24lambda_u2d3
            //   471: iconst_0       
            //   472: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   475: checkcast       Ljava/lang/Number;
            //   478: aload           $this$_init__u24lambda_u2d4
            //   480: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   483: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpX:()Z
            //   486: iconst_0       
            //   487: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
            //   490: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   493: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   496: aload           $this$lambda_u2d4_u24lambda_u2d3
            //   498: aload           $this$_init__u24lambda_u2d4
            //   500: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   503: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpY:()Z
            //   506: ifeq            513
            //   509: iconst_0       
            //   510: goto            514
            //   513: iconst_0       
            //   514: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   517: checkcast       Ljava/lang/Number;
            //   520: iconst_0       
            //   521: iconst_0       
            //   522: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
            //   525: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   528: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   531: aload           $this$lambda_u2d4_u24lambda_u2d3
            //   533: iconst_2       
            //   534: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   537: checkcast       Ljava/lang/Number;
            //   540: iconst_0       
            //   541: iconst_0       
            //   542: iconst_3       
            //   543: aconst_null    
            //   544: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   547: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   550: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   553: aload           $this$lambda_u2d4_u24lambda_u2d3
            //   555: bipush          15
            //   557: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   560: checkcast       Ljava/lang/Number;
            //   563: iconst_0       
            //   564: iconst_0       
            //   565: iconst_3       
            //   566: aconst_null    
            //   567: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   570: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   573: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   576: aload           11
            //   578: aload           14
            //   580: swap           
            //   581: invokevirtual   gg/essential/elementa/UIComponent.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   584: pop            
            //   585: goto            780
            //   588: aload_0         /* this */
            //   589: checkcast       Lgg/essential/elementa/UIComponent;
            //   592: astore_3        /* $this$addChild$iv */
            //   593: aload_3         /* $this$addChild$iv */
            //   594: astore          5
            //   596: aload           5
            //   598: astore          $this$addChild_u24lambda_u2d1$iv
            //   600: aload           $this$addChild_u24lambda_u2d1$iv
            //   602: aload           $this$addChild_u24lambda_u2d1$iv
            //   604: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;
            //   607: astore          8
            //   609: astore          14
            //   611: new             Lgg/essential/elementa/components/UIBlock;
            //   614: dup            
            //   615: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
            //   618: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
            //   621: checkcast       Lgg/essential/elementa/UIComponent;
            //   624: astore          $this$constrain$iv
            //   626: aload           $this$constrain$iv
            //   628: astore          11
            //   630: aload           11
            //   632: astore          $this$constrain_u24lambda_u2d0$iv
            //   634: aload           $this$constrain_u24lambda_u2d0$iv
            //   636: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   639: astore          $this$lambda_u2d6_u24lambda_u2d5
            //   641: aload           $this$lambda_u2d6_u24lambda_u2d5
            //   643: iconst_0       
            //   644: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   647: checkcast       Ljava/lang/Number;
            //   650: aload           $this$_init__u24lambda_u2d6
            //   652: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   655: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpX:()Z
            //   658: iconst_0       
            //   659: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
            //   662: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   665: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   668: aload           $this$lambda_u2d6_u24lambda_u2d5
            //   670: iconst_0       
            //   671: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   674: checkcast       Ljava/lang/Number;
            //   677: aload           $this$_init__u24lambda_u2d6
            //   679: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   682: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getAlignOpY:()Z
            //   685: iconst_0       
            //   686: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
            //   689: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   692: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   695: aload           $this$lambda_u2d6_u24lambda_u2d5
            //   697: aload           $this$_init__u24lambda_u2d6
            //   699: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   702: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getCenterY:()Z
            //   705: ifeq            713
            //   708: bipush          15
            //   710: goto            714
            //   713: iconst_2       
            //   714: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   717: checkcast       Ljava/lang/Number;
            //   720: iconst_0       
            //   721: iconst_0       
            //   722: iconst_3       
            //   723: aconst_null    
            //   724: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   727: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   730: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   733: aload           $this$lambda_u2d6_u24lambda_u2d5
            //   735: aload           $this$_init__u24lambda_u2d6
            //   737: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.alignment:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;
            //   740: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment.getCenterX:()Z
            //   743: ifeq            751
            //   746: bipush          15
            //   748: goto            752
            //   751: iconst_2       
            //   752: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   755: checkcast       Ljava/lang/Number;
            //   758: iconst_0       
            //   759: iconst_0       
            //   760: iconst_3       
            //   761: aconst_null    
            //   762: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   765: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   768: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   771: aload           11
            //   773: aload           14
            //   775: swap           
            //   776: invokevirtual   gg/essential/elementa/UIComponent.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   779: pop            
            //   780: aload_0         /* this */
            //   781: getstatic       gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$5.INSTANCE:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$5;
            //   784: checkcast       Lkotlin/jvm/functions/Function1;
            //   787: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.onMouseEnter:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
            //   790: pop            
            //   791: aload_0         /* this */
            //   792: getstatic       gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$6.INSTANCE:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$6;
            //   795: checkcast       Lkotlin/jvm/functions/Function1;
            //   798: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.onMouseLeave:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
            //   801: pop            
            //   802: new             Lkotlin/jvm/internal/Ref$ObjectRef;
            //   805: dup            
            //   806: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
            //   809: astore_3        /* oldCrop */
            //   810: aload_0         /* this */
            //   811: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$7;
            //   814: dup            
            //   815: aload_0         /* this */
            //   816: aload_0         /* this */
            //   817: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
            //   820: aload_3         /* oldCrop */
            //   821: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$7.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lkotlin/jvm/internal/Ref$ObjectRef;)V
            //   824: checkcast       Lkotlin/jvm/functions/Function2;
            //   827: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
            //   830: pop            
            //   831: aload_0         /* this */
            //   832: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$8;
            //   835: dup            
            //   836: aload_0         /* this */
            //   837: aload_3         /* oldCrop */
            //   838: aload_0         /* this */
            //   839: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
            //   842: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$8.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;Lkotlin/jvm/internal/Ref$ObjectRef;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
            //   845: checkcast       Lkotlin/jvm/functions/Function1;
            //   848: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.onMouseRelease:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
            //   851: pop            
            //   852: aload_0         /* this */
            //   853: new             Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$9;
            //   856: dup            
            //   857: aload_0         /* this */
            //   858: aload_0         /* this */
            //   859: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
            //   862: invokespecial   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem$9.<init>:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
            //   865: checkcast       Lkotlin/jvm/functions/Function4;
            //   868: invokevirtual   gg/essential/gui/screenshot/editor/ScreenshotCanvas$ImageCropItem.onMouseDrag:(Lkotlin/jvm/functions/Function4;)Lgg/essential/elementa/UIComponent;
            //   871: pop            
            //   872: return         
            //    Signature:
            //  (Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;)V [from metadata: (Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;)V]
            //  
            //    MethodParameters:
            //  Name       Flags  
            //  ---------  -----
            //  this$0     
            //  alignment  
            //    StackMapTable: 00 0E FF 00 74 00 0A 07 00 02 00 00 00 07 00 32 00 00 00 00 07 00 60 00 01 07 00 60 FF 00 1B 00 0A 07 00 02 00 00 00 07 00 32 00 00 00 00 07 00 60 00 02 07 00 60 07 00 74 FF 00 2C 00 05 07 00 02 00 00 00 07 00 32 00 01 07 00 60 FF 00 1B 00 05 07 00 02 00 00 00 07 00 32 00 02 07 00 60 07 00 74 FF 00 63 00 0F 07 00 02 00 00 00 00 00 00 00 07 00 02 00 00 07 00 4A 00 07 00 60 07 00 4A 00 01 07 00 60 FF 00 00 00 0F 07 00 02 00 00 00 00 00 00 00 07 00 02 00 00 07 00 4A 00 07 00 60 07 00 4A 00 02 07 00 60 01 FF 00 C2 00 0F 07 00 02 00 00 00 00 00 00 00 00 00 00 07 00 4A 00 07 00 60 07 00 4A 00 01 07 00 60 FF 00 00 00 0F 07 00 02 00 00 00 00 00 00 00 00 00 00 07 00 4A 00 07 00 60 07 00 4A 00 02 07 00 60 01 FF 00 49 00 01 07 00 02 00 00 FF 00 7C 00 0F 07 00 02 00 00 00 00 00 00 00 07 00 02 00 00 07 00 4A 00 07 00 60 07 00 4A 00 01 07 00 60 FF 00 00 00 0F 07 00 02 00 00 00 00 00 00 00 07 00 02 00 00 07 00 4A 00 07 00 60 07 00 4A 00 02 07 00 60 01 FF 00 24 00 0F 07 00 02 00 00 00 00 00 00 00 00 00 00 07 00 4A 00 00 07 00 4A 00 01 07 00 60 FF 00 00 00 0F 07 00 02 00 00 00 00 00 00 00 00 00 00 07 00 4A 00 00 07 00 4A 00 02 07 00 60 01 FF 00 1B 00 01 07 00 02 00 00
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @NotNull
        public final CropAlignment getAlignment() {
            return this.alignment;
        }
        
        public final boolean getDragging() {
            return this.dragging;
        }
        
        public final void setDragging(final boolean <set-?>) {
            this.dragging = <set-?>;
        }
        
        public final float getXDragOffset() {
            return this.xDragOffset;
        }
        
        public final void setXDragOffset(final float <set-?>) {
            this.xDragOffset = <set-?>;
        }
        
        public final float getYDragOffset() {
            return this.yDragOffset;
        }
        
        public final void setYDragOffset(final float <set-?>) {
            this.yDragOffset = <set-?>;
        }
        
        public static final /* synthetic */ Pair access$getMousePosition(final ImageCropItem $this) {
            return $this.getMousePosition();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0000
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B3\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010
                                                       R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u000b\u0010
                                                       R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\f\u0010
                                                       R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\r\u0010
                                                       R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u000e\u0010
                                                       j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017""" }, d2 = { "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$CropAlignment;", "", "alignOpX", "", "alignOpY", "centerX", "centerY", "corner", "(Ljava/lang/String;IZZZZZ)V", "getAlignOpX", "()Z", "getAlignOpY", "getCenterX", "getCenterY", "getCorner", "TOP_LEFT", "TOP_CENTER", "TOP_RIGHT", "RIGHT_CENTER", "BOTTOM_RIGHT", "BOTTOM_CENTER", "BOTTOM_LEFT", "LEFT_CENTER", "essential" })
    public enum CropAlignment
    {
        private final boolean alignOpX;
        private final boolean alignOpY;
        private final boolean centerX;
        private final boolean centerY;
        private final boolean corner;
        
        TOP_LEFT(false, false, false, false, true, 12), 
        TOP_CENTER(false, false, true, false, false, 8), 
        TOP_RIGHT(true, false, false, false, true, 12), 
        RIGHT_CENTER(true, false, false, true, false, 4), 
        BOTTOM_RIGHT(true, true, false, false, true, 12), 
        BOTTOM_CENTER(false, true, true, false, false, 8), 
        BOTTOM_LEFT(false, true, false, false, true, 12), 
        LEFT_CENTER(false, false, false, true, false, 4);
        
        private static final /* synthetic */ CropAlignment[] $VALUES;
        
        private CropAlignment(final String $enum$name, final int $enum$ordinal, final boolean alignOpX, final boolean alignOpY, final boolean centerX, final boolean centerY, final boolean corner) {
            this.alignOpX = alignOpX;
            this.alignOpY = alignOpY;
            this.centerX = centerX;
            this.centerY = centerY;
            this.corner = corner;
        }
        
        CropAlignment(final String $enum$name, final int $enum$ordinal, final boolean alignOpX, final boolean alignOpY, boolean centerX, boolean centerY, final boolean corner, final int n) {
            if ((n & 0x4) != 0x0) {
                centerX = false;
            }
            if ((n & 0x8) != 0x0) {
                centerY = false;
            }
            this($enum$name, $enum$ordinal, alignOpX, alignOpY, centerX, centerY, corner);
        }
        
        public final boolean getAlignOpX() {
            return this.alignOpX;
        }
        
        public final boolean getAlignOpY() {
            return this.alignOpY;
        }
        
        public final boolean getCenterX() {
            return this.centerX;
        }
        
        public final boolean getCenterY() {
            return this.centerY;
        }
        
        public final boolean getCorner() {
            return this.corner;
        }
        
        public static CropAlignment[] values() {
            return CropAlignment.$VALUES.clone();
        }
        
        public static CropAlignment valueOf(final String value) {
            return Enum.valueOf(CropAlignment.class, value);
        }
        
        private static final /* synthetic */ CropAlignment[] $values() {
            return new CropAlignment[] { CropAlignment.TOP_LEFT, CropAlignment.TOP_CENTER, CropAlignment.TOP_RIGHT, CropAlignment.RIGHT_CENTER, CropAlignment.BOTTOM_RIGHT, CropAlignment.BOTTOM_CENTER, CropAlignment.BOTTOM_LEFT, CropAlignment.LEFT_CENTER };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0007
                                                       \u0002\b\u0015
                                                       \u0002\u0010\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0000J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003JI\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J	\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\u0006\u0010 \u001a\u00020\u001aJ\b\u0010!\u001a\u00020"H\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b	\u0010
                                                       "\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\r\u0010
                                                       "\u0004\b\u000e\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\u000f\u0010
                                                       "\u0004\b\u0010\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\u0011\u0010
                                                       "\u0004\b\u0012\u0010\f¨\u0006#""" }, d2 = { "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;", "", "left", "Lgg/essential/elementa/state/State;", "", "right", "top", "bottom", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "getBottom", "()Lgg/essential/elementa/state/State;", "setBottom", "(Lgg/essential/elementa/state/State;)V", "getLeft", "setLeft", "getRight", "setRight", "getTop", "setTop", "clone", "component1", "component2", "component3", "component4", "copy", "copyFrom", "", "other", "equals", "", "hashCode", "", "reset", "toString", "", "essential" })
    public static final class Crop
    {
        @NotNull
        private State<Float> left;
        @NotNull
        private State<Float> right;
        @NotNull
        private State<Float> top;
        @NotNull
        private State<Float> bottom;
        
        public Crop(@NotNull final State<Float> left, @NotNull final State<Float> right, @NotNull final State<Float> top, @NotNull final State<Float> bottom) {
            Intrinsics.checkNotNullParameter((Object)left, "left");
            Intrinsics.checkNotNullParameter((Object)right, "right");
            Intrinsics.checkNotNullParameter((Object)top, "top");
            Intrinsics.checkNotNullParameter((Object)bottom, "bottom");
            super();
            this.left = left;
            this.right = right;
            this.top = top;
            this.bottom = bottom;
        }
        
        public Crop(final byte b) {
            this(new BasicState<Float>(0.0f), new BasicState<Float>(1.0f), new BasicState<Float>(0.0f), new BasicState<Float>(1.0f));
        }
        
        @NotNull
        public final State<Float> getLeft() {
            return this.left;
        }
        
        @NotNull
        public final State<Float> getRight() {
            return this.right;
        }
        
        @NotNull
        public final State<Float> getTop() {
            return this.top;
        }
        
        @NotNull
        public final State<Float> getBottom() {
            return this.bottom;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Crop[left=" + this.left.get() + ",right=" + this.right.get() + ",top=" + this.top.get() + ",bottom=" + this.bottom.get();
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            return other instanceof Crop && ((Crop)other).left.get().floatValue() == this.left.get().floatValue() && ((Crop)other).right.get().floatValue() == this.right.get().floatValue() && ((Crop)other).top.get().floatValue() == this.top.get().floatValue() && ((Crop)other).bottom.get().floatValue() == this.bottom.get().floatValue();
        }
        
        public final void reset() {
            this.left.set(0.0f);
            this.right.set(1.0f);
            this.top.set(0.0f);
            this.bottom.set(1.0f);
        }
        
        @NotNull
        public final Crop clone() {
            return new Crop(new BasicState<Float>(this.left.get()), new BasicState<Float>(this.right.get()), new BasicState<Float>(this.top.get()), new BasicState<Float>(this.bottom.get()));
        }
        
        public final void copyFrom(@NotNull final Crop other) {
            Intrinsics.checkNotNullParameter((Object)other, "other");
            this.left.set(other.left.get());
            this.right.set(other.right.get());
            this.top.set(other.top.get());
            this.bottom.set(other.bottom.get());
        }
        
        @Override
        public int hashCode() {
            int result = this.left.hashCode();
            result = result * 31 + this.right.hashCode();
            result = result * 31 + this.top.hashCode();
            result = result * 31 + this.bottom.hashCode();
            return result;
        }
        
        public Crop() {
            this((byte)0);
        }
    }
}
