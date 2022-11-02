package gg.essential.gui.menu.full;

import gg.essential.gui.menu.*;
import kotlin.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import gg.essential.handlers.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.common.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
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
                                                   \u0002\b\u0013
                                                   \u0002\u0018\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020	0\b\u0012\f\u0010
                                                   \u001a\b\u0012\u0004\u0012\u00020	0\b¢\u0006\u0002\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020	0\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020	0\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020	0\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0018\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0019\u0010\u000fR\u001b\u0010\u001b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f²\u0006
                                                   \u0010 \u001a\u00020!X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/menu/full/FullRightSideBar;", "Lgg/essential/gui/menu/RightSideBar;", "menuType", "Lgg/essential/handlers/PauseMenuDisplay$MenuType;", "topButton", "Lgg/essential/elementa/components/UIContainer;", "bottomButton", "isCollapsed", "Lgg/essential/elementa/state/State;", "", "menuVisible", "(Lgg/essential/handlers/PauseMenuDisplay$MenuType;Lgg/essential/elementa/components/UIContainer;Lgg/essential/elementa/components/UIContainer;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "cosmeticVisibilityToggleButton", "Lgg/essential/gui/common/MenuButton;", "getCosmeticVisibilityToggleButton", "()Lgg/essential/gui/common/MenuButton;", "cosmeticVisibilityToggleButton$delegate", "Lkotlin/properties/ReadWriteProperty;", "fullscreenToggleButton", "getFullscreenToggleButton", "fullscreenToggleButton$delegate", "isFullScreen", "isOwnCosmeticsVisible", "isSilentMode", "silentModeToggleButton", "getSilentModeToggleButton", "silentModeToggleButton$delegate", "toolbar", "getToolbar", "()Lgg/essential/elementa/components/UIContainer;", "toolbar$delegate", "essential", "diamond", "Lgg/essential/gui/menu/DiamondComponent;" })
