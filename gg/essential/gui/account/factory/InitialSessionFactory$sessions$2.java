package gg.essential.gui.account.factory;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.util.*;
import net.minecraft.client.util.*;
import gg.essential.universal.*;
import kotlin.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012
                                                    \u0004*\u0004\u0018\u00010\u00030\u00030\u0001H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Ljava/util/UUID;", "Lnet/minecraft/client/util/Session;", "kotlin.jvm.PlatformType", "invoke" })
static final class InitialSessionFactory$sessions$2 extends Lambda implements Function0<Map<UUID, ? extends Session>> {
    public static final InitialSessionFactory$sessions$2 INSTANCE;
    
    InitialSessionFactory$sessions$2() {
        super(0);
    }
    
    @NotNull
    public final Map<UUID, Session> invoke() {
        final Session it = UMinecraft.getMinecraft().getSession();
        return MapsKt.mapOf(TuplesKt.to((Object)it.getProfile().getId(), (Object)it));
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        InitialSessionFactory$sessions$2.INSTANCE = new InitialSessionFactory$sessions$2();
    }
}