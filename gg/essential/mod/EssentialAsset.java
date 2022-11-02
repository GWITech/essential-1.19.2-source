package gg.essential.mod;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lgg/essential/mod/EssentialAsset;", "", "url", "", "checksum", "(Ljava/lang/String;Ljava/lang/String;)V", "getChecksum", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cosmetics" })
public final class EssentialAsset
{
    @NotNull
    private final String url;
    @NotNull
    private final String checksum;
    
    public EssentialAsset(@NotNull final String url, @NotNull final String checksum) {
        Intrinsics.checkNotNullParameter((Object)url, "url");
        Intrinsics.checkNotNullParameter((Object)checksum, "checksum");
        super();
        this.url = url;
        this.checksum = checksum;
    }
    
    @NotNull
    public final String getUrl() {
        return this.url;
    }
    
    @NotNull
    public final String getChecksum() {
        return this.checksum;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "EssentialAsset(url=" + this.url + ", checksum=" + this.checksum + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.url.hashCode();
        result = result * 31 + this.checksum.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EssentialAsset)) {
            return false;
        }
        final EssentialAsset essentialAsset = (EssentialAsset)other;
        return Intrinsics.areEqual((Object)this.url, (Object)essentialAsset.url) && Intrinsics.areEqual((Object)this.checksum, (Object)essentialAsset.checksum);
    }
}
