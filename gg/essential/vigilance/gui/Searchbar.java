package gg.essential.vigilance.gui;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import gg.essential.vigilance.utils.*;
import kotlin.properties.*;
import gg.essential.elementa.*;
import gg.essential.vigilance.gui.common.shadow.*;
import gg.essential.vigilance.gui.common.input.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020)H\u0016J\u0006\u0010+\u001a\u00020)J\u0006\u0010,\u001a\u00020\u0003J\u000e\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/" }, d2 = { "Lgg/essential/vigilance/gui/Searchbar;", "Lgg/essential/elementa/components/UIContainer;", "placeholder", "", "initialValue", "activateOnSearchHokey", "", "activateOnType", "expandedWidth", "", "(Ljava/lang/String;Ljava/lang/String;ZZI)V", "collapsed", "Lgg/essential/elementa/state/BasicState;", "searchContainer", "Lgg/essential/elementa/components/UIBlock;", "getSearchContainer", "()Lgg/essential/elementa/components/UIBlock;", "searchContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "searchIcon", "Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;", "getSearchIcon", "()Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;", "searchIcon$delegate", "searchInput", "Lgg/essential/vigilance/gui/common/input/UITextInput;", "getSearchInput", "()Lgg/essential/vigilance/gui/common/input/UITextInput;", "searchInput$delegate", "textContent", "getTextContent", "()Lgg/essential/elementa/state/BasicState;", "toggleButton", "Lgg/essential/elementa/UIComponent;", "getToggleButton", "()Lgg/essential/elementa/UIComponent;", "toggleButton$delegate", "toggleIcon", "Lgg/essential/elementa/state/MappedState;", "Lgg/essential/vigilance/utils/ImageFactory;", "activateSearch", "", "afterInitialization", "deactivateSearch", "getText", "setText", "text", "Vigilance" })
public final class Searchbar extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private final boolean activateOnSearchHokey;
    private final boolean activateOnType;
    private final int expandedWidth;
    @NotNull
    private final BasicState<Boolean> collapsed;
    @NotNull
    private final BasicState<String> textContent;
    @NotNull
    private final MappedState<Boolean, ImageFactory> toggleIcon;
    @NotNull
    private final ReadWriteProperty toggleButton$delegate;
    @NotNull
    private final ReadWriteProperty searchContainer$delegate;
    @NotNull
    private final ReadWriteProperty searchIcon$delegate;
    @NotNull
    private final ReadWriteProperty searchInput$delegate;
    
    public Searchbar(@NotNull final String placeholder, @NotNull final String initialValue, final boolean activateOnSearchHokey, final boolean activateOnType, final int expandedWidth) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "placeholder"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* initialValue */
        //     7: ldc             "initialValue"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    16: aload_0         /* this */
        //    17: iload_3         /* activateOnSearchHokey */
        //    18: putfield        gg/essential/vigilance/gui/Searchbar.activateOnSearchHokey:Z
        //    21: aload_0         /* this */
        //    22: iload           activateOnType
        //    24: putfield        gg/essential/vigilance/gui/Searchbar.activateOnType:Z
        //    27: aload_0         /* this */
        //    28: iload           expandedWidth
        //    30: putfield        gg/essential/vigilance/gui/Searchbar.expandedWidth:I
        //    33: aload_0         /* this */
        //    34: new             Lgg/essential/elementa/state/BasicState;
        //    37: dup            
        //    38: iconst_1       
        //    39: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    42: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    45: putfield        gg/essential/vigilance/gui/Searchbar.collapsed:Lgg/essential/elementa/state/BasicState;
        //    48: aload_0         /* this */
        //    49: new             Lgg/essential/elementa/state/BasicState;
        //    52: dup            
        //    53: aload_2         /* initialValue */
        //    54: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    57: putfield        gg/essential/vigilance/gui/Searchbar.textContent:Lgg/essential/elementa/state/BasicState;
        //    60: aload_0         /* this */
        //    61: aload_0         /* this */
        //    62: getfield        gg/essential/vigilance/gui/Searchbar.collapsed:Lgg/essential/elementa/state/BasicState;
        //    65: getstatic       gg/essential/vigilance/gui/Searchbar$toggleIcon$1.INSTANCE:Lgg/essential/vigilance/gui/Searchbar$toggleIcon$1;
        //    68: checkcast       Lkotlin/jvm/functions/Function1;
        //    71: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    74: putfield        gg/essential/vigilance/gui/Searchbar.toggleIcon:Lgg/essential/elementa/state/MappedState;
        //    77: aload_0         /* this */
        //    78: new             Lgg/essential/vigilance/gui/common/IconButton;
        //    81: dup            
        //    82: aload_0         /* this */
        //    83: getfield        gg/essential/vigilance/gui/Searchbar.toggleIcon:Lgg/essential/elementa/state/MappedState;
        //    86: checkcast       Lgg/essential/elementa/state/State;
        //    89: ldc             ""
        //    91: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //    94: checkcast       Lgg/essential/elementa/state/State;
        //    97: iconst_1       
        //    98: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   101: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //   104: checkcast       Lgg/essential/elementa/state/State;
        //   107: ldc             ""
        //   109: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //   112: checkcast       Lgg/essential/elementa/state/State;
        //   115: iconst_1       
        //   116: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   119: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //   122: checkcast       Lgg/essential/elementa/state/State;
        //   125: iconst_1       
        //   126: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   129: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //   132: checkcast       Lgg/essential/elementa/state/State;
        //   135: invokespecial   gg/essential/vigilance/gui/common/IconButton.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V
        //   138: checkcast       Lgg/essential/elementa/UIComponent;
        //   141: astore          6
        //   143: nop            
        //   144: iconst_0       
        //   145: istore          $i$f$constrain
        //   147: aload           $this$constrain$iv
        //   149: astore          8
        //   151: aload           8
        //   153: astore          $this$constrain_u24lambda_u2d0$iv
        //   155: iconst_0       
        //   156: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   158: aload           $this$constrain_u24lambda_u2d0$iv
        //   160: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   163: astore          11
        //   165: astore          13
        //   167: iconst_0       
        //   168: istore          $i$a$-constrain-Searchbar$toggleButton$2
        //   170: aload           $this$toggleButton_delegate_u24lambda_u2d0
        //   172: iconst_0       
        //   173: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   176: checkcast       Ljava/lang/Number;
        //   179: iconst_1       
        //   180: iconst_0       
        //   181: iconst_2       
        //   182: aconst_null    
        //   183: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   186: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   189: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   192: aload           $this$toggleButton_delegate_u24lambda_u2d0
        //   194: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   197: dup            
        //   198: fconst_0       
        //   199: iconst_1       
        //   200: aconst_null    
        //   201: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   204: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   207: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   210: aload           $this$toggleButton_delegate_u24lambda_u2d0
        //   212: bipush          100
        //   214: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   217: checkcast       Ljava/lang/Number;
        //   220: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   223: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   226: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   229: nop            
        //   230: aload           13
        //   232: nop            
        //   233: aload           8
        //   235: nop            
        //   236: astore          null
        //   238: nop            
        //   239: iconst_0       
        //   240: istore          $i$f$onLeftClick
        //   242: aload           $this$onLeftClick$iv
        //   244: new             Lgg/essential/vigilance/gui/Searchbar$special$$inlined$onLeftClick$1;
        //   247: dup            
        //   248: aload_0         /* this */
        //   249: invokespecial   gg/essential/vigilance/gui/Searchbar$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/vigilance/gui/Searchbar;)V
        //   252: checkcast       Lkotlin/jvm/functions/Function2;
        //   255: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   258: nop            
        //   259: aload_0         /* this */
        //   260: checkcast       Lgg/essential/elementa/UIComponent;
        //   263: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   266: aload_0         /* this */
        //   267: getstatic       gg/essential/vigilance/gui/Searchbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   270: iconst_0       
        //   271: aaload         
        //   272: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   275: putfield        gg/essential/vigilance/gui/Searchbar.toggleButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //   278: aload_0         /* this */
        //   279: new             Lgg/essential/elementa/components/UIBlock;
        //   282: dup            
        //   283: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   286: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getButton$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   289: checkcast       Lgg/essential/elementa/state/State;
        //   292: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   295: checkcast       Lgg/essential/elementa/UIComponent;
        //   298: astore          $this$constrain$iv
        //   300: iconst_0       
        //   301: istore          $i$f$constrain
        //   303: aload           $this$constrain$iv
        //   305: astore          8
        //   307: aload           8
        //   309: astore          $this$constrain_u24lambda_u2d0$iv
        //   311: iconst_0       
        //   312: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   314: aload           $this$constrain_u24lambda_u2d0$iv
        //   316: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   319: astore          11
        //   321: astore          13
        //   323: iconst_0       
        //   324: istore          $i$a$-constrain-Searchbar$searchContainer$2
        //   326: aload           $this$searchContainer_delegate_u24lambda_u2d2
        //   328: aload_0         /* this */
        //   329: getfield        gg/essential/vigilance/gui/Searchbar.expandedWidth:I
        //   332: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   335: checkcast       Ljava/lang/Number;
        //   338: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   341: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   344: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   347: aload           $this$searchContainer_delegate_u24lambda_u2d2
        //   349: bipush          100
        //   351: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   354: checkcast       Ljava/lang/Number;
        //   357: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   360: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   363: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   366: nop            
        //   367: aload           13
        //   369: nop            
        //   370: aload           8
        //   372: nop            
        //   373: aload_0         /* this */
        //   374: checkcast       Lgg/essential/elementa/UIComponent;
        //   377: aload_0         /* this */
        //   378: getfield        gg/essential/vigilance/gui/Searchbar.collapsed:Lgg/essential/elementa/state/BasicState;
        //   381: checkcast       Lgg/essential/elementa/state/State;
        //   384: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   387: checkcast       Lgg/essential/elementa/state/State;
        //   390: iconst_0       
        //   391: aconst_null    
        //   392: bipush          12
        //   394: aconst_null    
        //   395: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.bindParent$default:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;ILjava/lang/Object;)Lgg/essential/elementa/UIComponent;
        //   398: aload_0         /* this */
        //   399: getstatic       gg/essential/vigilance/gui/Searchbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   402: iconst_1       
        //   403: aaload         
        //   404: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   407: putfield        gg/essential/vigilance/gui/Searchbar.searchContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   410: aload_0         /* this */
        //   411: new             Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;
        //   414: dup            
        //   415: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   418: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getSEARCH_7X$Vigilance:()Lgg/essential/vigilance/utils/ImageFactory;
        //   421: iconst_1       
        //   422: invokespecial   gg/essential/vigilance/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/vigilance/utils/ImageFactory;Z)V
        //   425: checkcast       Lgg/essential/elementa/UIComponent;
        //   428: astore          $this$constrain$iv
        //   430: iconst_0       
        //   431: istore          $i$f$constrain
        //   433: aload           $this$constrain$iv
        //   435: astore          8
        //   437: aload           8
        //   439: astore          $this$constrain_u24lambda_u2d0$iv
        //   441: iconst_0       
        //   442: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   444: aload           $this$constrain_u24lambda_u2d0$iv
        //   446: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   449: astore          11
        //   451: astore          13
        //   453: iconst_0       
        //   454: istore          $i$a$-constrain-Searchbar$searchIcon$2
        //   456: aload           $this$searchIcon_delegate_u24lambda_u2d3
        //   458: iconst_5       
        //   459: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   462: checkcast       Ljava/lang/Number;
        //   465: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   468: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   471: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   474: aload           $this$searchIcon_delegate_u24lambda_u2d3
        //   476: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   479: dup            
        //   480: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   483: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   486: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   489: nop            
        //   490: aload           13
        //   492: nop            
        //   493: aload           8
        //   495: nop            
        //   496: checkcast       Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;
        //   499: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   502: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextHighlight$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   505: checkcast       Lgg/essential/elementa/state/State;
        //   508: invokevirtual   gg/essential/vigilance/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;
        //   511: checkcast       Lgg/essential/elementa/UIComponent;
        //   514: aload_0         /* this */
        //   515: invokespecial   gg/essential/vigilance/gui/Searchbar.getSearchContainer:()Lgg/essential/elementa/components/UIBlock;
        //   518: checkcast       Lgg/essential/elementa/UIComponent;
        //   521: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   524: aload_0         /* this */
        //   525: getstatic       gg/essential/vigilance/gui/Searchbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   528: iconst_2       
        //   529: aaload         
        //   530: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   533: putfield        gg/essential/vigilance/gui/Searchbar.searchIcon$delegate:Lkotlin/properties/ReadWriteProperty;
        //   536: aload_0         /* this */
        //   537: new             Lgg/essential/vigilance/gui/common/input/UITextInput;
        //   540: dup            
        //   541: aload_1         /* placeholder */
        //   542: iconst_0       
        //   543: aconst_null    
        //   544: aconst_null    
        //   545: aconst_null    
        //   546: iconst_0       
        //   547: aconst_null    
        //   548: aconst_null    
        //   549: aconst_null    
        //   550: sipush          510
        //   553: aconst_null    
        //   554: invokespecial   gg/essential/vigilance/gui/common/input/UITextInput.<init>:(Ljava/lang/String;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   557: checkcast       Lgg/essential/elementa/UIComponent;
        //   560: astore          $this$constrain$iv
        //   562: iconst_0       
        //   563: istore          $i$f$constrain
        //   565: aload           $this$constrain$iv
        //   567: astore          8
        //   569: aload           8
        //   571: astore          $this$constrain_u24lambda_u2d0$iv
        //   573: iconst_0       
        //   574: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   576: aload           $this$constrain_u24lambda_u2d0$iv
        //   578: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   581: astore          11
        //   583: astore          13
        //   585: iconst_0       
        //   586: istore          $i$a$-constrain-Searchbar$searchInput$2
        //   588: aload           $this$searchInput_delegate_u24lambda_u2d4
        //   590: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   593: dup            
        //   594: ldc_w           5.0
        //   597: iconst_0       
        //   598: iconst_2       
        //   599: aconst_null    
        //   600: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   603: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   606: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   609: aload           $this$searchInput_delegate_u24lambda_u2d4
        //   611: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   614: dup            
        //   615: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   618: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   621: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   624: aload           $this$searchInput_delegate_u24lambda_u2d4
        //   626: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   629: dup            
        //   630: iconst_0       
        //   631: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //   634: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   637: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   640: aload           $this$searchInput_delegate_u24lambda_u2d4
        //   642: bipush          9
        //   644: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   647: checkcast       Ljava/lang/Number;
        //   650: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   653: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   656: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   659: nop            
        //   660: aload           13
        //   662: nop            
        //   663: aload           8
        //   665: nop            
        //   666: aload_0         /* this */
        //   667: invokespecial   gg/essential/vigilance/gui/Searchbar.getSearchContainer:()Lgg/essential/elementa/components/UIBlock;
        //   670: checkcast       Lgg/essential/elementa/UIComponent;
        //   673: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   676: aload_0         /* this */
        //   677: getstatic       gg/essential/vigilance/gui/Searchbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   680: iconst_3       
        //   681: aaload         
        //   682: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   685: putfield        gg/essential/vigilance/gui/Searchbar.searchInput$delegate:Lkotlin/properties/ReadWriteProperty;
        //   688: nop            
        //   689: aload_0         /* this */
        //   690: checkcast       Lgg/essential/elementa/UIComponent;
        //   693: astore          $this$constrain$iv
        //   695: iconst_0       
        //   696: istore          $i$f$constrain
        //   698: aload           $this$constrain$iv
        //   700: astore          8
        //   702: aload           8
        //   704: astore          $this$constrain_u24lambda_u2d0$iv
        //   706: iconst_0       
        //   707: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   709: aload           $this$constrain_u24lambda_u2d0$iv
        //   711: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   714: astore          $this$_init__u24lambda_u2d5
        //   716: iconst_0       
        //   717: istore          $i$a$-constrain-Searchbar$1
        //   719: aload           $this$_init__u24lambda_u2d5
        //   721: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   724: dup            
        //   725: fconst_0       
        //   726: iconst_1       
        //   727: aconst_null    
        //   728: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   731: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   734: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   737: aload           $this$_init__u24lambda_u2d5
        //   739: bipush          17
        //   741: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   744: checkcast       Ljava/lang/Number;
        //   747: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   750: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   753: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   756: nop            
        //   757: nop            
        //   758: nop            
        //   759: nop            
        //   760: aload_0         /* this */
        //   761: invokespecial   gg/essential/vigilance/gui/Searchbar.getSearchContainer:()Lgg/essential/elementa/components/UIBlock;
        //   764: checkcast       Lgg/essential/elementa/UIComponent;
        //   767: astore          $this$onLeftClick$iv
        //   769: iconst_0       
        //   770: istore          $i$f$onLeftClick
        //   772: aload           $this$onLeftClick$iv
        //   774: new             Lgg/essential/vigilance/gui/Searchbar$special$$inlined$onLeftClick$2;
        //   777: dup            
        //   778: aload_0         /* this */
        //   779: invokespecial   gg/essential/vigilance/gui/Searchbar$special$$inlined$onLeftClick$2.<init>:(Lgg/essential/vigilance/gui/Searchbar;)V
        //   782: checkcast       Lkotlin/jvm/functions/Function2;
        //   785: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   788: nop            
        //   789: pop            
        //   790: aload_0         /* this */
        //   791: invokespecial   gg/essential/vigilance/gui/Searchbar.getSearchInput:()Lgg/essential/vigilance/gui/common/input/UITextInput;
        //   794: new             Lgg/essential/vigilance/gui/Searchbar$3;
        //   797: dup            
        //   798: aload_0         /* this */
        //   799: invokespecial   gg/essential/vigilance/gui/Searchbar$3.<init>:(Lgg/essential/vigilance/gui/Searchbar;)V
        //   802: checkcast       Lkotlin/jvm/functions/Function1;
        //   805: invokevirtual   gg/essential/vigilance/gui/common/input/UITextInput.onUpdate:(Lkotlin/jvm/functions/Function1;)Lgg/essential/vigilance/gui/common/input/AbstractTextInput;
        //   808: pop            
        //   809: aload_0         /* this */
        //   810: getfield        gg/essential/vigilance/gui/Searchbar.textContent:Lgg/essential/elementa/state/BasicState;
        //   813: new             Lgg/essential/vigilance/gui/Searchbar$4;
        //   816: dup            
        //   817: aload_0         /* this */
        //   818: invokespecial   gg/essential/vigilance/gui/Searchbar$4.<init>:(Lgg/essential/vigilance/gui/Searchbar;)V
        //   821: checkcast       Lkotlin/jvm/functions/Function1;
        //   824: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   827: pop            
        //   828: nop            
        //   829: return         
        //    MethodParameters:
        //  Name                   Flags  
        //  ---------------------  -----
        //  placeholder            
        //  initialValue           
        //  activateOnSearchHokey  
        //  activateOnType         
        //  expandedWidth          
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Searchbar(String placeholder, String initialValue, boolean activateOnSearchHokey, boolean activateOnType, int expandedWidth, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            placeholder = "Search...";
        }
        if ((n & 0x2) != 0x0) {
            initialValue = "";
        }
        if ((n & 0x4) != 0x0) {
            activateOnSearchHokey = true;
        }
        if ((n & 0x8) != 0x0) {
            activateOnType = true;
        }
        if ((n & 0x10) != 0x0) {
            expandedWidth = 104;
        }
        this(placeholder, initialValue, activateOnSearchHokey, activateOnType, expandedWidth);
    }
    
    @NotNull
    public final BasicState<String> getTextContent() {
        return this.textContent;
    }
    
    private final UIComponent getToggleButton() {
        return (UIComponent)this.toggleButton$delegate.getValue((Object)this, (KProperty)Searchbar.$$delegatedProperties[0]);
    }
    
    private final UIBlock getSearchContainer() {
        return (UIBlock)this.searchContainer$delegate.getValue((Object)this, (KProperty)Searchbar.$$delegatedProperties[1]);
    }
    
    private final ShadowIcon getSearchIcon() {
        return (ShadowIcon)this.searchIcon$delegate.getValue((Object)this, (KProperty)Searchbar.$$delegatedProperties[2]);
    }
    
    private final UITextInput getSearchInput() {
        return (UITextInput)this.searchInput$delegate.getValue((Object)this, (KProperty)Searchbar.$$delegatedProperties[3]);
    }
    
    @Override
    public void afterInitialization() {
        super.afterInitialization();
        Window.Companion.of(this).onKeyType((Function3<? super UIComponent, ? super Character, ? super Integer, Unit>)new Searchbar$afterInitialization.Searchbar$afterInitialization$1(this));
    }
    
    public final void setText(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this.getSearchInput().setText(text);
        this.textContent.set(text);
    }
    
    @NotNull
    public final String getText() {
        return this.textContent.get();
    }
    
    public final void activateSearch() {
        this.getSearchInput().grabWindowFocus();
        this.getSearchInput().focus();
    }
    
    public final void deactivateSearch() {
        this.getSearchInput().releaseWindowFocus();
    }
    
    public Searchbar() {
        this(null, null, false, false, 0, 31, null);
    }
    
    public static final /* synthetic */ boolean access$getActivateOnSearchHokey$p(final Searchbar $this) {
        return $this.activateOnSearchHokey;
    }
    
    public static final /* synthetic */ BasicState access$getCollapsed$p(final Searchbar $this) {
        return $this.collapsed;
    }
    
    public static final /* synthetic */ boolean access$getActivateOnType$p(final Searchbar $this) {
        return $this.activateOnType;
    }
    
    public static final /* synthetic */ UITextInput access$getSearchInput(final Searchbar $this) {
        return $this.getSearchInput();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Searchbar.class, "toggleButton", "getToggleButton()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Searchbar.class, "searchContainer", "getSearchContainer()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Searchbar.class, "searchIcon", "getSearchIcon()Lgg/essential/vigilance/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Searchbar.class, "searchInput", "getSearchInput()Lgg/essential/vigilance/gui/common/input/UITextInput;", 0)) };
    }
}
