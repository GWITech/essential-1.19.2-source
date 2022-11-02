package gg.essential.gui.about.components;

import kotlin.*;
import gg.essential.lib.gson.annotations.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0015
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a
                                                   \u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0006\u0010	\u001a\u00020\b\u0012\u0006\u0010
                                                   \u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ	\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0011\u0010\u0018\u001a
                                                   \u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u00c6\u0003J	\u0010\u0019\u001a\u00020\bH\u00c6\u0003J	\u0010\u001a\u001a\u00020\bH\u00c6\u0003J	\u0010\u001b\u001a\u00020\bH\u00c6\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a
                                                   \u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010	\u001a\u00020\b2\b\b\u0002\u0010
                                                   \u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010 \u001a\u00020!H\u00d6\u0001J	\u0010"\u001a\u00020\bH\u00d6\u0001R\u0019\u0010\u0007\u001a
                                                   \u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010
                                                   \u001a\u00020\b¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010	\u001a\u00020\b¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006#""" }, d2 = { "Lgg/essential/gui/about/components/ChangelogComponent$Changelog;", "", "timestamp", "", "entries", "", "Lgg/essential/gui/about/components/ChangelogComponent$PlatformChangelog;", "branches", "", "version", "id", "summary", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBranches", "()Ljava/util/List;", "getEntries", "getId", "()Ljava/lang/String;", "getSummary", "getTimestamp", "()J", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "essential" })
public static final class Changelog
{
    @SerializedName("created_at")
    private final long timestamp;
    @SerializedName("changelog")
    @NotNull
    private final List<PlatformChangelog> entries;
    @Nullable
    private final List<String> branches;
    @NotNull
    private final String version;
    @NotNull
    private final String id;
    @NotNull
    private final String summary;
    
    public final long getTimestamp() {
        return this.timestamp;
    }
    
    @NotNull
    public final List<PlatformChangelog> getEntries() {
        return this.entries;
    }
    
    @NotNull
    public final String getVersion() {
        return this.version;
    }
    
    @NotNull
    public final String getSummary() {
        return this.summary;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Changelog(timestamp=" + this.timestamp + ", entries=" + this.entries + ", branches=" + this.branches + ", version=" + this.version + ", id=" + this.id + ", summary=" + this.summary;
    }
    
    @Override
    public int hashCode() {
        int result = Long.hashCode(this.timestamp);
        result = result * 31 + this.entries.hashCode();
        result = result * 31 + ((this.branches == null) ? 0 : this.branches.hashCode());
        result = result * 31 + this.version.hashCode();
        result = result * 31 + this.id.hashCode();
        result = result * 31 + this.summary.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Changelog)) {
            return false;
        }
        final Changelog changelog = (Changelog)other;
        return this.timestamp == changelog.timestamp && Intrinsics.areEqual((Object)this.entries, (Object)changelog.entries) && Intrinsics.areEqual((Object)this.branches, (Object)changelog.branches) && Intrinsics.areEqual((Object)this.version, (Object)changelog.version) && Intrinsics.areEqual((Object)this.id, (Object)changelog.id) && Intrinsics.areEqual((Object)this.summary, (Object)changelog.summary);
    }
}
