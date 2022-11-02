package gg.essential.gui.friends.tabs;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import java.util.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.friends.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.utils.*;
import gg.essential.gui.friends.state.*;
import gg.essential.gui.friends.previews.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000^
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001:\u000289B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0014\u00104\u001a\u00020\u00132
                                                   \u00105\u001a\u00060	R\u00020\u0000H\u0002J\b\u00106\u001a\u000207H\u0016R\u001f\u0010\b\u001a\u00060	R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\f\u0010\r\u001a\u0004\b
                                                   \u0010\u000bR\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0016\u0010\r\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0017\u001a\u00060	R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0019\u0010\r\u001a\u0004\b\u0018\u0010\u000bR\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u001b\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001d\u0010\r\u001a\u0004\b\u001c\u0010\u0015R\u001f\u0010\u001e\u001a\u00060	R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b \u0010\r\u001a\u0004\b\u001f\u0010\u000bR\u001e\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010"\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b$\u0010\r\u001a\u0004\b#\u0010\u0015R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b)\u0010\r\u001a\u0004\b'\u0010(R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010,\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b.\u0010\r\u001a\u0004\b-\u0010(R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b2\u00103¨\u0006:""" }, d2 = { "Lgg/essential/gui/friends/tabs/FriendsTab;", "Lgg/essential/gui/friends/tabs/TabComponent;", "gui", "Lgg/essential/gui/friends/SocialMenu;", "selectedTab", "Lgg/essential/elementa/state/BasicState;", "Lgg/essential/gui/friends/Tab;", "(Lgg/essential/gui/friends/SocialMenu;Lgg/essential/elementa/state/BasicState;)V", "blockedSection", "Lgg/essential/gui/friends/tabs/FriendsTab$Section;", "getBlockedSection", "()Lgg/essential/gui/friends/tabs/FriendsTab$Section;", "blockedSection$delegate", "Lkotlin/properties/ReadWriteProperty;", "blockedSorter", "Ljava/util/Comparator;", "Lgg/essential/elementa/UIComponent;", "Lkotlin/Comparator;", "firstDivider", "Lgg/essential/elementa/components/UIBlock;", "getFirstDivider", "()Lgg/essential/elementa/components/UIBlock;", "firstDivider$delegate", "friendSection", "getFriendSection", "friendSection$delegate", "friendSorter", "horizontalDivider", "getHorizontalDivider", "horizontalDivider$delegate", "pendingSection", "getPendingSection", "pendingSection$delegate", "pendingSorter", "secondDivider", "getSecondDivider", "secondDivider$delegate", "sectionContainer", "Lgg/essential/elementa/components/UIContainer;", "getSectionContainer", "()Lgg/essential/elementa/components/UIContainer;", "sectionContainer$delegate", "socialStateManager", "Lgg/essential/gui/friends/state/SocialStateManager;", "thirdScrollArea", "getThirdScrollArea", "thirdScrollArea$delegate", "userLists", "", "Lgg/essential/elementa/components/ScrollComponent;", "getUserLists", "()Ljava/util/List;", "createDivider", "section", "populate", "", "Section", "UserEntryType", "essential" })
