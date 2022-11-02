package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "it", "", "invoke" })
static final class EssentialToggle$2 extends Lambda implements Function1<Boolean, Color> {
    final /* synthetic */ EssentialToggle this$0;
    
    EssentialToggle$2(final EssentialToggle $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Color invoke(final boolean it) {
        return it ? EssentialToggle.access$getEnabledColor$p(this.this$0) : EssentialToggle.access$getDisabledColor$p(this.this$0);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
}