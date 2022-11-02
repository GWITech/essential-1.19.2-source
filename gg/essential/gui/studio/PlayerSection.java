package gg.essential.gui.studio;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.common.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0013\u0010\b\u001a\u00070	¢\u0006\u0002\b
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b!\u0010\u0010\u001a\u0004\b \u0010\u001dR\u000e\u0010"\u001a\u00020#X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010$\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b&\u0010\u0010\u001a\u0004\b%\u0010\u0018R\u001b\u0010'\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b)\u0010\u0010\u001a\u0004\b(\u0010\u001d¨\u0006/²\u0006
                                                   \u00100\u001a\u000201X\u008a\u0084\u0002²\u0006
                                                   \u00102\u001a\u000201X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/studio/PlayerSection;", "Lgg/essential/elementa/components/UIContainer;", "equippedOutfit", "Lgg/essential/elementa/state/BasicState;", "", "cosmeticStudio", "Lgg/essential/gui/studio/CosmeticStudio;", "(Lgg/essential/elementa/state/BasicState;Lgg/essential/gui/studio/CosmeticStudio;)V", "cosmeticsManager", "Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;", "Lorg/jetbrains/annotations/NotNull;", "outfitText", "Lgg/essential/elementa/components/UIText;", "getOutfitText", "()Lgg/essential/elementa/components/UIText;", "outfitText$delegate", "Lkotlin/properties/ReadWriteProperty;", "playerDisplay", "Lgg/essential/gui/common/EmulatedUI3DPlayer;", "getPlayerDisplay", "()Lgg/essential/gui/common/EmulatedUI3DPlayer;", "playerDisplay$delegate", "playerOptions", "getPlayerOptions", "()Lgg/essential/elementa/components/UIContainer;", "playerOptions$delegate", "playerRotateCCW", "Lgg/essential/elementa/UIComponent;", "getPlayerRotateCCW", "()Lgg/essential/elementa/UIComponent;", "playerRotateCCW$delegate", "playerRotateCW", "getPlayerRotateCW", "playerRotateCW$delegate", "skinUpload", "Lgg/essential/gui/studio/SkinUpload;", "titleContainer", "getTitleContainer", "titleContainer$delegate", "uploadSkinContainer", "getUploadSkinContainer", "uploadSkinContainer$delegate", "onScreenClose", "", "rotate", "angle", "", "essential", "previousOutfitButton", "Lgg/essential/gui/common/IconButton;", "nextOutfitButton" })
