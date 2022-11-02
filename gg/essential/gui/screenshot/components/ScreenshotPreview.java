package gg.essential.gui.screenshot.components;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import kotlin.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.screenshot.image.*;
import net.minecraft.client.*;
import net.minecraft.client.texture.*;
import gg.essential.universal.*;
import kotlin.ranges.*;
import gg.essential.gui.screenshot.providers.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000n
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070	¢\u0006\u0002\u0010
                                                   J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u000104R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0017\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0018\u0010\u0013R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u001c\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001d\u0010\u000eR&\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160!\u0012\u0004\u0012\u00020\u00160 X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010"\u001a\b\u0012\u0004\u0012\u00020#0	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b(\u0010\u0010\u001a\u0004\b&\u0010'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u00065""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotPreview;", "Lgg/essential/elementa/components/UIContainer;", "properties", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "viewComponent", "Lgg/essential/gui/screenshot/components/ListViewComponent;", "index", "", "numberOfItemsPerRow", "Lgg/essential/elementa/state/State;", "(Lgg/essential/gui/screenshot/components/ScreenshotProperties;Lgg/essential/gui/screenshot/components/ListViewComponent;ILgg/essential/elementa/state/State;)V", "dots", "Lgg/essential/gui/common/shadow/ShadowIcon;", "getDots", "()Lgg/essential/gui/common/shadow/ShadowIcon;", "dots$delegate", "Lkotlin/properties/ReadWriteProperty;", "dotsContainer", "getDotsContainer", "()Lgg/essential/elementa/components/UIContainer;", "dotsContainer$delegate", "favorite", "", "favoriteContainer", "getFavoriteContainer", "favoriteContainer$delegate", "favoriteTextState", "", "hollowHeart", "getHollowHeart", "hollowHeart$delegate", "hovered", "Lgg/essential/elementa/state/MappedState;", "Lkotlin/Pair;", "imageAspectState", "", "img", "Lgg/essential/gui/screenshot/image/ScreenshotImage;", "getImg", "()Lgg/essential/gui/screenshot/image/ScreenshotImage;", "img$delegate", "getProperties", "()Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "solidHeart", "stateManager", "Lgg/essential/gui/screenshot/components/ScreenshotStateManager;", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "updateTexture", "resourceLocation", "Lnet/minecraft/util/Identifier;", "essential" })
