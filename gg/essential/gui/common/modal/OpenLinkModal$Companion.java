package gg.essential.gui.common.modal;

import kotlin.*;
import java.net.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.config.*;
import gg.essential.util.*;
import java.util.*;
import kotlin.jvm.*;
import gg.essential.universal.*;
import gg.essential.*;
import gg.essential.api.*;
import gg.essential.api.gui.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0010\u0010	\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006
                                                   """ }, d2 = { "Lgg/essential/gui/common/modal/OpenLinkModal$Companion;", "", "()V", "browse", "", "uri", "Ljava/net/URI;", "successfulToast", "", "openUrl", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    public final void openUrl(@NotNull final URI uri) {
        Intrinsics.checkNotNullParameter((Object)uri, "uri");
        final Iterable $this$any$iv = TrustedHostsUtil.INSTANCE.getTrustedHosts();
        boolean b = false;
        Label_0168: {
            if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                b = false;
            }
            else {
                for (final Object element$iv : $this$any$iv) {
                    final gg.essential.api.utils.TrustedHostsUtil.TrustedHost trustedHost = (gg.essential.api.utils.TrustedHostsUtil.TrustedHost)element$iv;
                    final Iterable $this$any$iv2 = trustedHost.getDomains();
                    boolean b2 = false;
                    Label_0160: {
                        if ($this$any$iv2 instanceof Collection && ((Collection)$this$any$iv2).isEmpty()) {
                            b2 = false;
                        }
                        else {
                            for (final Object element$iv2 : $this$any$iv2) {
                                final String it = (String)element$iv2;
                                if (Intrinsics.areEqual((Object)it, (Object)uri.getHost())) {
                                    b2 = true;
                                    break Label_0160;
                                }
                            }
                            b2 = false;
                        }
                    }
                    if (b2) {
                        b = true;
                        break Label_0168;
                    }
                }
                b = false;
            }
        }
        final boolean isTrusted = b;
        if (!EssentialConfig.INSTANCE.getLinkWarning() && isTrusted) {
            this.browse(uri, true);
        }
        else {
            GuiUtil.INSTANCE.pushModal(new OpenLinkModal(uri));
        }
    }
    
    public final void browse(@NotNull final URI uri, final boolean successfulToast) {
        Intrinsics.checkNotNullParameter((Object)uri, "uri");
        if (!UDesktop.browse(uri)) {
            Essential.logger.error("Failed to open " + uri);
            Notifications.push$default(EssentialAPI.Companion.getNotifications(), "Error", "Failed to open the URL in your browser. Click here to copy it instead!", 0.0f, (Function0)new OpenLinkModal$Companion$browse.OpenLinkModal$Companion$browse$1(uri), null, null, 52, null);
        }
        else if (successfulToast) {
            EssentialAPI.Companion.getNotifications().push("Link opened in browser", "Opened " + uri.getHost() + " in your browser");
        }
    }
    
    public static /* synthetic */ void browse$default$7a8a0616$4c4dee72(final Companion companion, final URI uri) {
        companion.browse(uri, false);
    }
    
    public Companion(final byte b) {
        this();
    }
}
