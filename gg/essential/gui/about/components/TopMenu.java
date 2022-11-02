package gg.essential.gui.about.components;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import kotlin.*;
import gg.essential.gui.about.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000R
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010$
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010	R\u001a\u0010
                                                   \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0015\u0012\u0004\u0012\u00020\f0\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f²\u0006
                                                   \u0010 \u001a\u00020!X\u008a\u0084\u0002²\u0006
                                                   \u0010"\u001a\u00020#X\u008a\u0084\u0002²\u0006
                                                   \u0010$\u001a\u00020#X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/about/components/TopMenu;", "Lgg/essential/elementa/components/UIContainer;", "aboutMenu", "Lgg/essential/gui/about/AboutMenu;", "platformSpecific", "Lgg/essential/elementa/state/BasicState;", "", "selectedPage", "Lgg/essential/gui/about/components/Page;", "(Lgg/essential/gui/about/AboutMenu;Lgg/essential/elementa/state/BasicState;Lgg/essential/elementa/state/BasicState;)V", "menuItems", "", "", "pageTitle", "Lgg/essential/elementa/components/UIText;", "getPageTitle", "()Lgg/essential/elementa/components/UIText;", "pageTitle$delegate", "Lkotlin/properties/ReadWriteProperty;", "pageTitleText", "Lgg/essential/elementa/state/MappedState;", "Lkotlin/Pair;", "platformSwitch", "Lgg/essential/gui/common/FullEssentialToggle;", "getPlatformSwitch", "()Lgg/essential/gui/common/FullEssentialToggle;", "platformSwitch$delegate", "rightMenu", "getRightMenu", "()Lgg/essential/elementa/components/UIContainer;", "rightMenu$delegate", "essential", "middleDivider", "Lgg/essential/elementa/components/UIBlock;", "menuItemContainer", "Lgg/essential/elementa/UIComponent;", "menuItemText" })
