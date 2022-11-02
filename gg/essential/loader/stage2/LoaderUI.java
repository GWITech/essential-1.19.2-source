package gg.essential.loader.stage2;

public interface LoaderUI
{
    void start();
    
    void setDownloadSize(final int p0);
    
    void setDownloaded(final int p0);
    
    void complete();
    
    default LoaderUI all(final LoaderUI... uis) {
        return new LoaderUI() {
            final /* synthetic */ LoaderUI[] val$uis;
            
            LoaderUI$1() {
                super();
            }
            
            @Override
            public void start() {
                for (final LoaderUI ui : uis) {
                    ui.start();
                }
            }
            
            @Override
            public void setDownloadSize(final int bytes) {
                for (final LoaderUI ui : uis) {
                    ui.setDownloadSize(bytes);
                }
            }
            
            @Override
            public void setDownloaded(final int bytes) {
                for (final LoaderUI ui : uis) {
                    ui.setDownloaded(bytes);
                }
            }
            
            @Override
            public void complete() {
                for (final LoaderUI ui : uis) {
                    ui.complete();
                }
            }
        };
    }
    
    default LoaderUI updatesEveryMillis(final int msPerUpdate) {
        return new Adapter(this) {
            private long lastUpdate = 0L;
            private int lastSize;
            final /* synthetic */ int val$msPerUpdate;
            final /* synthetic */ LoaderUI this$0;
            
            LoaderUI$2(final LoaderUI inner) {
                this.this$0 = this$0;
                super(inner);
            }
            
            @Override
            public void setDownloaded(final int bytes) {
                this.lastSize = bytes;
                final long now = System.currentTimeMillis();
                if (now - this.lastUpdate <= msPerUpdate) {
                    return;
                }
                this.lastUpdate = now;
                super.setDownloaded(bytes);
            }
            
            @Override
            public void complete() {
                if (this.lastSize > 0) {
                    super.setDownloaded(this.lastSize);
                }
                super.complete();
            }
        };
    }
    
    public static class Adapter implements LoaderUI
    {
        private final LoaderUI inner;
        
        public Adapter(final LoaderUI inner) {
            super();
            this.inner = inner;
        }
        
        @Override
        public void start() {
            this.inner.start();
        }
        
        @Override
        public void setDownloadSize(final int bytes) {
            this.inner.setDownloadSize(bytes);
        }
        
        @Override
        public void setDownloaded(final int bytes) {
            this.inner.setDownloaded(bytes);
        }
        
        @Override
        public void complete() {
            this.inner.complete();
        }
    }
}
