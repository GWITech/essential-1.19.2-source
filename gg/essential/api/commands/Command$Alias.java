package gg.essential.api.commands;

import kotlin.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u000b
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J	\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J	\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J	\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   ¨\u0006\u0013""" }, d2 = { "Lgg/essential/api/commands/Command$Alias;", "", "alias", "", "hideFromAutocomplete", "", "(Ljava/lang/String;Z)V", "getAlias", "()Ljava/lang/String;", "getHideFromAutocomplete", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "essential-api" })
public static final class Alias
{
    @NotNull
    private final String alias;
    private final boolean hideFromAutocomplete;
    
    @JvmOverloads
    public Alias(@NotNull final String alias, final boolean hideFromAutocomplete) {
        Intrinsics.checkNotNullParameter((Object)alias, "alias");
        super();
        this.alias = alias;
        this.hideFromAutocomplete = hideFromAutocomplete;
    }
    
    public Alias(final String alias, boolean hideFromAutocomplete, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            hideFromAutocomplete = false;
        }
        this(alias, hideFromAutocomplete);
    }
    
    @NotNull
    public final String getAlias() {
        return this.alias;
    }
    
    public final boolean getHideFromAutocomplete() {
        return this.hideFromAutocomplete;
    }
    
    @NotNull
    public final String component1() {
        return this.alias;
    }
    
    public final boolean component2() {
        return this.hideFromAutocomplete;
    }
    
    @NotNull
    public final Alias copy(@NotNull final String alias, final boolean hideFromAutocomplete) {
        Intrinsics.checkNotNullParameter((Object)alias, "alias");
        return new Alias(alias, hideFromAutocomplete);
    }
    
    public static /* synthetic */ Alias copy$default(final Alias alias, String alias2, boolean hideFromAutocomplete, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            alias2 = alias.alias;
        }
        if ((n & 0x2) != 0x0) {
            hideFromAutocomplete = alias.hideFromAutocomplete;
        }
        return alias.copy(alias2, hideFromAutocomplete);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Alias(alias=" + this.alias + ", hideFromAutocomplete=" + this.hideFromAutocomplete;
    }
    
    @Override
    public int hashCode() {
        int result = this.alias.hashCode();
        final int n = result * 31;
        int hideFromAutocomplete;
        if ((hideFromAutocomplete = (this.hideFromAutocomplete ? 1 : 0)) != 0) {
            hideFromAutocomplete = 1;
        }
        result = n + hideFromAutocomplete;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Alias)) {
            return false;
        }
        final Alias alias = (Alias)other;
        return Intrinsics.areEqual((Object)this.alias, (Object)alias.alias) && this.hideFromAutocomplete == alias.hideFromAutocomplete;
    }
    
    @JvmOverloads
    public Alias(@NotNull final String alias) {
        Intrinsics.checkNotNullParameter((Object)alias, "alias");
        this(alias, false, 2, null);
    }
}
