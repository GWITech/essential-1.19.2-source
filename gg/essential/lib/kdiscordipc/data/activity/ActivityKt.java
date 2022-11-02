package gg.essential.lib.kdiscordipc.data.activity;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u001a\u001a\u0010\t\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003\u001a\u001e\u0010\f\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u001a\"\u0010\u000f\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012\u001a.\u0010\u0014\u001a\u00020\u0007*\u00020\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u001a\u001e\u0010\u0018\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u001a#\u0010\u0019\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001d¨\u0006\u001e" }, d2 = { "activity", "Lgg/essential/lib/kdiscordipc/data/activity/Activity;", "details", "", "state", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "button", "label", "url", "largeImage", "key", "text", "party", "id", "currentSize", "", "maxSize", "secrets", "join", "match", "spectate", "smallImage", "timestamps", "start", "", "end", "(Ldev/cbyrne/kdiscordipc/data/activity/Activity;JLjava/lang/Long;)V", "KDiscordIPC" })
public final class ActivityKt
{
    @NotNull
    public static final Activity activity(@NotNull final String details, @NotNull final String state, @NotNull final Function1<? super Activity, Unit> init) {
        Intrinsics.checkNotNullParameter((Object)details, "details");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        Intrinsics.checkNotNullParameter((Object)init, "init");
        final Activity activity = new Activity(details, state);
        init.invoke((Object)activity);
        return activity;
    }
    
    public static final void smallImage(@NotNull final Activity $this$smallImage, @NotNull final String key, @Nullable final String text) {
        Intrinsics.checkNotNullParameter((Object)$this$smallImage, "<this>");
        Intrinsics.checkNotNullParameter((Object)key, "key");
        if ($this$smallImage.getAssets() == null) {
            $this$smallImage.setAssets(new Activity.Assets((byte)0));
        }
        final Activity.Assets assets = $this$smallImage.getAssets();
        if (assets != null) {
            assets.setSmallImage(key);
        }
        final Activity.Assets assets2 = $this$smallImage.getAssets();
        if (assets2 != null) {
            assets2.setSmallText(text);
        }
    }
    
    public static final void largeImage(@NotNull final Activity $this$largeImage, @NotNull final String key, @Nullable final String text) {
        Intrinsics.checkNotNullParameter((Object)$this$largeImage, "<this>");
        Intrinsics.checkNotNullParameter((Object)key, "key");
        if ($this$largeImage.getAssets() == null) {
            $this$largeImage.setAssets(new Activity.Assets((byte)0));
        }
        final Activity.Assets assets = $this$largeImage.getAssets();
        if (assets != null) {
            assets.setLargeImage(key);
        }
        final Activity.Assets assets2 = $this$largeImage.getAssets();
        if (assets2 != null) {
            assets2.setLargeText(text);
        }
    }
    
    public static /* synthetic */ void largeImage$default$4f5a53d$361d959(final Activity $this$largeImage, final String key) {
        largeImage($this$largeImage, key, null);
    }
    
    public static final void party(@NotNull final Activity $this$party, @NotNull final String id, final int currentSize, final int maxSize) {
        Intrinsics.checkNotNullParameter((Object)$this$party, "<this>");
        Intrinsics.checkNotNullParameter((Object)id, "id");
        $this$party.setParty(new Activity$Party(id, new Activity$Party$PartySize(currentSize, maxSize)));
    }
    
    public static final void secrets(@NotNull final Activity $this$secrets, @Nullable final String join, @Nullable final String match, @Nullable final String spectate) {
        Intrinsics.checkNotNullParameter((Object)$this$secrets, "<this>");
        $this$secrets.setSecrets(new Activity$Secrets(join, match, spectate));
    }
    
    public static /* synthetic */ void secrets$default$4f2c2847$5741eae3(final Activity $this$secrets, final String join) {
        secrets($this$secrets, join, null, null);
    }
}
