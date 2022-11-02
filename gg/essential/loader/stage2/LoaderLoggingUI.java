package gg.essential.loader.stage2;

import org.apache.logging.log4j.*;

public class LoaderLoggingUI implements LoaderUI
{
    private static final Logger LOGGER;
    private int size;
    
    public LoaderLoggingUI() {
        super();
    }
    
    @Override
    public void start() {
        LoaderLoggingUI.LOGGER.info("Preparing download...");
    }
    
    @Override
    public void setDownloadSize(final int bytes) {
        LoaderLoggingUI.LOGGER.info("Downloading {}KB of updates...", new Object[] { bytes / 1024 });
        this.size = bytes;
    }
    
    @Override
    public void setDownloaded(final int bytes) {
        LoaderLoggingUI.LOGGER.info("{}KB / {}KB ({}%)", new Object[] { bytes / 1024, this.size / 1024, bytes * 100L / this.size });
    }
    
    @Override
    public void complete() {
        LoaderLoggingUI.LOGGER.info("End of download.");
    }
    
    static {
        LOGGER = LogManager.getLogger((Class)LoaderLoggingUI.class);
    }
}
