package gg.essential.handlers;

import gg.essential.api.utils.mojang.*;
import gg.essential.util.*;

private static class SkinChange extends SkinUpdate
{
    private final String url;
    
    protected SkinChange(final String accessToken, final Model model, final String url) {
        super(accessToken, model);
        this.url = url;
    }
    
    @Override
    public boolean matches(final Skin activeSkin) {
        return activeSkin.getHash().equals(Skin.hashFromUrl(this.url)) && activeSkin.getModel() == this.model;
    }
    
    @Override
    public SkinResponse execute() {
        return MojangAPI.INSTANCE.changeSkin(this.accessToken, UUIDUtil.getClientUUID(), this.model, this.url);
    }
}
