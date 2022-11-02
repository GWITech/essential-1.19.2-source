package gg.essential.gui.studio;

import kotlin.reflect.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import gg.essential.network.cosmetics.*;
import gg.essential.gui.common.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import gg.essential.model.*;
import gg.essential.elementa.state.*;
import kotlin.*;
import gg.essential.gui.state.*;
import gg.essential.elementa.components.*;
import kotlin.properties.*;
import gg.essential.elementa.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.mod.cosmetics.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000�\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010"
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0007
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b\u0018\u0000 u2\u00020\u0001:\u0004tuvwB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020	�\u0006\u0002\u0010
                                                   R\u0016\u0010\u000b\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004�\u0006\u0002
                                                   \u0000R\u001f\u0010\u000e\u001a\u00060\u000fR\u00020\u00008BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005�\u0006\b
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015R2\u0010\u0016\u001a&\u0012\f\u0012
                                                    \u0019*\u0004\u0018\u00010\u00180\u0018 \u0019*\u0012\u0012\f\u0012
                                                    \u0019*\u0004\u0018\u00010\u00180\u0018\u0018\u00010\u00170\u0017X\u0082\u0004�\u0006\u0002
                                                   \u0000R\u0011\u0010\b\u001a\u00020	�\u0006\b
                                                   \u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004�\u0006\u0002
                                                   \u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d�\u0006\b
                                                   \u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004�\u0006\u0002
                                                   \u0000R\u001a\u0010"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#X\u0082\u0004�\u0006\u0002
                                                   \u0000R&\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0&\u0012\u0004\u0012\u00020\u001e0#X\u0082\u0004�\u0006\u0002
                                                   \u0000R\u000e\u0010'\u001a\u00020\u001eX\u0082\u0004�\u0006\u0002
                                                   \u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#X\u0082\u0004�\u0006\u0002
                                                   \u0000R#\u0010)\u001a\u0014\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020+0*\u0012\u0004\u0012\u00020\u001e0#�\u0006\b
                                                   \u0000\u001a\u0004\b)\u0010,R\u000e\u0010-\u001a\u00020\u001eX\u0082\u0004�\u0006\u0002
                                                   \u0000R&\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0&\u0012\u0004\u0012\u00020\u001e0#X\u0082\u0004�\u0006\u0002
                                                   \u0000R2\u0010/\u001a&\u0012\f\u0012
                                                    \u0019*\u0004\u0018\u00010\u001e0\u001e \u0019*\u0012\u0012\f\u0012
                                                    \u0019*\u0004\u0018\u00010\u001e0\u001e\u0018\u00010\f0\fX\u0082\u0004�\u0006\u0002
                                                   \u0000R\u001c\u00100\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u001e0#X\u0082\u0004�\u0006\u0002
                                                   \u0000R\u000e\u00101\u001a\u00020\u001eX\u0082\u0004�\u0006\u0002
                                                   \u0000R&\u00102\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000503\u0012\u0004\u0012\u00020\u001e0#X\u0082\u0004�\u0006\u0002
                                                   \u0000R\u0014\u00105\u001a\u00020\u001e8BX\u0082\u0004�\u0006\u0006\u001a\u0004\b5\u00106R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\b;\u0010\u0013\u001a\u0004\b9\u0010:R\u001b\u0010<\u001a\u00020\u00018BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\b?\u0010\u0013\u001a\u0004\b=\u0010>R\u001b\u0010@\u001a\u00020\u00018BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\bB\u0010\u0013\u001a\u0004\bA\u0010>R\u001b\u0010C\u001a\u00020D8BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\bG\u0010\u0013\u001a\u0004\bE\u0010FR\u001b\u0010H\u001a\u0002088BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\bJ\u0010\u0013\u001a\u0004\bI\u0010:R(\u0010K\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012
                                                    \u0019*\u0004\u0018\u00010+0+0*\u0012\u0004\u0012\u00020\u001e0#X\u0082\u0004�\u0006\u0002
                                                   \u0000R\u001b\u0010L\u001a\u0002088BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\bN\u0010\u0013\u001a\u0004\bM\u0010:R\u001f\u0010O\u001a\u00060PR\u00020\u00008BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\bS\u0010\u0013\u001a\u0004\bQ\u0010RR\u001b\u0010T\u001a\u00020U8BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\bX\u0010\u0013\u001a\u0004\bV\u0010WR(\u0010Y\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\r0&\u0012\u0004\u0012\u00020+0#X\u0082\u0004�\u0006\u0002
                                                   \u0000R\u001b\u0010Z\u001a\u00020[8BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\b^\u0010\u0013\u001a\u0004\b\\u0010]R\u000e\u0010_\u001a\u00020`X\u0082\u0004�\u0006\u0002
                                                   \u0000R\u001b\u0010a\u001a\u0002088BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\bc\u0010\u0013\u001a\u0004\bb\u0010:R\u000e\u0010d\u001a\u00020`X\u0082\u0004�\u0006\u0002
                                                   \u0000R\u0010\u0010e\u001a\u0004\u0018\u000104X\u0082\u0004�\u0006\u0002
                                                   \u0000R\u000e\u0010f\u001a\u00020gX\u0082\u0004�\u0006\u0002
                                                   \u0000R\u001b\u0010h\u001a\u00020\u00018BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\bj\u0010\u0013\u001a\u0004\bi\u0010>R\u0014\u0010k\u001a\b\u0012\u0004\u0012\u00020+0\fX\u0082\u0004�\u0006\u0002
                                                   \u0000R\u001b\u0010l\u001a\u00020g8BX\u0082\u0084\u0002�\u0006\f
                                                   \u0004\bo\u0010\u0013\u001a\u0004\bm\u0010nR\u0014\u0010p\u001a\b\u0012\u0004\u0012\u00020$0qX\u0082\u0004�\u0006\u0002
                                                   \u0000R\u0011\u0010\u0006\u001a\u00020\u0007�\u0006\b
                                                   \u0000\u001a\u0004\br\u0010s�\u0006x�\u0006
                                                   \u0010y\u001a\u00020\u0001X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/studio/CosmeticOption;", "Lgg/essential/elementa/components/UIBlock;", "cosmeticsManager", "Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;", "cosmetic", "Lgg/essential/network/cosmetics/Cosmetic;", "window", "Lgg/essential/elementa/components/Window;", "cosmeticStudio", "Lgg/essential/gui/studio/CosmeticStudio;", "(Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;Lgg/essential/network/cosmetics/Cosmetic;Lgg/essential/elementa/components/Window;Lgg/essential/gui/studio/CosmeticStudio;)V", "activeSale", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/state/Sale;", "cartGridButton", "Lgg/essential/gui/studio/CosmeticOption$CartGridButton;", "getCartGridButton", "()Lgg/essential/gui/studio/CosmeticOption$CartGridButton;", "cartGridButton$delegate", "Lkotlin/properties/ReadWriteProperty;", "getCosmetic", "()Lgg/essential/network/cosmetics/Cosmetic;", "cosmeticModel", "Ljava/util/concurrent/CompletableFuture;", "Lgg/essential/model/BedrockModel;", "kotlin.jvm.PlatformType", "getCosmeticStudio", "()Lgg/essential/gui/studio/CosmeticStudio;", "editingPlacement", "Lgg/essential/elementa/state/BasicState;", "", "getEditingPlacement", "()Lgg/essential/elementa/state/BasicState;", "hasSideOption", "isCartView", "Lgg/essential/elementa/state/MappedState;", "Lgg/essential/gui/studio/CosmeticOption$View;", "isConfigurable", "Lkotlin/Pair;", "isFree", "isGridView", "isInCart", "", "", "()Lgg/essential/elementa/state/MappedState;", "isLocal", "isLocked", "isNew", "isOnSale", "isPartnered", "isPreviewing", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "isPurchased", "()Z", "localTag", "Lgg/essential/gui/studio/Tag;", "getLocalTag", "()Lgg/essential/gui/studio/Tag;", "localTag$delegate", "lockedAction", "getLockedAction", "()Lgg/essential/elementa/components/UIBlock;", "lockedAction$delegate", "lockedTag", "getLockedTag", "lockedTag$delegate", "name", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getName", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "name$delegate", "newTag", "getNewTag", "newTag$delegate", "owned", "partnerIcon", "getPartnerIcon", "partnerIcon$delegate", "placementOptions", "Lgg/essential/gui/studio/CosmeticOption$PlacementOptions;", "getPlacementOptions", "()Lgg/essential/gui/studio/CosmeticOption$PlacementOptions;", "placementOptions$delegate", "priceText", "Lgg/essential/elementa/components/UIWrappedText;", "getPriceText", "()Lgg/essential/elementa/components/UIWrappedText;", "priceText$delegate", "priceTextState", "purchaseImage", "Lgg/essential/gui/common/shadow/ShadowIcon;", "getPurchaseImage", "()Lgg/essential/gui/common/shadow/ShadowIcon;", "purchaseImage$delegate", "removeCartButton", "Lgg/essential/elementa/UIComponent;", "saleTag", "getSaleTag", "saleTag$delegate", "settingsImage", "shopCategory", "thumbnail", "Lgg/essential/elementa/components/UIContainer;", "timerTagBlock", "getTimerTagBlock", "timerTagBlock$delegate", "timerTooltip", "topBarIconContainer", "getTopBarIconContainer", "()Lgg/essential/elementa/components/UIContainer;", "topBarIconContainer$delegate", "view", "Lgg/essential/gui/common/WeakState;", "getWindow", "()Lgg/essential/elementa/components/Window;", "CartGridButton", "Companion", "PlacementOptions", "View", "essential", "contentBlock" })
public final class CosmeticOption extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final CosmeticsManager cosmeticsManager;
    @NotNull
    private final Cosmetic cosmetic;
    @NotNull
    private final Window window;
    @NotNull
    private final CosmeticStudio cosmeticStudio;
    @NotNull
    private final WeakState<View> view;
    @NotNull
    private final MappedState<View, Boolean> isGridView;
    @NotNull
    private final MappedState<View, Boolean> isCartView;
    @NotNull
    private final BasicState<Boolean> editingPlacement;
    @NotNull
    private final MappedState<Set<String>, Boolean> owned;
    @Nullable
    private final CosmeticSlot shopCategory;
    @NotNull
    private final MappedState<Map<CosmeticSlot, Cosmetic>, Boolean> isPreviewing;
    @NotNull
    private final MappedState<Set<String>, Boolean> isInCart;
    private final CompletableFuture<BedrockModel> cosmeticModel;
    private final boolean isFree;
    private final State<Boolean> isNew;
    private final boolean isLocal;
    private final boolean isPartnered;
    @NotNull
    private final MappedState<Pair<Boolean, Boolean>, Boolean> isLocked;
    @NotNull
    private final BasicState<Boolean> hasSideOption;
    @NotNull
    private final MappedState<Pair<Boolean, Boolean>, Boolean> isConfigurable;
    @NotNull
    private final State<Sale> activeSale;
    @NotNull
    private final MappedState<Sale, Boolean> isOnSale;
    @NotNull
    private final UIContainer thumbnail;
    @NotNull
    private final ReadWriteProperty name$delegate;
    @NotNull
    private final ReadWriteProperty topBarIconContainer$delegate;
    @NotNull
    private final State<String> timerTooltip;
    @NotNull
    private final MappedState<Pair<View, Sale>, String> priceTextState;
    @NotNull
    private final UIComponent settingsImage;
    
    public CosmeticOption(@NotNull final CosmeticsManager cosmeticsManager, @NotNull final Cosmetic cosmetic, @NotNull final Window window, @NotNull final CosmeticStudio cosmeticStudio) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "cosmeticsManager"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* cosmetic */
        //     7: ldc             "cosmetic"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* window */
        //    13: ldc             "window"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           cosmeticStudio
        //    20: ldc             "cosmeticStudio"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload_0         /* this */
        //    26: aconst_null    
        //    27: iconst_1       
        //    28: aconst_null    
        //    29: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    32: aload_0         /* this */
        //    33: aload_1         /* cosmeticsManager */
        //    34: putfield        gg/essential/gui/studio/CosmeticOption.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //    37: aload_0         /* this */
        //    38: aload_2         /* cosmetic */
        //    39: putfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //    42: aload_0         /* this */
        //    43: aload_3         /* window */
        //    44: putfield        gg/essential/gui/studio/CosmeticOption.window:Lgg/essential/elementa/components/Window;
        //    47: aload_0         /* this */
        //    48: aload           cosmeticStudio
        //    50: putfield        gg/essential/gui/studio/CosmeticOption.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //    53: aload_0         /* this */
        //    54: aload_0         /* this */
        //    55: getfield        gg/essential/gui/studio/CosmeticOption.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //    58: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getView:()Lgg/essential/elementa/state/MappedState;
        //    61: checkcast       Lgg/essential/elementa/state/State;
        //    64: invokestatic    gg/essential/gui/common/StateExtensionsKt.weak:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/WeakState;
        //    67: putfield        gg/essential/gui/studio/CosmeticOption.view:Lgg/essential/gui/common/WeakState;
        //    70: aload_0         /* this */
        //    71: aload_0         /* this */
        //    72: getfield        gg/essential/gui/studio/CosmeticOption.view:Lgg/essential/gui/common/WeakState;
        //    75: getstatic       gg/essential/gui/studio/CosmeticOption$isGridView$1.INSTANCE:Lgg/essential/gui/studio/CosmeticOption$isGridView$1;
        //    78: checkcast       Lkotlin/jvm/functions/Function1;
        //    81: invokevirtual   gg/essential/gui/common/WeakState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    84: putfield        gg/essential/gui/studio/CosmeticOption.isGridView:Lgg/essential/elementa/state/MappedState;
        //    87: aload_0         /* this */
        //    88: aload_0         /* this */
        //    89: getfield        gg/essential/gui/studio/CosmeticOption.view:Lgg/essential/gui/common/WeakState;
        //    92: getstatic       gg/essential/gui/studio/CosmeticOption$isCartView$1.INSTANCE:Lgg/essential/gui/studio/CosmeticOption$isCartView$1;
        //    95: checkcast       Lkotlin/jvm/functions/Function1;
        //    98: invokevirtual   gg/essential/gui/common/WeakState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   101: putfield        gg/essential/gui/studio/CosmeticOption.isCartView:Lgg/essential/elementa/state/MappedState;
        //   104: aload_0         /* this */
        //   105: new             Lgg/essential/elementa/state/BasicState;
        //   108: dup            
        //   109: iconst_0       
        //   110: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   113: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   116: putfield        gg/essential/gui/studio/CosmeticOption.editingPlacement:Lgg/essential/elementa/state/BasicState;
        //   119: aload_0         /* this */
        //   120: aload_0         /* this */
        //   121: getfield        gg/essential/gui/studio/CosmeticOption.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //   124: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getUnlockedCosmetics:()Lgg/essential/elementa/state/BasicState;
        //   127: checkcast       Lgg/essential/elementa/state/State;
        //   130: invokestatic    gg/essential/gui/common/StateExtensionsKt.weak:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/WeakState;
        //   133: new             Lgg/essential/gui/studio/CosmeticOption$owned$1;
        //   136: dup            
        //   137: aload_0         /* this */
        //   138: invokespecial   gg/essential/gui/studio/CosmeticOption$owned$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //   141: checkcast       Lkotlin/jvm/functions/Function1;
        //   144: invokevirtual   gg/essential/gui/common/WeakState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   147: putfield        gg/essential/gui/studio/CosmeticOption.owned:Lgg/essential/elementa/state/MappedState;
        //   150: aload_0         /* this */
        //   151: aload_0         /* this */
        //   152: getfield        gg/essential/gui/studio/CosmeticOption.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   155: aload_0         /* this */
        //   156: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   159: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getTypeId:()Ljava/lang/String;
        //   162: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getCosmeticType:(Ljava/lang/String;)Lgg/essential/mod/cosmetics/CosmeticType;
        //   165: dup            
        //   166: ifnull          175
        //   169: invokevirtual   gg/essential/mod/cosmetics/CosmeticType.getSlot:()Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   172: goto            177
        //   175: pop            
        //   176: aconst_null    
        //   177: putfield        gg/essential/gui/studio/CosmeticOption.shopCategory:Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   180: aload_0         /* this */
        //   181: aload_0         /* this */
        //   182: getfield        gg/essential/gui/studio/CosmeticOption.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //   185: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getPreviewingCosmetics:()Lgg/essential/elementa/state/State;
        //   188: invokestatic    gg/essential/gui/common/StateExtensionsKt.weak:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/WeakState;
        //   191: new             Lgg/essential/gui/studio/CosmeticOption$isPreviewing$1;
        //   194: dup            
        //   195: aload_0         /* this */
        //   196: invokespecial   gg/essential/gui/studio/CosmeticOption$isPreviewing$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //   199: checkcast       Lkotlin/jvm/functions/Function1;
        //   202: invokevirtual   gg/essential/gui/common/WeakState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   205: putfield        gg/essential/gui/studio/CosmeticOption.isPreviewing:Lgg/essential/elementa/state/MappedState;
        //   208: aload_0         /* this */
        //   209: aload_0         /* this */
        //   210: getfield        gg/essential/gui/studio/CosmeticOption.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //   213: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getCartItems:()Lgg/essential/elementa/state/MappedState;
        //   216: checkcast       Lgg/essential/elementa/state/State;
        //   219: invokestatic    gg/essential/gui/common/StateExtensionsKt.weak:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/WeakState;
        //   222: new             Lgg/essential/gui/studio/CosmeticOption$isInCart$1;
        //   225: dup            
        //   226: aload_0         /* this */
        //   227: invokespecial   gg/essential/gui/studio/CosmeticOption$isInCart$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //   230: checkcast       Lkotlin/jvm/functions/Function1;
        //   233: invokevirtual   gg/essential/gui/common/WeakState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   236: putfield        gg/essential/gui/studio/CosmeticOption.isInCart:Lgg/essential/elementa/state/MappedState;
        //   239: aload_0         /* this */
        //   240: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //   243: invokevirtual   gg/essential/Essential.getPlayerWearableManager:()Lgg/essential/cosmetics/PlayerWearableManager;
        //   246: aload_0         /* this */
        //   247: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   250: ldc_w           ""
        //   253: invokevirtual   gg/essential/cosmetics/PlayerWearableManager.getModel:(Lgg/essential/network/cosmetics/Cosmetic;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;
        //   256: putfield        gg/essential/gui/studio/CosmeticOption.cosmeticModel:Ljava/util/concurrent/CompletableFuture;
        //   259: aload_0         /* this */
        //   260: aload_0         /* this */
        //   261: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   264: ldc_w           "USD"
        //   267: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getPrice:(Ljava/lang/String;)Ljava/lang/Double;
        //   270: dconst_0       
        //   271: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Double;D)Z
        //   274: putfield        gg/essential/gui/studio/CosmeticOption.isFree:Z
        //   277: aload_0         /* this */
        //   278: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //   281: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //   284: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getNoticesManager:()Lgg/essential/network/connectionmanager/notices/NoticesManager;
        //   287: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager.getCosmeticNotices:()Lgg/essential/network/connectionmanager/notices/NoticesManager$CosmeticNotices;
        //   290: aload_0         /* this */
        //   291: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   294: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //   297: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager$CosmeticNotices.getNewState:(Ljava/lang/String;)Lgg/essential/elementa/state/State;
        //   300: putfield        gg/essential/gui/studio/CosmeticOption.isNew:Lgg/essential/elementa/state/State;
        //   303: aload_0         /* this */
        //   304: aload_0         /* this */
        //   305: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   308: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getTags:()Ljava/util/Set;
        //   311: ldc_w           "LOCAL"
        //   314: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   319: putfield        gg/essential/gui/studio/CosmeticOption.isLocal:Z
        //   322: aload_0         /* this */
        //   323: aload_0         /* this */
        //   324: getfield        gg/essential/gui/studio/CosmeticOption.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   327: aload_0         /* this */
        //   328: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   331: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //   334: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.isPartnerCosmetic:(Ljava/lang/String;)Z
        //   337: putfield        gg/essential/gui/studio/CosmeticOption.isPartnered:Z
        //   340: aload_0         /* this */
        //   341: aload_0         /* this */
        //   342: getfield        gg/essential/gui/studio/CosmeticOption.owned:Lgg/essential/elementa/state/MappedState;
        //   345: checkcast       Lgg/essential/elementa/state/State;
        //   348: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   351: checkcast       Lgg/essential/elementa/state/State;
        //   354: new             Lgg/essential/elementa/state/BasicState;
        //   357: dup            
        //   358: aload_0         /* this */
        //   359: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   362: invokevirtual   gg/essential/network/cosmetics/Cosmetic.requiresUnlockAction:()Z
        //   365: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   368: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   371: checkcast       Lgg/essential/elementa/state/State;
        //   374: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   377: putfield        gg/essential/gui/studio/CosmeticOption.isLocked:Lgg/essential/elementa/state/MappedState;
        //   380: aload_0         /* this */
        //   381: new             Lgg/essential/elementa/state/BasicState;
        //   384: dup            
        //   385: iconst_0       
        //   386: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   389: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   392: astore          5
        //   394: aload           5
        //   396: astore          6
        //   398: astore          16
        //   400: aload_0         /* this */
        //   401: getfield        gg/essential/gui/studio/CosmeticOption.cosmeticModel:Ljava/util/concurrent/CompletableFuture;
        //   404: dup            
        //   405: ldc_w           "cosmeticModel"
        //   408: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   411: new             Lgg/essential/gui/studio/CosmeticOption$hasSideOption$1$1;
        //   414: dup            
        //   415: aload           $this$hasSideOption_u24lambda_u2d0
        //   417: invokespecial   gg/essential/gui/studio/CosmeticOption$hasSideOption$1$1.<init>:(Lgg/essential/elementa/state/BasicState;)V
        //   420: checkcast       Lkotlin/jvm/functions/Function1;
        //   423: invokestatic    gg/essential/util/ExtensionsKt.thenAcceptOnMainThread:(Ljava/util/concurrent/CompletableFuture;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/CompletableFuture;
        //   426: pop            
        //   427: aload           16
        //   429: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   432: pop            
        //   433: aload           5
        //   435: putfield        gg/essential/gui/studio/CosmeticOption.hasSideOption:Lgg/essential/elementa/state/BasicState;
        //   438: aload_0         /* this */
        //   439: aload_0         /* this */
        //   440: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   443: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getSettings:()Ljava/util/List;
        //   446: checkcast       Ljava/lang/Iterable;
        //   449: astore          5
        //   451: astore          16
        //   453: aload           $this$any$iv
        //   455: instanceof      Ljava/util/Collection;
        //   458: ifeq            478
        //   461: aload           $this$any$iv
        //   463: checkcast       Ljava/util/Collection;
        //   466: invokeinterface java/util/Collection.isEmpty:()Z
        //   471: ifeq            478
        //   474: iconst_0       
        //   475: goto            532
        //   478: aload           $this$any$iv
        //   480: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   485: astore          7
        //   487: aload           7
        //   489: invokeinterface java/util/Iterator.hasNext:()Z
        //   494: ifeq            531
        //   497: aload           7
        //   499: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   504: astore          element$iv
        //   506: aload           element$iv
        //   508: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //   511: astore          it
        //   513: aload           it
        //   515: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getType:()Ljava/lang/String;
        //   518: ldc_w           "POSITION_RANGE"
        //   521: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   524: ifeq            487
        //   527: iconst_1       
        //   528: goto            532
        //   531: iconst_0       
        //   532: istore          17
        //   534: aload           16
        //   536: iload           17
        //   538: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   541: astore          18
        //   543: new             Lgg/essential/elementa/state/BasicState;
        //   546: dup            
        //   547: aload           18
        //   549: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   552: checkcast       Lgg/essential/elementa/state/State;
        //   555: aload_0         /* this */
        //   556: getfield        gg/essential/gui/studio/CosmeticOption.hasSideOption:Lgg/essential/elementa/state/BasicState;
        //   559: checkcast       Lgg/essential/elementa/state/State;
        //   562: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   565: putfield        gg/essential/gui/studio/CosmeticOption.isConfigurable:Lgg/essential/elementa/state/MappedState;
        //   568: aload_0         /* this */
        //   569: aload_0         /* this */
        //   570: getfield        gg/essential/gui/studio/CosmeticOption.cosmeticStudio:Lgg/essential/gui/studio/CosmeticStudio;
        //   573: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getSaleState:()Lgg/essential/elementa/state/State;
        //   576: dup            
        //   577: ldc_w           "cosmeticStudio.saleState"
        //   580: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   583: invokestatic    gg/essential/gui/common/StateExtensionsKt.weak:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/WeakState;
        //   586: new             Lgg/essential/gui/studio/CosmeticOption$activeSale$1;
        //   589: dup            
        //   590: aload_0         /* this */
        //   591: invokespecial   gg/essential/gui/studio/CosmeticOption$activeSale$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //   594: checkcast       Lkotlin/jvm/functions/Function1;
        //   597: invokevirtual   gg/essential/gui/common/WeakState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   600: checkcast       Lgg/essential/elementa/state/State;
        //   603: putfield        gg/essential/gui/studio/CosmeticOption.activeSale:Lgg/essential/elementa/state/State;
        //   606: aload_0         /* this */
        //   607: aload_0         /* this */
        //   608: getfield        gg/essential/gui/studio/CosmeticOption.activeSale:Lgg/essential/elementa/state/State;
        //   611: getstatic       gg/essential/gui/studio/CosmeticOption$isOnSale$1.INSTANCE:Lgg/essential/gui/studio/CosmeticOption$isOnSale$1;
        //   614: checkcast       Lkotlin/jvm/functions/Function1;
        //   617: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   620: putfield        gg/essential/gui/studio/CosmeticOption.isOnSale:Lgg/essential/elementa/state/MappedState;
        //   623: aload_0         /* this */
        //   624: aload_0         /* this */
        //   625: getfield        gg/essential/gui/studio/CosmeticOption.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   628: aload_0         /* this */
        //   629: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   632: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getCosmeticType:(Lgg/essential/network/cosmetics/Cosmetic;)Lgg/essential/mod/cosmetics/CosmeticType;
        //   635: dup            
        //   636: ifnull          645
        //   639: invokevirtual   gg/essential/mod/cosmetics/CosmeticType.getSlot:()Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   642: goto            647
        //   645: pop            
        //   646: aconst_null    
        //   647: ifnonnull       683
        //   650: getstatic       gg/essential/Essential.logger:Lorg/apache/logging/log4j/Logger;
        //   653: aload_0         /* this */
        //   654: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   657: ldc_w           "en_us"
        //   660: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getDisplayName:(Ljava/lang/String;)Ljava/lang/String;
        //   663: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   668: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;)V
        //   673: new             Lgg/essential/elementa/components/UIContainer;
        //   676: dup            
        //   677: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   680: goto            697
        //   683: new             Lgg/essential/gui/common/CosmeticPreview;
        //   686: dup            
        //   687: aload_0         /* this */
        //   688: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   691: invokespecial   gg/essential/gui/common/CosmeticPreview.<init>:(Lgg/essential/network/cosmetics/Cosmetic;)V
        //   694: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   697: checkcast       Lgg/essential/elementa/UIComponent;
        //   700: aload_0         /* this */
        //   701: getfield        gg/essential/gui/studio/CosmeticOption.view:Lgg/essential/gui/common/WeakState;
        //   704: checkcast       Lgg/essential/elementa/state/State;
        //   707: getstatic       gg/essential/gui/studio/CosmeticOption$thumbnail$1.INSTANCE:Lgg/essential/gui/studio/CosmeticOption$thumbnail$1;
        //   710: checkcast       Lkotlin/jvm/functions/Function2;
        //   713: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   716: aload_0         /* this */
        //   717: checkcast       Lgg/essential/elementa/UIComponent;
        //   720: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   723: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   726: putfield        gg/essential/gui/studio/CosmeticOption.thumbnail:Lgg/essential/elementa/components/UIContainer;
        //   729: aload_0         /* this */
        //   730: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   733: dup            
        //   734: aload_0         /* this */
        //   735: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //   738: ldc_w           "en_us"
        //   741: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getDisplayName:(Ljava/lang/String;)Ljava/lang/String;
        //   744: dup            
        //   745: ifnonnull       752
        //   748: pop            
        //   749: ldc_w           "Error"
        //   752: iconst_0       
        //   753: aconst_null    
        //   754: iconst_0       
        //   755: iconst_0       
        //   756: iconst_0       
        //   757: bipush          62
        //   759: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   762: checkcast       Lgg/essential/elementa/UIComponent;
        //   765: astore          $this$constrain$iv
        //   767: aload           $this$constrain$iv
        //   769: astore          7
        //   771: aload           7
        //   773: astore          $this$constrain_u24lambda_u2d0$iv
        //   775: aload           $this$constrain_u24lambda_u2d0$iv
        //   777: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   780: astore          10
        //   782: astore          16
        //   784: aload           $this$name_delegate_u24lambda_u2d2
        //   786: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   789: dup            
        //   790: ldc_w           5.0
        //   793: iconst_0       
        //   794: iconst_2       
        //   795: aconst_null    
        //   796: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   799: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   802: aload_0         /* this */
        //   803: getfield        gg/essential/gui/studio/CosmeticOption.thumbnail:Lgg/essential/elementa/components/UIContainer;
        //   806: checkcast       Lgg/essential/elementa/UIComponent;
        //   809: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   812: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   815: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   818: aload           $this$name_delegate_u24lambda_u2d2
        //   820: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   823: dup            
        //   824: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   827: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   830: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   833: aload           16
        //   835: aload           7
        //   837: aload_0         /* this */
        //   838: checkcast       Lgg/essential/elementa/UIComponent;
        //   841: aload_0         /* this */
        //   842: getfield        gg/essential/gui/studio/CosmeticOption.isGridView:Lgg/essential/elementa/state/MappedState;
        //   845: checkcast       Lgg/essential/elementa/state/State;
        //   848: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   851: checkcast       Lgg/essential/elementa/state/State;
        //   854: iconst_0       
        //   855: aconst_null    
        //   856: bipush          12
        //   858: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   861: aload_0         /* this */
        //   862: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   865: iconst_0       
        //   866: aaload         
        //   867: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   870: putfield        gg/essential/gui/studio/CosmeticOption.name$delegate:Lkotlin/properties/ReadWriteProperty;
        //   873: aload_0         /* this */
        //   874: new             Lgg/essential/elementa/components/UIContainer;
        //   877: dup            
        //   878: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   881: checkcast       Lgg/essential/elementa/UIComponent;
        //   884: astore          $this$constrain$iv
        //   886: aload           $this$constrain$iv
        //   888: astore          7
        //   890: aload           7
        //   892: astore          $this$constrain_u24lambda_u2d0$iv
        //   894: aload           $this$constrain_u24lambda_u2d0$iv
        //   896: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   899: astore          10
        //   901: astore          16
        //   903: aload           $this$topBarIconContainer_delegate_u24lambda_u2d3
        //   905: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   908: dup            
        //   909: fconst_0       
        //   910: iconst_1       
        //   911: aconst_null    
        //   912: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   915: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   918: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   921: aload           $this$topBarIconContainer_delegate_u24lambda_u2d3
        //   923: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   926: dup            
        //   927: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   930: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   933: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   936: aload           16
        //   938: aload           7
        //   940: aload_0         /* this */
        //   941: getfield        gg/essential/gui/studio/CosmeticOption.view:Lgg/essential/gui/common/WeakState;
        //   944: checkcast       Lgg/essential/elementa/state/State;
        //   947: new             Lgg/essential/gui/studio/CosmeticOption$topBarIconContainer$3;
        //   950: dup            
        //   951: aload_0         /* this */
        //   952: invokespecial   gg/essential/gui/studio/CosmeticOption$topBarIconContainer$3.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //   955: checkcast       Lkotlin/jvm/functions/Function2;
        //   958: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   961: aload_0         /* this */
        //   962: checkcast       Lgg/essential/elementa/UIComponent;
        //   965: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   968: aload_0         /* this */
        //   969: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   972: iconst_1       
        //   973: aaload         
        //   974: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   977: putfield        gg/essential/gui/studio/CosmeticOption.topBarIconContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   980: new             Lgg/essential/gui/studio/Tag;
        //   983: dup            
        //   984: getstatic       gg/essential/gui/EssentialPalette.GREEN:Ljava/awt/Color;
        //   987: getstatic       gg/essential/gui/EssentialPalette.BLACK:Ljava/awt/Color;
        //   990: ldc_w           "NEW"
        //   993: invokespecial   gg/essential/gui/studio/Tag.<init>:(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V
        //   996: checkcast       Lgg/essential/elementa/UIComponent;
        //   999: astore          $this$constrain$iv
        //  1001: aload           $this$constrain$iv
        //  1003: astore          7
        //  1005: aload           7
        //  1007: astore          $this$constrain_u24lambda_u2d0$iv
        //  1009: aload           $this$constrain_u24lambda_u2d0$iv
        //  1011: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1014: astore          $this$newTag_delegate_u24lambda_u2d4
        //  1016: aload           $this$newTag_delegate_u24lambda_u2d4
        //  1018: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1021: dup            
        //  1022: fconst_1       
        //  1023: iconst_0       
        //  1024: iconst_2       
        //  1025: aconst_null    
        //  1026: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1029: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1032: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1035: aload           7
        //  1037: aload_0         /* this */
        //  1038: invokespecial   gg/essential/gui/studio/CosmeticOption.getTopBarIconContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1041: checkcast       Lgg/essential/elementa/UIComponent;
        //  1044: aload_0         /* this */
        //  1045: getfield        gg/essential/gui/studio/CosmeticOption.isNew:Lgg/essential/elementa/state/State;
        //  1048: dup            
        //  1049: ldc_w           "isNew"
        //  1052: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1055: iconst_0       
        //  1056: aconst_null    
        //  1057: bipush          12
        //  1059: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  1062: aload_0         /* this */
        //  1063: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1066: iconst_2       
        //  1067: aaload         
        //  1068: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1071: pop            
        //  1072: new             Lgg/essential/elementa/components/UIBlock;
        //  1075: dup            
        //  1076: getstatic       gg/essential/gui/EssentialPalette.LOCKED_ORANGE:Ljava/awt/Color;
        //  1079: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  1082: checkcast       Lgg/essential/elementa/UIComponent;
        //  1085: astore          $this$constrain$iv
        //  1087: aload           $this$constrain$iv
        //  1089: astore          7
        //  1091: aload           7
        //  1093: astore          $this$constrain_u24lambda_u2d0$iv
        //  1095: aload           $this$constrain_u24lambda_u2d0$iv
        //  1097: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1100: astore          $this$lockedTag_delegate_u24lambda_u2d5
        //  1102: aload           $this$lockedTag_delegate_u24lambda_u2d5
        //  1104: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1107: dup            
        //  1108: fconst_1       
        //  1109: iconst_0       
        //  1110: iconst_2       
        //  1111: aconst_null    
        //  1112: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1115: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1118: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1121: aload           $this$lockedTag_delegate_u24lambda_u2d5
        //  1123: bipush          13
        //  1125: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1128: checkcast       Ljava/lang/Number;
        //  1131: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1134: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1137: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1140: aload           $this$lockedTag_delegate_u24lambda_u2d5
        //  1142: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //  1145: dup            
        //  1146: fconst_1       
        //  1147: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //  1150: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1153: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1156: aload           7
        //  1158: astore          null
        //  1160: aload           5
        //  1162: checkcast       Lgg/essential/elementa/components/UIBlock;
        //  1165: astore          $this$lockedTag_delegate_u24lambda_u2d8
        //  1167: getstatic       gg/essential/gui/EssentialPalette.LOCK_7X9:Lgg/essential/gui/image/ImageFactory;
        //  1170: invokevirtual   gg/essential/gui/image/ImageFactory.create:()Lgg/essential/elementa/components/UIImage;
        //  1173: checkcast       Lgg/essential/elementa/UIComponent;
        //  1176: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1179: aload           $this$lockedTag_delegate_u24lambda_u2d8
        //  1181: checkcast       Lgg/essential/elementa/UIComponent;
        //  1184: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1187: pop            
        //  1188: aload_0         /* this */
        //  1189: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //  1192: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getSettings:()Ljava/util/List;
        //  1195: checkcast       Ljava/lang/Iterable;
        //  1198: astore          8
        //  1200: aload           8
        //  1202: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1207: astore          9
        //  1209: aload           9
        //  1211: invokeinterface java/util/Iterator.hasNext:()Z
        //  1216: ifeq            1254
        //  1219: aload           9
        //  1221: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1226: astore          10
        //  1228: aload           10
        //  1230: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //  1233: astore          it
        //  1235: aload           it
        //  1237: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getType:()Ljava/lang/String;
        //  1240: ldc_w           "REQUIRES_UNLOCK_ACTION"
        //  1243: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1246: ifeq            1209
        //  1249: aload           10
        //  1251: goto            1255
        //  1254: aconst_null    
        //  1255: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //  1258: astore          13
        //  1260: aload           13
        //  1262: ifnull          1336
        //  1265: aload           13
        //  1267: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:()Ljava/util/Map;
        //  1270: astore          14
        //  1272: aload           14
        //  1274: ifnull          1336
        //  1277: aload           14
        //  1279: ldc_w           "ACTION_DESCRIPTION"
        //  1282: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1287: astore          8
        //  1289: aload           8
        //  1291: ifnull          1336
        //  1294: aload           8
        //  1296: astore          actionText
        //  1298: aload           $this$lockedTag_delegate_u24lambda_u2d8
        //  1300: checkcast       Lgg/essential/elementa/UIComponent;
        //  1303: new             Lgg/essential/elementa/state/BasicState;
        //  1306: dup            
        //  1307: aload           actionText
        //  1309: checkcast       Ljava/lang/String;
        //  1312: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1315: checkcast       Lgg/essential/elementa/state/State;
        //  1318: aconst_null    
        //  1319: fconst_0       
        //  1320: aconst_null    
        //  1321: aconst_null    
        //  1322: bipush          30
        //  1324: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //  1327: pop            
        //  1328: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1331: pop            
        //  1332: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1335: pop            
        //  1336: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1339: pop            
        //  1340: aload           5
        //  1342: aload_0         /* this */
        //  1343: invokespecial   gg/essential/gui/studio/CosmeticOption.getTopBarIconContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1346: checkcast       Lgg/essential/elementa/UIComponent;
        //  1349: aload_0         /* this */
        //  1350: getfield        gg/essential/gui/studio/CosmeticOption.isLocked:Lgg/essential/elementa/state/MappedState;
        //  1353: checkcast       Lgg/essential/elementa/state/State;
        //  1356: iconst_0       
        //  1357: aconst_null    
        //  1358: bipush          12
        //  1360: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  1363: aload_0         /* this */
        //  1364: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1367: iconst_3       
        //  1368: aaload         
        //  1369: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1372: pop            
        //  1373: new             Lgg/essential/gui/studio/Tag;
        //  1376: dup            
        //  1377: getstatic       gg/essential/gui/EssentialPalette.RED:Ljava/awt/Color;
        //  1380: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  1383: aload_0         /* this */
        //  1384: getfield        gg/essential/gui/studio/CosmeticOption.activeSale:Lgg/essential/elementa/state/State;
        //  1387: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //  1390: checkcast       Lgg/essential/gui/state/Sale;
        //  1393: dup            
        //  1394: ifnull          1403
        //  1397: invokevirtual   gg/essential/gui/state/Sale.getDiscountPercent:()I
        //  1400: goto            1405
        //  1403: pop            
        //  1404: iconst_0       
        //  1405: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(I)Ljava/lang/String;
        //  1410: invokespecial   gg/essential/gui/studio/Tag.<init>:(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V
        //  1413: checkcast       Lgg/essential/elementa/UIComponent;
        //  1416: astore          $this$constrain$iv
        //  1418: aload           $this$constrain$iv
        //  1420: astore          7
        //  1422: aload           7
        //  1424: astore          $this$constrain_u24lambda_u2d0$iv
        //  1426: aload           $this$constrain_u24lambda_u2d0$iv
        //  1428: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1431: astore          $this$saleTag_delegate_u24lambda_u2d9
        //  1433: aload           $this$saleTag_delegate_u24lambda_u2d9
        //  1435: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1438: dup            
        //  1439: fconst_1       
        //  1440: iconst_0       
        //  1441: iconst_2       
        //  1442: aconst_null    
        //  1443: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1446: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1449: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1452: aload           7
        //  1454: aload_0         /* this */
        //  1455: checkcast       Lgg/essential/elementa/UIComponent;
        //  1458: new             Lgg/essential/gui/studio/CosmeticOption$saleTag$3;
        //  1461: dup            
        //  1462: aload_0         /* this */
        //  1463: invokespecial   gg/essential/gui/studio/CosmeticOption$saleTag$3.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //  1466: checkcast       Lkotlin/jvm/functions/Function0;
        //  1469: invokestatic    gg/essential/util/ExtensionsKt.pollingState$default$a9b5a09$5bde5825:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //  1472: aconst_null    
        //  1473: fconst_0       
        //  1474: aconst_null    
        //  1475: aconst_null    
        //  1476: bipush          30
        //  1478: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //  1481: aload_0         /* this */
        //  1482: invokespecial   gg/essential/gui/studio/CosmeticOption.getTopBarIconContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1485: checkcast       Lgg/essential/elementa/UIComponent;
        //  1488: aload_0         /* this */
        //  1489: getfield        gg/essential/gui/studio/CosmeticOption.isOnSale:Lgg/essential/elementa/state/MappedState;
        //  1492: checkcast       Lgg/essential/elementa/state/State;
        //  1495: new             Lgg/essential/elementa/state/BasicState;
        //  1498: dup            
        //  1499: aload_0         /* this */
        //  1500: invokespecial   gg/essential/gui/studio/CosmeticOption.isPurchased:()Z
        //  1503: ifne            1517
        //  1506: aload_0         /* this */
        //  1507: getfield        gg/essential/gui/studio/CosmeticOption.isFree:Z
        //  1510: ifne            1517
        //  1513: iconst_1       
        //  1514: goto            1518
        //  1517: iconst_0       
        //  1518: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1521: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1524: checkcast       Lgg/essential/elementa/state/State;
        //  1527: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1530: checkcast       Lgg/essential/elementa/state/State;
        //  1533: iconst_0       
        //  1534: aconst_null    
        //  1535: bipush          12
        //  1537: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  1540: aload_0         /* this */
        //  1541: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1544: iconst_4       
        //  1545: aaload         
        //  1546: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1549: pop            
        //  1550: new             Lgg/essential/gui/studio/Tag;
        //  1553: dup            
        //  1554: getstatic       gg/essential/gui/EssentialPalette.MESSAGE_SENT:Ljava/awt/Color;
        //  1557: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  1560: ldc_w           "i"
        //  1563: invokespecial   gg/essential/gui/studio/Tag.<init>:(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V
        //  1566: checkcast       Lgg/essential/elementa/UIComponent;
        //  1569: astore          $this$constrain$iv
        //  1571: aload           $this$constrain$iv
        //  1573: astore          7
        //  1575: aload           7
        //  1577: astore          $this$constrain_u24lambda_u2d0$iv
        //  1579: aload           $this$constrain_u24lambda_u2d0$iv
        //  1581: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1584: astore          $this$partnerIcon_delegate_u24lambda_u2d10
        //  1586: aload           $this$partnerIcon_delegate_u24lambda_u2d10
        //  1588: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1591: dup            
        //  1592: fconst_1       
        //  1593: iconst_0       
        //  1594: iconst_2       
        //  1595: aconst_null    
        //  1596: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1599: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1602: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1605: aload           $this$partnerIcon_delegate_u24lambda_u2d10
        //  1607: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //  1610: dup            
        //  1611: fconst_0       
        //  1612: iconst_1       
        //  1613: aconst_null    
        //  1614: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1617: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1620: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1623: aload           7
        //  1625: aload_0         /* this */
        //  1626: invokespecial   gg/essential/gui/studio/CosmeticOption.getTopBarIconContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1629: checkcast       Lgg/essential/elementa/UIComponent;
        //  1632: new             Lgg/essential/elementa/state/BasicState;
        //  1635: dup            
        //  1636: aload_0         /* this */
        //  1637: getfield        gg/essential/gui/studio/CosmeticOption.isPartnered:Z
        //  1640: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1643: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1646: checkcast       Lgg/essential/elementa/state/State;
        //  1649: aload_0         /* this */
        //  1650: getfield        gg/essential/gui/studio/CosmeticOption.isCartView:Lgg/essential/elementa/state/MappedState;
        //  1653: checkcast       Lgg/essential/elementa/state/State;
        //  1656: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1659: checkcast       Lgg/essential/elementa/state/State;
        //  1662: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1665: checkcast       Lgg/essential/elementa/state/State;
        //  1668: iconst_0       
        //  1669: aconst_null    
        //  1670: bipush          12
        //  1672: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  1675: new             Lgg/essential/elementa/state/BasicState;
        //  1678: dup            
        //  1679: aload_0         /* this */
        //  1680: getfield        gg/essential/gui/studio/CosmeticOption.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //  1683: aload_0         /* this */
        //  1684: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //  1687: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //  1690: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getPartnerName:(Ljava/lang/String;)Ljava/lang/String;
        //  1693: invokedynamic   BootstrapMethod #2, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //  1698: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1701: checkcast       Lgg/essential/elementa/state/State;
        //  1704: aconst_null    
        //  1705: fconst_0       
        //  1706: aconst_null    
        //  1707: aconst_null    
        //  1708: bipush          30
        //  1710: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //  1713: aload_0         /* this */
        //  1714: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1717: iconst_5       
        //  1718: aaload         
        //  1719: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1722: pop            
        //  1723: aload_0         /* this */
        //  1724: aload_0         /* this */
        //  1725: checkcast       Lgg/essential/elementa/UIComponent;
        //  1728: new             Lgg/essential/gui/studio/CosmeticOption$timerTooltip$1;
        //  1731: dup            
        //  1732: aload_0         /* this */
        //  1733: invokespecial   gg/essential/gui/studio/CosmeticOption$timerTooltip$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //  1736: checkcast       Lkotlin/jvm/functions/Function0;
        //  1739: invokestatic    gg/essential/util/ExtensionsKt.pollingState$default$a9b5a09$5bde5825:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //  1742: putfield        gg/essential/gui/studio/CosmeticOption.timerTooltip:Lgg/essential/elementa/state/State;
        //  1745: new             Lgg/essential/elementa/components/UIBlock;
        //  1748: dup            
        //  1749: getstatic       gg/essential/gui/EssentialPalette.RED:Ljava/awt/Color;
        //  1752: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  1755: checkcast       Lgg/essential/elementa/UIComponent;
        //  1758: astore          $this$constrain$iv
        //  1760: aload           $this$constrain$iv
        //  1762: astore          7
        //  1764: aload           7
        //  1766: astore          $this$constrain_u24lambda_u2d0$iv
        //  1768: aload           $this$constrain_u24lambda_u2d0$iv
        //  1770: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1773: astore          $this$timerTagBlock_delegate_u24lambda_u2d11
        //  1775: aload           $this$timerTagBlock_delegate_u24lambda_u2d11
        //  1777: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1780: dup            
        //  1781: fconst_1       
        //  1782: iconst_0       
        //  1783: iconst_2       
        //  1784: aconst_null    
        //  1785: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1788: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1791: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1794: aload           $this$timerTagBlock_delegate_u24lambda_u2d11
        //  1796: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1799: dup            
        //  1800: fconst_0       
        //  1801: iconst_1       
        //  1802: aconst_null    
        //  1803: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1806: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1809: bipush          6
        //  1811: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1814: checkcast       Ljava/lang/Number;
        //  1817: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1820: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1823: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1826: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1829: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1832: aload           $this$timerTagBlock_delegate_u24lambda_u2d11
        //  1834: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //  1837: dup            
        //  1838: fconst_0       
        //  1839: iconst_1       
        //  1840: aconst_null    
        //  1841: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1844: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1847: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1850: aload           7
        //  1852: astore          null
        //  1854: aload           5
        //  1856: checkcast       Lgg/essential/elementa/components/UIBlock;
        //  1859: astore          $this$timerTagBlock_delegate_u24lambda_u2d13
        //  1861: aload           $this$timerTagBlock_delegate_u24lambda_u2d13
        //  1863: new             Lgg/essential/gui/common/SequenceAnimatedUIImage;
        //  1866: dup            
        //  1867: ldc_w           "/assets/essential/textures/studio/clock_%d.png"
        //  1870: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //  1873: invokespecial   gg/essential/gui/common/SequenceAnimatedUIImage.<init>:(Ljava/lang/String;Ljava/util/concurrent/TimeUnit;)V
        //  1876: checkcast       Lgg/essential/elementa/UIComponent;
        //  1879: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1882: astore          $this$constrain$iv
        //  1884: aload           $this$constrain$iv
        //  1886: astore          10
        //  1888: aload           10
        //  1890: astore          $this$constrain_u24lambda_u2d0$iv
        //  1892: aload           $this$constrain_u24lambda_u2d0$iv
        //  1894: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1897: astore          13
        //  1899: astore          14
        //  1901: aload           $this$timerTagBlock_delegate_u24lambda_u2d13_u24lambda_u2d12
        //  1903: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  1906: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  1909: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1912: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1915: aload           14
        //  1917: aload           10
        //  1919: invokevirtual   gg/essential/elementa/components/UIBlock.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1922: pop            
        //  1923: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1926: pop            
        //  1927: aload           5
        //  1929: aload_0         /* this */
        //  1930: getfield        gg/essential/gui/studio/CosmeticOption.timerTooltip:Lgg/essential/elementa/state/State;
        //  1933: aconst_null    
        //  1934: fconst_0       
        //  1935: aconst_null    
        //  1936: aconst_null    
        //  1937: bipush          30
        //  1939: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //  1942: aload_0         /* this */
        //  1943: invokespecial   gg/essential/gui/studio/CosmeticOption.getTopBarIconContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1946: checkcast       Lgg/essential/elementa/UIComponent;
        //  1949: new             Lgg/essential/elementa/state/BasicState;
        //  1952: dup            
        //  1953: aload_0         /* this */
        //  1954: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //  1957: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getAvailableUntil:()Ljava/time/Instant;
        //  1960: ifnull          1967
        //  1963: iconst_1       
        //  1964: goto            1968
        //  1967: iconst_0       
        //  1968: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1971: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1974: checkcast       Lgg/essential/elementa/state/State;
        //  1977: aload_0         /* this */
        //  1978: getfield        gg/essential/gui/studio/CosmeticOption.timerTooltip:Lgg/essential/elementa/state/State;
        //  1981: getstatic       gg/essential/gui/studio/CosmeticOption$timerTagBlock$4.INSTANCE:Lgg/essential/gui/studio/CosmeticOption$timerTagBlock$4;
        //  1984: checkcast       Lkotlin/jvm/functions/Function1;
        //  1987: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1990: checkcast       Lgg/essential/elementa/state/State;
        //  1993: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  1996: checkcast       Lgg/essential/elementa/state/State;
        //  1999: aload_0         /* this */
        //  2000: getfield        gg/essential/gui/studio/CosmeticOption.owned:Lgg/essential/elementa/state/MappedState;
        //  2003: checkcast       Lgg/essential/elementa/state/State;
        //  2006: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  2009: checkcast       Lgg/essential/elementa/state/State;
        //  2012: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  2015: checkcast       Lgg/essential/elementa/state/State;
        //  2018: iconst_0       
        //  2019: aconst_null    
        //  2020: bipush          12
        //  2022: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  2025: aload_0         /* this */
        //  2026: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2029: bipush          6
        //  2031: aaload         
        //  2032: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2035: pop            
        //  2036: new             Lgg/essential/gui/studio/Tag;
        //  2039: dup            
        //  2040: getstatic       gg/essential/gui/EssentialPalette.ESSENTIAL_RED:Ljava/awt/Color;
        //  2043: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  2046: ldc_w           "LOCAL"
        //  2049: invokespecial   gg/essential/gui/studio/Tag.<init>:(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V
        //  2052: checkcast       Lgg/essential/elementa/UIComponent;
        //  2055: astore          $this$constrain$iv
        //  2057: aload           $this$constrain$iv
        //  2059: astore          7
        //  2061: aload           7
        //  2063: astore          $this$constrain_u24lambda_u2d0$iv
        //  2065: aload           $this$constrain_u24lambda_u2d0$iv
        //  2067: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2070: astore          $this$localTag_delegate_u24lambda_u2d14
        //  2072: aload           $this$localTag_delegate_u24lambda_u2d14
        //  2074: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  2077: dup            
        //  2078: fconst_1       
        //  2079: iconst_0       
        //  2080: iconst_2       
        //  2081: aconst_null    
        //  2082: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2085: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2088: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2091: aload           7
        //  2093: aload_0         /* this */
        //  2094: invokespecial   gg/essential/gui/studio/CosmeticOption.getTopBarIconContainer:()Lgg/essential/elementa/components/UIContainer;
        //  2097: checkcast       Lgg/essential/elementa/UIComponent;
        //  2100: new             Lgg/essential/elementa/state/BasicState;
        //  2103: dup            
        //  2104: aload_0         /* this */
        //  2105: getfield        gg/essential/gui/studio/CosmeticOption.isLocal:Z
        //  2108: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2111: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  2114: checkcast       Lgg/essential/elementa/state/State;
        //  2117: iconst_0       
        //  2118: aconst_null    
        //  2119: bipush          12
        //  2121: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  2124: aload_0         /* this */
        //  2125: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2128: bipush          7
        //  2130: aaload         
        //  2131: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2134: pop            
        //  2135: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //  2138: dup            
        //  2139: getstatic       gg/essential/gui/EssentialPalette.CHECKMARK_8X6:Lgg/essential/gui/image/ImageFactory;
        //  2142: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //  2145: getstatic       gg/essential/gui/EssentialPalette.GREEN:Ljava/awt/Color;
        //  2148: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //  2151: checkcast       Lgg/essential/elementa/state/State;
        //  2154: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //  2157: checkcast       Lgg/essential/elementa/UIComponent;
        //  2160: astore          $this$constrain$iv
        //  2162: aload           $this$constrain$iv
        //  2164: astore          7
        //  2166: aload           7
        //  2168: astore          $this$constrain_u24lambda_u2d0$iv
        //  2170: aload           $this$constrain_u24lambda_u2d0$iv
        //  2172: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2175: astore          $this$purchaseImage_delegate_u24lambda_u2d15
        //  2177: aload           $this$purchaseImage_delegate_u24lambda_u2d15
        //  2179: iconst_3       
        //  2180: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2183: checkcast       Ljava/lang/Number;
        //  2186: iconst_1       
        //  2187: iconst_0       
        //  2188: iconst_2       
        //  2189: aconst_null    
        //  2190: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2193: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2196: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2199: aload           $this$purchaseImage_delegate_u24lambda_u2d15
        //  2201: iconst_3       
        //  2202: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2205: checkcast       Ljava/lang/Number;
        //  2208: iconst_1       
        //  2209: iconst_0       
        //  2210: iconst_2       
        //  2211: aconst_null    
        //  2212: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2215: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2218: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2221: aload           7
        //  2223: aload_0         /* this */
        //  2224: checkcast       Lgg/essential/elementa/UIComponent;
        //  2227: aload_0         /* this */
        //  2228: getfield        gg/essential/gui/studio/CosmeticOption.owned:Lgg/essential/elementa/state/MappedState;
        //  2231: checkcast       Lgg/essential/elementa/state/State;
        //  2234: new             Lgg/essential/elementa/state/BasicState;
        //  2237: dup            
        //  2238: aload_0         /* this */
        //  2239: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //  2242: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //  2245: ldc_w           "CAPE_DISABLED"
        //  2248: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2251: ifne            2258
        //  2254: iconst_1       
        //  2255: goto            2259
        //  2258: iconst_0       
        //  2259: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2262: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  2265: checkcast       Lgg/essential/elementa/state/State;
        //  2268: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  2271: checkcast       Lgg/essential/elementa/state/State;
        //  2274: iconst_0       
        //  2275: aconst_null    
        //  2276: bipush          12
        //  2278: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  2281: new             Lgg/essential/elementa/state/BasicState;
        //  2284: dup            
        //  2285: ldc_w           "Item Owned"
        //  2288: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  2291: checkcast       Lgg/essential/elementa/state/State;
        //  2294: aconst_null    
        //  2295: fconst_0       
        //  2296: aconst_null    
        //  2297: aconst_null    
        //  2298: bipush          30
        //  2300: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //  2303: aload_0         /* this */
        //  2304: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2307: bipush          8
        //  2309: aaload         
        //  2310: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2313: pop            
        //  2314: new             Lgg/essential/elementa/components/UIBlock;
        //  2317: dup            
        //  2318: aconst_null    
        //  2319: iconst_1       
        //  2320: aconst_null    
        //  2321: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2324: checkcast       Lgg/essential/elementa/UIComponent;
        //  2327: astore          $this$constrain$iv
        //  2329: aload           $this$constrain$iv
        //  2331: astore          7
        //  2333: aload           7
        //  2335: astore          $this$constrain_u24lambda_u2d0$iv
        //  2337: aload           $this$constrain_u24lambda_u2d0$iv
        //  2339: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2342: astore          $this$lockedAction_delegate_u24lambda_u2d16
        //  2344: aload           $this$lockedAction_delegate_u24lambda_u2d16
        //  2346: bipush          11
        //  2348: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2351: checkcast       Ljava/lang/Number;
        //  2354: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2357: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2360: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2363: aload           $this$lockedAction_delegate_u24lambda_u2d16
        //  2365: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //  2368: dup            
        //  2369: fconst_0       
        //  2370: iconst_1       
        //  2371: aconst_null    
        //  2372: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2375: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2378: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2381: aload           7
        //  2383: astore          null
        //  2385: aload           5
        //  2387: checkcast       Lgg/essential/elementa/components/UIBlock;
        //  2390: astore          $this$lockedAction_delegate_u24lambda_u2d23
        //  2392: aload           $this$lockedAction_delegate_u24lambda_u2d23
        //  2394: aload           $this$lockedAction_delegate_u24lambda_u2d23
        //  2396: checkcast       Lgg/essential/elementa/UIComponent;
        //  2399: iconst_0       
        //  2400: iconst_0       
        //  2401: iconst_3       
        //  2402: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //  2405: getstatic       gg/essential/gui/studio/CosmeticOption$lockedAction$3$1.INSTANCE:Lgg/essential/gui/studio/CosmeticOption$lockedAction$3$1;
        //  2408: checkcast       Lkotlin/jvm/functions/Function1;
        //  2411: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  2414: checkcast       Lgg/essential/elementa/state/State;
        //  2417: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  2420: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  2423: invokevirtual   gg/essential/elementa/components/UIBlock.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //  2426: pop            
        //  2427: new             Lgg/essential/elementa/components/UIBlock;
        //  2430: dup            
        //  2431: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //  2434: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  2437: checkcast       Lgg/essential/elementa/UIComponent;
        //  2440: astore          $this$constrain$iv
        //  2442: aload           $this$constrain$iv
        //  2444: astore          10
        //  2446: aload           10
        //  2448: astore          $this$constrain_u24lambda_u2d0$iv
        //  2450: aload           $this$constrain_u24lambda_u2d0$iv
        //  2452: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2455: astore          $this$lockedAction_delegate_u24lambda_u2d23_u24lambda_u2d17
        //  2457: aload           $this$lockedAction_delegate_u24lambda_u2d23_u24lambda_u2d17
        //  2459: bipush          100
        //  2461: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2464: checkcast       Ljava/lang/Number;
        //  2467: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2470: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2473: iconst_2       
        //  2474: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2477: checkcast       Ljava/lang/Number;
        //  2480: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2483: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2486: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2489: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2492: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2495: aload           $this$lockedAction_delegate_u24lambda_u2d23_u24lambda_u2d17
        //  2497: bipush          100
        //  2499: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2502: checkcast       Ljava/lang/Number;
        //  2505: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2508: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2511: iconst_2       
        //  2512: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2515: checkcast       Ljava/lang/Number;
        //  2518: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2521: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2524: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2527: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2530: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2533: aload           10
        //  2535: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2538: aload           $this$lockedAction_delegate_u24lambda_u2d23
        //  2540: checkcast       Lgg/essential/elementa/UIComponent;
        //  2543: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2546: aconst_null    
        //  2547: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2550: bipush          9
        //  2552: aaload         
        //  2553: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2556: astore          contentBlock$delegate
        //  2558: getstatic       gg/essential/gui/EssentialPalette.JOIN_ARROW_5X:Lgg/essential/gui/image/ImageFactory;
        //  2561: invokevirtual   gg/essential/gui/image/ImageFactory.create:()Lgg/essential/elementa/components/UIImage;
        //  2564: checkcast       Lgg/essential/elementa/UIComponent;
        //  2567: astore          $this$constrain$iv
        //  2569: aload           $this$constrain$iv
        //  2571: astore          10
        //  2573: aload           10
        //  2575: astore          $this$constrain_u24lambda_u2d0$iv
        //  2577: aload           $this$constrain_u24lambda_u2d0$iv
        //  2579: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2582: astore          $this$lockedAction_delegate_u24lambda_u2d23_u24lambda_u2d19
        //  2584: aload           $this$lockedAction_delegate_u24lambda_u2d23_u24lambda_u2d19
        //  2586: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //  2589: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  2592: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  2595: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  2598: aload           10
        //  2600: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2603: aload           contentBlock$delegate
        //  2605: invokestatic    gg/essential/gui/studio/CosmeticOption.lockedAction_delegate$lambda-23$lambda-18:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIBlock;
        //  2608: checkcast       Lgg/essential/elementa/UIComponent;
        //  2611: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2614: pop            
        //  2615: aload_0         /* this */
        //  2616: getfield        gg/essential/gui/studio/CosmeticOption.cosmetic:Lgg/essential/network/cosmetics/Cosmetic;
        //  2619: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getSettings:()Ljava/util/List;
        //  2622: checkcast       Ljava/lang/Iterable;
        //  2625: astore          11
        //  2627: aload           11
        //  2629: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  2634: astore          12
        //  2636: aload           12
        //  2638: invokeinterface java/util/Iterator.hasNext:()Z
        //  2643: ifeq            2681
        //  2646: aload           12
        //  2648: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2653: astore          13
        //  2655: aload           13
        //  2657: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //  2660: astore          it
        //  2662: aload           it
        //  2664: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getType:()Ljava/lang/String;
        //  2667: ldc_w           "REQUIRES_UNLOCK_ACTION"
        //  2670: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2673: ifeq            2636
        //  2676: aload           13
        //  2678: goto            2682
        //  2681: aconst_null    
        //  2682: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
        //  2685: dup            
        //  2686: ifnonnull       2693
        //  2689: pop            
        //  2690: goto            2810
        //  2693: astore          actionSetting
        //  2695: aload           actionSetting
        //  2697: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:()Ljava/util/Map;
        //  2700: ldc_w           "ACTION_TYPE"
        //  2703: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2708: dup            
        //  2709: ifnull          2809
        //  2712: astore          actionType
        //  2714: aload           actionType
        //  2716: checkcast       Ljava/lang/String;
        //  2719: ldc_w           "OPEN_LINK"
        //  2722: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2725: ifeq            2798
        //  2728: aload           $this$lockedAction_delegate_u24lambda_u2d23
        //  2730: checkcast       Lgg/essential/elementa/UIComponent;
        //  2733: new             Lgg/essential/elementa/state/BasicState;
        //  2736: dup            
        //  2737: aload           actionSetting
        //  2739: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:()Ljava/util/Map;
        //  2742: ldc_w           "LINK_SHORT"
        //  2745: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2750: dup            
        //  2751: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //  2754: checkcast       Ljava/lang/String;
        //  2757: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  2760: checkcast       Lgg/essential/elementa/state/State;
        //  2763: aconst_null    
        //  2764: fconst_0       
        //  2765: aconst_null    
        //  2766: aconst_null    
        //  2767: bipush          30
        //  2769: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //  2772: pop            
        //  2773: aload           $this$lockedAction_delegate_u24lambda_u2d23
        //  2775: checkcast       Lgg/essential/elementa/UIComponent;
        //  2778: astore          $this$onLeftClick$iv
        //  2780: aload           $this$onLeftClick$iv
        //  2782: new             Lgg/essential/gui/studio/CosmeticOption$lockedAction_delegate$lambda-23$lambda-22$$inlined$onLeftClick$1;
        //  2785: dup            
        //  2786: aload           actionSetting
        //  2788: invokespecial   gg/essential/gui/studio/CosmeticOption$lockedAction_delegate$lambda-23$lambda-22$$inlined$onLeftClick$1.<init>:(Lgg/essential/mod/cosmetics/CosmeticSetting;)V
        //  2791: checkcast       Lkotlin/jvm/functions/Function2;
        //  2794: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  2797: pop            
        //  2798: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  2801: pop            
        //  2802: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  2805: pop            
        //  2806: goto            2810
        //  2809: pop            
        //  2810: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  2813: pop            
        //  2814: aload           5
        //  2816: astore          $this$constrain$iv
        //  2818: aload           $this$constrain$iv
        //  2820: astore          7
        //  2822: aload           7
        //  2824: astore          $this$constrain_u24lambda_u2d0$iv
        //  2826: aload           $this$constrain_u24lambda_u2d0$iv
        //  2828: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2831: astore          $this$lockedAction_delegate_u24lambda_u2d24
        //  2833: aload           $this$lockedAction_delegate_u24lambda_u2d24
        //  2835: iconst_0       
        //  2836: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2839: checkcast       Ljava/lang/Number;
        //  2842: iconst_1       
        //  2843: iconst_0       
        //  2844: iconst_2       
        //  2845: aconst_null    
        //  2846: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2849: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2852: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2855: aload           $this$lockedAction_delegate_u24lambda_u2d24
        //  2857: iconst_0       
        //  2858: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2861: checkcast       Ljava/lang/Number;
        //  2864: iconst_1       
        //  2865: iconst_0       
        //  2866: iconst_2       
        //  2867: aconst_null    
        //  2868: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2871: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2874: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2877: aload           7
        //  2879: aload_0         /* this */
        //  2880: checkcast       Lgg/essential/elementa/UIComponent;
        //  2883: aload_0         /* this */
        //  2884: getfield        gg/essential/gui/studio/CosmeticOption.isLocked:Lgg/essential/elementa/state/MappedState;
        //  2887: checkcast       Lgg/essential/elementa/state/State;
        //  2890: aload_0         /* this */
        //  2891: getfield        gg/essential/gui/studio/CosmeticOption.isCartView:Lgg/essential/elementa/state/MappedState;
        //  2894: checkcast       Lgg/essential/elementa/state/State;
        //  2897: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  2900: checkcast       Lgg/essential/elementa/state/State;
        //  2903: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  2906: checkcast       Lgg/essential/elementa/state/State;
        //  2909: iconst_0       
        //  2910: aconst_null    
        //  2911: bipush          12
        //  2913: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  2916: aload_0         /* this */
        //  2917: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2920: bipush          10
        //  2922: aaload         
        //  2923: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2926: pop            
        //  2927: aload_0         /* this */
        //  2928: aload_0         /* this */
        //  2929: getfield        gg/essential/gui/studio/CosmeticOption.view:Lgg/essential/gui/common/WeakState;
        //  2932: aload_0         /* this */
        //  2933: getfield        gg/essential/gui/studio/CosmeticOption.activeSale:Lgg/essential/elementa/state/State;
        //  2936: invokevirtual   gg/essential/gui/common/WeakState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //  2939: new             Lgg/essential/gui/studio/CosmeticOption$priceTextState$1;
        //  2942: dup            
        //  2943: aload_0         /* this */
        //  2944: invokespecial   gg/essential/gui/studio/CosmeticOption$priceTextState$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //  2947: checkcast       Lkotlin/jvm/functions/Function1;
        //  2950: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  2953: putfield        gg/essential/gui/studio/CosmeticOption.priceTextState:Lgg/essential/elementa/state/MappedState;
        //  2956: new             Lgg/essential/elementa/components/UIWrappedText;
        //  2959: dup            
        //  2960: aconst_null    
        //  2961: iconst_0       
        //  2962: aconst_null    
        //  2963: iconst_0       
        //  2964: iconst_0       
        //  2965: fconst_0       
        //  2966: aconst_null    
        //  2967: bipush          127
        //  2969: aconst_null    
        //  2970: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2973: aload_0         /* this */
        //  2974: getfield        gg/essential/gui/studio/CosmeticOption.priceTextState:Lgg/essential/elementa/state/MappedState;
        //  2977: checkcast       Lgg/essential/elementa/state/State;
        //  2980: invokevirtual   gg/essential/elementa/components/UIWrappedText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIWrappedText;
        //  2983: checkcast       Lgg/essential/elementa/UIComponent;
        //  2986: aload_0         /* this */
        //  2987: getfield        gg/essential/gui/studio/CosmeticOption.view:Lgg/essential/gui/common/WeakState;
        //  2990: checkcast       Lgg/essential/elementa/state/State;
        //  2993: getstatic       gg/essential/gui/studio/CosmeticOption$priceText$2.INSTANCE:Lgg/essential/gui/studio/CosmeticOption$priceText$2;
        //  2996: checkcast       Lkotlin/jvm/functions/Function2;
        //  2999: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  3002: aload_0         /* this */
        //  3003: checkcast       Lgg/essential/elementa/UIComponent;
        //  3006: aload_0         /* this */
        //  3007: getfield        gg/essential/gui/studio/CosmeticOption.owned:Lgg/essential/elementa/state/MappedState;
        //  3010: checkcast       Lgg/essential/elementa/state/State;
        //  3013: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3016: checkcast       Lgg/essential/elementa/state/State;
        //  3019: iconst_0       
        //  3020: aconst_null    
        //  3021: bipush          12
        //  3023: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  3026: aload_0         /* this */
        //  3027: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  3030: bipush          11
        //  3032: aaload         
        //  3033: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  3036: pop            
        //  3037: new             Lgg/essential/gui/studio/CosmeticOption$CartGridButton;
        //  3040: dup            
        //  3041: aload_0         /* this */
        //  3042: invokespecial   gg/essential/gui/studio/CosmeticOption$CartGridButton.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //  3045: checkcast       Lgg/essential/elementa/UIComponent;
        //  3048: astore          $this$constrain$iv
        //  3050: aload           $this$constrain$iv
        //  3052: astore          7
        //  3054: aload           7
        //  3056: astore          $this$constrain_u24lambda_u2d0$iv
        //  3058: aload           $this$constrain_u24lambda_u2d0$iv
        //  3060: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  3063: astore          $this$cartGridButton_delegate_u24lambda_u2d25
        //  3065: aload           $this$cartGridButton_delegate_u24lambda_u2d25
        //  3067: iconst_0       
        //  3068: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3071: checkcast       Ljava/lang/Number;
        //  3074: iconst_1       
        //  3075: iconst_0       
        //  3076: iconst_2       
        //  3077: aconst_null    
        //  3078: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3081: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  3084: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  3087: aload           $this$cartGridButton_delegate_u24lambda_u2d25
        //  3089: iconst_0       
        //  3090: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3093: checkcast       Ljava/lang/Number;
        //  3096: iconst_1       
        //  3097: iconst_0       
        //  3098: iconst_2       
        //  3099: aconst_null    
        //  3100: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3103: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  3106: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  3109: aload           7
        //  3111: aload_0         /* this */
        //  3112: checkcast       Lgg/essential/elementa/UIComponent;
        //  3115: aload_0         /* this */
        //  3116: getfield        gg/essential/gui/studio/CosmeticOption.isCartView:Lgg/essential/elementa/state/MappedState;
        //  3119: checkcast       Lgg/essential/elementa/state/State;
        //  3122: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3125: checkcast       Lgg/essential/elementa/state/State;
        //  3128: aload_0         /* this */
        //  3129: getfield        gg/essential/gui/studio/CosmeticOption.owned:Lgg/essential/elementa/state/MappedState;
        //  3132: checkcast       Lgg/essential/elementa/state/State;
        //  3135: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3138: checkcast       Lgg/essential/elementa/state/State;
        //  3141: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3144: checkcast       Lgg/essential/elementa/state/State;
        //  3147: aload_0         /* this */
        //  3148: getfield        gg/essential/gui/studio/CosmeticOption.isLocked:Lgg/essential/elementa/state/MappedState;
        //  3151: checkcast       Lgg/essential/elementa/state/State;
        //  3154: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3157: checkcast       Lgg/essential/elementa/state/State;
        //  3160: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3163: checkcast       Lgg/essential/elementa/state/State;
        //  3166: iconst_0       
        //  3167: aconst_null    
        //  3168: bipush          12
        //  3170: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  3173: aload_0         /* this */
        //  3174: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  3177: bipush          12
        //  3179: aaload         
        //  3180: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  3183: pop            
        //  3184: new             Lgg/essential/gui/common/IconButton;
        //  3187: dup            
        //  3188: getstatic       gg/essential/gui/EssentialPalette.CANCEL_5X:Lgg/essential/gui/image/ImageFactory;
        //  3191: ldc_w           ""
        //  3194: ldc_w           "Remove Item"
        //  3197: iconst_0       
        //  3198: iconst_0       
        //  3199: iconst_0       
        //  3200: bipush          56
        //  3202: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //  3205: getstatic       gg/essential/gui/EssentialPalette.BUTTON:Ljava/awt/Color;
        //  3208: invokevirtual   gg/essential/gui/common/IconButton.setColor:(Ljava/awt/Color;)Lgg/essential/elementa/UIComponent;
        //  3211: astore          $this$onLeftClick$iv
        //  3213: aload           $this$onLeftClick$iv
        //  3215: new             Lgg/essential/gui/studio/CosmeticOption$special$$inlined$onLeftClick$1;
        //  3218: dup            
        //  3219: aload_0         /* this */
        //  3220: invokespecial   gg/essential/gui/studio/CosmeticOption$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //  3223: checkcast       Lkotlin/jvm/functions/Function2;
        //  3226: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  3229: astore          $this$constrain$iv
        //  3231: aload           $this$constrain$iv
        //  3233: astore          7
        //  3235: aload           7
        //  3237: astore          $this$constrain_u24lambda_u2d0$iv
        //  3239: aload           $this$constrain_u24lambda_u2d0$iv
        //  3241: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  3244: astore          $this$removeCartButton_u24lambda_u2d27
        //  3246: aload           $this$removeCartButton_u24lambda_u2d27
        //  3248: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  3251: dup            
        //  3252: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  3255: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  3258: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  3261: aload           $this$removeCartButton_u24lambda_u2d27
        //  3263: iconst_4       
        //  3264: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3267: checkcast       Ljava/lang/Number;
        //  3270: iconst_1       
        //  3271: iconst_0       
        //  3272: iconst_2       
        //  3273: aconst_null    
        //  3274: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3277: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  3280: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  3283: aload           7
        //  3285: aload_0         /* this */
        //  3286: checkcast       Lgg/essential/elementa/UIComponent;
        //  3289: aload_0         /* this */
        //  3290: getfield        gg/essential/gui/studio/CosmeticOption.isCartView:Lgg/essential/elementa/state/MappedState;
        //  3293: checkcast       Lgg/essential/elementa/state/State;
        //  3296: iconst_0       
        //  3297: aconst_null    
        //  3298: bipush          12
        //  3300: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  3303: pop            
        //  3304: aload_0         /* this */
        //  3305: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //  3308: dup            
        //  3309: getstatic       gg/essential/gui/EssentialPalette.SLIDERS_9X:Lgg/essential/gui/image/ImageFactory;
        //  3312: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //  3315: checkcast       Lgg/essential/elementa/UIComponent;
        //  3318: astore          $this$constrain$iv
        //  3320: aload           $this$constrain$iv
        //  3322: astore          7
        //  3324: aload           7
        //  3326: astore          $this$constrain_u24lambda_u2d0$iv
        //  3328: aload           $this$constrain_u24lambda_u2d0$iv
        //  3330: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  3333: astore          10
        //  3335: astore          16
        //  3337: aload           $this$settingsImage_u24lambda_u2d28
        //  3339: iconst_2       
        //  3340: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3343: checkcast       Ljava/lang/Number;
        //  3346: iconst_1       
        //  3347: iconst_0       
        //  3348: iconst_2       
        //  3349: aconst_null    
        //  3350: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3353: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  3356: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  3359: aload           $this$settingsImage_u24lambda_u2d28
        //  3361: iconst_2       
        //  3362: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3365: checkcast       Ljava/lang/Number;
        //  3368: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3371: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  3374: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  3377: aload           16
        //  3379: aload           7
        //  3381: astore          $this$onLeftClick$iv
        //  3383: aload           $this$onLeftClick$iv
        //  3385: new             Lgg/essential/gui/studio/CosmeticOption$special$$inlined$onLeftClick$2;
        //  3388: dup            
        //  3389: aload_0         /* this */
        //  3390: invokespecial   gg/essential/gui/studio/CosmeticOption$special$$inlined$onLeftClick$2.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //  3393: checkcast       Lkotlin/jvm/functions/Function2;
        //  3396: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  3399: ldc_w           "Adjust Position"
        //  3402: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //  3405: checkcast       Lgg/essential/elementa/state/State;
        //  3408: aconst_null    
        //  3409: fconst_0       
        //  3410: aconst_null    
        //  3411: aconst_null    
        //  3412: bipush          30
        //  3414: invokestatic    gg/essential/util/ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
        //  3417: aload_0         /* this */
        //  3418: checkcast       Lgg/essential/elementa/UIComponent;
        //  3421: aload_0         /* this */
        //  3422: getfield        gg/essential/gui/studio/CosmeticOption.isConfigurable:Lgg/essential/elementa/state/MappedState;
        //  3425: checkcast       Lgg/essential/elementa/state/State;
        //  3428: aload_0         /* this */
        //  3429: getfield        gg/essential/gui/studio/CosmeticOption.isCartView:Lgg/essential/elementa/state/MappedState;
        //  3432: checkcast       Lgg/essential/elementa/state/State;
        //  3435: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3438: checkcast       Lgg/essential/elementa/state/State;
        //  3441: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3444: checkcast       Lgg/essential/elementa/state/State;
        //  3447: iconst_0       
        //  3448: aconst_null    
        //  3449: bipush          12
        //  3451: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  3454: putfield        gg/essential/gui/studio/CosmeticOption.settingsImage:Lgg/essential/elementa/UIComponent;
        //  3457: new             Lgg/essential/gui/studio/CosmeticOption$PlacementOptions;
        //  3460: dup            
        //  3461: aload_0         /* this */
        //  3462: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //  3465: checkcast       Lgg/essential/elementa/UIComponent;
        //  3468: aload_0         /* this */
        //  3469: checkcast       Lgg/essential/elementa/UIComponent;
        //  3472: aload_0         /* this */
        //  3473: getfield        gg/essential/gui/studio/CosmeticOption.editingPlacement:Lgg/essential/elementa/state/BasicState;
        //  3476: checkcast       Lgg/essential/elementa/state/State;
        //  3479: iconst_0       
        //  3480: aconst_null    
        //  3481: bipush          12
        //  3483: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  3486: aload_0         /* this */
        //  3487: getstatic       gg/essential/gui/studio/CosmeticOption.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  3490: bipush          13
        //  3492: aaload         
        //  3493: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  3496: pop            
        //  3497: aload_0         /* this */
        //  3498: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //  3501: aload_0         /* this */
        //  3502: checkcast       Lgg/essential/elementa/UIComponent;
        //  3505: iconst_0       
        //  3506: iconst_0       
        //  3507: iconst_3       
        //  3508: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //  3511: invokevirtual   gg/essential/gui/EssentialPalette.getButtonColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //  3514: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  3517: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  3520: invokevirtual   gg/essential/gui/studio/CosmeticOption.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //  3523: pop            
        //  3524: aload_0         /* this */
        //  3525: checkcast       Lgg/essential/elementa/UIComponent;
        //  3528: aload_0         /* this */
        //  3529: getfield        gg/essential/gui/studio/CosmeticOption.view:Lgg/essential/gui/common/WeakState;
        //  3532: checkcast       Lgg/essential/elementa/state/State;
        //  3535: new             Lgg/essential/gui/studio/CosmeticOption$1;
        //  3538: dup            
        //  3539: aload_0         /* this */
        //  3540: invokespecial   gg/essential/gui/studio/CosmeticOption$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //  3543: checkcast       Lkotlin/jvm/functions/Function2;
        //  3546: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindConstraints:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  3549: pop            
        //  3550: aload_0         /* this */
        //  3551: checkcast       Lgg/essential/elementa/UIComponent;
        //  3554: astore          $this$onLeftClick$iv
        //  3556: aload           $this$onLeftClick$iv
        //  3558: new             Lgg/essential/gui/studio/CosmeticOption$special$$inlined$onLeftClick$3;
        //  3561: dup            
        //  3562: aload_0         /* this */
        //  3563: invokespecial   gg/essential/gui/studio/CosmeticOption$special$$inlined$onLeftClick$3.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //  3566: checkcast       Lkotlin/jvm/functions/Function2;
        //  3569: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  3572: pop            
        //  3573: aload_0         /* this */
        //  3574: checkcast       Lgg/essential/elementa/UIComponent;
        //  3577: new             Lgg/essential/elementa/effects/OutlineEffect;
        //  3580: dup            
        //  3581: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //  3584: fconst_1       
        //  3585: iconst_0       
        //  3586: iconst_0       
        //  3587: aconst_null    
        //  3588: bipush          28
        //  3590: aconst_null    
        //  3591: invokespecial   gg/essential/elementa/effects/OutlineEffect.<init>:(Ljava/awt/Color;FZZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  3594: checkcast       Lgg/essential/elementa/effects/Effect;
        //  3597: aload_0         /* this */
        //  3598: getfield        gg/essential/gui/studio/CosmeticOption.isCartView:Lgg/essential/elementa/state/MappedState;
        //  3601: checkcast       Lgg/essential/elementa/state/State;
        //  3604: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3607: checkcast       Lgg/essential/elementa/state/State;
        //  3610: aload_0         /* this */
        //  3611: getfield        gg/essential/gui/studio/CosmeticOption.isPreviewing:Lgg/essential/elementa/state/MappedState;
        //  3614: checkcast       Lgg/essential/elementa/state/State;
        //  3617: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3620: checkcast       Lgg/essential/elementa/state/State;
        //  3623: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindEffect$default$21ee9c1f$52d905c5:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/UIComponent;
        //  3626: pop            
        //  3627: aload_0         /* this */
        //  3628: checkcast       Lgg/essential/elementa/UIComponent;
        //  3631: new             Lgg/essential/elementa/effects/OutlineEffect;
        //  3634: dup            
        //  3635: getstatic       gg/essential/gui/EssentialPalette.ACCENT_BLUE:Ljava/awt/Color;
        //  3638: fconst_1       
        //  3639: iconst_0       
        //  3640: iconst_0       
        //  3641: aconst_null    
        //  3642: bipush          28
        //  3644: aconst_null    
        //  3645: invokespecial   gg/essential/elementa/effects/OutlineEffect.<init>:(Ljava/awt/Color;FZZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  3648: checkcast       Lgg/essential/elementa/effects/Effect;
        //  3651: aload_0         /* this */
        //  3652: getfield        gg/essential/gui/studio/CosmeticOption.isCartView:Lgg/essential/elementa/state/MappedState;
        //  3655: checkcast       Lgg/essential/elementa/state/State;
        //  3658: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3661: checkcast       Lgg/essential/elementa/state/State;
        //  3664: aload_0         /* this */
        //  3665: checkcast       Lgg/essential/elementa/UIComponent;
        //  3668: new             Lgg/essential/gui/studio/CosmeticOption$3;
        //  3671: dup            
        //  3672: aload_0         /* this */
        //  3673: invokespecial   gg/essential/gui/studio/CosmeticOption$3.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
        //  3676: checkcast       Lkotlin/jvm/functions/Function0;
        //  3679: invokestatic    gg/essential/util/ExtensionsKt.pollingState$default$a9b5a09$5bde5825:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //  3682: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3685: checkcast       Lgg/essential/elementa/state/State;
        //  3688: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindEffect$default$21ee9c1f$52d905c5:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/UIComponent;
        //  3691: pop            
        //  3692: return         
        //    MethodParameters:
        //  Name              Flags  
        //  ----------------  -----
        //  cosmeticsManager  
        //  cosmetic          
        //  window            
        //  cosmeticStudio    
        //    StackMapTable: 00 1E FF 00 AF 00 01 07 00 02 00 02 07 00 02 07 01 2A FF 00 01 00 01 07 00 02 00 02 07 00 02 07 01 30 FF 01 2C 00 11 07 00 02 00 00 00 00 07 01 B4 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 08 00 11 07 00 02 00 00 00 00 00 00 07 01 BF 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 2B 00 11 07 00 02 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 40 01 FF 00 70 00 01 07 00 02 00 02 07 00 02 07 01 2A FF 00 01 00 01 07 00 02 00 02 07 00 02 07 01 30 63 07 00 02 FF 00 0D 00 01 07 00 02 00 02 07 00 02 07 02 03 FF 00 36 00 01 07 00 02 00 04 07 00 02 08 02 DA 08 02 DA 07 02 24 FF 01 C8 00 0A 07 00 02 00 00 00 00 07 02 0D 07 00 04 00 00 07 01 BF 00 00 F8 00 2C 40 07 02 AA FA 00 50 FF 00 42 00 01 07 00 02 00 05 08 05 5D 08 05 5D 07 02 CA 07 02 CA 07 02 C4 FF 00 01 00 01 07 00 02 00 05 08 05 5D 08 05 5D 07 02 CA 07 02 CA 01 FF 00 6F 00 01 07 00 02 00 05 07 02 0D 07 02 0D 07 00 EC 08 05 D7 08 05 D7 FF 00 00 00 01 07 00 02 00 06 07 02 0D 07 02 0D 07 00 EC 08 05 D7 08 05 D7 01 FF 01 C0 00 01 07 00 02 00 04 07 02 0D 07 02 0D 08 07 9D 08 07 9D FF 00 00 00 01 07 00 02 00 05 07 02 0D 07 02 0D 08 07 9D 08 07 9D 01 FF 01 21 00 01 07 00 02 00 05 07 02 0D 07 02 0D 07 00 EC 08 08 BA 08 08 BA FF 00 00 00 01 07 00 02 00 06 07 02 0D 07 02 0D 07 00 EC 08 08 BA 08 08 BA 01 FF 01 78 00 0D 07 00 02 00 00 00 00 07 02 0D 07 00 04 00 00 00 00 00 07 01 BF 00 00 FF 00 2C 00 07 07 00 02 00 00 00 00 07 02 0D 07 00 04 00 00 40 07 02 AA 4A 07 01 C8 FA 00 68 4A 07 02 AA 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Cosmetic getCosmetic() {
        return this.cosmetic;
    }
    
    @NotNull
    public final Window getWindow() {
        return this.window;
    }
    
    @NotNull
    public final CosmeticStudio getCosmeticStudio() {
        return this.cosmeticStudio;
    }
    
    @NotNull
    public final BasicState<Boolean> getEditingPlacement() {
        return this.editingPlacement;
    }
    
    private final boolean isPurchased() {
        return this.cosmeticsManager.getUnlockedCosmetics().contains(this.cosmetic.getId());
    }
    
    @NotNull
    public final MappedState<Set<String>, Boolean> isInCart() {
        return this.isInCart;
    }
    
    private final EssentialUIText getName() {
        return (EssentialUIText)this.name$delegate.getValue((Object)this, (KProperty)CosmeticOption.$$delegatedProperties[0]);
    }
    
    private final UIContainer getTopBarIconContainer() {
        return (UIContainer)this.topBarIconContainer$delegate.getValue((Object)this, (KProperty)CosmeticOption.$$delegatedProperties[1]);
    }
    
    private static final UIBlock lockedAction_delegate$lambda-23$lambda-18(final ReadWriteProperty<Object, UIBlock> $contentBlock$delegate) {
        return (UIBlock)$contentBlock$delegate.getValue((Object)null, (KProperty)CosmeticOption.$$delegatedProperties[9]);
    }
    
    public static final /* synthetic */ CosmeticSlot access$getShopCategory$p(final CosmeticOption $this) {
        return $this.shopCategory;
    }
    
    public static final /* synthetic */ CosmeticsManager access$getCosmeticsManager$p(final CosmeticOption $this) {
        return $this.cosmeticsManager;
    }
    
    public static final /* synthetic */ BasicState access$getHasSideOption$p(final CosmeticOption $this) {
        return $this.hasSideOption;
    }
    
    public static final /* synthetic */ UIComponent access$getSettingsImage$p(final CosmeticOption $this) {
        return $this.settingsImage;
    }
    
    public static final /* synthetic */ WeakState access$getView$p(final CosmeticOption $this) {
        return $this.view;
    }
    
    public static final /* synthetic */ boolean access$isPurchased(final CosmeticOption $this) {
        return $this.isPurchased();
    }
    
    public static final /* synthetic */ MappedState access$isPreviewing$p(final CosmeticOption $this) {
        return $this.isPreviewing;
    }
    
    public static final /* synthetic */ EssentialUIText access$getName(final CosmeticOption $this) {
        return $this.getName();
    }
    
    public static final /* synthetic */ State access$getActiveSale$p(final CosmeticOption $this) {
        return $this.activeSale;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "name", "getName()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "topBarIconContainer", "getTopBarIconContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "newTag", "getNewTag()Lgg/essential/gui/studio/Tag;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "lockedTag", "getLockedTag()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "saleTag", "getSaleTag()Lgg/essential/gui/studio/Tag;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "partnerIcon", "getPartnerIcon()Lgg/essential/gui/studio/Tag;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "timerTagBlock", "getTimerTagBlock()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "localTag", "getLocalTag()Lgg/essential/gui/studio/Tag;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "purchaseImage", "getPurchaseImage()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)CosmeticOption.class, "contentBlock", "<v#0>", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "lockedAction", "getLockedAction()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "priceText", "getPriceText()Lgg/essential/elementa/components/UIWrappedText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "cartGridButton", "getCartGridButton()Lgg/essential/gui/studio/CosmeticOption$CartGridButton;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticOption.class, "placementOptions", "getPlacementOptions()Lgg/essential/gui/studio/CosmeticOption$PlacementOptions;", 0)) };
        new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005�\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002�\u0006\f
                                                       \u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010	\u001a\u00020\u00018BX\u0082\u0084\u0002�\u0006\f
                                                       \u0004\b\f\u0010\b\u001a\u0004\b
                                                       \u0010\u000bR\u001b\u0010\r\u001a\u00020\u00048BX\u0082\u0084\u0002�\u0006\f
                                                       \u0004\b\u000f\u0010\b\u001a\u0004\b\u000e\u0010\u0006�\u0006\u0010""" }, d2 = { "Lgg/essential/gui/studio/CosmeticOption$CartGridButton;", "Lgg/essential/elementa/components/UIBlock;", "(Lgg/essential/gui/studio/CosmeticOption;)V", "addToCart", "Lgg/essential/gui/common/shadow/ShadowIcon;", "getAddToCart", "()Lgg/essential/gui/common/shadow/ShadowIcon;", "addToCart$delegate", "Lkotlin/properties/ReadWriteProperty;", "content", "getContent", "()Lgg/essential/elementa/components/UIBlock;", "content$delegate", "removeFromCart", "getRemoveFromCart", "removeFromCart$delegate", "essential" })
    public final class CartGridButton extends UIBlock
    {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
        @NotNull
        private final ReadWriteProperty content$delegate;
        final /* synthetic */ CosmeticOption this$0;
        
        public CartGridButton(final CosmeticOption this$0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: aload_1         /* this$0 */
            //     2: putfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //     5: aload_0         /* this */
            //     6: aconst_null    
            //     7: iconst_1       
            //     8: aconst_null    
            //     9: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //    12: aload_0         /* this */
            //    13: new             Lgg/essential/elementa/components/UIBlock;
            //    16: dup            
            //    17: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
            //    20: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
            //    23: checkcast       Lgg/essential/elementa/UIComponent;
            //    26: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //    29: astore_2        /* $this$constrain$iv */
            //    30: aload_2         /* $this$constrain$iv */
            //    31: astore          4
            //    33: aload           4
            //    35: astore          $this$constrain_u24lambda_u2d0$iv
            //    37: aload           $this$constrain_u24lambda_u2d0$iv
            //    39: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //    42: astore          6
            //    44: astore          7
            //    46: aload           $this$content_delegate_u24lambda_u2d0
            //    48: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
            //    51: dup            
            //    52: fconst_0       
            //    53: iconst_1       
            //    54: aconst_null    
            //    55: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //    58: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //    61: iconst_2       
            //    62: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    65: checkcast       Ljava/lang/Number;
            //    68: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //    71: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //    74: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
            //    77: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //    80: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //    83: aload           $this$content_delegate_u24lambda_u2d0
            //    85: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
            //    88: dup            
            //    89: fconst_0       
            //    90: iconst_1       
            //    91: aconst_null    
            //    92: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //    95: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //    98: iconst_2       
            //    99: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   102: checkcast       Ljava/lang/Number;
            //   105: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   108: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   111: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
            //   114: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   117: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   120: aload           7
            //   122: aload           4
            //   124: aload_0         /* this */
            //   125: checkcast       Lgg/essential/elementa/UIComponent;
            //   128: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   131: aload_0         /* this */
            //   132: getstatic       gg/essential/gui/studio/CosmeticOption$CartGridButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   135: iconst_0       
            //   136: aaload         
            //   137: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   140: putfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.content$delegate:Lkotlin/properties/ReadWriteProperty;
            //   143: new             Lgg/essential/gui/common/shadow/ShadowIcon;
            //   146: dup            
            //   147: getstatic       gg/essential/gui/EssentialPalette.REMOVE_FROM_CART_17X7:Lgg/essential/gui/image/ImageFactory;
            //   150: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
            //   153: checkcast       Lgg/essential/elementa/UIComponent;
            //   156: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   159: checkcast       Lgg/essential/gui/common/shadow/ShadowIcon;
            //   162: new             Lgg/essential/elementa/state/BasicState;
            //   165: dup            
            //   166: getstatic       gg/essential/gui/EssentialPalette.GREEN:Ljava/awt/Color;
            //   169: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
            //   172: checkcast       Lgg/essential/elementa/state/State;
            //   175: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
            //   178: checkcast       Lgg/essential/elementa/UIComponent;
            //   181: aload_0         /* this */
            //   182: invokespecial   gg/essential/gui/studio/CosmeticOption$CartGridButton.getContent:()Lgg/essential/elementa/components/UIBlock;
            //   185: checkcast       Lgg/essential/elementa/UIComponent;
            //   188: aload_0         /* this */
            //   189: getfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //   192: invokevirtual   gg/essential/gui/studio/CosmeticOption.isInCart:()Lgg/essential/elementa/state/MappedState;
            //   195: checkcast       Lgg/essential/elementa/state/State;
            //   198: iconst_0       
            //   199: aconst_null    
            //   200: bipush          12
            //   202: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
            //   205: aload_0         /* this */
            //   206: getstatic       gg/essential/gui/studio/CosmeticOption$CartGridButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   209: iconst_1       
            //   210: aaload         
            //   211: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   214: pop            
            //   215: new             Lgg/essential/gui/common/shadow/ShadowIcon;
            //   218: dup            
            //   219: getstatic       gg/essential/gui/EssentialPalette.ADD_TO_CART_17X7:Lgg/essential/gui/image/ImageFactory;
            //   222: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
            //   225: checkcast       Lgg/essential/elementa/UIComponent;
            //   228: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   231: checkcast       Lgg/essential/gui/common/shadow/ShadowIcon;
            //   234: new             Lgg/essential/elementa/state/BasicState;
            //   237: dup            
            //   238: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
            //   241: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
            //   244: checkcast       Lgg/essential/elementa/state/State;
            //   247: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
            //   250: checkcast       Lgg/essential/elementa/UIComponent;
            //   253: aload_0         /* this */
            //   254: invokespecial   gg/essential/gui/studio/CosmeticOption$CartGridButton.getContent:()Lgg/essential/elementa/components/UIBlock;
            //   257: checkcast       Lgg/essential/elementa/UIComponent;
            //   260: aload_0         /* this */
            //   261: getfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //   264: invokevirtual   gg/essential/gui/studio/CosmeticOption.isInCart:()Lgg/essential/elementa/state/MappedState;
            //   267: checkcast       Lgg/essential/elementa/state/State;
            //   270: invokestatic    gg/essential/gui/common/StateExtensionsKt.not:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
            //   273: checkcast       Lgg/essential/elementa/state/State;
            //   276: iconst_0       
            //   277: aconst_null    
            //   278: bipush          12
            //   280: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
            //   283: aload_0         /* this */
            //   284: getstatic       gg/essential/gui/studio/CosmeticOption$CartGridButton.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   287: iconst_2       
            //   288: aaload         
            //   289: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   292: pop            
            //   293: aload_0         /* this */
            //   294: checkcast       Lgg/essential/elementa/UIComponent;
            //   297: astore_2        /* $this$constrain$iv */
            //   298: aload_2         /* $this$constrain$iv */
            //   299: astore          4
            //   301: aload           4
            //   303: astore          $this$constrain_u24lambda_u2d0$iv
            //   305: aload           $this$constrain_u24lambda_u2d0$iv
            //   307: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   310: astore          $this$_init__u24lambda_u2d1
            //   312: aload           $this$_init__u24lambda_u2d1
            //   314: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
            //   317: dup            
            //   318: fconst_0       
            //   319: iconst_1       
            //   320: aconst_null    
            //   321: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   324: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   327: iconst_2       
            //   328: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   331: checkcast       Ljava/lang/Number;
            //   334: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   337: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   340: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
            //   343: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   346: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   349: aload           $this$_init__u24lambda_u2d1
            //   351: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
            //   354: dup            
            //   355: fconst_0       
            //   356: iconst_1       
            //   357: aconst_null    
            //   358: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   361: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   364: iconst_2       
            //   365: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   368: checkcast       Ljava/lang/Number;
            //   371: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   374: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   377: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
            //   380: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   383: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   386: aload_0         /* this */
            //   387: checkcast       Lgg/essential/elementa/UIComponent;
            //   390: iconst_0       
            //   391: iconst_0       
            //   392: iconst_3       
            //   393: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
            //   396: astore_2        /* hovered */
            //   397: aload_0         /* this */
            //   398: aload_2         /* hovered */
            //   399: getstatic       gg/essential/gui/studio/CosmeticOption$CartGridButton$6.INSTANCE:Lgg/essential/gui/studio/CosmeticOption$CartGridButton$6;
            //   402: checkcast       Lkotlin/jvm/functions/Function1;
            //   405: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
            //   408: checkcast       Lgg/essential/elementa/state/State;
            //   411: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //   414: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //   417: invokevirtual   gg/essential/gui/studio/CosmeticOption$CartGridButton.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
            //   420: pop            
            //   421: aload_0         /* this */
            //   422: checkcast       Lgg/essential/elementa/UIComponent;
            //   425: astore_3       
            //   426: aload_0         /* this */
            //   427: getfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //   430: astore          4
            //   432: aload_3         /* $this$onLeftClick$iv */
            //   433: new             Lgg/essential/gui/studio/CosmeticOption$CartGridButton$special$$inlined$onLeftClick$1;
            //   436: dup            
            //   437: aload           4
            //   439: aload_2         /* hovered */
            //   440: invokespecial   gg/essential/gui/studio/CosmeticOption$CartGridButton$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;Lgg/essential/elementa/state/State;)V
            //   443: checkcast       Lkotlin/jvm/functions/Function2;
            //   446: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
            //   449: pop            
            //   450: aload_0         /* this */
            //   451: checkcast       Lgg/essential/elementa/UIComponent;
            //   454: aload_2         /* hovered */
            //   455: aload_0         /* this */
            //   456: getfield        gg/essential/gui/studio/CosmeticOption$CartGridButton.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //   459: invokevirtual   gg/essential/gui/studio/CosmeticOption.isInCart:()Lgg/essential/elementa/state/MappedState;
            //   462: getstatic       gg/essential/gui/studio/CosmeticOption$CartGridButton$8.INSTANCE:Lgg/essential/gui/studio/CosmeticOption$CartGridButton$8;
            //   465: checkcast       Lkotlin/jvm/functions/Function1;
            //   468: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
            //   471: checkcast       Lgg/essential/elementa/state/State;
            //   474: aconst_null    
            //   475: fconst_0       
            //   476: aconst_null    
            //   477: aconst_null    
            //   478: bipush          60
            //   480: invokestatic    gg/essential/util/ExtensionsKt.bindEssentialTooltip$default$5d648aca:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;I)Lgg/essential/elementa/UIComponent;
            //   483: pop            
            //   484: return         
            //    Signature:
            //  (Lgg/essential/gui/studio/CosmeticOption;)V [from metadata: ()V]
            //  
            //    MethodParameters:
            //  Name    Flags  
            //  ------  -----
            //  this$0  
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        private final UIBlock getContent() {
            return (UIBlock)this.content$delegate.getValue((Object)this, (KProperty)CartGridButton.$$delegatedProperties[0]);
        }
        
        static {
            $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CartGridButton.class, "content", "getContent()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CartGridButton.class, "removeFromCart", "getRemoveFromCart()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CartGridButton.class, "addToCart", "getAddToCart()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)) };
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000F
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0010\u0015
                                                       \u0000
                                                       \u0002\u0010$
                                                       \u0002\u0010\u000e
                                                       \u0002\u0010 
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010!
                                                       \u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005�\u0006\u0002\u0010\u0002J8\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012
                                                       \u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00162\u0006\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002�\u0006\f
                                                       \u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010	\u001a\u00020
                                                       8BX\u0082\u0084\u0002�\u0006\f
                                                       \u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002�\u0006\f
                                                       \u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011�\u0006\u001d�\u0006
                                                       \u0010\u001e\u001a\u00020
                                                       X\u008a\u0084\u0002�\u0006
                                                       \u0010\u001f\u001a\u00020
                                                       X\u008a\u0084\u0002�\u0006
                                                       \u0010 \u001a\u00020\u000fX\u008a\u0084\u0002�\u0006
                                                       \u0010!\u001a\u00020
                                                       X\u008a\u0084\u0002�\u0006
                                                       \u0010"\u001a\u00020
                                                       X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/studio/CosmeticOption$PlacementOptions;", "Lgg/essential/elementa/components/UIBlock;", "(Lgg/essential/gui/studio/CosmeticOption;)V", "close", "Lgg/essential/elementa/UIComponent;", "getClose", "()Lgg/essential/elementa/UIComponent;", "close$delegate", "Lkotlin/properties/ReadWriteProperty;", "content", "Lgg/essential/elementa/components/UIContainer;", "getContent", "()Lgg/essential/elementa/components/UIContainer;", "content$delegate", "placementText", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getPlacementText", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "placementText$delegate", "getState", "", "currentSettings", "", "", "", "Lgg/essential/mod/cosmetics/CosmeticSetting;", "cosmeticId", "newSettings", "", "essential", "settingsContainer", "container", "sliderLabel", "sideSettingContainer", "switchContainer" })
    public final class PlacementOptions extends UIBlock
    {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
        @NotNull
        private final ReadWriteProperty content$delegate;
        @NotNull
        private final ReadWriteProperty placementText$delegate;
        final /* synthetic */ CosmeticOption this$0;
        
        public PlacementOptions(final CosmeticOption this$0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: aload_1         /* this$0 */
            //     2: putfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //     5: aload_0         /* this */
            //     6: getstatic       gg/essential/gui/EssentialPalette.BUTTON:Ljava/awt/Color;
            //     9: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
            //    12: aload_0         /* this */
            //    13: new             Lgg/essential/elementa/components/UIContainer;
            //    16: dup            
            //    17: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
            //    20: checkcast       Lgg/essential/elementa/UIComponent;
            //    23: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //    26: astore_2        /* $this$constrain$iv */
            //    27: aload_2         /* $this$constrain$iv */
            //    28: astore          4
            //    30: aload           4
            //    32: astore          $this$constrain_u24lambda_u2d0$iv
            //    34: aload           $this$constrain_u24lambda_u2d0$iv
            //    36: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //    39: astore          7
            //    41: astore          34
            //    43: aload           $this$content_delegate_u24lambda_u2d0
            //    45: bipush          100
            //    47: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    50: checkcast       Ljava/lang/Number;
            //    53: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //    56: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //    59: bipush          8
            //    61: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    64: checkcast       Ljava/lang/Number;
            //    67: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //    70: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //    73: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
            //    76: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //    79: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //    82: aload           $this$content_delegate_u24lambda_u2d0
            //    84: new             Lgg/essential/elementa/constraints/AspectConstraint;
            //    87: dup            
            //    88: fconst_0       
            //    89: iconst_1       
            //    90: aconst_null    
            //    91: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //    94: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //    97: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   100: aload           34
            //   102: aload           4
            //   104: aload_0         /* this */
            //   105: checkcast       Lgg/essential/elementa/UIComponent;
            //   108: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   111: aload_0         /* this */
            //   112: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   115: iconst_0       
            //   116: aaload         
            //   117: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   120: putfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.content$delegate:Lkotlin/properties/ReadWriteProperty;
            //   123: aload_0         /* this */
            //   124: new             Lgg/essential/gui/common/shadow/EssentialUIText;
            //   127: dup            
            //   128: ldc             "Placement"
            //   130: iconst_0       
            //   131: aconst_null    
            //   132: iconst_0       
            //   133: iconst_0       
            //   134: iconst_0       
            //   135: bipush          62
            //   137: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
            //   140: checkcast       Lgg/essential/elementa/UIComponent;
            //   143: astore_2        /* $this$constrain$iv */
            //   144: aload_2         /* $this$constrain$iv */
            //   145: astore          4
            //   147: aload           4
            //   149: astore          $this$constrain_u24lambda_u2d0$iv
            //   151: aload           $this$constrain_u24lambda_u2d0$iv
            //   153: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   156: astore          7
            //   158: astore          34
            //   160: aload           $this$placementText_delegate_u24lambda_u2d1
            //   162: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
            //   165: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //   168: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //   171: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
            //   174: aload           34
            //   176: aload           4
            //   178: aload_0         /* this */
            //   179: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions.getContent:()Lgg/essential/elementa/components/UIContainer;
            //   182: checkcast       Lgg/essential/elementa/UIComponent;
            //   185: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   188: aload_0         /* this */
            //   189: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   192: iconst_1       
            //   193: aaload         
            //   194: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   197: putfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.placementText$delegate:Lkotlin/properties/ReadWriteProperty;
            //   200: new             Lgg/essential/gui/common/shadow/ShadowIcon;
            //   203: dup            
            //   204: getstatic       gg/essential/gui/EssentialPalette.CANCEL_5X:Lgg/essential/gui/image/ImageFactory;
            //   207: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
            //   210: checkcast       Lgg/essential/elementa/UIComponent;
            //   213: astore_2        /* $this$constrain$iv */
            //   214: aload_2         /* $this$constrain$iv */
            //   215: astore          4
            //   217: aload           4
            //   219: astore          $this$constrain_u24lambda_u2d0$iv
            //   221: aload           $this$constrain_u24lambda_u2d0$iv
            //   223: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   226: astore          $this$close_delegate_u24lambda_u2d2
            //   228: aload           $this$close_delegate_u24lambda_u2d2
            //   230: iconst_0       
            //   231: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   234: checkcast       Ljava/lang/Number;
            //   237: iconst_1       
            //   238: iconst_0       
            //   239: iconst_2       
            //   240: aconst_null    
            //   241: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   244: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   247: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   250: aload           $this$close_delegate_u24lambda_u2d2
            //   252: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //   255: dup            
            //   256: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //   259: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //   262: aload_0         /* this */
            //   263: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions.getPlacementText:()Lgg/essential/gui/common/shadow/EssentialUIText;
            //   266: checkcast       Lgg/essential/elementa/UIComponent;
            //   269: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
            //   272: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   275: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   278: aload           4
            //   280: astore_2        /* $this$constrain$iv */
            //   281: aload_0         /* this */
            //   282: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //   285: astore_3       
            //   286: aload_2         /* $this$onLeftClick$iv */
            //   287: new             Lgg/essential/gui/studio/CosmeticOption$PlacementOptions$special$$inlined$onLeftClick$1;
            //   290: dup            
            //   291: aload_3        
            //   292: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/studio/CosmeticOption;)V
            //   295: checkcast       Lkotlin/jvm/functions/Function2;
            //   298: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
            //   301: aload_0         /* this */
            //   302: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions.getContent:()Lgg/essential/elementa/components/UIContainer;
            //   305: checkcast       Lgg/essential/elementa/UIComponent;
            //   308: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   311: aload_0         /* this */
            //   312: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   315: iconst_2       
            //   316: aaload         
            //   317: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   320: pop            
            //   321: aload_0         /* this */
            //   322: checkcast       Lgg/essential/elementa/UIComponent;
            //   325: astore_2        /* $this$constrain$iv */
            //   326: aload_2         /* $this$constrain$iv */
            //   327: astore          4
            //   329: aload           4
            //   331: astore          $this$constrain_u24lambda_u2d0$iv
            //   333: aload           $this$constrain_u24lambda_u2d0$iv
            //   335: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   338: astore          $this$_init__u24lambda_u2d4
            //   340: aload           $this$_init__u24lambda_u2d4
            //   342: bipush          100
            //   344: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   347: checkcast       Ljava/lang/Number;
            //   350: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //   353: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   356: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   359: aload           $this$_init__u24lambda_u2d4
            //   361: new             Lgg/essential/elementa/constraints/AspectConstraint;
            //   364: dup            
            //   365: fconst_0       
            //   366: iconst_1       
            //   367: aconst_null    
            //   368: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   371: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   374: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   377: new             Lgg/essential/elementa/components/UIContainer;
            //   380: dup            
            //   381: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
            //   384: checkcast       Lgg/essential/elementa/UIComponent;
            //   387: astore_3        /* $this$constrain$iv */
            //   388: aload_3         /* $this$constrain$iv */
            //   389: astore          5
            //   391: aload           5
            //   393: astore          $this$constrain_u24lambda_u2d0$iv
            //   395: aload           $this$constrain_u24lambda_u2d0$iv
            //   397: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   400: astore          $this$_init__u24lambda_u2d5
            //   402: aload           $this$_init__u24lambda_u2d5
            //   404: new             Lgg/essential/elementa/constraints/SiblingConstraint;
            //   407: dup            
            //   408: ldc             13.0
            //   410: iconst_0       
            //   411: iconst_2       
            //   412: aconst_null    
            //   413: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   416: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   419: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   422: aload           $this$_init__u24lambda_u2d5
            //   424: bipush          100
            //   426: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   429: checkcast       Ljava/lang/Number;
            //   432: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //   435: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   438: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   441: aload           $this$_init__u24lambda_u2d5
            //   443: new             Lgg/essential/elementa/constraints/FillConstraint;
            //   446: dup            
            //   447: iconst_0       
            //   448: iconst_1       
            //   449: aconst_null    
            //   450: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   453: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   456: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   459: aload           5
            //   461: aload_0         /* this */
            //   462: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions.getContent:()Lgg/essential/elementa/components/UIContainer;
            //   465: checkcast       Lgg/essential/elementa/UIComponent;
            //   468: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   471: aconst_null    
            //   472: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   475: iconst_3       
            //   476: aaload         
            //   477: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   480: astore_2        /* settingsContainer$delegate */
            //   481: aload_0         /* this */
            //   482: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //   485: invokevirtual   gg/essential/gui/studio/CosmeticOption.getCosmetic:()Lgg/essential/network/cosmetics/Cosmetic;
            //   488: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getSettings:()Ljava/util/List;
            //   491: astore_3        /* settings */
            //   492: aload_3         /* settings */
            //   493: checkcast       Ljava/lang/Iterable;
            //   496: astore          $this$filter$iv
            //   498: aload           $this$filter$iv
            //   500: astore          7
            //   502: new             Ljava/util/ArrayList;
            //   505: dup            
            //   506: invokespecial   java/util/ArrayList.<init>:()V
            //   509: checkcast       Ljava/util/Collection;
            //   512: astore          destination$iv$iv
            //   514: aload           $this$filterTo$iv$iv
            //   516: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
            //   521: astore          10
            //   523: aload           10
            //   525: invokeinterface java/util/Iterator.hasNext:()Z
            //   530: ifeq            576
            //   533: aload           10
            //   535: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //   540: astore          element$iv$iv
            //   542: aload           element$iv$iv
            //   544: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
            //   547: astore          it
            //   549: aload           it
            //   551: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getType:()Ljava/lang/String;
            //   554: ldc_w           "POSITION_RANGE"
            //   557: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   560: ifeq            523
            //   563: aload           destination$iv$iv
            //   565: aload           element$iv$iv
            //   567: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
            //   572: pop            
            //   573: goto            523
            //   576: aload           destination$iv$iv
            //   578: checkcast       Ljava/util/List;
            //   581: checkcast       Ljava/lang/Iterable;
            //   584: astore          $this$flatMap$iv
            //   586: aload           $this$flatMap$iv
            //   588: astore          7
            //   590: new             Ljava/util/ArrayList;
            //   593: dup            
            //   594: invokespecial   java/util/ArrayList.<init>:()V
            //   597: checkcast       Ljava/util/Collection;
            //   600: astore          destination$iv$iv
            //   602: aload           $this$flatMapTo$iv$iv
            //   604: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
            //   609: astore          10
            //   611: aload           10
            //   613: invokeinterface java/util/Iterator.hasNext:()Z
            //   618: ifeq            929
            //   621: aload           10
            //   623: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //   628: astore          element$iv$iv
            //   630: aload           element$iv$iv
            //   632: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
            //   635: astore          setting
            //   637: iconst_3       
            //   638: anewarray       Ljava/lang/String;
            //   641: astore          14
            //   643: aload           14
            //   645: iconst_0       
            //   646: ldc_w           "x"
            //   649: aastore        
            //   650: aload           14
            //   652: iconst_1       
            //   653: ldc_w           "y"
            //   656: aastore        
            //   657: aload           14
            //   659: iconst_2       
            //   660: ldc_w           "z"
            //   663: aastore        
            //   664: aload           14
            //   666: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
            //   669: checkcast       Ljava/lang/Iterable;
            //   672: astore          $this$mapIndexedNotNull$iv
            //   674: aload           $this$mapIndexedNotNull$iv
            //   676: astore          16
            //   678: new             Ljava/util/ArrayList;
            //   681: dup            
            //   682: invokespecial   java/util/ArrayList.<init>:()V
            //   685: checkcast       Ljava/util/Collection;
            //   688: astore          destination$iv$iv
            //   690: aload           $this$mapIndexedNotNullTo$iv$iv
            //   692: astore          $this$forEachIndexed$iv$iv$iv
            //   694: iconst_0       
            //   695: istore          index$iv$iv$iv
            //   697: aload           $this$forEachIndexed$iv$iv$iv
            //   699: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
            //   704: astore          22
            //   706: aload           22
            //   708: invokeinterface java/util/Iterator.hasNext:()Z
            //   713: ifeq            908
            //   716: aload           22
            //   718: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //   723: astore          item$iv$iv$iv
            //   725: iload           index$iv$iv$iv
            //   727: iinc            index$iv$iv$iv, 1
            //   730: istore          24
            //   732: iload           24
            //   734: ifge            740
            //   737: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
            //   740: iload           24
            //   742: aload           item$iv$iv$iv
            //   744: astore          25
            //   746: istore          index$iv$iv
            //   748: iload           index$iv$iv
            //   750: aload           element$iv$iv
            //   752: checkcast       Ljava/lang/String;
            //   755: astore          27
            //   757: istore          index
            //   759: aload           setting
            //   761: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:()Ljava/util/Map;
            //   764: aload           axis
            //   766: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
            //   771: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //   776: astore          29
            //   778: aload           29
            //   780: instanceof      Ljava/lang/Number;
            //   783: ifeq            794
            //   786: aload           29
            //   788: checkcast       Ljava/lang/Number;
            //   791: goto            795
            //   794: aconst_null    
            //   795: dup            
            //   796: ifnonnull       804
            //   799: pop            
            //   800: aconst_null    
            //   801: goto            885
            //   804: astore          min
            //   806: aload           setting
            //   808: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:()Ljava/util/Map;
            //   811: aload           axis
            //   813: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
            //   818: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //   823: astore          31
            //   825: aload           31
            //   827: instanceof      Ljava/lang/Number;
            //   830: ifeq            841
            //   833: aload           31
            //   835: checkcast       Ljava/lang/Number;
            //   838: goto            842
            //   841: aconst_null    
            //   842: dup            
            //   843: ifnonnull       851
            //   846: pop            
            //   847: aconst_null    
            //   848: goto            885
            //   851: astore          max
            //   853: new             Lkotlin/Triple;
            //   856: dup            
            //   857: iload           index
            //   859: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   862: ldc_w           "Height: "
            //   865: new             Lkotlin/ranges/IntRange;
            //   868: dup            
            //   869: aload           min
            //   871: invokevirtual   java/lang/Number.intValue:()I
            //   874: aload           max
            //   876: invokevirtual   java/lang/Number.intValue:()I
            //   879: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
            //   882: invokespecial   kotlin/Triple.<init>:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
            //   885: dup            
            //   886: ifnull          904
            //   889: astore          it$iv$iv
            //   891: aload           destination$iv$iv
            //   893: aload           it$iv$iv
            //   895: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
            //   900: pop            
            //   901: goto            706
            //   904: pop            
            //   905: goto            706
            //   908: aload           destination$iv$iv
            //   910: checkcast       Ljava/util/List;
            //   913: checkcast       Ljava/lang/Iterable;
            //   916: astore          list$iv$iv
            //   918: aload           destination$iv$iv
            //   920: aload           list$iv$iv
            //   922: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
            //   925: pop            
            //   926: goto            611
            //   929: aload           destination$iv$iv
            //   931: checkcast       Ljava/util/List;
            //   934: astore          positionSliders
            //   936: aload_0         /* this */
            //   937: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //   940: invokestatic    gg/essential/gui/studio/CosmeticOption.access$getCosmeticsManager$p:(Lgg/essential/gui/studio/CosmeticOption;)Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
            //   943: invokestatic    gg/essential/util/UUIDUtil.getClientUUID:()Ljava/util/UUID;
            //   946: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getCosmeticSettings:(Ljava/util/UUID;)Lcom/google/common/collect/ImmutableMap;
            //   949: astore          cosmeticSettings
            //   951: aload           cosmeticSettings
            //   953: dup            
            //   954: ifnull          963
            //   957: checkcast       Ljava/util/Map;
            //   960: goto            974
            //   963: pop            
            //   964: new             Ljava/util/LinkedHashMap;
            //   967: dup            
            //   968: invokespecial   java/util/LinkedHashMap.<init>:()V
            //   971: checkcast       Ljava/util/Map;
            //   974: astore          currentSettings
            //   976: aload_0         /* this */
            //   977: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //   980: invokevirtual   gg/essential/gui/studio/CosmeticOption.getCosmetic:()Lgg/essential/network/cosmetics/Cosmetic;
            //   983: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
            //   986: astore          cosmeticId
            //   988: aload           positionSliders
            //   990: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
            //   995: astore          8
            //   997: aload           8
            //   999: invokeinterface java/util/Iterator.hasNext:()Z
            //  1004: ifeq            1408
            //  1007: aload           8
            //  1009: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //  1014: checkcast       Lkotlin/Triple;
            //  1017: astore          9
            //  1019: aload           9
            //  1021: invokevirtual   kotlin/Triple.component1:()Ljava/lang/Object;
            //  1024: checkcast       Ljava/lang/Number;
            //  1027: invokevirtual   java/lang/Number.intValue:()I
            //  1030: istore          index
            //  1032: aload           9
            //  1034: invokevirtual   kotlin/Triple.component2:()Ljava/lang/Object;
            //  1037: checkcast       Ljava/lang/String;
            //  1040: astore          label
            //  1042: aload           9
            //  1044: invokevirtual   kotlin/Triple.component3:()Ljava/lang/Object;
            //  1047: checkcast       Lkotlin/ranges/IntRange;
            //  1050: astore          range
            //  1052: new             Lgg/essential/elementa/components/UIContainer;
            //  1055: dup            
            //  1056: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
            //  1059: checkcast       Lgg/essential/elementa/UIComponent;
            //  1062: astore          $this$constrain$iv
            //  1064: aload           $this$constrain$iv
            //  1066: astore          16
            //  1068: aload           16
            //  1070: astore          $this$constrain_u24lambda_u2d0$iv
            //  1072: aload           $this$constrain_u24lambda_u2d0$iv
            //  1074: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //  1077: astore          $this$_init__u24lambda_u2d10
            //  1079: aload           $this$_init__u24lambda_u2d10
            //  1081: bipush          100
            //  1083: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  1086: checkcast       Ljava/lang/Number;
            //  1089: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //  1092: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //  1095: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //  1098: aload           $this$_init__u24lambda_u2d10
            //  1100: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
            //  1103: dup            
            //  1104: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
            //  1107: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //  1110: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //  1113: aload           16
            //  1115: aload_2         /* settingsContainer$delegate */
            //  1116: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-6:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
            //  1119: checkcast       Lgg/essential/elementa/UIComponent;
            //  1122: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //  1125: aconst_null    
            //  1126: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //  1129: iconst_4       
            //  1130: aaload         
            //  1131: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //  1134: astore          container$delegate
            //  1136: new             Lgg/essential/gui/common/shadow/EssentialUIText;
            //  1139: dup            
            //  1140: aload           label
            //  1142: iconst_0       
            //  1143: aconst_null    
            //  1144: iconst_0       
            //  1145: iconst_0       
            //  1146: iconst_0       
            //  1147: bipush          62
            //  1149: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
            //  1152: checkcast       Lgg/essential/elementa/UIComponent;
            //  1155: astore          $this$constrain$iv
            //  1157: aload           $this$constrain$iv
            //  1159: astore          17
            //  1161: aload           17
            //  1163: astore          $this$constrain_u24lambda_u2d0$iv
            //  1165: aload           $this$constrain_u24lambda_u2d0$iv
            //  1167: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //  1170: astore          $this$_init__u24lambda_u2d12
            //  1172: aload           $this$_init__u24lambda_u2d12
            //  1174: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //  1177: dup            
            //  1178: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //  1181: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //  1184: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //  1187: aload           $this$_init__u24lambda_u2d12
            //  1189: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
            //  1192: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //  1195: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //  1198: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
            //  1201: aload           17
            //  1203: aload           container$delegate
            //  1205: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-11:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
            //  1208: checkcast       Lgg/essential/elementa/UIComponent;
            //  1211: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //  1214: aconst_null    
            //  1215: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //  1218: iconst_5       
            //  1219: aaload         
            //  1220: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //  1223: pop            
            //  1224: aload_0         /* this */
            //  1225: aload           currentSettings
            //  1227: aload           cosmeticId
            //  1229: new             Ljava/util/ArrayList;
            //  1232: dup            
            //  1233: invokespecial   java/util/ArrayList.<init>:()V
            //  1236: checkcast       Ljava/util/List;
            //  1239: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions.getState:(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)[I
            //  1242: astore          state
            //  1244: new             Lgg/essential/gui/common/IntEssentialSlider;
            //  1247: dup            
            //  1248: aload           range
            //  1250: invokevirtual   kotlin/ranges/IntRange.getFirst:()I
            //  1253: aload           range
            //  1255: invokevirtual   kotlin/ranges/IntRange.getLast:()I
            //  1258: aload           state
            //  1260: iload           index
            //  1262: iaload         
            //  1263: invokespecial   gg/essential/gui/common/IntEssentialSlider.<init>:(III)V
            //  1266: checkcast       Lgg/essential/elementa/UIComponent;
            //  1269: astore          $this$constrain$iv
            //  1271: aload           $this$constrain$iv
            //  1273: astore          19
            //  1275: aload           19
            //  1277: astore          $this$constrain_u24lambda_u2d0$iv
            //  1279: aload           $this$constrain_u24lambda_u2d0$iv
            //  1281: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //  1284: astore          $this$_init__u24lambda_u2d14
            //  1286: aload           $this$_init__u24lambda_u2d14
            //  1288: new             Lgg/essential/elementa/constraints/SiblingConstraint;
            //  1291: dup            
            //  1292: fconst_0       
            //  1293: iconst_0       
            //  1294: iconst_3       
            //  1295: aconst_null    
            //  1296: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //  1299: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //  1302: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //  1305: aload           $this$_init__u24lambda_u2d14
            //  1307: new             Lgg/essential/elementa/constraints/FillConstraint;
            //  1310: dup            
            //  1311: iconst_0       
            //  1312: iconst_1       
            //  1313: aconst_null    
            //  1314: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //  1317: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //  1320: iconst_1       
            //  1321: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  1324: checkcast       Ljava/lang/Number;
            //  1327: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //  1330: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
            //  1333: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
            //  1336: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //  1339: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //  1342: aload           $this$_init__u24lambda_u2d14
            //  1344: bipush          12
            //  1346: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  1349: checkcast       Ljava/lang/Number;
            //  1352: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //  1355: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //  1358: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //  1361: aload           19
            //  1363: aload           container$delegate
            //  1365: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-11:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
            //  1368: checkcast       Lgg/essential/elementa/UIComponent;
            //  1371: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //  1374: checkcast       Lgg/essential/gui/common/IntEssentialSlider;
            //  1377: astore          sliderComponent
            //  1379: aload           sliderComponent
            //  1381: new             Lgg/essential/gui/studio/CosmeticOption$PlacementOptions$5;
            //  1384: dup            
            //  1385: aload_0         /* this */
            //  1386: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //  1389: aload           cosmeticId
            //  1391: aload_0         /* this */
            //  1392: aload           currentSettings
            //  1394: iload           index
            //  1396: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions$5.<init>:(Lgg/essential/gui/studio/CosmeticOption;Ljava/lang/String;Lgg/essential/gui/studio/CosmeticOption$PlacementOptions;Ljava/util/Map;I)V
            //  1399: checkcast       Lkotlin/jvm/functions/Function1;
            //  1402: invokevirtual   gg/essential/gui/common/IntEssentialSlider.onUpdateInt:(Lkotlin/jvm/functions/Function1;)V
            //  1405: goto            997
            //  1408: aload_0         /* this */
            //  1409: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //  1412: invokestatic    gg/essential/gui/studio/CosmeticOption.access$getHasSideOption$p:(Lgg/essential/gui/studio/CosmeticOption;)Lgg/essential/elementa/state/BasicState;
            //  1415: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
            //  1418: checkcast       Ljava/lang/Boolean;
            //  1421: invokevirtual   java/lang/Boolean.booleanValue:()Z
            //  1424: ifeq            2172
            //  1427: new             Lgg/essential/elementa/components/UIContainer;
            //  1430: dup            
            //  1431: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
            //  1434: checkcast       Lgg/essential/elementa/UIComponent;
            //  1437: astore          $this$constrain$iv
            //  1439: aload           $this$constrain$iv
            //  1441: astore          11
            //  1443: aload           11
            //  1445: astore          $this$constrain_u24lambda_u2d0$iv
            //  1447: aload           $this$constrain_u24lambda_u2d0$iv
            //  1449: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //  1452: astore          $this$_init__u24lambda_u2d15
            //  1454: aload           $this$_init__u24lambda_u2d15
            //  1456: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //  1459: dup            
            //  1460: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //  1463: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //  1466: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //  1469: aload           $this$_init__u24lambda_u2d15
            //  1471: new             Lgg/essential/elementa/constraints/SiblingConstraint;
            //  1474: dup            
            //  1475: ldc_w           5.0
            //  1478: iconst_0       
            //  1479: iconst_2       
            //  1480: aconst_null    
            //  1481: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //  1484: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //  1487: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //  1490: aload           $this$_init__u24lambda_u2d15
            //  1492: bipush          100
            //  1494: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  1497: checkcast       Ljava/lang/Number;
            //  1500: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //  1503: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //  1506: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //  1509: aload           $this$_init__u24lambda_u2d15
            //  1511: bipush          10
            //  1513: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  1516: checkcast       Ljava/lang/Number;
            //  1519: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //  1522: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //  1525: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //  1528: aload           11
            //  1530: aload_2         /* settingsContainer$delegate */
            //  1531: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-6:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
            //  1534: checkcast       Lgg/essential/elementa/UIComponent;
            //  1537: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //  1540: aconst_null    
            //  1541: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //  1544: bipush          6
            //  1546: aaload         
            //  1547: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //  1550: astore          sideSettingContainer$delegate
            //  1552: new             Lgg/essential/gui/common/shadow/EssentialUIText;
            //  1555: dup            
            //  1556: ldc_w           "Side: "
            //  1559: iconst_0       
            //  1560: aconst_null    
            //  1561: iconst_0       
            //  1562: iconst_0       
            //  1563: iconst_0       
            //  1564: bipush          62
            //  1566: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
            //  1569: checkcast       Lgg/essential/elementa/UIComponent;
            //  1572: astore          $this$constrain$iv
            //  1574: aload           $this$constrain$iv
            //  1576: astore          11
            //  1578: aload           11
            //  1580: astore          $this$constrain_u24lambda_u2d0$iv
            //  1582: aload           $this$constrain_u24lambda_u2d0$iv
            //  1584: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //  1587: astore          $this$_init__u24lambda_u2d17
            //  1589: aload           $this$_init__u24lambda_u2d17
            //  1591: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //  1594: dup            
            //  1595: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //  1598: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //  1601: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //  1604: aload           $this$_init__u24lambda_u2d17
            //  1606: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
            //  1609: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //  1612: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //  1615: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
            //  1618: aload           11
            //  1620: aload           sideSettingContainer$delegate
            //  1622: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-16:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
            //  1625: checkcast       Lgg/essential/elementa/UIComponent;
            //  1628: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //  1631: pop            
            //  1632: aload           currentSettings
            //  1634: aload           cosmeticId
            //  1636: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //  1641: checkcast       Lcom/google/common/collect/ImmutableList;
            //  1644: dup            
            //  1645: ifnull          1733
            //  1648: checkcast       Ljava/lang/Iterable;
            //  1651: astore          13
            //  1653: aload           13
            //  1655: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
            //  1660: astore          14
            //  1662: aload           14
            //  1664: invokeinterface java/util/Iterator.hasNext:()Z
            //  1669: ifeq            1707
            //  1672: aload           14
            //  1674: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //  1679: astore          15
            //  1681: aload           15
            //  1683: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
            //  1686: astore          it
            //  1688: aload           it
            //  1690: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getType:()Ljava/lang/String;
            //  1693: ldc_w           "SIDE"
            //  1696: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1699: ifeq            1662
            //  1702: aload           15
            //  1704: goto            1708
            //  1707: aconst_null    
            //  1708: checkcast       Lgg/essential/mod/cosmetics/CosmeticSetting;
            //  1711: dup            
            //  1712: ifnull          1733
            //  1715: invokevirtual   gg/essential/mod/cosmetics/CosmeticSetting.getData:()Ljava/util/Map;
            //  1718: dup            
            //  1719: ifnull          1733
            //  1722: ldc_w           "SIDE"
            //  1725: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //  1730: goto            1735
            //  1733: pop            
            //  1734: aconst_null    
            //  1735: getstatic       gg/essential/model/Side.RIGHT:Lgg/essential/model/Side;
            //  1738: invokevirtual   gg/essential/model/Side.name:()Ljava/lang/String;
            //  1741: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1744: istore          rightSide
            //  1746: new             Lgg/essential/elementa/components/UIContainer;
            //  1749: dup            
            //  1750: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
            //  1753: checkcast       Lgg/essential/elementa/UIComponent;
            //  1756: astore          $this$constrain$iv
            //  1758: aload           $this$constrain$iv
            //  1760: astore          13
            //  1762: aload           13
            //  1764: astore          $this$constrain_u24lambda_u2d0$iv
            //  1766: aload           $this$constrain_u24lambda_u2d0$iv
            //  1768: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //  1771: astore          $this$_init__u24lambda_u2d19
            //  1773: aload           $this$_init__u24lambda_u2d19
            //  1775: bipush          6
            //  1777: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  1780: checkcast       Ljava/lang/Number;
            //  1783: iconst_1       
            //  1784: iconst_0       
            //  1785: iconst_2       
            //  1786: aconst_null    
            //  1787: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
            //  1790: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //  1793: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //  1796: aload           $this$_init__u24lambda_u2d19
            //  1798: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //  1801: dup            
            //  1802: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //  1805: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //  1808: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //  1811: aload           $this$_init__u24lambda_u2d19
            //  1813: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
            //  1816: dup            
            //  1817: fconst_0       
            //  1818: iconst_1       
            //  1819: aconst_null    
            //  1820: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //  1823: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //  1826: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //  1829: aload           $this$_init__u24lambda_u2d19
            //  1831: bipush          100
            //  1833: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  1836: checkcast       Ljava/lang/Number;
            //  1839: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //  1842: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //  1845: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //  1848: aload           13
            //  1850: aload           sideSettingContainer$delegate
            //  1852: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-16:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
            //  1855: checkcast       Lgg/essential/elementa/UIComponent;
            //  1858: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //  1861: aconst_null    
            //  1862: getstatic       gg/essential/gui/studio/CosmeticOption$PlacementOptions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //  1865: bipush          7
            //  1867: aaload         
            //  1868: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //  1871: astore          switchContainer$delegate
            //  1873: new             Lgg/essential/elementa/state/BasicState;
            //  1876: dup            
            //  1877: iload           rightSide
            //  1879: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //  1882: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
            //  1885: astore          rightSideEnabled
            //  1887: new             Lgg/essential/gui/common/shadow/EssentialUIText;
            //  1890: dup            
            //  1891: ldc_w           "L"
            //  1894: iconst_0       
            //  1895: aconst_null    
            //  1896: iconst_0       
            //  1897: iconst_0       
            //  1898: iconst_0       
            //  1899: bipush          62
            //  1901: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
            //  1904: checkcast       Lgg/essential/elementa/UIComponent;
            //  1907: astore          $this$constrain$iv
            //  1909: aload           $this$constrain$iv
            //  1911: astore          14
            //  1913: aload           14
            //  1915: astore          $this$constrain_u24lambda_u2d0$iv
            //  1917: aload           $this$constrain_u24lambda_u2d0$iv
            //  1919: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //  1922: astore          $this$_init__u24lambda_u2d21
            //  1924: aload           $this$_init__u24lambda_u2d21
            //  1926: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //  1929: dup            
            //  1930: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //  1933: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //  1936: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //  1939: aload           $this$_init__u24lambda_u2d21
            //  1941: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
            //  1944: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //  1947: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //  1950: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
            //  1953: aload           14
            //  1955: aload           switchContainer$delegate
            //  1957: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-20:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
            //  1960: checkcast       Lgg/essential/elementa/UIComponent;
            //  1963: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //  1966: pop            
            //  1967: new             Lgg/essential/gui/common/CompactEssentialToggle;
            //  1970: dup            
            //  1971: aload           rightSideEnabled
            //  1973: checkcast       Lgg/essential/elementa/state/State;
            //  1976: invokespecial   gg/essential/gui/common/CompactEssentialToggle.<init>:(Lgg/essential/elementa/state/State;)V
            //  1979: checkcast       Lgg/essential/elementa/UIComponent;
            //  1982: astore          $this$constrain$iv
            //  1984: aload           $this$constrain$iv
            //  1986: astore          15
            //  1988: aload           15
            //  1990: astore          $this$constrain_u24lambda_u2d0$iv
            //  1992: aload           $this$constrain_u24lambda_u2d0$iv
            //  1994: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //  1997: astore          $this$_init__u24lambda_u2d22
            //  1999: aload           $this$_init__u24lambda_u2d22
            //  2001: new             Lgg/essential/elementa/constraints/SiblingConstraint;
            //  2004: dup            
            //  2005: ldc_w           3.0
            //  2008: iconst_0       
            //  2009: iconst_2       
            //  2010: aconst_null    
            //  2011: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //  2014: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //  2017: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //  2020: aload           $this$_init__u24lambda_u2d22
            //  2022: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //  2025: dup            
            //  2026: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //  2029: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //  2032: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //  2035: aload           15
            //  2037: aload           switchContainer$delegate
            //  2039: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-20:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
            //  2042: checkcast       Lgg/essential/elementa/UIComponent;
            //  2045: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //  2048: pop            
            //  2049: new             Lgg/essential/gui/common/shadow/EssentialUIText;
            //  2052: dup            
            //  2053: ldc_w           "R"
            //  2056: iconst_0       
            //  2057: aconst_null    
            //  2058: iconst_0       
            //  2059: iconst_0       
            //  2060: iconst_0       
            //  2061: bipush          62
            //  2063: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
            //  2066: checkcast       Lgg/essential/elementa/UIComponent;
            //  2069: astore          $this$constrain$iv
            //  2071: aload           $this$constrain$iv
            //  2073: astore          15
            //  2075: aload           15
            //  2077: astore          $this$constrain_u24lambda_u2d0$iv
            //  2079: aload           $this$constrain_u24lambda_u2d0$iv
            //  2081: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //  2084: astore          $this$_init__u24lambda_u2d23
            //  2086: aload           $this$_init__u24lambda_u2d23
            //  2088: new             Lgg/essential/elementa/constraints/SiblingConstraint;
            //  2091: dup            
            //  2092: ldc_w           4.0
            //  2095: iconst_0       
            //  2096: iconst_2       
            //  2097: aconst_null    
            //  2098: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //  2101: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //  2104: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //  2107: aload           $this$_init__u24lambda_u2d23
            //  2109: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //  2112: dup            
            //  2113: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //  2116: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //  2119: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //  2122: aload           $this$_init__u24lambda_u2d23
            //  2124: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
            //  2127: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //  2130: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //  2133: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
            //  2136: aload           15
            //  2138: aload           switchContainer$delegate
            //  2140: invokestatic    gg/essential/gui/studio/CosmeticOption$PlacementOptions._init_$lambda-20:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/components/UIContainer;
            //  2143: checkcast       Lgg/essential/elementa/UIComponent;
            //  2146: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //  2149: pop            
            //  2150: aload           rightSideEnabled
            //  2152: new             Lgg/essential/gui/studio/CosmeticOption$PlacementOptions$9;
            //  2155: dup            
            //  2156: aload_0         /* this */
            //  2157: getfield        gg/essential/gui/studio/CosmeticOption$PlacementOptions.this$0:Lgg/essential/gui/studio/CosmeticOption;
            //  2160: aload           cosmeticId
            //  2162: invokespecial   gg/essential/gui/studio/CosmeticOption$PlacementOptions$9.<init>:(Lgg/essential/gui/studio/CosmeticOption;Ljava/lang/String;)V
            //  2165: checkcast       Lkotlin/jvm/functions/Function1;
            //  2168: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
            //  2171: pop            
            //  2172: return         
            //    Signature:
            //  (Lgg/essential/gui/studio/CosmeticOption;)V [from metadata: ()V]
            //  
            //    MethodParameters:
            //  Name    Flags  
            //  ------  -----
            //  this$0  
            //    StackMapTable: 00 19 FF 02 0B 00 0B 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 00 F9 00 34 FD 00 22 00 07 00 FC FF 00 5E 00 17 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 07 01 06 00 00 00 00 07 00 F4 00 00 00 01 07 00 FC 00 00 FD 00 21 07 01 2B 01 FF 00 35 00 1D 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 07 01 06 00 00 00 00 07 00 F4 00 00 00 01 07 00 FC 00 00 00 00 07 01 1A 01 00 00 40 07 00 61 48 07 00 61 FF 00 24 00 1F 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 07 01 06 00 00 00 00 07 00 F4 00 00 00 01 07 00 FC 00 00 00 00 00 01 00 07 00 61 00 00 40 07 00 61 48 07 00 61 FF 00 21 00 17 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 07 01 06 00 00 00 00 07 00 F4 00 00 00 01 07 00 FC 00 01 07 01 46 52 07 01 46 FF 00 03 00 12 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 07 00 FC 00 00 00 00 00 00 07 00 F4 00 00 FF 00 14 00 09 07 00 02 00 07 00 FA 00 00 00 00 00 07 00 F4 00 00 FF 00 21 00 05 07 00 02 00 07 00 FA 00 07 01 18 00 01 07 01 6A 4A 07 01 3D FF 00 16 00 09 07 00 02 00 07 00 FA 00 00 00 07 01 3D 07 01 1A 07 00 FC 00 00 FA 01 9A FF 00 FD 00 0F 07 00 02 00 00 00 00 00 00 07 01 1A 07 00 FA 00 00 00 00 00 07 00 FC 00 00 FF 00 2C 00 09 07 00 02 00 00 00 00 00 00 07 01 1A 07 00 FA 00 00 40 07 01 2B 58 07 01 2B 41 07 01 2B FF 01 B4 00 00 00 00
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        private final UIContainer getContent() {
            return (UIContainer)this.content$delegate.getValue((Object)this, (KProperty)PlacementOptions.$$delegatedProperties[0]);
        }
        
        private final EssentialUIText getPlacementText() {
            return (EssentialUIText)this.placementText$delegate.getValue((Object)this, (KProperty)PlacementOptions.$$delegatedProperties[1]);
        }
        
        private final int[] getState(final Map<String, ? extends List<CosmeticSetting>> currentSettings, final String cosmeticId, final List<CosmeticSetting> newSettings) {
            int currentX = 0;
            int currentY = 0;
            int currentZ = 0;
            final List list = (List)currentSettings.get(cosmeticId);
            if (list != null) {
                final List it = list;
                for (final CosmeticSetting i : it) {
                    if (Intrinsics.areEqual((Object)"PLAYER_POSITION_ADJUSTMENT", (Object)i.getType())) {
                        if (i.hasData("x")) {
                            final Number data = i.getData("x");
                            Intrinsics.checkNotNull((Object)data);
                            currentX = data.intValue();
                        }
                        if (i.hasData("y")) {
                            final Number data2 = i.getData("y");
                            Intrinsics.checkNotNull((Object)data2);
                            currentY = data2.intValue();
                        }
                        if (!i.hasData("z")) {
                            continue;
                        }
                        final Number data3 = i.getData("z");
                        Intrinsics.checkNotNull((Object)data3);
                        currentZ = data3.intValue();
                    }
                    else {
                        newSettings.add(i);
                    }
                }
            }
            return new int[] { currentX, currentY, currentZ };
        }
        
        private static final UIContainer _init_$lambda-6(final ReadWriteProperty<Object, UIContainer> $settingsContainer$delegate) {
            return (UIContainer)$settingsContainer$delegate.getValue((Object)null, (KProperty)PlacementOptions.$$delegatedProperties[3]);
        }
        
        private static final UIContainer _init_$lambda-11(final ReadWriteProperty<Object, UIContainer> $container$delegate) {
            return (UIContainer)$container$delegate.getValue((Object)null, (KProperty)PlacementOptions.$$delegatedProperties[4]);
        }
        
        private static final UIContainer _init_$lambda-16(final ReadWriteProperty<Object, UIContainer> $sideSettingContainer$delegate) {
            return (UIContainer)$sideSettingContainer$delegate.getValue((Object)null, (KProperty)PlacementOptions.$$delegatedProperties[6]);
        }
        
        private static final UIContainer _init_$lambda-20(final ReadWriteProperty<Object, UIContainer> $switchContainer$delegate) {
            return (UIContainer)$switchContainer$delegate.getValue((Object)null, (KProperty)PlacementOptions.$$delegatedProperties[7]);
        }
        
        public static final /* synthetic */ int[] access$getState(final PlacementOptions $this, final Map currentSettings, final String cosmeticId, final List newSettings) {
            return $this.getState(currentSettings, cosmeticId, newSettings);
        }
        
        static {
            $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlacementOptions.class, "content", "getContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlacementOptions.class, "placementText", "getPlacementText()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PlacementOptions.class, "close", "getClose()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlacementOptions.class, "settingsContainer", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlacementOptions.class, "container", "<v#1>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlacementOptions.class, "sliderLabel", "<v#2>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlacementOptions.class, "sideSettingContainer", "<v#3>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)PlacementOptions.class, "switchContainer", "<v#4>", 0)) };
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002�\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004�\u0006\u0005""" }, d2 = { "Lgg/essential/gui/studio/CosmeticOption$View;", "", "(Ljava/lang/String;I)V", "Grid", "Cart", "essential" })
    public enum View
    {
        Grid("Grid", 0), 
        Cart("Cart", 1);
        
        private static final /* synthetic */ View[] $VALUES;
        
        private View(final String $enum$name, final int $enum$ordinal) {
        }
        
        public static View[] values() {
            return View.$VALUES.clone();
        }
        
        public static View valueOf(final String value) {
            return Enum.valueOf(View.class, value);
        }
        
        private static final /* synthetic */ View[] $values() {
            return new View[] { View.Grid, View.Cart };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002�\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T�\u0006\u0002
                                                       \u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T�\u0006\u0002
                                                       \u0000�\u0006\u0006""" }, d2 = { "Lgg/essential/gui/studio/CosmeticOption$Companion;", "", "()V", "cartPricePadding", "", "gridPricePadding", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
