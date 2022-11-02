package gg.essential.connectionmanager.common.packet.relationships.privacy;

import gg.essential.connectionmanager.common.packet.*;
import com.sparkuniverse.toolbox.relationships.enums.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class FriendRequestPrivacySettingPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final FriendRequestPrivacySetting setting;
    
    public FriendRequestPrivacySettingPacket(@NotNull final FriendRequestPrivacySetting setting) {
        super();
        this.setting = setting;
    }
    
    @NotNull
    public FriendRequestPrivacySetting getSetting() {
        return this.setting;
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.setting == ((FriendRequestPrivacySettingPacket)o).setting);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.setting);
    }
    
    @Override
    public String toString() {
        return "FriendRequestPrivacySettingUpdatePacket{setting=" + this.setting + '}';
    }
}
