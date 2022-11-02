package gg.essential.lib.kbrewster.mojangapi.profile;

import gg.essential.lib.gson.annotations.*;
import java.util.*;
import gg.essential.lib.kbrewster.mojangapi.*;

public class Profile
{
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("properties")
    private List<Property> properties;
    
    public Profile() {
        super();
        this.properties = null;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public List<Property> getProperties() {
        return this.properties;
    }
}
