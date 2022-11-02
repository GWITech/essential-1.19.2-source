package gg.essential.handlers;

import com.mojang.authlib.yggdrasil.*;
import java.security.*;
import com.mojang.authlib.properties.*;

record TrustingServicesKeyInfo(ServicesKeyInfo inner) implements ServicesKeyInfo {
    public int keyBitCount() {
        return this.inner.keyBitCount();
    }
    
    public int signatureBitCount() {
        return this.inner.signatureBitCount();
    }
    
    public Signature signature() {
        return this.inner.signature();
    }
    
    public boolean validateProperty(final Property property) {
        return property instanceof TrustedProperty || this.inner.validateProperty(property);
    }
}
