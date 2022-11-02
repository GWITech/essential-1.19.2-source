package gg.essential.vigilance.data;

import kotlin.*;
import gg.essential.vigilance.gui.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/vigilance/data/CategoryItem;", "", "()V", "toSettingsObject", "Lgg/essential/vigilance/gui/Setting;", "Lgg/essential/vigilance/data/DividerItem;", "Lgg/essential/vigilance/data/PropertyItem;", "Vigilance" })
public abstract class CategoryItem
{
    private CategoryItem() {
        super();
    }
    
    @Nullable
    public abstract Setting toSettingsObject();
    
    public CategoryItem(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
