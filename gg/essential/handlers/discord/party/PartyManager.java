package gg.essential.handlers.discord.party;

import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.text.*;
import gg.essential.*;
import kotlin.coroutines.intrinsics.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.relationship.*;
import kotlin.coroutines.*;
import gg.essential.util.*;
import kotlin.jvm.functions.*;
import kotlinx.coroutines.*;
import kotlin.*;
import java.util.concurrent.*;
import kotlinx.coroutines.future.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020	2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\u000f\u001a\u00020	2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0011J"\u0010\u0012\u001a\u00020	2\u0006\u0010\u0013\u001a\u00020\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020	0\u0015J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000\u0082\u0002\u0004
                                                   \u0002\b\u0019¨\u0006\u0019""" }, d2 = { "Lgg/essential/handlers/discord/party/PartyManager;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "hostsToHideNotifications", "", "Ljava/util/UUID;", "joinMultiplayer", "", "serverAddress", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinParty", "joinSecret", "joinSPS", "hostUUID", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldAllowUserToJoin", "target", "onCompletion", "Lkotlin/Function1;", "", "shouldHideNotificationForHost", "uuid", "essential" })
public final class PartyManager
{
    @NotNull
    private final CoroutineScope scope;
    @NotNull
    private final List<UUID> hostsToHideNotifications;
    
    public PartyManager(@NotNull final CoroutineScope scope) {
        Intrinsics.checkNotNullParameter((Object)scope, "scope");
        super();
        this.scope = scope;
        this.hostsToHideNotifications = new ArrayList<UUID>();
    }
    
    @Nullable
    public final Object joinParty(@NotNull final String joinSecret, @NotNull final Continuation<? super Unit> $completion) {
        final List data = StringsKt.split$default((CharSequence)joinSecret, new String[] { "|" }, false, 0, 6, (Object)null);
        final String mode = data.get(0);
        if (Intrinsics.areEqual((Object)mode, (Object)"sps")) {
            if (data.size() != 3) {
                Essential.logger.error("Invalid amount of arguments for mode: sps (" + joinSecret + "). Expected 3, got " + data.size());
            }
            final Object joinSPS = this.joinSPS(data.get(1), joinSecret, $completion);
            if (joinSPS == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return joinSPS;
            }
            return Unit.INSTANCE;
        }
        else {
            if (!Intrinsics.areEqual((Object)mode, (Object)"multiplayer")) {
                Essential.logger.error("Unknown party mode: " + mode + " (" + joinSecret);
                return Unit.INSTANCE;
            }
            if (data.size() != 2) {
                Essential.logger.error("Invalid amount of arguments for mode: multiplayer (" + joinSecret + "). Expected 2, got " + data.size());
            }
            final Object joinMultiplayer = this.joinMultiplayer(data.get(1), $completion);
            if (joinMultiplayer == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return joinMultiplayer;
            }
            return Unit.INSTANCE;
        }
    }
    
    public final boolean shouldHideNotificationForHost(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        return this.hostsToHideNotifications.contains(uuid);
    }
    
    public final void shouldAllowUserToJoin(@NotNull final UUID target, @NotNull final Function1<? super Boolean, Unit> onCompletion) {
        Intrinsics.checkNotNullParameter((Object)target, "target");
        Intrinsics.checkNotNullParameter((Object)onCompletion, "onCompletion");
        final RelationshipManager relationshipManager2 = Essential.getInstance().getConnectionManager().getRelationshipManager();
        Intrinsics.checkNotNullExpressionValue((Object)relationshipManager2, "getInstance().connection\u2026nager.relationshipManager");
        final RelationshipManager relationshipManager = relationshipManager2;
        if (relationshipManager.isBlockedByMe(target)) {
            onCompletion.invoke((Object)false);
            return;
        }
        if (relationshipManager.isFriend(target)) {
            onCompletion.invoke((Object)true);
            return;
        }
        final CompletableFuture<String> name = UUIDUtil.getName(target);
        Intrinsics.checkNotNullExpressionValue((Object)name, "getName(target)");
        final CompletableFuture<Void> thenAcceptOnMainThread = ExtensionsKt.thenAcceptOnMainThread((CompletableFuture<Object>)name, (kotlin.jvm.functions.Function1<? super Object, Unit>)new PartyManager$shouldAllowUserToJoin.PartyManager$shouldAllowUserToJoin$1((Function1)onCompletion));
        Intrinsics.checkNotNullExpressionValue((Object)thenAcceptOnMainThread, """
                                                                               onCompletion: (Boolean) \u2026)
                                                                                           }
                                                                                       }""");
        ExtensionsKt.logExceptions$default$68026618$686f8a8c(thenAcceptOnMainThread);
    }
    
    private final Object joinMultiplayer(final String serverAddress, final Continuation<? super Unit> $completion) {
        final Object withContext = BuildersKt.withContext((CoroutineContext)MinecraftCoroutineDispatchersKt.getClient(Dispatchers.INSTANCE), (Function2)new PartyManager$joinMultiplayer.PartyManager$joinMultiplayer$2(serverAddress, (Continuation)null), (Continuation)$completion);
        if (withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return withContext;
        }
        return Unit.INSTANCE;
    }
    
    private final Object joinSPS(final String hostUUID, String joinSecret, final Continuation<? super Unit> continuation) {
        final Continuation $continuation;
        Label_0052: {
            if (continuation instanceof final PartyManager$joinSPS.PartyManager$joinSPS$1 partyManager$joinSPS$1) {
                if ((partyManager$joinSPS$1.label & Integer.MIN_VALUE) != 0x0) {
                    final PartyManager$joinSPS.PartyManager$joinSPS$1 partyManager$joinSPS$2 = partyManager$joinSPS$1;
                    partyManager$joinSPS$2.label -= Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            $continuation = (Continuation)new PartyManager$joinSPS.PartyManager$joinSPS$1(this, (Continuation)continuation);
        }
        final Object $result = ((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).result;
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        UUID host = null;
        Object await = null;
        switch (((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).label) {
            case 0: {
                ResultKt.throwOnFailure($result);
                host = UUID.fromString(hostUUID);
                final CompletableFuture<String> name = UUIDUtil.getName(host);
                Intrinsics.checkNotNullExpressionValue((Object)name, "getName(host)");
                final CompletionStage completionStage = name;
                final Continuation continuation2 = $continuation;
                ((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).L$0 = this;
                ((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).L$1 = joinSecret;
                ((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).L$2 = host;
                ((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).label = 1;
                if ((await = FutureKt.await(completionStage, continuation2)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                break;
            }
            case 1: {
                host = (UUID)((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).L$2;
                joinSecret = (String)((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).L$1;
                this = (PartyManager)((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).L$0;
                ResultKt.throwOnFailure($result);
                await = $result;
                break;
            }
            case 2: {
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        final String username = (String)await;
        Essential.logger.info("Attempting to join " + username + "'s world...");
        final CoroutineContext coroutineContext = (CoroutineContext)MinecraftCoroutineDispatchersKt.getClient(Dispatchers.INSTANCE);
        final Function2 function2 = (Function2)new PartyManager$joinSPS.PartyManager$joinSPS$2(this, host, joinSecret, (Continuation)null);
        final Continuation continuation3 = $continuation;
        ((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).L$0 = null;
        ((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).L$1 = null;
        ((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).L$2 = null;
        ((PartyManager$joinSPS.PartyManager$joinSPS$1)$continuation).label = 2;
        if (BuildersKt.withContext(coroutineContext, function2, continuation3) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return Unit.INSTANCE;
    }
    
    public static final /* synthetic */ Object access$joinSPS(final PartyManager $this, final String hostUUID, final String joinSecret, final Continuation $completion) {
        return $this.joinSPS(hostUUID, joinSecret, (Continuation<? super Unit>)$completion);
    }
    
    public static final /* synthetic */ List access$getHostsToHideNotifications$p(final PartyManager $this) {
        return $this.hostsToHideNotifications;
    }
    
    public static final /* synthetic */ CoroutineScope access$getScope$p(final PartyManager $this) {
        return $this.scope;
    }
}
