package gg.essential.gui.friends.message.v2;

import kotlin.*;
import java.net.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010	\u001a\u00020
                                                   H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b""" }, d2 = { "Lgg/essential/gui/friends/message/v2/ImageEmbed;", "Lgg/essential/gui/friends/message/v2/MessageLine;", "url", "Ljava/net/URL;", "wrapper", "Lgg/essential/gui/friends/message/v2/MessageWrapper;", "(Ljava/net/URL;Lgg/essential/gui/friends/message/v2/MessageWrapper;)V", "getUrl", "()Ljava/net/URL;", "copyImageToClipboard", "", "essential" })
public abstract class ImageEmbed extends MessageLine
{
    @NotNull
    private final URL url;
    
    public ImageEmbed(@NotNull final URL url, @NotNull final MessageWrapper wrapper) {
        Intrinsics.checkNotNullParameter((Object)url, "url");
        Intrinsics.checkNotNullParameter((Object)wrapper, "wrapper");
        super(wrapper, (byte)0);
        this.url = url;
    }
    
    @NotNull
    public final URL getUrl() {
        return this.url;
    }
    
    public abstract void copyImageToClipboard();
}
