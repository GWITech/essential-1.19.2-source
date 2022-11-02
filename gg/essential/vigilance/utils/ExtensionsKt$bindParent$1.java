package gg.essential.vigilance.utils;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "Lgg/essential/elementa/UIComponent;", "T", "it", "", "invoke" })
static final class ExtensionsKt$bindParent$1 extends Lambda implements Function1<Boolean, UIComponent> {
    final /* synthetic */ UIComponent $parent;
    
    ExtensionsKt$bindParent$1(final UIComponent $parent) {
        this.$parent = $parent;
        super(1);
    }
    
    @Nullable
    public final UIComponent invoke(final boolean it) {
        return it ? this.$parent : null;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
}