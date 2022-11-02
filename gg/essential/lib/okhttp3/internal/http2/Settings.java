package gg.essential.lib.okhttp3.internal.http2;

public final class Settings
{
    private int set;
    private final int[] values;
    
    public Settings() {
        super();
        this.values = new int[10];
    }
    
    Settings set(final int id, final int value) {
        if (id < 0 || id >= this.values.length) {
            return this;
        }
        final int bit = 1 << id;
        this.set |= bit;
        this.values[id] = value;
        return this;
    }
    
    boolean isSet(final int id) {
        final int bit = 1 << id;
        return (this.set & bit) != 0x0;
    }
    
    int get(final int id) {
        return this.values[id];
    }
    
    int size() {
        return Integer.bitCount(this.set);
    }
    
    int getHeaderTableSize() {
        return ((0x2 & this.set) != 0x0) ? this.values[1] : -1;
    }
    
    int getMaxConcurrentStreams$134621() {
        return ((0x10 & this.set) != 0x0) ? this.values[4] : Integer.MAX_VALUE;
    }
    
    int getMaxFrameSize(final int defaultValue) {
        return ((0x20 & this.set) != 0x0) ? this.values[5] : defaultValue;
    }
    
    int getInitialWindowSize() {
        return ((0x80 & this.set) != 0x0) ? this.values[7] : 65535;
    }
    
    void merge(final Settings other) {
        for (int i = 0; i < 10; ++i) {
            if (other.isSet(i)) {
                this.set(i, other.get(i));
            }
        }
    }
}
