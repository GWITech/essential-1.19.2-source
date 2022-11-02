package gg.essential.data;

import kotlin.*;
import gg.essential.gui.about.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   j\u0002\b\u000b¨\u0006\f""" }, d2 = { "Lgg/essential/data/MenuData$FetchableCategory;", "", "category", "Lgg/essential/gui/about/Category;", "query", "", "(Ljava/lang/String;ILgg/essential/gui/about/Category;Ljava/lang/String;)V", "getCategory", "()Lgg/essential/gui/about/Category;", "getQuery", "()Ljava/lang/String;", "PRIVACY", "essential" })
public enum FetchableCategory
{
    @NotNull
    private final Category category;
    @NotNull
    private final String query;
    
    PRIVACY("PRIVACY", Category.PRIVACY, "privacy-policy");
    
    private static final /* synthetic */ FetchableCategory[] $VALUES;
    
    private FetchableCategory(final String $enum$name, final Category category, final String query) {
        this.category = category;
        this.query = query;
    }
    
    @NotNull
    public final Category getCategory() {
        return this.category;
    }
    
    @NotNull
    public final String getQuery() {
        return this.query;
    }
    
    public static FetchableCategory[] values() {
        return FetchableCategory.$VALUES.clone();
    }
    
    public static FetchableCategory valueOf(final String value) {
        return Enum.valueOf(FetchableCategory.class, value);
    }
    
    private static final /* synthetic */ FetchableCategory[] $values() {
        return new FetchableCategory[] { FetchableCategory.PRIVACY };
    }
    
    static {
        $VALUES = $values();
    }
}
