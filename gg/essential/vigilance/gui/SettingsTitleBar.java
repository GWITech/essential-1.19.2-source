package gg.essential.vigilance.gui;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.vigilance.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0013\u0010\fR\u001b\u0010\u0015\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0016\u0010\fR\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\u001f\u0010 ¨\u0006\"" }, d2 = { "Lgg/essential/vigilance/gui/SettingsTitleBar;", "Lgg/essential/elementa/components/UIContainer;", "gui", "Lgg/essential/vigilance/gui/SettingsGui;", "config", "Lgg/essential/vigilance/Vigilant;", "window", "Lgg/essential/elementa/components/Window;", "(Lgg/essential/vigilance/gui/SettingsGui;Lgg/essential/vigilance/Vigilant;Lgg/essential/elementa/components/Window;)V", "contentContainer", "Lgg/essential/elementa/components/UIBlock;", "getContentContainer", "()Lgg/essential/elementa/components/UIBlock;", "contentContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "leftDivider", "getLeftDivider", "leftDivider$delegate", "middleDivider", "getMiddleDivider", "middleDivider$delegate", "rightDivider", "getRightDivider", "rightDivider$delegate", "searchBar", "Lgg/essential/vigilance/gui/Searchbar;", "getSearchBar", "()Lgg/essential/vigilance/gui/Searchbar;", "searchBar$delegate", "titleText", "Lgg/essential/elementa/components/UIText;", "getTitleText", "()Lgg/essential/elementa/components/UIText;", "titleText$delegate", "Vigilance" })
public final class SettingsTitleBar extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final SettingsGui gui;
    @NotNull
    private final Vigilant config;
    @NotNull
    private final ReadWriteProperty leftDivider$delegate;
    @NotNull
    private final ReadWriteProperty contentContainer$delegate;
    @NotNull
    private final ReadWriteProperty rightDivider$delegate;
    @NotNull
    private final ReadWriteProperty titleText$delegate;
    @NotNull
    private final ReadWriteProperty middleDivider$delegate;
    @NotNull
    private final ReadWriteProperty searchBar$delegate;
    
    public SettingsTitleBar(@NotNull final SettingsGui gui, @NotNull final Vigilant config, @NotNull final Window window) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "gui"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* config */
        //     7: ldc             "config"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* window */
        //    13: ldc             "window"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload_0         /* this */
        //    19: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    22: aload_0         /* this */
        //    23: aload_1         /* gui */
        //    24: putfield        gg/essential/vigilance/gui/SettingsTitleBar.gui:Lgg/essential/vigilance/gui/SettingsGui;
        //    27: aload_0         /* this */
        //    28: aload_2         /* config */
        //    29: putfield        gg/essential/vigilance/gui/SettingsTitleBar.config:Lgg/essential/vigilance/Vigilant;
        //    32: aload_0         /* this */
        //    33: new             Lgg/essential/elementa/components/UIBlock;
        //    36: dup            
        //    37: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //    40: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getComponentHighlight$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //    43: checkcast       Lgg/essential/elementa/state/State;
        //    46: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //    49: checkcast       Lgg/essential/elementa/UIComponent;
        //    52: astore          $this$constrain$iv
        //    54: iconst_0       
        //    55: istore          $i$f$constrain
        //    57: aload           $this$constrain$iv
        //    59: astore          6
        //    61: aload           6
        //    63: astore          $this$constrain_u24lambda_u2d0$iv
        //    65: iconst_0       
        //    66: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //    68: aload           $this$constrain_u24lambda_u2d0$iv
        //    70: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    73: astore          9
        //    75: astore          11
        //    77: iconst_0       
        //    78: istore          $i$a$-constrain-SettingsTitleBar$leftDivider$2
        //    80: aload           $this$leftDivider_delegate_u24lambda_u2d0
        //    82: ldc             3.0
        //    84: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    87: checkcast       Ljava/lang/Number;
        //    90: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    93: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    96: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    99: aload           $this$leftDivider_delegate_u24lambda_u2d0
        //   101: bipush          100
        //   103: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   106: checkcast       Ljava/lang/Number;
        //   109: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   112: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   115: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   118: nop            
        //   119: aload           11
        //   121: nop            
        //   122: aload           6
        //   124: nop            
        //   125: aload_0         /* this */
        //   126: checkcast       Lgg/essential/elementa/UIComponent;
        //   129: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   132: aload_0         /* this */
        //   133: getstatic       gg/essential/vigilance/gui/SettingsTitleBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   136: iconst_0       
        //   137: aaload         
        //   138: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   141: putfield        gg/essential/vigilance/gui/SettingsTitleBar.leftDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   144: aload_0         /* this */
        //   145: new             Lgg/essential/elementa/components/UIBlock;
        //   148: dup            
        //   149: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   152: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getComponentBackground:()Ljava/awt/Color;
        //   155: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   158: checkcast       Lgg/essential/elementa/UIComponent;
        //   161: astore          $this$constrain$iv
        //   163: iconst_0       
        //   164: istore          $i$f$constrain
        //   166: aload           $this$constrain$iv
        //   168: astore          6
        //   170: aload           6
        //   172: astore          $this$constrain_u24lambda_u2d0$iv
        //   174: iconst_0       
        //   175: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   177: aload           $this$constrain_u24lambda_u2d0$iv
        //   179: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   182: astore          9
        //   184: astore          11
        //   186: iconst_0       
        //   187: istore          $i$a$-constrain-SettingsTitleBar$contentContainer$2
        //   189: aload           $this$contentContainer_delegate_u24lambda_u2d1
        //   191: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   194: dup            
        //   195: fconst_0       
        //   196: iconst_0       
        //   197: iconst_3       
        //   198: aconst_null    
        //   199: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   202: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   205: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   208: aload           $this$contentContainer_delegate_u24lambda_u2d1
        //   210: bipush          100
        //   212: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   215: checkcast       Ljava/lang/Number;
        //   218: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   221: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   224: ldc             6.0
        //   226: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   229: checkcast       Ljava/lang/Number;
        //   232: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   235: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   238: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   241: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   244: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   247: aload           $this$contentContainer_delegate_u24lambda_u2d1
        //   249: bipush          100
        //   251: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   254: checkcast       Ljava/lang/Number;
        //   257: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   260: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   263: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   266: nop            
        //   267: aload           11
        //   269: nop            
        //   270: aload           6
        //   272: nop            
        //   273: aload_0         /* this */
        //   274: checkcast       Lgg/essential/elementa/UIComponent;
        //   277: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   280: aload_0         /* this */
        //   281: getstatic       gg/essential/vigilance/gui/SettingsTitleBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   284: iconst_1       
        //   285: aaload         
        //   286: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   289: putfield        gg/essential/vigilance/gui/SettingsTitleBar.contentContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   292: aload_0         /* this */
        //   293: new             Lgg/essential/elementa/components/UIBlock;
        //   296: dup            
        //   297: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   300: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getComponentHighlight$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   303: checkcast       Lgg/essential/elementa/state/State;
        //   306: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   309: checkcast       Lgg/essential/elementa/UIComponent;
        //   312: astore          $this$constrain$iv
        //   314: iconst_0       
        //   315: istore          $i$f$constrain
        //   317: aload           $this$constrain$iv
        //   319: astore          6
        //   321: aload           6
        //   323: astore          $this$constrain_u24lambda_u2d0$iv
        //   325: iconst_0       
        //   326: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   328: aload           $this$constrain_u24lambda_u2d0$iv
        //   330: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   333: astore          9
        //   335: astore          11
        //   337: iconst_0       
        //   338: istore          $i$a$-constrain-SettingsTitleBar$rightDivider$2
        //   340: aload           $this$rightDivider_delegate_u24lambda_u2d2
        //   342: iconst_0       
        //   343: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   346: checkcast       Ljava/lang/Number;
        //   349: iconst_1       
        //   350: iconst_0       
        //   351: iconst_2       
        //   352: aconst_null    
        //   353: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   356: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   359: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   362: aload           $this$rightDivider_delegate_u24lambda_u2d2
        //   364: ldc             3.0
        //   366: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   369: checkcast       Ljava/lang/Number;
        //   372: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   375: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   378: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   381: aload           $this$rightDivider_delegate_u24lambda_u2d2
        //   383: bipush          100
        //   385: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   388: checkcast       Ljava/lang/Number;
        //   391: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   394: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   397: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   400: nop            
        //   401: aload           11
        //   403: nop            
        //   404: aload           6
        //   406: nop            
        //   407: aload_0         /* this */
        //   408: checkcast       Lgg/essential/elementa/UIComponent;
        //   411: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   414: aload_0         /* this */
        //   415: getstatic       gg/essential/vigilance/gui/SettingsTitleBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   418: iconst_2       
        //   419: aaload         
        //   420: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   423: putfield        gg/essential/vigilance/gui/SettingsTitleBar.rightDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   426: aload_0         /* this */
        //   427: new             Lgg/essential/elementa/components/UIText;
        //   430: dup            
        //   431: getstatic       gg/essential/vigilance/impl/I18n.INSTANCE:Lgg/essential/vigilance/impl/I18n;
        //   434: aload_0         /* this */
        //   435: getfield        gg/essential/vigilance/gui/SettingsTitleBar.config:Lgg/essential/vigilance/Vigilant;
        //   438: invokevirtual   gg/essential/vigilance/Vigilant.getGuiTitle:()Ljava/lang/String;
        //   441: invokevirtual   gg/essential/vigilance/impl/I18n.format:(Ljava/lang/String;)Ljava/lang/String;
        //   444: iconst_0       
        //   445: aconst_null    
        //   446: bipush          6
        //   448: aconst_null    
        //   449: invokespecial   gg/essential/elementa/components/UIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   452: checkcast       Lgg/essential/elementa/UIComponent;
        //   455: astore          $this$constrain$iv
        //   457: iconst_0       
        //   458: istore          $i$f$constrain
        //   460: aload           $this$constrain$iv
        //   462: astore          6
        //   464: aload           6
        //   466: astore          $this$constrain_u24lambda_u2d0$iv
        //   468: iconst_0       
        //   469: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   471: aload           $this$constrain_u24lambda_u2d0$iv
        //   473: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   476: astore          9
        //   478: astore          11
        //   480: iconst_0       
        //   481: istore          $i$a$-constrain-SettingsTitleBar$titleText$2
        //   483: aload           $this$titleText_delegate_u24lambda_u2d3
        //   485: bipush          10
        //   487: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   490: checkcast       Ljava/lang/Number;
        //   493: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   496: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   499: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   502: aload           $this$titleText_delegate_u24lambda_u2d3
        //   504: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   507: dup            
        //   508: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   511: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   514: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   517: nop            
        //   518: aload           11
        //   520: nop            
        //   521: aload           6
        //   523: nop            
        //   524: aload_0         /* this */
        //   525: invokespecial   gg/essential/vigilance/gui/SettingsTitleBar.getContentContainer:()Lgg/essential/elementa/components/UIBlock;
        //   528: checkcast       Lgg/essential/elementa/UIComponent;
        //   531: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   534: aload_0         /* this */
        //   535: getstatic       gg/essential/vigilance/gui/SettingsTitleBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   538: iconst_3       
        //   539: aaload         
        //   540: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   543: putfield        gg/essential/vigilance/gui/SettingsTitleBar.titleText$delegate:Lkotlin/properties/ReadWriteProperty;
        //   546: aload_0         /* this */
        //   547: new             Lgg/essential/elementa/components/UIBlock;
        //   550: dup            
        //   551: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   554: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getComponentHighlight$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   557: checkcast       Lgg/essential/elementa/state/State;
        //   560: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   563: checkcast       Lgg/essential/elementa/UIComponent;
        //   566: astore          $this$constrain$iv
        //   568: iconst_0       
        //   569: istore          $i$f$constrain
        //   571: aload           $this$constrain$iv
        //   573: astore          6
        //   575: aload           6
        //   577: astore          $this$constrain_u24lambda_u2d0$iv
        //   579: iconst_0       
        //   580: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   582: aload           $this$constrain_u24lambda_u2d0$iv
        //   584: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   587: astore          9
        //   589: astore          11
        //   591: iconst_0       
        //   592: istore          $i$a$-constrain-SettingsTitleBar$middleDivider$2
        //   594: aload           $this$middleDivider_delegate_u24lambda_u2d4
        //   596: bipush          25
        //   598: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   601: checkcast       Ljava/lang/Number;
        //   604: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   607: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   610: ldc             3.0
        //   612: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   615: checkcast       Ljava/lang/Number;
        //   618: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   621: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   624: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   627: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   630: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   633: aload           $this$middleDivider_delegate_u24lambda_u2d4
        //   635: ldc             3.0
        //   637: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   640: checkcast       Ljava/lang/Number;
        //   643: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   646: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   649: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   652: aload           $this$middleDivider_delegate_u24lambda_u2d4
        //   654: bipush          100
        //   656: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   659: checkcast       Ljava/lang/Number;
        //   662: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   665: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   668: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   671: nop            
        //   672: aload           11
        //   674: nop            
        //   675: aload           6
        //   677: nop            
        //   678: aload_0         /* this */
        //   679: checkcast       Lgg/essential/elementa/UIComponent;
        //   682: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   685: aload_0         /* this */
        //   686: getstatic       gg/essential/vigilance/gui/SettingsTitleBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   689: iconst_4       
        //   690: aaload         
        //   691: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   694: putfield        gg/essential/vigilance/gui/SettingsTitleBar.middleDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   697: aload_0         /* this */
        //   698: new             Lgg/essential/vigilance/gui/Searchbar;
        //   701: dup            
        //   702: aconst_null    
        //   703: aconst_null    
        //   704: iconst_0       
        //   705: iconst_0       
        //   706: iconst_0       
        //   707: bipush          31
        //   709: aconst_null    
        //   710: invokespecial   gg/essential/vigilance/gui/Searchbar.<init>:(Ljava/lang/String;Ljava/lang/String;ZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   713: checkcast       Lgg/essential/elementa/UIComponent;
        //   716: astore          $this$constrain$iv
        //   718: iconst_0       
        //   719: istore          $i$f$constrain
        //   721: aload           $this$constrain$iv
        //   723: astore          6
        //   725: aload           6
        //   727: astore          $this$constrain_u24lambda_u2d0$iv
        //   729: iconst_0       
        //   730: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   732: aload           $this$constrain_u24lambda_u2d0$iv
        //   734: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   737: astore          9
        //   739: astore          11
        //   741: iconst_0       
        //   742: istore          $i$a$-constrain-SettingsTitleBar$searchBar$2
        //   744: aload           $this$searchBar_delegate_u24lambda_u2d5
        //   746: bipush          10
        //   748: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   751: checkcast       Ljava/lang/Number;
        //   754: iconst_1       
        //   755: iconst_0       
        //   756: iconst_2       
        //   757: aconst_null    
        //   758: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   761: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   764: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   767: aload           $this$searchBar_delegate_u24lambda_u2d5
        //   769: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   772: dup            
        //   773: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   776: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   779: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   782: aload           $this$searchBar_delegate_u24lambda_u2d5
        //   784: bipush          17
        //   786: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   789: checkcast       Ljava/lang/Number;
        //   792: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   795: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   798: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   801: nop            
        //   802: aload           11
        //   804: nop            
        //   805: aload           6
        //   807: nop            
        //   808: aload_0         /* this */
        //   809: invokespecial   gg/essential/vigilance/gui/SettingsTitleBar.getContentContainer:()Lgg/essential/elementa/components/UIBlock;
        //   812: checkcast       Lgg/essential/elementa/UIComponent;
        //   815: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   818: aload_0         /* this */
        //   819: getstatic       gg/essential/vigilance/gui/SettingsTitleBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   822: iconst_5       
        //   823: aaload         
        //   824: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   827: putfield        gg/essential/vigilance/gui/SettingsTitleBar.searchBar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   830: nop            
        //   831: aload_0         /* this */
        //   832: checkcast       Lgg/essential/elementa/UIComponent;
        //   835: astore          $this$constrain$iv
        //   837: iconst_0       
        //   838: istore          $i$f$constrain
        //   840: aload           $this$constrain$iv
        //   842: astore          6
        //   844: aload           6
        //   846: astore          $this$constrain_u24lambda_u2d0$iv
        //   848: iconst_0       
        //   849: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   851: aload           $this$constrain_u24lambda_u2d0$iv
        //   853: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   856: astore          $this$_init__u24lambda_u2d6
        //   858: iconst_0       
        //   859: istore          $i$a$-constrain-SettingsTitleBar$1
        //   861: aload           $this$_init__u24lambda_u2d6
        //   863: bipush          100
        //   865: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   868: checkcast       Ljava/lang/Number;
        //   871: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   874: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   877: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   880: aload           $this$_init__u24lambda_u2d6
        //   882: bipush          30
        //   884: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   887: checkcast       Ljava/lang/Number;
        //   890: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   893: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   896: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   899: nop            
        //   900: nop            
        //   901: nop            
        //   902: nop            
        //   903: aload_0         /* this */
        //   904: invokespecial   gg/essential/vigilance/gui/SettingsTitleBar.getSearchBar:()Lgg/essential/vigilance/gui/Searchbar;
        //   907: invokevirtual   gg/essential/vigilance/gui/Searchbar.getTextContent:()Lgg/essential/elementa/state/BasicState;
        //   910: new             Lgg/essential/vigilance/gui/SettingsTitleBar$2;
        //   913: dup            
        //   914: aload_0         /* this */
        //   915: invokespecial   gg/essential/vigilance/gui/SettingsTitleBar$2.<init>:(Lgg/essential/vigilance/gui/SettingsTitleBar;)V
        //   918: checkcast       Lkotlin/jvm/functions/Function1;
        //   921: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   924: pop            
        //   925: nop            
        //   926: return         
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  gui     
        //  config  
        //  window  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIBlock getLeftDivider() {
        return (UIBlock)this.leftDivider$delegate.getValue((Object)this, (KProperty)SettingsTitleBar.$$delegatedProperties[0]);
    }
    
    private final UIBlock getContentContainer() {
        return (UIBlock)this.contentContainer$delegate.getValue((Object)this, (KProperty)SettingsTitleBar.$$delegatedProperties[1]);
    }
    
    private final UIBlock getRightDivider() {
        return (UIBlock)this.rightDivider$delegate.getValue((Object)this, (KProperty)SettingsTitleBar.$$delegatedProperties[2]);
    }
    
    private final UIText getTitleText() {
        return (UIText)this.titleText$delegate.getValue((Object)this, (KProperty)SettingsTitleBar.$$delegatedProperties[3]);
    }
    
    private final UIBlock getMiddleDivider() {
        return (UIBlock)this.middleDivider$delegate.getValue((Object)this, (KProperty)SettingsTitleBar.$$delegatedProperties[4]);
    }
    
    private final Searchbar getSearchBar() {
        return (Searchbar)this.searchBar$delegate.getValue((Object)this, (KProperty)SettingsTitleBar.$$delegatedProperties[5]);
    }
    
    public static final /* synthetic */ SettingsGui access$getGui$p(final SettingsTitleBar $this) {
        return $this.gui;
    }
    
    public static final /* synthetic */ Vigilant access$getConfig$p(final SettingsTitleBar $this) {
        return $this.config;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsTitleBar.class, "leftDivider", "getLeftDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsTitleBar.class, "contentContainer", "getContentContainer()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsTitleBar.class, "rightDivider", "getRightDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsTitleBar.class, "titleText", "getTitleText()Lgg/essential/elementa/components/UIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsTitleBar.class, "middleDivider", "getMiddleDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsTitleBar.class, "searchBar", "getSearchBar()Lgg/essential/vigilance/gui/Searchbar;", 0)) };
    }
}
