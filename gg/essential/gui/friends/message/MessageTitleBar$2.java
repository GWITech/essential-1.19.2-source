package gg.essential.gui.friends.message;

import kotlin.jvm.functions.*;
import java.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Ljava/util/UUID;", "invoke", "(Ljava/util/UUID;)Ljava/lang/Boolean;" })
static final class MessageTitleBar$2 extends Lambda implements Function1<UUID, Boolean> {
    public static final MessageTitleBar$2 INSTANCE;
    
    MessageTitleBar$2() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final UUID it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return !Intrinsics.areEqual((Object)it, (Object)UUIDUtil.getClientUUID());
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UUID)p1);
    }
    
    static {
        INSTANCE = new Function1<UUID, Boolean>() {
            public static final MessageTitleBar$2 INSTANCE;
            
            MessageTitleBar$2() {
                super(1);
            }
            
            @NotNull
            public final Boolean invoke(@NotNull final UUID it) {
                Intrinsics.checkNotNullParameter((Object)it, "it");
                return !Intrinsics.areEqual((Object)it, (Object)UUIDUtil.getClientUUID());
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((UUID)p1);
            }
        };
    }
}