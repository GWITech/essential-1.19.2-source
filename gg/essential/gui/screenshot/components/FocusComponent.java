package gg.essential.gui.screenshot.components;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import kotlin.properties.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.image.*;
import gg.essential.gui.*;
import gg.essential.elementa.*;
import gg.essential.util.*;
import kotlin.*;
import java.awt.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000z
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010<\u001a\u00020=2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020	0\bJ\u000e\u0010?\u001a\u00020=2\u0006\u0010@\u001a\u00020	J\u000e\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020CJ\b\u0010D\u001a\u00020=H\u0016J\b\u0010E\u001a\u00020=H\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020	0\b¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0086D¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020\r8DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b"\u0010\u0011\u001a\u0004\b!\u0010\u000fR\u001b\u0010#\u001a\u00020\u001c8DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b%\u0010\u0011\u001a\u0004\b$\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020	0'X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020\r8DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b.\u0010\u0011\u001a\u0004\b-\u0010\u000fR\u0011\u0010/\u001a\u000200¢\u0006\b
                                                   \u0000\u001a\u0004\b1\u00102R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u00103\u001a\u0002048DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b7\u0010\u0011\u001a\u0004\b5\u00106R\u0011\u00108\u001a\u000209¢\u0006\b
                                                   \u0000\u001a\u0004\b:\u0010;¨\u0006F""" }, d2 = { "Lgg/essential/gui/screenshot/components/FocusComponent;", "Lgg/essential/gui/screenshot/components/ScreenshotView;", "screenshotBrowser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "focusType", "Lgg/essential/gui/screenshot/components/FocusType;", "(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;Lgg/essential/gui/screenshot/components/FocusType;)V", "active", "Lgg/essential/elementa/state/State;", "", "getActive", "()Lgg/essential/elementa/state/State;", "backButton", "Lgg/essential/elementa/UIComponent;", "getBackButton", "()Lgg/essential/elementa/UIComponent;", "backButton$delegate", "Lkotlin/properties/ReadWriteProperty;", "buttonSize", "", "getButtonSize", "()F", "container", "Lgg/essential/elementa/components/UIContainer;", "getContainer", "()Lgg/essential/elementa/components/UIContainer;", "container$delegate", "delete", "Lgg/essential/gui/common/IconButton;", "getDelete", "()Lgg/essential/gui/common/IconButton;", "delete$delegate", "edit", "getEdit", "edit$delegate", "favorite", "getFavorite", "favorite$delegate", "isFocusView", "Lgg/essential/elementa/state/MappedState;", "previewing", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "getPreviewing", "()Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "properties", "getProperties", "properties$delegate", "providerManager", "Lgg/essential/gui/screenshot/components/ScreenshotProviderManager;", "getProviderManager", "()Lgg/essential/gui/screenshot/components/ScreenshotProviderManager;", "share", "Lgg/essential/gui/screenshot/components/ShareButton;", "getShare", "()Lgg/essential/gui/screenshot/components/ShareButton;", "share$delegate", "time", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getTime", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "applyFavoriteState", "", "favState", "deleteCurrentFocus", "closeAfter", "focus", "index", "", "onBackButtonPressed", "onClose", "essential" })
public class FocusComponent extends ScreenshotView
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ScreenshotBrowser screenshotBrowser;
    @NotNull
    private final FocusType focusType;
    @NotNull
    private final State<Boolean> active;
    @NotNull
    private final MappedState<FocusType, Boolean> isFocusView;
    @NotNull
    private final ScreenshotProviderManager providerManager;
    @NotNull
    private final ReadWriteProperty delete$delegate;
    @NotNull
    private final ReadWriteProperty favorite$delegate;
    @NotNull
    private final ReadWriteProperty share$delegate;
    @NotNull
    private final ReadWriteProperty container$delegate;
    @NotNull
    private final EssentialUIText time;
    
    public FocusComponent(@NotNull final ScreenshotBrowser screenshotBrowser, @NotNull final FocusType focusType) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "screenshotBrowser"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* focusType */
        //     7: ldc             "focusType"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: getstatic       gg/essential/gui/screenshot/components/View.FOCUS:Lgg/essential/gui/screenshot/components/View;
        //    16: aload_1         /* screenshotBrowser */
        //    17: invokespecial   gg/essential/gui/screenshot/components/ScreenshotView.<init>:(Lgg/essential/gui/screenshot/components/View;Lgg/essential/gui/screenshot/components/ScreenshotBrowser;)V
        //    20: aload_0         /* this */
        //    21: aload_1         /* screenshotBrowser */
        //    22: putfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //    25: aload_0         /* this */
        //    26: aload_2         /* focusType */
        //    27: putfield        gg/essential/gui/screenshot/components/FocusComponent.focusType:Lgg/essential/gui/screenshot/components/FocusType;
        //    30: aload_0         /* this */
        //    31: aload_0         /* this */
        //    32: invokespecial   gg/essential/gui/screenshot/components/ScreenshotView.getActive:()Lgg/essential/elementa/state/State;
        //    35: aload_0         /* this */
        //    36: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //    39: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getFocusType:()Lgg/essential/elementa/state/BasicState;
        //    42: new             Lgg/essential/gui/screenshot/components/FocusComponent$active$1;
        //    45: dup            
        //    46: aload_0         /* this */
        //    47: invokespecial   gg/essential/gui/screenshot/components/FocusComponent$active$1.<init>:(Lgg/essential/gui/screenshot/components/FocusComponent;)V
        //    50: checkcast       Lkotlin/jvm/functions/Function1;
        //    53: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    56: checkcast       Lgg/essential/elementa/state/State;
        //    59: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //    62: checkcast       Lgg/essential/elementa/state/State;
        //    65: putfield        gg/essential/gui/screenshot/components/FocusComponent.active:Lgg/essential/elementa/state/State;
        //    68: aload_0         /* this */
        //    69: aload_0         /* this */
        //    70: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //    73: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getFocusType:()Lgg/essential/elementa/state/BasicState;
        //    76: getstatic       gg/essential/gui/screenshot/components/FocusComponent$isFocusView$1.INSTANCE:Lgg/essential/gui/screenshot/components/FocusComponent$isFocusView$1;
        //    79: checkcast       Lkotlin/jvm/functions/Function1;
        //    82: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    85: putfield        gg/essential/gui/screenshot/components/FocusComponent.isFocusView:Lgg/essential/elementa/state/MappedState;
        //    88: aload_0         /* this */
        //    89: aload_0         /* this */
        //    90: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //    93: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getProviderManager:()Lgg/essential/gui/screenshot/components/ScreenshotProviderManager;
        //    96: putfield        gg/essential/gui/screenshot/components/FocusComponent.providerManager:Lgg/essential/gui/screenshot/components/ScreenshotProviderManager;
        //    99: new             Lgg/essential/gui/common/IconButton;
        //   102: dup            
        //   103: getstatic       gg/essential/gui/EssentialPalette.ARROW_LEFT_4X7:Lgg/essential/gui/image/ImageFactory;
        //   106: ldc             "Back"
        //   108: aconst_null    
        //   109: iconst_0       
        //   110: iconst_0       
        //   111: iconst_0       
        //   112: bipush          60
        //   114: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   117: checkcast       Lgg/essential/elementa/UIComponent;
        //   120: astore_3        /* $this$constrain$iv */
        //   121: aload_3         /* $this$constrain$iv */
        //   122: astore          4
        //   124: aload           4
        //   126: astore          $this$constrain_u24lambda_u2d0$iv
        //   128: aload           $this$constrain_u24lambda_u2d0$iv
        //   130: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   133: astore          $this$backButton_delegate_u24lambda_u2d0
        //   135: aload           $this$backButton_delegate_u24lambda_u2d0
        //   137: bipush          10
        //   139: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   142: checkcast       Ljava/lang/Number;
        //   145: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   148: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   151: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   154: aload           $this$backButton_delegate_u24lambda_u2d0
        //   156: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   159: dup            
        //   160: iconst_0       
        //   161: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   164: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   167: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   170: aload           4
        //   172: aload_0         /* this */
        //   173: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   176: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   179: checkcast       Lgg/essential/elementa/UIComponent;
        //   182: aload_0         /* this */
        //   183: getfield        gg/essential/gui/screenshot/components/FocusComponent.active:Lgg/essential/elementa/state/State;
        //   186: iconst_0       
        //   187: aconst_null    
        //   188: bipush          12
        //   190: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   193: astore_3        /* $this$onLeftClick$iv */
        //   194: aload_3         /* $this$onLeftClick$iv */
        //   195: new             Lgg/essential/gui/screenshot/components/FocusComponent$special$$inlined$onLeftClick$1;
        //   198: dup            
        //   199: aload_0         /* this */
        //   200: invokespecial   gg/essential/gui/screenshot/components/FocusComponent$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/screenshot/components/FocusComponent;)V
        //   203: checkcast       Lkotlin/jvm/functions/Function2;
        //   206: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   209: aload_0         /* this */
        //   210: getstatic       gg/essential/gui/screenshot/components/FocusComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   213: iconst_0       
        //   214: aaload         
        //   215: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   218: pop            
        //   219: aload_0         /* this */
        //   220: new             Lgg/essential/gui/common/IconButton;
        //   223: dup            
        //   224: getstatic       gg/essential/gui/EssentialPalette.TRASH_9X:Lgg/essential/gui/image/ImageFactory;
        //   227: aconst_null    
        //   228: ldc             "Delete"
        //   230: iconst_0       
        //   231: iconst_0       
        //   232: iconst_0       
        //   233: bipush          58
        //   235: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   238: new             Lgg/essential/gui/common/IconButton$Dimension$Fixed;
        //   241: dup            
        //   242: ldc             17.0
        //   244: ldc             17.0
        //   246: invokespecial   gg/essential/gui/common/IconButton$Dimension$Fixed.<init>:(FF)V
        //   249: checkcast       Lgg/essential/gui/common/IconButton$Dimension;
        //   252: invokevirtual   gg/essential/gui/common/IconButton.setDimension:(Lgg/essential/gui/common/IconButton$Dimension;)Lgg/essential/gui/common/IconButton;
        //   255: checkcast       Lgg/essential/elementa/UIComponent;
        //   258: astore_3        /* $this$constrain$iv */
        //   259: aload_3         /* $this$constrain$iv */
        //   260: astore          4
        //   262: aload           4
        //   264: astore          $this$constrain_u24lambda_u2d0$iv
        //   266: aload           $this$constrain_u24lambda_u2d0$iv
        //   268: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   271: astore          6
        //   273: astore          7
        //   275: aload           $this$delete_delegate_u24lambda_u2d2
        //   277: bipush          10
        //   279: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   282: checkcast       Ljava/lang/Number;
        //   285: iconst_1       
        //   286: iconst_0       
        //   287: iconst_2       
        //   288: aconst_null    
        //   289: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   292: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   295: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   298: aload           $this$delete_delegate_u24lambda_u2d2
        //   300: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   303: dup            
        //   304: iconst_0       
        //   305: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   308: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   311: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   314: aload           7
        //   316: aload           4
        //   318: aload_0         /* this */
        //   319: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   322: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   325: checkcast       Lgg/essential/elementa/UIComponent;
        //   328: aload_0         /* this */
        //   329: getfield        gg/essential/gui/screenshot/components/FocusComponent.active:Lgg/essential/elementa/state/State;
        //   332: aload_0         /* this */
        //   333: getfield        gg/essential/gui/screenshot/components/FocusComponent.isFocusView:Lgg/essential/elementa/state/MappedState;
        //   336: checkcast       Lgg/essential/elementa/state/State;
        //   339: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   342: checkcast       Lgg/essential/elementa/state/State;
        //   345: iconst_0       
        //   346: aconst_null    
        //   347: bipush          12
        //   349: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   352: aload_0         /* this */
        //   353: getstatic       gg/essential/gui/screenshot/components/FocusComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   356: iconst_1       
        //   357: aaload         
        //   358: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   361: putfield        gg/essential/gui/screenshot/components/FocusComponent.delete$delegate:Lkotlin/properties/ReadWriteProperty;
        //   364: aload_0         /* this */
        //   365: new             Lgg/essential/gui/common/IconButton;
        //   368: dup            
        //   369: getstatic       gg/essential/gui/EssentialPalette.HEART_EMPTY_9X:Lgg/essential/gui/image/ImageFactory;
        //   372: aconst_null    
        //   373: ldc_w           "Favorite"
        //   376: iconst_0       
        //   377: iconst_0       
        //   378: iconst_0       
        //   379: bipush          58
        //   381: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   384: new             Lgg/essential/gui/common/IconButton$Dimension$Fixed;
        //   387: dup            
        //   388: ldc             17.0
        //   390: ldc             17.0
        //   392: invokespecial   gg/essential/gui/common/IconButton$Dimension$Fixed.<init>:(FF)V
        //   395: checkcast       Lgg/essential/gui/common/IconButton$Dimension;
        //   398: invokevirtual   gg/essential/gui/common/IconButton.setDimension:(Lgg/essential/gui/common/IconButton$Dimension;)Lgg/essential/gui/common/IconButton;
        //   401: checkcast       Lgg/essential/elementa/UIComponent;
        //   404: astore_3        /* $this$constrain$iv */
        //   405: aload_3         /* $this$constrain$iv */
        //   406: astore          4
        //   408: aload           4
        //   410: astore          $this$constrain_u24lambda_u2d0$iv
        //   412: aload           $this$constrain_u24lambda_u2d0$iv
        //   414: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   417: astore          6
        //   419: astore          7
        //   421: aload           $this$favorite_delegate_u24lambda_u2d3
        //   423: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   426: dup            
        //   427: ldc_w           3.0
        //   430: iconst_1       
        //   431: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   434: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   437: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   440: aload           $this$favorite_delegate_u24lambda_u2d3
        //   442: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   445: dup            
        //   446: iconst_0       
        //   447: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   450: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   453: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   456: aload           7
        //   458: aload           4
        //   460: aload_0         /* this */
        //   461: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   464: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   467: checkcast       Lgg/essential/elementa/UIComponent;
        //   470: aload_0         /* this */
        //   471: getfield        gg/essential/gui/screenshot/components/FocusComponent.active:Lgg/essential/elementa/state/State;
        //   474: aload_0         /* this */
        //   475: getfield        gg/essential/gui/screenshot/components/FocusComponent.isFocusView:Lgg/essential/elementa/state/MappedState;
        //   478: checkcast       Lgg/essential/elementa/state/State;
        //   481: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   484: checkcast       Lgg/essential/elementa/state/State;
        //   487: iconst_0       
        //   488: aconst_null    
        //   489: bipush          12
        //   491: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   494: aload_0         /* this */
        //   495: getstatic       gg/essential/gui/screenshot/components/FocusComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   498: iconst_2       
        //   499: aaload         
        //   500: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   503: putfield        gg/essential/gui/screenshot/components/FocusComponent.favorite$delegate:Lkotlin/properties/ReadWriteProperty;
        //   506: aload_0         /* this */
        //   507: new             Lgg/essential/gui/screenshot/components/ShareButton;
        //   510: dup            
        //   511: aload_0         /* this */
        //   512: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   515: invokespecial   gg/essential/gui/screenshot/components/ShareButton.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;)V
        //   518: new             Lgg/essential/gui/common/IconButton$Dimension$Fixed;
        //   521: dup            
        //   522: ldc             17.0
        //   524: ldc             17.0
        //   526: invokespecial   gg/essential/gui/common/IconButton$Dimension$Fixed.<init>:(FF)V
        //   529: checkcast       Lgg/essential/gui/common/IconButton$Dimension;
        //   532: invokevirtual   gg/essential/gui/screenshot/components/ShareButton.setDimension:(Lgg/essential/gui/common/IconButton$Dimension;)Lgg/essential/gui/screenshot/components/ShareButton;
        //   535: checkcast       Lgg/essential/elementa/UIComponent;
        //   538: astore_3        /* $this$constrain$iv */
        //   539: aload_3         /* $this$constrain$iv */
        //   540: astore          4
        //   542: aload           4
        //   544: astore          $this$constrain_u24lambda_u2d0$iv
        //   546: aload           $this$constrain_u24lambda_u2d0$iv
        //   548: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   551: astore          6
        //   553: astore          7
        //   555: aload           $this$share_delegate_u24lambda_u2d4
        //   557: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   560: dup            
        //   561: ldc_w           3.0
        //   564: iconst_1       
        //   565: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   568: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   571: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   574: aload           $this$share_delegate_u24lambda_u2d4
        //   576: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   579: dup            
        //   580: iconst_0       
        //   581: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   584: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   587: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   590: aload           7
        //   592: aload           4
        //   594: aload_0         /* this */
        //   595: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   598: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   601: checkcast       Lgg/essential/elementa/UIComponent;
        //   604: aload_0         /* this */
        //   605: getfield        gg/essential/gui/screenshot/components/FocusComponent.active:Lgg/essential/elementa/state/State;
        //   608: aload_0         /* this */
        //   609: getfield        gg/essential/gui/screenshot/components/FocusComponent.isFocusView:Lgg/essential/elementa/state/MappedState;
        //   612: checkcast       Lgg/essential/elementa/state/State;
        //   615: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   618: checkcast       Lgg/essential/elementa/state/State;
        //   621: iconst_0       
        //   622: aconst_null    
        //   623: bipush          12
        //   625: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   628: aload_0         /* this */
        //   629: getstatic       gg/essential/gui/screenshot/components/FocusComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   632: iconst_3       
        //   633: aaload         
        //   634: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   637: putfield        gg/essential/gui/screenshot/components/FocusComponent.share$delegate:Lkotlin/properties/ReadWriteProperty;
        //   640: new             Lgg/essential/gui/common/IconButton;
        //   643: dup            
        //   644: getstatic       gg/essential/gui/EssentialPalette.PROPERTIES_7X5:Lgg/essential/gui/image/ImageFactory;
        //   647: aconst_null    
        //   648: ldc_w           "Properties"
        //   651: iconst_0       
        //   652: iconst_0       
        //   653: iconst_0       
        //   654: bipush          58
        //   656: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   659: new             Lgg/essential/gui/common/IconButton$Dimension$Fixed;
        //   662: dup            
        //   663: ldc             17.0
        //   665: ldc             17.0
        //   667: invokespecial   gg/essential/gui/common/IconButton$Dimension$Fixed.<init>:(FF)V
        //   670: checkcast       Lgg/essential/gui/common/IconButton$Dimension;
        //   673: invokevirtual   gg/essential/gui/common/IconButton.setDimension:(Lgg/essential/gui/common/IconButton$Dimension;)Lgg/essential/gui/common/IconButton;
        //   676: checkcast       Lgg/essential/elementa/UIComponent;
        //   679: astore_3        /* $this$constrain$iv */
        //   680: aload_3         /* $this$constrain$iv */
        //   681: astore          4
        //   683: aload           4
        //   685: astore          $this$constrain_u24lambda_u2d0$iv
        //   687: aload           $this$constrain_u24lambda_u2d0$iv
        //   689: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   692: astore          $this$properties_delegate_u24lambda_u2d5
        //   694: aload           $this$properties_delegate_u24lambda_u2d5
        //   696: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   699: dup            
        //   700: ldc_w           10.0
        //   703: iconst_1       
        //   704: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   707: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   710: aload_0         /* this */
        //   711: invokevirtual   gg/essential/gui/screenshot/components/FocusComponent.getShare:()Lgg/essential/gui/screenshot/components/ShareButton;
        //   714: checkcast       Lgg/essential/elementa/UIComponent;
        //   717: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   720: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   723: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   726: aload           $this$properties_delegate_u24lambda_u2d5
        //   728: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   731: dup            
        //   732: iconst_0       
        //   733: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   736: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   739: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   742: aload           4
        //   744: astore_3        /* $this$constrain$iv */
        //   745: aload_3         /* $this$onLeftClick$iv */
        //   746: new             Lgg/essential/gui/screenshot/components/FocusComponent$special$$inlined$onLeftClick$2;
        //   749: dup            
        //   750: aload_0         /* this */
        //   751: invokespecial   gg/essential/gui/screenshot/components/FocusComponent$special$$inlined$onLeftClick$2.<init>:(Lgg/essential/gui/screenshot/components/FocusComponent;)V
        //   754: checkcast       Lkotlin/jvm/functions/Function2;
        //   757: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   760: aload_0         /* this */
        //   761: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   764: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   767: checkcast       Lgg/essential/elementa/UIComponent;
        //   770: aload_0         /* this */
        //   771: getfield        gg/essential/gui/screenshot/components/FocusComponent.active:Lgg/essential/elementa/state/State;
        //   774: aload_0         /* this */
        //   775: getfield        gg/essential/gui/screenshot/components/FocusComponent.isFocusView:Lgg/essential/elementa/state/MappedState;
        //   778: checkcast       Lgg/essential/elementa/state/State;
        //   781: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   784: checkcast       Lgg/essential/elementa/state/State;
        //   787: iconst_0       
        //   788: aconst_null    
        //   789: bipush          12
        //   791: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   794: aload_0         /* this */
        //   795: getstatic       gg/essential/gui/screenshot/components/FocusComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   798: iconst_4       
        //   799: aaload         
        //   800: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   803: pop            
        //   804: new             Lgg/essential/gui/common/IconButton;
        //   807: dup            
        //   808: getstatic       gg/essential/gui/EssentialPalette.EDIT_10X7:Lgg/essential/gui/image/ImageFactory;
        //   811: ldc_w           "Edit"
        //   814: aconst_null    
        //   815: iconst_0       
        //   816: iconst_0       
        //   817: iconst_0       
        //   818: bipush          60
        //   820: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   823: new             Lgg/essential/gui/common/IconButton$Dimension$Fixed;
        //   826: dup            
        //   827: ldc_w           44.0
        //   830: ldc             17.0
        //   832: invokespecial   gg/essential/gui/common/IconButton$Dimension$Fixed.<init>:(FF)V
        //   835: checkcast       Lgg/essential/gui/common/IconButton$Dimension;
        //   838: invokevirtual   gg/essential/gui/common/IconButton.setDimension:(Lgg/essential/gui/common/IconButton$Dimension;)Lgg/essential/gui/common/IconButton;
        //   841: checkcast       Lgg/essential/elementa/UIComponent;
        //   844: astore_3        /* $this$constrain$iv */
        //   845: aload_3         /* $this$constrain$iv */
        //   846: astore          4
        //   848: aload           4
        //   850: astore          $this$constrain_u24lambda_u2d0$iv
        //   852: aload           $this$constrain_u24lambda_u2d0$iv
        //   854: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   857: astore          $this$edit_delegate_u24lambda_u2d7
        //   859: aload           $this$edit_delegate_u24lambda_u2d7
        //   861: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   864: dup            
        //   865: ldc_w           3.0
        //   868: iconst_1       
        //   869: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   872: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   875: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   878: aload           $this$edit_delegate_u24lambda_u2d7
        //   880: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   883: dup            
        //   884: iconst_0       
        //   885: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   888: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   891: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   894: aload           4
        //   896: astore_3        /* $this$constrain$iv */
        //   897: aload_3         /* $this$onLeftClick$iv */
        //   898: new             Lgg/essential/gui/screenshot/components/FocusComponent$special$$inlined$onLeftClick$3;
        //   901: dup            
        //   902: aload_0         /* this */
        //   903: invokespecial   gg/essential/gui/screenshot/components/FocusComponent$special$$inlined$onLeftClick$3.<init>:(Lgg/essential/gui/screenshot/components/FocusComponent;)V
        //   906: checkcast       Lkotlin/jvm/functions/Function2;
        //   909: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   912: aload_0         /* this */
        //   913: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   916: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   919: checkcast       Lgg/essential/elementa/UIComponent;
        //   922: aload_0         /* this */
        //   923: getfield        gg/essential/gui/screenshot/components/FocusComponent.active:Lgg/essential/elementa/state/State;
        //   926: aload_0         /* this */
        //   927: getfield        gg/essential/gui/screenshot/components/FocusComponent.isFocusView:Lgg/essential/elementa/state/MappedState;
        //   930: checkcast       Lgg/essential/elementa/state/State;
        //   933: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   936: checkcast       Lgg/essential/elementa/state/State;
        //   939: iconst_0       
        //   940: aconst_null    
        //   941: bipush          12
        //   943: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   946: aload_0         /* this */
        //   947: getstatic       gg/essential/gui/screenshot/components/FocusComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   950: iconst_5       
        //   951: aaload         
        //   952: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   955: pop            
        //   956: aload_0         /* this */
        //   957: new             Lgg/essential/elementa/components/UIContainer;
        //   960: dup            
        //   961: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   964: checkcast       Lgg/essential/elementa/UIComponent;
        //   967: astore_3        /* $this$constrain$iv */
        //   968: aload_3         /* $this$constrain$iv */
        //   969: astore          4
        //   971: aload           4
        //   973: astore          $this$constrain_u24lambda_u2d0$iv
        //   975: aload           $this$constrain_u24lambda_u2d0$iv
        //   977: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   980: astore          6
        //   982: astore          7
        //   984: aload           $this$container_delegate_u24lambda_u2d9
        //   986: bipush          100
        //   988: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   991: checkcast       Ljava/lang/Number;
        //   994: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   997: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1000: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1003: aload           $this$container_delegate_u24lambda_u2d9
        //  1005: bipush          100
        //  1007: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1010: checkcast       Ljava/lang/Number;
        //  1013: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1016: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1019: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1022: aload           7
        //  1024: aload           4
        //  1026: aload_0         /* this */
        //  1027: checkcast       Lgg/essential/elementa/UIComponent;
        //  1030: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1033: aload_0         /* this */
        //  1034: getstatic       gg/essential/gui/screenshot/components/FocusComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1037: bipush          6
        //  1039: aaload         
        //  1040: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1043: putfield        gg/essential/gui/screenshot/components/FocusComponent.container$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1046: aload_0         /* this */
        //  1047: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1050: dup            
        //  1051: aconst_null    
        //  1052: iconst_0       
        //  1053: aconst_null    
        //  1054: iconst_0       
        //  1055: iconst_0       
        //  1056: iconst_0       
        //  1057: bipush          63
        //  1059: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  1062: checkcast       Lgg/essential/elementa/UIComponent;
        //  1065: astore_3        /* $this$constrain$iv */
        //  1066: aload_3         /* $this$constrain$iv */
        //  1067: astore          4
        //  1069: aload           4
        //  1071: astore          $this$constrain_u24lambda_u2d0$iv
        //  1073: aload           $this$constrain_u24lambda_u2d0$iv
        //  1075: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1078: astore          6
        //  1080: astore          7
        //  1082: aload           $this$time_u24lambda_u2d10
        //  1084: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1087: dup            
        //  1088: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1091: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1094: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1097: aload           $this$time_u24lambda_u2d10
        //  1099: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //  1102: dup            
        //  1103: iconst_0       
        //  1104: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //  1107: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1110: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1113: aload           7
        //  1115: aload           4
        //  1117: aload_0         /* this */
        //  1118: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //  1121: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  1124: checkcast       Lgg/essential/elementa/UIComponent;
        //  1127: aload_0         /* this */
        //  1128: getfield        gg/essential/gui/screenshot/components/FocusComponent.active:Lgg/essential/elementa/state/State;
        //  1131: iconst_0       
        //  1132: aconst_null    
        //  1133: bipush          12
        //  1135: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  1138: checkcast       Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1141: putfield        gg/essential/gui/screenshot/components/FocusComponent.time:Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1144: aload_0         /* this */
        //  1145: checkcast       Lgg/essential/elementa/UIComponent;
        //  1148: astore_3        /* $this$constrain$iv */
        //  1149: aload_3         /* $this$constrain$iv */
        //  1150: astore          4
        //  1152: aload           4
        //  1154: astore          $this$constrain_u24lambda_u2d0$iv
        //  1156: aload           $this$constrain_u24lambda_u2d0$iv
        //  1158: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1161: astore          $this$_init__u24lambda_u2d11
        //  1163: aload           $this$_init__u24lambda_u2d11
        //  1165: bipush          100
        //  1167: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1170: checkcast       Ljava/lang/Number;
        //  1173: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1176: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1179: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1182: aload           $this$_init__u24lambda_u2d11
        //  1184: bipush          100
        //  1186: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1189: checkcast       Ljava/lang/Number;
        //  1192: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1195: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1198: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1201: aload_0         /* this */
        //  1202: checkcast       Lgg/essential/elementa/UIComponent;
        //  1205: aload_0         /* this */
        //  1206: getfield        gg/essential/gui/screenshot/components/FocusComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //  1209: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getContent:()Lgg/essential/elementa/components/UIContainer;
        //  1212: checkcast       Lgg/essential/elementa/UIComponent;
        //  1215: aload_0         /* this */
        //  1216: getfield        gg/essential/gui/screenshot/components/FocusComponent.active:Lgg/essential/elementa/state/State;
        //  1219: iconst_0       
        //  1220: aconst_null    
        //  1221: bipush          12
        //  1223: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  1226: pop            
        //  1227: return         
        //    MethodParameters:
        //  Name               Flags  
        //  -----------------  -----
        //  screenshotBrowser  
        //  focusType          
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    @Override
    public final State<Boolean> getActive() {
        return this.active;
    }
    
    @NotNull
    public final ScreenshotProperties getPreviewing() {
        final ScreenshotProperties value = this.screenshotBrowser.getFocusing().get();
        Intrinsics.checkNotNull((Object)value);
        return value;
    }
    
    @NotNull
    public final ScreenshotProviderManager getProviderManager() {
        return this.providerManager;
    }
    
    @NotNull
    protected final IconButton getDelete() {
        return (IconButton)this.delete$delegate.getValue((Object)this, (KProperty)FocusComponent.$$delegatedProperties[1]);
    }
    
    @NotNull
    protected final IconButton getFavorite() {
        return (IconButton)this.favorite$delegate.getValue((Object)this, (KProperty)FocusComponent.$$delegatedProperties[2]);
    }
    
    @NotNull
    protected final ShareButton getShare() {
        return (ShareButton)this.share$delegate.getValue((Object)this, (KProperty)FocusComponent.$$delegatedProperties[3]);
    }
    
    @NotNull
    protected final UIContainer getContainer() {
        return (UIContainer)this.container$delegate.getValue((Object)this, (KProperty)FocusComponent.$$delegatedProperties[6]);
    }
    
    @NotNull
    public final EssentialUIText getTime() {
        return this.time;
    }
    
    public final void focus(final int index) {
        if (index == -1) {
            this.screenshotBrowser.closeFocus();
            return;
        }
        final ScreenshotProperties properties = this.providerManager.getPropertyMap().get(this.providerManager.getCurrentPaths().get(index));
        if (properties != null) {
            this.screenshotBrowser.changeFocusedComponent(properties);
        }
    }
    
    public final void deleteCurrentFocus$1385ff() {
        final ScreenshotProperties focusing = this.screenshotBrowser.getFocusing().get();
        if (focusing != null) {
            final int previewIndex = this.screenshotBrowser.getProviderManager().getCurrentPaths().indexOf(focusing.getPath());
            final int size = this.providerManager.getCurrentPaths().size();
            final int nextIndex = (previewIndex < size - 1) ? previewIndex : (previewIndex - 1);
            this.providerManager.handleDelete(focusing, (Function0<Unit>)new FocusComponent$deleteCurrentFocus.FocusComponent$deleteCurrentFocus$1(this, nextIndex));
        }
    }
    
    public final void applyFavoriteState(@NotNull final State<Boolean> favState) {
        Intrinsics.checkNotNullParameter((Object)favState, "favState");
        this.getFavorite().rebindIcon((State<ImageFactory>)favState.map((kotlin.jvm.functions.Function1<? super Boolean, ?>)FocusComponent$applyFavoriteState.FocusComponent$applyFavoriteState$1.INSTANCE)).rebindTooltipText(this.screenshotBrowser.getStateManager().mapFavoriteText(favState)).rebindIconColor((State<Color>)favState.zip(EssentialPalette.INSTANCE.getTextColor(ExtensionsKt.hoveredState$default$56721d26(this.getFavorite(), false, false, 3))).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Boolean, Color>, ?>)FocusComponent$applyFavoriteState.FocusComponent$applyFavoriteState$2.INSTANCE));
    }
    
    public void onClose() {
    }
    
    public void onBackButtonPressed() {
        this.screenshotBrowser.closeFocus();
    }
    
    public static final /* synthetic */ ScreenshotBrowser access$getScreenshotBrowser$p(final FocusComponent $this) {
        return $this.screenshotBrowser;
    }
    
    public static final /* synthetic */ FocusType access$getFocusType$p(final FocusComponent $this) {
        return $this.focusType;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusComponent.class, "backButton", "getBackButton()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusComponent.class, "delete", "getDelete()Lgg/essential/gui/common/IconButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusComponent.class, "favorite", "getFavorite()Lgg/essential/gui/common/IconButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusComponent.class, "share", "getShare()Lgg/essential/gui/screenshot/components/ShareButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusComponent.class, "properties", "getProperties()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusComponent.class, "edit", "getEdit()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FocusComponent.class, "container", "getContainer()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
}
