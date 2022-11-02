package gg.essential.gui.friends;

import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.friends.message.*;
import gg.essential.gui.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import kotlin.collections.*;
import gg.essential.elementa.components.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke", "gg/essential/vigilance/utils/ExtensionsKt$onLeftClick$1" })
public static final class TitleManagementActions$special$$inlined$onLeftClick$1 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ TitleManagementActions this$0;
    final /* synthetic */ SocialMenu $gui$inlined;
    
    public TitleManagementActions$special$$inlined$onLeftClick$1(final TitleManagementActions this$0, final SocialMenu $gui$inlined) {
        this.this$0 = this$0;
        this.$gui$inlined = $gui$inlined;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        if (it.getMouseButton() == 0) {
            final UIComponent $this$addButton_delegate_u24lambda_u2d2 = $this$onMouseClick;
            TitleManagementActions.access$getAddDropDownOpen$p(this.this$0).set(true);
            final List options = CollectionsKt.listOf((Object[])new OptionMenu.Option[] { new OptionMenu.Option("Add Friend", null, EssentialPalette.INVITE_10X6, null, null, null, null, (Function0)new Function0<Unit>(this.$gui$inlined) {
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
                }, 122), new OptionMenu.Option("Make Group", null, EssentialPalette.SOCIAL_10X, null, null, null, null, (Function0)new Function0<Unit>(this.$gui$inlined) {
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
                }, 122), new OptionMenu.Option("Block Player", null, EssentialPalette.BLOCK_8X, null, null, null, null, (Function0)new Function0<Unit>(this.$gui$inlined) {
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
                }, 122) });
            final OptionMenu.Companion companion = OptionMenu.Companion;
            final OptionMenu.Position position = new OptionMenu.Position($this$addButton_delegate_u24lambda_u2d2, false);
            final Window of = Window.Companion.of($this$addButton_delegate_u24lambda_u2d2);
            final Collection thisCollection$iv;
            final Collection $this$toTypedArray$iv = thisCollection$iv = options;
            final OptionMenu.Option[] array = thisCollection$iv.toArray(new OptionMenu.Option[0]);
            Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            final OptionMenu.Option[] original = array;
            companion.create(position, of, Arrays.copyOf(original, original.length), (Function0<Unit>)new Function0<Unit>(this.this$0) {
                final /* synthetic */ TitleManagementActions this$0;
                
                TitleManagementActions$addButton$4$1(final TitleManagementActions $receiver) {
                    this.this$0 = $receiver;
                    super(0);
                }
                
                public final void invoke() {
                    TitleManagementActions.access$getAddDropDownOpen$p(this.this$0).set(false);
                }
                
                public /* bridge */ Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }
            });
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}