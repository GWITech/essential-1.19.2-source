package gg.essential.vigilance.data;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000f" }, d2 = { "Lgg/essential/vigilance/data/Category;", "", "name", "", "items", "", "Lgg/essential/vigilance/data/CategoryItem;", "description", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getName", "toString", "Vigilance" })
public final class Category
{
    @NotNull
    private final String name;
    @NotNull
    private final List<CategoryItem> items;
    @Nullable
    private final String description;
    
    public Category(@NotNull final String name, @NotNull final List<? extends CategoryItem> items, @Nullable final String description) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)items, "items");
        super();
        this.name = name;
        this.items = (List<CategoryItem>)items;
        this.description = description;
    }
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    @NotNull
    public final List<CategoryItem> getItems() {
        return this.items;
    }
    
    @Nullable
    public final String getDescription() {
        return this.description;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Category \"" + this.name + "\"\n " + CollectionsKt.joinToString$default((Iterable)this.items, (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)Category$toString.Category$toString$1.INSTANCE, 30, (Object)null);
    }
}
