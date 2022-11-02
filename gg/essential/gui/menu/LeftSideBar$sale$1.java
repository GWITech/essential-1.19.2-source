package gg.essential.gui.menu;

import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.gui.state.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010#
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010"
                                                   \u0000\u0010\u0000\u001a\u0004\u0018\u00010\u000122\u0010\u0002\u001a.\u0012\f\u0012
                                                    \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0015\u0012\f\u0012
                                                    \u0004*\u0004\u0018\u00010\u00010\u00010\u0006¢\u0006\u0002\b\u00050\u0003¢\u0006\u0002\b\u0005H
                                                   ¢\u0006\u0002\b\u0007""" }, d2 = { "<anonymous>", "Lgg/essential/gui/state/Sale;", "it", "", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "", "invoke" })
static final class LeftSideBar$sale$1 extends Lambda implements Function1<Set<Sale>, Sale> {
    public static final LeftSideBar$sale$1 INSTANCE;
    
    LeftSideBar$sale$1() {
        super(1);
    }
    
    @Nullable
    public final Sale invoke(@NotNull final Set<Sale> it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return (Sale)CollectionsKt.firstOrNull((Iterable)it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Set)p1);
    }
    
    static {
        LeftSideBar$sale$1.INSTANCE = new LeftSideBar$sale$1();
    }
}