public final class PlayerSection extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final CosmeticStudio cosmeticStudio;
    @NotNull
    private final SkinUpload skinUpload;
    @NotNull
    private final CosmeticsManager cosmeticsManager;
    @NotNull
    private final ReadWriteProperty titleContainer$delegate;
    @NotNull
    private final ReadWriteProperty outfitText$delegate;
    @NotNull
    private final ReadWriteProperty playerDisplay$delegate;
    @NotNull
    private final ReadWriteProperty playerOptions$delegate;
    
    public PlayerSection(@NotNull final BasicState<Integer> equippedOutfit, @NotNull final CosmeticStudio cosmeticStudio) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "equippedOutfit"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* cosmeticStudio */
        //     7: ldc             "cosmeticStudio"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    16: aload_0         /* this */
        //    17: aload_2         /* cosmeticStudio */
        //    18: putfield        gg/essential/gui/studio/PlayerSection.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //    21: aload_0         /* this */
        //    22: new             Lgg/essential/gui/studio/SkinUpload;
        //    25: dup            
        //    26: invokespecial   gg/essential/gui/studio/SkinUpload.<init>:()V
        //    29: putfield        gg/essential/gui/studio/PlayerSection.skinUpload:Lgg/essential/gui/studio/SkinUpload;
        //    32: aload_0         /* this */
        //    33: aload_0         /* this */
        //    34: getfield        gg/essential/gui/studio/PlayerSection.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //    37: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getCosmeticsManager:()Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //    40: putfield        gg/essential/gui/studio/PlayerSection.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //    43: aload_0         /* this */
        //    44: new             Lgg/essential/elementa/components/UIContainer;
        //    47: dup            
        //    48: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    51: checkcast       Lgg/essential/elementa/UIComponent;
        //    54: astore_3        /* $this$constrain$iv */
        //    55: aload_3         /* $this$constrain$iv */
        //    56: astore          5
        //    58: aload           5
        //    60: astore          $this$constrain_u24lambda_u2d0$iv
        //    62: aload           $this$constrain_u24lambda_u2d0$iv
        //    64: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    67: astore          8
        //    69: astore          11
        //    71: aload           $this$titleContainer_delegate_u24lambda_u2d0
        //    73: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //    76: dup            
        //    77: iconst_0       
        //    78: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //    81: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    84: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    87: aload           $this$titleContainer_delegate_u24lambda_u2d0
        //    89: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //    92: dup            
        //    93: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //    96: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    99: aload_0         /* this */
        //   100: checkcast       Lgg/essential/elementa/UIComponent;
        //   103: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   106: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   109: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   112: aload           $this$titleContainer_delegate_u24lambda_u2d0
        //   114: bipush          100
        //   116: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   119: checkcast       Ljava/lang/Number;
        //   122: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   125: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   128: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   131: aload           $this$titleContainer_delegate_u24lambda_u2d0
        //   133: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   136: dup            
        //   137: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   140: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   143: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   146: aload           11
        //   148: aload           5
        //   150: aload_0         /* this */
        //   151: getfield        gg/essential/gui/studio/PlayerSection.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //   154: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   157: checkcast       Lgg/essential/elementa/UIComponent;
        //   160: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   163: aload_0         /* this */
        //   164: getstatic       gg/essential/gui/studio/PlayerSection.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   167: iconst_0       
        //   168: aaload         
        //   169: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   172: putfield        gg/essential/gui/studio/PlayerSection.titleContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   175: aload_0         /* this */
        //   176: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   179: dup            
        //   180: aconst_null    
        //   181: iconst_0       
        //   182: aconst_null    
        //   183: iconst_0       
        //   184: iconst_0       
        //   185: iconst_0       
        //   186: bipush          63
        //   188: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   191: aload_1         /* equippedOutfit */
        //   192: getstatic       gg/essential/gui/studio/PlayerSection$outfitText$2.INSTANCE:Lgg/essential/gui/studio/PlayerSection$outfitText$2;
        //   195: checkcast       Lkotlin/jvm/functions/Function1;
        //   198: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   201: checkcast       Lgg/essential/elementa/state/State;
        //   204: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //   207: checkcast       Lgg/essential/elementa/UIComponent;
        //   210: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   213: aload_0         /* this */
        //   214: invokespecial   gg/essential/gui/studio/PlayerSection.getTitleContainer:()Lgg/essential/elementa/components/UIContainer;
        //   217: checkcast       Lgg/essential/elementa/UIComponent;
        //   220: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   223: aload_0         /* this */
        //   224: getstatic       gg/essential/gui/studio/PlayerSection.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   227: iconst_1       
        //   228: aaload         
        //   229: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   232: putfield        gg/essential/gui/studio/PlayerSection.outfitText$delegate:Lkotlin/properties/ReadWriteProperty;
        //   235: aload_0         /* this */
        //   236: new             Lgg/essential/gui/common/EmulatedUI3DPlayer;
        //   239: dup            
        //   240: aconst_null    
        //   241: aconst_null    
        //   242: aconst_null    
        //   243: aconst_null    
        //   244: bipush          15
        //   246: invokespecial   gg/essential/gui/common/EmulatedUI3DPlayer.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;I)V
        //   249: checkcast       Lgg/essential/elementa/UIComponent;
        //   252: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   255: astore_3        /* $this$constrain$iv */
        //   256: aload_3         /* $this$constrain$iv */
        //   257: astore          5
        //   259: aload           5
        //   261: astore          $this$constrain_u24lambda_u2d0$iv
        //   263: aload           $this$constrain_u24lambda_u2d0$iv
        //   265: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   268: astore          8
        //   270: astore          11
        //   272: aload           $this$playerDisplay_delegate_u24lambda_u2d1
        //   274: bipush          100
        //   276: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   279: checkcast       Ljava/lang/Number;
        //   282: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   285: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   288: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   291: aload           $this$playerDisplay_delegate_u24lambda_u2d1
        //   293: bipush          50
        //   295: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   298: checkcast       Ljava/lang/Number;
        //   301: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   304: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   307: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   310: aload           11
        //   312: aload           5
        //   314: astore_3        /* $this$constrain$iv */
        //   315: aload_3        
        //   316: checkcast       Lgg/essential/gui/common/EmulatedUI3DPlayer;
        //   319: astore          4
        //   321: astore          11
        //   323: aload           $this$playerDisplay_delegate_u24lambda_u2d2
        //   325: aload_0         /* this */
        //   326: getfield        gg/essential/gui/studio/PlayerSection.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   329: astore          6
        //   331: invokestatic    gg/essential/util/UUIDUtil.getClientUUID:()Ljava/util/UUID;
        //   334: astore          7
        //   336: new             Lgg/essential/gui/studio/PlayerSection$playerDisplay$3$1;
        //   339: dup            
        //   340: aload_0         /* this */
        //   341: aload           6
        //   343: aload           7
        //   345: invokespecial   gg/essential/gui/studio/PlayerSection$playerDisplay$3$1.<init>:(Lgg/essential/gui/studio/PlayerSection;Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;Ljava/util/UUID;)V
        //   348: checkcast       Lgg/essential/cosmetics/source/CosmeticsSource;
        //   351: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer.setCosmeticsSource:(Lgg/essential/cosmetics/source/CosmeticsSource;)V
        //   354: aload           11
        //   356: aload_3        
        //   357: aload_0         /* this */
        //   358: checkcast       Lgg/essential/elementa/UIComponent;
        //   361: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   364: aload_0         /* this */
        //   365: getstatic       gg/essential/gui/studio/PlayerSection.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   368: iconst_2       
        //   369: aaload         
        //   370: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   373: putfield        gg/essential/gui/studio/PlayerSection.playerDisplay$delegate:Lkotlin/properties/ReadWriteProperty;
        //   376: new             Lgg/essential/gui/common/IconButton;
        //   379: dup            
        //   380: getstatic       gg/essential/gui/EssentialPalette.ARROW_LEFT_4X7:Lgg/essential/gui/image/ImageFactory;
        //   383: ldc_w           ""
        //   386: aconst_null    
        //   387: iconst_0       
        //   388: iconst_0       
        //   389: iconst_0       
        //   390: bipush          60
        //   392: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   395: checkcast       Lgg/essential/elementa/UIComponent;
        //   398: astore          $this$constrain$iv
        //   400: aload           $this$constrain$iv
        //   402: astore          6
        //   404: aload           6
        //   406: astore          $this$constrain_u24lambda_u2d0$iv
        //   408: aload           $this$constrain_u24lambda_u2d0$iv
        //   410: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   413: astore          $this$_init__u24lambda_u2d3
        //   415: aload           $this$_init__u24lambda_u2d3
        //   417: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   420: dup            
        //   421: ldc_w           15.0
        //   424: iconst_1       
        //   425: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   428: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   431: aload_0         /* this */
        //   432: invokespecial   gg/essential/gui/studio/PlayerSection.getOutfitText:()Lgg/essential/elementa/components/UIText;
        //   435: checkcast       Lgg/essential/elementa/UIComponent;
        //   438: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   441: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   444: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   447: aload           $this$_init__u24lambda_u2d3
        //   449: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   452: dup            
        //   453: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   456: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   459: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   462: aload           $this$_init__u24lambda_u2d3
        //   464: bipush          17
        //   466: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   469: checkcast       Ljava/lang/Number;
        //   472: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   475: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   478: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   481: aload           $this$_init__u24lambda_u2d3
        //   483: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   486: dup            
        //   487: fconst_1       
        //   488: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //   491: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   494: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   497: aload           6
        //   499: checkcast       Lgg/essential/gui/common/IconButton;
        //   502: new             Lgg/essential/gui/studio/PlayerSection$previousOutfitButton$3;
        //   505: dup            
        //   506: aload_0         /* this */
        //   507: invokespecial   gg/essential/gui/studio/PlayerSection$previousOutfitButton$3.<init>:(Lgg/essential/gui/studio/PlayerSection;)V
        //   510: checkcast       Lkotlin/jvm/functions/Function0;
        //   513: invokevirtual   gg/essential/gui/common/IconButton.onActiveClick:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/IconButton;
        //   516: checkcast       Lgg/essential/elementa/UIComponent;
        //   519: aload_0         /* this */
        //   520: invokespecial   gg/essential/gui/studio/PlayerSection.getTitleContainer:()Lgg/essential/elementa/components/UIContainer;
        //   523: checkcast       Lgg/essential/elementa/UIComponent;
        //   526: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   529: aconst_null    
        //   530: getstatic       gg/essential/gui/studio/PlayerSection.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   533: iconst_3       
        //   534: aaload         
        //   535: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   538: pop            
        //   539: new             Lgg/essential/gui/common/IconButton;
        //   542: dup            
        //   543: getstatic       gg/essential/gui/EssentialPalette.ARROW_RIGHT_4X7:Lgg/essential/gui/image/ImageFactory;
        //   546: ldc_w           ""
        //   549: aconst_null    
        //   550: iconst_0       
        //   551: iconst_0       
        //   552: iconst_0       
        //   553: bipush          60
        //   555: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   558: checkcast       Lgg/essential/elementa/UIComponent;
        //   561: astore          $this$constrain$iv
        //   563: aload           $this$constrain$iv
        //   565: astore          7
        //   567: aload           7
        //   569: astore          $this$constrain_u24lambda_u2d0$iv
        //   571: aload           $this$constrain_u24lambda_u2d0$iv
        //   573: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   576: astore          $this$_init__u24lambda_u2d5
        //   578: aload           $this$_init__u24lambda_u2d5
        //   580: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   583: dup            
        //   584: ldc_w           15.0
        //   587: iconst_0       
        //   588: iconst_2       
        //   589: aconst_null    
        //   590: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   593: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   596: aload_0         /* this */
        //   597: invokespecial   gg/essential/gui/studio/PlayerSection.getOutfitText:()Lgg/essential/elementa/components/UIText;
        //   600: checkcast       Lgg/essential/elementa/UIComponent;
        //   603: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   606: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   609: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   612: aload           $this$_init__u24lambda_u2d5
        //   614: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   617: dup            
        //   618: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   621: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   624: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   627: aload           $this$_init__u24lambda_u2d5
        //   629: bipush          17
        //   631: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   634: checkcast       Ljava/lang/Number;
        //   637: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   640: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   643: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   646: aload           $this$_init__u24lambda_u2d5
        //   648: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   651: dup            
        //   652: fconst_1       
        //   653: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //   656: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   659: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   662: aload           7
        //   664: checkcast       Lgg/essential/gui/common/IconButton;
        //   667: new             Lgg/essential/gui/studio/PlayerSection$nextOutfitButton$3;
        //   670: dup            
        //   671: aload_0         /* this */
        //   672: invokespecial   gg/essential/gui/studio/PlayerSection$nextOutfitButton$3.<init>:(Lgg/essential/gui/studio/PlayerSection;)V
        //   675: checkcast       Lkotlin/jvm/functions/Function0;
        //   678: invokevirtual   gg/essential/gui/common/IconButton.onActiveClick:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/IconButton;
        //   681: checkcast       Lgg/essential/elementa/UIComponent;
        //   684: aload_0         /* this */
        //   685: invokespecial   gg/essential/gui/studio/PlayerSection.getTitleContainer:()Lgg/essential/elementa/components/UIContainer;
        //   688: checkcast       Lgg/essential/elementa/UIComponent;
        //   691: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   694: aconst_null    
        //   695: getstatic       gg/essential/gui/studio/PlayerSection.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   698: iconst_4       
        //   699: aaload         
        //   700: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   703: pop            
        //   704: aload_0         /* this */
        //   705: new             Lgg/essential/elementa/components/UIContainer;
        //   708: dup            
        //   709: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   712: checkcast       Lgg/essential/elementa/UIComponent;
        //   715: astore_3        /* $this$constrain$iv */
        //   716: aload_3         /* $this$constrain$iv */
        //   717: astore          5
        //   719: aload           5
        //   721: astore          $this$constrain_u24lambda_u2d0$iv
        //   723: aload           $this$constrain_u24lambda_u2d0$iv
        //   725: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   728: astore          8
        //   730: astore          11
        //   732: aload           $this$playerOptions_delegate_u24lambda_u2d7
        //   734: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   737: dup            
        //   738: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   741: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   744: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   747: aload           $this$playerOptions_delegate_u24lambda_u2d7
        //   749: iconst_5       
        //   750: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   753: checkcast       Ljava/lang/Number;
        //   756: iconst_1       
        //   757: iconst_0       
        //   758: iconst_2       
        //   759: aconst_null    
        //   760: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   763: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   766: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   769: aload           $this$playerOptions_delegate_u24lambda_u2d7
        //   771: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   774: dup            
        //   775: fconst_0       
        //   776: iconst_1       
        //   777: aconst_null    
        //   778: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   781: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   784: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   787: aload           $this$playerOptions_delegate_u24lambda_u2d7
        //   789: bipush          25
        //   791: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   794: checkcast       Ljava/lang/Number;
        //   797: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   800: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   803: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   806: aload           11
        //   808: aload           5
        //   810: aload_0         /* this */
        //   811: checkcast       Lgg/essential/elementa/UIComponent;
        //   814: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   817: aload_0         /* this */
        //   818: getstatic       gg/essential/gui/studio/PlayerSection.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   821: iconst_5       
        //   822: aaload         
        //   823: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   826: putfield        gg/essential/gui/studio/PlayerSection.playerOptions$delegate:Lkotlin/properties/ReadWriteProperty;
        //   829: new             Lgg/essential/gui/common/IconButton;
        //   832: dup            
        //   833: getstatic       gg/essential/gui/EssentialPalette.ROTATE_LEFT_7X9:Lgg/essential/gui/image/ImageFactory;
        //   836: aconst_null    
        //   837: aconst_null    
        //   838: iconst_0       
        //   839: iconst_0       
        //   840: iconst_0       
        //   841: bipush          62
        //   843: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   846: checkcast       Lgg/essential/elementa/UIComponent;
        //   849: astore_3        /* $this$constrain$iv */
        //   850: aload_3         /* $this$constrain$iv */
        //   851: astore          5
        //   853: aload           5
        //   855: astore          $this$constrain_u24lambda_u2d0$iv
        //   857: aload           $this$constrain_u24lambda_u2d0$iv
        //   859: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   862: astore          $this$playerRotateCCW_delegate_u24lambda_u2d8
        //   864: aload           $this$playerRotateCCW_delegate_u24lambda_u2d8
        //   866: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   869: dup            
        //   870: fconst_1       
        //   871: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //   874: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   877: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   880: aload           $this$playerRotateCCW_delegate_u24lambda_u2d8
        //   882: bipush          100
        //   884: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   887: checkcast       Ljava/lang/Number;
        //   890: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   893: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   896: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   899: aload           5
        //   901: astore_3        /* $this$constrain$iv */
        //   902: aload_3         /* $this$onLeftClick$iv */
        //   903: new             Lgg/essential/gui/studio/PlayerSection$special$$inlined$onLeftClick$1;
        //   906: dup            
        //   907: aload_0         /* this */
        //   908: invokespecial   gg/essential/gui/studio/PlayerSection$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/studio/PlayerSection;)V
        //   911: checkcast       Lkotlin/jvm/functions/Function2;
        //   914: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   917: new             Lgg/essential/gui/studio/PlayerSection$playerRotateCCW$4;
        //   920: dup            
        //   921: aload_0         /* this */
        //   922: invokespecial   gg/essential/gui/studio/PlayerSection$playerRotateCCW$4.<init>:(Lgg/essential/gui/studio/PlayerSection;)V
        //   925: checkcast       Lkotlin/jvm/functions/Function1;
        //   928: invokevirtual   gg/essential/elementa/UIComponent.onMouseRelease:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   931: new             Lgg/essential/gui/studio/PlayerSection$playerRotateCCW$5;
        //   934: dup            
        //   935: aload_0         /* this */
        //   936: invokespecial   gg/essential/gui/studio/PlayerSection$playerRotateCCW$5.<init>:(Lgg/essential/gui/studio/PlayerSection;)V
        //   939: checkcast       Lkotlin/jvm/functions/Function1;
        //   942: invokevirtual   gg/essential/elementa/UIComponent.onMouseLeave:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   945: aload_0         /* this */
        //   946: invokespecial   gg/essential/gui/studio/PlayerSection.getPlayerOptions:()Lgg/essential/elementa/components/UIContainer;
        //   949: checkcast       Lgg/essential/elementa/UIComponent;
        //   952: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   955: aload_0         /* this */
        //   956: getstatic       gg/essential/gui/studio/PlayerSection.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   959: bipush          6
        //   961: aaload         
        //   962: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   965: pop            
        //   966: new             Lgg/essential/gui/common/IconButton;
        //   969: dup            
        //   970: getstatic       gg/essential/gui/EssentialPalette.UPLOAD_SKIN_9X13:Lgg/essential/gui/image/ImageFactory;
        //   973: aconst_null    
        //   974: aconst_null    
        //   975: iconst_0       
        //   976: iconst_0       
        //   977: iconst_0       
        //   978: bipush          62
        //   980: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //   983: checkcast       Lgg/essential/elementa/UIComponent;
        //   986: astore_3        /* $this$constrain$iv */
        //   987: aload_3         /* $this$constrain$iv */
        //   988: astore          5
        //   990: aload           5
        //   992: astore          $this$constrain_u24lambda_u2d0$iv
        //   994: aload           $this$constrain_u24lambda_u2d0$iv
        //   996: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   999: astore          $this$uploadSkinContainer_delegate_u24lambda_u2d10
        //  1001: aload           $this$uploadSkinContainer_delegate_u24lambda_u2d10
        //  1003: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1006: dup            
        //  1007: ldc_w           5.0
        //  1010: iconst_0       
        //  1011: iconst_2       
        //  1012: aconst_null    
        //  1013: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1016: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1019: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1022: aload           $this$uploadSkinContainer_delegate_u24lambda_u2d10
        //  1024: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //  1027: dup            
        //  1028: fconst_1       
        //  1029: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //  1032: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1035: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1038: aload           $this$uploadSkinContainer_delegate_u24lambda_u2d10
        //  1040: bipush          100
        //  1042: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1045: checkcast       Ljava/lang/Number;
        //  1048: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1051: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1054: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1057: aload           5
        //  1059: astore_3        /* $this$constrain$iv */
        //  1060: aload_3         /* $this$onLeftClick$iv */
        //  1061: new             Lgg/essential/gui/studio/PlayerSection$special$$inlined$onLeftClick$2;
        //  1064: dup            
        //  1065: aload_0         /* this */
        //  1066: invokespecial   gg/essential/gui/studio/PlayerSection$special$$inlined$onLeftClick$2.<init>:(Lgg/essential/gui/studio/PlayerSection;)V
        //  1069: checkcast       Lkotlin/jvm/functions/Function2;
        //  1072: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1075: ldc_w           "Edit Skin"
        //  1078: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //  1081: checkcast       Lgg/essential/elementa/state/State;
        //  1084: aconst_null    
        //  1085: fconst_0       
        //  1086: aconst_null    
        //  1087: aconst_null    
        //  1088: bipush          30
        //  1090: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //  1093: aload_0         /* this */
        //  1094: invokespecial   gg/essential/gui/studio/PlayerSection.getPlayerOptions:()Lgg/essential/elementa/components/UIContainer;
        //  1097: checkcast       Lgg/essential/elementa/UIComponent;
        //  1100: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1103: aload_0         /* this */
        //  1104: getstatic       gg/essential/gui/studio/PlayerSection.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1107: bipush          7
        //  1109: aaload         
        //  1110: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1113: pop            
        //  1114: new             Lgg/essential/gui/common/IconButton;
        //  1117: dup            
        //  1118: getstatic       gg/essential/gui/EssentialPalette.ROTATE_RIGHT_7X9:Lgg/essential/gui/image/ImageFactory;
        //  1121: aconst_null    
        //  1122: aconst_null    
        //  1123: iconst_0       
        //  1124: iconst_0       
        //  1125: iconst_0       
        //  1126: bipush          62
        //  1128: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //  1131: checkcast       Lgg/essential/elementa/UIComponent;
        //  1134: astore_3        /* $this$constrain$iv */
        //  1135: aload_3         /* $this$constrain$iv */
        //  1136: astore          5
        //  1138: aload           5
        //  1140: astore          $this$constrain_u24lambda_u2d0$iv
        //  1142: aload           $this$constrain_u24lambda_u2d0$iv
        //  1144: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1147: astore          $this$playerRotateCW_delegate_u24lambda_u2d12
        //  1149: aload           $this$playerRotateCW_delegate_u24lambda_u2d12
        //  1151: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1154: dup            
        //  1155: ldc_w           5.0
        //  1158: iconst_0       
        //  1159: iconst_2       
        //  1160: aconst_null    
        //  1161: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1164: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1167: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1170: aload           $this$playerRotateCW_delegate_u24lambda_u2d12
        //  1172: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //  1175: dup            
        //  1176: fconst_1       
        //  1177: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //  1180: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1183: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1186: aload           $this$playerRotateCW_delegate_u24lambda_u2d12
        //  1188: bipush          100
        //  1190: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1193: checkcast       Ljava/lang/Number;
        //  1196: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1199: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1202: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1205: aload           5
        //  1207: astore_3        /* $this$constrain$iv */
        //  1208: aload_3         /* $this$onLeftClick$iv */
        //  1209: new             Lgg/essential/gui/studio/PlayerSection$special$$inlined$onLeftClick$3;
        //  1212: dup            
        //  1213: aload_0         /* this */
        //  1214: invokespecial   gg/essential/gui/studio/PlayerSection$special$$inlined$onLeftClick$3.<init>:(Lgg/essential/gui/studio/PlayerSection;)V
        //  1217: checkcast       Lkotlin/jvm/functions/Function2;
        //  1220: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1223: new             Lgg/essential/gui/studio/PlayerSection$playerRotateCW$4;
        //  1226: dup            
        //  1227: aload_0         /* this */
        //  1228: invokespecial   gg/essential/gui/studio/PlayerSection$playerRotateCW$4.<init>:(Lgg/essential/gui/studio/PlayerSection;)V
        //  1231: checkcast       Lkotlin/jvm/functions/Function1;
        //  1234: invokevirtual   gg/essential/elementa/UIComponent.onMouseRelease:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //  1237: new             Lgg/essential/gui/studio/PlayerSection$playerRotateCW$5;
        //  1240: dup            
        //  1241: aload_0         /* this */
        //  1242: invokespecial   gg/essential/gui/studio/PlayerSection$playerRotateCW$5.<init>:(Lgg/essential/gui/studio/PlayerSection;)V
        //  1245: checkcast       Lkotlin/jvm/functions/Function1;
        //  1248: invokevirtual   gg/essential/elementa/UIComponent.onMouseLeave:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //  1251: aload_0         /* this */
        //  1252: invokespecial   gg/essential/gui/studio/PlayerSection.getPlayerOptions:()Lgg/essential/elementa/components/UIContainer;
        //  1255: checkcast       Lgg/essential/elementa/UIComponent;
        //  1258: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1261: aload_0         /* this */
        //  1262: getstatic       gg/essential/gui/studio/PlayerSection.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1265: bipush          8
        //  1267: aaload         
        //  1268: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1271: pop            
        //  1272: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/BasicState<Ljava/lang/Integer;>;Lgg/essential/gui/studio/CosmeticStudio;)V
        //    MethodParameters:
        //  Name            Flags  
        //  --------------  -----
        //  equippedOutfit  
        //  cosmeticStudio  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIContainer getTitleContainer() {
        return (UIContainer)this.titleContainer$delegate.getValue((Object)this, (KProperty)PlayerSection.$$delegatedProperties[0]);
    }
    
    private final UIText getOutfitText() {
        return (UIText)this.outfitText$delegate.getValue((Object)this, (KProperty)PlayerSection.$$delegatedProperties[1]);
    }
    
    @NotNull
    public final EmulatedUI3DPlayer getPlayerDisplay() {
        return (EmulatedUI3DPlayer)this.playerDisplay$delegate.getValue((Object)this, (KProperty)PlayerSection.$$delegatedProperties[2]);
    }
    
    private final UIContainer getPlayerOptions() {
        return (UIContainer)this.playerOptions$delegate.getValue((Object)this, (KProperty)PlayerSection.$$delegatedProperties[5]);
    }
    
    public final void rotate(final float angle) {
        this.getPlayerDisplay().rotateClockwise(angle);
    }
    
    public final void onScreenClose() {
        this.skinUpload.cleanup();
    }
    
    public static final /* synthetic */ CosmeticStudio access$getCosmeticStudio$p(final PlayerSection $this) {
        return $this.cosmeticStudio;
    }
    
    public static final /* synthetic */ SkinUpload access$getSkinUpload$p(final PlayerSection $this) {
        return $this.skinUpload;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlayerSection.class, "titleContainer", "getTitleContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlayerSection.class, "outfitText", "getOutfitText()Lgg/essential/elementa/components/UIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlayerSection.class, "playerDisplay", "getPlayerDisplay()Lgg/essential/gui/common/EmulatedUI3DPlayer;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlayerSection.class, "previousOutfitButton", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlayerSection.class, "nextOutfitButton", "<v#1>", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlayerSection.class, "playerOptions", "getPlayerOptions()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlayerSection.class, "playerRotateCCW", "getPlayerRotateCCW()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlayerSection.class, "uploadSkinContainer", "getUploadSkinContainer()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlayerSection.class, "playerRotateCW", "getPlayerRotateCW()Lgg/essential/elementa/UIComponent;", 0)) };
    }
}
