package gg.essential.vigilance.gui.settings;

import kotlin.reflect.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import gg.essential.vigilance.data.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0014\u0010\u0019\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018J\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d" }, d2 = { "Lgg/essential/vigilance/gui/settings/ButtonComponent;", "Lgg/essential/vigilance/gui/settings/SettingComponent;", "placeholder", "", "data", "Lgg/essential/vigilance/data/PropertyData;", "(Ljava/lang/String;Lgg/essential/vigilance/data/PropertyData;)V", "callback", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "container", "Lgg/essential/elementa/components/UIBlock;", "getContainer", "()Lgg/essential/elementa/components/UIBlock;", "container$delegate", "Lkotlin/properties/ReadWriteProperty;", "listener", "text", "Lgg/essential/elementa/components/UIWrappedText;", "getText", "()Lgg/essential/elementa/components/UIWrappedText;", "text$delegate", "textState", "Lgg/essential/elementa/state/State;", "bindText", "newTextState", "setText", "Companion", "Vigilance" })
public final class ButtonComponent extends SettingComponent
{
    @NotNull
    public static final Companion Companion;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final Function0<Unit> callback;
    @NotNull
    private State<String> textState;
    @NotNull
    private Function0<Unit> listener;
    @NotNull
    private final ReadWriteProperty container$delegate;
    @NotNull
    private final ReadWriteProperty text$delegate;
    