public final class TopMenu extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final Map<String, String> menuItems;
    @NotNull
    private final ReadWriteProperty platformSwitch$delegate;
    @NotNull
    private final MappedState<Pair<Page, Boolean>, String> pageTitleText;
    @NotNull
    private final ReadWriteProperty rightMenu$delegate;
    
    public TopMenu(@NotNull final AboutMenu aboutMenu, @NotNull final BasicState<Boolean> platformSpecific, @NotNull final BasicState<Page> selectedPage) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "aboutMenu"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* platformSpecific */
        //     7: ldc             "platformSpecific"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* selectedPage */
        //    13: ldc             "selectedPage"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload_0         /* this */
        //    19: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    22: aload_0         /* this */
        //    23: iconst_3       
        //    24: anewarray       Lkotlin/Pair;
        //    27: astore          4
        //    29: aload           4
        //    31: iconst_0       
        //    32: ldc             "Discord"
        //    34: ldc             "https://discord.gg/essential"
        //    36: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //    39: aastore        
        //    40: aload           4
        //    42: iconst_1       
        //    43: ldc             "Twitter"
        //    45: ldc             "https://twitter.com/EssentialMod"
        //    47: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //    50: aastore        
        //    51: aload           4
        //    53: iconst_2       
        //    54: ldc             "Website"
        //    56: ldc             "https://essential.gg"
        //    58: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //    61: aastore        
        //    62: aload           4
        //    64: invokestatic    kotlin/collections/MapsKt.mapOf:([Lkotlin/Pair;)Ljava/util/Map;
        //    67: putfield        gg/essential/gui/about/components/TopMenu.menuItems:Ljava/util/Map;
        //    70: new             Lgg/essential/elementa/components/UIBlock;
        //    73: dup            
        //    74: getstatic       gg/essential/gui/EssentialPalette.LIGHT_DIVIDER:Ljava/awt/Color;
        //    77: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //    80: checkcast       Lgg/essential/elementa/UIComponent;
        //    83: astore          $this$constrain$iv
        //    85: aload           $this$constrain$iv
        //    87: astore          7
        //    89: aload           7
        //    91: astore          $this$constrain_u24lambda_u2d0$iv
        //    93: aload           $this$constrain_u24lambda_u2d0$iv
        //    95: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    98: astore          $this$_init__u24lambda_u2d0
        //   100: aload           $this$_init__u24lambda_u2d0
        //   102: iconst_0       
        //   103: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   106: checkcast       Ljava/lang/Number;
        //   109: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   112: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   115: aload_1         /* aboutMenu */
        //   116: invokevirtual   gg/essential/gui/about/AboutMenu.getMiddleDivider:()Lgg/essential/elementa/components/UIBlock;
        //   119: checkcast       Lgg/essential/elementa/UIComponent;
        //   122: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   125: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   128: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   131: aload           $this$_init__u24lambda_u2d0
        //   133: bipush          100
        //   135: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   138: checkcast       Ljava/lang/Number;
        //   141: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   144: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   147: aload_1         /* aboutMenu */
        //   148: invokevirtual   gg/essential/gui/about/AboutMenu.getMiddleDivider:()Lgg/essential/elementa/components/UIBlock;
        //   151: checkcast       Lgg/essential/elementa/UIComponent;
        //   154: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   157: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   160: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   163: aload           $this$_init__u24lambda_u2d0
        //   165: bipush          100
        //   167: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   170: checkcast       Ljava/lang/Number;
        //   173: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   176: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   179: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   182: aload           7
        //   184: aload_0         /* this */
        //   185: checkcast       Lgg/essential/elementa/UIComponent;
        //   188: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   191: aconst_null    
        //   192: getstatic       gg/essential/gui/about/components/TopMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   195: iconst_0       
        //   196: aaload         
        //   197: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   200: pop            
        //   201: aload_0         /* this */
        //   202: new             Lgg/essential/gui/common/FullEssentialToggle;
        //   205: dup            
        //   206: aload_2         /* platformSpecific */
        //   207: checkcast       Lgg/essential/elementa/state/State;
        //   210: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   213: invokespecial   gg/essential/gui/common/FullEssentialToggle.<init>:(Lgg/essential/elementa/state/State;Ljava/awt/Color;)V
        //   216: checkcast       Lgg/essential/elementa/UIComponent;
        //   219: astore          $this$constrain$iv
        //   221: aload           $this$constrain$iv
        //   223: astore          6
        //   225: aload           6
        //   227: astore          $this$constrain_u24lambda_u2d0$iv
        //   229: aload           $this$constrain_u24lambda_u2d0$iv
        //   231: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   234: astore          9
        //   236: astore          15
        //   238: aload           $this$platformSwitch_delegate_u24lambda_u2d2
        //   240: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   243: dup            
        //   244: ldc             10.0
        //   246: iconst_0       
        //   247: iconst_2       
        //   248: aconst_null    
        //   249: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   252: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   255: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   258: aload           $this$platformSwitch_delegate_u24lambda_u2d2
        //   260: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   263: dup            
        //   264: iconst_0       
        //   265: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   268: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   271: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   274: aload           15
        //   276: aload           6
        //   278: aload_0         /* this */
        //   279: checkcast       Lgg/essential/elementa/UIComponent;
        //   282: aload_3         /* selectedPage */
        //   283: getstatic       gg/essential/gui/about/components/TopMenu$platformSwitch$3.INSTANCE:Lgg/essential/gui/about/components/TopMenu$platformSwitch$3;
        //   286: checkcast       Lkotlin/jvm/functions/Function1;
        //   289: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   292: checkcast       Lgg/essential/elementa/state/State;
        //   295: iconst_0       
        //   296: iconst_1       
        //   297: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   300: iconst_4       
        //   301: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   304: aload_0         /* this */
        //   305: getstatic       gg/essential/gui/about/components/TopMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   308: iconst_1       
        //   309: aaload         
        //   310: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   313: putfield        gg/essential/gui/about/components/TopMenu.platformSwitch$delegate:Lkotlin/properties/ReadWriteProperty;
        //   316: aload_0         /* this */
        //   317: aload_3         /* selectedPage */
        //   318: aload_2         /* platformSpecific */
        //   319: checkcast       Lgg/essential/elementa/state/State;
        //   322: invokevirtual   gg/essential/elementa/state/BasicState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   325: getstatic       gg/essential/gui/about/components/TopMenu$pageTitleText$1.INSTANCE:Lgg/essential/gui/about/components/TopMenu$pageTitleText$1;
        //   328: checkcast       Lkotlin/jvm/functions/Function1;
        //   331: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   334: putfield        gg/essential/gui/about/components/TopMenu.pageTitleText:Lgg/essential/elementa/state/MappedState;
        //   337: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   340: dup            
        //   341: aconst_null    
        //   342: iconst_0       
        //   343: aconst_null    
        //   344: iconst_0       
        //   345: iconst_0       
        //   346: iconst_0       
        //   347: bipush          63
        //   349: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   352: aload_0         /* this */
        //   353: getfield        gg/essential/gui/about/components/TopMenu.pageTitleText:Lgg/essential/elementa/state/MappedState;
        //   356: checkcast       Lgg/essential/elementa/state/State;
        //   359: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   362: checkcast       Lgg/essential/elementa/UIComponent;
        //   365: astore          $this$constrain$iv
        //   367: aload           $this$constrain$iv
        //   369: astore          6
        //   371: aload           6
        //   373: astore          $this$constrain_u24lambda_u2d0$iv
        //   375: aload           $this$constrain_u24lambda_u2d0$iv
        //   377: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   380: astore          $this$pageTitle_delegate_u24lambda_u2d3
        //   382: aload           $this$pageTitle_delegate_u24lambda_u2d3
        //   384: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   387: dup            
        //   388: ldc             10.0
        //   390: iconst_0       
        //   391: iconst_2       
        //   392: aconst_null    
        //   393: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   396: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   399: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   402: aload           $this$pageTitle_delegate_u24lambda_u2d3
        //   404: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   407: dup            
        //   408: iconst_0       
        //   409: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   412: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   415: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   418: aload           6
        //   420: aload_0         /* this */
        //   421: checkcast       Lgg/essential/elementa/UIComponent;
        //   424: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   427: aload_0         /* this */
        //   428: getstatic       gg/essential/gui/about/components/TopMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   431: iconst_2       
        //   432: aaload         
        //   433: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   436: pop            
        //   437: aload_0         /* this */
        //   438: invokespecial   gg/essential/gui/about/components/TopMenu.getPlatformSwitch:()Lgg/essential/gui/common/FullEssentialToggle;
        //   441: checkcast       Lgg/essential/elementa/UIComponent;
        //   444: aload_2         /* platformSpecific */
        //   445: getstatic       gg/essential/gui/about/components/TopMenu$1.INSTANCE:Lgg/essential/gui/about/components/TopMenu$1;
        //   448: checkcast       Lkotlin/jvm/functions/Function1;
        //   451: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   454: checkcast       Lgg/essential/elementa/state/State;
        //   457: aconst_null    
        //   458: fconst_0       
        //   459: aconst_null    
        //   460: aconst_null    
        //   461: bipush          30
        //   463: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //   466: pop            
        //   467: aload_0         /* this */
        //   468: new             Lgg/essential/elementa/components/UIContainer;
        //   471: dup            
        //   472: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   475: checkcast       Lgg/essential/elementa/UIComponent;
        //   478: astore          $this$constrain$iv
        //   480: aload           $this$constrain$iv
        //   482: astore          6
        //   484: aload           6
        //   486: astore          $this$constrain_u24lambda_u2d0$iv
        //   488: aload           $this$constrain_u24lambda_u2d0$iv
        //   490: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   493: astore          9
        //   495: astore          15
        //   497: aload           $this$rightMenu_delegate_u24lambda_u2d4
        //   499: bipush          10
        //   501: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   504: checkcast       Ljava/lang/Number;
        //   507: iconst_1       
        //   508: iconst_0       
        //   509: iconst_2       
        //   510: aconst_null    
        //   511: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   514: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   517: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   520: aload           $this$rightMenu_delegate_u24lambda_u2d4
        //   522: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   525: dup            
        //   526: iconst_0       
        //   527: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   530: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   533: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   536: aload           $this$rightMenu_delegate_u24lambda_u2d4
        //   538: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   541: dup            
        //   542: fconst_0       
        //   543: iconst_1       
        //   544: aconst_null    
        //   545: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   548: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   551: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   554: aload           $this$rightMenu_delegate_u24lambda_u2d4
        //   556: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   559: dup            
        //   560: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   563: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   566: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   569: aload           15
        //   571: aload           6
        //   573: aload_0         /* this */
        //   574: checkcast       Lgg/essential/elementa/UIComponent;
        //   577: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   580: aload_0         /* this */
        //   581: getstatic       gg/essential/gui/about/components/TopMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   584: iconst_3       
        //   585: aaload         
        //   586: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   589: putfield        gg/essential/gui/about/components/TopMenu.rightMenu$delegate:Lkotlin/properties/ReadWriteProperty;
        //   592: aload_0         /* this */
        //   593: getfield        gg/essential/gui/about/components/TopMenu.menuItems:Ljava/util/Map;
        //   596: astore          $this$forEach$iv
        //   598: aload           $this$forEach$iv
        //   600: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   605: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   610: astore          6
        //   612: aload           6
        //   614: invokeinterface java/util/Iterator.hasNext:()Z
        //   619: ifeq            928
        //   622: aload           6
        //   624: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   629: checkcast       Ljava/util/Map$Entry;
        //   632: astore          element$iv
        //   634: aload           element$iv
        //   636: astore          menuItem
        //   638: new             Lgg/essential/elementa/components/UIBlock;
        //   641: dup            
        //   642: aconst_null    
        //   643: iconst_1       
        //   644: aconst_null    
        //   645: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   648: checkcast       Lgg/essential/elementa/UIComponent;
        //   651: astore          $this$constrain$iv
        //   653: aload           $this$constrain$iv
        //   655: astore          11
        //   657: aload           11
        //   659: astore          $this$constrain_u24lambda_u2d0$iv
        //   661: aload           $this$constrain_u24lambda_u2d0$iv
        //   663: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   666: astore          $this$lambda_u2d9_u24lambda_u2d5
        //   668: aload           $this$lambda_u2d9_u24lambda_u2d5
        //   670: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   673: dup            
        //   674: ldc_w           8.0
        //   677: iconst_0       
        //   678: iconst_2       
        //   679: aconst_null    
        //   680: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   683: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   686: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   689: aload           $this$lambda_u2d9_u24lambda_u2d5
        //   691: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   694: dup            
        //   695: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   698: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   701: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   704: aload           $this$lambda_u2d9_u24lambda_u2d5
        //   706: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   709: dup            
        //   710: fconst_0       
        //   711: iconst_1       
        //   712: aconst_null    
        //   713: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   716: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   719: bipush          12
        //   721: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   724: checkcast       Ljava/lang/Number;
        //   727: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   730: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   733: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   736: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   739: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   742: aload           $this$lambda_u2d9_u24lambda_u2d5
        //   744: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   747: dup            
        //   748: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   751: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   754: bipush          8
        //   756: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   759: checkcast       Ljava/lang/Number;
        //   762: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   765: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   768: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   771: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   774: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   777: aload           11
        //   779: astore          $this$onLeftClick$iv
        //   781: aload           $this$onLeftClick$iv
        //   783: new             Lgg/essential/gui/about/components/TopMenu$_init_$lambda-9$$inlined$onLeftClick$1;
        //   786: dup            
        //   787: aload           menuItem
        //   789: invokespecial   gg/essential/gui/about/components/TopMenu$_init_$lambda-9$$inlined$onLeftClick$1.<init>:(Ljava/util/Map$Entry;)V
        //   792: checkcast       Lkotlin/jvm/functions/Function2;
        //   795: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   798: aload_0         /* this */
        //   799: invokespecial   gg/essential/gui/about/components/TopMenu.getRightMenu:()Lgg/essential/elementa/components/UIContainer;
        //   802: checkcast       Lgg/essential/elementa/UIComponent;
        //   805: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   808: aconst_null    
        //   809: getstatic       gg/essential/gui/about/components/TopMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   812: iconst_4       
        //   813: aaload         
        //   814: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   817: astore          menuItemContainer$delegate
        //   819: aload           menuItemContainer$delegate
        //   821: invokestatic    gg/essential/gui/about/components/TopMenu.lambda-9$lambda-7:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //   824: iconst_0       
        //   825: iconst_0       
        //   826: iconst_3       
        //   827: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   830: astore          hovered
        //   832: aload           menuItemContainer$delegate
        //   834: invokestatic    gg/essential/gui/about/components/TopMenu.lambda-9$lambda-7:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //   837: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   840: aload           hovered
        //   842: invokevirtual   gg/essential/gui/EssentialPalette.getButtonColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   845: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   848: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   851: invokevirtual   gg/essential/elementa/UIComponent.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   854: pop            
        //   855: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   858: dup            
        //   859: aload           menuItem
        //   861: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   866: checkcast       Ljava/lang/String;
        //   869: iconst_0       
        //   870: getstatic       gg/essential/gui/EssentialPalette.TEXT_SHADOW:Ljava/awt/Color;
        //   873: iconst_0       
        //   874: iconst_0       
        //   875: iconst_0       
        //   876: bipush          58
        //   878: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   881: checkcast       Lgg/essential/elementa/UIComponent;
        //   884: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   887: checkcast       Lgg/essential/gui/common/shadow/EssentialUIText;
        //   890: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   893: aload           hovered
        //   895: invokevirtual   gg/essential/gui/EssentialPalette.getTextColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   898: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   901: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   904: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   907: aload           menuItemContainer$delegate
        //   909: invokestatic    gg/essential/gui/about/components/TopMenu.lambda-9$lambda-7:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //   912: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   915: aconst_null    
        //   916: getstatic       gg/essential/gui/about/components/TopMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   919: iconst_5       
        //   920: aaload         
        //   921: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   924: pop            
        //   925: goto            612
        //   928: return         
        //    Signature:
        //  (Lgg/essential/gui/about/AboutMenu;Lgg/essential/elementa/state/BasicState<Ljava/lang/Boolean;>;Lgg/essential/elementa/state/BasicState<Lgg/essential/gui/about/components/Page;>;)V
        //    MethodParameters:
        //  Name              Flags  
        //  ----------------  -----
        //  aboutMenu         
        //  platformSpecific  
        //  selectedPage      
        //    StackMapTable: 00 02 FF 02 64 00 07 07 00 02 00 00 00 00 00 07 01 24 00 00 FF 01 3B 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final FullEssentialToggle getPlatformSwitch() {
        return (FullEssentialToggle)this.platformSwitch$delegate.getValue((Object)this, (KProperty)TopMenu.$$delegatedProperties[1]);
    }
    
    private final UIContainer getRightMenu() {
        return (UIContainer)this.rightMenu$delegate.getValue((Object)this, (KProperty)TopMenu.$$delegatedProperties[3]);
    }
    
    private static final UIComponent lambda-9$lambda-7(final ReadWriteProperty<Object, UIComponent> $menuItemContainer$delegate) {
        return (UIComponent)$menuItemContainer$delegate.getValue((Object)null, (KProperty)TopMenu.$$delegatedProperties[4]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)TopMenu.class, "middleDivider", "<v#0>", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TopMenu.class, "platformSwitch", "getPlatformSwitch()Lgg/essential/gui/common/FullEssentialToggle;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TopMenu.class, "pageTitle", "getPageTitle()Lgg/essential/elementa/components/UIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TopMenu.class, "rightMenu", "getRightMenu()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)TopMenu.class, "menuItemContainer", "<v#1>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)TopMenu.class, "menuItemText", "<v#2>", 0)) };
    }
}
