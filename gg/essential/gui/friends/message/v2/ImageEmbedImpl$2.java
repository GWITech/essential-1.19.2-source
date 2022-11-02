package gg.essential.gui.friends.message.v2;

import kotlin.jvm.functions.*;
import kotlin.*;
import java.net.*;
import kotlin.jvm.internal.*;
import java.util.*;
import gg.essential.elementa.*;
import java.awt.image.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010#
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012
                                                    \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012
                                                    \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H
                                                   ¢\u0006\u0002\b\u0007""" }, d2 = { "<anonymous>", "", "trustedHosts", "", "", "kotlin.jvm.PlatformType", "", "invoke" })
static final class ImageEmbedImpl$2 extends Lambda implements Function1<Set<String>, Unit> {
    final /* synthetic */ URL $url;
    final /* synthetic */ ImageEmbedImpl this$0;
    
    ImageEmbedImpl$2(final URL $url, final ImageEmbedImpl $receiver) {
        this.$url = $url;
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(final Set<String> trustedHosts) {
        final String host = this.$url.getHost();
        Intrinsics.checkNotNullExpressionValue((Object)host, "url.host");
        final String lowerCase = host.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (trustedHosts.contains(lowerCase)) {
            if (ImageEmbedImpl.access$getLoading$p(this.this$0) == null) {
                ImageEmbedImpl.access$prepareAndLoad(this.this$0);
            }
            UIComponent.hide$default(ImageEmbedImpl.access$getAddTrustedHostButton(this.this$0), false, 1, null);
        }
        else {
            ImageEmbedImpl.access$setLoading$p(this.this$0, null);
            if (ImageEmbedImpl.access$getLoadedImage$p(this.this$0) != null) {
                ImageEmbedImpl.access$setLoadedImage$p(this.this$0, null);
            }
            this.this$0.clearChildren();
            UIComponent.unhide$default(ImageEmbedImpl.access$getAddTrustedHostButton(this.this$0), false, 1, null);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Set<String>)p1);
        return Unit.INSTANCE;
    }
}