package gg.essential.data;

import kotlin.*;
import gg.essential.lib.gson.annotations.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000"
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b	
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J	\u0010	\u001a\u00020\u0003H\u00c6\u0003J	\u0010
                                                   \u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J	\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012""" }, d2 = { "Lgg/essential/data/VersionData$State;", "", "lastSeenModal", "", "lastSeenChangelog", "(Ljava/lang/String;Ljava/lang/String;)V", "getLastSeenChangelog", "()Ljava/lang/String;", "getLastSeenModal", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "essential" })
private static final class State
{
    @SerializedName("version")
    @NotNull
    private final String lastSeenModal;
    @NotNull
    private final String lastSeenChangelog;
    
    public State(@NotNull final String lastSeenModal, @NotNull final String lastSeenChangelog) {
        Intrinsics.checkNotNullParameter((Object)lastSeenModal, "lastSeenModal");
        Intrinsics.checkNotNullParameter((Object)lastSeenChangelog, "lastSeenChangelog");
        super();
        this.lastSeenModal = lastSeenModal;
        this.lastSeenChangelog = lastSeenChangelog;
    }
    
    public State(final byte b) {
        this("0.0.0", VersionData.INSTANCE.getEssentialVersion());
    }
    
    @NotNull
    public final String getLastSeenModal() {
        return this.lastSeenModal;
    }
    
    @NotNull
    public final String getLastSeenChangelog() {
        return this.lastSeenChangelog;
    }
    
    @NotNull
    public final State copy(@NotNull final String lastSeenModal, @NotNull final String lastSeenChangelog) {
        Intrinsics.checkNotNullParameter((Object)lastSeenModal, "lastSeenModal");
        Intrinsics.checkNotNullParameter((Object)lastSeenChangelog, "lastSeenChangelog");
        return new State(lastSeenModal, lastSeenChangelog);
    }
    
    public static /* synthetic */ State copy$default$71ca3790(final State state, String lastSeenModal, String lastSeenChangelog, final int n) {
        if ((n & 0x1) != 0x0) {
            lastSeenModal = state.lastSeenModal;
        }
        if ((n & 0x2) != 0x0) {
            lastSeenChangelog = state.lastSeenChangelog;
        }
        return state.copy(lastSeenModal, lastSeenChangelog);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "State(lastSeenModal=" + this.lastSeenModal + ", lastSeenChangelog=" + this.lastSeenChangelog;
    }
    
    @Override
    public int hashCode() {
        int result = this.lastSeenModal.hashCode();
        result = result * 31 + this.lastSeenChangelog.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        final State state = (State)other;
        return Intrinsics.areEqual((Object)this.lastSeenModal, (Object)state.lastSeenModal) && Intrinsics.areEqual((Object)this.lastSeenChangelog, (Object)state.lastSeenChangelog);
    }
    
    public State() {
        this((byte)0);
    }
}
