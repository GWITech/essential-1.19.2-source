package gg.essential.gui.friends.message.v2;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010#
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012
                                                    \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012
                                                    \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H
                                                   ¢\u0006\u0004\b\u0007\u0010\b""" }, d2 = { "<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/util/Set;)Ljava/lang/Boolean;" })
static final class ImageEmbedImpl$FocusedView$dontEmbed$2$1 extends Lambda implements Function1<Set<String>, Boolean> {
    final /* synthetic */ ImageEmbedImpl this$0;
    
    ImageEmbedImpl$FocusedView$dontEmbed$2$1(final ImageEmbedImpl $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(final Set<String> it) {
        final String host = this.this$0.getUrl().getHost();
        Intrinsics.checkNotNullExpressionValue((Object)host, "url.host");
        final String lowerCase = host.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return it.contains(lowerCase);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Set)p1);
    }
}