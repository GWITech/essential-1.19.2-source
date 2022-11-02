package gg.essential.gui.menu.compact;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import net.minecraft.client.util.*;
import gg.essential.elementa.utils.*;
import gg.essential.gui.menu.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000D
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001$B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010	\u001a\u00020
                                                   ¢\u0006\u0002\u0010\u000bR\u000e\u0010	\u001a\u00020
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001b\u0010\u0015R\u001b\u0010\u001d\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0"X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006%""" }, d2 = { "Lgg/essential/gui/menu/compact/CompactAccountSwitcher;", "Lgg/essential/elementa/components/UIContainer;", "activeSession", "Lgg/essential/elementa/state/State;", "Lnet/minecraft/client/util/Session;", "accountsList", "Lgg/essential/elementa/utils/ObservableList;", "Lgg/essential/gui/menu/AccountManager$AccountInfo;", "sidebarContainer", "accountManager", "Lgg/essential/gui/menu/AccountManager;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/utils/ObservableList;Lgg/essential/elementa/components/UIContainer;Lgg/essential/gui/menu/AccountManager;)V", "accountScroller", "Lgg/essential/elementa/components/ScrollComponent;", "getAccountScroller", "()Lgg/essential/elementa/components/ScrollComponent;", "accountScroller$delegate", "Lkotlin/properties/ReadWriteProperty;", "addAccount", "Lgg/essential/gui/common/MenuButton;", "getAddAccount", "()Lgg/essential/gui/common/MenuButton;", "addAccount$delegate", "collapseButton", "getCollapseButton", "collapseButton$delegate", "mainAccount", "getMainAccount", "mainAccount$delegate", "switcherContainer", "getSwitcherContainer", "()Lgg/essential/elementa/components/UIContainer;", "switcherContainer$delegate", "switcherExpanded", "Lgg/essential/elementa/state/BasicState;", "", "AccountButton", "essential" })
public final class CompactAccountSwitcher extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final AccountManager accountManager;
    @NotNull
    private final BasicState<Boolean> switcherExpanded;
    @NotNull
    private final ReadWriteProperty mainAccount$delegate;
    @NotNull
    private final ReadWriteProperty switcherContainer$delegate;
    @NotNull
    private final ReadWriteProperty accountScroller$delegate;
    @NotNull
    private final ReadWriteProperty addAccount$delegate;
    
    public CompactAccountSwitcher(@NotNull final State<Session> activeSession, @NotNull final ObservableList<AccountManager$AccountInfo> accountsList, @NotNull final UIContainer sidebarContainer, @NotNull final AccountManager accountManager) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "activeSession"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* accountsList */
        //     7: ldc             "accountsList"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* sidebarContainer */
        //    13: ldc             "sidebarContainer"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           accountManager
        //    20: ldc             "accountManager"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload_0         /* this */
        //    26: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    29: aload_0         /* this */
        //    30: aload           accountManager
        //    32: putfield        gg/essential/gui/menu/compact/CompactAccountSwitcher.accountManager:Lgg/essential/gui/menu/AccountManager;
        //    35: aload_0         /* this */
        //    36: new             Lgg/essential/elementa/state/BasicState;
        //    39: dup            
        //    40: iconst_0       
        //    41: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    44: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    47: putfield        gg/essential/gui/menu/compact/CompactAccountSwitcher.switcherExpanded:Lgg/essential/elementa/state/BasicState;
        //    50: aload_0         /* this */
        //    51: new             Lgg/essential/gui/common/MenuButton;
        //    54: dup            
        //    55: aconst_null    
        //    56: aconst_null    
        //    57: aconst_null    
        //    58: aconst_null    
        //    59: aconst_null    
        //    60: aconst_null    
        //    61: iconst_0       
        //    62: iconst_0       
        //    63: new             Lgg/essential/gui/menu/compact/CompactAccountSwitcher$mainAccount$2;
        //    66: dup            
        //    67: aload_0         /* this */
        //    68: invokespecial   gg/essential/gui/menu/compact/CompactAccountSwitcher$mainAccount$2.<init>:(Lgg/essential/gui/menu/compact/CompactAccountSwitcher;)V
        //    71: checkcast       Lkotlin/jvm/functions/Function0;
        //    74: sipush          511
        //    77: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;Lgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //    80: checkcast       Lgg/essential/elementa/UIComponent;
        //    83: astore          $this$constrain$iv
        //    85: aload           $this$constrain$iv
        //    87: astore          6
        //    89: aload           6
        //    91: astore          $this$constrain_u24lambda_u2d0$iv
        //    93: aload           $this$constrain_u24lambda_u2d0$iv
        //    95: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    98: astore          8
        //   100: astore          12
        //   102: aload           $this$mainAccount_delegate_u24lambda_u2d0
        //   104: iconst_0       
        //   105: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   108: checkcast       Ljava/lang/Number;
        //   111: iconst_1       
        //   112: iconst_0       
        //   113: iconst_2       
        //   114: aconst_null    
        //   115: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   118: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   121: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   124: aload           $this$mainAccount_delegate_u24lambda_u2d0
        //   126: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   129: dup            
        //   130: fconst_0       
        //   131: iconst_1       
        //   132: aconst_null    
        //   133: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   136: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   139: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   142: aload           $this$mainAccount_delegate_u24lambda_u2d0
        //   144: bipush          20
        //   146: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   149: checkcast       Ljava/lang/Number;
        //   152: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   155: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   158: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   161: aload           12
        //   163: aload           6
        //   165: checkcast       Lgg/essential/gui/common/MenuButton;
        //   168: aload_1         /* activeSession */
        //   169: getstatic       gg/essential/gui/menu/compact/CompactAccountSwitcher$mainAccount$4.INSTANCE:Lgg/essential/gui/menu/compact/CompactAccountSwitcher$mainAccount$4;
        //   172: checkcast       Lkotlin/jvm/functions/Function1;
        //   175: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   178: checkcast       Lgg/essential/elementa/state/State;
        //   181: iconst_0       
        //   182: aconst_null    
        //   183: ldc             8.0
        //   185: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   188: ldc             8.0
        //   190: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   193: fconst_0       
        //   194: fconst_0       
        //   195: aconst_null    
        //   196: sipush          230
        //   199: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //   202: aload_1         /* activeSession */
        //   203: getstatic       gg/essential/gui/menu/compact/CompactAccountSwitcher$mainAccount$5.INSTANCE:Lgg/essential/gui/menu/compact/CompactAccountSwitcher$mainAccount$5;
        //   206: checkcast       Lkotlin/jvm/functions/Function1;
        //   209: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   212: checkcast       Lgg/essential/elementa/state/State;
        //   215: iconst_0       
        //   216: aconst_null    
        //   217: getstatic       gg/essential/gui/common/MenuButton$Alignment.RIGHT:Lgg/essential/gui/common/MenuButton$Alignment;
        //   220: iconst_0       
        //   221: iconst_0       
        //   222: fconst_0       
        //   223: fconst_0       
        //   224: iconst_0       
        //   225: sipush          502
        //   228: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //   231: checkcast       Lgg/essential/elementa/UIComponent;
        //   234: aload_0         /* this */
        //   235: checkcast       Lgg/essential/elementa/UIComponent;
        //   238: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   241: aload_0         /* this */
        //   242: getstatic       gg/essential/gui/menu/compact/CompactAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   245: iconst_0       
        //   246: aaload         
        //   247: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   250: putfield        gg/essential/gui/menu/compact/CompactAccountSwitcher.mainAccount$delegate:Lkotlin/properties/ReadWriteProperty;
        //   253: aload_0         /* this */
        //   254: new             Lgg/essential/elementa/components/UIContainer;
        //   257: dup            
        //   258: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   261: checkcast       Lgg/essential/elementa/UIComponent;
        //   264: astore          $this$constrain$iv
        //   266: aload           $this$constrain$iv
        //   268: astore          6
        //   270: aload           6
        //   272: astore          $this$constrain_u24lambda_u2d0$iv
        //   274: aload           $this$constrain_u24lambda_u2d0$iv
        //   276: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   279: astore          8
        //   281: astore          12
        //   283: aload           $this$switcherContainer_delegate_u24lambda_u2d1
        //   285: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   288: dup            
        //   289: ldc             -1.0
        //   291: iconst_1       
        //   292: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   295: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   298: aload_0         /* this */
        //   299: invokespecial   gg/essential/gui/menu/compact/CompactAccountSwitcher.getMainAccount:()Lgg/essential/gui/common/MenuButton;
        //   302: checkcast       Lgg/essential/elementa/UIComponent;
        //   305: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   308: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   311: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   314: aload           $this$switcherContainer_delegate_u24lambda_u2d1
        //   316: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   319: dup            
        //   320: fconst_0       
        //   321: iconst_1       
        //   322: aconst_null    
        //   323: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   326: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   329: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   332: aload           $this$switcherContainer_delegate_u24lambda_u2d1
        //   334: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   337: dup            
        //   338: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   341: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   344: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   347: aload           12
        //   349: aload           6
        //   351: aload_3         /* sidebarContainer */
        //   352: checkcast       Lgg/essential/elementa/UIComponent;
        //   355: aload_0         /* this */
        //   356: getfield        gg/essential/gui/menu/compact/CompactAccountSwitcher.switcherExpanded:Lgg/essential/elementa/state/BasicState;
        //   359: checkcast       Lgg/essential/elementa/state/State;
        //   362: iconst_0       
        //   363: aconst_null    
        //   364: bipush          12
        //   366: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   369: aload_0         /* this */
        //   370: getstatic       gg/essential/gui/menu/compact/CompactAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   373: iconst_1       
        //   374: aaload         
        //   375: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   378: putfield        gg/essential/gui/menu/compact/CompactAccountSwitcher.switcherContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   381: aload_0         /* this */
        //   382: new             Lgg/essential/elementa/components/ScrollComponent;
        //   385: dup            
        //   386: aconst_null    
        //   387: fconst_0       
        //   388: aconst_null    
        //   389: iconst_1       
        //   390: iconst_0       
        //   391: iconst_1       
        //   392: iconst_0       
        //   393: ldc             19.0
        //   395: fconst_0       
        //   396: aconst_null    
        //   397: sipush          839
        //   400: aconst_null    
        //   401: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   404: checkcast       Lgg/essential/elementa/UIComponent;
        //   407: astore          $this$constrain$iv
        //   409: aload           $this$constrain$iv
        //   411: astore          6
        //   413: aload           6
        //   415: astore          $this$constrain_u24lambda_u2d0$iv
        //   417: aload           $this$constrain_u24lambda_u2d0$iv
        //   419: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   422: astore          8
        //   424: astore          12
        //   426: aload           $this$accountScroller_delegate_u24lambda_u2d2
        //   428: iconst_0       
        //   429: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   432: checkcast       Ljava/lang/Number;
        //   435: iconst_1       
        //   436: iconst_0       
        //   437: iconst_2       
        //   438: aconst_null    
        //   439: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   442: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   445: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   448: aload           $this$accountScroller_delegate_u24lambda_u2d2
        //   450: aload           $this$accountScroller_delegate_u24lambda_u2d2
        //   452: invokevirtual   gg/essential/elementa/UIConstraints.getWidth:()Lgg/essential/elementa/constraints/WidthConstraint;
        //   455: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   458: getstatic       gg/essential/gui/menu/compact/CompactAccountSwitcher$accountScroller$2$1.INSTANCE:Lgg/essential/gui/menu/compact/CompactAccountSwitcher$accountScroller$2$1;
        //   461: checkcast       Lkotlin/jvm/functions/Function1;
        //   464: invokestatic    gg/essential/elementa/dsl/BasicConstraintsKt.basicWidthConstraint:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/constraints/WidthConstraint;
        //   467: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   470: iconst_1       
        //   471: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   474: checkcast       Ljava/lang/Number;
        //   477: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   480: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   483: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   486: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   489: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtMost:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtMostConstraint;
        //   492: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   495: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   498: aload           $this$accountScroller_delegate_u24lambda_u2d2
        //   500: bipush          35
        //   502: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   505: checkcast       Ljava/lang/Number;
        //   508: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   511: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   514: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   517: aload           12
        //   519: aload           6
        //   521: aload_0         /* this */
        //   522: invokespecial   gg/essential/gui/menu/compact/CompactAccountSwitcher.getSwitcherContainer:()Lgg/essential/elementa/components/UIContainer;
        //   525: checkcast       Lgg/essential/elementa/UIComponent;
        //   528: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   531: aload_0         /* this */
        //   532: getstatic       gg/essential/gui/menu/compact/CompactAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   535: iconst_2       
        //   536: aaload         
        //   537: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   540: putfield        gg/essential/gui/menu/compact/CompactAccountSwitcher.accountScroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //   543: aload_0         /* this */
        //   544: aconst_null    
        //   545: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //   548: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getBLUE:()Lgg/essential/gui/common/MenuButton$Style;
        //   551: aconst_null    
        //   552: aconst_null    
        //   553: aconst_null    
        //   554: invokestatic    gg/essential/elementa/effects/OutlineEffect$Side.values:()[Lgg/essential/elementa/effects/OutlineEffect$Side;
        //   557: astore          5
        //   559: astore          17
        //   561: astore          16
        //   563: astore          15
        //   565: astore          14
        //   567: astore          13
        //   569: astore          12
        //   571: aload           $this$filter$iv
        //   573: astore          6
        //   575: new             Ljava/util/ArrayList;
        //   578: dup            
        //   579: invokespecial   java/util/ArrayList.<init>:()V
        //   582: checkcast       Ljava/util/Collection;
        //   585: astore          destination$iv$iv
        //   587: iconst_0       
        //   588: istore          8
        //   590: aload           $this$filterTo$iv$iv
        //   592: arraylength    
        //   593: istore          9
        //   595: iload           8
        //   597: iload           9
        //   599: if_icmpge       645
        //   602: aload           $this$filterTo$iv$iv
        //   604: iload           8
        //   606: aaload         
        //   607: astore          element$iv$iv
        //   609: aload           element$iv$iv
        //   611: astore          it
        //   613: aload           it
        //   615: getstatic       gg/essential/elementa/effects/OutlineEffect$Side.Right:Lgg/essential/elementa/effects/OutlineEffect$Side;
        //   618: if_acmpeq       625
        //   621: iconst_1       
        //   622: goto            626
        //   625: iconst_0       
        //   626: ifeq            639
        //   629: aload           destination$iv$iv
        //   631: aload           element$iv$iv
        //   633: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   638: pop            
        //   639: iinc            8, 1
        //   642: goto            595
        //   645: aload           destination$iv$iv
        //   647: checkcast       Ljava/util/List;
        //   650: astore          18
        //   652: aload           12
        //   654: aload           13
        //   656: aload           14
        //   658: aload           15
        //   660: aload           16
        //   662: aload           17
        //   664: aload           18
        //   666: checkcast       Ljava/lang/Iterable;
        //   669: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //   672: bipush          7
        //   674: invokestatic    gg/essential/gui/common/MenuButton$Style.copy$default$562a9903:(Lgg/essential/gui/common/MenuButton$Style;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/util/Set;I)Lgg/essential/gui/common/MenuButton$Style;
        //   677: astore          19
        //   679: new             Lgg/essential/elementa/state/BasicState;
        //   682: dup            
        //   683: aload           19
        //   685: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   688: checkcast       Lgg/essential/elementa/state/State;
        //   691: new             Lgg/essential/elementa/state/BasicState;
        //   694: dup            
        //   695: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //   698: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getLIGHT_BLUE:()Lgg/essential/gui/common/MenuButton$Style;
        //   701: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   704: checkcast       Lgg/essential/elementa/state/State;
        //   707: aconst_null    
        //   708: aconst_null    
        //   709: aconst_null    
        //   710: getstatic       gg/essential/gui/menu/compact/CompactAccountSwitcher$addAccount$3.INSTANCE:Lgg/essential/gui/menu/compact/CompactAccountSwitcher$addAccount$3;
        //   713: checkcast       Lkotlin/jvm/functions/Function0;
        //   716: astore          20
        //   718: astore          21
        //   720: astore          22
        //   722: astore          23
        //   724: astore          24
        //   726: astore          25
        //   728: astore          26
        //   730: new             Lgg/essential/gui/common/MenuButton;
        //   733: dup            
        //   734: aload           26
        //   736: aload           25
        //   738: aload           24
        //   740: aload           23
        //   742: aload           22
        //   744: aload           21
        //   746: iconst_0       
        //   747: iconst_0       
        //   748: aload           20
        //   750: sipush          505
        //   753: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;Lgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //   756: checkcast       Lgg/essential/elementa/UIComponent;
        //   759: astore          $this$constrain$iv
        //   761: aload           $this$constrain$iv
        //   763: astore          6
        //   765: aload           6
        //   767: astore          $this$constrain_u24lambda_u2d0$iv
        //   769: aload           $this$constrain_u24lambda_u2d0$iv
        //   771: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   774: astore          8
        //   776: astore          12
        //   778: aload           $this$addAccount_delegate_u24lambda_u2d4
        //   780: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   783: dup            
        //   784: fconst_0       
        //   785: iconst_1       
        //   786: aconst_null    
        //   787: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   790: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   793: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   796: aload           $this$addAccount_delegate_u24lambda_u2d4
        //   798: bipush          20
        //   800: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   803: checkcast       Ljava/lang/Number;
        //   806: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   809: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   812: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   815: aload           12
        //   817: aload           6
        //   819: checkcast       Lgg/essential/gui/common/MenuButton;
        //   822: new             Lgg/essential/elementa/state/BasicState;
        //   825: dup            
        //   826: getstatic       gg/essential/gui/EssentialPalette.PLUS_5X:Lgg/essential/gui/image/ImageFactory;
        //   829: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   832: checkcast       Lgg/essential/elementa/state/State;
        //   835: iconst_0       
        //   836: aconst_null    
        //   837: aconst_null    
        //   838: aconst_null    
        //   839: fconst_0       
        //   840: fconst_0       
        //   841: aconst_null    
        //   842: sipush          254
        //   845: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //   848: ldc_w           "Add Account"
        //   851: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$406ea034$744fdd8:(Lgg/essential/gui/common/MenuButton;Ljava/lang/String;)Lgg/essential/gui/common/MenuButton;
        //   854: checkcast       Lgg/essential/elementa/UIComponent;
        //   857: aload_0         /* this */
        //   858: invokespecial   gg/essential/gui/menu/compact/CompactAccountSwitcher.getSwitcherContainer:()Lgg/essential/elementa/components/UIContainer;
        //   861: checkcast       Lgg/essential/elementa/UIComponent;
        //   864: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   867: aload_0         /* this */
        //   868: getstatic       gg/essential/gui/menu/compact/CompactAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   871: iconst_3       
        //   872: aaload         
        //   873: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   876: putfield        gg/essential/gui/menu/compact/CompactAccountSwitcher.addAccount$delegate:Lkotlin/properties/ReadWriteProperty;
        //   879: aconst_null    
        //   880: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //   883: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getDARK_GRAY:()Lgg/essential/gui/common/MenuButton$Style;
        //   886: aconst_null    
        //   887: aconst_null    
        //   888: aconst_null    
        //   889: invokestatic    gg/essential/elementa/effects/OutlineEffect$Side.values:()[Lgg/essential/elementa/effects/OutlineEffect$Side;
        //   892: astore          5
        //   894: astore          17
        //   896: astore          16
        //   898: astore          15
        //   900: astore          14
        //   902: astore          13
        //   904: aload           $this$filter$iv
        //   906: astore          6
        //   908: new             Ljava/util/ArrayList;
        //   911: dup            
        //   912: invokespecial   java/util/ArrayList.<init>:()V
        //   915: checkcast       Ljava/util/Collection;
        //   918: astore          destination$iv$iv
        //   920: iconst_0       
        //   921: istore          8
        //   923: aload           $this$filterTo$iv$iv
        //   925: arraylength    
        //   926: istore          9
        //   928: iload           8
        //   930: iload           9
        //   932: if_icmpge       978
        //   935: aload           $this$filterTo$iv$iv
        //   937: iload           8
        //   939: aaload         
        //   940: astore          element$iv$iv
        //   942: aload           element$iv$iv
        //   944: astore          it
        //   946: aload           it
        //   948: getstatic       gg/essential/elementa/effects/OutlineEffect$Side.Right:Lgg/essential/elementa/effects/OutlineEffect$Side;
        //   951: if_acmpeq       958
        //   954: iconst_1       
        //   955: goto            959
        //   958: iconst_0       
        //   959: ifeq            972
        //   962: aload           destination$iv$iv
        //   964: aload           element$iv$iv
        //   966: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   971: pop            
        //   972: iinc            8, 1
        //   975: goto            928
        //   978: aload           destination$iv$iv
        //   980: checkcast       Ljava/util/List;
        //   983: astore          18
        //   985: aload           13
        //   987: aload           14
        //   989: aload           15
        //   991: aload           16
        //   993: aload           17
        //   995: aload           18
        //   997: checkcast       Ljava/lang/Iterable;
        //  1000: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //  1003: bipush          7
        //  1005: invokestatic    gg/essential/gui/common/MenuButton$Style.copy$default$562a9903:(Lgg/essential/gui/common/MenuButton$Style;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/util/Set;I)Lgg/essential/gui/common/MenuButton$Style;
        //  1008: astore          27
        //  1010: new             Lgg/essential/elementa/state/BasicState;
        //  1013: dup            
        //  1014: aload           27
        //  1016: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1019: checkcast       Lgg/essential/elementa/state/State;
        //  1022: aconst_null    
        //  1023: aconst_null    
        //  1024: aconst_null    
        //  1025: aconst_null    
        //  1026: aconst_null    
        //  1027: astore          28
        //  1029: astore          29
        //  1031: astore          30
        //  1033: astore          31
        //  1035: astore          32
        //  1037: astore          33
        //  1039: astore          34
        //  1041: new             Lgg/essential/gui/common/MenuButton;
        //  1044: dup            
        //  1045: aload           34
        //  1047: aload           33
        //  1049: aload           32
        //  1051: aload           31
        //  1053: aload           30
        //  1055: aload           29
        //  1057: iconst_0       
        //  1058: iconst_0       
        //  1059: aload           28
        //  1061: sipush          1021
        //  1064: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;Lgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //  1067: checkcast       Lgg/essential/elementa/UIComponent;
        //  1070: astore          $this$constrain$iv
        //  1072: aload           $this$constrain$iv
        //  1074: astore          6
        //  1076: aload           6
        //  1078: astore          $this$constrain_u24lambda_u2d0$iv
        //  1080: aload           $this$constrain_u24lambda_u2d0$iv
        //  1082: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1085: astore          $this$collapseButton_delegate_u24lambda_u2d6
        //  1087: aload           $this$collapseButton_delegate_u24lambda_u2d6
        //  1089: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1092: dup            
        //  1093: ldc             -1.0
        //  1095: iconst_1       
        //  1096: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //  1099: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1102: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1105: aload           $this$collapseButton_delegate_u24lambda_u2d6
        //  1107: bipush          13
        //  1109: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1112: checkcast       Ljava/lang/Number;
        //  1115: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1118: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1121: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1124: aload           $this$collapseButton_delegate_u24lambda_u2d6
        //  1126: bipush          20
        //  1128: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1131: checkcast       Ljava/lang/Number;
        //  1134: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1137: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1140: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1143: aload           6
        //  1145: checkcast       Lgg/essential/gui/common/MenuButton;
        //  1148: new             Lgg/essential/elementa/state/BasicState;
        //  1151: dup            
        //  1152: getstatic       gg/essential/gui/EssentialPalette.ARROW_RIGHT_3X5:Lgg/essential/gui/image/ImageFactory;
        //  1155: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1158: checkcast       Lgg/essential/elementa/state/State;
        //  1161: iconst_0       
        //  1162: aconst_null    
        //  1163: aconst_null    
        //  1164: aconst_null    
        //  1165: fconst_0       
        //  1166: fconst_0       
        //  1167: aconst_null    
        //  1168: sipush          254
        //  1171: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //  1174: checkcast       Lgg/essential/elementa/UIComponent;
        //  1177: aload_0         /* this */
        //  1178: invokespecial   gg/essential/gui/menu/compact/CompactAccountSwitcher.getSwitcherContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1181: checkcast       Lgg/essential/elementa/UIComponent;
        //  1184: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1187: aload_0         /* this */
        //  1188: getstatic       gg/essential/gui/menu/compact/CompactAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1191: iconst_4       
        //  1192: aaload         
        //  1193: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1196: pop            
        //  1197: aload_0         /* this */
        //  1198: checkcast       Lgg/essential/elementa/UIComponent;
        //  1201: astore          $this$constrain$iv
        //  1203: aload           $this$constrain$iv
        //  1205: astore          6
        //  1207: aload           6
        //  1209: astore          $this$constrain_u24lambda_u2d0$iv
        //  1211: aload           $this$constrain_u24lambda_u2d0$iv
        //  1213: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1216: astore          $this$_init__u24lambda_u2d7
        //  1218: aload           $this$_init__u24lambda_u2d7
        //  1220: iconst_0       
        //  1221: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1224: checkcast       Ljava/lang/Number;
        //  1227: iconst_1       
        //  1228: iconst_0       
        //  1229: iconst_2       
        //  1230: aconst_null    
        //  1231: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1234: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1237: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1240: aload           $this$_init__u24lambda_u2d7
        //  1242: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1245: dup            
        //  1246: fconst_0       
        //  1247: iconst_1       
        //  1248: aconst_null    
        //  1249: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1252: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1255: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1258: aload           $this$_init__u24lambda_u2d7
        //  1260: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //  1263: dup            
        //  1264: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //  1267: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1270: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1273: aload_0         /* this */
        //  1274: invokespecial   gg/essential/gui/menu/compact/CompactAccountSwitcher.getAccountScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  1277: checkcast       Lgg/essential/elementa/UIComponent;
        //  1280: aload_2         /* accountsList */
        //  1281: aconst_null    
        //  1282: aconst_null    
        //  1283: new             Lgg/essential/gui/menu/compact/CompactAccountSwitcher$2;
        //  1286: dup            
        //  1287: aload_0         /* this */
        //  1288: invokespecial   gg/essential/gui/menu/compact/CompactAccountSwitcher$2.<init>:(Lgg/essential/gui/menu/compact/CompactAccountSwitcher;)V
        //  1291: checkcast       Lkotlin/jvm/functions/Function1;
        //  1294: bipush          6
        //  1296: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindChildren$default$5794d177:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/utils/ObservableList;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //  1299: pop            
        //  1300: aload_2         /* accountsList */
        //  1301: aload_0         /* this */
        //  1302: aload_2         /* accountsList */
        //  1303: invokedynamic   BootstrapMethod #0, update:(Lgg/essential/gui/menu/compact/CompactAccountSwitcher;Lgg/essential/elementa/utils/ObservableList;)Ljava/util/Observer;
        //  1308: invokevirtual   gg/essential/elementa/utils/ObservableList.addObserver:(Ljava/util/Observer;)V
        //  1311: aload_0         /* this */
        //  1312: aload_2         /* accountsList */
        //  1313: invokestatic    gg/essential/gui/menu/compact/CompactAccountSwitcher._init_$adjustAddAccount:(Lgg/essential/gui/menu/compact/CompactAccountSwitcher;Lgg/essential/elementa/utils/ObservableList;)Lgg/essential/gui/common/MenuButton;
        //  1316: pop            
        //  1317: aload_0         /* this */
        //  1318: new             Lgg/essential/gui/menu/compact/CompactAccountSwitcher$4;
        //  1321: dup            
        //  1322: aload_0         /* this */
        //  1323: invokespecial   gg/essential/gui/menu/compact/CompactAccountSwitcher$4.<init>:(Lgg/essential/gui/menu/compact/CompactAccountSwitcher;)V
        //  1326: checkcast       Lkotlin/jvm/functions/Function1;
        //  1329: invokevirtual   gg/essential/gui/menu/compact/CompactAccountSwitcher.onFocus:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //  1332: pop            
        //  1333: aload_0         /* this */
        //  1334: new             Lgg/essential/gui/menu/compact/CompactAccountSwitcher$5;
        //  1337: dup            
        //  1338: aload_0         /* this */
        //  1339: invokespecial   gg/essential/gui/menu/compact/CompactAccountSwitcher$5.<init>:(Lgg/essential/gui/menu/compact/CompactAccountSwitcher;)V
        //  1342: checkcast       Lkotlin/jvm/functions/Function1;
        //  1345: invokevirtual   gg/essential/gui/menu/compact/CompactAccountSwitcher.onFocusLost:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //  1348: pop            
        //  1349: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Lnet/minecraft/client/util/Session;>;Lgg/essential/elementa/utils/ObservableList<Lgg/essential/gui/menu/AccountManager$AccountInfo;>;Lgg/essential/elementa/components/UIContainer;Lgg/essential/gui/menu/AccountManager;)V
        //    MethodParameters:
        //  Name              Flags  
        //  ----------------  -----
        //  activeSession     
        //  accountsList      
        //  sidebarContainer  
        //  accountManager    
        //    StackMapTable: 00 0A FF 02 53 00 12 07 00 02 07 00 AD 07 01 2D 07 00 04 07 01 2F 07 01 31 07 01 31 07 01 2B 01 01 00 00 07 00 02 05 07 01 33 05 05 05 00 00 FF 00 1D 00 12 07 00 02 07 00 AD 07 01 2D 07 00 04 07 01 2F 07 01 31 07 01 31 07 01 2B 01 01 07 01 22 07 01 22 07 00 02 05 07 01 33 05 05 05 00 00 40 01 0C FF 00 05 00 12 07 00 02 07 00 AD 07 01 2D 07 00 04 07 01 2F 07 01 31 07 01 31 07 01 2B 01 01 00 00 07 00 02 05 07 01 33 05 05 05 00 00 FF 01 1A 00 1B 07 00 02 07 00 AD 07 01 2D 07 00 04 07 01 2F 07 01 31 07 01 31 07 01 2B 01 01 00 00 07 00 02 05 07 01 33 05 05 05 07 01 3D 07 01 33 07 00 72 05 05 05 07 00 AD 07 00 AD 05 00 00 FF 00 1D 00 1B 07 00 02 07 00 AD 07 01 2D 07 00 04 07 01 2F 07 01 31 07 01 31 07 01 2B 01 01 07 01 22 07 01 22 07 00 02 05 07 01 33 05 05 05 07 01 3D 07 01 33 07 00 72 05 05 05 07 00 AD 07 00 AD 05 00 00 40 01 0C FF 00 05 00 1B 07 00 02 07 00 AD 07 01 2D 07 00 04 07 01 2F 07 01 31 07 01 31 07 01 2B 01 01 00 00 07 00 02 05 07 01 33 05 05 05 07 01 3D 07 01 33 07 00 72 05 05 05 07 00 AD 07 00 AD 05 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final MenuButton getMainAccount() {
        return (MenuButton)this.mainAccount$delegate.getValue((Object)this, (KProperty)CompactAccountSwitcher.$$delegatedProperties[0]);
    }
    
    private final UIContainer getSwitcherContainer() {
        return (UIContainer)this.switcherContainer$delegate.getValue((Object)this, (KProperty)CompactAccountSwitcher.$$delegatedProperties[1]);
    }
    
    private final ScrollComponent getAccountScroller() {
        return (ScrollComponent)this.accountScroller$delegate.getValue((Object)this, (KProperty)CompactAccountSwitcher.$$delegatedProperties[2]);
    }
    
    private final MenuButton getAddAccount() {
        return (MenuButton)this.addAccount$delegate.getValue((Object)this, (KProperty)CompactAccountSwitcher.$$delegatedProperties[3]);
    }
    
    private static final MenuButton _init_$adjustAddAccount(final CompactAccountSwitcher this$0, final ObservableList<AccountManager$AccountInfo> $accountsList) {
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this$0.getAddAccount();
        final UIConstraints $this$adjustAddAccount_u24lambda_u2d8 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$adjustAddAccount_u24lambda_u2d8.setX(new SiblingConstraint(($accountsList.size() > 0) ? -1.0f : 0.0f, true));
        return (MenuButton)$this$constrain_u24lambda_u2d0$iv;
    }
    
    private static final void _init_$lambda-9(final CompactAccountSwitcher this$0, final ObservableList $accountsList, final Observable observable, final Object o) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$accountsList, "$accountsList");
        _init_$adjustAddAccount(this$0, $accountsList);
    }
    
    public static final /* synthetic */ AccountManager access$getAccountManager$p(final CompactAccountSwitcher $this) {
        return $this.accountManager;
    }
    
    public static final /* synthetic */ BasicState access$getSwitcherExpanded$p(final CompactAccountSwitcher $this) {
        return $this.switcherExpanded;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CompactAccountSwitcher.class, "mainAccount", "getMainAccount()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CompactAccountSwitcher.class, "switcherContainer", "getSwitcherContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CompactAccountSwitcher.class, "accountScroller", "getAccountScroller()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CompactAccountSwitcher.class, "addAccount", "getAddAccount()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CompactAccountSwitcher.class, "collapseButton", "getCollapseButton()Lgg/essential/gui/common/MenuButton;", 0)) };
    }
}
