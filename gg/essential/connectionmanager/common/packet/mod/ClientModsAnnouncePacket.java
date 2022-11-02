package gg.essential.connectionmanager.common.packet.mod;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class ClientModsAnnouncePacket extends Packet
{
    @SerializedName("b")
    @NotNull
    private final String minecraftVersion;
    @SerializedName("a")
    @NotNull
    private final String[] modChecksums;
    @SerializedName("c")
    @NotNull
    private final Platform platform;
    @SerializedName("d")
    @NotNull
    private final String platformVersion;
    
    public ClientModsAnnouncePacket(@NotNull final String minecraftVersion, @NotNull final String[] modChecksums, @NotNull final Platform platform, @NotNull final String platformVersion) {
        super();
        this.minecraftVersion = minecraftVersion;
        this.modChecksums = modChecksums;
        this.platform = platform;
        this.platformVersion = platformVersion;
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final ClientModsAnnouncePacket that = (ClientModsAnnouncePacket)o;
        return this.minecraftVersion.equals(that.minecraftVersion) && Arrays.equals(this.modChecksums, that.modChecksums) && this.platform == that.platform && this.platformVersion.equals(that.platformVersion);
    }
    
    @Override
    public int hashCode() {
        int result = Objects.hash(this.minecraftVersion, this.platform, this.platformVersion);
        result = 31 * result + Arrays.hashCode(this.modChecksums);
        return result;
    }
    
    @Override
    public String toString() {
        return "ModsAnnouncePacket{minecraftVersion=" + this.minecraftVersion + ", modChecksums=" + Arrays.toString(this.modChecksums) + ", platform=" + this.platform + ", platformVersion='" + this.platformVersion + '\'' + '}';
    }
    
    public enum Platform
    {
        FORGE, 
        FABRIC;
        
        private static final /* synthetic */ Platform[] $VALUES;
        
        public static Platform[] values() {
            return Platform.$VALUES.clone();
        }
        
        public static Platform valueOf(final String name) {
            return Enum.valueOf(Platform.class, name);
        }
        
        private static /* synthetic */ Platform[] $values() {
            return new Platform[] { Platform.FORGE, Platform.FABRIC };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
