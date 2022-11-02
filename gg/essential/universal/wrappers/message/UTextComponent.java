package gg.essential.universal.wrappers.message;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.*;
import java.util.*;
import net.minecraft.text.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u008e\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\f
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0000
                                                   \u0002\b
                                                   
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010!
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\u0018\u0000 V2\u00020\u0001:\u0002VWB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001J\b\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u000208H\u0016J\u0006\u00109\u001a\u000202J\b\u0010:\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020\u0007H\u0016J\b\u0010<\u001a\u00020=H\u0016J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010?H\u0016J\b\u0010@\u001a\u00020\u0003H\u0016J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u000202H\u0002J\b\u0010D\u001a\u000202H\u0002J\b\u0010E\u001a\u000202H\u0002J\u001a\u0010F\u001a\u00020\u00002
                                                   \u0010G\u001a\u00060
                                                   j\u0002`\u000b2\u0006\u0010	\u001a\u00020\u0003J\u001e\u0010H\u001a\u00020\u00002\u000e\u0010G\u001a
                                                   \u0012\u0002\b\u00030 j\u0002`!2\u0006\u0010	\u001a\u00020'J\u0010\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020KH\u0002J*\u0010L\u001a\b\u0012\u0004\u0012\u0002HN0M"\u0004\b\u0000\u0010N2\f\u0010O\u001a\b\u0012\u0004\u0012\u0002HN0P2\u0006\u0010Q\u001a\u00020BH\u0016J"\u0010L\u001a\b\u0012\u0004\u0012\u0002HN0M"\u0004\b\u0000\u0010N2\f\u0010R\u001a\b\u0012\u0004\u0012\u0002HN0SH\u0016J\u0014\u0010T\u001a\u00020\u0003*\u00020\u00032\u0006\u0010U\u001a\u00020\u0018H\u0002R4\u0010\f\u001a
                                                   \u0018\u00010
                                                   j\u0004\u0018\u0001`\u000b2\u000e\u0010	\u001a
                                                   \u0018\u00010
                                                   j\u0004\u0018\u0001`\u000b@FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\r\u0010\u000e"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010	\u001a\u0004\u0018\u00010\u0003@FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0013"\u0004\b\u0014\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007@BX\u0086.¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010	\u001a\u00020\u0018@FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001a\u0010\u001b"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R<\u0010"\u001a\u000e\u0012\u0002\b\u0003\u0018\u00010 j\u0004\u0018\u0001`!2\u0012\u0010	\u001a\u000e\u0012\u0002\b\u0003\u0018\u00010 j\u0004\u0018\u0001`!@FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b#\u0010$"\u0004\b%\u0010&R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010	\u001a\u0004\u0018\u00010'@FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b)\u0010*"\u0004\b+\u0010,R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010	\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b-\u0010\u0013"\u0004\b.\u0010\u0004R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0013¨\u0006X""" }, d2 = { "Lgg/essential/universal/wrappers/message/UTextComponent;", "Lnet/minecraft/text/Text;", "text", "", "(Ljava/lang/String;)V", "component", "(Lnet/minecraft/text/Text;)V", "Lnet/minecraft/text/MutableText;", "(Lnet/minecraft/text/MutableText;)V", "value", "Lnet/minecraft/text/ClickEvent$Action;", "Lgg/essential/universal/utils/MCClickEventAction;", "clickAction", "getClickAction", "()Lnet/minecraft/text/ClickEvent$Action;", "setClickAction", "(Lnet/minecraft/text/ClickEvent$Action;)V", "clickValue", "getClickValue", "()Ljava/lang/String;", "setClickValue", "<set-?>", "getComponent", "()Lnet/minecraft/text/MutableText;", "", "formatted", "getFormatted", "()Z", "setFormatted", "(Z)V", "formattedText", "getFormattedText", "Lnet/minecraft/text/HoverEvent$Action;", "Lgg/essential/universal/utils/MCHoverEventAction;", "hoverAction", "getHoverAction", "()Lnet/minecraft/text/HoverEvent$Action;", "setHoverAction", "(Lnet/minecraft/text/HoverEvent$Action;)V", "", "hoverValue", "getHoverValue", "()Ljava/lang/Object;", "setHoverValue", "(Ljava/lang/Object;)V", "getText", "setText", "unformattedText", "getUnformattedText", "actionBar", "", "appendSibling", "asOrderedText", "Lnet/minecraft/text/OrderedText;", "asTruncatedString", "maxLen", "", "chat", "copy", "copyContentOnly", "getContent", "Lnet/minecraft/text/TextContent;", "getSiblings", "", "getString", "getStyle", "Lnet/minecraft/text/Style;", "reInstance", "reInstanceClick", "reInstanceHover", "setClick", "action", "setHover", "setHoverEventHelper", "event", "Lnet/minecraft/text/HoverEvent;", "visit", "Ljava/util/Optional;", "T", "p_230439_1_", "Lnet/minecraft/text/StringVisitable$StyledVisitor;", "p_230439_2_", "p_230438_1_", "Lnet/minecraft/text/StringVisitable$Visitor;", "formatIf", "predicate", "Companion", "TextBuilder", "universalcraft" })
