package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class EssentialDropDown$selectedText$1 extends Lambda implements Function1<Integer, String> {
    final /* synthetic */ EssentialDropDown this$0;
    
    EssentialDropDown$selectedText$1(final EssentialDropDown $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final String invoke(final int it) {
        return EssentialDropDown.access$getOptions$p(this.this$0).get(it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(((Number)p1).intValue());
    }
}