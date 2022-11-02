package gg.essential.gui.friends.message;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\r
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke" })
static final class MessageUtils$handleMarkdownUrls$2 extends Lambda implements Function1<MatchResult, CharSequence> {
    public static final MessageUtils$handleMarkdownUrls$2 INSTANCE;
    
    MessageUtils$handleMarkdownUrls$2() {
        super(1);
    }
    
    @NotNull
    public final CharSequence invoke(@NotNull final MatchResult it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final String url = it.getValue();
        return (CharSequence)("<" + (StringsKt.contains$default((CharSequence)url, (CharSequence)"://", false, 2, (Object)null) ? url : ("https://" + url)));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((MatchResult)p1);
    }
    
    static {
        MessageUtils$handleMarkdownUrls$2.INSTANCE = new MessageUtils$handleMarkdownUrls$2();
    }
}