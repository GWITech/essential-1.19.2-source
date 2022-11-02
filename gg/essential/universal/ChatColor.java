package gg.essential.universal;

import kotlin.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0000
                                                   \u0002\u0010\f
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\b
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u001a\b\u0086\u0001\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001)B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012
                                                   \b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0007J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006*""" }, d2 = { "Lgg/essential/universal/ChatColor;", "", "char", "", "color", "Ljava/awt/Color;", "isFormat", "", "(Ljava/lang/String;ICLjava/awt/Color;Z)V", "getChar", "()C", "getColor", "()Ljava/awt/Color;", "()Z", "isColor", "plus", "", "text", "toString", "BLACK", "DARK_BLUE", "DARK_GREEN", "DARK_AQUA", "DARK_RED", "DARK_PURPLE", "GOLD", "GRAY", "DARK_GRAY", "BLUE", "GREEN", "AQUA", "RED", "LIGHT_PURPLE", "YELLOW", "WHITE", "MAGIC", "BOLD", "STRIKETHROUGH", "UNDERLINE", "ITALIC", "RESET", "Companion", "universalcraft" })
public enum ChatColor
{
    @NotNull
    public static final Companion Companion;
    private final char char;
    @Nullable
    private final Color color;
    private final boolean isFormat;
    public static final char COLOR_CHAR = '§';
    @NotNull
    private static final Regex FORMATTING_CODE_PATTERN;
    @NotNull
    private static final Regex COLOR_CODE_PATTERN;
    
    BLACK('0', new Color(0), false, 4, (DefaultConstructorMarker)null), 
    DARK_BLUE('1', new Color(170), false, 4, (DefaultConstructorMarker)null), 
    DARK_GREEN('2', new Color(43520), false, 4, (DefaultConstructorMarker)null), 
    DARK_AQUA('3', new Color(43690), false, 4, (DefaultConstructorMarker)null), 
    DARK_RED('4', new Color(11141120), false, 4, (DefaultConstructorMarker)null), 
    DARK_PURPLE('5', new Color(11141290), false, 4, (DefaultConstructorMarker)null), 
    GOLD('6', new Color(16755200), false, 4, (DefaultConstructorMarker)null), 
    GRAY('7', new Color(11184810), false, 4, (DefaultConstructorMarker)null), 
    DARK_GRAY('8', new Color(5592405), false, 4, (DefaultConstructorMarker)null), 
    BLUE('9', new Color(5592575), false, 4, (DefaultConstructorMarker)null), 
    GREEN('a', new Color(5635925), false, 4, (DefaultConstructorMarker)null), 
    AQUA('b', new Color(5636095), false, 4, (DefaultConstructorMarker)null), 
    RED('c', new Color(16733525), false, 4, (DefaultConstructorMarker)null), 
    LIGHT_PURPLE('d', new Color(16733695), false, 4, (DefaultConstructorMarker)null), 
    YELLOW('e', new Color(16777045), false, 4, (DefaultConstructorMarker)null), 
    WHITE('f', new Color(16777215), false, 4, (DefaultConstructorMarker)null), 
    MAGIC('k', (Color)null, true, 2, (DefaultConstructorMarker)null), 
    BOLD('l', (Color)null, true, 2, (DefaultConstructorMarker)null), 
    STRIKETHROUGH('m', (Color)null, true, 2, (DefaultConstructorMarker)null), 
    UNDERLINE('n', (Color)null, true, 2, (DefaultConstructorMarker)null), 
    ITALIC('o', (Color)null, true, 2, (DefaultConstructorMarker)null), 
    RESET('r', (Color)null, false, 6, (DefaultConstructorMarker)null);
    
    private static final /* synthetic */ ChatColor[] $VALUES;
    
    private ChatColor(final String $enum$name, final int $enum$ordinal, final char char, final Color color, final boolean isFormat) {
        this.char = char;
        this.color = color;
        this.isFormat = isFormat;
    }
    
    ChatColor(final String $enum$name, final int $enum$ordinal, final char char1, Color color, boolean isFormat, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            color = null;
        }
        if ((n & 0x4) != 0x0) {
            isFormat = false;
        }
        this($enum$name, $enum$ordinal, char1, color, isFormat);
    }
    
    public final char getChar() {
        return this.char;
    }
    
    @Nullable
    public final Color getColor() {
        return this.color;
    }
    
    public final boolean isFormat() {
        return this.isFormat;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "§" + this.char;
    }
    
    public final boolean isColor() {
        return this.color != null;
    }
    
    @NotNull
    public final String plus(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        return this + text;
    }
    
    public static ChatColor[] values() {
        return ChatColor.$VALUES.clone();
    }
    
    public static ChatColor valueOf(final String value) {
        return Enum.valueOf(ChatColor.class, value);
    }
    
    private static final /* synthetic */ ChatColor[] $values() {
        return new ChatColor[] { ChatColor.BLACK, ChatColor.DARK_BLUE, ChatColor.DARK_GREEN, ChatColor.DARK_AQUA, ChatColor.DARK_RED, ChatColor.DARK_PURPLE, ChatColor.GOLD, ChatColor.GRAY, ChatColor.DARK_GRAY, ChatColor.BLUE, ChatColor.GREEN, ChatColor.AQUA, ChatColor.RED, ChatColor.LIGHT_PURPLE, ChatColor.YELLOW, ChatColor.WHITE, ChatColor.MAGIC, ChatColor.BOLD, ChatColor.STRIKETHROUGH, ChatColor.UNDERLINE, ChatColor.ITALIC, ChatColor.RESET };
    }
    
    public static final /* synthetic */ Regex access$getFORMATTING_CODE_PATTERN$cp() {
        return ChatColor.FORMATTING_CODE_PATTERN;
    }
    
    public static final /* synthetic */ Regex access$getCOLOR_CODE_PATTERN$cp() {
        return ChatColor.COLOR_CODE_PATTERN;
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
        FORMATTING_CODE_PATTERN = new Regex("§[0-9a-fk-or]", RegexOption.IGNORE_CASE);
        COLOR_CODE_PATTERN = new Regex("§[0-9a-f]", RegexOption.IGNORE_CASE);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000"
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\f
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                       \u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010	\u001a\u00020\u0006¢\u0006\b
                                                       \u0000\u001a\u0004\b
                                                       \u0010\b¨\u0006\u0012""" }, d2 = { "Lgg/essential/universal/ChatColor$Companion;", "", "()V", "COLOR_CHAR", "", "COLOR_CODE_PATTERN", "Lkotlin/text/Regex;", "getCOLOR_CODE_PATTERN", "()Lkotlin/text/Regex;", "FORMATTING_CODE_PATTERN", "getFORMATTING_CODE_PATTERN", "stripColorCodes", "", "text", "stripControlCodes", "translateAlternateColorCodes", "altColorChar", "textToTranslate", "universalcraft" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final Regex getFORMATTING_CODE_PATTERN() {
            return ChatColor.access$getFORMATTING_CODE_PATTERN$cp();
        }
        
        @NotNull
        public final Regex getCOLOR_CODE_PATTERN() {
            return ChatColor.access$getCOLOR_CODE_PATTERN$cp();
        }
        
        @NotNull
        public final String translateAlternateColorCodes(final char altColorChar, @NotNull final String textToTranslate) {
            Intrinsics.checkNotNullParameter((Object)textToTranslate, "textToTranslate");
            final char[] charArray = textToTranslate.toCharArray();
            Intrinsics.checkNotNullExpressionValue((Object)charArray, "(this as java.lang.String).toCharArray()");
            final char[] b = charArray;
            int j = 0;
            while (j < b.length - 1) {
                final int i = j;
                ++j;
                if (b[i] == altColorChar && StringsKt.indexOf$default((CharSequence)"0123456789AaBbCcDdEeFfKkLlMmNnOoRr", b[i + 1], 0, false, 6, (Object)null) > -1) {
                    b[i] = '§';
                    b[i + 1] = Character.toLowerCase(b[i + 1]);
                }
            }
            return new String(b);
        }
        
        @Nullable
        public final String stripControlCodes(@Nullable final String text) {
            String replace;
            if (text == null) {
                replace = null;
            }
            else {
                final String it = text;
                final int n = 0;
                replace = ChatColor.Companion.getFORMATTING_CODE_PATTERN().replace((CharSequence)it, "");
            }
            return replace;
        }
        
        @Nullable
        public final String stripColorCodes(@Nullable final String text) {
            String replace;
            if (text == null) {
                replace = null;
            }
            else {
                final String it = text;
                final int n = 0;
                replace = ChatColor.Companion.getCOLOR_CODE_PATTERN().replace((CharSequence)it, "");
            }
            return replace;
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
