package gg.essential.vigilance.gui;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import gg.essential.vigilance.data.*;
import gg.essential.vigilance.gui.settings.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J\u0006\u0010 \u001a\u00020\u001eR\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001a\u0010\u001b¨\u0006\"" }, d2 = { "Lgg/essential/vigilance/gui/DataBackedSetting;", "Lgg/essential/vigilance/gui/Setting;", "data", "Lgg/essential/vigilance/data/PropertyData;", "component", "Lgg/essential/vigilance/gui/settings/SettingComponent;", "(Lgg/essential/vigilance/data/PropertyData;Lgg/essential/vigilance/gui/settings/SettingComponent;)V", "boundingBox", "Lgg/essential/elementa/components/UIBlock;", "getBoundingBox", "()Lgg/essential/elementa/components/UIBlock;", "boundingBox$delegate", "Lkotlin/properties/ReadWriteProperty;", "getComponent$Vigilance", "()Lgg/essential/vigilance/gui/settings/SettingComponent;", "getData$Vigilance", "()Lgg/essential/vigilance/data/PropertyData;", "hidden", "", "settingName", "Lgg/essential/elementa/components/UIWrappedText;", "getSettingName", "()Lgg/essential/elementa/components/UIWrappedText;", "settingName$delegate", "textBoundingBox", "Lgg/essential/elementa/components/UIContainer;", "getTextBoundingBox", "()Lgg/essential/elementa/components/UIContainer;", "textBoundingBox$delegate", "closePopups", "", "instantly", "hideMaybe", "Companion", "Vigilance" })
public final class DataBackedSetting extends Setting
{
    @NotNull
    public static final Companion Companion;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final PropertyData data;
    @NotNull
    private final SettingComponent component;
    @NotNull
    private final ReadWriteProperty boundingBox$delegate;
    @NotNull
    private final ReadWriteProperty textBoundingBox$delegate;
    @NotNull
    private final ReadWriteProperty settingName$delegate;
    private boolean hidden;
    public static final float INNER_PADDING = 13.0f;
    
