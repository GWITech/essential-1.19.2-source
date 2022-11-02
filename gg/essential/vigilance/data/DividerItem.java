package gg.essential.vigilance.data;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.vigilance.gui.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "Lgg/essential/vigilance/data/DividerItem;", "Lgg/essential/vigilance/data/CategoryItem;", "name", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "toSettingsObject", "Lgg/essential/vigilance/gui/Setting;", "toString", "Vigilance" })
public final class DividerItem extends CategoryItem
{
    @NotNull
    private final String name;
    @Nullable
    private final String description;
    
    public DividerItem(@NotNull final String name, @Nullable final String description) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        super(null);
        this.name = name;
        this.description = description;
    }
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    @NotNull
    @Override
    public Setting toSettingsObject() {
        return new Divider(this.name, this.description);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Divider \"" + this.name + '\"';
    }
}
