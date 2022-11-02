package gg.essential.gui.menu;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.*;
import java.util.*;
import gg.essential.gui.state.*;
import gg.essential.elementa.state.*;
import kotlin.*;
import gg.essential.gui.menu.full.*;
import kotlin.properties.*;
import gg.essential.handlers.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000r
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0010#
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010	\u001a\u00020
                                                   \u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0013\u0010\u0012\u001a\u00070\u0013¢\u0006\u0002\b\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00060\u0016X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00060\u0016X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a0\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b$\u0010 \u001a\u0004\b"\u0010#RH\u0010%\u001a<\u00120\u0012.\u0012\f\u0012
                                                    '*\u0004\u0018\u00010\u00170\u0017 '*\u0015\u0012\f\u0012
                                                    '*\u0004\u0018\u00010\u00170\u00170(¢\u0006\u0002\b\u00140&¢\u0006\u0002\b\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b-\u0010 \u001a\u0004\b+\u0010,¨\u0006.²\u0006
                                                   \u0010/\u001a\u000200X\u008a\u0084\u0002²\u0006
                                                   \u00101\u001a\u000202X\u008a\u0084\u0002²\u0006
                                                   \u00103\u001a\u000202X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/menu/LeftSideBar;", "Lgg/essential/elementa/components/UIContainer;", "topButton", "bottomButton", "menuVisible", "Lgg/essential/elementa/state/State;", "", "collapsed", "isCompact", "menuType", "Lgg/essential/handlers/PauseMenuDisplay$MenuType;", "rightSideBar", "leftContainer", "accountManager", "Lgg/essential/gui/menu/AccountManager;", "(Lgg/essential/elementa/components/UIContainer;Lgg/essential/elementa/components/UIContainer;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/handlers/PauseMenuDisplay$MenuType;Lgg/essential/elementa/components/UIContainer;Lgg/essential/elementa/components/UIContainer;Lgg/essential/gui/menu/AccountManager;)V", "accountSwitcher", "Lgg/essential/gui/menu/full/FullAccountSwitcher;", "connectionManager", "Lgg/essential/network/connectionmanager/ConnectionManager;", "Lorg/jetbrains/annotations/NotNull;", "isFakeSale", "Lgg/essential/elementa/state/MappedState;", "Lgg/essential/gui/state/Sale;", "isSale", "menuSize", "Lkotlin/Pair;", "player", "Lgg/essential/gui/common/EmulatedUI3DPlayer;", "getPlayer", "()Lgg/essential/gui/common/EmulatedUI3DPlayer;", "player$delegate", "Lkotlin/properties/ReadWriteProperty;", "playerWardrobeContainer", "getPlayerWardrobeContainer", "()Lgg/essential/elementa/components/UIContainer;", "playerWardrobeContainer$delegate", "sale", "", "kotlin.jvm.PlatformType", "", "wardrobeButton", "Lgg/essential/gui/common/MenuButton;", "getWardrobeButton", "()Lgg/essential/gui/common/MenuButton;", "wardrobeButton$delegate", "essential", "announcementFlag", "Lgg/essential/elementa/UIComponent;", "starLeft", "Lgg/essential/elementa/components/UIImage;", "starRight" })
