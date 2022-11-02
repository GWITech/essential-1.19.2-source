package gg.essential.loader.stage2;

class LoaderUI$2 extends Adapter {
    private long lastUpdate = 0L;
    private int lastSize;
    final /* synthetic */ int val$msPerUpdate;
    final /* synthetic */ LoaderUI this$0;
    
    LoaderUI$2(final LoaderUI this$0, final LoaderUI inner, final int val$msPerUpdate) {
        this.this$0 = this$0;
        this.val$msPerUpdate = val$msPerUpdate;
        super(inner);
    }
    
    @Override
    public void setDownloaded(final int bytes) {
        this.lastSize = bytes;
        final long now = System.currentTimeMillis();
        if (now - this.lastUpdate <= this.val$msPerUpdate) {
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
}