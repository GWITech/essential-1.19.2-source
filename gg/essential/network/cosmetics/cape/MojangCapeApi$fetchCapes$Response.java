package gg.essential.network.cosmetics.cape;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000+
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u001e\u0010	\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001¢\u0006\u0002\u0010
                                                   J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J	\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012""" }, d2 = { "gg/essential/network/cosmetics/cape/MojangCapeApi$fetchCapes$Response", "", "capes", "", "Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape;", "(Ljava/util/List;)V", "getCapes", "()Ljava/util/List;", "component1", "copy", "(Ljava/util/List;)Lgg/essential/network/cosmetics/cape/MojangCapeApi$fetchCapes$Response;", "equals", "", "other", "hashCode", "", "toString", "", "essential" })
public static final class Response
{
    @NotNull
    private final List<Cape> capes;
    
    @NotNull
    public final List<Cape> getCapes() {
        return this.capes;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Response(capes=" + this.capes;
    }
    
    @Override
    public int hashCode() {
        return this.capes.hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof Response && Intrinsics.areEqual((Object)this.capes, (Object)((Response)other).capes));
    }
}