public final class FullRightSideBar extends RightSideBar
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty toolbar$delegate;
    @NotNull
    private final State<Boolean> isFullScreen;
    @NotNull
    private final ReadWriteProperty fullscreenToggleButton$delegate;
    @NotNull
    private final State<Boolean> isSilentMode;
    @NotNull
    private final ReadWriteProperty silentModeToggleButton$delegate;
    @NotNull
    private final State<Boolean> isOwnCosmeticsVisible;
    
    public FullRightSideBar(@NotNull final PauseMenuDisplay.MenuType menuType, @NotNull final UIContainer topButton, @NotNull final UIContainer bottomButton, @NotNull final State<Boolean> isCollapsed, @NotNull final State<Boolean> menuVisible) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "menuType"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* topButton */
        //     7: ldc             "topButton"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* bottomButton */
        //    13: ldc             "bottomButton"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           isCollapsed
        //    20: ldc             "isCollapsed"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload           menuVisible
        //    27: ldc             "menuVisible"
        //    29: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    32: aload_0         /* this */
        //    33: aload_1         /* menuType */
        //    34: aload           menuVisible
        //    36: invokespecial   gg/essential/gui/menu/RightSideBar.<init>:(Lgg/essential/handlers/PauseMenuDisplay$MenuType;Lgg/essential/elementa/state/State;)V
        //    39: aload_0         /* this */
        //    40: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getCollapsed:()Lgg/essential/elementa/state/MappedState;
        //    43: aload           isCollapsed
        //    45: invokevirtual   gg/essential/elementa/state/MappedState.rebind:(Lgg/essential/elementa/state/State;)V
        //    48: aload_0         /* this */
        //    49: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getEssentialButton:()Lgg/essential/gui/common/MenuButton;
        //    52: checkcast       Lgg/essential/elementa/UIComponent;
        //    55: astore          $this$constrain$iv
        //    57: aload           $this$constrain$iv
        //    59: astore          8
        //    61: aload           8
        //    63: astore          $this$constrain_u24lambda_u2d0$iv
        //    65: aload           $this$constrain_u24lambda_u2d0$iv
        //    67: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    70: astore          $this$_init__u24lambda_u2d0
        //    72: aload           $this$_init__u24lambda_u2d0
        //    74: iconst_0       
        //    75: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    78: checkcast       Ljava/lang/Number;
        //    81: iconst_1       
        //    82: iconst_0       
        //    83: iconst_2       
        //    84: aconst_null    
        //    85: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    88: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //    91: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //    94: aload           8
        //    96: checkcast       Lgg/essential/gui/common/MenuButton;
        //    99: aload_0         /* this */
        //   100: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getEssentialTooltip:()Lgg/essential/elementa/state/BasicState;
        //   103: checkcast       Lgg/essential/elementa/state/State;
        //   106: iconst_0       
        //   107: aconst_null    
        //   108: getstatic       gg/essential/gui/common/MenuButton$Alignment.RIGHT:Lgg/essential/gui/common/MenuButton$Alignment;
        //   111: iconst_0       
        //   112: iconst_0       
        //   113: fconst_0       
        //   114: fconst_0       
        //   115: iconst_0       
        //   116: sipush          502
        //   119: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //   122: checkcast       Lgg/essential/elementa/UIComponent;
        //   125: aload_0         /* this */
        //   126: checkcast       Lgg/essential/elementa/UIComponent;
        //   129: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   132: pop            
        //   133: new             Lgg/essential/gui/menu/DiamondComponent;
        //   136: dup            
        //   137: invokespecial   gg/essential/gui/menu/DiamondComponent.<init>:()V
        //   140: checkcast       Lgg/essential/elementa/UIComponent;
        //   143: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   146: astore          $this$constrain$iv
        //   148: aload           $this$constrain$iv
        //   150: astore          9
        //   152: aload           9
        //   154: astore          $this$constrain_u24lambda_u2d0$iv
        //   156: aload           $this$constrain_u24lambda_u2d0$iv
        //   158: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   161: astore          $this$_init__u24lambda_u2d1
        //   163: aload           $this$_init__u24lambda_u2d1
        //   165: bipush          7
        //   167: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   170: checkcast       Ljava/lang/Number;
        //   173: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   176: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   179: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   182: aload           $this$_init__u24lambda_u2d1
        //   184: getstatic       gg/essential/gui/EssentialPalette.MAIN_MENU_BLUE:Ljava/awt/Color;
        //   187: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   190: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   193: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   196: aload           9
        //   198: aload_0         /* this */
        //   199: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getEssentialButton:()Lgg/essential/gui/common/MenuButton;
        //   202: checkcast       Lgg/essential/elementa/UIComponent;
        //   205: aload           isCollapsed
        //   207: new             Lgg/essential/elementa/state/BasicState;
        //   210: dup            
        //   211: iconst_1       
        //   212: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   215: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   218: checkcast       Lgg/essential/elementa/state/State;
        //   221: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   224: checkcast       Lgg/essential/elementa/state/State;
        //   227: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   230: checkcast       Lgg/essential/elementa/state/State;
        //   233: iconst_0       
        //   234: aconst_null    
        //   235: bipush          12
        //   237: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   240: aconst_null    
        //   241: getstatic       gg/essential/gui/menu/full/FullRightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   244: iconst_0       
        //   245: aaload         
        //   246: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   249: pop            
        //   250: aload_0         /* this */
        //   251: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getInviteButton:()Lgg/essential/gui/common/MenuButton;
        //   254: checkcast       Lgg/essential/elementa/UIComponent;
        //   257: astore          $this$constrain$iv
        //   259: aload           $this$constrain$iv
        //   261: astore          9
        //   263: aload           9
        //   265: astore          $this$constrain_u24lambda_u2d0$iv
        //   267: aload           $this$constrain_u24lambda_u2d0$iv
        //   269: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   272: astore          $this$_init__u24lambda_u2d3
        //   274: aload           $this$_init__u24lambda_u2d3
        //   276: iconst_0       
        //   277: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   280: checkcast       Ljava/lang/Number;
        //   283: iconst_1       
        //   284: iconst_0       
        //   285: iconst_2       
        //   286: aconst_null    
        //   287: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   290: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   293: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   296: aload           $this$_init__u24lambda_u2d3
        //   298: iconst_0       
        //   299: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   302: checkcast       Ljava/lang/Number;
        //   305: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   308: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   311: aload_2         /* topButton */
        //   312: checkcast       Lgg/essential/elementa/UIComponent;
        //   315: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   318: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   321: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   324: aload           9
        //   326: checkcast       Lgg/essential/gui/common/MenuButton;
        //   329: aload_0         /* this */
        //   330: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getInviteTooltip:()Lgg/essential/elementa/state/MappedState;
        //   333: checkcast       Lgg/essential/elementa/state/State;
        //   336: iconst_0       
        //   337: aconst_null    
        //   338: getstatic       gg/essential/gui/common/MenuButton$Alignment.RIGHT:Lgg/essential/gui/common/MenuButton$Alignment;
        //   341: iconst_0       
        //   342: iconst_0       
        //   343: fconst_0       
        //   344: fconst_0       
        //   345: iconst_0       
        //   346: sipush          502
        //   349: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //   352: checkcast       Lgg/essential/elementa/UIComponent;
        //   355: aload_0         /* this */
        //   356: checkcast       Lgg/essential/elementa/UIComponent;
        //   359: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   362: pop            
        //   363: aload_0         /* this */
        //   364: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getWorldSettings:()Lgg/essential/gui/common/MenuButton;
        //   367: checkcast       Lgg/essential/elementa/UIComponent;
        //   370: astore          $this$constrain$iv
        //   372: aload           $this$constrain$iv
        //   374: astore          9
        //   376: aload           9
        //   378: astore          $this$constrain_u24lambda_u2d0$iv
        //   380: aload           $this$constrain_u24lambda_u2d0$iv
        //   382: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   385: astore          $this$_init__u24lambda_u2d4
        //   387: aload           $this$_init__u24lambda_u2d4
        //   389: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   392: dup            
        //   393: ldc_w           4.0
        //   396: iconst_1       
        //   397: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   400: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   403: aload_0         /* this */
        //   404: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getInviteButton:()Lgg/essential/gui/common/MenuButton;
        //   407: checkcast       Lgg/essential/elementa/UIComponent;
        //   410: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   413: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   416: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   419: aload           $this$_init__u24lambda_u2d4
        //   421: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   424: dup            
        //   425: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   428: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   431: aload_0         /* this */
        //   432: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getInviteButton:()Lgg/essential/gui/common/MenuButton;
        //   435: checkcast       Lgg/essential/elementa/UIComponent;
        //   438: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   441: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   444: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   447: aload           9
        //   449: checkcast       Lgg/essential/gui/common/MenuButton;
        //   452: aload_0         /* this */
        //   453: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getWorldSettingsTooltip:()Lgg/essential/elementa/state/BasicState;
        //   456: checkcast       Lgg/essential/elementa/state/State;
        //   459: iconst_0       
        //   460: aconst_null    
        //   461: aconst_null    
        //   462: iconst_0       
        //   463: iconst_0       
        //   464: fconst_0       
        //   465: fconst_0       
        //   466: iconst_0       
        //   467: sipush          510
        //   470: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //   473: checkcast       Lgg/essential/elementa/UIComponent;
        //   476: aload_0         /* this */
        //   477: checkcast       Lgg/essential/elementa/UIComponent;
        //   480: aload_0         /* this */
        //   481: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getWorldSettingsVisible:()Lgg/essential/elementa/state/State;
        //   484: iconst_0       
        //   485: aconst_null    
        //   486: bipush          12
        //   488: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   491: pop            
        //   492: aload_0         /* this */
        //   493: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getSocial:()Lgg/essential/gui/common/MenuButton;
        //   496: checkcast       Lgg/essential/elementa/UIComponent;
        //   499: astore          $this$constrain$iv
        //   501: aload           $this$constrain$iv
        //   503: astore          9
        //   505: aload           9
        //   507: astore          $this$constrain_u24lambda_u2d0$iv
        //   509: aload           $this$constrain_u24lambda_u2d0$iv
        //   511: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   514: astore          $this$_init__u24lambda_u2d5
        //   516: aload           $this$_init__u24lambda_u2d5
        //   518: iconst_0       
        //   519: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   522: checkcast       Ljava/lang/Number;
        //   525: iconst_1       
        //   526: iconst_0       
        //   527: iconst_2       
        //   528: aconst_null    
        //   529: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   532: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   535: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   538: aload           $this$_init__u24lambda_u2d5
        //   540: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   543: dup            
        //   544: ldc_w           4.0
        //   547: iconst_0       
        //   548: iconst_2       
        //   549: aconst_null    
        //   550: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   553: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   556: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   559: aload           9
        //   561: checkcast       Lgg/essential/gui/common/MenuButton;
        //   564: aload_0         /* this */
        //   565: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getSocialTooltip:()Lgg/essential/elementa/state/MappedState;
        //   568: checkcast       Lgg/essential/elementa/state/State;
        //   571: iconst_0       
        //   572: aconst_null    
        //   573: getstatic       gg/essential/gui/common/MenuButton$Alignment.RIGHT:Lgg/essential/gui/common/MenuButton$Alignment;
        //   576: iconst_0       
        //   577: iconst_0       
        //   578: fconst_0       
        //   579: fconst_0       
        //   580: iconst_0       
        //   581: sipush          502
        //   584: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //   587: checkcast       Lgg/essential/elementa/UIComponent;
        //   590: aload_0         /* this */
        //   591: checkcast       Lgg/essential/elementa/UIComponent;
        //   594: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   597: pop            
        //   598: aload_0         /* this */
        //   599: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getPictures:()Lgg/essential/gui/common/MenuButton;
        //   602: checkcast       Lgg/essential/elementa/UIComponent;
        //   605: astore          $this$constrain$iv
        //   607: aload           $this$constrain$iv
        //   609: astore          9
        //   611: aload           9
        //   613: astore          $this$constrain_u24lambda_u2d0$iv
        //   615: aload           $this$constrain_u24lambda_u2d0$iv
        //   617: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   620: astore          $this$_init__u24lambda_u2d6
        //   622: aload           $this$_init__u24lambda_u2d6
        //   624: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   627: dup            
        //   628: ldc_w           4.0
        //   631: iconst_0       
        //   632: iconst_2       
        //   633: aconst_null    
        //   634: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   637: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   640: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   643: aload           9
        //   645: aload           isCollapsed
        //   647: getstatic       gg/essential/gui/menu/full/FullRightSideBar$6.INSTANCE:Lgg/essential/gui/menu/full/FullRightSideBar$6;
        //   650: checkcast       Lkotlin/jvm/functions/Function2;
        //   653: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   656: checkcast       Lgg/essential/gui/common/MenuButton;
        //   659: aload_0         /* this */
        //   660: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getPicturesTooltip:()Lgg/essential/elementa/state/MappedState;
        //   663: checkcast       Lgg/essential/elementa/state/State;
        //   666: iconst_0       
        //   667: aconst_null    
        //   668: aconst_null    
        //   669: iconst_0       
        //   670: iconst_0       
        //   671: fconst_0       
        //   672: fconst_0       
        //   673: iconst_0       
        //   674: sipush          510
        //   677: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //   680: checkcast       Lgg/essential/elementa/UIComponent;
        //   683: aload_0         /* this */
        //   684: checkcast       Lgg/essential/elementa/UIComponent;
        //   687: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   690: pop            
        //   691: aload_0         /* this */
        //   692: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getSettings:()Lgg/essential/gui/common/MenuButton;
        //   695: checkcast       Lgg/essential/elementa/UIComponent;
        //   698: astore          $this$constrain$iv
        //   700: aload           $this$constrain$iv
        //   702: astore          9
        //   704: aload           9
        //   706: astore          $this$constrain_u24lambda_u2d0$iv
        //   708: aload           $this$constrain_u24lambda_u2d0$iv
        //   710: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   713: astore          $this$_init__u24lambda_u2d7
        //   715: aload           $this$_init__u24lambda_u2d7
        //   717: iconst_0       
        //   718: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   721: checkcast       Ljava/lang/Number;
        //   724: iconst_1       
        //   725: iconst_0       
        //   726: iconst_2       
        //   727: aconst_null    
        //   728: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   731: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   734: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   737: aload           9
        //   739: aload           isCollapsed
        //   741: new             Lgg/essential/gui/menu/full/FullRightSideBar$8;
        //   744: dup            
        //   745: aload_0         /* this */
        //   746: aload_3         /* bottomButton */
        //   747: invokespecial   gg/essential/gui/menu/full/FullRightSideBar$8.<init>:(Lgg/essential/gui/menu/full/FullRightSideBar;Lgg/essential/elementa/components/UIContainer;)V
        //   750: checkcast       Lkotlin/jvm/functions/Function2;
        //   753: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   756: checkcast       Lgg/essential/gui/common/MenuButton;
        //   759: aload_0         /* this */
        //   760: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getSettingsTooltip:()Lgg/essential/elementa/state/MappedState;
        //   763: checkcast       Lgg/essential/elementa/state/State;
        //   766: iconst_0       
        //   767: aconst_null    
        //   768: getstatic       gg/essential/gui/common/MenuButton$Alignment.RIGHT:Lgg/essential/gui/common/MenuButton$Alignment;
        //   771: iconst_0       
        //   772: iconst_0       
        //   773: fconst_0       
        //   774: fconst_0       
        //   775: iconst_0       
        //   776: sipush          502
        //   779: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //   782: checkcast       Lgg/essential/elementa/UIComponent;
        //   785: aload_0         /* this */
        //   786: checkcast       Lgg/essential/elementa/UIComponent;
        //   789: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   792: pop            
        //   793: aload_0         /* this */
        //   794: new             Lgg/essential/elementa/components/UIContainer;
        //   797: dup            
        //   798: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   801: checkcast       Lgg/essential/elementa/UIComponent;
        //   804: astore          $this$constrain$iv
        //   806: aload           $this$constrain$iv
        //   808: astore          8
        //   810: aload           8
        //   812: astore          $this$constrain_u24lambda_u2d0$iv
        //   814: aload           $this$constrain_u24lambda_u2d0$iv
        //   816: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   819: astore          11
        //   821: astore          13
        //   823: aload           $this$toolbar_delegate_u24lambda_u2d8
        //   825: iconst_0       
        //   826: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   829: checkcast       Ljava/lang/Number;
        //   832: iconst_1       
        //   833: iconst_0       
        //   834: iconst_2       
        //   835: aconst_null    
        //   836: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   839: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   842: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   845: aload           $this$toolbar_delegate_u24lambda_u2d8
        //   847: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   850: dup            
        //   851: fconst_0       
        //   852: iconst_1       
        //   853: aconst_null    
        //   854: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   857: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   860: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   863: aload           $this$toolbar_delegate_u24lambda_u2d8
        //   865: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   868: dup            
        //   869: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   872: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   875: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   878: aload           13
        //   880: aload           8
        //   882: aload           isCollapsed
        //   884: new             Lgg/essential/gui/menu/full/FullRightSideBar$toolbar$3;
        //   887: dup            
        //   888: aload_3         /* bottomButton */
        //   889: invokespecial   gg/essential/gui/menu/full/FullRightSideBar$toolbar$3.<init>:(Lgg/essential/elementa/components/UIContainer;)V
        //   892: checkcast       Lkotlin/jvm/functions/Function2;
        //   895: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   898: astore          6
        //   900: aload           6
        //   902: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   905: astore          7
        //   907: astore          13
        //   909: getstatic       gg/essential/config/EssentialConfig.INSTANCE:Lgg/essential/config/EssentialConfig;
        //   912: invokevirtual   gg/essential/config/EssentialConfig.getShowQuickActionBar:()Z
        //   915: ifeq            931
        //   918: aload           component
        //   920: checkcast       Lgg/essential/elementa/UIComponent;
        //   923: aload_0         /* this */
        //   924: checkcast       Lgg/essential/elementa/UIComponent;
        //   927: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   930: pop            
        //   931: aload           13
        //   933: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   936: pop            
        //   937: aload           6
        //   939: aload_0         /* this */
        //   940: getstatic       gg/essential/gui/menu/full/FullRightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   943: iconst_1       
        //   944: aaload         
        //   945: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   948: putfield        gg/essential/gui/menu/full/FullRightSideBar.toolbar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   951: aload_0         /* this */
        //   952: aload_0         /* this */
        //   953: checkcast       Lgg/essential/elementa/UIComponent;
        //   956: getstatic       gg/essential/gui/menu/full/FullRightSideBar$isFullScreen$1.INSTANCE:Lgg/essential/gui/menu/full/FullRightSideBar$isFullScreen$1;
        //   959: checkcast       Lkotlin/jvm/functions/Function0;
        //   962: invokestatic    gg/essential/util/ExtensionsKt.pollingState$default$a9b5a09$5bde5825:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //   965: putfield        gg/essential/gui/menu/full/FullRightSideBar.isFullScreen:Lgg/essential/elementa/state/State;
        //   968: aload_0         /* this */
        //   969: new             Lgg/essential/gui/common/MenuButton;
        //   972: dup            
        //   973: aconst_null    
        //   974: aconst_null    
        //   975: aconst_null    
        //   976: aconst_null    
        //   977: aconst_null    
        //   978: aconst_null    
        //   979: iconst_0       
        //   980: iconst_0       
        //   981: getstatic       gg/essential/gui/menu/full/FullRightSideBar$fullscreenToggleButton$2.INSTANCE:Lgg/essential/gui/menu/full/FullRightSideBar$fullscreenToggleButton$2;
        //   984: checkcast       Lkotlin/jvm/functions/Function0;
        //   987: sipush          511
        //   990: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;Lgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //   993: checkcast       Lgg/essential/elementa/UIComponent;
        //   996: astore          $this$constrain$iv
        //   998: aload           $this$constrain$iv
        //  1000: astore          8
        //  1002: aload           8
        //  1004: astore          $this$constrain_u24lambda_u2d0$iv
        //  1006: aload           $this$constrain_u24lambda_u2d0$iv
        //  1008: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1011: astore          11
        //  1013: astore          13
        //  1015: aload           $this$fullscreenToggleButton_delegate_u24lambda_u2d10
        //  1017: iconst_0       
        //  1018: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1021: checkcast       Ljava/lang/Number;
        //  1024: iconst_1       
        //  1025: iconst_0       
        //  1026: iconst_2       
        //  1027: aconst_null    
        //  1028: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1031: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1034: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1037: aload           $this$fullscreenToggleButton_delegate_u24lambda_u2d10
        //  1039: bipush          20
        //  1041: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1044: checkcast       Ljava/lang/Number;
        //  1047: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1050: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1053: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1056: aload           $this$fullscreenToggleButton_delegate_u24lambda_u2d10
        //  1058: bipush          20
        //  1060: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1063: checkcast       Ljava/lang/Number;
        //  1066: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1069: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1072: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1075: aload           13
        //  1077: aload           8
        //  1079: checkcast       Lgg/essential/gui/common/MenuButton;
        //  1082: aload_0         /* this */
        //  1083: getfield        gg/essential/gui/menu/full/FullRightSideBar.isFullScreen:Lgg/essential/elementa/state/State;
        //  1086: getstatic       gg/essential/gui/menu/full/FullRightSideBar$fullscreenToggleButton$4.INSTANCE:Lgg/essential/gui/menu/full/FullRightSideBar$fullscreenToggleButton$4;
        //  1089: checkcast       Lkotlin/jvm/functions/Function1;
        //  1092: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1095: checkcast       Lgg/essential/elementa/state/State;
        //  1098: iconst_0       
        //  1099: aconst_null    
        //  1100: aconst_null    
        //  1101: aconst_null    
        //  1102: fconst_0       
        //  1103: fconst_0       
        //  1104: aconst_null    
        //  1105: sipush          254
        //  1108: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //  1111: aload_0         /* this */
        //  1112: getfield        gg/essential/gui/menu/full/FullRightSideBar.isFullScreen:Lgg/essential/elementa/state/State;
        //  1115: getstatic       gg/essential/gui/menu/full/FullRightSideBar$fullscreenToggleButton$5.INSTANCE:Lgg/essential/gui/menu/full/FullRightSideBar$fullscreenToggleButton$5;
        //  1118: checkcast       Lkotlin/jvm/functions/Function1;
        //  1121: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1124: checkcast       Lgg/essential/elementa/state/State;
        //  1127: iconst_0       
        //  1128: aconst_null    
        //  1129: getstatic       gg/essential/gui/common/MenuButton$Alignment.RIGHT:Lgg/essential/gui/common/MenuButton$Alignment;
        //  1132: iconst_0       
        //  1133: iconst_0       
        //  1134: fconst_0       
        //  1135: fconst_0       
        //  1136: iconst_0       
        //  1137: sipush          502
        //  1140: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //  1143: checkcast       Lgg/essential/elementa/UIComponent;
        //  1146: aload_0         /* this */
        //  1147: invokespecial   gg/essential/gui/menu/full/FullRightSideBar.getToolbar:()Lgg/essential/elementa/components/UIContainer;
        //  1150: checkcast       Lgg/essential/elementa/UIComponent;
        //  1153: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1156: aload_0         /* this */
        //  1157: getstatic       gg/essential/gui/menu/full/FullRightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1160: iconst_2       
        //  1161: aaload         
        //  1162: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1165: putfield        gg/essential/gui/menu/full/FullRightSideBar.fullscreenToggleButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1168: aload_0         /* this */
        //  1169: aload_0         /* this */
        //  1170: checkcast       Lgg/essential/elementa/UIComponent;
        //  1173: getstatic       gg/essential/gui/menu/full/FullRightSideBar$isSilentMode$1.INSTANCE:Lgg/essential/gui/menu/full/FullRightSideBar$isSilentMode$1;
        //  1176: checkcast       Lkotlin/jvm/functions/Function0;
        //  1179: invokestatic    gg/essential/util/ExtensionsKt.pollingState$default$a9b5a09$5bde5825:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //  1182: putfield        gg/essential/gui/menu/full/FullRightSideBar.isSilentMode:Lgg/essential/elementa/state/State;
        //  1185: aload_0         /* this */
        //  1186: new             Lgg/essential/gui/common/MenuButton;
        //  1189: dup            
        //  1190: aconst_null    
        //  1191: aconst_null    
        //  1192: aconst_null    
        //  1193: aconst_null    
        //  1194: aconst_null    
        //  1195: aconst_null    
        //  1196: iconst_0       
        //  1197: iconst_0       
        //  1198: getstatic       gg/essential/gui/menu/full/FullRightSideBar$silentModeToggleButton$2.INSTANCE:Lgg/essential/gui/menu/full/FullRightSideBar$silentModeToggleButton$2;
        //  1201: checkcast       Lkotlin/jvm/functions/Function0;
        //  1204: sipush          511
        //  1207: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;Lgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //  1210: checkcast       Lgg/essential/elementa/UIComponent;
        //  1213: astore          $this$constrain$iv
        //  1215: aload           $this$constrain$iv
        //  1217: astore          8
        //  1219: aload           8
        //  1221: astore          $this$constrain_u24lambda_u2d0$iv
        //  1223: aload           $this$constrain_u24lambda_u2d0$iv
        //  1225: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1228: astore          11
        //  1230: astore          13
        //  1232: aload           $this$silentModeToggleButton_delegate_u24lambda_u2d11
        //  1234: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1237: dup            
        //  1238: ldc_w           4.0
        //  1241: iconst_1       
        //  1242: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //  1245: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1248: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1251: aload           $this$silentModeToggleButton_delegate_u24lambda_u2d11
        //  1253: bipush          20
        //  1255: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1258: checkcast       Ljava/lang/Number;
        //  1261: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1264: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1267: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1270: aload           $this$silentModeToggleButton_delegate_u24lambda_u2d11
        //  1272: bipush          20
        //  1274: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1277: checkcast       Ljava/lang/Number;
        //  1280: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1283: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1286: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1289: aload           13
        //  1291: aload           8
        //  1293: checkcast       Lgg/essential/gui/common/MenuButton;
        //  1296: aload_0         /* this */
        //  1297: getfield        gg/essential/gui/menu/full/FullRightSideBar.isSilentMode:Lgg/essential/elementa/state/State;
        //  1300: getstatic       gg/essential/gui/menu/full/FullRightSideBar$silentModeToggleButton$4.INSTANCE:Lgg/essential/gui/menu/full/FullRightSideBar$silentModeToggleButton$4;
        //  1303: checkcast       Lkotlin/jvm/functions/Function1;
        //  1306: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1309: checkcast       Lgg/essential/elementa/state/State;
        //  1312: iconst_0       
        //  1313: aconst_null    
        //  1314: aconst_null    
        //  1315: aconst_null    
        //  1316: fconst_0       
        //  1317: fconst_0       
        //  1318: aconst_null    
        //  1319: sipush          254
        //  1322: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //  1325: checkcast       Lgg/essential/elementa/UIComponent;
        //  1328: aload_0         /* this */
        //  1329: invokespecial   gg/essential/gui/menu/full/FullRightSideBar.getToolbar:()Lgg/essential/elementa/components/UIContainer;
        //  1332: checkcast       Lgg/essential/elementa/UIComponent;
        //  1335: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1338: aload_0         /* this */
        //  1339: getstatic       gg/essential/gui/menu/full/FullRightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1342: iconst_3       
        //  1343: aaload         
        //  1344: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1347: putfield        gg/essential/gui/menu/full/FullRightSideBar.silentModeToggleButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1350: aload_0         /* this */
        //  1351: aload_0         /* this */
        //  1352: checkcast       Lgg/essential/elementa/UIComponent;
        //  1355: new             Lgg/essential/gui/menu/full/FullRightSideBar$isOwnCosmeticsVisible$1;
        //  1358: dup            
        //  1359: aload_0         /* this */
        //  1360: invokespecial   gg/essential/gui/menu/full/FullRightSideBar$isOwnCosmeticsVisible$1.<init>:(Lgg/essential/gui/menu/full/FullRightSideBar;)V
        //  1363: checkcast       Lkotlin/jvm/functions/Function0;
        //  1366: invokestatic    gg/essential/util/ExtensionsKt.pollingState$default$a9b5a09$5bde5825:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //  1369: putfield        gg/essential/gui/menu/full/FullRightSideBar.isOwnCosmeticsVisible:Lgg/essential/elementa/state/State;
        //  1372: new             Lgg/essential/gui/common/MenuButton;
        //  1375: dup            
        //  1376: aconst_null    
        //  1377: aconst_null    
        //  1378: aconst_null    
        //  1379: aconst_null    
        //  1380: aconst_null    
        //  1381: aconst_null    
        //  1382: iconst_0       
        //  1383: iconst_0       
        //  1384: new             Lgg/essential/gui/menu/full/FullRightSideBar$cosmeticVisibilityToggleButton$2;
        //  1387: dup            
        //  1388: aload_0         /* this */
        //  1389: invokespecial   gg/essential/gui/menu/full/FullRightSideBar$cosmeticVisibilityToggleButton$2.<init>:(Lgg/essential/gui/menu/full/FullRightSideBar;)V
        //  1392: checkcast       Lkotlin/jvm/functions/Function0;
        //  1395: sipush          511
        //  1398: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;Lgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //  1401: checkcast       Lgg/essential/elementa/UIComponent;
        //  1404: astore          $this$constrain$iv
        //  1406: aload           $this$constrain$iv
        //  1408: astore          8
        //  1410: aload           8
        //  1412: astore          $this$constrain_u24lambda_u2d0$iv
        //  1414: aload           $this$constrain_u24lambda_u2d0$iv
        //  1416: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1419: astore          $this$cosmeticVisibilityToggleButton_delegate_u24lambda_u2d12
        //  1421: aload           $this$cosmeticVisibilityToggleButton_delegate_u24lambda_u2d12
        //  1423: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1426: dup            
        //  1427: ldc_w           4.0
        //  1430: iconst_1       
        //  1431: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //  1434: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1437: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1440: aload           $this$cosmeticVisibilityToggleButton_delegate_u24lambda_u2d12
        //  1442: bipush          20
        //  1444: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1447: checkcast       Ljava/lang/Number;
        //  1450: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1453: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1456: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1459: aload           $this$cosmeticVisibilityToggleButton_delegate_u24lambda_u2d12
        //  1461: bipush          20
        //  1463: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1466: checkcast       Ljava/lang/Number;
        //  1469: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1472: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1475: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1478: aload           8
        //  1480: checkcast       Lgg/essential/gui/common/MenuButton;
        //  1483: aload_0         /* this */
        //  1484: getfield        gg/essential/gui/menu/full/FullRightSideBar.isOwnCosmeticsVisible:Lgg/essential/elementa/state/State;
        //  1487: getstatic       gg/essential/gui/menu/full/FullRightSideBar$cosmeticVisibilityToggleButton$4.INSTANCE:Lgg/essential/gui/menu/full/FullRightSideBar$cosmeticVisibilityToggleButton$4;
        //  1490: checkcast       Lkotlin/jvm/functions/Function1;
        //  1493: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1496: checkcast       Lgg/essential/elementa/state/State;
        //  1499: iconst_0       
        //  1500: aconst_null    
        //  1501: aconst_null    
        //  1502: aconst_null    
        //  1503: fconst_0       
        //  1504: fconst_0       
        //  1505: aconst_null    
        //  1506: sipush          254
        //  1509: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //  1512: aload_0         /* this */
        //  1513: getfield        gg/essential/gui/menu/full/FullRightSideBar.isOwnCosmeticsVisible:Lgg/essential/elementa/state/State;
        //  1516: getstatic       gg/essential/gui/menu/full/FullRightSideBar$cosmeticVisibilityToggleButton$5.INSTANCE:Lgg/essential/gui/menu/full/FullRightSideBar$cosmeticVisibilityToggleButton$5;
        //  1519: checkcast       Lkotlin/jvm/functions/Function1;
        //  1522: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1525: checkcast       Lgg/essential/elementa/state/State;
        //  1528: iconst_0       
        //  1529: aconst_null    
        //  1530: aconst_null    
        //  1531: iconst_0       
        //  1532: iconst_0       
        //  1533: fconst_0       
        //  1534: fconst_0       
        //  1535: iconst_0       
        //  1536: sipush          510
        //  1539: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //  1542: checkcast       Lgg/essential/elementa/UIComponent;
        //  1545: aload_0         /* this */
        //  1546: invokespecial   gg/essential/gui/menu/full/FullRightSideBar.getToolbar:()Lgg/essential/elementa/components/UIContainer;
        //  1549: checkcast       Lgg/essential/elementa/UIComponent;
        //  1552: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1555: aload_0         /* this */
        //  1556: getstatic       gg/essential/gui/menu/full/FullRightSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1559: iconst_4       
        //  1560: aaload         
        //  1561: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1564: pop            
        //  1565: aload_0         /* this */
        //  1566: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getFolder:()Lgg/essential/gui/common/MenuButton;
        //  1569: checkcast       Lgg/essential/elementa/UIComponent;
        //  1572: astore          $this$constrain$iv
        //  1574: aload           $this$constrain$iv
        //  1576: astore          8
        //  1578: aload           8
        //  1580: astore          $this$constrain_u24lambda_u2d0$iv
        //  1582: aload           $this$constrain_u24lambda_u2d0$iv
        //  1584: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1587: astore          $this$_init__u24lambda_u2d13
        //  1589: aload           $this$_init__u24lambda_u2d13
        //  1591: iconst_4       
        //  1592: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1595: checkcast       Ljava/lang/Number;
        //  1598: iconst_0       
        //  1599: iconst_1       
        //  1600: iconst_1       
        //  1601: aconst_null    
        //  1602: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1605: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1608: aload_0         /* this */
        //  1609: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getPictures:()Lgg/essential/gui/common/MenuButton;
        //  1612: checkcast       Lgg/essential/elementa/UIComponent;
        //  1615: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1618: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1621: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1624: aload           $this$_init__u24lambda_u2d13
        //  1626: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1629: dup            
        //  1630: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1633: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1636: aload_0         /* this */
        //  1637: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getSettings:()Lgg/essential/gui/common/MenuButton;
        //  1640: checkcast       Lgg/essential/elementa/UIComponent;
        //  1643: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1646: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1649: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1652: aload           8
        //  1654: checkcast       Lgg/essential/gui/common/MenuButton;
        //  1657: aload_0         /* this */
        //  1658: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getFolderTooltip:()Lgg/essential/elementa/state/BasicState;
        //  1661: checkcast       Lgg/essential/elementa/state/State;
        //  1664: iconst_0       
        //  1665: aconst_null    
        //  1666: aconst_null    
        //  1667: iconst_0       
        //  1668: iconst_0       
        //  1669: fconst_0       
        //  1670: fconst_0       
        //  1671: iconst_0       
        //  1672: sipush          510
        //  1675: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //  1678: checkcast       Lgg/essential/elementa/UIComponent;
        //  1681: aload_0         /* this */
        //  1682: checkcast       Lgg/essential/elementa/UIComponent;
        //  1685: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1688: pop            
        //  1689: aload_0         /* this */
        //  1690: checkcast       Lgg/essential/elementa/UIComponent;
        //  1693: astore          $this$constrain$iv
        //  1695: aload           $this$constrain$iv
        //  1697: astore          8
        //  1699: aload           8
        //  1701: astore          $this$constrain_u24lambda_u2d0$iv
        //  1703: aload           $this$constrain_u24lambda_u2d0$iv
        //  1705: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1708: astore          $this$_init__u24lambda_u2d14
        //  1710: aload           $this$_init__u24lambda_u2d14
        //  1712: bipush          100
        //  1714: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1717: checkcast       Ljava/lang/Number;
        //  1720: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1723: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1726: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1729: aload           $this$_init__u24lambda_u2d14
        //  1731: new             Lgg/essential/elementa/constraints/ChildBasedRangeConstraint;
        //  1734: dup            
        //  1735: invokespecial   gg/essential/elementa/constraints/ChildBasedRangeConstraint.<init>:()V
        //  1738: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1741: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1744: new             Lgg/essential/gui/common/EssentialTooltip;
        //  1747: dup            
        //  1748: aload_0         /* this */
        //  1749: invokespecial   gg/essential/gui/menu/full/FullRightSideBar.getSilentModeToggleButton:()Lgg/essential/gui/common/MenuButton;
        //  1752: checkcast       Lgg/essential/elementa/UIComponent;
        //  1755: getstatic       gg/essential/gui/common/EssentialTooltip$Position.ABOVE:Lgg/essential/gui/common/EssentialTooltip$Position;
        //  1758: iconst_0       
        //  1759: iconst_1       
        //  1760: iconst_4       
        //  1761: invokespecial   gg/essential/gui/common/EssentialTooltip.<init>:(Lgg/essential/elementa/UIComponent;Lgg/essential/gui/common/EssentialTooltip$Position;IZI)V
        //  1764: checkcast       Lgg/essential/elementa/UIComponent;
        //  1767: astore          $this$constrain$iv
        //  1769: aload           $this$constrain$iv
        //  1771: astore          9
        //  1773: aload           9
        //  1775: astore          $this$constrain_u24lambda_u2d0$iv
        //  1777: aload           $this$constrain_u24lambda_u2d0$iv
        //  1779: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1782: astore          $this$_init__u24lambda_u2d15
        //  1784: aload           $this$_init__u24lambda_u2d15
        //  1786: iconst_0       
        //  1787: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1790: checkcast       Ljava/lang/Number;
        //  1793: iconst_1       
        //  1794: iconst_0       
        //  1795: iconst_2       
        //  1796: aconst_null    
        //  1797: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1800: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1803: aload_0         /* this */
        //  1804: invokespecial   gg/essential/gui/menu/full/FullRightSideBar.getFullscreenToggleButton:()Lgg/essential/gui/common/MenuButton;
        //  1807: checkcast       Lgg/essential/elementa/UIComponent;
        //  1810: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1813: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1816: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1819: aload           $this$_init__u24lambda_u2d15
        //  1821: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1824: dup            
        //  1825: ldc_w           5.0
        //  1828: iconst_1       
        //  1829: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //  1832: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1835: aload_0         /* this */
        //  1836: invokespecial   gg/essential/gui/menu/full/FullRightSideBar.getSilentModeToggleButton:()Lgg/essential/gui/common/MenuButton;
        //  1839: checkcast       Lgg/essential/elementa/UIComponent;
        //  1842: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1845: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1848: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1851: aload           9
        //  1853: checkcast       Lgg/essential/gui/common/Tooltip;
        //  1856: aload_0         /* this */
        //  1857: getfield        gg/essential/gui/menu/full/FullRightSideBar.isSilentMode:Lgg/essential/elementa/state/State;
        //  1860: getstatic       gg/essential/gui/menu/full/FullRightSideBar$silentButtonTooltip$2.INSTANCE:Lgg/essential/gui/menu/full/FullRightSideBar$silentButtonTooltip$2;
        //  1863: checkcast       Lkotlin/jvm/functions/Function1;
        //  1866: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1869: checkcast       Lgg/essential/elementa/state/State;
        //  1872: aconst_null    
        //  1873: invokestatic    gg/essential/gui/common/Tooltip.bindLine$default$e129f13:(Lgg/essential/gui/common/Tooltip;Lgg/essential/elementa/state/State;Ljava/lang/Object;)Lgg/essential/gui/common/Tooltip;
        //  1876: aload_0         /* this */
        //  1877: invokespecial   gg/essential/gui/menu/full/FullRightSideBar.getSilentModeToggleButton:()Lgg/essential/gui/common/MenuButton;
        //  1880: checkcast       Lgg/essential/elementa/UIComponent;
        //  1883: iconst_0       
        //  1884: iconst_0       
        //  1885: iconst_3       
        //  1886: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //  1889: invokevirtual   gg/essential/gui/common/Tooltip.bindVisibility:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/Tooltip;
        //  1892: pop            
        //  1893: aload_0         /* this */
        //  1894: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getMessageFlag:()Lgg/essential/gui/common/NoticeFlag;
        //  1897: checkcast       Lgg/essential/elementa/UIComponent;
        //  1900: astore          $this$constrain$iv
        //  1902: aload           $this$constrain$iv
        //  1904: astore          9
        //  1906: aload           9
        //  1908: astore          $this$constrain_u24lambda_u2d0$iv
        //  1910: aload           $this$constrain_u24lambda_u2d0$iv
        //  1912: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1915: astore          $this$_init__u24lambda_u2d16
        //  1917: aload           $this$_init__u24lambda_u2d16
        //  1919: iconst_3       
        //  1920: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1923: checkcast       Ljava/lang/Number;
        //  1926: iconst_0       
        //  1927: iconst_1       
        //  1928: iconst_1       
        //  1929: aconst_null    
        //  1930: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1933: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1936: aload_0         /* this */
        //  1937: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getSocial:()Lgg/essential/gui/common/MenuButton;
        //  1940: checkcast       Lgg/essential/elementa/UIComponent;
        //  1943: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1946: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1949: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1952: aload           $this$_init__u24lambda_u2d16
        //  1954: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1957: dup            
        //  1958: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1961: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1964: aload_0         /* this */
        //  1965: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getSocial:()Lgg/essential/gui/common/MenuButton;
        //  1968: checkcast       Lgg/essential/elementa/UIComponent;
        //  1971: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1974: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1977: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1980: aload           9
        //  1982: astore          $this$onLeftClick$iv
        //  1984: aload           $this$onLeftClick$iv
        //  1986: new             Lgg/essential/gui/menu/full/FullRightSideBar$special$$inlined$onLeftClick$1;
        //  1989: dup            
        //  1990: aload_0         /* this */
        //  1991: invokespecial   gg/essential/gui/menu/full/FullRightSideBar$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/menu/full/FullRightSideBar;)V
        //  1994: checkcast       Lkotlin/jvm/functions/Function2;
        //  1997: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  2000: aload_0         /* this */
        //  2001: checkcast       Lgg/essential/elementa/UIComponent;
        //  2004: aload_0         /* this */
        //  2005: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getHasNotices:()Lgg/essential/elementa/state/MappedState;
        //  2008: checkcast       Lgg/essential/elementa/state/State;
        //  2011: iconst_0       
        //  2012: aconst_null    
        //  2013: bipush          12
        //  2015: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  2018: pop            
        //  2019: aload_0         /* this */
        //  2020: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getBetaFlag:()Lgg/essential/elementa/UIComponent;
        //  2023: astore          $this$constrain$iv
        //  2025: aload           $this$constrain$iv
        //  2027: astore          9
        //  2029: aload           9
        //  2031: astore          $this$constrain_u24lambda_u2d0$iv
        //  2033: aload           $this$constrain_u24lambda_u2d0$iv
        //  2035: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2038: astore          $this$_init__u24lambda_u2d18
        //  2040: aload           $this$_init__u24lambda_u2d18
        //  2042: iconst_3       
        //  2043: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2046: checkcast       Ljava/lang/Number;
        //  2049: iconst_0       
        //  2050: iconst_1       
        //  2051: iconst_1       
        //  2052: aconst_null    
        //  2053: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2056: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2059: aload_0         /* this */
        //  2060: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getEssentialButton:()Lgg/essential/gui/common/MenuButton;
        //  2063: checkcast       Lgg/essential/elementa/UIComponent;
        //  2066: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  2069: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2072: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2075: aload           $this$_init__u24lambda_u2d18
        //  2077: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  2080: dup            
        //  2081: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  2084: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2087: aload_0         /* this */
        //  2088: invokevirtual   gg/essential/gui/menu/full/FullRightSideBar.getEssentialButton:()Lgg/essential/gui/common/MenuButton;
        //  2091: checkcast       Lgg/essential/elementa/UIComponent;
        //  2094: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  2097: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2100: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2103: aload           9
        //  2105: getstatic       gg/essential/handlers/PauseMenuDisplay.Companion:Lgg/essential/handlers/PauseMenuDisplay$Companion;
        //  2108: invokevirtual   gg/essential/handlers/PauseMenuDisplay$Companion.getWindow:()Lgg/essential/elementa/components/Window;
        //  2111: checkcast       Lgg/essential/elementa/UIComponent;
        //  2114: aload           menuVisible
        //  2116: new             Lgg/essential/elementa/state/BasicState;
        //  2119: dup            
        //  2120: getstatic       gg/essential/data/VersionData.INSTANCE:Lgg/essential/data/VersionData;
        //  2123: invokevirtual   gg/essential/data/VersionData.getEssentialBranch:()Ljava/lang/String;
        //  2126: ldc_w           "stable"
        //  2129: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2132: ifne            2139
        //  2135: iconst_1       
        //  2136: goto            2140
        //  2139: iconst_0       
        //  2140: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2143: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  2146: checkcast       Lgg/essential/elementa/state/State;
        //  2149: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  2152: checkcast       Lgg/essential/elementa/state/State;
        //  2155: iconst_0       
        //  2156: aconst_null    
        //  2157: bipush          12
        //  2159: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  2162: pop            
        //  2163: return         
        //    Signature:
        //  (Lgg/essential/handlers/PauseMenuDisplay$MenuType;Lgg/essential/elementa/components/UIContainer;Lgg/essential/elementa/components/UIContainer;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;)V
        //    MethodParameters:
        //  Name          Flags  
        //  ------------  -----
        //  menuType      
        //  topButton     
        //  bottomButton  
        //  isCollapsed   
        //  menuVisible   
        //    StackMapTable: 00 03 FF 03 A3 00 0E 07 00 02 00 00 00 00 07 00 96 07 00 74 00 00 00 00 00 00 07 00 02 00 00 FF 04 B7 00 00 00 05 07 00 74 07 00 74 07 00 96 08 08 44 08 08 44 FF 00 00 00 00 00 06 07 00 74 07 00 74 07 00 96 08 08 44 08 08 44 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIContainer getToolbar() {
        return (UIContainer)this.toolbar$delegate.getValue((Object)this, (KProperty)FullRightSideBar.$$delegatedProperties[1]);
    }
    
    private final MenuButton getFullscreenToggleButton() {
        return (MenuButton)this.fullscreenToggleButton$delegate.getValue((Object)this, (KProperty)FullRightSideBar.$$delegatedProperties[2]);
    }
    
    private final MenuButton getSilentModeToggleButton() {
        return (MenuButton)this.silentModeToggleButton$delegate.getValue((Object)this, (KProperty)FullRightSideBar.$$delegatedProperties[3]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)FullRightSideBar.class, "diamond", "<v#0>", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullRightSideBar.class, "toolbar", "getToolbar()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullRightSideBar.class, "fullscreenToggleButton", "getFullscreenToggleButton()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullRightSideBar.class, "silentModeToggleButton", "getSilentModeToggleButton()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullRightSideBar.class, "cosmeticVisibilityToggleButton", "getCosmeticVisibilityToggleButton()Lgg/essential/gui/common/MenuButton;", 0)) };
    }
}
