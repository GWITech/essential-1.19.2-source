package gg.essential.handlers;

import gg.essential.util.*;
import gg.essential.api.utils.mojang.*;

private abstract static class SkinUpdate
{
    protected final String accessToken;
    protected final Model model;
    
    protected SkinUpdate(final String accessToken, final Model model) {
        super();
        this.accessToken = accessToken;
        this.model = model;
    }
    
    public abstract boolean matches(final Skin p0);
    
    public abstract SkinResponse execute();
}
