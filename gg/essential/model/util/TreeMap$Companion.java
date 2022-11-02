package gg.essential.model.util;

import kotlin.*;
import kotlinx.serialization.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u00050\u0004\"\u0004\b\u0002\u0010\u0006\"\u0004\b\u0003\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004H\u00c6\u0001¨\u0006\n" }, d2 = { "Lgg/essential/model/util/TreeMap$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/util/TreeMap;", "T0", "T1", "typeSerial0", "typeSerial1", "cosmetics" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final <T0, T1> KSerializer<TreeMap<T0, T1>> serializer(@NotNull final KSerializer<T0> typeSerial0, @NotNull final KSerializer<T1> typeSerial1) {
        Intrinsics.checkNotNullParameter((Object)typeSerial0, "typeSerial0");
        Intrinsics.checkNotNullParameter((Object)typeSerial1, "typeSerial1");
        return (KSerializer<TreeMap<T0, T1>>)new TreeMapSerializer((kotlinx.serialization.KSerializer<Comparable>)typeSerial0, (kotlinx.serialization.KSerializer<Object>)typeSerial1);
    }
    
    public Companion(final byte b) {
        this();
    }
}
