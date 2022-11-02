package gg.essential.handlers.discord;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import gg.essential.lib.kdiscordipc.data.activity.*;
import gg.essential.config.*;
import net.minecraft.client.util.*;
import gg.essential.handlers.discord.party.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lgg/essential/lib/kdiscordipc/data/activity/Activity;", "invoke" })
static final class DiscordIntegration$publishActivityUpdate$activity$1 extends Lambda implements Function1<Activity, Unit> {
    public static final DiscordIntegration$publishActivityUpdate$activity$1 INSTANCE;
    
    DiscordIntegration$publishActivityUpdate$activity$1() {
        super(1);
    }
    
    public final void invoke(@NotNull final Activity $this$activity) {
        Intrinsics.checkNotNullParameter((Object)$this$activity, "$this$activity");
        final Session session = UMinecraft.getMinecraft().getSession();
        ActivityKt.largeImage$default$4f5a53d$361d959($this$activity, "icon");
        if (EssentialConfig.INSTANCE.getDiscordShowUsernameAndAvatar()) {
            ActivityKt.smallImage($this$activity, "https://crafthead.net/helm/" + session.getUuid(), session.getUsername());
        }
        if (EssentialConfig.INSTANCE.getDiscordAllowAskToJoin()) {
            final PartyInformation access$getPartyInformation$p = DiscordIntegration.access$getPartyInformation$p();
            if (access$getPartyInformation$p != null) {
                final PartyInformation info = access$getPartyInformation$p;
                final String joinSecret = info.getJoinSecret();
                if (joinSecret != null) {
                    final String it = joinSecret;
                    ActivityKt.secrets$default$4f2c2847$5741eae3($this$activity, it);
                }
                ActivityKt.party($this$activity, info.getData().getId(), info.getData().getMembers(), info.getData().getMaximumMembers());
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((Activity)p1);
        return Unit.INSTANCE;
    }
    
    static {
        DiscordIntegration$publishActivityUpdate$activity$1.INSTANCE = new DiscordIntegration$publishActivityUpdate$activity$1();
    }
}