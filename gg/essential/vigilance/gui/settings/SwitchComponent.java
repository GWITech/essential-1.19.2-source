package gg.essential.vigilance.gui.settings;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.components.*;
import java.awt.*;
import gg.essential.vigilance.gui.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\fH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e" }, d2 = { "Lgg/essential/vigilance/gui/settings/SwitchComponent;", "Lgg/essential/vigilance/gui/settings/SettingComponent;", "initialState", "", "(Z)V", "background", "Lgg/essential/elementa/components/UIBlock;", "getBackground", "()Lgg/essential/elementa/components/UIBlock;", "background$delegate", "Lkotlin/properties/ReadWriteProperty;", "enabled", "Lgg/essential/elementa/state/BasicState;", "getEnabled$Vigilance", "()Lgg/essential/elementa/state/BasicState;", "offIndicator", "Lgg/essential/elementa/components/UIContainer;", "getOffIndicator", "()Lgg/essential/elementa/components/UIContainer;", "offIndicator$delegate", "onIndicator", "getOnIndicator", "onIndicator$delegate", "showToggleIndicators", "Lgg/essential/elementa/state/State;", "switchBox", "getSwitchColor", "Ljava/awt/Color;", "getSwitchPosition", "Lgg/essential/elementa/constraints/PixelConstraint;", "Vigilance" })
public final class SwitchComponent extends SettingComponent
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final BasicState<Boolean> enabled;
    @NotNull
    private final ReadWriteProperty background$delegate;
    @NotNull
    private final UIBlock switchBox;
    @NotNull
    private final State<Boolean> showToggleIndicators;
    @NotNull
    private final ReadWriteProperty onIndicator$delegate;
    @NotNull
    private final ReadWriteProperty offIndicator$delegate;
    
    public SwitchComponent(final boolean initialState) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   gg/essential/vigilance/gui/settings/SettingComponent.<init>:()V
        //     4: aload_0         /* this */
        //     5: new             Lgg/essential/elementa/state/BasicState;
        //     8: dup            
        //     9: iload_1         /* initialState */
        //    10: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    13: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    16: putfield        gg/essential/vigilance/gui/settings/SwitchComponent.enabled:Lgg/essential/elementa/state/BasicState;
        //    19: aload_0         /* this */
        //    20: new             Lgg/essential/elementa/components/UIBlock;
        //    23: dup            
        //    24: aload_0         /* this */
        //    25: invokespecial   gg/essential/vigilance/gui/settings/SwitchComponent.getSwitchColor:()Lgg/essential/elementa/state/BasicState;
        //    28: checkcast       Lgg/essential/elementa/state/State;
        //    31: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //    34: checkcast       Lgg/essential/elementa/UIComponent;
        //    37: astore_2        /* $this$constrain$iv */
        //    38: iconst_0       
        //    39: istore_3        /* $i$f$constrain */
        //    40: aload_2         /* $this$constrain$iv */
        //    41: astore          4
        //    43: aload           4
        //    45: astore          $this$constrain_u24lambda_u2d0$iv
        //    47: iconst_0       
        //    48: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //    50: aload           $this$constrain_u24lambda_u2d0$iv
        //    52: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    55: astore          7
        //    57: astore          16
        //    59: iconst_0       
        //    60: istore          $i$a$-constrain-SwitchComponent$background$2
        //    62: aload           $this$background_delegate_u24lambda_u2d0
        //    64: bipush          100
        //    66: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    69: checkcast       Ljava/lang/Number;
        //    72: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    75: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    78: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    81: aload           $this$background_delegate_u24lambda_u2d0
        //    83: bipush          100
        //    85: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    88: checkcast       Ljava/lang/Number;
        //    91: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    94: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //    97: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   100: nop            
        //   101: aload           16
        //   103: nop            
        //   104: aload           4
        //   106: nop            
        //   107: aload_0         /* this */
        //   108: checkcast       Lgg/essential/elementa/UIComponent;
        //   111: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   114: aload_0         /* this */
        //   115: getstatic       gg/essential/vigilance/gui/settings/SwitchComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   118: iconst_0       
        //   119: aaload         
        //   120: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   123: putfield        gg/essential/vigilance/gui/settings/SwitchComponent.background$delegate:Lkotlin/properties/ReadWriteProperty;
        //   126: aload_0         /* this */
        //   127: new             Lgg/essential/elementa/components/UIBlock;
        //   130: dup            
        //   131: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   134: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getComponentBackground$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   137: checkcast       Lgg/essential/elementa/state/State;
        //   140: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   143: checkcast       Lgg/essential/elementa/UIComponent;
        //   146: astore_2        /* $this$constrain$iv */
        //   147: iconst_0       
        //   148: istore_3        /* $i$f$constrain */
        //   149: aload_2         /* $this$constrain$iv */
        //   150: astore          4
        //   152: aload           4
        //   154: astore          $this$constrain_u24lambda_u2d0$iv
        //   156: iconst_0       
        //   157: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   159: aload           $this$constrain_u24lambda_u2d0$iv
        //   161: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   164: astore          7
        //   166: astore          16
        //   168: iconst_0       
        //   169: istore          $i$a$-constrain-SwitchComponent$switchBox$1
        //   171: aload           $this$switchBox_u24lambda_u2d1
        //   173: aload_0         /* this */
        //   174: invokespecial   gg/essential/vigilance/gui/settings/SwitchComponent.getSwitchPosition:()Lgg/essential/elementa/constraints/PixelConstraint;
        //   177: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   180: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   183: aload           $this$switchBox_u24lambda_u2d1
        //   185: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   188: dup            
        //   189: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   192: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   195: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   198: aload           $this$switchBox_u24lambda_u2d1
        //   200: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   203: dup            
        //   204: fconst_0       
        //   205: iconst_1       
        //   206: aconst_null    
        //   207: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   210: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   213: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   216: aload           $this$switchBox_u24lambda_u2d1
        //   218: bipush          100
        //   220: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   223: checkcast       Ljava/lang/Number;
        //   226: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   229: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   232: iconst_2       
        //   233: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   236: checkcast       Ljava/lang/Number;
        //   239: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   242: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   245: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   248: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   251: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   254: nop            
        //   255: aload           16
        //   257: nop            
        //   258: aload           4
        //   260: nop            
        //   261: aload_0         /* this */
        //   262: checkcast       Lgg/essential/elementa/UIComponent;
        //   265: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   268: checkcast       Lgg/essential/elementa/components/UIBlock;
        //   271: putfield        gg/essential/vigilance/gui/settings/SwitchComponent.switchBox:Lgg/essential/elementa/components/UIBlock;
        //   274: aload_0         /* this */
        //   275: aload_0         /* this */
        //   276: checkcast       Lgg/essential/elementa/UIComponent;
        //   279: aconst_null    
        //   280: getstatic       gg/essential/vigilance/gui/settings/SwitchComponent$showToggleIndicators$1.INSTANCE:Lgg/essential/vigilance/gui/settings/SwitchComponent$showToggleIndicators$1;
        //   283: checkcast       Lkotlin/jvm/functions/Function0;
        //   286: iconst_1       
        //   287: aconst_null    
        //   288: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.pollingState$default:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lgg/essential/elementa/state/State;
        //   291: putfield        gg/essential/vigilance/gui/settings/SwitchComponent.showToggleIndicators:Lgg/essential/elementa/state/State;
        //   294: aload_0         /* this */
        //   295: new             Lgg/essential/elementa/components/UIContainer;
        //   298: dup            
        //   299: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   302: checkcast       Lgg/essential/elementa/UIComponent;
        //   305: astore_2        /* $this$constrain$iv */
        //   306: iconst_0       
        //   307: istore_3        /* $i$f$constrain */
        //   308: aload_2         /* $this$constrain$iv */
        //   309: astore          4
        //   311: aload           4
        //   313: astore          $this$constrain_u24lambda_u2d0$iv
        //   315: iconst_0       
        //   316: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   318: aload           $this$constrain_u24lambda_u2d0$iv
        //   320: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   323: astore          7
        //   325: astore          16
        //   327: iconst_0       
        //   328: istore          $i$a$-constrain-SwitchComponent$onIndicator$2
        //   330: aload           $this$onIndicator_delegate_u24lambda_u2d2
        //   332: bipush          100
        //   334: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   337: checkcast       Ljava/lang/Number;
        //   340: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   343: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   346: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   349: aload           $this$onIndicator_delegate_u24lambda_u2d2
        //   351: bipush          50
        //   353: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   356: checkcast       Ljava/lang/Number;
        //   359: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   362: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   365: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   368: nop            
        //   369: aload           16
        //   371: nop            
        //   372: aload           4
        //   374: nop            
        //   375: astore_2        /* $this$constrain$iv */
        //   376: nop            
        //   377: iconst_0       
        //   378: istore_3        /* $i$f$addChild */
        //   379: aload_2         /* $this$addChild$iv */
        //   380: astore          4
        //   382: aload           4
        //   384: astore          $this$addChild_u24lambda_u2d1$iv
        //   386: iconst_0       
        //   387: istore          $i$a$-apply-ComponentsKt$addChild$1$iv
        //   389: aload           $this$addChild_u24lambda_u2d1$iv
        //   391: aload           $this$addChild_u24lambda_u2d1$iv
        //   393: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   396: astore          7
        //   398: astore          17
        //   400: astore          16
        //   402: iconst_0       
        //   403: istore          $i$a$-addChild-SwitchComponent$onIndicator$3
        //   405: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   408: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTOGGLE_ON_1X5$Vigilance:()Lgg/essential/vigilance/utils/ImageFactory;
        //   411: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   414: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getComponentBackground$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   417: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //   420: astore          9
        //   422: aload           9
        //   424: ldc             "VigilancePalette.componentBackground.get()"
        //   426: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   429: aload           9
        //   431: checkcast       Ljava/awt/Color;
        //   434: invokevirtual   gg/essential/vigilance/utils/ImageFactory.withColor:(Ljava/awt/Color;)Lgg/essential/vigilance/utils/ImageFactory;
        //   437: invokevirtual   gg/essential/vigilance/utils/ImageFactory.create:()Lgg/essential/elementa/components/UIImage;
        //   440: checkcast       Lgg/essential/elementa/UIComponent;
        //   443: astore          $this$constrain$iv
        //   445: iconst_0       
        //   446: istore          $i$f$constrain
        //   448: aload           $this$constrain$iv
        //   450: astore          11
        //   452: aload           11
        //   454: astore          $this$constrain_u24lambda_u2d0$iv
        //   456: iconst_0       
        //   457: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   459: aload           $this$constrain_u24lambda_u2d0$iv
        //   461: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   464: astore          $this$onIndicator_delegate_u24lambda_u2d4_u24lambda_u2d3
        //   466: iconst_0       
        //   467: istore          $i$a$-constrain-SwitchComponent$onIndicator$3$1
        //   469: aload           $this$onIndicator_delegate_u24lambda_u2d4_u24lambda_u2d3
        //   471: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   474: dup            
        //   475: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   478: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   481: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   484: aload           $this$onIndicator_delegate_u24lambda_u2d4_u24lambda_u2d3
        //   486: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   489: dup            
        //   490: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   493: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   496: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   499: nop            
        //   500: nop            
        //   501: aload           11
        //   503: nop            
        //   504: nop            
        //   505: astore          18
        //   507: aload           16
        //   509: aload           17
        //   511: aload           18
        //   513: invokevirtual   gg/essential/elementa/UIComponent.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   516: pop            
        //   517: nop            
        //   518: aload           4
        //   520: nop            
        //   521: aload_0         /* this */
        //   522: checkcast       Lgg/essential/elementa/UIComponent;
        //   525: aload_0         /* this */
        //   526: getfield        gg/essential/vigilance/gui/settings/SwitchComponent.showToggleIndicators:Lgg/essential/elementa/state/State;
        //   529: aload_0         /* this */
        //   530: getfield        gg/essential/vigilance/gui/settings/SwitchComponent.enabled:Lgg/essential/elementa/state/BasicState;
        //   533: checkcast       Lgg/essential/elementa/state/State;
        //   536: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   539: checkcast       Lgg/essential/elementa/state/State;
        //   542: iconst_0       
        //   543: iconst_0       
        //   544: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   547: iconst_4       
        //   548: aconst_null    
        //   549: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.bindParent$default:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;ILjava/lang/Object;)Lgg/essential/elementa/UIComponent;
        //   552: aload_0         /* this */
        //   553: getstatic       gg/essential/vigilance/gui/settings/SwitchComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   556: iconst_1       
        //   557: aaload         
        //   558: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   561: putfield        gg/essential/vigilance/gui/settings/SwitchComponent.onIndicator$delegate:Lkotlin/properties/ReadWriteProperty;
        //   564: aload_0         /* this */
        //   565: new             Lgg/essential/elementa/components/UIContainer;
        //   568: dup            
        //   569: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   572: checkcast       Lgg/essential/elementa/UIComponent;
        //   575: astore_2        /* $this$constrain$iv */
        //   576: iconst_0       
        //   577: istore_3        /* $i$f$constrain */
        //   578: aload_2         /* $this$constrain$iv */
        //   579: astore          4
        //   581: aload           4
        //   583: astore          $this$constrain_u24lambda_u2d0$iv
        //   585: iconst_0       
        //   586: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   588: aload           $this$constrain_u24lambda_u2d0$iv
        //   590: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   593: astore          7
        //   595: astore          16
        //   597: iconst_0       
        //   598: istore          $i$a$-constrain-SwitchComponent$offIndicator$2
        //   600: aload           $this$offIndicator_delegate_u24lambda_u2d5
        //   602: iconst_0       
        //   603: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   606: checkcast       Ljava/lang/Number;
        //   609: iconst_1       
        //   610: iconst_0       
        //   611: iconst_2       
        //   612: aconst_null    
        //   613: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   616: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   619: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   622: aload           $this$offIndicator_delegate_u24lambda_u2d5
        //   624: bipush          100
        //   626: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   629: checkcast       Ljava/lang/Number;
        //   632: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   635: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   638: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   641: aload           $this$offIndicator_delegate_u24lambda_u2d5
        //   643: bipush          50
        //   645: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   648: checkcast       Ljava/lang/Number;
        //   651: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   654: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   657: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   660: nop            
        //   661: aload           16
        //   663: nop            
        //   664: aload           4
        //   666: nop            
        //   667: astore_2        /* $this$constrain$iv */
        //   668: nop            
        //   669: iconst_0       
        //   670: istore_3        /* $i$f$addChild */
        //   671: aload_2         /* $this$addChild$iv */
        //   672: astore          4
        //   674: aload           4
        //   676: astore          $this$addChild_u24lambda_u2d1$iv
        //   678: iconst_0       
        //   679: istore          $i$a$-apply-ComponentsKt$addChild$1$iv
        //   681: aload           $this$addChild_u24lambda_u2d1$iv
        //   683: aload           $this$addChild_u24lambda_u2d1$iv
        //   685: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   688: astore          7
        //   690: astore          17
        //   692: astore          16
        //   694: iconst_0       
        //   695: istore          $i$a$-addChild-SwitchComponent$offIndicator$3
        //   697: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   700: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTOGGLE_OFF_4X5$Vigilance:()Lgg/essential/vigilance/utils/ImageFactory;
        //   703: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   706: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getMidGray:()Ljava/awt/Color;
        //   709: invokevirtual   gg/essential/vigilance/utils/ImageFactory.withColor:(Ljava/awt/Color;)Lgg/essential/vigilance/utils/ImageFactory;
        //   712: invokevirtual   gg/essential/vigilance/utils/ImageFactory.create:()Lgg/essential/elementa/components/UIImage;
        //   715: checkcast       Lgg/essential/elementa/UIComponent;
        //   718: astore          $this$constrain$iv
        //   720: iconst_0       
        //   721: istore          $i$f$constrain
        //   723: aload           $this$constrain$iv
        //   725: astore          11
        //   727: aload           11
        //   729: astore          $this$constrain_u24lambda_u2d0$iv
        //   731: iconst_0       
        //   732: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   734: aload           $this$constrain_u24lambda_u2d0$iv
        //   736: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   739: astore          $this$offIndicator_delegate_u24lambda_u2d7_u24lambda_u2d6
        //   741: iconst_0       
        //   742: istore          $i$a$-constrain-SwitchComponent$offIndicator$3$1
        //   744: aload           $this$offIndicator_delegate_u24lambda_u2d7_u24lambda_u2d6
        //   746: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   749: dup            
        //   750: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   753: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   756: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   759: aload           $this$offIndicator_delegate_u24lambda_u2d7_u24lambda_u2d6
        //   761: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   764: dup            
        //   765: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   768: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   771: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   774: nop            
        //   775: nop            
        //   776: aload           11
        //   778: nop            
        //   779: nop            
        //   780: astore          18
        //   782: aload           16
        //   784: aload           17
        //   786: aload           18
        //   788: invokevirtual   gg/essential/elementa/UIComponent.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   791: pop            
        //   792: nop            
        //   793: aload           4
        //   795: nop            
        //   796: aload_0         /* this */
        //   797: checkcast       Lgg/essential/elementa/UIComponent;
        //   800: aload_0         /* this */
        //   801: getfield        gg/essential/vigilance/gui/settings/SwitchComponent.showToggleIndicators:Lgg/essential/elementa/state/State;
        //   804: aload_0         /* this */
        //   805: getfield        gg/essential/vigilance/gui/settings/SwitchComponent.enabled:Lgg/essential/elementa/state/BasicState;
        //   808: checkcast       Lgg/essential/elementa/state/State;
        //   811: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   814: checkcast       Lgg/essential/elementa/state/State;
        //   817: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   820: checkcast       Lgg/essential/elementa/state/State;
        //   823: iconst_0       
        //   824: iconst_0       
        //   825: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   828: iconst_4       
        //   829: aconst_null    
        //   830: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.bindParent$default:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;ILjava/lang/Object;)Lgg/essential/elementa/UIComponent;
        //   833: aload_0         /* this */
        //   834: getstatic       gg/essential/vigilance/gui/settings/SwitchComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   837: iconst_2       
        //   838: aaload         
        //   839: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   842: putfield        gg/essential/vigilance/gui/settings/SwitchComponent.offIndicator$delegate:Lkotlin/properties/ReadWriteProperty;
        //   845: nop            
        //   846: aload_0         /* this */
        //   847: checkcast       Lgg/essential/elementa/UIComponent;
        //   850: astore_2        /* $this$constrain$iv */
        //   851: iconst_0       
        //   852: istore_3        /* $i$f$constrain */
        //   853: aload_2         /* $this$constrain$iv */
        //   854: astore          4
        //   856: aload           4
        //   858: astore          $this$constrain_u24lambda_u2d0$iv
        //   860: iconst_0       
        //   861: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   863: aload           $this$constrain_u24lambda_u2d0$iv
        //   865: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   868: astore          $this$_init__u24lambda_u2d8
        //   870: iconst_0       
        //   871: istore          $i$a$-constrain-SwitchComponent$1
        //   873: aload           $this$_init__u24lambda_u2d8
        //   875: bipush          20
        //   877: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   880: checkcast       Ljava/lang/Number;
        //   883: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   886: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   889: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   892: aload           $this$_init__u24lambda_u2d8
        //   894: bipush          11
        //   896: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   899: checkcast       Ljava/lang/Number;
        //   902: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   905: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   908: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   911: nop            
        //   912: nop            
        //   913: nop            
        //   914: nop            
        //   915: aload_0         /* this */
        //   916: checkcast       Lgg/essential/elementa/UIComponent;
        //   919: astore_2        /* $this$onLeftClick$iv */
        //   920: iconst_0       
        //   921: istore_3        /* $i$f$onLeftClick */
        //   922: aload_2         /* $this$onLeftClick$iv */
        //   923: new             Lgg/essential/vigilance/gui/settings/SwitchComponent$special$$inlined$onLeftClick$1;
        //   926: dup            
        //   927: aload_0         /* this */
        //   928: invokespecial   gg/essential/vigilance/gui/settings/SwitchComponent$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/vigilance/gui/settings/SwitchComponent;)V
        //   931: checkcast       Lkotlin/jvm/functions/Function2;
        //   934: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   937: nop            
        //   938: pop            
        //   939: aload_0         /* this */
        //   940: new             Lgg/essential/vigilance/gui/settings/SwitchComponent$3;
        //   943: dup            
        //   944: aload_0         /* this */
        //   945: invokespecial   gg/essential/vigilance/gui/settings/SwitchComponent$3.<init>:(Lgg/essential/vigilance/gui/settings/SwitchComponent;)V
        //   948: checkcast       Lkotlin/jvm/functions/Function1;
        //   951: invokevirtual   gg/essential/vigilance/gui/settings/SwitchComponent.onMouseEnter:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   954: pop            
        //   955: aload_0         /* this */
        //   956: new             Lgg/essential/vigilance/gui/settings/SwitchComponent$4;
        //   959: dup            
        //   960: aload_0         /* this */
        //   961: invokespecial   gg/essential/vigilance/gui/settings/SwitchComponent$4.<init>:(Lgg/essential/vigilance/gui/settings/SwitchComponent;)V
        //   964: checkcast       Lkotlin/jvm/functions/Function1;
        //   967: invokevirtual   gg/essential/vigilance/gui/settings/SwitchComponent.onMouseLeave:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   970: pop            
        //   971: nop            
        //   972: return         
        //    MethodParameters:
        //  Name          Flags  
        //  ------------  -----
        //  initialState  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final BasicState<Boolean> getEnabled$Vigilance() {
        return this.enabled;
    }
    
    private final UIBlock getBackground() {
        return (UIBlock)this.background$delegate.getValue((Object)this, (KProperty)SwitchComponent.$$delegatedProperties[0]);
    }
    
    private final UIContainer getOnIndicator() {
        return (UIContainer)this.onIndicator$delegate.getValue((Object)this, (KProperty)SwitchComponent.$$delegatedProperties[1]);
    }
    
    private final UIContainer getOffIndicator() {
        return (UIContainer)this.offIndicator$delegate.getValue((Object)this, (KProperty)SwitchComponent.$$delegatedProperties[2]);
    }
    
    private final BasicState<Color> getSwitchColor() {
        return this.enabled.get() ? VigilancePalette.INSTANCE.getPrimary$Vigilance() : VigilancePalette.INSTANCE.getText$Vigilance();
    }
    
    private final PixelConstraint getSwitchPosition() {
        return this.enabled.get() ? UtilitiesKt.pixels$default(1, true, false, 2, null) : UtilitiesKt.getPixels(1);
    }
    
    public static final /* synthetic */ PixelConstraint access$getSwitchPosition(final SwitchComponent $this) {
        return $this.getSwitchPosition();
    }
    
    public static final /* synthetic */ UIBlock access$getBackground(final SwitchComponent $this) {
        return $this.getBackground();
    }
    
    public static final /* synthetic */ BasicState access$getSwitchColor(final SwitchComponent $this) {
        return $this.getSwitchColor();
    }
    
    public static final /* synthetic */ UIBlock access$getSwitchBox$p(final SwitchComponent $this) {
        return $this.switchBox;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SwitchComponent.class, "background", "getBackground()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SwitchComponent.class, "onIndicator", "getOnIndicator()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SwitchComponent.class, "offIndicator", "getOffIndicator()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
}
