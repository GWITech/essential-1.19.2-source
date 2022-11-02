package gg.essential.lib.kbrewster.mojangapi;

import gg.essential.lib.gson.annotations.*;

public class Property
{
    @SerializedName("name")
    private String name;
    @SerializedName("value")
    private String value;
    
    public Property() {
        super();
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getValue() {
        return this.value;
    }
}
