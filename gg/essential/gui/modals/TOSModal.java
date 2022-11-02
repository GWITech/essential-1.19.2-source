package gg.essential.gui.modals;

import gg.essential.gui.common.modal.*;
import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.gui.elementa.*;
import gg.essential.gui.common.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000N
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u001a
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010	J\b\u00108\u001a\u000209H\u0002R\u001b\u0010
                                                   \u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b!\u0010\u000f\u001a\u0004\b\u001f\u0010 R\u0018\u0010"\u001a
                                                    #*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0004
                                                   \u0002\u0010$R\u001b\u0010%\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b'\u0010\u000f\u001a\u0004\b&\u0010\rR\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010)\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b+\u0010\u000f\u001a\u0004\b*\u0010\u0016R\u001b\u0010,\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b.\u0010\u000f\u001a\u0004\b-\u0010\u001bR\u001b\u0010/\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b1\u0010\u000f\u001a\u0004\b0\u0010\u0016R\u001b\u00102\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b4\u0010\u000f\u001a\u0004\b3\u0010\u001bR\u001b\u00105\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b7\u0010\u000f\u001a\u0004\b6\u0010\u0016¨\u0006:""" }, d2 = { "Lgg/essential/gui/modals/TOSModal;", "Lgg/essential/gui/common/modal/ConfirmDenyModal;", "unprompted", "", "requiresAuth", "confirmAction", "Lkotlin/Function0;", "", "cancelAction", "(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "ageCheckbox", "Lgg/essential/gui/common/Checkbox;", "getAgeCheckbox", "()Lgg/essential/gui/common/Checkbox;", "ageCheckbox$delegate", "Lkotlin/properties/ReadWriteProperty;", "ageCheckboxOutlineColor", "Lgg/essential/elementa/state/MappedState;", "Ljava/awt/Color;", "ageConfirmContainer", "Lgg/essential/elementa/UIComponent;", "getAgeConfirmContainer", "()Lgg/essential/elementa/UIComponent;", "ageConfirmContainer$delegate", "ageText", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getAgeText", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "ageText$delegate", "confirmContainer", "Lgg/essential/elementa/components/UIContainer;", "getConfirmContainer", "()Lgg/essential/elementa/components/UIContainer;", "confirmContainer$delegate", "forceUnicodeEnabled", "kotlin.jvm.PlatformType", "Ljava/lang/Boolean;", "tosCheckbox", "getTosCheckbox", "tosCheckbox$delegate", "tosCheckboxOutlineColor", "tosConfirmContainer", "getTosConfirmContainer", "tosConfirmContainer$delegate", "tosText1", "getTosText1", "tosText1$delegate", "tosText2", "getTosText2", "tosText2$delegate", "tosText3", "getTosText3", "tosText3$delegate", "tosText4", "getTosText4", "tosText4$delegate", "guiScaleUnicodeOffset", "Lgg/essential/gui/elementa/GuiScaleOffsetConstraint;", "essential" })
