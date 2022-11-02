package gg.essential.util;

import kotlin.*;
import gg.essential.*;
import gg.essential.profiles.model.*;
import kotlin.jvm.internal.*;
import java.util.*;
import org.jetbrains.annotations.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.connectionmanager.common.packet.profile.trustedhosts.*;
import gg.essential.universal.wrappers.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020	H\u0016J\u000e\u0010
                                                   \u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u001a\u00020	H\u0016J\f\u0010\u000e\u001a\u00020\u0006*\u00020\u000fH\u0002J\f\u0010\u0010\u001a\u00020\u000f*\u00020\u0006H\u0002¨\u0006\u0011""" }, d2 = { "Lgg/essential/util/TrustedHostsUtil;", "Lgg/essential/api/utils/TrustedHostsUtil;", "()V", "addTrustedHost", "", "host", "Lgg/essential/api/utils/TrustedHostsUtil$TrustedHost;", "getTrustedHostByID", "id", "", "getTrustedHosts", "", "removeTrustedHost", "hostId", "toApiHost", "Lgg/essential/profiles/model/TrustedHost;", "toModel", "essential" })
public final class TrustedHostsUtil implements gg.essential.api.utils.TrustedHostsUtil
{
    @NotNull
    public static final TrustedHostsUtil INSTANCE;
    
    private TrustedHostsUtil() {
        super();
    }
    
    @NotNull
    @Override
    public Set<TrustedHost> getTrustedHosts() {
        final Collection hosts = Essential.getInstance().getConnectionManager().getProfileManager().getTrustedHosts().values();
        final Set a = new LinkedHashSet();
        final Iterable $this$forEach$iv = hosts;
        for (final Object element$iv : $this$forEach$iv) {
            final gg.essential.profiles.model.TrustedHost it = (gg.essential.profiles.model.TrustedHost)element$iv;
            final Set set = a;
            final TrustedHostsUtil instance = TrustedHostsUtil.INSTANCE;
            Intrinsics.checkNotNullExpressionValue((Object)it, "it");
            set.add(instance.toApiHost(it));
        }
        return a;
    }
    
    @Nullable
    @Override
    public TrustedHost getTrustedHostByID(@NotNull final String id) {
        Intrinsics.checkNotNullParameter((Object)id, "id");
        final gg.essential.profiles.model.TrustedHost $this$toApiHost = Essential.getInstance().getConnectionManager().getProfileManager().getTrustedHosts().get(id);
        return ($this$toApiHost != null) ? this.toApiHost($this$toApiHost) : null;
    }
    
    @Override
    public void addTrustedHost(@NotNull final TrustedHost host) {
        Intrinsics.checkNotNullParameter((Object)host, "host");
        final ConnectionManager connectionManager = Essential.getInstance().getConnectionManager();
        Intrinsics.checkNotNullExpressionValue((Object)connectionManager, "getInstance().connectionManager");
        final ConnectionManager cm = connectionManager;
        cm.getProfileManager().addTrustedHost(this.toModel(host));
        cm.send((Packet)new ClientProfileTrustedHostsCreatePacket(host.getName(), (Set)host.getDomains()));
    }
    
    @Override
    public void removeTrustedHost(@NotNull final String hostId) {
        Intrinsics.checkNotNullParameter((Object)hostId, "hostId");
        final ConnectionManager connectionManager = Essential.getInstance().getConnectionManager();
        Intrinsics.checkNotNullExpressionValue((Object)connectionManager, "getInstance().connectionManager");
        final ConnectionManager cm = connectionManager;
        cm.getProfileManager().removeTrustedHost(hostId);
        cm.send((Packet)new ClientProfileTrustedHostsDeletePacket(hostId));
    }
    
    private final TrustedHost toApiHost(final gg.essential.profiles.model.TrustedHost $this$toApiHost) {
        final String id = $this$toApiHost.getId();
        Intrinsics.checkNotNullExpressionValue((Object)id, "id");
        final String name = $this$toApiHost.getName();
        Intrinsics.checkNotNullExpressionValue((Object)name, "name");
        final Set<String> domains = $this$toApiHost.getDomains();
        Intrinsics.checkNotNullExpressionValue((Object)domains, "domains");
        return new TrustedHost(id, name, domains);
    }
    
    private final gg.essential.profiles.model.TrustedHost toModel(final TrustedHost $this$toModel) {
        return new gg.essential.profiles.model.TrustedHost($this$toModel.getId(), $this$toModel.getName(), $this$toModel.getDomains(), UPlayer.getUUID());
    }
    
    static {
        INSTANCE = new TrustedHostsUtil();
    }
}