    public ButtonComponent(@Nullable final String placeholder, @NotNull final Function0<Unit> callback) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "callback"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/vigilance/gui/settings/SettingComponent.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_2         /* callback */
        //    12: putfield        gg/essential/vigilance/gui/settings/ButtonComponent.callback:Lkotlin/jvm/functions/Function0;
        //    15: aload_0         /* this */
        //    16: aload_1         /* placeholder */
        //    17: dup            
        //    18: ifnull          24
        //    21: goto            27
        //    24: pop            
        //    25: ldc             ""
        //    27: checkcast       Ljava/lang/CharSequence;
        //    30: astore_3       
        //    31: aload_3        
        //    32: astore          4
        //    34: aload           4
        //    36: invokeinterface java/lang/CharSequence.length:()I
        //    41: ifne            48
        //    44: iconst_1       
        //    45: goto            49
        //    48: iconst_0       
        //    49: ifeq            65
        //    52: astore          10
        //    54: iconst_0       
        //    55: istore          $i$a$-ifEmpty-ButtonComponent$textState$1
        //    57: ldc             "Activate"
        //    59: aload           10
        //    61: swap           
        //    62: goto            66
        //    65: aload_3        
        //    66: astore          11
        //    68: new             Lgg/essential/elementa/state/BasicState;
        //    71: dup            
        //    72: aload           11
        //    74: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    77: getstatic       gg/essential/vigilance/gui/settings/ButtonComponent$textState$2.INSTANCE:Lgg/essential/vigilance/gui/settings/ButtonComponent$textState$2;
        //    80: checkcast       Lkotlin/jvm/functions/Function1;
        //    83: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    86: checkcast       Lgg/essential/elementa/state/State;
        //    89: putfield        gg/essential/vigilance/gui/settings/ButtonComponent.textState:Lgg/essential/elementa/state/State;
        //    92: aload_0         /* this */
        //    93: aload_0         /* this */
        //    94: getfield        gg/essential/vigilance/gui/settings/ButtonComponent.textState:Lgg/essential/elementa/state/State;
        //    97: new             Lgg/essential/vigilance/gui/settings/ButtonComponent$listener$1;
        //   100: dup            
        //   101: aload_0         /* this */
        //   102: invokespecial   gg/essential/vigilance/gui/settings/ButtonComponent$listener$1.<init>:(Lgg/essential/vigilance/gui/settings/ButtonComponent;)V
        //   105: checkcast       Lkotlin/jvm/functions/Function1;
        //   108: invokevirtual   gg/essential/elementa/state/State.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   111: putfield        gg/essential/vigilance/gui/settings/ButtonComponent.listener:Lkotlin/jvm/functions/Function0;
        //   114: aload_0         /* this */
        //   115: new             Lgg/essential/elementa/components/UIBlock;
        //   118: dup            
        //   119: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   122: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getButton$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   125: checkcast       Lgg/essential/elementa/state/State;
        //   128: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   131: checkcast       Lgg/essential/elementa/UIComponent;
        //   134: astore_3        /* $this$constrain$iv */
        //   135: iconst_0       
        //   136: istore          $i$f$constrain
        //   138: aload_3         /* $this$constrain$iv */
        //   139: astore          5
        //   141: aload           5
        //   143: astore          $this$constrain_u24lambda_u2d0$iv
        //   145: iconst_0       
        //   146: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   148: aload           $this$constrain_u24lambda_u2d0$iv
        //   150: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   153: astore          8
        //   155: astore          10
        //   157: iconst_0       
        //   158: istore          $i$a$-constrain-ButtonComponent$container$2
        //   160: aload           $this$container_delegate_u24lambda_u2d1
        //   162: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   165: dup            
        //   166: fconst_0       
        //   167: iconst_1       
        //   168: aconst_null    
        //   169: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   172: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   175: bipush          14
        //   177: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   180: checkcast       Ljava/lang/Number;
        //   183: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   186: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   189: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   192: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   195: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   198: aload           $this$container_delegate_u24lambda_u2d1
        //   200: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   203: dup            
        //   204: fconst_0       
        //   205: iconst_1       
        //   206: aconst_null    
        //   207: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   210: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   213: bipush          8
        //   215: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   218: checkcast       Ljava/lang/Number;
        //   221: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   224: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   227: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   230: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   233: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   236: nop            
        //   237: aload           10
        //   239: nop            
        //   240: aload           5
        //   242: nop            
        //   243: aload_0         /* this */
        //   244: checkcast       Lgg/essential/elementa/UIComponent;
        //   247: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   250: aload_0         /* this */
        //   251: getstatic       gg/essential/vigilance/gui/settings/ButtonComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   254: iconst_0       
        //   255: aaload         
        //   256: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   259: putfield        gg/essential/vigilance/gui/settings/ButtonComponent.container$delegate:Lkotlin/properties/ReadWriteProperty;
        //   262: aload_0         /* this */
        //   263: aload_0         /* this */
        //   264: getfield        gg/essential/vigilance/gui/settings/ButtonComponent.textState:Lgg/essential/elementa/state/State;
        //   267: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   270: checkcast       Ljava/lang/String;
        //   273: astore_3       
        //   274: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   277: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextShadow:()Ljava/awt/Color;
        //   280: astore          4
        //   282: new             Lgg/essential/elementa/components/UIWrappedText;
        //   285: dup            
        //   286: aload_3        
        //   287: iconst_0       
        //   288: aload           4
        //   290: iconst_0       
        //   291: iconst_1       
        //   292: fconst_0       
        //   293: aconst_null    
        //   294: bipush          106
        //   296: aconst_null    
        //   297: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   300: checkcast       Lgg/essential/elementa/UIComponent;
        //   303: astore_3       
        //   304: nop            
        //   305: iconst_0       
        //   306: istore          $i$f$constrain
        //   308: aload_3         /* $this$constrain$iv */
        //   309: astore          5
        //   311: aload           5
        //   313: astore          $this$constrain_u24lambda_u2d0$iv
        //   315: iconst_0       
        //   316: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   318: aload           $this$constrain_u24lambda_u2d0$iv
        //   320: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   323: astore          8
        //   325: astore          10
        //   327: iconst_0       
        //   328: istore          $i$a$-constrain-ButtonComponent$text$2
        //   330: aload           $this$text_delegate_u24lambda_u2d2
        //   332: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   335: dup            
        //   336: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   339: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   342: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   345: aload           $this$text_delegate_u24lambda_u2d2
        //   347: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   350: dup            
        //   351: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   354: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   357: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   360: aload           $this$text_delegate_u24lambda_u2d2
        //   362: aload           $this$text_delegate_u24lambda_u2d2
        //   364: invokevirtual   gg/essential/elementa/UIConstraints.getWidth:()Lgg/essential/elementa/constraints/WidthConstraint;
        //   367: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   370: sipush          300
        //   373: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   376: checkcast       Ljava/lang/Number;
        //   379: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   382: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   385: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtMost:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtMostConstraint;
        //   388: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   391: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   394: aload           $this$text_delegate_u24lambda_u2d2
        //   396: bipush          10
        //   398: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   401: checkcast       Ljava/lang/Number;
        //   404: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   407: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   410: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   413: aload           $this$text_delegate_u24lambda_u2d2
        //   415: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   418: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getText$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   421: checkcast       Lgg/essential/elementa/state/State;
        //   424: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   427: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   430: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   433: nop            
        //   434: aload           10
        //   436: nop            
        //   437: aload           5
        //   439: nop            
        //   440: aload_0         /* this */
        //   441: invokespecial   gg/essential/vigilance/gui/settings/ButtonComponent.getContainer:()Lgg/essential/elementa/components/UIBlock;
        //   444: checkcast       Lgg/essential/elementa/UIComponent;
        //   447: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   450: aload_0         /* this */
        //   451: getstatic       gg/essential/vigilance/gui/settings/ButtonComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   454: iconst_1       
        //   455: aaload         
        //   456: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   459: putfield        gg/essential/vigilance/gui/settings/ButtonComponent.text$delegate:Lkotlin/properties/ReadWriteProperty;
        //   462: nop            
        //   463: aload_0         /* this */
        //   464: checkcast       Lgg/essential/elementa/UIComponent;
        //   467: astore_3        /* $this$constrain$iv */
        //   468: iconst_0       
        //   469: istore          $i$f$constrain
        //   471: aload_3         /* $this$constrain$iv */
        //   472: astore          5
        //   474: aload           5
        //   476: astore          $this$constrain_u24lambda_u2d0$iv
        //   478: iconst_0       
        //   479: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   481: aload           $this$constrain_u24lambda_u2d0$iv
        //   483: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   486: astore          $this$_init__u24lambda_u2d3
        //   488: iconst_0       
        //   489: istore          $i$a$-constrain-ButtonComponent$1
        //   491: aload           $this$_init__u24lambda_u2d3
        //   493: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   496: dup            
        //   497: fconst_0       
        //   498: iconst_1       
        //   499: aconst_null    
        //   500: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   503: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   506: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   509: aload           $this$_init__u24lambda_u2d3
        //   511: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   514: dup            
        //   515: fconst_0       
        //   516: iconst_1       
        //   517: aconst_null    
        //   518: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   521: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   524: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   527: nop            
        //   528: nop            
        //   529: nop            
        //   530: nop            
        //   531: aload_0         /* this */
        //   532: new             Lgg/essential/vigilance/gui/ExpandingClickEffect;
        //   535: dup            
        //   536: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   539: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getPrimary:()Ljava/awt/Color;
        //   542: ldc_w           0.5
        //   545: invokestatic    gg/essential/elementa/utils/ExtensionsKt.withAlpha:(Ljava/awt/Color;F)Ljava/awt/Color;
        //   548: fconst_0       
        //   549: aload_0         /* this */
        //   550: invokespecial   gg/essential/vigilance/gui/settings/ButtonComponent.getContainer:()Lgg/essential/elementa/components/UIBlock;
        //   553: checkcast       Lgg/essential/elementa/UIComponent;
        //   556: iconst_2       
        //   557: aconst_null    
        //   558: invokespecial   gg/essential/vigilance/gui/ExpandingClickEffect.<init>:(Ljava/awt/Color;FLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   561: checkcast       Lgg/essential/elementa/effects/Effect;
        //   564: invokevirtual   gg/essential/vigilance/gui/settings/ButtonComponent.enableEffect:(Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   567: pop            
        //   568: aload_0         /* this */
        //   569: invokespecial   gg/essential/vigilance/gui/settings/ButtonComponent.getContainer:()Lgg/essential/elementa/components/UIBlock;
        //   572: new             Lgg/essential/vigilance/gui/settings/ButtonComponent$2;
        //   575: dup            
        //   576: aload_0         /* this */
        //   577: invokespecial   gg/essential/vigilance/gui/settings/ButtonComponent$2.<init>:(Lgg/essential/vigilance/gui/settings/ButtonComponent;)V
        //   580: checkcast       Lkotlin/jvm/functions/Function1;
        //   583: invokevirtual   gg/essential/elementa/components/UIBlock.onMouseEnter:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   586: new             Lgg/essential/vigilance/gui/settings/ButtonComponent$3;
        //   589: dup            
        //   590: aload_0         /* this */
        //   591: invokespecial   gg/essential/vigilance/gui/settings/ButtonComponent$3.<init>:(Lgg/essential/vigilance/gui/settings/ButtonComponent;)V
        //   594: checkcast       Lkotlin/jvm/functions/Function1;
        //   597: invokevirtual   gg/essential/elementa/UIComponent.onMouseLeave:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   600: astore_3       
        //   601: nop            
        //   602: iconst_0       
        //   603: istore          $i$f$onLeftClick
        //   605: aload_3         /* $this$onLeftClick$iv */
        //   606: new             Lgg/essential/vigilance/gui/settings/ButtonComponent$special$$inlined$onLeftClick$1;
        //   609: dup            
        //   610: aload_0         /* this */
        //   611: invokespecial   gg/essential/vigilance/gui/settings/ButtonComponent$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/vigilance/gui/settings/ButtonComponent;)V
        //   614: checkcast       Lkotlin/jvm/functions/Function2;
        //   617: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   620: nop            
        //   621: pop            
        //   622: nop            
        //   623: return         
        //    Signature:
        //  (Ljava/lang/String;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  placeholder  
        //  callback     
        //    StackMapTable: 00 06 FF 00 18 00 03 07 00 02 07 00 54 07 00 56 00 02 07 00 02 07 00 54 FF 00 02 00 03 07 00 02 07 00 54 07 00 56 00 02 07 00 02 07 00 54 FF 00 14 00 05 07 00 02 07 00 54 07 00 56 07 00 59 07 00 59 00 01 07 00 02 FF 00 00 00 05 07 00 02 07 00 54 07 00 56 07 00 59 07 00 59 00 02 07 00 02 01 4F 07 00 02 FF 00 00 00 05 07 00 02 07 00 54 07 00 56 07 00 59 07 00 59 00 02 07 00 02 07 00 61
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public ButtonComponent(String placeholder, final Function0 callback, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            placeholder = null;
        }
        this(placeholder, (Function0<Unit>)callback);
    }
    
    private final UIBlock getContainer() {
        return (UIBlock)this.container$delegate.getValue((Object)this, (KProperty)ButtonComponent.$$delegatedProperties[0]);
    }
    
    private final UIWrappedText getText() {
        return (UIWrappedText)this.text$delegate.getValue((Object)this, (KProperty)ButtonComponent.$$delegatedProperties[1]);
    }
    
    @NotNull
    public final ButtonComponent bindText(@NotNull final State<String> newTextState) {
        Intrinsics.checkNotNullParameter((Object)newTextState, "newTextState");
        final ButtonComponent $this$bindText_u24lambda_u2d5 = this;
        final int n = 0;
        $this$bindText_u24lambda_u2d5.listener.invoke();
        $this$bindText_u24lambda_u2d5.textState = newTextState;
        $this$bindText_u24lambda_u2d5.getText().bindText((State<String>)$this$bindText_u24lambda_u2d5.textState.map((kotlin.jvm.functions.Function1<? super String, ?>)ButtonComponent$bindText$1.ButtonComponent$bindText$1$1.INSTANCE));
        $this$bindText_u24lambda_u2d5.listener = $this$bindText_u24lambda_u2d5.textState.onSetValue((kotlin.jvm.functions.Function1<? super String, Unit>)new ButtonComponent$bindText$1.ButtonComponent$bindText$1$2($this$bindText_u24lambda_u2d5));
        return this;
    }
    
    @NotNull
    public final String getText() {
        return this.textState.get();
    }
    
    @NotNull
    public final ButtonComponent setText(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        final ButtonComponent $this$setText_u24lambda_u2d6 = this;
        final int n = 0;
        $this$setText_u24lambda_u2d6.textState.set(text);
        return this;
    }
    
    public ButtonComponent(@Nullable final String placeholder, @NotNull final PropertyData data) {
        Intrinsics.checkNotNullParameter((Object)data, "data");
        this(placeholder, ButtonComponent.Companion.callbackFromPropertyData(data));
    }
    
    public ButtonComponent(String placeholder, final PropertyData data, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            placeholder = null;
        }
        this(placeholder, data);
    }
    
    public static final /* synthetic */ Function0 access$getCallback$p(final ButtonComponent $this) {
        return $this.callback;
    }
    
    public static final /* synthetic */ UIWrappedText access$getText(final ButtonComponent $this) {
        return $this.getText();
    }
    
    public static final /* synthetic */ State access$getTextState$p(final ButtonComponent $this) {
        return $this.textState;
    }
    
    public static final /* synthetic */ UIBlock access$getContainer(final ButtonComponent $this) {
        return $this.getContainer();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ButtonComponent.class, "container", "getContainer()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ButtonComponent.class, "text", "getText()Lgg/essential/elementa/components/UIWrappedText;", 0)) };
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b" }, d2 = { "Lgg/essential/vigilance/gui/settings/ButtonComponent$Companion;", "", "()V", "callbackFromPropertyData", "Lkotlin/Function0;", "", "data", "Lgg/essential/vigilance/data/PropertyData;", "Vigilance" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        private final Function0<Unit> callbackFromPropertyData(final PropertyData data) {
            final PropertyValue value = data.getValue();
            if (!(value instanceof CallablePropertyValue)) {
                throw new IllegalStateException();
            }
            return (Function0<Unit>)new ButtonComponent$Companion$callbackFromPropertyData.ButtonComponent$Companion$callbackFromPropertyData$1(value, data);
        }
        
        public static final /* synthetic */ Function0 access$callbackFromPropertyData(final Companion $this, final PropertyData data) {
            return $this.callbackFromPropertyData(data);
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
