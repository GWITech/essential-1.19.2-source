package gg.essential.sps;

import kotlin.*;
import java.io.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\r
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ	\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J	\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J	\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010¨\u0006\u0017""" }, d2 = { "Lgg/essential/sps/ResourcePackSharingHttpServer$PackInfo;", "", "file", "Ljava/io/File;", "checksum", "", "isTemp", "", "(Ljava/io/File;Ljava/lang/String;Z)V", "getChecksum", "()Ljava/lang/String;", "getFile", "()Ljava/io/File;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "essential" })
public static final class PackInfo
{
    @NotNull
    private final File file;
    @NotNull
    private final String checksum;
    private final boolean isTemp;
    
    public PackInfo(@NotNull final File file, @NotNull final String checksum, final boolean isTemp) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        Intrinsics.checkNotNullParameter((Object)checksum, "checksum");
        super();
        this.file = file;
        this.checksum = checksum;
        this.isTemp = isTemp;
    }
    
    @NotNull
    public final File getFile() {
        return this.file;
    }
    
    @NotNull
    public final String getChecksum() {
        return this.checksum;
    }
    
    public final boolean isTemp() {
        return this.isTemp;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "PackInfo(file=" + this.file + ", checksum=" + this.checksum + ", isTemp=" + this.isTemp;
    }
    
    @Override
    public int hashCode() {
        int result = this.file.hashCode();
        result = result * 31 + this.checksum.hashCode();
        final int n = result * 31;
        int isTemp;
        if ((isTemp = (this.isTemp ? 1 : 0)) != 0) {
            isTemp = 1;
        }
        result = n + isTemp;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackInfo)) {
            return false;
        }
        final PackInfo packInfo = (PackInfo)other;
        return Intrinsics.areEqual((Object)this.file, (Object)packInfo.file) && Intrinsics.areEqual((Object)this.checksum, (Object)packInfo.checksum) && this.isTemp == packInfo.isTemp;
    }
}
