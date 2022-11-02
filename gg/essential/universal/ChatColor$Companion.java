package gg.essential.universal;

import kotlin.*;
import kotlin.text.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

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
