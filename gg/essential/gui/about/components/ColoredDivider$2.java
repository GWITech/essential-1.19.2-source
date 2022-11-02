package gg.essential.gui.about.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "it", "invoke" })
static final class ColoredDivider$2 extends Lambda implements Function1<String, String> {
    public static final ColoredDivider$2 INSTANCE;
    
    ColoredDivider$2() {
        super(1);
    }
    
    @NotNull
    public final String invoke(@Nullable final String it) {
        String s = it;
        if (it == null) {
            s = "";
        }
        return s;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((String)p1);
    }
    
    static {
        INSTANCE = new Function1<String, String>() {
            public static final ColoredDivider$2 INSTANCE;
            
            ColoredDivider$2() {
                super(1);
            }
            
            @NotNull
            public final String invoke(@Nullable final String it) {
                String s = it;
                if (it == null) {
                    s = "";
                }
                return s;
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((String)p1);
            }
        };
    }
}