public final class LeftSideBar extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final UIContainer topButton;
    @NotNull
    private final UIContainer bottomButton;
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final MappedState<Set<Sale>, Sale> sale;
    @NotNull
    private final MappedState<Sale, Boolean> isSale;
    @NotNull
    private final MappedState<Sale, Boolean> isFakeSale;
    @NotNull
    private final State<Pair<Boolean, Boolean>> menuSize;
    @NotNull
    private final FullAccountSwitcher accountSwitcher;
    @NotNull
    private final ReadWriteProperty playerWardrobeContainer$delegate;
    @NotNull
    private final ReadWriteProperty player$delegate;
    @NotNull
    private final ReadWriteProperty wardrobeButton$delegate;
    
    public LeftSideBar(@NotNull final UIContainer topButton, @NotNull final UIContainer bottomButton, @NotNull final State<Boolean> menuVisible, @NotNull final State<Boolean> collapsed, @NotNull final State<Boolean> isCompact, @NotNull final PauseMenuDisplay.MenuType menuType, @NotNull final UIContainer rightSideBar, @NotNull final UIContainer leftContainer, @NotNull final AccountManager accountManager) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "topButton"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* bottomButton */
        //     7: ldc             "bottomButton"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* menuVisible */
        //    13: ldc             "menuVisible"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           collapsed
        //    20: ldc             "collapsed"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload           isCompact
        //    27: ldc             "isCompact"
        //    29: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    32: aload           menuType
        //    34: ldc             "menuType"
        //    36: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    39: aload           rightSideBar
        //    41: ldc             "rightSideBar"
        //    43: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    46: aload           leftContainer
        //    48: ldc             "leftContainer"
        //    50: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    53: aload           accountManager
        //    55: ldc             "accountManager"
        //    57: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    60: aload_0         /* this */
        //    61: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    64: aload_0         /* this */
        //    65: aload_1         /* topButton */
        //    66: putfield        gg/essential/gui/menu/LeftSideBar.topButton:Lgg/essential/elementa/components/UIContainer;
        //    69: aload_0         /* this */
        //    70: aload_2         /* bottomButton */
        //    71: putfield        gg/essential/gui/menu/LeftSideBar.bottomButton:Lgg/essential/elementa/components/UIContainer;
        //    74: aload_0         /* this */
        //    75: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    78: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    81: dup            
        //    82: ldc             "getInstance().connectionManager"
        //    84: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    87: putfield        gg/essential/gui/menu/LeftSideBar.connectionManager:Lgg/essential/network/connectionmanager/ConnectionManager;
        //    90: aload_0         /* this */
        //    91: aload_0         /* this */
        //    92: getfield        gg/essential/gui/menu/LeftSideBar.connectionManager:Lgg/essential/network/connectionmanager/ConnectionManager;
        //    95: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getNoticesManager:()Lgg/essential/network/connectionmanager/notices/NoticesManager;
        //    98: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager.getSaleNoticeManager:()Lgg/essential/network/connectionmanager/notices/NoticesManager$SaleNoticeManager;
        //   101: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager$SaleNoticeManager.getSaleState:()Lgg/essential/elementa/state/State;
        //   104: getstatic       gg/essential/gui/menu/LeftSideBar$sale$1.INSTANCE:Lgg/essential/gui/menu/LeftSideBar$sale$1;
        //   107: checkcast       Lkotlin/jvm/functions/Function1;
        //   110: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   113: putfield        gg/essential/gui/menu/LeftSideBar.sale:Lgg/essential/elementa/state/MappedState;
        //   116: aload_0         /* this */
        //   117: aload_0         /* this */
        //   118: getfield        gg/essential/gui/menu/LeftSideBar.sale:Lgg/essential/elementa/state/MappedState;
        //   121: getstatic       gg/essential/gui/menu/LeftSideBar$isSale$1.INSTANCE:Lgg/essential/gui/menu/LeftSideBar$isSale$1;
        //   124: checkcast       Lkotlin/jvm/functions/Function1;
        //   127: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   130: putfield        gg/essential/gui/menu/LeftSideBar.isSale:Lgg/essential/elementa/state/MappedState;
        //   133: aload_0         /* this */
        //   134: aload_0         /* this */
        //   135: getfield        gg/essential/gui/menu/LeftSideBar.sale:Lgg/essential/elementa/state/MappedState;
        //   138: getstatic       gg/essential/gui/menu/LeftSideBar$isFakeSale$1.INSTANCE:Lgg/essential/gui/menu/LeftSideBar$isFakeSale$1;
        //   141: checkcast       Lkotlin/jvm/functions/Function1;
        //   144: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   147: putfield        gg/essential/gui/menu/LeftSideBar.isFakeSale:Lgg/essential/elementa/state/MappedState;
        //   150: aload_0         /* this */
        //   151: aload           collapsed
        //   153: aload           isCompact
        //   155: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   158: putfield        gg/essential/gui/menu/LeftSideBar.menuSize:Lgg/essential/elementa/state/State;
        //   161: aload_0         /* this */
        //   162: aload           accountManager
        //   164: aload           collapsed
        //   166: invokevirtual   gg/essential/gui/menu/AccountManager.getFullAccountSwitcher:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/menu/full/FullAccountSwitcher;
        //   169: checkcast       Lgg/essential/elementa/UIComponent;
        //   172: astore          $this$constrain$iv
        //   174: aload           $this$constrain$iv
        //   176: astore          12
        //   178: aload           12
        //   180: astore          $this$constrain_u24lambda_u2d0$iv
        //   182: aload           $this$constrain_u24lambda_u2d0$iv
        //   184: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   187: astore          15
        //   189: astore          22
        //   191: aload           $this$accountSwitcher_u24lambda_u2d0
        //   193: iconst_0       
        //   194: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   197: checkcast       Ljava/lang/Number;
        //   200: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   203: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   206: aload           rightSideBar
        //   208: checkcast       Lgg/essential/elementa/UIComponent;
        //   211: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   214: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   217: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   220: aload           22
        //   222: aload           12
        //   224: aload_0         /* this */
        //   225: checkcast       Lgg/essential/elementa/UIComponent;
        //   228: aload           isCompact
        //   230: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   233: checkcast       Lgg/essential/elementa/state/State;
        //   236: new             Lgg/essential/elementa/state/BasicState;
        //   239: dup            
        //   240: aload           menuType
        //   242: getstatic       gg/essential/handlers/PauseMenuDisplay$MenuType.MAIN:Lgg/essential/handlers/PauseMenuDisplay$MenuType;
        //   245: if_acmpne       252
        //   248: iconst_1       
        //   249: goto            253
        //   252: iconst_0       
        //   253: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   256: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   259: checkcast       Lgg/essential/elementa/state/State;
        //   262: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   265: checkcast       Lgg/essential/elementa/state/State;
        //   268: iconst_1       
        //   269: aconst_null    
        //   270: bipush          8
        //   272: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   275: checkcast       Lgg/essential/gui/menu/full/FullAccountSwitcher;
        //   278: putfield        gg/essential/gui/menu/LeftSideBar.accountSwitcher:Lgg/essential/gui/menu/full/FullAccountSwitcher;
        //   281: aload_0         /* this */
        //   282: new             Lgg/essential/elementa/components/UIContainer;
        //   285: dup            
        //   286: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   289: checkcast       Lgg/essential/elementa/UIComponent;
        //   292: astore          $this$constrain$iv
        //   294: aload           $this$constrain$iv
        //   296: astore          12
        //   298: aload           12
        //   300: astore          $this$constrain_u24lambda_u2d0$iv
        //   302: aload           $this$constrain_u24lambda_u2d0$iv
        //   304: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   307: astore          15
        //   309: astore          22
        //   311: aload           $this$playerWardrobeContainer_delegate_u24lambda_u2d1
        //   313: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   316: dup            
        //   317: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   320: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   323: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   326: aload           $this$playerWardrobeContainer_delegate_u24lambda_u2d1
        //   328: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   331: dup            
        //   332: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   335: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   338: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   341: aload           $this$playerWardrobeContainer_delegate_u24lambda_u2d1
        //   343: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   346: dup            
        //   347: fconst_0       
        //   348: iconst_1       
        //   349: aconst_null    
        //   350: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   353: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   356: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   359: aload           22
        //   361: aload           12
        //   363: aload           isCompact
        //   365: new             Lgg/essential/gui/menu/LeftSideBar$playerWardrobeContainer$3;
        //   368: dup            
        //   369: aload           rightSideBar
        //   371: aload_0         /* this */
        //   372: invokespecial   gg/essential/gui/menu/LeftSideBar$playerWardrobeContainer$3.<init>:(Lgg/essential/elementa/components/UIContainer;Lgg/essential/gui/menu/LeftSideBar;)V
        //   375: checkcast       Lkotlin/jvm/functions/Function2;
        //   378: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   381: aload_0         /* this */
        //   382: checkcast       Lgg/essential/elementa/UIComponent;
        //   385: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   388: aload_0         /* this */
        //   389: getstatic       gg/essential/gui/menu/LeftSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   392: iconst_0       
        //   393: aaload         
        //   394: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   397: putfield        gg/essential/gui/menu/LeftSideBar.playerWardrobeContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   400: aload_0         /* this */
        //   401: new             Lgg/essential/gui/common/EmulatedUI3DPlayer;
        //   404: dup            
        //   405: aconst_null    
        //   406: aconst_null    
        //   407: aconst_null    
        //   408: aconst_null    
        //   409: bipush          15
        //   411: invokespecial   gg/essential/gui/common/EmulatedUI3DPlayer.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;I)V
        //   414: checkcast       Lgg/essential/elementa/UIComponent;
        //   417: astore          $this$constrain$iv
        //   419: aload           $this$constrain$iv
        //   421: astore          12
        //   423: aload           12
        //   425: astore          $this$constrain_u24lambda_u2d0$iv
        //   427: aload           $this$constrain_u24lambda_u2d0$iv
        //   429: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   432: astore          15
        //   434: astore          22
        //   436: aload           $this$player_delegate_u24lambda_u2d2
        //   438: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   441: dup            
        //   442: fconst_0       
        //   443: iconst_1       
        //   444: aconst_null    
        //   445: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   448: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   451: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   454: aload           22
        //   456: aload           12
        //   458: aload           collapsed
        //   460: getstatic       gg/essential/gui/menu/LeftSideBar$player$3.INSTANCE:Lgg/essential/gui/menu/LeftSideBar$player$3;
        //   463: checkcast       Lkotlin/jvm/functions/Function2;
        //   466: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   469: aload_0         /* this */
        //   470: invokespecial   gg/essential/gui/menu/LeftSideBar.getPlayerWardrobeContainer:()Lgg/essential/elementa/components/UIContainer;
        //   473: checkcast       Lgg/essential/elementa/UIComponent;
        //   476: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   479: aload_0         /* this */
        //   480: getstatic       gg/essential/gui/menu/LeftSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   483: iconst_1       
        //   484: aaload         
        //   485: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   488: putfield        gg/essential/gui/menu/LeftSideBar.player$delegate:Lkotlin/properties/ReadWriteProperty;
        //   491: aload_0         /* this */
        //   492: new             Lgg/essential/gui/common/MenuButton;
        //   495: dup            
        //   496: new             Lgg/essential/elementa/state/BasicState;
        //   499: dup            
        //   500: ldc_w           "Wardrobe"
        //   503: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   506: checkcast       Lgg/essential/elementa/state/State;
        //   509: aconst_null    
        //   510: aconst_null    
        //   511: aconst_null    
        //   512: getstatic       gg/essential/gui/common/MenuButton$Alignment.LEFT:Lgg/essential/gui/common/MenuButton$Alignment;
        //   515: fconst_0       
        //   516: aconst_null    
        //   517: iconst_0       
        //   518: iconst_0       
        //   519: getstatic       gg/essential/gui/menu/LeftSideBar$wardrobeButton$2.INSTANCE:Lgg/essential/gui/menu/LeftSideBar$wardrobeButton$2;
        //   522: checkcast       Lkotlin/jvm/functions/Function0;
        //   525: sipush          494
        //   528: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //   531: new             Lgg/essential/elementa/state/BasicState;
        //   534: dup            
        //   535: getstatic       gg/essential/gui/EssentialPalette.COSMETICS_10X7:Lgg/essential/gui/image/ImageFactory;
        //   538: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   541: checkcast       Lgg/essential/elementa/state/State;
        //   544: iconst_1       
        //   545: aconst_null    
        //   546: ldc_w           10.0
        //   549: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   552: ldc_w           7.0
        //   555: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   558: fconst_0       
        //   559: fconst_0       
        //   560: aconst_null    
        //   561: sipush          228
        //   564: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //   567: checkcast       Lgg/essential/elementa/UIComponent;
        //   570: astore          $this$constrain$iv
        //   572: aload           $this$constrain$iv
        //   574: astore          12
        //   576: aload           12
        //   578: astore          $this$constrain_u24lambda_u2d0$iv
        //   580: aload           $this$constrain_u24lambda_u2d0$iv
        //   582: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   585: astore          15
        //   587: astore          22
        //   589: aload           $this$wardrobeButton_delegate_u24lambda_u2d3
        //   591: bipush          80
        //   593: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   596: checkcast       Ljava/lang/Number;
        //   599: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   602: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   605: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   608: aload           $this$wardrobeButton_delegate_u24lambda_u2d3
        //   610: bipush          20
        //   612: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   615: checkcast       Ljava/lang/Number;
        //   618: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   621: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   624: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   627: aload           22
        //   629: aload           12
        //   631: aload_0         /* this */
        //   632: getfield        gg/essential/gui/menu/LeftSideBar.menuSize:Lgg/essential/elementa/state/State;
        //   635: new             Lgg/essential/gui/menu/LeftSideBar$wardrobeButton$4;
        //   638: dup            
        //   639: aload_0         /* this */
        //   640: invokespecial   gg/essential/gui/menu/LeftSideBar$wardrobeButton$4.<init>:(Lgg/essential/gui/menu/LeftSideBar;)V
        //   643: checkcast       Lkotlin/jvm/functions/Function2;
        //   646: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   649: checkcast       Lgg/essential/gui/common/MenuButton;
        //   652: aload_0         /* this */
        //   653: getfield        gg/essential/gui/menu/LeftSideBar.menuSize:Lgg/essential/elementa/state/State;
        //   656: getstatic       gg/essential/gui/menu/LeftSideBar$wardrobeButton$5.INSTANCE:Lgg/essential/gui/menu/LeftSideBar$wardrobeButton$5;
        //   659: checkcast       Lkotlin/jvm/functions/Function1;
        //   662: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   665: checkcast       Lgg/essential/elementa/state/State;
        //   668: iconst_0       
        //   669: aconst_null    
        //   670: aconst_null    
        //   671: iconst_0       
        //   672: iconst_0       
        //   673: fconst_0       
        //   674: fconst_0       
        //   675: iconst_0       
        //   676: sipush          510
        //   679: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //   682: aload           collapsed
        //   684: aload           isCompact
        //   686: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   689: checkcast       Lgg/essential/elementa/state/State;
        //   692: ldc_w           20.0
        //   695: invokestatic    gg/essential/gui/common/MenuButton.bindCollapsed$default$3bcddc2a$24867a06:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;F)Lgg/essential/gui/common/MenuButton;
        //   698: checkcast       Lgg/essential/elementa/UIComponent;
        //   701: aload_0         /* this */
        //   702: invokespecial   gg/essential/gui/menu/LeftSideBar.getPlayerWardrobeContainer:()Lgg/essential/elementa/components/UIContainer;
        //   705: checkcast       Lgg/essential/elementa/UIComponent;
        //   708: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   711: aload_0         /* this */
        //   712: getstatic       gg/essential/gui/menu/LeftSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   715: iconst_2       
        //   716: aaload         
        //   717: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   720: putfield        gg/essential/gui/menu/LeftSideBar.wardrobeButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //   723: aload_0         /* this */
        //   724: checkcast       Lgg/essential/elementa/UIComponent;
        //   727: aload           isCompact
        //   729: new             Lgg/essential/gui/menu/LeftSideBar$1;
        //   732: dup            
        //   733: aload_0         /* this */
        //   734: aload           rightSideBar
        //   736: invokespecial   gg/essential/gui/menu/LeftSideBar$1.<init>:(Lgg/essential/gui/menu/LeftSideBar;Lgg/essential/elementa/components/UIContainer;)V
        //   739: checkcast       Lkotlin/jvm/functions/Function2;
        //   742: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   745: pop            
        //   746: aload_0         /* this */
        //   747: invokespecial   gg/essential/gui/menu/LeftSideBar.getPlayer:()Lgg/essential/gui/common/EmulatedUI3DPlayer;
        //   750: checkcast       Lgg/essential/elementa/UIComponent;
        //   753: astore          $this$constrain$iv
        //   755: aload           $this$constrain$iv
        //   757: astore          12
        //   759: aload           12
        //   761: astore          $this$constrain_u24lambda_u2d0$iv
        //   763: aload           $this$constrain_u24lambda_u2d0$iv
        //   765: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   768: astore          $this$_init__u24lambda_u2d4
        //   770: aload           $this$_init__u24lambda_u2d4
        //   772: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   775: dup            
        //   776: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   779: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   782: aload_0         /* this */
        //   783: invokespecial   gg/essential/gui/menu/LeftSideBar.getWardrobeButton:()Lgg/essential/gui/common/MenuButton;
        //   786: checkcast       Lgg/essential/elementa/UIComponent;
        //   789: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   792: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   795: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   798: aload_0         /* this */
        //   799: getfield        gg/essential/gui/menu/LeftSideBar.sale:Lgg/essential/elementa/state/MappedState;
        //   802: getstatic       gg/essential/gui/menu/LeftSideBar$saleName$1.INSTANCE:Lgg/essential/gui/menu/LeftSideBar$saleName$1;
        //   805: checkcast       Lkotlin/jvm/functions/Function1;
        //   808: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   811: astore          saleName
        //   813: aload_0         /* this */
        //   814: checkcast       Lgg/essential/elementa/UIComponent;
        //   817: new             Lgg/essential/gui/menu/LeftSideBar$saleExpires$1;
        //   820: dup            
        //   821: aload_0         /* this */
        //   822: invokespecial   gg/essential/gui/menu/LeftSideBar$saleExpires$1.<init>:(Lgg/essential/gui/menu/LeftSideBar;)V
        //   825: checkcast       Lkotlin/jvm/functions/Function0;
        //   828: invokestatic    gg/essential/util/ExtensionsKt.pollingState$default$a9b5a09$5bde5825:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //   831: astore          saleExpires
        //   833: new             Lgg/essential/gui/common/NoticeFlag;
        //   836: dup            
        //   837: aload           isCompact
        //   839: aload_0         /* this */
        //   840: getfield        gg/essential/gui/menu/LeftSideBar.isFakeSale:Lgg/essential/elementa/state/MappedState;
        //   843: checkcast       Lgg/essential/elementa/state/State;
        //   846: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   849: getstatic       gg/essential/gui/menu/LeftSideBar$3.INSTANCE:Lgg/essential/gui/menu/LeftSideBar$3;
        //   852: checkcast       Lkotlin/jvm/functions/Function1;
        //   855: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   858: checkcast       Lgg/essential/elementa/state/State;
        //   861: aload           isCompact
        //   863: getstatic       gg/essential/gui/menu/LeftSideBar$4.INSTANCE:Lgg/essential/gui/menu/LeftSideBar$4;
        //   866: checkcast       Lkotlin/jvm/functions/Function1;
        //   869: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   872: checkcast       Lgg/essential/elementa/state/State;
        //   875: iconst_2       
        //   876: anewarray       Lgg/essential/elementa/state/State;
        //   879: astore          12
        //   881: aload           12
        //   883: iconst_0       
        //   884: aload           saleName
        //   886: checkcast       Lgg/essential/elementa/state/State;
        //   889: aastore        
        //   890: aload           12
        //   892: iconst_1       
        //   893: aload           saleExpires
        //   895: aastore        
        //   896: aload           12
        //   898: invokespecial   gg/essential/gui/common/NoticeFlag.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;[Lgg/essential/elementa/state/State;)V
        //   901: checkcast       Lgg/essential/elementa/UIComponent;
        //   904: astore          $this$constrain$iv
        //   906: aload           $this$constrain$iv
        //   908: astore          14
        //   910: aload           14
        //   912: astore          $this$constrain_u24lambda_u2d0$iv
        //   914: aload           $this$constrain_u24lambda_u2d0$iv
        //   916: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   919: astore          $this$_init__u24lambda_u2d5
        //   921: aload           $this$_init__u24lambda_u2d5
        //   923: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   926: dup            
        //   927: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   930: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   933: aload_0         /* this */
        //   934: invokespecial   gg/essential/gui/menu/LeftSideBar.getWardrobeButton:()Lgg/essential/gui/common/MenuButton;
        //   937: checkcast       Lgg/essential/elementa/UIComponent;
        //   940: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   943: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   946: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   949: aload           $this$_init__u24lambda_u2d5
        //   951: aload           $this$_init__u24lambda_u2d5
        //   953: invokevirtual   gg/essential/elementa/UIConstraints.getHeight:()Lgg/essential/elementa/constraints/HeightConstraint;
        //   956: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   959: iconst_1       
        //   960: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   963: checkcast       Ljava/lang/Number;
        //   966: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   969: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   972: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   975: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   978: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   981: aload           14
        //   983: aload           isCompact
        //   985: new             Lgg/essential/gui/menu/LeftSideBar$6;
        //   988: dup            
        //   989: aload_0         /* this */
        //   990: invokespecial   gg/essential/gui/menu/LeftSideBar$6.<init>:(Lgg/essential/gui/menu/LeftSideBar;)V
        //   993: checkcast       Lkotlin/jvm/functions/Function2;
        //   996: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   999: astore          $this$onLeftClick$iv
        //  1001: aload           $this$onLeftClick$iv
        //  1003: new             Lgg/essential/gui/menu/LeftSideBar$special$$inlined$onLeftClick$1;
        //  1006: dup            
        //  1007: aload_0         /* this */
        //  1008: invokespecial   gg/essential/gui/menu/LeftSideBar$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/menu/LeftSideBar;)V
        //  1011: checkcast       Lkotlin/jvm/functions/Function2;
        //  1014: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1017: aload_0         /* this */
        //  1018: checkcast       Lgg/essential/elementa/UIComponent;
        //  1021: aload_0         /* this */
        //  1022: getfield        gg/essential/gui/menu/LeftSideBar.isSale:Lgg/essential/elementa/state/MappedState;
        //  1025: checkcast       Lgg/essential/elementa/state/State;
        //  1028: aload           collapsed
        //  1030: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1033: checkcast       Lgg/essential/elementa/state/State;
        //  1036: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1039: checkcast       Lgg/essential/elementa/state/State;
        //  1042: aload_3         /* menuVisible */
        //  1043: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1046: checkcast       Lgg/essential/elementa/state/State;
        //  1049: iconst_0       
        //  1050: aconst_null    
        //  1051: bipush          12
        //  1053: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  1056: pop            
        //  1057: aload_0         /* this */
        //  1058: checkcast       Lgg/essential/elementa/UIComponent;
        //  1061: getstatic       gg/essential/gui/menu/LeftSideBar$notExpired$1.INSTANCE:Lgg/essential/gui/menu/LeftSideBar$notExpired$1;
        //  1064: checkcast       Lkotlin/jvm/functions/Function0;
        //  1067: invokestatic    gg/essential/util/ExtensionsKt.pollingState$default$a9b5a09$5bde5825:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //  1070: astore          notExpired
        //  1072: new             Lgg/essential/gui/common/NoticeFlag;
        //  1075: dup            
        //  1076: new             Lgg/essential/elementa/state/BasicState;
        //  1079: dup            
        //  1080: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //  1083: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getGREEN:()Lgg/essential/gui/common/MenuButton$Style;
        //  1086: aconst_null    
        //  1087: aconst_null    
        //  1088: aconst_null    
        //  1089: iconst_3       
        //  1090: anewarray       Lgg/essential/elementa/effects/OutlineEffect$Side;
        //  1093: astore          14
        //  1095: aload           14
        //  1097: iconst_0       
        //  1098: getstatic       gg/essential/elementa/effects/OutlineEffect$Side.Top:Lgg/essential/elementa/effects/OutlineEffect$Side;
        //  1101: aastore        
        //  1102: aload           14
        //  1104: iconst_1       
        //  1105: getstatic       gg/essential/elementa/effects/OutlineEffect$Side.Left:Lgg/essential/elementa/effects/OutlineEffect$Side;
        //  1108: aastore        
        //  1109: aload           14
        //  1111: iconst_2       
        //  1112: getstatic       gg/essential/elementa/effects/OutlineEffect$Side.Right:Lgg/essential/elementa/effects/OutlineEffect$Side;
        //  1115: aastore        
        //  1116: aload           14
        //  1118: invokestatic    kotlin/collections/SetsKt.setOf:([Ljava/lang/Object;)Ljava/util/Set;
        //  1121: bipush          7
        //  1123: invokestatic    gg/essential/gui/common/MenuButton$Style.copy$default$562a9903:(Lgg/essential/gui/common/MenuButton$Style;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/util/Set;I)Lgg/essential/gui/common/MenuButton$Style;
        //  1126: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1129: checkcast       Lgg/essential/elementa/state/State;
        //  1132: getstatic       gg/essential/gui/common/MenuButton$Alignment.CENTER:Lgg/essential/gui/common/MenuButton$Alignment;
        //  1135: iconst_1       
        //  1136: anewarray       Lgg/essential/elementa/state/State;
        //  1139: astore          14
        //  1141: aload           14
        //  1143: iconst_0       
        //  1144: new             Lgg/essential/elementa/state/BasicState;
        //  1147: dup            
        //  1148: ldc_w           "FREE CAPE"
        //  1151: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1154: checkcast       Lgg/essential/elementa/state/State;
        //  1157: aastore        
        //  1158: aload           14
        //  1160: invokespecial   gg/essential/gui/common/NoticeFlag.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;[Lgg/essential/elementa/state/State;)V
        //  1163: checkcast       Lgg/essential/elementa/UIComponent;
        //  1166: astore          $this$constrain$iv
        //  1168: aload           $this$constrain$iv
        //  1170: astore          16
        //  1172: aload           16
        //  1174: astore          $this$constrain_u24lambda_u2d0$iv
        //  1176: aload           $this$constrain_u24lambda_u2d0$iv
        //  1178: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1181: astore          $this$_init__u24lambda_u2d7
        //  1183: aload           $this$_init__u24lambda_u2d7
        //  1185: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1188: dup            
        //  1189: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1192: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1195: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1198: aload           $this$_init__u24lambda_u2d7
        //  1200: iconst_0       
        //  1201: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1204: checkcast       Ljava/lang/Number;
        //  1207: iconst_0       
        //  1208: iconst_1       
        //  1209: iconst_1       
        //  1210: aconst_null    
        //  1211: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1214: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1217: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1220: aload           $this$_init__u24lambda_u2d7
        //  1222: bipush          100
        //  1224: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1227: checkcast       Ljava/lang/Number;
        //  1230: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1233: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1236: aload_0         /* this */
        //  1237: invokespecial   gg/essential/gui/menu/LeftSideBar.getWardrobeButton:()Lgg/essential/gui/common/MenuButton;
        //  1240: checkcast       Lgg/essential/elementa/UIComponent;
        //  1243: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1246: iconst_2       
        //  1247: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1250: checkcast       Ljava/lang/Number;
        //  1253: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1256: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1259: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  1262: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1265: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1268: aload           $this$_init__u24lambda_u2d7
        //  1270: aload           $this$_init__u24lambda_u2d7
        //  1272: invokevirtual   gg/essential/elementa/UIConstraints.getHeight:()Lgg/essential/elementa/constraints/HeightConstraint;
        //  1275: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1278: iconst_1       
        //  1279: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1282: checkcast       Ljava/lang/Number;
        //  1285: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1288: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1291: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1294: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1297: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1300: aload           16
        //  1302: astore          $this$onLeftClick$iv
        //  1304: aload           $this$onLeftClick$iv
        //  1306: new             Lgg/essential/gui/menu/LeftSideBar$special$$inlined$onLeftClick$2;
        //  1309: dup            
        //  1310: aload_0         /* this */
        //  1311: invokespecial   gg/essential/gui/menu/LeftSideBar$special$$inlined$onLeftClick$2.<init>:(Lgg/essential/gui/menu/LeftSideBar;)V
        //  1314: checkcast       Lkotlin/jvm/functions/Function2;
        //  1317: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1320: aload_0         /* this */
        //  1321: invokespecial   gg/essential/gui/menu/LeftSideBar.getWardrobeButton:()Lgg/essential/gui/common/MenuButton;
        //  1324: checkcast       Lgg/essential/elementa/UIComponent;
        //  1327: aload           notExpired
        //  1329: aload           collapsed
        //  1331: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1334: checkcast       Lgg/essential/elementa/state/State;
        //  1337: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1340: checkcast       Lgg/essential/elementa/state/State;
        //  1343: aload           isCompact
        //  1345: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1348: checkcast       Lgg/essential/elementa/state/State;
        //  1351: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1354: checkcast       Lgg/essential/elementa/state/State;
        //  1357: iconst_0       
        //  1358: aconst_null    
        //  1359: bipush          12
        //  1361: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  1364: aconst_null    
        //  1365: getstatic       gg/essential/gui/menu/LeftSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1368: iconst_3       
        //  1369: aaload         
        //  1370: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1373: astore          announcementFlag$delegate
        //  1375: getstatic       gg/essential/gui/EssentialPalette.STAR_4X3:Lgg/essential/gui/image/ImageFactory;
        //  1378: invokevirtual   gg/essential/gui/image/ImageFactory.create:()Lgg/essential/elementa/components/UIImage;
        //  1381: checkcast       Lgg/essential/elementa/UIComponent;
        //  1384: astore          $this$constrain$iv
        //  1386: aload           $this$constrain$iv
        //  1388: astore          17
        //  1390: aload           17
        //  1392: astore          $this$constrain_u24lambda_u2d0$iv
        //  1394: aload           $this$constrain_u24lambda_u2d0$iv
        //  1396: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1399: astore          $this$_init__u24lambda_u2d10
        //  1401: aload           $this$_init__u24lambda_u2d10
        //  1403: iconst_4       
        //  1404: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1407: checkcast       Ljava/lang/Number;
        //  1410: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1413: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1416: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1419: aload           $this$_init__u24lambda_u2d10
        //  1421: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1424: dup            
        //  1425: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1428: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1431: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1434: aload           17
        //  1436: new             Lgg/essential/gui/common/shadow/ShadowEffect;
        //  1439: dup            
        //  1440: iconst_0       
        //  1441: invokespecial   gg/essential/gui/common/shadow/ShadowEffect.<init>:(B)V
        //  1444: checkcast       Lgg/essential/elementa/effects/Effect;
        //  1447: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //  1450: aload           announcementFlag$delegate
        //  1452: invokestatic    gg/essential/gui/menu/LeftSideBar._init_$lambda-9:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //  1455: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1458: aconst_null    
        //  1459: getstatic       gg/essential/gui/menu/LeftSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1462: iconst_4       
        //  1463: aaload         
        //  1464: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1467: astore          starLeft$delegate
        //  1469: aload           starLeft$delegate
        //  1471: invokestatic    gg/essential/gui/menu/LeftSideBar._init_$lambda-11:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIImage;
        //  1474: new             Lgg/essential/gui/common/AutoImageSize;
        //  1477: dup            
        //  1478: aload           starLeft$delegate
        //  1480: invokestatic    gg/essential/gui/menu/LeftSideBar._init_$lambda-11:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIImage;
        //  1483: checkcast       Lgg/essential/elementa/UIComponent;
        //  1486: invokespecial   gg/essential/gui/common/AutoImageSize.<init>:(Lgg/essential/elementa/UIComponent;)V
        //  1489: checkcast       Lgg/essential/elementa/components/image/CacheableImage;
        //  1492: invokevirtual   gg/essential/elementa/components/UIImage.supply:(Lgg/essential/elementa/components/image/CacheableImage;)V
        //  1495: getstatic       gg/essential/gui/EssentialPalette.STAR_4X3:Lgg/essential/gui/image/ImageFactory;
        //  1498: invokevirtual   gg/essential/gui/image/ImageFactory.create:()Lgg/essential/elementa/components/UIImage;
        //  1501: checkcast       Lgg/essential/elementa/UIComponent;
        //  1504: astore          $this$constrain$iv
        //  1506: aload           $this$constrain$iv
        //  1508: astore          18
        //  1510: aload           18
        //  1512: astore          $this$constrain_u24lambda_u2d0$iv
        //  1514: aload           $this$constrain_u24lambda_u2d0$iv
        //  1516: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1519: astore          $this$_init__u24lambda_u2d12
        //  1521: aload           $this$_init__u24lambda_u2d12
        //  1523: iconst_5       
        //  1524: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1527: checkcast       Ljava/lang/Number;
        //  1530: iconst_1       
        //  1531: iconst_0       
        //  1532: iconst_2       
        //  1533: aconst_null    
        //  1534: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1537: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1540: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1543: aload           $this$_init__u24lambda_u2d12
        //  1545: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1548: dup            
        //  1549: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1552: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1555: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1558: aload           18
        //  1560: new             Lgg/essential/gui/common/shadow/ShadowEffect;
        //  1563: dup            
        //  1564: iconst_0       
        //  1565: invokespecial   gg/essential/gui/common/shadow/ShadowEffect.<init>:(B)V
        //  1568: checkcast       Lgg/essential/elementa/effects/Effect;
        //  1571: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //  1574: aload           announcementFlag$delegate
        //  1576: invokestatic    gg/essential/gui/menu/LeftSideBar._init_$lambda-9:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //  1579: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1582: aconst_null    
        //  1583: getstatic       gg/essential/gui/menu/LeftSideBar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1586: iconst_5       
        //  1587: aaload         
        //  1588: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1591: astore          starRight$delegate
        //  1593: aload           starRight$delegate
        //  1595: invokestatic    gg/essential/gui/menu/LeftSideBar._init_$lambda-13:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIImage;
        //  1598: new             Lgg/essential/gui/common/AutoImageSize;
        //  1601: dup            
        //  1602: aload           starRight$delegate
        //  1604: invokestatic    gg/essential/gui/menu/LeftSideBar._init_$lambda-13:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIImage;
        //  1607: checkcast       Lgg/essential/elementa/UIComponent;
        //  1610: invokespecial   gg/essential/gui/common/AutoImageSize.<init>:(Lgg/essential/elementa/UIComponent;)V
        //  1613: checkcast       Lgg/essential/elementa/components/image/CacheableImage;
        //  1616: invokevirtual   gg/essential/elementa/components/UIImage.supply:(Lgg/essential/elementa/components/image/CacheableImage;)V
        //  1619: new             Lgg/essential/gui/common/NoticeFlag;
        //  1622: dup            
        //  1623: new             Lgg/essential/elementa/state/BasicState;
        //  1626: dup            
        //  1627: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //  1630: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getLIGHT_RED:()Lgg/essential/gui/common/MenuButton$Style;
        //  1633: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1636: checkcast       Lgg/essential/elementa/state/State;
        //  1639: getstatic       gg/essential/gui/common/MenuButton$Alignment.CENTER:Lgg/essential/gui/common/MenuButton$Alignment;
        //  1642: iconst_1       
        //  1643: anewarray       Lgg/essential/elementa/state/State;
        //  1646: astore          16
        //  1648: aload           16
        //  1650: iconst_0       
        //  1651: new             Lgg/essential/elementa/state/BasicState;
        //  1654: dup            
        //  1655: ldc_w           "SALE"
        //  1658: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1661: checkcast       Lgg/essential/elementa/state/State;
        //  1664: aastore        
        //  1665: aload           16
        //  1667: invokespecial   gg/essential/gui/common/NoticeFlag.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;[Lgg/essential/elementa/state/State;)V
        //  1670: checkcast       Lgg/essential/elementa/UIComponent;
        //  1673: astore          $this$constrain$iv
        //  1675: aload           $this$constrain$iv
        //  1677: astore          18
        //  1679: aload           18
        //  1681: astore          $this$constrain_u24lambda_u2d0$iv
        //  1683: aload           $this$constrain_u24lambda_u2d0$iv
        //  1685: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1688: astore          $this$_init__u24lambda_u2d14
        //  1690: aload           $this$_init__u24lambda_u2d14
        //  1692: iconst_3       
        //  1693: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1696: checkcast       Ljava/lang/Number;
        //  1699: iconst_1       
        //  1700: iconst_1       
        //  1701: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1704: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1707: aload_0         /* this */
        //  1708: invokespecial   gg/essential/gui/menu/LeftSideBar.getWardrobeButton:()Lgg/essential/gui/common/MenuButton;
        //  1711: checkcast       Lgg/essential/elementa/UIComponent;
        //  1714: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1717: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1720: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1723: aload           $this$_init__u24lambda_u2d14
        //  1725: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1728: dup            
        //  1729: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1732: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1735: aload_0         /* this */
        //  1736: invokespecial   gg/essential/gui/menu/LeftSideBar.getWardrobeButton:()Lgg/essential/gui/common/MenuButton;
        //  1739: checkcast       Lgg/essential/elementa/UIComponent;
        //  1742: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1745: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1748: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1751: aload           18
        //  1753: astore          $this$onLeftClick$iv
        //  1755: aload           $this$onLeftClick$iv
        //  1757: new             Lgg/essential/gui/menu/LeftSideBar$special$$inlined$onLeftClick$3;
        //  1760: dup            
        //  1761: aload_0         /* this */
        //  1762: invokespecial   gg/essential/gui/menu/LeftSideBar$special$$inlined$onLeftClick$3.<init>:(Lgg/essential/gui/menu/LeftSideBar;)V
        //  1765: checkcast       Lkotlin/jvm/functions/Function2;
        //  1768: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1771: aload           leftContainer
        //  1773: checkcast       Lgg/essential/elementa/UIComponent;
        //  1776: aload_0         /* this */
        //  1777: getfield        gg/essential/gui/menu/LeftSideBar.isSale:Lgg/essential/elementa/state/MappedState;
        //  1780: checkcast       Lgg/essential/elementa/state/State;
        //  1783: aload           collapsed
        //  1785: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1788: checkcast       Lgg/essential/elementa/state/State;
        //  1791: aload_0         /* this */
        //  1792: getfield        gg/essential/gui/menu/LeftSideBar.isFakeSale:Lgg/essential/elementa/state/MappedState;
        //  1795: checkcast       Lgg/essential/elementa/state/State;
        //  1798: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1801: checkcast       Lgg/essential/elementa/state/State;
        //  1804: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1807: checkcast       Lgg/essential/elementa/state/State;
        //  1810: aload_3         /* menuVisible */
        //  1811: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1814: checkcast       Lgg/essential/elementa/state/State;
        //  1817: iconst_1       
        //  1818: aconst_null    
        //  1819: bipush          8
        //  1821: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  1824: pop            
        //  1825: aload_0         /* this */
        //  1826: getfield        gg/essential/gui/menu/LeftSideBar.isSale:Lgg/essential/elementa/state/MappedState;
        //  1829: aload_0         /* this */
        //  1830: getfield        gg/essential/gui/menu/LeftSideBar.menuSize:Lgg/essential/elementa/state/State;
        //  1833: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //  1836: getstatic       gg/essential/gui/menu/LeftSideBar$newFlagVisible$1.INSTANCE:Lgg/essential/gui/menu/LeftSideBar$newFlagVisible$1;
        //  1839: checkcast       Lkotlin/jvm/functions/Function1;
        //  1842: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1845: astore          newFlagVisible
        //  1847: new             Lgg/essential/gui/common/NoticeFlag;
        //  1850: dup            
        //  1851: new             Lgg/essential/elementa/state/BasicState;
        //  1854: dup            
        //  1855: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //  1858: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getGREEN:()Lgg/essential/gui/common/MenuButton$Style;
        //  1861: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1864: checkcast       Lgg/essential/elementa/state/State;
        //  1867: getstatic       gg/essential/gui/common/MenuButton$Alignment.CENTER:Lgg/essential/gui/common/MenuButton$Alignment;
        //  1870: iconst_1       
        //  1871: anewarray       Lgg/essential/elementa/state/State;
        //  1874: astore          17
        //  1876: aload           17
        //  1878: iconst_0       
        //  1879: new             Lgg/essential/elementa/state/BasicState;
        //  1882: dup            
        //  1883: ldc_w           "NEW"
        //  1886: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1889: checkcast       Lgg/essential/elementa/state/State;
        //  1892: aastore        
        //  1893: aload           17
        //  1895: invokespecial   gg/essential/gui/common/NoticeFlag.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;[Lgg/essential/elementa/state/State;)V
        //  1898: checkcast       Lgg/essential/elementa/UIComponent;
        //  1901: aload           isCompact
        //  1903: new             Lgg/essential/gui/menu/LeftSideBar$10;
        //  1906: dup            
        //  1907: aload_0         /* this */
        //  1908: invokespecial   gg/essential/gui/menu/LeftSideBar$10.<init>:(Lgg/essential/gui/menu/LeftSideBar;)V
        //  1911: checkcast       Lkotlin/jvm/functions/Function2;
        //  1914: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1917: astore          $this$onLeftClick$iv
        //  1919: aload           $this$onLeftClick$iv
        //  1921: new             Lgg/essential/gui/menu/LeftSideBar$special$$inlined$onLeftClick$4;
        //  1924: dup            
        //  1925: aload_0         /* this */
        //  1926: invokespecial   gg/essential/gui/menu/LeftSideBar$special$$inlined$onLeftClick$4.<init>:(Lgg/essential/gui/menu/LeftSideBar;)V
        //  1929: checkcast       Lkotlin/jvm/functions/Function2;
        //  1932: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1935: aload           leftContainer
        //  1937: checkcast       Lgg/essential/elementa/UIComponent;
        //  1940: aload_0         /* this */
        //  1941: getfield        gg/essential/gui/menu/LeftSideBar.connectionManager:Lgg/essential/network/connectionmanager/ConnectionManager;
        //  1944: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getNoticesManager:()Lgg/essential/network/connectionmanager/notices/NoticesManager;
        //  1947: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager.getCosmeticNotices:()Lgg/essential/network/connectionmanager/notices/NoticesManager$CosmeticNotices;
        //  1950: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager$CosmeticNotices.getHasAnyNewCosmetics:()Lgg/essential/elementa/state/State;
        //  1953: dup            
        //  1954: ldc_w           "connectionManager.notice\u2026otices.hasAnyNewCosmetics"
        //  1957: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1960: aload           newFlagVisible
        //  1962: checkcast       Lgg/essential/elementa/state/State;
        //  1965: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1968: checkcast       Lgg/essential/elementa/state/State;
        //  1971: aload_3         /* menuVisible */
        //  1972: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1975: checkcast       Lgg/essential/elementa/state/State;
        //  1978: iconst_1       
        //  1979: aconst_null    
        //  1980: bipush          8
        //  1982: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  1985: pop            
        //  1986: return         
        //    Signature:
        //  (Lgg/essential/elementa/components/UIContainer;Lgg/essential/elementa/components/UIContainer;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;Lgg/essential/handlers/PauseMenuDisplay$MenuType;Lgg/essential/elementa/components/UIContainer;Lgg/essential/elementa/components/UIContainer;Lgg/essential/gui/menu/AccountManager;)V
        //    MethodParameters:
        //  Name            Flags  
        //  --------------  -----
        //  topButton       
        //  bottomButton    
        //  menuVisible     
        //  collapsed       
        //  isCompact       
        //  menuType        
        //  rightSideBar    
        //  leftContainer   
        //  accountManager  
        //    StackMapTable: 00 02 FF 00 FC 00 09 07 00 02 00 00 07 00 AD 07 00 AD 07 00 AD 00 07 00 04 07 00 04 00 06 07 00 02 07 00 CE 07 00 CE 07 00 AD 08 00 EC 08 00 EC FF 00 00 00 09 07 00 02 00 00 07 00 AD 07 00 AD 07 00 AD 00 07 00 04 07 00 04 00 07 07 00 02 07 00 CE 07 00 CE 07 00 AD 08 00 EC 08 00 EC 01
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIContainer getPlayerWardrobeContainer() {
        return (UIContainer)this.playerWardrobeContainer$delegate.getValue((Object)this, (KProperty)LeftSideBar.$$delegatedProperties[0]);
    }
    
    private final EmulatedUI3DPlayer getPlayer() {
        return (EmulatedUI3DPlayer)this.player$delegate.getValue((Object)this, (KProperty)LeftSideBar.$$delegatedProperties[1]);
    }
    
    private final MenuButton getWardrobeButton() {
        return (MenuButton)this.wardrobeButton$delegate.getValue((Object)this, (KProperty)LeftSideBar.$$delegatedProperties[2]);
    }
    
    private static final UIComponent _init_$lambda-9(final ReadWriteProperty<Object, UIComponent> $announcementFlag$delegate) {
        return (UIComponent)$announcementFlag$delegate.getValue((Object)null, (KProperty)LeftSideBar.$$delegatedProperties[3]);
    }
    
    private static final UIImage _init_$lambda-11(final ReadWriteProperty<Object, UIImage> $starLeft$delegate) {
        return (UIImage)$starLeft$delegate.getValue((Object)null, (KProperty)LeftSideBar.$$delegatedProperties[4]);
    }
    
    private static final UIImage _init_$lambda-13(final ReadWriteProperty<Object, UIImage> $starRight$delegate) {
        return (UIImage)$starRight$delegate.getValue((Object)null, (KProperty)LeftSideBar.$$delegatedProperties[5]);
    }
    
    public static final /* synthetic */ MenuButton access$getWardrobeButton(final LeftSideBar $this) {
        return $this.getWardrobeButton();
    }
    
    public static final /* synthetic */ UIContainer access$getBottomButton$p(final LeftSideBar $this) {
        return $this.bottomButton;
    }
    
    public static final /* synthetic */ UIContainer access$getTopButton$p(final LeftSideBar $this) {
        return $this.topButton;
    }
    
    public static final /* synthetic */ EmulatedUI3DPlayer access$getPlayer(final LeftSideBar $this) {
        return $this.getPlayer();
    }
    
    public static final /* synthetic */ FullAccountSwitcher access$getAccountSwitcher$p(final LeftSideBar $this) {
        return $this.accountSwitcher;
    }
    
    public static final /* synthetic */ MappedState access$getSale$p(final LeftSideBar $this) {
        return $this.sale;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)LeftSideBar.class, "playerWardrobeContainer", "getPlayerWardrobeContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)LeftSideBar.class, "player", "getPlayer()Lgg/essential/gui/common/EmulatedUI3DPlayer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)LeftSideBar.class, "wardrobeButton", "getWardrobeButton()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)LeftSideBar.class, "announcementFlag", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)LeftSideBar.class, "starLeft", "<v#1>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)LeftSideBar.class, "starRight", "<v#2>", 0)) };
    }
}
