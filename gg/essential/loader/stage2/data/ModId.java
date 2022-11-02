package gg.essential.loader.stage2.data;

import java.util.*;

public class ModId
{
    public static final ModId UNKNOWN;
    public static final ModId ESSENTIAL;
    private final String publisherSlug;
    private final String publisherId;
    private final String modSlug;
    private final String modId;
    
    public ModId(final String publisherSlug, final String publisherId, final String modSlug, final String modId) {
        super();
        this.publisherSlug = publisherSlug;
        this.publisherId = publisherId;
        this.modSlug = modSlug;
        this.modId = modId;
    }
    
    public String getPublisherSlug() {
        return this.publisherSlug;
    }
    
    public String getPublisherId() {
        return this.publisherId;
    }
    
    public String getModSlug() {
        return this.modSlug;
    }
    
    public String getModId() {
        return this.modId;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final ModId modId1 = (ModId)o;
        return Objects.equals(this.publisherSlug, modId1.publisherSlug) && Objects.equals(this.publisherId, modId1.publisherId) && Objects.equals(this.modSlug, modId1.modSlug) && Objects.equals(this.modId, modId1.modId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.publisherSlug, this.publisherId, this.modSlug, this.modId);
    }
    
    static {
        UNKNOWN = new ModId(null, null, null, null);
        ESSENTIAL = new ModId("essential", null, "essential", null);
    }
}
