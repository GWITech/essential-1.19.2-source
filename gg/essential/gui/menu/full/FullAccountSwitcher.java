package gg.essential.gui.menu.full;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.state.*;
import net.minecraft.client.util.*;
import gg.essential.elementa.utils.*;
import gg.essential.gui.menu.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000V
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   \u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020	0\u0003\u0012\u0006\u0010
                                                   \u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u000e\u0010
                                                   \u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\r\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020	0\u0013X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b"\u0010\u0011\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010&\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b(\u0010\u0011\u001a\u0004\b'\u0010\u001cR\u001b\u0010)\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b+\u0010\u0011\u001a\u0004\b*\u0010\u001cR\u001b\u0010,\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b.\u0010\u0011\u001a\u0004\b-\u0010\u000f¨\u0006/""" }, d2 = { "Lgg/essential/gui/menu/full/FullAccountSwitcher;", "Lgg/essential/elementa/components/UIContainer;", "activeSession", "Lgg/essential/elementa/state/State;", "Lnet/minecraft/client/util/Session;", "accountsList", "Lgg/essential/elementa/utils/ObservableList;", "Lgg/essential/gui/menu/AccountManager$AccountInfo;", "collapsed", "", "accountManager", "Lgg/essential/gui/menu/AccountManager;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/utils/ObservableList;Lgg/essential/elementa/state/State;Lgg/essential/gui/menu/AccountManager;)V", "accountsContainer", "getAccountsContainer", "()Lgg/essential/elementa/components/UIContainer;", "accountsContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "accountsExpanded", "Lgg/essential/elementa/state/BasicState;", "accountsScroller", "Lgg/essential/elementa/components/ScrollComponent;", "getAccountsScroller", "()Lgg/essential/elementa/components/ScrollComponent;", "accountsScroller$delegate", "addAccountButton", "Lgg/essential/gui/common/MenuButton;", "getAddAccountButton", "()Lgg/essential/gui/common/MenuButton;", "addAccountButton$delegate", "buttonContainer", "Lgg/essential/elementa/UIComponent;", "getButtonContainer", "()Lgg/essential/elementa/UIComponent;", "buttonContainer$delegate", "buttonStyle", "Lgg/essential/elementa/state/MappedState;", "Lgg/essential/gui/common/MenuButton$Style;", "collapseButton", "getCollapseButton", "collapseButton$delegate", "mainButton", "getMainButton", "mainButton$delegate", "scrollBoundingBox", "getScrollBoundingBox", "scrollBoundingBox$delegate", "essential" })
public final class FullAccountSwitcher extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final AccountManager accountManager;
    @NotNull
    private final BasicState<Boolean> accountsExpanded;
    @NotNull
    private final ReadWriteProperty buttonContainer$delegate;
    @NotNull
    private final MappedState<Boolean, MenuButton.Style> buttonStyle;
    @NotNull
    private final ReadWriteProperty mainButton$delegate;
    @NotNull
    private final ReadWriteProperty scrollBoundingBox$delegate;
    @NotNull
    private final ReadWriteProperty accountsScroller$delegate;
    @NotNull
    private final ReadWriteProperty accountsContainer$delegate;
    @NotNull
    private final ReadWriteProperty addAccountButton$delegate;
    
    public FullAccountSwitcher(@NotNull final State<Session> activeSession, @NotNull final ObservableList<AccountManager$AccountInfo> accountsList, @NotNull final State<Boolean> collapsed, @NotNull final AccountManager accountManager) {
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
        //    12: aload_3         /* collapsed */
        //    13: ldc             "collapsed"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           accountManager
        //    20: ldc             "accountManager"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload_0         /* this */
        //    26: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    29: aload_0         /* this */
        //    30: aload           accountManager
        //    32: putfield        gg/essential/gui/menu/full/FullAccountSwitcher.accountManager:Lgg/essential/gui/menu/AccountManager;
        //    35: aload_0         /* this */
        //    36: new             Lgg/essential/elementa/state/BasicState;
        //    39: dup            
        //    40: iconst_0       
        //    41: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    44: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    47: putfield        gg/essential/gui/menu/full/FullAccountSwitcher.accountsExpanded:Lgg/essential/elementa/state/BasicState;
        //    50: aload_0         /* this */
        //    51: new             Lgg/essential/elementa/components/UIContainer;
        //    54: dup            
        //    55: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    58: checkcast       Lgg/essential/elementa/UIComponent;
        //    61: astore          $this$constrain$iv
        //    63: aload           $this$constrain$iv
        //    65: astore          6
        //    67: aload           6
        //    69: astore          $this$constrain_u24lambda_u2d0$iv
        //    71: aload           $this$constrain_u24lambda_u2d0$iv
        //    73: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    76: astore          8
        //    78: astore          12
        //    80: aload           $this$buttonContainer_delegate_u24lambda_u2d0
        //    82: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //    85: dup            
        //    86: fconst_0       
        //    87: iconst_1       
        //    88: aconst_null    
        //    89: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    92: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    95: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    98: aload           $this$buttonContainer_delegate_u24lambda_u2d0
        //   100: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   103: dup            
        //   104: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   107: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   110: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   113: aload           12
        //   115: aload           6
        //   117: astore          $this$onLeftClick$iv
        //   119: aload           $this$onLeftClick$iv
        //   121: new             Lgg/essential/gui/menu/full/FullAccountSwitcher$special$$inlined$onLeftClick$1;
        //   124: dup            
        //   125: aload_0         /* this */
        //   126: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/menu/full/FullAccountSwitcher;)V
        //   129: checkcast       Lkotlin/jvm/functions/Function2;
        //   132: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   135: aload_0         /* this */
        //   136: checkcast       Lgg/essential/elementa/UIComponent;
        //   139: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   142: aload_0         /* this */
        //   143: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   146: iconst_0       
        //   147: aaload         
        //   148: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   151: putfield        gg/essential/gui/menu/full/FullAccountSwitcher.buttonContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   154: aload_0         /* this */
        //   155: aload_0         /* this */
        //   156: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher.getButtonContainer:()Lgg/essential/elementa/UIComponent;
        //   159: iconst_0       
        //   160: iconst_0       
        //   161: iconst_3       
        //   162: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   165: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher$buttonStyle$1.INSTANCE:Lgg/essential/gui/menu/full/FullAccountSwitcher$buttonStyle$1;
        //   168: checkcast       Lkotlin/jvm/functions/Function1;
        //   171: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   174: putfield        gg/essential/gui/menu/full/FullAccountSwitcher.buttonStyle:Lgg/essential/elementa/state/MappedState;
        //   177: aload_0         /* this */
        //   178: new             Lgg/essential/gui/common/MenuButton;
        //   181: dup            
        //   182: aload_1         /* activeSession */
        //   183: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher$mainButton$2.INSTANCE:Lgg/essential/gui/menu/full/FullAccountSwitcher$mainButton$2;
        //   186: checkcast       Lkotlin/jvm/functions/Function1;
        //   189: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   192: checkcast       Lgg/essential/elementa/state/State;
        //   195: aload_0         /* this */
        //   196: getfield        gg/essential/gui/menu/full/FullAccountSwitcher.buttonStyle:Lgg/essential/elementa/state/MappedState;
        //   199: checkcast       Lgg/essential/elementa/state/State;
        //   202: aload_0         /* this */
        //   203: getfield        gg/essential/gui/menu/full/FullAccountSwitcher.buttonStyle:Lgg/essential/elementa/state/MappedState;
        //   206: checkcast       Lgg/essential/elementa/state/State;
        //   209: aconst_null    
        //   210: getstatic       gg/essential/gui/common/MenuButton$Alignment.LEFT:Lgg/essential/gui/common/MenuButton$Alignment;
        //   213: fconst_0       
        //   214: aload_1         /* activeSession */
        //   215: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher$mainButton$3.INSTANCE:Lgg/essential/gui/menu/full/FullAccountSwitcher$mainButton$3;
        //   218: checkcast       Lkotlin/jvm/functions/Function1;
        //   221: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   224: checkcast       Lgg/essential/elementa/state/State;
        //   227: iconst_1       
        //   228: iconst_0       
        //   229: aconst_null    
        //   230: sipush          808
        //   233: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //   236: checkcast       Lgg/essential/elementa/UIComponent;
        //   239: astore          $this$constrain$iv
        //   241: aload           $this$constrain$iv
        //   243: astore          6
        //   245: aload           6
        //   247: astore          $this$constrain_u24lambda_u2d0$iv
        //   249: aload           $this$constrain_u24lambda_u2d0$iv
        //   251: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   254: astore          8
        //   256: astore          12
        //   258: aload           $this$mainButton_delegate_u24lambda_u2d2
        //   260: bipush          80
        //   262: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   265: checkcast       Ljava/lang/Number;
        //   268: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   271: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   274: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   277: aload           $this$mainButton_delegate_u24lambda_u2d2
        //   279: bipush          20
        //   281: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   284: checkcast       Ljava/lang/Number;
        //   287: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   290: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   293: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   296: aload           12
        //   298: aload           6
        //   300: checkcast       Lgg/essential/gui/common/MenuButton;
        //   303: aload_1         /* activeSession */
        //   304: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher$mainButton$5.INSTANCE:Lgg/essential/gui/menu/full/FullAccountSwitcher$mainButton$5;
        //   307: checkcast       Lkotlin/jvm/functions/Function1;
        //   310: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   313: checkcast       Lgg/essential/elementa/state/State;
        //   316: iconst_0       
        //   317: aconst_null    
        //   318: ldc             8.0
        //   320: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   323: ldc             8.0
        //   325: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   328: fconst_0       
        //   329: fconst_0       
        //   330: aconst_null    
        //   331: sipush          230
        //   334: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //   337: aload_3         /* collapsed */
        //   338: ldc             50.0
        //   340: invokestatic    gg/essential/gui/common/MenuButton.bindCollapsed$default$3bcddc2a$24867a06:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;F)Lgg/essential/gui/common/MenuButton;
        //   343: checkcast       Lgg/essential/elementa/UIComponent;
        //   346: aload_0         /* this */
        //   347: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher.getButtonContainer:()Lgg/essential/elementa/UIComponent;
        //   350: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   353: aload_0         /* this */
        //   354: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   357: iconst_1       
        //   358: aaload         
        //   359: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   362: putfield        gg/essential/gui/menu/full/FullAccountSwitcher.mainButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //   365: new             Lgg/essential/gui/common/MenuButton;
        //   368: dup            
        //   369: aconst_null    
        //   370: aload_0         /* this */
        //   371: getfield        gg/essential/gui/menu/full/FullAccountSwitcher.buttonStyle:Lgg/essential/elementa/state/MappedState;
        //   374: checkcast       Lgg/essential/elementa/state/State;
        //   377: aload_0         /* this */
        //   378: getfield        gg/essential/gui/menu/full/FullAccountSwitcher.buttonStyle:Lgg/essential/elementa/state/MappedState;
        //   381: checkcast       Lgg/essential/elementa/state/State;
        //   384: aconst_null    
        //   385: aconst_null    
        //   386: aconst_null    
        //   387: iconst_0       
        //   388: iconst_0       
        //   389: aconst_null    
        //   390: sipush          1017
        //   393: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Ljava/lang/String;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;Lgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //   396: checkcast       Lgg/essential/elementa/UIComponent;
        //   399: astore          $this$constrain$iv
        //   401: aload           $this$constrain$iv
        //   403: astore          6
        //   405: aload           6
        //   407: astore          $this$constrain_u24lambda_u2d0$iv
        //   409: aload           $this$constrain_u24lambda_u2d0$iv
        //   411: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   414: astore          $this$collapseButton_delegate_u24lambda_u2d3
        //   416: aload           $this$collapseButton_delegate_u24lambda_u2d3
        //   418: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   421: dup            
        //   422: ldc             -1.0
        //   424: iconst_0       
        //   425: iconst_2       
        //   426: aconst_null    
        //   427: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   430: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   433: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   436: aload           $this$collapseButton_delegate_u24lambda_u2d3
        //   438: bipush          14
        //   440: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   443: checkcast       Ljava/lang/Number;
        //   446: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   449: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   452: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   455: aload           $this$collapseButton_delegate_u24lambda_u2d3
        //   457: bipush          20
        //   459: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   462: checkcast       Ljava/lang/Number;
        //   465: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   468: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   471: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   474: aload           6
        //   476: checkcast       Lgg/essential/gui/common/MenuButton;
        //   479: aload_0         /* this */
        //   480: getfield        gg/essential/gui/menu/full/FullAccountSwitcher.accountsExpanded:Lgg/essential/elementa/state/BasicState;
        //   483: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher$collapseButton$3.INSTANCE:Lgg/essential/gui/menu/full/FullAccountSwitcher$collapseButton$3;
        //   486: checkcast       Lkotlin/jvm/functions/Function1;
        //   489: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   492: checkcast       Lgg/essential/elementa/state/State;
        //   495: iconst_0       
        //   496: aconst_null    
        //   497: aconst_null    
        //   498: aconst_null    
        //   499: fconst_0       
        //   500: fconst_0       
        //   501: aconst_null    
        //   502: sipush          254
        //   505: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //   508: checkcast       Lgg/essential/elementa/UIComponent;
        //   511: aload_0         /* this */
        //   512: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher.getButtonContainer:()Lgg/essential/elementa/UIComponent;
        //   515: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   518: aload_0         /* this */
        //   519: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   522: iconst_2       
        //   523: aaload         
        //   524: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   527: pop            
        //   528: aload_0         /* this */
        //   529: new             Lgg/essential/elementa/components/UIContainer;
        //   532: dup            
        //   533: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   536: checkcast       Lgg/essential/elementa/UIComponent;
        //   539: astore          $this$constrain$iv
        //   541: aload           $this$constrain$iv
        //   543: astore          6
        //   545: aload           6
        //   547: astore          $this$constrain_u24lambda_u2d0$iv
        //   549: aload           $this$constrain_u24lambda_u2d0$iv
        //   551: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   554: astore          8
        //   556: astore          12
        //   558: aload           $this$scrollBoundingBox_delegate_u24lambda_u2d4
        //   560: iconst_0       
        //   561: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   564: checkcast       Ljava/lang/Number;
        //   567: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   570: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   573: aload_0         /* this */
        //   574: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher.getMainButton:()Lgg/essential/gui/common/MenuButton;
        //   577: checkcast       Lgg/essential/elementa/UIComponent;
        //   580: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   583: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   586: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   589: aload           $this$scrollBoundingBox_delegate_u24lambda_u2d4
        //   591: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   594: dup            
        //   595: ldc             -1.0
        //   597: iconst_0       
        //   598: iconst_2       
        //   599: aconst_null    
        //   600: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   603: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   606: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   609: aload           $this$scrollBoundingBox_delegate_u24lambda_u2d4
        //   611: bipush          100
        //   613: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   616: checkcast       Ljava/lang/Number;
        //   619: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   622: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   625: aload_0         /* this */
        //   626: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher.getButtonContainer:()Lgg/essential/elementa/UIComponent;
        //   629: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   632: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   635: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   638: aload           $this$scrollBoundingBox_delegate_u24lambda_u2d4
        //   640: bipush          115
        //   642: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   645: checkcast       Ljava/lang/Number;
        //   648: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   651: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   654: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   657: aload           12
        //   659: aload           6
        //   661: aload_0         /* this */
        //   662: checkcast       Lgg/essential/elementa/UIComponent;
        //   665: aload_0         /* this */
        //   666: getfield        gg/essential/gui/menu/full/FullAccountSwitcher.accountsExpanded:Lgg/essential/elementa/state/BasicState;
        //   669: checkcast       Lgg/essential/elementa/state/State;
        //   672: iconst_0       
        //   673: aconst_null    
        //   674: bipush          12
        //   676: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   679: aload_0         /* this */
        //   680: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   683: iconst_3       
        //   684: aaload         
        //   685: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   688: putfield        gg/essential/gui/menu/full/FullAccountSwitcher.scrollBoundingBox$delegate:Lkotlin/properties/ReadWriteProperty;
        //   691: aload_0         /* this */
        //   692: new             Lgg/essential/elementa/components/ScrollComponent;
        //   695: dup            
        //   696: aconst_null    
        //   697: fconst_0       
        //   698: aconst_null    
        //   699: iconst_0       
        //   700: iconst_0       
        //   701: iconst_0       
        //   702: iconst_0       
        //   703: ldc_w           19.0
        //   706: fconst_0       
        //   707: aconst_null    
        //   708: sipush          895
        //   711: aconst_null    
        //   712: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   715: checkcast       Lgg/essential/elementa/UIComponent;
        //   718: astore          $this$constrain$iv
        //   720: aload           $this$constrain$iv
        //   722: astore          6
        //   724: aload           6
        //   726: astore          $this$constrain_u24lambda_u2d0$iv
        //   728: aload           $this$constrain_u24lambda_u2d0$iv
        //   730: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   733: astore          8
        //   735: astore          12
        //   737: aload           $this$accountsScroller_delegate_u24lambda_u2d5
        //   739: bipush          100
        //   741: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   744: checkcast       Ljava/lang/Number;
        //   747: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   750: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   753: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   756: aload           $this$accountsScroller_delegate_u24lambda_u2d5
        //   758: bipush          100
        //   760: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   763: checkcast       Ljava/lang/Number;
        //   766: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   769: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   772: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   775: aload           12
        //   777: aload           6
        //   779: aload_0         /* this */
        //   780: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher.getScrollBoundingBox:()Lgg/essential/elementa/components/UIContainer;
        //   783: checkcast       Lgg/essential/elementa/UIComponent;
        //   786: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   789: aload_0         /* this */
        //   790: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   793: iconst_4       
        //   794: aaload         
        //   795: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   798: putfield        gg/essential/gui/menu/full/FullAccountSwitcher.accountsScroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //   801: aload_0         /* this */
        //   802: new             Lgg/essential/elementa/components/UIContainer;
        //   805: dup            
        //   806: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   809: checkcast       Lgg/essential/elementa/UIComponent;
        //   812: astore          $this$constrain$iv
        //   814: aload           $this$constrain$iv
        //   816: astore          6
        //   818: aload           6
        //   820: astore          $this$constrain_u24lambda_u2d0$iv
        //   822: aload           $this$constrain_u24lambda_u2d0$iv
        //   824: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   827: astore          8
        //   829: astore          12
        //   831: aload           $this$accountsContainer_delegate_u24lambda_u2d6
        //   833: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   836: dup            
        //   837: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   840: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   843: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   846: aload           $this$accountsContainer_delegate_u24lambda_u2d6
        //   848: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   851: dup            
        //   852: fconst_0       
        //   853: iconst_1       
        //   854: aconst_null    
        //   855: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   858: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   861: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   864: aload           12
        //   866: aload           6
        //   868: aload_0         /* this */
        //   869: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher.getAccountsScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   872: checkcast       Lgg/essential/elementa/UIComponent;
        //   875: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   878: aload_0         /* this */
        //   879: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   882: iconst_5       
        //   883: aaload         
        //   884: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   887: putfield        gg/essential/gui/menu/full/FullAccountSwitcher.accountsContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   890: aload_0         /* this */
        //   891: new             Lgg/essential/elementa/state/BasicState;
        //   894: dup            
        //   895: ldc_w           "Add Account"
        //   898: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   901: checkcast       Lgg/essential/elementa/state/State;
        //   904: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //   907: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getBLUE:()Lgg/essential/gui/common/MenuButton$Style;
        //   910: aconst_null    
        //   911: aconst_null    
        //   912: aconst_null    
        //   913: invokestatic    gg/essential/elementa/effects/OutlineEffect$Side.values:()[Lgg/essential/elementa/effects/OutlineEffect$Side;
        //   916: astore          5
        //   918: astore          17
        //   920: astore          16
        //   922: astore          15
        //   924: astore          14
        //   926: astore          13
        //   928: astore          12
        //   930: aload           $this$filter$iv
        //   932: astore          6
        //   934: new             Ljava/util/ArrayList;
        //   937: dup            
        //   938: invokespecial   java/util/ArrayList.<init>:()V
        //   941: checkcast       Ljava/util/Collection;
        //   944: astore          destination$iv$iv
        //   946: iconst_0       
        //   947: istore          8
        //   949: aload           $this$filterTo$iv$iv
        //   951: arraylength    
        //   952: istore          9
        //   954: iload           8
        //   956: iload           9
        //   958: if_icmpge       1004
        //   961: aload           $this$filterTo$iv$iv
        //   963: iload           8
        //   965: aaload         
        //   966: astore          element$iv$iv
        //   968: aload           element$iv$iv
        //   970: astore          it
        //   972: aload           it
        //   974: getstatic       gg/essential/elementa/effects/OutlineEffect$Side.Top:Lgg/essential/elementa/effects/OutlineEffect$Side;
        //   977: if_acmpeq       984
        //   980: iconst_1       
        //   981: goto            985
        //   984: iconst_0       
        //   985: ifeq            998
        //   988: aload           destination$iv$iv
        //   990: aload           element$iv$iv
        //   992: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   997: pop            
        //   998: iinc            8, 1
        //  1001: goto            954
        //  1004: aload           destination$iv$iv
        //  1006: checkcast       Ljava/util/List;
        //  1009: astore          18
        //  1011: aload           12
        //  1013: aload           13
        //  1015: aload           14
        //  1017: aload           15
        //  1019: aload           16
        //  1021: aload           17
        //  1023: aload           18
        //  1025: checkcast       Ljava/lang/Iterable;
        //  1028: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //  1031: bipush          7
        //  1033: invokestatic    gg/essential/gui/common/MenuButton$Style.copy$default$562a9903:(Lgg/essential/gui/common/MenuButton$Style;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/util/Set;I)Lgg/essential/gui/common/MenuButton$Style;
        //  1036: astore          19
        //  1038: new             Lgg/essential/elementa/state/BasicState;
        //  1041: dup            
        //  1042: aload           19
        //  1044: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1047: checkcast       Lgg/essential/elementa/state/State;
        //  1050: new             Lgg/essential/elementa/state/BasicState;
        //  1053: dup            
        //  1054: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //  1057: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getLIGHT_BLUE:()Lgg/essential/gui/common/MenuButton$Style;
        //  1060: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1063: checkcast       Lgg/essential/elementa/state/State;
        //  1066: aconst_null    
        //  1067: getstatic       gg/essential/gui/common/MenuButton$Alignment.LEFT:Lgg/essential/gui/common/MenuButton$Alignment;
        //  1070: new             Lgg/essential/elementa/state/BasicState;
        //  1073: dup            
        //  1074: ldc_w           "+ Add"
        //  1077: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1080: checkcast       Lgg/essential/elementa/state/State;
        //  1083: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher$addAccountButton$3.INSTANCE:Lgg/essential/gui/menu/full/FullAccountSwitcher$addAccountButton$3;
        //  1086: checkcast       Lkotlin/jvm/functions/Function0;
        //  1089: astore          20
        //  1091: astore          21
        //  1093: astore          22
        //  1095: astore          23
        //  1097: astore          24
        //  1099: astore          25
        //  1101: astore          26
        //  1103: new             Lgg/essential/gui/common/MenuButton;
        //  1106: dup            
        //  1107: aload           26
        //  1109: aload           25
        //  1111: aload           24
        //  1113: aload           23
        //  1115: aload           22
        //  1117: ldc             -1.0
        //  1119: aload           21
        //  1121: iconst_0       
        //  1122: iconst_0       
        //  1123: aload           20
        //  1125: sipush          392
        //  1128: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //  1131: new             Lgg/essential/elementa/state/BasicState;
        //  1134: dup            
        //  1135: getstatic       gg/essential/gui/EssentialPalette.PLUS_5X:Lgg/essential/gui/image/ImageFactory;
        //  1138: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1141: checkcast       Lgg/essential/elementa/state/State;
        //  1144: iconst_0       
        //  1145: aconst_null    
        //  1146: aconst_null    
        //  1147: aconst_null    
        //  1148: fconst_0       
        //  1149: ldc             -1.0
        //  1151: aload_3         /* collapsed */
        //  1152: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1155: checkcast       Lgg/essential/elementa/state/State;
        //  1158: bipush          62
        //  1160: invokestatic    gg/essential/gui/common/MenuButton.setIcon$default$658ebe14:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Ljava/lang/Float;Ljava/lang/Float;FFLgg/essential/elementa/state/State;I)Lgg/essential/gui/common/MenuButton;
        //  1163: checkcast       Lgg/essential/elementa/UIComponent;
        //  1166: astore          $this$constrain$iv
        //  1168: aload           $this$constrain$iv
        //  1170: astore          6
        //  1172: aload           6
        //  1174: astore          $this$constrain_u24lambda_u2d0$iv
        //  1176: aload           $this$constrain_u24lambda_u2d0$iv
        //  1178: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1181: astore          8
        //  1183: astore          12
        //  1185: aload           $this$addAccountButton_delegate_u24lambda_u2d8
        //  1187: bipush          80
        //  1189: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1192: checkcast       Ljava/lang/Number;
        //  1195: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1198: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1201: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1204: aload           $this$addAccountButton_delegate_u24lambda_u2d8
        //  1206: bipush          20
        //  1208: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1211: checkcast       Ljava/lang/Number;
        //  1214: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1217: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1220: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1223: aload           12
        //  1225: aload           6
        //  1227: checkcast       Lgg/essential/gui/common/MenuButton;
        //  1230: aload_3         /* collapsed */
        //  1231: ldc             50.0
        //  1233: invokestatic    gg/essential/gui/common/MenuButton.bindCollapsed$default$3bcddc2a$24867a06:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;F)Lgg/essential/gui/common/MenuButton;
        //  1236: checkcast       Lgg/essential/elementa/UIComponent;
        //  1239: aload_0         /* this */
        //  1240: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher.getAccountsScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  1243: checkcast       Lgg/essential/elementa/UIComponent;
        //  1246: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1249: aload_0         /* this */
        //  1250: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1253: bipush          6
        //  1255: aaload         
        //  1256: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1259: putfield        gg/essential/gui/menu/full/FullAccountSwitcher.addAccountButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1262: aload_0         /* this */
        //  1263: checkcast       Lgg/essential/elementa/UIComponent;
        //  1266: astore          $this$constrain$iv
        //  1268: aload           $this$constrain$iv
        //  1270: astore          6
        //  1272: aload           6
        //  1274: astore          $this$constrain_u24lambda_u2d0$iv
        //  1276: aload           $this$constrain_u24lambda_u2d0$iv
        //  1278: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1281: astore          $this$_init__u24lambda_u2d9
        //  1283: aload           $this$_init__u24lambda_u2d9
        //  1285: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //  1288: dup            
        //  1289: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //  1292: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1295: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1298: aload           $this$_init__u24lambda_u2d9
        //  1300: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1303: dup            
        //  1304: fconst_0       
        //  1305: iconst_1       
        //  1306: aconst_null    
        //  1307: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1310: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1313: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1316: aload_0         /* this */
        //  1317: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher.getMainButton:()Lgg/essential/gui/common/MenuButton;
        //  1320: aload_1         /* activeSession */
        //  1321: getstatic       gg/essential/gui/menu/full/FullAccountSwitcher$2.INSTANCE:Lgg/essential/gui/menu/full/FullAccountSwitcher$2;
        //  1324: checkcast       Lkotlin/jvm/functions/Function1;
        //  1327: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1330: checkcast       Lgg/essential/elementa/state/State;
        //  1333: iconst_0       
        //  1334: aload_0         /* this */
        //  1335: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher.getMainButton:()Lgg/essential/gui/common/MenuButton;
        //  1338: invokevirtual   gg/essential/gui/common/MenuButton.isTruncated:()Lgg/essential/elementa/state/MappedState;
        //  1341: checkcast       Lgg/essential/elementa/state/State;
        //  1344: aconst_null    
        //  1345: iconst_1       
        //  1346: iconst_1       
        //  1347: ldc_w           4.0
        //  1350: ldc_w           4.0
        //  1353: iconst_0       
        //  1354: bipush          8
        //  1356: invokestatic    gg/essential/gui/common/MenuButton.setTooltip$default$2254d6d0:(Lgg/essential/gui/common/MenuButton;Lgg/essential/elementa/state/State;ZLgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;ZZFFII)Lgg/essential/gui/common/MenuButton;
        //  1359: pop            
        //  1360: aload_0         /* this */
        //  1361: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher.getAccountsContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1364: checkcast       Lgg/essential/elementa/UIComponent;
        //  1367: aload_2         /* accountsList */
        //  1368: aconst_null    
        //  1369: aconst_null    
        //  1370: new             Lgg/essential/gui/menu/full/FullAccountSwitcher$3;
        //  1373: dup            
        //  1374: aload_3         /* collapsed */
        //  1375: aload_0         /* this */
        //  1376: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher$3.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/gui/menu/full/FullAccountSwitcher;)V
        //  1379: checkcast       Lkotlin/jvm/functions/Function1;
        //  1382: bipush          6
        //  1384: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindChildren$default$5794d177:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/utils/ObservableList;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //  1387: pop            
        //  1388: aload_2         /* accountsList */
        //  1389: aload_0         /* this */
        //  1390: aload_2         /* accountsList */
        //  1391: invokedynamic   BootstrapMethod #0, update:(Lgg/essential/gui/menu/full/FullAccountSwitcher;Lgg/essential/elementa/utils/ObservableList;)Ljava/util/Observer;
        //  1396: invokevirtual   gg/essential/elementa/utils/ObservableList.addObserver:(Ljava/util/Observer;)V
        //  1399: aload_0         /* this */
        //  1400: aload_2         /* accountsList */
        //  1401: invokestatic    gg/essential/gui/menu/full/FullAccountSwitcher._init_$adjustAddAccount:(Lgg/essential/gui/menu/full/FullAccountSwitcher;Lgg/essential/elementa/utils/ObservableList;)V
        //  1404: aload_0         /* this */
        //  1405: new             Lgg/essential/gui/menu/full/FullAccountSwitcher$5;
        //  1408: dup            
        //  1409: aload_0         /* this */
        //  1410: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher$5.<init>:(Lgg/essential/gui/menu/full/FullAccountSwitcher;)V
        //  1413: checkcast       Lkotlin/jvm/functions/Function1;
        //  1416: invokevirtual   gg/essential/gui/menu/full/FullAccountSwitcher.onFocus:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //  1419: pop            
        //  1420: aload_0         /* this */
        //  1421: new             Lgg/essential/gui/menu/full/FullAccountSwitcher$6;
        //  1424: dup            
        //  1425: aload_0         /* this */
        //  1426: invokespecial   gg/essential/gui/menu/full/FullAccountSwitcher$6.<init>:(Lgg/essential/gui/menu/full/FullAccountSwitcher;)V
        //  1429: checkcast       Lkotlin/jvm/functions/Function1;
        //  1432: invokevirtual   gg/essential/gui/menu/full/FullAccountSwitcher.onFocusLost:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //  1435: pop            
        //  1436: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Lnet/minecraft/client/util/Session;>;Lgg/essential/elementa/utils/ObservableList<Lgg/essential/gui/menu/AccountManager$AccountInfo;>;Lgg/essential/elementa/state/State<Ljava/lang/Boolean;>;Lgg/essential/gui/menu/AccountManager;)V
        //    MethodParameters:
        //  Name            Flags  
        //  --------------  -----
        //  activeSession   
        //  accountsList    
        //  collapsed       
        //  accountManager  
        //    StackMapTable: 00 05 FF 03 BA 00 12 07 00 02 07 00 BD 07 01 4B 07 00 BD 07 01 4D 07 01 4F 07 01 4F 07 01 49 01 01 00 00 07 00 02 07 00 BD 07 01 51 05 05 05 00 00 FF 00 1D 00 12 07 00 02 07 00 BD 07 01 4B 07 00 BD 07 01 4D 07 01 4F 07 01 4F 07 01 49 01 01 07 01 40 07 01 40 07 00 02 07 00 BD 07 01 51 05 05 05 00 00 40 01 0C FF 00 05 00 12 07 00 02 07 00 BD 07 01 4B 07 00 BD 07 01 4D 07 01 4F 07 01 4F 07 01 49 01 01 00 00 07 00 02 07 00 BD 07 01 51 05 05 05 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIComponent getButtonContainer() {
        return (UIComponent)this.buttonContainer$delegate.getValue((Object)this, (KProperty)FullAccountSwitcher.$$delegatedProperties[0]);
    }
    
    private final MenuButton getMainButton() {
        return (MenuButton)this.mainButton$delegate.getValue((Object)this, (KProperty)FullAccountSwitcher.$$delegatedProperties[1]);
    }
    
    private final UIContainer getScrollBoundingBox() {
        return (UIContainer)this.scrollBoundingBox$delegate.getValue((Object)this, (KProperty)FullAccountSwitcher.$$delegatedProperties[3]);
    }
    
    private final ScrollComponent getAccountsScroller() {
        return (ScrollComponent)this.accountsScroller$delegate.getValue((Object)this, (KProperty)FullAccountSwitcher.$$delegatedProperties[4]);
    }
    
    private final UIContainer getAccountsContainer() {
        return (UIContainer)this.accountsContainer$delegate.getValue((Object)this, (KProperty)FullAccountSwitcher.$$delegatedProperties[5]);
    }
    
    private final MenuButton getAddAccountButton() {
        return (MenuButton)this.addAccountButton$delegate.getValue((Object)this, (KProperty)FullAccountSwitcher.$$delegatedProperties[6]);
    }
    
    private static final void _init_$adjustAddAccount(final FullAccountSwitcher this$0, final ObservableList<AccountManager$AccountInfo> $accountsList) {
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this$0.getAddAccountButton();
        final UIConstraints $this$adjustAddAccount_u24lambda_u2d10 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$adjustAddAccount_u24lambda_u2d10.setY(new SiblingConstraint(($accountsList.size() > 0) ? -1.0f : 0.0f, false, 2, null));
    }
    
    private static final void _init_$lambda-11(final FullAccountSwitcher this$0, final ObservableList $accountsList, final Observable observable, final Object o) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$accountsList, "$accountsList");
        _init_$adjustAddAccount(this$0, $accountsList);
    }
    
    public static final /* synthetic */ AccountManager access$getAccountManager$p(final FullAccountSwitcher $this) {
        return $this.accountManager;
    }
    
    public static final /* synthetic */ BasicState access$getAccountsExpanded$p(final FullAccountSwitcher $this) {
        return $this.accountsExpanded;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullAccountSwitcher.class, "buttonContainer", "getButtonContainer()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullAccountSwitcher.class, "mainButton", "getMainButton()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullAccountSwitcher.class, "collapseButton", "getCollapseButton()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullAccountSwitcher.class, "scrollBoundingBox", "getScrollBoundingBox()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullAccountSwitcher.class, "accountsScroller", "getAccountsScroller()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullAccountSwitcher.class, "accountsContainer", "getAccountsContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FullAccountSwitcher.class, "addAccountButton", "getAddAccountButton()Lgg/essential/gui/common/MenuButton;", 0)) };
    }
}
