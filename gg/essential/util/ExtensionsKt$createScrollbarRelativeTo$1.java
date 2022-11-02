package gg.essential.util;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class ExtensionsKt$createScrollbarRelativeTo$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ UIComponent $parent;
    final /* synthetic */ ReadWriteProperty<Object, UIContainer> $scrollContainer$delegate;
    
    ExtensionsKt$createScrollbarRelativeTo$1(final UIComponent $parent, final ReadWriteProperty<Object, UIContainer> $scrollContainer$delegate) {
        this.$parent = $parent;
        this.$scrollContainer$delegate = $scrollContainer$delegate;
        super(0);
    }
    
    public final void invoke() {
        this.$parent.removeChild(ExtensionsKt.access$createScrollbarRelativeTo$lambda-21(this.$scrollContainer$delegate));
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}