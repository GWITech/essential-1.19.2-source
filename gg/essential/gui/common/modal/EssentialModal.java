package gg.essential.gui.common.modal;

import kotlin.reflect.*;
import java.awt.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import kotlin.jvm.functions.*;
import kotlin.properties.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.components.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u008e\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\f
                                                   \u0002\u0010\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0016
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0016
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010v\u001a\u00020\u00002\f\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00030xJ\u0014\u0010y\u001a\u00020\u00002\f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00110xJ\u001a\u0010{\u001a\u00020\u00002\u0012\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020)0(J\u0018\u0010}\u001a\u00020)2\u000e\u0010~\u001a
                                                   \u0012\u0004\u0012\u00020)\u0018\u00010=H\u0016J\u0018\u0010\u007f\u001a\u00020)2\u000e\u0010~\u001a
                                                   \u0012\u0004\u0012\u00020)\u0018\u00010=H\u0016J\u0007\u0010\u0080\u0001\u001a\u00020)J\u001d\u0010\u0081\u0001\u001a\u00020\u00002\u0012\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(H\u0016J\u0016\u0010\u0082\u0001\u001a\u00020\u00002\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190xJ\u0015\u0010\u0084\u0001\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110xJ\u0015\u0010\u0085\u0001\u001a\u00020\u00002\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00110xJ\u0016\u0010\u0086\u0001\u001a\u00020\u00002\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190xJ\u0012\u0010\u0087\u0001\u001a\u00020)2\u0007\u0010\u0088\u0001\u001a\u00020\u0003H\u0002R\u001b\u0010\u0007\u001a\u00020\b8DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000b\u0010\f\u001a\u0004\b	\u0010
                                                   R\u001b\u0010\r\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010
                                                   R+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014"\u0004\b\u0015\u0010\u0016R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c"\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190!X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010"\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110!X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010#\u001a\u00020\b8DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b%\u0010\f\u001a\u0004\b$\u0010
                                                   R \u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(0'X\u0082\u0004¢\u0006\u0002
                                                   \u0000R+\u0010*\u001a\u001f\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020)0+¢\u0006\u0002\b/X\u0082\u0004¢\u0006\u0002
                                                   \u0000R+\u00100\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\b5\u00106\u001a\u0004\b1\u00102"\u0004\b3\u00104R\u001b\u00107\u001a\u0002088FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b;\u0010\f\u001a\u0004\b9\u0010:R"\u0010<\u001a
                                                   \u0012\u0004\u0012\u00020)\u0018\u00010=X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b>\u0010?"\u0004\b@\u0010AR+\u0010C\u001a\u00020B2\u0006\u0010\u0010\u001a\u00020B8F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\bH\u00106\u001a\u0004\bD\u0010E"\u0004\bF\u0010GR\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020B0JX\u0082\u0004¢\u0006\u0002
                                                   \u0000R+\u0010K\u001a\u00020B2\u0006\u0010\u0010\u001a\u00020B8F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\bN\u00106\u001a\u0004\bL\u0010E"\u0004\bM\u0010GR\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020B0JX\u0082\u0004¢\u0006\u0002
                                                   \u0000R+\u0010P\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\bS\u0010\u0018\u001a\u0004\bQ\u0010\u0014"\u0004\bR\u0010\u0016R\u001a\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110!X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bU\u0010V"\u0004\bW\u0010XR"\u0010Z\u001a\u0004\u0018\u0001082\b\u0010Y\u001a\u0004\u0018\u000108@BX\u0082\u000e¢\u0006\b
                                                   \u0000"\u0004\b[\u0010\R\u001b\u0010]\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b_\u0010\f\u001a\u0004\b^\u0010
                                                   R\u001b\u0010`\u001a\u00020a8DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\bd\u0010\f\u001a\u0004\bb\u0010cR\u001b\u0010e\u001a\u00020a8DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\bg\u0010\f\u001a\u0004\bf\u0010cR\u001b\u0010h\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bj\u0010\f\u001a\u0004\bi\u0010
                                                   R+\u0010k\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\bn\u0010\u0018\u001a\u0004\bl\u0010\u0014"\u0004\bm\u0010\u0016R+\u0010o\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012
                                                   \u0004\br\u0010\u0018\u001a\u0004\bp\u0010\u001c"\u0004\bq\u0010\u001eR\u001a\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190!X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110!X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00050JX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0089\u0001""" }, d2 = { "Lgg/essential/gui/common/modal/EssentialModal;", "Lgg/essential/gui/common/modal/Modal;", "requiresButtonPress", "", "fadeTime", "", "(ZF)V", "buttonContainer", "Lgg/essential/elementa/components/UIContainer;", "getButtonContainer", "()Lgg/essential/elementa/components/UIContainer;", "buttonContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "content", "getContent", "content$delegate", "<set-?>", "", "contentText", "getContentText", "()Ljava/lang/String;", "setContentText", "(Ljava/lang/String;)V", "contentText$delegate", "Lgg/essential/elementa/state/MappedState;", "Ljava/awt/Color;", "contentTextColor", "getContentTextColor", "()Ljava/awt/Color;", "setContentTextColor", "(Ljava/awt/Color;)V", "contentTextColor$delegate", "contentTextColorState", "Lgg/essential/elementa/state/MappedState;", "contentTextState", "customContent", "getCustomContent", "customContent$delegate", "dismissActions", "", "Lkotlin/Function1;", "", "keyListener", "Lkotlin/Function3;", "Lgg/essential/elementa/UIComponent;", "", "", "Lkotlin/ExtensionFunctionType;", "modalWidth", "getModalWidth", "()F", "setModalWidth", "(F)V", "modalWidth$delegate", "Lgg/essential/elementa/state/BasicState;", "primaryActionButton", "Lgg/essential/gui/common/MenuButton;", "getPrimaryActionButton", "()Lgg/essential/gui/common/MenuButton;", "primaryActionButton$delegate", "primaryButtonAction", "Lkotlin/Function0;", "getPrimaryButtonAction", "()Lkotlin/jvm/functions/Function0;", "setPrimaryButtonAction", "(Lkotlin/jvm/functions/Function0;)V", "Lgg/essential/gui/common/MenuButton$Style;", "primaryButtonHoverStyle", "getPrimaryButtonHoverStyle", "()Lgg/essential/gui/common/MenuButton$Style;", "setPrimaryButtonHoverStyle", "(Lgg/essential/gui/common/MenuButton$Style;)V", "primaryButtonHoverStyle$delegate", "primaryButtonHoverStyleState", "Lgg/essential/elementa/state/BasicState;", "primaryButtonStyle", "getPrimaryButtonStyle", "setPrimaryButtonStyle", "primaryButtonStyle$delegate", "primaryButtonStyleState", "primaryButtonText", "getPrimaryButtonText", "setPrimaryButtonText", "primaryButtonText$delegate", "primaryButtonTextState", "getRequiresButtonPress", "()Z", "setRequiresButtonPress", "(Z)V", "value", "selectedButton", "setSelectedButton", "(Lgg/essential/gui/common/MenuButton;)V", "textContainer", "getTextContainer", "textContainer$delegate", "textContent", "Lgg/essential/elementa/components/UIWrappedText;", "getTextContent", "()Lgg/essential/elementa/components/UIWrappedText;", "textContent$delegate", "title", "getTitle", "title$delegate", "titleContainer", "getTitleContainer", "titleContainer$delegate", "titleText", "getTitleText", "setTitleText", "titleText$delegate", "titleTextColor", "getTitleTextColor", "setTitleTextColor", "titleTextColor$delegate", "titleTextColorState", "titleTextState", "widthState", "bindConfirmAvailable", "enabled", "Lgg/essential/elementa/state/State;", "bindPrimaryButtonText", "text", "configureLayout", "configure", "fadeIn", "callback", "fadeOut", "hides", "onPrimaryOrDismissAction", "setContentColor", "color", "setTextContent", "setTitle", "setTitleColor", "tryDismiss", "buttonPressed", "essential" })
public class EssentialModal extends Modal
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private boolean requiresButtonPress;
    @NotNull
    private final MappedState<String, String> titleTextState;
    @NotNull
    private final MappedState<String, String> contentTextState;
    @NotNull
    private final MappedState<String, String> primaryButtonTextState;
    @NotNull
    private final BasicState<MenuButton.Style> primaryButtonStyleState;
    @NotNull
    private final BasicState<MenuButton.Style> primaryButtonHoverStyleState;
    @NotNull
    private final MappedState<Color, Color> contentTextColorState;
    @NotNull
    private final MappedState<Color, Color> titleTextColorState;
    @NotNull
    private final BasicState<Float> widthState;
    @NotNull
    private final List<Function1<Boolean, Unit>> dismissActions;
    @NotNull
    private final MappedState titleText$delegate;
    @NotNull
    private final MappedState contentText$delegate;
    @NotNull
    private final MappedState primaryButtonText$delegate;
    @NotNull
    private final BasicState primaryButtonStyle$delegate;
    @NotNull
    private final BasicState primaryButtonHoverStyle$delegate;
    @NotNull
    private final MappedState contentTextColor$delegate;
    @NotNull
    private final MappedState titleTextColor$delegate;
    @NotNull
    private final BasicState modalWidth$delegate;
    @Nullable
    private MenuButton selectedButton;
    @NotNull
    private final Function3<UIComponent, Character, Integer, Unit> keyListener;
    @Nullable
    private Function0<Unit> primaryButtonAction;
    @NotNull
    private final ReadWriteProperty content$delegate;
    @NotNull
    private final ReadWriteProperty titleContainer$delegate;
    @NotNull
    private final ReadWriteProperty textContainer$delegate;
    @NotNull
    private final ReadWriteProperty customContent$delegate;
    @NotNull
    private final ReadWriteProperty buttonContainer$delegate;
    @NotNull
    private final ReadWriteProperty primaryActionButton$delegate;
    
    public EssentialModal(final boolean requiresButtonPress, final float fadeTime) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: new             Lgg/essential/gui/common/HighlightedBlock;
        //     4: dup            
        //     5: getstatic       gg/essential/gui/EssentialPalette.MODAL_BACKGROUND:Ljava/awt/Color;
        //     8: getstatic       gg/essential/gui/EssentialPalette.BUTTON_HIGHLIGHT:Ljava/awt/Color;
        //    11: aconst_null    
        //    12: getstatic       gg/essential/gui/EssentialPalette.BUTTON_HIGHLIGHT:Ljava/awt/Color;
        //    15: fconst_0       
        //    16: aconst_null    
        //    17: bipush          116
        //    19: invokespecial   gg/essential/gui/common/HighlightedBlock.<init>:(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;FLgg/essential/gui/common/HighlightedBlock$ClickBehavior;I)V
        //    22: iconst_0       
        //    23: fload_2         /* fadeTime */
        //    24: iconst_2       
        //    25: invokespecial   gg/essential/gui/common/modal/Modal.<init>:(Lgg/essential/gui/common/HighlightedBlock;IFI)V
        //    28: aload_0         /* this */
        //    29: iload_1         /* requiresButtonPress */
        //    30: putfield        gg/essential/gui/common/modal/EssentialModal.requiresButtonPress:Z
        //    33: aload_0         /* this */
        //    34: new             Lgg/essential/elementa/state/BasicState;
        //    37: dup            
        //    38: ldc             ""
        //    40: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    43: getstatic       gg/essential/gui/common/modal/EssentialModal$titleTextState$1.INSTANCE:Lgg/essential/gui/common/modal/EssentialModal$titleTextState$1;
        //    46: checkcast       Lkotlin/jvm/functions/Function1;
        //    49: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    52: putfield        gg/essential/gui/common/modal/EssentialModal.titleTextState:Lgg/essential/elementa/state/MappedState;
        //    55: aload_0         /* this */
        //    56: new             Lgg/essential/elementa/state/BasicState;
        //    59: dup            
        //    60: ldc             ""
        //    62: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    65: getstatic       gg/essential/gui/common/modal/EssentialModal$contentTextState$1.INSTANCE:Lgg/essential/gui/common/modal/EssentialModal$contentTextState$1;
        //    68: checkcast       Lkotlin/jvm/functions/Function1;
        //    71: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    74: putfield        gg/essential/gui/common/modal/EssentialModal.contentTextState:Lgg/essential/elementa/state/MappedState;
        //    77: aload_0         /* this */
        //    78: new             Lgg/essential/elementa/state/BasicState;
        //    81: dup            
        //    82: ldc             "Continue"
        //    84: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    87: getstatic       gg/essential/gui/common/modal/EssentialModal$primaryButtonTextState$1.INSTANCE:Lgg/essential/gui/common/modal/EssentialModal$primaryButtonTextState$1;
        //    90: checkcast       Lkotlin/jvm/functions/Function1;
        //    93: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    96: putfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonTextState:Lgg/essential/elementa/state/MappedState;
        //    99: aload_0         /* this */
        //   100: new             Lgg/essential/elementa/state/BasicState;
        //   103: dup            
        //   104: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //   107: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getDARK_GRAY:()Lgg/essential/gui/common/MenuButton$Style;
        //   110: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   113: putfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonStyleState:Lgg/essential/elementa/state/BasicState;
        //   116: aload_0         /* this */
        //   117: new             Lgg/essential/elementa/state/BasicState;
        //   120: dup            
        //   121: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //   124: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getGRAY:()Lgg/essential/gui/common/MenuButton$Style;
        //   127: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   130: putfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonHoverStyleState:Lgg/essential/elementa/state/BasicState;
        //   133: aload_0         /* this */
        //   134: new             Lgg/essential/elementa/state/BasicState;
        //   137: dup            
        //   138: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //   141: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   144: getstatic       gg/essential/gui/common/modal/EssentialModal$contentTextColorState$1.INSTANCE:Lgg/essential/gui/common/modal/EssentialModal$contentTextColorState$1;
        //   147: checkcast       Lkotlin/jvm/functions/Function1;
        //   150: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   153: putfield        gg/essential/gui/common/modal/EssentialModal.contentTextColorState:Lgg/essential/elementa/state/MappedState;
        //   156: aload_0         /* this */
        //   157: new             Lgg/essential/elementa/state/BasicState;
        //   160: dup            
        //   161: getstatic       gg/essential/gui/EssentialPalette.ACCENT_BLUE:Ljava/awt/Color;
        //   164: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   167: getstatic       gg/essential/gui/common/modal/EssentialModal$titleTextColorState$1.INSTANCE:Lgg/essential/gui/common/modal/EssentialModal$titleTextColorState$1;
        //   170: checkcast       Lkotlin/jvm/functions/Function1;
        //   173: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   176: putfield        gg/essential/gui/common/modal/EssentialModal.titleTextColorState:Lgg/essential/elementa/state/MappedState;
        //   179: aload_0         /* this */
        //   180: new             Lgg/essential/elementa/state/BasicState;
        //   183: dup            
        //   184: ldc_w           190.0
        //   187: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   190: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   193: putfield        gg/essential/gui/common/modal/EssentialModal.widthState:Lgg/essential/elementa/state/BasicState;
        //   196: aload_0         /* this */
        //   197: new             Ljava/util/ArrayList;
        //   200: dup            
        //   201: invokespecial   java/util/ArrayList.<init>:()V
        //   204: checkcast       Ljava/util/List;
        //   207: putfield        gg/essential/gui/common/modal/EssentialModal.dismissActions:Ljava/util/List;
        //   210: aload_0         /* this */
        //   211: aload_0         /* this */
        //   212: getfield        gg/essential/gui/common/modal/EssentialModal.titleTextState:Lgg/essential/elementa/state/MappedState;
        //   215: putfield        gg/essential/gui/common/modal/EssentialModal.titleText$delegate:Lgg/essential/elementa/state/MappedState;
        //   218: aload_0         /* this */
        //   219: aload_0         /* this */
        //   220: getfield        gg/essential/gui/common/modal/EssentialModal.contentTextState:Lgg/essential/elementa/state/MappedState;
        //   223: putfield        gg/essential/gui/common/modal/EssentialModal.contentText$delegate:Lgg/essential/elementa/state/MappedState;
        //   226: aload_0         /* this */
        //   227: aload_0         /* this */
        //   228: getfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonTextState:Lgg/essential/elementa/state/MappedState;
        //   231: putfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonText$delegate:Lgg/essential/elementa/state/MappedState;
        //   234: aload_0         /* this */
        //   235: aload_0         /* this */
        //   236: getfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonStyleState:Lgg/essential/elementa/state/BasicState;
        //   239: putfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonStyle$delegate:Lgg/essential/elementa/state/BasicState;
        //   242: aload_0         /* this */
        //   243: aload_0         /* this */
        //   244: getfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonHoverStyleState:Lgg/essential/elementa/state/BasicState;
        //   247: putfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonHoverStyle$delegate:Lgg/essential/elementa/state/BasicState;
        //   250: aload_0         /* this */
        //   251: aload_0         /* this */
        //   252: getfield        gg/essential/gui/common/modal/EssentialModal.contentTextColorState:Lgg/essential/elementa/state/MappedState;
        //   255: putfield        gg/essential/gui/common/modal/EssentialModal.contentTextColor$delegate:Lgg/essential/elementa/state/MappedState;
        //   258: aload_0         /* this */
        //   259: aload_0         /* this */
        //   260: getfield        gg/essential/gui/common/modal/EssentialModal.titleTextColorState:Lgg/essential/elementa/state/MappedState;
        //   263: putfield        gg/essential/gui/common/modal/EssentialModal.titleTextColor$delegate:Lgg/essential/elementa/state/MappedState;
        //   266: aload_0         /* this */
        //   267: aload_0         /* this */
        //   268: getfield        gg/essential/gui/common/modal/EssentialModal.widthState:Lgg/essential/elementa/state/BasicState;
        //   271: putfield        gg/essential/gui/common/modal/EssentialModal.modalWidth$delegate:Lgg/essential/elementa/state/BasicState;
        //   274: aload_0         /* this */
        //   275: new             Lgg/essential/gui/common/modal/EssentialModal$keyListener$1;
        //   278: dup            
        //   279: aload_0         /* this */
        //   280: invokespecial   gg/essential/gui/common/modal/EssentialModal$keyListener$1.<init>:(Lgg/essential/gui/common/modal/EssentialModal;)V
        //   283: checkcast       Lkotlin/jvm/functions/Function3;
        //   286: putfield        gg/essential/gui/common/modal/EssentialModal.keyListener:Lkotlin/jvm/functions/Function3;
        //   289: aload_0         /* this */
        //   290: new             Lgg/essential/gui/common/modal/EssentialModal$primaryButtonAction$1;
        //   293: dup            
        //   294: aload_0         /* this */
        //   295: invokespecial   gg/essential/gui/common/modal/EssentialModal$primaryButtonAction$1.<init>:(Lgg/essential/gui/common/modal/EssentialModal;)V
        //   298: checkcast       Lkotlin/jvm/functions/Function0;
        //   301: putfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonAction:Lkotlin/jvm/functions/Function0;
        //   304: aload_0         /* this */
        //   305: new             Lgg/essential/elementa/components/UIContainer;
        //   308: dup            
        //   309: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   312: checkcast       Lgg/essential/elementa/UIComponent;
        //   315: astore_3        /* $this$constrain$iv */
        //   316: aload_3         /* $this$constrain$iv */
        //   317: astore          4
        //   319: aload           4
        //   321: astore          $this$constrain_u24lambda_u2d0$iv
        //   323: aload           $this$constrain_u24lambda_u2d0$iv
        //   325: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   328: astore          6
        //   330: astore          7
        //   332: aload           $this$content_delegate_u24lambda_u2d0
        //   334: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   337: dup            
        //   338: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   341: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   344: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   347: aload           $this$content_delegate_u24lambda_u2d0
        //   349: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   352: dup            
        //   353: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   356: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   359: iconst_1       
        //   360: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   363: checkcast       Ljava/lang/Number;
        //   366: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   369: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   372: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   375: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   378: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   381: aload           $this$content_delegate_u24lambda_u2d0
        //   383: new             Lgg/essential/elementa/constraints/PixelConstraint;
        //   386: dup            
        //   387: fconst_1       
        //   388: iconst_0       
        //   389: iconst_0       
        //   390: bipush          6
        //   392: aconst_null    
        //   393: invokespecial   gg/essential/elementa/constraints/PixelConstraint.<init>:(FZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   396: aload_0         /* this */
        //   397: getfield        gg/essential/gui/common/modal/EssentialModal.widthState:Lgg/essential/elementa/state/BasicState;
        //   400: checkcast       Lgg/essential/elementa/state/State;
        //   403: invokevirtual   gg/essential/elementa/constraints/PixelConstraint.bindValue:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   406: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   409: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   412: aload           $this$content_delegate_u24lambda_u2d0
        //   414: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   417: dup            
        //   418: fconst_0       
        //   419: iconst_1       
        //   420: aconst_null    
        //   421: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   424: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   427: iconst_1       
        //   428: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   431: checkcast       Ljava/lang/Number;
        //   434: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   437: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   440: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   443: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   446: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   449: aload           7
        //   451: aload           4
        //   453: aload_0         /* this */
        //   454: invokevirtual   gg/essential/gui/common/modal/EssentialModal.getContainer:()Lgg/essential/gui/common/HighlightedBlock;
        //   457: checkcast       Lgg/essential/elementa/UIComponent;
        //   460: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   463: aload_0         /* this */
        //   464: getstatic       gg/essential/gui/common/modal/EssentialModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   467: bipush          8
        //   469: aaload         
        //   470: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   473: putfield        gg/essential/gui/common/modal/EssentialModal.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //   476: aload_0         /* this */
        //   477: new             Lgg/essential/elementa/components/UIContainer;
        //   480: dup            
        //   481: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   484: checkcast       Lgg/essential/elementa/UIComponent;
        //   487: aload_0         /* this */
        //   488: getfield        gg/essential/gui/common/modal/EssentialModal.titleTextState:Lgg/essential/elementa/state/MappedState;
        //   491: getstatic       gg/essential/gui/common/modal/EssentialModal$titleContainer$2.INSTANCE:Lgg/essential/gui/common/modal/EssentialModal$titleContainer$2;
        //   494: checkcast       Lkotlin/jvm/functions/Function1;
        //   497: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   500: checkcast       Lgg/essential/elementa/state/State;
        //   503: getstatic       gg/essential/gui/common/modal/EssentialModal$titleContainer$3.INSTANCE:Lgg/essential/gui/common/modal/EssentialModal$titleContainer$3;
        //   506: checkcast       Lkotlin/jvm/functions/Function2;
        //   509: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   512: aload_0         /* this */
        //   513: invokevirtual   gg/essential/gui/common/modal/EssentialModal.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   516: checkcast       Lgg/essential/elementa/UIComponent;
        //   519: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   522: aload_0         /* this */
        //   523: getstatic       gg/essential/gui/common/modal/EssentialModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   526: bipush          9
        //   528: aaload         
        //   529: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   532: putfield        gg/essential/gui/common/modal/EssentialModal.titleContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   535: getstatic       gg/essential/gui/EssentialPalette.BLACK:Ljava/awt/Color;
        //   538: astore_3       
        //   539: new             Lgg/essential/gui/common/shadow/EssentialUIWrappedText;
        //   542: dup            
        //   543: aconst_null    
        //   544: iconst_0       
        //   545: aload_3        
        //   546: iconst_1       
        //   547: aconst_null    
        //   548: fconst_0       
        //   549: bipush          115
        //   551: invokespecial   gg/essential/gui/common/shadow/EssentialUIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZLjava/lang/String;FI)V
        //   554: aload_0         /* this */
        //   555: getfield        gg/essential/gui/common/modal/EssentialModal.titleTextState:Lgg/essential/elementa/state/MappedState;
        //   558: checkcast       Lgg/essential/elementa/state/State;
        //   561: invokevirtual   gg/essential/gui/common/shadow/EssentialUIWrappedText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIWrappedText;
        //   564: checkcast       Lgg/essential/elementa/UIComponent;
        //   567: astore_3        /* $this$constrain$iv */
        //   568: aload_3         /* $this$constrain$iv */
        //   569: astore          4
        //   571: aload           4
        //   573: astore          $this$constrain_u24lambda_u2d0$iv
        //   575: aload           $this$constrain_u24lambda_u2d0$iv
        //   577: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   580: astore          $this$title_delegate_u24lambda_u2d1
        //   582: aload           $this$title_delegate_u24lambda_u2d1
        //   584: bipush          100
        //   586: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   589: checkcast       Ljava/lang/Number;
        //   592: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   595: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   598: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   601: aload           $this$title_delegate_u24lambda_u2d1
        //   603: aload_0         /* this */
        //   604: getfield        gg/essential/gui/common/modal/EssentialModal.titleTextColorState:Lgg/essential/elementa/state/MappedState;
        //   607: checkcast       Lgg/essential/elementa/state/State;
        //   610: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   613: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   616: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   619: aload           4
        //   621: aload_0         /* this */
        //   622: invokespecial   gg/essential/gui/common/modal/EssentialModal.getTitleContainer:()Lgg/essential/elementa/components/UIContainer;
        //   625: checkcast       Lgg/essential/elementa/UIComponent;
        //   628: aload_0         /* this */
        //   629: getfield        gg/essential/gui/common/modal/EssentialModal.titleTextState:Lgg/essential/elementa/state/MappedState;
        //   632: getstatic       gg/essential/gui/common/modal/EssentialModal$title$3.INSTANCE:Lgg/essential/gui/common/modal/EssentialModal$title$3;
        //   635: checkcast       Lkotlin/jvm/functions/Function1;
        //   638: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   641: checkcast       Lgg/essential/elementa/state/State;
        //   644: iconst_0       
        //   645: aconst_null    
        //   646: bipush          12
        //   648: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   651: aload_0         /* this */
        //   652: getstatic       gg/essential/gui/common/modal/EssentialModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   655: bipush          10
        //   657: aaload         
        //   658: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   661: pop            
        //   662: aload_0         /* this */
        //   663: new             Lgg/essential/elementa/components/UIContainer;
        //   666: dup            
        //   667: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   670: checkcast       Lgg/essential/elementa/UIComponent;
        //   673: aload_0         /* this */
        //   674: getfield        gg/essential/gui/common/modal/EssentialModal.titleTextState:Lgg/essential/elementa/state/MappedState;
        //   677: aload_0         /* this */
        //   678: getfield        gg/essential/gui/common/modal/EssentialModal.contentTextState:Lgg/essential/elementa/state/MappedState;
        //   681: checkcast       Lgg/essential/elementa/state/State;
        //   684: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   687: getstatic       gg/essential/gui/common/modal/EssentialModal$textContainer$2.INSTANCE:Lgg/essential/gui/common/modal/EssentialModal$textContainer$2;
        //   690: checkcast       Lkotlin/jvm/functions/Function1;
        //   693: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   696: checkcast       Lgg/essential/elementa/state/State;
        //   699: getstatic       gg/essential/gui/common/modal/EssentialModal$textContainer$3.INSTANCE:Lgg/essential/gui/common/modal/EssentialModal$textContainer$3;
        //   702: checkcast       Lkotlin/jvm/functions/Function2;
        //   705: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   708: aload_0         /* this */
        //   709: invokevirtual   gg/essential/gui/common/modal/EssentialModal.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   712: checkcast       Lgg/essential/elementa/UIComponent;
        //   715: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   718: aload_0         /* this */
        //   719: getstatic       gg/essential/gui/common/modal/EssentialModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   722: bipush          11
        //   724: aaload         
        //   725: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   728: putfield        gg/essential/gui/common/modal/EssentialModal.textContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   731: getstatic       gg/essential/gui/EssentialPalette.BLACK:Ljava/awt/Color;
        //   734: astore_3       
        //   735: new             Lgg/essential/gui/common/shadow/EssentialUIWrappedText;
        //   738: dup            
        //   739: aconst_null    
        //   740: iconst_0       
        //   741: aload_3        
        //   742: iconst_1       
        //   743: aconst_null    
        //   744: fconst_0       
        //   745: bipush          115
        //   747: invokespecial   gg/essential/gui/common/shadow/EssentialUIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZLjava/lang/String;FI)V
        //   750: aload_0         /* this */
        //   751: getfield        gg/essential/gui/common/modal/EssentialModal.contentTextState:Lgg/essential/elementa/state/MappedState;
        //   754: checkcast       Lgg/essential/elementa/state/State;
        //   757: invokevirtual   gg/essential/gui/common/shadow/EssentialUIWrappedText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIWrappedText;
        //   760: checkcast       Lgg/essential/elementa/UIComponent;
        //   763: astore_3        /* $this$constrain$iv */
        //   764: aload_3         /* $this$constrain$iv */
        //   765: astore          4
        //   767: aload           4
        //   769: astore          $this$constrain_u24lambda_u2d0$iv
        //   771: aload           $this$constrain_u24lambda_u2d0$iv
        //   773: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   776: astore          $this$textContent_delegate_u24lambda_u2d2
        //   778: aload           $this$textContent_delegate_u24lambda_u2d2
        //   780: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   783: dup            
        //   784: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   787: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   790: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   793: aload           $this$textContent_delegate_u24lambda_u2d2
        //   795: bipush          100
        //   797: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   800: checkcast       Ljava/lang/Number;
        //   803: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   806: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   809: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   812: aload           $this$textContent_delegate_u24lambda_u2d2
        //   814: aload_0         /* this */
        //   815: getfield        gg/essential/gui/common/modal/EssentialModal.contentTextColorState:Lgg/essential/elementa/state/MappedState;
        //   818: checkcast       Lgg/essential/elementa/state/State;
        //   821: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   824: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   827: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   830: aload           4
        //   832: aload_0         /* this */
        //   833: invokespecial   gg/essential/gui/common/modal/EssentialModal.getTextContainer:()Lgg/essential/elementa/components/UIContainer;
        //   836: checkcast       Lgg/essential/elementa/UIComponent;
        //   839: aload_0         /* this */
        //   840: getfield        gg/essential/gui/common/modal/EssentialModal.contentTextState:Lgg/essential/elementa/state/MappedState;
        //   843: getstatic       gg/essential/gui/common/modal/EssentialModal$textContent$3.INSTANCE:Lgg/essential/gui/common/modal/EssentialModal$textContent$3;
        //   846: checkcast       Lkotlin/jvm/functions/Function1;
        //   849: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   852: checkcast       Lgg/essential/elementa/state/State;
        //   855: iconst_0       
        //   856: aconst_null    
        //   857: bipush          12
        //   859: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   862: aload_0         /* this */
        //   863: getstatic       gg/essential/gui/common/modal/EssentialModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   866: bipush          12
        //   868: aaload         
        //   869: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   872: pop            
        //   873: aload_0         /* this */
        //   874: new             Lgg/essential/elementa/components/UIContainer;
        //   877: dup            
        //   878: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   881: checkcast       Lgg/essential/elementa/UIComponent;
        //   884: astore_3        /* $this$constrain$iv */
        //   885: aload_3         /* $this$constrain$iv */
        //   886: astore          4
        //   888: aload           4
        //   890: astore          $this$constrain_u24lambda_u2d0$iv
        //   892: aload           $this$constrain_u24lambda_u2d0$iv
        //   894: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   897: astore          6
        //   899: astore          7
        //   901: aload           $this$customContent_delegate_u24lambda_u2d3
        //   903: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   906: dup            
        //   907: ldc_w           4.0
        //   910: iconst_0       
        //   911: iconst_2       
        //   912: aconst_null    
        //   913: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   916: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   919: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   922: aload           $this$customContent_delegate_u24lambda_u2d3
        //   924: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   927: dup            
        //   928: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   931: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   934: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   937: aload           $this$customContent_delegate_u24lambda_u2d3
        //   939: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   942: dup            
        //   943: fconst_0       
        //   944: iconst_1       
        //   945: aconst_null    
        //   946: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   949: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   952: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   955: aload           $this$customContent_delegate_u24lambda_u2d3
        //   957: bipush          100
        //   959: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   962: checkcast       Ljava/lang/Number;
        //   965: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   968: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   971: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   974: aload           7
        //   976: aload           4
        //   978: aload_0         /* this */
        //   979: invokevirtual   gg/essential/gui/common/modal/EssentialModal.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   982: checkcast       Lgg/essential/elementa/UIComponent;
        //   985: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   988: aload_0         /* this */
        //   989: getstatic       gg/essential/gui/common/modal/EssentialModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   992: bipush          13
        //   994: aaload         
        //   995: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   998: putfield        gg/essential/gui/common/modal/EssentialModal.customContent$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1001: aload_0         /* this */
        //  1002: new             Lgg/essential/elementa/components/UIContainer;
        //  1005: dup            
        //  1006: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1009: checkcast       Lgg/essential/elementa/UIComponent;
        //  1012: astore_3        /* $this$constrain$iv */
        //  1013: aload_3         /* $this$constrain$iv */
        //  1014: astore          4
        //  1016: aload           4
        //  1018: astore          $this$constrain_u24lambda_u2d0$iv
        //  1020: aload           $this$constrain_u24lambda_u2d0$iv
        //  1022: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1025: astore          6
        //  1027: astore          7
        //  1029: aload           $this$buttonContainer_delegate_u24lambda_u2d4
        //  1031: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1034: dup            
        //  1035: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1038: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1041: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1044: aload           $this$buttonContainer_delegate_u24lambda_u2d4
        //  1046: iconst_0       
        //  1047: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1050: checkcast       Ljava/lang/Number;
        //  1053: iconst_1       
        //  1054: iconst_0       
        //  1055: iconst_2       
        //  1056: aconst_null    
        //  1057: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1060: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1063: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1066: aload           $this$buttonContainer_delegate_u24lambda_u2d4
        //  1068: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1071: dup            
        //  1072: fconst_0       
        //  1073: iconst_1       
        //  1074: aconst_null    
        //  1075: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1078: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1081: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1084: aload           $this$buttonContainer_delegate_u24lambda_u2d4
        //  1086: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //  1089: dup            
        //  1090: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //  1093: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1096: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1099: aload           7
        //  1101: aload           4
        //  1103: aload_0         /* this */
        //  1104: invokevirtual   gg/essential/gui/common/modal/EssentialModal.getContent:()Lgg/essential/elementa/components/UIContainer;
        //  1107: checkcast       Lgg/essential/elementa/UIComponent;
        //  1110: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1113: aload_0         /* this */
        //  1114: getstatic       gg/essential/gui/common/modal/EssentialModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1117: bipush          14
        //  1119: aaload         
        //  1120: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1123: putfield        gg/essential/gui/common/modal/EssentialModal.buttonContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1126: aload_0         /* this */
        //  1127: new             Lgg/essential/gui/common/MenuButton;
        //  1130: dup            
        //  1131: aload_0         /* this */
        //  1132: getfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonTextState:Lgg/essential/elementa/state/MappedState;
        //  1135: checkcast       Lgg/essential/elementa/state/State;
        //  1138: aload_0         /* this */
        //  1139: getfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonStyleState:Lgg/essential/elementa/state/BasicState;
        //  1142: checkcast       Lgg/essential/elementa/state/State;
        //  1145: aload_0         /* this */
        //  1146: getfield        gg/essential/gui/common/modal/EssentialModal.primaryButtonHoverStyleState:Lgg/essential/elementa/state/BasicState;
        //  1149: checkcast       Lgg/essential/elementa/state/State;
        //  1152: aconst_null    
        //  1153: aconst_null    
        //  1154: fconst_0       
        //  1155: aconst_null    
        //  1156: iconst_0       
        //  1157: iconst_0       
        //  1158: new             Lgg/essential/gui/common/modal/EssentialModal$primaryActionButton$2;
        //  1161: dup            
        //  1162: aload_0         /* this */
        //  1163: invokespecial   gg/essential/gui/common/modal/EssentialModal$primaryActionButton$2.<init>:(Lgg/essential/gui/common/modal/EssentialModal;)V
        //  1166: checkcast       Lkotlin/jvm/functions/Function0;
        //  1169: sipush          504
        //  1172: invokespecial   gg/essential/gui/common/MenuButton.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/MenuButton$Alignment;FLgg/essential/elementa/state/State;ZZLkotlin/jvm/functions/Function0;I)V
        //  1175: checkcast       Lgg/essential/elementa/UIComponent;
        //  1178: astore_3        /* $this$constrain$iv */
        //  1179: aload_3         /* $this$constrain$iv */
        //  1180: astore          4
        //  1182: aload           4
        //  1184: astore          $this$constrain_u24lambda_u2d0$iv
        //  1186: aload           $this$constrain_u24lambda_u2d0$iv
        //  1188: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1191: astore          6
        //  1193: astore          7
        //  1195: aload           $this$primaryActionButton_delegate_u24lambda_u2d5
        //  1197: bipush          91
        //  1199: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1202: checkcast       Ljava/lang/Number;
        //  1205: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1208: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1211: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1214: aload           $this$primaryActionButton_delegate_u24lambda_u2d5
        //  1216: bipush          20
        //  1218: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1221: checkcast       Ljava/lang/Number;
        //  1224: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1227: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1230: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1233: aload           7
        //  1235: aload           4
        //  1237: aload_0         /* this */
        //  1238: invokevirtual   gg/essential/gui/common/modal/EssentialModal.getButtonContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1241: checkcast       Lgg/essential/elementa/UIComponent;
        //  1244: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1247: aload_0         /* this */
        //  1248: getstatic       gg/essential/gui/common/modal/EssentialModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1251: bipush          15
        //  1253: aaload         
        //  1254: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1257: putfield        gg/essential/gui/common/modal/EssentialModal.primaryActionButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1260: aload_0         /* this */
        //  1261: invokevirtual   gg/essential/gui/common/modal/EssentialModal.getContainer:()Lgg/essential/gui/common/HighlightedBlock;
        //  1264: invokevirtual   gg/essential/gui/common/HighlightedBlock.getContentContainer:()Lgg/essential/elementa/UIComponent;
        //  1267: astore_3        /* $this$constrain$iv */
        //  1268: aload_3         /* $this$constrain$iv */
        //  1269: astore          4
        //  1271: aload           4
        //  1273: astore          $this$constrain_u24lambda_u2d0$iv
        //  1275: aload           $this$constrain_u24lambda_u2d0$iv
        //  1277: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1280: astore          $this$_init__u24lambda_u2d6
        //  1282: aload           $this$_init__u24lambda_u2d6
        //  1284: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1287: dup            
        //  1288: fconst_0       
        //  1289: iconst_1       
        //  1290: aconst_null    
        //  1291: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1294: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1297: bipush          32
        //  1299: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1302: checkcast       Ljava/lang/Number;
        //  1305: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1308: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1311: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1314: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1317: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1320: aload           $this$_init__u24lambda_u2d6
        //  1322: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1325: dup            
        //  1326: fconst_0       
        //  1327: iconst_1       
        //  1328: aconst_null    
        //  1329: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1332: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1335: bipush          34
        //  1337: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1340: checkcast       Ljava/lang/Number;
        //  1343: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1346: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1349: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1352: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1355: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1358: aload_0         /* this */
        //  1359: new             Lgg/essential/gui/common/modal/EssentialModal$2;
        //  1362: dup            
        //  1363: aload_0         /* this */
        //  1364: invokespecial   gg/essential/gui/common/modal/EssentialModal$2.<init>:(Lgg/essential/gui/common/modal/EssentialModal;)V
        //  1367: checkcast       Lkotlin/jvm/functions/Function2;
        //  1370: invokevirtual   gg/essential/gui/common/modal/EssentialModal.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1373: pop            
        //  1374: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //  1377: dup            
        //  1378: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //  1381: astore_3        /* screen */
        //  1382: aload_3         /* screen */
        //  1383: getstatic       gg/essential/universal/UScreen.Companion:Lgg/essential/universal/UScreen$Companion;
        //  1386: invokevirtual   gg/essential/universal/UScreen$Companion.getCurrentScreen:()Lnet/minecraft/client/gui/screen/Screen;
        //  1389: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //  1392: aload_0         /* this */
        //  1393: checkcast       Lgg/essential/elementa/UIComponent;
        //  1396: new             Lgg/essential/gui/common/modal/EssentialModal$3;
        //  1399: dup            
        //  1400: aload_3         /* screen */
        //  1401: aload_0         /* this */
        //  1402: invokespecial   gg/essential/gui/common/modal/EssentialModal$3.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Lgg/essential/gui/common/modal/EssentialModal;)V
        //  1405: checkcast       Lkotlin/jvm/functions/Function0;
        //  1408: invokestatic    gg/essential/util/ExtensionsKt.onAnimationFrame:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/UIComponent;
        //  1411: pop            
        //  1412: return         
        //    MethodParameters:
        //  Name                 Flags  
        //  -------------------  -----
        //  requiresButtonPress  
        //  fadeTime             
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public EssentialModal(float fadeTime, final int n) {
        if ((n & 0x2) != 0x0) {
            fadeTime = 0.5f;
        }
        this(false, fadeTime);
    }
    
    public final void setRequiresButtonPress$1385ff() {
        this.requiresButtonPress = true;
    }
    
    public final void setTitleText(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        StateExtensionsKt.setValue(this.titleText$delegate, this, EssentialModal.$$delegatedProperties[0], <set-?>);
    }
    
    public final void setContentText(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        StateExtensionsKt.setValue(this.contentText$delegate, this, EssentialModal.$$delegatedProperties[1], <set-?>);
    }
    
    public final void setPrimaryButtonText(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        StateExtensionsKt.setValue(this.primaryButtonText$delegate, this, EssentialModal.$$delegatedProperties[2], <set-?>);
    }
    
    public final void setPrimaryButtonStyle(@NotNull final MenuButton.Style <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        StateExtensionsKt.setValue(this.primaryButtonStyle$delegate, this, EssentialModal.$$delegatedProperties[3], <set-?>);
    }
    
    public final void setPrimaryButtonHoverStyle(@NotNull final MenuButton.Style <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        StateExtensionsKt.setValue(this.primaryButtonHoverStyle$delegate, this, EssentialModal.$$delegatedProperties[4], <set-?>);
    }
    
    public final void setContentTextColor(@NotNull final Color <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        StateExtensionsKt.setValue(this.contentTextColor$delegate, this, EssentialModal.$$delegatedProperties[5], <set-?>);
    }
    
    public final void setTitleTextColor(@NotNull final Color <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        StateExtensionsKt.setValue(this.titleTextColor$delegate, this, EssentialModal.$$delegatedProperties[6], <set-?>);
    }
    
    public final float getModalWidth() {
        return StateExtensionsKt.getValue((State<Number>)this.modalWidth$delegate, this, EssentialModal.$$delegatedProperties[7]).floatValue();
    }
    
    public final void setModalWidth(final float <set-?>) {
        StateExtensionsKt.setValue(this.modalWidth$delegate, this, EssentialModal.$$delegatedProperties[7], <set-?>);
    }
    
    private final void setSelectedButton(final MenuButton value) {
        final MenuButton selectedButton = this.selectedButton;
        if (selectedButton != null) {
            final BasicState<Boolean> hoveredStyleOverrides = selectedButton.getHoveredStyleOverrides();
            if (hoveredStyleOverrides != null) {
                hoveredStyleOverrides.set(false);
            }
        }
        this.selectedButton = value;
        final MenuButton selectedButton2 = this.selectedButton;
        if (selectedButton2 != null) {
            final BasicState<Boolean> hoveredStyleOverrides2 = selectedButton2.getHoveredStyleOverrides();
            if (hoveredStyleOverrides2 != null) {
                hoveredStyleOverrides2.set(true);
            }
        }
    }
    
    @Nullable
    public final Function0<Unit> getPrimaryButtonAction() {
        return this.primaryButtonAction;
    }
    
    public final void setPrimaryButtonAction(@Nullable final Function0<Unit> <set-?>) {
        this.primaryButtonAction = <set-?>;
    }
    
    @NotNull
    public final UIContainer getContent() {
        return (UIContainer)this.content$delegate.getValue((Object)this, (KProperty)EssentialModal.$$delegatedProperties[8]);
    }
    
    private final UIContainer getTitleContainer() {
        return (UIContainer)this.titleContainer$delegate.getValue((Object)this, (KProperty)EssentialModal.$$delegatedProperties[9]);
    }
    
    private final UIContainer getTextContainer() {
        return (UIContainer)this.textContainer$delegate.getValue((Object)this, (KProperty)EssentialModal.$$delegatedProperties[11]);
    }
    
    @NotNull
    protected final UIContainer getCustomContent() {
        return (UIContainer)this.customContent$delegate.getValue((Object)this, (KProperty)EssentialModal.$$delegatedProperties[13]);
    }
    
    @NotNull
    protected final UIContainer getButtonContainer() {
        return (UIContainer)this.buttonContainer$delegate.getValue((Object)this, (KProperty)EssentialModal.$$delegatedProperties[14]);
    }
    
    @NotNull
    public final MenuButton getPrimaryActionButton() {
        return (MenuButton)this.primaryActionButton$delegate.getValue((Object)this, (KProperty)EssentialModal.$$delegatedProperties[15]);
    }
    
    @NotNull
    public final EssentialModal configureLayout(@NotNull final Function1<? super UIContainer, Unit> configure) {
        Intrinsics.checkNotNullParameter((Object)configure, "configure");
        final EssentialModal $this$configureLayout_u24lambda_u2d10 = this;
        configure.invoke((Object)$this$configureLayout_u24lambda_u2d10.getCustomContent());
        return this;
    }
    
    @NotNull
    public EssentialModal onPrimaryOrDismissAction(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        final EssentialModal $this$onPrimaryOrDismissAction_u24lambda_u2d11 = this;
        $this$onPrimaryOrDismissAction_u24lambda_u2d11.dismissActions.add((Function1<Boolean, Unit>)callback);
        return this;
    }
    
    @NotNull
    public final EssentialModal bindConfirmAvailable(@NotNull final State<Boolean> enabled) {
        Intrinsics.checkNotNullParameter((Object)enabled, "enabled");
        final EssentialModal $this$bindConfirmAvailable_u24lambda_u2d12 = this;
        $this$bindConfirmAvailable_u24lambda_u2d12.getPrimaryActionButton().rebindEnabled(enabled);
        return this;
    }
    
    @NotNull
    public final EssentialModal bindPrimaryButtonText(@NotNull final State<String> text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        final EssentialModal $this$bindPrimaryButtonText_u24lambda_u2d13 = this;
        $this$bindPrimaryButtonText_u24lambda_u2d13.primaryButtonTextState.rebind(text);
        return this;
    }
    
    @Override
    public void fadeIn(@Nullable final Function0<Unit> callback) {
        super.fadeIn(callback);
        Window.Companion.of(this).onKeyType(this.keyListener);
    }
    
    private final void tryDismiss(final boolean buttonPressed) {
        if (!buttonPressed && this.requiresButtonPress) {
            return;
        }
        this.hides();
        for (final Function1 dismissAction : this.dismissActions) {
            dismissAction.invoke((Object)buttonPressed);
        }
    }
    
    @Override
    public void fadeOut(@Nullable final Function0<Unit> callback) {
        this.tryDismiss(false);
    }
    
    public final void hides() {
        Window.Companion.of(this).getKeyTypedListeners().remove(this.keyListener);
        super.fadeOut((Function0<Unit>)EssentialModal$hides.EssentialModal$hides$1.INSTANCE);
    }
    
    public EssentialModal() {
        this(0.0f, 3);
    }
    
    public static final /* synthetic */ MenuButton access$getSelectedButton$p(final EssentialModal $this) {
        return $this.selectedButton;
    }
    
    public static final /* synthetic */ void access$setSelectedButton(final EssentialModal $this, final MenuButton value) {
        $this.setSelectedButton(value);
    }
    
    public static final /* synthetic */ void access$tryDismiss(final EssentialModal $this, final boolean buttonPressed) {
        $this.tryDismiss(buttonPressed);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)EssentialModal.class, "titleText", "getTitleText()Ljava/lang/String;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)EssentialModal.class, "contentText", "getContentText()Ljava/lang/String;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)EssentialModal.class, "primaryButtonText", "getPrimaryButtonText()Ljava/lang/String;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)EssentialModal.class, "primaryButtonStyle", "getPrimaryButtonStyle()Lgg/essential/gui/common/MenuButton$Style;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)EssentialModal.class, "primaryButtonHoverStyle", "getPrimaryButtonHoverStyle()Lgg/essential/gui/common/MenuButton$Style;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)EssentialModal.class, "contentTextColor", "getContentTextColor()Ljava/awt/Color;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)EssentialModal.class, "titleTextColor", "getTitleTextColor()Ljava/awt/Color;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)EssentialModal.class, "modalWidth", "getModalWidth()F", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialModal.class, "content", "getContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialModal.class, "titleContainer", "getTitleContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialModal.class, "title", "getTitle()Lgg/essential/elementa/components/UIWrappedText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialModal.class, "textContainer", "getTextContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialModal.class, "textContent", "getTextContent()Lgg/essential/elementa/components/UIWrappedText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialModal.class, "customContent", "getCustomContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialModal.class, "buttonContainer", "getButtonContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialModal.class, "primaryActionButton", "getPrimaryActionButton()Lgg/essential/gui/common/MenuButton;", 0)) };
    }
}
