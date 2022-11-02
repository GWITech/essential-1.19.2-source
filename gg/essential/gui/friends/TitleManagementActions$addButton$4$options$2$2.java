package gg.essential.gui.friends;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "members", "", "Ljava/util/UUID;", "invoke" })
static final class TitleManagementActions$addButton$4$options$2$2 extends Lambda implements Function1<Set<? extends UUID>, Unit> {
    final /* synthetic */ SocialMenu $gui;
    
    TitleManagementActions$addButton$4$options$2$2(final SocialMenu $gui) {
        this.$gui = $gui;
        super(1);
    }
    
    public final void invoke(@NotNull final Set<UUID> members) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "members"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: getstatic       gg/essential/util/GuiUtil.INSTANCE:Lgg/essential/util/GuiUtil;
        //     9: new             Lgg/essential/gui/common/modal/CancelableInputModal;
        //    12: dup            
        //    13: ldc             "Group Name"
        //    15: ldc             ""
        //    17: invokespecial   gg/essential/gui/common/modal/CancelableInputModal.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    20: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //    23: astore_2        /* $this$configure$iv */
        //    24: aload_2         /* $this$configure$iv */
        //    25: astore_3       
        //    26: aload_3        
        //    27: astore          $this$configure_u24lambda_u2d0$iv
        //    29: aload           $this$configure_u24lambda_u2d0$iv
        //    31: checkcast       Lgg/essential/gui/common/modal/CancelableInputModal;
        //    34: astore          5
        //    36: astore          6
        //    38: aload           $this$invoke_u24lambda_u2d0
        //    40: ldc             "Select a name for your group"
        //    42: invokevirtual   gg/essential/gui/common/modal/CancelableInputModal.setTitleText:(Ljava/lang/String;)V
        //    45: aload           $this$invoke_u24lambda_u2d0
        //    47: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //    50: invokevirtual   gg/essential/gui/common/modal/CancelableInputModal.setTitleTextColor:(Ljava/awt/Color;)V
        //    53: aload           6
        //    55: aload_3        
        //    56: checkcast       Lgg/essential/gui/common/modal/CancelableInputModal;
        //    59: getstatic       gg/essential/gui/friends/TitleManagementActions$addButton$4$options$2$2$2.INSTANCE:Lgg/essential/gui/friends/TitleManagementActions$addButton$4$options$2$2$2;
        //    62: checkcast       Lkotlin/jvm/functions/Function1;
        //    65: invokevirtual   gg/essential/gui/common/modal/CancelableInputModal.mapInputToEnabled:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/CancelableInputModal;
        //    68: new             Lgg/essential/gui/friends/TitleManagementActions$addButton$4$options$2$2$3;
        //    71: dup            
        //    72: aload_0         /* this */
        //    73: getfield        gg/essential/gui/friends/TitleManagementActions$addButton$4$options$2$2.$gui:Lgg/essential/gui/friends/SocialMenu;
        //    76: aload_1         /* members */
        //    77: invokespecial   gg/essential/gui/friends/TitleManagementActions$addButton$4$options$2$2$3.<init>:(Lgg/essential/gui/friends/SocialMenu;Ljava/util/Set;)V
        //    80: checkcast       Lkotlin/jvm/functions/Function1;
        //    83: invokevirtual   gg/essential/gui/common/modal/CancelableInputModal.onPrimaryActionWithValue:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/CancelableInputModal;
        //    86: checkcast       Lgg/essential/gui/common/modal/Modal;
        //    89: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //    92: pop            
        //    93: return         
        //    Signature:
        //  (Ljava/util/Set<Ljava/util/UUID;>;)V
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  members  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Set)p1);
        return Unit.INSTANCE;
    }
}