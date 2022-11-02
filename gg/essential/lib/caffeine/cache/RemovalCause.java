package gg.essential.lib.caffeine.cache;

public enum RemovalCause
{
    EXPLICIT {
        RemovalCause$1(final String x0, final int x2) {
        }
        
        @Override
        public boolean wasEvicted() {
            return false;
        }
    }, 
    REPLACED {
        RemovalCause$2(final String x0, final int x2) {
        }
        
        @Override
        public boolean wasEvicted() {
            return false;
        }
    }, 
    COLLECTED {
        RemovalCause$3(final String x0, final int x2) {
        }
        
        @Override
        public boolean wasEvicted() {
            return true;
        }
    }, 
    EXPIRED {
        RemovalCause$4(final String x0, final int x2) {
        }
        
        @Override
        public boolean wasEvicted() {
            return true;
        }
    }, 
    SIZE {
        RemovalCause$5(final String x0, final int x2) {
        }
        
        @Override
        public boolean wasEvicted() {
            return true;
        }
    };
    
    private static final /* synthetic */ RemovalCause[] $VALUES;
    
    public static RemovalCause[] values() {
        return RemovalCause.$VALUES.clone();
    }
    
    public static RemovalCause valueOf(final String name) {
        return Enum.valueOf(RemovalCause.class, name);
    }
    
    public abstract boolean wasEvicted();
    
    RemovalCause(final String x0, final int x1, final RemovalCause$1 x2) {
        this();
    }
    
    static {
        $VALUES = new RemovalCause[] { RemovalCause.EXPLICIT, RemovalCause.REPLACED, RemovalCause.COLLECTED, RemovalCause.EXPIRED, RemovalCause.SIZE };
    }
}