public final class UTextComponent implements Text
{
    @NotNull
    public static final UTextComponent.Companion Companion;
    private MutableText component;
    @NotNull
    private String text;
    private boolean formatted;
    @Nullable
    private ClickEvent$Action clickAction;
    @Nullable
    private String clickValue;
    @Nullable
    private HoverEvent$Action<?> hoverAction;
    @Nullable
    private Object hoverValue;
    
    @NotNull
    public final MutableText getComponent() {
        final MutableText component = this.component;
        if (component != null) {
            return component;
        }
        Intrinsics.throwUninitializedPropertyAccessException("component");
        return null;
    }
    
    @NotNull
    public final String getText() {
        return this.text;
    }
    
    public final void setText(@NotNull final String value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.text = value;
        this.reInstance();
    }
    
    public final boolean getFormatted() {
        return this.formatted;
    }
    
    public final void setFormatted(final boolean value) {
        this.formatted = value;
        this.reInstance();
    }
    
    @Nullable
    public final ClickEvent$Action getClickAction() {
        return this.clickAction;
    }
    
    public final void setClickAction(@Nullable final ClickEvent$Action value) {
        this.clickAction = value;
        this.reInstance();
    }
    
    @Nullable
    public final String getClickValue() {
        return this.clickValue;
    }
    
    public final void setClickValue(@Nullable final String value) {
        this.clickValue = value;
        this.reInstance();
    }
    
    @Nullable
    public final HoverEvent$Action<?> getHoverAction() {
        return this.hoverAction;
    }
    
    public final void setHoverAction(@Nullable final HoverEvent$Action<?> value) {
        this.hoverAction = value;
        this.reInstance();
    }
    
    @Nullable
    public final Object getHoverValue() {
        return this.hoverValue;
    }
    
    public final void setHoverValue(@Nullable final Object value) {
        this.hoverValue = value;
        this.reInstance();
    }
    
    public UTextComponent(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        super();
        this.formatted = true;
        this.setText(text);
        this.reInstance();
    }
    
    public UTextComponent(@NotNull final Text component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final MutableText copy = component.copy();
        Intrinsics.checkNotNullExpressionValue((Object)copy, "component.copy()");
        this(copy);
    }
    
    public UTextComponent(@NotNull final MutableText component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        super();
        this.formatted = true;
        this.component = component;
        this.setText(this.getFormattedText());
        final ClickEvent clickEvent = component.method_10866().getClickEvent();
        if (clickEvent != null) {
            this.setClickAction(clickEvent.getAction());
            this.setClickValue(clickEvent.getValue());
        }
        final HoverEvent hoverEvent = component.method_10866().getHoverEvent();
        if (hoverEvent != null) {
            this.setHoverAction((HoverEvent$Action<?>)hoverEvent.getAction());
            this.setHoverValue(hoverEvent.getValue((HoverEvent$Action)this.hoverAction));
        }
    }
    
    @NotNull
    public final UTextComponent setClick(@NotNull final ClickEvent$Action action, @NotNull final String value) {
        Intrinsics.checkNotNullParameter((Object)action, "action");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        final UTextComponent $this$setClick_u24lambda_u2d0 = this;
        final int n = 0;
        $this$setClick_u24lambda_u2d0.setClickAction(action);
        $this$setClick_u24lambda_u2d0.setClickValue(value);
        $this$setClick_u24lambda_u2d0.reInstance();
        return this;
    }
    
    @NotNull
    public final UTextComponent setHover(@NotNull final HoverEvent$Action<?> action, @NotNull final Object value) {
        Intrinsics.checkNotNullParameter((Object)action, "action");
        Intrinsics.checkNotNullParameter(value, "value");
        final UTextComponent $this$setHover_u24lambda_u2d1 = this;
        final int n = 0;
        $this$setHover_u24lambda_u2d1.setHoverAction(action);
        $this$setHover_u24lambda_u2d1.setHoverValue(value);
        $this$setHover_u24lambda_u2d1.reInstance();
        return this;
    }
    
    public final void chat() {
        new UMessage(this).chat();
    }
    
    public final void actionBar() {
        new UMessage(this).actionBar();
    }
    
    private final void reInstance() {
        final MutableText literal = Text.literal(this.formatIf(this.text, this.formatted));
        Intrinsics.checkNotNullExpressionValue((Object)literal, "literal(text.formatIf(formatted))");
        this.component = literal;
        this.reInstanceClick();
        this.reInstanceHover();
    }
    
    private final void reInstanceClick() {
        if (this.clickAction == null || this.clickValue == null) {
            return;
        }
        final ClickEvent$Action clickAction = this.clickAction;
        final String clickValue = this.clickValue;
        Intrinsics.checkNotNull((Object)clickValue);
        final ClickEvent event = new ClickEvent(clickAction, this.formatIf(clickValue, this.formatted));
        this.getComponent().setStyle(this.getComponent().method_10866().withClickEvent(event));
    }
    
