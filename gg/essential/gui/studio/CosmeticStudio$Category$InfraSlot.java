package gg.essential.gui.studio;

import kotlin.*;
import gg.essential.cosmetics.model.*;
import kotlin.jvm.internal.*;
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
