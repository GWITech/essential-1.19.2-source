package gg.essential.gui.common.modal;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H
                                                   ¢\u0006\u0004\b\u0005\u0010\u0006""" }, d2 = { "<anonymous>", "", "it", "", "Ljava/util/UUID;", "invoke", "(Ljava/util/Set;)Ljava/lang/Boolean;" })
static final class UserSelectionModal$2 extends Lambda implements Function1<Set<? extends UUID>, Boolean> {
    public static final UserSelectionModal$2 INSTANCE;
    
    UserSelectionModal$2() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Set<UUID> it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return !it.isEmpty();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Set<UUID>)p1);
    }
    
    static {
        INSTANCE = new Function1<Set<? extends UUID>, Boolean>() {
            public static final UserSelectionModal$2 INSTANCE;
            
            UserSelectionModal$2() {
                super(1);
            }
            
            @NotNull
            public final Boolean invoke(@NotNull final Set<UUID> it) {
                Intrinsics.checkNotNullParameter((Object)it, "it");
                return !it.isEmpty();
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((Set<UUID>)p1);
            }
        };
    }
}