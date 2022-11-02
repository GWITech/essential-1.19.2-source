package gg.essential.gui.studio;

import gg.essential.network.cosmetics.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import kotlin.jvm.internal.*;
import gg.essential.*;
import kotlin.*;
import gg.essential.mod.cosmetics.*;
import java.util.*;
import gg.essential.cosmetics.model.*;
import org.jetbrains.annotations.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000H
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   \u0082\u0001\u0005\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category;", "", "order", "", "id", "", "(ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getOrder", "()I", "filter", "", "cosmetic", "Lgg/essential/network/cosmetics/Cosmetic;", "cosmeticStudio", "Lgg/essential/gui/studio/CosmeticStudio;", "cosmeticsManager", "Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;", "Cart", "InfraSlot", "New", "Owned", "Slot", "Lgg/essential/gui/studio/CosmeticStudio$Category$Owned;", "Lgg/essential/gui/studio/CosmeticStudio$Category$New;", "Lgg/essential/gui/studio/CosmeticStudio$Category$InfraSlot;", "Lgg/essential/gui/studio/CosmeticStudio$Category$Slot;", "Lgg/essential/gui/studio/CosmeticStudio$Category$Cart;", "essential" })
public abstract static class Category
{
    @NotNull
    private final String id;
    
    private Category(final String id, final byte b) {
        super();
        this.id = id;
    }
    
    @NotNull
    public final String getId() {
        return this.id;
    }
    
    public final boolean filter(@NotNull final Cosmetic cosmetic, @NotNull final CosmeticStudio cosmeticStudio, @NotNull final CosmeticsManager cosmeticsManager) {
        Intrinsics.checkNotNullParameter((Object)cosmetic, "cosmetic");
        Intrinsics.checkNotNullParameter((Object)cosmeticStudio, "cosmeticStudio");
        Intrinsics.checkNotNullParameter((Object)cosmeticsManager, "cosmeticsManager");
        boolean b;
        if (this instanceof Slot) {
            final CosmeticType cosmeticType = cosmeticsManager.getCosmeticType(cosmetic.getTypeId());
            b = (((cosmeticType != null) ? cosmeticType.getSlot() : null) == ((Slot)this).getSlot());
        }
        else if (this instanceof Owned) {
            if (cosmeticsManager.getUnlockedCosmetics().contains(cosmetic.getId()) && !Intrinsics.areEqual((Object)cosmetic.getId(), (Object)"CAPE_DISABLED")) {
                final CosmeticType cosmeticType2 = cosmeticsManager.getCosmeticType(cosmetic.getTypeId());
                if (((cosmeticType2 != null) ? cosmeticType2.getSlot() : null) != CosmeticSlot.CAPE || cosmetic.getId().length() != 64) {
                    b = true;
                    return b;
                }
            }
            b = false;
        }
        else if (this instanceof New) {
            final Boolean value = Essential.getInstance().getConnectionManager().getNoticesManager().getCosmeticNotices().getNewState(cosmetic.getId()).get();
            Intrinsics.checkNotNullExpressionValue((Object)value, "getInstance().connection\u2026d)\n                .get()");
            b = value;
        }
        else if (this instanceof Cart) {
            b = cosmeticStudio.getCartItems().get().contains(cosmetic.getId());
        }
        else {
            if (!(this instanceof InfraSlot)) {
                throw new NoWhenBranchMatchedException();
            }
            final Map<String, Integer> categories = cosmetic.getCategories();
            if (categories != null) {
                final Set<String> keySet = categories.keySet();
                if (keySet != null) {
                    b = keySet.contains(this.id);
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public static /* synthetic */ boolean filter$default$50d04712(final Category category, final Cosmetic cosmetic, final CosmeticStudio cosmeticStudio, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: filter");
        }
        return category.filter(cosmetic, cosmeticStudio, cosmeticStudio.getCosmeticsManager());
    }
    
    public Category(final String id) {
        this(id, (byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$Owned;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "()V", "essential" })
    public static final class Owned extends Category
    {
        @NotNull
        public static final Owned INSTANCE;
        
        private Owned() {
            super("OWNED");
        }
        
        static {
            INSTANCE = new Owned();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$New;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "()V", "essential" })
    public static final class New extends Category
    {
        @NotNull
        public static final New INSTANCE;
        
        private New() {
            super("NEW");
        }
        
        static {
            INSTANCE = new New();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000*
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0006
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010	\u001a\u00020
                                                       2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$InfraSlot;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "category", "Lgg/essential/cosmetics/model/CosmeticCategory;", "(Lgg/essential/cosmetics/model/CosmeticCategory;)V", "getCategory", "()Lgg/essential/cosmetics/model/CosmeticCategory;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "essential" })
    public static final class InfraSlot extends Category
    {
        @NotNull
        private final CosmeticCategory category;
        
        public InfraSlot(@NotNull final CosmeticCategory category) {
            Intrinsics.checkNotNullParameter((Object)category, "category");
            category.getOrder();
            final String id = category.getId();
            Intrinsics.checkNotNullExpressionValue((Object)id, "category.id");
            super(id);
            this.category = category;
        }
        
        @NotNull
        public final CosmeticCategory getCategory() {
            return this.category;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "InfraSlot(category=" + this.category;
        }
        
        @Override
        public int hashCode() {
            return this.category.hashCode();
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            return this == other || (other instanceof InfraSlot && Intrinsics.areEqual((Object)this.category, (Object)((InfraSlot)other).category));
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000*
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0006
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010	\u001a\u00020
                                                       2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$Slot;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "slot", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "(Lgg/essential/mod/cosmetics/CosmeticSlot;)V", "getSlot", "()Lgg/essential/mod/cosmetics/CosmeticSlot;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "essential" })
    public static final class Slot extends Category
    {
        @NotNull
        private final CosmeticSlot slot;
        
        public Slot(@NotNull final CosmeticSlot slot) {
            Intrinsics.checkNotNullParameter((Object)slot, "slot");
            ArraysKt.indexOf((Object[])CosmeticStudio.Companion.getSlotOrder(), (Object)slot);
            super(slot.name());
            this.slot = slot;
        }
        
        @NotNull
        public final CosmeticSlot getSlot() {
            return this.slot;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Slot(slot=" + this.slot;
        }
        
        @Override
        public int hashCode() {
            return this.slot.hashCode();
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            return this == other || (other instanceof Slot && this.slot == ((Slot)other).slot);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$Cart;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "()V", "essential" })
    public static final class Cart extends Category
    {
        @NotNull
        public static final Cart INSTANCE;
        
        private Cart() {
            super("cart");
        }
        
        static {
            INSTANCE = new Cart();
        }
    }
}
