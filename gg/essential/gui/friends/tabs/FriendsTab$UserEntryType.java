package gg.essential.gui.friends.tabs;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b	\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b	j\u0002\b
                                                   j\u0002\b\u000b¨\u0006\f""" }, d2 = { "Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;", "", "sectionTitle", "", "emptyText", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getEmptyText", "()Ljava/lang/String;", "getSectionTitle", "FRIEND", "PENDING", "BLOCKED", "essential" })
private enum UserEntryType
{
    @NotNull
    private final String sectionTitle;
    @NotNull
    private final String emptyText;
    
    FRIEND("FRIEND", 0, "Friend List", "No Friends"), 
    PENDING("PENDING", 1, "Friend Requests", "No Friend Requests"), 
    BLOCKED("BLOCKED", 2, "Blocked Players", "No Players Blocked");
    
    private static final /* synthetic */ UserEntryType[] $VALUES;
    
    private UserEntryType(final String $enum$name, final int $enum$ordinal, final String sectionTitle, final String emptyText) {
        this.sectionTitle = sectionTitle;
        this.emptyText = emptyText;
    }
    
    @NotNull
    public final String getSectionTitle() {
        return this.sectionTitle;
    }
    
    @NotNull
    public final String getEmptyText() {
        return this.emptyText;
    }
    
    public static UserEntryType[] values() {
        return UserEntryType.$VALUES.clone();
    }
    
    public static UserEntryType valueOf(final String value) {
        return Enum.valueOf(UserEntryType.class, value);
    }
    
    private static final /* synthetic */ UserEntryType[] $values() {
        return new UserEntryType[] { UserEntryType.FRIEND, UserEntryType.PENDING, UserEntryType.BLOCKED };
    }
    
    static {
        $VALUES = $values();
    }
}
