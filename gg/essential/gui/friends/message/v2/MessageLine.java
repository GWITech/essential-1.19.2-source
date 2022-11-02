package gg.essential.gui.friends.message.v2;

import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010	\u001a\u00020\bH\u0016J\b\u0010
                                                   \u001a\u00020\bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\f\u000e¨\u0006\u000f""" }, d2 = { "Lgg/essential/gui/friends/message/v2/MessageLine;", "Lgg/essential/elementa/components/UIContainer;", "messageWrapper", "Lgg/essential/gui/friends/message/v2/MessageWrapper;", "(Lgg/essential/gui/friends/message/v2/MessageWrapper;)V", "getMessageWrapper", "()Lgg/essential/gui/friends/message/v2/MessageWrapper;", "beginHighlight", "", "flashHighlight", "releaseHighlight", "Companion", "Lgg/essential/gui/friends/message/v2/ParagraphLine;", "Lgg/essential/gui/friends/message/v2/ImageEmbed;", "Lgg/essential/gui/friends/message/v2/OutfitEmbed;", "essential" })
public abstract class MessageLine extends UIContainer
{
    @NotNull
    private final MessageWrapper messageWrapper;
    
    private MessageLine(final MessageWrapper messageWrapper) {
        super();
        this.messageWrapper = messageWrapper;
    }
    
    @NotNull
    public final MessageWrapper getMessageWrapper() {
        return this.messageWrapper;
    }
    
    public void flashHighlight() {
        this.beginHighlight();
        this.delay(500L, (Function0<Unit>)new MessageLine$flashHighlight.MessageLine$flashHighlight$1(this));
    }
    
    public abstract void beginHighlight();
    
    public abstract void releaseHighlight();
    
    public MessageLine(final MessageWrapper messageWrapper, final byte b) {
        this(messageWrapper);
    }
    
    static {
        new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0007
                                                       \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                       \u0000¨\u0006\u0006""" }, d2 = { "Lgg/essential/gui/friends/message/v2/MessageLine$Companion;", "", "()V", "highlightAnimationHoldTime", "", "highlightAnimationTransitionDuration", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
