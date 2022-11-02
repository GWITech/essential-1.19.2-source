package gg.essential.vigilance.impl;

import org.jetbrains.annotations.*;
import net.minecraft.client.resource.language.*;
import net.minecraft.*;

@ApiStatus.Internal
public class PlatformImpl implements Platform
{
    public PlatformImpl() {
        super();
    }
    
    @NotNull
    @Override
    public String i18n(@NotNull final String key) {
        return I18n.translate(key, new Object[0]);
    }
    
    @Override
    public boolean isAllowedInChat(final char c) {
        return SharedConstants.isValidChar(c);
    }
}
