package gg.essential.mixins.ext.client.network;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0006\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/mixins/ext/client/network/NetHandlerPlayClientExt;", "", "essential$getNameIdCache", "", "", "Ljava/util/UUID;", "essential" })
public interface NetHandlerPlayClientExt
{
    @NotNull
    Map<String, UUID> essential$getNameIdCache();
}
