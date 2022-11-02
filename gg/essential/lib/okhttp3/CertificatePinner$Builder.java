package gg.essential.lib.okhttp3;

import java.util.*;
import gg.essential.lib.okhttp3.internal.tls.*;

public static final class Builder
{
    private final List<CertificatePinner.Pin> pins;
    
    public Builder() {
        super();
        this.pins = new ArrayList<CertificatePinner.Pin>();
    }
    
    public CertificatePinner build() {
        return new CertificatePinner(new LinkedHashSet<CertificatePinner.Pin>(this.pins), null);
    }
}
