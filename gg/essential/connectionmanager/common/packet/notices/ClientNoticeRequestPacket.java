package gg.essential.connectionmanager.common.packet.notices;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import gg.essential.notices.*;
import java.util.*;
import com.sparkuniverse.toolbox.util.*;

public class ClientNoticeRequestPacket extends Packet
{
    @SerializedName("a")
    @Nullable
    private final Set<String> ids;
    @SerializedName("b")
    @Nullable
    private final Set<NoticeType> types;
    @SerializedName("c")
    @Nullable
    private final List<String> metadataKeys;
    @SerializedName("d")
    @Nullable
    private final List<Object> metadataValues;
    
    public ClientNoticeRequestPacket(@Nullable final String id, @Nullable final NoticeType type, @Nullable final List<String> metadataKeys, @Nullable final List<Object> metadataValues) {
        this((id == null) ? null : Collections.singleton(id), (type == null) ? null : Collections.singleton(type), metadataKeys, metadataValues);
    }
    
    public ClientNoticeRequestPacket(@Nullable final Set<String> ids, @Nullable final Set<NoticeType> types, @Nullable final List<String> metadataKeys, @Nullable final List<Object> metadataValues) {
        super();
        Validate.isTrue(ids != null || types != null || metadataKeys != null, () -> "At least one parameter should not be null or empty.", new Object[0]);
        this.ids = ids;
        this.types = types;
        this.metadataKeys = metadataKeys;
        this.metadataValues = metadataValues;
    }
    
    private static /* synthetic */ String lambda$new$0() {
        return "At least one parameter should not be null or empty.";
    }
}
