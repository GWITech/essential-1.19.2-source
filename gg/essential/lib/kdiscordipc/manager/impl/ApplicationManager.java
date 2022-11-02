package gg.essential.lib.kdiscordipc.manager.impl;

import gg.essential.lib.kdiscordipc.manager.*;
import kotlin.*;
import gg.essential.lib.kdiscordipc.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u000bJG\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014" }, d2 = { "Lgg/essential/lib/kdiscordipc/manager/impl/ApplicationManager;", "Lgg/essential/lib/kdiscordipc/manager/Manager;", "ipc", "Lgg/essential/lib/kdiscordipc/KDiscordIPC;", "(Ldev/cbyrne/kdiscordipc/KDiscordIPC;)V", "getIpc", "()Ldev/cbyrne/kdiscordipc/KDiscordIPC;", "authenticate", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/AuthenticatePacket$Data;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authorize", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/AuthorizePacket$Data;", "scopes", "", "clientId", "rpcToken", "username", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KDiscordIPC" })
public final class ApplicationManager extends Manager
{
    public ApplicationManager(@NotNull final KDiscordIPC ipc) {
        Intrinsics.checkNotNullParameter((Object)ipc, "ipc");
        super();
    }
}
