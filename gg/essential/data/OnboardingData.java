package gg.essential.data;

import kotlin.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;
import gg.essential.*;
import gg.essential.event.essential.*;
import kotlin.io.path.*;
import java.nio.charset.*;
import java.nio.file.attribute.*;
import java.util.*;
import gg.essential.util.*;
import java.nio.file.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000*
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020	H\u0016J\b\u0010
                                                   \u001a\u00020	H\u0007J\b\u0010\u000b\u001a\u00020	H\u0016J\b\u0010\f\u001a\u00020	H\u0007J\b\u0010\r\u001a\u00020	H\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\b\u0010\u0011\u001a\u00020\u000fH\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006\u0016""" }, d2 = { "Lgg/essential/data/OnboardingData;", "Lgg/essential/api/data/OnboardingData;", "()V", "globalFile", "Ljava/nio/file/Path;", "localFile", "state", "Lgg/essential/data/OnboardingData$State;", "hasAcceptedEssentialTOS", "", "hasAcceptedTos", "hasDeniedEssentialTOS", "hasDeniedTos", "hasSeenFriendsOption", "saveData", "", "setAcceptedTos", "setDeniedTos", "setSeenFriendsOption", "tryLoadData", "file", "State", "essential" })
public final class OnboardingData implements gg.essential.api.data.OnboardingData
{
    @NotNull
    public static final OnboardingData INSTANCE;
    @NotNull
    private static final Path localFile;
    @NotNull
    private static final Path globalFile;
    @NotNull
    private static State state;
    
    private OnboardingData() {
        super();
    }
    
    @JvmStatic
    public static final boolean hasAcceptedTos() {
        return Intrinsics.areEqual((Object)OnboardingData.state.getAcceptedTos(), (Object)true);
    }
    
    @JvmStatic
    public static final boolean hasDeniedTos() {
        return Intrinsics.areEqual((Object)OnboardingData.state.getAcceptedTos(), (Object)false);
    }
    
    @JvmStatic
    public static final void setAcceptedTos() {
        if (!Intrinsics.areEqual((Object)OnboardingData.state.getAcceptedTos(), (Object)true)) {
            OnboardingData.state.setAcceptedTos(true);
            Essential.EVENT_BUS.post(new TosAcceptedEvent());
            OnboardingData.INSTANCE.saveData();
        }
    }
    
    @JvmStatic
    public static final void setDeniedTos() {
        if (!Intrinsics.areEqual((Object)OnboardingData.state.getAcceptedTos(), (Object)false)) {
            OnboardingData.state.setAcceptedTos(false);
            OnboardingData.INSTANCE.saveData();
        }
    }
    
    @JvmStatic
    public static final boolean hasSeenFriendsOption() {
        return OnboardingData.state.getSeenFriendsOption();
    }
    
    @JvmStatic
    public static final void setSeenFriendsOption() {
        if (!OnboardingData.state.getSeenFriendsOption()) {
            OnboardingData.state.setSeenFriendsOption$1385ff();
            OnboardingData.INSTANCE.saveData();
        }
    }
    
    @Override
    public boolean hasAcceptedEssentialTOS() {
        return hasAcceptedTos();
    }
    
    @Override
    public boolean hasDeniedEssentialTOS() {
        return hasDeniedTos();
    }
    
    private final void tryLoadData(final Path file) {
        try {
            final State fromJson = Essential.GSON.fromJson(PathsKt.readText$default(file, (Charset)null, 1, (Object)null), State.class);
            Intrinsics.checkNotNullExpressionValue((Object)fromJson, "GSON.fromJson(file.readText(), State::class.java)");
            OnboardingData.state = fromJson;
        }
        catch (final Exception exception) {
            Essential.logger.error("Failed to read from Onboarding JSON, rewriting file.", (Throwable)exception);
            this.saveData();
        }
    }
    
    private final void saveData() {
        final Path localFile = OnboardingData.localFile;
        final String json = Essential.GSON.toJson(OnboardingData.state);
        Intrinsics.checkNotNullExpressionValue((Object)json, "GSON.toJson(state)");
        PathsKt.writeText$default(localFile, (CharSequence)json, (Charset)null, new OpenOption[0], 2, (Object)null);
        try {
            final Path parent = OnboardingData.globalFile.getParent();
            Intrinsics.checkNotNullExpressionValue((Object)parent, "globalFile.parent");
            Intrinsics.checkNotNullExpressionValue((Object)Files.createDirectories(parent, (FileAttribute<?>[])Arrays.copyOf(new FileAttribute[0], 0)), "createDirectories(this, *attributes)");
            final Path globalFile = OnboardingData.globalFile;
            final String json2 = Essential.GSON.toJson(OnboardingData.state);
            Intrinsics.checkNotNullExpressionValue((Object)json2, "GSON.toJson(state)");
            PathsKt.writeText$default(globalFile, (CharSequence)json2, (Charset)null, new OpenOption[0], 2, (Object)null);
        }
        catch (final Exception exception) {
            Essential.logger.error("Failed to save global Onboarding file.", (Throwable)exception);
        }
    }
    
    static {
        INSTANCE = new OnboardingData();
        final Path path = Essential.getInstance().getBaseDir().toPath();
        Intrinsics.checkNotNullExpressionValue((Object)path, "getInstance().baseDir.toPath()");
        final Path resolve = path.resolve("onboarding.json");
        Intrinsics.checkNotNullExpressionValue((Object)resolve, "this.resolve(other)");
        localFile = resolve;
        final Path path2 = ExtensionsKt.getMinecraftDirectory().toPath();
        Intrinsics.checkNotNullExpressionValue((Object)path2, "minecraftDirectory.toPath()");
        final Path resolve2 = path2.resolve("essential");
        Intrinsics.checkNotNullExpressionValue((Object)resolve2, "this.resolve(other)");
        final Path resolve3 = resolve2.resolve("onboarding.json");
        Intrinsics.checkNotNullExpressionValue((Object)resolve3, "this.resolve(other)");
        globalFile = resolve3;
        OnboardingData.state = new State();
        if (Files.exists(OnboardingData.globalFile, new LinkOption[0])) {
            OnboardingData.INSTANCE.tryLoadData(OnboardingData.globalFile);
        }
        else if (Files.exists(OnboardingData.localFile, new LinkOption[0])) {
            OnboardingData.INSTANCE.tryLoadData(OnboardingData.localFile);
            OnboardingData.INSTANCE.saveData();
        }
        else {
            OnboardingData.INSTANCE.saveData();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010
                                                       \u0002\u0010	\u001a\u0004\b\u0005\u0010\u0006"\u0004\b\u0007\u0010\bR\u001e\u0010
                                                       \u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\u000b\u0010\f"\u0004\b\u0010\u000e¨\u0006\u000f""" }, d2 = { "Lgg/essential/data/OnboardingData$State;", "", "()V", "acceptedTos", "", "getAcceptedTos", "()Ljava/lang/Boolean;", "setAcceptedTos", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "seenFriendsOption", "getSeenFriendsOption", "()Z", "setSeenFriendsOption", "(Z)V", "essential" })
    private static final class State
    {
        @SerializedName("accepted_tos")
        @Nullable
        private Boolean acceptedTos;
        @SerializedName("seen_share_server_with_friends_option")
        private boolean seenFriendsOption;
        
        public State() {
            super();
        }
        
        @Nullable
        public final Boolean getAcceptedTos() {
            return this.acceptedTos;
        }
        
        public final void setAcceptedTos(@Nullable final Boolean <set-?>) {
            this.acceptedTos = <set-?>;
        }
        
        public final boolean getSeenFriendsOption() {
            return this.seenFriendsOption;
        }
        
        public final void setSeenFriendsOption$1385ff() {
            this.seenFriendsOption = true;
        }
    }
}
