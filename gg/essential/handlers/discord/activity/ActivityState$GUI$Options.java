package gg.essential.handlers.discord.activity;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010	\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010
                                                   \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J	\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J	\u0010\u0010\u001a\u00020\u0006H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0011""" }, d2 = { "Lgg/essential/handlers/discord/activity/ActivityState$GUI$Options;", "Lgg/essential/handlers/discord/activity/ActivityState;", "vanilla", "", "(Z)V", "text", "", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "essential" })
public static final class Options extends ActivityState
{
    private final boolean vanilla;
    @NotNull
    private final String text;
    
    public Options(final boolean vanilla) {
        super((byte)0);
        this.vanilla = vanilla;
        this.text = "Configuring " + (this.vanilla ? "minecraft " : "") + "settings";
    }
    
    public Options(final byte b) {
        this(true);
    }
    
    @NotNull
    @Override
    public String getText() {
        return this.text;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Options(vanilla=" + this.vanilla;
    }
    
    @Override
    public int hashCode() {
        int vanilla;
        if ((vanilla = (this.vanilla ? 1 : 0)) != 0) {
            vanilla = 1;
        }
        return vanilla;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof Options && this.vanilla == ((Options)other).vanilla);
    }
    
    public Options() {
        this((byte)0);
    }
}
