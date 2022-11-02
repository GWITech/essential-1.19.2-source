package gg.essential.loader.stage2.data;

import java.util.*;

public class ModVersion
{
    public static final ModVersion UNKNOWN;
    private final String id;
    private final String version;
    
    public ModVersion(final String id, final String version) {
        super();
        this.id = id;
        this.version = version;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getVersion() {
        return this.version;
    }
    
    public boolean isUnknown() {
        return this.equals(ModVersion.UNKNOWN);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final ModVersion that = (ModVersion)o;
        return Objects.equals(this.id, that.id) && Objects.equals(this.version, that.version);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.version);
    }
    
    static {
        UNKNOWN = new ModVersion(null, null);
    }
}
