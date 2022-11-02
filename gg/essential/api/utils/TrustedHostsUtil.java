package gg.essential.api.utils;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010	\u001a\b\u0012\u0004\u0012\u00020\u00050
                                                   H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u000e\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/api/utils/TrustedHostsUtil;", "", "addTrustedHost", "", "host", "Lgg/essential/api/utils/TrustedHostsUtil$TrustedHost;", "getTrustedHostByID", "id", "", "getTrustedHosts", "", "removeTrustedHost", "hostId", "TrustedHost", "essential-api" })
public interface TrustedHostsUtil
{
    @NotNull
    Set<TrustedHost> getTrustedHosts();
    
    @Nullable
    TrustedHost getTrustedHostByID(@NotNull final String p0);
    
    void addTrustedHost(@NotNull final TrustedHost p0);
    
    void removeTrustedHost(@NotNull final String p0);
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000*
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0002
                                                       \u0002\u0010"
                                                       \u0002\b\u000b
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J	\u0010\r\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J	\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b
                                                       \u0000\u001a\u0004\b\b\u0010	R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b
                                                       \u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017""" }, d2 = { "Lgg/essential/api/utils/TrustedHostsUtil$TrustedHost;", "", "id", "", "name", "domains", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getDomains", "()Ljava/util/Set;", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "essential-api" })
    public static final class TrustedHost
    {
        @NotNull
        private final String id;
        @NotNull
        private final String name;
        @NotNull
        private final Set<String> domains;
        
        public TrustedHost(@NotNull final String id, @NotNull final String name, @NotNull final Set<String> domains) {
            Intrinsics.checkNotNullParameter((Object)id, "id");
            Intrinsics.checkNotNullParameter((Object)name, "name");
            Intrinsics.checkNotNullParameter((Object)domains, "domains");
            super();
            this.id = id;
            this.name = name;
            this.domains = domains;
        }
        
        @NotNull
        public final String getId() {
            return this.id;
        }
        
        @NotNull
        public final String getName() {
            return this.name;
        }
        
        @NotNull
        public final Set<String> getDomains() {
            return this.domains;
        }
        
        @NotNull
        public final String component1() {
            return this.id;
        }
        
        @NotNull
        public final String component2() {
            return this.name;
        }
        
        @NotNull
        public final Set<String> component3() {
            return this.domains;
        }
        
        @NotNull
        public final TrustedHost copy(@NotNull final String id, @NotNull final String name, @NotNull final Set<String> domains) {
            Intrinsics.checkNotNullParameter((Object)id, "id");
            Intrinsics.checkNotNullParameter((Object)name, "name");
            Intrinsics.checkNotNullParameter((Object)domains, "domains");
            return new TrustedHost(id, name, domains);
        }
        
        public static /* synthetic */ TrustedHost copy$default(final TrustedHost trustedHost, String id, String name, Set domains, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                id = trustedHost.id;
            }
            if ((n & 0x2) != 0x0) {
                name = trustedHost.name;
            }
            if ((n & 0x4) != 0x0) {
                domains = trustedHost.domains;
            }
            return trustedHost.copy(id, name, domains);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "TrustedHost(id=" + this.id + ", name=" + this.name + ", domains=" + this.domains;
        }
        
        @Override
        public int hashCode() {
            int result = this.id.hashCode();
            result = result * 31 + this.name.hashCode();
            result = result * 31 + this.domains.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustedHost)) {
                return false;
            }
            final TrustedHost trustedHost = (TrustedHost)other;
            return Intrinsics.areEqual((Object)this.id, (Object)trustedHost.id) && Intrinsics.areEqual((Object)this.name, (Object)trustedHost.name) && Intrinsics.areEqual((Object)this.domains, (Object)trustedHost.domains);
        }
    }
}
