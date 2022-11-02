package gg.essential.network.connectionmanager.media;

public class ScreenshotUploadException extends Exception
{
    public ScreenshotUploadException(final String message) {
        super(message);
    }
    
    public ScreenshotUploadException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
