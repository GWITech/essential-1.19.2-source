package gg.essential.gui.studio;

import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.util.*;
import gg.essential.api.utils.*;
import gg.essential.universal.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000F
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b	\u0010
                                                   \u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0011²\u0006
                                                   \u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006
                                                   \u0010\u0014\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006
                                                   \u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006
                                                   \u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006
                                                   \u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006
                                                   \u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/studio/SkinUpload;", "", "()V", "isSkinSelectorOpen", "", "skinFileChooser", "Lgg/essential/gui/studio/ForkedFileChooser;", "getSkinFileChooser", "()Lgg/essential/gui/studio/ForkedFileChooser;", "skinFileChooser$delegate", "Lkotlin/Lazy;", "skinFileChooserDelegate", "Lkotlin/Lazy;", "begin", "", "cleanup", "displayModal", "essential", "skinTypeRow", "Lgg/essential/elementa/UIComponent;", "applyToAllOutfitsRow", "row", "Lgg/essential/elementa/components/UIContainer;", "text", "Lgg/essential/gui/common/shadow/EssentialUIText;", "switch", "Lgg/essential/gui/common/FullEssentialToggle;", "extraText", "Lgg/essential/gui/common/shadow/EssentialUIWrappedText;" })
public final class SkinUpload
{
    @NotNull
    private final Lazy<ForkedFileChooser> skinFileChooserDelegate;
    @NotNull
    private final Lazy skinFileChooser$delegate;
    private boolean isSkinSelectorOpen;
    
    public SkinUpload() {
        super();
        this.skinFileChooserDelegate = (Lazy<ForkedFileChooser>)LazyKt.lazy((Function0)SkinUpload$skinFileChooserDelegate.SkinUpload$skinFileChooserDelegate$1.INSTANCE);
        this.skinFileChooser$delegate = this.skinFileChooserDelegate;
        if (ExtensionsKt.getOs() != OperatingSystem.MACOS) {
            Multithreading.runAsync(SkinUpload::_init_$lambda-0);
        }
    }
    
    private final ForkedFileChooser getSkinFileChooser() {
        return (ForkedFileChooser)this.skinFileChooser$delegate.getValue();
    }
    
    public final void cleanup() {
        if (this.skinFileChooserDelegate.isInitialized()) {
            Multithreading.runAsync(SkinUpload::cleanup$lambda-1);
        }
    }
    
    public final void begin() {
        if (this.isSkinSelectorOpen) {
            return;
        }
        this.isSkinSelectorOpen = true;
        USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
        this.displayModal();
    }
    
    private final void displayModal() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: iconst_0       
        //     5: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //     8: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    11: astore_1        /* locked */
        //    12: new             Lgg/essential/elementa/state/BasicState;
        //    15: dup            
        //    16: iconst_1       
        //    17: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    20: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    23: astore_2        /* applyToAllOutfits */
        //    24: new             Lgg/essential/elementa/state/BasicState;
        //    27: dup            
        //    28: getstatic       gg/essential/api/utils/mojang/Model.STEVE:Lgg/essential/api/utils/mojang/Model;
        //    31: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    34: astore_3        /* modelType */
        //    35: getstatic       gg/essential/util/GuiUtil.INSTANCE:Lgg/essential/util/GuiUtil;
        //    38: new             Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    41: dup            
        //    42: iconst_0       
        //    43: invokespecial   gg/essential/gui/common/modal/ConfirmDenyModal.<init>:(Z)V
        //    46: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //    49: astore          $this$configure$iv
        //    51: aload           $this$configure$iv
        //    53: astore          5
        //    55: aload           5
        //    57: astore          $this$configure_u24lambda_u2d0$iv
        //    59: aload           $this$configure_u24lambda_u2d0$iv
        //    61: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    64: astore          7
        //    66: astore          8
        //    68: aload           $this$displayModal_u24lambda_u2d2
        //    70: ldc             "Skin Options"
        //    72: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setTitleText:(Ljava/lang/String;)V
        //    75: aload           $this$displayModal_u24lambda_u2d2
        //    77: getstatic       gg/essential/gui/EssentialPalette.ACCENT_BLUE:Ljava/awt/Color;
        //    80: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setTitleTextColor:(Ljava/awt/Color;)V
        //    83: aload           $this$displayModal_u24lambda_u2d2
        //    85: ldc             "Upload"
        //    87: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.setPrimaryButtonText:(Ljava/lang/String;)V
        //    90: aload           8
        //    92: aload           5
        //    94: checkcast       Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //    97: new             Lgg/essential/gui/studio/SkinUpload$displayModal$2;
        //   100: dup            
        //   101: aload_0         /* this */
        //   102: invokespecial   gg/essential/gui/studio/SkinUpload$displayModal$2.<init>:(Lgg/essential/gui/studio/SkinUpload;)V
        //   105: checkcast       Lkotlin/jvm/functions/Function1;
        //   108: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.onCancel:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   111: new             Lgg/essential/gui/studio/SkinUpload$displayModal$3;
        //   114: dup            
        //   115: aload_0         /* this */
        //   116: aload_3         /* modelType */
        //   117: aload_1         /* locked */
        //   118: aload_2         /* applyToAllOutfits */
        //   119: invokespecial   gg/essential/gui/studio/SkinUpload$displayModal$3.<init>:(Lgg/essential/gui/studio/SkinUpload;Lgg/essential/elementa/state/BasicState;Lgg/essential/elementa/state/BasicState;Lgg/essential/elementa/state/BasicState;)V
        //   122: checkcast       Lkotlin/jvm/functions/Function0;
        //   125: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.onPrimaryAction:(Lkotlin/jvm/functions/Function0;)Lgg/essential/gui/common/modal/ConfirmDenyModal;
        //   128: new             Lgg/essential/gui/studio/SkinUpload$displayModal$4;
        //   131: dup            
        //   132: aload_1         /* locked */
        //   133: invokespecial   gg/essential/gui/studio/SkinUpload$displayModal$4.<init>:(Lgg/essential/elementa/state/BasicState;)V
        //   136: checkcast       Lkotlin/jvm/functions/Function1;
        //   139: invokevirtual   gg/essential/gui/common/modal/ConfirmDenyModal.configureLayout:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/EssentialModal;
        //   142: checkcast       Lgg/essential/gui/common/modal/Modal;
        //   145: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //   148: pop            
        //   149: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final void _init_$lambda-0(final SkinUpload this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.getSkinFileChooser().toString();
    }
    
    private static final void cleanup$lambda-1(final SkinUpload this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.getSkinFileChooser().cancelSelection();
        this$0.getSkinFileChooser().close();
    }
    
    public static final /* synthetic */ void access$setSkinSelectorOpen$p$465df37d(final SkinUpload $this) {
        $this.isSkinSelectorOpen = false;
    }
    
    public static final /* synthetic */ ForkedFileChooser access$getSkinFileChooser(final SkinUpload $this) {
        return $this.getSkinFileChooser();
    }
}
