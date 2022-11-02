package gg.essential.gui.common.modal;

import kotlin.reflect.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.common.input.*;
import gg.essential.elementa.state.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u0014J\u001a\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0014J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0003R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b
                                                   \u0010\u000b\u001a\u0004\b\b\u0010	R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a""" }, d2 = { "Lgg/essential/gui/common/modal/CancelableInputModal;", "Lgg/essential/gui/common/modal/ConfirmDenyModal;", "placeholderText", "", "initialText", "(Ljava/lang/String;Ljava/lang/String;)V", "input", "Lgg/essential/gui/common/input/AbstractTextInput;", "getInput", "()Lgg/essential/gui/common/input/AbstractTextInput;", "input$delegate", "Lkotlin/properties/ReadWriteProperty;", "inputTextState", "Lgg/essential/elementa/state/BasicState;", "getInputTextState", "()Lgg/essential/elementa/state/BasicState;", "afterInitialization", "", "mapInputToEnabled", "mapper", "Lkotlin/Function1;", "", "onPrimaryActionWithValue", "callback", "setText", "text", "essential" })
public class CancelableInputModal extends ConfirmDenyModal
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty input$delegate;
    @NotNull
    private final BasicState<String> inputTextState;
    
    public CancelableInputModal(@NotNull final String placeholderText, @NotNull final String initialText) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "placeholderText"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* initialText */
        //     7: ldc             "initialText"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: iconst_0       
        //    14: invokespecial   gg/essential/gui/common/modal/ConfirmDenyModal.<init>:(Z)V
        //    17: aload_0         /* this */
        //    18: new             Lgg/essential/gui/common/input/UITextInput;
        //    21: dup            
        //    22: aload_1         /* placeholderText */
        //    23: iconst_0       
        //    24: getstatic       gg/essential/gui/EssentialPalette.BLACK:Ljava/awt/Color;
        //    27: aconst_null    
        //    28: aconst_null    
        //    29: aconst_null    
        //    30: aconst_null    
        //    31: aconst_null    
        //    32: sipush          506
        //    35: invokespecial   gg/essential/gui/common/input/UITextInput.<init>:(Ljava/lang/String;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V
        //    38: checkcast       Lgg/essential/elementa/UIComponent;
        //    41: astore_3        /* $this$constrain$iv */
        //    42: aload_3         /* $this$constrain$iv */
        //    43: astore          4
        //    45: aload           4
        //    47: astore          $this$constrain_u24lambda_u2d0$iv
        //    49: aload           $this$constrain_u24lambda_u2d0$iv
        //    51: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    54: astore          6
        //    56: astore          7
        //    58: aload           $this$input_delegate_u24lambda_u2d0
        //    60: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //    63: dup            
        //    64: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //    67: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //    70: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //    73: aload           $this$input_delegate_u24lambda_u2d0
        //    75: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //    78: dup            
        //    79: fconst_0       
        //    80: iconst_0       
        //    81: iconst_3       
        //    82: aconst_null    
        //    83: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    86: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    89: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    92: aload           $this$input_delegate_u24lambda_u2d0
        //    94: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //    97: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   100: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   103: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   106: aload           7
        //   108: aload           4
        //   110: checkcast       Lgg/essential/gui/common/input/UITextInput;
        //   113: bipush          100
        //   115: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   118: checkcast       Ljava/lang/Number;
        //   121: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   124: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   127: invokevirtual   gg/essential/gui/common/input/UITextInput.setMaxWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)Lgg/essential/gui/common/input/UITextInput;
        //   130: iconst_1       
        //   131: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   134: checkcast       Ljava/lang/Number;
        //   137: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   140: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   143: invokevirtual   gg/essential/gui/common/input/UITextInput.setMinWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)Lgg/essential/gui/common/input/UITextInput;
        //   146: new             Lgg/essential/gui/common/modal/CancelableInputModal$input$3;
        //   149: dup            
        //   150: aload_0         /* this */
        //   151: invokespecial   gg/essential/gui/common/modal/CancelableInputModal$input$3.<init>:(Lgg/essential/gui/common/modal/CancelableInputModal;)V
        //   154: checkcast       Lkotlin/jvm/functions/Function1;
        //   157: invokevirtual   gg/essential/gui/common/input/UITextInput.onUpdate:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/input/AbstractTextInput;
        //   160: checkcast       Lgg/essential/elementa/UIComponent;
        //   163: aload_0         /* this */
        //   164: invokevirtual   gg/essential/gui/common/modal/CancelableInputModal.getCustomContent:()Lgg/essential/elementa/components/UIContainer;
        //   167: checkcast       Lgg/essential/elementa/UIComponent;
        //   170: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   173: aload_0         /* this */
        //   174: getstatic       gg/essential/gui/common/modal/CancelableInputModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   177: iconst_0       
        //   178: aaload         
        //   179: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   182: putfield        gg/essential/gui/common/modal/CancelableInputModal.input$delegate:Lkotlin/properties/ReadWriteProperty;
        //   185: aload_0         /* this */
        //   186: new             Lgg/essential/elementa/state/BasicState;
        //   189: dup            
        //   190: aload_2         /* initialText */
        //   191: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   194: putfield        gg/essential/gui/common/modal/CancelableInputModal.inputTextState:Lgg/essential/elementa/state/BasicState;
        //   197: aload_0         /* this */
        //   198: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //   201: astore_3        /* $this$configure$iv */
        //   202: aload_3         /* $this$configure$iv */
        //   203: astore          4
        //   205: aload           4
        //   207: astore          $this$configure_u24lambda_u2d0$iv
        //   209: aload           $this$configure_u24lambda_u2d0$iv
        //   211: checkcast       Lgg/essential/gui/common/modal/CancelableInputModal;
        //   214: astore          $this$_init__u24lambda_u2d1
        //   216: aload           $this$_init__u24lambda_u2d1
        //   218: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //   221: invokevirtual   gg/essential/gui/common/modal/CancelableInputModal.setTitleTextColor:(Ljava/awt/Color;)V
        //   224: aload_0         /* this */
        //   225: invokevirtual   gg/essential/gui/common/modal/CancelableInputModal.getSpacer:()Lgg/essential/gui/common/Spacer;
        //   228: bipush          8
        //   230: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   233: checkcast       Ljava/lang/Number;
        //   236: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   239: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   242: invokevirtual   gg/essential/gui/common/Spacer.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/UIComponent;
        //   245: pop            
        //   246: aload_0         /* this */
        //   247: invokespecial   gg/essential/gui/common/modal/CancelableInputModal.getInput:()Lgg/essential/gui/common/input/AbstractTextInput;
        //   250: checkcast       Lgg/essential/elementa/UIComponent;
        //   253: astore_3        /* $this$onLeftClick$iv */
        //   254: aload_3         /* $this$onLeftClick$iv */
        //   255: new             Lgg/essential/gui/common/modal/CancelableInputModal$special$$inlined$onLeftClick$1;
        //   258: dup            
        //   259: aload_0         /* this */
        //   260: invokespecial   gg/essential/gui/common/modal/CancelableInputModal$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/common/modal/CancelableInputModal;)V
        //   263: checkcast       Lkotlin/jvm/functions/Function2;
        //   266: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   269: pop            
        //   270: new             Lgg/essential/gui/common/Spacer;
        //   273: dup            
        //   274: ldc             24.0
        //   276: invokespecial   gg/essential/gui/common/Spacer.<init>:(F)V
        //   279: checkcast       Lgg/essential/elementa/UIComponent;
        //   282: aload_0         /* this */
        //   283: invokevirtual   gg/essential/gui/common/modal/CancelableInputModal.getCustomContent:()Lgg/essential/elementa/components/UIContainer;
        //   286: checkcast       Lgg/essential/elementa/UIComponent;
        //   289: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   292: pop            
        //   293: aload_0         /* this */
        //   294: getfield        gg/essential/gui/common/modal/CancelableInputModal.inputTextState:Lgg/essential/elementa/state/BasicState;
        //   297: new             Lgg/essential/gui/common/modal/CancelableInputModal$3;
        //   300: dup            
        //   301: aload_0         /* this */
        //   302: invokespecial   gg/essential/gui/common/modal/CancelableInputModal$3.<init>:(Lgg/essential/gui/common/modal/CancelableInputModal;)V
        //   305: checkcast       Lkotlin/jvm/functions/Function1;
        //   308: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   311: pop            
        //   312: return         
        //    MethodParameters:
        //  Name             Flags  
        //  ---------------  -----
        //  placeholderText  
        //  initialText      
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final AbstractTextInput getInput() {
        return (AbstractTextInput)this.input$delegate.getValue((Object)this, (KProperty)CancelableInputModal.$$delegatedProperties[0]);
    }
    
    @NotNull
    public final BasicState<String> getInputTextState() {
        return this.inputTextState;
    }
    
    @Override
    public void afterInitialization() {
        super.afterInitialization();
        this.getInput().grabWindowFocus();
    }
    
    @NotNull
    public final CancelableInputModal mapInputToEnabled(@NotNull final Function1<? super String, Boolean> mapper) {
        Intrinsics.checkNotNullParameter((Object)mapper, "mapper");
        final CancelableInputModal $this$mapInputToEnabled_u24lambda_u2d4 = this;
        $this$mapInputToEnabled_u24lambda_u2d4.bindConfirmAvailable((State<Boolean>)$this$mapInputToEnabled_u24lambda_u2d4.inputTextState.map((kotlin.jvm.functions.Function1<? super Object, ?>)mapper));
        return $this$mapInputToEnabled_u24lambda_u2d4;
    }
    
    @NotNull
    public final CancelableInputModal onPrimaryActionWithValue(@NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        final CancelableInputModal $this$onPrimaryActionWithValue_u24lambda_u2d5 = this;
        super.onPrimaryAction((Function0<Unit>)new CancelableInputModal$onPrimaryActionWithValue$1.CancelableInputModal$onPrimaryActionWithValue$1$1((Function1)callback, $this$onPrimaryActionWithValue_u24lambda_u2d5));
        return this;
    }
    
    public static final /* synthetic */ AbstractTextInput access$getInput(final CancelableInputModal $this) {
        return $this.getInput();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CancelableInputModal.class, "input", "getInput()Lgg/essential/gui/common/input/AbstractTextInput;", 0)) };
    }
}
