package gg.essential.gui.friends.message.v2;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import java.time.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a
                                                    \u0004*\u0004\u0018\u00010\u00030\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "Lgg/essential/elementa/UIComponent;", "it", "Ljava/time/ZonedDateTime;", "kotlin.jvm.PlatformType", "invoke" })
static final class ReplyableMessageScreen$4 extends Lambda implements Function1<ZonedDateTime, UIComponent> {
    public static final ReplyableMessageScreen$4 INSTANCE;
    
    ReplyableMessageScreen$4() {
        super(1);
    }
    
    @NotNull
    public final UIComponent invoke(final ZonedDateTime it) {
        final Instant instant = it.toInstant();
        Intrinsics.checkNotNullExpressionValue((Object)instant, "it.toInstant()");
        return new DateDividerImpl(instant);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((ZonedDateTime)p1);
    }
    
    static {
        INSTANCE = new Function1<ZonedDateTime, UIComponent>() {
            public static final ReplyableMessageScreen$4 INSTANCE;
            
            ReplyableMessageScreen$4() {
                super(1);
            }
            
            @NotNull
            public final UIComponent invoke(final ZonedDateTime it) {
                final Instant instant = it.toInstant();
                Intrinsics.checkNotNullExpressionValue((Object)instant, "it.toInstant()");
                return new DateDividerImpl(instant);
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((ZonedDateTime)p1);
            }
        };
    }
}