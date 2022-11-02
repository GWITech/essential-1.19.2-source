package gg.essential.handlers;

import com.mojang.authlib.properties.*;
import java.security.*;

private static class TrustedProperty extends Property
{
    public TrustedProperty(final String name, final String value) {
        super(name, value, "trusted");
    }
    
    public boolean isSignatureValid(final PublicKey publicKey) {
        return true;
    }
}
