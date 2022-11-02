package gg.essential.gui.studio;

import kotlin.*;
import gg.essential.mod.cosmetics.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;

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
                                                   \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003�\u0006\u0002\u0010\u0004J	\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010	\u001a\u00020
                                                   2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003�\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006�\u0006\u0011""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$Slot;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "slot", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "(Lgg/essential/mod/cosmetics/CosmeticSlot;)V", "getSlot", "()Lgg/essential/mod/cosmetics/CosmeticSlot;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "essential" })
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
