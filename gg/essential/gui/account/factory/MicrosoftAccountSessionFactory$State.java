package gg.essential.gui.account.factory;

import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000*
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010	\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010
                                                   \u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011""" }, d2 = { "Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;", "", "accounts", "", "Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount;", "(Ljava/util/List;)V", "getAccounts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "essential" })
private static final class State
{
    @NotNull
    private final List<MicrosoftAccountSessionFactory$MicrosoftAccount> accounts;
    
    public State(@NotNull final List<MicrosoftAccountSessionFactory$MicrosoftAccount> accounts) {
        Intrinsics.checkNotNullParameter((Object)accounts, "accounts");
        super();
        this.accounts = accounts;
    }
    
    @NotNull
    public final List<MicrosoftAccountSessionFactory$MicrosoftAccount> getAccounts() {
        return this.accounts;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "State(accounts=" + this.accounts;
    }
    
    @Override
    public int hashCode() {
        return this.accounts.hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof State && Intrinsics.areEqual((Object)this.accounts, (Object)((State)other).accounts));
    }
}