public final class ScreenshotPreview extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ScreenshotProperties properties;
    @NotNull
    private final ListViewComponent viewComponent;
    private final int index;
    @NotNull
    private final State<Integer> numberOfItemsPerRow;
    @NotNull
    private final ScreenshotStateManager stateManager;
    @NotNull
    private final State<Boolean> favorite;
    @NotNull
    private final State<String> favoriteTextState;
    @NotNull
    private final State<Float> imageAspectState;
    @NotNull
    private final ReadWriteProperty img$delegate;
    @NotNull
    private final MappedState<Pair<Boolean, Boolean>, Boolean> hovered;
    @NotNull
    private final ReadWriteProperty favoriteContainer$delegate;
    @NotNull
    private final ReadWriteProperty dotsContainer$delegate;
    
    public ScreenshotPreview(@NotNull final ScreenshotProperties properties, @NotNull final ListViewComponent viewComponent, final int index, @NotNull final State<Integer> numberOfItemsPerRow) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "properties"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* viewComponent */
        //     7: ldc             "viewComponent"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload           numberOfItemsPerRow
        //    14: ldc             "numberOfItemsPerRow"
        //    16: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    19: aload_0         /* this */
        //    20: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    23: aload_0         /* this */
        //    24: aload_1         /* properties */
        //    25: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.properties:Lgg/essential/gui/screenshot/components/ScreenshotProperties;
        //    28: aload_0         /* this */
        //    29: aload_2         /* viewComponent */
        //    30: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.viewComponent:Lgg/essential/gui/screenshot/components/ListViewComponent;
        //    33: aload_0         /* this */
        //    34: iload_3         /* index */
        //    35: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.index:I
        //    38: aload_0         /* this */
        //    39: aload           numberOfItemsPerRow
        //    41: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.numberOfItemsPerRow:Lgg/essential/elementa/state/State;
        //    44: aload_0         /* this */
        //    45: aload_0         /* this */
        //    46: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.viewComponent:Lgg/essential/gui/screenshot/components/ListViewComponent;
        //    49: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotBrowser:()Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //    52: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getStateManager:()Lgg/essential/gui/screenshot/components/ScreenshotStateManager;
        //    55: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.stateManager:Lgg/essential/gui/screenshot/components/ScreenshotStateManager;
        //    58: aload_0         /* this */
        //    59: aload_0         /* this */
        //    60: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.stateManager:Lgg/essential/gui/screenshot/components/ScreenshotStateManager;
        //    63: aload_0         /* this */
        //    64: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.properties:Lgg/essential/gui/screenshot/components/ScreenshotProperties;
        //    67: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotStateManager.getFavoriteState:(Lgg/essential/gui/screenshot/components/ScreenshotProperties;)Lgg/essential/elementa/state/State;
        //    70: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.favorite:Lgg/essential/elementa/state/State;
        //    73: aload_0         /* this */
        //    74: aload_0         /* this */
        //    75: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.stateManager:Lgg/essential/gui/screenshot/components/ScreenshotStateManager;
        //    78: aload_0         /* this */
        //    79: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.properties:Lgg/essential/gui/screenshot/components/ScreenshotProperties;
        //    82: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotStateManager.getFavoriteTextState:(Lgg/essential/gui/screenshot/components/ScreenshotProperties;)Lgg/essential/elementa/state/State;
        //    85: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.favoriteTextState:Lgg/essential/elementa/state/State;
        //    88: aload_0         /* this */
        //    89: aload_0         /* this */
        //    90: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.stateManager:Lgg/essential/gui/screenshot/components/ScreenshotStateManager;
        //    93: aload_0         /* this */
        //    94: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.properties:Lgg/essential/gui/screenshot/components/ScreenshotProperties;
        //    97: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotStateManager.getAspectRatio:(Lgg/essential/gui/screenshot/components/ScreenshotProperties;)Lgg/essential/elementa/state/State;
        //   100: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.imageAspectState:Lgg/essential/elementa/state/State;
        //   103: aload_0         /* this */
        //   104: new             Lgg/essential/gui/screenshot/image/ScreenshotImage;
        //   107: dup            
        //   108: invokespecial   gg/essential/gui/screenshot/image/ScreenshotImage.<init>:()V
        //   111: checkcast       Lgg/essential/elementa/UIComponent;
        //   114: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   117: astore          $this$constrain$iv
        //   119: aload           $this$constrain$iv
        //   121: astore          6
        //   123: aload           6
        //   125: astore          $this$constrain_u24lambda_u2d0$iv
        //   127: aload           $this$constrain_u24lambda_u2d0$iv
        //   129: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   132: astore          8
        //   134: astore          9
        //   136: aload           $this$img_delegate_u24lambda_u2d0
        //   138: new             Lgg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint;
        //   141: dup            
        //   142: aload_0         /* this */
        //   143: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.imageAspectState:Lgg/essential/elementa/state/State;
        //   146: invokespecial   gg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint.<init>:(Lgg/essential/elementa/state/State;)V
        //   149: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   152: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   155: aload           $this$img_delegate_u24lambda_u2d0
        //   157: new             Lgg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint;
        //   160: dup            
        //   161: aload_0         /* this */
        //   162: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.imageAspectState:Lgg/essential/elementa/state/State;
        //   165: invokespecial   gg/essential/gui/screenshot/constraints/AspectPreservingFillConstraint.<init>:(Lgg/essential/elementa/state/State;)V
        //   168: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   171: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   174: aload           9
        //   176: aload           6
        //   178: aload_0         /* this */
        //   179: checkcast       Lgg/essential/elementa/UIComponent;
        //   182: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   185: aload_0         /* this */
        //   186: getstatic       gg/essential/gui/screenshot/components/ScreenshotPreview.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   189: iconst_0       
        //   190: aaload         
        //   191: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   194: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.img$delegate:Lkotlin/properties/ReadWriteProperty;
        //   197: aload_0         /* this */
        //   198: aload_0         /* this */
        //   199: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getImg:()Lgg/essential/gui/screenshot/image/ScreenshotImage;
        //   202: checkcast       Lgg/essential/elementa/UIComponent;
        //   205: iconst_0       
        //   206: iconst_1       
        //   207: iconst_1       
        //   208: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   211: aload_0         /* this */
        //   212: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.viewComponent:Lgg/essential/gui/screenshot/components/ListViewComponent;
        //   215: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotBrowser:()Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   218: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getMenuDialogOwner:()Lgg/essential/elementa/state/BasicState;
        //   221: new             Lgg/essential/gui/screenshot/components/ScreenshotPreview$hovered$1;
        //   224: dup            
        //   225: aload_0         /* this */
        //   226: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview$hovered$1.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotPreview;)V
        //   229: checkcast       Lkotlin/jvm/functions/Function1;
        //   232: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   235: checkcast       Lgg/essential/elementa/state/State;
        //   238: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   241: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.hovered:Lgg/essential/elementa/state/MappedState;
        //   244: aload_0         /* this */
        //   245: new             Lgg/essential/elementa/components/UIContainer;
        //   248: dup            
        //   249: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   252: checkcast       Lgg/essential/elementa/UIComponent;
        //   255: astore          $this$constrain$iv
        //   257: aload           $this$constrain$iv
        //   259: astore          6
        //   261: aload           6
        //   263: astore          $this$constrain_u24lambda_u2d0$iv
        //   265: aload           $this$constrain_u24lambda_u2d0$iv
        //   267: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   270: astore          8
        //   272: astore          9
        //   274: aload           $this$favoriteContainer_delegate_u24lambda_u2d1
        //   276: iconst_5       
        //   277: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   280: checkcast       Ljava/lang/Number;
        //   283: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   286: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   289: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   292: aload           $this$favoriteContainer_delegate_u24lambda_u2d1
        //   294: iconst_5       
        //   295: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   298: checkcast       Ljava/lang/Number;
        //   301: iconst_1       
        //   302: iconst_0       
        //   303: iconst_2       
        //   304: aconst_null    
        //   305: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   308: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   311: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   314: aload           $this$favoriteContainer_delegate_u24lambda_u2d1
        //   316: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   319: dup            
        //   320: fconst_0       
        //   321: iconst_1       
        //   322: aconst_null    
        //   323: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   326: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   329: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   332: aload           $this$favoriteContainer_delegate_u24lambda_u2d1
        //   334: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   337: dup            
        //   338: fconst_0       
        //   339: iconst_1       
        //   340: aconst_null    
        //   341: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   344: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   347: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   350: aload           9
        //   352: aload           6
        //   354: aload_0         /* this */
        //   355: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.favoriteTextState:Lgg/essential/elementa/state/State;
        //   358: aconst_null    
        //   359: fconst_0       
        //   360: aconst_null    
        //   361: aconst_null    
        //   362: bipush          30
        //   364: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //   367: aload_0         /* this */
        //   368: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getImg:()Lgg/essential/gui/screenshot/image/ScreenshotImage;
        //   371: checkcast       Lgg/essential/elementa/UIComponent;
        //   374: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   377: aload_0         /* this */
        //   378: getstatic       gg/essential/gui/screenshot/components/ScreenshotPreview.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   381: iconst_1       
        //   382: aaload         
        //   383: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   386: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.favoriteContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   389: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //   392: dup            
        //   393: getstatic       gg/essential/gui/EssentialPalette.HEART_FILLED_9X:Lgg/essential/gui/image/ImageFactory;
        //   396: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //   399: new             Lgg/essential/elementa/state/BasicState;
        //   402: dup            
        //   403: getstatic       gg/essential/gui/EssentialPalette.TEXT_RED:Ljava/awt/Color;
        //   406: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   409: checkcast       Lgg/essential/elementa/state/State;
        //   412: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //   415: new             Lgg/essential/elementa/state/BasicState;
        //   418: dup            
        //   419: getstatic       gg/essential/gui/EssentialPalette.ICON_SHADOW:Ljava/awt/Color;
        //   422: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   425: checkcast       Lgg/essential/elementa/state/State;
        //   428: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindShadowColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //   431: checkcast       Lgg/essential/elementa/UIComponent;
        //   434: aload_0         /* this */
        //   435: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getFavoriteContainer:()Lgg/essential/elementa/components/UIContainer;
        //   438: checkcast       Lgg/essential/elementa/UIComponent;
        //   441: aload_0         /* this */
        //   442: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.favorite:Lgg/essential/elementa/state/State;
        //   445: iconst_0       
        //   446: aconst_null    
        //   447: bipush          12
        //   449: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   452: pop            
        //   453: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //   456: dup            
        //   457: getstatic       gg/essential/gui/EssentialPalette.HEART_EMPTY_9X:Lgg/essential/gui/image/ImageFactory;
        //   460: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //   463: new             Lgg/essential/elementa/state/BasicState;
        //   466: dup            
        //   467: getstatic       gg/essential/gui/EssentialPalette.ICON_SHADOW:Ljava/awt/Color;
        //   470: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   473: checkcast       Lgg/essential/elementa/state/State;
        //   476: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindShadowColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //   479: checkcast       Lgg/essential/elementa/UIComponent;
        //   482: aload_0         /* this */
        //   483: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getFavoriteContainer:()Lgg/essential/elementa/components/UIContainer;
        //   486: checkcast       Lgg/essential/elementa/UIComponent;
        //   489: aload_0         /* this */
        //   490: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.favorite:Lgg/essential/elementa/state/State;
        //   493: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   496: checkcast       Lgg/essential/elementa/state/State;
        //   499: aload_0         /* this */
        //   500: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.hovered:Lgg/essential/elementa/state/MappedState;
        //   503: checkcast       Lgg/essential/elementa/state/State;
        //   506: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   509: checkcast       Lgg/essential/elementa/state/State;
        //   512: iconst_0       
        //   513: aconst_null    
        //   514: bipush          12
        //   516: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   519: checkcast       Lgg/essential/gui/common/shadow/ShadowIcon;
        //   522: aload_0         /* this */
        //   523: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getFavoriteContainer:()Lgg/essential/elementa/components/UIContainer;
        //   526: checkcast       Lgg/essential/elementa/UIComponent;
        //   529: iconst_0       
        //   530: iconst_0       
        //   531: iconst_3       
        //   532: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   535: getstatic       gg/essential/gui/screenshot/components/ScreenshotPreview$hollowHeart$2.INSTANCE:Lgg/essential/gui/screenshot/components/ScreenshotPreview$hollowHeart$2;
        //   538: checkcast       Lkotlin/jvm/functions/Function1;
        //   541: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   544: checkcast       Lgg/essential/elementa/state/State;
        //   547: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //   550: checkcast       Lgg/essential/elementa/UIComponent;
        //   553: aload_0         /* this */
        //   554: getstatic       gg/essential/gui/screenshot/components/ScreenshotPreview.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   557: iconst_2       
        //   558: aaload         
        //   559: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   562: pop            
        //   563: aload_0         /* this */
        //   564: new             Lgg/essential/elementa/components/UIContainer;
        //   567: dup            
        //   568: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   571: checkcast       Lgg/essential/elementa/UIComponent;
        //   574: astore          $this$constrain$iv
        //   576: aload           $this$constrain$iv
        //   578: astore          6
        //   580: aload           6
        //   582: astore          $this$constrain_u24lambda_u2d0$iv
        //   584: aload           $this$constrain_u24lambda_u2d0$iv
        //   586: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   589: astore          8
        //   591: astore          9
        //   593: aload           $this$dotsContainer_delegate_u24lambda_u2d2
        //   595: iconst_0       
        //   596: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   599: checkcast       Ljava/lang/Number;
        //   602: iconst_1       
        //   603: iconst_0       
        //   604: iconst_2       
        //   605: aconst_null    
        //   606: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   609: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   612: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   615: aload           $this$dotsContainer_delegate_u24lambda_u2d2
        //   617: iconst_0       
        //   618: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   621: checkcast       Ljava/lang/Number;
        //   624: iconst_1       
        //   625: iconst_0       
        //   626: iconst_2       
        //   627: aconst_null    
        //   628: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   631: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   634: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   637: aload           $this$dotsContainer_delegate_u24lambda_u2d2
        //   639: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   642: dup            
        //   643: fconst_0       
        //   644: iconst_1       
        //   645: aconst_null    
        //   646: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   649: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   652: bipush          10
        //   654: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   657: checkcast       Ljava/lang/Number;
        //   660: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   663: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   666: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   669: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   672: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   675: aload           $this$dotsContainer_delegate_u24lambda_u2d2
        //   677: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   680: dup            
        //   681: fconst_0       
        //   682: iconst_1       
        //   683: aconst_null    
        //   684: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   687: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   690: bipush          10
        //   692: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   695: checkcast       Ljava/lang/Number;
        //   698: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   701: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   704: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   707: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   710: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   713: aload           9
        //   715: aload           6
        //   717: aload_0         /* this */
        //   718: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getImg:()Lgg/essential/gui/screenshot/image/ScreenshotImage;
        //   721: checkcast       Lgg/essential/elementa/UIComponent;
        //   724: aload_0         /* this */
        //   725: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.hovered:Lgg/essential/elementa/state/MappedState;
        //   728: checkcast       Lgg/essential/elementa/state/State;
        //   731: iconst_1       
        //   732: aconst_null    
        //   733: bipush          8
        //   735: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   738: new             Lgg/essential/elementa/state/BasicState;
        //   741: dup            
        //   742: ldc_w           "Options"
        //   745: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   748: checkcast       Lgg/essential/elementa/state/State;
        //   751: getstatic       gg/essential/gui/common/EssentialTooltip$Position.ABOVE:Lgg/essential/gui/common/EssentialTooltip$Position;
        //   754: fconst_2       
        //   755: aconst_null    
        //   756: aconst_null    
        //   757: bipush          24
        //   759: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //   762: aload_0         /* this */
        //   763: getstatic       gg/essential/gui/screenshot/components/ScreenshotPreview.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   766: iconst_3       
        //   767: aaload         
        //   768: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   771: putfield        gg/essential/gui/screenshot/components/ScreenshotPreview.dotsContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   774: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //   777: dup            
        //   778: getstatic       gg/essential/gui/EssentialPalette.OPTIONS_8X2:Lgg/essential/gui/image/ImageFactory;
        //   781: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //   784: checkcast       Lgg/essential/elementa/UIComponent;
        //   787: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   790: checkcast       Lgg/essential/gui/common/shadow/ShadowIcon;
        //   793: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   796: aload_0         /* this */
        //   797: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getDotsContainer:()Lgg/essential/elementa/components/UIContainer;
        //   800: checkcast       Lgg/essential/elementa/UIComponent;
        //   803: iconst_0       
        //   804: iconst_0       
        //   805: iconst_3       
        //   806: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   809: invokevirtual   gg/essential/gui/EssentialPalette.getTextColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   812: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //   815: checkcast       Lgg/essential/elementa/UIComponent;
        //   818: aload_0         /* this */
        //   819: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getDotsContainer:()Lgg/essential/elementa/components/UIContainer;
        //   822: checkcast       Lgg/essential/elementa/UIComponent;
        //   825: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   828: aload_0         /* this */
        //   829: getstatic       gg/essential/gui/screenshot/components/ScreenshotPreview.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   832: iconst_4       
        //   833: aaload         
        //   834: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   837: pop            
        //   838: aload_0         /* this */
        //   839: checkcast       Lgg/essential/elementa/UIComponent;
        //   842: astore          $this$constrain$iv
        //   844: aload           $this$constrain$iv
        //   846: astore          6
        //   848: aload           6
        //   850: astore          $this$constrain_u24lambda_u2d0$iv
        //   852: aload           $this$constrain_u24lambda_u2d0$iv
        //   854: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   857: astore          $this$_init__u24lambda_u2d3
        //   859: aload           $this$_init__u24lambda_u2d3
        //   861: new             Lgg/essential/elementa/constraints/CramSiblingConstraint;
        //   864: dup            
        //   865: ldc_w           10.0
        //   868: invokespecial   gg/essential/elementa/constraints/CramSiblingConstraint.<init>:(F)V
        //   871: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   874: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   877: aload           $this$_init__u24lambda_u2d3
        //   879: new             Lgg/essential/elementa/constraints/CramSiblingConstraint;
        //   882: dup            
        //   883: ldc_w           10.0
        //   886: invokespecial   gg/essential/elementa/constraints/CramSiblingConstraint.<init>:(F)V
        //   889: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   892: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   895: aload           $this$_init__u24lambda_u2d3
        //   897: new             Lgg/essential/gui/screenshot/constraints/TileConstraint;
        //   900: dup            
        //   901: aload_0         /* this */
        //   902: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.numberOfItemsPerRow:Lgg/essential/elementa/state/State;
        //   905: invokespecial   gg/essential/gui/screenshot/constraints/TileConstraint.<init>:(Lgg/essential/elementa/state/State;)V
        //   908: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   911: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   914: aload           $this$_init__u24lambda_u2d3
        //   916: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   919: dup            
        //   920: ldc_w           0.5625
        //   923: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //   926: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   929: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   932: aload_0         /* this */
        //   933: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getImg:()Lgg/essential/gui/screenshot/image/ScreenshotImage;
        //   936: checkcast       Lgg/essential/elementa/UIComponent;
        //   939: new             Lgg/essential/elementa/effects/OutlineEffect;
        //   942: dup            
        //   943: getstatic       gg/essential/gui/EssentialPalette.ACCENT_BLUE:Ljava/awt/Color;
        //   946: fconst_2       
        //   947: iconst_0       
        //   948: iconst_0       
        //   949: aconst_null    
        //   950: bipush          24
        //   952: aconst_null    
        //   953: invokespecial   gg/essential/elementa/effects/OutlineEffect.<init>:(Ljava/awt/Color;FZZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   956: checkcast       Lgg/essential/elementa/effects/Effect;
        //   959: aload_0         /* this */
        //   960: getfield        gg/essential/gui/screenshot/components/ScreenshotPreview.hovered:Lgg/essential/elementa/state/MappedState;
        //   963: checkcast       Lgg/essential/elementa/state/State;
        //   966: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindEffect$default$21ee9c1f$52d905c5:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/UIComponent;
        //   969: pop            
        //   970: aload_0         /* this */
        //   971: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getFavoriteContainer:()Lgg/essential/elementa/components/UIContainer;
        //   974: checkcast       Lgg/essential/elementa/UIComponent;
        //   977: astore          $this$onLeftClick$iv
        //   979: aload           $this$onLeftClick$iv
        //   981: new             Lgg/essential/gui/screenshot/components/ScreenshotPreview$special$$inlined$onLeftClick$1;
        //   984: dup            
        //   985: aload_0         /* this */
        //   986: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotPreview;)V
        //   989: checkcast       Lkotlin/jvm/functions/Function2;
        //   992: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   995: pop            
        //   996: aload_0         /* this */
        //   997: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getDotsContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1000: checkcast       Lgg/essential/elementa/UIComponent;
        //  1003: astore          $this$onLeftClick$iv
        //  1005: aload           $this$onLeftClick$iv
        //  1007: new             Lgg/essential/gui/screenshot/components/ScreenshotPreview$special$$inlined$onLeftClick$2;
        //  1010: dup            
        //  1011: aload_0         /* this */
        //  1012: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview$special$$inlined$onLeftClick$2.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotPreview;)V
        //  1015: checkcast       Lkotlin/jvm/functions/Function2;
        //  1018: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1021: pop            
        //  1022: aload_0         /* this */
        //  1023: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.getImg:()Lgg/essential/gui/screenshot/image/ScreenshotImage;
        //  1026: new             Lgg/essential/gui/screenshot/components/ScreenshotPreview$4;
        //  1029: dup            
        //  1030: aload_0         /* this */
        //  1031: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview$4.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotPreview;)V
        //  1034: checkcast       Lkotlin/jvm/functions/Function2;
        //  1037: invokevirtual   gg/essential/gui/screenshot/image/ScreenshotImage.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1040: pop            
        //  1041: aload_0         /* this */
        //  1042: checkcast       Lgg/essential/elementa/UIComponent;
        //  1045: astore          $this$onLeftClick$iv
        //  1047: aload           $this$onLeftClick$iv
        //  1049: new             Lgg/essential/gui/screenshot/components/ScreenshotPreview$special$$inlined$onLeftClick$3;
        //  1052: dup            
        //  1053: aload_0         /* this */
        //  1054: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview$special$$inlined$onLeftClick$3.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotPreview;)V
        //  1057: checkcast       Lkotlin/jvm/functions/Function2;
        //  1060: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1063: pop            
        //  1064: return         
        //    Signature:
        //  (Lgg/essential/gui/screenshot/components/ScreenshotProperties;Lgg/essential/gui/screenshot/components/ListViewComponent;ILgg/essential/elementa/state/State<Ljava/lang/Integer;>;)V
        //    MethodParameters:
        //  Name                 Flags  
        //  -------------------  -----
        //  properties           
        //  viewComponent        
        //  index                
        //  numberOfItemsPerRow  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final ScreenshotProperties getProperties() {
        return this.properties;
    }
    
    private final ScreenshotImage getImg() {
        return (ScreenshotImage)this.img$delegate.getValue((Object)this, (KProperty)ScreenshotPreview.$$delegatedProperties[0]);
    }
    
    private final UIContainer getFavoriteContainer() {
        return (UIContainer)this.favoriteContainer$delegate.getValue((Object)this, (KProperty)ScreenshotPreview.$$delegatedProperties[1]);
    }
    
    private final UIContainer getDotsContainer() {
        return (UIContainer)this.dotsContainer$delegate.getValue((Object)this, (KProperty)ScreenshotPreview.$$delegatedProperties[3]);
    }
    
    public final void updateTexture(@Nullable final Identifier resourceLocation) {
        if (resourceLocation == null) {
            this.getImg().getTexture().set((PixelBufferTexture)null);
        }
        else {
            final TextureManager textureManager = MinecraftClient.getInstance().getTextureManager();
            final PixelBufferTexture texture = (PixelBufferTexture)textureManager.getTexture(resourceLocation);
            this.getImg().getTexture().set(texture);
            if (texture != null) {
                this.imageAspectState.set(texture.getImageWidth() / (float)texture.getImageHeight());
            }
        }
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        super.draw(matrixStack);
        final ScreenshotProviderManager providerManager2;
        final ScreenshotProviderManager providerManager = providerManager2 = this.viewComponent.getScreenshotBrowser().getProviderManager();
        final WindowedProvider$Window renderedLastFrame = providerManager.getRenderedLastFrame();
        providerManager2.setRenderedLastFrame((renderedLastFrame != null) ? renderedLastFrame.expandToInclude(this.index) : new WindowedProvider$Window(new IntRange(this.index, this.index), false));
    }
    
    public static final /* synthetic */ State access$getFavorite$p(final ScreenshotPreview $this) {
        return $this.favorite;
    }
    
    public static final /* synthetic */ ListViewComponent access$getViewComponent$p(final ScreenshotPreview $this) {
        return $this.viewComponent;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotPreview.class, "img", "getImg()Lgg/essential/gui/screenshot/image/ScreenshotImage;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotPreview.class, "favoriteContainer", "getFavoriteContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotPreview.class, "hollowHeart", "getHollowHeart()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotPreview.class, "dotsContainer", "getDotsContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotPreview.class, "dots", "getDots()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)) };
    }
}