public final class FriendsTab extends TabComponent
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final SocialStateManager socialStateManager;
    @NotNull
    private final ReadWriteProperty sectionContainer$delegate;
    @NotNull
    private final Comparator<UIComponent> pendingSorter;
    @NotNull
    private final Comparator<UIComponent> friendSorter;
    @NotNull
    private final Comparator<UIComponent> blockedSorter;
    @NotNull
    private final ReadWriteProperty friendSection$delegate;
    @NotNull
    private final ReadWriteProperty pendingSection$delegate;
    @NotNull
    private final ReadWriteProperty blockedSection$delegate;
    @NotNull
    private final List<ScrollComponent> userLists;
    
    public FriendsTab(@NotNull final SocialMenu gui, @NotNull final BasicState<Tab> selectedTab) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "gui"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* selectedTab */
        //     7: ldc             "selectedTab"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: getstatic       gg/essential/gui/friends/Tab.FRIENDS:Lgg/essential/gui/friends/Tab;
        //    16: aload_1         /* gui */
        //    17: aload_2         /* selectedTab */
        //    18: checkcast       Lgg/essential/elementa/state/State;
        //    21: invokespecial   gg/essential/gui/friends/tabs/TabComponent.<init>:(Lgg/essential/gui/friends/Tab;Lgg/essential/gui/friends/SocialMenu;Lgg/essential/elementa/state/State;)V
        //    24: aload_0         /* this */
        //    25: aload_1         /* gui */
        //    26: invokevirtual   gg/essential/gui/friends/SocialMenu.getSocialStateManager:()Lgg/essential/gui/friends/state/SocialStateManager;
        //    29: putfield        gg/essential/gui/friends/tabs/FriendsTab.socialStateManager:Lgg/essential/gui/friends/state/SocialStateManager;
        //    32: new             Lgg/essential/elementa/components/UIBlock;
        //    35: dup            
        //    36: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //    39: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //    42: checkcast       Lgg/essential/elementa/UIComponent;
        //    45: astore_3        /* $this$constrain$iv */
        //    46: aload_3         /* $this$constrain$iv */
        //    47: astore          5
        //    49: aload           5
        //    51: astore          $this$constrain_u24lambda_u2d0$iv
        //    53: aload           $this$constrain_u24lambda_u2d0$iv
        //    55: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    58: astore          $this$horizontalDivider_delegate_u24lambda_u2d0
        //    60: aload           $this$horizontalDivider_delegate_u24lambda_u2d0
        //    62: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //    65: dup            
        //    66: fconst_0       
        //    67: iconst_0       
        //    68: iconst_3       
        //    69: aconst_null    
        //    70: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    73: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    76: aload_1         /* gui */
        //    77: invokevirtual   gg/essential/gui/friends/SocialMenu.getTabsSelector:()Lgg/essential/gui/friends/TabsSelector;
        //    80: checkcast       Lgg/essential/elementa/UIComponent;
        //    83: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //    86: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    89: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    92: aload           $this$horizontalDivider_delegate_u24lambda_u2d0
        //    94: bipush          100
        //    96: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    99: checkcast       Ljava/lang/Number;
        //   102: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   105: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   108: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   111: aload           $this$horizontalDivider_delegate_u24lambda_u2d0
        //   113: aload_1         /* gui */
        //   114: invokevirtual   gg/essential/gui/friends/SocialMenu.getDividerWidth:()F
        //   117: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   120: checkcast       Ljava/lang/Number;
        //   123: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   126: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   129: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   132: aload           5
        //   134: aload_0         /* this */
        //   135: checkcast       Lgg/essential/elementa/UIComponent;
        //   138: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   141: aload_0         /* this */
        //   142: getstatic       gg/essential/gui/friends/tabs/FriendsTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   145: iconst_0       
        //   146: aaload         
        //   147: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   150: pop            
        //   151: aload_0         /* this */
        //   152: new             Lgg/essential/elementa/components/UIContainer;
        //   155: dup            
        //   156: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   159: checkcast       Lgg/essential/elementa/UIComponent;
        //   162: astore_3        /* $this$constrain$iv */
        //   163: aload_3         /* $this$constrain$iv */
        //   164: astore          5
        //   166: aload           5
        //   168: astore          $this$constrain_u24lambda_u2d0$iv
        //   170: aload           $this$constrain_u24lambda_u2d0$iv
        //   172: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   175: astore          7
        //   177: astore          8
        //   179: aload           $this$sectionContainer_delegate_u24lambda_u2d1
        //   181: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   184: dup            
        //   185: fconst_0       
        //   186: iconst_0       
        //   187: iconst_3       
        //   188: aconst_null    
        //   189: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   192: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   195: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   198: aload           $this$sectionContainer_delegate_u24lambda_u2d1
        //   200: bipush          100
        //   202: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   205: checkcast       Ljava/lang/Number;
        //   208: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   211: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   214: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   217: aload           $this$sectionContainer_delegate_u24lambda_u2d1
        //   219: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   222: dup            
        //   223: iconst_0       
        //   224: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //   227: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   230: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   233: aload           8
        //   235: aload           5
        //   237: aload_0         /* this */
        //   238: checkcast       Lgg/essential/elementa/UIComponent;
        //   241: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   244: aload_0         /* this */
        //   245: getstatic       gg/essential/gui/friends/tabs/FriendsTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   248: iconst_1       
        //   249: aaload         
        //   250: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   253: putfield        gg/essential/gui/friends/tabs/FriendsTab.sectionContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   256: aload_0         /* this */
        //   257: iconst_2       
        //   258: anewarray       Lkotlin/jvm/functions/Function1;
        //   261: astore_3       
        //   262: aload_3        
        //   263: iconst_0       
        //   264: getstatic       gg/essential/gui/friends/tabs/FriendsTab$pendingSorter$1.INSTANCE:Lgg/essential/gui/friends/tabs/FriendsTab$pendingSorter$1;
        //   267: checkcast       Lkotlin/jvm/functions/Function1;
        //   270: aastore        
        //   271: aload_3        
        //   272: iconst_1       
        //   273: new             Lgg/essential/gui/friends/tabs/FriendsTab$pendingSorter$2;
        //   276: dup            
        //   277: aload_0         /* this */
        //   278: invokespecial   gg/essential/gui/friends/tabs/FriendsTab$pendingSorter$2.<init>:(Lgg/essential/gui/friends/tabs/FriendsTab;)V
        //   281: checkcast       Lkotlin/jvm/functions/Function1;
        //   284: aastore        
        //   285: aload_3        
        //   286: invokestatic    kotlin/comparisons/ComparisonsKt.compareBy:([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
        //   289: putfield        gg/essential/gui/friends/tabs/FriendsTab.pendingSorter:Ljava/util/Comparator;
        //   292: aload_0         /* this */
        //   293: new             Lgg/essential/gui/friends/tabs/FriendsTab$special$$inlined$compareBy$1;
        //   296: dup            
        //   297: aload_0         /* this */
        //   298: invokespecial   gg/essential/gui/friends/tabs/FriendsTab$special$$inlined$compareBy$1.<init>:(Lgg/essential/gui/friends/tabs/FriendsTab;)V
        //   301: checkcast       Ljava/util/Comparator;
        //   304: astore_3       
        //   305: new             Lgg/essential/gui/friends/tabs/FriendsTab$special$$inlined$thenBy$1;
        //   308: dup            
        //   309: aload_3        
        //   310: invokespecial   gg/essential/gui/friends/tabs/FriendsTab$special$$inlined$thenBy$1.<init>:(Ljava/util/Comparator;)V
        //   313: checkcast       Ljava/util/Comparator;
        //   316: putfield        gg/essential/gui/friends/tabs/FriendsTab.friendSorter:Ljava/util/Comparator;
        //   319: aload_0         /* this */
        //   320: new             Lgg/essential/gui/friends/tabs/FriendsTab$special$$inlined$compareBy$2;
        //   323: dup            
        //   324: invokespecial   gg/essential/gui/friends/tabs/FriendsTab$special$$inlined$compareBy$2.<init>:()V
        //   327: checkcast       Ljava/util/Comparator;
        //   330: putfield        gg/essential/gui/friends/tabs/FriendsTab.blockedSorter:Ljava/util/Comparator;
        //   333: aload_0         /* this */
        //   334: new             Lgg/essential/gui/friends/tabs/FriendsTab$Section;
        //   337: dup            
        //   338: aload_0         /* this */
        //   339: getstatic       gg/essential/gui/friends/tabs/FriendsTab$UserEntryType.FRIEND:Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;
        //   342: invokespecial   gg/essential/gui/friends/tabs/FriendsTab$Section.<init>:(Lgg/essential/gui/friends/tabs/FriendsTab;Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;)V
        //   345: checkcast       Lgg/essential/elementa/UIComponent;
        //   348: aload_0         /* this */
        //   349: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getSectionContainer:()Lgg/essential/elementa/components/UIContainer;
        //   352: checkcast       Lgg/essential/elementa/UIComponent;
        //   355: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   358: aload_0         /* this */
        //   359: getstatic       gg/essential/gui/friends/tabs/FriendsTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   362: iconst_2       
        //   363: aaload         
        //   364: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   367: putfield        gg/essential/gui/friends/tabs/FriendsTab.friendSection$delegate:Lkotlin/properties/ReadWriteProperty;
        //   370: aload_0         /* this */
        //   371: aload_0         /* this */
        //   372: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getFriendSection:()Lgg/essential/gui/friends/tabs/FriendsTab$Section;
        //   375: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.createDivider:(Lgg/essential/gui/friends/tabs/FriendsTab$Section;)Lgg/essential/elementa/components/UIBlock;
        //   378: checkcast       Lgg/essential/elementa/UIComponent;
        //   381: aload_0         /* this */
        //   382: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getSectionContainer:()Lgg/essential/elementa/components/UIContainer;
        //   385: checkcast       Lgg/essential/elementa/UIComponent;
        //   388: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   391: aload_0         /* this */
        //   392: getstatic       gg/essential/gui/friends/tabs/FriendsTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   395: iconst_3       
        //   396: aaload         
        //   397: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   400: pop            
        //   401: aload_0         /* this */
        //   402: new             Lgg/essential/gui/friends/tabs/FriendsTab$Section;
        //   405: dup            
        //   406: aload_0         /* this */
        //   407: getstatic       gg/essential/gui/friends/tabs/FriendsTab$UserEntryType.PENDING:Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;
        //   410: invokespecial   gg/essential/gui/friends/tabs/FriendsTab$Section.<init>:(Lgg/essential/gui/friends/tabs/FriendsTab;Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;)V
        //   413: checkcast       Lgg/essential/elementa/UIComponent;
        //   416: aload_0         /* this */
        //   417: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getSectionContainer:()Lgg/essential/elementa/components/UIContainer;
        //   420: checkcast       Lgg/essential/elementa/UIComponent;
        //   423: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   426: aload_0         /* this */
        //   427: getstatic       gg/essential/gui/friends/tabs/FriendsTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   430: iconst_4       
        //   431: aaload         
        //   432: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   435: putfield        gg/essential/gui/friends/tabs/FriendsTab.pendingSection$delegate:Lkotlin/properties/ReadWriteProperty;
        //   438: aload_0         /* this */
        //   439: aload_0         /* this */
        //   440: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getPendingSection:()Lgg/essential/gui/friends/tabs/FriendsTab$Section;
        //   443: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.createDivider:(Lgg/essential/gui/friends/tabs/FriendsTab$Section;)Lgg/essential/elementa/components/UIBlock;
        //   446: checkcast       Lgg/essential/elementa/UIComponent;
        //   449: aload_0         /* this */
        //   450: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getSectionContainer:()Lgg/essential/elementa/components/UIContainer;
        //   453: checkcast       Lgg/essential/elementa/UIComponent;
        //   456: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   459: aload_0         /* this */
        //   460: getstatic       gg/essential/gui/friends/tabs/FriendsTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   463: iconst_5       
        //   464: aaload         
        //   465: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   468: pop            
        //   469: aload_0         /* this */
        //   470: new             Lgg/essential/gui/friends/tabs/FriendsTab$Section;
        //   473: dup            
        //   474: aload_0         /* this */
        //   475: getstatic       gg/essential/gui/friends/tabs/FriendsTab$UserEntryType.BLOCKED:Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;
        //   478: invokespecial   gg/essential/gui/friends/tabs/FriendsTab$Section.<init>:(Lgg/essential/gui/friends/tabs/FriendsTab;Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;)V
        //   481: checkcast       Lgg/essential/elementa/UIComponent;
        //   484: aload_0         /* this */
        //   485: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getSectionContainer:()Lgg/essential/elementa/components/UIContainer;
        //   488: checkcast       Lgg/essential/elementa/UIComponent;
        //   491: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   494: aload_0         /* this */
        //   495: getstatic       gg/essential/gui/friends/tabs/FriendsTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   498: bipush          6
        //   500: aaload         
        //   501: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   504: putfield        gg/essential/gui/friends/tabs/FriendsTab.blockedSection$delegate:Lkotlin/properties/ReadWriteProperty;
        //   507: new             Lgg/essential/elementa/components/UIContainer;
        //   510: dup            
        //   511: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   514: checkcast       Lgg/essential/elementa/UIComponent;
        //   517: astore_3        /* $this$constrain$iv */
        //   518: aload_3         /* $this$constrain$iv */
        //   519: astore          5
        //   521: aload           5
        //   523: astore          $this$constrain_u24lambda_u2d0$iv
        //   525: aload           $this$constrain_u24lambda_u2d0$iv
        //   527: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   530: astore          $this$thirdScrollArea_delegate_u24lambda_u2d5
        //   532: aload           $this$thirdScrollArea_delegate_u24lambda_u2d5
        //   534: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   537: dup            
        //   538: iconst_0       
        //   539: iconst_1       
        //   540: aconst_null    
        //   541: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   544: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   547: aload_0         /* this */
        //   548: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getBlockedSection:()Lgg/essential/gui/friends/tabs/FriendsTab$Section;
        //   551: checkcast       Lgg/essential/elementa/UIComponent;
        //   554: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   557: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   560: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   563: aload           $this$thirdScrollArea_delegate_u24lambda_u2d5
        //   565: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   568: dup            
        //   569: iconst_0       
        //   570: iconst_1       
        //   571: aconst_null    
        //   572: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   575: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   578: aload_0         /* this */
        //   579: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getBlockedSection:()Lgg/essential/gui/friends/tabs/FriendsTab$Section;
        //   582: checkcast       Lgg/essential/elementa/UIComponent;
        //   585: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   588: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   591: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   594: aload           $this$thirdScrollArea_delegate_u24lambda_u2d5
        //   596: bipush          100
        //   598: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   601: checkcast       Ljava/lang/Number;
        //   604: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   607: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   610: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   613: aload           5
        //   615: aload_1         /* gui */
        //   616: invokevirtual   gg/essential/gui/friends/SocialMenu.getRightDivider:()Lgg/essential/elementa/components/UIBlock;
        //   619: checkcast       Lgg/essential/elementa/UIComponent;
        //   622: aload_0         /* this */
        //   623: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab.getActive:()Lgg/essential/elementa/state/MappedState;
        //   626: checkcast       Lgg/essential/elementa/state/State;
        //   629: iconst_0       
        //   630: aconst_null    
        //   631: bipush          12
        //   633: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   636: astore_3       
        //   637: aload_3        
        //   638: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   641: astore          it
        //   643: aload_0         /* this */
        //   644: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getBlockedSection:()Lgg/essential/gui/friends/tabs/FriendsTab$Section;
        //   647: aload           it
        //   649: checkcast       Lgg/essential/elementa/UIComponent;
        //   652: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab$Section.setupScrollbar:(Lgg/essential/elementa/UIComponent;)V
        //   655: aload_3        
        //   656: aload_0         /* this */
        //   657: getstatic       gg/essential/gui/friends/tabs/FriendsTab.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   660: bipush          7
        //   662: aaload         
        //   663: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   666: pop            
        //   667: aload_0         /* this */
        //   668: iconst_3       
        //   669: anewarray       Lgg/essential/elementa/components/ScrollComponent;
        //   672: astore_3       
        //   673: aload_3        
        //   674: iconst_0       
        //   675: aload_0         /* this */
        //   676: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getFriendSection:()Lgg/essential/gui/friends/tabs/FriendsTab$Section;
        //   679: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab$Section.getScrollList:()Lgg/essential/elementa/components/ScrollComponent;
        //   682: aastore        
        //   683: aload_3        
        //   684: iconst_1       
        //   685: aload_0         /* this */
        //   686: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getPendingSection:()Lgg/essential/gui/friends/tabs/FriendsTab$Section;
        //   689: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab$Section.getScrollList:()Lgg/essential/elementa/components/ScrollComponent;
        //   692: aastore        
        //   693: aload_3        
        //   694: iconst_2       
        //   695: aload_0         /* this */
        //   696: invokespecial   gg/essential/gui/friends/tabs/FriendsTab.getBlockedSection:()Lgg/essential/gui/friends/tabs/FriendsTab$Section;
        //   699: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab$Section.getScrollList:()Lgg/essential/elementa/components/ScrollComponent;
        //   702: aastore        
        //   703: aload_3        
        //   704: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //   707: putfield        gg/essential/gui/friends/tabs/FriendsTab.userLists:Ljava/util/List;
        //   710: return         
        //    Signature:
        //  (Lgg/essential/gui/friends/SocialMenu;Lgg/essential/elementa/state/BasicState<Lgg/essential/gui/friends/Tab;>;)V
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  gui          
        //  selectedTab  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIContainer getSectionContainer() {
        return (UIContainer)this.sectionContainer$delegate.getValue((Object)this, (KProperty)FriendsTab.$$delegatedProperties[1]);
    }
    
    private final Section getFriendSection() {
        return (Section)this.friendSection$delegate.getValue((Object)this, (KProperty)FriendsTab.$$delegatedProperties[2]);
    }
    
    private final Section getPendingSection() {
        return (Section)this.pendingSection$delegate.getValue((Object)this, (KProperty)FriendsTab.$$delegatedProperties[4]);
    }
    
    private final Section getBlockedSection() {
        return (Section)this.blockedSection$delegate.getValue((Object)this, (KProperty)FriendsTab.$$delegatedProperties[6]);
    }
    
    @NotNull
    @Override
    public List<ScrollComponent> getUserLists() {
        return this.userLists;
    }
    
    private final UIBlock createDivider(final Section section) {
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIBlock(EssentialPalette.COMPONENT_BACKGROUND);
        final UIConstraints $this$createDivider_u24lambda_u2d7 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$createDivider_u24lambda_u2d7.setX(new SiblingConstraint(0.0f, false, 3, null));
        $this$createDivider_u24lambda_u2d7.setWidth(UtilitiesKt.getPixels(this.getGui().getDividerWidth()));
        $this$createDivider_u24lambda_u2d7.setHeight(ConstraintsKt.boundTo((HeightConstraint)UtilitiesKt.getPercent(100), section));
        final UIComponent uiComponent = $this$constrain_u24lambda_u2d0$iv;
        final UIBlock it = (UIBlock)uiComponent;
        section.setupScrollbar(it);
        return (UIBlock)uiComponent;
    }
    
    public void populate() {
        final IRelationshipStates relationshipStates = this.socialStateManager.getRelationshipStates();
        StateExtensionsKt.bindChildren$default$5794d177(this.getFriendSection().getScrollList(), relationshipStates.getObservableFriendList(), null, this.friendSorter, (Function1)new FriendsTab$populate.FriendsTab$populate$1(this), 2);
        StateExtensionsKt.bindChildren$default$5794d177(this.getBlockedSection().getScrollList(), relationshipStates.getObservableBlockedList(), null, this.blockedSorter, (Function1)new FriendsTab$populate.FriendsTab$populate$2(this), 2);
        StateExtensionsKt.bindChildren$default$5794d177(this.getPendingSection().getScrollList(), relationshipStates.getObservableIncomingRequests(), null, this.pendingSorter, (Function1)new FriendsTab$populate.FriendsTab$populate$3(this), 2);
        StateExtensionsKt.bindChildren$default$5794d177(this.getPendingSection().getScrollList(), relationshipStates.getObservableOutgoingRequests(), null, this.pendingSorter, (Function1)new FriendsTab$populate.FriendsTab$populate$4(this), 2);
    }
    
    public static final /* synthetic */ Section access$getFriendSection(final FriendsTab $this) {
        return $this.getFriendSection();
    }
    
    public static final /* synthetic */ Section access$getBlockedSection(final FriendsTab $this) {
        return $this.getBlockedSection();
    }
    
    public static final /* synthetic */ Section access$getPendingSection(final FriendsTab $this) {
        return $this.getPendingSection();
    }
    
    public static final /* synthetic */ Comparator access$getFriendSorter$p(final FriendsTab $this) {
        return $this.friendSorter;
    }
    
    public static final /* synthetic */ Comparator access$getPendingSorter$p(final FriendsTab $this) {
        return $this.pendingSorter;
    }
    
    public static final /* synthetic */ Comparator access$getBlockedSorter$p(final FriendsTab $this) {
        return $this.blockedSorter;
    }
    
    public static final /* synthetic */ SocialStateManager access$getSocialStateManager$p(final FriendsTab $this) {
        return $this.socialStateManager;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FriendsTab.class, "horizontalDivider", "getHorizontalDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FriendsTab.class, "sectionContainer", "getSectionContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FriendsTab.class, "friendSection", "getFriendSection()Lgg/essential/gui/friends/tabs/FriendsTab$Section;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FriendsTab.class, "firstDivider", "getFirstDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FriendsTab.class, "pendingSection", "getPendingSection()Lgg/essential/gui/friends/tabs/FriendsTab$Section;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FriendsTab.class, "secondDivider", "getSecondDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FriendsTab.class, "blockedSection", "getBlockedSection()Lgg/essential/gui/friends/tabs/FriendsTab$Section;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)FriendsTab.class, "thirdScrollArea", "getThirdScrollArea()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00004
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0010\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f
                                                       \u0004\b
                                                       \u0010\u000b\u001a\u0004\b\b\u0010	R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f
                                                       \u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u0016""" }, d2 = { "Lgg/essential/gui/friends/tabs/FriendsTab$Section;", "Lgg/essential/elementa/components/UIContainer;", "Lgg/essential/gui/friends/previews/SortListener;", "type", "Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;", "(Lgg/essential/gui/friends/tabs/FriendsTab;Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;)V", "scrollList", "Lgg/essential/elementa/components/ScrollComponent;", "getScrollList", "()Lgg/essential/elementa/components/ScrollComponent;", "scrollList$delegate", "Lkotlin/properties/ReadWriteProperty;", "text", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getText", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "text$delegate", "setupScrollbar", "", "parent", "Lgg/essential/elementa/UIComponent;", "sort", "essential" })
    private final class Section extends UIContainer implements SortListener
    {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
        @NotNull
        private final UserEntryType type;
        @NotNull
        private final ReadWriteProperty scrollList$delegate;
        final /* synthetic */ FriendsTab this$0;
        
        public Section(@NotNull final FriendsTab this$0, final UserEntryType type) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "type"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_0         /* this */
            //     7: aload_1         /* this$0 */
            //     8: putfield        gg/essential/gui/friends/tabs/FriendsTab$Section.this$0:Lgg/essential/gui/friends/tabs/FriendsTab;
            //    11: aload_0         /* this */
            //    12: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
            //    15: aload_0         /* this */
            //    16: aload_2         /* type */
            //    17: putfield        gg/essential/gui/friends/tabs/FriendsTab$Section.type:Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;
            //    20: new             Lgg/essential/gui/common/shadow/EssentialUIText;
            //    23: dup            
            //    24: aload_0         /* this */
            //    25: getfield        gg/essential/gui/friends/tabs/FriendsTab$Section.type:Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;
            //    28: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab$UserEntryType.getSectionTitle:()Ljava/lang/String;
            //    31: iconst_0       
            //    32: aconst_null    
            //    33: iconst_0       
            //    34: iconst_0       
            //    35: iconst_0       
            //    36: bipush          62
            //    38: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
            //    41: checkcast       Lgg/essential/elementa/UIComponent;
            //    44: astore_3        /* $this$constrain$iv */
            //    45: aload_3         /* $this$constrain$iv */
            //    46: astore          5
            //    48: aload           5
            //    50: astore          $this$constrain_u24lambda_u2d0$iv
            //    52: aload           $this$constrain_u24lambda_u2d0$iv
            //    54: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //    57: astore          $this$text_delegate_u24lambda_u2d0
            //    59: aload           $this$text_delegate_u24lambda_u2d0
            //    61: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //    64: dup            
            //    65: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //    68: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //    71: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //    74: aload           $this$text_delegate_u24lambda_u2d0
            //    76: bipush          8
            //    78: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    81: checkcast       Ljava/lang/Number;
            //    84: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //    87: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //    90: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //    93: aload           $this$text_delegate_u24lambda_u2d0
            //    95: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
            //    98: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //   101: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //   104: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
            //   107: aload           5
            //   109: aload_0         /* this */
            //   110: checkcast       Lgg/essential/elementa/UIComponent;
            //   113: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   116: aload_0         /* this */
            //   117: getstatic       gg/essential/gui/friends/tabs/FriendsTab$Section.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   120: iconst_0       
            //   121: aaload         
            //   122: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   125: pop            
            //   126: aload_0         /* this */
            //   127: new             Lgg/essential/elementa/components/ScrollComponent;
            //   130: dup            
            //   131: aload_0         /* this */
            //   132: getfield        gg/essential/gui/friends/tabs/FriendsTab$Section.type:Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;
            //   135: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab$UserEntryType.getEmptyText:()Ljava/lang/String;
            //   138: fconst_0       
            //   139: aconst_null    
            //   140: iconst_0       
            //   141: iconst_0       
            //   142: iconst_0       
            //   143: iconst_0       
            //   144: fconst_0       
            //   145: fconst_0       
            //   146: aconst_null    
            //   147: sipush          1022
            //   150: aconst_null    
            //   151: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   154: checkcast       Lgg/essential/elementa/UIComponent;
            //   157: astore_3        /* $this$constrain$iv */
            //   158: aload_3         /* $this$constrain$iv */
            //   159: astore          5
            //   161: aload           5
            //   163: astore          $this$constrain_u24lambda_u2d0$iv
            //   165: aload           $this$constrain_u24lambda_u2d0$iv
            //   167: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   170: astore          8
            //   172: astore          10
            //   174: aload           $this$scrollList_delegate_u24lambda_u2d1
            //   176: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //   179: dup            
            //   180: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //   183: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   186: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   189: aload           $this$scrollList_delegate_u24lambda_u2d1
            //   191: new             Lgg/essential/elementa/constraints/SiblingConstraint;
            //   194: dup            
            //   195: ldc             10.0
            //   197: iconst_0       
            //   198: iconst_2       
            //   199: aconst_null    
            //   200: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   203: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   206: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   209: aload           $this$scrollList_delegate_u24lambda_u2d1
            //   211: bipush          100
            //   213: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   216: checkcast       Ljava/lang/Number;
            //   219: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //   222: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   225: bipush          20
            //   227: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   230: checkcast       Ljava/lang/Number;
            //   233: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   236: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   239: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
            //   242: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   245: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   248: aload           $this$scrollList_delegate_u24lambda_u2d1
            //   250: new             Lgg/essential/elementa/constraints/FillConstraint;
            //   253: dup            
            //   254: iconst_0       
            //   255: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
            //   258: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   261: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   264: aload           10
            //   266: aload           5
            //   268: astore_3        /* $this$constrain$iv */
            //   269: aload_3        
            //   270: checkcast       Lgg/essential/elementa/components/ScrollComponent;
            //   273: astore          4
            //   275: astore          10
            //   277: aload           $this$scrollList_delegate_u24lambda_u2d2
            //   279: invokevirtual   gg/essential/elementa/components/ScrollComponent.getEmptyText:()Lgg/essential/elementa/components/UIWrappedText;
            //   282: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
            //   285: invokevirtual   gg/essential/elementa/components/UIWrappedText.setColor:(Ljava/awt/Color;)Lgg/essential/elementa/UIComponent;
            //   288: pop            
            //   289: aload           10
            //   291: aload_3        
            //   292: aload_0         /* this */
            //   293: checkcast       Lgg/essential/elementa/UIComponent;
            //   296: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   299: checkcast       Lgg/essential/elementa/components/ScrollComponent;
            //   302: bipush          20
            //   304: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   307: checkcast       Ljava/lang/Number;
            //   310: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   313: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   316: invokestatic    gg/essential/util/ExtensionsKt.scrollGradient:(Lgg/essential/elementa/components/ScrollComponent;Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/components/ScrollComponent;
            //   319: checkcast       Lgg/essential/elementa/UIComponent;
            //   322: aload_0         /* this */
            //   323: getstatic       gg/essential/gui/friends/tabs/FriendsTab$Section.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   326: iconst_1       
            //   327: aaload         
            //   328: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   331: putfield        gg/essential/gui/friends/tabs/FriendsTab$Section.scrollList$delegate:Lkotlin/properties/ReadWriteProperty;
            //   334: aload_0         /* this */
            //   335: checkcast       Lgg/essential/elementa/UIComponent;
            //   338: astore_3       
            //   339: aload_0         /* this */
            //   340: getfield        gg/essential/gui/friends/tabs/FriendsTab$Section.this$0:Lgg/essential/gui/friends/tabs/FriendsTab;
            //   343: astore          4
            //   345: aload_3         /* $this$constrain$iv */
            //   346: astore          6
            //   348: aload           6
            //   350: astore          $this$constrain_u24lambda_u2d0$iv
            //   352: aload           $this$constrain_u24lambda_u2d0$iv
            //   354: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   357: astore          $this$_init__u24lambda_u2d3
            //   359: aload           $this$_init__u24lambda_u2d3
            //   361: new             Lgg/essential/elementa/constraints/SiblingConstraint;
            //   364: dup            
            //   365: fconst_0       
            //   366: iconst_0       
            //   367: iconst_3       
            //   368: aconst_null    
            //   369: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   372: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   375: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   378: aload           $this$_init__u24lambda_u2d3
            //   380: bipush          100
            //   382: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   385: checkcast       Ljava/lang/Number;
            //   388: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //   391: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   394: aload           4
            //   396: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab.getGui:()Lgg/essential/gui/friends/SocialMenu;
            //   399: invokevirtual   gg/essential/gui/friends/SocialMenu.getDividerWidth:()F
            //   402: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
            //   405: checkcast       Ljava/lang/Number;
            //   408: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   411: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   414: iconst_2       
            //   415: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   418: checkcast       Ljava/lang/Number;
            //   421: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.times:(Lgg/essential/elementa/constraints/SuperConstraint;Ljava/lang/Number;)Lgg/essential/elementa/constraints/ScaleConstraint;
            //   424: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   427: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
            //   430: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   433: iconst_3       
            //   434: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   437: checkcast       Ljava/lang/Number;
            //   440: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.div:(Lgg/essential/elementa/constraints/SuperConstraint;Ljava/lang/Number;)Lgg/essential/elementa/constraints/ScaleConstraint;
            //   443: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   446: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   449: aload           $this$_init__u24lambda_u2d3
            //   451: bipush          100
            //   453: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   456: checkcast       Ljava/lang/Number;
            //   459: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //   462: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   465: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   468: return         
            //    Signature:
            //  (Lgg/essential/gui/friends/tabs/FriendsTab;Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;)V [from metadata: (Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;)V]
            //  
            //    MethodParameters:
            //  Name    Flags  
            //  ------  -----
            //  this$0  
            //  type    
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @NotNull
        public final ScrollComponent getScrollList() {
            return (ScrollComponent)this.scrollList$delegate.getValue((Object)this, (KProperty)Section.$$delegatedProperties[1]);
        }
        
        public final void setupScrollbar(@NotNull final UIComponent parent) {
            Intrinsics.checkNotNullParameter((Object)parent, "parent");
            final UIComponent $this$constrain_u24lambda_u2d0$iv;
            final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIBlock(EssentialPalette.SCROLLBAR);
            final UIConstraints $this$setupScrollbar_u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$setupScrollbar_u24lambda_u2d4.setWidth(UtilitiesKt.getPercent(100));
            final UIBlock scrollbar = ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, parent);
            this.getScrollList().setVerticalScrollBarComponent(scrollbar, true);
        }
        
        @Override
        public void sort() {
            final Comparator filter = switch (Section.WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
                case 1 -> FriendsTab.access$getFriendSorter$p(this.this$0);
                case 2 -> FriendsTab.access$getPendingSorter$p(this.this$0);
                case 3 -> FriendsTab.access$getBlockedSorter$p(this.this$0);
                default -> throw new NoWhenBranchMatchedException();
            };
            this.getScrollList().sortChildren(filter);
        }
        
        static {
            $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Section.class, "text", "getText()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Section.class, "scrollList", "getScrollList()Lgg/essential/elementa/components/ScrollComponent;", 0)) };
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b	\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b	j\u0002\b
                                                       j\u0002\b\u000b¨\u0006\f""" }, d2 = { "Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;", "", "sectionTitle", "", "emptyText", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getEmptyText", "()Ljava/lang/String;", "getSectionTitle", "FRIEND", "PENDING", "BLOCKED", "essential" })
    private enum UserEntryType
    {
        @NotNull
        private final String sectionTitle;
        @NotNull
        private final String emptyText;
        
        FRIEND("FRIEND", 0, "Friend List", "No Friends"), 
        PENDING("PENDING", 1, "Friend Requests", "No Friend Requests"), 
        BLOCKED("BLOCKED", 2, "Blocked Players", "No Players Blocked");
        
        private static final /* synthetic */ UserEntryType[] $VALUES;
        
        private UserEntryType(final String $enum$name, final int $enum$ordinal, final String sectionTitle, final String emptyText) {
            this.sectionTitle = sectionTitle;
            this.emptyText = emptyText;
        }
        
        @NotNull
        public final String getSectionTitle() {
            return this.sectionTitle;
        }
        
        @NotNull
        public final String getEmptyText() {
            return this.emptyText;
        }
        
        public static UserEntryType[] values() {
            return UserEntryType.$VALUES.clone();
        }
        
        public static UserEntryType valueOf(final String value) {
            return Enum.valueOf(UserEntryType.class, value);
        }
        
        private static final /* synthetic */ UserEntryType[] $values() {
            return new UserEntryType[] { UserEntryType.FRIEND, UserEntryType.PENDING, UserEntryType.BLOCKED };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