    public DataBackedSetting(@NotNull final PropertyData data, @NotNull final SettingComponent component) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "data"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* component */
        //     7: ldc             "component"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/vigilance/gui/Setting.<init>:()V
        //    16: aload_0         /* this */
        //    17: aload_1         /* data */
        //    18: putfield        gg/essential/vigilance/gui/DataBackedSetting.data:Lgg/essential/vigilance/data/PropertyData;
        //    21: aload_0         /* this */
        //    22: aload_2         /* component */
        //    23: putfield        gg/essential/vigilance/gui/DataBackedSetting.component:Lgg/essential/vigilance/gui/settings/SettingComponent;
        //    26: aload_0         /* this */
        //    27: new             Lgg/essential/elementa/components/UIBlock;
        //    30: dup            
        //    31: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //    34: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getComponentBackground$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //    37: checkcast       Lgg/essential/elementa/state/State;
        //    40: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //    43: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //    46: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //    49: checkcast       Lgg/essential/elementa/UIComponent;
        //    52: astore_3        /* $this$constrain$iv */
        //    53: iconst_0       
        //    54: istore          $i$f$constrain
        //    56: aload_3         /* $this$constrain$iv */
        //    57: astore          5
        //    59: aload           5
        //    61: astore          $this$constrain_u24lambda_u2d0$iv
        //    63: iconst_0       
        //    64: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //    66: aload           $this$constrain_u24lambda_u2d0$iv
        //    68: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    71: astore          8
        //    73: astore          10
        //    75: iconst_0       
        //    76: istore          $i$a$-constrain-DataBackedSetting$boundingBox$2
        //    78: aload           $this$boundingBox_delegate_u24lambda_u2d0
        //    80: iconst_1       
        //    81: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    84: checkcast       Ljava/lang/Number;
        //    87: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    90: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //    93: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //    96: aload           $this$boundingBox_delegate_u24lambda_u2d0
        //    98: iconst_1       
        //    99: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   102: checkcast       Ljava/lang/Number;
        //   105: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   108: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   111: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   114: aload           $this$boundingBox_delegate_u24lambda_u2d0
        //   116: bipush          100
        //   118: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   121: checkcast       Ljava/lang/Number;
        //   124: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   127: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   130: iconst_2       
        //   131: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   134: checkcast       Ljava/lang/Number;
        //   137: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   140: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   143: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   146: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   149: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   152: aload           $this$boundingBox_delegate_u24lambda_u2d0
        //   154: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   157: dup            
        //   158: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   161: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   164: ldc             13.0
        //   166: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   169: checkcast       Ljava/lang/Number;
        //   172: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   175: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   178: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   181: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   184: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   187: nop            
        //   188: aload           10
        //   190: nop            
        //   191: aload           5
        //   193: nop            
        //   194: aload_0         /* this */
        //   195: checkcast       Lgg/essential/elementa/UIComponent;
        //   198: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   201: new             Lgg/essential/elementa/effects/OutlineEffect;
        //   204: dup            
        //   205: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   208: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getComponentBorder:()Ljava/awt/Color;
        //   211: fconst_1       
        //   212: iconst_0       
        //   213: iconst_0       
        //   214: aconst_null    
        //   215: bipush          28
        //   217: aconst_null    
        //   218: invokespecial   gg/essential/elementa/effects/OutlineEffect.<init>:(Ljava/awt/Color;FZZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   221: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   224: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getComponentBorder$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   227: checkcast       Lgg/essential/elementa/state/State;
        //   230: invokevirtual   gg/essential/elementa/effects/OutlineEffect.bindColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/effects/OutlineEffect;
        //   233: checkcast       Lgg/essential/elementa/effects/Effect;
        //   236: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   239: aload_0         /* this */
        //   240: getstatic       gg/essential/vigilance/gui/DataBackedSetting.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   243: iconst_0       
        //   244: aaload         
        //   245: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   248: putfield        gg/essential/vigilance/gui/DataBackedSetting.boundingBox$delegate:Lkotlin/properties/ReadWriteProperty;
        //   251: aload_0         /* this */
        //   252: new             Lgg/essential/elementa/components/UIContainer;
        //   255: dup            
        //   256: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   259: checkcast       Lgg/essential/elementa/UIComponent;
        //   262: astore_3        /* $this$constrain$iv */
        //   263: iconst_0       
        //   264: istore          $i$f$constrain
        //   266: aload_3         /* $this$constrain$iv */
        //   267: astore          5
        //   269: aload           5
        //   271: astore          $this$constrain_u24lambda_u2d0$iv
        //   273: iconst_0       
        //   274: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   276: aload           $this$constrain_u24lambda_u2d0$iv
        //   278: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   281: astore          8
        //   283: astore          10
        //   285: iconst_0       
        //   286: istore          $i$a$-constrain-DataBackedSetting$textBoundingBox$2
        //   288: aload           $this$textBoundingBox_delegate_u24lambda_u2d1
        //   290: ldc             13.0
        //   292: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   295: checkcast       Ljava/lang/Number;
        //   298: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   301: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   304: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   307: aload           $this$textBoundingBox_delegate_u24lambda_u2d1
        //   309: ldc             13.0
        //   311: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   314: checkcast       Ljava/lang/Number;
        //   317: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   320: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   323: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   326: aload           $this$textBoundingBox_delegate_u24lambda_u2d1
        //   328: new             Lgg/essential/vigilance/gui/DataBackedSetting$textBoundingBox$2$1;
        //   331: dup            
        //   332: aload_0         /* this */
        //   333: invokespecial   gg/essential/vigilance/gui/DataBackedSetting$textBoundingBox$2$1.<init>:(Lgg/essential/vigilance/gui/DataBackedSetting;)V
        //   336: checkcast       Lkotlin/jvm/functions/Function1;
        //   339: invokestatic    gg/essential/elementa/dsl/BasicConstraintsKt.basicWidthConstraint:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/constraints/WidthConstraint;
        //   342: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   345: aload           $this$textBoundingBox_delegate_u24lambda_u2d1
        //   347: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   350: dup            
        //   351: ldc             3.0
        //   353: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(F)V
        //   356: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   359: ldc             13.0
        //   361: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   364: checkcast       Ljava/lang/Number;
        //   367: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   370: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   373: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   376: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   379: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   382: nop            
        //   383: aload           10
        //   385: nop            
        //   386: aload           5
        //   388: nop            
        //   389: aload_0         /* this */
        //   390: invokespecial   gg/essential/vigilance/gui/DataBackedSetting.getBoundingBox:()Lgg/essential/elementa/components/UIBlock;
        //   393: checkcast       Lgg/essential/elementa/UIComponent;
        //   396: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   399: aload_0         /* this */
        //   400: getstatic       gg/essential/vigilance/gui/DataBackedSetting.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   403: iconst_1       
        //   404: aaload         
        //   405: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   408: putfield        gg/essential/vigilance/gui/DataBackedSetting.textBoundingBox$delegate:Lkotlin/properties/ReadWriteProperty;
        //   411: aload_0         /* this */
        //   412: new             Lgg/essential/elementa/components/UIWrappedText;
        //   415: dup            
        //   416: aload_0         /* this */
        //   417: getfield        gg/essential/vigilance/gui/DataBackedSetting.data:Lgg/essential/vigilance/data/PropertyData;
        //   420: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   423: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getLocalizedName$Vigilance:()Ljava/lang/String;
        //   426: iconst_0       
        //   427: aconst_null    
        //   428: iconst_0       
        //   429: iconst_0       
        //   430: fconst_0       
        //   431: aconst_null    
        //   432: bipush          126
        //   434: aconst_null    
        //   435: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   438: checkcast       Lgg/essential/elementa/UIComponent;
        //   441: astore_3        /* $this$constrain$iv */
        //   442: iconst_0       
        //   443: istore          $i$f$constrain
        //   445: aload_3         /* $this$constrain$iv */
        //   446: astore          5
        //   448: aload           5
        //   450: astore          $this$constrain_u24lambda_u2d0$iv
        //   452: iconst_0       
        //   453: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   455: aload           $this$constrain_u24lambda_u2d0$iv
        //   457: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   460: astore          8
        //   462: astore          10
        //   464: iconst_0       
        //   465: istore          $i$a$-constrain-DataBackedSetting$settingName$2
        //   467: aload           $this$settingName_delegate_u24lambda_u2d2
        //   469: bipush          100
        //   471: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   474: checkcast       Ljava/lang/Number;
        //   477: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   480: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   483: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   486: aload           $this$settingName_delegate_u24lambda_u2d2
        //   488: new             Lgg/essential/vigilance/gui/elementa/GuiScaleOffsetConstraint;
        //   491: dup            
        //   492: fconst_1       
        //   493: invokespecial   gg/essential/vigilance/gui/elementa/GuiScaleOffsetConstraint.<init>:(F)V
        //   496: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   499: invokevirtual   gg/essential/elementa/UIConstraints.setTextScale:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   502: aload           $this$settingName_delegate_u24lambda_u2d2
        //   504: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   507: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextHighlight$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   510: checkcast       Lgg/essential/elementa/state/State;
        //   513: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   516: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   519: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   522: nop            
        //   523: aload           10
        //   525: nop            
        //   526: aload           5
        //   528: nop            
        //   529: aload_0         /* this */
        //   530: invokespecial   gg/essential/vigilance/gui/DataBackedSetting.getTextBoundingBox:()Lgg/essential/elementa/components/UIContainer;
        //   533: checkcast       Lgg/essential/elementa/UIComponent;
        //   536: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   539: aload_0         /* this */
        //   540: getstatic       gg/essential/vigilance/gui/DataBackedSetting.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   543: iconst_2       
        //   544: aaload         
        //   545: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   548: putfield        gg/essential/vigilance/gui/DataBackedSetting.settingName$delegate:Lkotlin/properties/ReadWriteProperty;
        //   551: nop            
        //   552: new             Lgg/essential/elementa/components/UIWrappedText;
        //   555: dup            
        //   556: aload_0         /* this */
        //   557: getfield        gg/essential/vigilance/gui/DataBackedSetting.data:Lgg/essential/vigilance/data/PropertyData;
        //   560: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   563: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getLocalizedDescription$Vigilance:()Ljava/lang/String;
        //   566: iconst_0       
        //   567: aconst_null    
        //   568: iconst_0       
        //   569: iconst_0       
        //   570: ldc_w           10.0
        //   573: aconst_null    
        //   574: bipush          94
        //   576: aconst_null    
        //   577: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   580: checkcast       Lgg/essential/elementa/UIComponent;
        //   583: astore_3        /* $this$constrain$iv */
        //   584: iconst_0       
        //   585: istore          $i$f$constrain
        //   587: aload_3         /* $this$constrain$iv */
        //   588: astore          5
        //   590: aload           5
        //   592: astore          $this$constrain_u24lambda_u2d0$iv
        //   594: iconst_0       
        //   595: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   597: aload           $this$constrain_u24lambda_u2d0$iv
        //   599: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   602: astore          $this$_init__u24lambda_u2d3
        //   604: iconst_0       
        //   605: istore          $i$a$-constrain-DataBackedSetting$1
        //   607: aload           $this$_init__u24lambda_u2d3
        //   609: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   612: dup            
        //   613: fconst_0       
        //   614: iconst_0       
        //   615: iconst_3       
        //   616: aconst_null    
        //   617: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   620: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   623: iconst_3       
        //   624: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   627: checkcast       Ljava/lang/Number;
        //   630: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   633: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   636: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   639: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   642: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   645: aload           $this$_init__u24lambda_u2d3
        //   647: bipush          100
        //   649: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   652: checkcast       Ljava/lang/Number;
        //   655: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   658: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   661: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   664: aload           $this$_init__u24lambda_u2d3
        //   666: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   669: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getText$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   672: checkcast       Lgg/essential/elementa/state/State;
        //   675: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   678: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   681: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   684: nop            
        //   685: nop            
        //   686: aload           5
        //   688: nop            
        //   689: aload_0         /* this */
        //   690: invokespecial   gg/essential/vigilance/gui/DataBackedSetting.getTextBoundingBox:()Lgg/essential/elementa/components/UIContainer;
        //   693: checkcast       Lgg/essential/elementa/UIComponent;
        //   696: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   699: pop            
        //   700: nop            
        //   701: aload_0         /* this */
        //   702: aload_0         /* this */
        //   703: getfield        gg/essential/vigilance/gui/DataBackedSetting.data:Lgg/essential/vigilance/data/PropertyData;
        //   706: invokevirtual   gg/essential/vigilance/data/PropertyData.isHidden:()Z
        //   709: putfield        gg/essential/vigilance/gui/DataBackedSetting.hidden:Z
        //   712: nop            
        //   713: aload_0         /* this */
        //   714: checkcast       Lgg/essential/elementa/UIComponent;
        //   717: astore_3        /* $this$constrain$iv */
        //   718: iconst_0       
        //   719: istore          $i$f$constrain
        //   721: aload_3         /* $this$constrain$iv */
        //   722: astore          5
        //   724: aload           5
        //   726: astore          $this$constrain_u24lambda_u2d0$iv
        //   728: iconst_0       
        //   729: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   731: aload           $this$constrain_u24lambda_u2d0$iv
        //   733: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   736: astore          $this$_init__u24lambda_u2d4
        //   738: iconst_0       
        //   739: istore          $i$a$-constrain-DataBackedSetting$2
        //   741: aload           $this$_init__u24lambda_u2d4
        //   743: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   746: dup            
        //   747: ldc_w           8.0
        //   750: iconst_0       
        //   751: iconst_2       
        //   752: aconst_null    
        //   753: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   756: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   759: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   762: aload           $this$_init__u24lambda_u2d4
        //   764: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   767: dup            
        //   768: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   771: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   774: iconst_2       
        //   775: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   778: checkcast       Ljava/lang/Number;
        //   781: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   784: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   787: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   790: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   793: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   796: nop            
        //   797: nop            
        //   798: nop            
        //   799: nop            
        //   800: aload_0         /* this */
        //   801: getfield        gg/essential/vigilance/gui/DataBackedSetting.component:Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   804: new             Lgg/essential/vigilance/gui/DataBackedSetting$3;
        //   807: dup            
        //   808: aload_0         /* this */
        //   809: invokespecial   gg/essential/vigilance/gui/DataBackedSetting$3.<init>:(Lgg/essential/vigilance/gui/DataBackedSetting;)V
        //   812: checkcast       Lkotlin/jvm/functions/Function1;
        //   815: invokevirtual   gg/essential/vigilance/gui/settings/SettingComponent.onValueChange:(Lkotlin/jvm/functions/Function1;)V
        //   818: aload_0         /* this */
        //   819: getfield        gg/essential/vigilance/gui/DataBackedSetting.component:Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   822: checkcast       Lgg/essential/elementa/UIComponent;
        //   825: aload_0         /* this */
        //   826: invokespecial   gg/essential/vigilance/gui/DataBackedSetting.getBoundingBox:()Lgg/essential/elementa/components/UIBlock;
        //   829: checkcast       Lgg/essential/elementa/UIComponent;
        //   832: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   835: pop            
        //   836: aload_0         /* this */
        //   837: getfield        gg/essential/vigilance/gui/DataBackedSetting.component:Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   840: aload_0         /* this */
        //   841: checkcast       Lgg/essential/elementa/UIComponent;
        //   844: invokevirtual   gg/essential/vigilance/gui/settings/SettingComponent.setupParentListeners:(Lgg/essential/elementa/UIComponent;)V
        //   847: nop            
        //   848: return         
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  data       
        //  component  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final PropertyData getData$Vigilance() {
        return this.data;
    }
    
    @NotNull
    public final SettingComponent getComponent$Vigilance() {
        return this.component;
    }
    
    private final UIBlock getBoundingBox() {
        return (UIBlock)this.boundingBox$delegate.getValue((Object)this, (KProperty)DataBackedSetting.$$delegatedProperties[0]);
    }
    
    private final UIContainer getTextBoundingBox() {
        return (UIContainer)this.textBoundingBox$delegate.getValue((Object)this, (KProperty)DataBackedSetting.$$delegatedProperties[1]);
    }
    
    private final UIWrappedText getSettingName() {
        return (UIWrappedText)this.settingName$delegate.getValue((Object)this, (KProperty)DataBackedSetting.$$delegatedProperties[2]);
    }
    
    public final void hideMaybe() {
        if (this.hidden) {
            if (!this.data.isHidden()) {
                this.hidden = false;
                UIComponent.unhide$default(this, false, 1, null);
            }
        }
        else if (this.data.isHidden()) {
            this.hide(this.hidden = true);
        }
    }
    
    @Override
    public void closePopups(final boolean instantly) {
        this.component.closePopups(instantly);
    }
    
    public static final /* synthetic */ UIBlock access$getBoundingBox(final DataBackedSetting $this) {
        return $this.getBoundingBox();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DataBackedSetting.class, "boundingBox", "getBoundingBox()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DataBackedSetting.class, "textBoundingBox", "getTextBoundingBox()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)DataBackedSetting.class, "settingName", "getSettingName()Lgg/essential/elementa/components/UIWrappedText;", 0)) };
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lgg/essential/vigilance/gui/DataBackedSetting$Companion;", "", "()V", "INNER_PADDING", "", "Vigilance" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
