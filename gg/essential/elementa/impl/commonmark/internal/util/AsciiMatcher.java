package gg.essential.elementa.impl.commonmark.internal.util;

import java.util.*;

public class AsciiMatcher implements CharMatcher
{
    private final BitSet set;
    
    private AsciiMatcher(final Builder builder) {
        super();
        this.set = builder.set;
    }
    
    @Override
    public boolean matches(final char c) {
        return this.set.get(c);
    }
    
    public Builder newBuilder() {
        return new Builder((BitSet)this.set.clone(), null);
    }
    
    public static Builder builder() {
        return new Builder(new BitSet(), null);
    }
    
    AsciiMatcher(final Builder x0, final AsciiMatcher.AsciiMatcher$1 x1) {
        this(x0);
    }
    
    public static class Builder
    {
        private final BitSet set;
        
        private Builder(final BitSet set) {
            super();
            this.set = set;
        }
        
        public Builder c(final char c) {
            if (c > '\u007f') {
                throw new IllegalArgumentException("Can only match ASCII characters");
            }
            this.set.set(c);
            return this;
        }
        
        public Builder range(final char from, final char toInclusive) {
            for (char c = from; c <= toInclusive; ++c) {
                this.c(c);
            }
            return this;
        }
        
        public AsciiMatcher build() {
            return new AsciiMatcher(this, null);
        }
        
        static /* synthetic */ BitSet access$000(final Builder x0) {
            return x0.set;
        }
        
        Builder(final BitSet x0, final AsciiMatcher.AsciiMatcher$1 x1) {
            this(x0);
        }
    }
}
