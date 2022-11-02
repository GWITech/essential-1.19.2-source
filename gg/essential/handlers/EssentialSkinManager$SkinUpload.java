package gg.essential.handlers;

import java.io.*;
import gg.essential.api.utils.mojang.*;
import gg.essential.util.*;

private static class SkinUpload extends SkinUpdate
{
    private final File file;
    
    protected SkinUpload(final String accessToken, final Model model, final File file) {
        super(accessToken, model);
        this.file = file;
    }
    
    @Override
    public boolean matches(final Skin activeSkin) {
        return false;
    }
    
    @Override
    public SkinResponse execute() {
        return MojangAPI.INSTANCE.uploadSkin(this.accessToken, this.model, this.file);
    }
}