    private final void reInstanceHover() {
        if (this.hoverAction == null || this.hoverValue == null) {
            return;
        }
        final HoverEvent$Action<?> hoverAction = this.hoverAction;
        if (hoverAction == null) {
            throw new NullPointerException("null cannot be cast to non-null type net.minecraft.text.HoverEvent.Action<kotlin.Any>");
        }
        final Object hoverValue = this.hoverValue;
        Intrinsics.checkNotNull(hoverValue);
        final HoverEvent event = new HoverEvent((HoverEvent$Action)hoverAction, hoverValue);
        this.setHoverEventHelper(event);
    }
    
    private final void setHoverEventHelper(final HoverEvent event) {
        this.getComponent().setStyle(this.getComponent().method_10866().withHoverEvent(event));
    }
    
    private final String formatIf(final String $this$formatIf, final boolean predicate) {
        return predicate ? UChat.addColor($this$formatIf) : $this$formatIf;
    }
    
    @NotNull
    public TextContent getContent() {
        final TextContent method_10851 = this.getComponent().method_10851();
        Intrinsics.checkNotNullExpressionValue((Object)method_10851, "component.content");
        return method_10851;
    }
    
    @NotNull
    public final String getUnformattedText() {
        final UTextComponent.TextBuilder builder = new UTextComponent.TextBuilder(false);
        this.getComponent().method_30937().accept((CharacterVisitor)builder);
        return builder.getString();
    }
    
    @NotNull
    public final String getFormattedText() {
        final UTextComponent.TextBuilder builder = new UTextComponent.TextBuilder(true);
        this.getComponent().method_30937().accept((CharacterVisitor)builder);
        return builder.getString();
    }
    
    @NotNull
    public final MutableText appendSibling(@NotNull final Text text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        final MutableText append = this.getComponent().append(text);
        Intrinsics.checkNotNullExpressionValue((Object)append, "component.append(text)");
        return append;
    }
    
    @NotNull
    public String getString() {
        final String string = this.getComponent().getString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "component.string");
        return string;
    }
    
    @NotNull
    public String asTruncatedString(final int maxLen) {
        final String method_10858 = this.getComponent().method_10858(maxLen);
        Intrinsics.checkNotNullExpressionValue((Object)method_10858, "component.asTruncatedString(maxLen)");
        return method_10858;
    }
    
    @NotNull
    public <T> Optional<T> method_27658(@NotNull final StringVisitable$StyledVisitor<T> p_230439_1_, @NotNull final Style p_230439_2_) {
        Intrinsics.checkNotNullParameter((Object)p_230439_1_, "p_230439_1_");
        Intrinsics.checkNotNullParameter((Object)p_230439_2_, "p_230439_2_");
        final Optional method_27658 = this.getComponent().method_27658((StringVisitable$StyledVisitor)p_230439_1_, p_230439_2_);
        Intrinsics.checkNotNullExpressionValue((Object)method_27658, "component.visit(p_230439_1_, p_230439_2_)");
        return method_27658;
    }
    
    @NotNull
    public <T> Optional<T> method_27657(@NotNull final StringVisitable$Visitor<T> p_230438_1_) {
        Intrinsics.checkNotNullParameter((Object)p_230438_1_, "p_230438_1_");
        final Optional method_27657 = this.getComponent().method_27657((StringVisitable$Visitor)p_230438_1_);
        Intrinsics.checkNotNullExpressionValue((Object)method_27657, "component.visit(p_230438_1_)");
        return method_27657;
    }
    
    @NotNull
    public Style getStyle() {
        final Style method_10866 = this.getComponent().method_10866();
        Intrinsics.checkNotNullExpressionValue((Object)method_10866, "component.style");
        return method_10866;
    }
    
    @NotNull
    public List<Text> getSiblings() {
        final List method_10855 = this.getComponent().method_10855();
        Intrinsics.checkNotNullExpressionValue((Object)method_10855, "component.siblings");
        return method_10855;
    }
    
    @NotNull
    public MutableText copyContentOnly() {
        final MutableText method_27662 = this.getComponent().method_27662();
        Intrinsics.checkNotNullExpressionValue((Object)method_27662, "component.copyContentOnly()");
        return method_27662;
    }
    
    @NotNull
    public MutableText copy() {
        final MutableText method_27661 = this.getComponent().method_27661();
        Intrinsics.checkNotNullExpressionValue((Object)method_27661, "component.copy()");
        return method_27661;
    }
    
    @NotNull
    public OrderedText asOrderedText() {
        final OrderedText method_30937 = this.getComponent().method_30937();
        Intrinsics.checkNotNullExpressionValue((Object)method_30937, "component.asOrderedText()");
        return method_30937;
    }
    
    static {
        Companion = new UTextComponent.Companion((DefaultConstructorMarker)null);
    }
}
