package gg.essential.gui.friends.message;

import kotlin.jvm.internal.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
final synthetic class OptionMenu$init$1 extends MutablePropertyReference0Impl {
    OptionMenu$init$1(final Object receiver) {
        super(receiver, (Class)OptionMenu.class, "outlineColorAlpha", "getOutlineColorAlpha()F", 0);
    }
    
    @Nullable
    public Object get() {
        return OptionMenu.access$getOutlineColorAlpha((OptionMenu)this.receiver);
    }
    
    public void set(@Nullable final Object value) {
        OptionMenu.access$setOutlineColorAlpha((OptionMenu)this.receiver, ((Number)value).floatValue());
    }
}