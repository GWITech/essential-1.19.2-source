package gg.essential.loader.stage2;

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
