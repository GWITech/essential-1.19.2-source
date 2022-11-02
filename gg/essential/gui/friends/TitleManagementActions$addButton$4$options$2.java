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
static final class TitleManagementActions$addButton$4$options$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SocialMenu $gui;
    
    TitleManagementActions$addButton$4$options$2(final SocialMenu $gui) {
        this.$gui = $gui;
        super(0);
    }
    
    public final void invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: new             Lgg/essential/gui/common/modal/FriendSelectionModal;
        //     6: dup            
        //     7: invokespecial   gg/essential/gui/common/modal/FriendSelectionModal.<init>:()V
        //    10: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //    13: astore_1        /* $this$configure$iv */
        //    14: aload_1         /* $this$configure$iv */
        //    15: astore_2       
        //    16: aload_2        
        //    17: astore_3        /* $this$configure_u24lambda_u2d0$iv */
        //    18: aload_3         /* $this$configure_u24lambda_u2d0$iv */
        //    19: checkcast       Lgg/essential/gui/common/modal/FriendSelectionModal;
        //    22: astore          4
        //    24: astore          5
        //    26: aload           $this$invoke_u24lambda_u2d0
        //    28: ldc             "Add Friends to Group"
        //    30: invokevirtual   gg/essential/gui/common/modal/FriendSelectionModal.setTitleText:(Ljava/lang/String;)V
        //    33: aload           $this$invoke_u24lambda_u2d0
        //    35: getstatic       gg/essential/gui/EssentialPalette.ACCENT_BLUE:Ljava/awt/Color;
        //    38: invokevirtual   gg/essential/gui/common/modal/FriendSelectionModal.setTitleTextColor:(Ljava/awt/Color;)V
        //    41: aload           5
        //    43: aload_2        
        //    44: checkcast       Lgg/essential/gui/common/modal/FriendSelectionModal;
        //    47: new             Lgg/essential/gui/friends/TitleManagementActions$addButton$4$options$2$2;
        //    50: dup            
        //    51: aload_0         /* this */
        //    52: getfield        gg/essential/gui/friends/TitleManagementActions$addButton$4$options$2.$gui:Lgg/essential/gui/friends/SocialMenu;
        //    55: invokespecial   gg/essential/gui/friends/TitleManagementActions$addButton$4$options$2$2.<init>:(Lgg/essential/gui/friends/SocialMenu;)V
        //    58: checkcast       Lkotlin/jvm/functions/Function1;
        //    61: invokevirtual   gg/essential/gui/common/modal/FriendSelectionModal.onPrimaryActionWithValue:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/UserSelectionModal;
        //    64: checkcast       Lgg/essential/gui/common/modal/Modal;
        //    67: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //    70: pop            
        //    71: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}