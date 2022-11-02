package gg.essential.gui.studio;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.gui.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import java.util.*;
import gg.essential.network.cosmetics.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000D
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010$
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ*\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b	\u0010
                                                   \u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0017²\u0006
                                                   \u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/studio/CategoriesSection;", "Lgg/essential/elementa/components/UIContainer;", "cosmeticStudio", "Lgg/essential/gui/studio/CosmeticStudio;", "(Lgg/essential/gui/studio/CosmeticStudio;)V", "categoryScroller", "Lgg/essential/elementa/components/ScrollComponent;", "getCategoryScroller", "()Lgg/essential/elementa/components/ScrollComponent;", "categoryScroller$delegate", "Lkotlin/properties/ReadWriteProperty;", "createScrollbar", "", "divider", "Lgg/essential/elementa/UIComponent;", "populateCategories", "cosmeticsManager", "Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;", "studio", "visibleCosmetics", "", "", "Lgg/essential/network/cosmetics/Cosmetic;", "essential", "categoryScrollBar", "Lgg/essential/elementa/components/UIBlock;" })
public final class CategoriesSection extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final CosmeticStudio cosmeticStudio;
    @NotNull
    private final ReadWriteProperty categoryScroller$delegate;
    
    public CategoriesSection(@NotNull final CosmeticStudio cosmeticStudio) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "cosmeticStudio"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* cosmeticStudio */
        //    12: putfield        gg/essential/gui/studio/CategoriesSection.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //    15: aload_0         /* this */
        //    16: new             Lgg/essential/elementa/components/ScrollComponent;
        //    19: dup            
        //    20: aconst_null    
        //    21: fconst_0       
        //    22: aconst_null    
        //    23: iconst_0       
        //    24: iconst_0       
        //    25: iconst_0       
        //    26: iconst_0       
        //    27: fconst_0       
        //    28: fconst_0       
        //    29: aconst_null    
        //    30: sipush          1023
        //    33: aconst_null    
        //    34: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    37: checkcast       Lgg/essential/elementa/UIComponent;
        //    40: astore_2        /* $this$constrain$iv */
        //    41: aload_2         /* $this$constrain$iv */
        //    42: astore_3       
        //    43: aload_3        
        //    44: astore          $this$constrain_u24lambda_u2d0$iv
        //    46: aload           $this$constrain_u24lambda_u2d0$iv
        //    48: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    51: astore          5
        //    53: astore          6
        //    55: aload           $this$categoryScroller_delegate_u24lambda_u2d0
        //    57: bipush          100
        //    59: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    62: checkcast       Ljava/lang/Number;
        //    65: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    68: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    71: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    74: aload           $this$categoryScroller_delegate_u24lambda_u2d0
        //    76: new             Lgg/essential/elementa/constraints/FillConstraint;
        //    79: dup            
        //    80: iconst_0       
        //    81: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //    84: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //    87: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //    90: aload           6
        //    92: aload_3        
        //    93: aload_0         /* this */
        //    94: checkcast       Lgg/essential/elementa/UIComponent;
        //    97: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   100: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //   103: bipush          20
        //   105: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   108: checkcast       Ljava/lang/Number;
        //   111: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   114: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   117: invokestatic    gg/essential/util/ExtensionsKt.scrollGradient:(Lgg/essential/elementa/components/ScrollComponent;Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/components/ScrollComponent;
        //   120: checkcast       Lgg/essential/elementa/UIComponent;
        //   123: aload_0         /* this */
        //   124: getstatic       gg/essential/gui/studio/CategoriesSection.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   127: iconst_0       
        //   128: aaload         
        //   129: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   132: putfield        gg/essential/gui/studio/CategoriesSection.categoryScroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //   135: aload_0         /* this */
        //   136: checkcast       Lgg/essential/elementa/UIComponent;
        //   139: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   142: dup            
        //   143: aconst_null    
        //   144: iconst_0       
        //   145: iconst_3       
        //   146: aconst_null    
        //   147: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   150: checkcast       Lgg/essential/elementa/effects/Effect;
        //   153: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   156: pop            
        //   157: return         
        //    MethodParameters:
        //  Name            Flags  
        //  --------------  -----
        //  cosmeticStudio  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final ScrollComponent getCategoryScroller() {
        return (ScrollComponent)this.categoryScroller$delegate.getValue((Object)this, (KProperty)CategoriesSection.$$delegatedProperties[0]);
    }
    
    public final void createScrollbar(@NotNull final UIComponent divider) {
        Intrinsics.checkNotNullParameter((Object)divider, "divider");
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIBlock(EssentialPalette.SCROLLBAR);
        final UIConstraints $this$createScrollbar_u24lambda_u2d1 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$createScrollbar_u24lambda_u2d1.setX(new CenterConstraint());
        $this$createScrollbar_u24lambda_u2d1.setWidth(UtilitiesKt.getPercent(100));
        final ReadWriteProperty categoryScrollBar$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, divider), null, CategoriesSection.$$delegatedProperties[1]);
        this.getCategoryScroller().setVerticalScrollBarComponent(createScrollbar$lambda-2((ReadWriteProperty<Object, UIBlock>)categoryScrollBar$delegate), true);
    }
    
    public final void populateCategories(@NotNull final CosmeticsManager cosmeticsManager, @NotNull final CosmeticStudio studio, @NotNull final Map<String, Cosmetic> visibleCosmetics) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "cosmeticsManager"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* studio */
        //     7: ldc             "studio"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* visibleCosmetics */
        //    13: ldc             "visibleCosmetics"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload_0         /* this */
        //    19: invokespecial   gg/essential/gui/studio/CategoriesSection.getCategoryScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //    22: invokevirtual   gg/essential/elementa/components/ScrollComponent.clearChildren:()Lgg/essential/elementa/components/ScrollComponent;
        //    25: pop            
        //    26: aload_1         /* cosmeticsManager */
        //    27: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getCategories:()Ljava/util/Set;
        //    30: dup            
        //    31: ldc             "cosmeticsManager.categories"
        //    33: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    36: checkcast       Ljava/lang/Iterable;
        //    39: astore          $this$firstOrNull$iv
        //    41: aload           $this$firstOrNull$iv
        //    43: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    48: astore          7
        //    50: aload           7
        //    52: invokeinterface java/util/Iterator.hasNext:()Z
        //    57: ifeq            94
        //    60: aload           7
        //    62: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    67: astore          element$iv
        //    69: aload           element$iv
        //    71: checkcast       Lgg/essential/cosmetics/model/CosmeticCategory;
        //    74: astore          it
        //    76: aload           it
        //    78: invokevirtual   gg/essential/cosmetics/model/CosmeticCategory.getId:()Ljava/lang/String;
        //    81: ldc             "FEATURED"
        //    83: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    86: ifeq            50
        //    89: aload           element$iv
        //    91: goto            95
        //    94: aconst_null    
        //    95: checkcast       Lgg/essential/cosmetics/model/CosmeticCategory;
        //    98: astore          featured
        //   100: aload           featured
        //   102: ifnull          155
        //   105: new             Lgg/essential/gui/studio/CosmeticStudio$Category$InfraSlot;
        //   108: dup            
        //   109: aload           featured
        //   111: invokespecial   gg/essential/gui/studio/CosmeticStudio$Category$InfraSlot.<init>:(Lgg/essential/cosmetics/model/CosmeticCategory;)V
        //   114: astore          category
        //   116: new             Lgg/essential/gui/studio/CategoryOption;
        //   119: dup            
        //   120: aload           category
        //   122: checkcast       Lgg/essential/gui/studio/CosmeticStudio$Category;
        //   125: aload_0         /* this */
        //   126: getfield        gg/essential/gui/studio/CategoriesSection.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //   129: invokespecial   gg/essential/gui/studio/CategoryOption.<init>:(Lgg/essential/gui/studio/CosmeticStudio$Category;Lgg/essential/gui/studio/CosmeticStudio;)V
        //   132: checkcast       Lgg/essential/elementa/UIComponent;
        //   135: aload_0         /* this */
        //   136: invokespecial   gg/essential/gui/studio/CategoriesSection.getCategoryScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   139: checkcast       Lgg/essential/elementa/UIComponent;
        //   142: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   145: pop            
        //   146: aload_2         /* studio */
        //   147: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getSelectedCategory:()Lgg/essential/elementa/state/BasicState;
        //   150: aload           category
        //   152: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //   155: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //   158: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //   161: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getNoticesManager:()Lgg/essential/network/connectionmanager/notices/NoticesManager;
        //   164: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager.getCosmeticNotices:()Lgg/essential/network/connectionmanager/notices/NoticesManager$CosmeticNotices;
        //   167: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager$CosmeticNotices.getHasAnyNewCosmetics:()Lgg/essential/elementa/state/State;
        //   170: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   173: dup            
        //   174: ldc_w           "getInstance().connection\u2026.hasAnyNewCosmetics.get()"
        //   177: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   180: checkcast       Ljava/lang/Boolean;
        //   183: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   186: ifeq            220
        //   189: new             Lgg/essential/gui/studio/CategoryOption;
        //   192: dup            
        //   193: getstatic       gg/essential/gui/studio/CosmeticStudio$Category$New.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$Category$New;
        //   196: checkcast       Lgg/essential/gui/studio/CosmeticStudio$Category;
        //   199: aload_0         /* this */
        //   200: getfield        gg/essential/gui/studio/CategoriesSection.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //   203: invokespecial   gg/essential/gui/studio/CategoryOption.<init>:(Lgg/essential/gui/studio/CosmeticStudio$Category;Lgg/essential/gui/studio/CosmeticStudio;)V
        //   206: checkcast       Lgg/essential/elementa/UIComponent;
        //   209: aload_0         /* this */
        //   210: invokespecial   gg/essential/gui/studio/CategoriesSection.getCategoryScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   213: checkcast       Lgg/essential/elementa/UIComponent;
        //   216: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   219: pop            
        //   220: new             Lgg/essential/gui/studio/CategoryOption;
        //   223: dup            
        //   224: getstatic       gg/essential/gui/studio/CosmeticStudio$Category$Owned.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$Category$Owned;
        //   227: checkcast       Lgg/essential/gui/studio/CosmeticStudio$Category;
        //   230: aload_0         /* this */
        //   231: getfield        gg/essential/gui/studio/CategoriesSection.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //   234: invokespecial   gg/essential/gui/studio/CategoryOption.<init>:(Lgg/essential/gui/studio/CosmeticStudio$Category;Lgg/essential/gui/studio/CosmeticStudio;)V
        //   237: checkcast       Lgg/essential/elementa/UIComponent;
        //   240: aload_0         /* this */
        //   241: invokespecial   gg/essential/gui/studio/CategoriesSection.getCategoryScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   244: checkcast       Lgg/essential/elementa/UIComponent;
        //   247: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   250: pop            
        //   251: aload_3         /* visibleCosmetics */
        //   252: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   257: checkcast       Ljava/lang/Iterable;
        //   260: astore          $this$any$iv
        //   262: aload           $this$any$iv
        //   264: instanceof      Ljava/util/Collection;
        //   267: ifeq            287
        //   270: aload           $this$any$iv
        //   272: checkcast       Ljava/util/Collection;
        //   275: invokeinterface java/util/Collection.isEmpty:()Z
        //   280: ifeq            287
        //   283: iconst_0       
        //   284: goto            363
        //   287: aload           $this$any$iv
        //   289: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   294: astore          7
        //   296: aload           7
        //   298: invokeinterface java/util/Iterator.hasNext:()Z
        //   303: ifeq            362
        //   306: aload           7
        //   308: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   313: astore          element$iv
        //   315: aload           element$iv
        //   317: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   320: astore          it
        //   322: aload           it
        //   324: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getType:()Lgg/essential/mod/cosmetics/CosmeticType;
        //   327: invokevirtual   gg/essential/mod/cosmetics/CosmeticType.getSlot:()Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   330: getstatic       gg/essential/mod/cosmetics/CosmeticSlot.CAPE:Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   333: if_acmpne       354
        //   336: aload           it
        //   338: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //   341: ldc_w           "CAPE_DISABLED"
        //   344: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   347: ifne            354
        //   350: iconst_1       
        //   351: goto            355
        //   354: iconst_0       
        //   355: ifeq            296
        //   358: iconst_1       
        //   359: goto            363
        //   362: iconst_0       
        //   363: ifeq            404
        //   366: new             Lgg/essential/gui/studio/CategoryOption;
        //   369: dup            
        //   370: new             Lgg/essential/gui/studio/CosmeticStudio$Category$Slot;
        //   373: dup            
        //   374: getstatic       gg/essential/mod/cosmetics/CosmeticSlot.CAPE:Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   377: invokespecial   gg/essential/gui/studio/CosmeticStudio$Category$Slot.<init>:(Lgg/essential/mod/cosmetics/CosmeticSlot;)V
        //   380: checkcast       Lgg/essential/gui/studio/CosmeticStudio$Category;
        //   383: aload_0         /* this */
        //   384: getfield        gg/essential/gui/studio/CategoriesSection.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //   387: invokespecial   gg/essential/gui/studio/CategoryOption.<init>:(Lgg/essential/gui/studio/CosmeticStudio$Category;Lgg/essential/gui/studio/CosmeticStudio;)V
        //   390: checkcast       Lgg/essential/elementa/UIComponent;
        //   393: aload_0         /* this */
        //   394: invokespecial   gg/essential/gui/studio/CategoriesSection.getCategoryScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   397: checkcast       Lgg/essential/elementa/UIComponent;
        //   400: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   403: pop            
        //   404: new             Lgg/essential/gui/studio/CosmeticStudio$CosmeticDivider;
        //   407: dup            
        //   408: invokespecial   gg/essential/gui/studio/CosmeticStudio$CosmeticDivider.<init>:()V
        //   411: checkcast       Lgg/essential/elementa/UIComponent;
        //   414: aload_0         /* this */
        //   415: invokespecial   gg/essential/gui/studio/CategoriesSection.getCategoryScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   418: checkcast       Lgg/essential/elementa/UIComponent;
        //   421: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   424: pop            
        //   425: aload_1         /* cosmeticsManager */
        //   426: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getCategories:()Ljava/util/Set;
        //   429: dup            
        //   430: ldc             "cosmeticsManager.categories"
        //   432: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   435: checkcast       Ljava/lang/Iterable;
        //   438: astore          $this$sortedBy$iv
        //   440: aload           $this$sortedBy$iv
        //   442: new             Lgg/essential/gui/studio/CategoriesSection$populateCategories$$inlined$sortedBy$1;
        //   445: dup            
        //   446: invokespecial   gg/essential/gui/studio/CategoriesSection$populateCategories$$inlined$sortedBy$1.<init>:()V
        //   449: checkcast       Ljava/util/Comparator;
        //   452: invokestatic    kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        //   455: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   460: astore          5
        //   462: aload           5
        //   464: invokeinterface java/util/Iterator.hasNext:()Z
        //   469: ifeq            657
        //   472: aload           5
        //   474: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   479: checkcast       Lgg/essential/cosmetics/model/CosmeticCategory;
        //   482: astore          category
        //   484: aload           category
        //   486: invokevirtual   gg/essential/cosmetics/model/CosmeticCategory.getId:()Ljava/lang/String;
        //   489: ldc             "FEATURED"
        //   491: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   494: ifne            462
        //   497: aload_3         /* visibleCosmetics */
        //   498: astore          $this$any$iv
        //   500: aload           $this$any$iv
        //   502: invokeinterface java/util/Map.isEmpty:()Z
        //   507: ifeq            514
        //   510: iconst_0       
        //   511: goto            602
        //   514: aload           $this$any$iv
        //   516: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   521: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   526: astore          9
        //   528: aload           9
        //   530: invokeinterface java/util/Iterator.hasNext:()Z
        //   535: ifeq            601
        //   538: aload           9
        //   540: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   545: checkcast       Ljava/util/Map$Entry;
        //   548: astore          element$iv
        //   550: aload           element$iv
        //   552: astore          it
        //   554: aload           it
        //   556: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   561: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   564: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getCategories:()Ljava/util/Map;
        //   567: dup            
        //   568: ifnull          580
        //   571: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   576: dup            
        //   577: ifnonnull       584
        //   580: pop            
        //   581: invokestatic    kotlin/collections/SetsKt.emptySet:()Ljava/util/Set;
        //   584: aload           category
        //   586: invokevirtual   gg/essential/cosmetics/model/CosmeticCategory.getId:()Ljava/lang/String;
        //   589: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   594: ifeq            528
        //   597: iconst_1       
        //   598: goto            602
        //   601: iconst_0       
        //   602: ifeq            462
        //   605: new             Lgg/essential/gui/studio/CategoryOption;
        //   608: dup            
        //   609: new             Lgg/essential/gui/studio/CosmeticStudio$Category$InfraSlot;
        //   612: dup            
        //   613: aload           category
        //   615: ldc_w           "category"
        //   618: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   621: aload           category
        //   623: invokespecial   gg/essential/gui/studio/CosmeticStudio$Category$InfraSlot.<init>:(Lgg/essential/cosmetics/model/CosmeticCategory;)V
        //   626: checkcast       Lgg/essential/gui/studio/CosmeticStudio$Category;
        //   629: aload_0         /* this */
        //   630: getfield        gg/essential/gui/studio/CategoriesSection.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //   633: invokespecial   gg/essential/gui/studio/CategoryOption.<init>:(Lgg/essential/gui/studio/CosmeticStudio$Category;Lgg/essential/gui/studio/CosmeticStudio;)V
        //   636: astore          categoryOption
        //   638: aload           categoryOption
        //   640: checkcast       Lgg/essential/elementa/UIComponent;
        //   643: aload_0         /* this */
        //   644: invokespecial   gg/essential/gui/studio/CategoriesSection.getCategoryScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   647: checkcast       Lgg/essential/elementa/UIComponent;
        //   650: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   653: pop            
        //   654: goto            462
        //   657: new             Lgg/essential/gui/studio/CosmeticStudio$CosmeticDivider;
        //   660: dup            
        //   661: invokespecial   gg/essential/gui/studio/CosmeticStudio$CosmeticDivider.<init>:()V
        //   664: checkcast       Lgg/essential/elementa/UIComponent;
        //   667: aload_0         /* this */
        //   668: invokespecial   gg/essential/gui/studio/CategoriesSection.getCategoryScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   671: checkcast       Lgg/essential/elementa/UIComponent;
        //   674: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   677: pop            
        //   678: getstatic       gg/essential/gui/studio/CosmeticStudio.Companion:Lgg/essential/gui/studio/CosmeticStudio$Companion;
        //   681: invokevirtual   gg/essential/gui/studio/CosmeticStudio$Companion.getSlotOrder:()[Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   684: astore          $this$filter$iv
        //   686: aload           $this$filter$iv
        //   688: astore          7
        //   690: new             Ljava/util/ArrayList;
        //   693: dup            
        //   694: invokespecial   java/util/ArrayList.<init>:()V
        //   697: checkcast       Ljava/util/Collection;
        //   700: astore          destination$iv$iv
        //   702: iconst_0       
        //   703: istore          10
        //   705: aload           $this$filterTo$iv$iv
        //   707: arraylength    
        //   708: istore          11
        //   710: iload           10
        //   712: iload           11
        //   714: if_icmpge       851
        //   717: aload           $this$filterTo$iv$iv
        //   719: iload           10
        //   721: aaload         
        //   722: astore          element$iv$iv
        //   724: aload           element$iv$iv
        //   726: astore          category
        //   728: aload_3         /* visibleCosmetics */
        //   729: astore          $this$any$iv
        //   731: aload           $this$any$iv
        //   733: invokeinterface java/util/Map.isEmpty:()Z
        //   738: ifeq            745
        //   741: iconst_0       
        //   742: goto            832
        //   745: aload           $this$any$iv
        //   747: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   752: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   757: astore          15
        //   759: aload           15
        //   761: invokeinterface java/util/Iterator.hasNext:()Z
        //   766: ifeq            831
        //   769: aload           15
        //   771: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   776: checkcast       Ljava/util/Map$Entry;
        //   779: astore          element$iv
        //   781: aload           element$iv
        //   783: astore          it
        //   785: aload_1         /* cosmeticsManager */
        //   786: aload           it
        //   788: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   793: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   796: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getTypeId:()Ljava/lang/String;
        //   799: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getCosmeticType:(Ljava/lang/String;)Lgg/essential/mod/cosmetics/CosmeticType;
        //   802: dup            
        //   803: ifnull          812
        //   806: invokevirtual   gg/essential/mod/cosmetics/CosmeticType.getSlot:()Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   809: goto            814
        //   812: pop            
        //   813: aconst_null    
        //   814: aload           category
        //   816: if_acmpne       823
        //   819: iconst_1       
        //   820: goto            824
        //   823: iconst_0       
        //   824: ifeq            759
        //   827: iconst_1       
        //   828: goto            832
        //   831: iconst_0       
        //   832: ifeq            845
        //   835: aload           destination$iv$iv
        //   837: aload           element$iv$iv
        //   839: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   844: pop            
        //   845: iinc            10, 1
        //   848: goto            710
        //   851: aload           destination$iv$iv
        //   853: checkcast       Ljava/util/List;
        //   856: checkcast       Ljava/lang/Iterable;
        //   859: astore          $this$forEach$iv
        //   861: aload           $this$forEach$iv
        //   863: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   868: astore          7
        //   870: aload           7
        //   872: invokeinterface java/util/Iterator.hasNext:()Z
        //   877: ifeq            936
        //   880: aload           7
        //   882: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   887: astore          element$iv
        //   889: aload           element$iv
        //   891: checkcast       Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   894: astore          it
        //   896: new             Lgg/essential/gui/studio/CategoryOption;
        //   899: dup            
        //   900: new             Lgg/essential/gui/studio/CosmeticStudio$Category$Slot;
        //   903: dup            
        //   904: aload           it
        //   906: invokespecial   gg/essential/gui/studio/CosmeticStudio$Category$Slot.<init>:(Lgg/essential/mod/cosmetics/CosmeticSlot;)V
        //   909: checkcast       Lgg/essential/gui/studio/CosmeticStudio$Category;
        //   912: aload_0         /* this */
        //   913: getfield        gg/essential/gui/studio/CategoriesSection.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //   916: invokespecial   gg/essential/gui/studio/CategoryOption.<init>:(Lgg/essential/gui/studio/CosmeticStudio$Category;Lgg/essential/gui/studio/CosmeticStudio;)V
        //   919: checkcast       Lgg/essential/elementa/UIComponent;
        //   922: aload_0         /* this */
        //   923: invokespecial   gg/essential/gui/studio/CategoriesSection.getCategoryScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //   926: checkcast       Lgg/essential/elementa/UIComponent;
        //   929: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   932: pop            
        //   933: goto            870
        //   936: return         
        //    Signature:
        //  (Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;Lgg/essential/gui/studio/CosmeticStudio;Ljava/util/Map<Ljava/lang/String;Lgg/essential/network/cosmetics/Cosmetic;>;)V
        //    MethodParameters:
        //  Name              Flags  
        //  ----------------  -----
        //  cosmeticsManager  
        //  studio            
        //  visibleCosmetics  
        //    StackMapTable: 00 21 FF 00 32 00 08 07 00 02 07 00 BF 07 00 D0 07 00 D2 00 00 00 07 00 D4 00 00 FF 00 2B 00 04 07 00 02 07 00 BF 07 00 D0 07 00 D2 00 00 40 07 00 EA FF 00 3B 00 04 07 00 02 07 00 BF 00 07 00 D2 00 00 FB 00 40 FD 00 42 00 07 00 CA FF 00 08 00 08 07 00 02 07 00 BF 00 07 00 D2 00 00 00 07 00 D4 00 00 39 40 01 FF 00 06 00 04 07 00 02 07 00 BF 00 07 00 D2 00 00 40 01 28 FD 00 39 00 07 00 D4 FD 00 33 07 00 DE 07 00 D2 FF 00 0D 00 0A 07 00 02 07 00 BF 00 07 00 D2 00 07 00 D4 07 00 DE 00 00 07 00 D4 00 00 73 07 00 EA 43 07 01 6D F8 00 10 40 01 F8 00 36 FF 00 34 00 0C 07 00 02 07 00 BF 00 07 00 D2 00 00 00 07 01 92 07 01 39 00 01 01 00 00 FE 00 22 07 01 4A 07 01 4A 07 00 D2 FF 00 0D 00 10 07 00 02 07 00 BF 00 07 00 D2 00 00 00 07 01 92 07 01 39 00 01 01 07 01 4A 07 01 4A 00 07 00 D4 00 00 74 07 01 44 41 07 01 4A 08 40 01 F8 00 06 40 01 FA 00 0C FF 00 05 00 09 07 00 02 00 00 00 00 00 00 00 07 01 39 00 00 FF 00 12 00 08 07 00 02 00 00 00 00 00 00 07 00 D4 00 00 FF 00 41 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final UIBlock createScrollbar$lambda-2(final ReadWriteProperty<Object, UIBlock> $categoryScrollBar$delegate) {
        return (UIBlock)$categoryScrollBar$delegate.getValue((Object)null, (KProperty)CategoriesSection.$$delegatedProperties[1]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CategoriesSection.class, "categoryScroller", "getCategoryScroller()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)CategoriesSection.class, "categoryScrollBar", "<v#0>", 0)) };
    }
}
