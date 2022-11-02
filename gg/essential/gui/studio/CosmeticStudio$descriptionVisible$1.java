package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H
                                                   ¢\u0006\u0004\b\u0005\u0010\u0006""" }, d2 = { "<anonymous>", "", "it", "", "Lorg/jetbrains/annotations/NotNull;", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;" })
static final class CosmeticStudio$descriptionVisible$1 extends Lambda implements Function1<String, Boolean> {
    public static final CosmeticStudio$descriptionVisible$1 INSTANCE;
    
    CosmeticStudio$descriptionVisible$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return !StringsKt.isBlank((CharSequence)it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((String)p1);
    }
    
    static {
        CosmeticStudio$descriptionVisible$1.INSTANCE = new CosmeticStudio$descriptionVisible$1();
    }
}