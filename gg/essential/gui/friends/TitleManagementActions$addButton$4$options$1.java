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
static final class TitleManagementActions$addButton$4$options$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SocialMenu $gui;
    
    TitleManagementActions$addButton$4$options$1(final SocialMenu $gui) {
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
        //     7: ldc             "Add Friend"
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
        //    30: ldc             "Enter a Minecraft username\nto add them as a friend."
        //    32: invokevirtual   gg/essential/gui/common/modal/UsernameInputModal.setTitleText:(Ljava/lang/String;)V
        //    35: aload           $this$invoke_u24lambda_u2d0
        //    37: ldc             "Add"
        //    39: invokevirtual   gg/essential/gui/common/modal/UsernameInputModal.setPrimaryButtonText:(Ljava/lang/String;)V
        //    42: aload           5
        //    44: aload_2        
        //    45: checkcast       Lgg/essential/gui/common/modal/UsernameInputModal;
        //    48: new             Lgg/essential/gui/friends/TitleManagementActions$addButton$4$options$1$2;
        //    51: dup            
        //    52: aload_0         /* this */
        //    53: getfield        gg/essential/gui/friends/TitleManagementActions$addButton$4$options$1.$gui:Lgg/essential/gui/friends/SocialMenu;
        //    56: invokespecial   gg/essential/gui/friends/TitleManagementActions$addButton$4$options$1$2.<init>:(Lgg/essential/gui/friends/SocialMenu;)V
        //    59: checkcast       Lkotlin/jvm/functions/Function1;
        //    62: invokevirtual   gg/essential/gui/common/modal/UsernameInputModal.onPrimaryActionWithValue:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/CancelableInputModal;
        //    65: checkcast       Lgg/essential/gui/common/modal/Modal;
        //    68: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //    71: pop            
        //    72: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}