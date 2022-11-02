package gg.essential.gui.common.modal;

import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.gui.common.*;
import java.util.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000R
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001f\u001a\u00020
                                                   2\u0006\u0010 \u001a\u00020\u0003H\u0002J\u001a\u0010!\u001a\u00020\u00002\u0012\u0010"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020
                                                   0	J\u0014\u0010#\u001a\u00020\u00002\f\u0010"\u001a\b\u0012\u0004\u0012\u00020
                                                   0$J\u001c\u0010%\u001a\u00020\u00012\u0012\u0010"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020
                                                   0	H\u0017J\u0014\u0010&\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120(R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020
                                                   0	0\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u000b\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0019X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001c\u0010\u001d¨\u0006)""" }, d2 = { "Lgg/essential/gui/common/modal/ConfirmDenyModal;", "Lgg/essential/gui/common/modal/EssentialModal;", "requiresButtonPress", "", "fadeTime", "", "(ZF)V", "cancelActions", "", "Lkotlin/Function1;", "", "cancelButton", "Lgg/essential/gui/common/MenuButton;", "getCancelButton", "()Lgg/essential/gui/common/MenuButton;", "cancelButton$delegate", "Lkotlin/properties/ReadWriteProperty;", "value", "", "cancelButtonText", "getCancelButtonText", "()Ljava/lang/String;", "setCancelButtonText", "(Ljava/lang/String;)V", "cancelButtonTextState", "Lgg/essential/elementa/state/MappedState;", "spacer", "Lgg/essential/gui/common/Spacer;", "getSpacer", "()Lgg/essential/gui/common/Spacer;", "spacer$delegate", "fireCancel", "buttonClicked", "onCancel", "callback", "onPrimaryAction", "Lkotlin/Function0;", "onPrimaryOrDismissAction", "rebindCancelTextState", "state", "Lgg/essential/elementa/state/State;", "essential" })
public class ConfirmDenyModal extends EssentialModal
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final MappedState<String, String> cancelButtonTextState;
    @NotNull
    private final List<Function1<Boolean, Unit>> cancelActions;
    @NotNull
    private final ReadWriteProperty cancelButton$delegate;
    @NotNull
    private final ReadWriteProperty spacer$delegate;
    
    public ConfirmDenyModal(final boolean requiresButtonPress, final float fadeTime) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload_1         /* requiresButtonPress */
        //     2: fload_2         /* fadeTime */
        //     3: invokespecial   gg/essential/gui/common/modal/EssentialModal.<init>:(ZF)V
        //     6: aload_0         /* this */
        //     7: new             Lgg/essential/elementa/state/BasicState;
        //    10: dup            
        //    11: ldc             "Cancel"
        //    13: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    16: getstatic       gg/essential/gui/common/modal/ConfirmDenyModal$cancelButtonTextState$1.INSTANCE:Lgg/essential/gui/common/modal/ConfirmDenyModal$cancelButtonTextState$1;
        //    19: checkcast       Lkotlin/jvm/functions/Function1;
        //    22: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    25: putfield        gg/essential/gui/common/modal/ConfirmDenyModal.cancelButtonTextState:Lgg/essential/elementa/state/MappedState;
        //    28: aload_0         /* this */
        //    29: new             Ljava/util/ArrayList;
        //    32: dup            
        //    33: invokespecial   java/util/ArrayList.<init>:()V
        //    36: checkcast       Ljava/util/List;
        //    39: putfield        gg/essential/gui/common/modal/ConfirmDenyModal.cancelActions:Ljava/util/List;
        //    42: aload_0         /* this */
        //    43: new             Lgg/essential/gui/common/MenuButton;
        //    46: dup            
        //    47: aload_0         /* this */
        //    48: getfield        gg/essential/gui/common/modal/ConfirmDenyModal.cancelButtonTextState:Lgg/essential/elementa/state/MappedState;
        //    51: checkcast       Lgg/essential/elementa/state/State;
        //    54: aconst_null    
        //    55: new             Lgg/essential/elementa/state/BasicState;
        //    58: dup            
        //    59: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //    62: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getGRAY:()Lgg/essential/gui/common/MenuButton$Style;
        //    65: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    68: checkcast       Lgg/essential/elementa/state/State;
        //    71: aconst_null    
        //    72: aconst_null    
        //    73: fconst_0       
        //    74: aconst_null    
        //    75: iconst_0       
        //    76: iconst_0       
        //    77: new             Lgg/essential/gui/common/modal/ConfirmDenyModal$cancelButton$2;
        //    80: dup            
        //    81: aload_0         /* this */
        //    82: invokespecial   gg/essential/gui/common/modal/ConfirmDenyModal$cancelButton$2.<init>:(Lgg/essential/gui/common/modal/ConfirmDenyModal;)V
        //    85: checkcast       Lkotlin/jvm/functions/Function0;
        //    88: sipush          506
        //    91: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //    94: checkcast       Lgg/essential/elementa/UIComponent;
        //    97: astore_3        /* $this$constrain$iv */
        //    98: aload_3         /* $this$constrain$iv */
        //    99: astore          4
        //   101: aload           4
        //   103: astore          $this$constrain_u24lambda_u2d0$iv
        //   105: aload           $this$constrain_u24lambda_u2d0$iv
        //   107: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   110: astore          6
        //   112: astore          7
        //   114: aload           $this$cancelButton_delegate_u24lambda_u2d0
        //   116: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   119: dup            
        //   120: iconst_0       
        //   121: iconst_1       
        //   122: aconst_null    
        //   123: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   126: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   129: aload_0         /* this */
        //   130: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.getPrimaryActionButton:()Lgg/essential/gui/common/MenuButton;
        //   133: checkcast       Lgg/essential/elementa/UIComponent;
        //   136: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   139: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   142: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   145: aload           $this$cancelButton_delegate_u24lambda_u2d0
        //   147: bipush          20
        //   149: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   152: checkcast       Ljava/lang/Number;
        //   155: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   158: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   161: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   164: aload           7
        //   166: aload           4
        //   168: aload_0         /* this */
        //   169: getstatic       gg/essential/gui/common/modal/ConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   172: iconst_0       
        //   173: aaload         
        //   174: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   177: putfield        gg/essential/gui/common/modal/ConfirmDenyModal.cancelButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //   180: aload_0         /* this */
        //   181: new             Lgg/essential/gui/common/Spacer;
        //   184: dup            
        //   185: ldc             14.0
        //   187: invokespecial   gg/essential/gui/common/Spacer.<init>:(F)V
        //   190: checkcast       Lgg/essential/elementa/UIComponent;
        //   193: aload_0         /* this */
        //   194: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.getCustomContent:()Lgg/essential/elementa/components/UIContainer;
        //   197: checkcast       Lgg/essential/elementa/UIComponent;
        //   200: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   203: aload_0         /* this */
        //   204: getstatic       gg/essential/gui/common/modal/ConfirmDenyModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   207: iconst_1       
        //   208: aaload         
        //   209: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   212: putfield        gg/essential/gui/common/modal/ConfirmDenyModal.spacer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   215: aload_0         /* this */
        //   216: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.getPrimaryActionButton:()Lgg/essential/gui/common/MenuButton;
        //   219: new             Lgg/essential/elementa/state/BasicState;
        //   222: dup            
        //   223: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //   226: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getBLUE:()Lgg/essential/gui/common/MenuButton$Style;
        //   229: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   232: checkcast       Lgg/essential/elementa/state/State;
        //   235: new             Lgg/essential/elementa/state/BasicState;
        //   238: dup            
        //   239: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //   242: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getLIGHT_BLUE:()Lgg/essential/gui/common/MenuButton$Style;
        //   245: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   248: checkcast       Lgg/essential/elementa/state/State;
        //   251: invokevirtual   gg/essential/gui/common/MenuButton.rebindStyle:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/MenuButton;
        //   254: pop            
        //   255: aload_0         /* this */
        //   256: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.getPrimaryActionButton:()Lgg/essential/gui/common/MenuButton;
        //   259: new             Lgg/essential/elementa/state/BasicState;
        //   262: dup            
        //   263: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //   266: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getBLUE_DISABLED:()Lgg/essential/gui/common/MenuButton$Style;
        //   269: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   272: checkcast       Lgg/essential/elementa/state/State;
        //   275: invokevirtual   gg/essential/gui/common/MenuButton.rebindDisabledStyle:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/MenuButton;
        //   278: pop            
        //   279: aload_0         /* this */
        //   280: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.getButtonContainer:()Lgg/essential/elementa/components/UIContainer;
        //   283: aload_0         /* this */
        //   284: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.getCancelButton:()Lgg/essential/gui/common/MenuButton;
        //   287: checkcast       Lgg/essential/elementa/UIComponent;
        //   290: aload_0         /* this */
        //   291: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.getPrimaryActionButton:()Lgg/essential/gui/common/MenuButton;
        //   294: checkcast       Lgg/essential/elementa/UIComponent;
        //   297: invokevirtual   gg/essential/elementa/components/UIContainer.insertChildBefore:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   300: pop            
        //   301: aload_0         /* this */
        //   302: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.getPrimaryActionButton:()Lgg/essential/gui/common/MenuButton;
        //   305: checkcast       Lgg/essential/elementa/UIComponent;
        //   308: astore_3        /* $this$constrain$iv */
        //   309: aload_3         /* $this$constrain$iv */
        //   310: astore          4
        //   312: aload           4
        //   314: astore          $this$constrain_u24lambda_u2d0$iv
        //   316: aload           $this$constrain_u24lambda_u2d0$iv
        //   318: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   321: astore          $this$_init__u24lambda_u2d1
        //   323: aload           $this$_init__u24lambda_u2d1
        //   325: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   328: dup            
        //   329: ldc             8.0
        //   331: iconst_0       
        //   332: iconst_2       
        //   333: aconst_null    
        //   334: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   337: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   340: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   343: aload_0         /* this */
        //   344: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //   347: astore_3        /* $this$configure$iv */
        //   348: aload_3         /* $this$configure$iv */
        //   349: astore          4
        //   351: aload           4
        //   353: astore          $this$configure_u24lambda_u2d0$iv
        //   355: aload           $this$configure_u24lambda_u2d0$iv
        //   357: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   360: astore          $this$_init__u24lambda_u2d2
        //   362: aload           $this$_init__u24lambda_u2d2
        //   364: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //   367: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setTitleTextColor:(Ljava/awt/Color;)V
        //   370: aload_0         /* this */
        //   371: new             Lgg/essential/gui/common/modal/ConfirmDenyModal$3;
        //   374: dup            
        //   375: aload_0         /* this */
        //   376: invokespecial   gg/essential/gui/common/modal/ConfirmDenyModal$3.<init>:(Lgg/essential/gui/common/modal/ConfirmDenyModal;)V
        //   379: checkcast       Lkotlin/jvm/functions/Function1;
        //   382: invokespecial   gg/essential/gui/common/modal/EssentialModal.onPrimaryOrDismissAction:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/EssentialModal;
        //   385: pop            
        //   386: return         
        //    MethodParameters:
        //  Name                 Flags  
        //  -------------------  -----
        //  requiresButtonPress  
        //  fadeTime             
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public ConfirmDenyModal(final boolean requiresButtonPress) {
        this(requiresButtonPress, 0.5f);
    }
    
    public final void setCancelButtonText(@NotNull final String value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.cancelButtonTextState.set(value);
    }
    
    @NotNull
    protected final MenuButton getCancelButton() {
        return (MenuButton)this.cancelButton$delegate.getValue((Object)this, (KProperty)ConfirmDenyModal.$$delegatedProperties[0]);
    }
    
    @NotNull
    public final Spacer getSpacer() {
        return (Spacer)this.spacer$delegate.getValue((Object)this, (KProperty)ConfirmDenyModal.$$delegatedProperties[1]);
    }
    
    @NotNull
    public final ConfirmDenyModal onCancel(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        final ConfirmDenyModal $this$onCancel_u24lambda_u2d3 = this;
        $this$onCancel_u24lambda_u2d3.cancelActions.add((Function1<Boolean, Unit>)callback);
        return $this$onCancel_u24lambda_u2d3;
    }
    
    private final void fireCancel(final boolean buttonClicked) {
        for (final Function1 cancelAction : this.cancelActions) {
            cancelAction.invoke((Object)buttonClicked);
        }
    }
    
    @Deprecated(message = "onPrimaryOrDismissAction is unavailable for ConfirmDenyModal. Use Either onCancel() or onPrimaryAction()", level = DeprecationLevel.HIDDEN)
    @Override
    @java.lang.Deprecated
    public /* synthetic */ EssentialModal onPrimaryOrDismissAction(final Function1 callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        throw new IllegalStateException("onPrimaryOrDismissAction is unavailable for ConfirmDenyModal. Use Either onCancel() or onPrimaryAction()");
    }
    
    @NotNull
    public final ConfirmDenyModal onPrimaryAction(@NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        final ConfirmDenyModal $this$onPrimaryAction_u24lambda_u2d4 = this;
        super.onPrimaryOrDismissAction((Function1<? super Boolean, Unit>)new ConfirmDenyModal$onPrimaryAction$1.ConfirmDenyModal$onPrimaryAction$1$1((Function0)callback));
        return $this$onPrimaryAction_u24lambda_u2d4;
    }
    
    public static final /* synthetic */ void access$fireCancel(final ConfirmDenyModal $this, final boolean buttonClicked) {
        $this.fireCancel(buttonClicked);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ConfirmDenyModal.class, "cancelButton", "getCancelButton()Lgg/essential/gui/common/MenuButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ConfirmDenyModal.class, "spacer", "getSpacer()Lgg/essential/gui/common/Spacer;", 0)) };
    }
}
