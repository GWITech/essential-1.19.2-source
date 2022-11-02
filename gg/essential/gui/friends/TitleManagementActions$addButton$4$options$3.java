package gg.essential.gui.friends;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class TitleManagementActions$addButton$4$options$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SocialMenu $gui;
    
    TitleManagementActions$addButton$4$options$3(final SocialMenu $gui) {
        this.$gui = $gui;
        super(0);
    }
    
    public final void invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: new             Lgg/essential/gui/common/modal/UsernameInputModal;
        //     6: dup            
        //     7: ldc             "Block Player"
        //     9: invokespecial   gg/essential/gui/common/modal/UsernameInputModal.<init>:(Ljava/lang/String;)V
        //    12: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //    15: astore_1        /* $this$configure$iv */
        //    16: aload_1         /* $this$configure$iv */
        //    17: astore_2       
        //    18: aload_2        
        //    19: astore_3        /* $this$configure_u24lambda_u2d0$iv */
        //    20: aload_3         /* $this$configure_u24lambda_u2d0$iv */
        //    21: checkcast       Lgg/essential/gui/common/modal/UsernameInputModal;
        //    24: astore          4
        //    26: astore          5
        //    28: aload           $this$invoke_u24lambda_u2d0
        //    30: ldc             "Enter a Minecraft username\nto block them."
        //    32: invokevirtual   gg/essential/gui/common/modal/UsernameInputModal.setTitleText:(Ljava/lang/String;)V
        //    35: aload           $this$invoke_u24lambda_u2d0
        //    37: ldc             "Block"
        //    39: invokevirtual   gg/essential/gui/common/modal/UsernameInputModal.setPrimaryButtonText:(Ljava/lang/String;)V
        //    42: aload           $this$invoke_u24lambda_u2d0
        //    44: invokevirtual   gg/essential/gui/common/modal/UsernameInputModal.getPrimaryActionButton:()Lgg/essential/gui/common/MenuButton;
        //    47: new             Lgg/essential/elementa/state/BasicState;
        //    50: dup            
        //    51: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //    54: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getRED:()Lgg/essential/gui/common/MenuButton$Style;
        //    57: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    60: checkcast       Lgg/essential/elementa/state/State;
        //    63: new             Lgg/essential/elementa/state/BasicState;
        //    66: dup            
        //    67: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //    70: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getLIGHT_RED:()Lgg/essential/gui/common/MenuButton$Style;
        //    73: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    76: checkcast       Lgg/essential/elementa/state/State;
        //    79: invokevirtual   gg/essential/gui/common/MenuButton.rebindStyle:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/MenuButton;
        //    82: pop            
        //    83: aload           $this$invoke_u24lambda_u2d0
        //    85: invokevirtual   gg/essential/gui/common/modal/UsernameInputModal.getPrimaryActionButton:()Lgg/essential/gui/common/MenuButton;
        //    88: new             Lgg/essential/elementa/state/BasicState;
        //    91: dup            
        //    92: getstatic       gg/essential/gui/common/MenuButton.Companion:Lgg/essential/gui/common/MenuButton$Companion;
        //    95: invokevirtual   gg/essential/gui/common/MenuButton$Companion.getRED_DISABLED:()Lgg/essential/gui/common/MenuButton$Style;
        //    98: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   101: checkcast       Lgg/essential/elementa/state/State;
        //   104: invokevirtual   gg/essential/gui/common/MenuButton.rebindDisabledStyle:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/MenuButton;
        //   107: pop            
        //   108: aload           5
        //   110: aload_2        
        //   111: checkcast       Lgg/essential/gui/common/modal/UsernameInputModal;
        //   114: new             Lgg/essential/gui/friends/TitleManagementActions$addButton$4$options$3$2;
        //   117: dup            
        //   118: aload_0         /* this */
        //   119: getfield        gg/essential/gui/friends/TitleManagementActions$addButton$4$options$3.$gui:Lgg/essential/gui/friends/SocialMenu;
        //   122: invokespecial   gg/essential/gui/friends/TitleManagementActions$addButton$4$options$3$2.<init>:(Lgg/essential/gui/friends/SocialMenu;)V
        //   125: checkcast       Lkotlin/jvm/functions/Function1;
        //   128: invokevirtual   gg/essential/gui/common/modal/UsernameInputModal.onPrimaryActionWithValue:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/CancelableInputModal;
        //   131: checkcast       Lgg/essential/gui/common/modal/Modal;
        //   134: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //   137: pop            
        //   138: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}