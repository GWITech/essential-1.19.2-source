package gg.essential.gui.about;

import kotlin.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0016
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b	\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b	j\u0002\b
                                                   j\u0002\b\u000bj\u0002\b\f¨\u0006""" }, d2 = { "Lgg/essential/gui/about/Category;", "", "nameState", "Lgg/essential/elementa/state/BasicState;", "", "(Ljava/lang/String;ILgg/essential/elementa/state/BasicState;)V", "getNameState", "()Lgg/essential/elementa/state/BasicState;", "CHANGELOG", "TERMS", "PRIVACY", "LICENSES", "IMPRINT", "essential" })
public enum Category
{
    @NotNull
    private final BasicState<String> nameState;
    
    CHANGELOG("CHANGELOG", 0, new BasicState<String>("Changelog")), 
    TERMS("TERMS", 1, new BasicState<String>("Terms of Service")), 
    PRIVACY("PRIVACY", 2, new BasicState<String>("Privacy Policy")), 
    LICENSES("LICENSES", 3, new BasicState<String>("Licenses")), 
    IMPRINT("IMPRINT", 4, new BasicState<String>("Imprint"));
    
    private static final /* synthetic */ Category[] $VALUES;
    
    private Category(final String $enum$name, final int $enum$ordinal, final BasicState<String> nameState) {
        this.nameState = nameState;
    }
    
    @NotNull
    public final BasicState<String> getNameState() {
        return this.nameState;
    }
    
    public static Category[] values() {
        return Category.$VALUES.clone();
    }
    
    public static Category valueOf(final String value) {
        return Enum.valueOf(Category.class, value);
    }
    
    private static final /* synthetic */ Category[] $values() {
        return new Category[] { Category.CHANGELOG, Category.TERMS, Category.PRIVACY, Category.LICENSES, Category.IMPRINT };
    }
    
    static {
        $VALUES = $values();
    }
}
