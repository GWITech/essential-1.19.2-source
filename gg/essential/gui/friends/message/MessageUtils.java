package gg.essential.gui.friends.message;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.functions.*;
import kotlin.text.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.*;
import gg.essential.elementa.markdown.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000J
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2
                                                   \b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010"\u001a\u00020!J
                                                   \u0010#\u001a\u00020$*\u00020$R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010	\u001a\u00020
                                                   X\u0086T¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b
                                                   \u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0014\u0010\u000eR\u000e\u0010\u0015\u001a\u00020
                                                   X\u0086T¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0086T¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0018\u001a\u00020\f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0019\u0010\u000e¨\u0006%""" }, d2 = { "Lgg/essential/gui/friends/message/MessageUtils;", "", "()V", "INLINE_STYLE_LINK_REGEX", "Lkotlin/text/Regex;", "getINLINE_STYLE_LINK_REGEX", "()Lkotlin/text/Regex;", "URL_REGEX", "getURL_REGEX", "dotWidth", "", "failedMessageMarkdownConfig", "Lgg/essential/elementa/markdown/MarkdownConfig;", "getFailedMessageMarkdownConfig", "()Lgg/essential/elementa/markdown/MarkdownConfig;", "fullMarkdownConfig", "getFullMarkdownConfig", "imageEmbedRegex", "getImageEmbedRegex", "incomingMessageMarkdownConfig", "getIncomingMessageMarkdownConfig", "messagePadding", "messageTimeEpocMillis", "", "outgoingMessageMarkdownConfig", "getOutgoingMessageMarkdownConfig", "getMessageWidth", "Lgg/essential/elementa/constraints/WidthConstraint;", "isAnnouncement", "", "boundTo", "Lgg/essential/elementa/UIComponent;", "getSentTimeStamp", "", "messageId", "handleMarkdownUrls", "", "essential" })
public final class MessageUtils
{
    @NotNull
    public static final MessageUtils INSTANCE;
    @NotNull
    private static final MarkdownConfig outgoingMessageMarkdownConfig;
    @NotNull
    private static final MarkdownConfig incomingMessageMarkdownConfig;
    @NotNull
    private static final MarkdownConfig failedMessageMarkdownConfig;
    @NotNull
    private static final MarkdownConfig fullMarkdownConfig;
    @NotNull
    private static final Regex INLINE_STYLE_LINK_REGEX;
    @NotNull
    private static final Regex URL_REGEX;
    @NotNull
    private static final Regex imageEmbedRegex;
    
    private MessageUtils() {
        super();
    }
    
    @NotNull
    public final WidthConstraint getMessageWidth(final boolean isAnnouncement, @Nullable final UIComponent boundTo) {
        WidthConstraint widthConstraint;
        if (isAnnouncement) {
            final RelativeConstraint $this$getMessageWidth_u24lambda_u2d0 = UtilitiesKt.getPercent(80);
            $this$getMessageWidth_u24lambda_u2d0.setConstrainTo(boundTo);
            widthConstraint = $this$getMessageWidth_u24lambda_u2d0;
        }
        else {
            final RelativeConstraint $this$getMessageWidth_u24lambda_u2d2 = UtilitiesKt.getPercent(40);
            $this$getMessageWidth_u24lambda_u2d2.setConstrainTo(boundTo);
            widthConstraint = ConstraintsKt.plus($this$getMessageWidth_u24lambda_u2d2, UtilitiesKt.getPixels(3.0f));
        }
        return widthConstraint;
    }
    
    public static /* synthetic */ WidthConstraint getMessageWidth$default$5943b3e6$58ff3b4a(final MessageUtils messageUtils, final boolean isAnnouncement) {
        return messageUtils.getMessageWidth(isAnnouncement, null);
    }
    
    public final long getSentTimeStamp(final long messageId) {
        return (messageId >> 22) + 1609459200L;
    }
    
    @NotNull
    public final MarkdownConfig getOutgoingMessageMarkdownConfig() {
        return MessageUtils.outgoingMessageMarkdownConfig;
    }
    
    @NotNull
    public final MarkdownConfig getIncomingMessageMarkdownConfig() {
        return MessageUtils.incomingMessageMarkdownConfig;
    }
    
    @NotNull
    public final MarkdownConfig getFailedMessageMarkdownConfig() {
        return MessageUtils.failedMessageMarkdownConfig;
    }
    
    @NotNull
    public final MarkdownConfig getFullMarkdownConfig() {
        return MessageUtils.fullMarkdownConfig;
    }
    
    @NotNull
    public final Regex getURL_REGEX() {
        return MessageUtils.URL_REGEX;
    }
    
    @NotNull
    public final String handleMarkdownUrls(@NotNull final String $this$handleMarkdownUrls) {
        Intrinsics.checkNotNullParameter((Object)$this$handleMarkdownUrls, "<this>");
        String result = $this$handleMarkdownUrls;
        result = MessageUtils.INLINE_STYLE_LINK_REGEX.replace((CharSequence)result, (Function1)MessageUtils$handleMarkdownUrls.MessageUtils$handleMarkdownUrls$1.INSTANCE);
        result = StringsKt.replace$default(MessageUtils.URL_REGEX.replace((CharSequence)result, (Function1)MessageUtils$handleMarkdownUrls.MessageUtils$handleMarkdownUrls$2.INSTANCE), "`", "", false, 4, (Object)null);
        return result;
    }
    
    @NotNull
    public final Regex getImageEmbedRegex() {
        return MessageUtils.imageEmbedRegex;
    }
    
    static {
        INSTANCE = new MessageUtils();
        outgoingMessageMarkdownConfig = new MarkdownConfig(new HeaderConfig(null, null, null, null, null, null, null, false, 127, null), new ListConfig(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 255, null), null, new TextConfig(null, false, null, null, null, EssentialPalette.TEXT_HIGHLIGHT, false, 95, null), new BlockquoteConfig(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, false, 255, null), null, null, null, 228, null);
        incomingMessageMarkdownConfig = new MarkdownConfig(new HeaderConfig(null, null, null, null, null, null, null, false, 127, null), new ListConfig(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 255, null), null, new TextConfig(null, false, new Color(1052688), null, null, EssentialPalette.ACCENT_BLUE, false, 91, null), new BlockquoteConfig(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, false, 255, null), null, null, null, 228, null);
        failedMessageMarkdownConfig = MarkdownConfig.copy$default(MessageUtils.outgoingMessageMarkdownConfig, null, null, null, TextConfig.copy$default(MessageUtils.outgoingMessageMarkdownConfig.getTextConfig(), EssentialPalette.FAILED_MESSAGE_TEXT, false, null, null, null, null, false, 126, null), null, null, null, null, 247, null);
        fullMarkdownConfig = new MarkdownConfig(null, null, null, new TextConfig(null, false, new Color(1052688), null, null, EssentialPalette.ACCENT_BLUE, false, 91, null), null, null, null, null, 247, null);
        INLINE_STYLE_LINK_REGEX = new Regex("\\[(?<text>.*)]\\(.*\\)");
        URL_REGEX = new Regex("(https?://(?:www\\.|(?!www))[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|https?://(?:www\\.|(?!www))[a-zA-Z0-9]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9]+\\.[^\\s]{2,})");
        imageEmbedRegex = new Regex("<meta property=\"og:image\" content=\"(?<url>.+?)\"");
    }
}
