package gg.essential.loader.stage2;

static final class LoaderUI$1 implements LoaderUI {
    final /* synthetic */ LoaderUI[] val$uis;
    
    LoaderUI$1(final LoaderUI[] val$uis) {
        this.val$uis = val$uis;
        super();
    }
    
    @Override
    public void start() {
        for (final LoaderUI ui : this.val$uis) {
            ui.start();
        }
    }
    
    @Override
    public void setDownloadSize(final int bytes) {
        for (final LoaderUI ui : this.val$uis) {
            ui.setDownloadSize(bytes);
        }
    }
    
    @Override
    public void setDownloaded(final int bytes) {
        for (final LoaderUI ui : this.val$uis) {
            ui.setDownloaded(bytes);
        }
    }
    
    @Override
    public void complete() {
        for (final LoaderUI ui : this.val$uis) {
            ui.complete();
        }
    }
}