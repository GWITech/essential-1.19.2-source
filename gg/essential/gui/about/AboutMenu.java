package gg.essential.gui.about;

import gg.essential.api.gui.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import java.util.*;
import gg.essential.gui.about.components.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import gg.essential.universal.*;
import gg.essential.gui.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.markdown.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000N
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020"H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b	\u0010
                                                   \u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010
                                                   \u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001a\u0010
                                                   \u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b \u0010
                                                   \u001a\u0004\b\u001e\u0010\u001f¨\u0006$""" }, d2 = { "Lgg/essential/gui/about/AboutMenu;", "Lgg/essential/api/gui/EssentialGUI;", "category", "Lgg/essential/gui/about/Category;", "(Lgg/essential/gui/about/Category;)V", "leftPane", "Lgg/essential/gui/about/components/LeftPane;", "getLeftPane", "()Lgg/essential/gui/about/components/LeftPane;", "leftPane$delegate", "Lkotlin/properties/ReadWriteProperty;", "middleDivider", "Lgg/essential/elementa/components/UIBlock;", "getMiddleDivider", "()Lgg/essential/elementa/components/UIBlock;", "middleDivider$delegate", "pages", "", "Lgg/essential/gui/about/components/Page;", "platformSpecific", "Lgg/essential/elementa/state/BasicState;", "", "rightPane", "Lgg/essential/gui/about/components/RightPane;", "getRightPane", "()Lgg/essential/gui/about/components/RightPane;", "rightPane$delegate", "selectedPage", "topMenu", "Lgg/essential/gui/about/components/TopMenu;", "getTopMenu", "()Lgg/essential/gui/about/components/TopMenu;", "topMenu$delegate", "updateGuiScale", "", "Companion", "essential" })
public final class AboutMenu extends EssentialGUI
{
    @NotNull
    public static final Companion Companion;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private BasicState<Boolean> platformSpecific;
    @NotNull
    private final Map<Category, Page> pages;
    @NotNull
    private final BasicState<Page> selectedPage;
    @NotNull
    private final ReadWriteProperty middleDivider$delegate;
    @NotNull
    private static final MarkdownConfig markdownConfig;
    
    public AboutMenu(@NotNull final Category category) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "category"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getstatic       gg/essential/elementa/ElementaVersion.V2:Lgg/essential/elementa/ElementaVersion;
        //    10: ldc             "Essential"
        //    12: getstatic       gg/essential/universal/GuiScale.Companion:Lgg/essential/universal/GuiScale$Companion;
        //    15: iconst_0       
        //    16: iconst_1       
        //    17: aconst_null    
        //    18: invokestatic    gg/essential/universal/GuiScale$Companion.scaleForScreenSize$default:(Lgg/essential/universal/GuiScale$Companion;IILjava/lang/Object;)Lgg/essential/universal/GuiScale;
        //    21: invokevirtual   gg/essential/universal/GuiScale.ordinal:()I
        //    24: iconst_0       
        //    25: ldc             "Learning about Essential"
        //    27: bipush          8
        //    29: aconst_null    
        //    30: invokespecial   gg/essential/api/gui/EssentialGUI.<init>:(Lgg/essential/elementa/ElementaVersion;Ljava/lang/String;IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    33: aload_0         /* this */
        //    34: new             Lgg/essential/elementa/state/BasicState;
        //    37: dup            
        //    38: iconst_1       
        //    39: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    42: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    45: putfield        gg/essential/gui/about/AboutMenu.platformSpecific:Lgg/essential/elementa/state/BasicState;
        //    48: aload_0         /* this */
        //    49: iconst_5       
        //    50: anewarray       Lkotlin/Pair;
        //    53: astore_2       
        //    54: aload_2        
        //    55: iconst_0       
        //    56: getstatic       gg/essential/gui/about/Category.CHANGELOG:Lgg/essential/gui/about/Category;
        //    59: new             Lgg/essential/gui/about/components/ChangelogPage;
        //    62: dup            
        //    63: getstatic       gg/essential/gui/about/Category.CHANGELOG:Lgg/essential/gui/about/Category;
        //    66: invokevirtual   gg/essential/gui/about/Category.getNameState:()Lgg/essential/elementa/state/BasicState;
        //    69: aload_0         /* this */
        //    70: getfield        gg/essential/gui/about/AboutMenu.platformSpecific:Lgg/essential/elementa/state/BasicState;
        //    73: invokespecial   gg/essential/gui/about/components/ChangelogPage.<init>:(Lgg/essential/elementa/state/BasicState;Lgg/essential/elementa/state/BasicState;)V
        //    76: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //    79: aastore        
        //    80: aload_2        
        //    81: iconst_1       
        //    82: getstatic       gg/essential/gui/about/Category.PRIVACY:Lgg/essential/gui/about/Category;
        //    85: new             Lgg/essential/gui/about/components/InfoPage;
        //    88: dup            
        //    89: getstatic       gg/essential/data/MenuData$FetchableCategory.PRIVACY:Lgg/essential/data/MenuData$FetchableCategory;
        //    92: ldc             ""
        //    94: ldc             ""
        //    96: invokespecial   gg/essential/gui/about/components/InfoPage.<init>:(Lgg/essential/data/MenuData$FetchableCategory;Ljava/lang/String;Ljava/lang/String;)V
        //    99: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   102: aastore        
        //   103: aload_2        
        //   104: iconst_2       
        //   105: getstatic       gg/essential/gui/about/Category.TERMS:Lgg/essential/gui/about/Category;
        //   108: new             Lgg/essential/gui/about/components/LinkPage;
        //   111: dup            
        //   112: getstatic       gg/essential/gui/about/Category.TERMS:Lgg/essential/gui/about/Category;
        //   115: invokevirtual   gg/essential/gui/about/Category.getNameState:()Lgg/essential/elementa/state/BasicState;
        //   118: ldc             "https://essential.gg/terms-of-use"
        //   120: invokespecial   gg/essential/gui/about/components/LinkPage.<init>:(Lgg/essential/elementa/state/BasicState;Ljava/lang/String;)V
        //   123: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   126: aastore        
        //   127: aload_2        
        //   128: iconst_3       
        //   129: getstatic       gg/essential/gui/about/Category.LICENSES:Lgg/essential/gui/about/Category;
        //   132: new             Lgg/essential/gui/about/components/LinkPage;
        //   135: dup            
        //   136: getstatic       gg/essential/gui/about/Category.LICENSES:Lgg/essential/gui/about/Category;
        //   139: invokevirtual   gg/essential/gui/about/Category.getNameState:()Lgg/essential/elementa/state/BasicState;
        //   142: ldc             "https://essential.gg/licenses"
        //   144: invokespecial   gg/essential/gui/about/components/LinkPage.<init>:(Lgg/essential/elementa/state/BasicState;Ljava/lang/String;)V
        //   147: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   150: aastore        
        //   151: aload_2        
        //   152: iconst_4       
        //   153: getstatic       gg/essential/gui/about/Category.IMPRINT:Lgg/essential/gui/about/Category;
        //   156: new             Lgg/essential/gui/about/components/LinkPage;
        //   159: dup            
        //   160: getstatic       gg/essential/gui/about/Category.IMPRINT:Lgg/essential/gui/about/Category;
        //   163: invokevirtual   gg/essential/gui/about/Category.getNameState:()Lgg/essential/elementa/state/BasicState;
        //   166: ldc             "https://essential.gg/imprint"
        //   168: invokespecial   gg/essential/gui/about/components/LinkPage.<init>:(Lgg/essential/elementa/state/BasicState;Ljava/lang/String;)V
        //   171: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   174: aastore        
        //   175: aload_2        
        //   176: invokestatic    kotlin/collections/MapsKt.mapOf:([Lkotlin/Pair;)Ljava/util/Map;
        //   179: putfield        gg/essential/gui/about/AboutMenu.pages:Ljava/util/Map;
        //   182: aload_0         /* this */
        //   183: new             Lgg/essential/elementa/state/BasicState;
        //   186: dup            
        //   187: aload_0         /* this */
        //   188: getfield        gg/essential/gui/about/AboutMenu.pages:Ljava/util/Map;
        //   191: aload_1         /* category */
        //   192: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   197: dup            
        //   198: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //   201: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   204: putfield        gg/essential/gui/about/AboutMenu.selectedPage:Lgg/essential/elementa/state/BasicState;
        //   207: new             Lgg/essential/gui/about/components/LeftPane;
        //   210: dup            
        //   211: aload_0         /* this */
        //   212: getfield        gg/essential/gui/about/AboutMenu.pages:Ljava/util/Map;
        //   215: aload_0         /* this */
        //   216: getfield        gg/essential/gui/about/AboutMenu.selectedPage:Lgg/essential/elementa/state/BasicState;
        //   219: invokespecial   gg/essential/gui/about/components/LeftPane.<init>:(Ljava/util/Map;Lgg/essential/elementa/state/BasicState;)V
        //   222: checkcast       Lgg/essential/elementa/UIComponent;
        //   225: astore_2        /* $this$constrain$iv */
        //   226: aload_2         /* $this$constrain$iv */
        //   227: astore_3       
        //   228: aload_3        
        //   229: astore          $this$constrain_u24lambda_u2d0$iv
        //   231: aload           $this$constrain_u24lambda_u2d0$iv
        //   233: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   236: astore          $this$leftPane_delegate_u24lambda_u2d0
        //   238: aload           $this$leftPane_delegate_u24lambda_u2d0
        //   240: bipush          25
        //   242: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   245: checkcast       Ljava/lang/Number;
        //   248: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   251: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   254: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   257: aload           $this$leftPane_delegate_u24lambda_u2d0
        //   259: bipush          100
        //   261: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   264: checkcast       Ljava/lang/Number;
        //   267: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   270: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   273: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   276: aload_3        
        //   277: aload_0         /* this */
        //   278: invokevirtual   gg/essential/gui/about/AboutMenu.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   281: checkcast       Lgg/essential/elementa/UIComponent;
        //   284: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   287: aload_0         /* this */
        //   288: getstatic       gg/essential/gui/about/AboutMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   291: iconst_0       
        //   292: aaload         
        //   293: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   296: pop            
        //   297: aload_0         /* this */
        //   298: new             Lgg/essential/elementa/components/UIBlock;
        //   301: dup            
        //   302: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   305: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   308: checkcast       Lgg/essential/elementa/UIComponent;
        //   311: astore_2        /* $this$constrain$iv */
        //   312: aload_2         /* $this$constrain$iv */
        //   313: astore_3       
        //   314: aload_3        
        //   315: astore          $this$constrain_u24lambda_u2d0$iv
        //   317: aload           $this$constrain_u24lambda_u2d0$iv
        //   319: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   322: astore          5
        //   324: astore          6
        //   326: aload           $this$middleDivider_delegate_u24lambda_u2d1
        //   328: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   331: dup            
        //   332: fconst_0       
        //   333: iconst_0       
        //   334: iconst_3       
        //   335: aconst_null    
        //   336: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   339: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   342: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   345: aload           $this$middleDivider_delegate_u24lambda_u2d1
        //   347: bipush          100
        //   349: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   352: checkcast       Ljava/lang/Number;
        //   355: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   358: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   361: aload_0         /* this */
        //   362: invokevirtual   gg/essential/gui/about/AboutMenu.getRightDivider:()Lgg/essential/elementa/components/UIBlock;
        //   365: checkcast       Lgg/essential/elementa/UIComponent;
        //   368: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   371: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   374: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   377: aload           $this$middleDivider_delegate_u24lambda_u2d1
        //   379: bipush          100
        //   381: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   384: checkcast       Ljava/lang/Number;
        //   387: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   390: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   393: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   396: aload           6
        //   398: aload_3        
        //   399: aload_0         /* this */
        //   400: invokevirtual   gg/essential/gui/about/AboutMenu.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   403: checkcast       Lgg/essential/elementa/UIComponent;
        //   406: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   409: aload_0         /* this */
        //   410: getstatic       gg/essential/gui/about/AboutMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   413: iconst_1       
        //   414: aaload         
        //   415: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   418: putfield        gg/essential/gui/about/AboutMenu.middleDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   421: new             Lgg/essential/gui/about/components/RightPane;
        //   424: dup            
        //   425: aload_0         /* this */
        //   426: aload_0         /* this */
        //   427: getfield        gg/essential/gui/about/AboutMenu.pages:Ljava/util/Map;
        //   430: aload_0         /* this */
        //   431: getfield        gg/essential/gui/about/AboutMenu.selectedPage:Lgg/essential/elementa/state/BasicState;
        //   434: invokespecial   gg/essential/gui/about/components/RightPane.<init>:(Lgg/essential/gui/about/AboutMenu;Ljava/util/Map;Lgg/essential/elementa/state/BasicState;)V
        //   437: checkcast       Lgg/essential/elementa/UIComponent;
        //   440: astore_2        /* $this$constrain$iv */
        //   441: aload_2         /* $this$constrain$iv */
        //   442: astore_3       
        //   443: aload_3        
        //   444: astore          $this$constrain_u24lambda_u2d0$iv
        //   446: aload           $this$constrain_u24lambda_u2d0$iv
        //   448: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   451: astore          $this$rightPane_delegate_u24lambda_u2d2
        //   453: aload           $this$rightPane_delegate_u24lambda_u2d2
        //   455: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   458: dup            
        //   459: fconst_0       
        //   460: iconst_0       
        //   461: iconst_3       
        //   462: aconst_null    
        //   463: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   466: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   469: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   472: aload           $this$rightPane_delegate_u24lambda_u2d2
        //   474: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   477: dup            
        //   478: iconst_0       
        //   479: iconst_1       
        //   480: aconst_null    
        //   481: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   484: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   487: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   490: aload           $this$rightPane_delegate_u24lambda_u2d2
        //   492: bipush          100
        //   494: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   497: checkcast       Ljava/lang/Number;
        //   500: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   503: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   506: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   509: aload_3        
        //   510: aload_0         /* this */
        //   511: invokevirtual   gg/essential/gui/about/AboutMenu.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   514: checkcast       Lgg/essential/elementa/UIComponent;
        //   517: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   520: aload_0         /* this */
        //   521: getstatic       gg/essential/gui/about/AboutMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   524: iconst_2       
        //   525: aaload         
        //   526: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   529: pop            
        //   530: new             Lgg/essential/gui/about/components/TopMenu;
        //   533: dup            
        //   534: aload_0         /* this */
        //   535: aload_0         /* this */
        //   536: getfield        gg/essential/gui/about/AboutMenu.platformSpecific:Lgg/essential/elementa/state/BasicState;
        //   539: aload_0         /* this */
        //   540: getfield        gg/essential/gui/about/AboutMenu.selectedPage:Lgg/essential/elementa/state/BasicState;
        //   543: invokespecial   gg/essential/gui/about/components/TopMenu.<init>:(Lgg/essential/gui/about/AboutMenu;Lgg/essential/elementa/state/BasicState;Lgg/essential/elementa/state/BasicState;)V
        //   546: checkcast       Lgg/essential/elementa/UIComponent;
        //   549: astore_2        /* $this$constrain$iv */
        //   550: aload_2         /* $this$constrain$iv */
        //   551: astore_3       
        //   552: aload_3        
        //   553: astore          $this$constrain_u24lambda_u2d0$iv
        //   555: aload           $this$constrain_u24lambda_u2d0$iv
        //   557: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   560: astore          $this$topMenu_delegate_u24lambda_u2d3
        //   562: aload           $this$topMenu_delegate_u24lambda_u2d3
        //   564: bipush          100
        //   566: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   569: checkcast       Ljava/lang/Number;
        //   572: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   575: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   578: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   581: aload           $this$topMenu_delegate_u24lambda_u2d3
        //   583: bipush          100
        //   585: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   588: checkcast       Ljava/lang/Number;
        //   591: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   594: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   597: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   600: aload_3        
        //   601: aload_0         /* this */
        //   602: invokevirtual   gg/essential/gui/about/AboutMenu.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   605: checkcast       Lgg/essential/elementa/UIComponent;
        //   608: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   611: aload_0         /* this */
        //   612: getstatic       gg/essential/gui/about/AboutMenu.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   615: iconst_3       
        //   616: aaload         
        //   617: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   620: pop            
        //   621: return         
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  category  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public AboutMenu(final byte b) {
        this(Category.CHANGELOG);
    }
    
    @NotNull
    public final UIBlock getMiddleDivider() {
        return (UIBlock)this.middleDivider$delegate.getValue((Object)this, (KProperty)AboutMenu.$$delegatedProperties[1]);
    }
    
    @Override
    public void updateGuiScale() {
        this.setNewGuiScale(GuiScale.Companion.scaleForScreenSize$default(GuiScale.Companion, 0, 1, null).ordinal());
        super.updateGuiScale();
    }
    
    public AboutMenu() {
        this((byte)0);
    }
    
    public static final /* synthetic */ MarkdownConfig access$getMarkdownConfig$cp() {
        return AboutMenu.markdownConfig;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)AboutMenu.class, "leftPane", "getLeftPane()Lgg/essential/gui/about/components/LeftPane;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)AboutMenu.class, "middleDivider", "getMiddleDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)AboutMenu.class, "rightPane", "getRightPane()Lgg/essential/gui/about/components/RightPane;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)AboutMenu.class, "topMenu", "getTopMenu()Lgg/essential/gui/about/components/TopMenu;", 0)) };
        Companion = new Companion((byte)0);
        markdownConfig = new MarkdownConfig(new HeaderConfig(null, new HeaderLevelConfig(EssentialPalette.TEXT, 2.0f, 10.0f, 6.0f, false, null, 0.0f, 0.0f, 240, null), new HeaderLevelConfig(EssentialPalette.TEXT, 1.0f, 8.0f, 3.0f, false, null, 0.0f, 0.0f, 240, null), new HeaderLevelConfig(EssentialPalette.TEXT, 1.0f, 6.0f, 3.0f, false, null, 0.0f, 0.0f, 240, null), new HeaderLevelConfig(EssentialPalette.TEXT, 1.0f, 6.0f, 3.0f, false, null, 0.0f, 0.0f, 240, null), new HeaderLevelConfig(EssentialPalette.TEXT_HIGHLIGHT, 1.0f, 14.0f, 16.0f, false, null, 0.0f, 0.0f, 240, null), new HeaderLevelConfig(EssentialPalette.TEXT_HIGHLIGHT, 1.0f, 4.0f, 3.0f, false, null, 0.0f, 0.0f, 240, null), false, 129, null), new ListConfig(null, 0.0f, 3.0f, 3.0f, 0.0f, 0.0f, 10.0f, "\u25a0\u25a1\u25aa\u25ab", false, 275, null), new ParagraphConfig(0.0f, 3.0f, 5.0f, true, false, 17, null), new TextConfig(EssentialPalette.TEXT, false, EssentialPalette.TEXT_SHADOW, null, null, EssentialPalette.ACCENT_BLUE, false, 90, null), null, null, null, null, 240, null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/about/AboutMenu$Companion;", "", "()V", "markdownConfig", "Lgg/essential/elementa/markdown/MarkdownConfig;", "getMarkdownConfig", "()Lgg/essential/elementa/markdown/MarkdownConfig;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final MarkdownConfig getMarkdownConfig() {
            return AboutMenu.access$getMarkdownConfig$cp();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
