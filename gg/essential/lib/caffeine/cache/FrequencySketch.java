package gg.essential.lib.caffeine.cache;

final class FrequencySketch<E>
{
    static final long[] SEED;
    static final long RESET_MASK = 8608480567731124087L;
    static final long ONE_MASK = 1229782938247303441L;
    int sampleSize;
    int tableMask;
    long[] table;
    int size;
    
    public FrequencySketch() {
        super();
    }
    
    public void ensureCapacity(final long maximumSize) {
        Caffeine.requireArgument(maximumSize >= 0L);
        final int maximum = (int)Math.min(maximumSize, 1073741823L);
        if (this.table != null && this.table.length >= maximum) {
            return;
        }
        this.table = new long[(maximum == 0) ? 1 : Caffeine.ceilingPowerOfTwo(maximum)];
        this.tableMask = Math.max(0, this.table.length - 1);
        this.sampleSize = ((maximumSize == 0L) ? 10 : (10 * maximum));
        if (this.sampleSize <= 0) {
            this.sampleSize = Integer.MAX_VALUE;
        }
        this.size = 0;
    }
    
    public boolean isNotInitialized() {
        return this.table == null;
    }
    
    public int frequency(final E e) {
        if (this.isNotInitialized()) {
            return 0;
        }
        final int hash = this.spread(e.hashCode());
        final int start = (hash & 0x3) << 2;
        int frequency = Integer.MAX_VALUE;
        for (int i = 0; i < 4; ++i) {
            final int index = this.indexOf(hash, i);
            final int count = (int)(this.table[index] >>> (start + i << 2) & 0xFL);
            frequency = Math.min(frequency, count);
        }
        return frequency;
    }
    
    public void increment(final E e) {
        if (this.isNotInitialized()) {
            return;
        }
        final int hash = this.spread(e.hashCode());
        final int start = (hash & 0x3) << 2;
        final int index0 = this.indexOf(hash, 0);
        final int index2 = this.indexOf(hash, 1);
        final int index3 = this.indexOf(hash, 2);
        final int index4 = this.indexOf(hash, 3);
        boolean added = this.incrementAt(index0, start);
        added |= this.incrementAt(index2, start + 1);
        added |= this.incrementAt(index3, start + 2);
        added |= this.incrementAt(index4, start + 3);
        if (added && ++this.size == this.sampleSize) {
            this.reset();
        }
    }
    
    boolean incrementAt(final int i, final int j) {
        final int offset = j << 2;
        final long mask = 15L << offset;
        if ((this.table[i] & mask) != mask) {
            final long[] table = this.table;
            table[i] += 1L << offset;
            return true;
        }
        return false;
    }
    
    void reset() {
        int count = 0;
        for (int i = 0; i < this.table.length; ++i) {
            count += Long.bitCount(this.table[i] & 0x1111111111111111L);
            this.table[i] = (this.table[i] >>> 1 & 0x7777777777777777L);
        }
        this.size = (this.size >>> 1) - (count >>> 2);
    }
    
    int indexOf(final int item, final int i) {
        long hash = (item + FrequencySketch.SEED[i]) * FrequencySketch.SEED[i];
        hash += hash >>> 32;
        return (int)hash & this.tableMask;
    }
    
    int spread(int x) {
        x = (x >>> 16 ^ x) * 73244475;
        x = (x >>> 16 ^ x) * 73244475;
        return x >>> 16 ^ x;
    }
    
    static {
        SEED = new long[] { -4348849565147123417L, -5435081209227447693L, -7286425919675154353L, -3750763034362895579L };
    }
}