public final class TOSModal extends ConfirmDenyModal
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private final Boolean forceUnicodeEnabled;
    @NotNull
    private final MappedState<Color, Color> ageCheckboxOutlineColor;
    @NotNull
    private final MappedState<Color, Color> tosCheckboxOutlineColor;
    @NotNull
    private final ReadWriteProperty confirmContainer$delegate;
    @NotNull
    private final ReadWriteProperty ageConfirmContainer$delegate;
    @NotNull
    private final ReadWriteProperty ageCheckbox$delegate;
    @NotNull
    private final ReadWriteProperty tosConfirmContainer$delegate;
    @NotNull
    private final ReadWriteProperty tosCheckbox$delegate;
    @NotNull
    private final ReadWriteProperty tosText1$delegate;
    
    public TOSModal(final boolean requiresAuth, @NotNull final Function0<Unit> confirmAction, @NotNull final Function0<Unit> cancelAction) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "confirmAction"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_3         /* cancelAction */
        //     7: ldc             "cancelAction"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: iconst_0       
        //    14: invokespecial   gg/essential/gui/common/modal/ConfirmDenyModal.<init>:(Z)V
        //    17: aload_0         /* this */
        //    18: invokestatic    gg/essential/universal/UMinecraft.getSettings:()Lnet/minecraft/client/option/GameOptions;
        //    21: invokevirtual   net/minecraft/client/option/GameOptions.getForceUnicodeFont:()Lnet/minecraft/client/option/SimpleOption;
        //    24: invokevirtual   net/minecraft/client/option/SimpleOption.getValue:()Ljava/lang/Object;
        //    27: checkcast       Ljava/lang/Boolean;
        //    30: putfield        gg/essential/gui/modals/TOSModal.forceUnicodeEnabled:Ljava/lang/Boolean;
        //    33: aload_0         /* this */
        //    34: getstatic       gg/essential/gui/EssentialPalette.ACCENT_BLUE:Ljava/awt/Color;
        //    37: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //    40: getstatic       gg/essential/gui/modals/TOSModal$ageCheckboxOutlineColor$1.INSTANCE:Lgg/essential/gui/modals/TOSModal$ageCheckboxOutlineColor$1;
        //    43: checkcast       Lkotlin/jvm/functions/Function1;
        //    46: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    49: putfield        gg/essential/gui/modals/TOSModal.ageCheckboxOutlineColor:Lgg/essential/elementa/state/MappedState;
        //    52: aload_0         /* this */
        //    53: getstatic       gg/essential/gui/EssentialPalette.ACCENT_BLUE:Ljava/awt/Color;
        //    56: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //    59: getstatic       gg/essential/gui/modals/TOSModal$tosCheckboxOutlineColor$1.INSTANCE:Lgg/essential/gui/modals/TOSModal$tosCheckboxOutlineColor$1;
        //    62: checkcast       Lkotlin/jvm/functions/Function1;
        //    65: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    68: putfield        gg/essential/gui/modals/TOSModal.tosCheckboxOutlineColor:Lgg/essential/elementa/state/MappedState;
        //    71: aload_0         /* this */
        //    72: new             Lgg/essential/elementa/components/UIContainer;
        //    75: dup            
        //    76: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    79: checkcast       Lgg/essential/elementa/UIComponent;
        //    82: astore          $this$constrain$iv
        //    84: aload           $this$constrain$iv
        //    86: astore          5
        //    88: aload           5
        //    90: astore          $this$constrain_u24lambda_u2d0$iv
        //    92: aload           $this$constrain_u24lambda_u2d0$iv
        //    94: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    97: astore          7
        //    99: astore          8
        //   101: aload           $this$confirmContainer_delegate_u24lambda_u2d0
        //   103: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   106: dup            
        //   107: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   110: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   113: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   116: aload           $this$confirmContainer_delegate_u24lambda_u2d0
        //   118: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   121: dup            
        //   122: fconst_0       
        //   123: iconst_0       
        //   124: iconst_3       
        //   125: aconst_null    
        //   126: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   129: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   132: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   135: aload           $this$confirmContainer_delegate_u24lambda_u2d0
        //   137: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   140: dup            
        //   141: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   144: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   147: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   150: aload           $this$confirmContainer_delegate_u24lambda_u2d0
        //   152: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   155: dup            
        //   156: fconst_0       
        //   157: iconst_1       
        //   158: aconst_null    
        //   159: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   162: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   165: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   168: aload           8
        //   170: aload           5
        //   172: aload_0         /* this */
        //   173: invokevirtual   gg/essential/gui/modals/TOSModal.getCustomContent:()Lgg/essential/elementa/components/UIContainer;
        //   176: checkcast       Lgg/essential/elementa/UIComponent;
        //   179: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   182: aload_0         /* this */
        //   183: getstatic       gg/essential/gui/modals/TOSModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   186: iconst_0       
        //   187: aaload         
        //   188: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   191: putfield        gg/essential/gui/modals/TOSModal.confirmContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   194: aload_0         /* this */
        //   195: new             Lgg/essential/elementa/components/UIContainer;
        //   198: dup            
        //   199: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   202: checkcast       Lgg/essential/elementa/UIComponent;
        //   205: astore          $this$constrain$iv
        //   207: aload           $this$constrain$iv
        //   209: astore          5
        //   211: aload           5
        //   213: astore          $this$constrain_u24lambda_u2d0$iv
        //   215: aload           $this$constrain_u24lambda_u2d0$iv
        //   217: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   220: astore          7
        //   222: astore          8
        //   224: aload           $this$ageConfirmContainer_delegate_u24lambda_u2d1
        //   226: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   229: dup            
        //   230: fconst_0       
        //   231: iconst_1       
        //   232: aconst_null    
        //   233: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   236: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   239: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   242: aload           $this$ageConfirmContainer_delegate_u24lambda_u2d1
        //   244: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   247: dup            
        //   248: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   251: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   254: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   257: aload           8
        //   259: aload           5
        //   261: astore          $this$onLeftClick$iv
        //   263: aload           $this$onLeftClick$iv
        //   265: new             Lgg/essential/gui/modals/TOSModal$special$$inlined$onLeftClick$1;
        //   268: dup            
        //   269: invokespecial   gg/essential/gui/modals/TOSModal$special$$inlined$onLeftClick$1.<init>:()V
        //   272: checkcast       Lkotlin/jvm/functions/Function2;
        //   275: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   278: aload_0         /* this */
        //   279: invokespecial   gg/essential/gui/modals/TOSModal.getConfirmContainer:()Lgg/essential/elementa/components/UIContainer;
        //   282: checkcast       Lgg/essential/elementa/UIComponent;
        //   285: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   288: aload_0         /* this */
        //   289: getstatic       gg/essential/gui/modals/TOSModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   292: iconst_1       
        //   293: aaload         
        //   294: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   297: putfield        gg/essential/gui/modals/TOSModal.ageConfirmContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   300: aload_0         /* this */
        //   301: new             Lgg/essential/gui/common/Checkbox;
        //   304: dup            
        //   305: iconst_0       
        //   306: aconst_null    
        //   307: aconst_null    
        //   308: ldc             -1.0
        //   310: iconst_0       
        //   311: getstatic       gg/essential/gui/modals/TOSModal$ageCheckbox$2.INSTANCE:Lgg/essential/gui/modals/TOSModal$ageCheckbox$2;
        //   314: checkcast       Lkotlin/jvm/functions/Function1;
        //   317: bipush          6
        //   319: invokespecial   gg/essential/gui/common/Checkbox.<init>:(ZLgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;FZLkotlin/jvm/functions/Function1;I)V
        //   322: checkcast       Lgg/essential/elementa/UIComponent;
        //   325: astore          $this$constrain$iv
        //   327: aload           $this$constrain$iv
        //   329: astore          5
        //   331: aload           5
        //   333: astore          $this$constrain_u24lambda_u2d0$iv
        //   335: aload           $this$constrain_u24lambda_u2d0$iv
        //   337: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   340: astore          7
        //   342: astore          8
        //   344: aload           $this$ageCheckbox_delegate_u24lambda_u2d3
        //   346: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   349: dup            
        //   350: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   353: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   356: aload_0         /* this */
        //   357: getfield        gg/essential/gui/modals/TOSModal.forceUnicodeEnabled:Ljava/lang/Boolean;
        //   360: dup            
        //   361: ldc_w           "forceUnicodeEnabled"
        //   364: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   367: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   370: ifeq            386
        //   373: iconst_1       
        //   374: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   377: checkcast       Ljava/lang/Number;
        //   380: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   383: goto            396
        //   386: iconst_0       
        //   387: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   390: checkcast       Ljava/lang/Number;
        //   393: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   396: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   399: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   402: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   405: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   408: aload           $this$ageCheckbox_delegate_u24lambda_u2d3
        //   410: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   413: dup            
        //   414: fconst_0       
        //   415: iconst_1       
        //   416: aconst_null    
        //   417: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   420: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   423: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   426: aload           $this$ageCheckbox_delegate_u24lambda_u2d3
        //   428: bipush          9
        //   430: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   433: checkcast       Ljava/lang/Number;
        //   436: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   439: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   442: new             Lgg/essential/gui/elementa/GuiScaleOffsetConstraint;
        //   445: dup            
        //   446: ldc             -1.0
        //   448: invokespecial   gg/essential/gui/elementa/GuiScaleOffsetConstraint.<init>:(F)V
        //   451: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   454: invokestatic    gg/essential/util/ExtensionsKt.times:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/MasterConstraint;
        //   457: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   460: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   463: aload           8
        //   465: aload           5
        //   467: new             Lgg/essential/gui/common/outline/GuiScaleOffsetOutline;
        //   470: dup            
        //   471: aload_0         /* this */
        //   472: getfield        gg/essential/gui/modals/TOSModal.ageCheckboxOutlineColor:Lgg/essential/elementa/state/MappedState;
        //   475: checkcast       Lgg/essential/elementa/state/State;
        //   478: invokespecial   gg/essential/gui/common/outline/GuiScaleOffsetOutline.<init>:(Lgg/essential/elementa/state/State;)V
        //   481: checkcast       Lgg/essential/elementa/effects/Effect;
        //   484: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   487: aload_0         /* this */
        //   488: invokespecial   gg/essential/gui/modals/TOSModal.getAgeConfirmContainer:()Lgg/essential/elementa/UIComponent;
        //   491: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   494: aload_0         /* this */
        //   495: getstatic       gg/essential/gui/modals/TOSModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   498: iconst_2       
        //   499: aaload         
        //   500: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   503: putfield        gg/essential/gui/modals/TOSModal.ageCheckbox$delegate:Lkotlin/properties/ReadWriteProperty;
        //   506: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   509: dup            
        //   510: ldc_w           "I'm 13+ years old and have parental consent, or I'm 18+ years old."
        //   513: iconst_0       
        //   514: aconst_null    
        //   515: iconst_0       
        //   516: iconst_0       
        //   517: iconst_0       
        //   518: bipush          60
        //   520: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   523: checkcast       Lgg/essential/elementa/UIComponent;
        //   526: astore          $this$constrain$iv
        //   528: aload           $this$constrain$iv
        //   530: astore          5
        //   532: aload           5
        //   534: astore          $this$constrain_u24lambda_u2d0$iv
        //   536: aload           $this$constrain_u24lambda_u2d0$iv
        //   538: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   541: astore          $this$ageText_delegate_u24lambda_u2d4
        //   543: aload           $this$ageText_delegate_u24lambda_u2d4
        //   545: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   548: dup            
        //   549: ldc_w           4.0
        //   552: iconst_0       
        //   553: iconst_2       
        //   554: aconst_null    
        //   555: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   558: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   561: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   564: aload           $this$ageText_delegate_u24lambda_u2d4
        //   566: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   569: dup            
        //   570: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   573: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   576: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   579: aload           $this$ageText_delegate_u24lambda_u2d4
        //   581: aload_0         /* this */
        //   582: invokespecial   gg/essential/gui/modals/TOSModal.guiScaleUnicodeOffset:()Lgg/essential/gui/elementa/GuiScaleOffsetConstraint;
        //   585: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   588: invokevirtual   gg/essential/elementa/UIConstraints.setTextScale:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   591: aload           $this$ageText_delegate_u24lambda_u2d4
        //   593: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //   596: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   599: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   602: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   605: aload           5
        //   607: aload_0         /* this */
        //   608: invokespecial   gg/essential/gui/modals/TOSModal.getAgeConfirmContainer:()Lgg/essential/elementa/UIComponent;
        //   611: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   614: aload_0         /* this */
        //   615: getstatic       gg/essential/gui/modals/TOSModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   618: iconst_3       
        //   619: aaload         
        //   620: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   623: pop            
        //   624: aload_0         /* this */
        //   625: new             Lgg/essential/elementa/components/UIContainer;
        //   628: dup            
        //   629: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   632: checkcast       Lgg/essential/elementa/UIComponent;
        //   635: astore          $this$constrain$iv
        //   637: aload           $this$constrain$iv
        //   639: astore          5
        //   641: aload           5
        //   643: astore          $this$constrain_u24lambda_u2d0$iv
        //   645: aload           $this$constrain_u24lambda_u2d0$iv
        //   647: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   650: astore          7
        //   652: astore          8
        //   654: aload           $this$tosConfirmContainer_delegate_u24lambda_u2d5
        //   656: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   659: dup            
        //   660: ldc_w           4.0
        //   663: iconst_0       
        //   664: iconst_2       
        //   665: aconst_null    
        //   666: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   669: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   672: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   675: aload           $this$tosConfirmContainer_delegate_u24lambda_u2d5
        //   677: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   680: dup            
        //   681: fconst_0       
        //   682: iconst_1       
        //   683: aconst_null    
        //   684: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   687: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   690: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   693: aload           $this$tosConfirmContainer_delegate_u24lambda_u2d5
        //   695: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   698: dup            
        //   699: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   702: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   705: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   708: aload           8
        //   710: aload           5
        //   712: astore          $this$onLeftClick$iv
        //   714: aload           $this$onLeftClick$iv
        //   716: new             Lgg/essential/gui/modals/TOSModal$special$$inlined$onLeftClick$2;
        //   719: dup            
        //   720: invokespecial   gg/essential/gui/modals/TOSModal$special$$inlined$onLeftClick$2.<init>:()V
        //   723: checkcast       Lkotlin/jvm/functions/Function2;
        //   726: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   729: aload_0         /* this */
        //   730: invokespecial   gg/essential/gui/modals/TOSModal.getConfirmContainer:()Lgg/essential/elementa/components/UIContainer;
        //   733: checkcast       Lgg/essential/elementa/UIComponent;
        //   736: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   739: aload_0         /* this */
        //   740: getstatic       gg/essential/gui/modals/TOSModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   743: iconst_4       
        //   744: aaload         
        //   745: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   748: putfield        gg/essential/gui/modals/TOSModal.tosConfirmContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   751: aload_0         /* this */
        //   752: new             Lgg/essential/gui/common/Checkbox;
        //   755: dup            
        //   756: iconst_0       
        //   757: aconst_null    
        //   758: aconst_null    
        //   759: ldc             -1.0
        //   761: iconst_0       
        //   762: getstatic       gg/essential/gui/modals/TOSModal$tosCheckbox$2.INSTANCE:Lgg/essential/gui/modals/TOSModal$tosCheckbox$2;
        //   765: checkcast       Lkotlin/jvm/functions/Function1;
        //   768: bipush          6
        //   770: invokespecial   gg/essential/gui/common/Checkbox.<init>:(ZLgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;FZLkotlin/jvm/functions/Function1;I)V
        //   773: checkcast       Lgg/essential/elementa/UIComponent;
        //   776: astore          $this$constrain$iv
        //   778: aload           $this$constrain$iv
        //   780: astore          5
        //   782: aload           5
        //   784: astore          $this$constrain_u24lambda_u2d0$iv
        //   786: aload           $this$constrain_u24lambda_u2d0$iv
        //   788: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   791: astore          7
        //   793: astore          8
        //   795: aload           $this$tosCheckbox_delegate_u24lambda_u2d7
        //   797: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   800: dup            
        //   801: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   804: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   807: aload_0         /* this */
        //   808: getfield        gg/essential/gui/modals/TOSModal.forceUnicodeEnabled:Ljava/lang/Boolean;
        //   811: dup            
        //   812: ldc_w           "forceUnicodeEnabled"
        //   815: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   818: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   821: ifeq            837
        //   824: iconst_1       
        //   825: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   828: checkcast       Ljava/lang/Number;
        //   831: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   834: goto            847
        //   837: iconst_0       
        //   838: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   841: checkcast       Ljava/lang/Number;
        //   844: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   847: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   850: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   853: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   856: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   859: aload           $this$tosCheckbox_delegate_u24lambda_u2d7
        //   861: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   864: dup            
        //   865: fconst_0       
        //   866: iconst_1       
        //   867: aconst_null    
        //   868: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   871: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   874: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   877: aload           $this$tosCheckbox_delegate_u24lambda_u2d7
        //   879: bipush          100
        //   881: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   884: checkcast       Ljava/lang/Number;
        //   887: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   890: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   893: aload_0         /* this */
        //   894: invokespecial   gg/essential/gui/modals/TOSModal.getAgeCheckbox:()Lgg/essential/gui/common/Checkbox;
        //   897: checkcast       Lgg/essential/elementa/UIComponent;
        //   900: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   903: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   906: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   909: aload           8
        //   911: aload           5
        //   913: new             Lgg/essential/gui/common/outline/GuiScaleOffsetOutline;
        //   916: dup            
        //   917: aload_0         /* this */
        //   918: getfield        gg/essential/gui/modals/TOSModal.tosCheckboxOutlineColor:Lgg/essential/elementa/state/MappedState;
        //   921: checkcast       Lgg/essential/elementa/state/State;
        //   924: invokespecial   gg/essential/gui/common/outline/GuiScaleOffsetOutline.<init>:(Lgg/essential/elementa/state/State;)V
        //   927: checkcast       Lgg/essential/elementa/effects/Effect;
        //   930: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   933: aload_0         /* this */
        //   934: invokespecial   gg/essential/gui/modals/TOSModal.getTosConfirmContainer:()Lgg/essential/elementa/UIComponent;
        //   937: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   940: aload_0         /* this */
        //   941: getstatic       gg/essential/gui/modals/TOSModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   944: iconst_5       
        //   945: aaload         
        //   946: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   949: putfield        gg/essential/gui/modals/TOSModal.tosCheckbox$delegate:Lkotlin/properties/ReadWriteProperty;
        //   952: aload_0         /* this */
        //   953: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   956: dup            
        //   957: ldc_w           "I accept the "
        //   960: iconst_0       
        //   961: aconst_null    
        //   962: iconst_0       
        //   963: iconst_0       
        //   964: iconst_0       
        //   965: bipush          60
        //   967: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   970: checkcast       Lgg/essential/elementa/UIComponent;
        //   973: astore          $this$constrain$iv
        //   975: aload           $this$constrain$iv
        //   977: astore          5
        //   979: aload           5
        //   981: astore          $this$constrain_u24lambda_u2d0$iv
        //   983: aload           $this$constrain_u24lambda_u2d0$iv
        //   985: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   988: astore          7
        //   990: astore          8
        //   992: aload           $this$tosText1_delegate_u24lambda_u2d8
        //   994: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   997: dup            
        //   998: ldc_w           4.0
        //  1001: iconst_0       
        //  1002: iconst_2       
        //  1003: aconst_null    
        //  1004: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1007: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1010: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1013: aload           $this$tosText1_delegate_u24lambda_u2d8
        //  1015: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1018: dup            
        //  1019: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1022: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1025: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1028: aload           $this$tosText1_delegate_u24lambda_u2d8
        //  1030: aload_0         /* this */
        //  1031: invokespecial   gg/essential/gui/modals/TOSModal.guiScaleUnicodeOffset:()Lgg/essential/gui/elementa/GuiScaleOffsetConstraint;
        //  1034: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1037: invokevirtual   gg/essential/elementa/UIConstraints.setTextScale:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1040: aload           $this$tosText1_delegate_u24lambda_u2d8
        //  1042: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //  1045: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1048: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1051: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1054: aload           8
        //  1056: aload           5
        //  1058: aload_0         /* this */
        //  1059: invokespecial   gg/essential/gui/modals/TOSModal.getTosConfirmContainer:()Lgg/essential/elementa/UIComponent;
        //  1062: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1065: aload_0         /* this */
        //  1066: getstatic       gg/essential/gui/modals/TOSModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1069: bipush          6
        //  1071: aaload         
        //  1072: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1075: putfield        gg/essential/gui/modals/TOSModal.tosText1$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1078: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1081: dup            
        //  1082: getstatic       gg/essential/universal/ChatColor.UNDERLINE:Lgg/essential/universal/ChatColor;
        //  1085: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Lgg/essential/universal/ChatColor;)Ljava/lang/String;
        //  1090: iconst_0       
        //  1091: aconst_null    
        //  1092: iconst_0       
        //  1093: iconst_0       
        //  1094: iconst_0       
        //  1095: bipush          60
        //  1097: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  1100: checkcast       Lgg/essential/elementa/UIComponent;
        //  1103: astore          $this$constrain$iv
        //  1105: aload           $this$constrain$iv
        //  1107: astore          5
        //  1109: aload           5
        //  1111: astore          $this$constrain_u24lambda_u2d0$iv
        //  1113: aload           $this$constrain_u24lambda_u2d0$iv
        //  1115: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1118: astore          $this$tosText2_delegate_u24lambda_u2d9
        //  1120: aload           $this$tosText2_delegate_u24lambda_u2d9
        //  1122: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1125: dup            
        //  1126: fconst_0       
        //  1127: iconst_0       
        //  1128: iconst_3       
        //  1129: aconst_null    
        //  1130: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1133: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1136: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1139: aload           $this$tosText2_delegate_u24lambda_u2d9
        //  1141: iconst_0       
        //  1142: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1145: checkcast       Ljava/lang/Number;
        //  1148: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1151: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1154: aload_0         /* this */
        //  1155: invokespecial   gg/essential/gui/modals/TOSModal.getTosText1:()Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1158: checkcast       Lgg/essential/elementa/UIComponent;
        //  1161: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1164: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1167: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1170: aload           $this$tosText2_delegate_u24lambda_u2d9
        //  1172: aload_0         /* this */
        //  1173: invokespecial   gg/essential/gui/modals/TOSModal.guiScaleUnicodeOffset:()Lgg/essential/gui/elementa/GuiScaleOffsetConstraint;
        //  1176: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1179: invokevirtual   gg/essential/elementa/UIConstraints.setTextScale:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1182: aload           $this$tosText2_delegate_u24lambda_u2d9
        //  1184: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //  1187: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1190: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1193: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1196: aload           5
        //  1198: checkcast       Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1201: getstatic       gg/essential/gui/modals/TOSModal$tosText2$3.INSTANCE:Lgg/essential/gui/modals/TOSModal$tosText2$3;
        //  1204: checkcast       Lkotlin/jvm/functions/Function1;
        //  1207: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.onMouseEnter:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //  1210: getstatic       gg/essential/gui/modals/TOSModal$tosText2$4.INSTANCE:Lgg/essential/gui/modals/TOSModal$tosText2$4;
        //  1213: checkcast       Lkotlin/jvm/functions/Function1;
        //  1216: invokevirtual   gg/essential/elementa/UIComponent.onMouseLeave:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //  1219: astore          $this$onLeftClick$iv
        //  1221: aload           $this$onLeftClick$iv
        //  1223: new             Lgg/essential/gui/modals/TOSModal$special$$inlined$onLeftClick$3;
        //  1226: dup            
        //  1227: invokespecial   gg/essential/gui/modals/TOSModal$special$$inlined$onLeftClick$3.<init>:()V
        //  1230: checkcast       Lkotlin/jvm/functions/Function2;
        //  1233: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1236: aload_0         /* this */
        //  1237: invokespecial   gg/essential/gui/modals/TOSModal.getTosConfirmContainer:()Lgg/essential/elementa/UIComponent;
        //  1240: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1243: aload_0         /* this */
        //  1244: getstatic       gg/essential/gui/modals/TOSModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1247: bipush          7
        //  1249: aaload         
        //  1250: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1253: pop            
        //  1254: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1257: dup            
        //  1258: ldc_w           " and the Essential "
        //  1261: iconst_0       
        //  1262: aconst_null    
        //  1263: iconst_0       
        //  1264: iconst_0       
        //  1265: iconst_0       
        //  1266: bipush          60
        //  1268: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  1271: checkcast       Lgg/essential/elementa/UIComponent;
        //  1274: astore          $this$constrain$iv
        //  1276: aload           $this$constrain$iv
        //  1278: astore          5
        //  1280: aload           5
        //  1282: astore          $this$constrain_u24lambda_u2d0$iv
        //  1284: aload           $this$constrain_u24lambda_u2d0$iv
        //  1286: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1289: astore          $this$tosText3_delegate_u24lambda_u2d11
        //  1291: aload           $this$tosText3_delegate_u24lambda_u2d11
        //  1293: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1296: dup            
        //  1297: fconst_0       
        //  1298: iconst_0       
        //  1299: iconst_3       
        //  1300: aconst_null    
        //  1301: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1304: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1307: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1310: aload           $this$tosText3_delegate_u24lambda_u2d11
        //  1312: iconst_0       
        //  1313: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1316: checkcast       Ljava/lang/Number;
        //  1319: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1322: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1325: aload_0         /* this */
        //  1326: invokespecial   gg/essential/gui/modals/TOSModal.getTosText1:()Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1329: checkcast       Lgg/essential/elementa/UIComponent;
        //  1332: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1335: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1338: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1341: aload           $this$tosText3_delegate_u24lambda_u2d11
        //  1343: aload_0         /* this */
        //  1344: invokespecial   gg/essential/gui/modals/TOSModal.guiScaleUnicodeOffset:()Lgg/essential/gui/elementa/GuiScaleOffsetConstraint;
        //  1347: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1350: invokevirtual   gg/essential/elementa/UIConstraints.setTextScale:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1353: aload           $this$tosText3_delegate_u24lambda_u2d11
        //  1355: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //  1358: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1361: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1364: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1367: aload           5
        //  1369: aload_0         /* this */
        //  1370: invokespecial   gg/essential/gui/modals/TOSModal.getTosConfirmContainer:()Lgg/essential/elementa/UIComponent;
        //  1373: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1376: aload_0         /* this */
        //  1377: getstatic       gg/essential/gui/modals/TOSModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1380: bipush          8
        //  1382: aaload         
        //  1383: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1386: pop            
        //  1387: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1390: dup            
        //  1391: getstatic       gg/essential/universal/ChatColor.UNDERLINE:Lgg/essential/universal/ChatColor;
        //  1394: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Lgg/essential/universal/ChatColor;)Ljava/lang/String;
        //  1399: iconst_0       
        //  1400: aconst_null    
        //  1401: iconst_0       
        //  1402: iconst_0       
        //  1403: iconst_0       
        //  1404: bipush          60
        //  1406: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  1409: checkcast       Lgg/essential/elementa/UIComponent;
        //  1412: astore          $this$constrain$iv
        //  1414: aload           $this$constrain$iv
        //  1416: astore          5
        //  1418: aload           5
        //  1420: astore          $this$constrain_u24lambda_u2d0$iv
        //  1422: aload           $this$constrain_u24lambda_u2d0$iv
        //  1424: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1427: astore          $this$tosText4_delegate_u24lambda_u2d12
        //  1429: aload           $this$tosText4_delegate_u24lambda_u2d12
        //  1431: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1434: dup            
        //  1435: fconst_0       
        //  1436: iconst_0       
        //  1437: iconst_3       
        //  1438: aconst_null    
        //  1439: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1442: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1445: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1448: aload           $this$tosText4_delegate_u24lambda_u2d12
        //  1450: iconst_0       
        //  1451: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1454: checkcast       Ljava/lang/Number;
        //  1457: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1460: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1463: aload_0         /* this */
        //  1464: invokespecial   gg/essential/gui/modals/TOSModal.getTosText1:()Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1467: checkcast       Lgg/essential/elementa/UIComponent;
        //  1470: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1473: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1476: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1479: aload           $this$tosText4_delegate_u24lambda_u2d12
        //  1481: aload_0         /* this */
        //  1482: invokespecial   gg/essential/gui/modals/TOSModal.guiScaleUnicodeOffset:()Lgg/essential/gui/elementa/GuiScaleOffsetConstraint;
        //  1485: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1488: invokevirtual   gg/essential/elementa/UIConstraints.setTextScale:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1491: aload           $this$tosText4_delegate_u24lambda_u2d12
        //  1493: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //  1496: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1499: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1502: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1505: aload           5
        //  1507: checkcast       Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1510: getstatic       gg/essential/gui/modals/TOSModal$tosText4$3.INSTANCE:Lgg/essential/gui/modals/TOSModal$tosText4$3;
        //  1513: checkcast       Lkotlin/jvm/functions/Function1;
        //  1516: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.onMouseEnter:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //  1519: getstatic       gg/essential/gui/modals/TOSModal$tosText4$4.INSTANCE:Lgg/essential/gui/modals/TOSModal$tosText4$4;
        //  1522: checkcast       Lkotlin/jvm/functions/Function1;
        //  1525: invokevirtual   gg/essential/elementa/UIComponent.onMouseLeave:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //  1528: astore          $this$onLeftClick$iv
        //  1530: aload           $this$onLeftClick$iv
        //  1532: new             Lgg/essential/gui/modals/TOSModal$special$$inlined$onLeftClick$4;
        //  1535: dup            
        //  1536: invokespecial   gg/essential/gui/modals/TOSModal$special$$inlined$onLeftClick$4.<init>:()V
        //  1539: checkcast       Lkotlin/jvm/functions/Function2;
        //  1542: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1545: aload_0         /* this */
        //  1546: invokespecial   gg/essential/gui/modals/TOSModal.getTosConfirmContainer:()Lgg/essential/elementa/UIComponent;
        //  1549: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1552: aload_0         /* this */
        //  1553: getstatic       gg/essential/gui/modals/TOSModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1556: bipush          9
        //  1558: aaload         
        //  1559: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1562: pop            
        //  1563: aload_0         /* this */
        //  1564: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //  1567: astore          $this$configure$iv
        //  1569: aload           $this$configure$iv
        //  1571: astore          5
        //  1573: aload           5
        //  1575: astore          $this$configure_u24lambda_u2d0$iv
        //  1577: aload           $this$configure_u24lambda_u2d0$iv
        //  1579: checkcast       Lgg/essential/gui/modals/TOSModal;
        //  1582: astore          $this$_init__u24lambda_u2d14
        //  1584: aload           $this$_init__u24lambda_u2d14
        //  1586: ldc_w           "An Essential feature you are trying\n to use requires you to accept our\n Terms of Service."
        //  1589: invokevirtual   gg/essential/gui/modals/TOSModal.setContentText:(Ljava/lang/String;)V
        //  1592: aload           $this$_init__u24lambda_u2d14
        //  1594: ldc_w           "Back"
        //  1597: invokevirtual   gg/essential/gui/modals/TOSModal.setCancelButtonText:(Ljava/lang/String;)V
        //  1600: aload           $this$_init__u24lambda_u2d14
        //  1602: invokevirtual   gg/essential/gui/modals/TOSModal.getContent:()Lgg/essential/elementa/components/UIContainer;
        //  1605: aload           $this$_init__u24lambda_u2d14
        //  1607: invokespecial   gg/essential/gui/modals/TOSModal.getConfirmContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1610: checkcast       Lgg/essential/elementa/UIComponent;
        //  1613: invokestatic    gg/essential/elementa/dsl/ComponentConstraintsKt.componentWidthConstraint:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/WidthConstraint;
        //  1616: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1619: iconst_4       
        //  1620: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1623: checkcast       Ljava/lang/Number;
        //  1626: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1629: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1632: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1635: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1638: aload           $this$_init__u24lambda_u2d14
        //  1640: invokevirtual   gg/essential/gui/modals/TOSModal.getButtonContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1643: checkcast       Lgg/essential/elementa/UIComponent;
        //  1646: invokestatic    gg/essential/elementa/dsl/ComponentConstraintsKt.componentWidthConstraint:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/WidthConstraint;
        //  1649: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1652: bipush          17
        //  1654: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1657: checkcast       Ljava/lang/Number;
        //  1660: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1663: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1666: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1669: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1672: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtLeast:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtLeastConstraint;
        //  1675: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1678: invokevirtual   gg/essential/elementa/components/UIContainer.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)Lgg/essential/elementa/UIComponent;
        //  1681: pop            
        //  1682: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1685: pop            
        //  1686: new             Lgg/essential/gui/common/Spacer;
        //  1689: dup            
        //  1690: ldc_w           18.0
        //  1693: invokespecial   gg/essential/gui/common/Spacer.<init>:(F)V
        //  1696: checkcast       Lgg/essential/elementa/UIComponent;
        //  1699: aload_0         /* this */
        //  1700: invokevirtual   gg/essential/gui/modals/TOSModal.getCustomContent:()Lgg/essential/elementa/components/UIContainer;
        //  1703: checkcast       Lgg/essential/elementa/UIComponent;
        //  1706: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1709: pop            
        //  1710: aload_0         /* this */
        //  1711: invokespecial   gg/essential/gui/modals/TOSModal.getAgeCheckbox:()Lgg/essential/gui/common/Checkbox;
        //  1714: invokevirtual   gg/essential/gui/common/Checkbox.isChecked:()Lgg/essential/elementa/state/BasicState;
        //  1717: aload_0         /* this */
        //  1718: invokespecial   gg/essential/gui/modals/TOSModal.getTosCheckbox:()Lgg/essential/gui/common/Checkbox;
        //  1721: invokevirtual   gg/essential/gui/common/Checkbox.isChecked:()Lgg/essential/elementa/state/BasicState;
        //  1724: checkcast       Lgg/essential/elementa/state/State;
        //  1727: invokevirtual   gg/essential/elementa/state/BasicState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //  1730: new             Lgg/essential/gui/modals/TOSModal$3;
        //  1733: dup            
        //  1734: aload_0         /* this */
        //  1735: iload_1         /* requiresAuth */
        //  1736: aload_2         /* confirmAction */
        //  1737: invokespecial   gg/essential/gui/modals/TOSModal$3.<init>:(Lgg/essential/gui/modals/TOSModal;ZLkotlin/jvm/functions/Function0;)V
        //  1740: checkcast       Lkotlin/jvm/functions/Function1;
        //  1743: invokestatic    gg/essential/gui/common/StateExtensionsKt.onSetValueAndNow:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  1746: pop            
        //  1747: aload_0         /* this */
        //  1748: new             Lgg/essential/gui/modals/TOSModal$4;
        //  1751: dup            
        //  1752: iconst_0       
        //  1753: aload_3         /* cancelAction */
        //  1754: invokespecial   gg/essential/gui/modals/TOSModal$4.<init>:(ZLkotlin/jvm/functions/Function0;)V
        //  1757: checkcast       Lkotlin/jvm/functions/Function1;
        //  1760: invokevirtual   gg/essential/gui/modals/TOSModal.onCancel:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //  1763: pop            
        //  1764: return         
        //    Signature:
        //  (ZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  requiresAuth   
        //  confirmAction  
        //  cancelAction   
        //    StackMapTable: 00 04 FF 01 82 00 09 07 00 02 01 07 01 1D 07 01 1D 07 00 AE 07 00 AE 07 00 AE 07 00 B9 07 00 02 00 02 07 00 B9 07 01 05 FF 00 09 00 09 07 00 02 01 07 01 1D 07 01 1D 07 00 AE 07 00 AE 07 00 AE 07 00 B9 07 00 02 00 03 07 00 B9 07 01 05 07 01 22 FF 01 B8 00 09 07 00 02 01 07 01 1D 07 01 1D 07 00 AE 07 00 AE 07 00 AE 07 00 B9 07 00 02 00 02 07 00 B9 07 01 05 FF 00 09 00 09 07 00 02 01 07 01 1D 07 01 1D 07 00 AE 07 00 AE 07 00 AE 07 00 B9 07 00 02 00 03 07 00 B9 07 01 05 07 01 22
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public TOSModal(boolean requiresAuth, final Function0 confirmAction, Function0 cancelAction, final int n) {
        if ((n & 0x2) != 0x0) {
            requiresAuth = false;
        }
        if ((n & 0x8) != 0x0) {
            cancelAction = (Function0)TOSModal$1.INSTANCE;
        }
        this(requiresAuth, (Function0<Unit>)confirmAction, (Function0<Unit>)cancelAction);
    }
    
    private final UIContainer getConfirmContainer() {
        return (UIContainer)this.confirmContainer$delegate.getValue((Object)this, (KProperty)TOSModal.$$delegatedProperties[0]);
    }
    
    private final UIComponent getAgeConfirmContainer() {
        return (UIComponent)this.ageConfirmContainer$delegate.getValue((Object)this, (KProperty)TOSModal.$$delegatedProperties[1]);
    }
    
    private final Checkbox getAgeCheckbox() {
        return (Checkbox)this.ageCheckbox$delegate.getValue((Object)this, (KProperty)TOSModal.$$delegatedProperties[2]);
    }
    
    private final UIComponent getTosConfirmContainer() {
        return (UIComponent)this.tosConfirmContainer$delegate.getValue((Object)this, (KProperty)TOSModal.$$delegatedProperties[4]);
    }
    
    private final Checkbox getTosCheckbox() {
        return (Checkbox)this.tosCheckbox$delegate.getValue((Object)this, (KProperty)TOSModal.$$delegatedProperties[5]);
    }
    
    private final EssentialUIText getTosText1() {
        return (EssentialUIText)this.tosText1$delegate.getValue((Object)this, (KProperty)TOSModal.$$delegatedProperties[6]);
    }
    
    private final GuiScaleOffsetConstraint guiScaleUnicodeOffset() {
        final Boolean forceUnicodeEnabled = this.forceUnicodeEnabled;
        Intrinsics.checkNotNullExpressionValue((Object)forceUnicodeEnabled, "forceUnicodeEnabled");
        return new GuiScaleOffsetConstraint(forceUnicodeEnabled ? 0.0f : -1.0f);
    }
    
    public static final /* synthetic */ MappedState access$getAgeCheckboxOutlineColor$p(final TOSModal $this) {
        return $this.ageCheckboxOutlineColor;
    }
    
    public static final /* synthetic */ Checkbox access$getAgeCheckbox(final TOSModal $this) {
        return $this.getAgeCheckbox();
    }
    
    public static final /* synthetic */ MappedState access$getTosCheckboxOutlineColor$p(final TOSModal $this) {
        return $this.tosCheckboxOutlineColor;
    }
    
    public static final /* synthetic */ Checkbox access$getTosCheckbox(final TOSModal $this) {
        return $this.getTosCheckbox();
    }
    
    public static final /* synthetic */ MenuButton access$getCancelButton(final TOSModal $this) {
        return $this.getCancelButton();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TOSModal.class, "confirmContainer", "getConfirmContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TOSModal.class, "ageConfirmContainer", "getAgeConfirmContainer()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TOSModal.class, "ageCheckbox", "getAgeCheckbox()Lgg/essential/gui/common/Checkbox;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TOSModal.class, "ageText", "getAgeText()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TOSModal.class, "tosConfirmContainer", "getTosConfirmContainer()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TOSModal.class, "tosCheckbox", "getTosCheckbox()Lgg/essential/gui/common/Checkbox;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TOSModal.class, "tosText1", "getTosText1()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TOSModal.class, "tosText2", "getTosText2()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TOSModal.class, "tosText3", "getTosText3()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TOSModal.class, "tosText4", "getTosText4()Lgg/essential/elementa/UIComponent;", 0)) };
    }
}
