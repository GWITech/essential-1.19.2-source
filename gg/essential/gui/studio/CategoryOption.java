package gg.essential.gui.studio;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import java.util.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import kotlin.properties.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.elementa.components.*;
import java.awt.*;
import gg.essential.gui.common.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000T
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0013\u0010\u0007\u001a\u00070\b¢\u0006\u0002\b	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R&\u0010
                                                   \u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006 """ }, d2 = { "Lgg/essential/gui/studio/CategoryOption;", "Lgg/essential/elementa/components/UIBlock;", "category", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "cosmeticStudio", "Lgg/essential/gui/studio/CosmeticStudio;", "(Lgg/essential/gui/studio/CosmeticStudio$Category;Lgg/essential/gui/studio/CosmeticStudio;)V", "cosmeticsManager", "Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;", "Lorg/jetbrains/annotations/NotNull;", "equipped", "Lgg/essential/elementa/state/MappedState;", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "", "", "hovered", "Lgg/essential/elementa/state/State;", "icon", "Lgg/essential/gui/common/shadow/ShadowIcon;", "getIcon", "()Lgg/essential/gui/common/shadow/ShadowIcon;", "icon$delegate", "Lkotlin/properties/ReadWriteProperty;", "label", "Lgg/essential/elementa/components/UIText;", "getLabel", "()Lgg/essential/elementa/components/UIText;", "label$delegate", "selected", "textIconColor", "Ljava/awt/Color;", "essential" })
public final class CategoryOption extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final CosmeticStudio.Category category;
    @NotNull
    private final CosmeticStudio cosmeticStudio;
    @NotNull
    private final MappedState<CosmeticStudio.Category, Boolean> selected;
    @NotNull
    private final State<Boolean> hovered;
    @NotNull
    private final MappedState<Map<CosmeticSlot, String>, Boolean> equipped;
    @NotNull
    private final CosmeticsManager cosmeticsManager;
    @NotNull
    private final ReadWriteProperty icon$delegate;
    @NotNull
    private final ReadWriteProperty label$delegate;
    
    public CategoryOption(@NotNull final CosmeticStudio.Category category, @NotNull final CosmeticStudio cosmeticStudio) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "category"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* cosmeticStudio */
        //     7: ldc             "cosmeticStudio"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: aconst_null    
        //    14: iconst_1       
        //    15: aconst_null    
        //    16: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    19: aload_0         /* this */
        //    20: aload_1         /* category */
        //    21: putfield        gg/essential/gui/studio/CategoryOption.category:Lgg/essential/gui/studio/CosmeticStudio$Category;
        //    24: aload_0         /* this */
        //    25: aload_2         /* cosmeticStudio */
        //    26: putfield        gg/essential/gui/studio/CategoryOption.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //    29: aload_0         /* this */
        //    30: aload_0         /* this */
        //    31: getfield        gg/essential/gui/studio/CategoryOption.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //    34: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getSelectedCategory:()Lgg/essential/elementa/state/BasicState;
        //    37: new             Lgg/essential/gui/studio/CategoryOption$selected$1;
        //    40: dup            
        //    41: aload_0         /* this */
        //    42: invokespecial   gg/essential/gui/studio/CategoryOption$selected$1.<init>:(Lgg/essential/gui/studio/CategoryOption;)V
        //    45: checkcast       Lkotlin/jvm/functions/Function1;
        //    48: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    51: putfield        gg/essential/gui/studio/CategoryOption.selected:Lgg/essential/elementa/state/MappedState;
        //    54: aload_0         /* this */
        //    55: aload_0         /* this */
        //    56: checkcast       Lgg/essential/elementa/UIComponent;
        //    59: iconst_0       
        //    60: iconst_0       
        //    61: iconst_3       
        //    62: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //    65: putfield        gg/essential/gui/studio/CategoryOption.hovered:Lgg/essential/elementa/state/State;
        //    68: aload_0         /* this */
        //    69: aload_0         /* this */
        //    70: getfield        gg/essential/gui/studio/CategoryOption.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //    73: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getEquippedCosmeticsState:()Lgg/essential/elementa/state/State;
        //    76: new             Lgg/essential/gui/studio/CategoryOption$equipped$1;
        //    79: dup            
        //    80: aload_0         /* this */
        //    81: invokespecial   gg/essential/gui/studio/CategoryOption$equipped$1.<init>:(Lgg/essential/gui/studio/CategoryOption;)V
        //    84: checkcast       Lkotlin/jvm/functions/Function1;
        //    87: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    90: putfield        gg/essential/gui/studio/CategoryOption.equipped:Lgg/essential/elementa/state/MappedState;
        //    93: aload_0         /* this */
        //    94: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    97: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //   100: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getCosmeticsManager:()Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   103: dup            
        //   104: ldc             "getInstance().connectionManager.cosmeticsManager"
        //   106: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   109: putfield        gg/essential/gui/studio/CategoryOption.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   112: aload_0         /* this */
        //   113: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //   116: dup            
        //   117: new             Lgg/essential/gui/studio/CategoryOption$icon$2;
        //   120: dup            
        //   121: aload_0         /* this */
        //   122: invokespecial   gg/essential/gui/studio/CategoryOption$icon$2.<init>:(Lgg/essential/gui/studio/CategoryOption;)V
        //   125: checkcast       Lkotlin/jvm/functions/Function0;
        //   128: invokestatic    gg/essential/gui/image/ImageFactoryKt.ImageFactory:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/image/ImageFactory;
        //   131: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //   134: checkcast       Lgg/essential/elementa/UIComponent;
        //   137: astore_3        /* $this$constrain$iv */
        //   138: aload_3         /* $this$constrain$iv */
        //   139: astore          4
        //   141: aload           4
        //   143: astore          $this$constrain_u24lambda_u2d0$iv
        //   145: aload           $this$constrain_u24lambda_u2d0$iv
        //   147: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   150: astore          7
        //   152: astore          8
        //   154: aload           $this$icon_delegate_u24lambda_u2d0
        //   156: bipush          10
        //   158: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   161: checkcast       Ljava/lang/Number;
        //   164: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   167: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   170: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   173: aload           $this$icon_delegate_u24lambda_u2d0
        //   175: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   178: dup            
        //   179: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   182: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   185: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   188: aload           $this$icon_delegate_u24lambda_u2d0
        //   190: bipush          16
        //   192: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   195: checkcast       Ljava/lang/Number;
        //   198: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   201: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   204: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   207: aload           $this$icon_delegate_u24lambda_u2d0
        //   209: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   212: dup            
        //   213: fconst_0       
        //   214: iconst_1       
        //   215: aconst_null    
        //   216: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   219: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   222: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   225: aload           8
        //   227: aload           4
        //   229: aload_0         /* this */
        //   230: checkcast       Lgg/essential/elementa/UIComponent;
        //   233: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   236: aload_0         /* this */
        //   237: getstatic       gg/essential/gui/studio/CategoryOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   240: iconst_0       
        //   241: aaload         
        //   242: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   245: putfield        gg/essential/gui/studio/CategoryOption.icon$delegate:Lkotlin/properties/ReadWriteProperty;
        //   248: aload_0         /* this */
        //   249: aload_0         /* this */
        //   250: getfield        gg/essential/gui/studio/CategoryOption.category:Lgg/essential/gui/studio/CosmeticStudio$Category;
        //   253: instanceof      Lgg/essential/gui/studio/CosmeticStudio$Category$InfraSlot;
        //   256: ifeq            360
        //   259: aload_0         /* this */
        //   260: getfield        gg/essential/gui/studio/CategoryOption.category:Lgg/essential/gui/studio/CosmeticStudio$Category;
        //   263: checkcast       Lgg/essential/gui/studio/CosmeticStudio$Category$InfraSlot;
        //   266: invokevirtual   gg/essential/gui/studio/CosmeticStudio$Category$InfraSlot.getCategory:()Lgg/essential/cosmetics/model/CosmeticCategory;
        //   269: ldc             "en_us"
        //   271: invokevirtual   gg/essential/cosmetics/model/CosmeticCategory.getCompactName:(Ljava/lang/String;)Ljava/lang/String;
        //   274: dup            
        //   275: ifnull          323
        //   278: astore          5
        //   280: aload           5
        //   282: astore          6
        //   284: astore          8
        //   286: aload           it
        //   288: checkcast       Ljava/lang/CharSequence;
        //   291: invokeinterface java/lang/CharSequence.length:()I
        //   296: ifne            303
        //   299: iconst_1       
        //   300: goto            304
        //   303: iconst_0       
        //   304: istore          9
        //   306: aload           8
        //   308: iload           9
        //   310: ifne            318
        //   313: aload           5
        //   315: goto            319
        //   318: aconst_null    
        //   319: dup            
        //   320: ifnonnull       379
        //   323: pop            
        //   324: aload_0         /* this */
        //   325: getfield        gg/essential/gui/studio/CategoryOption.category:Lgg/essential/gui/studio/CosmeticStudio$Category;
        //   328: checkcast       Lgg/essential/gui/studio/CosmeticStudio$Category$InfraSlot;
        //   331: invokevirtual   gg/essential/gui/studio/CosmeticStudio$Category$InfraSlot.getCategory:()Lgg/essential/cosmetics/model/CosmeticCategory;
        //   334: ldc             "en_us"
        //   336: invokevirtual   gg/essential/cosmetics/model/CosmeticCategory.getDisplayName:(Ljava/lang/String;)Ljava/lang/String;
        //   339: dup            
        //   340: ifnonnull       379
        //   343: pop            
        //   344: aload_0         /* this */
        //   345: getfield        gg/essential/gui/studio/CategoryOption.category:Lgg/essential/gui/studio/CosmeticStudio$Category;
        //   348: checkcast       Lgg/essential/gui/studio/CosmeticStudio$Category$InfraSlot;
        //   351: invokevirtual   gg/essential/gui/studio/CosmeticStudio$Category$InfraSlot.getCategory:()Lgg/essential/cosmetics/model/CosmeticCategory;
        //   354: invokevirtual   gg/essential/cosmetics/model/CosmeticCategory.getId:()Ljava/lang/String;
        //   357: goto            379
        //   360: aload_0         /* this */
        //   361: getfield        gg/essential/gui/studio/CategoryOption.category:Lgg/essential/gui/studio/CosmeticStudio$Category;
        //   364: invokevirtual   gg/essential/gui/studio/CosmeticStudio$Category.getId:()Ljava/lang/String;
        //   367: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   372: iconst_0       
        //   373: anewarray       Ljava/lang/Object;
        //   376: invokestatic    net/minecraft/client/resource/language/I18n.translate:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   379: astore_3       
        //   380: aload_3        
        //   381: ldc_w           "if (category is Cosmetic\u2026{category.id}\")\n        }"
        //   384: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   387: aload_3        
        //   388: aconst_null    
        //   389: astore          10
        //   391: astore          11
        //   393: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   396: dup            
        //   397: aload           11
        //   399: iconst_0       
        //   400: aload           10
        //   402: iconst_0       
        //   403: iconst_0       
        //   404: iconst_0       
        //   405: bipush          62
        //   407: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   410: checkcast       Lgg/essential/elementa/UIComponent;
        //   413: astore_3        /* $this$constrain$iv */
        //   414: aload_3         /* $this$constrain$iv */
        //   415: astore          4
        //   417: aload           4
        //   419: astore          $this$constrain_u24lambda_u2d0$iv
        //   421: aload           $this$constrain_u24lambda_u2d0$iv
        //   423: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   426: astore          7
        //   428: astore          8
        //   430: aload           $this$label_delegate_u24lambda_u2d2
        //   432: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   435: dup            
        //   436: ldc_w           4.0
        //   439: iconst_0       
        //   440: iconst_2       
        //   441: aconst_null    
        //   442: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   445: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   448: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   451: aload           $this$label_delegate_u24lambda_u2d2
        //   453: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   456: dup            
        //   457: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   460: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   463: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   466: aload           8
        //   468: aload           4
        //   470: checkcast       Lgg/essential/gui/common/shadow/EssentialUIText;
        //   473: aload_0         /* this */
        //   474: getfield        gg/essential/gui/studio/CategoryOption.selected:Lgg/essential/elementa/state/MappedState;
        //   477: getstatic       gg/essential/gui/studio/CategoryOption$label$4.INSTANCE:Lgg/essential/gui/studio/CategoryOption$label$4;
        //   480: checkcast       Lkotlin/jvm/functions/Function1;
        //   483: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   486: checkcast       Lgg/essential/elementa/state/State;
        //   489: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindShadowColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   492: checkcast       Lgg/essential/elementa/UIComponent;
        //   495: aload_0         /* this */
        //   496: checkcast       Lgg/essential/elementa/UIComponent;
        //   499: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   502: aload_0         /* this */
        //   503: getstatic       gg/essential/gui/studio/CategoryOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   506: iconst_1       
        //   507: aaload         
        //   508: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   511: putfield        gg/essential/gui/studio/CategoryOption.label$delegate:Lkotlin/properties/ReadWriteProperty;
        //   514: aload_0         /* this */
        //   515: aload_0         /* this */
        //   516: getfield        gg/essential/gui/studio/CategoryOption.selected:Lgg/essential/elementa/state/MappedState;
        //   519: checkcast       Lgg/essential/elementa/state/State;
        //   522: aload_0         /* this */
        //   523: getfield        gg/essential/gui/studio/CategoryOption.hovered:Lgg/essential/elementa/state/State;
        //   526: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   529: aload_0         /* this */
        //   530: getfield        gg/essential/gui/studio/CategoryOption.equipped:Lgg/essential/elementa/state/MappedState;
        //   533: checkcast       Lgg/essential/elementa/state/State;
        //   536: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   539: getstatic       gg/essential/gui/studio/CategoryOption$1.INSTANCE:Lgg/essential/gui/studio/CategoryOption$1;
        //   542: checkcast       Lkotlin/jvm/functions/Function1;
        //   545: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   548: checkcast       Lgg/essential/elementa/state/State;
        //   551: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   554: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   557: invokevirtual   gg/essential/gui/studio/CategoryOption.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   560: pop            
        //   561: aload_0         /* this */
        //   562: invokespecial   gg/essential/gui/studio/CategoryOption.getLabel:()Lgg/essential/elementa/components/UIText;
        //   565: aload_0         /* this */
        //   566: invokespecial   gg/essential/gui/studio/CategoryOption.textIconColor:()Lgg/essential/elementa/state/State;
        //   569: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   572: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   575: invokevirtual   gg/essential/elementa/components/UIText.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   578: pop            
        //   579: aload_0         /* this */
        //   580: invokespecial   gg/essential/gui/studio/CategoryOption.getIcon:()Lgg/essential/gui/common/shadow/ShadowIcon;
        //   583: aload_0         /* this */
        //   584: invokespecial   gg/essential/gui/studio/CategoryOption.textIconColor:()Lgg/essential/elementa/state/State;
        //   587: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   590: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   593: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   596: pop            
        //   597: aload_0         /* this */
        //   598: checkcast       Lgg/essential/elementa/UIComponent;
        //   601: astore_3        /* $this$constrain$iv */
        //   602: aload_3         /* $this$constrain$iv */
        //   603: astore          4
        //   605: aload           4
        //   607: astore          $this$constrain_u24lambda_u2d0$iv
        //   609: aload           $this$constrain_u24lambda_u2d0$iv
        //   611: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   614: astore          $this$_init__u24lambda_u2d3
        //   616: aload           $this$_init__u24lambda_u2d3
        //   618: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   621: dup            
        //   622: fconst_0       
        //   623: iconst_0       
        //   624: iconst_3       
        //   625: aconst_null    
        //   626: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   629: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   632: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   635: aload           $this$_init__u24lambda_u2d3
        //   637: bipush          100
        //   639: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   642: checkcast       Ljava/lang/Number;
        //   645: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   648: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   651: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   654: aload           $this$_init__u24lambda_u2d3
        //   656: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   659: dup            
        //   660: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   663: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   666: bipush          9
        //   668: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   671: checkcast       Ljava/lang/Number;
        //   674: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   677: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   680: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   683: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   686: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   689: aload_0         /* this */
        //   690: new             Lgg/essential/gui/studio/CategoryOption$3;
        //   693: dup            
        //   694: aload_0         /* this */
        //   695: invokespecial   gg/essential/gui/studio/CategoryOption$3.<init>:(Lgg/essential/gui/studio/CategoryOption;)V
        //   698: checkcast       Lkotlin/jvm/functions/Function2;
        //   701: invokevirtual   gg/essential/gui/studio/CategoryOption.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   704: pop            
        //   705: return         
        //    MethodParameters:
        //  Name            Flags  
        //  --------------  -----
        //  category        
        //  cosmeticStudio  
        //    StackMapTable: 00 07 FF 01 2F 00 09 07 00 02 07 00 F9 07 00 55 07 00 68 07 00 68 07 00 FB 07 00 FB 07 00 B5 07 00 02 00 00 40 01 FF 00 0D 00 0A 07 00 02 07 00 F9 07 00 55 07 00 68 07 00 68 07 00 FB 07 00 FB 07 00 B5 07 00 02 01 00 01 07 00 02 FF 00 00 00 0A 07 00 02 07 00 F9 07 00 55 07 00 68 07 00 68 07 00 FB 07 00 FB 07 00 B5 07 00 02 01 00 02 07 00 02 07 00 FB FF 00 03 00 09 07 00 02 07 00 F9 07 00 55 07 00 68 07 00 68 07 00 FD 00 07 00 B5 07 00 02 00 02 07 00 02 07 00 FB FF 00 24 00 09 07 00 02 07 00 F9 07 00 55 07 00 68 07 00 68 07 00 68 00 07 00 B5 07 00 02 00 01 07 00 02 FF 00 12 00 09 07 00 02 07 00 F9 07 00 55 07 00 68 07 00 68 07 00 FD 00 07 00 B5 07 00 02 00 02 07 00 02 07 00 FB
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final ShadowIcon getIcon() {
        return (ShadowIcon)this.icon$delegate.getValue((Object)this, (KProperty)CategoryOption.$$delegatedProperties[0]);
    }
    
    private final UIText getLabel() {
        return (UIText)this.label$delegate.getValue((Object)this, (KProperty)CategoryOption.$$delegatedProperties[1]);
    }
    
    private final State<Color> textIconColor() {
        return (State)StateExtensionsKt.or((State<Boolean>)this.selected, this.hovered).zip((State<Object>)this.equipped).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Object, Object>, ?>)CategoryOption$textIconColor.CategoryOption$textIconColor$1.INSTANCE);
    }
    
    public static final /* synthetic */ CosmeticStudio.Category access$getCategory$p(final CategoryOption $this) {
        return $this.category;
    }
    
    public static final /* synthetic */ CosmeticsManager access$getCosmeticsManager$p(final CategoryOption $this) {
        return $this.cosmeticsManager;
    }
    
    public static final /* synthetic */ CosmeticStudio access$getCosmeticStudio$p(final CategoryOption $this) {
        return $this.cosmeticStudio;
    }
    
    public static final /* synthetic */ MappedState access$getEquipped$p(final CategoryOption $this) {
        return $this.equipped;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CategoryOption.class, "icon", "getIcon()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CategoryOption.class, "label", "getLabel()Lgg/essential/elementa/components/UIText;", 0)) };
    }
}
